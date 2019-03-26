#Author:shobina.k@flytxt.com
#Feature:Before executing this feature make sure to execute @IntentManagement.feature, @BroadcastManagement.feature
@NDX-Report
Feature: Broadcast Report Verfication (Regression)    
              
@NDX-6809 @initBrowser @closeBrowser
Scenario: Verify the conversion % and fulfillment % for Broadcasts (Regression)
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to broadcast reports
Then filter broadcast from sheet "one-offBC"
Then verify acknowledged conversion and fulfillment % are "100 %","100 %" and "100 %"
