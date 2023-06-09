#Author: shobina.k@flytxt.com
#Total scenario:4
Feature: digital plus regression
@NDX-digitalPlusRegression
@NDX-16913 @initBrowser @closeBrowser
Scenario Outline: Verify http_xml connector
Given login
Then filter the bc from sheet "DigitalPlus" from row "<i>" and column "0" and write in sheet "<bcSheet>"
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "<bcSheet>" for bctype "onetime"
Then wait until status of "<bcSheet>" from file "bcInputData" is "Completed" for bctype "recurring" 
Then verify the ack count with target condition customerAddressPM from sheet "targetConditionCount" for bc from sheet "<bcSheet>" of bctype "recurring"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750750"
Then click on events tab
Then verify the condition Acknowledged event for the bc from sheet "<bcSheet>" for the campaign from sheet "campaignBC"
Examples: 
|bcSheet|i|
|recurrBCDaily|1|
|recurrBCDaily|2|
|recurrBCDaily|3|


@NDX-16920 @initBrowser @closeBrowser
Scenario: Verify whether NACK event is getting persisted for BCs with HTTP connector route when the selected offer is of  email channel
Given login
Then filter the bc from sheet "DigitalPlus" from row "4" and column "0" and write in sheet "recurrBCDaily"
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then filter the bc from file "bcInputData" of sheet "recurrBCDaily" for bctype "onetime"
Then wait until status of "recurrBCDaily" from file "bcInputData" is "Completed" for bctype "recurring" 
Then verify the ack count with target condition customerAddressPM from sheet "targetConditionCount" for bc from sheet "recurrBCDaily" of bctype "recurring"
Then navigate to reports
Then navigate to customer profile
Then search msisdn "919491750750"
Then click on events tab
Then verify the condition Negative Acknowledged event for the bc from sheet "recurrBCDaily" for the campaign from sheet "campaignBC"