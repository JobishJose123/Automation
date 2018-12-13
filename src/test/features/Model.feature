#Author: shobina.k@flytxt.com
#Summary : New Model Creatiom


@NX-Models
Feature: Model Creation

@NX-5440
@initBrowser
Scenario Outline: Verify Model Creation for MODELS
Given login
Then navigate to InsightWorkbench
Then click on <MODEL_TYPE>
Then click on CreateNewModelButton
Then EnterThe ModelName "modelData"
Then Enter model input from file <INPUT> 
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



#@NX-7705
#@initBrowser 
#Scenario Outline: Verifying Templates
#Given login
#Then navigate to InsightWorkbench
#Then click on <MODEL_TYPE>
#Then click on Templates
#Then click on UseTemplate
 #
#Examples:
#
#|MODEL_TYPE|INPUT|OUTPUT|
#|"Affinity"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Affinity"|"R INPUT"|"R OUTPUT"|

#|"Behavioral Profiling"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Behavioral Profiling"|"R INPUT"|"R OUTPUT"|
#
#|"Classification"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Classification"|"R INPUT"|"R OUTPUT"|
#
#|"Clustering"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Clustering"|"R INPUT"|"R OUTPUT"|
#
#|"Forecasting"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Forecasting"|"R INPUT"|"R OUTPUT"|
#
#|"Location"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Location"|"R INPUT"|"R OUTPUT"|
#
#|"My Model"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"My Model"|"R INPUT"|"R OUTPUT"|
#
#|"NBA & NBO"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"NBA & NBO"|"R INPUT"|"R OUTPUT"|
#
#|"Pre-processing Techniques"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Pre-processing Techniques"|"R INPUT"|"R OUTPUT"|
#
#|"Propensity"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Propensity"|"R INPUT"|"R OUTPUT"|
#
#|"Text Analysis"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Text Analysis"|"R INPUT"|"R OUTPUT"|
#
#|"Validation Techniques"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Validation Techniques"|"R INPUT"|"R OUTPUT"|
#
#|"Visualization"|"PYTHON_INPUT"|"PYTHON_OUTPUT"|
#|"Visualization"|"R INPUT"|"R OUTPUT"|
