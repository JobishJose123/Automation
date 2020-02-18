#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature
@AllBCCreation_datasetup
Feature: Test suite for Broadcast creation
  Create all types of Braodcast
  

 
#  @NDX-oneOffBcForDataSetup @NDX-4887
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating one-off BC with given <Condition>
#    Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#    Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "rechargeSMS"
#    Then save bc
#    Then save "bcInputData" data to spreadsheet from "one-offBC" with string one-off bc with condition: <Condition>
#      
#     Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#      @NX-createCampaignForRecurringBcs
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for recurring BC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#     @NDX-recurringBcForDataSetup @NDX-4894
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating recurring BC with <Condition>
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#    Then enter details for new broadcast with condition <Condition> from sheet "recurringBC" with "rechargeSMS"
#      Then save bc
#       Then save "bcInputData" data to spreadsheet from "recurringBC" with string recurring bc with condition: <Condition>
#      
#        Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#    
#     @NX-createCampaignForseedingTriggerableBC
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for Seeding Trigger BC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#  @NDX-seedingTriggerBcForDataSetup @NDX-4891
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating Seeding Trigger BC
#  Given login
#   When navigate to precision marketer     
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#     Then enter details for new broadcast with condition <Condition> from sheet "seedingTriggerableBC" with "SeedingSMS"
#    Then save bc
#    Then save "bcInputData" data to spreadsheet from "seedingTriggerableBC" with string Seeding Trigger BC with condition: <Condition>
#    
#    Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#    
#    @NX-createCampaignForseedingOneOff
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for Seeding one-offBC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#    
#    @NDX-seedingOneOffForDataSetup @NDX-4892
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating  Seeding one-offBC
#  Given login
#   When navigate to precision marketer     
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#     Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "SeedingSMS"
#    Then save bc
#    Then save "bcInputData" data to spreadsheet from "one-offBC" with string Seeding one-offBC with condition: <Condition>
#    
#    Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#    
#    @NX-createCampaignForseedingTriggerableRecurringBC
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for Seeding Trigger recurring BC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#    
#     @NDX-seedingTriggerableRecurringBCForDataSetup @NDX-4888
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating Seeding Trigger recurring BC
#  Given login
#   When navigate to precision marketer     
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#     Then enter details for new broadcast with condition <Condition> from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
#    Then save bc
#     Then save "bcInputData" data to spreadsheet from "seedingTriggerableRecurringBC" with string Seeding Trigger recurring BC with condition: <Condition>
#    
#    Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#    
#    @NX-createCampaignForSeedingrecurringBC
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for Seeding recurring BC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#     @NDX-SeedingrecurringBCForDataSetup @NDX-4890
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating Seeding recurring BC
#  Given login
#   When navigate to precision marketer     
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#     Then enter details for new broadcast with condition <Condition> from sheet "recurringBC" with "SeedingSMS"
#    Then save bc
#    Then save "bcInputData" data to spreadsheet from "recurringBC" with string Seeding recurring BC with condition: <Condition>
#    
#    Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#    
#    @NX-createCampaignForTriggerOneoff
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for Trigger Oneoff BC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#    @NDX-TriggerOneoffForDataSetup @NDX-4893
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating Trigger Oneoff BC
#  Given login
#   When navigate to precision marketer     
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#     Then enter details for new broadcast with condition <Condition> from sheet "TriggerOneoff" with "SeedingSMS"
#    Then save bc
#    Then save "bcInputData" data to spreadsheet from "TriggerOneoff" with string Trigger Oneoff BC with condition: <Condition>
#    
#    Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#  
#  @NX-createCampaignForTriggerReccurringBC
#   @initBrowser @closeBrowser
#  Scenario: Verify Creating campaign for Trigger recurring BC
#   Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
#    
#    
#      @NDX-TriggerReccurringBCForDataSetup @NDX-4895
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating Trigger recurring BC
#  Given login
#   When navigate to precision marketer     
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#     Then enter details for new broadcast with condition <Condition> from sheet "TriggerReccurringBC" with "rechargeSMS"
#    Then save bc
#    Then save "bcInputData" data to spreadsheet from "TriggerReccurringBC" with string Trigger recurring BC with condition: <Condition>
#    
#    Examples:
#    |Condition|
#    |customerWasSentTheTrialMessage|
#    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
#    |IMEventsOfferAccepted|
#    |IMEventsCustomerCareUsage|
#    |customerDeviceInfo|
#    |segmentAgeGT40|
#    
#    @NX-monthlyRecurringBCDataSetup @NX-6529
#@initBrowser 
#Scenario: Verify specifying the recurrence value as 10,20,30 etc NX-6529
#Given login
#Then navigate to precision marketer
#    Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeSMS"
#Then save bc
#Then save "bcInputData" data to spreadsheet from "recurringMonthBC" with string  Test-recurring bc with monthly recurring

 #@NX-monthlyRecurringBCDataSetup
