;; 2520 is the smallest number that can be divided by each of the numbers from
;; 1 to 10 without any remainder.
;;
;; What is the smallest positive number that is evenly divisible by all of the
;; numbers from 1 to 20?

(defn- gcd [a b] ; a >= b
  (if (zero? b) a (recur b (mod a b))))

(defn- lcm [a b] ; a >= b
  (/ (* a b) (gcd a b)))

(reduce lcm (range 20 1 -1))

