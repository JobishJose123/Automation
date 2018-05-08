#Author: madhan.kumar@flytxt.com
@NX-OfferTestCases
Feature: Test suite on Offer creation
  I want to check all test cases related to offer page

  @NX-1349 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with SMS channel NX-1349
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
    Then verify "rechargeSMS" offer in grid

  @NX-1351 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-1351
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeVoicePush" with product "singleProductPage"
    Then verify "rechargeVoicePush" offer in grid

  @NX-1353 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Wap Push channel NX-1353
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "singleProductPage"
    Then verify "rechargeWAP" offer in grid

  @NX-1346 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Balance-Deduction offers NX-1346
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "balanceDeductionWAP" with product "singleProductPage"
    Then verify "balanceDeductionWAP" offer in grid

  @NX-6175 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Combo-Offer offers NX-6175
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "comboOfferWAP" with product "singleProductPage"
    Then verify "comboOfferWAP" offer in grid

  @NX-6177 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Informational offers NX-6177
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "informationalWAP" with product "singleProductPage"
    Then verify "informationalWAP" offer in grid

  @NX-1348 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Recharge offers NX-1348
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
    Then verify "rechargeSMS" offer in grid

  @NX-1345 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Seeding offers NX-1345
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "seedingWAPoffer" with product "singleProductPage"
    Then verify "seedingWAPoffer" offer in grid

  @NX-6176 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating STV offers NX-6176
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVWAP" with product "singleProductPage"
    Then verify "STVWAP" offer in grid

  @NX-1347 @initBrowser
  Scenario: Create offer:Track: Verify creating Usage Based offers NX-1347
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then verify "usageBasedWAP" offer in grid

  @NX-1376 @initBrowser @closeBrowser
  Scenario: Offer Management-->Create new offer-->Cancel button NX-1376
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then check offer cancel button

  @NX-2180 @initBrowser @closeBrowser
  Scenario: Offer Management : Verify for the Offers Help icon NX-2180
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then check offer help icon

  @NX-885 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify the proceed button without entering details NX-885
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then Check_details_tab_without_entering_details

  @NX-6214 @initBrowser @closeBrowser
  Scenario: Offer-Creation: Verify filtering based on product name inside product tab NX-6214
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
    
     @NX-3036 @initBrowser @closeBrowser
  Scenario: Verify Clicking on the Remove Icon in the products tab-3036
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then choose offer from sheet "usageBasedWAP"
    Then edit offer
    Then remove product for offer from sheet "usageBasedWAP"
    
 @NX-2179 @initBrowser @closeBrowser
  Scenario: Offer Management: Verify for the Products Help icon-2179
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then check product help icon
    
 @NX-3041 @initBrowser @closeBrowser
  Scenario: Verify the Add button displayed in Track tab-3041
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer up to track tab from sheet "usageBasedWAP" with product "singleProductPage"
    Then verify add button in track tab
    
    @NX-3038 @initBrowser @closeBrowser
  Scenario: Verify for the Set as Default checkbox in Creative tab-3038
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer up to creative tab from sheet "usageBasedWAP" with product "singleProductPage"
    Then verify add button in creative tab
    
    
     @NX-1386 @initBrowser @closeBrowser
  Scenario: Offer Management:Multilingual functionality in creative tab-1386
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer up to creative tab and choose all languages from sheet "usageBasedWAP" with product "singleProductPage"
    
@initBrowser @closeBrowser @NX-2101
Scenario: Verify SQL injection in Filtering Offers
Given login
Then navigate to precision marketer
Then  navigate to offer management 
Then navigate to offers
Then verify sql injection in offer

@initBrowser @closeBrowser @NX-2065
Scenario: Checking cross site scripting in creation of new offer under CLV Max
Given login
Then navigate to precision marketer
Then  navigate to offer management 
Then navigate to offers
Then verify cross site scrpting in new offer

@initBrowser @closeBrowser @NX-1375
Scenario: Offer Management-->Create new offer-->Details tab
Given login
Then navigate to precision marketer
Then  navigate to offer management 
Then navigate to offers
Then verify tab colours

@NX-3487 @initBrowser @closeBrowser
    Scenario: Verify the additional optional fields in offer with voice push as the channel-3487
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer and verify optional fields from sheet "rechargeVoicePush" with product "singleProductPage"