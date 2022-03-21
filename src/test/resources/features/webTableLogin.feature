Feature: User should be able to login using correct credentials

  Background: User is on the login page of the webtable app


  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should see url contains orders


  Scenario: Positive login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

  @wip
  Scenario: User should be able to see all 12 months in
  months dropdown
    Given User is on the login page of the webtable app
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then user should see url contains orders
