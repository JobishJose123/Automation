#Author : kiran.joseph@flytxt.com
@BIworksheetfeature01
Feature: Business Intelligence

########################BI worksheetfeature feature ###########
@ndx-BIoutbound   @initBrowser 
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIworksheetoutbound" with time range "Yesterday" 
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetoutbound"
Then wait until BI worksheet status is changed to "R"


@ndx-BIinbound   @initBrowser  
Scenario: create new worksheet for inbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIworksheetinbound" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetinbound"
Then wait until BI worksheet status is changed to "R"


@ndx-BIoffersproducts   @initBrowser @closeBrowser
Scenario: create new worksheet for offers and products.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIworksheetoffersproducts" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetoffersproducts"
Then wait until BI worksheet status is changed to "R"

@ndx-BIevents   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIworksheetEvents" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetEvents"
Then wait until BI worksheet status is changed to "R"


@ndx-BIEandASheet   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIEandASheet" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIEandASheet"
Then wait until BI worksheet status is changed to "R"

@ndx-SeedingCandF   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BISeeding" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BISeeding"
Then wait until BI worksheet status is changed to "R"

@ndx-commoneventswithdiffscope   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIEventscope" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIEventscope"
Then wait until BI worksheet status is changed to "R"

@ndx-PMwithGroups   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIPMwithgroup" with time range "Last_Month_to_Date"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIPMwithgroup"
Then wait until BI worksheet status is changed to "R"

#@ndx-camAttribute   @initBrowser 
#Scenario: create new worksheet for outbound.
#Given login
#Then navigate to configuration management
#Then navigate to campaign Attributes
#Then create new campaign Attributes "c_attribute"
#
#@ndx-bcAttribute   @initBrowser 
#Scenario: create new worksheet for outbound.
#Given login
#Then navigate to configuration management
#Then navigate to broadcast Attributes
#Then create new broadcast Attributes "b_attribute"



@ndx-PMderivedAttributes   @initBrowser 
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIwithAttributes" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIwithAttributes"
Then wait until BI worksheet status is changed to "R"

@ndx-PMcustomersegment   @initBrowser 
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIwithCustSegment" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIwithCustSegment"
Then wait until BI worksheet status is changed to "R"


