#Author: shobina.k@flytxt.com
#Summary : Segment Analysis Creation


@NX-SegmentAnalysis
Feature: Segment Analysis Creation

@NX-5570 @initBrowser @CloseBrowser
Scenario: Verify Segment Analysis Creation
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then create SegmentAnalysis "SegmentAnalysisName"