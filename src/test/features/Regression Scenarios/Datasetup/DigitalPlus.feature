#Author : shobina.k@flytxt.com
Feature: DigitalPlus

######################## webhook login to get the url ###########
@ndx-webhooklogin   @initBrowser @closeBrowser
Scenario Outline: login to webhook
Given login to webhook with username "shobina.k@flytxt.com" and password "shobi271995!"
Then navigate to control panel
Then create new url from sheet "<connectorSheet>"
Then copy the generated url to sheet "<connectorSheet>"
Examples:
|connectorSheet|
|httpXML|
|httpJson|
|httpQueryString|


@NDX-16859 @NDX-16845  @initBrowser @closeBrowser
Scenario Outline: create a http connector
Given login
Then navigate to data foundation
Then navigate to connectors
Then navigate to channel connector
Then navigate to http api connector
Then click create new connector
Then create new http connector from sheet "<connectorSheet>"
Examples:
|connectorSheet|
|httpXML|
|httpJson|
|httpQueryString|


@createBCWithttpConnector @initBrowser @closeBrowser
Scenario Outline: create a broadcast with <connector>
Given login 
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to life cycle marketing 
Then navigate to campaign category from sheet "CampaignCategory" 
Then naigate to "campaignBC" campaign view broadcasts 
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition customerAddressPM type "None" TG "no limit" CG "no limit" DNC "none"
Then enter choose offer tab from sheet "<offerSheet>" for bc from sheet "<bcSheet>" with connector from sheet "<connector>" 
Then enter deliver tab with end "none" target render time "real time" and broadcast expiry as "none" from sheet "<bcSheet>"
Then save bc 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "DigitalPlus"
Then wait for 4000 milliseconds 
 Examples:
 |connector|i|bcSheet|offerSheet|
 |httpXML|1|recurrBCDaily|rechargeSMS|
 |httpJson|2|recurrBCDaily|rechargeSMS|
 |httpQuery|3|recurrBCDaily|rechargeSMS|
 |httpXML|4|recurrBCDaily|rechargeEmail|
                                                                                                                                                                                                                                                                                                                                                                                                                                                