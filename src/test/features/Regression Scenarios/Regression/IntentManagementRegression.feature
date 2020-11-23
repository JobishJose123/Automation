#Author: your.email@your.domain.com
#Keywords Summary :
@NX-intentmanagemen
Feature: For IntentManagement Regression.


   	 @createprogramregnew
    @NDX-7136, @NDX-7133, @NDX-7132, @NDX-7125, @NDX-5711,@NDX-5732 
  @initBrowser
  Scenario: Verify create a program
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
#    Then Add "STVSMS" offer to Offer Catalogue
#   Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
#    Then click create program button
#    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
     Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "rechargeSMS" and touchpoint from sheet "smsTouchpoint"
      Then add program data regression from sheet "SMSprogram"
      Then filter program and rule created from sheet "SMSprogram"
 	Then navigate to programs
#    Then click create program button
#    Then verify create program page "triggerrprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "triggerTouchpoint"
#     Then choose program from sheet "triggerrprogram"
#    Then create new rule from sheet "triggerrprogram" and offer "STVSMS" and touchpoint from sheet "triggerTouchpoint"
#    Then navigate to programs
    Then click create program button
    Then verify create program page "APIprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR"
    Then choose program from sheet "APIprogram"
    Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
#    Then navigate to programs
#    Then click create program button
#    Then verify create program page "USSDprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
#    Then choose program from sheet "USSDprogram"
#    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
#    Then navigate to programs
#    Then click create program button
#    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
#    Then choose program from sheet "CCprogram"
#    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"

  @initBrowser @createprogramrulereg
  Scenario: Verify create a program rule
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then verify rule created from sheet "rule"
    Then navigate to programs
    Then choose program from sheet "APIprogram"
    Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
    Then verify rule created from sheet "rule"
    Then navigate to programs
    Then choose program from sheet "USSDprogram"
    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then verify rule created from sheet "rule"
    Then navigate to programs
    Then choose program from sheet "CCprogram"
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    Then verify rule created from sheet "rule"
    

   @createprogrameditreg
  @NDX-7337,@NDX-7336,@NDX-7335,@NDX-5725,@NDX-7328,@NDX-7327,@NDX-7326,@NDX-5722,@NDX-7321,@NDX-7320,@NDX-7319,@NDX-5716,@NDX-5719 @NDX-7315 @NDX-7314 @NDX-7313
  @initBrowser
  Scenario: Verify create a program edit
    Given login
    Then navigate to landing page
    Then navigate to intent management
   
   Then navigate to programs
   Then filter program and rule created from sheet "SMSprogram"
    Then choose program from sheet "SMSprogram" for edit
    Then verify edit program page "SMSprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "smsTouchpointedit"
    Then choose program from sheet "SMSprogram" after edited
    Then verify edited program page "SMSprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "smsTouchpointedit"

    Then navigate to programs
    Then choose program from sheet "APIprogram" for edit
    Then verify edit program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointedit"
  Then choose program from sheet "APIprogram" after edited
    Then verify edited program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointedit"
   
    Then navigate to programs
    Then choose program from sheet "USSDprogram" for edit
    Then verify edit program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpointedit"
    Then choose program from sheet "USSDprogram" after edited
    Then verify edited program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpointedit"
    Then navigate to programs
 
    Then choose program from sheet "CCprogram" for edit
    Then verify edit program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ccTouchpointedit"
    Then choose program from sheet "CCprogram" after edited
    Then verify edited program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ccTouchpointedit"

  @initBrowser @createprogramdelete12
  @NDX-5729
  Scenario: Verify create a program delete
    Given login
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdelete" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then verify delete a program "programdelete"
    
    
      @initBrowser @programruleview11
      @NDX-5739, @NDX-5740
  Scenario: Verify program rule view
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then verify rule created from sheet "rule"
    Then verify rule view from sheet "rule" and product "fullDetails"
    
       
    @initBrowser @programruledeactivatereg
    @NDX-5755, @NDX-5752 @NDX-10117	
      Scenario: Verify program rule deactivate
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait for 5 minutes
    Then verify rule deactivate
    
    @initBrowser @programrulecopy11
    @NDX-6894 @NDX-6321
  Scenario: Verify program rule copy
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
		
		
		@initBrowser @programruleeditreg  @NDX-9984 @NDX-5755
     @NDX-5752,@NDX-6319,@NDX-6317,@NDX-6073	
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
#	| customerWasSentTheTrialMessage |
#	| customerList                   |
	| SharedcustomerList             |

	
	@initBrowser @programruleeditreg
    @NDX-5755, @NDX-5752 @NDX-5818S
  Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	
	@initBrowser @programruleeditreg
    @NDX-5755, @NDX-5752,@NDX-5824,@NDX-5814	
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	
	
		@initBrowser @programruleeditreg123
		@NDX-9986
    @NDX-5755, @NDX-5752,@NDX-5822,@NDX-5820	
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
#    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
#      | conditionForOROperation |
		| IMEventsOfferRecommended |
	|IMEventsOfferDeclined|
	

   @initBrowser @programrulecopyedit11 @NDX-10116
