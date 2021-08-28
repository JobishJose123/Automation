#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionality
Feature: For broadcast functionality check
ditio#
#**************/\********************* Verify reward bc`s***********/\**************

#@ActivateCreatedRewardbcs @initBrowser @closeBrowser
#Scenario Outline: Activate the reward bcs and raise the conversion job
#Given login 
#Then navigate to precision marketer 
#Then activate and raise the conversion job the broadcast from workbook "<storedWB>" and sheet "<storedSheet>" and bcSheetName "<bcsheet>"
##
#Examples:
#|storedWB|storedSheet|bcsheet|
#|parallelRunBC|rewardBcs|recurringBC|
#|parallelRunBC|rewardBcs|one-offBC|
#|parallelRunBC|rewardBcs|seedingoneoff|
#|parallelRunBC|rewardBcs|seedingRecurringBC|
#|parallelRunBC|rewardBcs|TriggerOneoff|
#|parallelRunBC|rewardBcs|TriggerReccurringBC|
#|parallelRunBC|rewardBcs|seedingTriggerableRecurringBC|
#|parallelRunBC|rewardBcs|seedingTriggerableBC|
#|parallelRunBC|UsageBasedConversion|one-offBC|
#|parallelRunBC|UsageBasedConversion|seedingoneoff|
#|parallelRunBC|UsageBasedConversion|recurringBC|
#|parallelRunBC|UsageBasedConversion|seedingRecurringBC|
#|parallelRunBC|UsageBasedConversion|TriggerOneoff|
#|parallelRunBC|UsageBasedConversion|TriggerReccurringBC|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableRecurringBC|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableBC|
#
#
#
#
#@VerifyAckEventBcs @initBrowser @closeBrowser
#Scenario Outline: Verify Ack event for activated reward bcs 
#Given login 
#Then navigate to precision marketer 
#Then verify the acknowledgement of Bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|rewardBcs|recurringBC|919491750049|
#|parallelRunBC|rewardBcs|one-offBC|919491750057|
#|parallelRunBC|rewardBcs|seedingoneoff|919491750225|
#|parallelRunBC|rewardBcs|seedingRecurringBC|919491750325|
#|parallelRunBC|rewardBcs|TriggerOneoff|919491750103|
#|parallelRunBC|rewardBcs|TriggerReccurringBC|919491750103|
#|parallelRunBC|rewardBcs|seedingTriggerableBC|919491750103|
#|parallelRunBC|rewardBcs|seedingTriggerableRecurringBC|919491750103|
#|parallelRunBC|UsageBasedConversion|one-offBC|919491750054|
#|parallelRunBC|UsageBasedConversion|seedingoneoff|919491750245|
#|parallelRunBC|UsageBasedConversion|recurringBC|9491750045|
#|parallelRunBC|UsageBasedConversion|seedingRecurringBC|9491750345|
#|parallelRunBC|UsageBasedConversion|TriggerOneoff|9491750128|
#|parallelRunBC|UsageBasedConversion|TriggerReccurringBC|9491750168|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableRecurringBC|9491750358|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableBC|9491750258|
#
#@verifyConversionEvent @NDX-9834 @NDX-9833 @NDX-9832 @NDX-9831 @NDX-9830 @NDX-9829 @NDX-9828 @NDX-9835 @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for recharge based conversion activated reward bcs
#Given login 
#Then navigate to precision marketer 
#Then verify the Conversion event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|rewardBcs|recurringBC|919491750103|
#|parallelRunBC|rewardBcs|one-offBC|919491750152|
#|parallelRunBC|rewardBcs|seedingoneoff|919491750353|
#|parallelRunBC|rewardBcs|seedingRecurringBC|919491750103|
#|parallelRunBC|rewardBcs|TriggerOneoff|919491750103|
#|parallelRunBC|rewardBcs|TriggerReccurringBC|919491750103|
#|parallelRunBC|rewardBcs|seedingTriggerable|919491750103|
#|parallelRunBC|rewardBcs|seedingTriggerableRecurringBC|919491750103|
#
#
#@verifyUsageBasedConversionEvent @NDX-9843 @NDX-9842 @NDX-9841 @NDX-9840 @NDX-9839 @NDX-9838 @NDX-9837 @NDX-9836 @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for Usage based conversion activated reward bcs
#Given login 
#Then navigate to precision marketer 
#Then verify the Conversion event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|UsageBasedConversion|recurringBC|919491750103|
#|parallelRunBC|UsageBasedConversion|one-offBC|919491750152|
#|parallelRunBC|UsageBasedConversion|seedingoneoff|919491750353|
#|parallelRunBC|UsageBasedConversion|seedingRecurringBC|919491750103|
#|parallelRunBC|UsageBasedConversion|TriggerOneoff|919491750103|
#|parallelRunBC|UsageBasedConversion|TriggerReccurringBC|919491750103|
#|parallelRunBC|UsageBasedConversion|seedingTriggerable|919491750103|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableRecurringBC|919491750103|
#
#
#
#
# @NDX-8939 @NDX-10254 @initBrowser
#Scenario: Verify fulfillemnt event for reward bcs for one rule one reward and unique conversion with rule based 
#Verify fulfillment sucess is happening for one-off BCs
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750155" with bctype "one-off"
#Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "Text" and rewardType "oneruleonereward" with MSISDN"9491750009"
# 
# @NDX-10258 @initBrowser
#Scenario: Verify fulfillment sucess is happening for seeding one off BCs 
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750256" with bctype "seedingoneoff"
#
# @NDX-10255 @initBrowser
#Scenario: Verify fulfillment sucess is happening for recurring  BCs 
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750155" with bctype "recurring"
##
#
# @NDX-10259 @initBrowser
#Scenario: Verify fulfillment sucess is happening for seeding recurring BCs
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750365" with bctype "seedingRecurring"
##
#
# @NDX-10257 @initBrowser
#Scenario: Verify fulfillment sucess is happening for trigger recur BCs 
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750155" with bctype "TriggerReccurringBC"
##
#
# @NDX-10260 @initBrowser
#Scenario: Verify fulfillment sucess is happening for Seeding trigger one off BCs
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750155" with bctype "seedingTriggerable"
##
#
# @NDX-10256 @initBrowser
#Scenario: Verify fulfillment sucess is happening for trigger-one-off BCs
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750155" with bctype "TriggerOneoff"
##
#
# @NDX-10261 @initBrowser
#Scenario: Verify fulfillment sucess is happening for seedng trigger recurring BCs
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750155" with bctype "seedingTriggerableRecurringBC"
##
#
#
#@verifyFulfilmentResponseEvent @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for activated reward bcs
#Given login 
#Then navigate to precision marketer
#Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "singlecreative" and rewardType "oneruleonereward" with MSISDN"<MSISDN>"
#
#Examples:
#|MSISDN|
#|919491750419|
#
#@ActivateCreatedKeywordbased @initBrowser 
#Scenario Outline: Activate the reward bcs and raise the conversion job
#Given login 
#Then navigate to precision marketer 
#Then activate and raise the conversion job the broadcast from workbook "<storedWB>" and sheet "<storedSheet>" and bcSheetName "<bcsheet>"
#Then login to the vcust
#Then hit with vcust SMS with number "<MSISDN>" with keyword "seleniumkeywordforbc"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|keywordbasedconversion|recurringBC|919491750027|
#|parallelRunBC|keywordbasedconversion|one-offBC|919491750054|
#|parallelRunBC|keywordbasedconversion|seedingoneoff|919491750221|
#|parallelRunBC|keywordbasedconversion|seedingRecurringBC|919491750327|
#|parallelRunBC|keywordbasedconversion|TriggerOneoff|919491750128|
#|parallelRunBC|keywordbasedconversion|TriggerReccurringBC|919491750154|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableBC|919491750272|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableRecurringBC|919491750354|
#
#@verifyACKForKeywordBasedBC @initBrowser 
#Scenario Outline: To Verify keyword based bc ack
#Given login 
#Then navigate to precision marketer
#Then verify the acknowledgement of Bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|keywordbasedconversion|recurringBC|919491750027|
#|parallelRunBC|keywordbasedconversion|one-offBC|919491750054|
#|parallelRunBC|keywordbasedconversion|seedingoneoff|919491750221|
#|parallelRunBC|keywordbasedconversion|seedingRecurringBC|919491750327|
#|parallelRunBC|keywordbasedconversion|TriggerOneoff|919491750128|
#|parallelRunBC|keywordbasedconversion|TriggerReccurringBC|919491750154|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableBC|919491750272|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableRecurringBC|919491750354|
#
#
#
#@verifyKeyWordBasedConversionEvent @NDX-9851,@NDX-9850,@NDX-9849,@NDX-9848,@NDX-9847,@NDX-9846,@NDX-9845,@NDX-9844 @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for Usage based conversion activated reward bcs
#Given login 
#Then navigate to precision marketer 
#Then verify the Conversion event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|keywordbasedconversion|recurringBC|919491750027|
#|parallelRunBC|keywordbasedconversion|one-offBC|919491750054|
#|parallelRunBC|keywordbasedconversion|seedingoneoff|919491750221|
#|parallelRunBC|keywordbasedconversion|seedingRecurringBC|919491750327|
#|parallelRunBC|keywordbasedconversion|TriggerOneoff|919491750128|
#|parallelRunBC|keywordbasedconversion|TriggerReccurringBC|919491750154|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableBC|919491750272|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableRecurringBC|919491750354|
#
#@VerifyKeyWordFulfillment @initBrowser
#Scenario Outline: Verify fulfillment sucess is happening for Seeding trigger one off BCs
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with rewardType "oneruleonereward" and MSISDN"<MSISDN>" with bctype "<bctype>"
#Examples:
#|storedWB|storedSheet|bctype|MSISDN|
#|parallelRunBC|keywordbasedconversion|recurringBC|919491750027|
#|parallelRunBC|keywordbasedconversion|one-offBC|919491750054|
#|parallelRunBC|keywordbasedconversion|seedingoneoff|919491750221|
#|parallelRunBC|keywordbasedconversion|seedingRecurringBC|919491750327|
#|parallelRunBC|keywordbasedconversion|TriggerOneoff|919491750128|
#|parallelRunBC|keywordbasedconversion|TriggerReccurringBC|919491750154|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableBC|919491750272|
#|parallelRunBC|keywordbasedconversion|seedingTriggerableRecurringBC|919491750354|
#
#    @activateInventoryBCs @initBrowser @closeBrowser 
#	Scenario: Activating the bcs 
#	Given login 
#	Then navigate to precision marketer 
#	Then activate and verify the broadcast from workbook "parallelRunBC" and sheet "parallelRunBC" 
#	Then wait for 4000 milliseconds 
#    
#    
##    ********************** Verifying The INVENTORY ********************
#    
#    @NDX-9000  @initBrowser
#    Scenario: Verify Black out Rule and frequency limit by creating 4 types of BCs with Black out Always-NEW
#    Given login
#    Then navigate to precision marketer
#    Then verify the inventory "BlackoutAlways" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
#    
#    @NDX-9002 @NDX-9973 @initBrowser
#    Scenario: Verify OneperDay and frequency limit by creating 4 types of BCs with OneperDay-NEW
#    Given login
#    Then navigate to precision marketer
#    Then verify the inventory "OneperDay" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
#    
#    @NDX-8998 @initBrowser
#    Scenario: Verify Unlimited and frequency limit by creating 4 types of BCs with Unlimited-NEW
#    Given login
#    Then navigate to precision marketer
#    Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
#   
# 
# #    ************Verify Bc limits***************************************************
#   @NDX-9977 @initBrowser
#   Scenario: Verify the limit recipints option for the BCs
#   Given login
#   Then navigate to precision marketer
#   Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
#
#
#
##*********************** Verify Calculate Option ******************************
#
#@NDX-9969 @initBrowser @closeBrowser
#Scenario Outline: Verify the calculate option for the BCs <BcSheet>
#Given login 
#Then navigate to precision marketer 
#Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "<BcSheet>"
#Examples:
#|BcSheet|
#|recurringBC|
#|one-offBC|
#|TriggerOneoff|
#|TriggerReccurringBC|
#|seedingoneoff|
#|seedingTriggerableBC|
#|seedingRecurringBC|
#|seedingTriggerableRecurringBC|
#    
##*********************** Verify PDF for BCs ******************************
#
#@NDX-9946 @initBrowser 
#Scenario: Verify Export as PDF for migrated Recurring BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "recurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-9945 @initBrowser 
#Scenario: Verify Export as PDF for migrated one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "one-offBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-9947 @initBrowser 
#Scenario: Verify Export as PDF for migrated triggerable one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "TriggerOneoff" workbook and "parallelRunBC" and sheet "exportAsPDF"
##
#@NDX-9948 @initBrowser 
#Scenario: Verify export as pdf option for trigger recurring Bc
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "TriggerReccurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-9949 @initBrowser 
#Scenario: Verify export as pdf option for seeding one off Bc
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingoneoff" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-9951 @initBrowser 
#Scenario: Verify export Pdf option for sedding trigger one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingTriggerableBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-9950 @initBrowser 
#Scenario: Verify export as pdf option for seeding recur Bc
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingRecurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-9952 @initBrowser 
#Scenario: Verify export Pdf option for seeing trigger recur Bc
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingTriggerableRecurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"


