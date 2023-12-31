#Author: joel.jose@flytxt.com
#Keywords Summary : generic product class test cases
@NX-approvelworkflow
Feature: approval workflow

#  @NX-6319 @initBrowser @closeBrowser
#  Scenario: Verify by creating new Approval Rule
#    Given login
#    Then navigate to configuration management
#    Then navigate to campaign categories
#    Then create new campaign category from sheet "CampaignCategory"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to configuration
#    Then click approval rules option
#    Then create new approval rule from sheet "approvalRule"
#
#  @NX-6320 @initBrowser @closeBrowser
#  Scenario: Verify by editing the rules displaying in Approval Rules
#    Given login
#    Then navigate to configuration management
#    Then navigate to campaign categories
#    Then create new campaign category from sheet "CampaignCategory"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to configuration
#    Then click approval rules option
#    Then create new approval rule from sheet "approvalRule"
#    Then editApprovalRuleDetailsFromSheet "approvalRule"
#
#  @NX-6321 @initBrowser @closeBrowser
#  Scenario: Verify by deleting new Approval Rule
#    Given login
#    Then navigate to configuration management
#    Then navigate to campaign categories
#    Then create new campaign category from sheet "CampaignCategory"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to configuration
#    Then click approval rules option
#    Then create new approval rule from sheet "approvalRule"
#    Then deleteApprovalRuleDetailsFromSheet "approvalRule"
#    Then pass next scenario based on this step
#    
#     @NX-6322 @initBrowser 
#  Scenario: Verify whether warning message get displayed before deletion of rule
#  Then check previous step and pass this
#  Then deleteApprovalRulecheckFromSheet "approvalRule"
# # confirmation Yes is clicked in previous scenario. will throw exception if no confirmation 
#    
#  @NX-6324 @initBrowser @closeBrowser
#  Scenario: Verify editing and deleting default rule
#    Given login
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to configuration
#    Then click approval rules option
#    Then default ApprovalRule edit and delete

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

  @NX-6353 @initBrowser @closeBrowser
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
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule"
   Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog"
    Then Logout from Neon application
     Then login with selenium user
       Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then approve campaign by selenium user
    Then Logout from Neon application
    Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then Request for bc approval
    Then Logout from Neon application
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then approve Broadcast by selenium user without notification navigation
    Then pass next scenario based on this step
    
    @NX-7592 @initBrowser 
Scenario: Verify Approval Work Flow for all type of One Off BCs
    Then check previous step and pass this
    
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
    Then login with selenium user
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then edit campaign from sheet by approve user "campaignBC" with catalog "defaultCatalog"
    Then approve campaign by selenium user



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
     Then login with selenium user
       Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then approve campaign by selenium user
    Then naigate to "campaignBC" campaign show historyapprove

  @NX-6356 @initBrowser @closeBrowser
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
  Then login with selenium user
       Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
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
    


    
    
    




  @NX-6378 @initBrowser 
  Scenario: Verify clicking the Review button from notification panel
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
    Then login with selenium user
       Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then approve campaign by selenium user
    Then Logout from Neon application
    Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then Request for bc approval
    Then Logout from Neon application
    Then login with selenium user
    Then approve Broadcast by selenium user


  @NX-6385 @initBrowser
  Scenario: Verify by clicking Approve button and approving the BC
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
  Then login with selenium user
       Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then approve campaign by selenium user
    Then Logout from Neon application
    Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then Request for bc approval
    Then Logout from Neon application
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then approve Broadcast by selenium user
    
     
  @NX-6357 @initBrowser @closeBrowser
  Scenario: Verify creation of BC without approval flow but not for campaign
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet broadcastonly "approvalRule"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then Logout from Neon application
   #Then login with selenium user
     #Then click on notification bell
    #Then click on view all notifications
    Then wait for 1 minutes
    #Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    #Then approve campaign by selenium user
    #Then Logout from Neon application
    #Then login
    #Then navigate to precision marketer
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeSMS"
    Then Request for bc approval
    Then Logout from Neon application
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then approve Broadcast by selenium user

  @NX-6363 @initBrowser @closeBrowser
  Scenario: Verify whether status of BC get changed to Waiting for Approval once it is sent for approval
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
    Then verify campaign status waiting for approval from sheet "campaignBC" of file "campaignInputData"
    Then Logout from Neon application
    Then login with selenium user
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then approve campaign by selenium user
    Then Logout from Neon application
    Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeSMS"
    Then Request for bc approval
    Then verify bc status changed to waitinf for approval from sheet "one-offBC" of file "bcInputData" 
    
    

  
  @NX-6335 @initBrowser @closeBrowser
  Scenario: Verify Campaign creation with approval rule flow
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule" with two approvers
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog" with two approvers
    Then Logout from Neon application
    Then wait for 1 minutes
    Then login with selenium user
    Then click on review button
    Then verify approve button displayed
    Then click on approve campaign
    Then Logout from Neon application
    Then wait for 1 minutes
    Then login with user from sheet "user2" of file "workApproval"
    Then click on review button
    Then verify approve and activate button displayed
    Then Logout from Neon application
    
  @NX-6462 @initBrowser
  Scenario: Verify the behaviour by rejecting an approval request by level 2 approver
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
   Then navigate to precision marketer
   Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule" with two approvers
  Then navigate to life cycle marketing
      Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog" with two approvers
    Then Logout from Neon application
    Then login with user from sheet "user1" of file "workApproval" 
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then verify Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click on approve campaign
    Then Logout from Neon application
    Then login with user from sheet "user2" of file "workApproval" 
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then verify Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click on reject button
    Then verify Reject message panel displayed
    Then enter reject message "Rejected"
    Then wait for 1 minutes
