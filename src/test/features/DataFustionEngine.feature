#Author: rahul.chandran@flytxt.com
#Keywords Summary : DK Test cases
@NX-DK
Feature: DK

#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@NX-4468
@initBrowser
Scenario: DK--->Verify the functionality of Delete option
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create a DK Job from sheet "Jobinput" and verify "2" in ouput

  