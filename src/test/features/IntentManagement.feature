#Author: joel.jose@flytxt.com
#Keywords Summary :

@NX-IM_Feature

Feature: positive flow of im program creation

@NX-426
@initBrowser @closeBrowser
Scenario: Verify the new touchpoint landing page
Given login
Then navigate to intent management
Then navigate to touchpoints
Then check touchpoint landing page

@NX-428
@initBrowser @closeBrowser
Scenario: Verify Create New Touchpoint button behaviour for SMS TP
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to sms
Then click create new touchpoint
Then verify sms touchpoint creation form

@NX-430
@initBrowser @closeBrowser
Scenario: Verify new SMS touchpoint creation
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to sms
Then create sms touchpoint from sheet "smsTouchpoint"
Then check sms touchpoint in grid "smsTouchpoint"

@NX-431
@initBrowser @closeBrowser
Scenario: Verify new Trigger touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then create trigger touchpoint from sheet "triggerTouchpoint"
Then check trigger touchpoint in grid "triggerTouchpoint"

@NX-433
@initBrowser @closeBrowser
Scenario: Verify new Customer Care touchpoint creation
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to customer care
Then create customer care touchpoint from sheet "CCTouchpoint"
Then check customer care touchpoint in grid "CCTouchpoint"

@NX-434
@initBrowser @closeBrowser
Scenario: Verify new API touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpoint"
Then check api touchpoint in grid "apiTouchpoint"


##need to craete ussd application in legacy first
@NX-435
@initBrowser @closeBrowser
Scenario: Verify new USSD touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to ussd
Then create ussd touchpoint from sheet "ussdTouchpoint"
Then check ussd touchpoint in grid "ussdTouchpoint"

@NX-436
@initBrowser @closeBrowser
Scenario: Verify Cancel button functionality for SMS TP
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to sms
Then verify cancel button of sms touchpoint

@NX-437
@initBrowser @closeBrowser
Scenario: Verify Cancel button functionality for trigger TP
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then verify cancel button of trigger touchpoint

@NX-445
@initBrowser @closeBrowser
Scenario: Verify Trigger touchpoint delete functionality
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then verify delete trigger touchpoint

@NX-450 @closeBrowser
@initBrowser 
Scenario: Field level validation check while creating new Trigger TP
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to trigger
Then check mandatory fields for trigger touchpoint

@NX-709
@initBrowser 
Scenario: Verify the new program landing page
Given login
Then navigate to intent management
Then navigate to programs
Then verify program landing page

@NX-710
@initBrowser @closeBrowser
Scenario: Verify Create New Program button behaviour
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"

@NX-712
@initBrowser @closeBrowser
Scenario: Verify Proceed button functionality for Details tabs
Given login
Then navigate to intent management
Then navigate to programs
Then verify program proceed button functionality for details tab

@NX-713
@initBrowser @closeBrowser
Scenario: Verify cancel button functionality for Details tabs
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify program cancel button functionality for details tab

@NX-714
@initBrowser @closeBrowser
Scenario: Verify Choose Catalog field values
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify program choose catalog field values

@NX-716
@initBrowser @closeBrowser
Scenario: Verify field level validation for Details tabs
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify program field validation for details tab

@NX-724
@initBrowser @closeBrowser
Scenario: Verify touchpoint tab functionality
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify program touchpoint tab

@NX-725
@initBrowser @closeBrowser
Scenario: Verify New touchpoint addition on Touchpoint tab
Given login
Then navigate to intent management
Then navigate to programs
Then verify program touchpoint addition

@NX-3313
@initBrowser @closeBrowser
Scenario: Verify Editing the program in Intent management
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then click on edit button of programs


@NX-1236
@initBrowser @closeBrowser
Scenario: Verify creating a new the program in Intent management
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page "programdetails"

@NX-752
@initBrowser @closeBrowser
Scenario: Verify duplicate TP entry on touchpoint tab
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then Verify duplicate TP entry on touchpoint tab

@NX-753
@initBrowser @closeBrowser
Scenario: Verify Proceed button functionality for Touchpoint tabs
Given login
Then navigate to intent management
Then navigate to programs
Then Verify Proceed button functionality for Touchpoint tabs "programdetails"

@NX-754
@initBrowser @closeBrowser
Scenario: Verify cancel button functionality for Touchpoint tabs
Given login
Then navigate to intent management
Then navigate to programs
Then Verify cancel button functionality for Touchpoint tabs "programdetails"

@NX-1173
@initBrowser @closeBrowser
Scenario: Create Program Schedule Verify Start Now option.
Given login
Then navigate to intent management
Then navigate to programs
Then Create Program Schedule Verify Start Now option "programdetails"

@NX-1201
@initBrowser @closeBrowser
Scenario: verify Create New Programs Details Cancel button.
Given login
Then navigate to intent management
Then navigate to programs
Then check details cancel button in programs "programdetails"
@NX-1193
@initBrowser @closeBrowser
Scenario: verify Create New Programs Schedule Refresh At option.
Given login
Then navigate to intent management
Then navigate to programs
Then check details schedule Serve on Specific Days "programdetails"
@NX-1243
@initBrowser @closeBrowser
Scenario: verify Create New Programs delete option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then verify delete a program "programdetails"
@NX-733
@initBrowser @closeBrowser
Scenario: Verify duplicate TP entry on touchpoint tab
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then Verify delete TP entry on touchpoint tab

@NX-4817
@initBrowser @closeBrowser
Scenario: Verify editing the option from All Days to Specific Days
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then edit details schedule Serve on Specific Days "programdetails"

