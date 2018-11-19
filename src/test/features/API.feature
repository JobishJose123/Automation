#Author: your.email@your.domain.com
#Keywords Summary :

@NX-API_Test_Cases
Feature: Test cases for API
  I want to use this template for my feature file

          @NX-3107 @initBrowser 
  Scenario: API- Verify that consumer is able to pull stv offers(Application Type = General && Event For Tracking = Accepted Event) -3107
    Given login
    #Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    #Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVSMS" with product "fullDetails"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpoint"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9446506807"
    Then click on events tab
    Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "9446506807"
    Then wait for offer recommended event in consumer profile
    
    @NX-3109 @initBrowser 
  Scenario: API- Verify that consumer is able to pull usage offers(Application Type = General && Event For Tracking = Accepted Event) -3107
    Given login
    #Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "usageBasedSMS" with product "fullDetails"
    #Then navigate to offer management
    #Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "usageBasedSMS" offer to Offer Catalogue
    #Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpoint"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "usageBasedSMS" and touchpoint from sheet "apiTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9446506807"
    Then click on events tab
    Then wait for offer eligible event in consumer profile
    #Then get-offer api-server for "9446506807"
    Then wait for offer recommended event in consumer profile
	
	@NX-3100 @initBrowser @closeBrowser
  Scenario: API- Verify getoffer for API -3100
    Given login
    #Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then navigate to landing page
    #Then navigate to intent management
    #Then navigate to programs
    #Then click create program button
    #Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpoint"
    #Then choose program from sheet "programdetails"
    #Then create new rule from sheet "fullDetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpoint"
    #Then verify rule created from sheet "rule"
    #Then wait for "A" status of rule
    #Then wait until rule is picked
    #Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9446506807"
    Then click on events tab
    Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "9446506807"
    Then wait for offer recommended event in consumer profile
    
    Then accept api-server for "9446506807"
    #Then navigate to reports
    #Then navigate to customer support
    #Then search msisdn "9446506807"
    #Then accept offer in customer care
    #Then navigate to reports
    #Then navigate to customer profile
    #Then search msisdn "9446506807"
    #Then click on events tab
    Then wait for offer accepted event in consumer profile