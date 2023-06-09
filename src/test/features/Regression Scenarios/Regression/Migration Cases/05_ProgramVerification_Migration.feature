#Author: your.email@your.domain.com
#Keywords Summary :
#Total scenarios:  17
@NX-IMUICases_Migration
Feature: For IntentManagement Regression.

@NDX-7337,@NDX-7336,@NDX-7335,@NDX-5725,@NDX-7328,@NDX-7327,@NDX-7326,@NDX-5722,@NDX-7321,@NDX-7320,@NDX-7319,@NDX-5716,@NDX-5719 @NDX-7315 @NDX-7314 @NDX-7313
@NDX-5739, @NDX-5740 @initBrowser
Scenario: Verify create a program edit
Then filter program and rule created from sheet "SMSprogram" and offer "rechargeSMS" of excelfile "IMdata"
Given login
Then navigate to landing page
Then navigate to intent management        
Then navigate to programs
Then filter im program from sheet "SMSprogram"
Then edit program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpointedit"
Then filter program from sheet "SMSprogram" after edited
Then verify edited program page "SMSprogram" and offer catalog sheet "defaultCatalog" and touchpoint from sheet "smsTouchpointedit"
Then "view rule" of im program or rule
Then filter rule from sheet "SMSprogram"
Then "edit rule" of im program or rule
Then edit the rule from sheet "SMSprogram" and product from sheet "fullDetails" and offer from sheet "STVSMS"  and touchpoint from sheet "smsTouchpointedit"
Then "save" rule
Then filter condition edited rule from sheet "SMSProgram"
Then "view rule" of im program or rule
Then verify the edited changes of the rule from sheet "SMSprogram" and product from sheet "fullDetails" and offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpointedit"

 @NDX-5729   @initBrowser
Scenario: Verify create a program delete
Given login
Then navigate to intent management
Then navigate to programs
Then filter im program from sheet "programdelete"
Then verify delete a program "programdelete"


@NDX-5755, @NDX-5752 @NDX-10117	@initBrowser
Scenario: Verify program rule deactivate
Then filter program and rule created from sheet "CCprogram" and offer "rechargeSMS" of excelfile "IMdata"
Given login
Then navigate to landing page
Then navigate to intent management
Then navigate to programs
Then filter im program from sheet "CCprogram"
Then filter rule from sheet "CCprogram"
Then verify rule deactivate
    
@initBrowser
@NDX-6894, @NDX-6321, @NDX-5739, @NDX-5740 @initBrowser
Scenario: Verify program rule copy
Then filter program and rule created from sheet "SMSprogram" and offer "STVSMS" of excelfile "IMdata"
Given login
Then navigate to intent management
Then navigate to programs
Then filter im program from sheet "SMSprogram"
Then "view rule" of im program or rule
Then filter rule from sheet "SMSprogram"
Then "copy" of im program or rule
Then copy the existing rule from sheet "SMSprogram" and save
Then filter condition copy rule from sheet "SMSProgram"
Then "view rule" of im program or rule
Then verify copied rule from sheet "SMSprogram" and product from sheet "fullDetails" and offer from sheet "STVSMS" and touchpoint from sheet "smsTouchpointedit"
		
			
@initBrowser 
@NDX-9984 @NDX-5755 @NDX-5752 @NDX-6319 @NDX-6317 @NDX-6073
Scenario Outline: Verify program rule edit <Condition>
Then filter program and rule created from sheet "APIprogram" and offer "rechargeSMS" of excelfile "IMdata"
Given login
Then navigate to landing page
Then navigate to intent management
Then navigate to programs
Then filter im program from sheet "APIprogram"
Then "view rule" of im program or rule
Then filter rule from sheet "APIprogram"
Then "edit rule" of im program or rule
Then edit new rule from sheet "APIprogram" with taget condition <Condition>
Then "save" rule
Then filter rule from sheet "APIprogram"
Then "view rule" of im program or rule
Then verify target condition <Condition>
   
