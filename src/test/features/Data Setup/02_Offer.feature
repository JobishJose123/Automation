#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Offer_datasetup
Feature: Test suite on Offer creation
  Create all types of offers

       
 @NDX-5165 @initBrowser
  Scenario: Verify the Create offer using WAP Push Channel and Recharge offer Type 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then verify recharge offer from sheet "rechargeWAP"
   
  @NDX-5164 @initBrowser
  Scenario: Verify the Create offer using SMS Channel and STV Type
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVWAP" with product "fullDetails"
    Then verify "STVWAP" offer in grid
  
    @STVSMS_offers @initBrowser
  Scenario: Email Channel -->Verify the Create offer using STVSMS 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVSMS" with product "fullDetails"
      
@USgaeSMS_offers @initBrowser
  Scenario: Email Channel -->Verify the Create offer using USgaeSMS 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "USgaeSMS" with product "fullDetails"  
    
