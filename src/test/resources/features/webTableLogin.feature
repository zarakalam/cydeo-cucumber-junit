Feature: User should be able to login using correct credentials


  Scenario: Positive login scenario
    Given User is on the login page of the webtable app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should see url contains orders

  @wip
  Scenario: Positive login scenario
    Given User is on the login page of the webtable app
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders
