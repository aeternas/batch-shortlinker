(ns batch-shortlinker.dto.create-request)

(defrecord CreateRequest [data])

(defn make-createRequest ([data]
                          (->CreateRequest data)))
