Feature: Failed Multiple Login Feature
  Verify if user is failed multiple times to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user submit username and Password multiple times
    Then failed message is displayed