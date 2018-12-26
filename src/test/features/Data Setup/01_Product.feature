#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :

@Product_datasetup
Feature: Product class and Product creation

@NX-1222
@initBrowser  @closeBrowser
Scenario: Products Grid: Create Prodcut from Productclass other than prepaid telecom 
Given login
Then navigate to configuration management
Then naviagte to product classes
Then create product class and number attribute from "TestProductClass"
Then save "productClassInputData" data to spreadsheet from "TestProductClass" with string product class with testProductClass
Then navigate to landing page
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then click create new product button
Then create product with attributes from sheet "fullDetails"
 Then save "productInputData" data to spreadsheet from "fullDetails" with string product with attributes from fullDetails

@NX-1112
@initBrowser  
Scenario: Create product from prepaid telecom
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to prepaid telecom
Then click create new product button
Then create single product from sheet "singleProductPage"
Then save "productInputData" data to spreadsheet from "singleProductPage" with string prepaid telecom product with singleProductPage
