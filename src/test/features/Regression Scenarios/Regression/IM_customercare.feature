#Author: your.email@your.domain.com
#Keywords Summary :
@NX-customertcare
Feature: For IntentManagement customer care Regression.

    @initBrowser @NX-cctouchpoint
   Scenario Outline: Verify create a customer care program full flow <Condition>
    Given login
    Then navigate to intent management
    Then navigate to programs
    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
    Then choose program from sheet "CCprogram"
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint" with taget condition <Condition>
        Then navigate to rules after edit
     Then wait until rule is picked
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint" with taget condition <Condition>
    Then navigate to rules after edit
 Then wait until rule is picked
   Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint" with taget condition <Condition>
    Then navigate to rules after edit
 Then wait until rule is picked
    Then verify rule created from sheet "rule"
   Then wait for "A" status of rule
    Then logout
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer support
    Then search msisdn "919491750000"
    Then verify offer "BalanceTop"
    Then wait for 5 minutes
    Then enter msisdn again for refresh "919491750000"
#    Then verify offer "Recharge offer"   
  
      Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
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
#	|System_Event_Occured|
#	|System_Event_not_Occured|
#	|user_Event_not_Occured|
#	|user_Event_Occured|
  
      @initBrowser @NX-cctouchpointLIFO @NDX-8143
  Scenario: Verify create a customer care program full flow
    Given login
      Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to customer care
    Then change Customercare Prioritization Logic to "FIFO" from sheet "CCTouchpoint"
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
#    Then search msisdn "919491750000"
##    Then verify offer "Balance Top ups"
#    Then logout
#    Then login
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "CCprogram"
##    Then wait for 2 minutes
#    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked    
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
#    Then search msisdn "919491750000"
##   Then verify offer "Recharge offer"
#    Then logout
#    Then login
#    Then navigate to intent management
#    
#    Then navigate to programs
#    Then choose program from sheet "CCprogram"
#   Then wait for 2 minutes
#    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked 
#    Then logout
#    Then login with selenium user
#    Then navigate to precision marketer
#    Then navigate to reports
#    Then navigate to customer support
###   Then wait for 3 minutes
#    Then search msisdn "919491750000"
###    Then verify offer "Balance Top ups"
##    Then wait for 3 minutes
##    Then enter msisdn again for refresh "919491750000"
#      
##     Then verify offer "Special Vouchers"
#      Then Customercare offer accept 
    
          @initBrowser @NX-cctouchpointflowchnage
  Scenario: Verify changing Prioritization Logic customer care program
    Given login
     Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to customer care
    Then change Customercare Prioritization Logic to "LIFO" from sheet "CCTouchpoint"
    
          @initBrowser @NX-cctouchpointfifo @NDX-8141
  Scenario: Verify create a customer care program full flow
    Given login
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
    
              @initBrowser @NX-cctouchpointBESTFITALGORITHM @NDX-8141
  Scenario: Verify create a customer care program full flow
    Given login
      Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to customer care
    Then change Customercare Prioritization Logic to "BEST FIT ALGORITHM" from sheet "CCTouchpoint"
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
      
                @initBrowser @NX-cctouchpointcustom @NDX-8141
  Scenario: Verify create a customer care program full flow
    Given login
      Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to customer care
    Then change Customercare Prioritization Logic to "Profile_logic" from sheet "CCTouchpoint"
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
    
  
  @initBrowser @NDX-9871
   Scenario: Verify create a customer care program with keyword
   Given login
#      Then navigate to intent management
#    Then navigate to touchpoints
#    Then navigate to customer care
#    Then change Customercare Prioritization Logic to "FIFO" from sheet "CCTouchpoint"
#    Then navigate to programs
#    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
#    Then choose program from sheet "CCprogram"
#    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
#    Then wait until rule is picked 
    Then login to the vcust
    Then hit with vcust SMS with number "9491750350" with keyword "seleniumkeyword"
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   