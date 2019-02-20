$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateContract.feature");
formatter.feature({
  "line": 1,
  "name": "GPG CRM",
  "description": "",
  "id": "gpg-crm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create Contract",
  "description": "",
  "id": "gpg-crm;create-contract",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@ALL"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logs onto system",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on the link \"Client\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on the link \"Create Contract\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects \"8_8_18 Reg Org\" from dropdown \"* Client Organization\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters \"12/05/2018\" in textbox \"* Start Date/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters \"30/11/2019\" in textbox \"* Real End Date/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user enters \"\" in textbox \"* Original End Date/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user waits for \"5000\" milliseconds",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user selects \"MSA\" from dropdown \"* Contract Type\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user selects \"Data\" from dropdown \"* Revenue Item\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters \"1\" in textbox \"* Contract Value/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#And user enters \"1000\" in textbox \"* Annual Contract Value/CreateContract\""
    }
  ],
  "line": 19,
  "name": "user enters \"4\" in textbox \"* Max Units/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user enters \"1\" in textbox \"* Incentive Units/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user enters \"1\" in textbox \"* Unit Overage Charge/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user enters \"2\" in textbox \"* Value Per Rollover Unit/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user enters \"2\" in textbox \"* Units Rolled Over from Previous Contract/CreateContract\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user checks the checkbox \"Active\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user waits for \"5000\" milliseconds",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user clicks on the button \"Create\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user waits for \"5000\" milliseconds",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user closes the browser",
  "keyword": "And "
});
formatter.match({
  "location": "commonSteps.user_opens_browser()"
});
formatter.result({
  "duration": 20395969396,
  "status": "passed"
});
formatter.match({
  "location": "commonSteps.user_logs_onto_system()"
});
formatter.result({
  "duration": 8219154543,
  "status": "passed"
});
formatter.match({
  "location": "commonSteps.home_page_is_displayed()"
});
formatter.result({
  "duration": 13732250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Client",
      "offset": 25
    }
  ],
  "location": "commonSteps.user_clicks_on_the_link(String)"
});
formatter.result({
  "duration": 96153316,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create Contract",
      "offset": 25
    }
  ],
  "location": "commonSteps.user_clicks_on_the_link(String)"
});
formatter.result({
  "duration": 3247307751,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027SH302907S1L\u0027, ip: \u0027192.168.111.198\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_73\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\ASLAM~1.KHA\\AppDat...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 3c3bb255b6f3711e41725895badba616\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat stepsDefinition.commonSteps.user_clicks_on_the_link(commonSteps.java:110)\r\n\tat ✽.And user clicks on the link \"Create Contract\"(CreateContract.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "8_8_18 Reg Org",
      "offset": 14
    },
    {
      "val": "* Client Organization",
      "offset": 45
    }
  ],
  "location": "commonSteps.user_selects_from_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "12/05/2018",
      "offset": 13
    },
    {
      "val": "* Start Date/CreateContract",
      "offset": 37
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "30/11/2019",
      "offset": 13
    },
    {
      "val": "* Real End Date/CreateContract",
      "offset": 37
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 13
    },
    {
      "val": "* Original End Date/CreateContract",
      "offset": 27
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5000",
      "offset": 16
    }
  ],
  "location": "commonSteps.user_waits_for_milliseconds(long)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "MSA",
      "offset": 14
    },
    {
      "val": "* Contract Type",
      "offset": 34
    }
  ],
  "location": "commonSteps.user_selects_from_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Data",
      "offset": 14
    },
    {
      "val": "* Revenue Item",
      "offset": 35
    }
  ],
  "location": "commonSteps.user_selects_from_dropdown(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "* Contract Value/CreateContract",
      "offset": 28
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 13
    },
    {
      "val": "* Max Units/CreateContract",
      "offset": 28
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "* Incentive Units/CreateContract",
      "offset": 28
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "* Unit Overage Charge/CreateContract",
      "offset": 28
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    },
    {
      "val": "* Value Per Rollover Unit/CreateContract",
      "offset": 28
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 13
    },
    {
      "val": "* Units Rolled Over from Previous Contract/CreateContract",
      "offset": 28
    }
  ],
  "location": "commonSteps.user_enters_in_textbox(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Active",
      "offset": 26
    }
  ],
  "location": "commonSteps.user_checks_the_checkbox(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5000",
      "offset": 16
    }
  ],
  "location": "commonSteps.user_waits_for_milliseconds(long)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Create",
      "offset": 27
    }
  ],
  "location": "commonSteps.user_clicks_on_the_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5000",
      "offset": 16
    }
  ],
  "location": "commonSteps.user_waits_for_milliseconds(long)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "commonSteps.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});