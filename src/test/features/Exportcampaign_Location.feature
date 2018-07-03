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

  @NX-6863 @initBrowser @closeBrowser
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
    
    @NX-7957 @initBrowser @closeBrowser
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
    