#======================================================BC FUNCTIONALITY VERIFICATION FOR 8 TYPE OF BC==============================================================#
#included
#bc level and partner level cg exclusion and control group participation event persistent
#acknowledged,confirmed delivery and control group conversion event persist
#dynamic tag and multiple creative verification
#target condition and ack count verification in grid and bc report
#render time schedule with before and after
#resume manually 

@NDX-ActivateBCRegression  @initBrowser
Scenario: Activate all the bc in the BCStorageSheet
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then activate broadcast from workbook "parallelRunBC" and sheet "BCDataStorage"

@NDX-8797 @NDX-12014 @NDX-12030 @NDX-12035 @NDX-8776 @NDX-9794 @NDX-9788 @initBrowser  @closeBrowser
Scenario: Verify the ack ,channel SMS,dr count,CG count
Then filter the bc from sheet "ConversionBC" from row "1" and column "0" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
Then activate bc
Then wait until status of "one-offBC" is "Completed"
Then wait for 1 minutes
Then verify the ack count with target condition Ack from sheet "targetConditionCount" for bc from sheet "one-offBC" of bctype "onetime"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the target count with condition Ack from sheet "targetConditionCount" also the channel "SMS"
Then verify the cg exclusion from sheet "targetConditionCount"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition Ack and cg "if required" count from sheet "targetConditionCount" of the bc from sheet "one-offBC" 
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then refresh
Then click on events tab
Then verify multiple creative "عرض مكافأة" for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Participation event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
#Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-7047 @NDX-10013 @initBrowser @closeBrowser
Scenario: Verify the ack ,channel WAP Target condition: customerList of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "1" and column "0" and write in sheet "one-offBC"
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
Then search msisdn "919491750042"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-7035 @NDX-10010 @NDX-9790 @initBrowser @closeBrowser
Scenario: Verify the ack ,channel email Target condition: usageMetric of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "2" and column "0" and write in sheet "one-offBC"
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
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-9006 @NDX-10016 @NDX-9793 @initBrowser
Scenario: Verify the ack, dynamic tag and Target condition: sharedMetricOtherPartner of a one-timebc
Then filter the bc from sheet "BCDataStorage" from row "3" and column "0" and write in sheet "one-offBC"
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
Then search msisdn "919491750240"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "41" for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"