#@initBrowser  @closeBrowser
#Scenario: Verify specifying the recurrence value as 10,20,30 etc NX-6529
#Given login
#Then navigate to precision marketer
    #Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeSMS"
#Then save bc
#Then save "bcInputData" data to spreadsheet from "recurringMonthBC" with string Joel Test-recurring bc with monthly recurring








#=====================================================================================================================================#

# verification part included in BroadcastFunctionality_Regression(REGRESSION CASES).feature,BroadcastFunctionality_Migration.feature(MIGRATION CASES)

@NDX-PartnerCGSetting @initBrowser
Scenario: provide the list for partner cg
Given login 
Then navigate to configuration management
Then navigate to partners
Then edit a partner
Then navigate to control group settings page
Then change partner control group settings
Then wait for 2 minutes

@NDX-CreateOfferForBCFunctionality  @initBrowser @closeBrowser
Scenario Outline: create offer
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then create new offer from sheet "<offerName>" with product "fullDetails" rewards "oneruleonereward" with creative type "<creativeType>" 
Examples:
|offerName|creativeType|
|rechargeSMS|multiplecreative|
|rechargeWAP|singlecreative|
|rechargeEmail|singlecreative|
|rechargeSMS_Dynamic|singlecreative|
|SeedingSMS|multiplecreative|
|seedingWAPoffer|singlecreative|
|seedingEmail|singlecreative|
|SeedingSMS_Dynamic|singlecreative|

@CreateOfferCatalog @initBrowser @closeBrowser
Scenario: Verify Creating Offer Catalogue 
Given login
When navigate to precision marketer
Then navigate to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "defaultCatalog"
Then Add "rechargeSMS" offer to Offer Catalogue
Then Add "SeedingSMS" offer to Offer Catalogue
Then Add "rechargeWAP" offer to Offer Catalogue
Then Add "seedingWAPoffer" offer to Offer Catalogue
Then Add "SeedingSMS_Dynamic" offer to Offer Catalogue
Then Add "seedingEmail" offer to Offer Catalogue
Then Add "rechargeEmail" offer to Offer Catalogue
Then Add "SeedingSMS_Dynamic" offer to Offer Catalogue
Then navigate to landing page
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
When navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"


#/////////////////////////// CREATION OF BC FOR FUNCTIONALITY VERIFICATION ///////////////////////////////////


@NDX-CreateBCForFunctionality @initBrowser   
Scenario Outline:Create broadcast to verify bc functionality(except trigger)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then "<status>" bc
Then wait for 4000 milliseconds 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "<BCDataSheet>"
 Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|status|BCDataSheet|                  
|one-offBC|rechargeSMS|targetall|None|no limit|fixedPercentage|none|multiple creative|none|At|1|save|ConversionBC|
|one-offBC|rechargeWAP|customerList|Create|no limit|no limit|none|single creative|none|none|1|activate|BCDataStorage|
|one-offBC|rechargeEmail|usageMetric|Create|no limit|no limit|none|single creative|none|none|2|activate|BCDataStorage|
|one-offBC|rechargeSMS_Dynamic|sharedMetricOtherPartner|Create|no limit|no limit|none|single creative|none|none|3|activate|BCDataStorage|
#
|recurrBCDaily|rechargeSMS|targetall|None|no limit|fixedPercentage|none|multiple creative|At|none|2|save|ConversionBC|
|recurrBCWeekly|rechargeWAP|profilefieldNV|Create|no limit|no limit|none|single creative|none|none|4|activate|BCDataStorage|
|recurringMonthSpecialBC|rechargeEmail|targetall|None|no limit|no limit|none|single creative|none|none|5|activate|BCDataStorage|
|recurringBC|rechargeSMS_Dynamic|SharedcustomerList|Create|no limit|no limit|none|single creative|none|none|6|activate|BCDataStorage|
#
|seedingoneoff|SeedingSMS|targetall|None|no limit|fixedPercentage|none|multiple creative|none|none|3|save|ConversionBC|
|seedingoneoff|seedingWAPoffer|customerDrivenEvent|Create|no limit|no limit|none|single creative|none|none|7|activate|BCDataStorage|
|seedingoneoff|seedingEmail|customerDrivenEventNotOccurred|Create|no limit|no limit|none|single creative|none|none|8|activate|BCDataStorage|
|seedingoneoff|SeedingSMS_Dynamic|targetall|None|no limit|no limit|none|single creative|none|none|9|activate|BCDataStorage|
#
|seedingRecurringBC|SeedingSMS|targetall|None|no limit|fixedPercentage|none|multiple creative|none|none|4|save|ConversionBC|
|seedingRecurringBC|seedingWAPoffer|segmentAgeGT40|Saved Segments|no limit|no limit|none|single creative|none|none|10|activate|BCDataStorage|
|seedingRecurringBC|seedingEmail|targetall|None|no limit|no limit|none|single creative|none|none|11|activate|BCDataStorage|
|seedingRecurringBC|SeedingSMS_Dynamic|customerListNotSubscribed|None|no limit|no limit|none|single creative|none|none|12|activate|BCDataStorage|


