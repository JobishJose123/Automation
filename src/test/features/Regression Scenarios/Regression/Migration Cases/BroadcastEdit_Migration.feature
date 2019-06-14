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
@BroadcastEdit_Migration
Feature: Test suite for Broadcast Editing for Migration
  Editing all types of Braodcast
  
 
  #    ************************ OneOFF BC**************
 

  
  @NDX-5875 @initBrowser
  Scenario: Verify one-off BC and edit the Delivery details , Verify the BC after edit Start and End Time of One-Off Bc Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then save bc
    Then view the bc from workbook "bcInputData" in sheet "one-offBC"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"


@NDX-5802 @initBrowser @closeBrowser
  Scenario: Verify the BC after edit the basic detais of One-offBC Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
    Then editing the BC from sheet "one-offBC" basic details With edit data from sheet "one-offBCEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the basic details from Broadcast View and data sheet "one-offBCEdit"



    @NDX-5873 @initBrowser @closeBrowser
  Scenario: Verify BC after edit with offer in offer selection page Migration
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





  @NDX-5837 @NDX-5869 @initBrowser @closeBrowser
  Scenario Outline: Verify one-off BC and edit the targetSelection <Condition> Migration
#                    Verify BC after edit with new Saved segment One-Off BC
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

 
  @NDX-5830 @initBrowser @closeBrowser
  Scenario Outline: Verify one-off BC edit with given <Condition> Migration <tag>
#  @NDX-5831 @NDX-5832 @NDX-5833 @NDX-5839 @NDX-5847 @NDX-5851 @NDX-5855 @NDX-5867 @NDX-5871 @NDX-6383 @NDX-6385   
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
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |

   @NDX-5835  @initBrowser @closeBrowser
  Scenario: Verify one-off BC and edit the target list details Migration
  Verify the BC after edit the Base list in Target page One-Off BC
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
    
   @NDX-5931 @initBrowser
  Scenario: Verify the One-Off BC Broadcast expiry after edit Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC expiry in BC View After hours "2"
    
#    ************************ Trigger OneOFF BC**************
   
    
     @NDX-6255 @initBrowser @closeBrowser
  Scenario: Verify Trigger one-off BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "TriggerOneoff"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputData" in sheet "TriggerOneoff"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    
    
    @NDX-6205 @initBrowser @closeBrowser
  Scenario: Verify Creating TriggerOne-off BC and edit the basic details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "TriggerOneoff"
    Then editing the BC from sheet "TriggerOneoff" basic details With edit data from sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the basic details from Broadcast View and data sheet "TriggerOneoffEdit"
    
    
    
    @NDX-6253 @initBrowser @closeBrowser
  Scenario: Verify TriggerOne-off BC and edit the offer details Migration
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
    
    
    
    @NDX-6217 @NDX-6249 @initBrowser @closeBrowser
  Scenario Outline: Verify TriggerOne-off BC and edit the targetSelection <Condition> Migration
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

 
  @NDX-6210 @NDX-6211 @NDX-6212 @NDX-6213 @NDX-6219 @NDX-6227 @NDX-6231 @NDX-6235 @NDX-6247 @NDX-6251 @NDX-6407 @NDX-6409 @initBrowser @closeBrowser
  Scenario Outline: Verify TriggerOne-off BC Edit with given <Condition> Migration
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
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |

   @NDX-6215 @initBrowser @closeBrowser
  Scenario: Verify TriggerOne-off BC and edit the target list details Migration
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
    
  @NDX-6257 @initBrowser @closeBrowser
  Scenario: Verify TriggerOne-off BC after edit Broadcast expiry Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the BC expiry in BC View After hours "2"
    
    
    
 #    ************************ Seeding OneOFF BC**************   
    
    
     @NDX-6093 @initBrowser @closeBrowser
  Scenario: Verify seeding one-off BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "seedingoneoff"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputData" in sheet "seedingoneoff"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    
    
    @NDX-6041  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding one-offBC Migration
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then click on BC edit button from workbook "bcInputData" sheet "seedingoneoff" 
	Then editing the BC from sheet "seedingoneoff" basic details With edit data from sheet "seedingoneoffEdit" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit" 
	Then verify the basic details from Broadcast View and data sheet "seedingoneoffEdit" 
    
    
    
     @NDX-6091  @initBrowser @closeBrowser
  Scenario: Verify Seeding one-off BC edit the offer details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit" with offer "seedingWAPoffer"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit" with offer "seedingWAPoffer"


  @NDX-6053 @NDX-6087 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding one-off BC and edit the targetSelection <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
   @NDX-6046 @NDX-6047 @NDX-6048 @NDX-6049 @NDX-6055 @NDX-6063 @NDX-6067 @NDX-6071 @NDX-6085 @NDX-6089 @NDX-6395 @NDX-6397  @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding one-off BC edit with given <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |


   @NDX-6051 @initBrowser @closeBrowser
  Scenario: Verify Seeding one-off BC and edit the target list details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    
  @NDX-6095 @initBrowser @closeBrowser
  Scenario: Verify the Seeding one off BC after edit Broadcast expiry Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
   Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then verify the BC expiry in BC View After hours "2"
    
