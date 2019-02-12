#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionality
Feature: For broadcast functionality check

##Create Product class, campaign category, product
@NDX-CreateDataForBC @initBrowser @closeBrowser
  Scenario: Verify BC targeting using all types of target conditions with one time BC
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"


##Create offers wil all channels for verifying BC with all channel and add to a catalog
@NDX-CreateAllOffersForBC @initBrowser 
 Scenario: Create offers with all channels for creating BC
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then create new offer from sheet "rechargeVoicePush" with product "fullDetails"
    
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then create new offer from sheet "seedingEmail" with product "fullDetails"
    Then create new offer from sheet "seedingVoicePush" with product "fullDetails"
    
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then Add "rechargeEmail" offer to Offer Catalogue
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "rechargeVoicePush" offer to Offer Catalogue
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then Add "seedingEmail" offer to Offer Catalogue
    Then Add "seedingVoicePush" offer to Offer Catalogue

	#creating capaign category and and campaign for all bc functionality scenarios with this scenario
  @NDX-7015 @initBrowser @closeBrowser
  Scenario: Verify BC targeting using all types of target conditions with one time BC
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition allTargetConditions10 from sheet "one-offBothExclution" with "rechargeSMS"
    Then activate bc
    Then add bc data to "parallelRunBC" from "one-offBothExclution" with condition "allTargetConditions10"
  @NDX-7019 @initBrowser @closeBrowser
  Scenario: Verify partner level and broadcast level exclusion with one time BC
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
		Then click create new broadcast button
		Then enter details for new broadcast with condition allTargetConditions20 from sheet "one-offBothExclution" with "rechargeSMS"
		Then activate bc
		
		
		