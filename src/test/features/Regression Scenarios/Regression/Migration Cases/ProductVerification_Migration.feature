#Author:shobina.k@flytxt.com


@ProductVerification_Migration
Feature: Product Verification_Migration

@NDX-6888 @initBrowser
Scenario: Verify editing the Product
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then filter the product from sheet "fullDetails"
Then edit the product
Then verify the edited changes are displayed

@NDX-6890 @initBrowser
Scenario: Verify deleting the product
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "ProductClass"
Then filter the product from sheet "singleProdToDelete"
Then delete the product 
Then verify the product from sheet "singleProdToDelete" is deleted

@NDX-6892 @initBrowser
Scenario: Verify the Offer is displayed inside the view offer tab
Given login
Then navigate to precision marketer
#Then navigate to offer management
#Then navigate to offers
#Then filter the offer from sheet "rechargeWAP"
#Then edit the offer 
#Then add the product to the offer from sheet "fullDetails" and save offer
#Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then filter the product from sheet "fullDetails"
Then click the view offer tab for the product from sheet "fullDetails" 
Then verify the offer from sheet "rechargeWAP" is displayed

