#Author: joel.jose@flytxt.com
#Keywords Summary : generic product class test cases
@NX-ProductClass
Feature: generic product class

  @NX-7038 @initBrowser @closeBrowser
  Scenario: Verify whether product details are listed in the offer grid NX-7038
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
    Then create product without any attributes from sheet "fullDetails"
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then check product details in offer grid
    Then pass next scenario based on this step

  @NX-7033 
  Scenario: Verify whether all attributes of product will be shown in the product details section of Offer list NX-7033
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-7118 @initBrowser
  Scenario: Verify creation of product in a product class without any attributes NX-7118
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
    Then create product without any attributes from sheet "fullDetails"

  @NX-6967 @closeBrowser
  Scenario: Verify the deactivating the products NX-6967
    Then deactivate product from sheet "fullDetails"
    Then navigate to offer management
    Then navigate to offers
    Then verify deactivated product from sheet "fullDetails" in offer creation
    Then pass next scenario based on this step

  @NX-6969
  Scenario: Verify whether offers can be created with inactive products NX-6969
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-7066
  Scenario: Verify whether deactivated product is available for selection while offer creation NX-7066
    Then check previous step and pass this

  @NX-6968 @initBrowser @closeBrowser
  Scenario: Verify the activating the products
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then activate product from sheet "fullDetails"
    Then navigate to offer management
    Then navigate to offers
    Then verify activated product from sheet "fullDetails" in offer creation

  @NX-6973 @initBrowser 
  Scenario: Verify creation of product class
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and add attributes from "TestProductClass"
    Then pass next scenario based on this step

  @NX-7116
  Scenario: Verify selecting Allow multiple option in the product class page NX-7116
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-7111
  Scenario: Verify selecting the mandatory option in the attribute page NX-7111
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-7108
  Scenario: verify whether add sub attribute option is available for the attribute with type combo NX-7108
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-7107
  Scenario: Verify addition of sub attribute to the combo type NX-7107
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-7187
  Scenario: Verify  type field with Combo type NX-7187
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-6988
  Scenario: Verify whether attributes option is available on the context menu NX-6988
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-6990
  Scenario: Verify whether add attributes button is available or not NX-6990
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-6993
  Scenario: Verify the add attribute page NX-6993
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-6971
  Scenario: Verify whether product class module is available NX-6971
    Then check previous step and pass this

  @NX-6980 @initBrowser
  Scenario: Verify the Name field(200 characters)
  Given login
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then verify name field character limit

  @NX-6987
  Scenario: Verify the Description filed(200 characters)
    Then verify description field character limit

  @NX-6974
  Scenario: Veriy creation of products inside a product class NX6974
    Then create selClass product from sheet "fullDetails"
    Then pass next scenario based on this step

  @NX-7055
  Scenario: Verify whether product can be added when clicked on the add button in the product listing page NX-7055
    Then check previous step and pass this

  @NX-6979 @initBrowser @closeBrowser
  Scenario: Verify whether products are listed when clicked on the view products NX6979
    Then veirfy SelClass product "fullDetails" in grid

  @NX-6995 @initBrowser 
  Scenario: Verify  whether type field accept number NX-6995
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then verify SelClass number field

  @NX-6998
  Scenario: Verify  whether type field accept number NX-6998
    Then verify SelClass text field

  @NX-6999
  Scenario: Verify type field with single select NX-6999
    Then verify SelClass single select field

  @NX-7012 @closeBrowser
  Scenario: verify type field with multi select NX-7012
    Then verify SelClass multi select field

  @NX-7042 @initBrowser
  Scenario: Verify the duplicate option  for the product class NX-7042
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then duplicate "TestProductClass"

  @NX-7048
  Scenario: Verify deactivating the product class NX-7048
    Then verify deactivating product class "TestProductClass"
    Then pass next scenario based on this step

  @NX-7032
  Scenario: Verify whether hexagon showing active/inactive status is added  NX-7032
    Then check previous step and pass this

  @NX-7046
  Scenario: Verify activating the product class NX-7046
    Then verify activating product class "TestProductClass"

  @NX-7051
  Scenario: Verify the duplicate option  for attributes NX-7051
    Then verify duplicating attribute of "TestProductClass"

  @NX-7049
  Scenario: Verify edit option for attributes NX-7049
    Then verify edit attribute

  @NX-7053
  Scenario: Verify delete option for attributes NX-7053
    Then verify delete attribute

  @NX-7040
  Scenario: Verify the edit option for the product class NX-7040
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then verify edit product class of "TestProductClass"

  @NX-7044 @closeBrowser
  Scenario: Verify delete option for the product class NX-7044
    Then delete duplicate of "TestProductClass"

  @NX-7017 @initBrowser 
  Scenario: Verify the product listing page NX-7017
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then verify product listing page

  @NX-7019
  Scenario: Verify whether the product listing page shows the name and description NX-7019
  Then click create new product button
    Then create selClass product from sheet "fullDetails"
    Then verify name and description "fullDetails"

  @NX-7020
  Scenario: Verif whether product list show the details of the user who created / edited the products  NX-7020
    Then verify details of user who created / edited

  @NX-7028
  Scenario: Verify whether created and modified timestamps are displayed in the product listing page  NX-7028
    Then verify timestamps in product grid

  @NX-7031 
  Scenario: Verify whether details of the products are shown when clicked on the row  NX-7031
    Then verify SelClass product details in grid
    Then pass next scenario based on this step

  @NX-7109 @closeBrowser
  Scenario: Verify the attribute label is displayed when the  product is expanded NX-7109
    Then check previous step and pass this

  @NX-7015 @NX-7014 @initBrowser @closeBrowser
  Scenario: Verify deletion of attributes from the product class
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then delete attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then check attribute while editing a product
    Then check attribute while creating a product
    
    
    @NX-7016 @initBrowser 
    Scenario: Verify whether default value is asked when new attributes are added after some products are already created
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then verify attribute created from sheet "num"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then create number attribute from "TestProductClass"
    Then verify attribute created from sheet "num"
    

  @NX-7085 @initBrowser 
  Scenario: Verify copying the BC after the product is deactivated- 7085
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
    Then click on options and view broadcast
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "one-offBC" with "rechargeWAP"
    Then click on create button
    Then click on activate button
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then deactivate the product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then click on options and view broadcast
    

  @NX-7068 @initBrowser @closeBrowser
  Scenario: Verify whether deactivated product is available for selection while program creation- 7068
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
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
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then deactivate the product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page with deactivated product "programdetails" and offer catalog sheet "defaultCatalog"
    
    @NX-7072 @initBrowser 
  Scenario: Verify editing the program after the product is deactivated- 7072
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
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
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then deactivate the product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "programdetails"
    Then verify create new rule with deactivated product from sheet "fullDetails"
    
    
    @NX-7036 @initBrowser 
    Scenario: Verify whether product class can be shared across partners- 7036
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to configuration management
    Then naviagte to product classes
    Then choose product class and share from "TestProductClass"
    Then choose a partner and share
    Then navigate to configuration management
    Then naviagte to product classes
    Then verify product class is displayed is available in the sheet "TestProductClass"
    
    

  @NX-6966 @initBrowser 
  Scenario: Verify whether products are partner specific- 6966
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then Change partner
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class after changing partner "TestProductClass"

  @NX-6970 @initBrowser @closeBrowser
  Scenario: Verify whether offers with inactive products can be promoted or not- 6970
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then deactivate the product with attributes from sheet "fullDetails"
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer using deactivated product from sheet "rechargeWAP"

  @NX-6177 @initBrowser @closeBrowser
  Scenario: Create offer:Track: Verify creating Informational offers- 6177
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "CampaignCategory"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "informationalWAP" with product "fullDetails"
    
     @NX-7059 @initBrowser
  Scenario: Verify activating the one off BC after the deactivating the product - 7059
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
	 Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
 	Then navigate to offer management
	Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "informationalWAP" with product "fullDetails"
	Then navigate to offer management 
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "informationalWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast from sheet "InformationalOne-offBC" with "informationalWAP"
    Then save bc
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then deactivate product from sheet "fullDetails"
    Then navigate to life cycle marketing
	Then navigate to campaign category from sheet "campaignCategory"
	Then naigate to "campaignBC" campaign view broadcasts
    Then activate saved "One-Time" bc from sheet "InformationalOne-offBC"
    Then verify failure in activating bc

    
     @NX-7034 @initBrowser 
  Scenario: Verify whether all the details are shown  as in the offer list page on clicking the offer row in the BC Offer selection page - 7034
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
 		Then navigate to offer management
		Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "informationalWAP" with product "fullDetails"
		Then navigate to offer management 
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "informationalWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
    Then verify offer details in create broadcast using offer "informationalWAP" and product "fullDetails"
