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

###Create Product class, campaign category, product
@NDX-CreateProductCCBC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
	
	##Create offers wil all channels for verifying BC with all channel and add to a catalog
@NDX-CreateAllOffersForBC9 @initBrowser @closeBrowser
Scenario: Create offers with all channels for creating BC 
	Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
	Then create new offer from sheet "SeedingSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
	Then create new offer from sheet "rechargeWAP" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
	Then create new offer from sheet "rechargeEmail" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
	Then create new offer from sheet "seedingWAPoffer" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
	Then navigate to offer management
	Then Navigate to Offer Catalogue 
	Then Create New Offer Catalogue from sheet "defaultCatalog" 
	Then Add "rechargeSMS" offer to Offer Catalogue 
	Then Add "SeedingSMS" offer to Offer Catalogue
	Then Add "rechargeWAP" offer to Offer Catalogue 
	Then Add "rechargeEmail" offer to Offer Catalogue
	Then Add "seedingWAPoffer" offer to Offer Catalogue	
	Then wait for 4000 milliseconds 
	
	
	
	
	#	***************BlackoutAlways inventory *****************
	
@NDX-CreateCampaignforblackout @initBrowser @closeBrowser
Scenario: Verify BC targeting using all types of target conditions with one time BC 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then wait for 4000 milliseconds 
	
@NDX-BlckoutOneoffbC @initBrowser @closeBrowser
Scenario: create one off bc with blackout always 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS" and inventory "BlackoutAlways" 
	Then save bc 
	Then add the BC Data to "parallelRunBC" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "BlackoutAlways" with string  oneoff  bc BlackoutAlways with condition: digitalPersonaGT15 
	Then wait for 4000 milliseconds 
@BlckoutSeedOneoffbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
@BlckoutrecurringbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
@BlckoutSeedrecurringbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
	#	***************OneperDay inventory *****************
	
@CreateCampaignoneperday @initBrowser @closeBrowser
Scenario: Verify BC targeting using all types of target conditions with one time BC 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then wait for 4000 milliseconds 
@OneperDayOneoffbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 

@OneperDaySeedOneoffbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
@OneperDayrecurringbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
@OneperDaySeedrecurringbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
	
	#	***************Unlimited inventory ******************
	
@CreateCampaignunlimited @initBrowser @closeBrowser
Scenario: Verify BC targeting using all types of target conditions with one time BC 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then wait for 4000 milliseconds 
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
	Then wait for 4000 milliseconds 
@UnlimitedSeedOneoffbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
@UnlimitedrecurringbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 
@UnlimitedSeedrecurringbC @initBrowser @closeBrowser
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
	Then wait for 4000 milliseconds 

	#    *************************Broadcast Limit s******************************
	
	@NDX-CreateCampaignforBCLimit @initBrowser @closeBrowser
Scenario: Verify BC targeting using all types of target conditions with one time BC 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then wait for 4000 milliseconds 
	
@BCwith100Limit @initBrowser @closeBrowser
Scenario: Create a bc with Broadcast limit 100 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "recurrBCDaily" with inventory "Unlimited" and trigger "none"
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "defineLimitFixed100" CG "no limit" DNC "none" 
	#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "recurrBCDaily" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurrBCDaily" 
	Then save bc 
	Then add the BC Data to "parallelRunBC" from BCsheet "recurrBCDaily" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string defineLimitFixed100 
	Then wait for 4000 milliseconds 
	
@BCwith200Limit @initBrowser @closeBrowser
Scenario: Create a bc with Broadcast limit 200 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "seedingoneoff" with inventory "Unlimited" and trigger "none"
	Then enter target tab details target condition customerDemographicsGT25 type "Create" TG "defineLimitFixed200" CG "no limit" DNC "none" 
	#	 filer criteria : Convert all , Rule-based .. give rewards to : All conversions for a customer, Unique conversion of a customer
	Then enter choose offer tab from sheet "SeedingSMS" for bc from sheet "seedingoneoff" with "single creative" track session expires "After" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingoneoff" 
	Then save bc 
	Then add the BC Data to "parallelRunBC" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Unlimited" with string defineLimitFixed200 
	Then wait for 4000 milliseconds 
	
	
	
	

	#************************ BC`s for checking the calculate option**************
	
	
