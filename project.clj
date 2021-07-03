(defproject node-js-test "0.1.0"
  :description "cljs-nodejs-example: example ClojureScript node.js app"
  :url "http://example.com/FIXME"
  :license {:name "MIT"
            :url "https://mit-license.org/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.866"]]
  :min-lein-version "2.0.0"
  :plugins [[lein-cljsbuild "1.1.8"]]
  :cljsbuild {:builds [{:source-paths ["src/rateprof"]
                        :compiler {:output-to "target/js/index.js"
                                   :target :nodejs
                                   :optimizations :simple
                                   :pretty-print true}}]})