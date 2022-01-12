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

#
#=========================================================================================================================================================================================================================
#


    #@Bi_offerforAck     @initBrowser
#Scenario: Data Setup for Offer creation for Bi 
#Given login 
#Then navigate to precision marketer
#Then navigate to offer management
#Then navigate to offers
#Then create new offer from sheet "rechargeSMS" with product "fullDetails"
#Then navigate to landing page
#Then navigate to precision marketer
#Then navigate to offer management 
#Then Navigate to Offer Catalogue
#Then Create New Offer Catalogue from sheet "defaultCatalog"
#Then Add "rechargeSMS" offer to Offer Catalogue


    #@Bi_campaignforAck     @initBrowser
#Scenario: Data Setup for Campaign and Campaign Category for Bi outBound
#Given login
#Then navigate to configuration management
#Then navigate to campaign categories
#Then create new campaign category from sheet "campaignCategory"
#Then navigate to landing page
#Then navigate to precision marketer
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"


  #@bcDataSetUpBIforAck     @initBrowser @closeBrowser
#Scenario: create Bc for Bi
#Given login
#Then navigate to precision marketer
#Then wait for 1 minutes
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then naigate to "campaignBC" campaign view broadcasts
#Then click create new broadcast button
#Then create bc from sheet "one-offBC" with inventory "Unlimited" and trigger "none"
#Then enter target tab details target condition targetall type "None" TG "no limit" CG "no limit" DNC "none"
#Then enter choose offer tab from sheet "rechargeSMS" for bc from sheet "one-offBC" with "single creative" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
#Then enter deliver tab with end "none" target render time "realTime" and broadcast expiry as "none" from sheet "one-offBC"
#Then activate bc
#Then wait until status of "one-offBC" is "Completed"
#Then wait for 1 minutes
#Then save "Ack" data to sheet "BiData" to the column "BC_ACK"



#######################################################################################################################################
###       BI Regression Data Set-Up >> Must Run Only Once Each successfully
###
#################################################################################################################

 @NDX-createBiList  @initBrowser @closeBrowser
Scenario: create customer List for BI
Given login
Then navigate to data foundation
Then navigate to registration list
Then click create new registration list button
Then create New CustomerList Name "selenium_BiList" type as "Standard" for BI
Then navigate to landing page

##   After Running List Creation Scenario '@createBiList' Upload selenium_BIListMsisdn.csv excel file from List folder
##
## Metric creating scenario should run only once
@NDX-metric_BI  @initBrowser @closeBrowser
Scenario Outline: metric creation for Bi
Given login 
Then navigate to data foundation
Then navigate to usage metric
Then click create new registration list button
Then create usageMetric Bi with name "<metricNames>" for BI
Then save usage metric "<metricNames>" for BI
Then navigate to landing page
Examples: 
|metricNames|
|SelBiMetric1|
|SelBiMetric2|
|SelBiMetric3|
|SelBiMetric4|


# Note :--> Mount the Location "/usr/local/flytxt/selenium/metricBI" in Marathon Before Running.
# If scenario Fails Must upload 4 metrics through DK job manually
#
@metricBiUpload_BI  @initBrowser @closeBrowser
Scenario: metric creation for Bi
Given login
Then provide file in location "/usr/local/flytxt/selenium/metricBI" for trigger with csv file "BiMetricUpload.csv"



@NDX-segment_BI  @initBrowser @closeBrowser
Scenario: Saved segment creating for Bi for New BI Customer List
Given login
Then navigate to landing page
Then navigate to precision marketer
Then navigate to configuration
Then navigate to saved segments
Then create segment with name "SelBiSegment" with condition "listSubscribed"

@NDX-Attributes_BI  @initBrowser @closeBrowser
Scenario: create Offer attribute  Campaign attribute  and BC  Attributes  for Bi 
Given login
Then navigate to configuration management
Then navigate to Campaign Attributes 
Then create campaign attribute with name "SelCampAttribute" and label "selCamAtbt"
Then navigate back
Then navigate to offer attributes
Then create offer attribute with name "SelOfferAttribute" and label "selOffAtbt"
Then navigate back
Then navigate to broadcast attribute
Then create broadcast atribute with name "SelBCAttribute" and label "selBcAtbt"
Then navigate to landing page




