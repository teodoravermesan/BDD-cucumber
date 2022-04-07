Feature: Wikipedia Login/Logout

Background:
    Given I am on homepage
    When I click the login button
    Then I login with "teovermesan" and "Test123456789"

Scenario: Logout
   And I logout
   Then Sign in button is displayed
    