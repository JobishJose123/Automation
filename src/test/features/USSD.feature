#Author: your.email@your.domain.com
#Keywords Summary :
@NX-API_Test_Cases
Feature: Test cases for USSD
  I want to use this template for my feature file
  
  
     
    @NX-ussd @initBrowser
  Scenario: API- Verify Offer Eligible event for USSD
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
#    Then create new offer from sheet "STVSMS" with product "fullDetails"
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeSMS" offer to Offer Catalogue
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then click create program button
#    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
#    Then choose program from sheet "programdetails"
#   Then create new rule with enddate from sheet "programdetails" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
#    Then verify rule created from sheet "rule"
#    Then wait for "A" status of rule
#    Then wait until rule is picked
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "123"
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
    Then get-offer USSD for "9491750028" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
        Then get-offer USSD for "9491750029" with touchpoint "ussdTouchpoint" and rule "rule" type "1" msg "1" where cid= "123"
    Then get-offer USSD for "9491750029" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "2" where cid= "123"
    Then get-offer USSD for "9491750029" with touchpoint "ussdTouchpoint" and rule "rule" type "2" msg "1" where cid= "123"
    Then recharge conversion job for program
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750028"
    Then click on events tab
    Then wait for offer accepted event in consumer profile for program 
       Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750029"
    Then click on events tab
    Then wait for offer accepted event in consumer profile for program 
  
 
    
    
          @initBrowser @NX-USSDfifo 
  Scenario: Verify create a customer care program full flow
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
    