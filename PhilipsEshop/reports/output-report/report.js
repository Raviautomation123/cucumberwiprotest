$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderAndDelivery.feature");
formatter.feature({
  "line": 2,
  "name": "Home page functionality for Eshoop ravindra",
  "description": "",
  "id": "home-page-functionality-for-eshoop-ravindra",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verification of Home page",
  "description": "",
  "id": "home-page-functionality-for-eshoop-ravindra;verification-of-home-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open the charome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Open the application \"\u003curl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify the Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify the title page",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "home-page-functionality-for-eshoop-ravindra;verification-of-home-page;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 11,
      "id": "home-page-functionality-for-eshoop-ravindra;verification-of-home-page;;1"
    },
    {
      "cells": [
        "https://tst.philips.co.uk/shop/"
      ],
      "line": 12,
      "id": "home-page-functionality-for-eshoop-ravindra;verification-of-home-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verification of Home page",
  "description": "",
  "id": "home-page-functionality-for-eshoop-ravindra;verification-of-home-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open the charome and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Open the application \"https://tst.philips.co.uk/shop/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify the Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify the title page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.Open_the_charome_and_launch_the_application()"
});
formatter.result({
  "duration": 6920363800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://tst.philips.co.uk/shop/",
      "offset": 22
    }
  ],
  "location": "Steps.Open_the_application_Url(String)"
});
formatter.result({
  "duration": 14627173400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_the_Home_page()"
});
formatter.result({
  "duration": 100500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.Verify_the_title_page()"
});
formatter.result({
  "duration": 111800,
  "status": "passed"
});
});