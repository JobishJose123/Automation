#Author: rahul.chandran@flytxt.com
#Keywords Summary : to create campaign for data setup
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Total scenarios: 16
@NDX-CampaignMigrationCases
Feature: Campaign Migration Cases


  @NDX-5502, @NDX-5507, @NDX-5508, @NDX-5512, @NDX-5526, @NDX-5529 
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
     
@NDX-5497, @NDX-5499
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
 
    
    
@NDX-5555
@initBrowser @closeBrowser
Scenario: Verify pausing a campaign
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "CampaignForPause" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeWAP"
Then activate bc
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then pause campaign from sheet "CampaignForPause"
Then wait until campaign from sheet "CampaignForAbort" status is "Paused"
Then naigate to "CampaignForPause" campaign view broadcasts
Then wait until status of "one-offBC" is "Paused"



@NDX-5559
@initBrowser @closeBrowser
Scenario: Verify aborting a campaign
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "CampaignForAbort" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition digitalPersonaGT15 from sheet "one-offBC" with "rechargeWAP"
Then activate bc
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then abort campaign from sheet "CampaignForAbort"
Then wait until campaign from sheet "CampaignForAbort" status is "Aborted"
Then naigate to "CampaignForAbort" campaign view broadcasts
Then wait until status of "one-offBC" is "Aborted"

@NDX-5551
@initBrowser @closeBrowser
Scenario: Verify show history of a campaign
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategoryShowHistory"
Then verify campaign status waiting for approval from sheet "CampaignForShowHistory" of file "campaignInputData"
Then verify "Submitted for Approval" status is in show history
Then Logout from Neon application
Then login with selenium user
Then click on notification bell
Then click on view all notifications
Then click Review on notification from the sheet "CampaignForShowHistory" of file "campaignInputData"
Then approve campaign by selenium user
Then Logout from Neon application
Then login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategoryShowHistory"
Then verify "Approved" status is in show history

@NDX-5531 @NDX-5525 @NDX-5516 @NDX-5514 @NDX-5507 @NDX-5505
@initBrowser
Scenario Outline: Edit the target condition for the camapign template
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then navigate to campaign template
Then filter the campaign template from sheet "CampaignTemplate"
Then edit the campaign template with target condition <condition>
Then filter the campaign template from sheet "CampaignTemplate"
Then verify the camapign template edited with condition <condition> are reflected
Examples:
|condition|
    |digitalPersonaGT15|
#    |customerDemographicsGT25|
#    |learnedBehaviourGT35|
#    |analyticalScoresGT45|
#    |digitalEngagementGT235|
#    |customerLocationInsightsGT5|
#    |customerList|
#    |discoveredClusters200|
#    |customerDrivenEvent|
#    |usageMetric|
#    |eventCounts|
#    |revenueMetric|
