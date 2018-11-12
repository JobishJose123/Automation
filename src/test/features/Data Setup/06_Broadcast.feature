#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.


@Broadcast_datasetup
Feature: Create all types of Broadcast
  Create BC
  
@NX-2050 
@initBrowser
Scenario: Create New Broadcast: Verify the Creation and Activation of One Off Broadcast
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
Then activate bc
  