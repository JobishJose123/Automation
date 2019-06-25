#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature
@NDX-AllOffer_datasetup
Feature: Test suite on Offer creation
  Create all types of offers

       
 @NDX-5165 @initBrowser  @testusage
  Scenario: Verify the Create offer using WAP Push Channel and Recharge offer Type 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usagerecharge" with product "fullDetails"
#    Then verify recharge offer from sheet "rechargeWAP"
#    Then save "offerInputData" data to spreadsheet from "rechargeWAP" with string recharge wap offer with fullDetails product
   
  @NDX-5164 @initBrowser 
  Scenario: Verify the Create offer using SMS Channel and STV Type
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVWAP" with product "fullDetails"
    Then verify "STVWAP" offer in grid
    Then save "offerInputData" data to spreadsheet from "STVWAP" with string stv wap offer with fullDetails product
  
   @rechargeSMS @initBrowser 
   Scenario: Email Channel -->Verify the Create offer using STVSMS 
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then create new offer from sheet "rechargeSMS" with product "fullDetails"
     Then verify "rechargeSMS" offer in grid
     Then save "offerInputData" data to spreadsheet from "rechargeSMS" with string recharge sms offer with fullDetails product
      
   @NDX-5397
   @initBrowser @closeBrowser
   Scenario: Verify cerating SMS channel,Recharge Type offer with Dynamic tag
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "rechargeSMS_Dynamic" with product "fullDetails"
 		Then verify "rechargeSMS_Dynamic" offer in grid
 		Then save "offerInputData" data to spreadsheet from "rechargeSMS_Dynamic" with string rechargeSMS_Dynamic offer with fullDetails product
 		
 		@NDX-newSeedingWap
   @initBrowser @closeBrowser
   Scenario: seeding wap offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
 		Then verify "seedingWAPoffer" offer in grid
 		Then save "offerInputData" data to spreadsheet from "seedingWAPoffer" with string seeding wap offer with fullDetails product
 		
 		@NDX-SeedingSMS
   @initBrowser @closeBrowser
   Scenario: SeedingSMS offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "SeedingSMS" with product "fullDetails"
 		Then verify "SeedingSMS" offer in grid
 		Then save "offerInputData" data to spreadsheet from "SeedingSMS" with string seeding sms offer with fullDetails product
 		
 		@NDX-rechargeVoicePush
   @initBrowser @closeBrowser
   Scenario: rechargeVoicePush offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "rechargeVoicePush" with product "fullDetails"
 		Then verify "rechargeVoicePush" offer in grid
 		Then save "offerInputData" data to spreadsheet from "rechargeVoicePush" with string recharge voice push offer with fullDetails product
 		
 		@NDX-balanceDeductionWAP
   @initBrowser @closeBrowser
   Scenario: balanceDeductionWAP offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "balanceDeductionWAP" with product "fullDetails"
 		Then verify "balanceDeductionWAP" offer in grid
 		Then save "offerInputData" data to spreadsheet from "balanceDeductionWAP" with string balanceDeductionWAP offer with fullDetails product
 		
 		@NDX-comboOfferWAP
   @initBrowser @closeBrowser
   Scenario: comboOfferWAP offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "comboOfferWAP" with product "fullDetails"
 		Then verify "comboOfferWAP" offer in grid
 		Then save "offerInputData" data to spreadsheet from "comboOfferWAP" with string comboOfferWAP offer with fullDetails product
 		
 		@NDX-informationalWAP
   @initBrowser @closeBrowser
   Scenario: informationalWAP offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "informationalWAP" with product "fullDetails"
 		Then verify "informationalWAP" offer in grid
 		Then save "offerInputData" data to spreadsheet from "informationalWAP" with string informationalWAP offer with fullDetails product
 		
 		@NDX-STVWAP
   @initBrowser @closeBrowser
   Scenario: STVWAP offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "STVWAP" with product "fullDetails"
 		Then verify "STVWAP" offer in grid
 		Then save "offerInputData" data to spreadsheet from "STVWAP" with string STVWAP offer with fullDetails product
 		
 		@NDX-usageBasedWAP
   @initBrowser @closeBrowser
   Scenario: usageBasedWAP offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "usageBasedWAP" with product "fullDetails"
 		Then verify "usageBasedWAP" offer in grid
 		Then save "offerInputData" data to spreadsheet from "usageBasedWAP" with string usageBasedWAP offer with fullDetails product
 		
 		@NDX-usageBasedSMS
   @initBrowser @closeBrowser
   Scenario: usageBasedSMS offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "usageBasedSMS" with product "fullDetails"
 		Then verify "usageBasedSMS" offer in grid
 		Then save "offerInputData" data to spreadsheet from "usageBasedSMS" with string usageBasedSMS offer with fullDetails product
 		
 		@NDX-rechargeEmail
   @initBrowser @closeBrowser
   Scenario: rechargeEmail offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "rechargeEmail" with product "fullDetails"
 		Then verify "rechargeEmail" offer in grid
 		Then save "offerInputData" data to spreadsheet from "rechargeEmail" with string rechargeEmail offer with fullDetails product
 		
 		@NDX-rechargeimageFacebook
   @initBrowser @closeBrowser
   Scenario: rechargeimageFacebook offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
 		Then verify "rechargeimageFacebook" offer in grid
 		Then save "offerInputData" data to spreadsheet from "rechargeimageFacebook" with string rechargeimageFacebook offer with fullDetails product
 		
 		@NDX-rechargevideoFacebook
   @initBrowser @closeBrowser
   Scenario: rechargevideoFacebook offer
     Given login
 		When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then create new offer from sheet "rechargevideoFacebook" with product "fullDetails"
 		Then verify "rechargevideoFacebook" offer in grid
 		Then save "offerInputData" data to spreadsheet from "rechargevideoFacebook" with string rechargevideoFacebook offer with fullDetails product
 		
 		 @STVSMS @initBrowser @closeBrowser
   Scenario: SMS Channel -->Verify the Create offer using STVSMS 
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then create new offer from sheet "STVSMS" with product "fullDetails"
     Then verify "STVSMS" offer in grid
     Then save "offerInputData" data to spreadsheet from "STVSMS" with string recharge sms offer with fullDetails product
     
     
