#Author: sreeraj.rajan@flytxt.com
#Keywords Summary : export campaign location related test cases

@NX-MultipleEnvironmentExport
Feature: Test cases related to export campaign in multiple environment

#@NX-8244 @initBrowser 
  #Scenario: Verify whether validation is showing when usage metric field for foreign KPI is not in native - 8244
    #Given login
    #Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
#		Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    #Then navigate to system administration
    #Then navigate to export location
    #Then add new export location
    #Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeWAP" offer to Offer Catalogue
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    #Then create new campaign with unique KPI from sheet "campaignBC" with catalog "defaultCatalog"
    #Then choose export to location option from sheet "campaignBC"
#		Then choose export location for campaign from sheet "locationdetails" of file "ExportCampaignLocation"
#		Then click username on topbar
#		Then logout
#		Then login to next environment
   #	Then wait for 7 minutes
#		Then click on notification bell
    #Then click on view all notifications
    #Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   #	Then verify whether validation messasge for invalid usag metric shown
   #	#Then map to the native condition
   #	#Then check whether the native condition displayed
   #	Then pass next scenario based on this step
   #	
   	
   	
   	
   	
   	@NX-8244 @initBrowser 
  Scenario: Verify whether validation is showing when usage metric field for foreign KPI is not in native - 8244
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
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
		#Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
#		Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory1" of file "ExportCampaignLocation"
    #Then navigate to system administration
    #Then navigate to export location
    #Then add new export location
    #Then enter export location from sheet "locationdetails" of file "ExportCampaignLocation"
    #Then navigate to landing page
    Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
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
   	Then map to the native condition
   	Then check whether the native condition displayed
   	Then pass next scenario based on this step

  @NX-8150
  Scenario: delete export location
    Then check previous step and pass this

   	
		