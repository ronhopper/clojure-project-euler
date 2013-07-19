;; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
;; that the 6th prime is 13.
;;
;; What is the 10 001st prime number?

(defn- factor? [n f]
  (zero? (mod n f)))

(defn- prime? [n]
  (not-any? #(factor? n %)
            (range 2 (inc (int (Math/sqrt n))))))

(defn- nth-prime [n]
  (nth (filter prime? (iterate inc 2)) (dec n)))

(nth-prime 10001)

