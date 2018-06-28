#Author: joel.jose@flytxt.com
#Keywords Summary : checking postive flow of bc creation
@NXCampaign
Feature: campaign management

  #########################recurring bc
  @NX-1777 @initBrowser
  Scenario: create a campaign
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    
    @NX-1560 @initBrowser
  Scenario: Create Campaign: Verify adding the campaign with duplicate name- 1560
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then create duplicate campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    @NX-1506 @initBrowser
  Scenario: Create new campaign template :- Verify the name and created by of the Campaign template- 1506
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
    
    
     @NX-1508 @initBrowser
    Scenario: CLV Max: Create new campaign template :- Verify the Use template functionality of the Campaign template- 1508
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
    Then click on use template button
    Then create new campaign use template from sheet "campaignBC" with catalog "defaultCatalog"
    
    @NX-1510 @initBrowser
    Scenario: Campaign Template: Verify editing the created campaign templates- 1510
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
    Then edit campaign template from sheet "template"
    Then verify template edited from sheet "template"
    
    
    
    @NX-1505 @initBrowser
    Scenario: Campaign Template: Verify the Add AND option for the condition added- 1505
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template from sheet with add AND option "template"
    Then verify template created from sheet "template"
    
    
    @NX-1500 @initBrowser
    Scenario: Campaign Template: Verify delete option for the conditions added- 1500
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
    Then delete target conditions for template
   
   
    @NX-1496 @initBrowser
    Scenario: Campaign Template:Verify the edit option for the conditions added- 1496
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template from sheet "template"
    Then verify template created from sheet "template"
    Then edit target conditions for a template from sheet
    Then verify template created from sheet "template"
    
    
    @NX-1492 @NX-1491 @initBrowser
    Scenario: Campaign Template: Verify adding the Field value in target condition tab- 1492
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then navigate to templates tab
    Then create new template customer insight condition type from sheet "template"
    Then verify template created from sheet "template"
    
    
    @NX-1205 @initBrowser
    Scenario: Campaign grid: Verify edit option of the campaign-1205
    Given login
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    #Then verify campaign created from sheet "campaignBC"
    Then edit campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    
    @NX-1198 @initBrowser
    Scenario: Campaign grid: Verify the filter option for the campaign-1198
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then verify filter for campaign from sheet "campaignBC"
    Then verify campaign created from sheet "campaignBC"
    
    
    @NX-1194 @initBrowser
    Scenario: Campaign grid: Verify expanding the campaign row-1194
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then click on campaign  to verify expanding the campaign row from sheet "campaignBC"
    
    
    @NX-686 @initBrowser
    Scenario: Campaign Creation: Graphical  :Verify the delete option for the added virtual conditions-686
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then delete target conditions for campaign
    
    
    @NX-691 @initBrowser
    Scenario: Campaign Creation: Graphical  :Verify adding multiple AND/OR condition in visual editor-687
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet with add AND option "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    
    
    @NX-693 @initBrowser
    Scenario: Campaign Creation: Graphical  :Verify the edit option of the added virtual conditions-685
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then edit target conditions for campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    
    
    @NX-674 @initBrowser
    Scenario: Campaign Creation: Details: Verify the offers by clicking on the hyperlink near choose catalo-674
    Given login
    When navigate to precision marketer
	  Then navigate to offer management
    Then navigate to products
    Then navigate to prepaid telecom
    Then click create new product button
    Then create single product from sheet "singleProductPage"
	  Then navigate to offer management 
	  Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then verify number of offers while create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    
    
    @NX-1211 @initBrowser
    Scenario: Campaign grid: Verify the pause option for the campaign-1211
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then verify pause for campaign
    
    @NX-1212 @initBrowser
    Scenario: Campaign grid: Verify the resume option for the campaign-1212
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then verify pause and resume option for campaign
    
    
    
    @NX-698 @initBrowser
    Scenario: Campaign Creation: Graphical Target:Verify the Duplicate option for the added virtual condition-698
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then verify the duplicate option for the added virtual condition while creating new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    
    
    
    @NX-1210 @initBrowser
    Scenario: Campaign grid: Verify the Abort option for the campaign-1210
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then verify abort option for campaign
    
    
    @NX-9211 @initBrowser
    Scenario: Campaign grid: Verify Delete option of the campaign-9211
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    Then verify abort option for campaign
    Then verify delete option for campaign
    Then verify deleted campaign from sheet "campaignBC"
    
    
    