#
##:::: Excel WorkBook used is biDataSetup.xls  
#



######################################################################################################################                                                                  
##
## Data set-up for BI Report verification Broadcast and offer  set-up :: Can Run Multiple Times 
######################################################################################################################

#
##::::::::::: Must Mount This location "/usr/local/flytxt/selenium/conversionBI" in Marathon In order to automatically   
## raise conversion for all Broadcasts.
##
# Or can use Any location in "/usr/local/flytxt/selenium.....  But need to be mounted. and created Conversion DK job  
# with the same Location


@NDX-Bi_offers_BI   @initBrowser @closeBrowser
Scenario Outline: create offers with Attribute for Bi verification
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then create offer from Sheet "<OfferSheetName>" with product "fullDetails" with Reward "sel_reward" and Attribute value "<attributeValue>"
Examples:
		|OfferSheetName|attributeValue|
		|biSmsOffer    |    10|
		|biSeedOffer   |    5.5|
		


@NDX-catalog_BI    @initBrowser  @closeBrowser
Scenario: Create offer catalog for BI report verification
Given login
Then navigate to precision marketer
Then navigate to offer management
Then Navigate to Offer Catalogue
Then create Offer catalog from Sheet "catalog"
Then add offer from Sheet "biSmsOffer" to catalog
Then add offer from Sheet "biSeedOffer" to catalog
Then navigate to landing page




@NDX-category_BI  @initBrowser  @closeBrowser
Scenario: create campaign category for BI Broadcasts only
Given login
Then navigate to configuration management
Then navigate to campaign categories
Then create New Campaign Category from sheet "BiCategory" for BI





@NDX-campaigns_BI    @initBrowser @closeBrowser
Scenario Outline: Create Campaigns for OneOff Recurring Seeding Broadcasts
 Given login
 Then navigate to precision marketer
 Then navigate to life cycle marketing
 Then Navigate to Bi campaign Category from sheet "BiCategory"
 Then Create New Campaign from Sheet "<campaignNames>" with catalog as "catalog" with "<AttributeValue>" Attribute
Examples:
|campaignNames|AttributeValue|
|campaignOneoff|   20        |
|campaignSeeding|  20        |
|campaignRecur |20.5        |




@NDX-OneOffBc_BI @initBrowser  @closeBrowser
Scenario Outline: create OneOff Broadcasts for Bi Report Verification 
Given login 
Then navigate to precision marketer 
Then wait for 1 minutes 
Then navigate to life cycle marketing 
Then Navigate to Bi campaign Category from sheet "BiCategory" 
Then Navigate to "campaignOneoff" View Broadcast
Then click create new broadcast button
Then input details Tab "<BcSheet>" with inventory "Unlimited" Attribute value "<attributeValue>" and triger "none"
Then input Target Tab with customerList "selenium_BiList" and TG "none" CG "none" DNC "none"
Then input offer from Sheet "biSmsOffer" with filter Criteria "ruleBased" and Give Rewards to "Unique Conversion"
Then input Deliver Tab from sheet "<BcSheet>" with end Type as "none" 
Then activate bc
Then wait for Status of Bc "<BcSheet>" is "Completed"
Then wait for 1 minutes
Then provide file in location "/usr/local/flytxt/selenium/conversionBI" for trigger with csv file "conversionBI.csv"
Then Save Ack to workBook "biDataSetup" to Sheet "<BcSheet>" to the column "Ack"
Examples:
		|BcSheet|attributeValue|
		|OneOffBcA|     30   |
		|OneOffBcB|     30   |
		|OneOffBcC|     30   |
		|OneOffBcD|     30   |
		|OneOffBcE|     30   |



#
#:: Note:-> In Deliver Tab :  Instead of "At" if we Give "None" Recurring BC will Run Infinite Days continuously. If provide "At" 
# Recurring BC run for only Two Days.
#

 @NDX-RecurBc_BI    @initBrowser  @closeBrowser
