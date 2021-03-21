#Author: kiran.joseph
#Keywords Summary : covers functionality of tag manager
@IMFunctRegression
Feature: TagManager functionality regression

@NX-triggertagmanager
@initBrowser
 Scenario: Feeding input to tag manager job.
 Given login to tag manager implemented website
 Then trigger the website configured in google tag manager
 
 @NX-triggertag
@initBrowser
 Scenario: Feeding input to tag manager job.
 Given login
 Then navigate to configuration management
 Then navigate to System Administration
  Then navigate to IP Access Control
 Then copy default tagmanager authkey and verify input hit api server for "911000400061" from sheet "tagmanager"

@tagmanageruploadverify @initBrowser @closeBrowser 
Scenario: verify the data upload of tagmanager job
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
#wait for the data to get uploaded.
#Then wait for 10 minutes
Then search msisdn "911000400061"
Then verify the data successfully uploaded

