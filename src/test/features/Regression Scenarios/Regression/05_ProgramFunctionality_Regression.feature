#Author: Shobina.k
#Keywords Summary : covers functionality of IM Features
@IMFunctRegression
Feature: IM functionality regression

@NDX-9991 @initBrowser  
Scenario: Verify the request processing through CC touchpoint
Given login
Then filter program and rule created from sheet "CCprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "CCprogram"
Then filter rule from sheet "CCprogram"
Then edit new rule without enddate from sheet "CCprogram" and offer "rechargeSMS" and touchpoint from sheet "CCTouchpoint"
Then wait until rule is picked
Then navigate to landing page
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer support
Then search msisdn "9745081112"
Then Customercare offer accept

@NDX-9876 @initBrowser
Scenario: Verify recharge based conversion for customer care touchpoint
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumConversion/" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081112"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
Then verify condition Conversion is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
     
@NDX-9852 @closeBrowser
Scenario: Verify fulfillment processing for recharge offer with customer care touch point.
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"


@NDX-9990 @initBrowser @closeBrowser 
Scenario: Verify the request processing through API touchpoint
Given login
Then filter program and rule created from sheet "APIprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "APIprogram"
Then filter rule from sheet "APIprogram"
Then edit new rule without enddate from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointGR"
Then "activate" rule
Then filter rule from sheet "APIprogram"
Then wait until rule is picked

@apihit @initBrowser @closeBrowser 
Scenario: api touchpoint hit
Given login
Then get-offer api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then verify accept api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
@NDX-9878 @initBrowser 
Scenario: Verify the conversion of STV offer with API touch point.
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumConversion/" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
@NDX-9856 @closeBrowser
Scenario: Verify fulfillment processing for recharge offer with API touch point.
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
    
@NDX-9989 @initBrowser @closeBrowser
Scenario: Verfiy the request processing through USSD
Then filter program and rule created from sheet "USSDprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
Given login
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "USSDprogram"
Then filter rule from sheet "USSDprogram"
Then edit new rule without enddate from sheet "USSDprogram" and offer "rechargeSMS" and touchpoint from sheet "ussdTouchpoint"
Then wait until rule is picked
Then "activate" rule

    
@USSDHIT @initBrowser @closeBrowser
Scenario: USSD touchpoint hit
Given login
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Offer Eligible Event is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
Then verify condition Offer Accepted is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
 
@NDX-9868 @initBrowser  
Scenario: conversion for ussd
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumConversion/" for trigger with csv file "conversionIM.csv"
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
   
@NDX-9854 @closeBrowser
Scenario: Verify fulfillment processing for recharge offer with USSD touch point.
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
     
     
@NDX-9992 @initBrowser  @closeBrowser
Scenario: Verify the request processing thrugh SMS touchpoint
Given login
Then filter program and rule created from sheet "SMSprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "SMSprogram"
Then filter rule from sheet "SMSprogram"
Then edit new rule without enddate from sheet "SMSprogram" and offer "rechargeSMS" and touchpoint from sheet "smsTouchpoint"
Then wait until rule is picked
	
@vcustlogin  @initBrowser @closeBrowser
Scenario: login to Vcust for SMS hit
Then login to the vcust
Then hit with vcust SMS with number "9745081136" with keyword "seleniumsmstp"
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
     
@neonlogin  @closeBrowser
Scenario: login to neon and verify sms hit
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumConversion/" for trigger with csv file "conversionIM.csv"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
   
  
@NDX-9853 @closeBrowser
Scenario: fulfilment for sms
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
        
@NDX-triggerrecharge @initBrowser @closeBrowser
Scenario: Verify create a trigger program
Given login
Then filter program and rule created from sheet "triggerrprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "triggerrprogram"
Then filter rule from sheet "triggerrprogram"
Then edit new rule without enddate from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "triggerTouchpoint"
Then wait until rule is picked
Then provide file in location "/usr/local/flytxt/selenium/seleniumTrigger/" for trigger with csv file "trigger2.csv"
    
@NDX-9868 @initBrowser  
Scenario: conversion for trigger
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumConversion/" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
Then verify condition Conversion is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
   
