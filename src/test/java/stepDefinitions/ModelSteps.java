package stepDefinitions;



import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.validation.constraints.AssertTrue;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TextFileUtil;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageObjetcs.CommonObjects;
import pageObjetcs.ModelPageObjects;

public class ModelSteps extends Init{
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eh = new ExcelHelper(); 
	 ModelPageObjects  modelPage = new  ModelPageObjects();
	 TextFileUtil textFile=new TextFileUtil();
	 CommonObjects commonObjects=new CommonObjects();
	 
	 @Then("^navigate to InsightWorkbench$")
	 public void navigate_to_InsightWorkbench() throws Exception {
		 modelPage.navigatetoInsightWorkbench();
	 }
	    	 

	 @Then("^click on \"([^\"]*)\"$")
	 public void click_on(String name) throws Exception {
		 modelPage. navigatetoModelType(name);
	    
	 }

	 
	 @Then("^enter the model name \"([^\"]*)\"$")
	 public void enter_the_model_name(String modelSheet) throws Exception {
         eh.setExcelFile("Model", modelSheet);//set excel file
		 String name = eh.getCellByColumnName("Model_Name");//get sheet name
		 name = RandomNameGenerator.getRandomName(name);//append new random name
		 modelPage.NewModelName(name); //pass new name to NewModelName()
		 eh.setCell("Model_Name", name);
		 
	 }
	 
	 
	 @Then("^click on create new model button$")
	 public void click_on_CreateNewModelButton() throws Exception {
		 modelPage.navigatetoCreateNewModel();
	 }
	 
	 @Then("^enter model input from file \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void enter_model_input_from_file_and_run(String arg1,String arg2 ,String arg3 ) throws Exception{
		 eh.setExcelFile("Model", arg3);//set excel file
		 String name = eh.getCellByColumnName("Model_Name");//get sheet name
		 modelPage.inputdata(arg1 , arg2 , name);
	    
	 }
	 
	 
	 @Then("^click on Inputs$")
	 public void click_on_Inputs() throws Exception {
		 modelPage.navigatetoInputs();
	     }
	 
	 
	 @Then("^create a Dataframe \"([^\"]*)\" with discription \"([^\"]*)\"$")
	 public void create_a_Dataframe(String Dataframe,String des) throws Exception {
		 modelPage.DataframeCreation(Dataframe,des);
	 }
	 
	 
	 @Then("^add a customer base list \"([^\"]*)\"$")
	 public void add_a_customer_base_list(String baseList) throws Exception{
		 modelPage.addList(baseList);
	 }
	 
	 
	 
	 @Then("^wait until dataframeStatus is changed to \"([^\"]*)\"$")
	 public void wait_until_dataframeStatus_is_changed_to(String frameStatus) throws Exception {
		 
		 TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
			Thread.sleep(3000);
		    String currStatus= modelPage.getDataframeStatus();
			while(!frameStatus.contentEquals(currStatus)&& t.checkTimerMin(25)) {
			Thread.sleep(2000);
			currStatus= modelPage.getDataframeStatus();
			}
			Assert.assertTrue("Required status not found", frameStatus.contentEquals(currStatus));
	 } 
	 
	 
	 
	 @Then("^click on close$")
    public void click_on_Close() throws Exception{
	 modelPage.clickClose();
//	  modelPage.clickClose();
	}

@Then("^run the paragraph$")
 public void RunPara () throws Exception{
modelPage.runParagraph();
}
	 


   @Then("^wait until status is changed to \"([^\"]*)\"$")
        public void wait_until_status_is_changed(String status) throws Exception {
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
	    String currStatus= modelPage.getStatus();
		while(!status.contentEquals(currStatus)&& t.checkTimerMin(15)) {
		Thread.sleep(2000);
		currStatus= modelPage.getStatus();
		}
		Assert.assertTrue("Required status not found", status.contentEquals(currStatus));
}
      @Then("^add a customer base list$")
       public void add_a_customer_base_list() throws Throwable {
       modelPage.addList(BASE_LIST);
}

	   @Then("^verify model output from file \"([^\"]*)\"$")
	   public void verify_model_output_from_file(String data) throws Exception {
	   modelPage.outputdata(data);
	 }
	 
	   @Then("^filter the iwb job from sheet \"([^\"]*)\" with model type \"([^\"]*)\"$")
	   public void filter_the_iwb_job_from_sheet_with_model_type(String modelStorageSheet, String modelType) throws Throwable {
		   eh.setExcelFile("Model", modelStorageSheet);
		   String modelName=eh.getCellByColumnName(modelType);
      modelPage.filterIWBJob(modelName,modelType);
	   }

	   @Then("^edit the job$")
	   public void edit_the_job() throws Throwable {
	        modelPage.editDataframe();
	   }

	   @Then("^verify the edited changes are reflected$")
	   public void verify_the_edited_changes_are_reflected() throws Throwable {
		   modelPage.verifyEditedDataframe();
	   }
	 

@Then("^add the model name from sheet \"([^\"]*)\" and \"([^\"]*)\"  to sheet \"([^\"]*)\"$")
public void add_the_model_name_from_sheet_and_to_sheet(String modelSheet, String modelType, String modelStorageSheet) throws Throwable {
	eh.setExcelFile("Model", modelSheet);
	String modelName=eh.getCellByColumnName("Model_Name");
	eh.setExcelFile("Model", modelStorageSheet);
	eh.setCell(modelType, modelName);
//	eh.iwbModelDataDetails(modelName,modelType,modelStorageSheet);
}

@Then("^delete the dataframe$")
public void delete_the_dataframe() throws Throwable {
   modelPage.deleteDataframe();
}

@Then("^verify the dataframe gets deleted$")
public void verify_the_dataframe_gets_deleted() throws Throwable {
	 modelPage.verifyDeletionOfDataframe();
}
@Then("^activate the model$")
public void activate_the_model() throws Throwable {
	commonObjects.clickOptionsIcon();
	commonObjects.clickEditOption();
	modelPage.activateModel();



}













}
	  
	                        //----------------------------------------------------------------------------------------------------------------//
	
//  
//	  @Then("^click on Templates$")
//	 public void click_on_Templates() throws Exception{
//		 modelPage.clickTemplates();
//	 }
//	 @Then("^click on UseTemplate$")
//	 public void click_on_Use_Template() throws Exception{
//		 modelPage.clickUseTemplates();
//	 }
	 

