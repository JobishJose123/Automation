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
@BroadcastCopyEdit_Regression
Feature: Test cases related to Broadcast Management Copy Edit
Copy and Editing all types of Braodcast
#########################################################################################################################
######################## BCDataVerificationDataSetup.feature should run first ###########################################
#########################################################################################################################
 
 
  @NDX-7344 @NDX-9929 @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details oneOff new
     Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "one-offBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "one-offBC" 
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "one-offBC" with "rechargeSMS" condition digitalPersonaGT15   
   
   @NDX-5928  @NDX-9937 @initBrowser @closeBrowser
   Scenario: Verify the Delivery Details BC after copy & edit Start and End Time of One-Off Bc new
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
    
    
     @NDX-5878 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit the basic detais of BC -NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "one-offBCEdit"
    Then editing the BC from sheet "one-offBCEdit" basic details With edit data from sheet "one-offBCEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "one-offBCEdit"
    Then verify the basic details from Broadcast View and data sheet "one-offBCEdit"
    
   
    @NDX-5926 @initBrowser @closeBrowser
  Scenario: Verify BC after copy & edit with offer in offer selection page
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


  @NDX-5890 @NDX-5922 @initBrowser @closeBrowser
  Scenario Outline: Verify one-off BC and edit the targetSelection <Condition>
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

 
  @NDX-5924 @NDX-5892 @initBrowser @closeBrowser
  Scenario Outline: Verify one-off BC edit with given <Condition>
#    
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

   @NDX-5888  @initBrowser @closeBrowser
  Scenario: Verify one-off BC and edit the target list details 
  
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
    
   @NDX-5930 @initBrowser @closeBrowser
  Scenario: Verify the One-Off BC Broadcast expiry after edit
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
    
    @NDX-7346 @NDX-9931  @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details TriggerOneoff -new 
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "TriggerOneoff"
    Then Save the copied BC from workbook "bcInputData" and sheet "TriggerOneoff" 
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "TriggerOneoff" with "rechargeSMS" condition digitalPersonaGT15   
   
   @NDX-6744 @NDX-9939 @initBrowser @closeBrowser
   Scenario: Verify the BC Delivery after copy & edit  Start and End Time of TriggerOneoff -NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    
    
    
     @NDNDX-6694 @initBrowser @closeBrowser
   Scenario:  Verify the BC after copy & edit the basic detais of BC TriggerOneoff -new  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then editing the BC from sheet "TriggerOneoffEdit" basic details With edit data from sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the basic details from Broadcast View and data sheet "TriggerOneoffEdit"
    
   
    @NDX-6742 @initBrowser @closeBrowser
  Scenario: Verify BC after copy & edit  with change the offer in offer selection page  TriggerOneoff-NEW
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


  @NDX-6706 @NDX-6738 @initBrowser @closeBrowser
  Scenario Outline: Verify TriggerOneoff one-off BC and edit the targetSelection <Condition>
Verify BC after edit with new Saved segment TriggerOneoff BC


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

 
  @NDX-6708 @NDX-6740 @initBrowser @closeBrowser
  Scenario Outline: Verify copy edit TriggerOneoff  with given <Condition> 
  Verify BC after copy & edit  with Existing Saved segment TriggerOneoff-new
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

   @NDX-6704  @initBrowser @closeBrowser
  Scenario: Verify the BC after copy & edit  the Base list in Target page TriggerOneoff-NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the target List in taget tab from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the BC taget List in BC View from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    
   @NDX-6746 @initBrowser @closeBrowser
  Scenario: Verify the BC after copy & edit  Broadcast expiry TriggerOneoff-new
    Given login
  When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "One-time" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerOneoffEdit"
    Then edit the offer for BC expiry After hours "2"
    Then save bc
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerOneoffEdit"
    Then verify the BC expiry in BC View After hours "2"
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then navigate to "One-time" broadcasts
#    Then click on delete from workbook "bcInputDataForEdit" and sheet "one-offBCEdit"
#    Then click on toggleAutoRefresh
     #    ************************ Seeding OneOFF BC**************   
    
    
    
     @NDX-7355 @NDX-9933 @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details Seeding one-off new
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "seedingoneoff"
    Then Save the copied BC from workbook "bcInputData" and sheet "seedingoneoff"
    Then save bc 
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "seedingoneoff" with "SeedingSMS" condition digitalPersonaGT15   
   
   @NDX-6582 @NDX-9941 @initBrowser @closeBrowser
   Scenario: Verify the BC Delivery details after copy & edit  Start and End Time of Seeding one-off bc-NEW
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    
    
     @NDX-6532 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit  the basic detais of BC  Seeding one-off bc -NEW
     Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingoneoffEdit"
    Then editing the BC from sheet "seedingoneoffEdit" basic details With edit data from sheet "seedingoneoffEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingoneoffEdit"
    Then verify the basic details from Broadcast View and data sheet "seedingoneoffEdit"
    
   
    @NDX-6580 @initBrowser @closeBrowser
  Scenario: Verify BC after copy & edit  with change the offer in offer selection page  Seeding one-off bc-NEW
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


  @NDX-6544 @NDX-6576 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding one-off BC and edit the targetSelection <Condition>
#                    Verify BC after copy & edit  with new Saved segment Seeding one-off bc(NEW)
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

 
  @NDX-6546 @NDX-6578 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding one-off BC edit with given <Condition>
#    
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

   @NDX-6542 @initBrowser @closeBrowser
  Scenario: Verify Seeding one-off BC and edit the target list details 
  Verify the BC after edit the Base list in Target page One-Off BC
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
    
   @NDX-6584 @initBrowser @closeBrowser
  Scenario: Verify Seeding the One-Off BC Broadcast expiry after edit
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
       
    @NDX-7354 @NDX-9935  @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details seedingTriggerableBC new
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "seedingTriggerableBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "seedingTriggerableBC"
    Then save bc 
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "seedingTriggerableBC" with "SeedingSMS" condition digitalPersonaGT15  
   
   @NDX-6528 @NDX-9943 @initBrowser @closeBrowser
   Scenario: Verify the BC Delivery details after copy & edit  Start and End Time of seedingTriggerableBC-new
  Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    
    
     @NDX-6478 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit  the basic detais of BC seedingTriggerableBC -NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableBCEdit"
    Then editing the BC from sheet "seedingTriggerableBCEdit" basic details With edit data from sheet "seedingTriggerableBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableBCEdit"
    Then verify the basic details from Broadcast View and data sheet "seedingTriggerableBCEdit"
    
   
    @NDX-6526 @initBrowser @closeBrowser
  Scenario: Verify BC after copy & edit  with change the offer in offer selection page seedingTriggerableBC-NEW
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


  @NDX-6490 @NDX-6522 @initBrowser @closeBrowser
  Scenario Outline: Verify seedingTriggerable BC and edit the targetSelection <Condition>
#                    Verify BC after edit with new Saved segmentseedingTriggerableBC-NEW
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

 
  @NDX-6492 @NDX-6524 @initBrowser @closeBrowser
  Scenario Outline: Verify seedingTriggerable BC edit with given <Condition>
#    Verify BC after copy & edit  with Existing Saved segment seedingTriggerableBC(NEW
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

   @NDX-6488  @initBrowser @closeBrowser
  Scenario: Verify seedingTriggerable BC and edit the target list details 
  
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
    
   @NDX-6530 @initBrowser @closeBrowser
  Scenario: Verify the BC after copy & edit  Broadcast expiry seedingTriggerableBC-NEW
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
    
    
    #************************ Seeding Recurring BC**************  
    
    
       @NDX-7348 @NDX-9934 @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details SeedingrecurringBC new
       Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "seedingRecurringBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "seedingRecurringBC" 
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "seedingRecurringBC" with "SeedingSMS" condition digitalPersonaGT15  
   
   @NDX-6690 @NDX-9942 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit Start and End Time of SeedingrecurringBC new
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    
    
     @NDX-6640 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit  the basic detais of BC  SeedingrecurringBC-NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingRecurringBCEdit"
    Then editing the BC from sheet "seedingRecurringBCEdit" basic details With edit data from sheet "seedingRecurringBCEdit"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingRecurringBCEdit"
    Then verify the basic details from Broadcast View and data sheet "seedingRecurringBCEdit"
    
   
    @NDX-6688 @initBrowser @closeBrowser
    Scenario: Verify BC after edit with offer in offer selection page SeedingrecurringBC-NEW
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


  @NDX-6652 @NDX-6684 @initBrowser @closeBrowser
  Scenario Outline: Verify Seedingrecurring BC and edit the targetSelection <Condition> 
