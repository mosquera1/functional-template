FROM clojure
COPY . /usr/src/functionaltemplate
WORKDIR /usr/src/functionaltemplate
CMD ["lein","test"]
