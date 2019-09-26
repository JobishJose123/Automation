#Author: shobina.k@flytxt.com
#Summary : New Model Creation
@NX-Models
Feature: Model Creation
@NDX-5444 @NDX-5456 @NDX-5466 @NDX-5464 @NDX-5463 @NDX-5454 @NDX-5455 @NDX-5457 @NDX-5458 @NDX-5459 @NDX-5460 @NDX-5461 @NDX-5452 @NDX-5450 @NDX-5465 @NDX-5442 @NDX-5440 @NDX-5443 @NDX-5462 @NDX-5451 @NDX-5449 @NDX-5448 @NDX-5447 @NDX-5446 @NDX-5445 @NDX-5441
@initBrowser @closeBrowser
Scenario Outline: Verify Model Creation for MODELS <MODEL_TYPE>
Given login
Then navigate to InsightWorkbench
Then click on <MODEL_TYPE>
Then click on create new model button
Then enter the model name "modelData"
Then enter model input from file <INPUT> with <MODEL_TYPE> and "modelData"
Then click on Inputs
Then create a Dataframe "selenium dataframe" with discription "dataframe created by Selenium"
Then add a customer base list
#Then wait until dataframeStatus is changed to "Dataframe Status: complete"
Then click on close and run the paragraph
Then wait until status is changed to "FINISHED"
#Then verify model output from file <OUTPUT>
Then add the model name from sheet "modelData" and <MODEL_TYPE>  to sheet "<iwbDetails>"


Examples:
|MODEL_TYPE|INPUT|OUTPUT|iwbDetails|
#|"Affinity"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Affinity"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
|"Behavioral Profiling"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Behavioral Profiling"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
|"Classification"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Classification"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Clustering"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|  
#|"Clustering"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Forecasting"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Forecasting"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Location"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Location"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"My Model"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"My Model"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"NBA & NBO"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"NBA & NBO"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Pre-processing Techniques"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Pre-processing Techniques"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Propensity"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Propensity"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Text Analysis"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Text Analysis"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Validation Techniques"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Validation Techniques"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|
#|"Visualization"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|IWBModelNamesWithPython|
#|"Visualization"|"R_INPUT"|"R_OUTPUT"|IWBModelNamesWithR|

##
#
##@NX-7705
##@initBrowser 
##Scenario Outline: Verifying Templates
##Given login
##Then navigate to InsightWorkbench
##Then click on <MODEL_TYPE>
##Then click on Templates
##Then click on UseTemplate
#
