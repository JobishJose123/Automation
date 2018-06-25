#Author: sreeraj.rajan@flytxt.com
#Keywords Summary : export campaign location related test cases

@NX-ExportCampaign_Location
Feature: Test cases related to export campaign location

@NX-6850 @initBrowser @closeBrowser
  Scenario: add export location
    Given login
    Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location and verify the same in list
