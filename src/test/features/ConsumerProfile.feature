#Author: joel.jose@flytxt.com
#Summary : Test Cases of Consumer Profile


@NX-consumer_profileTestSuite
Feature: Title of your feature
  I want to use this template for my feature file

@NX-2773
@initBrowser
Scenario: Verify if Reports module is introduced to UI.
Given login
Then navigate to precision marketer
Then navigate to reports

@NX-2775

Scenario: Verify whether breadcrumbs are displayed in the page.
Then navigate to customer profile
Then verify whether breadcrumbs are displayed in the page

@NX-2776
Scenario: Verify whether user can search for a consumer by specifying the MSISDN.
Then search msisdn ""

@NX-2780
@closeBrowser
Scenario: Verify for the search button after number is entered.
Then verify customer info page of ""


@NX-2786   
@initBrowser
Scenario: Check whether 5 tabs are available in consumer profile page.
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn ""
Then verify 5 tabs in customer profile page

@NX-2787   
@closeBrowser
Scenario: Verify whether each tabs are able to click alternatively whenever needed.
Then verify 5 tabs in customer profile page

@NX-2851  
@initBrowser @closeBrowser
Scenario: Verify whether a message get displayed when no events are selected and clicked on Apply icon-2851
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then click on event type checkbox
Then click on apply button
Then verify toast message


@NX-2832   
@initBrowser @closeBrowser
Scenario: Verify whether an alert message get displayed when trying to unsubscribe a consumer-2832
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click subscribed to lists tab
Then click unsubscribe button
Then verify confirmation message panel

###Verified till here 5/7/18


@NX-2788 @run_this
@initBrowser
Scenario: Verify whether consumer number is getting displayed at the top of the page.
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then search msisdn ""
Then verify customer info page of ""

###################PENDING
@NX-2792   @run_this
Scenario: Verify if Consumer Info tab is populated with valid data
Then verify details in customer info page of ""

@NX-2793 @run_this
@closeBrowser
Scenario: Verify whether user is able to change the subscriber from all the tabs.
Then verify changing customer number from all tabs of ""






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
@initBrowser
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
@initBrowser 
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
@initBrowser 
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

@NX-2821
@initBrowser @closeBrowser
Scenario: Verify for the details displayed in Customer Support tab-2821
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click customer support tab
Then verify events row in customer support tab

@NX-2822
@initBrowser @closeBrowser
Scenario: Verify whether user can search events in hours and days from Customer Support tab-2822
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click customer support tab
Then verify events row in customer support page

@NX-2813
@initBrowser @closeBrowser
Scenario: Verify whether by default, search events is highlighted in today-2813
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then verify tab selected by default


@NX-2812
@initBrowser @closeBrowser
Scenario: Verify if events can be filtered using apply event icon-2812
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then choose all events
Then click on apply button
Then choose all events
Then verify filterig event types


@NX-2818   
@initBrowser @closeBrowser
Scenario: Verify for saving the checked attributes-2818
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click usage metrics tab
Then verify for saving checked attributes



@NX-2820   
@initBrowser
Scenario: Verify whether the colour in the graph and attribute matches-2820
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click usage metrics tab
Then verify Color of selected attribute and graph


@NX-2809  
@initBrowser @closeBrowser
Scenario: Verify whether user is able to view daily,weekly & monthly trend of attributes in Usage Metrics tab-2809
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click usage metrics tab
Then verify charts in usage metric screen

@NX-2806
@initBrowser 
Scenario: Verify only the selected event type is getting displayed in the events tab-2806
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then verify selected events displayed in the events tab

@NX-2800
@initBrowser @closeBrowser
Scenario: Verify whether data changes when time parameter is changed-2800
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then verify events row



@NX-2823   
@initBrowser 
Scenario: Verify whether Customer Support tab shows the sent time,conversion time,reward time and status of reward-2823
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click customer support tab
Then verify events row in customer support events time details



@NX-2798
@initBrowser @closeBrowser
Scenario: Verify by default 3 event types are shown as selected in Events tab-2798
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click on events tab
Then verify event types selected by default


@NX-2819  
@initBrowser 
Scenario: Verify the checkpoints displayed in the graph-2819
Given login
Then navigate to precision marketer
Then navigate to reports
Then navigate to customer profile
Then enter customer number "number"
Then click on search button
Then click usage metrics tab
Then verify mouse hover in usage metrics tab
