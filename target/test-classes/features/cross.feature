@gridCross
Feature: RastMobile Task

  @gridChrome
  Scenario: Navigate MainPage_Chrome
    Given User goes to main page and accept cookies_c
    Then Verify the main page title_c

  @gridEdge
  Scenario: Navigate MainPage_Edge
    Given User goes to main page and accept cookies_d
    Then Verify the main page title_d

  @gridFirefox
  Scenario: Navigate MainPage_Firefox
    Given User goes to main page and accept cookies_e
    Then Verify the main page title_e

