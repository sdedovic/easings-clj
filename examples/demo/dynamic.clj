(ns demo.dynamic
  (:require [quil.core :as q]
            [easings.core :as ease]))

;; https://github.com/thobbs/genartlib/blob/master/src/clj/genartlib/util.clj
(defn h
  "Returns a given percentage of the height Quil-specific."
  ([] (h 1.0))
  ([percentage] (* (q/height) percentage)))

(defn w
  "Returns a given percentage of the width. Quil-specific."
  ([] (w 1.0))
  ([percentage] (* (q/width) percentage)))


(defn setup []
  (q/color-mode :hsb 360 100 100 1.0)
  (q/stroke 0)

  (q/text-align :center :bottom)
  (q/text-size 18))

(let [scale 0.3
      gap 0.025
      step 0.05]
  (defn draw-one [label fun x-offset y-offset]
    (let [x-center (+ x-offset (/ scale 2))]
      (q/fill 0)
      (q/text label (w x-center) (h y-offset))
      (q/no-fill))

    ;; axis
    (q/stroke 0 0 20)
    (q/line (w x-offset) (h (+ y-offset scale)) 
            (w (+ x-offset scale)) (h (+ y-offset scale)))
    (q/line (w x-offset) (h y-offset) 
            (w x-offset) (h (+ y-offset scale)))

    (q/stroke 0 0 0)
    (q/begin-shape)
    (doseq [x (range (- step) (+ 1 step 1e-9) step)]
      (let [y (fun x)

            ;; invert
            y (- 1 y)
            
            ;; scale and shift
            x (+ x-offset (* scale x))
            y (+ y-offset (* scale y))]
        (q/curve-vertex (w x) (h y))))
    (q/end-shape)))

(defn draw []
  (q/background 0 0 100)
  
  (draw-one "ease-in-sine"      ease/ease-in-sine      0.025 0.025)
  (draw-one "ease-out-sine"     ease/ease-out-sine     0.350 0.025)
  (draw-one "ease-in-out-sine"  ease/ease-in-out-sine  0.675 0.025)

  (draw-one "ease-in-quad"      ease/ease-in-quad      0.025 0.350)
  (draw-one "ease-out-quad"     ease/ease-out-quad     0.350 0.350)
  (draw-one "ease-in-out-quad"  ease/ease-in-out-quad  0.675 0.350)

  (draw-one "ease-in-quint"     ease/ease-in-quint     0.025 0.675)
  (draw-one "ease-out-quint"    ease/ease-out-quint    0.350 0.675)
  (draw-one "ease-in-out-quint" ease/ease-in-out-quint 0.675 0.675)

  )