Then verify campaign status rejected from sheet "campaignBC" of file "campaignInputData"
    Then Logout from Neon application
    Then login with user from sheet "defaultUser" of file "workApproval" 
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then verify rejected message of campaign from the sheet "campaignBC" of file "campaignInputData"
   	Then pass next scenario based on this step
    
   @NX-6368
   Scenario: Verify whether all the selected Level 1 approvers receives notification of the approval requests
    Then check previous step and pass this
    Then pass next scenario based on this step
   @NX-6382
   Scenario: Verify whether approver is able to specify the reject message in the reject popup
    Then check previous step and pass this
    
   @NX-6364
   Scenario: Verify whether BC notification is send to level 2 approver after atleast 1 approver from level 1 approves it
    Then check previous step and pass this
    Then pass next scenario based on this step
    
   @NX-6381 @initBrowser @closeBrowser
  Scenario: Verify the status of BC when rejected
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
    #Given navigate to environment 
    # Remove it after use
    Then login with user from sheet "user1" of file "workApproval"
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "CampaignCategory" of file "campaignCategoryInputData"
    Then click on approve campaign
    Then Logout from Neon application
    Then login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeSMS"
    Then Request for bc approval
    Then Logout from Neon application
    Then login with user from sheet "user1" of file "workApproval"
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "one-offBC" of file "bcInputData"
    Then click on reject button
    Then verify Reject message panel displayed
    Then enter reject message "BC Rejected"
    Then wait for 1 minutes
    Then verify campaign status rejected from sheet "one-offBC" of file "bcInputData"
    Then pass next scenario based on this step
    
   @NX-6384
   Scenario: Verify whether campaign/BC get rejected if any one of the approver rejects it
    Then check previous step and pass this
    
  @NX-6386 @initBrowser @closeBrowser
  Scenario: Verify whether notification is send to the creator user when BC/campaign is approved
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
    #Given navigate to environment
    Then login with user from sheet "user1" of file "workApproval"
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "CampaignCategory" of file "campaignCategoryInputData"
  	Then click on approve campaign
  	Then Logout from Neon application
  	Then login with user from sheet "defaultUser" of file "workApproval"
  	Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then verify approved message of campaign from the sheet "campaignBC" of file "campaignInputData"
    
  @NX-6387 @initBrowser @closeBrowser
  Scenario: Verify whether BC get activate only after atleast  1 approver from all configured levels approves the BC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet "approvalRule" with two approvers
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet for approval "campaignBC" with catalog "defaultCatalog" with two approvers
    Then Logout from Neon application 
    Then login with selenium user
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then verify review page
    Then click on approve campaign
    Then Logout from Neon application
    Then login with user from sheet "user2" of file "workApproval" 
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click on approve campaign
    Then verify campaign status approved from sheet "campaignBC" of file "campaignInputData"
    Then Logout from Neon application
  	Then login with user from sheet "defaultUser" of file "workApproval"
  	Then navigate to precision marketer
  	Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeSMS"
    Then select the user for bc approval
    Then Logout from Neon application
    #Given navigate to environment 
    Then login with user from sheet "user1" of file "workApproval"
    #Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "one-offBC" of file "bcInputData"
    Then click on approve campaign
   Then Logout from Neon application
    Then login with user from sheet "user2" of file "workApproval" 
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
     Then click Review on notification from the sheet "one-offBC" of file "bcInputData"
    Then click on approve campaign
    Then verify broadcast status render scheduled from sheet "one-offBC" of file "bcInputData"
    
    Then pass next scenario based on this step
    
   @NX-6365
   Scenario: Verify the details displaying in Review page of Campaign 
    Then check previous step and pass this
    
  @NX-6354 @initBrowser @closeBrowser
	Scenario: Verify adding campaign category to one rule & then deleting after sending an approval request for campaign/BC
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
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then delete the campaign of sheet "CampaignCategory" from approval rule of sheet "approvalRule"
    Then Logout from Neon application
    #Given navigate to environment 
    # Remove it after use
    Then login with selenium user
    #Then login with user from sheet "user1" of file "workApproval"
    Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then verify Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click Review on notification from the sheet "campaignBC" of file "campaignInputData"
    Then click on approve campaign
    Then wait for 1 minutes
    Then verify campaign status approved from sheet "campaignBC" of file "campaignInputData"
    
    
  @NX-6388 @initBrowser @closeBrowser
  Scenario: Verify upon approval BC gets moved to Render scheduled
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then click approval rules option
    Then create new approval rule from sheet broadcastonly "approvalRule"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeSMS"
    Then Request for bc approval
    Then Logout from Neon application
    #Given navigate to environment 
    Then login with user from sheet "user1" of file "workApproval"
    #Then wait for 1 minutes
    Then click on notification bell
    Then click on view all notifications
    Then click Review on notification from the sheet "one-offBC" of file "bcInputData"
    Then click on approve campaign
    #Then wait for 1 minutes
    Then verify broadcast status render scheduled from sheet "one-offBC" of file "bcInputData"
    
    
    @NX-6466
    @initBrowser 
    Scenario: Verify whether Show history & Review option is available in context menu
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
     Then login with selenium user
     Then navigate to precision marketer
     Then navigate to life cycle marketing
   Then navigate to campaign category from sheet "CampaignCategory"
   Then verify show history and review options from sheet "campaignBC"
   