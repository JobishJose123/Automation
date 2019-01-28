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

  @NDX-editingOneOffBcBasicDetails @initBrowser
  Scenario: Verify Creating one-off BC and edit the basic details 
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition customerWasSentTheTrialMessage from sheet "one-offBC" with "rechargeSMS"
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
    
    @NDX-VerifyBCDeliverDetails @initBrowser
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
    
    @NDX-VerifyBCTargetList @initBrowser
    Scenario: Verify Creating one-off BC and edit the Delivery details
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
    
    
  @NDX-editingBcTargetDetails @initBrowser 
  Scenario Outline: Verify Creating one-off BC with given <condition>
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
      | Condition                      |
      #| customerWasSentTheTrialMessage |
      #| digitalPersonaGT15             |
      #| customerDemographicsGT25       |
      #| learnedBehaviourGT35           |
      #| analyticalScoresGT45           |
      #| digitalEngagementGT235         |
      #| customerLocationInsightsGT5    |
      #| customerList                   |
      #| discoveredClusters200          |
      #| customerDrivenEvent            |
      #| usageMetric                    |
      #| eventCounts                    |
      #| revenueMetric                  |
      #| IMEventsOfferAccepted          |
      #| IMEventsCustomerCareUsage      |
      #| customerDeviceInfo             |
      #| customerDrivenEventNotOccurred  |
      #| customerWasSentTheTrialMessageNOtOccurred |
      #| conditionForANDOperation |
      | conditionForOROperation  |
      #| segmentAgeGT40                 |
