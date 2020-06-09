(ns exercise9)
(require '[clojure.string :as str])

(defn word-count
  "Returns a map where each key is a distinct word in a given sentence and each value is the number of occurences of that word in the sentence."
  [x]
  (reduce 
(fn [words word] (assoc words (str/lower-case word) (inc (get words (str/lower-case word) 0)))) {} (re-seq #"\w+" x)
  )
)