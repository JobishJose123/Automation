#Author: joel.jose@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NX-registrationList
Feature: positive flow of list upload and verification in cuctomer info BC Creation

@NX-3482
@initBrowser 
Scenario: Calculate Targets - Creating DNC Exclusion list. 3482
Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast and select any DNC exclusion list from sheet "one-offBC" with "rechargeWAP"
    Then save bc