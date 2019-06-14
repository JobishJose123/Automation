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
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
        
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
   Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    
    
    
    
    

	
	#	***************BlackoutAlways inventory *****************
	
		@CreateCampaignforblackout @initBrowser 
  Scenario: Verify BC targeting using all types of target conditions with one time BC
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
   Then naigate to "campaignBC" campaign view broadcasts
	
	
	
	
	@BlckoutOneoffbC @initBrowser 
	Scenario: create one off bc with blackout always
	Given login
    Then navigate to precision marketer 
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS" and inventory "BlackoutAlways"
	Then save bc
#    Then save "bcInputData" migration data to spreadsheet from "one-offBC" with string one-off bc BlackoutAlways with condition: digitalPersonaGT15 
    Then add the BC Data to "parallelRunBC" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "BlackoutAlways" with string  oneoff  bc BlackoutAlways with condition: digitalPersonaGT15
    
    @BlckoutSeedOneoffbC @initBrowser 
	Scenario: create Seeding one off bc with blackout always
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoff" with "SeedingSMS" and inventory "BlackoutAlways"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "BlackoutAlways" with string Seeding one off bc BlackoutAlways with condition: digitalPersonaGT15
	
	 @BlckoutrecurringbC @initBrowser 
	Scenario: create recurring bc with blackout always
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" and inventory "BlackoutAlways"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "recurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "BlackoutAlways" with string  recurring bc BlackoutAlways with condition: digitalPersonaGT15
	
	@BlckoutSeedrecurringbC @initBrowser 
	Scenario: create Seeding recurring bc with blackout always
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBC" with "SeedingSMS" and inventory "BlackoutAlways"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "BlackoutAlways" with string recurring bc BlackoutAlways with condition: digitalPersonaGT15
	
#	***************OneperDay inventory *****************

@CreateCampaignoneperday @initBrowser 
  Scenario: Verify BC targeting using all types of target conditions with one time BC
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
   Then naigate to "campaignBC" campaign view broadcasts

 @OneperDayOneoffbC @initBrowser 
	Scenario: create one off bc with OneperDay
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS" and inventory "OneperDay"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "OneperDay" with string oneoff bc OneperDay with condition: digitalPersonaGT15
    
    @OneperDaySeedOneoffbC @initBrowser 
	Scenario: create Seeding one off bc with OneperDay
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoff" with "SeedingSMS" and inventory "OneperDay"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "OneperDay" with string Seeding oneoff bc OneperDay with condition: digitalPersonaGT15
	
	 @OneperDayrecurringbC @initBrowser 
	Scenario: create recurring  bc with OneperDay
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" and inventory "OneperDay"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "recurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "OneperDay" with string  recurring bc OneperDay with condition: digitalPersonaGT15
	
	@OneperDaySeedrecurringbC @initBrowser 
	Scenario: create Seeding recurring bc with OneperDay
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBC" with "SeedingSMS" and inventory "OneperDay"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "OneperDay" with string Seeding recurring bc OneperDay with condition: digitalPersonaGT15
	
	
#	***************Unlimited inventory ******************
	
	@CreateCampaignunlimited @initBrowser 
  Scenario: Verify BC targeting using all types of target conditions with one time BC
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
   Then naigate to "campaignBC" campaign view broadcasts
	
	@UnlimitedOneoffbC @initBrowser 
	Scenario: create one off bc with Unlimited
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS" and inventory "Unlimited"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string oneoff bc Unlimited with condition: digitalPersonaGT15
    
    @UnlimitedSeedOneoffbC @initBrowser 
	Scenario: create Seeding one off bc with Unlimited
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoff" with "SeedingSMS" and inventory "Unlimited"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string Seeding  bc Unlimited with condition: digitalPersonaGT15
	
	 @UnlimitedrecurringbC @initBrowser 
	Scenario: create recurring bc with Unlimited
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" and inventory "Unlimited"
	Then save bc
   	Then add the BC Data to "parallelRunBC" from BCsheet "recurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string recurring bc Unlimited with condition: digitalPersonaGT15
	
	@UnlimitedSeedrecurringbC @initBrowser 
	Scenario: create Seeding recurring bc with Unlimited
	Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBC" with "SeedingSMS" and inventory "Unlimited"
	Then save bc
    Then add the BC Data to "parallelRunBC" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string Seeding recurring bc Unlimited with condition: digitalPersonaGT15
    
