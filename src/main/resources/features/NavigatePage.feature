Feature: Navigate Page Feature
  Verify if page is success changed

  Scenario: Change to next page
    Given user is on homepage
    When user move to the next page
    Then The page is move to the next page