#     /**
#      * this method is user for creating the offers with different types of rewards
#      * 
#      * to passing the rewards type like below
#      * default- only we can select default reward
#      * oneruleonereward- we can crate one rule and select one reward for that rule , and we can select default reward also
#      * onerulemultiplerewards-we can crate one rule and select 2 reward for that rule and we can select default reward also
#      * firstrulefirstreward- we can create only one rule and selecting for reward for that rule only
#      * multiplerulesmultiplerewards- we can create multiple rules and selecting the multiple rewards for those rules, and we can select default reward also
#      * 
#Creative: singlecreative(it selects the one creative and language English )
# multiplecreative (we can create 2 creatives with 2 languages )
#      */
     
     @NDX-OneRuleOneReward @initBrowser 
     Scenario: Create a onerule one reward recharge sms offer
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then create new offer from sheet "SeedingSMS" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative"
     Then verify "SeedingSMS" offer in grid
     
#     Examples:
#     |sheet||rewards|
#     |rechargeSMS||default|
#     |rechargeSMS||oneruleonereward|
#     |rechargeSMS||onerulemultiplerewards|
#     |rechargeSMS||firstrulefirstreward|
#     |rechargeSMS||multiplerulesmultiplerewards|
#     |SeedingSMS||default|
#     |SeedingSMS||oneruleonereward|
#     |SeedingSMS||onerulemultiplerewards|
#     |SeedingSMS||firstrulefirstreward|
#     |SeedingSMS||multiplerulesmultiplerewards|
     
     
     
     
#     Then save "offerInputData" data to spreadsheet from "onerulemultiplerewards" with string recharge sms offer with fullDetails product
     
     
     
     