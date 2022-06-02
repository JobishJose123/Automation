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

#
#::Report Generating Scenarios ::::::::::::::::::::::::::::::::::::::::::::::::::::::>
#
#:: Report-1
#
@NDX-commonReport_BI    @initBrowser @closeBrowser
Scenario Outline: Generating common report by selecting Outbound marketing inbound Marketing and Both Button
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create offer and Product Report from sheet "<reportSheet>" and "Auto" as Time Range
Then filter the Bi sheet from "<reportSheet>" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet
Examples:
|reportSheet|
|offerReportPM|
|offerReportIM|
|offerReportBoth|


#::Report-2
#
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


#::Report-3
#
@NDX-PM_IM_Reports  @initBrowser  @closeBrowser
Scenario Outline: Generate PM detailed Report and IM Report
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI report from sheet "<reportSheet>" and "Auto" as Time Range
Then filter the Bi sheet from "<reportSheet>" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet
Examples:
|reportSheet|
|pmReport|
|imReport|


#::Report-4
# 
@NDX-atbt_Report   @initBrowser   @closeBrowser
Scenario: Generate offer campaign Broadcast attribute header Report
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI report from sheet "PMattribute" and "Auto" as Time Range
Then filter the Bi sheet from "PMattribute" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet


#::Report-5
#
@NDX-includeSeedRewards   @initBrowser  @closeBrowser
Scenario: Generate Report for Include seeding Bc Rewards and conversion 
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI report from sheet "includeSeedRewards" and "Auto" as Time Range
Then filter the Bi sheet from "includeSeedRewards" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet


#::Report-6
#
 @NDX-20866  @NDX-20869    @initBrowser  @closeBrowser
Scenario: Generate report for Calculation verification
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI report from sheet "calcReport" and "Auto" as Time Range
Then filter the Bi sheet from "calcReport" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet


#::Report-7
#
@NDX-20819  @NDX-20822   @initBrowser  @closeBrowser
Scenario Outline: Generate report for Grouping and Data verification
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI Group report from sheet "<reportSheet>" and "Auto" as Time Range
Then filter the Bi sheet from "<reportSheet>" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet
Examples:
|reportSheet|
|GrpBcRpt|
|GrpBcOther|
|GrpCamp|
|GrpCampOther|


#::Report-8
#
@NDX-Bi_CustomEvent_Report   @initBrowser  @closeBrowser
Scenario: Generate CustomEvent report for Custom Event Verification
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI report from sheet "CustomEventSheet" and "Auto" as Time Range
Then filter the Bi sheet from "CustomEventSheet" using excel sheet 
Then wait for "E" status for worksheet
Then wait for "R" status for worksheet


#::Report-9
#UseCase1
#UseCase2
#UseCase3
#UseCase4
#UseCase5
@NDX-Bi_UseCases   @initBrowser
Scenario: Create BI UseCases report for use cases Verification
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then click create New Worksheet
Then create BI Use CaseReport from sheet "UseCase1" and "Auto" as Time Range


###::::::::::::::::::::::::::::::::::::::::::::Verification Scenarios::::::::::::::::::::::::::::::::::::::::::::::::
############
############
############
############
###::::::::::::::::::::::::::::::::::::::::::::Verification Scenarios::::::::::::::::::::::::::::::::::::::::::::::::



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



@NDX-20898  @initBrowser @closeBrowser
Scenario Outline: Verify generated BI report dispalying IM events when the inbound marketing radio button is selected
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "offerReportIM" using excel sheet 
Then wait for "R" status for worksheet
Then click on BiSheet from "offerReportIM" sheet
Then verify Aggregated data of header "<EventName>" with "<Agregatevalue>" as value
Examples:
|EventName|Agregatevalue|
	|conversion|10|
	|fulfillment|10|




@NDX-20899 @NDX-20838  @initBrowser @closeBrowser
Scenario Outline: Verify generated BI report dispalying both IM&PM events when the both radio button is selected
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "offerReportBoth" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "offerReportBoth" sheet
Then verify Aggregated data of header "<EventName>" with "<Agregatevalue>" as value
Examples:
|EventName|Agregatevalue|
	|conversion|1000|
	|fulfillment|1000|



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
	|Metric1|  21007.500|
	|Metric2| 35000|
	|Metric3|56000|
	|Metric4| 70000|






