(ns authority.core
  (:require [crux.api :as crux]
            [clojure.java.io :as io])
  (:gen-class))

(def user 
  {:user/name "abc#1923"
   :user/nickname "Abc123"
   :user/id {:discord/user 168548441939509248}
   :user/authority 0
   :user/karma 0
   :user/warnings []
   :blacklisted false
   :user/origin {:discord/server 81384788765712384}})

(def promotion 
  {:event/type :event/authority-changed
   :event/from-authority 0
   :event/to-authority 20
   :event/object {:discord/user 168548441939509248 :discord/server 81384788765712384}
   :event/subject {:discord/user 168548441939509249 :discord/server 81384788765712384}})

;; :event/karma-changed
;; :event/user-warned
;; :event/factoid-added
;; :event/factoid-removed
;; :event/leaderboard
;; :event/user-enforced
;; :event/nickname-changed

(def state {:goodbot 49
            :badbot 50
            
            :users {{:discord/user 168548441939509248} {:commands {:authority 9
                                                                   :help 4
                                                                   :karma 66}
                                                        :last-seen #inst "19-02-2919"
                                                        :transient {:words {"antidisestablishmentarianism" 93
                                                                            "topic" 42
                                                                            "learning" 41}
                                                                    :messages 1294
                                                                    :quote nil
                                                                    :version #inst "19-02-2919"}}}})

(def markov (atom {}))

;; permissions
;; nlp