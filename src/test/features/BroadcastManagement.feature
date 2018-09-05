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
    Then pass next scenario based on this step

  @NX-649
  Scenario: Create BC: Deliver tab: Verify select Recurrence pattern days  NX-649
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-582
  Scenario: Create BC: Choose Offers: Verify selecting the offers from the all offers grid  NX-582
    Then check previous step and pass this

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


@NX-7596
@initBrowser  @closeBrowser
Scenario: Verify creation of triggerable BC - Regression NX-7596
Given login
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
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "triggerableBC" with "rechargeWAP"
Then activate bc
Then navigate to "Triggerable" broadcasts
Then check if "Triggerable" bc status is "Active" from sheet "triggerableBC"

@NX-7597
@initBrowser  @closeBrowser
Scenario: Verify creation of seeding recurring BC NX-7597
Given login
Then navigate to precision marketer
 Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "seedingRecurringBC" with "seedingWAPoffer"
Then activate bc
Then navigate to "Seeding" broadcasts
Then check if "Seeding" bc status is "Active" from sheet "seedingRecurringBC"

@NX-7598
@initBrowser 
Scenario: Verify creation of seeding triggerable BC NX-7598
Given login
Then navigate to precision marketer
 #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "seedingTriggerableBC" with "seedingWAPoffer"
Then activate bc
Then navigate to "Seeding" broadcasts
Then check if "Seeding" bc status is "Active" from sheet "seedingTriggerableBC"

@NX-1417
@initBrowser 
Scenario: BC grid: Verify copy option for the parent BC NX-1417
Given login
Then navigate to precision marketer
 Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
#Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
#Then activate bc
Then verify copy bc from sheet "one-offBC"
Then view broadcast from sheet "one-offBC"

##----------------------------------------------------------------------------------------------------------------------------------------##


@NX-7364 @NX-7350
@initBrowser 
Scenario: Create New Broadcast: verify create BC Notification
 Given login
    #Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    #Then click create new broadcast button
    #Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
		Then verify create BC Notification
		Then activate bc
    Then verify bc created from sheet "one-offBC"
    Then wait until status of "one-offBC" is "Complete"
    Then verify email notifications from sheet "one-offBC"
































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


#####################################RUN

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



@NX-2529 @initBrowser @closeBrowser
    Scenario: CVM UI- Verify whether user is able to validate CG before activating BC-2529
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
    Then validate bc
    Then verify bc created from sheet "one-offBC"
    
    
    @NX-2525 @initBrowser @closeBrowser
    Scenario: CVM UI- Verify whether there is an option to configure Target group and Control group parameters in Target tab-2525
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
    Then enter details for new broadcast and configure TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    
    
    
     
    @NX-2533 @initBrowser @closeBrowser
    Scenario: CVM UI- Verify that BC can be activated only after 'CG Validation Passed' once BC enters validation process-2533
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
    Then enter details for new broadcast and configure TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then validate bc
    Then verify active option for bc
    Then verify bc created from sheet "one-offBC"
    
    
    
     @NX-2540 @initBrowser @closeBrowser
    Scenario: CVM UI- Check whether BC goes to 'Submitted For CG Validation' status when BC is clicked to Validate-2540
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
    Then enter details for new broadcast and configure TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then validate bc
    Then verify validate option for bc
    Then verify bc created from sheet "one-offBC"
    
    
    
    
     @NX-2548 @initBrowser @closeBrowser
    Scenario: CVM UI- Verify whether BC status is changed to 'Validating CG' when validation is started-2548
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
    Then validate bc
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then verify validating CG status for bc
    Then verify bc created from sheet "one-offBC"
    @NX-6529
@initBrowser  @closeBrowser
Scenario: Verify specifying the recurrence value as 10,20,30 etc NX-6529
Given login
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
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeWAP"
Then activate bc
Then navigate to "Recurring" broadcasts
Then view broadcast from sheet "recurringMonthBC"
Then verify delivery details from "recurringMonthBC"

    @NX-6291