#    ************************ Seeding Triggerable BC**************    
    
    
  
	
        
    
     @NDX-6037  @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "seedingTriggerableBC"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputData" in sheet "seedingTriggerableBC"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    
    
    @NDX-5987 @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding triggarable BC Migration
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then click on BC edit button from workbook "bcInputData" sheet "seedingTriggerableBC" 
	Then editing the BC from sheet "seedingTriggerableBC" basic details With edit data from sheet "seedingTriggerableBCEdit" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit" 
	Then verify the basic details from Broadcast View and data sheet "seedingTriggerableBCEdit" 
    
    
    
     @NDX-6035 @initBrowser @closeBrowser
  Scenario: Verify Seeding Triggerable BC edit the offer details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit" with offer "seedingWAPoffer"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit" with offer "seedingWAPoffer"


  @NDX-5999 @NDX-6031 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Trggerable BC and edit the targetSelection <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-5992 @NDX-5993 @NDX-5994 @NDX-5995 @NDX-6001 @NDX-6009 @NDX-6013 @NDX-6017 @NDX-6029 @NDX-6033 @NDX-6391 @NDX-6393 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Trggerable BC edit with given <Condition> Migration

    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |


   @NDX-5997  @initBrowser @closeBrowser
  Scenario: Verify Seeding triggerable BC and edit the target list details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    
  @NDX-6039  @initBrowser @closeBrowser
  Scenario: Verify the Seeding Triggerable BC after edit Broadcast expiry Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
   Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then verify the BC expiry in BC View After hours "2"
  
  
  
  
  
   #    ************************ Seeding Recurring BC**************   
    
    
   
	
    
    
    
     @NDX-6201  @initBrowser @closeBrowser
  Scenario: Verify seeding Recurring BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "seedingRecurringBC"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputData" in sheet "seedingRecurringBC"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
      
       @NDX-6151  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding Recurring Migration
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then click on BC edit button from workbook "bcInputData" sheet "seedingRecurringBC" 
	Then editing the BC from sheet "seedingRecurringBC" basic details With edit data from sheet "seedingRecurringBCEdit" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit" 
	Then verify the basic details from Broadcast View and data sheet "seedingRecurringBCEdit" 
      
    
     @NDX-6199 @initBrowser @closeBrowser
  Scenario: Verify Seeding Recurring BC edit the offer details  Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit" with offer "seedingWAPoffer"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit" with offer "seedingWAPoffer"


  @NDX-6163 @NDX-6195 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Recurring BC and edit the targetSelection <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-6156  @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Recurring BC edit with given <Condition> Migration