@NDX-CreateCampaignForBCCalculate @initBrowser @closeBrowser
Scenario: Create campaign for checking the calculate option for BCs
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then wait for 4000 milliseconds 
	
@NDX-CreateBCforcalculate @initBrowser @closeBrowser 
Scenario Outline: Verify Creating the <bcSheet> 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "<campaignCategory>" 
	Then naigate to "<campaignBC>" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition <condition> from sheet "<bcSheet>" with "<offerSheet>" 
	Then save bc 
	Then add the BC Data to "<SavedSheet>" from BCsheet "<bcSheet>" campaignname "<campaignBC>" campaign category "<campaignCategory>" offer "<offerSheet>" condition "<condition>" inventory "<inventory>" with string <descripton> 
	Then wait for 4000 milliseconds 
	
	
	Examples: 
		|SavedSheet|bcSheet|campaignBC|campaignCategory|offerSheet|condition|inventory|descripton|
		|CalculateOptionForBC|recurringBC|campaignBC|campaignCategory|rechargeSMS|digitalPersonaGT15|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|one-offBC|campaignBC|campaignCategory|rechargeSMS|customerDemographicsGT25|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|TriggerOneoff|campaignBC|campaignCategory|rechargeSMS|learnedBehaviourGT35|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|TriggerReccurringBC|campaignBC|campaignCategory|rechargeSMS|analyticalScoresGT45|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|seedingoneoff|campaignBC|campaignCategory|SeedingSMS|customerList|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|seedingTriggerableBC|campaignBC|campaignCategory|SeedingSMS|usageMetric|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|seedingRecurringBC|campaignBC|campaignCategory|SeedingSMS|segmentAgeGT40|Unlimited|verify calculate option for bc|
		|CalculateOptionForBC|seedingTriggerableRecurringBC|campaignBC|campaignCategory|SeedingSMS|digitalEngagementGT235|Unlimited|verify calculate option for bc|
		
		#    **************************** To verify conversion and fulfilment BCs*******************
		
		@NDX-CreateCampaigncategoryBC @initBrowser @closeBrowser
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
		
		@CreateConversionAndFulfilmentBCs @initBrowser @closeBrowser 
Scenario Outline: Create all type of bcs with <bcSheet> with <offerSheet> and <condition>, <rewardTypeRule> 
	Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "<offerSheet>" with product "fullDetails" rewards "<rewardTypeRule>" with creative type "<creative>" 
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "<offerSheet>" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "<campaignCategory>" 
	Then create new campaign from sheet "<campaignBC>" with catalog "defaultCatalog" 
	Then naigate to "<campaignBC>" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition <condition> from sheet "<bcSheet>" with "<offerSheet>" 
	Then save bc 
	Then add the BC Data to "<SavedSheet>" from BCsheet "<bcSheet>" campaignname "<campaignBC>" campaign category "<campaignCategory>" offer "<offerSheet>" condition "<condition>" inventory "<creative>" with string <rewardTypeRule> 
	Then wait for 4000 milliseconds 
	
	Examples: 
		|SavedSheet|bcSheet|campaignBC|campaignCategory|offerSheet|condition|creative|rewardTypeRule|
