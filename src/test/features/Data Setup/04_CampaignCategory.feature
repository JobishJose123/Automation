#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@CampaignCategory_datasetup
Feature: Campaign Category creation
  Create Campaign Category
  
@NX_CreateCampaignCategory
@initBrowser 
Scenario: create new campaign category 
Given login
Then navigate to configuration management
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
  

  