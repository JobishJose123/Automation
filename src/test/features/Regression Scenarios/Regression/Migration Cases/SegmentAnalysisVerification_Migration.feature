#Author: shobina.k@flytxt.com
#Summary :Segment Analysis Verification
@SegmentAnalysis_datasetup
Feature: Verification of Segment Analysis job(Migration)

@NDX-5654 @initBrowser @closeBrowser
Scenario: Find the Target count
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then find the Target count

@NDX-5549   @initBrowser  @closeBrowser
Scenario: Edit target condition of a Segment Analysis job(Migration) which
is in Completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then change the target condition to create and save
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5557 @initBrowser  @closeBrowser
Scenario: Edit target condition of a Segment Analysis job(Migration) which
is in Completed status. 
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then change the target condition to Saved Segment and save
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"

@NDX-5552 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job(Migration) by adding a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then add a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5567 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job(Migration) by deleting a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then delete a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5568 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job(Migration) by editing a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then edit a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"

@NDX-6353 @initBrowser @closeBrowser
Scenario: Create a BC with target condition as Saved Segment(saved from Micro-Segment)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition SegmentAnalysis from sheet "one-offBC" with "rechargeWap"
Then save bc


@NDX-5588 @initBrowser  @closeBrowser
Scenario: Rerun a Segment Analysis job(Migration)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Rerun the SegmentAnalysisJob
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


#@NDX-   @initBrowser  @closeBrowser
#Scenario: Edit a Micro-Segment for Segment Analysis Job(Migration) which is in Completed Status.
#Given login
#Then navigate to intent management
#Then navigate to analytics
#Then navigate to explore segments
#Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
#Then edit Micro-Segment
#Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
#Then wait until Segment Analysis job status is changed to "C"


@NDX-5570  @initBrowser  @closeBrowser
Scenario: Copy a Segment Analysis Job(Migration)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisCopy"
Then Copy the SegmentAnalysisJob
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5584 @initBrowser  
Scenario: Edit target condition of a Segment Analysis job_Copy(Migration) which
is in Completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then change the target condition to create and save
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5582 @initBrowser  @closeBrowser
Scenario: Edit target condition of a Segment Analysis job_Copy(Migration) which
is in Completed status. 
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then change the target condition to Saved Segment and save
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5574 @initBrowser @closeBrowser
Scenario: Edit a Segment Analysis job_Copy(Migration) by adding a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then add a KPI
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5580 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job_Copy(Migration) by deleting a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisName"
Then delete a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5576 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job_Copy(Migration) by editing a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then edit a KPI
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5651 @initBrowser  @closeBrowser
Scenario: Rerun a Segment Analysis job_Copy(Migration)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then Rerun the SegmentAnalysisJob
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


#@NDX-   @initBrowser  @closeBrowser
#Scenario: Edit a Micro-Segment for Segment Analysis job_Copy(Migration) which is in Completed Status.
#Given login
#Then navigate to intent management
#Then navigate to analytics
#Then navigate to explore segments
#Then filter the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
#Then edit Micro-Segment
#Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
#Then wait until Segment Analysis job status is changed to "C"


@NDX-5573 @initBrowser  @closeBrowser
Scenario: Delete a Segment Analysis Job(Migration)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisJobToDelete"
Then delete Segment Analysis job from sheet "SegmentAnalysisJobToDelete"