@NDX-9854 @closeBrowser
Scenario: conversion through keyword
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
        
        
##################################################  STV OFFER CONVERSION   #####################################################
@NDX-9881	@initBrowser  
Scenario: Verify the conversion of STV offer with SMS touch point. 
Given login
Then filter program and rule created from sheet "CCprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "CCprogram"
Then filter rule from sheet "CCprogram"
Then edit new rule without enddate from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
Then wait until rule is picked
Then navigate to landing page
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer support
Then search msisdn "9745081112"
Then Customercare offer accept

@NDX-ccstv @initBrowser
Scenario: conversion CC
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081112"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "STVSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
Then verify condition Conversion is persisted with offer from sheet "STVSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
     
@NDX-9857 @closeBrowser
Scenario: Fulfillment of CC program
Then verify condition Fulfillment Success is persisted with offer from sheet "STVSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"


@NDX-9878 @initBrowser @closeBrowser 
Scenario: Verify the conversion of STV offer with API touch point.
Given login
Then filter program and rule created from sheet "APIprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "APIprogram"
Then filter rule from sheet "APIprogram"
Then edit new rule without enddate from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
Then wait until rule is picked
    
@apihit @initBrowser @closeBrowser 
Scenario: api touchpoint hit
Given login
Then navigate to precision marketer
Then get-offer api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then verify accept api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Offer Eligible Event is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
Then verify condition Offer Accepted is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
@NDX-apistv  @initBrowser 
Scenario: conversion API program
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
Then verify condition Fulfillment Success is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"   
    
@NDX-9859 @initBrowser @closeBrowser
Scenario: Verify create a USSD program STV
Given login
Then filter program and rule created from sheet "USSDprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "USSDprogram"
Then filter rule from sheet "USSDprogram"
Then edit new rule without enddate from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
Then wait until rule is picked
    
@USSDHIT @initBrowser @closeBrowser
Scenario: USSD touchpoint hit
Given login
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
    
@NDX-9868 @initBrowser  
Scenario: conversion for ussd
Given login
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
Then verify condition Conversion is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
   
@NDX-9859 @closeBrowser
Scenario: Verify fulfillment processing for STV offer with USSD touch point.
Then verify condition Fulfillment Success is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
     
@NDX-9881 @initBrowser  @closeBrowser
Scenario: Verify the conversion of STV offer with SMS touch point.
Given login
Then filter program and rule created from sheet "SMSprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "SMSprogram"
Then filter rule from sheet "SMSprogram"
Then edit new rule without enddate from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
Then wait until rule is picked

@NDX-9869  @initBrowser @closeBrowser
Scenario: login to Vcust for SMS hit
Then login to the vcust
Then hit with vcust SMS with number "9745081136" with keyword "seleniumsmstp"
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
Then verify condition Conversion is persisted with offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"


@NDX-9853 @closeBrowser
Scenario: fulfilment for sms
 Then verify condition Fulfillment Success is persisted with offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
        
@NDX-9879 @initBrowser @closeBrowser
Scenario: Verify the conversion of STV offer with Trigger touch point.
Given login
Then filter program and rule created from sheet "triggerrprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "triggerrprogram"
Then filter rule from sheet "triggerrprogram"
Then edit new rule without enddate from sheet "triggerrprogram" and offer "STVSMS" and touchpoint from sheet "triggerTouchpoint"
Then wait until rule is picked
    
@NDX-9868 @initBrowser  
Scenario: conversion for trigger
Given login 
Then provide file in location "/usr/local/flytxt/selenium/seleniumIM/" for trigger with csv file "trigger2.csv"
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "STVSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
Then verify condition Conversion is persisted with offer from sheet "STVSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
   
@NDX-9860 @closeBrowser
Scenario: Verify fulfillment processing for STV offer with Trigger touch point.
Then verify condition Fulfillment Success is persisted with offer from sheet "STVSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
        
        
######################################################## KEYWORD BASED CONVERSION ################################################
        
@NDX-9871 @initBrowser  
Scenario: Verify keyword based conversion for custmer care touchpoint
  Given login
Given login
Then filter program and rule created from sheet "CCprogram" and offer "rechargegobal" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "CCprogram"
Then filter rule from sheet "CCprogram"
Then edit new rule without enddate from sheet "CCprogram" and offer "rechargegobal" and touchpoint from sheet "CCTouchpoint"
Then wait until rule is picked
Then navigate to landing page
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer support
Then search msisdn "9745081112"
Then Customercare offer accept

