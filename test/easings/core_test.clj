(ns easings.core-test
  (:require [clojure.test :refer [are deftest]]
            [easings.core :as sut]))

(def INPUTS [0 0.12 0.5 0.93 1])

(defn- equal-f? 
  "Returns true if two provided floats are equal, up to 6 decimal places."
  [a b]
  (< (abs (- a b)) 1e-6))

(defn- equal?
  "Returns true if every numerical value in results is equal (with ==) to inputs."
  [results inputs]
  (->> (map equal-f? results inputs)
       (every? true?)))

(deftest sine
  (are [results f] (equal? results (map f INPUTS))
    [0 0.01771274927131128 0.2928932188134524 0.8902656889089549 0.9999999999999999] sut/ease-in-sine
    [0 0.1873813145857246 0.7071067811865475 0.9939609554551797 1] sut/ease-out-sine
    [0 0.03511175705587427 0.49999999999999994 0.9879583809693737 1] sut/ease-in-out-sine))

(deftest quad
  (are [results f] (equal? results (map f INPUTS))
    [0 0.0144 0.25 0.8649000000000001 1] sut/ease-in-quad
    [0 0.22560000000000002 0.75 0.9951 1] sut/ease-out-quad
    [0 0.0288 0.5 0.9902 1] sut/ease-in-out-quad))

(deftest cubic
  (are [results f] (equal? results (map f INPUTS))
    [0 0.001728 0.125 0.8043570000000001 1] sut/ease-in-cubic
    ;; NOTE: Somehow the results here differ from the CLJS implementation..
    [0.0 0.31852800000000003 0.875 0.999657 1.0] sut/ease-out-cubic
    [0 0.006912 0.5 0.998628 1] sut/ease-in-out-cubic))

(deftest quart
  (are [results f] (equal? results (map f INPUTS))
    [0 0.00020736 0.0625 0.7480520100000001 1] sut/ease-in-quart
    [0 0.40030464 0.9375 0.99997599 1] sut/ease-out-quart
    [0 0.00165888 0.5 0.99980792 1] sut/ease-in-out-quart))

(deftest quint
  (are [results f] (equal? results (map f INPUTS))
    [0 0.0000248832 0.03125 0.6956883693000001 1] sut/ease-in-quint
    [0 0.4722680832 0.96875 0.9999983193 1] sut/ease-out-quint
    [0 0.0003981312 0.5 0.9999731088 1] sut/ease-in-out-quint))

(deftest expo
  (are [results f] (equal? results (map f INPUTS))
    [0 0.002243551474603583 0.03125 0.6155722066724585 1]  sut/ease-in-expo
    [0 0.5647247183519379 0.96875 0.9984135695383667 1] sut/ease-out-expo
    [0 0.00257716388822831 0.5 0.9987114180558858 1] sut/ease-in-out-expo))

(deftest circ
  (are [results f] (equal? results (map f INPUTS))
    [0 0.00722610832073145 0.1339745962155614 0.632440481010218 1] sut/ease-in-circ
    [0 0.4749736834815167 0.8660254037844386 0.9975469913743412 1] sut/ease-out-circ
    [0 0.014613556019536122 0.5 0.9950757517794626 1] sut/ease-in-out-circ))

(deftest back
  (are [results f] (equal? results (map f INPUTS))
    [0 -0.01983442176 -0.08769750000000004 0.7013382420600003 0.9999999999999998] sut/ease-in-back
    ;; NOTE: Somehow the results here differ from the CLJS implementation..
    [2.220446049250313E-16 0.47665242624000026 1.0876975 1.00741110006 1.0] sut/ease-out-back
    [0 -0.06371138304 0.5 1.02582161624 1] sut/ease-in-out-back))
