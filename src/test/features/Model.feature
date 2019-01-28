#Author: shobina.k@flytxt.com
#Summary : New Model Creatiom


@NX-Models
Feature: Model Creation

@NDX-5444 @NDX-5456 @NDX-5466 @NDX-5464 @NDX-5463 @NDX-5454 @NDX-5455 @NDX-5457 @NDX-5458 @NDX-5459 @NDX-5460 @NDX-5461 @NDX-5452 @NDX-5450 @NDX-5465 @NDX-5442 @NDX-5440 @NDX-5443 @NDX-5462 @NDX-5451 @NDX-5449 @NDX-5448 @NDX-5447 @NDX-5446 @NDX-5445 @NDX-5441

@initBrowser 
Scenario Outline: Verify Model Creation for MODELS
Given login
Then navigate to InsightWorkbench
Then click on <MODEL_TYPE>
Then click on CreateNewModelButton
Then EnterThe ModelName "modelData"
Then Enter model input from file <INPUT> with <MODEL_TYPE> and "modelData"
Then click on Inputs
Then create a Dataframe "D2" with discription "test"
Then add a customer base list
Then wait until dataframeStatus is changed to "Dataframe Status: complete"
Then click on Close and run the paragraph
Then wait until status is changed to "FINISHED"
Then Verify model output from file <OUTPUT>


Examples:

|MODEL_TYPE|INPUT|OUTPUT|

|"Affinity"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Affinity"|"R_INPUT"|"R_OUTPUT"|

|"Behavioral Profiling"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Behavioral Profiling"|"R_INPUT"|"R_OUTPUT"|

|"Classification"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Classification"|"R_INPUT"|"R_OUTPUT"|

|"Clustering"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|   
|"Clustering"|"R_INPUT"|"R_OUTPUT"|

|"Forecasting"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Forecasting"|"R_INPUT"|"R_OUTPUT"|

|"Location"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Location"|"R_INPUT"|"R_OUTPUT"|

|"My Model"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"My Model"|"R_INPUT"|"R_OUTPUT"|

|"NBA & NBO"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"NBA & NBO"|"R_INPUT"|"R_OUTPUT"|

|"Pre-processing Techniques"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Pre-processing Techniques"|"R_INPUT"|"R_OUTPUT"|

|"Propensity"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Propensity"|"R_INPUT"|"R_OUTPUT"|

|"Text Analysis"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Text Analysis"|"R_INPUT"|"R_OUTPUT"|

|"Validation Techniques"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Validation Techniques"|"R_INPUT"|"R_OUTPUT"|

|"Visualization"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
|"Visualization"|"R_INPUT"|"R_OUTPUT"|

#

#@NX-7705
#@initBrowser 
#Scenario Outline: Verifying Templates
#Given login
#Then navigate to InsightWorkbench
#Then click on <MODEL_TYPE>
#Then click on Templates
#Then click on UseTemplate

