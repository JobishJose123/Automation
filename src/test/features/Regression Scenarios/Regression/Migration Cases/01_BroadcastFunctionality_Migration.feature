#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionalityMigration 
Feature: For broadcast functionality check for Migration cases 

##**************/\********************* Verify reward bc`s***********/\**************
#	
#@ActivateCreatedRewardbcs_MIG @initBrowser
#Scenario Outline: Activate the reward bcs and raise the conversion job_MIG
#Given login 
#Then navigate to precision marketer 
#Then activate and raise the conversion job the broadcast from workbook "<storedWB>" and sheet "<storedSheet>" and bcSheetName "<bcsheet>"
#
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
#|parallelRunBC|UsageBasedConversion|seedingTriggerable|
#
#
#
#
#@VerifyAckEventBcs_MIG @initBrowser @closeBrowser
#Scenario Outline: Verify Ack event for activated reward bcs _ MIG
#Given login 
#Then navigate to precision marketer 
#Then verify the acknowledgement of Bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|rewardBcs|recurringBC|919491750049|
#|parallelRunBC|rewardBcs|one-offBC|919491750083|
#|parallelRunBC|rewardBcs|seedingoneoff|919491750220|
#|parallelRunBC|rewardBcs|seedingRecurringBC|919491750333|
#|parallelRunBC|rewardBcs|TriggerOneoff|919491750122|
#|parallelRunBC|rewardBcs|TriggerReccurringBC|919491750178|
#|parallelRunBC|rewardBcs|seedingTriggerableBC|919491750284|
#|parallelRunBC|rewardBcs|seedingTriggerableRecurringBC|919491750390|
#|parallelRunBC|UsageBasedConversion|one-offBC|919491750054|
#|parallelRunBC|UsageBasedConversion|seedingoneoff|919491750245|
#|parallelRunBC|UsageBasedConversion|recurringBC|9491750045|
#|parallelRunBC|UsageBasedConversion|seedingRecurringBC|9491750345|
#|parallelRunBC|UsageBasedConversion|TriggerOneoff|9491750128|
#|parallelRunBC|UsageBasedConversion|TriggerReccurringBC|9491750168|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableRecurringBC|9491750358|
#|parallelRunBC|UsageBasedConversion|seedingTriggerable|9491750258|
#
#@verifyRechargeBasedConversionEvent_MIG @NDX-9811 @NDX-9810 @NDX-9809 @NDX-9808 @NDX-9807 @NDX-9806 @NDX-9805 @NDX-9804 @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for recharge based conversion activated reward bcs_MIG
#Given login 
#Then navigate to precision marketer 
#Then verify the Conversion event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|rewardBcs|recurringBC|919491750049|
#|parallelRunBC|rewardBcs|one-offBC|919491750083|
#|parallelRunBC|rewardBcs|seedingoneoff|919491750220|
#|parallelRunBC|rewardBcs|seedingRecurringBC|919491750333|
#|parallelRunBC|rewardBcs|TriggerOneoff|919491750122|
#|parallelRunBC|rewardBcs|TriggerReccurringBC|919491750178|
#|parallelRunBC|rewardBcs|seedingTriggerableBC|919491750284|
#|parallelRunBC|rewardBcs|seedingTriggerableRecurringBC|919491750390|
#
#
#@verifyUsageBasedConversionEvent_MIG @NDX-9819 @NDX-9818 @NDX-9817 @NDX-9816 @NDX-9815 @NDX-9814 @NDX-9813 @NDX-9812 @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for Usage based conversion activated reward bcs_MIG
#Given login 
#Then navigate to precision marketer 
#Then verify the Conversion event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|UsageBasedConversion|recurringBC|919491750049|
#|parallelRunBC|UsageBasedConversion|one-offBC|919491750074|
#|parallelRunBC|UsageBasedConversion|seedingoneoff|919491750202|
#|parallelRunBC|UsageBasedConversion|seedingRecurringBC|919491750302|
#|parallelRunBC|UsageBasedConversion|TriggerOneoff|919491750132|
#|parallelRunBC|UsageBasedConversion|TriggerReccurringBC|919491750160|
#|parallelRunBC|UsageBasedConversion|seedingTriggerable|919491750295|
#|parallelRunBC|UsageBasedConversion|seedingTriggerableRecurringBC|919491750374|
#
#
# @NDX-10241 @initBrowser
#Scenario: Verify fulfillment sucess is happening for one-off BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750083" with bctype "one-off"
##Then verify the FulfillmentSuccessMessage to verify Creative "Success from Selenium from first rule" message type "Text" and rewardType "oneruleonereward" with MSISDN"9491750009"
# 
# @NDX-10245 @initBrowser
#Scenario: Verify fulfillment sucess is happening for seeding one off BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750220" with bctype "seedingoneoff"
#
# @NDX-10242 @initBrowser
#Scenario: Verify fulfillment sucess is happening for recurring  BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750049" with bctype "recurring"
##
#
# @NDX-10246 @initBrowser
#Scenario: Verify fulfillment sucess is happening for seeding recurring BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750333" with bctype "seedingRecurring"
##
#
# @NDX-10244 @initBrowser
#Scenario: Verify fulfillment sucess is happening for trigger recur BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750178" with bctype "TriggerReccurringBC"
##
#
# @NDX-10247	@initBrowser
#Scenario: Verify fulfillment sucess is happening for Seeding trigger one off BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750284" with bctype "seedingTriggerableBC"
##
#
# @NDX-10243 @initBrowser
#Scenario: Verify fulfillment sucess is happening for trigger-one-off BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750122" with bctype "TriggerOneoff"
##
#
# @NDX-10248 @initBrowser
#Scenario: Verify fulfillment sucess is happening for seeding trigger recurring BCs(migration)
#Given login 
#Then navigate to precision marketer 
#Then verify the Fulfillment event of bcs from workbook "parallelRunBC" and sheet "rewardBcs" with rewardType "oneruleonereward" and MSISDN"919491750390" with bctype "seedingTriggerableRecurringBC"
##
#
#
##------------------------------------------------------------------------------------------------------------------------------
#
#@ActivateCreatedKeywordbased @initBrowser 
#Scenario Outline: Activate the reward Keyword bcs and raise the conversion job
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
#@verifyKeyWordBasedConversionEvent @NDX-9827,@NDX-9826,@NDX-9825,@NDX-9824,@NDX-9823,@NDX-9822,@NDX-9821,@NDX-9820 @initBrowser @closeBrowser
#Scenario Outline: Verify the Conversion event for Usage based conversion activated reward bcs
#Given login 
#Then navigate to precision marketer 
#Then verify the Conversion event of bcs from workbook "<storedWB>" and sheet "<storedSheet>" with MSISDN"<MSISDN>" with bc "<bcsheet>"
#Examples:
#|storedWB|storedSheet|bcsheet|MSISDN|
#|parallelRunBC|keywordbasedconversion|recurringBC|919491750049|
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
##
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
#
#
#@activateInventoryBCsMigration @initBrowser @closeBrowser 
#Scenario: Activating the bcs 
#	Given login 
#	Then navigate to precision marketer 
#	Then activate and verify the broadcast from workbook "parallelRunBC" and sheet "parallelRunBC" 
#	Then wait for 4000 milliseconds 
#	
#	#    ********************** Verifying The INVENTORY ********************
#    
#    @NDX-9972 @initBrowser
#    Scenario: Verify Black out Rule and frequency limit by creating 4 types of BCs with Black out Always-NEW
#    Given login
#    Then navigate to precision marketer
#    Then verify the inventory "BlackoutAlways" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
#    
#     @NDX-10089 @initBrowser
#    Scenario: Verify OneperDay and frequency limit by creating 4 types of BCs with OneperDay-NEW
#    Given login
#    Then navigate to precision marketer
#    Then verify the inventory "OneperDay" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"
#
## Verify calculate Option for Migration BCs*******************
#
#@NDX-10075 @initBrowser 
#Scenario: Verify calculate option for  migrated one off BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "one-offBC" 
#	
#	
#@NDX-10077 @initBrowser 
#Scenario: Verify calculate option for  migrated triggerable one off BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "TriggerOneoff" 
#	
#@NDX-10081 @initBrowser 
#Scenario: Verify calculate option for  migrated triggerable recurring BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "TriggerReccurringBC" 
#	
#@NDX-10079 @initBrowser 
#Scenario: Verify calculate option for  migrated recurring BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "recurringBC" 
#	
#@NDX-10076 @initBrowser 
#Scenario: Verify calculate option for  migrated seeding one off BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingoneoff" 
#	
#@NDX-10080 @initBrowser 
#Scenario: Verify calculate option for  migrated seeding recurring BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingRecurringBC" 
#	
#@NDX-10078 @initBrowser 
#Scenario: Verify calculate option for  migrated seeding triggerable one off BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingTriggerableBC" 
#	
#@NDX-10082 @initBrowser 
#Scenario: Verify calculate option for  migrated seeding triggerabel recurring BC 
#	Given login 
#	Then navigate to precision marketer 
#	Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingTriggerableRecurringBC" 
#	
#
#	
#	
#	#*********************** Braodcast Limits****************************
#	
#@NDX-10093 @initBrowser 
#Scenario: Verify limit for migrated BC's 
#	Given login 
#	Then navigate to precision marketer 
#	Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC" 
#	
#	
##	********************* verify export as pdf for migrated BC ****************************
#
#@NDX-10055 @initBrowser 
#Scenario: Verify Export as PDF for migrated Recurring BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "recurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10051 @initBrowser 
#Scenario: Verify Export as PDF for migrated one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "one-offBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10053 @initBrowser 
#Scenario: Verify Export as PDF for migrated triggerable one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "TriggerOneoff" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10057 @initBrowser 
#Scenario: Verify Export as PDF for migrated triggerable Recurring BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "TriggerReccurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10052 @initBrowser 
#Scenario: Verify Export as PDF for migrated seeding one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingoneoff" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10054 @initBrowser 
#Scenario: Verify Export as PDF for migrated seeding triggerable one off BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingTriggerableBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10056 @initBrowser 
#Scenario: Verify Export as PDF for migrated seeding Recurring BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingRecurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"
#
#@NDX-10058 @initBrowser 
#Scenario: Verify Export as PDF for migrated seeding triggerable Recurring BC
#Given login 
#Then navigate to precision marketer 
#Then verify pdf generated for broadcast from BCsheet "seedingTriggerableRecurringBC" workbook and "parallelRunBC" and sheet "exportAsPDF"



	
#======================================================BC FUNCTIONALITY VERIFICATION FOR 8 TYPE OF BC==============================================================#
#included
#bc level and partner level cg exclusion and control group participation event persistent
#acknowledged,confirmed delivery and control group conversion event persist
#dynamic tag and multiple creative versification
#target condition and ack count verification in grid and bc report
#render time schedule with before and after
#resume manually 


