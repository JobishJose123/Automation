#Author: joel.jose@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NXCampaign
Feature: campaign management

  #########################recurring bc
  @NX-1777 @initBrowser
  Scenario: create a campaign
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    @NX-1560 @initBrowser
  Scenario: Create Campaign: Verify adding the campaign with duplicate name- 1560
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then create duplicate campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    @NX-1506 @initBrowser
  Scenario: CLV Max: Create new campaign template :- Verify the name and created by of the Campaign template- 1510
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
    
    @NX-1506 @initBrowser
  Scenario: CLV Max: Create new campaign template :- Verify the name and created by of the Campaign template- 1510
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