@initBrowser  @closeBrowser
Scenario: Verify copy of the activated BC which has monthly recurrence NX-6291
Given login
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
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeWAP"
Then activate bc
Then navigate to "Recurring" broadcasts
Then verify copy bc from sheet "recurringMonthBC"
Then navigate to "Recurring" broadcasts
Then view broadcast from sheet "recurringMonthBC"
Then verify delivery details from "recurringMonthBC"
    
    @NX-3399 @initBrowser @closeBrowser
    Scenario: Calculate Target - Creating One-Off BC with DNC exclusion-3399
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
    Then enter details for new broadcast and select any DNC exclusion list from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    
    @NX-1275 @initBrowser @closeBrowser
    Scenario: Broadcast grid: Verify export option of the BC-1275
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
    Then export bc
   
    
    
    
    
    @NX-652 @initBrowser @closeBrowser
    Scenario: Create BC: Deliver tab: Verify "Starts broadcast at" option-652
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
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast and verify starts broadcast at option from sheet "seedingRecurringBC" with "seedingWAPoffer"
    Then activate bc
    Then verify bc created from sheet "seedingRecurringBC"
    
    
    
    
    @NX-7586 @initBrowser @closeBrowser
    Scenario: Verify broadcast view for all type of one off BCs-7586
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
    Then view bc from sheet "one-offBC" 
    
    
    
    @NX-7587 @initBrowser @closeBrowser
    Scenario: Verify Abort option for all type of one off BCs-7587
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
    Then abort bc 
     
    @NX-6290
@initBrowser  @closeBrowser
Scenario: Verify copy of the planned broadcast which has monthly recurrence NX-6290
Given login
Then navigate to precision marketer
 Then navigate to offer management
    Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeWAP"
Then save bc
Then navigate to "Recurring" broadcasts
Then verify copy bc from sheet "recurringMonthBC"
Then navigate to "Recurring" broadcasts
Then view broadcast from sheet "recurringMonthBC"
Then verify delivery details from "recurringMonthBC"

