#Author: joel.jose@flytxt.com
#Keywords Summary : checking postive flow of bc creation


Feature: positive flow of list upload and verification in cuctomer info

	BC Creation
	
@NX-createListAndProfileField
@initBrowser
Scenario: generate randrom registration list and upload
Given random registration list is generated
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of registration list
Then save registration list
Then navigate to landing page
Then navigate to data foundation
Then check and add profile fields
#Then upload list
#Given login
#Then navigate to precision marketer
#Then check the upoaded list in ui

@NX-createList
@initBrowser
Scenario: create registration list in dx ui
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of registration list
Then save registration list
Then navigate to landing page

@NX-3482
@initBrowser @closeBrowser
Scenario: Calculate Targets - Creating DNC Exclusion list. 3482
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of DND list
Then save registration list
Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast and select any DNC exclusion list from sheet "one-offBC" with "rechargeWAP"