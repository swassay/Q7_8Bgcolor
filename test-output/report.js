$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/18173/Documents/AutomationTest/Q7_8bgcolor/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Log in techfios test site and check background colors",
  "description": "",
  "id": "log-in-techfios-test-site-and-check-background-colors",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user should log in to site and click blue or white",
  "description": "",
  "id": "log-in-techfios-test-site-and-check-background-colors;user-should-log-in-to-site-and-click-blue-or-white",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user is in page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks blue background changes to blue",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks white background changes to White",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "program ends",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.the_user_is_in_page()"
});
formatter.result({
  "duration": 6773568400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_clicks_blue_background_changes_to_blue()"
});
formatter.result({
  "duration": 3121399600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.user_clicks_white_background_changes_to_White()"
});
formatter.result({
  "duration": 70122900,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinition.program_ends()"
});
formatter.result({
  "duration": 1450793100,
  "status": "passed"
});
});