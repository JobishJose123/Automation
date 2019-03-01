#Author: rahul.chandran@flytxt.com
#Keywords Summary : to create campaign for data setup
#DEPENDENCY- Run Feature file Datasetup/Campaign.feature


@NDX-CampaignRegressionCases
Feature: Campaign Regression Cases


  @NDX-campaignEdit
  @initBrowser 
  Scenario: Verify Editing campaign
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with catalog from campaignBc with defautCatalog
    Then verify campaign created from sheet "campaignBC"
    Then edit campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