#   Verify BC after edit with new Saved segment SeedingrecurringBC                 
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

 
  @NDX-6654 @NDX-6686 @initBrowser @closeBrowser
  Scenario Outline: Verify Seedingrecurring BC edit with given <Condition>
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

   @NDX-6650  @initBrowser @closeBrowser
  Scenario: Verify one-off BC and edit the target list details 
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
    
   @NDX-6692 @initBrowser @closeBrowser
  Scenario: Verify the SeedingrecurringBC Broadcast expiry after edit-NEW
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
    
    
    
        @NDX-7350 @NDX-9936 @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details seedingTriggerableRecurringBC new
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "seedingTriggerableRecurringBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "seedingTriggerableRecurringBC" 
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "seedingTriggerableRecurringBC" with "SeedingSMS" condition digitalPersonaGT15  
   
   @NDX-6636 @NDX-9944 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit Start and End Time of seedingTriggerableRecurringBC new
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    
    
     @NDX-6586 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit  the basic detais of BC  seedingTriggerableRecurringBC -NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Seedings Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "seedingTriggerableRecurringBCEd"
    Then editing the BC from sheet "seedingTriggerableRecurringBCEd" basic details With edit data from sheet "seedingTriggerableRecurringBCEd"
    Then save bc
    Then navigate to "Seedings Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "seedingTriggerableRecurringBCEd"
    Then verify the basic details from Broadcast View and data sheet "seedingTriggerableRecurringBCEd"
    
   
    @NDX-6634 @initBrowser @closeBrowser
  Scenario: Verify BC after edit with offer in offer selection page  seedingTriggerableRecurringBC -NEW
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


  @NDX-6598 @NDX-6630 @initBrowser @closeBrowser
  Scenario Outline: Verify seedingTriggerableRecurring BC and edit the targetSelection <Condition>
#                    Verify BC after edit with new Saved segment seedingTriggerableRecurring BC
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

 
  @NDX-6600 @NDX-6632 @initBrowser @closeBrowser
  Scenario Outline: Verify seedingTriggerableRecurring BC edit with given <Condition>
#    
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

   @NDX-6596  @initBrowser @closeBrowser
  Scenario: Verify seedingTriggerableRecurring BC and edit the target list details 
  Verify the BC after edit the Base list in Target page One-Off BC
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
    
   @NDX-6638 @initBrowser @closeBrowser
  Scenario: Verify the seedingTriggerableRecurringBC Broadcast expiry after edit
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
    
    
     @NDX-7345  @NDX-9932 @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details TriggerReccurringBC new
  
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "TriggerReccurringBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "TriggerReccurringBC" 
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "TriggerReccurringBC" with "rechargeSMS" condition digitalPersonaGT15   
   
   @NDX-6798 @NDX-9940 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit Start and End Time of TriggerReccurringBC new
  Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    
    
    
    
     @NDX-6748 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit the basic detais of TriggerReccurringBC-NEW
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "TriggerReccurringBCEdit"
    Then editing the BC from sheet "TriggerReccurringBCEdit" basic details With edit data from sheet "TriggerReccurringBCEdit"
    Then save bc
    Then navigate to "Triggerable Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "TriggerReccurringBCEdit"
    Then verify the basic details from Broadcast View and data sheet "TriggerReccurringBCEdit"
    
   
    @NDX-6796 @initBrowser @closeBrowser
  Scenario: Verify BC after edit with offer in offer selection page TriggerReccurringBC -NEW
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


  @NDX-6760 @NDX-6792 @initBrowser @closeBrowser
  Scenario Outline: Verify TriggerReccurringBC and edit the targetSelection <Condition>
#                    Verify BC after edit with new Saved segment TriggerReccurringBC
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

 
  @NDX-6762 @NDX-6794 @initBrowser @closeBrowser
  Scenario Outline: Verify TriggerReccurringBC edit with given <Condition>
#    
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

   @NDX-6758 @initBrowser @closeBrowser
  Scenario: Verify TriggerReccurringBC and edit the target list details 
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
    
   @NDX-6800 @initBrowser @closeBrowser
  Scenario: Verify the TriggerReccurringBC Broadcast expiry after edit
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
    
    
    
    
    
     @NDX-7352 @NDX-9930 @initBrowser @closeBrowser
  Scenario: Verify after copy the BC all details recurringBC new
  
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "recurringBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "recurringBC" 
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "recurringBC" with "rechargeSMS" condition digitalPersonaGT15   
   
   @NDX-6474 @NDX-9938 @initBrowser @closeBrowser
   Scenario: Verify the BC Delivery details after copy & edit Start and End Time of recurringBC new
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then edit the Delevery tab details from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then Verify the BC Delivery tab details from Broadcast View from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    
    
     @NDX-6424 @initBrowser @closeBrowser
   Scenario: Verify the BC after copy & edit the basic detais of recurringBC-NEW
    GGiven login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then navigate to "Recurring Broadcasts" broadcasts
    Then click on BC edit button from workbook "bcInputDataForEdit" sheet "recurringBCEdit"
    Then editing the BC from sheet "recurringBCEdit" basic details With edit data from sheet "recurringBCEdit"
    Then save bc
    Then navigate to "Recurring Broadcasts" broadcasts
    Then view the bc from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    Then verify the basic details from Broadcast View and data sheet "recurringBCEdit"
    
   
    @NDX-6472 @initBrowser @closeBrowser
  Scenario: Verify BC after edit with offer in offer selection page recurringBC-new
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


  @NDX-6436 @NDX-6468 @initBrowser @closeBrowser
  Scenario Outline: Verify recurringBC and edit the targetSelection <Condition>
