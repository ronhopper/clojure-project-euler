;; A palindromic number reads the same both ways. The largest palindrome made
;; from the product of two 2-digit numbers is 9009 = 91 × 99.
;;
;; Find the largest palindrome made from the product of two 3-digit numbers.

(defn- palindrome? [n]
  (let [s (str n)]
    (= s (clojure.string/reverse s))))

(defn- has-3-digits? [n]
  (and (>= n 100) (<= n 999)))

(defn- has-3-digit-factors? [n]
  (some #(and (zero? (rem n %))
              (has-3-digits? (/ n %)))
        (range 999 99 -1)))

(let [possible-answers (range (* 999 999) (dec (* 100 100)) -1)]
  (first (filter #(and (palindrome? %)
                       (has-3-digit-factors? %))
                 possible-answers)))

