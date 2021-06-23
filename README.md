# easings-clj

[![Clojars Project](https://img.shields.io/clojars/v/com.dedovic/easings-clj.svg)](https://clojars.org/com.dedovic/easings-clj)

A Clojure port of the [easings.net](easings.net) easing functions. Orignal source code may be found at [ai/easings.net](https://github.com/ai/easings.net).

## Install
Leiningen/Boot
```clojure
[com.dedovic/easings-clj "0.1.0"]
```
Clojure CLI/deps.edn
```clojure
com.dedovic/easings-clj {:mvn/version "0.1.0"}
```
Gradle
```groovy
compile 'com.dedovic:easings-clj:0.1.0'
```
Maven
```xml
<dependency>
  <groupId>com.dedovic</groupId>
  <artifactId>easings-clj</artifactId>
  <version>0.1.0</version>
</dependency>
```
## Using
```clj
(require 'easings.core :as ease)

(ease/ease-in-sine 0.2)
```

## TODO:
- (2021-06-21): Elastic functions
- (2021-06-21): Unit tests?
- (2021-06-21): Elastic functions
- (2021-06-21): Bounce functions

## Proof it Works
![docs/render.jpg](./docs/render.jpg)
