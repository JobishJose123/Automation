#Author : kiran.joseph@flytxt.com
@Latchrunfeature
Feature: Latch

######################## Latch feature ###########

@NDX-Createstreamingattribute @initBrowser 
Scenario: create a streaming attribute with real time rte
Given login
Then navigate to data foundation
Then navigate to streaming attributes
Then create a streaming attribute from sheet "latch" with route "Real Time RTE Service"

@NDX-Latchtriggercreation @initBrowser 
Scenario: create Trigger mapping streaming atrribute
Given login
Then navigate to precision marketer
Then navigate to configuration
Then select triggers in configuration
Then create new trigger "latch_rteTrigger" with streaming attribute from sheet "latch"


@NDX-latchTriggerBC  @initBrowser @closeBrowser
Scenario Outline: Create latch trigger bc to verify functionality
Given login
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "latch_rteTrigger"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then "<status>" bc
Then wait for 4000 milliseconds 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "<BCDataSheet>"
Then wait for 4000 milliseconds 

Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|status|BCDataSheet|
|latchbc|rechargeSMS|targetall|None|no limit|fixedPercentage|none|single creative|never|none|6|save|ConversionBC|


################# IM touchpoint,program and rule creations#########################

@NX-latchtouchpointcreation @initBrowser @closeBrowser
Scenario: Verify new Trigger touchpoint creation  
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then create trigger touchpoint from sheet "triggertouchpointlatch" with logic "LIFO" and trigger "latch_rteTrigger"  
Then check trigger touchpoint in grid "triggertouchpointlatch"


@NDX-realTime&rechargeTrackingService
@initBrowser  @closeBrowser
Scenario: Verify create a program and rule 
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "latchtrigger" and offer catalog sheet "IMcatalog" and touchpoint from sheet "triggertouchpointlatch"
Then choose program from sheet "latchtrigger"
Then create new rule with enddate from sheet "latchtrigger" and offer "rechargeSMS" and touchpoint from sheet "triggertouchpointlatch"
Then "save" rule
Then add program and rule from sheet "latchtrigger" to column "2" of sheet "programRuleDetails"
   





