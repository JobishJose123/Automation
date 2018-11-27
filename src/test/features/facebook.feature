#Author: joel.jose@flytxt.com
#Summary : Test Cases of User Profile


@NX-facebook
Feature: Title of your feature
  I want to use this template for my feature file

#@NX-7422
#@initBrowser 
#Scenario: Verify clicking the Add Facebook Acccount.
#Given login
#Then navigate to landing page
#Then navigate to precision marketer
#Then navigate to configuration
#Then click facebook option
#Then verify add facebook account option

@NX-facebook
 @initBrowser 
  Scenario: Create offer:Track: Verify creating offers with facebook channel
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then create new offer from sheet "rechargevideoFacebook" with product "singleProductPage"