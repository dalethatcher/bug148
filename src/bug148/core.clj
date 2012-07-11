(ns bug148.core
  (:require [external-jar.core]))

(defn call-other-jar []
  (gimmie-five))
  