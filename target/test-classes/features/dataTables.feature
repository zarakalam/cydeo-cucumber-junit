Feature: Examples of Cucumber data table implementations


  Scenario: List of fruits that I like
    Then User should see fruits I like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |
