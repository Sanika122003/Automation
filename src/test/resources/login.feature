Feature: Login feature
  Scenario: Successful login
    Given user is on the login page
    When user enters valid credentials
    Then user should be navigated to the home page