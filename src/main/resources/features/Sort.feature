Feature: Sort Feature
  Verify if data success sorted

  Scenario: Sort database query name 
    Given user is on homepage
    When user sort all query by Query name
    Then database is sorted