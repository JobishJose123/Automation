#Author: joel.jose@flytxt.com
#Keywords Summary : checking postive flow of bc creation

@NX-BroadcastManagement
Feature: Test cases related to Broadcast Management

@NX-505 
@initBrowser 
Scenario: Create BC-Details tab: Verify Create New BC lands in the details tab.
Given login
Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
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
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then check if create new bc lands in details tab

@NX-517 
@initBrowser @closeBrowser
Scenario: Create BC-Details tab: Verify the text box validations for the BC details tab
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify validations of bc details tab

@NX-518 
@initBrowser @closeBrowser
Scenario: Create BC-Details tab: Verify the proceed button without adding the mandatory fields
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify mandatory fields in details tab

@NX-528 
@initBrowser @closeBrowser
Scenario: Create BC-Details tab: Verify proceeding to the next tab.
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify proceeding to target tab

@NX-529
@initBrowser @closeBrowser
Scenario: Create BC-Details tab: Verify the headers for previous tab after proceeding to the next tab.
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify headers after proceeding to next target tab

@NX-569
@initBrowser @closeBrowser
Scenario: Create BC- Manual Target: Verify the textual editor
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify textual editor for target condition

@NX-573
@initBrowser @closeBrowser
Scenario: Create BC- Manual Target: Verify deleting the textual conditions
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify delete option of target condition

@NX-575
@initBrowser @closeBrowser
Scenario: Create BC- Manual Target: Verify the proceed button without adding target conditions
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify proceed button without adding target condition

@NX-588
@initBrowser @closeBrowser
Scenario: Create BC: Choose Offers: Verify creating new offer by clicking on the Create New Offer button
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then check create new offer in bc creation


##check in env 23
@NX-611
@initBrowser @closeBrowser
Scenario: Create BC: Choose Offers: Verify the choose offer window after selecting an offer.
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify choose offer window after selecting offer

@NX-613
@initBrowser @closeBrowser
Scenario: Create BC: Choose Offers: Verify selecting the channel and sender input
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify selecting channel and sender


@NX-630
@initBrowser @closeBrowser
Scenario: Create BC: Choose Offers:Verify navigation to the delivery tab without adding channel and Sender details
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify navigating to delivery tab without selecting channel and sender



@NX-572
@initBrowser @closeBrowser
Scenario: Create BC- Manual Target: Verify editing the added textual conditions
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
#Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then navigate to broadcast target condition
Then verify editing target condition

@NX-571
@RegressionYes
@initBrowser @closeBrowser
Scenario: Create BC- Manual Target: Verify adding the filter conditions with OR condition
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then navigate to broadcast target condition
Then verify adding target condition with or condition

@NX-570
@initBrowser @closeBrowser
Scenario: Create BC- Manual Target: Verify adding the filter conditions with AND condition
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
#Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then navigate to broadcast target condition
Then verify adding target condition with and condition

@NX-2050 
@initBrowser
Scenario: Create New Broadcast: Verify the Creation and Activation of One Off Broadcast
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
Then activate bc


@NX-7612 
@initBrowser 
Scenario: To Verify the selected Broadcast can be viewed-7612
Given login
Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
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
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"

@NX-2052
@initBrowser @closeBrowser
Scenario: Create New Broadcast: verify create BC Notification
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify create BC Notification
@NX-1412
@initBrowser @closeBrowser
Scenario: Create New Broadcast:Target AND Duplicate function
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify target duplicate function in new broadcast
@NX-645
@initBrowser 
Scenario: Create BC: Deliver tab: Verify Broadcast Schedule Range details
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify broadcast schedle range details

@NX-1234
@initBrowser
Scenario: Broadcast grid: Verify the breadcrum for broadcast listing screen.
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then verify view braodcast breadcrumb

@NX-1238
Scenario: Broadcast grid: Verify the label displaying the selected campaign name
Given verify selected campaign name


@NX-1239
@closeBrowser
Scenario: Broadcast grid: Verify the label displaying the selected campaign category name
Given verify selected campaign category name

@NX-1247
@initBrowser @closeBrowser
Scenario: Broadcast grid: Verify create new broadcast button.
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then verify create new broadcast button

@NX-1269
@initBrowser
Scenario: Broadcast grid: Verify the options available for the BC
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
Then activate bc
Then verify options icon of bc

#@NX-1273
#Scenario: Broadcast grid: Verify the Pause option of the BC
#Given verify pause option of bc

#@NX-1271
#@closeBrowser
#Scenario: Broadcast grid: Verify the edit option for the BC
#Given verify edit option of bc

@NX-1185
@initBrowser @closeBrowser
Scenario: Category screen : Verify editing the category
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then edit campaign category from sheet "campaignCategory"

@NX-1190
@initBrowser @closeBrowser
Scenario: Category screen : Verify deleting the category
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then delete campaign category from sheet "campaignCategory"

@NX-1184
@initBrowser @closeBrowser
Scenario: Category screen : Verify the options of the category
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then verify options of category

@NX-1180
@initBrowser 
Scenario: Category screen : Verify the count added with the template
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then verify campaign template count from sheet "campaignCategory"

@NX-1177
@initBrowser @closeBrowser
Scenario: Category screen : Verify screen navigation by clicking on the category
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts

@NX-1170
@initBrowser @closeBrowser
Scenario: Category screen : Verify the campaign count under the category.
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then verify campaign count from sheet "campaignCategory"

@NX-1169
@initBrowser @closeBrowser
Scenario: Category screen : Verify creating a category without adding a name.
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category without adding name

@NX-1168
@initBrowser @closeBrowser
Scenario: Category screen : Verify adding the new category
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"

@NX-1167
@initBrowser @closeBrowser
Scenario: Category screen : Verify the categories under Life Cycle Marketing
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"


@NX-1192
@initBrowser @closeBrowser
Scenario: Category screen : Verify the delete option when the category is linked with campaigns
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategory"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then navigate to landing page
Then navigate to configuration management
Then navigate to campaign categories
Then check delete campaign category with linked campaigns from sheet "campaignCategory"



































## test case number check, check in env 23
#@NX-613
#@initBrowser @closeBrowser
#Scenario: Create BC: Choose Offers: Verify selecting the channel and sender input
#Given login
#Then navigate to precision marketer
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
#Then activate bc


















#########################recurring bc
@NX-recurring 
@initBrowser 
Scenario: save recurring broadcast and activate
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringBC" with "rechargeWAP"
Then save bc
Then navigate to "Recurring" broadcasts
Then activate saved "Recurring" bc from sheet "recurringBC"
Then navigate to "Recurring" broadcasts
Then check if "Recurring" bc status is "Active" from sheet "recurringBC"

#@NX-561
#@initBrowser
#Scenario: Create BC- Graphical Target: Verify all the operations using visual editor NX-561
#Given login
#Then navigate to precision marketer
#Then navigate to offer management
#Then navigate to products
#Then navigate to prepaid telecom
#Then click create new product button
#Then create single product from sheet "singleProductPage"
#Then navigate to offer management
#Then navigate to offers
#Then create new offer from sheet "rechargeWAP" with product "singleProductPage"
#Then navigate to offer management
#Then Navigate to Offer Catalogue
#Then Create New Offer Catalogue from sheet "defaultCatalog"
#Then Add "rechargeWAP" offer to Offer Catalogue
#Then navigate to life cycle marketing
#Then navigate to "Recharge" category
#Then create new campaign from sheet "campaignBC"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then verify all operations of target using visual editor