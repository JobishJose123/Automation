#Author: your.email@your.domain.com
#Keywords Summary :
@NX-API_Test_Cases
Feature: Test cases for API
  I want to use this template for my feature file
  
  
     
    @NX-9282 @initBrowser
  Scenario: API- Verify Offer Eligible event for API -9282
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
    Then navigate to intent management
    Then navigate to programs
#    Then click create program button
#   Then verify create program page "APIprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR"
    Then choose program from sheet "APIprogram"
#    Then create new rule with enddate from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
     Then create new rule with enddate from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointGR"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab
    Then wait for offer eligible event in consumer profile
  
  
  @NX-3126 @initBrowser 
  Scenario: API- Verify whether track sessions are persited(Application Type = General && Event For Tracking = Recommended Event) -3126
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
    Then create new offer from sheet "STVSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointGR_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
  
   @NX-3124 @initBrowser 
  Scenario: API- Verify that consumer is able to pull usage offers(Application Type = USSD && Event For Tracking = Recommended Event) -3124
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
    Then create new offer from sheet "usageBasedSMS" with product "fullDetails"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "usageBasedSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUA_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "usageBasedSMS" and touchpoint from sheet "apiTouchpointUA_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
    Then accept api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer accepted event in consumer profile
  
  
  @NX-3122 @initBrowser 
  Scenario: API- Verify that consumer is able to pull recharge offers(Application Type = USSD && Event For Tracking = Recommended Event) -3122
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
    Then create new offer from sheet "rechargeSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUA_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUA_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
  
  @NX-3121 @initBrowser 
  Scenario: API- Verify that consumer is able to pull stv offers(Application Type = USSD && Event For Tracking = Recommended Event) -3121
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
    Then create new offer from sheet "STVSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUA_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpointUA_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
  
  
  @NX-3120 @initBrowser 
  Scenario: API- Verify that consumer is able to pull usage offers(Application Type = USSD && Event For Tracking = Accepted Event) -3120
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
    Then create new offer from sheet "usageBasedSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "usageBasedSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUA_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "usageBasedSMS" and touchpoint from sheet "apiTouchpointUA_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
  
  
  
  @NX-3119 @initBrowser 
  Scenario: API- Verify that consumer is able to pull recharge offers(Application Type = USSD && Event For Tracking = Accepted Event) -3119
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
    Then create new offer from sheet "rechargeSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUA_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointUA_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
  
  @NX-3118 @initBrowser 
  Scenario: API- Verify that consumer is able to pull stv offers(Application Type = USSD && Event For Tracking = Accepted Event) -3118
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
    Then create new offer from sheet "STVSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUA_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpointUA_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointUA_default" and rule "rule"
    Then wait for offer recommended event in consumer profile


@NX-3114 @initBrowser 
  Scenario: API- Verify that consumer is able to pull usage offers(Application Type = General && Event For Tracking = Recommended Event) -3114
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
    Then create new offer from sheet "usageBasedSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "usageBasedSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "usageBasedSMS" and touchpoint from sheet "apiTouchpointGR_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointGR_default" and rule "rule"
    Then wait for offer recommended event in consumer profile


@NX-3113 @initBrowser 
  Scenario: API- Verify that consumer is able to pull recharge offers(Application Type = General && Event For Tracking = Recommended Event) -3113
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
    Then create new offer from sheet "rechargeSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointGR_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointGR_default" and rule "rule"
    Then wait for offer recommended event in consumer profile

 @NX-3110 @initBrowser 
  Scenario: API- Verify that consumer is able to pull stv offers(Application Type = General && Event For Tracking = Recommended Event) -3110
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
    Then create new offer from sheet "STVSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpointGR_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
    
    
          @NX-3107 @initBrowser 
  Scenario: API- Verify that consumer is able to pull stv offers(Application Type = General && Event For Tracking = Accepted Event) -3107
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
    Then create new offer from sheet "STVSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpoint_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "STVSMS" and touchpoint from sheet "apiTouchpoint_default"
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
    Then get-offer api-server for "9446506807" with touchpoint "apiTouchpoint_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
    
    @NX-3109 @initBrowser 
  Scenario: API- Verify that consumer is able to pull usage offers(Application Type = General && Event For Tracking = Accepted Event) -3107
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
    Then create new offer from sheet "usageBasedSMS" with product "default"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "usageBasedSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpoint_default"
    Then choose program from sheet "programdetails"
    Then create new rule from sheet "fullDetails" and offer "usageBasedSMS" and touchpoint from sheet "apiTouchpoint_default"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then wait until rule is picked
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then search msisdn "9491750022"
    Then click on events tab
    Then wait for offer eligible event in consumer profile
    Then get-offer api-server for "9491750022" with touchpoint "apiTouchpoint_default" and rule "rule"
    Then wait for offer recommended event in consumer profile
	
	@NX-3100 @NX-3101 @NX-apitest
	 @initBrowser 
  Scenario: API- Verify getoffer for API -3100
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
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeSMS" offer to Offer Catalogue
#    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
#    Then click create program button
#    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
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
    Then pass next scenario based on this step
    
    
    @initBrowser @NDX-9990
  Scenario: Verify the request processing through API touchpoint
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
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "defaultCatalog"
#    Then Add "rechargeSMS" offer to Offer Catalogue
#    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
#    Then click create program button
#    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointUR_default"
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
    Then pass next scenario based on this step
    
    @NDX-9882 @NDX-9862
	 @initBrowser 
  Scenario: Verify usage based conversion for API touchpoint
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
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
#    Then click on create new ofer button

#    Then create new offer from sheet "rechargeSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative" and track Source "Usage Metric"
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
  @NX-3108
  Scenario: API- Verify that consumer is able to pull recharge offers(Application Type = General && Event For Tracking = Accepted Event) 3108
    Then check previous step and pass this
    
    
    
    
    
     @NX-apitestkeyword @NDX-9867
	 @initBrowser 
  Scenario: Verify keyword based conversion for API touchpoint
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
    
         @NX-apitestkeyword @NDX-9856
	 @initBrowser 
  Scenario: Verify fulfillment processing for recharge offer with API touch point.
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
    Then wait for Fulfillment Success in consumer profile with offer "STVSMS"