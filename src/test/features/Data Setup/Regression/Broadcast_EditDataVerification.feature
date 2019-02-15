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
  
  ##Create Product class, campaign category, product
@NDX-CreateDataForEditBC @initBrowser @closeBrowser
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
@NDX-CreateAllOffersForEditBC @initBrowser 
 Scenario: Create offers with all channels for creating BC
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then create new offer from sheet "rechargeVoicePush" with product "fullDetails"
    
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then create new offer from sheet "seedingEmail" with product "fullDetails"
    Then create new offer from sheet "seedingVoicePush" with product "fullDetails"
    
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then Add "rechargeEmail" offer to Offer Catalogue
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "rechargeVoicePush" offer to Offer Catalogue
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then Add "seedingEmail" offer to Offer Catalogue
    Then Add "seedingVoicePush" offer to Offer Catalogue
  
##Create a campaign categoryScenario: Verify BC targeting using all types of target conditions with one time BC
 @NDX-CreateCampaignForEditBC @initBrowser 
 Scenario: Create offers with all channels for creating BC
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
  
  
  
  
  
  #    ************************ OneOFF BC**************
  
  

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
  Scenario: Verify one-off BC and edit the Delivery details
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
  Scenario: Verify one-off BC and edit the offer details 
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
  Scenario Outline: Verify one-off BC and edit the targetSelection <Condition>
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
   @NDX-VerifyBCTargetList @NDX-5834  @initBrowser @closeBrowser
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
    
  @NDX-VerifyBCexpiry @NDX-5930 @initBrowser
  Scenario: Verify the BC after edit Broadcast expiry One-Off BC
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
   @NDX-editingTriggerOneOffBcBasicDetails @initBrowser @closeBrowser
  Scenario: Verify Creating TriggerOne-off BC and edit the basic details
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "TriggerOneoff" with "rechargeSMS"
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
    
     @NDX-VerifyTriggeroneoffBCDeliverDetails  @initBrowser @closeBrowser
  Scenario: Verify one-off BC and edit the Delivery details
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
    
    @NDX-editTriggeroneoffBCOffer @initBrowser @closeBrowser
  Scenario: Verify TriggerOne-off BC and edit the offer details details
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
  Scenario Outline: Verify TriggerOne-off BC and edit the targetSelection <Condition>
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
  Scenario Outline: Verify TriggerOne-off BC Edit with given <Condition>
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

   @NDX-VerifyTriggeroneoffBcTargetList @initBrowser @closeBrowser
  Scenario: Verify TriggerOne-off BC and edit the target list details
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
  Scenario: Verify TriggerOne-off BC and edit the offer details details
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
    
    
    @NDX-editSeedingOneOffForDataSetup  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding one-offBC
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingoneoff" with "SeedingSMS" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputData" in sheet "seedingoneoff"
	Then verify the basic details before editing the BC data from sheet "seedingoneoff" 
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
	
    
    
    
     @NDX-VerifySeedingBCDeliverDetails @NDX-5874 @initBrowser @closeBrowser
  Scenario: Verify seeding one-off BC and edit the Delivery details
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
    
    
    
    
    
    
     @NDX-VerifySeedingOneoffBCOffer @NDX-5872 @initBrowser @closeBrowser
  Scenario: Verify Seeding one-off BC edit the offer details 
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


  @NDX-targetSelectionSeedingoneoffBC @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding one-off BC and edit the targetSelection <Condition>
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

 
  @NDX-editingSeedingoneoffBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding one-off BC edit with given <Condition>
