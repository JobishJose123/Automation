#
#   AMAL XAVIOUR        
###############################################################################################################
#
#     Must  RUN 01_Poduct.feature file Before 
####################################################################################################################
#
#
     @Data-setupFB   @NDX-18462
Feature: FaceBookConversionAPI Testing


@initBrowser  @offerCatalogFB @closeBrowser
Scenario: Creating OfferCatalog for FaceBook BroadcastBC API
Given login
Then navigate to precision marketer
Then navigate to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "FaceBookCatalog"
Then navigate to landing page



@initBrowser @fbOffer @closeBrowser
Scenario Outline:: creating FaceBookOffer 
Given login 
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then create new offer from sheet "<offerSheet>" with product "fullDetails"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to offer management 
Then Navigate to Offer Catalogue 
Then adding existing offers from sheet "<offerSheet>" Offer Catalogue from sheet "FaceBookCatalog"
Examples:
|offerSheet|
|rechargeimageFacebook|




@initBrowser @campaign @closeBrowser
Scenario: Creating Facebook Campaign Category and Campaign
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create new campaign category from sheet "campaignCategoryFb"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategoryFb"
Then create new campaign from sheet "FaceBookCampaign" with catalog "FaceBookCatalog"


    @fbbc  @initBrowser @closeBrowser
Scenario Outline: Create FaceBook Broadcast with FaceBook offers
Given login 
Then navigate to precision marketer 
Then wait for 1 minutes
Then navigate to life cycle marketing 
Then navigate to campaign category from sheet "campaignCategoryFb" 
Then naigate to "FaceBookCampaign" campaign view broadcasts 
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "both"
Then enter choose offer tab from sheet "<offerSheet>" for bc from sheet "<bcSheet>" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then input Deliver Tab with end "none" renderTime "real time" Broadcast expiry "none" from Bc in sheet"<bcSheet>"
Then save bc 
Then wait for 4000 milliseconds
Then Add Bc from Sheet "<bcSheet>" to column "<i>" of BC List Storage Sheet "FBbcAPIList"

Examples:
		|bcSheet|  offerSheet|i|
		|one-offBC|rechargeimageFacebook|1|
		
		
		


  @customEvent  @initBrowser @closeBrowser
Scenario: Create Custom event for FaceBook conversion API
Given login
Then navigate to data foundation
Then navigate to customer driven events
Then click create new registration list button
Then Enter details of Custom Event
Then save FaceBook Custom Event
Then click on custom event Name "sel_Custom_Event"
Then click on Create new Domain Field
Then create value with label "value"
Then navigate to landing page
Then navigate to configuration management
Then navigate to partners
Then select "sel_customEvent" event fromRelevant Events


