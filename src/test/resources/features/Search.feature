Feature: Search
@test
Scenario: Search
    Given I am on homepage
    When Search "war" in search text box
    Then "War" page is displayed