#Author: your.email@your.domain.com
#Keywords Summary :
@NX-intentmanagemen
Feature: For IntentManagement migration

   @createprogramedit
 @NDX-5742,@NDX-5755,@NDX-5740,@NDX-7333,@NDX-7334,@NDX-7332,@NDX-5726,@NDX-7330,@NDX-7331,@NDX-7329,@NDX-5723,@NDX-7130,@NDX-7317,@NDX-7318,@NDX-7316,@NDX-5720
  @initBrowser
  Scenario: Verify create a program edit
    Given login
    Then navigate to landing page
    Then navigate to intent management
   
    Then navigate to programs
    Then choose program from sheet "SMSprogram" for edit
    Then verify edit program page "SMSprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "smsTouchpointedit"
    Then choose program from sheet "SMSprogram" after edited
    Then verify edited program page "SMSprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "smsTouchpointedit"

    Then navigate to programs
    Then choose program from sheet "APIprogram" for edit
    Then verify edit program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointGR"
    Then choose program from sheet "APIprogram" after edited
    Then verify edited program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointedit"
   
    Then navigate to programs
    Then choose program from sheet "USSDprogram" for edit
    Then verify edit program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "USSDprogram" after edited
    Then verify edited program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpointedit"
    Then navigate to programs
  
    Then choose program from sheet "CCprogram" for edit
    Then verify edit program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "CCTouchpoint"
    Then choose program from sheet "CCprogram" after edited
    Then verify edited program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ccTouchpointedit"

  @initBrowser @createprogramdelete
  @NDX-5729
  Scenario: Verify create a program delete
    Given login
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then choose program from sheet "programdelete"
    Then verify delete a program "programdelete"
    
    
      @initBrowser @programruleview
      @NDX-5739 @NDX-5740
  Scenario: Verify program rule view
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
   
    Then choose program from sheet "SMSprogram"
    
    Then verify rule created from sheet "rule"
    Then verify rule view from sheet "rule" and product "fullDetails"
    
       
    @initBrowser @programruledeactivate
    @NDX-10117 @NDX-5752
  Scenario: Verify program rule deactivate
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    
    Then choose program from sheet "SMSprogram"
    
    Then wait for 5 minutes
    Then verify rule deactivate
    
    @initBrowser @programrulecopy
    @NDX-6894 @NDX-10115	
      Scenario: Verify program rule copy
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
   
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
		
		
		@initBrowser @programruleeditregmig
    @NDX-5752 @NDX-10114
  Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
   
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
#	| customerWasSentTheTrialMessage |
#	| customerList                   |
#	| SharedcustomerList             |
#	| customerDrivenEvent            |
#	| usageMetric                    |
#	| sharedMetricOtherPartner  |
#	| customerDrivenEventNotOccurred  |
#	| customerWasSentTheTrialMessageNOtOccurred |
#	| conditionForANDOperation |
#	| conditionForOROperation |
#	| segmentAgeGT40                 |
	|System_Event_Occured|
	|System_Event_not_Occured|
	|user_Event_not_Occured|
	|user_Event_Occured|

   @initBrowser @programrulecopyedit
@NDX-6909,@NDX-6907,@NDX-6905,@NDX-6903,@NDX-6901,@NDX-6899,@NDX-6896,@NDX-6349,@NDX-6337,@NDX-6335,@NDX-6333,@NDX-6331,@NDX-6329,@NDX-6326,@NDX-6324
 Scenario Outline: Verify program rule copy edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
   
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
		   Then navigate to programs
		 Then choose program from sheet "SMSprogram"
      Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
    
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


		@initBrowser @programruleeditnone
    @NDX-6336, @NDX-6334, @NDX-6332, @NDX-6330, @NDX-6327
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    #Then click create program button
    #Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
  
    Then edit the targetSelection <Condition> for programrule
    Then verify rule target selection <Condition> after edit from sheet "rule" and product "fullDetails"
    
       Examples: 
      | Condition |
      | None     |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

    
        @initBrowser @NX-cctouchpointusage @NDX-9866
  Scenario: Verify create a customer care program full flow
    Given login
#        Then navigate to configuration management
#    Then naviagte to product classes
#    Then create product class and number attribute from "TestProductClass"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to products
#    Then navigate to product class "TestProductClass"
#    Then click create new product button
#    Then create product with attributes from sheet "fullDetails"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to offers
#    Then click on create new ofer button
#
#    Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Usage Metric"
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeSMS" offer to Offer Catalogue
      Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to customer care
    Then change Customercare Prioritization Logic to "FIFO" from sheet "CCTouchpoint"
    Then navigate to programs
    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
    Then choose program from sheet "CCprogram"
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"

    Then wait until rule is picked 
    Then logout
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer support
    Then search msisdn "919491750000"
#    Then verify offer "Balance Top ups"
    Then logout
    Then login
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "CCprogram"
    Then wait for 2 minutes
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    Then wait until rule is picked    
    Then logout
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer support
    Then search msisdn "919491750000"
#    Then verify offer "Balance Top ups"
    Then logout
    Then login
    Then navigate to intent management
    
    Then navigate to programs
    Then choose program from sheet "CCprogram"
   Then wait for 2 minutes
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    Then wait until rule is picked 
    Then logout
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer support
#   Then wait for 3 minutes
    Then search msisdn "919491750000"
