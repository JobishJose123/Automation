#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Dashboard_datasetup
Feature: Test suite Dashboard_data setup
  Create all types of BC for dashboard

  @CapaignCatagory1_Campaign1_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign1 and 8typeofBC's 
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then verify "SeedingSMS" offer in grid
    Then navigate to life cycle marketing
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    Then verify "rechargeSMS" offer in grid
    #Then navigate to precision marketer
    Then navigate to life cycle marketing
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_10 from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_15 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then save bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_20 from sheet "one-offBC" with "SeedingSMS"
    Then save bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_25  from sheet "recurringBC" with "rechargeSMS"
    Then save bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_30  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then save bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_35  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then save bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_40  from sheet "TriggerOneoff" with "rechargeSMS"
    Then save bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_45  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then save bc 
    Then save details of datasetup
    
    
    
  