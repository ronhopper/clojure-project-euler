;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we
;; get 3, 5, 6 and 9. The sum of these multiples is 23.
;;
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn- multiple-of? [n f]
  (zero? (mod n f)))

(defn- multiple-of-3-or-5? [n]
  (or (multiple-of? n 3)
      (multiple-of? n 5)))

(apply + (filter multiple-of-3-or-5? (range 1000)))

