(defproject com.dedovic/easings-clj "0.1.0"
  :description ""
  :url "https://github.com/sdedovic/easings-clj"
  :license {:name "GNU General Public License v3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.11.3"]]
  :source-paths ["src/clj" "examples"]
  :java-source-paths ["src/java"]
  :resource-paths ["resources"]

  :profiles {:examples {:dependencies [[quil "4.3.1563"]]
                        :source-paths ["src/clj" "examples"]}}

  :aot :all)
