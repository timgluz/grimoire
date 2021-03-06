(defn insert-left
  "Inserts the item as the left sibling of the node at this loc,
 without moving"
  {:added "1.0"}
  [loc item]
    (let [[node {l :l :as path}] loc]
      (if (nil? path)
        (throw (new Exception "Insert at top"))
        (with-meta [node (assoc path :l (conj l item) :changed? true)] (meta loc)))))