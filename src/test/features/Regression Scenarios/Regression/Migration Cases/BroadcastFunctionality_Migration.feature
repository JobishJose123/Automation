#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionalityMigration 
Feature: For broadcast functionality check for Migration cases 


# Verify calculate Option for Migration BCs*******************

@NDX-10075 @initBrowser 
Scenario: Verify calculate option for  migrated one off BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "one-offBC" 
	
	
@NDX-10077 @initBrowser 
Scenario: Verify calculate option for  migrated triggerable one off BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "TriggerOneoff" 
	
@NDX-10081 @initBrowser 
Scenario: Verify calculate option for  migrated triggerable recurring BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "TriggerReccurringBC" 
	
@NDX-10079 @initBrowser 
Scenario: Verify calculate option for  migrated recurring BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "recurringBC" 
	
@NDX-10076 @initBrowser 
Scenario: Verify calculate option for  migrated seeding one off BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingoneoff" 
	
@NDX-10080 @initBrowser 
Scenario: Verify calculate option for  migrated seeding recurring BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingRecurringBC" 
	
@NDX-10078 @initBrowser 
Scenario: Verify calculate option for  migrated seeding triggerable one off BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingTriggerableBC" 
	
@NDX-10082 @initBrowser 
Scenario: Verify calculate option for  migrated seeding triggerabel recurring BC 
	Given login 
	Then navigate to precision marketer 
	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingTriggerableRecurringBC" 
	
@activateInventoryBCsMigration @initBrowser @closeBrowser 
Scenario: Activating the bcs 
	Given login 
	Then navigate to precision marketer 
	Then activate and verify the broadcast from workbook "parallelRunBC" and sheet "parallelRunBC" 
	Then wait for 4000 milliseconds 
	
	
	#*********************** Braodcast Limits****************************
	
@NDX-10093 @initBrowser 
Scenario: Verify limit for migrated BC's 
	Given login 
	Then navigate to precision marketer 
	Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC" 
	
	
	
	#**************/\********************* Verify reward bc`s***********/\**************
	
@ActivateCreatedRewardbcsMig @initBrowser 
Scenario: Activate the reward bcs and raise the conversion job 
	Given login 
	Then navigate to precision marketer 
	Then activate and raise the conversion job the broadcast from workbook "parallelRunBC" and sheet "rewardBcs" 
	
@VerifyAckEventBcsMIG @initBrowser 
Scenario: Verify Ack event for activated reward bcs 
	Then verify the acknowledgement of Bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009" 
	
@verifyConversionEventMIG @NDX-9804 @NDX-9805 @initBrowser 
Scenario: Verify the Conversion event for activated reard bcs 
	Then verify the Conversion event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009" 
	
@NDX-9804 @initBrowser 
Scenario:
Verify fulfillemnt event for reward bcs for one rule one reward and unique conversion with rule based 
	Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"9491750009" 
	Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "Text" and rewardType "oneruleonereward" with MSISDN"9491750009" 
	
@NDX-10242 @NDX-10241 @initBrowser 
Scenario:
Verify fulfillemnt event for reward bcs for one rule one multiple rewards and unique conversion with rule based 
	Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "onerulemultiplerewards" and MSISDN"9491750009" 
	Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "Text" and rewardType "onerulemultiplerewards" with MSISDN"9491750009" 
	
	
	
