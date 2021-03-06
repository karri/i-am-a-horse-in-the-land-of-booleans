(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
     ( == (mod n 15) 0) "gotcha!"
     (== (mod n 5) 0)   "buzz"
   (== (mod n 3) 0)  "fizz"
   :else      ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (not (== (mod year 4) 0)) false
   (not (== (mod year 100) 0)) true
   (not (== (mod year 400) 0)) false
   :else   true
   ))

; '_______'
