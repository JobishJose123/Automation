#Author: joel.jose@flytxt.com
#Keywords Summary : generic product class test cases
@NX-ProductClass
Feature: generic product class

@NX-6319
@initBrowser
Scenario: Verify by creating new Approval Rule
Given login
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then navigate to landing page
		Then navigate to precision marketer
		Then navigate to configuration
		Then click approval rules option
		Then create new approval rule from sheet "approvalRule"
		
@NX-6320
@initBrowser
Scenario: Verify by editing the rules displaying in Approval Rules
Given login
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then navigate to landing page
		Then navigate to precision marketer
		Then navigate to configuration
		Then click approval rules option
		Then create new approval rule from sheet "approvalRule"
		Then editApprovalRuleDetailsFromSheet "approvalRule"