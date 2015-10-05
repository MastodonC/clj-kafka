(defproject mastodonc/clj-kafka "0.2.6-0.8.2.2"
  :url "https://github.com/MastodonC/clj-kafka"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [zookeeper-clj "0.9.3"]
                 [org.clojure/data.json "0.2.6"]
                 
                 [org.slf4j/slf4j-api "1.7.12"]

                 ;; kafka and its related deps
                 [org.apache.kafka/kafka_2.10 "0.8.2.2"]
                 [org.apache.zookeeper/zookeeper "3.4.6"]
                 [com.101tec/zkclient "0.6"]
                 [com.yammer.metrics/metrics-core "2.2.0"]
                 [net.sf.jopt-simple/jopt-simple "4.9"]]
  :exclusions [javax.mail/mail
               javax.jms/jms
               com.sun.jdmk/jmxtools
               com.sun.jmx/jmxri
               jline/jline
               org.slf4j/slf4j-api]

  :plugins [[lein-expectations "0.0.8"]]
  :profiles {:dev {:dependencies [[commons-io/commons-io "2.4"]
                                  [expectations "2.1.3"]
                                  [org.slf4j/slf4j-simple "1.7.12"]]}}
  :description "Clojure wrapper for Kafka's Java API")
