Feature: To test the login functionality of HRM Application

  Scenario: to Check login is successful with valid username and password
    Given user is on login page
    When user logins
    Then user is navigated to Homepage
