(ns rateprof.utils.format 
  (:require [clojure.string :refer [join]]))

(defn ratingToStar [rating]
  (join "" (repeat (js/Math.round rating) "<i class=\"bi bi-star-fill\"></i>")))