@NDX-ActivateBC  @initBrowser
Scenario: Activate all the bc in the BCStorageSheet
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then activate broadcast from workbook "parallelRunBC" and sheet "BCDataStorage"


@NDX-8798 @NDX-10092 @NDX-10094 @NDX-12022 @NDX-10091  @initBrowser 
Scenario: Verify the ack ,channel SMS,dr count,CG count
Then filter the bc from sheet "ConversionBC" from row "1" and column "0" and write in sheet "one-offBC"
Given login 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "onetime"
Then wait for 2 minutes
Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
Then activate bc
Then wait until status of "one-offBC" is "Completed"
Then wait for 2 minutes
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
Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-8777 @NDX-10147  @initBrowser
Scenario: Verify the ack ,channel WAP,multiple creative Target condition: customerList of a one-timebc
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
Then search msisdn "919491750041"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-10144 @NDX-10096  @initBrowser 
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
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-10150 @NDX-10099 @initBrowser
Scenario: Verify the ack ,dynamic tag and Target condition: sharedMetricOtherPartner of a one-timebc
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
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowlegedment event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"


@NDX-8962 @NDX-8800 @NDX-10103 @NDX-10100 @NDX-12023 @initBrowser
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
Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"


@NDX-8965 @NDX-8625 @NDX-10106 @NDX-10107 @NDX-10143 @initBrowser
Scenario: Verify the channel WAP and recurrence pattern EVERY WEEK 
Then filter the bc from sheet "BCDataStorage" from row "4" and column "0" and write in sheet "recurrBCWeekly"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCWeekly" for bctype "onetime" 
Then verify the date for child bc from sheet "recurrBCWeekly" with recurrence pattern "EVERY WEEK"
Then wait until status of "recurrBCWeekly" from file "bcInputData" is "Completed" for bctype "recurring"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition profilefieldNV from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "recurrBCWeekly" for the campaign from sheet "campaignBC"


