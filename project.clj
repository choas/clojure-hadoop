(defproject org.clojars.choas/clojure-hadoop "1.2.1-SNAPSHOT"
  :description      "A library to assist in writing Hadoop MapReduce jobs in Clojure."
  :url              "http://github.com/choas/clojure-hadoop"
  :namespaces       [clojure-hadoop.config
		     clojure-hadoop.defjob
		     clojure-hadoop.gen
		     clojure-hadoop.imports
		     clojure-hadoop.job
		     clojure-hadoop.load
		     clojure-hadoop.wrap]
  :dependencies     [[org.clojure/clojure "1.2.0-master-SNAPSHOT"]
                     [org.apache.hadoop/hadoop-core "0.20.2-dev"]]
  :dev-dependencies [[lein-clojars "0.5.0"]]
  :source-path  "src/main/clojure"
)