@NDX-cckeyword @initBrowser
Scenario: conversion CC
Given login
Then login to the vcust
Then hit with vcust SMS with number "9491750351" with keyword "seleniumkeyword"
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081112"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
Then verify condition Conversion is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
     
@NDX-stvfulfill @closeBrowser
Scenario: Fulfillment of CC program
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"


@NDX-9867 @initBrowser @closeBrowser 
Scenario: Verify keyword based conversion for API touchpoint
Given login
Then filter program and rule created from sheet "APIprogram" and offer "rechargegobal" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "APIprogram"
Then filter rule from sheet "APIprogram"
Then edit new rule without enddate from sheet "APIprogram" and offer "rechargegobal" and touchpoint from sheet "apiTouchpointGR"
Then wait until rule is picked
    
@apihit @initBrowser @closeBrowser
Scenario: api touchpoint hit
Given login
Then navigate to precision marketer
Then get-offer api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then verify accept api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"

@NDX-apikeyword  @initBrowser
Scenario: conversion API program
Given login
Then login to the vcust
Then hit with vcust SMS with number "9491750351" with keyword "seleniumkeyword"
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"

@NDX-9856 @closeBrowser
Scenario: fulfilment for Api
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
    
@NDX-ussdstv @initBrowser @closeBrowser
Scenario: Verify create a USSD program
Given login
Then filter program and rule created from sheet "USSDprogram" and offer "rechargegobal" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "USSDprogram"
Then filter rule from sheet "USSDprogram"
Then edit new rule without enddate from sheet "USSDprogram" and offer "rechargegobal" and touchpoint from sheet "ussdTouchpoint"
Then wait until rule is picked
    
     @NDX-9868 @initBrowser @closeBrowser
  Scenario: Verify keyword based conversion for USSD touchpoint
  Given login
    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
    
    
 @NDX-9868 @initBrowser  
Scenario: conversion for ussd
Given login
Then login to the vcust
Then hit with vcust SMS with number "9491750351" with keyword "seleniumkeyword"
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
Then verify condition Conversion is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
   
@NDX-9854 @closeBrowser
Scenario: conversion through keyword
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
     
@NDX-10003 @initBrowser  @closeBrowser
Scenario: Verify create a SMS program
Given login
Then filter program and rule created from sheet "SMSprogram" and offer "rechargegobal" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "SMSprogram"
Then filter rule from sheet "SMSprogram"
Then edit new rule without enddate from sheet "SMSprogram" and offer "rechargegobal" and touchpoint from sheet "smsTouchpoint"
Then wait until rule is picked

@vcustlogin  @initBrowser @closeBrowser
Scenario: login to Vcust for SMS hit
Then login to the vcust
Then hit with vcust SMS with number "9745081136" with keyword "seleniumsmstp"

@NDX-9869 @initBrowser 
Scenario: conversion for sms
Then login to the vcust
Then hit with vcust SMS with number "9491750351" with keyword "seleniumkeyword"
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
Then verify condition Conversion is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"

@NDX-9853 @closeBrowser
Scenario: fulfilment for sms
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"  
     
@NDX-9870 @initBrowser @closeBrowser
Scenario: Verify keyword based conversion for Trigger touchpoint
Given login
Then filter program and rule created from sheet "triggerrprogram" and offer "rechargegobal" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "triggerrprogram"
Then filter rule from sheet "triggerrprogram"
Then edit new rule without enddate from sheet "triggerrprogram" and offer "rechargegobal" and touchpoint from sheet "triggerTouchpoint"
Then wait until rule is picked
    
@NDX-9868 @initBrowser  
Scenario: conversion for trigger
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumTrigger/" for trigger with csv file "trigger2.csv"
Then login to the vcust
Then hit with vcust SMS with number "9491750357" with keyword "seleniumkeyword"
Then navigate to the neon again
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9491750357"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
Then verify condition Conversion is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
   
@NDX-9854 @closeBrowser
Scenario: Fulfillment through keyword
Then verify condition Fulfillment Success is persisted with offer from sheet "rechargegobal" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
     
        
########################################################## USAGE BASED CONVERSION ########################################################
  
@NDX-9866 @initBrowser  
Scenario: Verify usage based conversion for customer care touchpoint
Given login
Then filter program and rule created from sheet "CCprogram" and offer "usageBasedSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "CCprogram"
Then filter rule from sheet "CCprogram"
Then edit new rule without enddate from sheet "CCprogram" and offer "usageBasedSMS" and touchpoint from sheet "CCTouchpoint"
Then wait until rule is picked
Then navigate to landing page
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer support
Then search msisdn "9745081112"
Then Customercare offer accept

