Feature: Partner Creation 

@NDX-13700
@initBrowser 
Scenario: Verify partner creation
Given login 
Then navigate to configuration management 
Then click on partners
Then right click 'System GLobal' partner and select Add Subpartner
Then create a partner from sheet "partner" with partner type "other"
Then  click on Save
Then verify the partner creation

@NDX
@initBrowser 
Scenario: Verify Banking partner creation
Given login 
Then navigate to configuration management 
Then click on partners
Then right click 'System GLobal' partner and select Add Subpartner
Then create a partner from sheet "partner" with partner type "other"
Then  click on Save
Then verify the partner creation