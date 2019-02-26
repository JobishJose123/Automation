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
@AllBc_Edit_DataSetupMigration
Feature: Test suite for Broadcast Editing for Migration
  Editing all types of Braodcast
  
  ##Create Product class, campaign category, product
@NDX-CreateDataForEditBCMigration @initBrowser @closeBrowser
  Scenario: Verify BC targeting using all types of target conditions with one time BC Migration
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
@NDX-CreateAllOffersForEditBCMigration @initBrowser 
 Scenario: Create offers with all channels for creating BC Migration
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
 @NDX-CreateCampaignForEditBCMigration @initBrowser 
 Scenario: Create offers with all channels for creating BC Migration
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
  
  
  
  
  
  #    ************************ OneOFF BC**************
  
  

  @NDX-5802 @initBrowser @closeBrowser
  Scenario: Verify the BC after edit the basic detais of One-offBC Migration
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

  @NDX-5875 @initBrowser
  Scenario: Verify one-off BC and edit the Delivery details , Verify the BC after edit Start and End Time of One-Off Bc Migration
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

 
  @NDX-5830 @NDX-5831 @NDX-5832 @NDX-5833 @NDX-5839 @NDX-5847 @NDX-5851 @NDX-5855 @NDX-5867 @NDX-5871 @NDX-6383 @NDX-6385 @initBrowser @closeBrowser
  Scenario Outline: Verify one-off BC edit with given <Condition> Migration
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
   @NDX-6205 @initBrowser @closeBrowser
  Scenario: Verify Creating TriggerOne-off BC and edit the basic details Migration
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
    
     @NDX-6255 @initBrowser @closeBrowser
  Scenario: Verify Trigger one-off BC and edit the Delivery details Migration
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
    
    
    @NDX-6041  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding one-offBC Migration
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
	
    
    
    
     @NDX-6093 @initBrowser @closeBrowser
  Scenario: Verify seeding one-off BC and edit the Delivery details Migration
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
    
    
  @NDX-5987 @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding triggarable BC Migration
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
	
        
    
     @NDX-6037  @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable BC and edit the Delivery details Migration
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
    
    
    @NDX-6151  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Seeding Recurring Migration
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
	
    
    
    
     @NDX-6201  @initBrowser @closeBrowser
  Scenario: Verify seeding Recurring BC and edit the Delivery details Migration
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

 
  @NDX-6156 @NDX-6157 @NDX-6158 @NDX-6159 @NDX-6165 @NDX-6173 @NDX-6177 @NDX-6181 @NDX-6193 @NDX-6197 @NDX-6403 @NDX-6405 @initBrowser @closeBrowser
  Scenario Outline: Verify Seeding Recurring BC edit with given <Condition> Migration

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
    
    
    @NDX-6097  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of seeding Triggerable Recurring BC Migration
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
	
    
    
    
     @NDX-6147 @initBrowser @closeBrowser
  Scenario: Verify seeding Triggerable Recurring BC and edit the Delivery details Migration
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
    
    
    @NDX-6259  @initBrowser @closeBrowser
  Scenario: Verify Creating and editing the basic details of Trigger Recurring BC Migration
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
	
    
    
    
     @NDX-6309 @initBrowser @closeBrowser
  Scenario: Verify  Trigger Recurring BC and edit the Delivery details Migration
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

 
  @NDX-6264 @NDX-6265 @NDX-6266 @NDX-6267 @NDX-6273 @NDX-6281 @NDX-6285 @NDX-6289 @NDX-6301 @NDX-6305 @NDX-6311 @NDX-6411 @NDX-6413 @initBrowser @closeBrowser
  Scenario Outline: Verify Trigger Recurring BC edit with given <Condition> Migration
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
    
    
    @NDX-5933 @initBrowser
  Scenario: Verify Creating and editing the basic details of Recurring BC Migration
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
	
    
    
    
     @NDX-5983  @initBrowser @closeBrowser
  Scenario: Verify Recurring BC and edit the Delivery details Migration
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
  
  @NDX-VerifyRecurringBCChildsMigration @initBrowser 
Scenario: Verify Recurring Bc child BCs Dates Migration
	Given login 
	When navigate to precision marketer 
	Then navigate to life cycle marketing 
	Then navigate to campaign category from sheet "campaignCategory" 
	Then naigate to "campaignBC" campaign view broadcasts 
#	Then click create new broadcast button 
#	Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringBC" with "rechargeSMS" 
#	Then activate bc
	Then verify the Child BC count and recurring dates from workbook "bcInputData" in sheet "recurringBC"
    
    
  
  
  
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