@NDX-ccusage @initBrowser
Scenario: conversion CC
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumMetric" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081112"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
Then verify condition Conversion is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
     
@NDX-usagefulfill @closeBrowser
Scenario: Fulfillment of CC program
Then verify condition Fulfillment Success is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"


  @NDX-9862 @initBrowser @closeBrowser 
  Scenario: Verify usage based conversion for API touchpoint
Given login
Then filter program and rule created from sheet "APIprogram" and offer "usageBasedSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "APIprogram"
Then filter rule from sheet "APIprogram"
Then edit new rule without enddate from sheet "APIprogram" and offer "usageBasedSMS" and touchpoint from sheet "apiTouchpointGR"
Then wait until rule is picked
    
@apihit @initBrowser @closeBrowser 
Scenario: api touchpoint hit
Given login
Then get-offer api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then verify accept api-server for "9745081104" with touchpoint "apiTouchpointGR" and rule "APIprogram"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Offer Eligible Event is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
Then verify condition Offer Accepted is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
    @NDX-apiusage  @initBrowser 
  Scenario: conversion API program
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumMetric" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081104"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "apiTouchpointGR" and rule from sheet "APIprogram"
    
    
 @NDX-9863 @initBrowser @closeBrowser
  Scenario: Verify usage based conversion for USSD touchpoint
Given login
Then filter program and rule created from sheet "USSDprogram" and offer "usageBasedSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "USSDprogram"
Then filter rule from sheet "USSDprogram"
Then edit new rule without enddate from sheet "USSDprogram" and offer "usageBasedSMS" and touchpoint from sheet "ussdTouchpoint"
Then wait until rule is picked

     @USSDHIT @initBrowser @closeBrowser
  Scenario: USSD touchpoint hit
Given login
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Offer Accepted is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"

@NDX-9868 @initBrowser  
Scenario: conversion for ussd
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumMetric" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081121"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
   
@NDX-9854 @closeBrowser
Scenario: conversion through keyword
Then verify condition Fulfillment Success is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
     
@NDX-9864 @initBrowser  @closeBrowser
Scenario: Verify usage based conversion for SMS touchpoint
Given login
Then filter program and rule created from sheet "SMSprogram" and offer "usageBasedSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "SMSprogram"
Then filter rule from sheet "SMSprogram"
Then edit new rule without enddate from sheet "SMSprogram" and offer "usageBasedSMS" and touchpoint from sheet "smsTouchpoint"
Then wait until rule is picked
	 
@vcustlogin  @initBrowser @closeBrowser
Scenario: login to Vcust for SMS hit
Then login to the vcust
Then hit with vcust SMS with number "9745081136" with keyword "seleniumsmstp"
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
   
@NDX-9869 @initBrowser 
Scenario: conversion for sms
Given login
Then provide file in location "/usr/local/flytxt/selenium/seleniumMetric" for trigger with csv file "conversionIM.csv"
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Conversion is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
  
@NDX-9853 @closeBrowser
Scenario: fulfilment for sms
Then verify condition Fulfillment Success is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"     
        
        
@NDX-triggerrecharge @initBrowser @closeBrowser
Scenario: Verify create a trigger program
Given login
Then filter program and rule created from sheet "triggerrprogram" and offer "usageBasedSMS" of excelfile "IMdatafunctionality"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "triggerrprogram"
Then filter rule from sheet "triggerrprogram"
Then edit new rule without enddate from sheet "triggerrprogram" and offer "usageBasedSMS" and touchpoint from sheet "triggerTouchpoint"
Then wait until rule is picked
Then provide file in location "/usr/local/flytxt/selenium/seleniumTrigger" for trigger with csv file "trigger2.csv"


@NDX-9868 @initBrowser  
Scenario: conversion for trigger
Given login 
Then provide file in location "/usr/local/flytxt/selenium/seleniumIM/" for trigger with csv file "trigger2.csv"
   
@NDX-9869 @initBrowser 
Scenario: conversion for trigger 
Given login
Then navigate to landing page
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn "9745081136"
Then click on events tab
Then verify condition Acknowledged is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
Then verify condition Conversion is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"
  
