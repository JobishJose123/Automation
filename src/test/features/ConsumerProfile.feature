#Author: joel.jose@flytxt.com
#Summary : Test Cases of Consumer Profile


@NX-consumer_profileTestSuite
Feature: Title of your feature
  I want to use this template for my feature file

#@NX-2773
#@initBrowser
#Scenario: Verify if Reports module is introduced to UI.
#Given login
#Then navigate to precision marketer
#Then navigate to reports
#
#@NX-2775
#
#Scenario: Verify whether breadcrumbs are displayed in the page.
#Then navigate to customer profile
#Then verify whether breadcrumbs are displayed in the page
#
#@NX-2776
#Scenario: Verify whether user can search for a consumer by specifying the MSISDN.
#Then search msisdn ""
#
#@NX-2780
#@closeBrowser
#Scenario: Verify for the search button after number is entered.
#Then verify customer info page of ""
#
#
#@NX-2786   
#@initBrowser
#Scenario: Check whether 5 tabs are available in consumer profile page.
#Given login
#Then navigate to precision marketer
#Then navigate to reports
#Then navigate to customer profile
#Then search msisdn ""
#Then verify 5 tabs in customer profile page
#
#@NX-2787   
#@closeBrowser
#Scenario: Verify whether each tabs are able to click alternatively whenever needed.
#Then verify 5 tabs in customer profile page

#@NX-2851  
#@initBrowser @closeBrowser
#Scenario: Verify whether a message get displayed when no events are selected and clicked on Apply icon NX-2851
#Given login
#Then navigate to precision marketer
#Then navigate to reports
#Then navigate to customer profile
#Then enter customer number "number"
#Then click on search button
#Then click on events tab
#Then click on event type checkbox
#Then click on apply button
#Then verify toast message
#
#
#@NX-2832   
#@initBrowser @closeBrowser
#Scenario: Verify whether an alert message get displayed when trying to unsubscribe a consumer-2832
#Given login
#Then navigate to precision marketer
#Then navigate to reports
#Then navigate to customer profile
#Then enter customer number "number"
#Then click on search button
#Then click subscribed to lists tab
#Then click unsubscribe button
#Then verify confirmation message panel

###Verified till here 5/7/18


#@NX-2788 @run_this
#@initBrowser
#Scenario: Verify whether consumer number is getting displayed at the top of the page.
#Given login
#Then navigate to precision marketer
#Then navigate to reports
#Then navigate to customer profile
#Then search msisdn ""
#Then verify customer info page of ""

###################PENDING
#@NX-2792   @run_this
#Scenario: Verify if Consumer Info tab is populated with valid data
#Then verify details in customer info page of ""

#@NX-2793 @run_this
#@closeBrowser
#Scenario: Verify whether user is able to change the subscriber from all the tabs.
#Then verify changing customer number from all tabs of ""






@NX-2817   
@initBrowser @closeBrowser
Scenario: Verify whether user is able to add,delete & uncheck attributes that is displayed-2817
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click usage metrics tab
Then verify add delete check and uncheck of attributes

@NX-2811   
@initBrowser @closeBrowser
Scenario: Verify the checkbox include sub-partners is available in consumer profile window-2811
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then verify include sub partners option


@NX-2807  
@initBrowser @closeBrowser
Scenario: Verify whether lists is getting displayed in Subscribed to Lists tab-2807
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click subscribed to lists tab
Then verify subscribed to lists

@NX-2803
@initBrowser @closeBrowser
Scenario: Verify whether on clicking the events row,it expands to show the details-2803
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then verify events row


@NX-2814   
@initBrowser @closeBrowser
Scenario: Verify if maximum five attributes can be selected and viewed in usage metric tab-2814
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click usage metrics tab
Then try to add more than five attributse and check for toast message


@NX-2824   
@initBrowser @closeBrowser
Scenario: Verify if the list get expanded and shows the details when clicked on it-2824
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click customer support tab
Then verify events row in customer support page


@NX-2799  
@initBrowser @closeBrowser
Scenario: Verify whether user is able to select and search events in hours and days from Events tab-2799
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then choose all events
Then click on apply button
Then verify events row



@NX-2797  
@initBrowser @closeBrowser
Scenario: Verify whether fulfillment events are getting listed in Events tab-2797
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then choose all events
Then click on apply button
Then verify fulfillment events row

@NX-2796  
@initBrowser @closeBrowser
Scenario: Verify whether conversion events are getting listed in Events tab-2796
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then choose all events
Then click on apply button
Then verify conversion events row



@NX-2808  
@initBrowser @closeBrowser
Scenario: Verify if the consumer is unsubscribed after 'unsubscribed' icon is clicked-2808
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click subscribed to lists tab
Then click unsubscribe button
Then unsubscribe a list
