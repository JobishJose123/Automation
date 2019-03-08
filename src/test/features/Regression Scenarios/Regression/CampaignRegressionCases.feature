#Author: rahul.chandran@flytxt.com
#Keywords Summary : to create campaign for data setup
#DEPENDENCY- Run Feature file Datasetup/Campaign.feature
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>


@NDX-CampaignRegressionCases
Feature: Campaign Regression Cases


  @NDX-campaignEdit
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
    
Examples: 
  | Condition |
	| customerWasSentTheTrialMessage |
	| customerList                   |
    
    
