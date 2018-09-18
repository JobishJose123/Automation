#Author: rahul.krishnan@flytxt.com
@NX-CLVMaxDashboard
Feature: Dashboard page

@NX-5577 @initBrowser @closeBrowser
  Scenario: Verify whether Status of the dashboard get displayed under Dashboard settings- 5577
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then navigate to dashboard page
    Then edit partner name from sheet "PartnerData"
    
    
     @NX-5573
    @initBrowser @closeBrowser
    Scenario: Verify clicking on the cancel button- 5573
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then navigate to dashboard page
    Then edit partner name from sheet "PartnerData" and click cancel button
    
    @NX-5571
    @initBrowser @closeBrowser
    Scenario: Verify whether save and cancel button is displayed- 5571
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then navigate to dashboard page
    Then navigate to dashboard settings page
    Then navigate to configuration page
    Then check cancel and save button
    
    
    @NX-5576
    @initBrowser @closeBrowser
    Scenario: Verify whether Configure,Activate,Deactivate options are available in grid icon of each dashboard- 5576
    Given login
    Then navigate to configuration management
    Then navigate to partners
    Then navigate to dashboard page
    Then navigate to dashboard settings page
    Then check option on each dashboard
    
    
    @NX-5616
    @initBrowser 
    Scenario: Verify whether help text is available for the dashboard- 5616
    Given login
    Then navigate to precision marketer
    Then navigate to dashboard page of precision marketer
    Then navigate to campaign performance monitor screen
    Then click on help icon
    Then verify help panel