@NDX-8810 @NDX-10105  @initBrowser
Scenario: Verify the channel email and recurrence pattern SPECIAL DAY OF THE WEEK
Then filter the bc from sheet "BCDataStorage" from row "5" and column "0" and write in sheet "recurringMonthSpecialBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringMonthSpecialBC" for bctype "onetime" 
Then verify the date for child bc from sheet "recurringMonthSpecialBC" with recurrence pattern "SPECIAL DAY OF THE WEEK"
Then view broadcast for "recurringchildbc" for bctype "onetime"
Then verify the target count with condition Acknowlegedment from sheet "targetConditionCount" also the channel "Email"

@NDX-9009 @NDX-10104 @NDX-10152 @initBrowser
Scenario: Verify recurrence pattern EVERY 2 DAYS and target condition: SharedcustomerList of recurringbc
Then filter the bc from sheet "BCDataStorage" from row "6" and column "0" and write in sheet "recurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "recurringBC" for bctype "onetime"
Then verify the date for child bc from sheet "recurringBC" with recurrence pattern "EVERY 2 DAYS"
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


@NDX-8604 @NDX-8620 @NDX-8804 @NDX-10151 @NDX-12026 @initBrowser
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
Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"

@NDX-8794   @initBrowser @closeBrowser
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
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "عرض مكافأة" for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"

