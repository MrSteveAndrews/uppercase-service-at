Feature: Transform string values to upper case

  Scenario: Transform lower case strings to upper case
    Given the upper case service is running
    When the input string "abc" is passed into the upper case service
    Then the resulting output string is "ABC"

    Given the upper case service is running
    When the input string "def" is passed into the upper case service
    Then the resulting output string is "DEF"

  Scenario: Transform upper case strings to upper case
    Given the upper case service is running
    When the input string "GHI" is passed into the upper case service
    Then the resulting output string is "GHI"

    Given the upper case service is running
    When the input string "JKL" is passed into the upper case service
    Then the resulting output string is "JKL"

  Scenario: Transform mixed case strings to upper case
    Given the upper case service is running
    When the input string "mNopQ" is passed into the upper case service
    Then the resulting output string is "MNOPQ"

    Given the upper case service is running
    When the input string "RStuV" is passed into the upper case service
    Then the resulting output string is "RSTUV"

  Scenario: Transform alphanumeric strings to upper case
    Given the upper case service is running
    When the input string "w761x4" is passed into the upper case service
    Then the resulting output string is "W761X4"

    Given the upper case service is running
    When the input string "8307y27Z" is passed into the upper case service
    Then the resulting output string is "8307Y27Z"

