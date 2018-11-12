#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Offer_datasetup
Feature: Test suite on Offer creation
  Create all types of offers

  @SMS_Offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with SMS channel NX-1349
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid

  @VoicePush_Offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-1351
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeVoicePush" with product "fullDetails"
    Then verify "rechargeVoicePush" offer in grid
    Then pass next scenario based on this step

@WapPush_Offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Wap Push channel NX-1353
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then verify "rechargeWAP" offer in grid
    Then pass next scenario based on this step

  @Balence-Deduction_offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Balance-Deduction offers NX-1346
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "balanceDeductionWAP" with product "fullDetails"
    Then verify "balanceDeductionWAP" offer in grid

@Combo_offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Combo-Offer offers NX-6175
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "comboOfferWAP" with product "fullDetails"
    Then verify "comboOfferWAP" offer in grid

 @Informational_Offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Informational offers NX-6177
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "informationalWAP" with product "fullDetails"
    Then verify "informationalWAP" offer in grid
 
 @Seeding_Offer @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Seeding offers NX-1345
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then verify "seedingWAPoffer" offer in grid
 
 @Usagebased_offer @initBrowser 
  Scenario: Create offer:Track: Verify creating Usage Based offers NX-1347
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usageBasedWAP" with product "fullDetails"
    Then verify "usageBasedWAP" offer in grid
 
  @Email_offers @initBrowser
  Scenario: Email Channel -->Verify the Create offer using Email as a channel. NX-2419 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
     
 @Recharge_offer @initBrowser
  Scenario: Create offer:Track: Verify creating Recharge offers 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then verify recharge offer from sheet "rechargeWAP"
   
  @STV_Offer @initBrowser
  Scenario: Create offer:Track: Verify creating STV offers 
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVWAP" with product "fullDetails"
    Then verify "STVWAP" offer in grid    