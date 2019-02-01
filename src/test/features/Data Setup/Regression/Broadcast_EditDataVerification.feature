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
@AllBc_Edit_DataSetup
Feature: Test suite for Broadcast Editing
  Editing all types of Braodcast

  @NDX-editingOneOffBcBasicDetails @NDX-5801 @initBrowser
  Scenario: Verify Creating one-off BC and edit the basic details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    Then view the bc from workbook "bcInputData" in sheet "one-offBC"
    Then verify the basic details before editing the BC data from sheet "one-offBC"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
    Then editing the BC from sheet "one-offBC" basic details With edit data from sheet "one-offBCEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the basic details from Broadcast View and data sheet "one-offBCEdit"

  @NDX-VerifyBCDeliverDetails @NDX-5874 @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC and edit the Delivery details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"

    @NDX-VerifyBCOffer @NDX-5872 @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC and edit the offer details details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "one-offBCEdit" with offer "rechargeWAP"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "one-offBCEdit" with offer "rechargeWAP"


  @NDX-targetSelection @NDX-5836, @NDX-5868 @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC and edit the targetSelection <condition>
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-editingBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC with given <condition>
#    NDX-5826,NDX-5827,NDX-5828,NDX-5829,NDX-5838,NDX-5840,NDX-5842,NDX-5844,NDX-5846,NDX-5848,NDX-5850,NDX-5852,NDX-5854,NDX-5856,NDX-5858,NDX-5860,NDX-5862,NDX-5864,NDX-5866,NDX-5870
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
  | customerWasSentTheTrialMessage |
  | digitalPersonaGT15             |
  | customerDemographicsGT25       |
  | learnedBehaviourGT35           |
  | analyticalScoresGT45           |
  | digitalEngagementGT235         |
  | customerLocationInsightsGT5    |
  | customerList                   |
  | discoveredClusters200          |
  | customerDrivenEvent            |
  | usageMetric                    |
  | eventCounts                    |
  | revenueMetric                  |
  | IMEventsOfferAccepted          |
  | IMEventsCustomerCareUsage      |
  | customerDeviceInfo             |
  | sharedMetricOtherPartner  |
  | customerDrivenEventNotOccurred  |
  | customerWasSentTheTrialMessageNOtOccurred |
  | conditionForANDOperation |
  | conditionForOROperation |
  | segmentAgeGT40                 |
 
   @NDX-VerifyBCTargetList @NDX-5834  @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC and edit the target list details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    
  @NDX-VerifyBCexpiry @NDX-5930 @initBrowser @closeBrowser
  Scenario: Verify the BC after edit Broadcast expiry One-Off BC(NEW)
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the offer for BC expiry
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC expiry in BC View
    
#    ************************ Trigger OneOFF BC**************
   @NDX-editingTriggerOneOffBcBasicDetails @initBrowser 
  Scenario: Verify Creating one-off BC and edit the basic details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition allTargetConditions from sheet "TriggerOneoff" with "rechargeSMS"
    Then save bc
    Then view the bc from workbook "bcInputData" in sheet "TriggerOneoff"
    Then verify the basic details before editing the BC data from sheet "TriggerOneoff"
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "TriggerOneoff"
    Then editing the BC from sheet "TriggerOneoff" basic details With edit data from sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the basic details from Broadcast View and data sheet "TriggerOneoffEdit"
    
    
    
    @NDX-editTriggeroneoffBCOffer @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC and edit the offer details details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit" with offer "rechargeWAP"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit" with offer "rechargeWAP"
    
    
    
    @NDX-TriggeroneofftargetSelection @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC and edit the targetSelection <condition>
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-editingTriggeroneoffBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC with given <condition>
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
      |allTargetConditions|
#  | customerWasSentTheTrialMessage |
#  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | customerList                   |
#  | discoveredClusters200          |
#  | customerDrivenEvent            |
#  | usageMetric                    |
#  | eventCounts                    |
#  | revenueMetric                  |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |
#  | sharedMetricOtherPartner  |
#  | customerDrivenEventNotOccurred  |
#  | customerWasSentTheTrialMessageNOtOccurred |
#  | conditionForANDOperation |
#  | conditionForOROperation |
#  | segmentAgeGT40                 |
 
   @NDX-VerifyTriggeroneoffBcTargetList @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC and edit the target list details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    
  @NDX-VerifyTriggeroneoffBCexpiry @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC and edit the offer details details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the offer for BC expiry
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC expiry in BC View
    
    
    
    
    
    
    
    
    
    
    
    
    
# **********************************************************
  @NDX-DNCExclusionBC @initBrowser 
  Scenario: Verify Creating one-off BC with DNCExclusionBC
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
#    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBothExclution" with "rechargeSMS"
Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    Then wait until status of "one-offBC" is "Completed"
    Then provide file for conversion
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "919491750002"
    Then click on events tab
    Then wait for comversion event
    Then remove file for conversion
    Then wait for reward in consumer profile