#Author:shobina.k@flytxt.com
#Feature:Before executing this feature make sure to execute @IntentManagement.feature, @BroadcastManagement.feature

@NDX-Report
Feature: Program and Broadcast Report Verfication                   
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


@NDX-6966  @initBrowser
Scenario: Verfiy the conversion % and fulfillment % for programs
Given login
Then navigate to intent management
Then navigate to reports
Then navigate to program reports
Then filter program from sheet "SMSprogram"
Then verify the impression value is "2" 
Then verify whether the conversion and fulfillment % are "100 %" and "100 %"


@NDX-6809 @initBrowser
Scenario: Verify the conversion % and fulfillment % for Broadcasts
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to broadcast reports
Then filter broadcast from sheet "one-offBC"
Then verify acknowledged conversion and fulfillment % are "100 %","100 %" and "100 %"


