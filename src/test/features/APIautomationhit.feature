#Author: syam.krishna@flytxt.com
#Summary : Test Cases of api automation
@NX-API_automation
Feature: Title of your feature
  I want to use this template for my feature file

@NX-APIautomation
@initBrowser @closeBrowser 
Scenario: Verify program and rule creation with API hit.
Given login

Then create Program with API hit with name "new customer care program with rule"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "Customer Care" and touchpointname "new babshyam3712"
Then create Program with API hit with name "test program"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "API" and touchpointname "defaultapiTPGR"
Then create Program with API hit with name "new SMS program with rule"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "SMS" and touchpointname "1011-smsTP1245"


####################------For USSD program please give the TOUCHPOINT CHANNEL---->>>> ussd Application Name<<<----- which is mapped to that touchpoint-------------------------####### 

Then create Program with API hit with name "new USSD program007 with rule"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "USSD_app1_q11" and touchpointname "babshyamUSSD4984"   


Then create a rule with name "Recharge offer rule" for program with name "new trigger program"  offer name "rechSMSOffer2815" and list "selenium_list" and product name "singleProd4694" and offertype "Recharge"
Then create a rule with name "Stv offer rule" for program with name "new trigger program"  offer name "seedWAPOffer6598" and list "selenium_list" and product name "singleProd4694" and offertype "STV"



@NX-APIproductclass
@initBrowser @closeBrowser 
Scenario: verify create customercare Touchpoint
Given login
Then create productclass with API hit with name "seleniumapihitclass2"  description "testdata"
Then create product with API hit with name "new product123654"  description "this is created by APi AUtomation" in product class "seleniumapihitclass2"
Then create Customer care touchpoint with default offer name "new_cc_touchpoint6"  intervalUnit "HOURS" intervalvalue "1" minofferlimit "1" maxofferlimit "5" orderrule "LIFO" and defaultoffer "seedWAPOffer6598"

Then create Customer care touchpoint with hit with name "CCwithoutoffer"  intervalUnit "HOURS" intervalvalue "1" maxofferlimit "5" orderrule "LIFO"
Then create sms touchpoint with hit with shortcode "1011"  intervalUnit "HOURS" intervalvalue "1" maxofferlimit "5" orderrule "LIFO" Keyword "smstouchpointnew"
Then create Api touchpoint with hit with name "new hit api"  intervalUnit "HOURS" intervalvalue "1" maxofferlimit "5" orderrule "LIFO" applicationType "GENERAL" eventForTracking "RECOMMENDED"
Then create ussd touchpoint with hit with name "new ussd application"  intervalUnit "HOURS" intervalvalue "1" maxofferlimit "5" orderrule "LIFO" ussdapplicationname "USSD_app_q11"