@NX-7449
   @initBrowser @closeBrowser
   Scenario: Check whether configuration is available to set permision to edit BCs
   Given login
   Then navigate to configuration management
   Then navigate to partners
   Then navigate to partners Edit page
   
   
   
   @NX-3679 @initBrowser @closeBrowser
    Scenario: Calculate Targets - Clicking calculate and Activating the BC simultaneously-3679
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
    Then enter details for new broadcast and calculate TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    
    
    
    @NX-3416 @initBrowser @closeBrowser
    Scenario: Calculate Targets - Creating seeding BC with DNC exclusion, Target Group and Control Group-3416
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
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with DNC exclusion and calculate TG and CG from sheet "seedingRecurringBC" with "seedingWAPoffer"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    
    
    
    @NX-3556 @initBrowser @closeBrowser
    Scenario: Calculate Targets - Calculate Drill down-3556
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
    Then enter details for new broadcast and calculate TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    
    
    
    @NX-3412 @initBrowser @closeBrowser
    Scenario: Calculate Targets - Creating One-Off BC with DNC exclusion, Target Group and Control Group-3412
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
    Then enter details for new broadcast with DNC exclusion and calculate TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    
    
    
    
     @NX-7590 @initBrowser @closeBrowser
    Scenario: Verify Copy option for all type of one off BCs-7590
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
    Then copy bc 
    Then copy and create new broadcast from sheet "one-offBC"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    
    @NX-7460
   @initBrowser   @closeBrowser
   Scenario: Check whether creator can edit the BC
   Given login
   Then navigate to configuration management
   Then navigate to partners
   Then Save BC Settings as selected users
    ##For One off BC
    Then navigate to landing page
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
    Then save bc
    Then Search BC and Edit from "one-offBC"
    Then save bc
    
    @NX-7464
   @initBrowser   @closeBrowser
   Scenario: Check whether approvers and creator can edit the BC
   Given login
   Then navigate to configuration management
   Then navigate to partners
   Then Save BC Settings as selected users
    ##For One off BC
    Then navigate to landing page
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
    Then save bc
    #Then navigate to BC page
    Then Search BC and Edit from "one-offBC"
    Then save bc
    Then Then Search BC and give permission from "one-offBC" for user "rahul.chandran@flytxt.com"
    Then Logout from Neon application
    Given login with "rahul.chandran@flytxt.com" and "cT4AAbPzk3"
    #Then login with seleniumuser from sheet "seleniumuser"
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    #Then navigate to BC page
    Then Search BC and Edit from "one-offBC"
    Then save bc
       
     
    
    
    @NX-7589 @initBrowser @closeBrowser
    Scenario: Verify Pause option for all type of  one off BCs-7589
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
    Then enter details for new broadcast without target condition from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then pause bc 
    
    
    
    @NX-7591 @initBrowser @closeBrowser
    Scenario: d Trial option for all type of one off BCs-7591
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
    Then enter details for new broadcast without target condition from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify send trial option for bc 
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919717802050"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event
    
    @NX-7450
   @initBrowser @closeBrowser
   Scenario: Check edit BC screen
   Given login
   Then navigate to configuration management
   Then navigate to partners
   #Then navigate to partners Edit page
   Then BC Settings page validation
   
   
   
   @NX-4866 @initBrowser @closeBrowser
    Scenario: Verify BC level CG by targeting 10 Million subscribers -4866
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
    Then enter details for new broadcast with 1M subscribers and configure TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    Then verify delivering status for bc
    Then verify targeted count
   
    
    
    
    
    @NX-4871 @initBrowser @closeBrowser
    Scenario: Verify validating BC with 10 Million subscribers  -4871
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
    Then enter details for new broadcast with 1M subscribers and configure TG and CG from sheet "one-offBC" with "rechargeWAP"
    Then validate bc
    Then verify bc created from sheet "one-offBC"
    Then verify validating CG status for bc
    
    
    
    
    
     @NX-4868 @initBrowser @closeBrowser
    Scenario: Verify BC with Partner level CG targeting 10 Million subscribers  -4868
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then edit a partner
    Then navigate to control group settings page
    Then change partner control group settings
    Then navigate to landing page
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
    Then enter details for new broadcast with 1M subscribers and configure partner level CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    Then verify delivering status for bc
    Then verify targeted count for partner level CG
    
    
    
    
    
    
    @NX-7467
   @initBrowser   @closeBrowser
   Scenario: Check whether users given with edit permission have authority to give permission for other users
   Given login
   Then navigate to configuration management
   Then navigate to partners
   Then Save BC Settings as selected users
    ##For One off BC
    Then navigate to landing page
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
    Then save bc
    #Then navigate to BC page
    Then Search BC and Edit from "one-offBC"
    Then save bc
    Then Then Search BC and give permission from "one-offBC" for user "rahul.chandran@flytxt.com"
    Then Logout from Neon application
    Given login with "rahul.chandran@flytxt.com" and "cT4AAbPzk3"
    #Then login with seleniumuser from sheet "seleniumuser"
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    #Then navigate to BC page
    Then Search BC and check for permissions from "one-offBC"   
    
    @NX-8862 @initBrowser @closeBrowser
    Scenario:Verify BC targeting with Customer Profile Info category-8862
    Given login
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
    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeEmail" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeEmail"
    Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then verify targeted and sent count of "one-offBC"
    
    
    
    
    
     @NX-3568 @initBrowser @closeBrowser
    Scenario: Calculate Targets - Verifying partner level control group count  -3568
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then edit a partner
    Then navigate to control group settings page
    Then change partner control group settings
    Then navigate to landing page
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
    Then enter details for new broadcast and select any DNC exclusion list for partner level CG from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify bc created from sheet "one-offBC"
    Then wait until status of "one-offBC" is "Delivering"
    Then verify targeted count for partner level CG 
   
        @NX-9088 @initBrowser @closeBrowser
        @NX-7833
    Scenario: Verify IM events for all type of BC's  -9088
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition "IMEventsOfferAccepted" from sheet "one-offBC" with "rechargeEmail"
    Then save bc
    Then view broadcast from sheet "one-offBC"
    Then check target condition "IMEventsOfferAccepted"
    
    @NX-7833 @initBrowser @closeBrowser
    Scenario: Verify IM events for all type of BC's  -7833
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition "IMEventsOfferDeclined" from sheet "one-offBC" with "rechargeEmail"
    Then save bc
    Then view broadcast from sheet "one-offBC"
    Then check target condition "IMEventsOfferDeclined"
    
    @NX-7831 @initBrowser @closeBrowser
    Scenario: Verify IM events for all type of BC's  -7831
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition "IMEventsOfferRecommended" from sheet "one-offBC" with "rechargeEmail"
    Then save bc
    Then view broadcast from sheet "one-offBC"
    Then check target condition "IMEventsOfferRecommended"
    
    
    @NX-7830 @initBrowser @closeBrowser
    Scenario: Verify IM events for all type of BC's  -7830
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition "IMEventsCustomerCareUsage" from sheet "one-offBC" with "rechargeEmail"
    Then save bc
    Then view broadcast from sheet "one-offBC"
    Then check target condition "IMEventsCustomerCareUsage"
    
    @NX-5170 
     @initBrowser @closeBrowser
    Scenario: Verify whether send trial box is displayed after clicking on send trial button
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
    Then enter details for new broadcast without target condition from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    #Then navigate to BC page
    Then Search BC and Click on Sendtrial from "one-offBC"    
    
    @NX-6244
   @initBrowser @closeBrowser
   Scenario: CVerify Configuration management have the provision to set week days and weekend days NX-6244
   Given login
   Then navigate to configuration management
   Then navigate to partners
   Then verify weekdays and weekend settings
   Then pass next scenario based on this step

  @NX-6340 
  Scenario: Verify whether week settings option is displayed under partner settings NX-6340
    Then check previous step and pass this
    
    @NX-6326 @initBrowser @closeBrowser
