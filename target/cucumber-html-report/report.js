$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "As a user, I want to be able to login to the website",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": ";successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter \u003cemail\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page is loaded",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": ";successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 12,
      "id": ";successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "revolutionit1@gmail.com",
        "Revolutionit#7"
      ],
      "line": 13,
      "id": ";successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "osbcweagree11@gmail.com",
        "Monday11"
      ],
      "line": 14,
      "id": ";successful-login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4213882889,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": ";successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter revolutionit1@gmail.com and Revolutionit#7",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.openHomePage()"
});
formatter.result({
  "duration": 1356862153,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clickSigninLink()"
});
formatter.result({
  "duration": 1103492245,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "revolutionit1@gmail.com",
      "offset": 8
    },
    {
      "val": "Revolutionit#7",
      "offset": 36
    }
  ],
  "location": "LoginStep.login(String,String)"
});
formatter.result({
  "duration": 2227339113,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.dashboardPageLoaded()"
});
formatter.result({
  "duration": 3562644425,
  "status": "passed"
});
formatter.after({
  "duration": 1475510112,
  "status": "passed"
});
formatter.before({
  "duration": 3599486867,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": ";successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click Signin link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter osbcweagree11@gmail.com and Monday11",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.openHomePage()"
});
formatter.result({
  "duration": 940461178,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clickSigninLink()"
});
formatter.result({
  "duration": 844360454,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "osbcweagree11@gmail.com",
      "offset": 8
    },
    {
      "val": "Monday11",
      "offset": 36
    }
  ],
  "location": "LoginStep.login(String,String)"
});
formatter.result({
  "duration": 2032738518,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.dashboardPageLoaded()"
});
formatter.result({
  "duration": 3210427648,
  "status": "passed"
});
formatter.after({
  "duration": 1408051910,
  "status": "passed"
});
});