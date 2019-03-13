#Author:shobina.k@flytxt.com
#Feature:Before executing this feature make sure to execute @IntentManagement.feature, @BroadcastManagement.feature

@NDX-Report
Feature: Program and Broadcast Report Verfication (Regression)                  
#
#@NDX-6966 @initBrowser
#Scenario: Verify metric update in Data Health Check by creating a Data QC job
#Given login
#Then navigate to data foundation
#Then navigate to Supports
#Then navigate to Data QC job
#Then enter the job name from sheet  "DataQCJob" and activate
#Then navigate to reports
#The navigate to data health check


@NDX-6966  @initBrowser @closeBrowser
Scenario: Verfiy the conversion % and fulfillment % for programs (Regression)
Given login
Then navigate to intent management
Then navigate to reports
Then navigate to program reports
Then filter program from sheet "SMSprogram"
Then verify the impression value is "2" 
Then verify whether the conversion and fulfillment % are "100 %" and "100 %"


@NDX-6809 @initBrowser @closeBrowser
Scenario: Verify the conversion % and fulfillment % for Broadcasts (Regression)
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to broadcast reports
Then filter broadcast from sheet "one-offBC"
Then verify acknowledged conversion and fulfillment % are "100 %","100 %" and "100 %"


@NDX-6876  @initBrowser @closeBrowser
Scenario Outline: Verify the profile field with <Name> uploaded in customer profile in customer info tab (Regression)
Given login
Then navigate to precision marketer
Then navigate to reports
Then click customer profile and enter the msisdn "919491750000"
Then verify the profile values for <Name>

Examples:

|Name|
|"DEMOGRAPHICS_FIELD"|
|"SITE_ID_PROFILE_FIELD"|
|"BALANCE_PROFILE_FIELD"|
|"DIGITAL_PERSONA_FIELD"|
|"SEL_COUNTRY"|

@NDX-7347 @initBrowser @closeBrowser
Scenario: Verify the event uploaded in customer profile in event tab (Regression)
Given login
Then navigate to precision marketer
Then navigate to reports
Then click customer profile and enter the msisdn "919491750000"
Then click event tab
Then verify the event displayed


@NDX-7351 @initBrowser @closeBrowser
Scenario: Verify the mertic uploaded in customer profile in metrics tab (Regression)
Given login
Then navigate to precision marketer
Then navigate to reports
Then click customer profile and enter the msisdn "919491750000"
Then click metric tab
Then verify the metric data