#    NDX-5826,NDX-5827,NDX-5828,NDX-5829,NDX-5838,NDX-5840,NDX-5842,NDX-5844,NDX-5846,NDX-5848,NDX-5850,NDX-5852,NDX-5854,NDX-5856,NDX-5858,NDX-5860,NDX-5862,NDX-5864,NDX-5866,NDX-5870
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


   @NDX-VerifyseedingoneoffBCTargetList   @initBrowser @closeBrowser
  Scenario: Verify Seeding one-off BC and edit the target list details
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
    
  @NDX-VerifyseedingBCexpiry  @initBrowser @closeBrowser
  Scenario: Verify the Seeding one off BC after edit Broadcast expiry 
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
    
    
  @NDX-editSeedingTrigForDataSetup  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding triggarable BC
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingTriggerableBC" with "SeedingSMS" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputData" in sheet "seedingTriggerableBC"
	Then verify the basic details before editing the BC data from sheet "seedingTriggerableBC" 
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
	
        
    
     @NDX-VerifySeedingTrigBCDeliverDetails  @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable BC and edit the Delivery details
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
    
    
    
    
    
    
     @NDX-VerifySeedingTrigBCOffer @NDX-5872 @initBrowser @closeBrowser
  Scenario: Verify Seeding Triggerable BC edit the offer details 
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


  @NDX-targetSelectionSeedingTrigBC @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Trggerable BC and edit the targetSelection <Condition>
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

 
  @NDX-editingSeedingTrigBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Trggerable BC edit with given <Condition>
#    NDX-5826,NDX-5827,NDX-5828,NDX-5829,NDX-5838,NDX-5840,NDX-5842,NDX-5844,NDX-5846,NDX-5848,NDX-5850,NDX-5852,NDX-5854,NDX-5856,NDX-5858,NDX-5860,NDX-5862,NDX-5864,NDX-5866,NDX-5870
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


   @NDX-VerifyseedingTrigBCTargetList   @initBrowser @closeBrowser
  Scenario: Verify Seeding triggerable BC and edit the target list details
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
    
  @NDX-VerifyseedingTrigBCexpiry  @initBrowser @closeBrowser
  Scenario: Verify the Seeding Triggerable BC after edit Broadcast expiry 
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
    
    
    @NDX-editSeedingRecurForDataSetup  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding Recurring
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingRecurringBC" with "SeedingSMS" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputData" in sheet "seedingRecurringBC"
	Then verify the basic details before editing the BC data from sheet "seedingRecurringBC" 
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
	
    
    
    
     @NDX-VerifySeedingRecurBCDeliverDetails  @initBrowser @closeBrowser
  Scenario: Verify seeding Recurring BC and edit the Delivery details
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
    
    
    
    
    
    
     @NDX-VerifySeedingRecurBCOffer @NDX-5872 @initBrowser @closeBrowser
  Scenario: Verify Seeding Recurring BC edit the offer details 
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


  @NDX-targetSelectionSeedingRecurBC @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Recurring BC and edit the targetSelection <Condition>
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

 
  @NDX-editingSeedingRecurBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Recurring BC edit with given <Condition>
#    NDX-5826,NDX-5827,NDX-5828,NDX-5829,NDX-5838,NDX-5840,NDX-5842,NDX-5844,NDX-5846,NDX-5848,NDX-5850,NDX-5852,NDX-5854,NDX-5856,NDX-5858,NDX-5860,NDX-5862,NDX-5864,NDX-5866,NDX-5870
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


   @NDX-VerifyseedingRecurBCTargetList   @initBrowser @closeBrowser
  Scenario: Verify Seeding Recurring BC and edit the target list details
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
    
  @NDX-VerifyseedingRecurBCexpiry  @initBrowser @closeBrowser
  Scenario: Verify the Seeding Recurring BC after edit Broadcast expiry 
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
    
    
    @NDX-editSeedingTrigRecurForDataSetup  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of seeding Triggerable Recurring BC
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "seedingTriggerableRecurringBC" with "SeedingSMS" 
	Then save bc 
	Then navigate to "Seedings Broadcasts" broadcasts
	Then view the bc from workbook "bcInputData" in sheet "seedingTriggerableRecurringBC"
	Then verify the basic details before editing the BC data from sheet "seedingTriggerableRecurringBC" 
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
	
    
    
    
     @NDX-SeedingTrigRecurBCDeliverDetails  @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC and edit the Delivery details
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
    
    
    
    
    
    
     @NDX-VerifySeedingTrigRecurBCOffer  @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC edit the offer details 
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


  @NDX-targetSelectionSeedTrigRecurBC @initBrowser @closeBrowser
  Scenario Outline: Verify seeding Triggerable Recurring BC and edit the targetSelection <Condition>
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

 
  @NDX-editSeedingTrigRecurBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify seeding Triggerable Recurring BC edit with given <Condition>
