#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@AllBCCreation_datasetup
Feature: Test suite for Broadcast creation
  Create all types of Braodcast
  

  
  @NDX-oneOffBcForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC with given condition
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "one-offBC" with string one-off bc with condition: <Condition>
      
     Examples:
    |Condition|
    #|customerWasSentTheTrialMessage|
    #|digitalPersonaGT15|
    #|customerDemographicsGT25|
    #|learnedBehaviourGT35|
    #|analyticalScoresGT45|
    #|digitalEngagementGT235|
    #|customerLocationInsightsGT5|
    #|customerList|
    #|discoveredClusters200|
    #|customerDrivenEvent|
    #|usageMetric|
    #|eventCounts|
    #|revenueMetric|
    #|IMEventsOfferAccepted|
    #|IMEventsCustomerCareUsage|
    #|customerDeviceInfo|
    |segmentAgeGT40|
    
      @NX-createCampaignForRecurringBcs
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
     @NDX-recurringBcForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC with <Condition>
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition <Condition> from sheet "recurringBC" with "rechargeSMS"
      Then save bc
       Then save "bcInputData" data to spreadsheet from "recurringBC" with string one-off bc with condition: <Condition>
      
        Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
    
     @NX-createCampaignForseedingTriggerableBC
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
  @NDX-seedingTriggerBcForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating Seeding Trigger BC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "seedingTriggerableBC" with string one-off bc with condition: <Condition>
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
    
    @NX-createCampaignForseedingOneOff
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
    
    @NDX-seedingOneOffForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating  Seeding one-offBC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "SeedingSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "one-offBC" with string one-off bc with condition: <Condition>
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
    
    @NX-createCampaignForseedingTriggerableRecurringBC
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
    
     @NDX-seedingTriggerableRecurringBCForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating Seeding Trigger recurring BC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then save bc
     Then save "bcInputData" data to spreadsheet from "seedingTriggerableRecurringBC" with string one-off bc with condition: <Condition>
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
    
    @NX-createCampaignForSeedingrecurringBC
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
     @NDX-SeedingrecurringBCForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating Seeding recurring BC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "recurringBC" with "SeedingSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "recurringBC" with string one-off bc with condition: <Condition>
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
    
    @NX-createCampaignForTriggerOneoff
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
    @NDX-TriggerOneoffForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating Trigger Oneoff BC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "TriggerOneoff" with "SeedingSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "TriggerOneoff" with string one-off bc with condition: <Condition>
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
  
  @NX-createCampaignForTriggerReccurringBC
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
    
      @NDX-TriggerReccurringBCForDataSetup
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating Trigger recurring BC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "TriggerReccurringBC" with string one-off bc with condition: <Condition>
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
    @NX-monthlyRecurringBCDataSetup
@initBrowser 
Scenario: Verify specifying the recurrence value as 10,20,30 etc NX-6529
Given login
Then navigate to precision marketer
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeSMS"
Then save bc
Then save "bcInputData" data to spreadsheet from "recurringMonthBC" with string Joel Test-recurring bc with monthly recurring

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