Scenario: Verify the BCs in Delivering state when the parent bc is pause NX-6326
    Given login
    Then navigate to precision marketer
		Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "recurringMonthSpecialBC" with "rechargeWAP"
    Then activate bc
    Then wait for 1 minutes
    Then wait until status of child bc of "recurringMonthSpecialBC" is "Render Scheduled"
    
     @NX-6206 @initBrowser @closeBrowser
Scenario: verify whether it is possible to edit the Recurrence pattern NX-6206
    Given login
    Then navigate to precision marketer
		Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "campaignCategory"
		Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeWAP"
    Then activate bc
    Then navigate to "Recurring" broadcasts
    Then click edit option for bc from sheet "recurringMonthBC"
    Then enter edit recurrance pattern of "recurringMonthBC" with "recurringMonthSpecialBC"
    Then activate bc
    Then navigate to "Recurring" broadcasts
		Then view broadcast from sheet "recurringMonthBC"
		Then verify delivery details from "recurringMonthSpecialBC"
		
		@NX-6350 @initBrowser @closeBrowser
		Scenario: Verify whether it is possible to edit Type of day's field for activated BCs NX-6350
    Given login
    Then navigate to precision marketer
		Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "campaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeWAP"
    Then activate bc
    Then navigate to "Recurring" broadcasts
    Then click copy option for bc from sheet "recurringMonthBC"
    Then enter edit recurrance pattern of "recurringMonthBC" with "recurringMonthSpecialBC"
    Then activate bc
    Then navigate to "Recurring" broadcasts
		Then view broadcast from sheet "recurringMonthBC"
		Then verify delivery details from "recurringMonthSpecialBC"
		
		 @NX-8840 @initBrowser @closeBrowser
    Scenario: Verify IM events for all type of BC's  -8840
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition "customerLocationInsights" from sheet "one-offBC" with "rechargeEmail"
    Then save bc
    Then view broadcast from sheet "one-offBC"
    Then check target condition "customerLocationInsights"
    
     @NX-8870 @initBrowser @closeBrowser
    Scenario: Verify BC targeting with Customer Device  Info category -8870
    Given login
    Then navigate to precision marketer
     Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition "customerDeviceInfo" from sheet "one-offBC" with "rechargeEmail"
    Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then verify targeted and sent count of "one-offBC" with condition "customerDeviceInfo"
    
    @NX-8868 @NX-5195 @initBrowser @closeBrowser
    Scenario: Verify BC targeting with System Events categor,Verify whether new system event is displayed for trial messages -8868 
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to numbers "9446506807" "9446506808" "9446506809" from sheet "rechargeWAP" with product "fullDetails"
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
    Then enter details for new broadcast with condition "customerWasSentTheTrialMessage" from sheet "one-offBC" with "rechargeWap"
    Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then verify targeted and sent count of "one-offBC" with condition "customerWasSentTheTrialMessage"

     @NX-4936 @initBrowser @closeBrowser
    Scenario: LGS- Verify Preferred Language dropdown values  -4936
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then edit a partner
    Then navigate to broadcast settings page
    Then verify preferred language field in broadcast settings
    
     @NX-8856 @initBrowser @closeBrowser
    Scenario: Verify BC targeting with System Events categor,Verify whether new system event is displayed for trial messages -8868 
    Given login
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
    Then enter details for new broadcast with condition "digitalPersonaGT25" from sheet "one-offBC" with "rechargeWap"
    Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then verify targeted and sent count of "one-offBC" with condition "digitalPersonaGT25"
    
      
    @NX-2350 @NX-2347 @NX-2349 @NX-2348
    @initBrowser 
