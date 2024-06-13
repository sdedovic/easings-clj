(ns easings.math)

(def PI
  #?(:clj Math/PI
     :cljs js/Math.PI))

(defn sqrt [x]
  #?(:clj  (Math/sqrt x)
     :cljs (js/Math.sqrt x)))

(defn sq [x]
  (* x x))

(defn pow [x n]
  #?(:clj  (Math/pow x n)
     :cljs (js/Math.pow x n)))

(defn cos [x]
  #?(:clj  (Math/cos x)
     :cljs (js/Math.cos x)))

(defn sin [x]
  #?(:clj  (Math/sin x)
     :cljs (js/Math.sin x)))
