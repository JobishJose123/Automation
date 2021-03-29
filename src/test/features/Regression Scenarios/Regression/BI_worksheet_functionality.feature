#Author : kiran.joseph@flytxt.com
@BIworksheetfunctfeature01
Feature: Business Intelligence functionality

########################BI worksheetfeature feature ###########
@ndx-BIoutboundverify   @initBrowser @closeBrowser
Scenario: create new worksheet for outbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetoutbound"
Then click on the BI sheet "BIworksheetoutbound".
Then filter broadcast from "one-offBC" sheet
Then verify the Acknowledgement count is equal to "1000"
Then navigate to analytics
Then navigate to Business Intelligence
Then deactivate the BIsheet from "BIworksheetoutbound"


@ndx-BIinboundboundverify   @initBrowser @closeBrowser
Scenario: create new worksheet for inbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetinbound"
Then click on the BI sheet "BIworksheetinbound".
Then filter program rule from "APIprogram" sheet
Then verify the Offer elligible count is equal to "1000"
Then navigate to analytics
Then navigate to Business Intelligence
Then deactivate the BIsheet from "BIworksheetinbound"


@ndx-BIoffersproductsverify   @initBrowser @closeBrowser
Scenario: create new worksheet for offers and product.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetoffersproducts"
Then click on the BI sheet "BIworksheetoffersproducts".
Then filter offer name from "rechargeSMS" sheet
Then verify the ack count is equal to "1000"
Then navigate to analytics
Then navigate to Business Intelligence
Then deactivate the BIsheet from "BIworksheetoffersproducts"

@ndx-BIeventsverify   @initBrowser @closeBrowser
Scenario: create new worksheet for events.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetEvents"
Then click on the BI sheet "BIworksheetEvents".
Then filter broadcast from "one-offBC" sheet
Then verify the Ack_count is equal to "1000"
Then navigate to analytics
Then navigate to Business Intelligence
Then deactivate the BIsheet from "BIworksheetEvents"