(defproject node-js-test "0.1.0"
  :description "cljs-nodejs-example: example ClojureScript node.js app"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.866"]]
  :min-lein-version "2.0.0"
  :hooks [leiningen.cljsbuild]
  :plugins [[lein-cljsbuild "1.1.8"]]
  :cljsbuild {:builds [{:source-paths ["src/myexample"]
                        :compiler {:output-to "target/js/myexample.js"
                                   :target :nodejs
                                   :optimizations :simple
                                   :pretty-print true}}]})