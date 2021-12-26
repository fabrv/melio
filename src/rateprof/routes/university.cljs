(ns rateprof.routes.university)

(def express (js/require "express"))

(def router (.Router express))

;; Mock collection of professors, with fields: id, name, and rating
(def professors
  (js/Array
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
    }))

(.get
 router
 "/:name"
 (fn [req res]
   (.render res "university" #js{
                                 :name (.. req -params -name)
                                 :professors professors})))