#		|rewardBcs|recurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup10|singlecreative|onerulemultiplerewards|
#		|rewardBcs|one-offBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup20|singlecreative|onerulemultiplerewards|
#		|rewardBcs|TriggerOneoff|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup30|singlecreative|onerulemultiplerewards|
#		|rewardBcs|TriggerReccurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup40|singlecreative|onerulemultiplerewards|
#		|rewardBcs|seedingoneoff|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup50|singlecreative|onerulemultiplerewards|
#		|rewardBcs|seedingTriggerableBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup60|singlecreative|onerulemultiplerewards|
#		|rewardBcs|seedingRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup70|singlecreative|onerulemultiplerewards|
#		|rewardBcs|seedingTriggerableRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup80|singlecreative|onerulemultiplerewards|
		|rewardBcs|recurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup10|singlecreative|oneruleonereward|
		|rewardBcs|one-offBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup20|singlecreative|oneruleonereward|
		|rewardBcs|seedingoneoff|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup50|singlecreative|oneruleonereward|
		|rewardBcs|seedingRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup70|singlecreative|oneruleonereward|
		|rewardBcs|TriggerOneoff|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup30|singlecreative|oneruleonereward|
		|rewardBcs|TriggerReccurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup40|singlecreative|oneruleonereward|
		|rewardBcs|seedingTriggerableBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup60|singlecreative|oneruleonereward|
		|rewardBcs|seedingTriggerableRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup80|singlecreative|oneruleonereward|
		
		
		
			@NDX-CreateCampaigncategoryBC3 @initBrowser @closeBrowser
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
	Then Navigate to Offer Catalogue 
	Then Create New Offer Catalogue from sheet "defaultCatalog"
		
		@CreateUsageConversionAndFulfilmentBCs @initBrowser @closeBrowser 
Scenario Outline: Create all type of bcs with <bcSheet> with <offerSheet> and <condition>, <rewardTypeRule> 
	Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "<offerSheet>" with product "fullDetails" rewards "<rewardTypeRule>" with creative type "singlecreative" and track Source "Usage Metric"
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "<offerSheet>" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "<campaignCategory>" 
	Then create new campaign from sheet "<campaignBC>" with catalog "defaultCatalog" 
	Then naigate to "<campaignBC>" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition <condition> from sheet "<bcSheet>" with "<offerSheet>" 
	Then save bc 
	Then add the BC Data to "<SavedSheet>" from BCsheet "<bcSheet>" campaignname "<campaignBC>" campaign category "<campaignCategory>" offer "<offerSheet>" condition "<condition>" inventory "<creative>" with string <rewardTypeRule> 
	Then wait for 4000 milliseconds 
	
	Examples: 
		|SavedSheet|bcSheet|campaignBC|campaignCategory|offerSheet|condition|creative|rewardTypeRule|
		|UsageBasedConversion|recurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup10|singlecreative|oneruleonereward|
		|UsageBasedConversion|one-offBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup20|singlecreative|oneruleonereward|
		|UsageBasedConversion|seedingoneoff|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup50|singlecreative|oneruleonereward|
		|UsageBasedConversion|seedingRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup70|singlecreative|oneruleonereward|
		|UsageBasedConversion|TriggerOneoff|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup30|singlecreative|oneruleonereward|
		|UsageBasedConversion|TriggerReccurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup40|singlecreative|oneruleonereward|
		|UsageBasedConversion|seedingTriggerableBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup60|singlecreative|oneruleonereward|
		|UsageBasedConversion|seedingTriggerableRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup80|singlecreative|oneruleonereward|
		
@NDX-CreateCampaigncategoryBCCG @initBrowser @closeBrowser
Scenario: Verify BC targeting using all types of target conditions with one time BC 
	Given login 
	Then navigate to configuration management 
	Then naviagte to product classes 
	Then create product class and number attribute from "TestProductClass" 
	Then navigate to landing page
	Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
	Then navigate to landing page 
	Then navigate to configuration management 
	Then navigate to campaign categories 
	Then create new campaign category from sheet "CampaignCategory" 
	Then navigate to landing page
	Then navigate to precision marketer
	Then navigate to offer management
	Then Navigate to Offer Catalogue 
	Then Create New Offer Catalogue from sheet "defaultCatalog"
		Then wait for 4000 milliseconds 
		
		@CreateUsageConversionAndFulfilmentBCCG @initBrowser @closeBrowser 
