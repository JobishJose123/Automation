#Author : kiran.joseph@flytxt.com
@BIworksheetfeature01
Feature: Business Intelligence

########################BI worksheetfeature feature ###########
@ndx-BIoutbound @NDX-12375 @NDX-12376 @NDX-12377 @NDX-12378 @NDX-12379 @NDX-12380 @NDX-12435 @initBrowser 
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


@ndx-BIinbound @NDX-12382 @NDX-12383 @NDX-12384 @NDX-12385 @NDX-13027 @initBrowser  
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


@ndx-BIoffersproducts @NDX-12387 @NDX-12388 @NDX-12389 @NDX-12390 @initBrowser @closeBrowser
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

@ndx-BIevents @NDX-12402 @NDX-12403 @NDX-12404 @NDX-12405 @NDX-12406 @NDX-12410 @NDX-12411 @NDX-12412 @NDX-12413 @NDX-12414  @initBrowser @closeBrowser
Scenario: create new worksheet for Events.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIworksheetEvents" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetEvents"
Then wait until BI worksheet status is changed to "R"


@ndx-BIEandASheet @NDX-20894  @initBrowser @closeBrowser
Scenario: create new worksheet for E and A sheet.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIEandASheet" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIEandASheet"
Then wait until BI worksheet status is changed to "R"

@ndx-SeedingCandF @NDX-20901 @NDX-20839 @NDX-20835  @initBrowser @closeBrowser
Scenario: create new worksheet for seeding conversion and fulfilment.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BISeeding" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BISeeding"
Then wait until BI worksheet status is changed to "R"

@ndx-commoneventswithdiffscope @NDX-20834   @initBrowser @closeBrowser
Scenario: create new worksheet for common events.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIEventscope" with time range "between yesterday and tomorrow"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIEventscope"
Then wait until BI worksheet status is changed to "R"

@ndx-PMwithGroups @NDX-20888  @initBrowser @closeBrowser
Scenario: create new worksheet for PM groups.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIPMwithgroup" with time range "Last_Month_to_Date"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIPMwithgroup"
Then wait until BI worksheet status is changed to "R"

@ndx-camAttribute   @initBrowser 
Scenario: campaign attribute creation.
Given login
Then navigate to configuration management
Then navigate to campaign Attributes
Then create new campaign Attributes "c_attribute"

@ndx-bcAttribute   @initBrowser 
Scenario: BC attribute creation.
Given login
Then navigate to configuration management
Then navigate to broadcast Attributes
Then create new broadcast Attributes "b_attribute"



@ndx-PMderivedAttributes @NDX-21164  @initBrowser 
Scenario: create new worksheet for PM derived attributes.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIwithAttributes" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIwithAttributes"
Then wait until BI worksheet status is changed to "R"

@ndx-PMcustomersegment @NDX-21162  @initBrowser 
Scenario: create new worksheet for PM customer segment.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "BIwithCustSegment" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIwithCustSegment"
Then wait until BI worksheet status is changed to "R"

@ndx-NumAttrCustCalculation   @initBrowser 
Scenario: create new worksheet for Numeric attribute Custom calculation.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "NumAttrCustCalculation" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "NumAttrCustCalculation"
Then wait until BI worksheet status is changed to "R"

@ndx-EventDomainReport   @initBrowser 
Scenario: create new worksheet for Event Domain Report
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Time range: Yesterday, Last_week, Last_month, This_Month_to_Date, Last_Month_to_Date, between yesterday and tomorrow
Then create BI worksheet from sheet "EventDomainReport" with time range "Yesterday"
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "EventDomainReport"
Then wait until BI worksheet status is changed to "R"


