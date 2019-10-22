#Author: joel.jose@flytxt.com
#Summary : Test Cases of User Profile
@NX-facebook
Feature: Title of your feature
  I want to use this template for my feature file

@NX-7422
@initBrowser 
Scenario: Verify clicking the Add Facebook Acccount.
Given login
Then navigate to landing page
Then navigate to precision marketer
Then navigate to configuration
Then click facebook option
Then verify add facebook account option

@NDX-5288
 @initBrowser 
  Scenario: Create offer:Track: Verify creating offers with facebook channel
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargevideoFacebook" with product "singleProductPage"
    
    @NDX-5287
 @initBrowser 
  Scenario: Create offer:Track: Verify creating offers with facebook channel
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "singleProductPage"
    Then verify "rechargeimageFacebook" offer in grid
     Then check previous step and pass this
    Then pass next scenario based on this step
    
    @NX-7472
    Scenario: Verify the offer summary with face book channel
   	Then check previous step and pass this
    
    
    
    @NX-7671
     @initBrowser 
  Scenario: Verify Delete option for Offer with Facebook channel
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "singleProductPage"
    Then filter offer from sheet "rechargeimageFacebook"
    Then delete offer from sheet "rechargeimageFacebook"
    
    @NX-7473
    @initBrowser 
  Scenario: Verify editing the offer created with Facebook as the channel
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
#    Then create new offer from sheet "rechargeimageFacebook" with product "singleProductPage"
    Then filter offer from sheet "rechargeimageFacebook"
    Then verify edit offer from sheet "rechargevideoFacebook"
    

    
    
    @NX-7435  
    @initBrowser 
Scenario: Verify creating one off BC with offer having facebook as the channel.
    Given login
#    Then navigate to configuration management
#    Then navigate to campaign categories
#    Then create new campaign category from sheet "CampaignCategory"
#    Then navigate to landing page
    When navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to offers
#    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
#    Then verify "rechargeimageFacebook" offer in grid
    Then navigate to life cycle marketing
	 
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue

    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
  
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "facebookoneoff" with "rechargeimageFacebook"
    Then activate bc
    Then verify bc created from sheet "facebookoneoff"
    Then wait until status of "facebookoneoff" is "Complete"
    
    
        @NX-7436  
    @initBrowser 
Scenario: Verify copying one off BC with offer having facebook as the channel.
    Given login
    #Then navigate to BC page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
    Then verify "rechargeimageFacebook" offer in grid
    Then navigate to life cycle marketing
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "facebookoneoff" with "rechargeimageFacebook"
    Then activate bc
    Then verify bc created from sheet "facebookoneoff"
    Then wait until status of "facebookoneoff" is "Complete"
    Then copy and create new broadcast from sheet "facebookoneoff"
        Then activate bc
    Then verify copy bc from sheet "facebookoneoff"
    
    
    
     @NX-7437  
    @initBrowser 
Scenario: Verify creating recurring BC with offer having facebook as the channel.
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
    Then verify "rechargeimageFacebook" offer in grid
    Then navigate to life cycle marketing
	 
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue

    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
      Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringfacebook" with "rechargeimageFacebook"
    Then activate bc
    
    @NX-7438
    @initBrowser 
    Scenario: Verify copying recurring BC with offer having facebook as the channel.
       Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
    Then verify "rechargeimageFacebook" offer in grid
    Then navigate to life cycle marketing
	 
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue

    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
      Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "recurringfacebook" with "rechargeimageFacebook"
    Then activate bc
     Then copy and create new broadcast from sheet "recurringfacebook"
        Then activate bc
    Then verify copy bc from sheet "recurringfacebook"
    
    
    
       @NX-7474
    @initBrowser 
  Scenario: Verify editing the offer created with Facebook as the channel
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
    Then filter offer from sheet "rechargeSMS"
    Then verify edit offer from sheet "rechargeimageFacebook"
    
    
    
    @NX-7502
        @initBrowser 
Scenario: Verify the BC summary for the BC created with Facebook Offer.
    Given login
    #Then navigate to BC page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
    
    Then navigate to life cycle marketing
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "facebookoneoff" with "rechargeimageFacebook"
    Then save bc
    Then verify bc summary in grid "facebookoneoff"
    
    
    
    
      @NX-7489
        @initBrowser 
Scenario: Verify BC level CG exclusions for the BC with Facebook Offer.
    Given login
    #Then navigate to BC page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
    
    Then navigate to life cycle marketing
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with 1M subscribers and configure TG and CG from sheet "facebookoneoff" with "rechargeimageFacebook"
    Then validate bc
    Then verify bc created from sheet "facebookoneoff"
    Then verify validating CG status for bc
    
    
      @NX-7487
        @initBrowser 
Scenario: Verify whether notifications are received for the DNC consumers .
    Given login
    #Then navigate to BC page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeimageFacebook" with product "fullDetails"
    
    Then navigate to life cycle marketing
	  Then navigate to offer management
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeimageFacebook" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with DNC exclusion and calculate TG and CG from sheet "facebookoneoff" with "rechargeimageFacebook"
    Then activate bc
    Then verify DNC Exclusion from bc from sheet "facebookoneoff" with DNC count "50"