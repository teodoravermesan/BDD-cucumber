Feature: Wikipedia Login

Background:
    Given I am on homepage
    When I click the login button
    Then I login with "teovermesan" and "Test123456789"

Scenario: Login
    And Header name is "Teovermesan"
    
