#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Offer_datasetup
Feature: Test suite for offer verification test cases
 
 
@NDX-5175
 @initBrowser 
  Scenario: Edit Product details from a new offer and verify that the edited product details are mapped correctly in offer
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usageBasedWAP" with product "fullDetails"
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then remove product for offer from sheet "usageBasedWAP"
    Then add a new Product for offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then navigate to offer from sheet "usageBasedWAP" and verify product name from "singleProductPage"
    
 @NDX-5398
 @initBrowser @closeBrowser
  Scenario: Edit Dynamic tag details in creative tab from a new offer and verify that the edited creative details are mapped correctly in offer
    Given login
    When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then filter offer from sheet "rechargeSMS_Dynamic"
 		Then edit offer
 		Then edit creative details and verify the same from sheet "rechargeSMS_Dynamic" 
 
   @NDX-5407
  @initBrowser @closeBrowser 
   Scenario: edit Track Period from new offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "rechargeSMS"
    Then edit offer
    Then edit Track Period from offer from sheet "rechargeSMS" and verify the edited details
    
    @NDX-5501
  @initBrowser @closeBrowser 
   Scenario: edit reward tab success message from new offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "rechargeSMS"
    Then edit offer
    Then edit Reward from offer from sheet "rechargeSMS" and verify the edited details
    
     @NDX-5602 @initBrowser @closeBrowser
     Scenario: Verify Copy/Duplicating a NEW offer  
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then verify "rechargeSMS" offer in grid
     Then Duplicate/copy offer from sheet "rechargeSMS"