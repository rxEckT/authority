(defproject authority "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/rxEckT/authority"
  :license {:name "Unlicense"
            :url "https://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [juxt/crux-core "20.03-1.8.0-alpha"]
                 [juxt/crux-rocksdb "20.03-1.8.0-alpha"]
                 [org.suskalo/discljord "0.2.7"]
                 [com.bhauman/rebel-readline "0.1.4"]
                 [rm-hull/markov-chains "0.1.1"]
                 [damionjunk/nlp "0.1.0"]
                 [org.clojure/data.json "1.0.0"]]
  :repl-options {:init-ns authority.core}
  :main authority.core)
