#Author: your.email@your.domain.com
#Keywords Summary :
@NX-customertcare
Feature: For IntentManagement customer care Regression.

    @initBrowser @NX-cctouchpoint
  Scenario: Verify create a customer care program full flow
    Given login
    Then navigate to intent management
    Then navigate to programs
    Then verify create program page "CCprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "CCTouchpoint"
    Then choose program from sheet "CCprogram"
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    Then verify rule created from sheet "rule"
    Then wait for "A" status of rule
    Then logout
    Then login with selenium user
    Then navigate to precision marketer
    Then navigate to reports
    Then navigate to customer support
    Then search msisdn "919491750000"  
  
    
    
    
