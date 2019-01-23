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
  @NX-4468 @initBrowser 
  Scenario: DK--->Verify the functionality of Save option
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create a DK Job from sheet "Jobinput" and verify "2" in ouput

  @NX-4465 @initBrowser @closeBrowser
  Scenario: DK--->Verify the functionality of Copy option
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create a DK Job from sheet "Jobinput" and verify "2" in ouput
    Then copy the job from sheet "Jobinput"

  @NX-4466 @initBrowser @closeBrowser
  Scenario: DK--->Verify the functionality of Delete option
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create a DK Job from sheet "Jobinput" and verify "2" in ouput
    Then delete the job from sheet "Jobinput"

  @NX-4464 @initBrowser @closeBrowser
  Scenario: DK--->Verify the functionality of Edit option
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create a DK Job from sheet "Jobinput" and verify "2" in ouput
    Then edit the job from sheet "Jobinput"

  @NX-4390 @initBrowser 
  Scenario: DK--->Verify the functionality of delimiter block using extract from file name
    Given login
    #Then random registration list is generated
    #Then random dnd list is generated
    Then create dk jobs for cheking delimiter from sheet "Delimiter_4390"
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then Open DK Job from sheet "Delimiter_4390" and verify "2" in ouput

  @NX-4383 @initBrowser @closeBrowser
  Scenario: DK--->verify the functionality of skip exception block.
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking skip exception from sheet "skipexception"
    Then Open DK Job from sheet and verify skip exception "skipexception"

  @NX-3492 @initBrowser @closeBrowser
  Scenario: DK --> Verify the working of String value extraction from a filename
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking filename Extraction from sheet "filenameextraction"
    Then open DK Job from sheet and verify job Operations of sheet "filenameextraction" and file "Exception_input.txt" with data "Exception_input" with key "filenameextraction"

  @NX-4374 @initBrowser
  Scenario: DK --> Verify the functionality of extractLeading operator in Dynamic operator block
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for cheking extractLeading  from sheet "extractLeading"
    #Operations_extractLeading.txt-----> stringoperations
    Then open DK Job from sheet and verify job Operations of sheet "extractLeading" and file "stringoperations.txt" with data "Na" with key "extractleading"
    Then create dk jobs for checking filename number extraction from sheet "filenamenumber"
    Then open DK Job from sheet and verify job Operations of sheet "filenamenumber" and file "num_1234_check.txt" with data "1234" with key "filenamenumber"

  @NX-3491 @initBrowser
  Scenario: DK --> Verify the working of number value extraction from a filename
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking filename number extraction from sheet "filenamenumber"
    Then open DK Job from sheet and verify job Operations of sheet "filenamenumber" and file "num_1234_check.txt" with data "1234" with key "filenamenumber"

  @NX-3489 @initBrowser
  Scenario: DK --> Verify the working of String value extraction from a line
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking String value extraction from a line from sheet "datafromline"
    Then open DK Job from sheet and verify job Operations of sheet "datafromline" and file "num_1234_check.txt" with data "test" with key "linestringextraction"
    Then pass next scenario based on this step

  @NX-4462 @closeBrowser
  Scenario: DK--->Verify the functionality FTP processor using valid Regex.
    Then check previous step and pass this

  @NX-3488 @initBrowser
  Scenario: DK --> Verify the working of String value extraction from a line
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking String value extraction from a line from sheet "datafromline"
    Then open DK Job from sheet and verify job Operations of sheet "datafromline" and file "num_1234_check.txt" with data "919895007879" with key "linenumberextraction"

  @NX-3490 @initBrowser
  Scenario: DK --> Verify the working of String value extraction from a line
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking String value extraction from a line from sheet "datafromline"
    Then open DK Job from sheet and verify job Operations of sheet "datafromline" and file "num_1234_check.txt" with data "01002018 00:01:00.0+0000" with key "linedateextraction"

  @NX-3493 @initBrowser
  Scenario: DK --> Verify the working of Date value extraction from a filename
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking date value extraction from a filename from sheet "filenamedate"
    Then open DK Job from sheet and verify job Operations of sheet "filenamedate" and file "date_01-01-2018_check.txt" with data "01002018 00:01:00.0+0000" with key "filenamedateextraction"

  @NX-4367  @initBrowser
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
    Then pass next scenario based on this step

  @NX-4371 @closeBrowser
  Scenario: DK --> Verify the functionality of abs/extractDecimalFractionPart operator in Dynamic operator block
    Then check previous step and pass this

  @NX-4356 @initBrowser @closeBrowser
  Scenario: DK--->Verify the functionality of  GreaterThan operator in Dynamic operator block.
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking greaterthan funtion from sheet "filenamedate"
    Then open DK Job from sheet and verify job Operations of sheet "filenamedate" and file "num_1234_check.txt" with data "600" with key "greaterthanjob"

  #-----------------------------------------------------------------------------------------------------------------
  @NX-DfeNumberCheck @initBrowser
  Scenario: DK--->Verify the functionality of number operations in Dynamic operator block().
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking  number operations from sheet "numberoperations"
    Then open DK Job from sheet and verify job Operations of sheet "numberoperations" and file "Operations_Number.txt" with key "numeric"
    Then pass next scenario based on this step

  @NX-3497
  Scenario: DK --> Verify the functionality of addDouble operation in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3498
  Scenario: DK --> Verify the functionality of addLong operation in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3502
  Scenario: DK --> Verify the functionality of round operation in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4365
  Scenario: DK--->Verify the functionality of subDouble operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4366
  Scenario: DK--->Verify the functionality of subLong operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4357
  Scenario: DK--->Verify the functionality of lessThan operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3521
  Scenario: DK --> Verify the functioality of Test block with a Number value inside the IF condition.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3500
  Scenario: DK --> Verify the functionality of division operation in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3499
  Scenario: DK --> Verify the functionality of multiply operation in Dynamic operator block
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4364
  Scenario: DK--->Verify the functionality of Min operator in Dynamic operator block
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4363
  Scenario: DK--->Verify the functionality of Max operator in Dynamic operator block
    Then check previous step and pass this
    Then pass next scenario based on this step
    
      @NX-4372
  Scenario: DK--->Verify the functionality of extractDecimalIntegerPart operator in Dynamic operator block
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4369 @closeBrowser
  Scenario: DK--->Verify the functionality of floor operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-DfeStringCheck @initBrowser
  Scenario: DK--->Verify the functionality of string operations in Dynamic operator block().
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking String operations from sheet "stringops"
    Then open DK Job from sheet and verify job Operations of sheet "stringops" and file "stringoperations.txt" with key "String"
    Then pass next scenario based on this step

  @NX-3537
  Scenario: DK --> Verify the functionality of OR operation using Logical operator block inside Ternary operator.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3536
  Scenario: DK --> Verify the functionality of OR operation using Logical operator block inside IF condition.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3535
  Scenario: DK --> Verify the functionality of AND operation using Logical operator block inside Ternary operator.
    Then check previous step and pass this
    Then pass next scenario based on this step
    
      @NX-4380
  Scenario: DK--->Verify the functionality of length operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3534
  Scenario: DK --> Verify the functionality of AND operation using Logical operator block inside IF condition.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3520
  Scenario: DK --> Verify the functioality of Test block with a string value inside the IF condition.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3519
  Scenario: DK --> Verify the functionality of trim operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3518
  Scenario: DK --> Verify the functionality of lTrim operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3517
  Scenario: DK --> Verify the functionality of rTrim operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3513
  Scenario: DK --> Verify the functionality of endsWithIgnorecase operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3512
  Scenario: DK --> Verify the functionality of endsWith operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3511
  Scenario: DK --> Verify the functionality of containsIgnorecase operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3510
  Scenario: DK --> Verify the functionality of equalsTo operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3509
  Scenario: DK --> Verify the functionality of contains operation for a string value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4378
  Scenario: DK--->Verify the functionality of merge operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-4375 @closeBrowser
  Scenario: DK--->Verify the functionality of extractTrailing operator in Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-DfeDateCheck @initBrowser
  Scenario: DK--->Verify the functionality of date operations in Dynamic operator block().
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking Date operations from sheet "Dateoperations"
    Then open DK Job from sheet and verify job Operations of sheet "Dateoperations" and file "datecheck.txt" with key "Date"
    Then pass next scenario based on this step

  @NX-3496 
  Scenario: DK --> Verify the functionality of contains operation for a date value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step

