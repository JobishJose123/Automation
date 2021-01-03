#Author:shobina.k@flytxt.com
@NDX-iwbModelRegression
Feature: iwb model regression
               
@NDX-10234 @initBrowser @closeBrowser
Scenario: verify editing dataframe of a model
Given login
Then navigate to InsightWorkbench
Then filter the iwb job from sheet "IWBModelNamesWithPython" with model type "Behavioral Profiling"
Then click on Inputs
Then edit the job
Then click on Inputs
Then verify the edited changes are reflected

@NDX-10235 @initBrowser
Scenario: verify deleting a datafram of a model
Given login
Then navigate to InsightWorkbench
Then filter the iwb job from sheet "IWBModelNamesWithPython" with model type "Behavioral Profiling"
Then click on Inputs
Then delete the dataframe
Then verify the dataframe gets deleted

@NDX-10227 @initBrowser
Scenario: verify running a new model as per schedule
Given login
Then navigate to InsightWorkbench
Then filter the iwb job from sheet "IWBModelNamesWithPython" with model type "Affinity"
Then activate the model