@NDX-8627 @NDX-7040 @NDX-8961 @NDX-8799 @NDX-8805 @NDX-9970  @NDX-9797 @NDX-12015 @NDX-12036  @initBrowser
Scenario: Verify the ack ,channel SMS,multiple creative ,dr count,CG count of a recurrence pattern DAILY of recurringbc 
Then filter the bc from sheet "ConversionBC" from row "2" and column "0" and write in sheet "recurrBCDaily"
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
Then verify the ack count with target condition Ack from sheet "targetConditionCount" for bc from sheet "recurrBCDaily" of bctype "recurringWithEndAt"
Then view broadcast for "RecurringChildAt" for bctype "onetime"
Then verify the target count with condition Ack from sheet "targetConditionCount" also the channel "SMS"
Then verify the cg exclusion from sheet "targetConditionCount"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition Ack and cg "if required" count from sheet "targetConditionCount" of the bc from sheet "recurrBCDaily" 
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"
Then refresh 
Then click on events tab
Then verify multiple creative "عرض مكافأة" for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Participation event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"


@NDX-7048 @NDX-8964 @NDX-9800 @NDX-8624 @NDX-10009 @NDX-9801 @initBrowser @closeBrowser
Scenario: Verify the channel WAP and recurrence pattern EVERY WEEK with target condition profilefieldNV
Then filter the bc from sheet "BCDataStorage" from row "4" and column "0" and write in sheet "recurrBCWeekly"
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
#Then verify the date for child bc from sheet "recurrBCWeekly" with recurrence pattern "EVERY WEEK"
Then wait until status of "recurrBCWeekly" from file "bcInputData" is "Completed" for bctype "recurring"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition profilefieldNV from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "recurrBCWeekly" for the campaign from sheet "campaignBC"

