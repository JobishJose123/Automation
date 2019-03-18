#Author: rahul.chandran@flytxt.com
#Keywords Summary : to create campaign for data setup
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>


@NDX-CampaignRegressionCases
Feature: Campaign Regression Cases


  @NDX-5500, @NDX-5500, @NDX-5511, @NDX-5518, @NDX-5527, @NDX-5528, @NDX-8011 
  @initBrowser 
  Scenario Outline: Verify Editing campaign with target condition <Condition>
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then click on Campaign edit button from sheet "campaignBC"
    Then edit the campaign with taget condition <Condition>
    Then click on Campaign view button from sheet "campaignBC"
    Then verify the target conditions from Broadcast View and condition <Condition>
    #Target condition verification is same in both BC and Campaign page,above function is actually verifying in campaign page 
    
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
     
@NDX-5496, @NDX-5498
  @initBrowser 
  Scenario: Verify Editing campaign recurruence and shedule
    Given login
    When navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "campaignCategory"
    Then click on Campaign edit button from sheet "recurringcampaign"
    Then edit the campaign recurrece from sheet "recurringcampaign"
    Then click on Campaign view button from sheet "recurringcampaign"
    Then verify the campaign recurrece from sheet "recurringcampaign"
  