#Author: your.email@your.domain.com
#Keywords Summary :
@NX-intentmanagemen
Feature: For IntentManagement datasetup.

  @initBrowser @createintentmanagementdatasetup
  
  Scenario: Verify create a program
    Given login
    Then navigate to configuration management
    Then naviagte to product classes
    Then create product class and number attribute from "TestProductClass"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to products
    Then navigate to product class "TestProductClass"
    Then click create new product button
    Then create product with attributes from sheet "fullDetails"
    Then navigate to landing page
    Then navigate to precision marketer
    Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "STVSMS" with product "fullDetails"
    Then navigate to offer management
    Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "STVSMS" offer to Offer Catalogue
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then navigate to programs
    Then verify create program page "APIprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "apiTouchpointGR"
    Then choose program from sheet "APIprogram"
    Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
    Then navigate to programs
    Then verify create program page "USSDprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "USSDprogram"
    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then navigate to programs
    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
    Then choose program from sheet "CCprogram"
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"

  #@initBrowser @createprogramrulereg
  #Scenario: Verify create a program rule
    #Given login
    #Then navigate to landing page
    #Then navigate to intent management
    #Then navigate to programs
    #Then choose program from sheet "SMSprogram"
    #Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    #Then verify rule created from sheet "rule"
    #Then navigate to programs
    #Then choose program from sheet "APIprogram"
    #Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
    #Then verify rule created from sheet "rule"
    #Then navigate to programs
    #Then choose program from sheet "USSDprogram"
    #Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    #Then verify rule created from sheet "rule"
    #Then navigate to programs
    #Then choose program from sheet "CCprogram"
    #Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    #Then verify rule created from sheet "rule"
    #Then navigate to programs



    
    
    
