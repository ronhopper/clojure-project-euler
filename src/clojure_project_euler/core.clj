(ns clojure-project-euler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))

  (def files (remove #(.isDirectory %) (file-seq (clojure.java.io/file "src/clojure_project_euler/problems"))))

  (doseq [f files]
    (println (str "Problem " (clojure.string/replace (.getName f) #"_.*" "") ": " (load-file (str f)))))

  (println "Done."))