@NDX-7036 @NDX-8809 @NDX-9799 @initBrowser @closeBrowser
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
#Then verify the date for child bc from sheet "recurringMonthSpecialBC" with recurrence pattern "SPECIAL DAY OF THE WEEK"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition Ack from sheet "targetConditionCount" also the channel "Email"

@NDX-8807 @NDX-9008 @NDX-10018 @NDX-9798 @initBrowser @closeBrowser
Scenario: Verify recurrence pattern EVERY 2 DAYS and target condition: SharedcustomerList of recurringbc
Then filter the bc from sheet "BCDataStorage" from row "6" and column "0" and write in sheet "recurringBC"
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
#Then verify the date for child bc from sheet "recurringBC" with recurrence pattern "EVERY 2 DAYS"
Then wait until status of recurring child bc from sheet "recurringBC" is "Completed" 
Then verify the ack count with target condition SharedcustomerList from sheet "targetConditionCount" for bc from sheet "recurringBC" of bctype "recurring"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition SharedcustomerList from sheet "targetConditionCount" also the channel "SMS"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "recurringBC" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "25" for the bc from sheet "recurringBC" for the campaign from sheet "campaignBC"

@NDX-7041 @NDX-8803 @NDX-10017 @NDX-12016 @NDX-12032 @initBrowser
Scenario: Verify the ack ,channel SMS,dr count,CG count and Target condition: customerDrivenEvent of a seeding one-timebc     
Then filter the bc from sheet "ConversionBC" from row "3" and column "0" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingoneoff" for bctype "onetime"
Then edit the Delevery tab details from workbook "bcInputData" sheet "seedingoneoff"
Then wait until status of "seedingoneoff" from file "bcInputData" is "Completed" for bctype "seeding"
Then verify the ack count with target condition Ack from sheet "targetConditionCount" for bc from sheet "seedingoneoff" of bctype "seedingonetime"
Then view broadcast for "seedingonetime-rewarding" for bctype "onetime"
Then verify the target count with condition Ack from sheet "targetConditionCount" also the channel "SMS"
Then verify the cg exclusion from sheet "targetConditionCount"
Then navigate back
Then filter the bc from file "bcInputData" of sheet "seedingoneoff" for bctype "onetime"
Then view broadcast for "seedingonetime-messaging" for bctype "onetime"
Then verify the cg exclusion from sheet "targetConditionCount"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition Ack and cg "if required" count from sheet "targetConditionCount" of the bc from sheet "seedingoneoff" 
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify the condition Confirmed Delivery event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Participation event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"

