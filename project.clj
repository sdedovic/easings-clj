(defproject com.dedovic/easings-clj "0.2.1-SNAPSHOT"
  :description ""
  :url "https://github.com/sdedovic/easings-clj"
  :license {:name "GNU General Public License v3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :deploy-repositories [["releases"  {:sign-releases false 
                                      :url "https://clojars.org/repo"
                                      :username :env/clojars_user
                                      :password :env/clojars_token}]]
  :dependencies [[org.clojure/clojure "1.11.3"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :profiles {:examples {:dependencies [[quil/quil "4.3.1563"]]
                        :source-paths ["src" "examples"]}
             :cljs {:dependencies [
                                   ;; hack to get the latest closure-compiler if CLJS doesn't have it
                                   [org.clojure/clojurescript "1.11.132" 
                                    :exclusions [com.google.javascript/closure-compiler-unshaded]]
                                   [thheller/shadow-cljs "2.28.10"]]}}
  :aot :all)
