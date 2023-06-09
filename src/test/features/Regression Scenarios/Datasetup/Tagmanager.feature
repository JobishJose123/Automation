#Author : kiran.joseph@flytxt.com
#Total scenarios: 4
@Tagmanagerrun
Feature: Tag Manager

######################## Tag Manager ###########

@ndx-tagmanager1   @initBrowser
Scenario: Generation of account key.
Given login
#Then click random
Then navigate to precision marketer
Then navigate to configuration
Then navigate to digital plus module
Then navigate to tag manager
Then Generate the Account key
Then copy the Account key to sheet "tagmanager"

@ndx-tagmanager2   @initBrowser
Scenario: Generation of account key.
Given login
#Then click random
Then navigate to precision marketer
Then navigate to configuration
Then navigate to digital plus module
Then navigate to tag manager
Then configure application domains from sheet "tagmanager"



@NX-createDKJobfortagmanager
@initBrowser
 Scenario: DK --> Creation of tagmanager job
    Given login
    Then navigate to data foundation
    Then navigate to connector => data connector => view connection in Digital plus tags
    Then create tagmanager job from sheet "tagmanagerjob"
    Then check the DK job creation from sheet "tagmanagerjob" with data "6869" with key "linestringextraction" with filename "stimulate.txt"

    
