#Author: sreeraj.rajan@flytxt.com
#Keywords Summary : export campaign location related test cases

@NX-MultipleEnvironmentExport
Feature: Test cases related to export campaign in multiple environment

@NX-8200 @initBrowser 
  Scenario: Verify whether validation is showing when customer profile field for foreign KPI is not in native - 8200
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
    Then create new campaign with unique KPI from sheet "campaignBC" with catalog "defaultCatalog"
    Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
   	Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	
   	
   	
   	
   	
   	
   	@NX-8244 @initBrowser 
    Scenario: Verify whether validation is showing when usage metric field for foreign KPI is not in native - 8244
    Given login
    Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
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
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	
   	
   	
   	
   	@NX-8243 @initBrowser 
  Scenario: Verify whether mapping can be done when location insights condition is selected in foreign KPI conditions - 8243
    
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
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then map to the native condition
   	Then verify color of KPI condition box after successful mapping

 
 
 
 
 
 
    @NX-8208 @initBrowser 
    Scenario: Verify whether user can import without mapping - 8208
    
    Given login
    Then navigate to data foundation
    Then navigate to customer location insights
    Then click create new customer location insight
    Then enter new customer location insight details from sheet "name"
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
    Then create new campaign with customer location insight from sheet "campaignBC" with catalog "defaultCatalog"
    Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then verify import button is disabled
   	
   	
   	
   	
	
   	@NX-8223 @initBrowser 
    Scenario:Verify whether mapping can be done when given 'date' type of customer insight KPI in foreign is also in native - 8223
    
    Given login
    Then navigate to data foundation
    Then navigate to customer location insights
    Then click create new customer location insight
    Then enter new customer location insight details from sheet "name"
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
    Then create new campaign with customer location insight from sheet "campaignBC" with catalog "defaultCatalog"
    Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then map to the native condition
   	Then verify color of KPI condition box after successful mapping
   	
   	
   	
   	
   	
   	@NX-8207 @initBrowser 
    Scenario: Verify whether user can import after mapping is done - 8207
	
    Given login
    Then navigate to data foundation
    Then navigate to customer location insights
    Then click create new customer location insight
    Then enter new customer location insight details from sheet "name"
    Then navigate to landing page
		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    Then create new campaign with customer location insight from sheet "campaignBC" with catalog "defaultCatalog"
    Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then map to the native condition
   	Then verify color of KPI condition box after successful mapping
   	Then select a category and import
    Then verify toast message after successful import of a campaign
   	
   	
   	
   	
   	
   	
   	
   	@NX-8206 @initBrowser 
    Scenario: Verify all the imported campaign template conditions are same after importing - 8206
	
    Given login
    Then navigate to data foundation
    Then navigate to customer location insights
    Then click create new customer location insight
    Then enter new customer location insight details from sheet "name"
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
    Then create new campaign with customer location insight from sheet "campaignBC" with catalog "defaultCatalog"
    Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then map to the native condition
   	Then verify color of KPI condition box after successful mapping
   	Then select a category and import
    Then verify toast message after successful import of a campaign
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "category" of file "CategoryEnv2"
    Then navigate to templates tab
    Then find template from sheet "campaignBC"
    Then veify imported campaign template conditions are same after importing
   	
   	
   	
   	
   	
   	
   	@NX-8248 @initBrowser 
    Scenario: Verify whether mapping can be done by giving weektype of usage metric as calendar week - 8248
    Given login
		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then map to the native condition
   	Then verify color of KPI condition box after successful mapping
   	
   	
   	
   	
   	
   	@NX-8150 @initBrowser 
    Scenario: Verify whether target conditions for foreign are replaced by native conditions after mapping - 8150
    Given login
		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	Then map to the native condition
   	Then verify color of KPI condition box after successful mapping
   	Then verify texts of KPI  conditions before and after mapping
   	
		
		
		
		@NX-6903 @initBrowser 
		Scenario: verify whether for the newly created campaign created using create campaign template option has edit option -migrated-6903
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
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
    Then create campaign from sheet "campaignBC" with catalog "defaultCatalog" for use template
		Then verify campaign created from sheet "campaignBC"
		Then edit campaign from sheet "campaignBC" with catalog "defaultCatalog" for use template
		Then verify campaign created from sheet "campaignBC"
		
		
		
		
		
		
		@NX-6901 @initBrowser 
		Scenario: Verify whether exported campaign will be in blue colour in campaign template -new campaign-6901
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
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
    Then create campaign from sheet "campaignBC" with catalog "defaultCatalog" for use template
		Then verify campaign created from sheet "campaignBC"
		Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast for use template from sheet "one-offBC" with "rechargeWAP"
		
		
		
		
		
		
		@NX-6887 @initBrowser 
		Scenario: Verify whether usage metric KPI conditions is displayed when we click use this template option on the exported campaign -new-6887
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    
    
    
    
    @NX-8254 @initBrowser 
    Scenario: Imported:Verify whether user can share with valid location details - 8254
    Given login
		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
		Then verify toast message after successful export of a campaign
		
		
		
		
		@NX-8209 @initBrowser 
		Scenario: Verify whether user can import without selecting campaign category-8209
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
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
    Then click import button without selecting campaign category
    Then verify select category error message
    
    
    
    
    
    
    
    @NX-8211 @initBrowser 
		Scenario: Verify whether error message shown when user try to import without valid details-8211
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
    Then clear campaign name field
    Then click import button without selecting campaign category
    Then verify select category error message
    Then verify validation message for import page
    
    
    
    
    @NX-8210 @initBrowser 
		Scenario: Verify whether user can import without selecting template name-8210
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
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
    Then clear campaign name field
    Then select a category and import
    Then verify select category error message
    
    
    
    @NX-8255 @initBrowser 
		Scenario: Imported:Verify Export to location option is available in campaign category for user -new-8255
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
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
		Then check export to location option available for campaign from sheet "campaignBC"
		
		
		
		
		
			
		@NX-8252 @initBrowser 
		Scenario: Verify whether edit option is available for the existing campaign template in native-8252
    Given login
  	Then navigate to data foundation
    Then navigate to usage metric
    Then click create new usage metric
    Then enter new usage metric details from sheet "usageMetric"
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
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
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
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
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
    Then verify edit option for campaign template
		
		
		
		
		
		@NX-8221 @initBrowser 
    Scenario: Verify whether validation is showing when given 'date' type of customer insight KPI in foreign is not found in native - 8221
    Given login
    Then navigate to data foundation
    Then navigate to customer location insights
    Then click create new customer location insight
    Then enter new customer location insight details from sheet "name"
    Then navigate to landing page
		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
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
    Then create new campaign with customer location insight from sheet "campaignBC" with catalog "defaultCatalog"
    Then choose export to location option from sheet "campaignBC"
		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
		Then click username on topbar
		Then logout
		Then login to next environment
    Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
    Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	
   	
   	
   	
   	
   	@NX-8204 @initBrowser 
		Scenario: Verify whether the imported campaign templates are having status 'imported'-8204
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
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
  	Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
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
   	Then check import status for campaign template
   	
   	
   	
   	
   	@NX-8199 @initBrowser 
		Scenario: Verify whether user can share with valid location details-8199
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
    Then click export location option for campaign template
    Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify toast message after successful export of a campaign template
   	
   	
   	
   	
   	
   	
   	@NX-7954 @initBrowser 
		Scenario: Verify whether on clicking Add button user can add the location details-7954
    Given login
    Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify toast message for successful creation of export location 
    
    
    
    
    @NX-7952 @initBrowser 
		Scenario: Verify whether on clicking edit button user can able to edit the added location details-7952
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify toast message for successful creation of export location 
    Then navigate to export campaign location from sheet "locationdetails" and click edit button
    Then edit export campaign location name
    Then verify toast message for successful creation of export location 
    
    
    
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
		Then click username on topbar
		Then logout
		Then login to next environment
   	Then wait for 7 minutes
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
   	
   	 @NX-7953 @initBrowser 
		Scenario: Verify whether on clicking delete button user can able to delete the added location details-7953
    Given login
    Then navigate to configuration management
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    Then verify toast message for successful creation of export location 
    Then navigate to export campaign location from sheet "locationdetails" and click delete button
    
      @NX-8189 @initBrowser
  Scenario: Verify whether user can edit the existing campaign template-8189
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
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class without any attributes from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
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
    Then edit campaign template from sheet "template"
    Then verify template edited from sheet "template"
    
   	