#    *************************Broadcast Limit s******************************

@BCwith100Limit @initBrowser
Scenario: Create a bc with Broadcast limit 100
Given login
Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then create bc from sheet "recurrBCDaily" with inventory "Unlimited" 
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "defineLimitFixed" CG "no limit" DNC "none" 
#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "recurrBCDaily" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurrBCDaily" 
	Then save bc 
	Then add the BC Data to "parallelRunBC" from BCsheet "recurrBCDaily" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string defineLimitFixed
	
	
	

    
    
    
    @activateInventoryBCs @initBrowser
     Scenario: Activating the bcs 
	Given login 
	Then navigate to precision marketer 
#    Then activate and verify the broadcast from workbook "parallelRunBC" and sheet "parallelRunBC"
    Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
    
   #   ********************  -    Creating The Reward BCs   - ***************************** 
     
    @Create1 @initBrowser
  Scenario: create campaign bc for reward bcs
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
  
     @createRecurringOneRuleOneRewards @initBrowser
     Scenario: Create a BC with one rule one reward for Unique conversion of a customer give rewards to Rule based
     Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" 
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "rechargeSMS" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "recurrBCDaily" with inventory "Unlimited" 
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "no limit" CG "no limit" DNC "none" 
#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "recurrBCDaily" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurrBCDaily" 
	Then save bc 
    Then add the BC Data to "rewardBcs" from BCsheet "recurrBCDaily" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "Unique conversion of a customer" inventory "Rule-based" with string oneruleonereward
     
 @Create2 @initBrowser
  Scenario: create campaign bc for reward bcs
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts

@createRecurringOneRuleMultiRewards @initBrowser
Scenario: Create a BC with one rule multiple reward for Unique conversion of a customer give rewards to Rule based
     Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "onerulemultiplerewards" with creative type "singlecreative" 
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "rechargeSMS" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "recurrBCDaily" with inventory "Unlimited" 
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "no limit" CG "no limit" DNC "none" 
#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "recurrBCDaily" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurrBCDaily" 
	Then save bc 
    Then add the BC Data to "rewardBcs" from BCsheet "recurrBCDaily" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "Unique conversion of a customer" inventory "Rule-based" with string onerulemultiplerewards
     



@Create3 @initBrowser
  Scenario: create campaign bc for reward bcs
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
  
     @createSeedingOneRuleOneRewards @initBrowser
     Scenario: Create a SeedingBC with one rule one reward for Unique conversion of a customer give rewards to Rule based
     Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "SeedingSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" 
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "SeedingSMS" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "seedingoneoff" with inventory "Unlimited" 
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "no limit" CG "no limit" DNC "none" 
#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "SeedingSMS" for bc from sheet "seedingoneoff" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingoneoff" 
	Then save bc 
    Then add the BC Data to "rewardBcs" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "Unique conversion of a customer" inventory "Rule-based" with string oneruleonereward
     


@Create4 @initBrowser
  Scenario: create campaign bc for reward bcs
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts

@createSeedingOneRuleMultiRewards @initBrowser
Scenario: Create a SeedingBC with one rule multiple reward for Unique conversion of a customer give rewards to Rule based
     Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "SeedingSMS" with product "fullDetails" rewards "onerulemultiplerewards" with creative type "singlecreative" 
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "SeedingSMS" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "seedingoneoff" with inventory "Unlimited" 
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "no limit" CG "no limit" DNC "none" 
#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "SeedingSMS" for bc from sheet "seedingoneoff" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingoneoff" 
	Then save bc 
    Then add the BC Data to "rewardBcs" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "Unique conversion of a customer" inventory "Rule-based" with string onerulemultiplerewards
     
    
    
    
    
    
    
    
    
    
#   *****/************ for edit and copy bcs******************/**
    
    
  
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
  