@NX-3495
Scenario: DK --> Verify the dynamic operator block for date value to filter the dates using Before functionality.
    Then check previous step and pass this
    Then pass next scenario based on this step
    
    
    @NX-3522
Scenario: DK --> Verify the functioality of Test block with a Date value inside the IF condition.
    Then check previous step and pass this
    Then pass next scenario based on this step
    
    

@NX-3522 @closeBrowser
  Scenario: DK --> Verify the functionality of contains operation for a date value using Dynamic operator block.
    Then check previous step and pass this
    Then pass next scenario based on this step
  @NX-DfelookupCheck @initBrowser
  Scenario: DK--->Verify the functionality of string operations in Dynamic operator block().
    Given login
    Then navigate to data foundation
    Then click Data Fusion Engine
    Then create dk jobs for checking lookup operations from sheet "dfelookupjob"
    Then open DK Job from sheet and verify job Operations of sheet "dfelookupjob" and file "Operations_Lookup.txt" with key "Lookup"
    Then pass next scenario based on this step

  @NX-3531
  Scenario: DK --> Verify that the lookup operation working as expected when the lookup path is mention in the volume
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-9277
  Scenario: DK --> Verify that the lookup operation doesnt work when lookup file is not there in the specified location.
    Then check previous step and pass this
    Then pass next scenario based on this step

  @NX-3530 @closeBrowser
  Scenario: DK --> Verify that the lookup operation doesnt work when lookup file is not there in the specified location.
    Then check previous step and pass this
    Then pass next scenario based on this step
