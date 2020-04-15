#Author: Shobina.k
#Keywords Summary : full flow of bc and program to verify bamboo build
@bamboobuild
Feature: bamboo build run

@Test1 @initBrowser
Scenario: product and product class creation
Given login
Then navigate to configuration management
Then naviagte to product classes
Then create product class without any attributes from "TestProductClass"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to offer management
Then navigate to products
Then navigate to product class "TestProductClass"
Then click create new product button
Then enter the name and description from sheet "fullDetails"


@Test2 @initBrowser
Scenario: offer and offer catalog creation
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then create new offer from sheet "rechargeSMS" with product "fullDetails"
Then navigate to offer management
Then navigate to offers
Then create new offer from sheet "STVSMS" with product "fullDetails"
Then navigate to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "defaultCatalog"
Then Add "rechargeSMS" offer to Offer Catalogue
Then Add "STVSMS" offer to Offer Catalogue
Then navigate to landing page
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then navigate to landing page
When navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"

@Test3 @initBrowser
Scenario: one-off bc creation full flow
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition targetall from sheet "one-offBC" with "rechargeSMS"
Then activate bc
Then wait until status of "one-offBC" is "Completed"
Then wait for 1 minutes
Then verify the ack count with target condition Ack from sheet "targetConditionCount" for bc from sheet "one-offBC" of bctype "onetime"
Then search msisdn "9491750800"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "campaignBC"

@Test4 @initBrowser
Scenario: create customer care tp
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to customer care
Then create customer care touchpoint from sheet "CCTouchpoint"

 
@Test5  @initBrowser
Scenario: customer care touchpoint program creation full flow
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
Then choose program from sheet "CCprogram"
Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
Then wait until rule is picked
Then verify rule created from sheet "rule"
Then wait for "A" status of rule
Then logout
Then login with selenium user
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer support
Then search msisdn "919491750000"
Then verify offer "BalanceTop"
Then wait for 5 minutes
Then enter msisdn again for refresh "919491750000"
Then verify offer "Recharge offer"   
