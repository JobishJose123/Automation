#Author: your.email@your.domain.com
#Keywords Summary :
@NX-BroadcastFunctionalityMigration
Feature: For broadcast functionality check for Migration cases


# Verify calculate Option for Migration BCs*******************

@NDX-10075 @initBrowser
Scenario: Verify calculate option for  migrated one off BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "one-offBC"


@NDX-10077 @initBrowser
Scenario: Verify calculate option for  migrated triggerable one off BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "TriggerOneoff"

@NDX-10081 @initBrowser
Scenario: Verify calculate option for  migrated triggerable recurring BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "TriggerReccurringBC"

@NDX-10079 @initBrowser
Scenario: Verify calculate option for  migrated recurring BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "recurringBC"

@NDX-10076 @initBrowser
Scenario: Verify calculate option for  migrated seeding one off BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingoneoff"

@NDX-10080 @initBrowser
Scenario: Verify calculate option for  migrated seeding recurring BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingRecurringBC"

@NDX-10078 @initBrowser
Scenario: Verify calculate option for  migrated seeding triggerable one off BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingTriggerableBC"

@NDX-10082 @initBrowser
Scenario: Verify calculate option for  migrated seeding triggerabel recurring BC
Given login 
Then navigate to precision marketer 
Then Verify calculate option for BCs from workbook "parallelRunBC" in sheet "CalculateOptionForBC" with BC "seedingTriggerableRecurringBC"

#*********************** Braodcast Limits****************************

@NDX-10093 @initBrowser
   Scenario: Verify limit for migrated BC's
   Given login
   Then navigate to precision marketer
   Then verify the inventory "Unlimited" after completion of BCs from workbook "parallelRunBC" and sheet "parallelRunBC"

