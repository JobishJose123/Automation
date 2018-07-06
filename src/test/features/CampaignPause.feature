#Author: joel.jose@flytxt.com
#Keywords Summary : checking campaign pause


@NXCampaignPause
Feature: campaign pause

  @NX-8712 @initBrowser
  Scenario: Verify whether pause option is available for active  campaigns NX-8712
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
		Then navigate to campaign category from sheet "CampaignCategory"
    Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
    Then verify pause and resume option for campaign
    Then pause campaign from sheet "campaignBC"
    
     @NX-8779
  Scenario: Verify creation of BC when the campaign Is paused NX-8779
    Then naigate to "campaignBC" campaign view broadcasts
    Then click create new broadcast button
		Then enter details for new broadcast from sheet "seedingTriggerableBC" with "seedingWAPoffer"
		Then verify activating bc in paused campaign
		Then pass next scenario based on this step

  @NX-8713
  Scenario: Verify whether status of the campaigns is changed when it is paused NX-8713
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-8714
  Scenario: Verify whether resume option is available for paused campaigns NX-8714
    Then check previous step and pass this
		
		@NX-8715
@initBrowser 
Scenario: Verify whether Pause/Resume option is available for Recurring triggerable BC NX-8715
Given login
Then navigate to precision marketer
 Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "rechargeWAP" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "rechargeWAP" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringTriggerable" with "rechargeWAP"
Then activate bc
Then navigate to "Recurring" broadcasts
Then pause bc from sheet "recurringTriggerable"
Then resume bc from sheet "recurringTriggerable"

@NX-8716
@initBrowser 
Scenario: Verify whether Pause/Resume option is available for Recurring triggerable BC NX-8716
Given login
Then navigate to precision marketer
 Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "seedingRecurringBC" with "seedingWAPoffer"
Then activate bc
Then navigate to "Seeding" broadcasts
Then pause bc from sheet "seedingRecurringBC"
Then resume bc from sheet "seedingRecurringBC"

@NX-8717
@initBrowser 
Scenario: Verify whether Pause/Resume option is available for Recurring triggerable BC NX-8717
Given login
Then navigate to precision marketer
 Then navigate to offer management
    Then navigate to offers
    Then click on create new ofer button
    Then create new offer from sheet "seedingWAPoffer" with product "fullDetails"
    Then navigate to offer management 
	  Then Navigate to Offer Catalogue
    Then Create New Offer Catalogue from sheet "defaultCatalog"
    Then Add "seedingWAPoffer" offer to Offer Catalogue
    Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "seedingTriggerableRecurringBC" with "seedingWAPoffer"
Then activate bc
Then navigate to "Seeding" broadcasts
Then pause bc from sheet "seedingTriggerableRecurringBC"
Then resume bc from sheet "seedingTriggerableRecurringBC"		

@NX-8718
@initBrowser 
Scenario: Verify whether Pause/Resume option is available for Recurring triggerable BC NX-8718
Given login
Then navigate to precision marketer
Then navigate to offer management
Then navigate to offers
Then create new offer from sheet "rechargeWAP" with product "fullDetails"
Then navigate to offer management
Then Navigate to Offer Catalogue
Then Create New Offer Catalogue from sheet "defaultCatalog"
Then Add "rechargeWAP" offer to Offer Catalogue
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then create new campaign from sheet "campaignBC" with catalog "defaultCatalog"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet "recurringBC" with "rechargeWAP"
Then activate bc
Then navigate to "Recurring" broadcasts
Then pause bc from sheet "recurringBC"
Then resume bc from sheet "recurringBC"	
Then pass next scenario based on this step	

@NX-1273
@initBrowser 
Scenario: Broadcast grid: Verify the Pause option of the BC BC NX-1273
 Then check previous step and pass this
