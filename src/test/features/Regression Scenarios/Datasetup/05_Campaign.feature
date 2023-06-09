#Author: joel.jose@flytxt.com
#Total Scenario : 6
#Keywords Summary : to create campaign for data setup
@NDX-createcampaignFeature
Feature: campaign for data setup

@NDX-5495 @NDX-5494 @NDX-createcampaign11 @initBrowser @closeBrowser
  Scenario: Verify creating campaign for data setup
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog

@NDX-8010 @NDX-356 @NDX-createrecurringcampaign @initBrowser @closeBrowser
  Scenario: Verify creating a recurring campaign for data setup
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new recurring campaign from sheet "recurringcampaign" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog
      
@NDX-createCampaignToVerifyPause @initBrowser @closeBrowser
Scenario: Verify creating campaign for Pause Verification
Given login
When navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "CampaignForPause" with catalog "defaultCatalog"
#Then save "campaignInputData" data to spreadsheet from "CampaignForPause" with string campaign with catalog from campaignBc with defautCatalog
      
      
@NDX-createCampaignToVerifyAbort @initBrowser @closeBrowser
Scenario: Verify creating campaign for Abort Verification
Given login
When navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "CampaignForAbort" with catalog "defaultCatalog"
#Then save "campaignInputData" data to spreadsheet from "CampaignForAbort" with string campaign with catalog from campaignBc with defautCatalog
    
    
@NDX-createCampaignToVerifyShowHistory @initBrowser 
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

@NDX-createCampaignTemplate @initBrowser
Scenario: Create a Campaign Template
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then navigate to campaign template
Then enter the details of campaign template from sheet "CampaignTemplate" and save 





       
        
        
   
    
    