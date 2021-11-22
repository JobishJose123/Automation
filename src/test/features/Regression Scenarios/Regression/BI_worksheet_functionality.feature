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
Then verify "BIworksheetoutbound" worksheet 
#Then filter broadcast from "one-offBC" sheet
#Then verify the Acknowledgement count is equal to "1000"
#Then navigate to analytics
#Then navigate to Business Intelligence
#Then deactivate the BIsheet from "BIworksheetoutbound"


@ndx-BIinboundboundverify   @initBrowser @closeBrowser
Scenario: create new worksheet for inbound.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetinbound"
Then click on the BI sheet "BIworksheetinbound".
Then verify "BIworksheetinbound" worksheet 
#Then filter program rule from "APIprogram" sheet
#Then verify the Offer elligible count is equal to "1000"
#Then navigate to analytics
#Then navigate to Business Intelligence
#Then deactivate the BIsheet from "BIworksheetinbound"


@ndx-BIoffersproductsverify   @initBrowser @closeBrowser
Scenario: create new worksheet for offers and product.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetoffersproducts"
Then click on the BI sheet "BIworksheetoffersproducts".
Then verify "BIworksheetoffersproducts" worksheet 
#Then filter offer name from "rechargeSMS" sheet
#Then verify the ack count is equal to "1000"
#Then navigate to analytics
#Then navigate to Business Intelligence
#Then deactivate the BIsheet from "BIworksheetoffersproducts"

@ndx-BIeventsverify   @initBrowser @closeBrowser
Scenario: create new worksheet for events.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIworksheetEvents"
Then click on the BI sheet "BIworksheetEvents".
Then verify "BIworksheetEvents" worksheet 
#Then filter broadcast from "one-offBC" sheet
#Then verify the Ack_count is equal to "1000"
#Then navigate to analytics
#Then navigate to Business Intelligence
#Then deactivate the BIsheet from "BIworksheetEvents"

@ndx-BIEandASheetverify   @initBrowser @closeBrowser
Scenario: create new worksheet for E and A sheet.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIEandASheet"
Then click on the BI sheet "BIEandASheet".
Then verify "BIEandASheet" worksheet 

@ndx-SeedingCandFverify   @initBrowser @closeBrowser
Scenario: create new worksheet for seeding conversion and fulfilment.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BISeeding"
Then click on the BI sheet "BISeeding".
Then verify "BISeeding" worksheet

@ndx-commoneventscopeverify   @initBrowser @closeBrowser
Scenario: create new worksheet for common events.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIEventscope"
Then click on the BI sheet "BIEventscope".
Then verify "BIEventscope" worksheet

@ndx-PMwithGroupsverify   @initBrowser @closeBrowser
Scenario: create new worksheet for PM groups.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIPMwithgroup"
Then click on the BI sheet "BIPMwithgroup".
Then verify "BIPMwithgroup" worksheet

@ndx-PMderivedAttributesverify   @initBrowser @closeBrowser
Scenario: create new worksheet for PM derived attributes.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIwithAttributes"
Then click on the BI sheet "BIwithAttributes".
Then verify "BIwithAttributes" worksheet

@ndx-PMcustomersegmentverify   @initBrowser @closeBrowser
Scenario: create new worksheet for PM customer segment.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "BIwithCustSegment"
Then click on the BI sheet "BIwithCustSegment".
Then verify "BIwithCustSegment" worksheet

@ndx-NumAttrCustCalculationverify   @initBrowser @closeBrowser
Scenario: create new worksheet for Numeric attribute Custom calculation.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "NumAttrCustCalculation"
Then click on the BI sheet "NumAttrCustCalculation".
Then verify "NumAttrCustCalculation" worksheet

@ndx-EventDomainReportverify   @initBrowser @closeBrowser
Scenario: create new worksheet for event domain reports.
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter BI worksheet from sheet "EventDomainReport"
Then click on the BI sheet "EventDomainReport".
Then verify "EventDomainReport" worksheet

#####################################################################################################################################################
 
  @AckVerifyBI    @initBrowser
Scenario: Verify Ack Bc in BI worksheet
Given login
When navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then create BI worksheet from sheet "BIworksheetoutbound" with time range "between yesterday and tomorrow" 
Then save the BI sheet
Then filter the BI worksheet for status check from sheet "BIworksheetoutbound"
Then wait until BI worksheet status is changed to "E"
Then refresh
Then filter the BI worksheet for status check from sheet "BIworksheetoutbound"
Then wait until BI worksheet status is changed to "R"
Then click on the BI sheet "BIworksheetoutbound".
Then filter based on HeaderName "Broadcast Name" from WorkBook "bcInputData" and sheet "one-offBC"
Then verify "Ack" Data from WorkBook "bcInputData" and Sheet "one-offBC"


