#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@AllBCCreation_datasetup
Feature: Test suite for Broadcast creation
  Create all types of Braodcast
  

  
  @NDX-4887
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC with given condition
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "rechargeSMS"
    Then save bc
    Then save "bcInputData" data to spreadsheet from "one-offBC" with string one-off bc with condition: <Condition>
      
     Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
      @NX-createCampaignForRecurringBcs
   @initBrowser @closeBrowser
  Scenario: Verify Creating campaign for recurring BC
   Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then save "campaignInputData" data to spreadsheet from "campaignBC" with string campaign with defaultCatalog for recurring bc
    
     @NDX-creat
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating one-off BC with <Condition>
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition <Condition> from sheet "recurringBC" with "rechargeSMS"
      Then save bc
      
        Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
  @NDX-4891
  @initBrowser @closeBrowser
  Scenario Outline: Verify Creating Seeding Trigger BC
  Given login
   When navigate to precision marketer     
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
     Then enter details for new broadcast with condition <Condition> from sheet "seedingTriggerableBC" with "SeedingSMS"
    Then save bc
    
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|
    |customerList|
    |discoveredClusters200|
    |customerDrivenEvent|
    |usageMetric|
    |eventCounts|
    |revenueMetric|
    |IMEventsOfferAccepted|
    |IMEventsCustomerCareUsage|
    |customerDeviceInfo|
    |segmentAgeGT40|
    
  #
  #@NDX-4892
  #@initBrowser @closeBrowser
  #Scenario: Verify Creating  Seeding one-offBC
    #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #When navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    #Then verify "SeedingSMS" offer in grid
    #Then navigate to life cycle marketing
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then verify "rechargeSMS" offer in grid
    #Then navigate to life cycle marketing
#	  #When navigate to precision marketer
#	  Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then Add "SeedingSMS" offer to Offer Catalogue
    #Then navigate to precision marketer
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "one-offBC" with "SeedingSMS"
    #Then save bc
  #
  #@NDX-4894
  #@initBrowser @closeBrowser
  #Scenario: Verify Creating Normal RecurringBC
  #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #When navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    #Then verify "SeedingSMS" offer in grid
    #Then navigate to life cycle marketing
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then verify "rechargeSMS" offer in grid
    #Then navigate to life cycle marketing
#	  #When navigate to precision marketer
#	  Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then Add "SeedingSMS" offer to Offer Catalogue
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "recurringBC" with "rechargeSMS"
    #Then save bc
    #
    #
  #@NDX-4888
  #@initBrowser @closeBrowser
  #Scenario: Verify Creating Seeding Trigger recurring BC
  #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #When navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    #Then verify "SeedingSMS" offer in grid
    #Then navigate to life cycle marketing
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then verify "rechargeSMS" offer in grid
    #Then navigate to life cycle marketing
#	  #When navigate to precision marketer
#	  Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then Add "SeedingSMS" offer to Offer Catalogue
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "seedingTriggerableRecurringBC" with "SeedingSMS"
    #Then save bc
  #
  #@NDX-4890	
  #@initBrowser @closeBrowser
  #Scenario: Verify Creating Seeding RecurringBC
  #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #When navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    #Then verify "SeedingSMS" offer in grid
    #Then navigate to life cycle marketing
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then verify "rechargeSMS" offer in grid
    #Then navigate to life cycle marketing
#	  Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then Add "SeedingSMS" offer to Offer Catalogue
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "recurringBC" with "SeedingSMS"
    #Then save bc
  #
  #@NDX-4893
  #@initBrowser @closeBrowser
  #Scenario: Verify Creating Trigger Oneoff BC
  #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #When navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    #Then verify "SeedingSMS" offer in grid
    #Then navigate to life cycle marketing
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then verify "rechargeSMS" offer in grid
    #Then navigate to life cycle marketing
#	  Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then Add "SeedingSMS" offer to Offer Catalogue      
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "TriggerOneoff" with "rechargeSMS"
    #Then save bc
  #
  #@NDX-4895	
  #@initBrowser @closeBrowser
  #Scenario: Verify Creating Trigger recurring BC
  #Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #When navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    #Then verify "SeedingSMS" offer in grid
    #Then navigate to life cycle marketing
    #Then navigate to offer management
    #Then navigate to offers
    #Then create new offer from sheet "rechargeSMS" with product "fullDetails"
    #Then verify "rechargeSMS" offer in grid
    #Then navigate to life cycle marketing
#	  Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeSMS" offer to Offer Catalogue
    #Then Add "SeedingSMS" offer to Offer Catalogue      
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "campaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "TriggerReccurringBC" with "rechargeSMS"
    #Then save bc
  