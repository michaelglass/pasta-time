^{:nextjournal.clerk/visibility :hide}
(ns pasta-time
  (:require [nextjournal.clerk :as clerk]
            [nextjournal.clerk-slideshow :as slideshow]
            [clojure.java.io :as io])
  (:import (java.net URL)
           (javax.imageio ImageIO)))

^{::clerk/visibility :hide
::clerk/viewer clerk/hide-result}
(clerk/add-viewers! [slideshow/viewer])

^{::clerk/visibility :hide
::clerk/viewer clerk/hide-result}
(comment
  ( clerk/serve! {})
  ( clerk/show! "notebooks/pasta_time.clj" )
  )

;; # 🍝untangling spaghetti using purity and copy pasta💇‍♂️

^{::clerk/visibility :hide}
(clerk/html [:img {:src "https://media.giphy.com/media/r8rKNIA7uQi9G/giphy.gif"}])



