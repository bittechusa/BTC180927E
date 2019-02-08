$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bittechconsulting/eclipse-workspace/BDDProject/abc.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up Validation",
  "description": "",
  "id": "sign-up-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "LogIn to Facebook website",
  "description": "",
  "id": "sign-up-validation;login-to-facebook-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "i enter facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i type userId as \u003cuser\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i type passord as \u003cpass\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i should be logged in successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "sign-up-validation;login-to-facebook-website;",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ],
      "line": 11,
      "id": "sign-up-validation;login-to-facebook-website;;1"
    },
    {
      "cells": [
        "\"ab234c@yahoo.com\"",
        "\"Abcd123\""
      ],
      "line": 12,
      "id": "sign-up-validation;login-to-facebook-website;;2"
    },
    {
      "cells": [
        "\"ab2dfvd34c@yahoo.com\"",
        "\"Abcvfdd123\""
      ],
      "line": 13,
      "id": "sign-up-validation;login-to-facebook-website;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "LogIn to Facebook website",
  "description": "",
  "id": "sign-up-validation;login-to-facebook-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "i enter facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i type userId as \"ab234c@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i type passord as \"Abcd123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SamplStepDefinition.i_enter_facebook()"
});
formatter.result({
  "duration": 4501115552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab234c@yahoo.com",
      "offset": 18
    }
  ],
  "location": "SamplStepDefinition.i_type_userId_as(String)"
});
formatter.result({
  "duration": 115033552,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcd123",
      "offset": 19
    }
  ],
  "location": "SamplStepDefinition.i_type_passord_as(String)"
});
formatter.result({
  "duration": 69659893,
  "status": "passed"
});
formatter.match({
  "location": "SamplStepDefinition.i_click_on_log_in_button()"
});
formatter.result({
  "duration": 1138940100,
  "status": "passed"
});
formatter.match({
  "location": "SamplStepDefinition.i_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 5029393076,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "LogIn to Facebook website",
  "description": "",
  "id": "sign-up-validation;login-to-facebook-website;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "i enter facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i type userId as \"ab2dfvd34c@yahoo.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i type passord as \"Abcvfdd123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i click on log in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "i should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SamplStepDefinition.i_enter_facebook()"
});
formatter.result({
  "duration": 2536584477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ab2dfvd34c@yahoo.com",
      "offset": 18
    }
  ],
  "location": "SamplStepDefinition.i_type_userId_as(String)"
});
formatter.result({
  "duration": 114364842,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcvfdd123",
      "offset": 19
    }
  ],
  "location": "SamplStepDefinition.i_type_passord_as(String)"
});
formatter.result({
  "duration": 81145568,
  "status": "passed"
});
formatter.match({
  "location": "SamplStepDefinition.i_click_on_log_in_button()"
});
formatter.result({
  "duration": 748313020,
  "status": "passed"
});
formatter.match({
  "location": "SamplStepDefinition.i_should_be_logged_in_successfully()"
});
formatter.result({
  "duration": 5029949975,
  "status": "passed"
});
});