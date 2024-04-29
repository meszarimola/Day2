Feature: Test the click
  Scenario: Accepting the cookies
    Given I open the base URL
    When I accept privacy policy
    Then The menu is visible