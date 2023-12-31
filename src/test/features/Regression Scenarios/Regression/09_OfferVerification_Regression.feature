#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer creation for regression data setup
#Total Scenario : 16
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature
@Offer_verificationRegression
Feature: Test suite for offer verification test cases
 
 
@NDX-5175
 @initBrowser 
  Scenario: Edit Product details from a new offer and verify that the edited product details are mapped correctly in offer
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then remove product for offer from sheet "usageBasedWAP"
    Then add a new Product for offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then filter offer from sheet "usageBasedWAP"
    Then verify the condition product added in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then edit offer
    Then navigate to offer from sheet "usageBasedWAP" and verify product name from "singleProductPage"
    
 @NDX-5398
 @initBrowser 
  Scenario: Edit Dynamic tag details in creative tab from a new offer and verify that the edited creative details are mapped correctly in offer
    Given login
    When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then filter offer from sheet "rechargeSMS_Dynamic"
 		Then edit offer
 		Then edit creative details and verify the same from sheet "rechargeSMS_Dynamic"
 		Then save the offer and filter the offer from sheet "rechargeSMS_Dynamic"
 		Then verify the condition dynamic tag edited in the detail tab for the offer from sheet "rechargeSMS_Dynamic" with product "singleProductPage"
 
   @NDX-5407
  @initBrowser @closeBrowser
   Scenario: edit Track Period from new offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then edit Track Period from offer from sheet "usageBasedWAP" and verify the edited details
    Then filter the offer for verification from sheet "usageBasedWAP"
    Then verify the condition track source edited in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    
    @NDX-5501
  @initBrowser @closeBrowser
   Scenario: edit reward tab success message from new offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then edit Reward from offer from sheet "usageBasedWAP" and verify the edited details
    Then filter the offer for verification from sheet "usageBasedWAP"
    Then verify the condition reward succedd message edited in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    
    
    @NDX-7436 @initBrowser @closeBrowser
     Scenario: Delete Reward for an Offer
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then delete reward and save
    Then filter offer from sheet "usageBasedWAP"
    Then verify the condition reward deleted in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage"
    
    @NDX-7445 @initBrowser @closeBrowser
    Scenario: Add Reward for an Offer
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then add a new reward and save offer
    Then filter offer from sheet "usageBasedWAP"
    Then verify the condition reward added in the detail tab for the offer from sheet "usageBasedWAP" with product "singleProductPage" 
    
     @NDX-5602 @initBrowser @closeBrowser
     Scenario: Verify Copy/Duplicating a NEW offer  
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then verify "SeedingSMS" offer in grid
     Then Duplicate/copy offer from sheet "SeedingSMS"
     Then verify the condition offer copy in the detail tab for the offer from sheet "SeedingSMS" with product "fullDetails" 
     
     
     @NDX-7604 @initBrowser 
     Scenario: Edit Product details from a Duplicated/copied offer and verify that the edited product details are mapped correctly in offer
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "SeedingSMS"
    Then edit offer
    Then remove product for offer from sheet "SeedingSMS"
    Then add a new Product for offer from sheet "SeedingSMS" with product "singleProductPage"
    Then verify the condition product added for copy in the detail tab for the offer from sheet "SeedingSMS" with product "singleProductPage"
    
    
    @NDX-7606 @initBrowser  
  Scenario: Edit Dynamic tag details in creative tab from a Duplicated/Copied offer and verify that the edited creative details are mapped correctly in offer
    Given login
    When navigate to precision marketer
 		Then navigate to offer management
 		Then navigate to offers
 		Then filter the offer copy from sheet "SeedingSMS"
 		Then edit offer
 		#Then edit creative details and verify the same from sheet "SeedingSMS" 
 		Then save the offer and filter the offer from sheet "SeedingSMS"
 		Then verify the condition dynamic tag edited for copy in the detail tab for the offer from sheet "SeedingSMS" with product "singleProductPage"
 		
  @NDX-7612 @initBrowser
   Scenario: edit Track Period from Duplicated/Copied offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "SeedingSMS"
    Then edit offer
   Then edit Track Period from offer from sheet "SeedingSMS" and verify the edited details
    Then verify the condition track source edited for copy in the detail tab for the offer from sheet "SeedingSMS" with product "singleProductPage"
    
    
    @NDX-7615 @initBrowser 
   Scenario: edit reward tab success message from Duplicated/Copied offer with SMS channel with type recharge and verify the edited details
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "SeedingSMS"
    Then edit offer
    Then edit Reward from offer from sheet "SeedingSMS" and verify the edited details
    Then verify the condition reward succedd message edited for copy in the detail tab for the offer from sheet "SeedingSMS" with product "singleProductPage"
    
    
    @NDX-7617 @initBrowser @closeBrowser
     Scenario: Delete Reward for Duplicated/Copied Offer
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "SeedingSMS"
    Then edit offer
    Then delete reward and save
    Then filter the offer copy from sheet "SeedingSMS"
    Then verify the condition reward deleted in the detail tab for the offer from sheet "SeedingSMS" with product "fullDetails"
    
    @NDX-7619 @initBrowser
    Scenario: Add Reward for Duplicated/Copied Offer
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then filter the offer copy from sheet "SeedingSMS"
    Then edit offer
    Then add a new reward and save offer
    Then filter the offer copy from sheet "SeedingSMS"
    Then verify the condition reward added in the detail tab for the offer from sheet "SeedingSMS" with product "fullDetails" 
 
 #//////////Multitrack offer Edit product//////////////////	 	

     @NDX-MultiTrackCopy @initBrowser 
     Scenario: Verify Copy/Duplicating a NEW offer  
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then verify "MultiTrackOffer" offer in grid
     Then Duplicate/copy offer from sheet "MultiTrackOffer"
     Then verify the condition offer copy in the detail tab for the offer from sheet "MultiTrackOffer" with product "fullDetails"
      
 @NDX-MultiTrackRuleEditVerify @initBrowser 
Scenario: edit Track Period from Duplicated/Copied offer with SMS channel with type recharge and verify the edited details 
	Given login 
	Then navigate to precision marketer 
	Then navigate to offer management 
	Then navigate to offers 
	Then filter the offer copy from sheet "MultiTrackOffer" 
	Then edit offer 
	Then edit Track Period from offer from sheet "MultiTrackOffer" and verify the edited details 
	Then verify the condition track source edited for copy in the detail tab for the offer from sheet "MultiTrackOffer" with product "singleProductPage" 
	
	
#//////////MultiRule_Reward Offer Verification////////////////


@NDX-MultipleRuleRewardEditcopy @initBrowser 
     Scenario: Verify Copy/Duplicating a NEW offer  
     Given login
     Then navigate to precision marketer
     Then navigate to offer management
     Then navigate to offers
     Then verify "MultiRuleRewardOffer" offer in grid
     Then Duplicate/copy offer from sheet "MultiRuleRewardOffer"
     Then verify the condition offer copy in the detail tab for the offer from sheet "MultiRuleRewardOffer" with product "fullDetails"
     