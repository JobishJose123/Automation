#Author: joel.jose@flytxt.com
@NX-OfferAttributes
Feature: Test suite on Offer Attributes
  I want to check all test cases related to offer attributes

  @NX-4802 @initBrowser @closeBrowser
  Scenario: Adding Offer Attributes of type text while creating offers. NX-4784
    Given login
    Then navigate to configuration management  
    Then navigate to offer attributes
    Then check and create default selenium attributes
    @NX-4784 @initBrowser 
    Scenario:  Adding Offer Attributes of type text while creating offers.
    Given login
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then check offer attributes while creating offer
    
    @NX-5323 @initBrowser @closeBrowser
  Scenario: Creating Offer attribute with name having 50 characters NX-5323
    Given login
    Then navigate to configuration management  
    Then navigate to offer attributes
    Then create offer attribute with 50 characters
    
     @NX-5321 @initBrowser @closeBrowse
    Scenario:  Attaching Offer Attributes created by another partner while creating offers
    Given login
    Then Change partner
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then check offer attributes while creating offer after changing partner