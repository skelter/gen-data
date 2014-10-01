(ns hohum.core
  (:gen-class)
  (:require [clojure.data.generators]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(clojure.data.generators/anything)
(clojure.data.generators/string)
(clojure.data.generators/tuple clojure.data.generators/string)

(def rainbow-colors #{ "red" "orange" "yellow" "green" "blue" "indigo" "violoet" })

(def common-first-names #{"Kelley" "Anthony" "Morgan" "Steve" "Charles" "Chris" 
  "Sophia" "Anne" "Lloyd" "Maurice" "Venessa" "David" "Thomas" "John" })

(def common-last-names #{"Burton" "Suehs" "Metzger" "Smith" "Doe" "Walsh" "Pierce" })

(def common-full-names 
  (for [firstname common-first-names
        lastname  common-last-names]
    (str firstname " " lastname)))

(def things #{"chair" "table" "bird" "fish" "animal" "car" "truck" "jet" "boat" })

(defn email []
  (str (rand-nth (seq common-first-names)) 
       "@"
       (rand-nth (seq things))
       ".example.com"))

(defn digit []
  (rand-nth [0 1 2 3 4 5 6 7 8 9]))

(defn usa-phone-number []
   (str (digit)
        (digit)
        (digit)
        "-"
        (digit)
        (digit)
        (digit)
        "-"
        (digit)
        (digit)
        (digit)
        (digit)))


(rand-nth (seq rainbow-colors))

