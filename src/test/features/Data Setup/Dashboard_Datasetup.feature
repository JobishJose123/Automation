#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Dashboard_datasetup
Feature: Test suite Dashboard_data setup
  Create all types of BC for dashboard
#=============================================================================================================#
  @CapaignCatagory1_Campaign1_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign1 and 8typeofBC's 
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_10 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_15 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_20 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_25  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_30  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_35  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_40  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_45  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
   #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory1_Campaign2_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign2 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_50 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_55 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_60 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_65  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_70  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_75  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_80  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_85  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory1_Campaign3_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign3 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_90 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_95 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_100 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_105  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_110  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_115  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_120  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_125  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory1_Campaign4_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign4 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_130 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_135 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_140 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_145  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_150  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_155  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_160  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_165  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory1_Campaign5_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign1 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_170 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_175 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_180 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_185  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_190  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_195  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_200  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_205  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
    
    #=============================================================================================================#
  @CapaignCatagory2_Campaign1_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory2 with Campaign1 and 8typeofBC's 
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_10 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_15 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_20 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_25  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_30  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_35  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_40  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_45  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
   #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory2_Campaign2_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory2 with Campaign2 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_50 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_55 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_60 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then enter details for new broadcast with condition groupIdCondition_65  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_70  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_75  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_80  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_85  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory2_Campaign3_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory2 with Campaign3 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_90 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_95 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_100 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_105  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_110  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_115  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_120  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_125  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory2_Campaign4_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory2 with Campaign4 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_130 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_135 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_140 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_145  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_150  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_155  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_160  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_165  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory2_Campaign5_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory2 with Campaign1 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_170 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_175 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_180 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_185  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_190  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_195  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_200  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_205  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
    #=============================================================================================================#
  @CapaignCatagory3_Campaign1_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory3 with Campaign1 and 8typeofBC's 
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_10 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_15 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_20 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_25  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_30  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_35  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_40  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_45  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
   #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory3_Campaign2_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign2 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_50 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_55 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_60 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_65  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_70  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_75  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_80  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_85  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory3_Campaign3_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign3 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_90 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_95 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_100 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_105  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_110  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_115  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_120  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_125  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory3_Campaign4_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign4 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_130 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_135 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_140 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_145  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_150  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_155  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_160  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_165  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory3_Campaign5_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign1 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_170 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_175 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_180 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_185  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_190  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_195  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_200  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_205  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
    #=============================================================================================================#
  @CapaignCatagory4_Campaign1_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory4 with Campaign1 and 8typeofBC's 
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
    #Create_one-offBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_10 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_15 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_20 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_25  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then enter details for new broadcast with condition groupIdCondition_30  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_35  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_40  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_45  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
   #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory4_Campaign2_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory4 with Campaign2 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_50 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_55 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_60 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_65  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_70  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_75  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_80  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_85  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory4_Campaign3_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory4 with Campaign3 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_90 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_95 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_100 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_105  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_110  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_115  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_120  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_125  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory4_Campaign4_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory1 with Campaign4 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_130 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_135 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_140 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_145  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_150  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_155  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_160  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_165  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
       #------------------------------------------------------------------------------------------------------------------------------------# 
      @CapaignCatagory4_Campaign5_AllBC
  @initBrowser 
  Scenario: Verify Creating CapaignCatagory4 with Campaign1 and 8typeofBC's 
    Given login
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
    #Create_one-offBC
    Then enter details for new broadcast with condition groupIdCondition_170 from sheet "one-offBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_175 from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then activate bc
    #Create_SeedingoneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_180 from sheet "seedingoneoff" with "SeedingSMS"
    Then activate bc
    Then save details of seedingoneoff
    #Create_NormalRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_185  from sheet "recurringBC" with "rechargeSMS"
    Then activate bc
    #Create_SeedingTriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_190  from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    Then activate bc
    #SeedingRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_195  from sheet "seedingRecurringBC" with "SeedingSMS"
    Then activate bc
    #Create_TriggerOneoffBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_200  from sheet "TriggerOneoff" with "rechargeSMS"
    Then activate bc
    #Create_TriggerRecurringBC
    Then click create new broadcast button
    Then enter details for new broadcast with condition groupIdCondition_205  from sheet "TriggerReccurringBC" with "rechargeSMS"
    Then activate bc 
    Then save details of datasetup
      
        #@testdatawrite @initBrowser
  #Scenario: test data write.
    #Given login
    #Then save details of seedingoneoff
    #Then save details of datasetup
    #Then save details of datasetup
  #
       #@testdatawrite2 @initBrowser
  #Scenario: test data write.
    #Given login
    #Then save details of seedingoneoff
    #Then save details of datasetup
    #Then save details of datasetup
    
    
    
  