@NDX-6908, @NDX-6906, @NDX-6904 @NDX-5818
@NDX-6902, @NDX-6900, @NDX-6898, @NDX-6350, @NDX-6897, @NDX-6338
 Scenario Outline: Verify program rule copy edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
	 Then navigate to programs
		 Then choose program from sheet "SMSprogram" after edited
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
#	| conditionForOROperation |



		@initBrowser @programruleeditnone
    @NDX-6336, @NDX-6334, @NDX-6332, @NDX-6330, @NDX-6327
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram" after edited
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
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
      
          @NDX-createTriggerWithDKJob2 @initBrowser
    Scenario: create streaming attribute and trigger and dk job for trigger
    Given login
    Then navigate to data foundation
    Then navigate to streaming attributes
    Then create new streaming attribute from sheet "streamingAttr"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then select triggers in configuration
    Then create new trigger "selTrigger2" with streaming attribute from sheet "streamingAttr"
    Then create a dk job "Sel_TriggerJob2" with input location "/usr/local/flytxt/seleniumTriggerForIM" streaming attribute "streamingAttr" 
    Then navigate to landing page
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then filter the job "Sel_TriggerJob2" and activate it
      	
     
    
    
         
      @programtrigger
    @NDX-9860 @initBrowser
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
#    Then Add "STVSMS" offer to Offer Catalogue
#   Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
#    Then click create program button
#    Then verify create program page "triggerrprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "triggerTouchpoint"
     Then choose program from sheet "triggerrprogram"
    Then create new rule from sheet "triggerrprogram" and offer "STVSMS" and touchpoint from sheet "triggerTouchpoint"
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
    
    
    
   
    
    
  
    
    
    
    
      @createprogramwithDNC
   @initBrowser @NDX-10399
  Scenario: Verify create a program
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
  Then verify create program page "triggerrprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "triggerCG"
    Then choose program from sheet "triggerrprogram"
    Then create new rule from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "triggerCG" with list "selenium_list"
    Then wait until rule is picked
    Then provide file in location "/usr/local/flytxt/seleniumTriggerForIM" for trigger with csv file "trigger2.csv"
#   Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "trigger2.csv"
    Then wait for 1 minutes
     Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "919491750282"
    Then click on events tab
    Then wait for offer eligible event in consumer profile 
    
    
    
    
    
   #============================================================================== S M S ===================================================================================#
    
    
        @initBrowser @NDX-9869 @NDX-9858
  Scenario: Verify keyword based conversion for SMS touchpoint
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
    Then create new offer from sheet "STVSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Global Response App"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
	Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
	Then navigate back to vcust
	Then login to the vcust
    Then hit with vcust SMS with number "9491750351" with keyword "smsTP1245"
   
	Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750351"
    Then click on events tab
    
    Then navigate back to vcust
    Then hit with vcust SMS with number "9491750351" with keyword "seleniumkeyword"
    Then raise the conversion job
    Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750351"
    Then click on events tab
    Then wait for conversion in consumer profile with offer "STVSMS"
    Then wait for Fulfillment Success in consumer profile with offer "STVSMS"
    
 
 
 
 
 
 
 
 #================================================================================ A P I======================================================================================#
 
  @NX-apitestkeyword @NDX-9856 @NDX-9867
	 @initBrowser 
  Scenario: Verify keyword based conversion for API touchpoint.
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
   Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Global Response App"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "programdetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUR_default"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750351"
    Then click on events tab
#    Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"
#    Then wait for offer recommended event for API in consumer profile
    Then accept api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"
