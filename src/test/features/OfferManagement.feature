#Author: madhan.kumar@flytxt.com
@NX-OfferTestCases
Feature: Test suite on Offer creation
  I want to check all test cases related to offer page

  @NX-1349 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with SMS channel NX-1349
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to prepaid telecom
    Then click create new product button
    Then create single product from sheet "singleProductPage"
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage"
    Then verify "rechargeSMS" offer in grid

  @NX-1351 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-1351
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeVoicePush" with product "singleProductPage"
    Then verify "rechargeVoicePush" offer in grid
    Then pass next scenario based on this step

  @NX-1344
  Scenario: Create offer:Track: Verify clicking on the create offer without adding any response NX-1344
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-828
  Scenario: Create offer:Offers Display: Verify the Add option for creating a new offer. NX-828
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-833
  Scenario: Create offer:Details: Verify the product search using product name NX-833
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-886
  Scenario: Create offer: Creative: Verify selecting the language from the Language dropdown. NX-886
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-895 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify the proceed button. NX-895
    Then check previous step and pass this

  @NX-1353 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Wap Push channel NX-1353
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "singleProductPage"
    Then verify "rechargeWAP" offer in grid
    Then pass next scenario based on this step

  @NX-896
  Scenario: Create offer: Track : Verify selecting source for tracking rule. NX-896
    Then check previous step and pass this

  @NX-1346 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Balance-Deduction offers NX-1346
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "balanceDeductionWAP" with product "singleProductPage"
    Then verify "balanceDeductionWAP" offer in grid

  @NX-6175 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Combo-Offer offers NX-6175
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "comboOfferWAP" with product "singleProductPage"
    Then verify "comboOfferWAP" offer in grid

  @NX-6177 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Informational offers NX-6177
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "informationalWAP" with product "singleProductPage"
    Then verify "informationalWAP" offer in grid

   
  @NX-1345 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Seeding offers NX-1345
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "seedingWAPoffer" with product "singleProductPage"
    Then verify "seedingWAPoffer" offer in grid



  @NX-1347 @initBrowser
  Scenario: Create offer:Track: Verify creating Usage Based offers NX-1347
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then verify "usageBasedWAP" offer in grid

  @NX-1376 @initBrowser @closeBrowser
  Scenario: Offer Management-->Create new offer-->Cancel button NX-1376
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then check offer cancel button

  @NX-2180 @initBrowser @closeBrowser
  Scenario: Offer Management : Verify for the Offers Help icon NX-2180
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then check offer help icon

  @NX-885 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify the proceed button without entering details NX-885
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then Check_details_tab_without_entering_details

  @NX-6214 @initBrowser @closeBrowser
  Scenario: Offer-Creation: Verify filtering based on product name inside product tab NX-6214
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage"

  @NX-3036 @initBrowser @closeBrowser
  Scenario: Verify Clicking on the Remove Icon in the products tab-3036
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "usageBasedWAP" with product "singleProductPage"
    Then filter offer from sheet "usageBasedWAP"
    Then edit offer
    Then remove product for offer from sheet "usageBasedWAP"

  @NX-2179 @initBrowser @closeBrowser
  Scenario: Offer Management: Verify for the Products Help icon-2179
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then check product help icon

  @NX-3041 @initBrowser @closeBrowser
  Scenario: Verify the Add button displayed in Track tab-3041
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer up to track tab from sheet "usageBasedWAP" with product "singleProductPage"
    Then verify add button in track tab

  @NX-3038 @initBrowser @closeBrowser
  Scenario: Verify for the Set as Default checkbox in Creative tab-3038
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer up to creative tab from sheet "usageBasedWAP" with product "singleProductPage"
    Then verify add button in creative tab

  @NX-1386 @initBrowser @closeBrowser
  Scenario: Offer Management:Multilingual functionality in creative tab-1386
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer up to creative tab and choose all languages from sheet "usageBasedWAP" with product "singleProductPage"

  @initBrowser @closeBrowser @NX-2101
  Scenario: Verify SQL injection in Filtering Offers
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify sql injection in offer

  @initBrowser @closeBrowser @NX-2065
  Scenario: Checking cross site scripting in creation of new offer under CLV Max
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cross site scrpting in new offer

  @initBrowser @closeBrowser @NX-1375
  Scenario: Offer Management-->Create new offer-->Details tab
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify tab colours
    Then pass next scenario based on this step

  @NX-883
  Scenario: Create offer:Products: Verify the color of the completed tab after navigating to the new tab NX-883
    Then check previous step and pass this

  @NX-3487 @initBrowser @closeBrowser
  Scenario: Verify the additional optional fields in offer with voice push as the channel-3487
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer and verify optional fields from sheet "rechargeVoicePush" with product "singleProductPage"

  @initBrowser @closeBrowser @NX-1373
  Scenario: Offer Management-->Create new offer-->Products tab
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify checkbox of product selection

  @initBrowser @closeBrowser @NX-1330
  Scenario: Create offer:Creative: Verify checking multiple checkbox for defaullt message
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify checkbox default creative creative

  @initBrowser @closeBrowser @NX-1340
  Scenario: Create offer:Track: Verify the validations for the success and failure response box
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then validate success and failure message

  @initBrowser @closeBrowser @NX-1338
  Scenario: Create offer:Track: Verify the response available for all the creatives added
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify response messages of creatives added

  @initBrowser @closeBrowser @NX-829
  Scenario: Create offer:Offers Display: Verify the label and alignment of the offers window.
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify label of offer

  @NX-816 @initBrowser @closeBrowser
  Scenario: Create offer:Offers Display: Verify the Duplicate options of the offer NX-816
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeVoicePush" with product "singleProductPage"
    Then duplicate offer "rechargeVoicePush"

  @NX-831 @initBrowser @closeBrowser
  Scenario: Create offer:Details: Verify that user is not be able to navigate to product tab withoutadding the mandatory details. NX-831
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify navigation to product field without mandatory fields

  @NX-830 @initBrowser @closeBrowser
  Scenario: Create offer:Details: Verify the length of the offer name and description of the create new offer "Details" NX-830
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify length of name and description for offer creation

  @NX-846 @initBrowser @closeBrowser
  Scenario: Create offer: Products :Verify by clicking on the cancel option in the product search result NX-846
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cancel button in product search of offer

  @NX-852 @initBrowser @closeBrowser
  Scenario: Create offer:Products: Verify clicking on the add button in the selected product display screen NX-852
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify adding product after adding one

  @NX-880 @initBrowser @closeBrowser
  Scenario: Create offer:Products: Verify the previous selection is not getting deleted after adding the new product NX-880
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify adding product after adding one

  @NX-882 @initBrowser @closeBrowser
  Scenario: Create offer:Products: Verify clicking on the proceed button NX-882
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify proceed button after adding product

  @NX-884 @initBrowser @closeBrowser
  Scenario: Create offer:Products: Verify clicking on the proceed button NX-884
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify creative  tab colours

  @NX-889 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify clicking on the add button in the creative tab.. NX-889
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify adding dynamic variable in creative tab

  @NX-890 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify the details displayed for the variables added. NX-890
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify map variable list headers

  @NX-891 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify the length of title and details field. NX-891
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify length of creative title and details

  @NX-892 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify adding special characters in Title and Details field NX-892
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify special characters of creative title and details

  @NX-898 @initBrowser
  Scenario: Create offer: Track : Verify Adding the Source condition by clicking on Add button NX-898
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify adding rule to tracking source
    Then pass next scenario based on this step

  @NX-902
  Scenario: Create offer: Track : Verify adding multiple condition for a rule name NX-902
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-899
  Scenario: Create offer: Track : Verify the PopUp screen for adding rule NX-899
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-905
  Scenario: Create offer: Track : Verify saving the added tracking rule NX-905
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-908
  Scenario: Create offer: Track : Verify the Track tab details after saving the Tracking rule NX-908
    Then check previous step and pass this

  @NX-903
  Scenario: Create offer: Track : Verify the validations for Rule name and value textbox in Add Tracking Rule window NX-903
    Then verify validation of rule name

  @NX-930 @closeBrowser
  Scenario: Create offer: Track : Verify deleting the added tracking rule. NX-930
    Then verify deleting added tracking rule

  @NX-906 @initBrowser
  Scenario: Create offer: Track : Verify cancelling the added tracking rule. NX-906
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cancelling tracking rule

  @NX-909 
  Scenario: Create offer: Track : Verify adding multiple rules for the same track source. NX-909
    Then verify adding multiple tracking rule
    
    @NX-910 @initBrowser @closeBrowser
  Scenario: Create offer: Track : Verify adding multiple rules with same priority NX-910
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify adding multiple rules with same priority
    
    @NX-929 @initBrowser
  Scenario: Create offer: Track : Verify editing the added rule in Track tab NX-929
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify editing added rule in track tab

    @NX-933 
  Scenario: Create offer: Track : Verify the maximum priority set for the tracking rule NX-933
    Then verify maximum priority for tracking rule
    
     @NX-904 @closeBrowser
  Scenario: Create offer: Track : Verify deleting the added tracking rule. NX-904
    Then verify deleting added tracking rule condition
    
    @NX-932 @initBrowser
  Scenario: Create offer: Track : Verify adding multiple Track source. NX-932
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify adding multiple track source
    Then pass next scenario based on this step

  @NX-931 @closeBrowser
  Scenario: Create offer: Track : Verify deleting the added Tracking source. NX-931
    Then check previous step and pass this
    
    @NX-946 @initBrowser
  Scenario: Create offer: Creative: Verify cancelling the added dynamic variable NX-946
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cancelling added variable
    Then pass next scenario based on this step

  @NX-948 
  Scenario: Create offer: Creative: Verify adding new dynamic tag variable with consumer profile source NX-948
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-951 
  Scenario: Create offer: Creative: Verify saving the newly added dynamic variable NX-951
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-957
  Scenario: Create offer: Creative: Verify the newly added dynamic variable in a select variable option. NX-957
    Then check previous step and pass this
    
    @NX-947
  Scenario: Create offer: Creative: Verify the label message after selecting the variables. NX-947
    Then verify label message after variable selection
    
    @NX-935 
  Scenario: Create offer: Creative: Verify adding multiple variables for the dynamic tag NX-935
    Then verify adding multiple dynamic variables
    
    @NX-936 
  Scenario: Create offer: Creative: Verify editing the added dynamic variable from Select a Variable option NX-936
    Then verify editing added variable
    
    @NX-944
  Scenario: Create offer: Creative: Verify deleting the added dynamic variable from Select a Variable option NX-944
    Then verify deleting added variable
    Then pass next scenario based on this step

  @NX-945 @closeBrowser
  Scenario: Create offer: Creative: Verify save option after selecting the dynamic variable NX-945
    Then check previous step and pass this
    
    @NX-955 @initBrowser @closeBrowser
  Scenario: Create offer: Creative: Verify cancelling the newly added dynamic variable NX-955
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cancelling newly added variable
    
     @NX-2073 @initBrowser @closeBrowser
  Scenario: Verify cross site scripting for Filtering offers Under CLV Max NX-2073
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cross site scripting for filtering offers
    
    @NX-1343 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify the default response box for the creatives added in creative tab NX-1343
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify response box for creatives
    
    @NX-1336 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify the set as default checkbox by adding multiple rules NX-1336
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify set as default checkbox with multiple track sources
    
    @NX-1333 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify setting multiple default rule NX-1333
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify selecting set as default check box for multiple track sources

    @NX-2993 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-2993
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "informationalWAP" with product "singleProductPage"
     Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then Create New Offer Catalogue from sheet "defaultCatalog"
  Then Add "informationalWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "informationalBC" with "informationalWAP"
    
    
    #@NX-4513 @initBrowser 
    #Scenario: create alertff
    #Given login
    #Then create alert
    
    
    @NX-7307 @initBrowser 
    Scenario: Verify whether Reward attributes have searchable drop downs
    Given login
    Then navigate to configuration management
    Then navigate to rewards
    Then create new reward type
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to prepaid telecom
    Then click create new product button
    Then create single product from sheet "singleProductPage"
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeSMS" with product "singleProductPage" and verify rewards dropdown field
    
     @NX-4513 @initBrowser 
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-4513
    Given login
    Then navigate to configuration management
    Then navigate to rewards
    Then create new reward type
    Then verify created reward type
    @NX-4513
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-4513
    Then edit reward parameter
    @NX-4513
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-4513
    Then delete reward parameter
    @NX-4513
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-4513
    Then edit created reward type
    @NX-4513 @closeBrowser
  Scenario: Create offer:Track: Verify creating offers with Voice Push channel NX-4513
    Then delete created reward type
    
     @NX-2328 @initBrowser
    Scenario: Email Channel --> Verify the Creative Tab in Create Offers while creating Email Based Offers. NX-2328
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeEmail" with product "singleProductPage"
    Then navigate to offer management 
	Then Navigate to Offer Catalogue
  Then click view offers of "defaultCatalog" in options
  Then Add "rechargeEmail" offer to Offer Catalogue
    Then pass next scenario based on this step

  @NX-2329
  @initBrowser
  Scenario: Verify for the Add Variable icon in the Creative tab NX-2329
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-2330
 
  Scenario: Email Channel --> Verify the Subject Field in Creative Tab while Creating Email based Offers. NX-2330
    Then check previous step and pass this
    
    @NX-2419 @initBrowser
  Scenario: Email Channel -->Verify the Create offer using Email as a channel. NX-2419 
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeEmail" with product "singleProductPage"
    Then pass next scenario based on this step

 @NX-2403 
    Scenario: Email Channel --> Verify the Subject Field in Creative Tab while Creating Email based Offers. NX-2330
	  Then edit offer from sheet "rechargeEmail"
	  
    @NX-2421
  Scenario: Email Channel -->Verify the Duplicate options of the offers using Email as a channel. NX-2421
    Then duplicate offer from sheet "rechargeEmail"
  
	  @NX-2422
  Scenario: Email Channel -->Verify the Verify the "Delete" option from the Options icon using Email as a channel. NX-2422
	   Then delete offer from sheet "rechargeEmail"
	   
	   
	   
	   
	  @NX-2411 @initBrowser
  Scenario: Email Channel -->Verify the Duplicate options of the offers  NX-2411
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeEmail" with product "singleProductPage"
    Then duplicate offer from sheet "rechargeEmail"
	   
	   
	   
	   @NX-2406
	   @initBrowser
	     Scenario: Email Channel -->Verify the Verify the Delete option 
	     Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeEmail" with product "singleProductPage"
    Then delete offer from sheet "rechargeEmail"
    
    
    
     @NX-2425
 @initBrowser
  Scenario: Create offer: Creative: Verify deleting the added dynamic variable NX-946
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify delete added variable
    
    
      @NX-1348 @initBrowser
  Scenario: Create offer:Track: Verify creating Recharge offers 
         Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then verify recharge offer from sheet "rechargeWAP"
   

    @NX-6176 @initBrowser
  Scenario: Create offer:Track: Verify creating STV offers 
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "STVWAP" with product "fullDetails"
    Then verify "STVWAP" offer in grid
    
    
    @NX-2409
     @initBrowser
  Scenario: Email Channel -->Verify the Map Variable and used variables icons
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then Verify the Map Variable and used variables icons
    Then verify label message after variable selection
    
    @NX-5173 @initBrowser @closeBrowser
  Scenario: STC-->Verify functionality of Cancel button  present in send trial pop-up NX-5173
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify cancel button in send trial pop up from sheet "STVWAP" with product "fullDetails"
    
        @NX-5173_test @initBrowser 
  Scenario: STC-->Verify functionality of Cancel button  present in send trial pop-up NX-5173
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to number from sheet "STVWAP" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506809"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event
    
    @NX-5284 @initBrowser 
     Scenario: STC--> Verify send trial creative for both valid and invalid msisdn
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to invalidnumber from sheet "STVWAP" with product "fullDetails"
    Then navigate to landing page
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to number from sheet "STVWAP" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506809"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event
    #verification for second number
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506807"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event
    
    @NX-5169 @initBrowser 
     Scenario: STC--> verify whether send trial option is available against each creative
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    #Then verify send trail to number from sheet "rechargeSMS" with product "fullDetails"
    Then verify send trail to number with multiple creative from sheet "rechargeSMS" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506809"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506807"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    Then verify trial message event
    
    @NX-5176 @initBrowser 
     Scenario: STC--> Verify whether new system event displayed for the trial message
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to ONE number from sheet "rechargeSMS" with product "fullDetails" and number "919446506807"
    #Then verify send trail to number with multiple creative from sheet "rechargeSMS" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506807"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    #Then verify trial message event
    Then verify trial message event details from sheet "rechargeSMS"
    
    @NX-5161 @initBrowser
    Scenario: STC--> Verify the functionality of send trial for Short Text type offers
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to ONE number from sheet "rechargeSMS" with product "fullDetails" and number "919446506807"
    #Then verify send trail to number with multiple creative from sheet "rechargeSMS" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506807"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    #Then verify trial message event
    Then verify trial message event details from sheet "rechargeSMS"
    
    @NX-5177_test @initBrowser
    Scenario: STC--> Verify whether dynamic tags are working properly
    Given login
    When navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then verify send trail to ONE number with dynamic tag from sheet "rechargeSMS" with product "fullDetails" and number "919446506807"
    #Then verify send trail to number with multiple creative from sheet "rechargeSMS" with product "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer profile
    Then enter customer number for send trial verification "919446506807"
    Then click on search button
    Then click on events tab
    Then choose all events
    Then click on apply button
    #Then verify trial message event
    Then verify trial message event details with dynamic from sheet "rechargeSMS"
    
    
    