@javaPage @fullTest
Feature: Java page testing
  Scenario: Verify title and trending courses of page
    Given User opens home page
    When User navigates to "Cucumber" page
    And User navigates to "Java" page
    Then Verifies title is "Java Tutorial for Beginners: Learn in 7 Days"
    And Verifies "Java" page Trending courses