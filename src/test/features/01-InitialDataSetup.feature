#Author: joel.jose@flytxt.com
#Keywords Summary : feature file to setup initial data
@InitialDataSetup
Feature: data setup

@NX-createCustomerCareTouchPoint
@initBrowser @closeBrowser
Scenario: create customer care touchpoint to be used in customerCare executive
		Given login
		Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to customer care
    Then create customer care touchpoint from sheet "CCTouchpoint"
    
@NX-createDKJob
@initBrowser @closeBrowser
Scenario: create DK job for registration list upload and DNC list upload
#Given login
#Then random registration list is generated
#Then random dnd list is generated
#Then create dk jobs for list upload
Then move list to dk input for upload

@NX-createRegList
@initBrowser @closeBrowser
Scenario: create registration list in dx ui
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of registration list
Then save registration list
Then navigate to landing page


@NX-createDiscoveredClustersList
@initBrowser @closeBrowser
Scenario: Calculate Targets - Creating DNC Exclusion list. 3482
Given login
Then navigate to data foundation
Then navigate to discovered clusters
Then click create new registration list button
Then enter details of discovered clusters list
Then save discovered clusters list
Then navigate to landing page

@NX-createCustomerDrivenEvents
@initBrowser @closeBrowser
Scenario: Create Customer Driven Event for upload
Given login
Then navigate to data foundation
Then navigate to customer driven events
Then click create new registration list button
Then enter details of customer driven event
Then save customer driven event
Then navigate to landing page

@NX-createUsageMetricField
@initBrowser @closeBrowser
Scenario: Create Customer Driven Event for upload
Given login
Then navigate to data foundation
Then navigate to usage metric
Then click create new registration list button
Then enter details of usage metric
Then save usage metric
Then navigate to landing page

@NX-createRevenueMetricField
@initBrowser @closeBrowser
Scenario: Create Customer Driven Event for upload
Given login
Then navigate to data foundation
Then navigate to revenue metric
Then click create new registration list button
Then enter details of revenue metric
Then save revenue metric
Then navigate to landing page

@NX-createEventCountField
@initBrowser @closeBrowser
Scenario: Create Customer Driven Event for upload
Given login
Then navigate to data foundation
Then navigate to event counts
Then click create new registration list button
Then enter details of event counts
Then save event counts
Then navigate to landing page


@NX-3482
@NX-createDndList
@initBrowser @closeBrowser
Scenario: Calculate Targets - Creating DNC Exclusion list. 3482
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of DND list
Then save DND list
Then navigate to landing page

@NX-3483
@NX-createMandatoryExclusionList
@initBrowser @closeBrowser
Scenario: Calculate Targets - Mandatory Exclusion list 3483
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of mandatoy DND list
Then save mandatory DND list
Then navigate to landing page

@NX-8842
@NX-createProfileField
@initBrowser
Scenario: generate randrom registration list and upload
Given login
Then navigate to data foundation
Then check and add profile fields

 @NX-createDefaultReward @initBrowser  @closeBrowser
    Scenario: Verify whether Reward attributes have searchable drop downs NX-7307
    Given login
    Then navigate to configuration management
    Then navigate to rewards
    Then create new reward type
    Then navigate to landing page
    
     @NX-createDefaultApiTouchpoint @initBrowser
  Scenario: create api touchpoint GA
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to api
    Then create api touchpoint from sheet "apiTouchpoint_default"
    Then check api touchpoint in grid "apiTouchpoint_default"
    Then add touchpoint "apiTouchpoint_default" to api_auth_policy
    
    @NX-createDefaultApiTouchpointUR @initBrowser
  Scenario: create api touchpoint UR
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to api
    Then create api touchpoint from sheet "apiTouchpointUR_default"
    Then check api touchpoint in grid "apiTouchpointUR_default"
    Then add touchpoint "apiTouchpointUR_default" to api_auth_policy
    
     @NX-createDefaultApiTouchpointGR @initBrowser
  Scenario: create api touchpoint GR
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to api
    Then create api touchpoint from sheet "apiTouchpointGR_default"
    Then check api touchpoint in grid "apiTouchpointGR_default"
    Then add touchpoint "apiTouchpointGR_default" to api_auth_policy
    
    
    @NX-createDefaultApiTouchpointUA @initBrowser
  Scenario: create api touchpoint UA
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to api
    Then create api touchpoint from sheet "apiTouchpointUA_default"
    Then check api touchpoint in grid "apiTouchpointUA_default"
    Then add touchpoint "apiTouchpointUA_default" to api_auth_policy
    
    ##need to craete ussd application in legacy first
  @NX-435 @initBrowser
  Scenario: Verify new USSD touchpoint creation
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to ussd
    Then create ussd touchpoint from sheet "ussdTouchpoint"
    Then check ussd touchpoint in grid "ussdTouchpoint"
    Then edit ussd touchpoint from sheet "ussdTouchpoint"
    Then delete ussd touchpoint from sheet "ussdTouchpoint"
    
     Then create ussd touchpoint from sheet "ussdTouchpoint"
    Then check ussd touchpoint in grid "ussdTouchpoint"
    Then pass next scenario based on this step

  ####Linked cases TP deleted after test
  @NX-8427
  Scenario: Verify USSD touchpoint edit functionality 8427
    Then check previous step and pass this
    Then pass next scenario based on this step
    
  @NX-2874
  Scenario: Verify whether Ussd application created in Legacy page is displayed in Neonx ui 2874
    Then check previous step and pass this
    
    
    @NX-createUssdTouchpoint @initBrowser
  Scenario: create ussd touchpoint
    Given login
    Then navigate to intent management
    Then navigate to touchpoints
    Then navigate to ussd
    Then create ussd touchpoint from sheet "ussdTouchpoint"
    Then check ussd touchpoint in grid "ussdTouchpoint"
    
      @precondition-Predefinied_targets @initBrowser
  Scenario: create saved segment as precondition
    Given login
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to configuration
    Then navigate to saved segments
    Then create saved segment with condition "segmentAgeGT40"
    
    @NX-createDefaultData 
@initBrowser 
Scenario: Create default data that is used everywhere
Given login
Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "default"
    Then navigate to landing page
    Then navigate to configuration management
    Then navigate to campaign categories
    Then create new campaign category from sheet "default"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "default"
    Then click create new product button
    Then create product with attributes from sheet "default"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "defaultrechargeWAP" with product "default"
    Then click on create new ofer button
    Then create new offer from sheet "defaultseedingWAPoffer" with product "default"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "default"
    Then Add "defaultrechargeWAP" offer to Offer Catalogue
    Then Add "defaultseedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "default"
    Then create new campaign from sheet "default" with catalog "default"
    Then naigate to "default" campaign view broadcasts