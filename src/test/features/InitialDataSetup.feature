#Author: joel.jose@flytxt.com
#Keywords Summary : feature file to setup initial data
@InitialDataSetup
Feature: data setup

@NX-createDKJob
@initBrowser @closeBrowser
Scenario: create DK job for registration list upload and DNC list upload
Given login
#Then random registration list is generated
#Then random dnd list is generated
Then create dk jobs for list upload
Then move list to dk input for upload

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