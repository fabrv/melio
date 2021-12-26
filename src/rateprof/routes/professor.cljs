(ns rateprof.routes.professor)

(def express (js/require "express"))

(def router (.Router express))

(.get
 router
 "/"
 (fn [req res]
   (.render res "professor" #js{:uniName (.. req -params -name)
                                 :profId (.. req -params -profId)})))