#    NDX-5826,NDX-5827,NDX-5828,NDX-5829,NDX-5838,NDX-5840,NDX-5842,NDX-5844,NDX-5846,NDX-5848,NDX-5850,NDX-5852,NDX-5854,NDX-5856,NDX-5858,NDX-5860,NDX-5862,NDX-5864,NDX-5866,NDX-5870
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


   @NDX-VerifyseedingTrigRecurBCTargetList   @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC and edit the target list details
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
    
  @NDX-VerifyseedingTrigRecurBCexpiry  @initBrowser @closeBrowser
  Scenario: Verify the seeding Triggerable Recurring BC after edit Broadcast expiry 
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
    
    
    @NDX-editTriggerRecurForDataSetup  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Trigger Recurring BC
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "TriggerReccurringBC" with "rechargeSMS" 
	Then save bc 
	Then navigate to "Triggerable Broadcasts" broadcasts
	Then view the bc from workbook "bcInputData" in sheet "TriggerReccurringBC"
	Then verify the basic details before editing the BC data from sheet "TriggerReccurringBC" 
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
	
    
    
    
     @NDX-TriggerRecurBCDeliverDetails  @initBrowser @closeBrowser
  Scenario: Verify  Trigger Recurring BC and edit the Delivery details
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
    
    
    
    
    
    
     @NDX-VerifyTriggerRecurBCOffer  @initBrowser 
  Scenario: Verify Trigger Recurring BC edit the offer details 
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


  @NDX-targetSelectionTriggerRecurBC @initBrowser @closeBrowser
  Scenario Outline: Verify Trigger Recurring BC and edit the targetSelection <Condition>
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

 
  @NDX-editTriggerRecurBcTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Trigger Recurring BC edit with given <Condition>
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


   @NDX-VerifyTriggerRecurBCTargetList   @initBrowser @closeBrowser
  Scenario: Verify Trigger Recurring BC and edit the target list details
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
    
  @NDX-VerifyTriggerRecurBCexpiry  @initBrowser @closeBrowser
  Scenario: Verify the Trigger Recurring BC after edit Broadcast expiry 
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
    
    
    @NDX-editRecurringBCForDataSetup  @initBrowser
  Scenario: Verify Creating and editing the basic details of Recurring BC
  Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" 
	Then save bc 
	Then navigate to "Recurring Broadcasts" broadcasts
	Then view the bc from workbook "bcInputData" in sheet "recurringBC"
	Then verify the basic details before editing the BC data from sheet "recurringBC" 
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
	
    
    
    
     @NDX-RecurringBCDeliverDetails  @initBrowser @closeBrowser
  Scenario: Verify Recurring BC and edit the Delivery details
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
    
    
    
    
    
    
     @NDX-VerifyRecurringBCOffer  @initBrowser 
  Scenario: Verify Recurring BC edit the offer details 
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


  @NDX-targetSelectionRecurringBC @initBrowser @closeBrowser
  Scenario Outline: Verify Recurring BC and edit the targetSelection <Condition>
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

 
  @NDX-editRecurringBCTargetDetails @initBrowser @closeBrowser
  Scenario Outline: Verify Recurring BC edit with given <Condition>
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


   @NDX-VerifyRecurringBCTargetList   @initBrowser @closeBrowser
  Scenario: Verify Recurring BC and edit the target list details
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
    
  @NDX-VerifyRecurringBCexpiry  @initBrowser @closeBrowser
  Scenario: Verify the Trigger Recurring BC after edit Broadcast expiry 
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
  
  @NDX-VerifyRecurringBCChilds  @initBrowser 
  Scenario: Verify Recurring Bc child BCs Dates
   Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
	Then click create new broadcast button 
	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" 
    Then save bc
#    Then verify the Child BC count and recurring dates from workbook "bcInputDataForEdit" in sheet "recurringBCEdit"
    
    
  
  
  
  @NDX-7128 @initBrowser
Scenario: Verify the BC gets Completed with target condition as 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition IsAnyOf from sheet "one-offBC" with "rechargeWAP"
Then activate bc
Then wait until status of "one-offBC" is "Targeting"
Then wait until status of "one-offBC" is "Completed"
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
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