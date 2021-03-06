;; comparisons among keep, map and for.

user> (keep #(if (odd? %) %) (range 10))
(1 3 5 7 9)
user> (map #(if (odd? %) %) (range 10))
(nil 1 nil 3 nil 5 nil 7 nil 9)
user> (for [ x (range 10) :when (odd? x)] x)
(1 3 5 7 9) 

user> (keep #(if(even? %) %) (range 10))
(0 2 4 6 8)
user> (map #(if (even? %) %) (range 10))
(0 nil 2 nil 4 nil 6 nil 8 nil)
user> (for [ x (range 10) :when (even? x)] x)
(0 2 4 6 8)

