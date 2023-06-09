#Author: your.email@your.domain.com
#Keywords Summary :
#Total scenario : 39
@IMdatasetup
Feature: For IntentManagement datasetup.

@IMOfferdatasetup   @initBrowser
Scenario: datatsetup for im
Given login
Then navigate to configuration management
Then naviagte to product classes
Then create product class and number attribute from "TestProductClass"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then click create new product button
Then create product with attributes from sheet "fullDetails"
Then navigate to landing page
Then navigate to intent management
Then navigate to offer management
Then navigate to offers
Then click on create new ofer button
Then create new offer from sheet "STVSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
Then click on create new ofer button
Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
Then click on create new ofer button
#Then create new offer from sheet "rechargegobal" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Global Response App"
#Then click on create new ofer button
Then create new offer from sheet "usageBasedSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Usage Metric"
Then navigate back to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "IMcatalog"
Then Add "STVSMS" offer to Offer Catalogue
Then Add "rechargeSMS" offer to Offer Catalogue
#Then Add "rechargegobal" offer to Offer Catalogue
Then Add "usageBasedSMS" offer to Offer Catalogue
Then navigate back to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "defaultCatalog"
Then Add "STVSMS" offer to Offer Catalogue
Then Add "rechargeSMS" offer to Offer Catalogue

################################## TOUCHPOINT CREATION FOR UI AND FUNCTIONALITY VERIFICATION ###########################
	
@NX-433 @NX-4063  @initBrowser @closeBrowser
Scenario: create customer care touchpoint to be used in customerCare executive
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to customer care
Then create customer care touchpoint from sheet "CCTouchpoint" with logic "FIFO" 
Then check customer care touchpoint in grid "CCTouchpoint"

@NX-433 @NX-4063 @initBrowser @closeBrowser
Scenario: create customer care touchpoint to be used in customerCare executive
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to customer care
Then create customer care touchpoint from sheet "CCTouchpoint_default" with logic "LIFO"
Then check customer care touchpoint in grid "CCTouchpoint_default"
#    
@NX-createDefaultApiTouchpoint @initBrowser @closeBrowser
Scenario: create api touchpoint GA
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpoint_default" and logic "LIFO"
Then check api touchpoint in grid "apiTouchpoint_default"
##Then add touchpoint "apiTouchpoint_default" to api_auth_policy
#    

@NX-createDefaultApiTouchpointUR @initBrowser @closeBrowser
Scenario: create api touchpoint UR
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpointGR" and logic "FIFO"
Then check api touchpoint in grid "apiTouchpointGR"
#Then add touchpoint "apiTouchpointGR" to api_auth_policy


@NX-createApiTouchpointBestfit @initBrowser @closeBrowser
Scenario: create api touchpoint GA
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpointBestfit" and logic "BEST FIT ALGORITHM"
Then check api touchpoint in grid "apiTouchpointBestfit"
##Then add touchpoint "apiTouchpoint_default" to api_auth_policy

#Custom AC logic
@createcustomlogic @initBrowser  @closeBrowser
Scenario: create a custom logic
Given login
Then navigate to intent management
Then navigate to configuration
Then navigate to Offer Prioritization Logic
Then create new custom logic "Custom AC logic"

@NX-createApiTouchpointcustomlogic @initBrowser 
Scenario: create api touchpoint GA
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTPCustomlogic" and logic "Custom AC logic"
Then check api touchpoint in grid "apiTPCustomlogic"
##Then add touchpoint "apiTouchpoint_default" to api_auth_policy


#need to create ussd application in legacy first8
@NX-435 @initBrowser 
Scenario: Verify new USSD touchpoint creation
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to ussd
Then create ussd touchpoint from sheet "ussdTouchpoint" with logic "FIFO" and application "USSDselenium"
Then check ussd touchpoint in grid "ussdTouchpoint"

@NX-435 @initBrowser @closeBrowser
Scenario: Verify new USSD touchpoint creation
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to ussd
Then create ussd touchpoint from sheet "ussdTouchpoint_default" with logic "LIFO" and application "seleniumussd_q11"
Then check ussd touchpoint in grid "ussdTouchpoint_default"

@NX-430 @NX-2053 @initBrowser @closeBrowser
Scenario: Verify new SMS touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to sms
Then create sms touchpoint from sheet "smsTouchpoint_default" with logic "LIFO" and keyword "seleniumsmstp_q11"
Then check sms touchpoint in grid "smsTouchpoint"

@NX-430 @NX-2053 @initBrowser @closeBrowser
Scenario: Verify new SMS touchpoint creation 430
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to sms
Then create sms touchpoint from sheet "smsTouchpoint" with logic "FIFO" and keyword "seleniumsmstp"
Then check sms touchpoint in grid "smsTouchpoint"
 

@NX-431 @initBrowser 
Scenario: Verify new Trigger touchpoint creation  NX-431
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then create trigger touchpoint from sheet "triggerTouchpoint" with logic "LIFO" and trigger "SeleniumTrigger"  
Then check trigger touchpoint in grid "triggerTouchpoint"


@NX-43111 @initBrowser @closeBrowser
Scenario: Verify new Trigger touchpoint creation  
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then create trigger touchpoint from sheet "triggerTouchpoint_default" with logic "FIFO" and trigger "selTrigger1"  
Then check trigger touchpoint in grid "triggerTouchpoint_default"

@NX-realTimeRTE @initBrowser 
Scenario: Verify new Trigger touchpoint creation  
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then create trigger touchpoint from sheet "rteTrigger_tp" with logic "LIFO" and trigger "sel_rteTrigger"  
Then check trigger touchpoint in grid "rteTrigger_tp"