@NDX-7049 @NDX-8795 @NDX-10011   @initBrowser @closeBrowser
Scenario: Verify the ack ,channel WAP,multiple creative and target condition: customerDrivenEvent of seedingoneoff bc
Then filter the bc from sheet "BCDataStorage" from row "7" and column "0" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait until status of "one-offBC" is "Completed"
Then verify the ack count with target condition customerDrivenEvent from sheet "targetConditionCount" for bc from sheet "seedingoneoff" of bctype "seedingonetime"
Then view broadcast for "seedingonetime-rewarding" for bctype "onetime"
Then verify the target count with condition customerDrivenEvent from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "عرض مكافأة" for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"

@NDX-7037 @NDX-10014 @NDX-12049 @initBrowser @closeBrowser
Scenario: Verify the ack ,channel email and target condition: customerDrivenEventNotOccurred 
Then filter the bc from sheet "BCDataStorage" from row "8" and column "0" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingoneoff" for bctype "onetime"
Then wait until status of "seedingoneoff" is "Completed"
Then verify the ack count with target condition customerDrivenEventNotOccurred from sheet "targetConditionCount" for bc from sheet "seedingoneoff" of bctype "seedingonetime"
Then view broadcast for "seedingonetime-rewarding" for bctype "onetime"
Then verify the target count with condition customerDrivenEventNotOccurred from sheet "targetConditionCount" also the channel "Email"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to broadcast reports
Then verify the seeding and trigger option for the bc from sheet "seedingoneoff" for "seeding" bc
   
@NDX-9012 @initBrowser   @closeBrowser
Scenario: Verify the ack ,dynamic tag 
Then filter the bc from sheet "BCDataStorage" from row "9" and column "0" and write in sheet "seedingoneoff"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingoneoff" for bctype "onetime"
Then wait until status of "seedingoneoff" is "Completed"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "56" for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"


@NDX-8801 @NDX-7042 @NDX-12017 @initBrowser @closeBrowser
Scenario: Verify the ack ,channel SMS,dr count,CG count of seeding recurringbc
Then filter the bc from sheet "ConversionBC" from row "4" and column "0" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then edit the Delevery tab details from workbook "bcInputData" sheet "seedingRecurringBC"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seeding" 
Then verify the ack count with target condition Acknowledgement from sheet "targetConditionCount" for bc from sheet "seedingRecurringBC" of bctype "seedingRecurring"
Then view broadcast for "seedingRecurring-Rewarding" for bctype "onetime"
Then verify the target count with condition Acknowledgement from sheet "targetConditionCount" also the channel "SMS"
Then navigate back
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then view broadcast for "seedingRecurring-Messaging" for bctype "onetime"
Then verify the cg exclusion from sheet "targetConditionCount"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition drCount and cg "true" count from sheet "targetConditionCount" of the bc from sheet "seedingRecurringBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
Then verify the condition Control Group Participation event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"


@NDX-7050 @NDX-8788 @NDX-10015 @initBrowser @closeBrowser
Scenario: Verify the channek WAP,dynamic tag usage for a seeding Recurring bc and target condition :segmentAgeGT40
Then filter the bc from sheet "BCDataStorage" from row "10" and column "0" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seedingRecurr" 
Then view broadcast for "seedingRecurring-Rewarding" for bctype "onetime"
Then verify the target count with condition segmentAgeGT40 from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
     