Scenario Outline: Create all type of bcs with <bcSheet> with <offerSheet> and <condition>, <rewardTypeRule> 
	Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "<offerSheet>" with product "fullDetails" rewards "<rewardTypeRule>" with creative type "singlecreative" and track Source "Usage Metric" 
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "<offerSheet>" Offer Catalogue from sheet "defaultCatalog"
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "<campaignCategory>" 
	Then create new campaign from sheet "<campaignBC>" with catalog "defaultCatalog" 
	Then naigate to "<campaignBC>" campaign view broadcasts 
	Then click create new broadcast button 
	Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "<Trigger>" 
	Then enter target tab details target condition <condition> type "Create" TG "no limit" CG "fixedPercentage" DNC "none" 
	Then enter choose offer tab from sheet "<offerSheet>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "Rule-based" give reward to "Unique conversion of a customer" 
	Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "none" from sheet "<bcSheet>" 
	Then save bc 
	Then add the BC Data to "<SavedSheet>" from BCsheet "<bcSheet>" campaignname "<campaignBC>" campaign category "<campaignCategory>" offer "<offerSheet>" condition "<condition>" inventory "<creative>" with string <rewardTypeRule> 
	Then wait for 4000 milliseconds 
	
	Examples: 
		|SavedSheet|bcSheet|campaignBC|campaignCategory|offerSheet|condition|creative|rewardTypeRule|Trigger|
		|UsageBasedConversion|recurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup10|singlecreative|oneruleonereward|none|
		|UsageBasedConversion|one-offBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup20|singlecreative|oneruleonereward|none|
		|UsageBasedConversion|seedingoneoff|campaignBC|CampaignCategory|SeedingSMS|analyticalScoresGT45|singlecreative|oneruleonereward|none|
		|UsageBasedConversion|seedingRecurringBC|campaignBC|CampaignCategory|SeedingSMS|digitalPersonaGT15|singlecreative|oneruleonereward|none|
		|UsageBasedConversion|TriggerOneoff|campaignBC|CampaignCategory|rechargeSMS|analyticalScoresGT45|singlecreative|oneruleonereward|SeleniumTrigger|
		|UsageBasedConversion|TriggerReccurringBC|campaignBC|CampaignCategory|rechargeSMS|analyticalScoresGT45|singlecreative|oneruleonereward|SeleniumTrigger|
		|UsageBasedConversion|seedingTriggerableBC|campaignBC|CampaignCategory|SeedingSMS|analyticalScoresGT45|singlecreative|oneruleonereward|SeleniumTrigger|
		|UsageBasedConversion|seedingTriggerableRecurringBC|campaignBC|CampaignCategory|SeedingSMS|digitalPersonaGT15|singlecreative|oneruleonereward|SeleniumTrigger|
		
		
	@NDX-CreateCampaigncategoryBC4 @initBrowser @closeBrowser
Scenario: Verify BC targeting using all types of target conditions with one time BC Keywordbased
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
	Then Navigate to Offer Catalogue 
	Then Create New Offer Catalogue from sheet "defaultCatalog"	
		
		@NDX-CreateBCforkeywordbaseconversion @initBrowser @closeBrowser 
