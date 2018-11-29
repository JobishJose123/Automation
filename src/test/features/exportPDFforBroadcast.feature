#Author: mallikharjuna.ankem@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NX-PDFcheck
Feature: Test cases related to Broadcast Management PDF

  @NX- @initBrowser
  Scenario: Verify that a pdf is generated on clicking export to pdf option in  bc's when  status is Planned 
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
    Then click on create new ofer button
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then verify pdf generated for broadcast from sheet "one-offBC"

  #Then activate bc
  #Then wait until status of "one-offBC" is "Render Scheduled"
  #Then verify pdf generated for broadcast from sheet "one-offBC"
  #Then wait until status of "one-offBC" is "Targeting"
  #Then verify pdf generated for broadcast from sheet "one-offBC"
  #Then wait until status of "one-offBC" is "Delivering"
  #Then verify pdf generated for broadcast from sheet "one-offBC"
  #Then wait until status of "one-offBC" is "Complete"
  #Then verify pdf generated for broadcast from sheet "one-offBC"
  
   @NX-6492 @initBrowser
  Scenario: Verify that a pdf is generated on clicking export to pdf option in  bc's when  status is Planned NX-6492
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then verify pdf generated for broadcast from sheet "one-offBC"
    
  
  @NX-6493 @initBrowser
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when status is Render-Scheduled NX-6493
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then wait until status of "one-offBC" is "Render Scheduled"
    Then verify pdf generated for broadcast from sheet "one-offBC"
    
    #Then wait until status of "one-offBC" is "Targeting"
    #Then verify pdf generated for broadcast from sheet "one-offBC"
    #Then wait until status of "one-offBC" is "Delivering"
    #Then verify pdf generated for broadcast from sheet "one-offBC"
    #Then wait until status of "one-offBC" is "Complete"
    #Then verify pdf generated for broadcast from sheet "one-offBC"

  @NX-6495 @initBrowser
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when status is Render-Scheduled status is Renderd schedual
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    #Then save bc
    #Then wait until status of "one-offBC" is "Planned"
    Then verify pdf generated for broadcast from sheet "one-offBC"
