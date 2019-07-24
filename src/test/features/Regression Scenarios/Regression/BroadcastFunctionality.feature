#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionality
Feature: For broadcast functionality check

    @activateInventoryBCs @initBrowser @closeBrowser 
	Scenario: Activating the bcs 
	Given login 
	Then navigate to precision marketer 
	Then activate and verify the broadcast from workbook "parallelRunBC" and sheet "parallelRunBC" 
	Then wait for 4000 milliseconds 
    
    
#    ********************** Verifying The INVENTORY    ********************
    
    @NDX-9000 @initBrowser
    Scenario: Verify Black out Rule and frequency limit by creating 4 types of BCs with Black out Always-NEW
    Given login
    Then navigate to precision marketer
    Then verify the inventory "BlackoutAlways" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
    
    @NDX-9002 @initBrowser
    Scenario: Verify OneperDay and frequency limit by creating 4 types of BCs with OneperDay-NEW
    Given login
    Then navigate to precision marketer
    Then verify the inventory "OneperDay" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
    
    @NDX-8998 @initBrowser
    Scenario: Verify Unlimited and frequency limit by creating 4 types of BCs with Unlimited-NEW
    Given login
    Then navigate to precision marketer
    Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
   
 
 #    ************Verify Bc limits***************************************************
   @NDX-9977 @initBrowser
   Scenario: Verify the limit recipints option for the BCs
   Given login
   Then navigate to precision marketer
   Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"



#*********************** Verify Calculate Option ******************************

@NDX-9969 @initBrowser @closeBrowser
Scenario Outline: Verify the calculate option for the BCs <BcSheet>
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "<BcSheet>"
Examples:
|BcSheet|
|recurringBC|
|one-offBC|
|TriggerOneoff|
|TriggerReccurringBC|
|seedingoneoff|
|seedingTriggerableBC|
|seedingRecurringBC|
|seedingTriggerableRecurringBC|
    

#**************/\********************* Verify reward bc`s***********/\**************

@ActivateCreatedRewardbcs @initBrowser
Scenario: Activate the reward bcs and raise the conversion job
Given login 
Then navigate to precision marketer 
Then activate and raise the conversion job the broadcast from workbook "parallelRunBC" and sheet "rewardBcs"

@VerifyAckEventBcs @initBrowser
Scenario: Verify Ack event for activated reward bcs 
Then verify the acknowledgement of Bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009"

@verifyConversionEvent @initBrowser
Scenario: Verify the Conversion event for activated reard bcs
Then verify the Conversion event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with MSISDN"9491750009"

 @NDX-8939  @initBrowser
Scenario: Verify fulfillemnt event for reward bcs for one rule one reward and unique conversion with rule based 
Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"9491750009"
Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "Text" and rewardType "oneruleonereward" with MSISDN"9491750009"
 
 @NDX-8941  @initBrowser
Scenario: Verify fulfillemnt event for reward bcs for one rule one multiple rewards and unique conversion with rule based 
Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "onerulemultiplerewards" and MSISDN"9491750009"
Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "Text" and rewardType "onerulemultiplerewards" with MSISDN"9491750009" 




    
    
    
    
    #=====================================================================================================================================#

@NDX-ActivateBC  @initBrowser
Scenario: Activate all the bc in the BCStorageSheet
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then activate broadcast from workbook "parallelRunBC" and sheet "BCDataStorage"


@NDX-8573 @NDX-8603 @NDX-8624 @NDX-8797 @NDX-7039 @NDX-1000  @initBrowser 
Scenario: Verify the ack ,channel SMS,dr count,CG count and Target condition: profilefieldNV of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "1" and column "1" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait until status of "one-offBC" is "Completed"
Then verify the ack count with target condition profilefieldNV from sheet "targetConditionCount" for bc from sheet "one-offBC" of bctype "onetime"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the target count with condition profilefieldNV from sheet "targetConditionCount" also the channel "SMS"
Then navigate to reports
Then navigate to broadcast reports
Then verify the dr count with condition profilefieldNV from sheet "targetConditionCount" of the bc from sheet "one-offBC" from bc report
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750010"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-8659 @NDX-8776 @NDX-7047 @NDX-10013 @initBrowser
Scenario: Verify the ack ,channel WAP,multiple creative Target condition: customerList of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "2" and column "1" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait until status of "one-offBC" is "Completed"
Then verify the ack count with target condition customerList from sheet "targetConditionCount" for bc from sheet "one-offBC" of bctype "onetime"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the target count with condition customerList from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-8633 @NDX-7035 @NDX-10010  @initBrowser 
Scenario: Verify the ack ,channel email Target condition: usageMetric of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "3" and column "1" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait until status of "onetime" is "Completed"
Then verify the ack count with target condition usageMetric from sheet "targetConditionCount" for bc from sheet "one-offBC" of bctype "onetime"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the target count with condition usageMetric from sheet "targetConditionCount" also the channel "Email"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"

