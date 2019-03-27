#Author: your.email@your.domain.com
#Keywords Summary :
@NX-intentmanagemen
Feature: For IntentManagement Regression.

   @createprogramedit
 @NDX-5742,@NDX-5755,@NDX-5740,@NDX-7333,@NDX-7334,@NDX-7332,@NDX-5726,@NDX-7330,@NDX-7331,@NDX-7329,@NDX-5723,@NDX-7130,@NDX-7317,@NDX-7318,@NDX-7316,@NDX-5720
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
    Then verify edit program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointGR"
    Then choose program from sheet "APIprogram" after edited
    Then verify edited program page "APIprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "apiTouchpointedit"
   
    Then navigate to programs
    Then choose program from sheet "USSDprogram" for edit
    Then verify edit program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpoint"
    Then choose program from sheet "USSDprogram" after edited
    Then verify edited program page "USSDprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ussdTouchpointedit"
    Then navigate to programs
  
    Then choose program from sheet "CCprogram" for edit
    Then verify edit program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "CCTouchpoint"
    Then choose program from sheet "CCprogram" after edited
    Then verify edited program page "CCprogram" and offer catalog sheet "stvoffer" and touchpoint from sheet "ccTouchpointedit"

  @initBrowser @createprogramdelete
  @NDX-5729
  Scenario: Verify create a program delete
    Given login
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    Then choose program from sheet "programdelete"
    Then verify delete a program "programdelete"
    
    
      @initBrowser @programruleview
      @NDX-5739, @NDX-5740
  Scenario: Verify program rule view
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
   
    Then choose program from sheet "SMSprogram"
    
    Then verify rule created from sheet "rule"
    Then verify rule view from sheet "rule" and product "fullDetails"
    
       
    @initBrowser @programruledeactivate
    @NDX-5755, @NDX-5752
  Scenario: Verify program rule deactivate
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    Then click create program button
    
    Then choose program from sheet "SMSprogram"
    
    Then wait for 5 minutes
    Then verify rule deactivate
    
    @initBrowser @programrulecopy
    @NDX-6894
  Scenario: Verify program rule copy
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
   
		Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
		
		
		@initBrowser @programruleeditreg
    @NDX-5755, @NDX-5752
  Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
   
    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
    Then verify rule view after edit from sheet "rule" and product "fullDetails"
   
    Examples: 
      | Condition |
#	| customerWasSentTheTrialMessage |
#	| customerList                   |
#	| SharedcustomerList             |
#	| customerDrivenEvent            |
#	| usageMetric                    |
#	| sharedMetricOtherPartner  |
#	| customerDrivenEventNotOccurred  |
#	| customerWasSentTheTrialMessageNOtOccurred |
#	| conditionForANDOperation |
#	| conditionForOROperation |
#	| segmentAgeGT40                 |
	|System_Event_Occured|
	|System_Event_not_Occured|
	|user_Event_not_Occured|
	|user_Event_Occured|

   @initBrowser @programrulecopyedit
@NDX-6909,@NDX-6907,@NDX-6905,@NDX-6903,@NDX-6901,@NDX-6899,@NDX-6896,@NDX-6349,@NDX-6337,@NDX-6335,@NDX-6333,@NDX-6331,@NDX-6329,@NDX-6326,@NDX-6324
 Scenario Outline: Verify program rule copy edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
   
    Then choose program from sheet "SMSprogram"
   
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
	| conditionForOROperation |
	| segmentAgeGT40                 |


		@initBrowser @programruleeditnone
    @NDX-6336, @NDX-6334, @NDX-6332, @NDX-6330, @NDX-6327
      Scenario Outline: Verify program rule edit <Condition>
    Given login
    Then navigate to landing page
    Then navigate to intent management
    Then navigate to programs
    #Then click create program button
    #Then verify create program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpoint"
    Then choose program from sheet "SMSprogram"
  
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

    
    

    
