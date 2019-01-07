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
Then wait until status is changed to "C"


@NDX-5639 @initBrowser
Scenario: Create a Micro-Segment for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Create Micro Segment
Then wait until status is changed to "C"

@NDX-5645    @initBrowser
Scenario: Create a Cross-Tab for a for a job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Create Cross-Tab
Then wait until status is changed to "P"

@NDX-    @initBrowser
Scenario: Create Cluster for a Segment Analysis Job which is in completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then filter the Segment Analysis job from sheet "SegmentAnalysisName"
Then Create Cluster
Then wait until Cluster Status is changed to "Completed"
Then wait until status is changed to "C"
