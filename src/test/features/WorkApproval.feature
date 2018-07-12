#Author: joel.jose@flytxt.com
#Keywords Summary : generic product class test cases
@NX-ProductClass
Feature: generic product class

  @NX-6319 @initBrowser
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

  @NX-6320 @initBrowser
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

  @NX-6321 @initBrowser
  Scenario: Verify by deleting new Approval Rule
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
    Then deleteApprovalRuleDetailsFromSheet "approvalRule"

  @NX-6324 @initBrowser
  Scenario: Verify editing and deleting default rule
    Given login
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then default ApprovalRule edit and delete

  @NX-6322 @initBrowser
  Scenario: Verify whether warning message get displayed before deletion of rule
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
    Then deleteApprovalRulecheckFromSheet "approvalRule"

  @NX-6333 @initBrowser
  Scenario: Verify selecting the Approval Required for Campaign and BC activation checkbox
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
    Then check the Approval campaign and BC activation checkbox "approvalRule"

  @NX-6353 @initBrowser
  Scenario: Verify adding Campaign category to multiple rule
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
    Then create new approval multiple rule from sheet "approvalRule"

  @NX-6480 @initBrowser
  Scenario: Verify approving campaign/BC by navigating through BC page
    Given login
    #	Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #
    #Then navigate to landing page
    #		Then navigate to precision marketer
    #		Then navigate to configuration
    #		Then click approval rules option
    #		Then create new approval rule from sheet "approvalRule"
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    #Then Logout from Neon application
    #	Then login with seleniumuser from sheet "seleniumuser"
    #Then approve campaign by selenium user
    #Then Logout from Neon application
    #Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then Request for bc approval
    Then Logout from Neon application
    Then login with seleniumuser from sheet "seleniumuser"
    Then approve Broadcast by selenium user

  @NX-6389 @initBrowser
  Scenario: Verify whether approver can edit campaign/BC on clicking edit option from Review page
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    Then Logout from Neon application
    Then login with seleniumuser from sheet "seleniumuser"
    Then edit campaign by selenium user
    Then edit campaign from sheet by approve user "campaignBC" with catalog "defaultCatalog"

  @NX-6467 @initBrowser
  Scenario: Verify creation of BC without approval flow but for campaign
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign show history
    Then Logout from Neon application
    Then login with seleniumuser from sheet "seleniumuser"
    Then approve campaign by selenium user
    Then naigate to "campaignBC" campaign show historyapprove
@NX-6467 @initBrowser
  Scenario: Verify the details displaying while clicked on Show history
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign show history
    Then Logout from Neon application
    Then login with seleniumuser from sheet "seleniumuser"
    Then approve campaign by selenium user
    Then naigate to "campaignBC" campaign show historyapprove
  @NX-6356 @initBrowser
  Scenario: Verify the details displaying while clicked on Show history
    #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to configuration
    #Then click approval rules option
    #Then create new approval rule from sheet campaignonly "approvalRule"
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    #Then Logout from Neon application
    #Then login with seleniumuser from sheet "seleniumuser"
    #Then approve campaign by selenium user
    #Then Logout from Neon application
    #Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
  @NX-6356 @initBrowser
  Scenario: Verify creation of BC without approval flow but for campaign
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet campaignonly "approvalRule"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    Then Logout from Neon application
    Then login with seleniumuser from sheet "seleniumuser"
    Then approve campaign by selenium user
    Then Logout from Neon application
    Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