#                    Verify BC after edit with new Saved segment recurringBC
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

 
  @NDX-6438 @NDX-6470 @initBrowser @closeBrowser
  Scenario Outline: Verify recurringBC edit with given <Condition>
#    
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

   @NDX-6434  @initBrowser @closeBrowser
  Scenario: Verify recurringBC and edit the target list details 
  Verify the BC after edit the Base list in Target page recurringBC
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
    
   @NDX-6476 @initBrowser @closeBrowser
  Scenario: Verify the recurringBC Broadcast expiry after edit
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
    
    
    
    
    
    
    @NDX-6802 @initBrowser 
  Scenario: Verify the ACK in cosnumebr profile > Check for 1  number with BC name after copy One-Off
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition SharedcustomerList from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    Then navigate to "One-time" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "one-offBC"
    Then Save the copied BC from workbook "bcInputData" and sheet "one-offBC" 
    Then activate bc
    Then wait until status of "one-offBC" is "Targeting"
     Then click on toggleAutoRefresh
    Then wait until status of "one-offBC" is "Delivering"
    Then click on toggleAutoRefresh
    Then wait until status of "one-offBC" is "Completed"
    Then click on toggleAutoRefresh
    Then click on Archive from workbook "bcInputData" and sheet "one-offBC"
#    Then view the bc from workbook "bcInputData" in sheet "one-offBC"
#    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "one-offBC" with "rechargeSMS" condition SharedcustomerList
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919491750004"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then choose all events
    Then choose Acknowledged event
    Then click on apply button
    Then verify Acknowledged event from BC Sheet "one-offBC" and "campaignBC" offer "rechargeSMS"
    
    @NDX-6804 @initBrowser
    Scenario: Verify the ACK in cosnumebr profile > Check for 1  number with BC name after copy Trigger BC NEW
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition targetGroup50 from sheet "TriggerOneoff" with "rechargeSMS"
    Then save bc
    Then navigate to "One-time" broadcasts
    Then click on BC Copy button from workbook "bcInputData" sheet "TriggerOneoff"
    Then Save the copied BC from workbook "bcInputData" and sheet "TriggerOneoff" 
    Then activate bc
    Then navigate to "One-time" broadcasts
    Then wait until status of "TriggerOneoff" is "Targeting"
    Then click on toggleAutoRefresh
    Then wait until status of "TriggerOneoff" is "Delivering"
   Then click on toggleAutoRefresh
    Then wait until status of "TriggerOneoff" is "Completed"
    Then click on toggleAutoRefresh
    Then view the bc from workbook "bcInputData" in sheet "TriggerOneoff"
    Then Verify the Copied Bc in view page workbook "bcInputData" sheet "TriggerOneoff" with "rechargeSMS" condition targetGroup50
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919491750305"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then choose all events
    Then choose Acknowledged event
    Then click on apply button
    Then verify Acknowledged event from BC Sheet "TriggerOneoff" and "campaignBC" offer "rechargeSMS"





 





    
    


#  @NDX-oneOffBcForDataSetupcount
#  @initBrowser @closeBrowser
#  Scenario Outline: Verify Creating one-off BC with given condition
#    Given login
#    When navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "campaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#    Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "rechargeSMS"
#    Then activate bc
#   Then save "bcInputData" data to spreadsheet from "one-offBC" with string one-off bc with condition: <Condition>
#     Then Save bcInputData data to registrationListInputData "WithOutDNC" from "one-offBC" with condition <Condition> 
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
#   	| SharedcustomerList             |
#	| customerDrivenEvent            |
#	| sharedMetricOtherPartner  |
#	| customerDrivenEventNotOccurred  |
#	| customerWasSentTheTrialMessageNOtOccurred |
#	|segmentAgeGT40|
    
  

    
  
  
  