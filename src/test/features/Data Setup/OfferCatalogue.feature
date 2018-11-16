#Author: rahul.chandran@your.flytxt.com
#Keywords Summary :Offer and offer catelogue for regression data setup
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@Offercatalogue_datasetup
Feature: Test suite Offer and offer catelogue
  Create all types of offers and offer catelogue

@Create_OfferCatalogue
@initBrowser 
Scenario Outline: Verify Creating Offer Catalogue with rechargeSMS and SeedingSMS offer
  Given login
  When navigate to precision marketer
  Then navigate to offer management
  Then navigate to offers
  Then create new offer from sheet "SeedingSMS" with product "fullDetails"
  Then verify "SeedingSMS" offer in grid
  Then navigate to life cycle marketing
  Then navigate to offer management
  Then navigate to offers
  Then create new offer from sheet "rechargeSMS" with product "fullDetails"
  Then verify "rechargeSMS" offer in grid
  Then navigate to life cycle marketing
	#When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "rechargeSMS" offer to Offer Catalogue
  Then Add "SeedingSMS" offer to Offer Catalogue