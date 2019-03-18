#Author: joel.jose@flytxt.com
#Keywords Summary : to create campaign for data setup


@NDX-createcampaignFeature
Feature: campaign for data setup

   @NDX-5495, @NDX-5495
   @initBrowser @closeBrowser
  Scenario: Verify creating campaign for data setup
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog

  @NDX-8010, @NDX-356
   @initBrowser @closeBrowser
  Scenario: Verify creating a recurring campaign for data setup
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new recurring campaign from sheet "recurringcampaign" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog
      
    
    