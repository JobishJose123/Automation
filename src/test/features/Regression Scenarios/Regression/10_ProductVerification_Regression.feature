#Author:shobina.k@flytxt.com
#Total Scenario : 3
@ProductVerification_Regression
Feature: Product Verification_Regression

@NDX-6887 @initBrowser
Scenario: Verify editing the Product
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then filter the product from sheet "fullDetails"
Then edit the product
Then verify the edited changes are displayed

@NDX-6889 @initBrowser
Scenario: Verify deleting the product
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "ProductClass"
Then filter the product from sheet "singleProdToDelete"
Then delete the product 
Then verify the product from sheet "singleProdToDelete" is deleted

@NDX-6891 @initBrowser
Scenario: Verify the Offer is displayed inside the view offer tab
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then filter the offer from sheet "rechargeWAP"
Then edit the offer 
Then add the product to the offer from sheet "singleProductPage" and save offer
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then filter the product from sheet "fullDetails"
Then click the view offer tab for the product from sheet "singleProductPage" 
Then verify the offer from sheet "rechargeWAP" is displayed

