(ns easings.core
  (:require [easings.math :refer :all]))

;;;;========
;;;; Sine
;;;;========

(defn ease-in-sine
  ""
  [t]
  (- 1 (cos (/ (* t PI) 2))))

(defn ease-out-sine
  ""
  [t]
  (sin (/ (* t PI) 2)))

(defn ease-in-out-sine
  ""
  [t]
  (/ (- (- (cos (* t PI)) 1)) 2))


;;;;========
;;;; Quad
;;;;========

(defn ease-in-quad
  ""
  [t]
  (* t t))

(defn ease-out-quad
  ""
  [t]
  (- 1 (* (- 1 t) (- 1 t))))

(defn ease-in-out-quad
  ""
  [t]
  (if (< t 0.5)
    (* 2 t t)
    (- 1 (/ (pow (+ (* -2 t) 2) 2) 2))))


;;;;========
;;;; Cubic
;;;;========

(defn ease-in-cubic
  ""
  [t]
  (* t t t))

(defn ease-out-cubic
  ""
  [t]
  (- 1 (pow (- 1 t) 3)))

(defn ease-in-out-cubic
  ""
  [t]
  (if (< t 0.5)
    (* 4 t t t)
    (- 1 (/ (pow (+ (* -2 t) 2) 3) 2))))


;;;;========
;;;; Quart
;;;;========

(defn ease-in-quart
  ""
  [t]
  (* t t t t))

(defn ease-out-quart
  ""
  [t]
  (- 1 (pow (- 1 t) 4)))

(defn ease-in-out-quart
  ""
  [t]
  (if (< t 0.5)
    (* 8 t t t t)
    (- 1 (/ (pow (+ (* -2 t) 2) 4) 2))))


;;;;========
;;;; Quint
;;;;========

(defn ease-in-quint
  ""
  [t]
  (* t t t t t))

(defn ease-out-quint
  ""
  [t]
  (- 1 (pow (- 1 t) 5)))

(defn ease-in-out-quint
  ""
  [t]
  (if (< t 0.5)
    (* 16 t t t t t)
    (- 1 (/ (pow (+ (* -2 t) 2) 5) 2))))


;;;;========
;;;; Expo
;;;;========

(defn ease-in-expo
  ""
  [t]
  (if (= t 0)
    0
    (pow 2 (- (* 10 t) 10))))

(defn ease-out-expo
  ""
  [t]
  (if (= t 1)
    1
    (- 1 (pow 2 (* -10 t)))))

(defn ease-in-out-expo
  ""
  [t]
  (cond
    (= t 0) 0
    (= t 1) 1

    (< t 0.5)
    (/ (pow 2 (- (* 20 t) 10)) 2)

    :else
    (/ (- 2 (pow 2 (+ (* -20 t) 10))) 2)))


;;;;========
;;;; Circ
;;;;========

(defn ease-in-circ
  ""
  [t]
  (- 1 (sqrt (- 1 (pow t 2)))))

(defn ease-out-circ
  ""
  [t]
  (sqrt (- 1 (pow (- t 1) 2))))

(defn ease-in-out-circ
  ""
  [t]
  (if (< t 0.5)
    (/ (- 1 (sqrt (- 1 (pow (* 2 t) 2)))) 2)
    (/ (+ (sqrt (- 1 (pow (+ (* -2 t) 2) 2))) 1) 2)))


;;;;========
;;;; Back
;;;;========

(defn ease-in-back
  ""
  [t]
  (let [c1 1.70158
        c3 (+ c1 1)]
    (- (* c3 t t t) (* c1 t t))))

(defn ease-out-back
  ""
  [t]
  (let [c1 1.70158
        c3 (+ c1 1)]
    (+ 1 (* c3 (pow (- t 1) 3)) (* c1 (pow (- t 1) 2)))))

(defn ease-in-out-back
  ""
  [t]
  (let [c1 1.70158
        c2 (+ c1 1.525)]
    (if (< t 0.5)
      (/ (* (pow (* 2 t) 2) (- (* (+ c2 1) 2 t) c2)) 2)
      (/ (+ (* (pow (- (* 2 t) 2) 2) (+ (* (+ c2 1) (- (* t 2) 2)) c2)) 2) 2))))


;;;;========
;;;; Elastic
;;;;========

#_(defn ease-in-
  ""
  [t])

#_(defn ease-out-
  ""
  [t])

#_(defn ease-in-out-
  ""
  [t])


;;;;========
;;;; Bounce
;;;;========

#_(defn ease-in-
  ""
  [t])

#_(defn ease-out-
  ""
  [t])

#_(defn ease-in-out-
  ""
  [t])


