(ns cellular-automata.rules-test
  (:require [midje.sweet :refer :all]
            [cellular-automata.rules :as rules]))

(facts
  "about rules"

  (fact
    ;+-----------------------------------------------------------------+
    ;| Neighborhood    | 111 | 110 | 101 | 100 | 011 | 010 | 001 | 000 |
    ;+-----------------------------------------------------------------+
    ;| New Center Cell |  0  |  1  |  0  |  1  |  1  |  0  |  1  |  0  |
    ;+-----------------------------------------------------------------+
    "using rule 90"
    (rules/rule-90 [1 1 1]) => 0
    (rules/rule-90 [1 1 0]) => 1
    (rules/rule-90 [1 0 1]) => 0
    (rules/rule-90 [1 0 0]) => 1
    (rules/rule-90 [0 1 1]) => 1
    (rules/rule-90 [0 1 0]) => 0
    (rules/rule-90 [0 0 1]) => 1
    (rules/rule-90 [0 0 0]) => 0)


  (fact
    ;+-----------------------------------------------------------------+
    ;| Neighborhood    | 111 | 110 | 101 | 100 | 011 | 010 | 001 | 000 |
    ;+-----------------------------------------------------------------+
    ;| New Center Cell |  0  |  0  |  0  |  1  |  1  |  1  |  1  |  0  |
    ;+-----------------------------------------------------------------+
    "using rule 30"
    (rules/rule-30 [1 1 1]) => 0
    (rules/rule-30 [1 1 0]) => 0
    (rules/rule-30 [1 0 1]) => 0
    (rules/rule-30 [1 0 0]) => 1
    (rules/rule-30 [0 1 1]) => 1
    (rules/rule-30 [0 1 0]) => 1
    (rules/rule-30 [0 0 1]) => 1
    (rules/rule-30 [0 0 0]) => 0))
