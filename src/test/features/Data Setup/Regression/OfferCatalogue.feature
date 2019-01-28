#Author:shobina.k@flytxt.com
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature

@NDX-OfferCatalog
Feature: Create new Offer Catalog

@NDX-5751 @initBrowser 
Scenario: Verify Creating Offer Catalogue 
Given login
When navigate to precision marketer
Then navigate to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "defaultCatalog"
Then Add "rechargeSMS" offer to Offer Catalogue
Then navigate to Offer Catalog page
Then filter the Offer Catalog from sheet "defaultCatalog"

@NDX-5753  
Scenario: Verify editing Offer Catalogue 
Then edit the Offer Catalog

@NDX-5779 
Scenario: View Offer in Offer Catalog
Then verify the offer from sheet "rechargeSMS" is displayed for the Catalog

@NDX-5790
Scenario: View the details of the Offer in the Catalog
Then view the details of the offer

@NDX-6345
Scenario: Add Offer to the Offer Catalog
Then add offer to the catlog from sheet "rechargeWAP" and verify

@NDX-6348
Scenario: Delete offer from Offer Catalog
Then delete the Offer from sheet "rechargeWAP" and verify