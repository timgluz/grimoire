## Arities
[atom f]
[atom f x]
[atom f x y]
[atom f x y & args]

## Documentation
Atomically swaps the value of atom to be:
  (apply f current-value-of-atom args). Note that f may be called
  multiple times, and thus should be free of side effects.  Returns
  the value that was swapped in.