# AMAL XAVIOUR
#
#
@BI_Verfication
Feature: Business Intelligence Verification


#:: Excel workBook used ->  BiVerify.xls   
#
#::BI_Phase 1
#
#

#Metric time ranges ("By Day" "today") ("By Day" "yesterday") ("By Day" "2 days ago")("By Day" "3 days ago")
#######             ("By Week" "this week") ("By Week" "last week")
#


@NDX-12369    @initBrowser  @closeBrowser
Scenario: Verify whether Inbound options disabled when outbound column is selected 
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then verify inbound options are disabled when selected outbound



  @NDX-12370    @initBrowser  @closeBrowser
Scenario: Verify whether Outbound options are  disabled when Inbound column is selected 
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then verify outbound options are disabled when selected inbound


  @NDX-12371   @initBrowser @closeBrowser
Scenario: Verify whether Create Calculation is enabled only after a Calculation header save
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then verify create calculation is disabled before header save 

#::TIME RANGES :-
#  between yesterday and tomorrow
#  is on today
#  is on yesterday
#  Yesterday
#  Last week
#  Last month
#  This Month to Date
#  Last Month to Date
#  2022-08-22 (give YY-MM-DD format date input like example)
# 22nd
#  3rd
# Auto (if user provides keyword 'Auto' then automatically fetch data setup run date and provide as input
#
@NDX-commonReport_BI    @initBrowser @closeBrowser
Scenario Outline: Generating common report by selecting Outbound marketing inbound Marketing and Both Button
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create offer and Product Report from sheet "<reportSheet>" and "is on today" as Time Range
Then filter the Bi sheet from "<reportSheet>" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet
Examples:
|reportSheet|
|offerReportPM|
|offerReportIM|
|offerReportBoth|




@NDX-20897   @initBrowser  @closeBrowser
Scenario Outline: Verify generated BI report dispalying PM events when outbound marketing radio button is selected
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "offerReportPM" using excel sheet 
Then wait for "R" status for worksheet
Then click on BiSheet from "offerReportPM" sheet
Then verify Aggregated data of header "<EventName>" with "<Agregatevalue>" as value
Examples:
|EventName|Agregatevalue|
	|conversion|1000|
	|fulfillment|1000|



 
 @NDX-generateMetricReport    @initBrowser @closeBrowser
Scenario: Create Metric Bi Report for functionality verification
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create metric report from sheet "metricReportAck" Report TimeRange "Auto" Metric TimeRange "By Week" and "this week" 
Then filter the Bi sheet from "metricReportAck" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet



@NDX-metricDataVerify   @initBrowser  @closeBrowser
Scenario Outline: Agregate Data verification of four metrics
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "metricReportAck" using excel sheet 
Then wait for "R" status for worksheet
Then click on BiSheet from "metricReportAck" sheet
Then verify Aggregated data of header "<metricName>" with "<metric value>" as value
Examples:
|metricName|metric value|
	|Metric1|  20689|
	|Metric2| 34470|
	|Metric3|55152|
	|Metric4| 70000|