@NDX-9853 @closeBrowser
Scenario: fulfilment for sms
Then verify condition Fulfillment Success is persisted with offer from sheet "usageBasedSMS" and touchpoint from sheet "triggerTouchpoint" and rule from sheet "triggerrprogram"

################################## falcon ##############
@NDX-test  @initBrowser
Scenario: verify the real time and recharge track service
Given login
Then filter program and rule from sheet "programRuleDetails" row "1" and add to sheet "triggerrprogram"
Then navigate to intent management
Then navigate to programs
Then choose program from sheet "triggerrprogram"
Then filter rule from sheet "triggerrprogram"
Then edit new rule without enddate from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "rteTrigger_tp"
Then wait until rule is picked
Then wait for 1 minutes
Then post the api call for msisdn "919745081170" with streaming attribute from sheet "rteService"





































     
############################################ PRIORITIZATION OF OFFER (LIFO) VERIFICATION ################################### 
#
#@NDX-9991 @initBrowser  
#Scenario: Verify the request processing through CC touchpoint for LIFO Logic
#Given login
#Then filter program and rule created from sheet "CCprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
#Then navigate to intent management
#Then navigate to programs
#Then choose program from sheet "CCprogram"
#Then filter rule from sheet "CCprogram"
#Then edit new rule without enddate from sheet "CCprogram" and offer "rechargeSMS" and touchpoint from sheet "CCTouchpoint_default"
#Then wait until rule is picked
#Then filter program and rule created from sheet "CCprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
#Then filter rule from sheet "CCprogram"
#Then edit new rule without enddate from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint_default"
#Then wait until rule is picked
#Then logout
#Then login with selenium user
#Then navigate to intent management
#Then navigate to reports
#Then navigate to customer support
#Then search msisdn "9745081112"
#Then Customercare offer accept
#
#@NDX-9992 @initBrowser  @closeBrowser
#Scenario: Verify the request processing thrugh SMS touchpoint
#Given login
#Then filter program and rule created from sheet "SMSprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
#Then navigate to intent management
#Then navigate to programs
#Then choose program from sheet "SMSprogram"
#Then filter rule from sheet "SMSprogram"
#Then edit new rule without enddate from sheet "SMSprogram" and offer "rechargeSMS" and touchpoint from sheet "smsTouchpoint_default"
#Then wait until rule is picked
#Then filter program and rule created from sheet "SMSprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
#Then filter rule from sheet "SMSprogram"
#Then edit new rule without enddate from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint_default"
#Then wait until rule is picked
#Then login to the vcust
#Then hit with vcust SMS with number "9745081136" with keyword "seleniumsmstp"
#
#@NDX-9862 @initBrowser @closeBrowser 
#Scenario: Verify usage based conversion for API touchpoint
#Given login
#Then filter program and rule created from sheet "APIprogram" and offer "rechargeSMS" of excelfile "IMdatafunctionality"
#Then navigate to intent management
#Then navigate to programs
#Then choose program from sheet "APIprogram"
#Then filter rule from sheet "APIprogram"
#Then edit new rule without enddate from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointGR_default"
#Then wait until rule is picked
#Then filter rule from sheet "APIprogram"
#Then edit new rule without enddate from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointGR_default"
#Then wait until rule is picked
#Then filter program and rule created from sheet "APIprogram" and offer "STVSMS" of excelfile "IMdatafunctionality"
#Then filter rule from sheet "APIprogram"
#Then edit new rule without enddate from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR_default"
#Then wait until rule is picked
#Then get-offer api-server for "9745081104" with touchpoint "apiTouchpoint_default" and rule "APIprogram"






































































