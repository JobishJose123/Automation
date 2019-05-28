#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionality
Feature: For broadcast functionality check

#Create Product class, campaign category, product
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
@NDX-CreateAllOffersForBC1 @initBrowser 
 Scenario: Create offers with all channels for creating BC
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
#    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
#    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
#    Then create new offer from sheet "rechargeVoicePush" with product "fullDetails"
    
#    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
#    Then create new offer from sheet "seedingEmail" with product "fullDetails"
#    Then create new offer from sheet "seedingVoicePush" with product "fullDetails"
#    
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeWAP" offer to Offer Catalogue
#   Then Add "rechargeEmail" offer to Offer Catalogue
    Then Add "rechargeSMS" offer to Offer Catalogue
#    Then Add "rechargeVoicePush" offer to Offer Catalogue
#    Then Add "seedingWAPoffer" offer to Offer Catalogue
   Then Add "SeedingSMS" offer to Offer Catalogue
#    Then Add "seedingEmail" offer to Offer Catalogue
#    Then Add "seedingVoicePush" offer to Offer Catalogue

	   
   


	
	@CreateCampaignforblackout @initBrowser 
  Scenario: Verify BC targeting using all types of target conditions with one time BC
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
   Then naigate to "campaignBC" campaign view broadcasts
	
	
	#	***************BlackoutAlways inventory *****************
	
	
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
    
    
    
#    @ActivateBC @initBrowser 
#	Scenario: Activating the BCs 
#	Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then Activate the BCs from sheet "parallelRunBC"
#    
#    @verifyingBCsBlackout @initBrowser 
#    Scenario: verify the activated Blackout BCs
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then verify the activated Bcs from Sheet "parallelRunBC" and inventory "BlackoutAlways" with condition "digitalPersonaGT15"
#    
#    @verifyingBCsOneperDay @initBrowser 
#    Scenario: verify the activated OneperDay BCs
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then verify the activated Bcs from Sheet "parallelRunBC" and inventory "OneperDay" with condition "digitalPersonaGT15"
#    
    
    
#    @verifyingBCsUnlimited @initBrowser 
#    Scenario: verify the activated Unlimited BCs
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then verify the activated Bcs from Sheet "parallelRunBC" and inventory "Unlimited" with condition "digitalPersonaGT15"
   
    
#    @verifyingBCsAckEvent @initBrowser 
#    Scenario: verify the activated Unlimited BCs
#    Given login
#    Then navigate to precision marketer
#Then verify the Acknowledgement event from Sheet "parallelRunBC" and inventory "Unlimited"
	

	@verifyBConversion @initBrowser
Scenario: Activating the bcs 
	Given login 
	Then navigate to precision marketer 
    Then activate and verify the broadcast from workbook "parallelRunBC" and sheet "parallelRunBC"

    
    
    
#    ********************** Verifying The INVENTORY    ********************
    
    @NDX-9000 @initBrowser
    Scenario: Verify Black out Rule and frequency limit by creating 4 types of BCs with Black out Always-NEW
    Given login
    Then navigate to precision marketer
    Then verify the inventory "BlackoutAlways" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
    
    @NDX-9002 @initBrowser
    Scenario: Verify OneperDay and frequency limit by creating 4 types of BCs with OneperDay-NEW
    Given login
    Then navigate to precision marketer
    Then verify the inventory "OneperDay" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
    
    @NDX-8998 @initBrowser
    Scenario: Verify Unlimited and frequency limit by creating 4 types of BCs with Unlimited-NEW
    Given login
    Then navigate to precision marketer
    Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
    
    
#   ********************  -    Creating The Reward BCs   - ***************************** 
     
    @CreateCampaignsingleReward @initBrowser
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
     
 @CreateCampaignsingleReward1 @initBrowser
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
     







@ActivateCreatedBCs @initBrowser
Scenario: verify bc conversion 
Given login 
Then navigate to precision marketer 
#Then activate and raise the conversion job the broadcast from workbook "parallelRunBC" and sheet "rewardBcs"
#Then verify the acknowledgement of Bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009"
#Then verify the Conversion event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009"
Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009"


