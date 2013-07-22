;; A Pythagorean triplet is a set of three natural numbers, a < b < c, for
;; which,
;;
;;     a^2 + b^2 = c^2
;;
;; For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
;;
;; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;; Find the product a*b*c.

(defn- pythagorean-triplet? [a b c]
  (and (< a b c)
       (= (+ (* a a) (* b b)) (* c c))))

(first (for [a (range 1 333)
             b (range 2 500)
             :let [c (- 1000 a b)]
             :when (pythagorean-triplet? a b c)]
         (* a b c)))

