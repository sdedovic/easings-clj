(ns easings-cljc.core)

(defn ease-in-sine [t]
  (when (and t (number? t))
    (let [pi #?(:cljs js/Math.PI :clj Math.PI)
          cos #?(:cljs js/Math.cos :clj Math.cos)]
      (- 1 (-> t (* pi) (/ 2) cos)))))
