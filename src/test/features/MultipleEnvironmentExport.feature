#Author: sreeraj.rajan@flytxt.com
#Keywords Summary : export campaign location related test cases

@NX-MultipleEnvironmentExport
Feature: Test cases related to export campaign in multiple environment

@NX-8244 @initBrowser @closeBrowser
  Scenario: add export location
    Given login
		Then navigate to data foundation
		Then click on usage metrics
		Then click on create new usage metrics
		Then enter new usage metric details from sheet "UsageMetricData" of file "MultipleEnvironmentExport" and save
		Then navigate to landing page
		Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory1" of file "MultipleEnvironmentExport"
    Then navigate to system administration
    Then navigate to export location
    Then add new export location
    Then enter export location from sheet "locationdetails23" of file "MultipleEnvironmentExport"
    Then navigate to landing page
    Then navigate to precision marketer
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
	  Then navigate to offer management 
		Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory1" of file "MultipleEnvironmentExport"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then click on export location option of campaign from sheet "campaignBC" of file "campaignInputData"
    Then select export location from sheet "locationdetails" of file "MultipleEnvironmentExport" and click export
    Then click username on topbar
		Then logout
		Then login to next environment
		Then wait for 7 minutes
		Then click on notification bell
    Then click on view all notifications
   	Then click proceed on notification from the sheet "campaignBC" of file "campaignInputData"
   	Then verify whether validation messasge for invalid usag metric shown
   	#Then map to the native condition
   	#Then check whether the native condition displayed
   	Then pass next scenario based on this step

  @NX-8150
  Scenario: delete export location
    Then check previous step and pass this

   	
		