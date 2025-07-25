Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given User is on the login page
    When User enters valid username and valid password
    And User clicks on the login button
    Then User should be redirected to the products page