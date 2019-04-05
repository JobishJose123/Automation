#Author: your.email@your.domain.com
#Keywords Summary :
@NX-intentmanagemen
Feature: For IntentManagement Regression.


   	 @createprogramreg123 
    @NDX-7136, @NDX-7133, @NDX-7132, @NDX-7125, @NDX-5711,@NDX-5732
  @initBrowser
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

  @initBrowser @createprogramrulereg
  Scenario: Verify create a program rule
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then verify rule created from sheet "rule"
    Then navigate to programs
    Then choose program from sheet "APIprogram"
    Then create new rule from sheet "APIprogram" and offer "STVSMS" and touchpoint from sheet "apiTouchpointGR"
    Then verify rule created from sheet "rule"
    Then navigate to programs
    Then choose program from sheet "USSDprogram"
    Then create new rule from sheet "USSDprogram" and offer "STVSMS" and touchpoint from sheet "ussdTouchpoint"
    Then verify rule created from sheet "rule"
    Then navigate to programs
    Then choose program from sheet "CCprogram"
    Then create new rule from sheet "CCprogram" and offer "STVSMS" and touchpoint from sheet "CCTouchpoint"
    Then verify rule created from sheet "rule"
    Then navigate to programs

   @createprogrameditreg
  @NDX-7337,@NDX-7336,@NDX-7335,@NDX-5725,@NDX-7328,@NDX-7327,@NDX-7326,@NDX-5722,@NDX-7321,@NDX-7320,@NDX-7319,@NDX-5716,@NDX-5719 @NDX-7315 @NDX-7314 @NDX-7313
  @initBrowser
  Scenario: Verify create a program edit
    Given login
    Then navigate to landing page
    Then navigate to intent management
   
   Then navigate to programs
    Then choose program from sheet "SMSprogram" for edit
    Then verify edit program page "SMSprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "smsTouchpointedit"
    Then choose program from sheet "SMSprogram" after edited
    Then verify edited program page "SMSprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "smsTouchpointedit"

    Then navigate to programs
    Then choose program from sheet "APIprogram" for edit
    Then verify edit program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointedit"
  Then choose program from sheet "APIprogram" after edited
    Then verify edited program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointedit"
   
    Then navigate to programs
    Then choose program from sheet "USSDprogram" for edit
    Then verify edit program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpointedit"
    Then choose program from sheet "USSDprogram" after edited
    Then verify edited program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpointedit"
    Then navigate to programs
 
    Then choose program from sheet "CCprogram" for edit
    Then verify edit program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ccTouchpointedit"
    Then choose program from sheet "CCprogram" after edited
    Then verify edited program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ccTouchpointedit"

  @initBrowser @createprogramdelete12
  @NDX-5729
  Scenario: Verify create a program delete
    Given login
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "programdelete" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then verify delete a program "programdelete"
    
    
      @initBrowser @programruleview11
      @NDX-5739, @NDX-5740
  Scenario: Verify program rule view
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then verify rule created from sheet "rule"
    Then verify rule view from sheet "rule" and product "fullDetails"
    
       
    @initBrowser @programruledeactivatereg
    @NDX-5755, @NDX-5752
  Scenario: Verify program rule deactivate
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then wait for 5 minutes
    Then verify rule deactivate
    
    @initBrowser @programrulecopy11
    @NDX-6894 @NDX-6321
  Scenario: Verify program rule copy
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
		
		
		@initBrowser @programruleeditreg
    @NDX-5755, @NDX-5752,@NDX-6319,@NDX-6317,@NDX-6073	
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
#	| customerWasSentTheTrialMessage |
#	| customerList                   |
	| SharedcustomerList             |

	
	@initBrowser @programruleeditreg
    @NDX-5755, @NDX-5752 @NDX-5818S
  Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	
	@initBrowser @programruleeditreg
    @NDX-5755, @NDX-5752,@NDX-5824,@NDX-5814	
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
	
	
		@initBrowser @programruleeditreg123
    @NDX-5755, @NDX-5752,@NDX-5822,@NDX-5820	
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
#    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
#      | conditionForOROperation |
		| IMEventsOfferRecommended |
	|IMEventsOfferDeclined|
	

   @initBrowser @programrulecopyedit11
@NDX-6908, @NDX-6906, @NDX-6904 @NDX-5818
@NDX-6902, @NDX-6900, @NDX-6898, @NDX-6350, @NDX-6897, @NDX-6338
 Scenario Outline: Verify program rule copy edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
		   Then navigate to programs
		 Then choose program from sheet "SMSprogram"
      Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
    
        Examples: 
      | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
	| SharedcustomerList             |
	| customerDrivenEvent            |
	| usageMetric                    |
	| sharedMetricOtherPartner  |
	| customerDrivenEventNotOccurred  |
	| customerWasSentTheTrialMessageNOtOccurred |
	| conditionForANDOperation |
#	| conditionForOROperation |



		@initBrowser @programruleeditnone
    @NDX-6336, @NDX-6334, @NDX-6332, @NDX-6330, @NDX-6327
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
    Then create new rule from sheet "SMSprogram" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint"
    Then edit the targetSelection <Condition> for programrule
    Then verify rule target selection <Condition> after edit from sheet "rule" and product "fullDetails"
    
       Examples: 
      | Condition |
      | None     |
      | Create        |
      | SavedSegments |
      | None          |
      | SavedSegments |
      | Create        |

    
    
    