Scenario: Email Channel --> Verify the preview, delivery and presentation of Emails containing Call to Action Buttons.
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
    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeEmail" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeEmail"	
    Then verify create BC Notification
		Then activate bc
    Then verify bc created from sheet "one-offBC"
    Then wait until status of "one-offBC" is "Complete"
    Then verify email from sheet "one-offBC"
    
    
    @NX-2416
    @initBrowser  
Scenario: Verify creation of triggerable BC - Regression NX-7596
Given login
#Then navigate to precision marketer
 #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeEmail" offer to Offer Catalogue
     #Then navigate to landing page
    #Then navigate to configuration management
    #Then navigate to campaign categories
    #Then create new campaign category from sheet "CampaignCategory"
    #Then navigate to landing page
    #Then navigate to precision marketer
#Then navigate to life cycle marketing
    #Then navigate to campaign category from sheet "CampaignCategory"
#Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then enter details for new broadcast from sheet "triggerableBC" with "rechargeEmail"
#Then activate bc
#Then navigate to "Triggerable" broadcasts
#Then check if "Triggerable" bc status is "Active" from sheet "triggerableBC"
Then navigate to landing page
Then navigate to data foundation
Then Create a Streaming attribute



@NX-2415
@initBrowser
Scenario: Email Channel -->Verify the recurring BC using EMAIL channel.
Given login
Then navigate to precision marketer
 Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "rechargeEmail" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeEmail" offer to Offer Catalogue
     Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringMonthBC" with "rechargeEmail"
Then activate bc
Then navigate to "One-time" broadcasts
Then navigate to "Recurring" broadcasts
Then wait until status of "Recurring" is "Complete"

 Then verify email from sheet "one-offBC"




    @NX-2399 @initBrowser 
    Scenario: Verify Sending BC's through Normal SMS
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
    Then enter details for new broadcast without target condition from sheet "one-offBC" with "rechargeWAP"
    Then activate bc
    Then verify send trial option for bc 
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919717802050"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event

 @NX-8868 @NX-5195 @initBrowser @closeBrowser
    Scenario Outline: Verify BC targeting with System Events categor,Verify whether new system event is displayed for trial messages -8868 
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to numbers "9446506807" "9446506808" "9446506809" from sheet "rechargeWAP" with product "fullDetails"
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
    Then enter details for new broadcast with condition from sheet "one-offBC" with "rechargeWap"
    Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then verify targeted and sent count of "one-offBC" with condition "customerWasSentTheTrialMessage"
    Examples:
    |Condition|
    |customerWasSentTheTrialMessage|
    

     @NX-4936 @initBrowser @closeBrowser
    Scenario: LGS- Verify Preferred Language dropdown values  -4936
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then edit a partner
    Then navigate to broadcast settings page
    Then verify preferred language field in broadcast settings
    
    
    @NX-targetingCampaignCreation @initBrowser @closeBrowser
    Scenario: Verify BC targeting with System Events categor,Verify whether new system event is displayed for trial messages -8856 
    Given login
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
    
    
     @NX-8856 @initBrowser
    Scenario Outline: Verify BC targeting with System Events categor,Verify whether new system event is displayed for trial messages -8856 
    Given login
    Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition <Condition> from sheet "one-offBC" with "rechargeWap"
      Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then verify targeted and sent count of "one-offBC" with condition <Condition>
          Examples:
    |Condition|
    |digitalPersonaGT15|
    |customerDemographicsGT25|
    |learnedBehaviourGT35|
    |analyticalScoresGT45|
    |digitalEngagementGT235|
    |customerLocationInsightsGT5|

    
    @NX-4525 @initBrowser
    Scenario: Verify creating new reward type -4525 
    Given login
    Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then navigate to offer management 
#	  Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    #Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeWap"
      Then activate bc
    Then wait until status of "one-offBC" is "Complete"
    Then provide file for conversion