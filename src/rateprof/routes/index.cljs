(ns rateprof.routes.index)

(def express (js/require "express"))

(def router (.Router express))

(def index #js{"universities" (array #js{"image" "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c4/Panor%C3%A1mica_entrada_Universidad_Francisco_Marroqu%C3%ADn.jpg/1920px-Panor%C3%A1mica_entrada_Universidad_Francisco_Marroqu%C3%ADn.jpg"
                                         "name" "Universidad Francisco Marroquín"
                                         "rating" "4.5"
                                         "id" "ufm"}
                                     #js{"image" "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Landivar_Campus_Central.jpg/1920px-Landivar_Campus_Central.jpg"
                                         "name" "Universidad Rafael Landívar"
                                         "rating" "4.2"
                                         "id" "url"}
                                     #js{"image" "https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Recursos_Educativos.jpg/1200px-Recursos_Educativos.jpg"
                                         "name" "Universidad de San Carlos de Guatemala"
                                         "rating" "4.3"
                                         "id" "usac"})})

(.get
 router
 "/"
 (fn [_ res]
   (.render res "index" index)))