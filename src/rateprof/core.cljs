(ns rateprof.core
  (:require
   [rateprof.routes.index :as index]))

;; NodeJs libraries
(def express (js/require "express"))
(def logger (js/require "morgan"))
(def exphbs (js/require "express-handlebars"))

(def app (express))

(def hbs-config {:extname ".hbs"
                 :defaultLayout "layout"
                 :helpers {}})
(def hbs
  (.create exphbs (clj->js hbs-config)))

(defn server [port success]
  (doto app
    (.use (logger "dev"))
    (.engine ".hbs" (. hbs -engine))
    (.set "view engine" ".hbs")
    (.use "/" index/router)    
    (.listen port success)))

(defn -main [& _]
  (let [port (or (.. js/process -env -PORT) 3210)]
    (server port
            (println (str "Server running at http://127.0.0.1:" port)))))

(set! *main-cli-fn* -main)