@NX-4818
@initBrowser @closeBrowser
Scenario: Verify editing the option from All Days to Specific Days
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then edit details from specific days to all days "programdetails"
@NX-4815
@initBrowser @closeBrowser
Scenario: verify create program page with refreshon daily serve on Specific days
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then verify create program page with refreshon daily serve on Specific days "programdetails"
@NX-1204
@initBrowser @closeBrowser
Scenario: verify create program page filters
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then verify filter for programs "programdetails"

@NX-1186 
@initBrowser @closeBrowser
Scenario: verify create program page Serve On All days option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page Serve On All days option "programdetails"

@NX-1183
@initBrowser @closeBrowser
Scenario: verify create program page refresh at option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page Refresh at option "programdetails"

@NX-1233
@initBrowser @closeBrowser
Scenario: verify create program page Edit options.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page "programdetails"
Then create program page verify edit option "programdetails"

@NX-1191
@initBrowser @closeBrowser
Scenario: verify create program page Serve On Specific days option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page Serve On Specific days option "programdetails"

@NX-1200
@initBrowser @closeBrowser
Scenario: verify create program page timezone change option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page timezone change option "programdetails"

@NX-1199
@initBrowser @closeBrowser
Scenario: verify create program page timezone option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page timezone option "programdetails"

@NX-1178
@initBrowser @closeBrowser
Scenario: verify create program page Refreshcycle option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify create program page refreshcycle option "programdetails"

@NX-1230
@initBrowser @closeBrowser
Scenario: create program Verify More Actions.
Given login
Then navigate to intent management
Then navigate to programs
Then create program Verify More Actions "programdetails"

@NX-1165
@initBrowser @closeBrowser
Scenario: create program Verify Start At option.
Given login
Then navigate to intent management
Then navigate to programs
Then verify Start At option "programdetails"

@NX-1576
@initBrowser @closeBrowser
Scenario: Verify edit API touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpoint"
Then edit api touchpoint from sheet "apiTouchpoint"

@NX-1580
@initBrowser @closeBrowser
Scenario: Verify delete API touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpoint"
Then delete api touchpoint from sheet "apiTouchpoint"
@NX-1572
@initBrowser 
Scenario: Verify edit sms touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then create sms touchpoint from sheet "smsTouchpoint"
Then edit sms touchpoint from sheet "smsTouchpoint"
@NX-3315 @initBrowser 
  Scenario: Verify Selecting the 'AT'option in the rules tab- 3315
    Given login
    #Then navigate to configuration management
    #Then naviagte to product classes
    #Then create product class and number attribute from "TestProductClass"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to products
    #Then navigate to product class "TestProductClass"
    #Then click create new product button
    #Then create product with attributes from sheet "fullDetails"
    #Then navigate to landing page
    #Then navigate to precision marketer
    #Then navigate to offer management
    #Then navigate to offers
    #Then click on create new ofer button
    #Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    #Then navigate to offer management 
    #Then Navigate to Offer Catalogue
    #Then Create New Offer Catalogue from sheet "defaultCatalog"
    #Then Add "rechargeWAP" offer to Offer Catalogue
    #Then navigate to landing page
    #Then navigate to intent management
    #Then navigate to programs
    #Then click create program button
    #Then verify create program page "programdetails" and offer catalog sheet "defaultCatalog"
    #Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "programdetails"
    Then verify tracking field while create new rule from sheet "fullDetails"
    
  @NX-2083
  @initBrowser 
  Scenario: Verify Cross site scripting in Customer care touch point edit page-2083
  Given login
  Then navigate to intent management
  Then navigate to touchpoints
  Then navigate to customer care
  Then click customer care edit touchpoint
  Then edit touchpoint with alert value
  
  
  
  @NX-2079
  @initBrowser 
  Scenario: Verify Cross site scripting for create new touch point-2079
  Given login
  Then navigate to intent management
  Then navigate to touchpoints
  Then navigate to customer care
	Then click create new touchpoint
	Then create new touchpoint with alert value
	
	
	
@NX-1578
@initBrowser 
Scenario: Verify delete sms touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then create sms touchpoint from sheet "smsTouchpoint"
Then delete sms touchpoint from sheet "smsTouchpoint"
  

  
  
  
  @NX-1579
  @initBrowser 
  Scenario: Verify Customer Care touchpoint delete functionality-1579
  Given login
  Then navigate to intent management
  Then navigate to touchpoints
  Then navigate to customer care
	Then click create new touchpoint
	Then create new customer care touchpoint and delete
  
@NX-1575
  @initBrowser 
  Scenario: Verify Customer Care touchpoint edit functionality-1575
  Given login
  Then navigate to intent management
  Then navigate to touchpoints
  Then navigate to customer care
  Then click customer care edit touchpoint
  Then edit customer care touchpoint

@NX-1570 
@initBrowser 
Scenario: Verify validation API touchpoint  creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint from sheet "apiTouchpoint"
Then edit api touchpoint validation check from sheet "apiTouchpoint"


@NX-2080
@initBrowser @closeBrowser
Scenario: Verify Cross site scripting for Create program Page under Intenet Management-2080
Given login
Then navigate to intent management
Then navigate to programs
Then click create program button
Then verify create program page with alert value

 @NX-2077
  @initBrowser
  Scenario: Verify Cross site scripting for filtering Catalogues Under Intent Management-2077
  Given login
	When navigate to precision marketer
	Then navigate to offer management 
	Then Navigate to Offer Catalogue
	Then filter catlog with alert value


@NX-1568
@initBrowser 
Scenario: Verify edit validation sms touchpoint creation 
Given login
Then navigate to intent management
Then navigate to touchpoints
Then create sms touchpoint from sheet "smsTouchpoint"
Then edit sms touchpoint validation check from sheet "smsTouchpoint"


@NX-1566
@initBrowser 
Scenario: Verify validation API touchpoint
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create api touchpoint validation check from sheet "apiTouchpoint"