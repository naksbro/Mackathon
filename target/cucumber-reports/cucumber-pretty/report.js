$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/awsPage.feature");
formatter.feature({
  "name": "Java page testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@awsPage"
    },
    {
      "name": "@fullTest"
    }
  ]
});
formatter.scenario({
  "name": "Verify title and trending courses of page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@awsPage"
    },
    {
      "name": "@fullTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"Cucumber\" page",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberPage_STEPS.user_navigates_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"Java\" page",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberPage_STEPS.user_navigates_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to \"AWS\" page",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberPage_STEPS.user_navigates_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies title is \"AWS(Amazon Web Services) Tutorial for Beginners: Learn in 2 Hours\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_STEPS.verifies_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies \"AWS\" page Trending courses",
  "keyword": "And "
});
formatter.match({
  "location": "CucumberPage_STEPS.verifies_page_Trending_courses(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});