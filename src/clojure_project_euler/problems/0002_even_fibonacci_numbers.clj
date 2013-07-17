(defn- fib
  ([] (fib 1 1))
  ([a b] (cons a (lazy-seq (fib b (+ a b))))))

(apply + (filter even? (take-while #(<= % 4000000) (fib))))

