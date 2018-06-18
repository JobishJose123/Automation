#Author: joel.jose@flytxt.com
#Keywords Summary : generic product class test cases
@NX-ProductClass
Feature: generic product class

@NX-6319
@initBrowser
Scenario: Verify by creating new Approval Rule
Given login
Then navigate to precision marketer
Then navigate to configuration
Then click approval rules option
Then create new approval rule from sheet "approvalRule"