Scenario Outline: Verify Creating the <bcSheet> Keywordbased

	Given login 
	When navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then create new offer from sheet "<offerSheet>" with product "fullDetails" rewards "<rewardTypeRule>" with creative type "singlecreative" and track Source "Global Response App"
	Then navigate to offer management 
	Then Navigate to Offer Catalogue 
	Then adding existing offers from sheet "<offerSheet>" Offer Catalogue from sheet "defaultCatalog" 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "<campaignCategory>" 
	Then create new campaign from sheet "<campaignBC>" with catalog "defaultCatalog" 
	Then naigate to "<campaignBC>" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition <condition> from sheet "<bcSheet>" with "<offerSheet>" 
	Then save bc 
	Then add the BC Data to "<SavedSheet>" from BCsheet "<bcSheet>" campaignname "<campaignBC>" campaign category "<campaignCategory>" offer "<offerSheet>" condition "<condition>" inventory "<inventory>" with string <descripton> 
	Then wait for 4000 milliseconds 
	
	
	Examples: 
		|SavedSheet|bcSheet|campaignBC|campaignCategory|offerSheet|condition|inventory|descripton|
		|keywordbasedconversion|recurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup10|singlecreative|oneruleonereward|
		|keywordbasedconversion|one-offBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup20|singlecreative|oneruleonereward|
		|keywordbasedconversion|seedingoneoff|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup50|singlecreative|oneruleonereward|
		|keywordbasedconversion|seedingRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup70|singlecreative|oneruleonereward|
		|keywordbasedconversion|TriggerOneoff|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup30|singlecreative|oneruleonereward|
		|keywordbasedconversion|TriggerReccurringBC|campaignBC|CampaignCategory|rechargeSMS|ageTargetGroup40|singlecreative|oneruleonereward|
		|keywordbasedconversion|seedingTriggerableBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup60|singlecreative|oneruleonereward|
		|keywordbasedconversion|seedingTriggerableRecurringBC|campaignBC|CampaignCategory|SeedingSMS|ageTargetGroup80|singlecreative|oneruleonereward|
		
		
		
#********************************* Create bcs for export as PDF***********

@NDX-CreateCampaignForBCExportaspdf @initBrowser @closeBrowser
Scenario: Create campaign for checking the calculate option for BCs
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then wait for 4000 milliseconds 
	
@NDX-CreateBCforExportAsPDF @initBrowser @closeBrowser 
Scenario Outline: Verify Creating the <bcSheet> 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "<campaignCategory>" 
	Then naigate to "<campaignBC>" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition <condition> from sheet "<bcSheet>" with "<offerSheet>" 
	Then save bc 
	Then add the BC Data to "<SavedSheet>" from BCsheet "<bcSheet>" campaignname "<campaignBC>" campaign category "<campaignCategory>" offer "<offerSheet>" condition "<condition>" inventory "<inventory>" with string <descripton> 
	Then wait for 4000 milliseconds 

		Examples: 
		|SavedSheet|bcSheet|campaignBC|campaignCategory|offerSheet|condition|inventory|descripton|
		|exportAsPDF|recurringBC|campaignBC|campaignCategory|rechargeSMS|digitalPersonaGT15|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|one-offBC|campaignBC|campaignCategory|rechargeSMS|customerDemographicsGT25|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|TriggerOneoff|campaignBC|campaignCategory|rechargeSMS|learnedBehaviourGT35|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|TriggerReccurringBC|campaignBC|campaignCategory|rechargeSMS|analyticalScoresGT45|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|seedingoneoff|campaignBC|campaignCategory|SeedingSMS|customerList|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|seedingTriggerableBC|campaignBC|campaignCategory|SeedingSMS|usageMetric|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|seedingRecurringBC|campaignBC|campaignCategory|SeedingSMS|segmentAgeGT40|Unlimited|Enjoy the offer with 25 extar TT|
		|exportAsPDF|seedingTriggerableRecurringBC|campaignBC|campaignCategory|SeedingSMS|digitalEngagementGT235|Unlimited|Enjoy the offer with 25 extar TT|
		
		
		
				

	
					#   *****/************ for edit and copy bcs******************/**
	
	
	
	##Create a campaign categoryScenario: Verify BC targeting using all types of target conditions with one time BC
@NDX-CreateCampaignForBC @initBrowser @closeBrowser 
Scenario: Create offers with all channels for creating BC 
	Given login 
	Then navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "CampaignCategory" 
	Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog" 
	Then wait for 4000 milliseconds 
	
