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








#============================================CREATION OF BC FOR VERFICATION OF BC FUNCTIONALITY=========================================================================================#


@NDX-CreateOfferForBCFunctionality  @initBrowser @closeBrowser
Scenario Outline: create offer
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then create new offer from sheet "<offerName>" with product "fullDetails" rewards "oneruleonereward" with creative type "<creativeType>" and track Source "A_track_Sel"
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
     

@NDX-CreateBCForFunctionality @initBrowser   @closeBrowser
Scenario Outline:Create broadcast to verify bc functionality(trigger not included)
Given login
Then navigate to configuration management
Then navigate to partners
Then edit a partner
Then navigate to control group settings page
Then change partner control group settings
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then activate bc
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "BCDataStorage"
  
Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|                  
|one-offBC|rechargeSMS|profilefieldNV|Create|no limit|fixedPercentage|none|multiple creative|none|At|1|
|one-offBC|rechargeWAP|customerList|Create|no limit|no limit|none|single creative|none|none|2|
|one-offBC|rechargeEmail|usageMetric|Create|no limit|no limit|none|single creative|none|none|3|
|one-offBC|rechargeSMS_Dynamic|sharedMetricOtherPartner|Create|no limit|no limit|none|single creative|none|none|4|
|recurrBCDaily|rechargeSMS|segmentAgeGT40|Saved Segments|no limit|fixedPercentage|none|multiple creative|At|none|5|
|recurrBCWeekly|rechargeWAP|targetall|None|no limit|no limit|none|single creative|none|none|6|
|recurringMonthSpecialBC|rechargeEmail|targetall|None|no limit|no limit|none|single creative|none|none|7|
|recurringBC|rechargeSMS_Dynamic|SharedcustomerList|Create|no limit|no limit|none|single creative|none|none|8|
|seedingoneoff|SeedingSMS|sharedEventOtherPartner|Create|no limit|fixedPercentage|none|multiple creative|none|none|9|
|seedingoneoff|seedingWAPoffer|customerDrivenEvent|Create|no limit|no limit|none|single creative|none|none|10|
|seedingoneoff|seedingEmail|customerDrivenEventNotOccurred|Create|no limit|no limit|none|single creative|none|none|11|
|seedingoneoff|SeedingSMS_Dynamic|targetall|Create|no limit|no limit|none|single creative|none|none|12|
|seedingRecurringBC|SeedingSMS|targetall|None|no limit|fixedPercentage|none|multiple creative|none|none|13|
|seedingRecurringBC|seedingWAPoffer|targetall|None|no limit|no limit|none|single creative|none|none|14|
|seedingRecurringBC|seedingEmail|targetall|None|no limit|no limit|none|single creative|none|none|15|
|seedingRecurringBC|SeedingSMS_Dynamic|targetall|None|no limit|no limit|none|single creative|none|none|16|

@NDX-TriggerBC  @initBrowser @closeBrowser
Scenario Outline: Create all type of trigger bc to verify trigger bc functionality
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create trigger bc from sheet "<bcSheet>" with inventory "Unlimited"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then activate bc
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "BCDataStorage"

Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|
|TriggerOneoff|rechargeSMS|segmentAgeGT40|Saved Segments|no limit|fixedPercentage|none|single creative|never|none|17|
|TriggerOneoff|SeedingSMS|targetall|None|no limit|no limit|none|multiplecreative|never|none|18|
|TriggerOneoff|rechargeEmail|targetall|None|no limit|fixedPercentage|none|singlecreative|never|none|19|
|TriggerReccurringBC|seedingWAPoffer|targetall|None|no limit|no limit|none|singlecreative|never|none|20|
|TriggerReccurringBC|rechargeSMS|targetall|None|no limit|fixedPercentage|none|multiplecreative|never|none|21|
|TriggerReccurringBC|SeedingSMS_Dynamic|targetall|None|no limit|no limit|none|singlecreative|none|none|22|
|TriggerReccurringBC|rechargeSMS|targetall|None|no limit|no limit|none|singlecreative|At|At|23|

#after running @NDX-TriggerBC run @NDX-fileForTriggerBC
@NDX-fileForTriggerBC  @initBrowser @closeBrowser
Scenario: upload file for trigger bc
Given login
Then provide file for trigger with csv file "trigger1.csv"






