(ns demo.core
  (:require [demo.dynamic :as dynamic]
            [quil.core :as q]))

(q/defsketch example
             :title "Easing Examples"
             :setup dynamic/setup
             :draw dynamic/draw
             :size [900 900])
