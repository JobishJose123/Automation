#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Offer_datasetupMigration
Feature: Test suite for offer verification with migration test cases
 
 
@NDX-5174
 @initBrowser @closeBrowser 
  Scenario: Edit Product details from a MIGRATED offer and verify that the edited product details are mapped correctly in offer
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then remove product for offer from sheet "usageBasedWAP"
    Then add a new Product for offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then navigate to offer from sheet "usageBasedWAP" and verify product name from "singleProductPage"
    
@NDX-5399
 @initBrowser @closeBrowser
 Scenario: Edit Dynamic tag details in creative tab from a MIGRATED offer and verify that the edited product details are mapped correctly in offer
   Given login
   When navigate to precision marketer
   Then navigate to offer management
   Then navigate to offers
   Then filter offer from sheet "rechargeSMS_Dynamic"
   Then edit offer
   Then edit creative details and verify the same from sheet "rechargeSMS_Dynamic" 
   
 @NDX-5408
  @initBrowser @closeBrowser 
   Scenario: edit Track Period from  a MIGRATED offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "rechargeSMS"
    Then edit offer
    Then edit Track Period from offer from sheet "rechargeSMS" and verify the edited details
  
   @NDX-5503
  @initBrowser @closeBrowser 
   Scenario: edit reward tab success message from Migrated offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "rechargeSMS"
    Then edit offer
    Then edit Reward from offer from sheet "rechargeSMS" and verify the edited details
    
    
    
    @NDX-7440 @initBrowser @closeBrowser
     Scenario: Delete Reward for an Offer (Regression)
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then delete reward and save
    Then filter offer from sheet "usageBasedWAP"
    Then verify the condition reward deleted in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    
    @NDX-7451 @initBrowser @closeBrowser
    Scenario: Add Reward for an Offer (Regression)
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then add a new reward and save offer
    Then filter offer from sheet "usageBasedWAP"
    Then verify the condition reward added in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage" 
    
    
    @NDX-5603 @initBrowser @closeBrowser
    Scenario: Verify Copy/Duplicating a MIGRATED offer  
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then verify "rechargeSMS" offer in grid
     Then Duplicate/copy offer from sheet "rechargeSMS"
     
     @NDX-7605 @initBrowser @closeBrowser
     Scenario: Edit Product details from a Duplicated/copied offer and verify that the edited product details are mapped correctly in MIGRATED offer 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "usageBasedWAP"
    Then edit offer
    Then remove product for offer from sheet "usageBasedWAP"
    Then add a new Product for offer from sheet "usageBasedWAP" with product "fullDetails"
     Then filter the offer copy from sheet "usageBasedWAP"
    Then verify the condition product added in the detail tab for the offer from sheet "usageBasedWAP" with product "fullDetails"
    
    
    @NDX-7607 @initBrowser  @closeBrowser
  Scenario: Edit Dynamic tag details in creative tab from a Duplicated/Copied  MIGRATED offer and verify that the edited creative details are mapped correctly in offer
    Given login
    When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then filter the offer copy from sheet "usageBasedWAP"
 		Then edit offer
 		Then edit creative details and verify the same from sheet "usageBasedWAP" 
 		Then save the offer and filter the offer from sheet "usageBasedWAP"
 		Then verify the condition dynamic tag edited in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
 		
 		@NDX-7613 @initBrowser @closeBrowser
   Scenario: edit Track Period from Duplicated/Copied MIGRATED offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "usageBasedWAP"
    Then edit offer
    Then edit Track Period from offer from sheet "usageBasedWAP" and verify the edited details
    Then filter the offer for verification from sheet "usageBasedWAP"
    Then verify the condition track source edited in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    
    
    @NDX-7616 @initBrowser @closeBrowser
   Scenario: edit reward tab success message from Duplicated/Copied MIGRATED offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "usageBasedWAP"
    Then edit offer
    Then edit Reward from offer from sheet "usageBasedWAP" and verify the edited details
    Then filter the offer for verification from sheet "usageBasedWAP"
    Then verify the condition reward succedd message edited in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    
    
    @NDX-7618 @initBrowser @closeBrowser
     Scenario: Delete Reward for Duplicated/Copied MIGRATED Offer 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "usageBasedWAP"
    Then edit offer
    Then delete reward and save
    Then filter the offer copy from sheet "usageBasedWAP"
    Then verify the condition reward deleted in the detail tab for the offer from sheet "usageBasedWAP" with product "fullDetails"
    
    @NDX-7620 @initBrowser @closeBrowser
    Scenario: Add Reward for Duplicated/Copied MIGRATED Offer
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "usageBasedWAP"
    Then edit offer
    Then add a new reward and save offer
    Then filter the offer copy from sheet "usageBasedWAP"
    Then verify the condition reward added in the detail tab for the offer from sheet "usageBasedWAP" with product "fullDetails" 
 		
    
    
    
    
    