@NDX-CreateOneoffBC @NDX-9913 @initBrowser @closeBrowser 
Scenario: Verify Creating the oneoff Bc 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
@NDX-CreateTriggerOneoffBC @NDX-9915 @initBrowser @closeBrowser 
Scenario: Verify Creating the Trigger oneoff Bc 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "TriggerOneoff" with "rechargeSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "TriggerOneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
@NDX-CreateSeedingOneoffBC @NDX-9917 @initBrowser @closeBrowser 
Scenario: Verify Creating the seeding oneoff Bc 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoff" with "SeedingSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
@NDX-CreateseedingTriggerableBC @NDX-9919 @initBrowser @closeBrowser 
Scenario: Verify Creating the seedingTriggerableBC 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingTriggerableBC" with "SeedingSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "seedingTriggerableBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
@NDX-CreateSeedingrecurringBC @NDX-9918 @initBrowser @closeBrowser 
Scenario: Verify Creating the seedingRecurringBC Bc 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBC" with "SeedingSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
	
@NDX-CreateseedingTriggerableRecurringBC @NDX-9920 @initBrowser 
@closeBrowser 
Scenario: Verify Creating the seedingTriggerableRecurringBC 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingTriggerableRecurringBC" with "SeedingSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "seedingTriggerableRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
@NDX-CreateTriggerReccurringBC @NDX-9916 @initBrowser @closeBrowser 
Scenario: Verify Creating the TriggerReccurringBC 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "TriggerReccurringBC" with "rechargeSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "TriggerReccurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
@NDX-CreaterecurringBC @NDX-9914 @initBrowser @closeBrowser 
Scenario: Verify Creating the recurringBC 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" 
	Then save bc 
	Then add the BC Data to "CopyEdit" from BCsheet "recurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "digitalPersonaGT15" inventory "Rule-based" with string oneruleonereward 
	Then wait for 4000 milliseconds 
	
	
#	=================================CREATION OF BC FOR PAUSE AND ABORT===============================================#
	
	
@NDX-CreateOneoffBCForPause @initBrowser @closeBrowser 
Scenario: Verify Creating the oneoff Bc to verify the functioning of Pause 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBCForPause" with "rechargeSMS" 
	Then save bc 
	Then wait for 4000 milliseconds 
	
	
	
@NDX-CreateBCsForPauseAndAbort @initBrowser @closeBrowser 
Scenario Outline: Verify Creating the recurringBC to verify the functioning of Pause 

	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "<bcSheet>" with "<offerSheet>" 
	Then wait for 4000 milliseconds
	Then save bc 
	Then wait for 4000 milliseconds 
	Then add bc from sheet "<bcSheet>" to column "<row>" of bc data sheet "BCForPauseAbort"
	
	Examples:
	|bcSheet|offerSheet|row|
##	|one-offBCForPause|rechargeSMS|1|
#	|recurringBCForPause|rechargeSMS|2|
#	|seedingRecurringBCForPause|SeedingWAPOffer|3|
#	|seedingoneoffForPause|seedingWAPoffer|4|
#	|TriggerOneoff|rechargeSMS|5|
	|TriggerOneoff|seedingWAPoffer|6|
	|TriggerReccurringBC|seedingWAPoffer|7|
	|TriggerReccurringBC|rechargeSMS|8|
	|one-offBCForAbort|rechargeWAP|9|
	|recurringBCForAbort|rechargeWAP|10|
	|seedingRecurringBCForAbort|seedingWAPoffer|11|
	|seedingoneoffForAbort|seedingWAPoffer|12|
	|TriggerOneoff|rechargeSMS|13|
	|TriggerOneoff|seedingWAPoffer|14|
	|TriggerReccurringBC|seedingWAPoffer|15|
	|TriggerReccurringBC|rechargeSMS|16|
	
	
	
	
