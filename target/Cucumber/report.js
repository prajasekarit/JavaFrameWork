$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/GoogleSearch.feature");
formatter.feature({
  "name": "GUMTREE GOOGLE Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate the GUMTREE links in Google Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "Initialize the \u003cbrowser\u003e browser",
  "keyword": "Given "
});
formatter.step({
  "name": "Navigate to \u003curl\u003e Site",
  "keyword": "And "
});
formatter.step({
  "name": "Google.com is launched send the literal \u003csearchterm\u003e in Google text box and Enter the search button",
  "keyword": "When "
});
formatter.step({
  "name": "Verify the links with the Literal \u003csearch_GUM_TREE\u003e and confirm the number of links displayed is more than one",
  "keyword": "Then "
});
formatter.step({
  "name": "verify that the title is getting is displayed",
  "keyword": "And "
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "browser",
        "url",
        "searchterm",
        "search_GUM_TREE"
      ]
    },
    {
      "cells": [
        "chrome",
        "https://google.com",
        "Cars in London",
        "GUM TREE"
      ]
    },
    {
      "cells": [
        "chrome-headless",
        "https://google.com",
        "Cars in London",
        "GUM TREE"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Application",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsGoogleSearch.validate_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the GUMTREE links in Google Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "Initialize the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsGoogleSearch.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://google.com Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsGoogleSearch.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Google.com is launched send the literal Cars in London in Google text box and Enter the search button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsGoogleSearch.googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the links with the Literal GUM TREE and confirm the number of links displayed is more than one",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsGoogleSearch.verify_the_links_with_the_literal_and_confirm_the_number_of_links_displayed_is_more_than_one(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the title is getting is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SDsGoogleSearch.verify_that_the_title_is_getting_is_displayed()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.test.stepdefinition.SDsGoogleSearch.verify_that_the_title_is_getting_is_displayed(SDsGoogleSearch.java:124)\r\n\tat ✽.verify that the title is getting is displayed(src/test/resources/FeatureFiles/GoogleSearch.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsGoogleSearch.close_browsers()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Application",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsGoogleSearch.validate_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the GUMTREE links in Google Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@functional"
    }
  ]
});
formatter.step({
  "name": "Initialize the chrome-headless browser",
  "keyword": "Given "
});
formatter.match({
  "location": "SDsGoogleSearch.initialize_the_browser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to https://google.com Site",
  "keyword": "And "
});
formatter.match({
  "location": "SDsGoogleSearch.navigate_to_site(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Google.com is launched send the literal Cars in London in Google text box and Enter the search button",
  "keyword": "When "
});
formatter.match({
  "location": "SDsGoogleSearch.googlecom_is_launched_send_the_literal_in_google_text_box_and_enter_the_search_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the links with the Literal GUM TREE and confirm the number of links displayed is more than one",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsGoogleSearch.verify_the_links_with_the_literal_and_confirm_the_number_of_links_displayed_is_more_than_one(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the title is getting is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SDsGoogleSearch.verify_that_the_title_is_getting_is_displayed()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.test.stepdefinition.SDsGoogleSearch.verify_that_the_title_is_getting_is_displayed(SDsGoogleSearch.java:124)\r\n\tat ✽.verify that the title is getting is displayed(src/test/resources/FeatureFiles/GoogleSearch.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close Browsers",
  "keyword": "Then "
});
formatter.match({
  "location": "SDsGoogleSearch.close_browsers()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});