############################ PROGRAM AND RULE CREATION FOR UI VERIFICATION ######################################
	 
@NDX-7144 @NDX-7141 @NDX-7140 @NDX-7137 @NDX-7136 @NDX-7133 @NDX-7132 @NDX-7125 @NDX-5711 @NDX-9983 @NDX-9979  @NDX-9980 @NDX-9981 @NDX-9982 @initBrowser  @closeBrowser
Scenario Outline: Verify create  <programRuleSheet> with tp <tp>
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "<programRuleSheet>" and offer catalog sheet "IMcatalog" and touchpoint from sheet "<tp>"
Then choose program from sheet "<programRuleSheet>"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "STVSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data from sheet "<programRuleSheet>" and offer "rechargeSMS" to row "1"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "rechargeSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data from sheet "<programRuleSheet>" and offer "rechargeSMS" to row "1"
Examples:
|programRuleSheet|tp|
|SMSprogram|smsTouchpoint|
|APIprogram|apiTouchpointGR|
|USSDprogram|ussdTouchpoint|
|CCprogram|CCTouchpoint|
|triggerrprogram|triggerTouchpoint|
	

 	 
 ########################### PROGRAM AND RULE CREATION FOR FUNCTIONALITY VERIFICATION #################################
 
@NDX-9978 @initBrowser  @closeBrowser
Scenario Outline: Verfiy creation of <programRuleSheet> with <tp>
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "<programRuleSheet>" and offer catalog sheet "IMcatalog" and touchpoint from sheet "<tp>"
Then choose program from sheet "<programRuleSheet>"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "STVSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data functionality from sheet "<programRuleSheet>" and offer "STVSMS"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "rechargeSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data functionality from sheet "<programRuleSheet>" and offer "rechargeSMS"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "rechargegobal" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data functionality from sheet "<programRuleSheet>" and offer "rechargegobal"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "usageBasedSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data functionality from sheet "<programRuleSheet>" and offer "usageBasedSMS"

Examples: 
|programRuleSheet|tp|
|SMSprogram|smsTouchpoint|
|APIprogram|apiTouchpointGR|
|USSDprogram|ussdTouchpoint|
|CCprogram|CCTouchpoint|
|triggerrprogram|triggerTouchpoint|	
	

 
@createprogramdeletedatasetup @initBrowser 
Scenario: Verify create a program delete
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "programdelete" and offer catalog sheet "IMcatalog" and touchpoint from sheet "smsTouchpoint"
Then choose program from sheet "programdelete"
Then create new rule with enddate from sheet "programdelete" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
Then "save" rule

@createprogramdeactivatedatasetup @initBrowser @NDX-9987
Scenario: Verify deactivating the created rule
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "programruledeactivate" and offer catalog sheet "IMcatalog" and touchpoint from sheet "smsTouchpoint"
Then choose program from sheet "programruledeactivate"
Then create new rule from sheet "programruledeactivate" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
Then "save" rule
 
############################# falcon #################################

@NDX-realTime&rechargeTrackingService @initBrowser  @closeBrowser
Scenario: Verify create a program and rule 
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "triggerrprogram" and offer catalog sheet "IMcatalog" and touchpoint from sheet "rteTrigger_tp"
Then choose program from sheet "triggerrprogram"
Then create new rule with enddate from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "rteTrigger_tp"
Then "save" rule
Then add program and rule from sheet "triggerrprogram" to column "1" of sheet "programRuleDetails"
   
    
    
################################   RULE CREATION FOR PRIORITIZATION LOGIC   ####################################################

@NDX-Program&RuleForPrioLogic @initBrowser 
Scenario Outline: Verify create a program and rule <programRuleSheet> with tp <tp>
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "<programRuleSheet>" and offer catalog sheet "IMcatalog" and touchpoint from sheet "<tp>"
Then choose program from sheet "<programRuleSheet>"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "rechargeSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data from sheet "<programRuleSheet>" and offer "rechargeSMS" to row "2"
Then create new rule with enddate from sheet "<programRuleSheet>" and offer "STVSMS" and touchpoint from sheet "<tp>"
Then "save" rule
Then add program data from sheet "<programRuleSheet>" and offer "STVSMS" to row "2"
		
Examples:
|programRuleSheet|tp|
|SMSprogram|smsTouchpoint_default|
|APIprogram|apiTouchpoint_default|
|APIprogramBestfit|apiTouchpointBestfit|
|APIprogramCustomLogic|apiTPCustomlogic|
|USSDprogram|ussdTouchpoint_default|
|CCprogram|CCTouchpoint_default|
|triggerrprogram|triggerTouchpoint_default|










#================================================================================================================

##@NX-createDefaultApiTouchpointGR @initBrowser @closeBrowser
##Scenario: create api touchpoint GR
##Given login
##Then navigate to intent management
##Then navigate to touchpoints
##Then navigate to api
##Then create api touchpoint from sheet "apiTouchpointGR_default"
##Then check api touchpoint in grid "apiTouchpointGR_default"
##Then add touchpoint "apiTouchpointGR_default" to api_auth_policy
#    
#    
##@NX-createDefaultApiTouchpointUA @initBrowser @closeBrowser
##Scenario: create api touchpoint UA
##Given login
##Then navigate to intent management
##Then navigate to touchpoints
##Then navigate to api
##Then create api touchpoint from sheet "apiTouchpointUA_default"
##Then check api touchpoint in grid "apiTouchpointUA_default"
##Then add touchpoint "apiTouchpointUA_default" to api_auth_policy


	
