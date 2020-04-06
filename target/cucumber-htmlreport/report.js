$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "JMS Login",
  "description": "",
  "id": "jms-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 57490086,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on \"LoginPage\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPage",
      "offset": 12
    }
  ],
  "location": "Step.user_is_on(String)"
});
formatter.result({
  "duration": 13140044497,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Invalid credentials",
  "description": "",
  "id": "jms-login;invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Validate user is on \"LoginPage\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters \"AKS1009\" in \"UserName\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User clicks on \"Proceed\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enters \"Abcd12345\" in \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks on \"Proceed\" Button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Validate \"Invalid Credentials\" is inner text of \"Warning_Message\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "LoginPage",
      "offset": 21
    }
  ],
  "location": "Step.validate_user_is_on(String)"
});
formatter.result({
  "duration": 168339121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AKS1009",
      "offset": 13
    },
    {
      "val": "UserName",
      "offset": 26
    }
  ],
  "location": "Step.user_enters_in(String,String)"
});
formatter.result({
  "duration": 129445263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed",
      "offset": 16
    }
  ],
  "location": "Step.user_clicks_on_Button(String)"
});
formatter.result({
  "duration": 1039024917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abcd12345",
      "offset": 13
    },
    {
      "val": "Password",
      "offset": 28
    }
  ],
  "location": "Step.user_enters_in(String,String)"
});
formatter.result({
  "duration": 236543315,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed",
      "offset": 16
    }
  ],
  "location": "Step.user_clicks_on_Button(String)"
});
formatter.result({
  "duration": 814319190,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid Credentials",
      "offset": 10
    },
    {
      "val": "Warning_Message",
      "offset": 49
    }
  ],
  "location": "Step.validate_is_inner_text_of(String,String)"
});
formatter.result({
  "duration": 119241577,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat step.Step.validate_is_inner_text_of(Step.java:142)\r\n\tat ✽.Then Validate \"Invalid Credentials\" is inner text of \"Warning_Message\"(Login.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1343519782,
  "status": "passed"
});
});