#@NDX-6157 @NDX-6158 @NDX-6159 @NDX-6165 @NDX-6173 @NDX-6177 @NDX-6181 @NDX-6193 @NDX-6197 @NDX-6403 @NDX-6405
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |


   @NDX-6161 @initBrowser @closeBrowser
  Scenario: Verify Seeding Recurring BC and edit the target list details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    
  @NDX-6203 @initBrowser @closeBrowser
  Scenario: Verify the Seeding Recurring BC after edit Broadcast expiry Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
   Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then verify the BC expiry in BC View After hours "2"
    
    
    
   #    ************************ seeding Triggerable Recurring BC**************   
    
    
    
    
    
    
     @NDX-6147 @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "seedingTriggerableRecurringBC"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputData" in sheet "seedingTriggerableRecurringBC"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    
    
    
    @NDX-6097  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of seeding Triggerable Recurring BC Migration
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then click on BC edit button from workbook "bcInputData" sheet "seedingTriggerableRecurringBC" 
	Then editing the BC from sheet "seedingTriggerableRecurringBC" basic details With edit data from sheet "seedingTriggerableRecurringBCEd" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd" 
	Then verify the basic details from Broadcast View and data sheet "seedingTriggerableRecurringBCEd"
	
    
    
     @NDX-6145  @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC edit the offer details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd" with offer "seedingWAPoffer"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd" with offer "seedingWAPoffer"


  @NDX-6109 @NDX-6141 @initBrowser @closeBrowser
  Scenario Outline: Verify seeding Triggerable Recurring BC and edit the targetSelection <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-6102 @NDX-6103 @NDX-6104 @NDX-6105 @NDX-6111 @NDX-6119 @NDX-6123 @NDX-6127 @NDX-6139 @NDX-6143 @NDX-6399 @NDX-6401 @initBrowser @closeBrowser
  Scenario Outline: Verify seeding Triggerable Recurring BC edit with given <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| revenueMetric                  |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
 
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |


   @NDX-6107 @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC and edit the target list details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    
  @NDX-6149 @initBrowser @closeBrowser
  Scenario: Verify the seeding Triggerable Recurring BC after edit Broadcast expiry Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
   Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then verify the BC expiry in BC View After hours "2"
    
  
  
  
   #    ************************ Trigger Recurring BC**************   
    
   
	
    
    
    
     @NDX-6309 @initBrowser @closeBrowser
  Scenario: Verify  Trigger Recurring BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "TriggerReccurringBC"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputData" in sheet "TriggerReccurringBC"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit" 
    
     
    @NDX-6259  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Trigger Recurring BC Migration
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Triggerable Broadcasts" broadcasts
	Then click on BC edit button from workbook "bcInputData" sheet "TriggerReccurringBC" 
	Then editing the BC from sheet "TriggerReccurringBC" basic details With edit data from sheet "TriggerReccurringBCEdit" 
	Then save bc 
	Then navigate to "Triggerable Broadcasts" broadcasts
	Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit" 
	Then verify the basic details from Broadcast View and data sheet "TriggerReccurringBCEdit"
    
     @NDX-6307 @initBrowser 
  Scenario: Verify Trigger Recurring BC edit the offer details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit" with offer "rechargeWAP"
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit" with offer "rechargeWAP"


  @NDX-6271 @NDX-6303 @initBrowser @closeBrowser
  Scenario Outline: Verify Trigger Recurring BC and edit the targetSelection <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-6264 @initBrowser @closeBrowser
  Scenario Outline: Verify Trigger Recurring BC edit with given <Condition> Migration
#   @NDX-6265 @NDX-6266 @NDX-6267 @NDX-6273 @NDX-6281 @NDX-6285 @NDX-6289 @NDX-6301 @NDX-6305 @NDX-6311 @NDX-6411 @NDX-6413
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |


   @NDX-6269 @initBrowser @closeBrowser
  Scenario: Verify Trigger Recurring BC and edit the target list details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    
  @NDX-6311  @initBrowser @closeBrowser
  Scenario: Verify the Trigger Recurring BC after edit Broadcast expiry Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
   Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then verify the BC expiry in BC View After hours "2"
    
  
  
  
  
  
  #    ************************ Recurring BC**************   
    
    
    
    
    
    
     @NDX-5983  @initBrowser @closeBrowser
  Scenario: Verify Recurring BC and edit the Delivery details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputData" sheet "recurringBC"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputData" in sheet "recurringBC"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
      
      
      @NDX-5933 @initBrowser
  Scenario: Verify Creating and editing the basic details of Recurring BC Migration
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Recurring Broadcasts" broadcasts
	Then click on BC edit button from workbook "bcInputData" sheet "recurringBC" 
	Then editing the BC from sheet "recurringBC" basic details With edit data from sheet "recurringBCEdit" 
	Then save bc 
	Then navigate to "Recurring Broadcasts" broadcasts
	Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit" 
	Then verify the basic details from Broadcast View and data sheet "recurringBCEdit"
	
      
      
        
     @NDX-5981  @initBrowser 
  Scenario: Verify Recurring BC edit the offer details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the offer for BC from workbook "bcInputDataForEdit" sheet "recurringBCEdit" with offer "rechargeWAP"
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then verify the BC offer in BC View from workbook "bcInputDataForEdit" sheet "recurringBCEdit" with offer "rechargeWAP"


  @NDX-5945 @NDX-5977 @initBrowser @closeBrowser
  Scenario Outline: Verify Recurring BC and edit the targetSelection <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the targetSelection <Condition> for BC
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then verify the BC targetSelection <Condition> in BC View

    Examples: 
      | Condition     |
      | None          |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

 
  @NDX-5938 @NDX-5939 @NDX-5940 @NDX-5941 @NDX-5947 @NDX-5955 @NDX-5959 @NDX-5963 @NDX-5975 @NDX-5979 @NDX-6387 @NDX-6389@initBrowser @closeBrowser
  Scenario Outline: Verify Recurring BC edit with given <Condition> Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the broadcast with taget condition <Condition>
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then verify the target conditions from Broadcast View and condition <Condition>

    Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	| conditionForOROperation |
	| segmentAgeGT40                 |
 
