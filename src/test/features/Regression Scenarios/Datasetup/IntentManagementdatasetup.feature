#Author: your.email@your.domain.com
#Keywords Summary :
#Total scenarios: 5
@createintentmanagementdatasetup 
Feature: For IntentManagement datasetup. 

@testimpgm @NDX-7144 @NDX-7141 @NDX-7140 @NDX-7137 @NDX-7136 @NDX-7133,
@NDX-7132, @NDX-7125, @NDX-5711, 
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
	#
	#  Then navigate to offer management
	#    Then navigate to offers
	#    Then click on create new ofer button
	#    Then create new offer from sheet "STVSMS" with product "fullDetails"
	#    Then click on create new ofer button
	#    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
	#    Then navigate to offer management
	#    Then Navigate to Offer Catalogue
	#	Then filter the Offer Catalog from sheet "defaultCatalog"
	#	Then click view offers of "defaultCatalog" in options
	#    Then Add "STVSMS" offer to Offer Catalogue
	#    Then Add "rechargeSMS" offer to Offer Catalogue
	#   Then navigate to landing page
	Then navigate to intent management 
	Then navigate to programs 
	#    Then click create program button
	#  Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
	Then choose program from sheet "SMSprogram" 
	Then create new rule with enddate from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" 
	Then create new rule with enddate from sheet "SMSprogram" and offer "rechargeSMS" and touchpoint from sheet "smsTouchpoint" 
	
	#    Then navigate to programs
	#    Then verify create program page "APIprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR"
	#    Then choose program from sheet "APIprogram"
	#    Then create new rule with enddate from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
	#     Then create new rule with enddate from sheet "APIprogram" and offer "rechargeSMS" and touchpoint from sheet "apiTouchpointGR"
	#    Then navigate to programs
	#    Then verify create program page "USSDprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
	#    Then choose program from sheet "USSDprogram"
	#    Then create new rule with enddate from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
	#    Then create new rule with enddate from sheet "USSDprogram" and offer "rechargeSMS" and touchpoint from sheet "ussdTouchpoint"
	#    Then navigate to programs
	#    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
	Then choose program from sheet "CCprogram" 
	#    Then create new rule with enddate from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
	Then create new rule with enddate from sheet "CCprogram" and offer "rechargeSMS" and touchpoint from sheet "CCTouchpoint" 
	#    Then navigate to programs
	#    Then verify create program page "triggerrprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "triggerTouchpoint"
	Then choose program from sheet "triggerrprogram" 
	#    Then create new rule with enddate from sheet "triggerrprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
	Then create new rule with enddate from sheet "triggerrprogram" and offer "rechargeSMS" and touchpoint from sheet "CCTouchpoint" 
	
	
@createprogramdeletedatasetup 
@initBrowser 
Scenario: Verify create a program delete 
	Given login 
	Then navigate to intent management 
	Then navigate to programs 
	Then click create program button 
	Then verify create program page "programdelete" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint" 
	Then choose program from sheet "programdelete" 
	Then create new rule with enddate from sheet "programdelete" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" 
	
	
@createprogramdeactivatedatasetup @initBrowser 
Scenario: Verify create a program delete 
	Given login 
	Then navigate to intent management 
	Then navigate to programs 
	Then click create program button 
	Then verify create program page "programruledeactivate" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint" 
	Then choose program from sheet "programruledeactivate" 
	Then create new rule from sheet "programruledeactivate" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" 
	
	
@createprogramstartsat @initBrowser 
Scenario: Verify create a program starts at 
	Given login 
	Then navigate to intent management 
	Then navigate to programs 
	Then click create program button 
	Then verify create program withstarts and ends page "programdelete" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint" 
	
