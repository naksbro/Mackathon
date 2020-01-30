@awsPage @fullTest
Feature: Java page testing
  Scenario: Verify title and trending courses of page
    Given User opens home page
    When User navigates to "Cucumber" page
    And User navigates to "Java" page
    And User navigates to "AWS" page
    Then Verifies title is "AWS(Amazon Web Services) Tutorial for Beginners: Learn in 2 Hours"
    And Verifies "AWS" page Trending courses