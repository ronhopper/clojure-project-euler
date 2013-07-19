;; The sum of the squares of the first ten natural numbers is,
;;
;;     1^2 + 2^2 + ... + 10^2 = 385
;;
;; The square of the sum of the first ten natural
;; numbers is,
;;
;;     (1 + 2 + ... + 10)^2 = 55^2 = 3025
;;
;; Hence the difference between the sum of the squares of the first ten natural
;; numbers and the square of the sum is 3025 − 385 = 2640.
;;
;; Find the difference between the sum of the squares of the first one hundred
;; natural numbers and the square of the sum.

(defn- square [n] (* n n))

(defn- square-of-sum [n]
  (square (/ (* n (inc n)) 2)))

(defn- sum-of-squares [n]
  (apply + (map square (range n 0 -1))))

(- (square-of-sum 100) (sum-of-squares 100))