@NDX-9006 @NDX-8730 @NDX-10016 @initBrowser
Scenario: Verify the ack ,dynamic tag and Target condition: sharedMetricOtherPartner of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "4" and column "1" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then wait until status of "one-offBC" is "Completed"
Then verify the ack count with target condition sharedMetricOtherPartner from sheet "targetConditionCount" for bc from sheet "one-offBC" of bctype "onetime"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the target count with condition sharedMetricOtherPartner from sheet "targetConditionCount" also the channel "SMS"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then verify the dynamic tag "25.0"

@NDX-8576 @NDX-8616  @NDX-8627 @NDX-7040 @NDX-9015 @NDX-8961 @NDX-8799 @NDX-8805 @NDX-9970 @NDX-10015 @NDX-9797 @NDX-9795 @initBrowser
Scenario: Verify the ack ,channel SMS,multiple creative ,dr count,CG count of a recurrence pattern DAILY of recurringbc and Target condition: segmentAgeGT40
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurrBCDaily"
Then edit deliver tab with end "At" target render time "realTime" and broadcast expiry as "after" from sheet "recurrBCDaily"
Then activate bc
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "onetime"
Then verify the date for child bc from sheet "recurrBCDaily" with recurrence pattern "DAILY"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Completed" for bctype "seeding"
Then verify the ack count with target condition segmentAgeGT40 from sheet "targetConditionCount" for bc from sheet "recurrBCDaily" of bctype "recurringWithEndAt"
Then view broadcast for "RecurringChildOptionIconAt" for bctype "onetime"
Then verify the target count with condition segmentAgeGT40 from sheet "targetConditionCount" also the channel "SMS"
Then navigate to reports
Then navigate to broadcast reports
Then verify the dr count with condition segmentAgeGT40 from sheet "targetConditionCount" of the bc from sheet "recurrBCDaily" from bc report
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750017"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"


@NDX-7048 @NDX-8964 @NDX-8811 @NDX-9800 @NDX-9796  @initBrowser
Scenario: Verify the channel WAP and recurrence pattern EVERY WEEK 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCWeekly" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurrBCWeekly"
Then edit deliver tab with end "At" target render time "realTime" and broadcast expiry as "after" from sheet "recurrBCDaily"
Then activate bc
Then filter the bc from file "bcInputData" of sheet "recurrBCWeekly" for bctype "onetime" 
Then verify the date for child bc from sheet "recurrBCWeekly" with recurrence pattern "EVERY WEEK"
Then wait until status of "recurrBCWeekly" from file "bcInputData" is "Completed" for bctype "recurring"
Then view broadcast for "recurringchildbc" for bctype "onetime"
#Then verify the target count with condition Acknowlegedment from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750017"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "recurrBCWeekly" for the campaign from sheet "campaignBC"

@NDX-7036 @NDX-8809 @NDX-9799 @initBrowser
Scenario: Verify the channel email and recurrence pattern SPECIAL DAY OF THE WEEK
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringMonthSpecialBC" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurringMonthSpecialBC"
Then edit deliver tab with end "At" target render time "realTime" and broadcast expiry as "after" from sheet "recurringMonthSpecialBC"
Then activate bc
Then filter the bc from file "bcInputData" of sheet "recurringMonthSpecialBC" for bctype "onetime" 
Then verify the date for child bc from sheet "recurringMonthSpecialBC" with recurrence pattern "SPECIAL DAY OF THE WEEK"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition Acknowlegedment from sheet "targetConditionCount" also the channel "Email"

@NDX-8807 @NDX-9008 @NDX-10018 @NDX-9798 @initBrowser
Scenario: Verify recurrence pattern EVERY 2 DAYS and target condition: SharedcustomerList of recurringbc
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringBC" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurringBC"
Then edit deliver tab with end "At" target render time "realTime" and broadcast expiry as "after" from sheet "recurringBC"
Then activate bc
Then filter the bc from file "bcInputData" of sheet "recurringBC" for bctype "onetime"
Then verify the date for child bc from sheet "recurringBC" with recurrence pattern "EVERY 2 DAYS"
Then wait until status of recurring child bc from sheet "recurringBC" is "Completed" 
Then verify the ack count with target condition SharedcustomerList from sheet "targetConditionCount" for bc from sheet "recurringBC" of bctype "recurring"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition SharedcustomerList from sheet "targetConditionCount" also the channel "SMS"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "recurringBC" for the campaign from sheet "campaignBC"
Then verify the dynamic tag "selenium6"

