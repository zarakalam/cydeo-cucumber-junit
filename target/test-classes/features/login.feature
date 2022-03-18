@Regression @smoke
Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  @librarian @employee @wip
  Scenario: Login as librarian
    Given user is on the library login page
    When user enters librarian user name
    And user enters librarian password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters a student username
    And user enters student password
    Then user should see the dashboard

  @admin @employee
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard