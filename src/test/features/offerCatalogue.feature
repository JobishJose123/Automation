#Author: nikhil.b@flytxt.com


@NX-OfferCatalog
Feature: Offer Catalogue test cases

@initBrowser @closeBrowser @NX-1125
Scenario: Verify Creating Offer Catalogue
  Given login
	When navigate to precision marketer
	Then navigate to offer management
Then navigate to products
Then navigate to prepaid telecom
Then click create new product button
Then create single product from sheet "singleProductPage"
	Then navigate to offer management 
	Then navigate to offers
  Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
  Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then navigate to offer management 
  Then Navigate to Offer Catalogue
  Then Delete Created Offer Catalogue "defaultCatalog"
  
	
@initBrowser @closeBrowser @NX-1126

Scenario: Verify Canceling Offer Catalogue 
Given login
Then navigate to precision marketer
Then  navigate to offer management 
Then Navigate to Offer Catalogue
Then Cancel the New offer Catalogue


@initBrowser @closeBrowser @NX-1146

Scenario: Verify Canceling Selected Offer 
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Cancel Selected Offer

  
 
@initBrowser @closeBrowser @NX-1145  
Scenario: Verify Adding Selected Offers
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add offers to Offer Catalogue

  
  
@initBrowser @closeBrowser @NX-1139
Scenario: Verify Selecting Multiple Offers
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Select Multiple Offers
  
  
 
 @initBrowser @closeBrowser @NX-1138
 Scenario: Search Offers Using Combination of fields
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then navigate to offers
  Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
  Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Search Offers with Combination of details from "rechargeSMS"
  
  @initBrowser @closeBrowser @NX-1128
Scenario:  Verify the newly added offer catalog in the Offer Catalog screen
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Verify Added Catalogue "defaultCatalog"
  
  @initBrowser @closeBrowser @NX-1127
Scenario: Verify the field validations for the catalogue name and description
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Validate Catalogue Name
  
  
  @initBrowser @closeBrowser @NX-5984
Scenario: Verify Deleting Offer from catalogue
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then Delete Offer "rechargeSMS" from Catalogue
  
  
  @initBrowser @closeBrowser @NX-5985
Scenario: Verify displaying offers in Offer catalog when more than 50 offers are added 
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add fifty more offers to Offer Catalogue
  Then navigate to offer management 
	Then Navigate to Offer Catalogue
	Then verify catalog "defaultCatalog" with 50 offers
  
  
  @initBrowser  @closeBrowser @NX-2185
Scenario: Verify Help Icon in Offer Catalogue Page
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
	Then Verify Help Of Offer Catalogue
  
  @initBrowser @closeBrowser @NX-2102
Scenario: verify sql injection in Offer Catalog
Given login
Then navigate to precision marketer
Then  navigate to offer management 
Then Navigate to Offer Catalogue
Then verify sql injection in offer catalogue 
  
@initBrowser @closeBrowser @NX-2074
Scenario: verify Cross site scripting in Offer Catalog
Given login
Then navigate to precision marketer
Then  navigate to offer management 
Then Navigate to Offer Catalogue
Then verify Cross site scripting in offer catalogue 
  
  
@initBrowser @closeBrowser @NX-1160
Scenario: Verify Edit Offer Catalogue 
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Verify Edit Offer Catalog "defaultCatalog"
  
  @initBrowser @closeBrowser @NX-1159
Scenario: Verify Colapsing Offer in Offer Catalog
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then Verify Collapsing Offer in Offer Catalog

@initBrowser @closeBrowser @NX-1142
Scenario: Verify the label detail for the offer selected

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Verify Label in offer selected
  
@initBrowser @closeBrowser @NX-1147
Scenario: Verify the selected offers for the catalog.

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Verify searching the offers using invalid information

  
  @initBrowser @closeBrowser @NX-1157
  Scenario: Verify expanding the selected offers
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then Verify Expanding Offer


	@initBrowser @closeBrowser @NX-1149
  Scenario: Verify searching the offers using invalid information

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Verify searching the offers using invalid information


    @initBrowser @closeBrowser @NX-1158
  Scenario: Verify the details of the expanded offers

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then Verify Offer Details "rechargeSMS"


   @initBrowser @closeBrowser @NX-1130
  Scenario: Verify adding offers for the newly created offer catalog

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  

@initBrowser @closeBrowser @NX-1121
  Scenario: Verify the Delete option from the Options icon.

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Delete Created Offer Catalogue "defaultCatalog"
  

@initBrowser @closeBrowser @NX-1103
  Scenario:  Verify adding the filters in the offer catalog screen using filter button.

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Delete Created Offer Catalogue "defaultCatalog"

  
 @initBrowser @closeBrowser @NX-1105
  Scenario:   Verify the actions available by clicking on the Options icon.

  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  #Then Create New Offer Catalogue from sheet "defaultCatalog"
  #Then Add "rechargeSMS" offer to Offer Catalogue
  #Then navigate to offer management 
  #Then Navigate to Offer Catalogue
	Then verify options icon
  
  
@initBrowser @closeBrowser @NX-1132
  Scenario:   Verify editing the offer catalogue from the Add offers screen
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Edit Catalog "defaultCatalog" from Catalog screen

@initBrowser @closeBrowser @NX-1112
  Scenario:   Verify scrolling and viewing the last offer catalog in the screen
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
	Then Create New Offer Catalogue from sheet "defaultCatalog"
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
	Then Verify Scrolling Offer Catalog for "defaultCatalog"  
 
 @initBrowser @closeBrowser @NX-1098
  Scenario:   Verify the catalogues listed in the offer Management --> Offer Catalogue screen
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
	Then Create New Offer Catalogue from sheet "defaultCatalog"
	Then Verify Scrolling Offer Catalog for "defaultCatalog" 
 

  

 

  




  

	
 
#	
#
###########    to be removed
  #@initBrowser @closeBrowser @NX-1137
 #Scenario: Search Offers Using Service leg
  #Given login
#	When navigate to precision marketer
#	Then navigate to offer management 
#	Then Navigate to Offer Catalogue
  #Then Create New Offer Catalogue from sheet "defaultCatalog"
  #Then Search Offers Using Service leg
  #Then Delete Created Offer Catalogue
#
  #
#@initBrowser @closeBrowser @NX-1135
#Scenario: Verify Selecting Offers Using Product Name
#Given login
#	When navigate to precision marketer
#	Then navigate to offer management 
#	Then Navigate to Offer Catalogue
  #Then Create New Offer Catalogue from sheet "defaultCatalog"
  #Then Select Offers Using Product Name
  #Then Delete Created Offer Catalogue
  #
  ## deletes even when there are offers inside
  #@initBrowser  @NX-1123  
  #Scenario: Verify deleting the offer catalog when the offer is available.
#
  #Given login
#	When navigate to precision marketer
#	Then navigate to offer management 
#	Then Navigate to Offer Catalogue
  #Then Create New Offer Catalogue from sheet "defaultCatalog"
  #Then Add "rechargeSMS" offer to Offer Catalogue
  #Then Delete Created Offer Catalogue
  #
  ##add offers not available in options
  #@initBrowser @closeBrowser @NX-1117
  #Scenario:  Verify the Add offers from the Options icon
#
  #Given login
#	When navigate to precision marketer
#	Then navigate to offer management 
#	Then Navigate to Offer Catalogue
  #Then Create New Offer Catalogue from sheet "defaultCatalog"
  #Then Add "rechargeSMS" offer to Offer Catalogue
  #Then Delete Created Offer Catalogue
  
  
    @initBrowser @closeBrowser @NX-1156  
Scenario: Create Offer Catalog: Verify the remove option for the offers selected-1156
Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add offers to Offer Catalogue
  Then navigate to landing page
  Then navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then choose offer catalog from sheet "defaultCatalog"
  Then edit offer catalog
  Then remove offer for offer catalog from sheet "defaultCatalog" 
  
  