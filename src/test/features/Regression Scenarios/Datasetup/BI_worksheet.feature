#Author : kiran.joseph@flytxt.com
@BIworksheetfeature01
Feature: Business Intelligence

########################BI worksheetfeature feature ###########
@ndx-BIoutbound   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between_yesterday_and_tomorrow
Then create BI worksheet from sheet "BIworksheetoutbound" with time range "between_yesterday_and_tomorrow" 
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetoutbound"
Then wait until BI worksheet status is changed to "C"


@ndx-BIinbound   @initBrowser @closeBrowser
Scenario: create new worksheet for inbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between_yesterday_and_tomorrow
Then create BI worksheet from sheet "BIworksheetinbound" with time range "between_yesterday_and_tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetinbound"
Then wait until BI worksheet status is changed to "R"


@ndx-BIoffersproducts   @initBrowser @closeBrowser
Scenario: create new worksheet for offers and products.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between_yesterday_and_tomorrow
Then create BI worksheet from sheet "BIworksheetoffersproducts" with time range "between_yesterday_and_tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetoffersproducts"
Then wait until BI worksheet status is changed to "R"

@ndx-BIevents   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between_yesterday_and_tomorrow
Then create BI worksheet from sheet "BIworksheetEvents" with time range "between_yesterday_and_tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetEvents"
Then wait until BI worksheet status is changed to "R"