Scenario Outline: create Recurring Broadcasts for Bi Report Verification 
Given login 
Then navigate to precision marketer 
Then wait for 1 minutes 
Then navigate to life cycle marketing 
Then Navigate to Bi campaign Category from sheet "BiCategory" 
Then Navigate to "campaignRecur" View Broadcast
Then click create new broadcast button 
Then input details Tab "<BcSheet>" with inventory "Unlimited" Attribute value "<attributeValue>" and triger "none"
Then input Target Tab with customerList "selenium_BiList" and TG "none" CG "none" DNC "none"
Then input offer from Sheet "biSmsOffer" with filter Criteria "ruleBased" and Give Rewards to "Unique Conversion"
Then input Deliver Tab from sheet "<BcSheet>" with end Type as "<endType>" 
Then activate bc
Then refresh
Then wait for Status of Bc "<BcSheet>" is "Completed"
Then wait for 1 minutes
Then provide file in location "/usr/local/flytxt/selenium/conversionBI" for trigger with csv file "conversionBI.csv"
Then Save Ack to workBook "biDataSetup" to Sheet "<BcSheet>" to the column "Ack"
Examples:
|BcSheet|attributeValue|endType|
|RecuringBcA| 30       |At     |
|RecuringBcB|30        |At     |
|RecuringBcC|30        |At     |
|RecuringBcD|30        |At     |
|RecuringBcE|30        |At     |

 
 
 
 ##:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 ##
 ##Case::1  >>In seeding Bc's excel Sheet if user provide  column Type=recuring and in Deliver Tab  end Type as "none" .seeding Bc 
 ## will run Infinite Times as Recuring Bc
 ##
 ##Case::2 >> In seeding Bc's excel Sheet if user provide  column Type=recuring and in Deliver Tab  end Type as "At"
 ## Seeding bc will run as Recurring bc only for 2 Days then It will be completed
 ##
 ##Case::3 >>In seeding Bc's excel Sheet if user provide  column Type=oneoff , Seeding oneOff Bc will be sent
 ##
 ##:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 
 
  @NDX-SeedingBc_BI  @initBrowser @closeBrowser
 Scenario Outline: create seeding Broadcasts for Bi Report Verification 
 Given login 
Then navigate to precision marketer 
Then wait for 1 minutes 
Then navigate to life cycle marketing 
Then Navigate to Bi campaign Category from sheet "BiCategory"
Then Navigate to "campaignSeeding" View Broadcast
Then click create new broadcast button 
Then input details Tab "<BcSheet>" with inventory "Unlimited" Attribute value "<attributeValue>" and triger "none"
Then input Target Tab with customerList "selenium_BiList" and TG "none" CG "none" DNC "none"
Then input offer from Sheet "biSeedOffer" with filter Criteria "ruleBased" and Give Rewards to "Unique Conversion"
Then input Deliver Tab from sheet "<BcSheet>" with end Type as "none" 
Then activate bc
Then wait for Status of Bc "<BcSheet>" is "Completed"
Then wait for 1 minutes
Then provide file in location "/usr/local/flytxt/selenium/conversionBI" for trigger with csv file "conversionBI.csv"
Then Save Ack to workBook "biDataSetup" to Sheet "<BcSheet>" to the column "Ack"
Examples:
|BcSheet|attributeValue|
|SeedingBcA| 30        |
|SeedingBcB| 30        |
|SeedingBcC| 30        |
|SeedingBcD| 30        |
|SeedingBcE| 30        |




################################################################################################################################################################
################################################################################################################################################################
#::::::
#::::::Creating Data For Intent Management
#::::::
#::::::#########################################################################################################################################################


#
#:: WorkBook used >> "biDataSetup.xls"   ::::::::::::::::
#

@NDX-Touchpoint_BI   @initBrowser
Scenario: create new Api Touch point For Bi report regression
Given login
Then navigate to intent management
Then navigate to touchpoints
Then navigate to api
Then create Touch point from Sheet "TouchPointBI" and Logic "FIFO"

