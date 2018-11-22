#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@BCCreation_datasetup
Feature: Test suite for Broadcast creation
  Create all types of Braodcast

  @NDX-4887
  @initBrowser @closeBrowser
  Scenario: Verify Creating one-off BC
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  #When navigate to precision marketer
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    #Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    
  @NDX-4891
  @initBrowser @closeBrowser
  Scenario: Verify Creating Seeding Trigger BC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  #When navigate to precision marketer
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue      
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then save bc
  
  @NDX-4892
  @initBrowser @closeBrowser
  Scenario: Verify Creating  Seeding one-offBC
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  #When navigate to precision marketer
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    #Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "SeedingSMS"
    Then save bc
  
  @NDX-4894
  @initBrowser @closeBrowser
  Scenario: Verify Creating Normal RecurringBC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  #When navigate to precision marketer
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "recurringBC" with "rechargeSMS"
    Then save bc
    
    
  @NDX-4888
  @initBrowser @closeBrowser
  Scenario: Verify Creating Seeding Trigger recurring BC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  #When navigate to precision marketer
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then save bc
  
  @NDX-4890	
  @initBrowser @closeBrowser
  Scenario: Verify Creating Seeding RecurringBC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "recurringBC" with "SeedingSMS"
    Then save bc
  
  @NDX-4893
  @initBrowser @closeBrowser
  Scenario: Verify Creating Trigger Oneoff BC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue      
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "TriggerOneoff" with "rechargeSMS"
    Then save bc
  
  @NDX-4895	
  @initBrowser @closeBrowser
  Scenario: Verify Creating Trigger recurring BC
  Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    Then navigate to life cycle marketing
	  Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue      
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then save bc
  