#    Then wait for offer accepted event in consumer profile
    Then login to the vcust
    Then navigate back to vcust
    Then hit with vcust SMS with number "9491750351" with keyword "seleniumkeyword"
    Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750351"
    Then click on events tab
    Then wait for Fulfillment Success in consumer profile with offer "rechargeSMS"
 
 
   
 #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- #
  
      @NDX-9862 
	 @initBrowser 
  Scenario: Verify usage based conversion for API touchpoint
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
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "programdetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUR_default"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
     Then filter the job "selMetricEventUpload" and activate it
    Then provide file for trigger with csv file "selenium_list _metric_event.csv"
     Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "919491750258"
    Then click on events tab
 
    Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "919491750258" with touchpoint "apiTouchpoint_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
    Then accept api-server for "919491750258" with touchpoint "apiTouchpoint_default" and rule "rule"
    Then wait for offer accepted event in consumer profile
 
 
  #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- #    
  @initBrowser @NDX-9990 @NDX-fullapi
  Scenario: Verify the request processing through API touchpoint
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
    Then create new offer from sheet "STVSMS" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpointUR_default"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750351"
    Then click on events tab
    Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"
    Then wait for offer recommended event for API in consumer profile
    Then accept api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"
    Then wait for offer accepted event in consumer profile
    Then wait for conversion in consumer profile with offer "STVSMS"
    Then wait for Fulfillment Success in consumer profile with offer "STVSMS"
 	Then pass next scenario based on this step
 

 @NDX-9878	
Scenario: Verify the conversion of STV offer with API touch point.
    Then check previous step and pass this
    Then pass next scenario based on this step
 	@NDX-9861	
Scenario: Verify fulfillment processing for STV offer with API touch point.
	Then check previous step and pass this
 
 #------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- #    
   @initBrowser
   @NDX-9872
Scenario: Verify recharge based conversion for API touchpoint.
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
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "programdetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUR_default"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750351"
    Then click on events tab
   Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"
   Then wait for offer recommended event for API in consumer profile
    Then accept api-server for "9491750351" with touchpoint "apiTouchpoint_default" and rule "rule"
   Then wait for offer accepted event in consumer profile
    Then raise the conversion job
    Then wait for conversion in consumer profile with offer "rechargeSMS"
    Then wait for Fulfillment Success in consumer profile with offer "rechargeSMS"

    Then pass next scenario based on this step
 	
 	@NDX-9856	
Scenario: Verify fulfillment processing for recharge offer with API touch point.
	Then check previous step and pass this
 
 	
	

 
 #============================================================================== CUSTOMER CARE ================================================================================#
 
 
 
 
 
 
 
 
 
 
 
 
#=============================================================================U S S D==========================================================================================#
 @NDX-9854 @initBrowser
  Scenario: Verify create a USSD program
Given login
 Then filter the offer from sheet "offerData" from row "16" and column "0" and write in sheet "rechargeSMS"

    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "USSDprogram" and offer catalog sheet "IMcatalog" and touchpoint from sheet "ussdTouchpoint"
   Then choose program from sheet "USSDprogram"
   Then create new rule with enddate from sheet "USSDprogram" and offer "rechargeSMS" and touchpoint from sheet "ussdTouchpoint"
    Then wait until rule is picked
    Then get-offer USSD for "9745081119" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "12345"
    Then get-offer USSD for "9745081119" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
    Then get-offer USSD for "9745081119" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "12345"
     Then provide file in location "/usr/local/flytxt/selenium/seleniumIM/" for trigger with csv file "conversionIM.csv"
    Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9745081119"
    Then click on events tab
    Then wait for conversion in consumer profile with offer "rechargeSMS"
     Then wait for Fulfillment Success in consumer profile with offer "rechargeSMS"









#=============================================================================== TRIGGER ========================================================================================# 
 
  @createprogramwithusagemetric2
   @initBrowser @NDX-10399
  Scenario: Verify create a program
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
  Then verify create program page "triggerrprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "triggerTouchpoint"
    Then choose program from sheet "triggerrprogram"
    Then create new rule from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "triggerTouchpoint" with list "selenium_list"
    Then wait until rule is picked
    Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "sel_uasge_metric.csv"
    Then wait for 1 minutes
     Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "919491750282"
    Then click on events tab
    Then wait for offer eligible event in consumer profile 
    

    
     @NDX-9982 
      @programtrigger
    @initBrowser
      Scenario: Verify program 
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
 
    Then create new offer from sheet "STVSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "A_track_Sel"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
   Then navigate to landing page
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