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
@initBrowser @closeBrowser
Scenario: DK--->verify the functionality of skip exception block.
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking skip exception from sheet "skipexception"
Then Open DK Job from sheet and verify skip exception "skipexception"

@NX-3492
@initBrowser @closeBrowser
Scenario: DK --> Verify the working of String value extraction from a filename
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking filename Extraction from sheet "filenameextraction"
Then open DK Job from sheet and verify job Operations of sheet "filenameextraction" and file "Exception_input.txt" with data "Exception_input" with key "filenameextraction"


@NX-4374
@initBrowser @closeBrowser
Scenario: DK --> Verify the functionality of extractLeading operator in Dynamic operator block
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for cheking extractLeading  from sheet "extractLeading"
Then open DK Job from sheet and verify job Operations of sheet "extractLeading" and file "Operations_extractLeading.txt" with data "Le" with key "extractleading"

Then create dk jobs for checking filename number extraction from sheet "filenamenumber"
Then open DK Job from sheet and verify job Operations of sheet "filenamenumber" and file "num_1234_check.txt" with data "1234" with key "filenamenumber"

@NX-3491
@initBrowser @closeBrowser
Scenario: DK --> Verify the working of String value extraction from a filename
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking filename number extraction from sheet "filenamenumber"
Then open DK Job from sheet and verify job Operations of sheet "filenamenumber" and file "num_1234_check.txt" with data "1234" with key "filenamenumber"

@NX-3489
@initBrowser @closeBrowser
Scenario: DK --> Verify the working of String value extraction from a line
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking String value extraction from a line from sheet "datafromline"
Then open DK Job from sheet and verify job Operations of sheet "datafromline" and file "num_1234_check.txt" with data "test" with key "linestringextraction"

@NX-3488
@initBrowser @closeBrowser
Scenario: DK --> Verify the working of String value extraction from a line
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking String value extraction from a line from sheet "datafromline"
Then open DK Job from sheet and verify job Operations of sheet "datafromline" and file "num_1234_check.txt" with data "919895007879" with key "linenumberextraction"

@NX-3490
@initBrowser @closeBrowser
Scenario: DK --> Verify the working of String value extraction from a line
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking String value extraction from a line from sheet "datafromline"
Then open DK Job from sheet and verify job Operations of sheet "datafromline" and file "num_1234_check.txt" with data "01002018 00:01:00.0+0000" with key "linedateextraction"



@NX-3493
@initBrowser @closeBrowser
Scenario: DK --> Verify the working of Date value extraction from a filename
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking date value extraction from a filename from sheet "filenamedate"
Then open DK Job from sheet and verify job Operations of sheet "filenamedate" and file "date_01-01-2018_check.txt" with data "01002018 00:01:00.0+0000" with key "filenamedateextraction"

@NX-4367 @NX-4371
@initBrowser @closeBrowser
Scenario: DK --> Verify the functionality of abs/extractDecimalFractionPart operator in Dynamic operator block
Given login
Then navigate to data foundation
Then click Data Fusion Engine
Then create dk jobs for checking abs/extractDecimalFractionPart operator in Dynamic operator block from sheet "abs_fraction"
Then open DK Job from sheet and verify job Operations of sheet "abs_fraction" and file "Operations_abs_fraction.txt" with data "2" with key "ABSvalue"
Then navigate to landing page
Then navigate to data foundation
Then click Data Fusion Engine
Then open DK Job from sheet and verify job Operations of sheet "abs_fraction" and file "Operations_abs_fraction.txt" with data "112" with key "FromNumber_Integerpart"