Examples: 
| Condition |
| customerWasSentTheTrialMessage |
| customerList|
| SharedcustomerList|
| customerDrivenEvent|
| usageMetric |
| sharedMetricOtherPartner|
| customerDrivenEventNotOccurred  |
| customerWasSentTheTrialMessageNOtOccurred |
| conditionForANDOperation |
| conditionForOROperation |
| IMEventsOfferRecommended |
|IMEventsOfferDeclined|


#	@initBrowser @programruleeditreg
#    @NDX-5755, @NDX-5752,@NDX-5824,@NDX-5814	
#      Scenario Outline: Verify program rule edit <Condition>
#    Given login
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#   
#    Then choose program from sheet "SMSprogram" after edited
#    Then choose rule from sheet "SMSprogram"
#    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
#    Then verify rule view after edit from sheet "rule" and product "fullDetails"
#   
#    Examples: 
#      | Condition |
#	| customerDrivenEventNotOccurred  |
#	| customerWasSentTheTrialMessageNOtOccurred |
#	| conditionForANDOperation |
#	
#	
#		@initBrowser @programruleeditreg123
#		@NDX-9986
#    @NDX-5755, @NDX-5752,@NDX-5822,@NDX-5820	
#      Scenario Outline: Verify program rule edit <Condition>
#    Given login
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#   
#    Then choose program from sheet "SMSprogram" after edited
#    Then choose rule from sheet "SMSprogram"
#    Then edit new rule from sheet "rule" and offer "STVSMS" and touchpoint from sheet "smsTouchpoint" with taget condition <Condition>
#    Then verify rule view after edit from sheet "rule" and product "fullDetails"
#   
#    Examples: 
#      	| Condition |
#      	| conditionForOROperation |
#		| IMEventsOfferRecommended |
#		|IMEventsOfferDeclined|
#	
#
#   @initBrowser @programrulecopyedit11 @NDX-10116
#@NDX-6908, @NDX-6906, @NDX-6904 @NDX-5818
#@NDX-6902, @NDX-6900, @NDX-6898, @NDX-6350, @NDX-6897, @NDX-6338
# Scenario Outline: Verify program rule copy edit <Condition>
#    Given login
#    Then filter program and rule created from sheet "CCprogram" and offer "Recharge"
#    Then navigate to landing page
#    Then navigate to intent management
#    Then navigate to programs
#    Then choose program from sheet "SMSprogram" after edited
#    Then choose rule from sheet "CCprogram"
#	Then verify rule Copy from sheet "rule" with product sheet "fullDetails" and product class sheet "TestProductClass"
#	Then navigate to programs
#	Then choose program from sheet "SMSprogram" after edited
# 	Then edit the targetSelection <Condition> for programrule
#    Then verify rule target selection <Condition> after edit from sheet "rule" and product "fullDetails"
#    
#        Examples: 
#      | Condition |
#	  | customerWasSentTheTrialMessage |
#	  | customerList                   |
#	  | SharedcustomerList             |
#	  | customerDrivenEvent            |
#	  | usageMetric                    |
#	  | sharedMetricOtherPartner       |
#	  | customerDrivenEventNotOccurred |
#	  | customerWasSentTheTrialMessageNOtOccurred |
#	  | conditionForANDOperation |
#	  | conditionForOROperation |
#


@NDX-6336 @NDX-6334 @NDX-6332 @NDX-6330 @NDX-6327 @initBrowser 
Scenario Outline: Verify program rule edit <Condition>
Given login
Then filter program and rule created from sheet "APIprogram" and offer "STVSMS" of excelfile "IMdata"
Then navigate to landing page
Then navigate to intent management
Then navigate to programs
Then filter im program from sheet "APIprogram"
Then "view rule" of im program or rule
Then filter rule from sheet "APIprogram"
Then "edit rule" of im program or rule
Then edit the targetSelection <Condition> for programrule
Then verify rule target selection <Condition> after edit from sheet "rule" and product "fullDetails"
Examples: 
| Condition |
| Create        |
| SavedSegments |

      
   
      	
