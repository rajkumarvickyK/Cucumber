$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Login.feature");
formatter.feature({
  "name": "",
  "description": "  To Validate Login Functionality in Fb App",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have to enter fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnition.user_have_to_enter_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "      To validate login by using invalid email and valid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User have to maxmize the window",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnition.user_have_to_maxmize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter invalid email and validpass",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnition.user_have_to_enter_invalid_email_and_validpass()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat org.stepdefinition.StepDefnition.user_have_to_enter_invalid_email_and_validpass(StepDefnition.java:65)\r\n\tat ✽.User have to enter invalid email and validpass(file:src/test/resources/FeatureFile/Login.feature:28)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have to click buttton",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnition.user_have_to_click_buttton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to invalid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnition.user_have_to_invalid_credentials()"
});
formatter.result({
  "status": "skipped"
});
});