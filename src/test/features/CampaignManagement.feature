#Author: joel.jose@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NXCampaign
Feature: campaign management

  #########################recurring bc
  @NX-CampaignCreation @initBrowser
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
