(set-env!
 :source-paths #{"src" "test/clojure"}
 :resource-paths #{"resources"}
 :dependencies '[[org.clojure/clojure "1.10.1"]
                 [http-kit "2.3.0"]
                 [liberator "0.15.3"]
                 [com.domkm/silk "0.1.2"]
                 [com.layerware/hugsql "0.5.1"]
                 [org.postgresql/postgresql "42.2.8"]

                 [mbuczko/boot-flyway "0.1.1" :scope "test"]])