#    @initBrowser @NDX-10131
#  Scenario: Verify create a sms  program full flow
#    Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#  Then navigate to sms
#   Then change SMS Prioritization Logic to "LIFO" from sheet "smsTouchpoint"
#    Then navigate to programs
#    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
#    Then choose program from sheet "SMSprogram"
#    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
#    Then wait until rule is picked 
#      Then navigate to landing page
#  Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9491750022"
#    Then click on events tab   
#   Then verify condition Offer Eligible Event is persisted with offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "SMSprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "SMSprogram" and offer "rechargeSMS" and touchpoint from sheet "smsTouchpoint"
#    Then wait until rule is picked    
#   	Then navigate to landing page
#  	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9491750022"
#    Then click on events tab
#    Then verify condition Offer Eligible Event is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"  
#   	Then navigate to landing page
#    Then login to the vcust
#	Then hit with vcust SMS with number "9491750022" with keyword "1011"
#	Then navigate to the neon again
#	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9491750022"
#    Then click on events tab
#    Then wait for Message Recevied in consumer profile  
#      
#      
#      @initBrowser @NDX-10125
#  Scenario: Verify create a sms program fifo
#    Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#  Then navigate to sms
#   Then change SMS Prioritization Logic to "FIFO" from sheet "smsTouchpoint"
#    Then navigate to programs
#    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
#    Then choose program from sheet "SMSprogram"
#    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
#    Then wait until rule is picked 
#    Then navigate to landing page
#  Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9491750022"
#    Then click on events tab   
#    Then verify condition Offer Eligible Event is persisted with offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "SMSprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "SMSprogram" and offer "rechargeSMS" and touchpoint from sheet "smsTouchpoint"
#    Then wait until rule is picked    
#   	Then navigate to landing page
#  	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9491750022"
#    Then click on events tab
#    Then verify condition Offer Eligible Event is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "smsTouchpoint" and rule from sheet "SMSprogram"     
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "SMSprogram"
#   	Then wait for 2 minutes
#    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
#    Then wait until rule is picked 
# 	Then navigate to landing page
#    	Then login to the vcust
#	Then hit with vcust SMS with number "9491750353" with keyword "1011"
#	Then navigate to the neon again
#	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9491750022"
#    Then click on events tab
#    Then wait for Message Recevied in consumer profile  
#         
#          @initBrowser @NX-cctouchpointfifo @NDX-10127
#  Scenario: Verify create a customer care program LIFO
#    Given login
#    Then navigate to intent management
#    Then navigate to touchpoints
#    Then navigate to customer care
#    Then change Customercare Prioritization Logic to "LIFO" from sheet "CCTouchpoint"
#    Then navigate to programs
#    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
#    Then choose program from sheet "CCprogram"
#    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked 
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#    Then search msisdn "919592850004"
#    Then verify offer "Recharge Offer"
#    Then logout
#    Then login
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "CCprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "CCprogram" and offer "STVWAP" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked    
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#    Then search msisdn "919592850004"
#    Then verify offer "Balance Top ups"
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#   Then wait for 3 minutes
#    Then search msisdn "919592850004"
#   Then verify offer "Recharge Offer"
#    Then wait for 3 minutes
#    Then enter msisdn again for refresh "919491750000"
#    Then Customercare offer accept 
#    Then navigate to landing page
#     Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081107"
#    Then click on events tab
#	Then verify condition Offer Accepted is persisted with offer from sheet "STVWAP" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
#     
#     @initBrowser @NX-cctouchpointfifo @NDX-10133
#  Scenario: Verify create a customer care program FIFO
#    Given login
#    Then navigate to intent management
#    Then navigate to touchpoints
#    Then navigate to customer care
#    Then change Customercare Prioritization Logic to "FIFO" from sheet "CCTouchpoint"
#    Then navigate to programs
#    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
#    Then choose program from sheet "CCprogram"
#    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked 
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#    Then search msisdn "919592850004"
#    Then verify offer "Recharge Offer"
#    Then logout
#    Then login
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "CCprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "CCprogram" and offer "STVWAP" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked    
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#    Then search msisdn "919592850004"
#    Then verify offer "Recharge Offer"
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#   Then wait for 3 minutes
#    Then search msisdn "919592850004"
#   Then verify offer "Recharge Offer"
#    Then wait for 3 minutes
#    Then enter msisdn again for refresh "919491750000"
#    Then Customercare offer accept 
#    Then navigate to landing page
#     Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081107"
#    Then click on events tab
#    Then verify condition Offer Accepted is persisted with offer from sheet "STVWAP" and touchpoint from sheet "CCTouchpoint" and rule from sheet "CCprogram"
#    
#    
#    
#    
#    
#    
#    
#    
#    
  #====================================================================   
     
