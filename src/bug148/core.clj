(ns bug148.core
  (:use [external-jar.core]))

(defn call-other-jar []
  (gimme-five))
  