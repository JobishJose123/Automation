#Author: sreeraj.rajan@flytxt.com
#Keywords Summary : export campaign location related test cases

@NX-ExportCampaign_Location
Feature: Test cases related to export campaign location

  @NX-6850 @initBrowser @closeBrowser
  Scenario: add export location
    Given login
    Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify export location "added" from sheet "locationdetails" of file "ExportCampaignLocation"
    Then delete export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify export location "delete" from sheet "locationdetails" of file "ExportCampaignLocation"
    Then pass next scenario based on this step

  @NX-6849
  Scenario: delete export location
    Then check previous step and pass this

  @NX-6848 @initBrowser @closeBrowser
  Scenario: edit export location
    Given login
    Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then click edit export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify export location "edit" from sheet "locationdetails" of file "ExportCampaignLocation"
    Then delete export location from sheet "locationdetails" of file "ExportCampaignLocation"

  @NX-6863 @initBrowser 
  Scenario: create new campaign from template and edit the same
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
    Then click on use template button from sheet "template" of file "campaignTemplateInputData"
    Then create new campaign use template from sheet "campaignBC" with catalog "defaultCatalog"
    Then edit campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"
    
    @NX-7957 @initBrowser
  	Scenario: Verify whether user can save location details with invalid details
  	Given login
  	Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "invalidlocationdetails" of file "ExportCampaignLocation"
    Then verify export location "added" from sheet "invalidlocationdetails" of file "ExportCampaignLocation"
    
    @NX-8016 @initBrowser @closeBrowser
		Scenario: Verify the given location name can be selected from the drop down
  	Given login
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to templates tab
    Then create new template from sheet "template" of file "ExportCampaignLocation"
    Then click on export location option of template from sheet "template" of file "ExportCampaignLocation"
		Then verify the location name from sheet "locationdetails" of file "ExportCampaignLocation" can be selected from the drop down
    
    
    @NX-8184 @initBrowser 
 		Scenario: Verify imported campaign template can be used for new campaign creation
 		Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then create new campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to templates tab
    Then create new template from sheet "template" of file "ExportCampaignLocation"
    Then click on export location option of template from sheet "template" of file "ExportCampaignLocation"
    Then select export location from sheet "locationdetails" of file "ExportCampaignLocation" and click export
    Then wait for 8 minutes
    Then click on notification bell
    Then click on view all notifications
   	Then click proceed on notification from the sheet "template" of file "ExportCampaignLocation"
   	Then verify whether condition displayed
   	Then pass next scenario based on this step
    Then select a campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
    Then change campaign name from sheet "template" of file "ExportCampaignLocation"
    Then click on import
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
    Then navigate to templates tab
    Then click on use template button from sheet "template" of file "ExportCampaignLocation"
    Then create new campaign use template from sheet "campaignBC" with catalog "defaultCatalog"
    Then edit campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify campaign created from sheet "campaignBC"

  @NX-8019
  Scenario: Verify the exported campaign contains all the target conditions
    Then check previous step and pass this
    
    @NX-8193 @initBrowser 
   Scenario: Verify whether share option is available for imported campaign template
 		Given login
 		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
		Then navigate to templates tab
		Then click on export location option of template from sheet "template" of file "ExportCampaignLocation"
		Then verify export option panel displayed
		Then select export location from sheet "locationdetails" of file "ExportCampaignLocation" and click export
    Then wait for 6 minutes
    Then click on notification bell
    Then click on view all notifications
   	Then click proceed on notification from the sheet "template" of file "ExportCampaignLocation"
    Then select a campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then change campaign name from sheet "template" of file "ExportCampaignLocation"
    Then click on import
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to templates tab
    Then verify template contains exported template from sheet "template" of file "ExportCampaignLocation"
    Then pass next scenario based on this step

  @NX-8257
  Scenario: delete export location
    Then check previous step and pass this
    
  @NX-8198 @initBrowser @closeBrowser
  Scenario: Verify whether user can share without valid location details
 		Given login
 		Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
		Then navigate to templates tab
		Then click on export location option of template from sheet "template" of file "ExportCampaignLocation"
		Then select export location from sheet "invalidlocationdetails" of file "ExportCampaignLocation" and click export
		Then verify export option panel displayed
		
	#For this test we need a user who has only one security group access
	#Currently using shinu.rajan@flytxt.com as user and CCE as security group	
	@NX-8023 @initBrowser @closeBrowser
  Scenario: Verify whether user will get notifications without campaign template administration
 		Given navigate to environment
 		Then login with the username "shinu.rajan@flytxt.com" and password "flytxt"
 		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then create new campaign category from sheet "CampaignCategory2" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to templates tab
    Then create new template from sheet "template" of file "ExportCampaignLocation"
    Then click on export location option of template from sheet "template" of file "ExportCampaignLocation"
    Then select export location from sheet "locationdetails" of file "ExportCampaignLocation" and click export
    Then wait for 7 minutes
    Then click on notification bell
    Then click on view all notifications
    Then verify whether campaign notification displayed "true" from sheet "template" of file "ExportCampaignLocation"
 		Then navigate to configuration management
 		Then navigate to system administration
 		Then click on security group
 		Then edit security group "CCE"
 		Then expand "Applications" in edit security group
 		Then deselect option "Campaign Template Administration"
 		Then click save on edit security group
 		Then click username on topbar
 		Then logout
 		Then login with the username "shinu.rajan@flytxt.com" and password "flytxt"
 		Then click on notification bell
    Then click on view all notifications
    Then verify whether campaign notification displayed "false" from sheet "template" of file "ExportCampaignLocation"
    
    
    @NX-8848 @initBrowser @closeBrowser
  	Scenario: Verify category names are displaying on mouse hovering in target tab of campaign creation page
    Given login
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    
    
    
    
    @NX-6867 @initBrowser 
		Scenario: Verify whether category is displayed when use this template option on the exported campaign is used-6867
  	Given login

  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
		Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
		Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
		Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
		Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
		Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
		Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
   	
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
    Then select a category and import
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "category" of file "CategoryEnv2"
    Then navigate to templates tab
    Then find template from sheet "campaignBC"
    Then check category while click on use template
    
    
    
    
    @NX-6886 @initBrowser 
		Scenario: Verify whether usage metric KPI conditions is displayed when we click use this template option on the exported campaign -migrated-6886
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
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
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
		Then create new campaign with usage metric from sheet "campaignBC" with catalog "defaultCatalog"
		Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
		Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then create same usage metric details from sheet "usageMetric"
    Then navigate to landing page
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
    Then select a category and import
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "category" of file "CategoryEnv2"
    Then navigate to templates tab
    Then find template from sheet "campaignBC"
    Then check usage metric KPI showing while click on use template option
	
	#----------------do not uncommand	for normal run
#		@NX-deleteall @initBrowser 
#		Scenario: delete all export locations
#		Given login
#		Then delete all locations
#----------------------		
		