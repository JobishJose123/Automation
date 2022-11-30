#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Total Scenario : 1
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature
@Offercatalogue_datasetup
Feature: Test suite Offer and offer catelogue
  Create all types of offers and offer catelogue
@NDX-5751
@Create_OfferCatalogue
@initBrowser 
Scenario: Verify Creating Offer Catalogue 
  Given login
  When navigate to precision marketer
  Then navigate to offer management
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then Add "SeedingSMS" offer to Offer Catalogue
  Then Add "rechargeWAP" offer to Offer Catalogue
   Then Add "seedingWAPoffer" offer to Offer Catalogue
  #Then Add "SeedingSMS_Dynamic" offer to Offer Catalogue
  Then Add "rechargeVoicePush" offer to Offer Catalogue
  Then Add "rechargeEmail" offer to Offer Catalogue
  #Then Add "STVSMS" offer to Offer Catalogue
  Then save "offerCatalogInputData" data to spreadsheet from "defaultCatalog" with string offer catalog 
  
 
