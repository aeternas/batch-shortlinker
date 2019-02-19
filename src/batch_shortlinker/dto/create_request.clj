(ns batch-shortlinker.dto.create-request)

(defrecord CreateRequest [headers data])

(defn make-createRequest ([headers data]
                          (->CreateRequest headers data)))
