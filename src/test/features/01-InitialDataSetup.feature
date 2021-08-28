#Author: joel.jose@flytxt.com
#Keywords Summary : feature file to setup initial data
@NDX-InitialDataSetup
Feature: data setup
    
#@NX-createDKJob
#@initBrowser @closeBrowser
#Scenario: create DK job for registration list upload and DNC list upload
#Given login
#Then random registration list is generated
#Then random dnd list is generated
#Then create dk jobs for list upload
#Then move list to dk input for upload

#@NX-createRegList
#@initBrowser @closeBrowser
#Scenario: create registration list in dx ui
#Given login
#Then navigate to data foundation
#Then navigate to registration list
#Then click create new registration list button
#Then enter details of registration list
#Then save registration list
#Then navigate to landing page


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
    
  
@precondition-Predefinied_targets @initBrowser
Scenario: create saved segment as precondition
Given login
Then navigate to landing page
Then navigate to precision marketer
Then navigate to configuration
Then navigate to saved segments
Then create saved segment with condition "segmentAgeGT40"
    
    @SavedsegmentsEdit @initBrowser
   Scenario: create saved segment as precondition
   Given login
   Then navigate to landing page
   Then navigate to precision marketer
   Then navigate to configuration
   Then navigate to saved segments
   Then create saved segment with condition "EditSavedsegment"
    

    
     @NDX-CreateNewTrackSource @initBrowser
    Scenario: create the track source
    Given login
    Then navigate to data foundation
    Then navigate to fulfillment configuration
    Then navigate to tracking data sources
    Then create new tracking source with name "A_track_Sel"
    
    @NDX-CreateFrequency @initBrowser
    Scenario Outline: create frequency
    Given login
    Then navigate to configuration management
    Then create new frequency rule "<frequency>"
    Examples: 
    |frequency|
    |default|
    |onePerDay|
    
    
   @NDX-CreateBlackout @initBrowser
    Scenario Outline: create blackout 
    Given login
    Then navigate to configuration management
    Then create new blackout rule "<blackout>"
     Examples: 
  |blackout|
  |default|
  |specificTime|
  |blackout_manual|
    
    
    @NDX-CreateInventory @initBrowser 
    Scenario Outline: create inventory 
   Given login
    Then navigate to configuration management
    Then create new inventory "<inventory>"
    Examples: 
    |frequency|blackout|inventory|
    |default|default|default|
    |default|default|unlimited|
    |onePerDay|dafault|onePerDay|
    |dafault|specificTime|specificTime|
    |default|blackout_manual|inventory_manual|
    
    @NDX-CreateReward @initBrowser
    Scenario Outline: create reward
    Given login
    Then navigate to configuration management
    Then create new reward "<reward>"
     Examples: 
    |reward|
    |selenium_reward|
    |sel_reward|
    
    @ProfileUploadThroughDK @NDX-10317  @initBrowser
    Scenario: Upload profile field data through dk
    Given login 
    Then create a dk job "selProfileUpload" to upload the profile fields
    Then navigate to landing page
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then filter the job "selProfileUpload" and activate it
    Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "selenium_list_profile.csv"
    
    @MetricEventUploadThroughDK  @NDX-10316 @NDX-10318 @initBrowser
    Scenario: Upload metric and event through dk
    Given login 
    Then create a dk job "selMetricEventUpload" to upload the metric and event fields
    Then navigate to landing page
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then filter the job "selMetricEventUpload" and activate it
    Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "selenium_list _metric_event.csv"
    
   #  make sure that selenium_list_date.csv have the nearest date
@DateUploadThroughDK  @initBrowser
Scenario: Upload date field through dk
Given login 
Then create a dk job "selDateUpload" to upload the date fields
Then navigate to landing page
Then navigate to data foundation
Then click Data Fusion Engine
Then filter the job "selDateUpload" and activate it
Then provide file in location "/usr/local/flytxt/seleniumTrigger" for trigger with csv file "selenium_list_date.csv"


#//////   real time rte for falcon tp ////

@NDX-realTimeRTE @initBrowser
Scenario: create a streaming attribute with real time rte
Given login
Then navigate to data foundation
Then navigate to streaming attributes
Then create a streaming attribute from sheet "rteService" with route "Real Time RTE Service"
Then navigate to landing page
Then navigate to precision marketer
Then navigate to configuration
Then select triggers in configuration
Then create new trigger "sel_rteTrigger" with streaming attribute from sheet "rteService"



@NDX-realTimeReacharge @initBrowser
Scenario: create a streaming attribute with real time rte
Given login
Then navigate to data foundation
Then navigate to streaming attributes
Then create a streaming attribute from sheet "RechargeTrackingService" with route "Real Time Recharge Tracking Service"



    
#@NX-createDefaultData 
#@initBrowser 
#Scenario: Create default data that is used everywhere
#Given login
#Then navigate to configuration management
#    Then naviagte to product classes
#    Then create product class and number attribute from "default"
#    Then navigate to landing page
#    Then navigate to configuration management
#    Then navigate to campaign categories
#    Then create new campaign category from sheet "default"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to products
#    Then navigate to product class "default"
#    Then click create new product button
#    Then create product with attributes from sheet "default"
#    Then navigate to landing page
#    Then navigate to precision marketer
#    Then navigate to offer management
#    Then navigate to offers
#    Then click on create new ofer button
#    Then create new offer from sheet "defaultrechargeWAP" with product "default"
#    Then click on create new ofer button
#    Then create new offer from sheet "defaultseedingWAPoffer" with product "default"
#    Then navigate to offer management 
#	Then Navigate to Offer Catalogue
#    Then Create New Offer Catalogue from sheet "default"
#    Then Add "defaultrechargeWAP" offer to Offer Catalogue
#    Then Add "defaultseedingWAPoffer" offer to Offer Catalogue
#    Then navigate to life cycle marketing
#    Then navigate to campaign category from sheet "default"
#    Then create new campaign from sheet "default" with catalog "default"
#    Then naigate to "default" campaign view broadcasts