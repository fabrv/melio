(ns rateprof.routes.university 
  (:require [rateprof.routes.professor :as professor]))

(def express (js/require "express"))

(def router (.Router express))

;; Mock collection of professors, with fields: id, name, and rating
(def professors
  (array
    #js{
        :id "1"
        :name "Dr. Ramirez"
        :rating "4.5"
    }
    #js{
        :id "2"
        :name "Dra. Garcia"
        :rating "3.4"
    }
    #js{
        :id "3"
        :name "Dra. Lopez"
        :rating "4.2"
    }
    #js{
        :id "4"
        :name "Dr. Gonzalez"
        :rating "2.5"
    }
    #js{
        :id "5"
        :name "Dr. Perez"
        :rating "0.5"
    }
    #js{
        :id "6"
        :name "Dr. Sanchez"
        :rating "2.5"
    }
    #js{
        :id "7"
        :name "Dr. Rodriguez"
        :rating "3.5"
    }
    #js{
        :id "8"
        :name "Dr. Zuluaga"
        :rating "3.5"
    }
    #js{
        :id "9"
        :name "Dr. Morales"
        :rating "1.5"
    }
    #js{
        :id "10"
        :name "Dr. Correa"
        :rating "0.5"
    }))

(.get
 router
 "/:name"
 (fn [req res]
   (.render res "university" #js{
                                 :name (.. req -params -name)
                                 :professors professors})))

(.use
 router
 "/:name/:profId"
 professor/router)