@NDX-10148 @initBrowser
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
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then navigate to reports
Then navigate to broadcast reports
Then verify the seeding and trigger option for the bc from sheet "seedingoneoff" for "seeding" bc
   
@NDX-9013 @initBrowser   
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
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "21" for the bc from sheet "seedingoneoff" for the campaign from sheet "campaignBC"


@NDX-10084 @NDX-12043 @NDX-12027 @initBrowser
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
Then raise the conversion job
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"

@NDX-8792 @NDX-10149 @initBrowser
Scenario: Verify the channek WAP,dynamic tag usage for a seeding Recurring bc and target condition :segmentAgeGT40
Then filter the bc from sheet "BCDataStorage" from row "10" and column "0" and write in sheet "seedingRecurringBC"
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "seedingRecurringBC" for bctype "onetime"
Then wait until status of "seedingRecurringBC" from file "bcInputData" is "Completed" for bctype "seeding" 
Then view broadcast for "seedingRecurring-Rewarding" for bctype "onetime"
Then verify the target count with condition segmentAgeGT40 from sheet "targetConditionCount" also the channel "WAP"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750005"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
     
@NDX-10096   @initBrowser
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

@NDX-9011 @NDX-10146 @initBrowser
Scenario: Verify the dynamic tag usage for a seeding recurring bc
Then filter the bc from sheet "BCDataStorage" from row "12" and column "0" and write in sheet "seedingRecurringBC"
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
Then verify the condition Acknowledged event for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"
Then click on events tab
Then verify multiple creative "21" for the bc from sheet "seedingRecurringBC" for the campaign from sheet "campaignBC"


@NDX-10924 @NDX-10950 @NDX-10928 @NDX-12024  @initBrowser
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
Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750042"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "TriggerOneoff" for the campaign from sheet "campaignBC"

@NDX-10940 @NDX-10935 @NDX-12028 @initBrowser
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



@NDX-10938 @initBrowser
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

@NDX-10943 @NDX-12044 @NDX-12029 @initBrowser
Scenario: Verify channel WAP for seeding trigger recurring bc
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
Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750042"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"

@NDX-10946 @NDX-10948 @NDX-10086 @initBrowser
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

@NDX-10942  @NDX-12042 @NDX-12025 @initBrowser
Scenario: Verify dynamic tag for trigger recurring bc
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
Then verify the condition Control Group Participation event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"
Then raise the conversion job
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750042"
Then click on events tab
Then verify the condition Control Group Conversion event for the bc from sheet "TriggerReccurringBC" for the campaign from sheet "campaignBC"

@NDX-11758 @initBrowser
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

@NDX-10088 @initBrowser
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


@NDX-10108 @NDX-10109  @initBrowser
Scenario Outline: Verify bc with blackout manual
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

@NDX-10090 @initBrowser
Scenario Outline: verify DNC(optional ,mandatory) of the BCs
Then filter the bc from sheet "BCDataStorage" from row "<i>" and column "0" and write in sheet "<bcSheet>" 
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "<bcSheet>" for bctype "onetime"
Then wait until status of "<bcSheet>" from file "bcInputData" is "Completed" for bctype "<bcType>" 
Then verify the ack count with target condition DNCExclusion from sheet "<targetConditionSheet>" for bc from sheet "one-offBC" of bctype "<countGrid>"

Examples:
|bcSheet|bcType|countGrid|i|targetConditionSheet|
|recurrBCDaily|recurring|recurring|17|targetConditionCount|
|TriggerReccurringBC|seedingRecurr|seedingRecurring|18|targetCountWithTrigger|


