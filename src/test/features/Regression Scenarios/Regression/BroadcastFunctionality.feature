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

	#creating campaign category and and campaign for all bc functionality scenarios with this scenario
#  @CreateCampaign @initBrowser 
#  Scenario: Verify BC targeting using all types of target conditions with one time BC
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#   Then naigate to "campaignBC" campaign view broadcasts
   
   
#@NDX-7015 @initBrowser 
#  Scenario: Verify BC targeting using all types of target conditions with one time BC
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts   
#    Then click create new broadcast button
#    Then enter details for new broadcast with condition allTargetConditions10 from sheet "one-offBothExclution" with "rechargeSMS"
#    Then activate bc
##    Then add bc data to "parallelRunBC" from "one-offBothExclution" with condition "allTargetConditions10"
#  
#  @NDX-7019 @initBrowser @closeBrowser
#  Scenario: Verify partner level and broadcast level exclusion with one time BC
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#	Then enter details for new broadcast with condition allTargetConditions20 from sheet "one-offBothExclution" with "rechargeSMS"
#	Then activate bc
	
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
#    Then navigate to offer management
#    Then navigate to offers
#    Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative"
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then click on 
#    Then Add "rechargeEmail" offer to Offer Catalogue    
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
#    Then verify the Acknowledgement event from Sheet "parallelRunBC" and inventory "Unlimited"
	

	@verifyBConversion @initBrowser
Scenario: verify bc conversion 
	Given login 
#	Then navigate to configuration management 
#	Then navigate to campaign categories 
#	Then create new campaign category from sheet "campaignCategory" 
#	Then navigate to landing page 
	Then navigate to precision marketer 
#	Then navigate to offer management 
#	Then navigate to offers 
#	Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" 
#	Then navigate to offer management 
#	Then Navigate to Offer Catalogue 
#	Then Create New Offer Catalogue from sheet "defaultCatalog" 
#	Then Add "rechargeSMS" offer to Offer Catalogue 
#	Then navigate to life cycle marketing 
#	Then navigate to campaign category from sheet "campaignCategory" 
#	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
#	Then naigate to "campaignBC" campaign view broadcasts 
#	Then click create new broadcast button 
#	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS"
#    Then activate bc
#    Then wait until status of "one-offBC" is "Completed"
    Then provide file for conversion
#    Then "Activate" the conversion job name "conversionJobBySelenium"
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "919491750002"
#    Then click on events tab
#    Then wait for comversion event
#    Then remove file for conversion
#    Then wait for reward in consumer profile
    Then activate and verify the boadcats from workbook "parallelRunBC" and sheet "parallelRunBC"
    
    
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
    
    
     
     
     
     
     
     
     
     
     