@NDX-7038 @initBrowser @closeBrowser
Scenario: Verify the channel email for the seeding recurring bc 
Then filter the bc from sheet "BCDataStorage" from row "11" and column "0" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seedingRecurr" 
Then view broadcast for "seedingRecurring" for bctype "onetime"
Then verify the target count with condition Acknowledgement from sheet "targetConditionCount" also the channel "email"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"

@NDX-9010 @NDX-10012 @initBrowser @closeBrowser
Scenario: Verify the dynamic tag usage for a seeding recurring bc
Then filter the bc from sheet "BCDataStorage" from row "12" and column "0" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seedingRecurr" 
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "56" for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"

@NDX-10949 @NDX-10927 @NDX-12048 @NDX-12020 @NDX-12033 @initBrowser @closeBrowser
Scenario: Verify the channel SMS,partner level cg for a trigger one off bc
Then filter the bc from sheet "ConversionBC" from row "5" and column "0" and write in sheet "TriggerOneoff"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerOneoff" for bctype "onetime"
Then edit the Delevery tab details from workbook "bcInputData" sheet "TriggerOneoff"
Then wait until status of "TriggerOneoff" from file "bcInputData" is "Delivering" for bctype "onetime"
Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "trigger1.csv"
Then wait for 5 minutes
Then verify the target count with condition Ack from sheet "targetCountWithTrigger" also the channel "SMS"
Then verify the cg exclusion from sheet "targetCountWithTrigger"
Then view broadcast for "onetime" for bctype "onetime"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition Ack and cg "if required" count from sheet "targetCountWithTrigger" of the bc from sheet "TriggerOneoff" 
Then verify the seeding and trigger option for the bc from sheet "TriggerOneoff" for "trigger" bc
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750022"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750042"
Then click on events tab
Then verify the condition Control Group Participation event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750042"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"

@NDX-10939 @NDX-10936 @NDX-10925 @NDX-12034 @initBrowser @closeBrowser
Scenario: Verify the channel WAP,bc level cg exclusion,multiple creative  for a trigger seeding onetime bc
Then filter the bc from sheet "BCDataStorage" from row "13" and column "0" and write in sheet "TriggerOneoff"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerOneoff" for bctype "onetime"
Then wait until status of "TriggerOneoff" from file "bcInputData" is "Delivering" for bctype "seeding"
Then verify the ack count with target condition Ack from sheet "targetCountWithTrigger" for bc from sheet "TriggerOneoff" of bctype "seeding"
Then view broadcast for "seedingonetime-rewarding" for bctype "onetime"
Then verify the target count with condition Ack from sheet "targetCountWithTrigger" also the channel "SMS"
Then verify the cg exclusion from sheet "targetCountWithTrigger"
Then navigate back
Then filter the bc from file "bcInputData" of sheet "TriggerOneoff" for bctype "onetime"
Then view broadcast for "seedingonetime-messaging" for bctype "onetime"
Then verify the cg exclusion from sheet "targetCountWithTrigger"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition Ack and cg "if required" count from sheet "targetCountWithTrigger" of the bc from sheet "TriggerOneoff"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the cg exclusion from sheet "targetCountWithTrigger"
Then verify the target count with condition Ack from sheet "targetCountWithTrigger" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC" 
Then click on events tab
Then verify multiple creative "عرض مكافأة" for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"


@NDX-10937  @initBrowser @closeBrowser
Scenario: Verify channel email for trigger one off bc
Then filter the bc from sheet "BCDataStorage" from row "14" and column "0" and write in sheet "TriggerOneoff"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerOneoff" for bctype "trigger"
Then wait until status of "TriggerOneoff" from file "bcInputData" is "Delivering" for bctype "trigger"
Then verify the ack count with target condition Acknowlegment from sheet "targetCountWithTrigger" for bc from sheet "TriggerOneoff" of bctype "onetime"
Then view broadcast for "onetime" for bctype "onetime"
Then verify the target count with condition Acknowlegment from sheet "targetCountWithTrigger" also the channel "Email"
Then verify the cg exclusion from sheet "targetCountWithTrigger"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to broadcast reports
Then verify the seeding and trigger option for the bc from sheet "TriggerOneoff" for "trigger" bc

@NDX-10944 @NDX-12021 @NDX-12037 @initBrowser @closeBrowser
Scenario: Verify channel WAP for trigger recurring bc
Then filter the bc from sheet "ConversionBC" from row "6" and column "0" and write in sheet "TriggerReccurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerReccurringBC" for bctype "trigger"
Then edit the Delevery tab details from workbook "bcInputData" sheet "TriggerReccurringBC"
Then wait until status of "TriggerReccurringBC" from file "bcInputData" is "Delivering" for bctype "trigger"
Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "trigger1.csv"
Then wait for 5 minutes
Then verify the ack count with target condition Ack from sheet "targetCountWithTrigger" for bc from sheet "TriggerReccurringBC" of bctype "seedingRecurring"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750022"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750042"
Then click on events tab
Then verify the condition Control Group Participation event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750042"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"

