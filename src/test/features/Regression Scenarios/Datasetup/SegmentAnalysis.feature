#Author: shobina.k@flytxt.com
#Summary : Segment Analysis Creation


@NX-SegmentAnalysis
Feature: Segment Analysis Creation

@NDX-5542 @initBrowser
Scenario: Verify Segment Analysis Creation
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then create SegmentAnalysis from sheet "SegmentAnalysisName"
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisName"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5639 @initBrowser
Scenario: Create Micro-Segment for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Create Micro Segment
Then save the Micro Segment



@NDX-5646 @NDX-5645    @initBrowser
Scenario: Create Cross-Tab for a for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Create Cross-Tab



@NDX-5694    @initBrowser
Scenario: Create Cluster for a for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then click on cluster option
Then click on create new cluster button
Then enter view values for cluster
Then select radio button for view1
Then select radio button for view2
Then click save cluster button
Then wait until status of cluster is complete


@NDX-5542 @initBrowser
Scenario: Verify Segment Analysis Creation
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then create SegmentAnalysis from sheet "SegmentAnalysisCopy"
Then filter the Segment Analysis job for status check from sheet "SegmentAnalysisCopy"
Then wait until Segment Analysis job status is changed to "C"


@NDX-5639 @initBrowser
Scenario: Create Micro-Segment for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisCopy"
Then Create Micro Segment
Then save the Micro Segment 


@NDX-6352 @initBrowser
Scenario: Create a BC with target condition as Saved Segment(saved from Micro-Segment)
Given login
Then navigate to precision marketer
Then navigate to life cycle marketing
Then navigate to campaign category from sheet "campaignCategory"
Then naigate to "campaignBC" campaign view broadcasts
Then click create new broadcast button
Then enter details for new broadcast with condition SegmentAnalysis from sheet "one-offBC" with "rechargeWap"
Then save bc




@NDX-5646    @initBrowser
Scenario: Create Cross-Tab for a for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisCopy"
Then Create Cross-Tab


@NDX-5694   @initBrowser
Scenario: Create Cluster for a for a job which is in completed status

Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then click on create new cluster button
Then enter view values for cluster
Then select radio button for view1
Then select radio button for view2
Then click save cluster button
Then wait until status of cluster is complete
    


