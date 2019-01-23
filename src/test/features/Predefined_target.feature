#Author: joel.jose@flytxt.com
@Feature-Predefinied_targets
Feature: Predefined Targets
  test cases with label Predefined_targets

  @NX-2738 @initBrowser
  Scenario: Predefined Targets - Create a predefined target -2738
    Given login
    Then navigate to precision marketer
    Then navigate to configuration
    Then navigate to saved segments
    Then create saved segment with condition "segmentAgeGT40TEMP"

  @NX-2739
  Scenario: Predefined Targets - Create a predefined target -2739
    Then edit saved segment with condition "segmentAgeGT40TEMP"
    Then pass next scenario based on this step

  @NX-2754
  Scenario: Predefined Targets - Viewing active predefined targets NX-2744
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-2745
  Scenario: Predefined Targets - Viewing active predefined targets NX-2744
    Then check previous step and pass this

  @NX-2761
  Scenario: Predefined Targets - Deactivate active predefined targets -2761
    Then deactivate saved segment with condition "segmentAgeGT40TEMP"

  @NX-2762
  Scenario: Predefined Targets - Activate inactive predefined targets -2762
    Then navigate to inactive segments
    Then activate saved segment with condition "segmentAgeGT40TEMP"
    Then navigate to active segments

  @NX-2752
  Scenario: Predefined Targets - Copy active predefined targets -2752
    Then copy saved segment with condition "segmentAgeGT40TEMP"

  @NX-2757
  Scenario: Predefined Targets - Create a predefined target -2757
    Then delete saved segment with condition "segmentAgeGT40TEMP"
    Then pass next scenario based on this step

  @NX-2744
  Scenario: Predefined Targets - Viewing active predefined targets NX-2744
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3340
  @closeBrowser
  Scenario: Predefined Targets - Filter active predefined targets - Filter by Name NX-3340
    Then check previous step and pass this

  @NX-2769 @initBrowser  @closeBrowser
  Scenario: Predefined Targets - Attaching a predefined target to a one-off BC. -2769
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "default"
    Then naigate to "default" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition segmentAgeGT40 from sheet "one-offBC" with "defaultrechargeWap"
    Then save bc
    Then view broadcast from sheet "one-offBC"
    Then check target condition "segmentAgeGT40"

  @NX-3310 @initBrowser  @closeBrowser
  Scenario: Predefined Targets - Attaching a predefined target to a recurring BC. -3310
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "default"
    Then naigate to "default" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition segmentAgeGT40 from sheet "recurringMonthBC" with "defaultrechargeWap"
    Then save bc
    Then navigate to "Recurring" broadcasts
    Then view broadcast from sheet "recurringMonthBC"
    Then check target condition "segmentAgeGT40"
    
     @NX-3311 @initBrowser  @closeBrowser
  Scenario: Predefined Targets - Attaching a predefined target to a seeding BC.. -3310
    Given login
    Then navigate to precision marketer
    Then navigate to life cycle marketing
    Then navigate to campaign category from sheet "default"
    Then naigate to "default" campaign view broadcasts
    Then click create new broadcast button
    Then enter details for new broadcast with condition segmentAgeGT40 from sheet "seedingRecurringBC" with "defaultseedingWAPoffer"
    Then save bc
    Then navigate to "Seeding" broadcasts
    Then view broadcast from sheet "seedingRecurringBC"
    Then check target condition "segmentAgeGT40"

    @NX-2747 @initBrowser 
  Scenario: Predefined targets - Attaching predefined targets to IAJ-2747
    Given login
    Then navigate to precision marketer
    Then navigate to analytics
    Then navigate to explore segments
		Then create SegmentAnalysis from sheet "SegmentAnalysisName" with condition "segmentAgeGT40"