# | revenueMetric                  |
 #  | digitalPersonaGT15             |
#  | customerDemographicsGT25       |
#  | learnedBehaviourGT35           |
#  | analyticalScoresGT45           |
#  | digitalEngagementGT235         |
#  | customerLocationInsightsGT5    |
#  | discoveredClusters200          |
#  | eventCounts                    |
#  | IMEventsOfferAccepted          |
#  | IMEventsCustomerCareUsage      |
#  | customerDeviceInfo             |


   @NDX-5943 @initBrowser @closeBrowser
  Scenario: Verify Recurring BC and edit the target list details Migration
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    
  @NDX-5985 @initBrowser @closeBrowser
  Scenario: Verify the  Recurring BC after edit Broadcast expiry Migration
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
   Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then verify the BC expiry in BC View After hours "2"
    
  
  
#  *********** Verify Child BC dates *************
  
 @NDX-6417 @initBrowser 
Scenario: Verify Recurring Bc child BCs Dates 
	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
	Then activate bc
	Then navigate to "Recurring Broadcasts" broadcasts
	Then navigate to "One-time" broadcasts
	Then verify the Child BC count and recurring dates from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    
    @NDX-6415 @initBrowser 
Scenario: Verify Triggerable Recurring Bc child BCs Dates 
	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
    Then navigate to "Triggerable" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
	Then activate bc
	Then navigate to "Triggerable" broadcasts
	Then navigate to "One-time" broadcasts
	Then verify the Child BC count and recurring dates from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
  
  @NDX-6421 @NDX-6419 @initBrowser 
  Scenario: Verify Seeding Recurring Bc child BCs Dates 
	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCED"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCED"
	Then activate bc
	Then navigate to "Seedings Broadcasts" broadcasts
	Then navigate to "One-time" broadcasts
	Then verify the Child BC count and recurring dates from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCED"
    
    
  
  @NDX-7946
  Scenario: Verify BC Notification for one-off Bc migration
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
	Then activate bc
     Then wait until status of "one-offBC" is "Completed"
    Then verify the BC notification in mail "Rendering" from workbook "bcInputDataForEdit" and sheet "TriggerOneoffEdit"
    Then verify the BC notification in mail "Delivering" from workbook "bcInputDataForEdit" and sheet "TriggerOneoffEdit"
    Then verify the BC notification in mail "Completed" from workbook "bcInputDataForEdit" and sheet "TriggerOneoffEdit"
    
    
   @NDX-7962
 @initBrowser @closeBrowser
 Scenario: Verify pausing of a One-time Broadcast migration
 Given login
 Then navigate to precision marketer
 Then navigate to life cycle marketing
 Then navigate to campaign category from sheet "CampaignCategory"
 Then naigate to "campaignBC" campaign view broadcasts
 Then click on BC edit button from workbook "bcInputData" sheet "one-offBCForPause"
 Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
 Then activate bc
Then wait until status of "one-offBCForPause" from file "bcInputData" is "Delivering" for bctype "onetime" 
Then pause bc for bctype "onetime"
Then wait until status of "one-offBCForPause" from file "bcInputData" is "Paused" for bctype "onetime" 
 
@NDX-8006
@initBrowser @closeBrowser
Scenario: Verify pausing of a Recurring Broadcast migration
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "CampaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then click on BC edit button from workbook "bcInputData" sheet "recurringBCForPause"
Then edit the Delevery tab details from workbook "bcInputData" sheet "recurringBCForPause"
Then activate bc
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringBCForPause" for bctype "recurring"
Then pause bc for bctype "recurring"
Then wait until status of "recurringBCForPause" from file "bcInputData" is "Paused" for bctype "recurring" 
Then navigate to "One-time" broadcasts
Then wait until status of recurring child bc from sheet "recurringBCForPause" is "Paused" 


@NDX-8017
 @initBrowser @closeBrowser
Scenario: Verify pausing of a seedingRecurring Broadcast migration
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "CampaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Seedings Broadcasts" broadcasts
Then click on BC edit button from workbook "bcInputData" sheet "seedingRecurringBCForPause"
Then edit the Delevery tab details from workbook "bcInputData" sheet "seedingRecurringBCForPause"
Then activate bc
Then navigate to "Seedings Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBCForPause" for bctype "seeding"
Then pause bc for bctype "seeding"
Then wait until status of "seedingRecurringBCForPause" from file "bcInputData" is "Paused" for bctype "seeding" 
Then navigate to "One-time" broadcasts
Then wait until status of "seedingRecurringBCForPause" from file "bcInputData" is "Paused" for bctype "onetime" 

