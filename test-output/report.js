$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/inputTable.feature");
formatter.feature({
  "name": "To Get the Table Data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get the table row data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_Browser_and_open_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL \"https://demo.aspnetawesome.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.User_open_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Search for the Input ID \"1113\" and get result",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Search_for_the_Input_ID(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});