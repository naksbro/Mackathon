$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/homePage.feature");
formatter.feature({
  "name": "Home page Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@homePage"
    }
  ]
});
formatter.scenario({
  "name": "Verify title of Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@homePage"
    },
    {
      "name": "@verifytitle"
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
<<<<<<< HEAD
  "name": "Verifies title is \"Meet Guru99 - Free Training Tutorials \u0026 Video for IT Courses\"",
=======
  "name": "Verifies title is \"Meet Guru99 - Free Training Tutorials \u0026 Videos for IT Courses\"",
>>>>>>> cf23fc1f16fb7a3cc467c5bf64d224ace3d4ebb4
  "keyword": "Then "
});
formatter.match({
  "location": "HomePage_STEPS.verifies_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});