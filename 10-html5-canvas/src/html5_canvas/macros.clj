;; create macros namespace
(ns html5-canvas.macros)


(defmacro p
  "Print and return native JavaScript argument."
  [x]
  `(let [res# ~x]
     (.log js/console res#)
     res#))


(defmacro pp
 "Pretty print and return argument (uses `prn-str` internally)."
 [x]
 `(let [res# ~x]
    (.log js/console (prn-str res#))
    res#))
