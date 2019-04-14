(ns batch-shortlinker.dto.template-request)

(defrecord TemplateRequest [headers data])

(defn make-templateRequest ([headers data]
                          (->TemplateRequest headers data)))
