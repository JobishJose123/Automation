#Author: shobina.k@flytxt.com
#Summary : New Model Creatiom

@SegmentAnalysis_datasetup
Feature: Verification of Segment Analysis job(Migration)

@NDX-5546
Scenario: Edit target condition of a Segment Analysis job(Migration) which
is in Completed status
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job "SegmentAnalysisName"
Then change the target condition to create and save


@NDX-5581
Scenario: Edit target condition of a Segment Analysis job(Migration) which
is in Completed status. 
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job "SegmentAnalysisName"
Then change the target condition to Saved Segment and save

@NDX-
Scenario: Edit a Segment Analysis job(Migration) by adding a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job "SegmentAnalysisName"
Then add a KPI

@NDX-
Scenario: Edit a Segment Analysis job(Migration) by deleting a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job "SegmentAnalysisName"
Then delete a KPI


@NDX-
Scenario: Edit a Segment Analysis job(Migration) by editing a KPI.
Given login
Then navigate to intent management
Then navigate to analytics
Then navigate to explore segments
Then edit the Segment Analysis job "SegmentAnalysisName"
Then edit a KPI