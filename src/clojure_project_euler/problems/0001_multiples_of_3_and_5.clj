(defn- multiple-of? [n f]
  (zero? (mod n f)))

(defn- multiple-of-3-or-5? [n]
  (or (multiple-of? n 3)
      (multiple-of? n 5)))

(apply + (filter multiple-of-3-or-5? (range 1000)))

