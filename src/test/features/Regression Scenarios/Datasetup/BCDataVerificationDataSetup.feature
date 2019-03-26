 #Author: mallikharjuna.ankem@flytxt.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@BCVerificationDataSetup
Feature: Data set up for edit and copy BCs
  
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
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
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
  
##Create a campaign categoryScenario: Verify BC targeting using all types of target conditions with one time BC
 @NDX-CreateCampaignForBC @initBrowser 
 Scenario: Create offers with all channels for creating BC
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    
     @NDX-CreateOneoffBC  @initBrowser 
  Scenario: Verify Creating the oneoff Bc
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    
     @NDX-CreateTriggerOneoffBC  @initBrowser
  Scenario: Verify Creating the Trigger oneoff Bc
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "TriggerOneoff" with "rechargeSMS"
    Then save bc
    
     @NDX-CreateSeedingOneoffBC  @initBrowser 
  Scenario: Verify Creating the seeding oneoff Bc
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoff" with "SeedingSMS"
    Then save bc
    
     @NDX-CreateseedingTriggerableBC  @initBrowser 
  Scenario: Verify Creating the seedingTriggerableBC
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then save bc
    
     @NDX-CreateSeedingrecurringBC  @initBrowser 
  Scenario: Verify Creating the seedingRecurringBC Bc
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBC" with "SeedingSMS"
    Then save bc
    
    
     @NDX-CreateseedingTriggerableRecurringBC  @initBrowser 
  Scenario: Verify Creating the seedingTriggerableRecurringBC
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then save bc
    
     @NDX-CreateTriggerReccurringBC  @initBrowser 
  Scenario: Verify Creating the TriggerReccurringBC
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then save bc
    
     @NDX-CreaterecurringBC  @initBrowser 
  Scenario: Verify Creating the recurringBC
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS"
    Then save bc
    
      
      @NDX-CreateOneoffBCForPause  @initBrowser 
  Scenario: Verify Creating the oneoff Bc to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBCForPause" with "rechargeSMS"
    Then save bc
    
    
    
      @NDX-CreaterecurringBCForPause  @initBrowser 
  Scenario: Verify Creating the recurringBC to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBCForPause" with "rechargeSMS"
    Then save bc
    
    
    
    
        @NDX-CreateSeedingrecurringBCForPause  @initBrowser 
  Scenario: Verify Creating the seedingRecurringBC Bc to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBCForPause" with "SeedingWAPOffer"
    Then save bc
    
    
      @NDX-CreateSeedingOneoffBCForPause  @initBrowser 
  Scenario: Verify Creating the seeding oneoff Bc to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoffForPause" with "seedingWAPoffer"
    Then save bc
    
     
      @NDX-CreateOneoffBCForAbort  @initBrowser 
  Scenario: Verify Creating the oneoff Bc to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBCForAbort" with "rechargeWAP"
    Then save bc
    
    
    
      @NDX-CreaterecurringBCForAbort  @initBrowser 
  Scenario: Verify Creating the recurringBC to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBCForAbort" with "rechargeWAP"
    Then save bc
    
    
    
    
        @NDX-CreateSeedingrecurringBCForAbort  @initBrowser 
  Scenario: Verify Creating the seedingRecurringBC Bc to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBCForAbort" with "SeedingWAPOffer"
    Then save bc
    
    
      @NDX-CreateSeedingOneoffBCForAbort  @initBrowser 
  Scenario: Verify Creating the seeding oneoff Bc to verify the functioning of Pause
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoffForAbort" with "seedingWAPoffer"
    Then save bc
  