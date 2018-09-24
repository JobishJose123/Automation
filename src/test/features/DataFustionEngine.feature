#Author: rahul.chandran@flytxt.com
#Keywords Summary : DK Test cases
@NX-DK
Feature: DK

#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@NX-4468
@initBrowser @closeBrowser
Scenario: DK--->Verify the functionality of Save option
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create a DK Job from sheet "Jobinput" and verify "2" in ouput

@NX-4465
@initBrowser @closeBrowser
Scenario: DK--->Verify the functionality of Copy option
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create a DK Job from sheet "Jobinput" and verify "2" in ouput
Then copy the job from sheet "Jobinput"

@NX-4466 
@initBrowser @closeBrowser
Scenario: DK--->Verify the functionality of Delete option
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create a DK Job from sheet "Jobinput" and verify "2" in ouput
Then delete the job from sheet "Jobinput"


@NX-4464 
@initBrowser @closeBrowser
Scenario: DK--->Verify the functionality of Edit option
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create a DK Job from sheet "Jobinput" and verify "2" in ouput
Then edit the job from sheet "Jobinput"

@NX-4390
@initBrowser @closeBrowser
Scenario: DK--->Verify the functionality of delimiter block using extract from file name
Given login
#Then random registration list is generated
#Then random dnd list is generated
Then create dk jobs for cheking delimiter from sheet "Delimiter_4390"
Then navigate to data foundation
Then click Data Fusion Engine
Then Open DK Job from sheet "Delimiter_4390" and verify "2" in ouput

@NX-4383
@initBrowser
Scenario: DK--->verify the functionality of skip exception block.
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking skip exception from sheet "skipexception"
Then Open DK Job from sheet and verify skip exception "skipexception"

@NX-3492
@initBrowser
Scenario: DK --> Verify the working of String value extraction from a filename
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for cheking filename Extraction from sheet "filenameextraction"
Then open DK Job from sheet and verify job Operations of sheet "filenameextraction" and file "Exception_input.txt" with data "Exception_input" with key "filenameextraction"


@NX-4374
@initBrowser @closeBrowser
Scenario: DK --> Verify the functionality of extractLeading operator in Dynamic operator block
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for cheking extractLeading  from sheet "extractLeading"
Then open DK Job from sheet and verify job Operations of sheet "extractLeading" and file "Operations_extractLeading.txt" with data "Le" with key "extractleading"

Then create dk jobs for cheking filename number extraction from sheet "filenamenumber"
Then open DK Job from sheet and verify job Operations of sheet "filenamenumber" and file "num_1234_check.txt" with data "1234" with key "filenamenumber"

@NX-3491
@initBrowser
Scenario: DK --> Verify the working of String value extraction from a filename
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for cheking filename number extraction from sheet "filenamenumber"
Then open DK Job from sheet and verify job Operations of sheet "filenamenumber" and file "num_1234_check.txt" with data "1234" with key "filenamenumber"

@NX-3489
@initBrowser
Scenario: DK --> Verify the working of String value extraction from a line
Given login
Then navigate to data foundation
Then click Data Fusion Engine
