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








#=============================================================================================================================================#
@NDX-CreateOneTimeBC1 @initBrowser
Scenario: Create one-time bc with offer(SMS) having broadcast and partner level CG,Target condition:profilefieldNV
Given login
Then navigate to configuration management
Then navigate to partners
Then edit a partner
Then navigate to control group settings page
Then change partner control group settings
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "one-offBC" with inventory "Unlimited"
Then enter target tab details target condition profilefieldNV type "Create" TG "no limit" CG "fixedPercentage" DNC "none"
Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "one-offBC" with "multiple creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "At" from sheet "one-offBC"
Then activate bc
Then add the BC Data to "BCDataStorage" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS" condition "profilefieldNV"
                      

@NDX-CreateOneTimeBC2 @initBrowser
Scenario:  Create one-time bc with offer(WAP),Target condition:customerList
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "one-offBC" with inventory "Unlimited"
Then enter target tab details target condition customerList type "Create" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeWAP" for bc from sheet "one-offBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "none" from sheet "one-offBC"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeWAP" condition "customerList"

@NDX-CreateOneTimeBC3 @initBrowser
Scenario: Create one-time bc with offer(Email),Target condition:usageMetric
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "one-offBC" with inventory "Unlimited"
Then enter target tab details target condition usageMetric type "Create" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeEmail" for bc from sheet "one-offBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "none" from sheet "one-offBC"
Then activate bc
Then add the BC Data to "BCDataStorage" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeEmail" condition "usageMetric"

@NDX-CreateOneTimeBC4 @initBrowser
Scenario: Create one-time bc with offer(Dynamic Tag usage),Target condition:sharedMetricOtherPartner
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "one-offBC" with inventory "Unlimited"
Then enter target tab details target condition sharedMetricOtherPartner type "Create" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeSMS_Dynamic" for bc from sheet "one-offBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "none" from sheet "one-offBC"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "one-offBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "rechargeSMS_Dynamic" condition "sharedMetricOtherPartner"


@NDX-CreateRecurringBC1 @initBrowser
Scenario: Create recurring bc with offer (SMS),having broadcast and partner level CG recurrenece pattern (daily) ,target condition:segmentAgeGT40
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "recurrBCDaily" with inventory "Unlimited"
Then enter target tab details target condition segmentAgeGT40 type "Saved Segment" TG "no limit" CG "fixedPercentage" DNC "none"
Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "recurrBCDaily" with "multiple creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "At" target render time "realTime" and broadcast expiry as "at" from sheet "recurrBCDaily"
Then save bc


@NDX-CreateRecurringBC2 @initBrowser
Scenario:  Create recurring bc with offer (WAP), recurrenece pattern (every week)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "recurrBCWeekly" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeWAP" for bc from sheet "recurrBCWeekly" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurrBCWeekly"
Then save bc


@NDX-CreateRecurringBC3 @initBrowser
Scenario: Create recurring bc with offer (email), recurrenece pattern (specail day of the week) 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "recurringMonthSpecialBC" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeEmail" for bc from sheet "recurringMonthSpecialBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurringMonthSpecialBC"
Then save bc

@NDX-CreateRecurringBC5 @initBrowser
Scenario:  Create recurring bc with offer (SMS,dynamic tag usage), recurrenece pattern (every 2 days) ,target condition:SharedcustomerList
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "recurringBC" with inventory "Unlimited"
Then enter target tab details target condition SharedcustomerList type "Create" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "rechargeSMS_Dynamic" for bc from sheet "recurringBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "recurringBC"
Then save bc


@NDX-CreateSeedingOneOffBC1 @initBrowser
Scenario: Create seeding one-time with offer(SMS,multiple creative),having broadcast and partner level CG,Target condition:sharedEventOtherPartner
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingoneoff" with inventory "Unlimited"
Then enter target tab details target condition sharedEventOtherPartner type "Create" TG "no limit" CG "fixedPercentage" DNC "none"
Then enter choose offer tab from sheet "SeedingSMS" for bc from sheet "seedingoneoff" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "after" from sheet "seedingoneoff"
Then activate bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "sharedEventOtherPartner"

@NDX-CreateSeedingOneOffBC2 @initBrowser
Scenario: Create seeding one-time with offer(WAP),multiple creative,target condition:customerDrivenEvent
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingoneoff" with inventory "Unlimited"
Then enter target tab details target condition customerDrivenEvent type "Create" TG "no limit" CG "no limits" DNC "none"
Then enter choose offer tab from sheet "SeedingWAP" for bc from sheet "seedingoneoff" with "multiple creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "after" from sheet "seedingoneoff"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingWAP" condition "profilefieldNV"

@NDX-CreateSeedingOneOffBC3 @initBrowser
Scenario: Create seeding one-time with offer(email),target condition: customerDrivenEventNotOccurred
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingoneoff" with inventory "Unlimited"
Then enter target tab details target condition customerDrivenEventNotOccurred type "Create" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "seedingEmail" for bc from sheet "seedingoneoff" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "after" from sheet "seedingoneoff"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "seedingEmail" condition "profilefieldNV"

@NDX-CreateSeedingOneOffBC4 @initBrowser
Scenario: Create seeding one-time with offer(dynamic tag usage)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingoneoff" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "SeedingSMS_Dynamic" for bc from sheet "seedingoneoff" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "after" from sheet "seedingoneoff"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingoneoff" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS_Dynamic" condition "profilefieldNV"

@NDX-CreateSeedingRecurringBC1 @initBrowser
Scenario: Create recurring bc with offer (SMS),having broadcast and partner level CG
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingRecurringBC" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "SeedingSMS" for bc from sheet "seedingRecurringBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingRecurringBC"
Then activate bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS" condition "sharedEventOtherPartner"

@NDX-CreateSeedingRecurringBC2 @initBrowser
Scenario: Create recurring bc with offer (WAP),multiple creative
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingRecurringBC" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "SeedingWAP" for bc from sheet "seedingRecurringBC" with "multiple creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingRecurringBC"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingWAP" condition "sharedEventOtherPartner"

@NDX-CreateSeedingRecurringBC3 @initBrowser
Scenario: Create recurring bc with offer (Email)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingRecurringBC" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "seedingEmail" for bc from sheet "seedingRecurringBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingRecurringBC"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "seedingEmail" condition "sharedEventOtherPartner"

@NDX-CreateSeedingRecurringBC4 @initBrowser
Scenario: Create recurring bc using dynaimc tag
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "seedingRecurringBC" with inventory "Unlimited"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "SeedingSMS_Dynamic" for bc from sheet "seedingRecurringBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "never" target render time "realTime" and broadcast expiry as "none" from sheet "seedingRecurringBC"
Then save bc
Then add the BC Data to "BCDataStorage" from BCsheet "seedingRecurringBC" campaignname "campaignBC" campaign category "CampaignCategory" offer "SeedingSMS_Dynamic" condition "sharedEventOtherPartner"


