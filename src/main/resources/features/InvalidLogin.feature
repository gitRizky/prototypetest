Feature: Failed Login Feature
  Verify if user is unable to Login in to the site

  Scenario: Login as a authenticated user
    Given user is on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then failed message is displayed