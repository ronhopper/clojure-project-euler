;; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;;
;; Find the sum of all the primes below two million.

(defn- factor? [n f]
  (zero? (mod n f)))

(defn- prime? [n]
  (not-any? #(factor? n %)
            (range 2 (inc (int (Math/sqrt n))))))

(apply + (take-while #(< % 2000000) (filter prime? (iterate inc 2))))

