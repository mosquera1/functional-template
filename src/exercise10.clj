(ns exercise10)

(defn open-account []
    {:balance 0}
)
(defn close-account [account]
  (dissoc account :balance)
)

(defn get-balance [account]
  (account :balance)
)

(defn update-balance [account amount]
 (update-in account[:balance] + amount)
)