@NDX-8014 
@initBrowser @closeBrowser
Scenario: Verify pausing of a seedingoneoff Broadcast migration
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "CampaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Seedings Broadcasts" broadcasts
Then click on BC edit button from workbook "bcInputData" sheet "seedingoneoffForPause"
Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
Then activate bc
Then navigate to "Seedings Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingoneoffForPause" for bctype "seeding"
Then pause bc for bctype "seeding"
Then wait until status of "seedingoneoffForPause" from file "bcInputData" is "Paused" for bctype "seeding" 
Then navigate to "One-time" broadcasts
Then wait until status of "seedingoneoffForPause" from file "bcInputData" is "Paused" for bctype "onetime" 


@NDX-8061
@initBrowser @closeBrowser
 Scenario: Verify abort of a One-time Broadcast migration
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "CampaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click on BC edit button from workbook "bcInputData" sheet "one-offBCForAbort"
Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
Then activate bc
Then wait until status of "one-offBCForAbort" from file "bcInputData" is "Render Scheduled" for bctype "onetime" 
Then abort bc for bctype "onetime"
Then wait until status of "one-offBCForAbort" from file "bcInputData" is "Aborted" for bctype "onetime" 
 
@NDX-8063 
@initBrowser @closeBrowser
Scenario: Verify abort of a Recurring Broadcast migration
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "CampaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
#Then click on BC edit button from workbook "bcInputData" sheet "recurringBCForAbort"
#Then edit the Delevery tab details from workbook "bcInputData" sheet "recurringBCForAbort"
#Then activate bc
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringBCForAbort" for bctype "recurring"
Then abort bc for bctype "recurring"
Then wait until status of "recurringBCForAbort" from file "bcInputData" is "Canceled" for bctype "recurring" 
Then navigate to "One-time" broadcasts
Then wait until status of recurring child bc from sheet "recurringBCForAbort" is "Aborted"  

#@NDX-8065 @initBrowser @closeBrowser
#Scenario: Verify abort of a seedingRecurring Broadcast migration
#Given login
#Then navigate to precision marketer
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "CampaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then navigate to "Seedings Broadcasts" broadcasts
#Then click on BC edit button from workbook "bcInputData" sheet "seedingRecurringBCForAbort"
#Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
#Then activate bc
#Then navigate to "Seedings Broadcasts" broadcasts
#Then filter the bc from file "bcInputData" of sheet "seedingRecurringBCForAbort" for bctype "seeding"
#Then abort bc for bctype "seeding"
#Then wait until status of "seedingRecurringBCForAbort" from file "bcInputData" is "Canceled" for bctype "seeding" 
#Then navigate to "Recurring Broadcasts" broadcasts
#Then wait until status of "seedingRecurringBCForAbort" from file "bcInputData" is "Aborted" for bctype "seeding"
#Then navigate to "Triggerable Broadcasts" broadcasts
#Then wait until status of child bc of "seedingRecurringBCForAbort" is "Aborted"  
#
#
#@NDX-8067 @initBrowser @closeBrowser
#Scenario: Verify abort of a seedingoneoff Broadcast migration
#Given login
#Then navigate to precision marketer
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "CampaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then navigate to "Seedings Broadcasts" broadcasts
#Then click on BC edit button from workbook "bcInputData" sheet "seedingoneoffForAbort"
#Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
#Then activate bc
#Then navigate to "Seedings Broadcasts" broadcasts
#Then abort bc for bctype "seeding"
#Then wait until status of "seedingoneoffForAbort" from file "bcInputData" is "Canceled" for bctype "seeding" 
#Then navigate to "One-time" broadcasts
#Then wait until status of child bc of "seedingoneoffForAbort" is "Aborted"

    
    
    
#  @NDX-7128 @initBrowser
#Scenario: Verify the BC gets Completed with target condition as 
#Given login
#Then navigate to precision marketer
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then enter details for new broadcast with condition IsAnyOf from sheet "one-offBC" with "rechargeWAP"
#Then activate bc
#Then wait until status of "one-offBC" is "Targeting"
#Then wait until status of "one-offBC" is "Completed"
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  #  @NDX-DNCExclusionBC @initBrowser 
#  Scenario: Verify Creating one-off BC with DNCExclusionBC
#    Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeSMS"
#    Then activate bc
#    Then wait until status of "one-offBC" is "Completed"
#    Then provide file for conversion
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "919491750002"
#    Then click on events tab
#    Then wait for comversion event
#    Then remove file for conversion
#    Then wait for reward in consumer profile