@NDX-10945 @NDX-10947 @NDX-10971 @initBrowser @closeBrowser
Scenario: Verify channel sms ,multiple creative of a seeding trigger recurring bc
Then filter the bc from sheet "BCDataStorage" from row "15" and column "0" and write in sheet "TriggerReccurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerReccurringBC" for bctype "trigger"
Then wait until status of "TriggerReccurringBC" from file "bcInputData" is "Delivering" for bctype "trigger"
Then navigate to reports
Then navigate to broadcast reports
Then from bc report verify condition targetall and cg "false" count from sheet "targetConditionCount" of the bc from sheet "TriggerReccurringBC" 
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "عرض مكافأة" for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"

@NDX-10941  @NDX-12018 @NDX-12019 @NDX-9975 @NDX-9976 @initBrowser @closeBrowser
Scenario: Verify dynamic tag for a seeding trigger recurring bc
Then filter the bc from sheet "ConversionBC" from row "7" and column "0" and write in sheet "TriggerReccurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerReccurringBC" for bctype "trigger"
Then edit the Delevery tab details from workbook "bcInputData" sheet "TriggerReccurringBC"
Then wait until status of "TriggerReccurringBC" from file "bcInputData" is "Delivering" for bctype "seedingRecurr"
Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "trigger1.csv"
Then wait for 5 minutes
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750022"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "25" for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750042"
Then click on events tab
Then provide file in location "/usr/local/flytxt/selenium/" for trigger with csv file "conversion.csv"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750042"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"

@NDX-9795 @initBrowser @closeBrowser
Scenario: Verify the broadcast expiry for trigger recurring bc
Then filter the bc from sheet "BCDataStorage" from row "16" and column "0" and write in sheet "TriggerReccurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "TriggerReccurringBC" for bctype "onetime"
Then wait until status of "TriggerReccurringBC" from file "bcInputData" is "Delivery Expired" for bctype "seeding"
Then verify the ack is not send for the bc from sheet "TriggerReccurringBC" after the bc expiry 


  
@NDX-9971 @initBrowser @closeBrowser
Scenario: Verify bc with blackout manual
Then filter the bc from sheet "ConversionBC" from row "8" and column "0" and write in sheet "recurrBCDaily" 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurrBCDaily"
Then edit deliver tab with end "none" target render time "Real Time" and broadcast expiry as "none" from sheet "recurrBCDaily"
Then activate bc
Then wait for 1 minutes
Then navigate to landing page
Then navigate to configuration management
Then navigate to blackout rules
Then create the blackout period for the blackout rule and save
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "onetime"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Blackout Suspended" for bctype "recurring"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Blackout Pause" for bctype "recurring"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Blackout Expired" for bctype "recurring" 


@NDX-9803 @NDX-9802  @initBrowser @closeBrowser
Scenario Outline: Verify bc with render time schedule
Then filter the bc from sheet "ConversionBC" from row "<i>" and column "0" and write in sheet "recurrBCDaily" 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurrBCDaily"
Then edit deliver tab with end "never" target render time "<renderTimeSchedule>" and broadcast expiry as "none" from sheet "recurrBCDaily"
Then activate bc
Then wait for 4000 milliseconds  
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "onetime"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Targeting" for bctype "recurring"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Delivery Scheduled" for bctype "recurring"

Examples:
|renderTimeSchedule|i|
|broadcast schedule at|9|
|broadcast schedule before|10|

  
@NDX-9974 @initBrowser @closeBrowser
Scenario Outline: verify DNC(optional ,mandatory) of the BCs
Then filter the bc from sheet "BCDataStorage" from row "<i>" and column "0" and write in sheet "<bcSheet>" 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "<bcSheet>" for bctype "onetime"
Then wait until status of "<bcSheet>" from file "bcInputData" is "Completed" for bctype "<bcType>" 
Then verify the ack count with target condition SharedcustomerList from sheet "<targetConditionSheet>" for bc from sheet "one-offBC" of bctype "<countGrid>"

Examples:
|bcSheet|bcType|countGrid|i|targetConditionSheet|
|recurrBCDaily|recurring|recurring|17|targetConditionCount|
|TriggerReccurringBC|seedingRecurr|seedingRecurring|18|targetCountWithTrigger|


