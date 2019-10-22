#Author: mallikharjuna.ankem@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NX-campaignPDFcheck 
Feature: Test cases related to Campaign Management PDF

@NX-6951 @initBrowser
  Scenario: Verify whether more than 10 target conditions get displayed in generated pdf -OR condition NX-6951.
     Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then create new offer from sheet "rechargeWAP" with product "fullDetails" rewards "oneruleonereward" with creative type "singlecreative"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign with Multiple OR operations from sheet "campaignBC" with catalog "defaultCatalog" with end type "After" recurrence "Yes" Recurring Frequency "2"
    Then Verify the campaign Schedule time and Recurrence time for exported PDF from sheet "campaignBC" with end type "After" Recurring Frequency "2"
    Then pass next scenario based on this step
    
    
    @NX-9289 
    Scenario: Verify Export as PDF download is working in campaign page NX-9289
          Then check previous step and pass this
    Then pass next scenario based on this step
    
    @NX-6941
    Scenario: Verify whether In schedule and Recurrence Recurring details is displayed in generated pdf NX-6941
     Then check previous step and pass this
    Then pass next scenario based on this step
    @NX-6943
     Scenario: Verify whether schedule and Recurrence time zone is displayed correctly in generated pdf NX-6943
    Then check previous step and pass this
    
    
    
   
    
    
    