#    Then verify offer "Balance Top"
#    Then wait for 3 minutes
#    Then enter msisdn again for refresh "919491750000"
      
#      Then verify offer "Balance Top ups"
      Then Customercare offer accept 
      
      
      @initBrowser @NX-smstestFIFO @NDX-10131
  Scenario: Verify whether offer gets served in FIFO order for migrated SMS touchpoint
    Given login
      Then navigate to intent management
    Then navigate to touchpoints
  Then navigate to sms
   Then change SMS Prioritization Logic to "FIFO" from sheet "smsTouchpoint"
    Then navigate to programs
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked 
    Then navigate to landing page
  Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab   
   Then verify offer "Balance Top ups"
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
    Then wait for 2 minutes
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked    
   Then navigate to landing page
  Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab   
    Then navigate to landing page
    Then navigate to intent management
    
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
   Then wait for 2 minutes
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked 
 Then navigate to landing page
    	Then login to the vcust
	Then hit with vcust SMS with number "9491750353" with keyword "1011"
	Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab
    Then wait for Message Recevied in consumer profile
      
      
      
            @initBrowser @NDX-10120
  Scenario: Verify request processing for migrated SMS touchpoint
    Given login
      Then navigate to intent management
      Then navigate to programs
        Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked 
    Then navigate to landing page
  Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab   
   Then verify offer "Balance Top ups"
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
    Then wait for 2 minutes
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked   
    Then login to the vcust
	Then hit with vcust SMS with number "9491750353" with keyword "1011"
	Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab
    Then wait for Message Recevied in consumer profile
      
          @initBrowser @NX-smstestLIFO @NDX-10125
  Scenario: Verify whether offer gets served in LIFO order for migrated SMS touchpoint
    Given login
      Then navigate to intent management
    Then navigate to touchpoints
  Then navigate to sms
   Then change SMS Prioritization Logic to "FIFO" from sheet "smsTouchpoint"
    Then navigate to programs
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked 
    Then navigate to landing page
  Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab   
   Then verify offer "Balance Top ups"
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
    Then wait for 2 minutes
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked    
   Then navigate to landing page
  Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab   
    Then navigate to landing page
    Then navigate to intent management
    
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
   Then wait for 2 minutes
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait until rule is picked 
 Then navigate to landing page
    	Then login to the vcust
	Then hit with vcust SMS with number "9491750353" with keyword "1011"
	Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab
    Then wait for Message Recevied in consumer profile
      
@NDX-10123
     @programtrigger
    @initBrowser
      Scenario: Verify program 
    Given login
     
#    Then navigate to configuration management
#    Then naviagte to product classes
#    Then create product class and number attribute from "TestProductClass"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to products
#    Then navigate to product class "TestProductClass"
#    Then click create new product button
#    Then create product with attributes from sheet "fullDetails"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to offers
#    Then click on create new ofer button
# 
#    Then create new offer from sheet "STVSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeSMS" offer to Offer Catalogue
#   Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "triggerrprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "triggerTouchpoint"
     Then choose program from sheet "triggerrprogram"
    Then create new rule from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "triggerTouchpoint"
    Then wait until rule is picked
    Then provide file for trigger with csv file "trigger2.csv"
    Then wait for 6 minutes
     Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "919491750282"
    Then click on events tab
    Then wait for offer eligible event in consumer profile 
    
    
    
           @initBrowser @NDX-10126
  Scenario: Verify whether offer gets served in LIFO order for migrated USSD touchpoint
    Given login
    Then navigate to intent management
#    Then navigate to touchpoints
#    Then navigate to ussd
#    Then change ussd Prioritization Logic to "LIFO" from sheet "ussdTouchpoint"
    Then navigate to programs
  Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "programdetails"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then create new rule with enddate from sheet "programdetails" and offer "rechargeSMS" and touchpoint from sheet "ussdTouchpoint"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then wait until rule is picked
    Then get-offer USSD for "9491750027" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "123" 
    
    
            @initBrowser @NX-USSDfifo @NDX-10132 
  Scenario: Verify whether offer gets served in FIFO order for migrated USSD touchpoint
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to ussd
    Then change ussd Prioritization Logic to "FIFO" from sheet "ussdTouchpoint"
    Then navigate to programs
  Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "programdetails"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then create new rule with enddate from sheet "programdetails" and offer "rechargeSMS" and touchpoint from sheet "ussdTouchpoint"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then wait until rule is picked
    Then get-offer USSD for "9491750027" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "123" 
             @initBrowser @NDX-9863	
  Scenario: Verify create a customer care program full flow
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
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
  Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"

    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "programdetails"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait until rule is picked
       Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "123"
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
    
                @initBrowser @NDX-9863
  Scenario: Verify usage based conversion for USSD touchpoint
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
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button

   Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Usage Metric"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "programdetails"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait until rule is picked
    Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "sel_uasge_metric.csv"
       Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "123"
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
    
    
    @initBrowser @NDX-ussdkeyword @NDX-9868		
  Scenario: Verify keyword based conversion for USSD touchpoint
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
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button

   Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Global Response App"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
 Then choose program from sheet "programdetails"
   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait until rule is picked
     Then get-offer USSD for "9491750354" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
    Then get-offer USSD for "94917503534" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
    Then get-offer USSD for "9491750354" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
    
        Then login to the vcust
#    Then navigate back to vcust
    Then hit with vcust SMS with number "9491750353" with keyword "seleniumkeyword"