@NDX-8578 @NDX-8617 @NDX-7041 @NDX-8803 @NDX-8744 @NDX-10017 @initBrowser
Scenario: Verify the ack ,channel SMS,dr count,CG count and Target condition: sharedEventOtherPartner of a seeding one-timebc     
Then filter the bc from sheet "BCDataStorage" from row "5" and column "1" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then wait until status of "seedingoneoff" is "Completed"
Then verify the ack count with target condition sharedEventOtherPartner from sheet "targetConditionCount" for bc from sheet "seedingoneoff" of bctype "seedingonetime"
Then view broadcast for "seedingonetime" for bctype "onetime"
Then navigate to reports
Then navigate to broadcast reports
Then verify the dr count with condition sharedEventOtherPartner from sheet "targetConditionCount" of the bc from sheet "seedingoneoff" from bc report
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"

@NDX-7049 @NDX-8795 @NDX-8644 @NDX-10011  @initBrowser
Scenario: Verify the ack ,channel WAP,multiple creative and target condition: customerDrivenEvent of seedingoneoff bc
Then filter the bc from sheet "BCDataStorage" from row "6" and column "1" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait until status of "one-offBC" is "Completed"
Then verify the ack count with target condition customerDrivenEvent from sheet "targetConditionCount" for bc from sheet "seedingoneoff" of bctype "seedingonetime"
Then view broadcast for "seedingonetime" for bctype "onetime"
Then verify the target count with condition customerDrivenEvent from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"

@NDX-7037 @NDX-8654 @NDX-10014 @initBrowser
Scenario: Verify the ack ,channel email and target condition: customerDrivenEventNotOccurred 
Then filter the bc from sheet "BCDataStorage" from row "7" and column "1" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingoneoff" for bctype "onetime"
Then wait until status of "one-offBC" is "Completed"
Then verify the ack count with target condition customerDrivenEventNotOccurred from sheet "targetConditionCount" for bc from sheet "seedingoneoff" of bctype "seedingonetime"
Then view broadcast for "seedingonetime" for bctype "onetime"
Then verify the target count with condition customerDrivenEventNotOccurred from sheet "targetConditionCount" also the channel "Email"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
   
@NDX-9012 @initBrowser   
Scenario: Verify the ack ,dynamic tag 
Then filter the bc from sheet "BCDataStorage" from row "8" and column "1" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingoneoff" for bctype "onetime"
Then wait until status of "seedingoneoff" is "Completed"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then verify the dynamic tag "selenium6"


@NDX-8606 @NDX-8623 @NDX-8801 @NDX-7042 @initBrowser
Scenario: Verify the ack ,channel SMS,dr count,CG count of seeding recurringbc
Then filter the bc from sheet "BCDataStorage" from row "9" and column "1" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seeding" 
Then verify the ack count with target condition Acknowledgement from sheet "targetConditionCount" for bc from sheet "seedingRecurringBC" of bctype "seedingRecurring"
Then view broadcast for "seedingRecurring" for bctype "onetime"
Then verify the target count with condition Acknowledgement from sheet "targetConditionCount" also the channel "SMS"
Then navigate to reports
Then navigate to broadcast reports
Then verify the dr count with condition drCount from sheet "targetConditionCount" of the bc from sheet "seedingRecurringBC" from bc report
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"

@NDX-7050 @NDX-8788 @initBrowser
Scenario: Verify the channek WAP,dynamic tag usage for a seeding Recurring bc
Then filter the bc from sheet "BCDataStorage" from row "10" and column "1" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seeding" 
Then view broadcast for "seedingRecurring" for bctype "onetime"
Then verify the target count with condition Acknowledgement from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
     
@NDX-7038 @initBrowser
Scenario: Verify the channel email for the seeding recurring bc
Then filter the bc from sheet "BCDataStorage" from row "11" and column "1" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seeding" 
Then view broadcast for "seedingRecurring" for bctype "onetime"
Then verify the target count with condition Acknowledgement from sheet "targetConditionCount" also the channel "WAP"

@NDX-9010 @initBrowser
Scenario: Verify the dynamic tag usage for a seeding recurring bc
Then filter the bc from sheet "BCDataStorage" from row "12" and column "1" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seeding" 
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowleged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
Then verify the dynamic tag "FlyTXT 286"





