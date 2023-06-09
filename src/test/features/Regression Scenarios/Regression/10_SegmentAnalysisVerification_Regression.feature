#Author: shobina.k@flytxt.com
#Summary :Segment Analysis Verification
#total scenario: 20
@SegmentAnalysis_Regression
Feature: Verification of Segment Analysis job(Regression)

@NDX-5654 @initBrowser @closeBrowser
Scenario: Find the Target count
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then find the Target count


@NDX-viewdetails @initBrowser @closeBrowser
Scenario: Create Micro-Segment for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then navigate to created micro-segments
Then verify the view details option

@NDX-10209 @NDX-10208 @initBrowser
Scenario: Verify running a broadcast using the discovered cluster list from SAJ created 
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then click on cluster option
Then save the cluster as discovered cluster  
Then close the cluster details
Then navigate to landing page
Then navigate to data foundation
Then navigate to discovered clusters
Then wait for 2 minutes
Then verify the list in discovered cluster
Then navigate to landing page 
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast from sheet with clusters "one-offBC" with "rechargeSMS"


@NDX-5546  @initBrowser  @closeBrowser
Scenario: Edit target condition of a Segment Analysis job(Regression) which
is in Completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then change the target condition to create and save
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5581 @initBrowser  @closeBrowser
Scenario: Edit target condition of a Segment Analysis job(Regression) which
is in Completed status. 
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then change the target condition to Saved Segment and save
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"

@NDX-5553 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job(Regression) by adding a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then add a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5566 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job(Regression) by deleting a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then delete a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5569 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job(Regression) by editing a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job from sheet "SegmentAnalysisName"
Then edit a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"

@NDX-6352 @initBrowser @closeBrowser
Scenario: Create a BC with target condition as Saved Segment(saved from Micro-Segment)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition SegmentAnalysis from sheet "one-offBC" with "rechargeWap"
Then save bc


@NDX-5587 @initBrowser  @closeBrowser
Scenario: Rerun a Segment Analysis job(Regression)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Rerun the SegmentAnalysisJob
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


#@NDX-   @initBrowser  @closeBrowser
#Scenario: Edit a Micro-Segment for Segment Analysis Job(Regression) which is in Completed Status.
#Given login
#Then navigate to intent management
#Then navigate to analytics
#Then navigate to explore segments
#Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
#Then edit Micro-Segment
#Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
#Then wait until Segment Analysis job status is changed to "C"


@NDX-5571  @initBrowser  @closeBrowser
Scenario: Copy a Segment Analysis Job(Regression)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisCopy"
Then Copy the SegmentAnalysisJob
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"

@NDX-10196
@initBrowser
Scenario:  Copy a segment analysis job and change the target list and verify
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then change targetlist 
Then save iaj job
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5583 @initBrowser  
Scenario: Edit target condition of a Segment Analysis job_Copy(Regression) which
is in Completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then change the target condition to create and save
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5556 @initBrowser  @closeBrowser
Scenario: Edit target condition of a Segment Analysis job_Copy(Regression) which
is in Completed status. 
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then change the target condition to Saved Segment and save
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5575 @initBrowser @closeBrowser
Scenario: Edit a Segment Analysis job_Copy(Regression) by adding a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then add a KPI
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5579  @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job_Copy(Regression) by deleting a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then delete a KPI
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5577 @initBrowser  @closeBrowser
Scenario: Edit a Segment Analysis job_Copy(Regression) by editing a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job Copy from sheet "SegmentAnalysisCopy"
Then edit a KPI
Then filter the Segment Analysis Copy  for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5652 @initBrowser  @closeBrowser
Scenario: Rerun a Segment Analysis job_Copy(Regression)
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


@NDX-5572  @initBrowser  @closeBrowser
Scenario: Delete a Segment Analysis Job(Regression)
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisJobToDelete"
Then delete Segment Analysis job from sheet "SegmentAnalysisJobToDelete"













