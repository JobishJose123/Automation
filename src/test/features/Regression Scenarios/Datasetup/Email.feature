#Author : kiran.joseph@flytxt.com
@Emailcreation01
Feature: Email

######################## email feature ###########
@ndx-basicemail   @initBrowser
Scenario: Basic email partner settings selection.
Given login
Then navigate to configuration management
Then navigate to partners
Then edit a partner
Then navigate to Email Settings
Then select the "BASIC" email option
Then fill from name as "Kiran Joseph".
Then select the sender route as "Email outbound"
Then save the settings

@NDX-rechargeEmailoption1
  @initBrowser @closeBrowser
Scenario: rechargeEmail offer
  Given login
  When navigate to precision marketer
  Then navigate to offer management
  Then navigate to offers
  Then create new offer from sheet "Option1Email" with product "fullDetails"
  Then verify "Option1Email" offer in grid
  Then wait for 1 minutes
  Then navigate to offer management
  Then Navigate to Offer Catalogue
  Then filter the offer catalogue from sheet "defaultCatalog" and navigate to view offers
  Then Add "Option1Email" offer to Offer Catalogue
  
  
  @NDX-CreateEmailbcoption1 @initBrowser  
Scenario Outline:Create Email broadcast to verify bc functionality option1
Given login
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then "<status>" bc
Then wait for 4000 milliseconds 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "<BCDataSheet>" 
 Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|status|BCDataSheet|                  
|Emailoption1|Option1Email|usageMetric|Create|no limit|no limit|none|single creative|none|none|2|activate|BCDataStorage|



@ndx-withtracking   @initBrowser
Scenario:  With tracking email partner settings selection.
Given login
Then navigate to configuration management
Then navigate to partners
Then edit a partner
Then navigate to Email Settings
Then select the "WITH_TRACKING" email option
Then fill from name as "Kiran Joseph".
Then select the sender route as "Email outbound"
Then save the settings

  @NDX-rechargeEmailoption2
  @initBrowser @closeBrowser
Scenario: rechargeEmail offer
  Given login
  When navigate to precision marketer
  Then navigate to offer management
  Then navigate to offers
  Then create new offer from sheet "Option2Email" with product "fullDetails"
  Then verify "Option2Email" offer in grid
  Then wait for 1 minutes
  Then navigate to offer management
  Then Navigate to Offer Catalogue
  Then filter the offer catalogue from sheet "defaultCatalog" and navigate to view offers
  Then Add "Option2Email" offer to Offer Catalogue
  
  
  @NDX-CreateEmailbcoption2 @initBrowser  
Scenario Outline:Create Email broadcast to verify bc functionality option1
Given login
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then "<status>" bc
Then wait for 4000 milliseconds 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "<BCDataSheet>" 
 Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|status|BCDataSheet|                  
|Emailoption2|Option2Email|usageMetric|Create|no limit|no limit|none|single creative|none|none|2|activate|BCDataStorage|


@ndx-mandril   @initBrowser
Scenario:  With tracking email partner settings selection.
Given login
Then navigate to configuration management
Then navigate to partners
Then edit a partner
Then navigate to Email Settings
Then select the "DIGITAL_PLUS" email option
Then fill from name as "Kiran Joseph".
Then fill the from Email Address as "flyops@flytxt.com" and Mandrill API key as "VlSEuQcnpAGr5iL5GQiTdA" 
Then save the settings


 
  
    @NDX-rechargeEmailoption3
  @initBrowser @closeBrowser
Scenario: rechargeEmail offer
  Given login
  When navigate to precision marketer
  Then navigate to offer management
  Then navigate to offers
  Then create new offer from sheet "Option3Email" with product "fullDetails"
  Then verify "Option3Email" offer in grid
  Then wait for 1 minutes
  Then navigate to offer management
  Then Navigate to Offer Catalogue
  Then filter the offer catalogue from sheet "defaultCatalog" and navigate to view offers
  Then Add "Option3Email" offer to Offer Catalogue
  
#@offeraddingcatalogueopt1 @initBrowser @closeBrowser
#Scenario: Verify Creating Offer Catalogue 
#Given login
#When navigate to precision marketer
#Then wait for 1 minutes
#Then navigate to offer management
#Then Navigate to Offer Catalogue
#Then filter the offer catalogue from sheet "defaultCatalog" and navigate to view offers
#Then Add "Option3Email" offer to Offer Catalogue
#
#  @NDX-campaigncreationdemo
# @initBrowser @closeBrowser
#Scenario: campaign creation
#  Given login
#Then navigate to configuration management
#Then navigate to campaign categories
#Then create new campaign category from sheet "campaignCategory"
#Then navigate to landing page
#When navigate to precision marketer
#Then wait for 1 minutes
#Then navigate to life cycle marketing
#Then navigate to campaign category from sheet "campaignCategory"
#Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"


#@Create_OfferCatalogueemail
#@initBrowser 
#Scenario: Verify Creating Offer Catalogue 
#  Given login
#  When navigate to precision marketer
#  Then navigate to offer management
#	Then Navigate to Offer Catalogue
#  Then Create New Offer Catalogue from sheet "defaultCatalog"


@NDX-CreateEmailbcoption3 @initBrowser  
Scenario Outline:Create Email broadcast to verify bc functionality option1
Given login
Then navigate to precision marketer
Then wait for 1 minutes
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then create bc from sheet "<bcSheet>" with inventory "Unlimited" and trigger "none"
Then enter target tab details target condition <targetCondition> type "<targetType>" TG "<targetCount>" CG "<cgCount>" DNC "<DNCType>"
Then enter choose offer tab from sheet "<offerName>" for bc from sheet "<bcSheet>" with "<creative>" track session expires "after" filter criteria "convertAll" give reward to "allConversions"
Then enter deliver tab with end "<endType>" target render time "realTime" and broadcast expiry as "<expiryType>" from sheet "<bcSheet>"
Then "<status>" bc
Then wait for 4000 milliseconds 
Then add bc from sheet "<bcSheet>" to column "<i>" of bc data sheet "<BCDataSheet>" 
 Examples:
|bcSheet|offerName|targetCondition|targetType|targetCount|cgCount|DNCType|creative|endType|expiryType|i|status|BCDataSheet|                  
|Emailoption3|Option3Email|usageMetric|Create|no limit|no limit|none|single creative|none|none|2|activate|BCDataStorage|


