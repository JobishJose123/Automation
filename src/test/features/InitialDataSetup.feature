#Author: joel.jose@flytxt.com
#Keywords Summary : feature file to setup initial data
@InitialDataSetup
Feature: data setup

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

@NX-createDndList
@initBrowser @closeBrowser
Scenario: Calculate Targets - Creating DNC Exclusion list. 3482
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then enter details of DND list
Then save registration list
Then navigate to landing page

@NX-createDKJob
@initBrowser @closeBrowser
Scenario: create DK job for registration list upload and DNC list upload
Given login
#Then random registration list is generated
#Then random dnd list is generated
Then create dk jobs for list upload
#Then move list to dk input for upload