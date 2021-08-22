(ns rateprof.routes.index)

(def express (js/require "express"))

(def router (.Router express))

(def index #js{"title" "Clojurexpress"})

(.get
 router
 "/"
 (fn [_ res]
   (.render res "index" index)))