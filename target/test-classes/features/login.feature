Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Scenario: Login as librarian
    When user enters librarian user name
    And user enters librarian password
    Then user should see the dashboard

    Scenario: Login as student
      When user enters a student username
      And user enters student password
      Then user should see the dashboard