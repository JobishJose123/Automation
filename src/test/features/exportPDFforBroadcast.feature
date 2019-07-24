#Author: mallikharjuna.ankem@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NX-BCPDFcheck
Feature: Test cases related to Broadcast Management PDF

  @NX-6501 @initBrowser
  Scenario: Verify export to pdf option is available in drop down for one-off broadcast - newly created NX-6501
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
    Then create new offer from sheet "SeedingSMS" with product "fullDetails"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"

  @NX-6509
  Scenario: Verify export to pdf option is available in broadcast(one-off) in broadcast Summary -newly created NX-6509
    Then wait until status of "one-offBC" is "Planned"
    Then view bc from sheet "one-offBC"
    Then verify pdf generated for broadcast from sheet "one-offBC" in broadcast Summary

  @NX-7822 @initBrowser
  Scenario: Verify whether a footer has been added to the PDF for Broadcast to reflect the time of download NX-7822
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "SeedingSMS"
    Then save bc
    Then Exporting the pdf from broacastpage
    Then Verify the exported BC time from sheet "one-offBC"

  @NX-6492 @initBrowser
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when status is Planned NX-6492
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"
    Then Renaming the Exported Boadcast from sheet  "one-offBC"

  @NX-6493
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when status is Render-Scheduled NX-6493
    Then after saving the BC activation
    Then wait until status of "one-offBC" is "Render Scheduled"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"
    Then Renaming the Exported Boadcast from sheet  "one-offBC"

  @NX-6495
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when status is Targeting NX-6495
    Then wait until status of "one-offBC" is "Targeting"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"
    Then Renaming the Exported Boadcast from sheet  "one-offBC"

  @NX-6496
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when status is delivering NX-6496
    Then wait until status of "one-offBC" is "Delivering"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"
    Then Renaming the Exported Boadcast from sheet  "one-offBC"

  @NX-6497
  Scenario: Verify that a pdf is generated on clicking export to pdf option in bc's when statusis completed NX-6497
    Then wait until status of "one-offBC" is "Completed"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"
    Then Renaming the Exported Boadcast from sheet  "one-offBC"

  @NX-6528 @initBrowser
  Scenario: Verify that Segment condition with more than 10 created conditions is displayed in pdf generated NX-6528
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition SegmentForMoreThanTenConditionsOR from sheet "one-offBC" with "rechargeWAP"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then Exporting the pdf from broacastpage
    Then Verify that Segment condition with more than ten created conditions is displayed in pdf generated from sheet "one-offBC"

  #Examples:
  #|condition|
  #|SegmentForMoreThanTenConditionsOR|
  #|SegmentForMoreThanTenConditions|
  @NX-6507 @initBrowser
  Scenario: Verify export to pdf option is available in drop down for Seeding broadcast -newly created NX-6507
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
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "SeedingSMS" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "SeedingSMS"
    Then save bc
    Then click on Seeding BC tab in BC page and filter the BC name from sheet "one-offBC"
    Then Exporting the pdf from broacastpage
    Then verify pdf generated for broadcast from sheet "one-offBC"

  @NX-6515
  Scenario: Verify export to pdf option is available and working for broadcast(Seeding) in broadcast Summary -newly created
    Then view bc from sheet "one-offBC"
    Then verify pdf generated for broadcast from sheet "one-offBC" in broadcast Summary

  @NX-6558 @initBrowser
  Scenario: Verify multiple creative with different language selection is displayed correctly in generated pdf for one-off bc for new data NX-6558
    Given login
#    Then navigate to configuration management
#    Then naviagte to product classes
#    Then create product class and number attribute from "TestProductClass"
#    Then navigate to landing page
#    Then navigate to configuration management
#    Then navigate to campaign categories
#    Then create new campaign category from sheet "CampaignCategory"
#    Then navigate to landing page
     Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to products
#    Then navigate to product class "TestProductClass"
#    Then click create new product button
#    Then create product with attributes from sheet "fullDetails"
#    Then navigate to landing page
#    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer with Multiple creatives from sheet "rechargeWAP" with product "fullDetails"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
   Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP" with language "Customer Preferred"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then Exporting the pdf from broacastpage
    Then Verify the multiple tracking rules and creatives from downloaded pdf from sheet "one-offBC"
    Then Verify that No Do Not Contact lists are excluded message is displayed in pdf from sheet "one-offBC"
    Then pass next scenario based on this step

  @NX-6562
  Scenario: Verify multiple track rules is displayed correctly in generated pdf for one-off bc for new data NX-6562
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-6531 @initBrowser
  Scenario: Verify that 'No Do Not Contact lists are excluded' message is displayed in pdf generated when all Exclude Do-Not-Contact List is given.  NX-6531
    Then check previous step and pass this

  #Given login
  #Then navigate to precision marketer
  #Then navigate to life cycle marketing
  #Then navigate to campaign category from sheet "CampaignCategory"
  #Then naigate to "campaignBC" campaign view broadcasts
  #Then click create new broadcast button
  #Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
  #Then save bc
  #Then wait until status of "one-offBC" is "Planned"
  #Then Exporting the pdf from broacastpage
  #Then Verify that No Do Not Contact lists are excluded message is displayed in pdf from sheet "one-offBC"
  @NX-6537 @initBrowser
  Scenario: Verify that all the fields and corresponding data in delivery details for one-off bc in summary tab after editing (edit mode) is displayed correctly in pdf generated-new data NX-6537
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then save bc
    Then wait until status of "one-offBC" is "Planned"
    Then Exporting the pdf from broacastpage
    Then verify after edited the of bc from sheet "one-offBC"
    Then verify pdf generated for broadcast from sheet "one-offBC"

  @NX-7823 @initBrowser
  Scenario: Verify whether a footer has been added to the PDF for Campaign to reflect the time of download NX-7823.
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then Exporting the pdf from broacastpage
    Then Verify the exported campaign time from sheet "campaignBC"

  @NX-6550 @initBrowser
  Scenario: Calculate Targets - Clicking calculate and Activating the BC simultaneously-3679
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
    Then enter details for new broadcast and calculate TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"

#  @NX-6700 @initBrowser
#  Scenario: Verify user has the export pdf privileges as per the security group roles-6700
#    Given login
#    Then navigate to configuration management
#    Then navigate to system administration
#    Then click on security group
#    Then edit security group "Super Administrator"
#    Then expand "Applications" in edit security group
#    Then deselect option "Export Broadcast list"
#    Then deselect option "Export Broadcast Summary as PDF"
#    Then click save on edit security group
#    Then click username on topbar
#    Then logout
#    Given login
#    Then navigate to precision marketer
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "CampaignCategory"
#    Then naigate to "campaignBC" campaign view broadcasts
#    Then click create new broadcast button
#    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
#    Then save bc
#    Then Verify after edit the security groups export PDF option in BC page and View from sheet "one-offBC"
