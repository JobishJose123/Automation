#Author:shobina.k@flytxt.com
@NDX-Dashboard
Feature: PM AND IM Dashboard

@NDX-6969 @initBrowser @closeBrowser
Scenario: Verify the values displayed in the Campaign Performance Monitor Dashboard
Given login
Then navigate to precision marketer
Then navigate to dashboard
Then click campaign Performance Monitor
Then verify the values displayed 

@NDX-7169 @initBrowser @closeBrowser
Scenario: Verify the values displayed in the Monthly Performance Snapshot Dashboard 
Given login
Then navigate to precision marketer
Then navigate to dashboard
Then click monthly performance snapshot
Then verify the values displayed

@NDX-7171 @initBrowser @closeBrowser
Scenario: Verify the values displayed in the Customer Events Spread Dashboard 
Given login
Then navigate to precision marketer
Then navigate to dashboard
Then click customer event spread
Then verfiy values displayed in customer events spread

@NDX-7226   @initBrowser @closeBrowser
Scenario: Verify the values displayed in the Digital Experience Monitor Dashboar
Given login
Then navigate to intent management
Then navigate to dashboard
Then click digital experience monitor
Then verfiy the values in the im dashboard

@NDX-7232 
Scenario: Verify the values displayed in the Touchpoint Performane-Customer Care Dashboard
Then navigate to dashboard
Then click touchpoint performane customer care
Then verfiy the values in the im dashboard