@NDX-createTriggerWithDKJob @initBrowser
Scenario: create streaming attribute and trigger and dk job for trigger
Given login
Then navigate to data foundation
Then navigate to streaming attributes
Then create new streaming attribute from sheet "streamingAttr"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to configuration
Then select triggers in configuration
Then create new trigger "selTrigger1" with streaming attribute from sheet "streamingAttr"
Then create a dk job "Sel_TriggerJob1" with input location "/usr/local/flytxt/seleniumTrigger" streaming attribute "streamingAttr" 
Then navigate to landing page
Then navigate to data foundation
Then click Data Fusion Engine
Then filter the job "Sel_TriggerJob1" and activate it



#////////////////////////  CREATION OF TRIGGER BC FOR FUNCTIONALITY VERIFICATION /////////////////////////////////////////*
  

@NDX-TriggerBC  @initBrowser @closeBrowser
Scenario Outline: Create all type of trigger bc to verify trigger bc functionality
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "selTrigger1"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then "<status>" bc
Then wait for 4000 milliseconds 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "<BCDataSheet>"
Then wait for 4000 milliseconds 

Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|status|BCDataSheet|
#|TriggerOneoff|rechargeSMS|targetall|None|no limit|fixedPercentage|none|single creative|never|none|5|save|ConversionBC|
#|TriggerOneoff|SeedingSMS|targetall|None|no limit|no limit|none|multiple creative|never|none|13|activate|BCDataStorage|
#|TriggerOneoff|rechargeEmail|targetall|None|no limit|fixedPercentage|none|single creative|never|none|14|activate|BCDataStorage|
#|TriggerReccurringBC|rechargeSMS_Dynamic|targetall|None|no limit|no limit|none|single creative|never|none|6|save|ConversionBC|
#|TriggerReccurringBC|rechargeSMS|targetall|None|no limit|fixedPercentage|none|multiple creative|never|none|15|activate|BCDataStorage|
|TriggerReccurringBC|SeedingSMS_Dynamic|targetall|None|no limit|no limit|none|single creative|none|none|7|save|ConversionBC|
|TriggerReccurringBC|rechargeSMS|targetall|None|no limit|no limit|none|single creative|At|At|16|activate|BCDataStorage|
#//////////////////////////////BC CREATION FOR BLACKOUT MANUAL AND RENDER SCHEDULE BEFORE AND AT//////////////////////// 

@BCWithBlackoutManualRenderTimeBeforeAt @initBrowser @closeBrowser
Scenario Outline: create  recurring bc with blackout manual 
Given login 
Then navigate to precision marketer 
Then navigate to life cycle marketing 
Then navigate to campaign category from sheet "CampaignCategory" 
Then naigate to "campaignBC" campaign view broadcasts 
Then click create new broadcast button
Then create bc from sheet "recurrBCDaily" with inventory "<inventory>" and trigger "none"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "recurrBCDaily" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "<broadcastRenderTime>" and broadcast expiry as "none" from sheet "recurrBCDaily"
Then save bc 
Then add bc from sheet "recurrBCDaily" to column "<i>" of bc data sheet "ConversionBC"
Then wait for 4000 milliseconds 
Examples:
|broadcastRenderTime|i|inventory|
|real time|8|inventory_manual|
|broadcast schedule at|9|Unlimited|
|broadcast schedule before|10|Unlimited|

#////////////////////////DNC EXCLUSION MANDATORY ,OPEIONAL BC CREATION///////////////////////////////

@DNCExclusionBC @initBrowser @closeBrowser
Scenario Outline: create BC to verify DNC (optional,mandatory)
Given login 
Then navigate to precision marketer 
Then navigate to life cycle marketing 
Then navigate to campaign category from sheet "CampaignCategory" 
Then naigate to "campaignBC" campaign view broadcasts 
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "both"
Then enter choose offer tab from sheet "<offerSheet>" for bc from sheet "<bcSheet>" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "real time" and broadcast expiry as "none" from sheet "one-offBC"
Then activate bc 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "BCDataStorage"
Then wait for 4000 milliseconds 

Examples:
|bcSheet|offerSheet|i|
|recurrBCDaily|rechargeSMS|17|
|TriggerReccurringBC|SeedingSMS|18|


#after running @NDX-TriggerBC and @DNCExclusionBC
@NDX-fileForTriggerBC  @initBrowser @closeBrowser
Scenario: upload file for trigger bc
Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "trigger1.csv"



