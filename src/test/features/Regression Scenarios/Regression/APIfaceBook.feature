#
##
#
#
#
#=================AMAL XAVIOUR===============================================
#
#                              |----------------------------------------------|
#                              |                                              |
#                              |  Run FaceBookAPI.feature file Before         |
#                              |----------------------------------------------|
#
#
   @FaceBookApi
Feature: For Verifying FaceBook conversion API and Custom Events , FaceBook B_C
  
  
    @NDX-19329    @listSelect     @initBrowser  @closeBrowser
 Scenario: For Selecting Customer Base List in Sync Events
 Given login 
 Then navigate to precision marketer
 Then navigate to configuration
 Then navigate to Digital Plus
 Then navigate to Facebook
 Then navigate to Sync Events
 Then select Customer list "selenium_list" from drop down
 
 
 
 
 @map @NDX-19343 @NDX-19330 @NDX-19333   @initBrowser @closeBrowser
 Scenario: For Mapping Neon-DX event with FaceBook Event In Sync Events
 Given login 
 Then navigate to precision marketer
 Then navigate to configuration
 Then navigate to Digital Plus
 Then navigate to Facebook
 Then navigate to Sync Events
 Then click on Add FaceBook Event
 Then select FaceBook Event "Add payment info" and config Event Details
 Then Map NEON-dX Events with "sel_Custom_Event" Custom Event
 
 
   @delete  @NDX-19332  @initBrowser @closeBrowser
 Scenario: verify Deleting a Set FaceBook Event
 Given login 
 Then navigate to precision marketer
 Then navigate to configuration
 Then navigate to Digital Plus
 Then navigate to Facebook
 Then navigate to Sync Events
 Then click on Add FaceBook Event
 Then select FaceBook Event "Add to cart" and config Event Details
 Then Map NEON-dX Events with "sel_Custom_Event" Custom Event
 Then wait for 4000 milliseconds
 Then delete "Add to cart" FaceBook Event
 
 
 
 
  @edit   @NDX-19331       @initBrowser @closeBrowser
 Scenario:  Verify editing a facebook event
 Given login 
 Then navigate to precision marketer
 Then navigate to configuration
 Then navigate to Digital Plus
 Then navigate to Facebook
 Then navigate to Sync Events
 Then click on Add FaceBook Event
 Then select FaceBook Event "Add to cart" and config Event Details
 Then Map NEON-dX Events with "sel_Custom_Event" Custom Event
 Then edit event "Add to cart" to "Add to wishlist"
 Then verify presence of "Add to wishlist" Event
 Then wait for 5000 milliseconds
 Then delete "Add to wishlist" FaceBook Event
 
 
 
 
 
 @deactivate  @NDX-19334    @NDX-19335    @initBrowser @closeBrowser
 Scenario: Verify Deactivating and Re-Activating Same Event
 Given login 
 Then navigate to precision marketer
 Then navigate to configuration
 Then navigate to Digital Plus
 Then navigate to Facebook
 Then navigate to Sync Events
 Then click on Add FaceBook Event
 Then select FaceBook Event "Add to wishlist" and config Event Details
 Then Map NEON-dX Events with "sel_Custom_Event" Custom Event
 Then deactivate Event "Add to wishlist" and Verify
 Then refresh
 Then Re-Activate Event "Add to wishlist" and Verify
 
 
 
  @verify  @NDX-19354    @initBrowser @closeBrowser
 Scenario: Verify Display of Mandatory attributesin Fb event page
 Given login 
 Then navigate to precision marketer
 Then navigate to configuration
 Then navigate to Digital Plus
 Then navigate to Facebook
 Then navigate to Sync Events
 Then click on Add FaceBook Event
 Then click on Add FaceBook Event
 Then verify Display of Mandatory attributes
 
 
 
 
 
 @fbv   @initBrowser  @closeBrowser
Scenario: Verification of FaceBook BC Activation status
Then Filter the Bc from sheet "FBbcAPIList" from row "1" and column "0" and write in sheet "one-offBC" 
Given login 
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategoryFb"
Then naigate to "FaceBookCampaign" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "one-offBC" for bctype "one-off"
Then click on BC edit button from workbook "bcInputData" sheet "one-offBC"
Then edit the Delevery tab details from workbook "bcInputData" sheet "one-offBC"
Then activate bc
Then wait until status of "one-offBC" is "Completed"
Then wait for 1 minutes
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750000"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "FaceBookCampaign"






  @BcDirect  @initBrowser @closeBrowser
Scenario Outline: Create FaceBook Broadcast and Direct Activation
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
Then activate bc 
# Verification part 
Then wait for 4000 milliseconds
Then wait until status of "one-offBC" is "Completed"
Then wait for 1 minutes
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750000"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "one-offBC" for the campaign from sheet "FaceBookCampaign"
Examples:
		|bcSheet|  offerSheet|i|
		|one-offBC|rechargeimageFacebook|1|
		 













