@cucumberPage @fullTest
  Feature: Cucumber page testing
    Scenario: Verify title and trending courses of page
      Given User opens home page
      When User navigates to "Cucumber" page
      Then Verifies title is "Cucumber Testing Tutorials for Beginners"
      And Verifies "Cucumber" page Trending courses