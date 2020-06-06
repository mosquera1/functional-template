(ns exercise10)

(defn open-account []
    (let [account {:balance 0}]   
    account)
)
(defn close-account [account]
  (dissoc account :balance)
)

(defn get-balance [account]
  (get account :balance)
)

(defn update-balance [account amount]
 (update-in account[:balance] + amount)
)

