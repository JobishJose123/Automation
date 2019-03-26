#Author: joel.jose@flytxt.com
#Keywords Summary : to create campaign for data setup
@NDX-createcampaignFeature
Feature: campaign for data setup


  @NDX-createcampaign
   @initBrowser @closeBrowser
  Scenario: Verify creating campaign for data setup
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog

@NDX-createrecurringcampaign
   @initBrowser @closeBrowser
  Scenario: Verify creating campaign for data setup
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new recurring campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog
      
@NDX-createCampaignToVerifyPause
@initBrowser @closeBrowser
Scenario: Verify creating campaign for Pause Verification
Given login
When navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "CampaignForPause" with catalog "defaultCatalog"
Then save "campaignInputData" data to spreadsheet from "CampaignForPause" with string campaign with catalog from campaignBc with defautCatalog
      
      
@NDX-createCampaignToVerifyAbort @initBrowser @closeBrowser
Scenario: Verify creating campaign for Abort Verification
Given login
When navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "CampaignForAbort" with catalog "defaultCatalog"
Then save "campaignInputData" data to spreadsheet from "CampaignForAbort" with string campaign with catalog from campaignBc with defautCatalog
    
    
@NDX-createCampaignToVerifyShowHistory @initBrowser @closeBrowser
Scenario: Verify creating campaign for History Verification
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategoryShowHistory"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to configuration
Then click approval rules option
Then create new approval rule from sheet "approvalRule" with campaign category from sheet "campaignCategoryShowHistory"
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategoryShowHistory"
Then create new campaign from sheet for approval "CampaignForShowHistory" with catalog "defaultCatalog"
    
    