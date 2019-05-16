#Author: your.email@your.domain.com
#Keywords Summary :
@NX-API_Test_Cases
Feature: Test cases for SMS
  I want to use this template for my feature file
  
  
     
    @NX-SMSoffer @initBrowser
  Scenario: SMS- Verify Message recevied for SMS 
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
#    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeSMS" offer to Offer Catalogue
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then click create program button
#	Then navigate to programs
#    Then click create program button
#    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
#    Then choose program from sheet "SMSprogram"
#    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
#    Then verify rule created from sheet "rule"
#    Then wait for "A" status of rule
#    Then wait until rule is picked
	Then login to the vcust
	Then hit with vcust SMS with number "9491750022" with destination adrs "1011"
	Then navigate to the neon again
	Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab
    Then wait for Message Recevied in consumer profile 
  
  