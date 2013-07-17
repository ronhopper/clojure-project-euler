;; The prime factors of 13195 are 5, 7, 13 and 29.
;;
;; What is the largest prime factor of the number 600851475143 ?

(defn- smallest-prime-factor [n]
  (first (filter #(zero? (mod n %)) (range 2 (inc n)))))

(defn- largest-prime-factor
  ([n] (largest-prime-factor n 1))
  ([n f_max] (if (= n 1)
               f_max
               (let [f (smallest-prime-factor n)]
                 (largest-prime-factor (/ n f) f)))))

(largest-prime-factor 600851475143)

