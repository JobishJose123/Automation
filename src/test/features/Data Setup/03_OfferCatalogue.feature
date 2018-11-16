#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Offercatalogue_datasetup
Feature: Test suite Offer and offer catelogue
  Create all types of offers and offer catelogue

  @Create_one-offBC
  @initBrowser 
  Scenario: Verify Creating one-off BC with Offer Catalogue with rechargeSMS and SeedingSMS offers
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
    
  @Create_SeedingTriggerBC
  @initBrowser 
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
  
  @Create_SeedingoneoffBC
  @initBrowser 
  Scenario: Verify Creating one-off BC with Offer Catalogue with rechargeSMS and SeedingSMS offers
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
  
  @Create_NormalRecurringBC
  @initBrowser 
  Scenario: Verify Creating RecurringBC
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
    
 @Create_SeedingTriggerRecurringBC
  @initBrowser 
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
  
  @SeedingRecurringBC
  @initBrowser 
  Scenario: Verify Creating RecurringBC
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
    Then enter details for new broadcast from sheet "recurringBC" with "SeedingSMS"
    Then save bc
  
  @Create_TriggerOneoffBC
  @initBrowser 
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
    Then enter details for new broadcast from sheet "TriggerOneoff" with "rechargeSMS"
    Then save bc
  
  @Create_TriggerRecurringBC
  @initBrowser 
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
    Then enter details for new broadcast from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then save bc
  