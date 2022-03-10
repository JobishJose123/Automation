# AMAL XAVIOUR
#
#
@BI_Verfication
Feature: Business Intelligence Verification

#
#::BI_Phase 1
#
#Time ranges -> between yesterday and tomorrow  -> is on today --> is on yesterday --> Yesterday --> Last week
#  --> Last month  --> This Month to Date --> Last Month to Date  --> 2022-02-14  -->3rd -->22nd-->
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

#s.replace(",", "");
#
#//vaadin-grid-table-body[@id='items']//vaadin-grid-table-row[5]//vaadin-grid-table-cell[4]
 
 @NDX-generateMetricReport    @initBrowser
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
Then click on BiSheet from "metricReportAck" sheet

#//div[@class='paper-carousel_wrapper style-scope paper-carousel']/div[contains(.,'Metric1')]/div[2]
@Bi_Verify  @initBrowser
Scenario: Metric data verify
Given login
Then navigate to precision marketer
Then navigate to analytics
Then navigate to Business Intelligence
#Then filter the Bi sheet from "metricReportAck" using excel sheet 
Then wait for "R" status for worksheet
Then click on BiSheet from "metricReportAck" sheet
Then verify Aggregated data of header "Ack" with "7000" as value