@NDX-9974 @initBrowser @closebBrowser
Scenario Outline: verify bc flow with facebook offer
Then filter the bc from sheet "facebookBC" from row "<i>" and column "0" and write in sheet "<bcSheet>" 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringBC" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurringBC"
Then edit deliver tab with end "none" target render time "Real Time" and broadcast expiry as "none" from sheet "<bcSheet>"
Then activate bc
Then filter the bc from file "bcInputData" of sheet "<bcSheet>" for bctype "onetime"
Then wait until status of "<bcSheet>" from file "bcInputData" is "Completed" for bctype "recurring" 
Examples:
|bcSheet||i|
|recurringBC|1|
|recurringBC|2|
#|recurringBC|3|
#|recurringBC|4|


@NX-2052 @initBrowser 
Scenario: verify bc notification
Then filter the bc from sheet "ConversionBC" from row "12" and column "0" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
Then activate bc
Then wait until status of "one-offBC" is "Completed"
Then wait for 1 minutes
Then verify the BC notification in mail "Rendering" from workbook "bcInputData" and sheet "one-offBC" 
Then verify the BC notification in mail "Delivering" from workbook "bcInputData" and sheet "one-offBC" 
Then verify the BC notification in mail "Completed" from workbook "bcInputData" and sheet "one-offBC"


@NX-Bcnotificationsms @initBrowser 
Scenario: verify bc notification
Then filter the bc from sheet "ConversionBC" from row "12" and column "0" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait until status of "one-offBC" is "Completed"
Then wait for 1 minutes
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919846130328"
Then click on events tab
#Then verify the condition "Acknowledged" event for the bc notification "Rendering" from file "bcInputData" of sheet "one-offBC"
Then verify the condition "Acknowledged" event for the bc notification "started" from file "bcInputData" of sheet "one-offBC"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919846130328"
Then click on events tab
Then verify the condition "Acknowledged" event for the bc notification "completed" from file "bcInputData" of sheet "one-offBC"

@NX-Bcnotificationsms @initBrowser 
Scenario: verify bc notification
Then filter the bc from sheet "ConversionBC" from row "12" and column "0" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "Emailnotification" for bctype "onetime"
Then wait until status of "Emailnotification" is "Completed"
Then wait for 1 minutes
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919846130328"
Then click on events tab
#Then verify the condition "Acknowledged" event for the bc notification "Rendering" from file "bcInputData" of sheet "one-offBC"
Then verify the condition "Acknowledged" event for the bc notification "started" from file "bcInputData" of sheet "Emailnotification"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919846130328"
Then click on events tab
Then verify the condition "Acknowledged" event for the bc notification "completed" from file "bcInputData" of sheet "Emailnotification"

@NDX-feedbackBC @initBrowser @closeBrowser
Scenario: verify feedback for recurring bc
Then filter the bc from sheet "ConversionBC" from row "13" and column "0" and write in sheet "recurrBCDaily"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then navigate to "Recurring Broadcasts" broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "recurring"
Then click on BC edit button from workbook "bcInputData" sheet "recurrBCDaily"
Then edit deliver tab with end "none" target render time "realTime" and broadcast expiry as "none" from sheet "recurrBCDaily"
Then activate bc
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "onetime"
Then click "Configure Feedback" for "recurringchildbc" for bctype "onetime" 
Then configure feedback for bc from sheet "recurrBCDaily" and bctype "recurring"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "completed" for bctype "recurring"

#############Latch verification##################

@NDX-latchTriggerBCverification  @initBrowser
Scenario: Verify the activation and status of latch trigger bc
Then filter the bc from sheet "ConversionBC" from row "6" and column "0" and write in sheet "latchbc"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "latchbc" for bctype "onetime"
Then edit the Delevery tab details from workbook "bcInputData" sheet "latchbc"
Then wait until status of "latchbc" from file "bcInputData" is "Delivering" for bctype "onetime"

################Start the latch simulator then run the following cases################ https://docs.google.com/document/d/179FmAPomOv3d4VHPAKvDb76vXzGmlE2WQpmzGY0cYLA/edit?usp=sharing
@NDX-latcheventverification  @initBrowser
Scenario: Verify the event verification of latch 
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919995335682"
Then click on events tab
Then verify the "Network Latch" event

@NDX-latchTriggereventverificartion  @initBrowser
Scenario: Verify the event verification of latch trigger bc
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919995335682"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "latchbc" for the campaign from sheet "campaignBC"
Then verify the condition Confirmed Delivery event for the bc from sheet "latchbc" for the campaign from sheet "campaignBC"

@VerifySavedsegmentsEdit @initBrowser
   Scenario: create saved segment as precondition
   Given login
   Then navigate to landing page
   Then navigate to precision marketer
   Then navigate to configuration
   Then navigate to saved segments
   Then edit the saved segment "EditSavedsegment"
   Then add Condition and save
   Then verify the changes










