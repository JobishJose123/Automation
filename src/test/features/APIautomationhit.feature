#Author: joel.jose@flytxt.com
#Summary : Test Cases of User Profile
@NX-facebook
Feature: Title of your feature
  I want to use this template for my feature file

@NX-APIautomation
@initBrowser 
Scenario: Verify APIHit.
Given login
#Then test run
#Then create Program with API hit with name "new customer care program"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "Customer Care" and touchpointname "new babshyam3712"
#Then create Program with API hit with name "new API program"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "API" and touchpointname "defaultapiTPGR"
#Then create Program with API hit with name "new SMS program 111"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "SMS" and touchpointname "1011-smsTP1245"


####################------For USSD program please give the TOUCHPOINT CHANNEL---->>>> ussd Application Name<<<----- which is mapped to that touchpoint-------------------------####### 

Then create Program with API hit with name "new USSD program007"  offer cataloge "SeleniumCatalog3735" and touchpoint channel type "USSD_app1_q11" and touchpointname "babshyamUSSD4984"   