@NDX-21127   @initBrowser  @closeBrowser
Scenario Outline: verify aggregated data headers of outbound marketing based report
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "pmReport" using excel sheet 
Then wait for "R" status for worksheet
Then click on BiSheet from "pmReport" sheet
Then verify Aggregated data of header "<headerName>" with "<aggregateValue>" as value
Examples:
|headerName|aggregateValue|
	|Ack       |7000      |
	|conversion|7000      |
	|fulfillment|7000     |
	


@NDX-PM_Report_Data  @initBrowser  @closeBrowser
Scenario Outline: verify All datas displayed in body console of the report
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "pmReport" using excel sheet 
Then wait for "R" status for worksheet
Then click on BiSheet from "pmReport" sheet
Then verify data of "<dataType>" for "OutBound Marketing" type report 
Examples:
|dataType|
|date |
|Campaign Category|
|Campaign |
|Broadcast Name|
|Customer Segment|
|Acknowledgement|
|conversion  |
|fulfillment|




@NDX-21207  @initBrowser  @closeBrowser
Scenario Outline: verify aggregated data headers of inbound marketing based report
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "imReport" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "imReport" sheet
Then verify Aggregated data of header "<eventName>" with "<agregateValue>" as value
Examples:
|eventName|agregateValue|
|offerEligible|500|
|offerEnquiry|10|
|offerRecommend|100|
|offerAccepted|10|
|conversion|10|
|fulfillment|10|



@NDX-verify_atbtReport   @initBrowser  @closeBrowser
Scenario Outline: verify agregated data headers of campaign Broadcast offer  attributes 
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "PMattribute" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "PMattribute" sheet
Then verify Aggregated data of header "<agregateHeader>" with "<agregateValue>" as value
Examples:
		|agregateHeader|agregateValue|
		|OfferAttribute| 127.500     |
		|CampaignAttribute| 302.500  |
		|BroadcastAttribute| 450     |




@NDX-20901  @initBrowser  @closeBrowser
Scenario Outline: verify Report for Include seeding Reward Bc fulfillment and conversion
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "includeSeedRewards" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "includeSeedRewards" sheet
Then verify Aggregated data of header "<EventHeader>" with "<EventValue>" as value
Examples:
		|EventHeader|EventValue|
		|Ack        |      7000|
		|conversion |      9990|
		|fulfillment|      9500|




@NDX-20867 @NDX-20870   @initBrowser  @closeBrowser
Scenario Outline: verify Data for Report of create custom calculation 
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "calcReport" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "calcReport" sheet
Then verify Aggregated data of header "<formulaHeader>" with "<value>" as value
Examples:
        |formulaHeader|   value |
	    |TotalConversion%|1598  |
	    |UniqueConversion%|1500 |
	    |fulfillment%     | 1500|




@NDX-20890  @NDX-20818    @initBrowser @closeBrowser
Scenario Outline: verify Data for Grouping of Broadcast Names Campaigns with Internal filter
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "<BiSheet>" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "<BiSheet>" sheet
Then verify GroupData "<BiSheet>" and Case "<CaseName>" Events "<Ack>" conversion "<conversion>" and "<fulfillment>" fulfillment 
Examples:
|BiSheet|CaseName|Ack|conversion|fulfillment|
#
|GrpBcRpt|BcNameOneOff|2500|2500|2500|
|GrpBcRpt|BcNameRecur |2000|2000|2000|   
|GrpBcRpt|BcNameSeed  |2500|2500|2500|
#
|GrpBcOther|BcNameOneoff|2500|2500|2500|
|GrpBcOther|BcNameOther |4500|4500|4500|
#
|GrpCamp|CampNameOneOff|2500|2500|2500|
|GrpCamp|CampNameRecur |2000|2000|2000|
|GrpCamp|CampNameSeed  |2500|2500|2500|
#
|GrpCampOther|CampNameOneoff|2500|2500|2500|
|GrpCampOther|CampNameOther |4500|4500|4500|



@NDX-12392   @initBrowser  @closeBrowser
Scenario: Verify creation of Report by selecting Custom Event as Header
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
Then filter the Bi sheet from "CustomEventSheet" using excel sheet
Then wait for "R" status for worksheet
Then click on BiSheet from "CustomEventSheet" sheet
Then Verify Custom Event "CustomEvent" with value "100" for Custom Event Report