#      @initBrowser @NDX-10132 
#  Scenario: Verify create a USSD program FIFO
#    Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#  Then navigate to sms
#   Then change ussd Prioritization Logic to "FIFO" from sheet "ussdTouchpoint"
#    Then navigate to programs
#    Then verify create program page "USSDprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
#    Then choose program from sheet "USSDprogram"
#    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
#    Then wait until rule is picked 
#    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
#      Then navigate to landing page
#  Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab   
#   Then verify condition Offer Recommended is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "USSDprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "USSDprogram" and offer "rechargeSMS" and touchpoint from sheet "ussdTouchpoint"
#    Then wait until rule is picked 
#     Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"   
#   	Then navigate to landing page
#  	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab
#    Then verify condition Offer Recommended is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"   
# 	Then navigate to landing page
# 	Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
#    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
#    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
#	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab
#    Then verify condition Offer Accepted is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram" 
#    
#         @initBrowser @NDX-10126
#  Scenario: Verify create a USSD program LIFO
#    Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#  Then navigate to sms
#   Then change ussd Prioritization Logic to "LIFO" from sheet "ussdTouchpoint"
#    Then navigate to programs
#    Then verify create program page "USSDprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
#    Then choose program from sheet "USSDprogram"
#    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
#    Then wait until rule is picked 
#    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
#      Then navigate to landing page
#  Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab   
#   Then verify condition Offer Recommended is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "USSDprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "USSDprogram" and offer "STVWAP" and touchpoint from sheet "ussdTouchpoint"
#    Then wait until rule is picked 
#     Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"   
#   	Then navigate to landing page
#  	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab
#    Then verify condition Offer Recommended is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"   
#    Then navigate to landing page
#    Then navigate to intent management
#        Then navigate to programs
#    Then choose program from sheet "USSDprogram"
#   	Then wait for 2 minutes
#    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
#    Then wait until rule is picked 
# 	Then navigate to landing page
# 	Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
#    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
#    Then get-offer USSD for "9745081121" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
#	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab
#    Then verify condition Offer Accepted is persisted with offer from sheet "STVSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram" 
#     
#     
#     
#      @initBrowser @NDX-10135
#  Scenario: Verify create a api program FIFO
#    Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#  Then navigate to sms
#   Then change SMS Prioritization Logic to "FIFO" from sheet "ussdTouchpoint"
#    Then navigate to programs
#    Then verify create program page "APIprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
#    Then choose program from sheet "APIprogram"
#    Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointUR_default"
#    Then wait until rule is picked 
#   Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule" 
#      Then navigate to landing page
#  Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab   
#   Then verify condition Offer Recommended is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointUR_default" and rule from sheet "APIprogram"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "APIprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUR_default"
#    Then wait until rule is picked 
#     Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"   
#   	Then navigate to landing page
#  	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "919745081149"
#    Then click on events tab
#    Then verify condition Offer Recommended is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"   
#  	Then navigate to landing page
#  	Then get-offer api-server for "919745081149" with touchpoint "apiTouchpoint_default" and rule "rule"
# 	Then verify accept api-server for "919745081149" with touchpoint "apiTouchpoint_default" and rule "rule"
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "919745081149"
#    Then click on events tab
#      Then verify condition Offer Accepted is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointUR_default" and rule from sheet "APIprogram"
#     
#           @initBrowser @NDX-10129
#  Scenario: Verify create a api program FIFO
#    Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#  Then navigate to sms
#   Then change SMS Prioritization Logic to "LIFO" from sheet "ussdTouchpoint"
#    Then navigate to programs
#    Then verify create program page "APIprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
#    Then choose program from sheet "APIprogram"
#    Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointUR_default"
#    Then wait until rule is picked 
#   Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule" 
#      Then navigate to landing page
#  Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "9745081121"
#    Then click on events tab   
#   Then verify condition Offer Recommended is persisted with offer from sheet "STVSMS" and touchpoint from sheet "apiTouchpointUR_default" and rule from sheet "APIprogram"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "APIprogram"
#    Then wait for 2 minutes
#    Then create new rule from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUR_default"
#    Then wait until rule is picked 
#     Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"   
#   	Then navigate to landing page
#  	Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "919745081149"
#    Then click on events tab
#    Then verify condition Offer Recommended is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "ussdTouchpoint" and rule from sheet "USSDprogram"   
#  	Then navigate to landing page
#  	Then get-offer api-server for "919745081149" with touchpoint "apiTouchpoint_default" and rule "rule"
# 	Then verify accept api-server for "919745081149" with touchpoint "apiTouchpoint_default" and rule "rule"
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer profile
#    Then search msisdn "919745081149"
#    Then click on events tab
#      Then verify condition Offer Accepted is persisted with offer from sheet "rechargeSMS" and touchpoint from sheet "apiTouchpointUR_default" and rule from sheet "APIprogram"