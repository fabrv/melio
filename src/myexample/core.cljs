(ns myexample.core)

;; NodeJs libraries
(def express (js/require "express"))
(def app (express))

(defn handler [_ res]
  (.send res "Hello World"))

(defn server [port success]
  (doto app
    (.get "/" handler)
    (.listen port success)))

(defn -main [& _]
  (let [port (or (.. js/process -env -PORT) 3000)]
    (server port
            #(println (str "Server running at http://127.0.0.1:" port)))))

(set! *main-cli-fn* -main)