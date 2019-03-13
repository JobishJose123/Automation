#Author:shobina.k@flytxt.com
#Feature: Offer :Before executing this feature make sure to execute @Product_datasetup feature and @OfferCatalogueDataSetup.feature

@NDX-OfferCatalogVerification_Migration
Feature: Verification of Offer Catalogue(Migration)

@NDX-5776  @initBrowser
Scenario: Verify editing Offer Catalogue (Migration)
Given login
When navigate to precision marketer
Then navigate to offer management
Then Navigate to Offer Catalogue
Then navigate to Offer Catalog page
Then filter the Offer Catalog from sheet "defaultCatalog"
Then edit the Offer Catalog

@NDX-5781 
Scenario: View Offer in Offer Catalog (Migration)
Then verify the offer from sheet "rechargeSMS" is displayed for the Catalog

@NDX-5792
Scenario: View the details of the Offer in the Catalog (Migration)
Then view the details of the offer

@NDX-6346
Scenario: Add Offer to the Offer Catalog (Migration)
Then add offer to the catlog from sheet "rechargeWAP" and verify

@NDX-6347 @closeBrowser
Scenario: Delete offer from Offer Catalog (Migration)
Then delete the Offer from sheet "rechargeWAP" and verify