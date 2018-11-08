#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :

@Product_datasetup
Feature: Product class and Product creation

@NX-1011
@initBrowser  @closeBrowser
Scenario: Products Grid: Verify the product details displayed in the Products screen NX-1011
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
#Then create product with attributes from sheet "fullDetails"
Then create product with attributes from sheet "fullDetails"