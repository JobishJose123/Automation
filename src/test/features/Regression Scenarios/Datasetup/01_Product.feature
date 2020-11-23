#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :
@NDX-Product_datasetup
Feature: Product class and Product creation

@NX-1222 @initBrowser  
Scenario: Products Grid: Create Prodcut from Productclass other than prepaid telecom 
Given login
#Then navigate to configuration management
#Then naviagte to product classes
#Then create product class and number attribute from "TestProductClass"
#Then save "productClassInputData" data to spreadsheet from "TestProductClass" with string product class with testProductClass
#Then navigate to landing page
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then click create new product button
Then create product with attributes from sheet "fullDetails"
# Then save "productInputData" data to spreadsheet from "fullDetails" with string product with attributes from fullDetails

@NX-1112
@initBrowser  @closeBrowser
Scenario: Create product from prepaid telecom
Given login
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to offer management
Then navigate to products
Then navigate to prepaid telecom
Then click create new product button
Then create single product from sheet "singleProductPage"
#Then save "productInputData" data to spreadsheet from "singleProductPage" with string prepaid telecom product with singleProductPage


@NDX-6885 
@initBrowser @closeBrowser
Scenario: Create New Product
Given login
Then navigate to configuration management
Then naviagte to product classes
Then create product class without any attributes from "TestProductClass"
#Then save "productClassInputData" data to spreadsheet from "TestProductClass" with string product class with testProductClass
Then navigate to landing page
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then click create new product button
Then enter the name and description from sheet "fullDetails"
#Then save "productInputData" data to spreadsheet from "fullDetails" with string prepaid telecom product with singleProductPage

@CreateProductToVerifyDelete 
@initBrowser @closeBrowser
Scenario: Create New Product for the verification of delete option
Given login
Then navigate to configuration management
Then naviagte to product classes
Then create product class without any attributes from "ProductClass"
#Then save "productClassInputData" data to spreadsheet from "ProductClass" with string product class with testProductClass
Then navigate to landing page
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to offer management
Then navigate to products
Then navigate to product class "ProductClass"
Then click create new product button
Then enter the name and description from sheet "singleProdToDelete"
#Then save "productInputData" data to spreadsheet from "singleProdToDelete" with string prepaid telecom product with singleProductPage



