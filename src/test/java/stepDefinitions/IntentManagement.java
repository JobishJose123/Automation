 package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.http.HttpResponse;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.MarathonHelper;
import baseClasses.RandomNameGenerator;
import baseClasses.Request;
import baseClasses.SQLHandler;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.IntentManagementPageObjects;
import pageObjetcs.ProgramPage;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.TouchpointPage;

public class IntentManagement extends Init{
	RandomNameGenerator RandomNameGenerator=new RandomNameGenerator();
	CommonObjects commonObjects = new CommonObjects();
	JSWaiter jswait = new JSWaiter();
	MarathonHelper MarathonHelper =new MarathonHelper();
	public ExcelHelper eh = new ExcelHelper(); 
	TargetConditionObjects TargetConditionObjects=new TargetConditionObjects();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	IntentManagementPageObjects intentManagementPage = new IntentManagementPageObjects();
	TouchpointPage touchpointPage = new TouchpointPage();
	ProgramPage programPage = new ProgramPage();
	BroadcastPageObjects broadcastPageObjects=new BroadcastPageObjects();
	BroadcastSteps BroadcastSteps=new BroadcastSteps();
	
	@Then("^navigate to touchpoints")
	public void navigateToTouchpoints() throws InterruptedException {
		intentManagementPage.navigateToTouchpoints();
		Thread.sleep(3000);
	}
	@Then("^navigate to programs")
	public void navigateToPrograms() throws InterruptedException {
		Thread.sleep(5000);
		intentManagementPage.navigateToPrograms();
	}
	@Then("^navigate to sms")
	public void navigateToSms() throws InterruptedException {
		touchpointPage.navigateToSms();
	}
	@Then("^navigate to trigger")
	public void navigateToTrigger() throws InterruptedException {
		touchpointPage.navigateToTrigger();
	}
	@Then("^click create new touchpoint")
	public void clickCreateNewTouchpoint() throws InterruptedException {
		touchpointPage.clickCreateNewTouchpoint();
	}
	@Then("^create trigger touchpoint from sheet \"([^\"]*)\"$")
	public void createTriggerTouchpoint(String sheet) throws InterruptedException, IOException {
		eh.setExcelFile("touchpointInputData", sheet);
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		String name = (String) eh.getCell(1, 0);
 		if(name.contains("default")) {
 			name =  name.replaceAll("[0-9]", "");
 		}
 		else {
 		    name = name.replaceAll("[0-9]", "")+n;
 		}
		touchpointPage.createTriggerTouchpoint(name);
		eh.setCell(1, 0, name);
	}
	@Then("^check touchpoint landing page$")
	public void checkTouchpointLandingPage() throws Throwable{
		Thread.sleep(2000);
		touchpointPage.navigateToCustomerCare();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("//div[@val='customerCare' and contains(@class,'selected')]//iron-data-table[@id='customerTable']")).isDisplayed())
			System.out.println("true");
		touchpointPage.clickCreateNewTouchpoint();
		String heading =touchpointPage.getCustomerCareFormHeading();
		Exception headingDoesntMatch = new Exception("Heading doesnt match the selected type");
		Exception wrongFormDisplayed = new Exception("wrong form is displayed");
		if(!heading.contains("Create New Customer Care Touchpoint"))
			throw headingDoesntMatch;
		if(!touchpointPage.checkCustomerCareFormDisplayed())
			throw wrongFormDisplayed;
		touchpointPage.customerCareEnterMaximumOffers();
		touchpointPage.customerCareClickSave();
		touchpointPage.customerCareClickCancel();
	}
	@Then("^create sms touchpoint from sheet \"([^\"]*)\"$")
	public void createSmsTouchpoint(String sheet) throws Throwable{
		navigateToSms(); 
		eh.setExcelFile("touchpointInputData", sheet);
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		String name = (String) eh.getCell(1, 0);
 		name =  "smsTP"+n;
		touchpointPage.createSmsTouchpoint(name);
		eh.setCell(1, 0, name);
	}
	@Then("^verify sms touchpoint creation form$")
	public void verify_sms_tp_creation_form() throws Throwable {
		String heading = touchpointPage.getSmsFormHeading();
	    if(heading.contains("Create New SMS Touchpoint")) {
	    	touchpointPage.enterSmsTouchpointDetails("formTest");
	    	touchpointPage.smsClickSave();
	    }
	}
	@Then("^check sms touchpoint in grid \"([^\"]*)\"$")
	public void checkSmsTouchpoint(String sheet) throws Throwable{
		Thread.sleep(6000);
		String name = (String) eh.getCell(1, 0);
		jswait.waitForLoadMask();
		System.out.println("after load mask");
//		jswait.scrollIntoView(scrollPane, //iron-list//data-table-row);
		jswait.waitUntil("//span[contains(.,'"+name+"')]");
	}
	@Then("^check trigger touchpoint in grid \"([^\"]*)\"$")
	public void check_trigger_touchpoint_in_grid(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Thread.sleep(7000);
		String name = (String) eh.getCell(1, 0);
		jswait.waitForLoadMask();
		jswait.waitUntil("//data-table-cell[contains(.,'"+name+"')]");
	}
	@Then("^navigate to customer care$")
	public void navigate_to_customer_care() throws Throwable {
	    touchpointPage.navigateToCustomerCare();
	}
	
	/*@Then("^click edit touchpoint$")
	public void clickEditTouchpoint() throws Throwable {
	    touchpointPage.clickEditTouchpoint();
	}*/
	

	@Then("^create customer care touchpoint from sheet \"([^\"]*)\"$")
	public void create_customer_care_touchpoint(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		String name = (String) eh.getCell(1, 0);
 		name =  name.replaceAll("[0-9]", "")+n;
 		eh.setCell(1, 0, name);
		touchpointPage.createCustomerCareTouchpoint(name);
	}

	@Then("^check customer care touchpoint in grid \"([^\"]*)\"$")
	public void check_customer_care_touchpoint_in_grid(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Thread.sleep(7000);
		String name = (String) eh.getCell(1, 0);
		jswait.waitForLoadMask();
		jswait.waitUntil("//data-table-cell[contains(.,'"+name+"')]");
	}
	@Then("^navigate to api$")
	public void navigate_to_api() throws Throwable {
		touchpointPage.navigateToApi();
	}

	@Then("^navigate to smart phone app$")
	public void navigate_to_smartphone() throws Throwable {
		touchpointPage.navigateTosmartphone();
	}
	@Then("^create api touchpoint from sheet \"([^\"]*)\"$")
	public void create_api_touchpoint(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		String name = (String) eh.getCell(1, 0);
 		if(name.contains("default")) {
 			name =  name.replaceAll("[0-9]", "");
 		}
 		else {
 		    name = name.replaceAll("[0-9]", "")+n;
 		}	
	  touchpointPage.createApiTouchpoint(name,eh.getCellByColumnName("Application Type"),eh.getCellByColumnName("Event For Tracking"),eh.getCellByColumnName("Refresh  Every"),eh.getCellByColumnName("Time Interval"),eh.getCellByColumnName("Prioritization Logic"),eh.getCellByColumnName("Maximum Offers"));
	  eh.setCell(1, 0, name);
	}

	@Then("^check api touchpoint in grid \"([^\"]*)\"$")
	public void check_api_touchpoint_in_grid(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Thread.sleep(7000);
		String name = (String) eh.getCell(1, 0);
		jswait.waitForLoadMask();
		jswait.waitUntil("//data-table-cell[contains(.,'"+name+"')]");
	}
	@Then("^navigate to ussd$")
	public void navigate_to_ussd() throws Throwable {
		touchpointPage.navigateToUssd();
	}

	@Then("^create ussd touchpoint from sheet \"([^\"]*)\"$")
	public void create_ussd_touchpoint(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		String name = (String) eh.getCell(1, 0);
 		name =  name.replaceAll("[0-9]", "")+n;
 		eh.setCell(1, 0, name);
	  touchpointPage.createUssdTouchpoint(name);
	}
	
	@Then("^edit ussd touch point without filling mandatory fileds$")
	public void editUSSDTouchpointWithoutFillingMandatoryFields() throws Throwable {
		
	  touchpointPage.editUSSDTouchpointWithoutFillingMandatoryFields();
	}

	
	@Then("^create new touch point without filling mandatory fields$")
	public void createUssdTouchpointWithoutMandatoryFields() throws Throwable {
	  touchpointPage.createUssdTouchpointWithoutMandatoryFields();
	}
	
	@Then("^create new API touch point without filling mandatory fields$")
	public void createAPITouchpointWithoutMandatoryFields() throws Throwable {
	  touchpointPage.createAPITouchpointWithoutMandatoryFields();
	}
	
	@Then("^create new trigger touch point without filling mandatory fields$")
	public void createTriggerTouchpointWithoutMandatoryFields() throws Throwable {
	  touchpointPage.createTriggerTouchpointWithoutMandatoryFields();
	}
	
	//-------------------------------------------------------------------------------------------//
	@Then("^create new SMS touch point without filling mandatory fields$")
	public void createSMSTouchpointWithoutMandatoryFields() throws Throwable {
	  touchpointPage.createSMSTouchpointWithoutMandatoryFields("smsTP");
	
	}
	@Then("^create new smart phone app touch point without filling mandatory fields$")
	public void createSmartPhoneAppTouchpointWithoutMandatoryFields() throws Throwable {
	  touchpointPage.createCustomerSmartPhoneAppWithoutMandatoryFields();
	}
	
	
	
	///-------------------------------------------------------------------------------//
	
	@Then("^create new customer care touch point without filling mandatory fields$")
	public void createCustomerCareTouchpointWithoutMandatoryFields() throws Throwable {
	  touchpointPage.createCustomerCareTouchpointWithoutMandatoryFields();
	}
	@Then("^create new smart phone app touch point from sheet \"([^\"]*)\"$")
	public void createSmartPhoneAppTouchpointWithoutMandatoryFields(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
 		String name = (String) eh.getCell(1, 0);
 		name =  name.replaceAll("[0-9]", "")+n;
 		eh.setCell(1, 0, name);
		
	  touchpointPage.createCustomerSmartPhone(name);
	}
	
	@Then("^verify validation error messages for ussd touch point edit$")
	public void verifyValidationErrorMessagesInUSSDCreation() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInUSSDEdit();
		
	}
	
	@Then("^verify validation error messages for API touch point$")
	public void verifyValidationErrorMessagesInAPICreation() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInAPICreation();
		
	}
	
	@Then("^verify validation error messages for trigger touch point$")
	public void verifyValidationErrorMessagesInTriggerCreation() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInTriggerCreation();
		
	}
	
	@Then("^verify validation error messages for SMS touch point$")
	public void verifyValidationErrorMessagesInSMSCreation() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInSMSCreation();
		
	}
	@Then("^verify validation error messages for customer care touch point$")
	public void verifyValidationErrorMessagesInCustomercareCreation() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInCustomercareCreation();
		
	}
	@Then("^verify validation error messages for smart phone app touch point$")
	public void verifyValidationErrorMessagesInSmartPhoneApp() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInSmartPhoneApp();
		
	}
	@Then("^verify validation error messages for USSD touch point$")
	public void verifyValidationErrorMessagesInUSSD() throws Throwable {
		
		touchpointPage.verifyValidationErrorMessagesInUSSD();
		
	}
	@Then("^check ussd touchpoint in grid \"([^\"]*)\"$")
	public void check_ussd_touchpoint_in_grid(String sheet) throws Throwable {
		eh.setExcelFile("touchpointInputData", sheet);
		Thread.sleep(7000);
		String name = (String) eh.getCell(1, 0);
		jswait.waitForLoadMask();
		jswait.waitUntil("//data-table-cell[contains(.,'"+name+"')]");
	}
	@Then("^verify cancel button of sms touchpoint$")
	public void verifyCancelButtonSmsTouchpoint() throws Throwable {
		touchpointPage.clickCreateNewTouchpoint();
		touchpointPage.smsClickCancel();
		touchpointPage.clickCreateNewTouchpoint();
	}
	@Then("^verify cancel button of trigger touchpoint$")
	public void verifyCancelButtonTriggerTouchpoint() throws Throwable {
		touchpointPage.clickCreateNewTouchpoint();
		touchpointPage.enterTriggerTouchpointDetails("CheckCancel");
		touchpointPage.triggerClickCancel();
		Exception touchpointSavedAfterCancel = new Exception("touchpoint saved after clicking cancel");
		try{
			jswait.waitUntil("//data-table-cell[contains(.,'CheckCancel')]");
			throw touchpointSavedAfterCancel;
		}catch(Exception E) {
			
		}
	}
	@Then("^verify delete trigger touchpoint$")
	public void verify_delete_trigger_touchpoint() throws Throwable {
		touchpointPage.createTriggerTouchpoint("DeleteCheck");
		touchpointPage.deleteTriggerTouchpoint("DeleteCheck");
		Thread.sleep(3000);
	}
	@Then("^check mandatory fields for trigger touchpoint$")
	public void check_mandatory_fields_for_trigger_touchpoint() throws Throwable {
		touchpointPage.checkTriggerMandatoryFields();
	}
	@Then("^verify program landing page$")
	public void verify_program_landing_page() throws Throwable {
		programPage.checkCancelButtonCreateProgram();
		programPage.checkFilterCancelButton();
		programPage.checkAllColumnsInProductList();
	}

		
	
	@Then("^verify program proceed button functionality for details tab$")
	public void verifyProgramProceedButtonDetailsTab() throws Throwable {
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails("landing page");
		programPage.clickPorogramProceedButton();
		programPage.clickCreateProgramAddTouchpointButton();	
	}
	@Then("^click create program button$")
	public void click_create_program_button() throws Throwable {
		programPage.clickCreateProgramButton();
	}

	@Then("^verify program cancel button functionality for details tab$")
	public void verify_program_cancel_button_functionality_for_details_tab() throws Throwable {
		programPage.enterProgramDetails("landing page");
		programPage.clickCreateProgramCancelButton();
		programPage.clickCreateProgramButton();
	}
	@Then("^verify program choose catalog field values$")
	public void verifyCreateProgramChooseCatalogField() throws Throwable {
		programPage.createProgramCheckOfferCatalogField();
	}
	@Then("^verify program field validation for details tab$")
	public void verfyProgramDetailsValidation() throws Throwable{
		programPage.enterProgramName("testName/.,");
		programPage.clickPorogramProceedButton();
		programPage.enterProgramName("testMandatoryFields");
		programPage.clickPorogramProceedButton();
		ExcelHelper catalogExcel = new ExcelHelper();
		catalogExcel.setExcelFile("offerCatalogInputData", "defaultCatalog");
		programPage.selectOfferCatalog(catalogExcel.getCellByColumnName("Catalog Name"));
		programPage.clickPorogramProceedButton();
		programPage.clickCreateProgramAddTouchpointButton();
	}
	@Then("^verify program touchpoint tab$")
	public void verfyProgramtouchpointTab() throws Throwable{ 
		programPage.enterProgramDetails("name");
		programPage.clickPorogramProceedButton();
		programPage.checkCreateProgramTouchpointGrid();
		programPage.checkCreateProgramTopbarButtons();
	}
	@Then("^verify program touchpoint addition$")
	public void verfyProgramtouchpointAddition() throws Throwable{ 
		verifyProgramProceedButtonDetailsTab();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
	}
	
	//-------------------------------------------------------------------//
	
	
	@Then("^click on edit button of programs$")
	public void Editprograms() throws Throwable {
		
		Thread.sleep(9000);
		commonObjects.filterName("autoprogram");
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		String editname=programPage.editProgramDetails("programedit");
		//programPage.clickCreateProgramAddTouchpointButton();
		//programPage.addTouchPointToProgramedit();
		programPage.clickPorogramProceedButton();
		//programPage.programschstart();
		//programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		//programPage.prmrefreshat();
		//programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		programPage.programsavebutton();
		Thread.sleep(2000);
		programPage.programconfirmSaveyes();
		Thread.sleep(5000);
		commonObjects.filterName(editname);
		Thread.sleep(5000);
		programPage.editprogramcheck();
System.out.println(editname+"program has edited successfully");

		//programPage.programactivatebtn();
		//programPage.programconfirmactivateyes();
		
	}
	
	@Then("^verify create program page \"([^\"]*)\"$")
	public void verify_create_program_page(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		//programPage.createProgramSaveButton();
		Thread.sleep(2000);
		programPage.programactivatebtn();
		programPage.programconfirmactivateyes();
		System.out.println("program has created successfully");
		
	}
	
	@Then("^verify create program page with alert value$")
	public void verifyCreateProgramPageWithAlertValue() throws Throwable {
		
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetailsWithAlertValue();
		
	}

	@Then("^Verify duplicate TP entry on touchpoint tab$")
	public void touchpointsduplicateprograms() throws Throwable {
		
		Thread.sleep(9000);
		commonObjects.filterName("autoprogram");
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		String editname=programPage.editProgramDetails("programedit");
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.Programtouchpointduplicate();
		
	}
	@Then("^Verify Proceed button functionality for Touchpoint tabs \"([^\"]*)\"$")
	public void touchpointsproceedfuntion(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
	programPage.clickCreateProgramButton();
	programPage.enterProgramDetails(name);
	programPage.clickCreateProgramAddTouchpointButton();
	programPage.addTouchPointToProgram();
	programPage.clickPorogramProceedButton();
	programPage.programTouchpointtab();
	programPage.checkproceedtouchpoints();
	
	
	
	}
	
	@Then("^Verify cancel button functionality for Touchpoint tabs \"([^\"]*)\"$")
	public void touchpointscancelfuntion(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
	programPage.clickCreateProgramButton();
	programPage.enterProgramDetails(name);
	programPage.clickCreateProgramAddTouchpointButton();
	programPage.cancelTouchPointToProgram();
	programPage.clickPorogramProceedButton();
	programPage.checktouchpoints();

	}
	
	
	@Then("^Create Program Schedule Verify Start Now option \"([^\"]*)\"$")
	public void verify_create_program_page_startnow(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.checkprmshcselectnow(); 
		
		
	
	}
	@Then("^check details cancel button in programs \"([^\"]*)\"$")
	public void verify_create_program_page_cancel(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.cancelProgramDetails(name);
	
	}
	
	
	
	@Then("^check details schedule Refresh At \"([^\"]*)\"$")
	public void verify_create_program_page_refreshat(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
	
	}
	
	@Then("^check details schedule Serve on Specific Days \"([^\"]*)\"$")
	public void verify_create_program_page_serve_on_Specificdays(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		Thread.sleep(2000);
		programPage.programschserveon(); 
		programPage.prmshcserveonSpecdays();
		programPage.programserveonevery();
		programPage.programserveoneverydata();
		programPage.checkboxdaysmonday();
		Thread.sleep(2000);
		programPage.programdayscheck();
		
	}
	
	@Then("^verify delete a program \"([^\"]*)\"$")
	public void deleteprograms(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
   		String name = (String) programExcel.getCell(1, 0);
   		Thread.sleep(4000);
		Thread.sleep(9000);
		commonObjects.filterName(name);
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeleteOption();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//paper-button[text()='Yes']")).click();
		commonObjects.filterName(name);
		Assert.assertFalse(jswait.checkVisibility("///span[@innertext='"+name+"']"));
		
	}
	
	@Then("^Verify delete TP entry on touchpoint tab$")
	public void deletetouchpointprograms() throws Throwable {
		
		Thread.sleep(9000);
		commonObjects.filterName("autoprogram");
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		String editname=programPage.editProgramDetails("programedit");
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.Programtouchpointduplicate();
		programPage.cancelTouchPointToProgram();
		Thread.sleep(5000);
		programPage.touchpointoptions();
		programPage.touchpointdelete(); 
		programPage.touchpointpgmdeletecheck();
		
	}
	
	@Then("^edit details schedule Serve on Specific Days \"([^\"]*)\"$")
	public void verify_edit_program_page_serve_on_Specificdays(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
   		String name = (String) programExcel.getCell(1, 0);
  		
   		Thread.sleep(9000);
		commonObjects.filterName(name);
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		String editname=programPage.editProgramDetails("programedit");
		//programPage.clickCreateProgramAddTouchpointButton();
		//programPage.addTouchPointToProgramedit();
		programPage.clickPorogramProceedButton();
		//programPage.programschstart();
		//programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		Thread.sleep(2000);
		programPage.programschserveon(); 
		programPage.prmshcserveonSpecdays();
		programPage.programserveonevery();
		programPage.programserveoneverydata();
		programPage.checkboxdaysmonday();
		programPage.programsavebutton();
		Thread.sleep(2000);
		programPage.programconfirmSaveyes();
		Thread.sleep(5000);
		
	}
	
	@Then("^edit details from specific days to all days \"([^\"]*)\"$")
	public void verify_edit_program_page_serve_on_alldays(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
   		String name = (String) programExcel.getCell(1, 0);
  		
   		Thread.sleep(9000);
		commonObjects.filterName(name);
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		String editname=programPage.editProgramDetails("programedit");
		programPage.clickPorogramProceedButton();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		Thread.sleep(2000);
		programPage.programschserveon(); 
		programPage.prmshcserveonSpecdays();
		Thread.sleep(2000);
		programPage.programserveonevery();
		programPage.programserveoneverydata();
		programPage.checkboxdaysmonday();
		programPage.programsavebutton();
		programPage.programconfirmSaveyes();
		Thread.sleep(9000);
		commonObjects.filterName(editname);
		Thread.sleep(5000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		programPage.editProgramDetails("programedit");
		programPage.clickPorogramProceedButton();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		Thread.sleep(2000);
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		programPage.programsavebutton();
		Thread.sleep(2000);
		programPage.programconfirmSaveyes();
		
	}
	
	
	@Then("^verify create program page with refreshon daily serve on Specific days \"([^\"]*)\"$")
	public void verify_create_program_pagewith_refreshon_daily_serveon_Specific_days(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		Thread.sleep(2000);
		programPage.programschserveon(); 
		programPage.prmshcserveonSpecdays();
		programPage.programserveonevery();
		programPage.programserveoneverydata();
		programPage.checkboxdaysmonday();
		Thread.sleep(2000);
		programPage.programsavebutton();
		programPage.programconfirmSaveyes();
		System.out.println("program has created successfully");
		
	}
	
	
	@Then("^verify filter for programs \"([^\"]*)\"$")
	public void verify_filter_for_programs(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
   		String name = (String) programExcel.getCell(1, 0);
   		Thread.sleep(9000);
		commonObjects.filterName(name);
		Thread.sleep(5000);
		programPage.filterprogramcheck(name);
	
		}
	
	
	
	@Then("^verify create program page Serve On All days option \"([^\"]*)\"$")
	public void verify_create_program_page_Serve_On_All_days_option(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		programPage.prmshcserveonalldayscheck();
		
	
		}
	
	
	@Then("^verify create program page Refresh at option \"([^\"]*)\"$")
	public void verify_create_program_page_Refresh_at_option(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.refreshatprogramcheck();
		}
	
	
	@Then("^create program page verify edit option \"([^\"]*)\"$")
	public void create_program_page_verify_edit_option(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
	
	 	
	Thread.sleep(9000);
	commonObjects.filterName("autoprogram");
	Thread.sleep(5000);
	commonObjects.clickOptionsIcon();
	commonObjects.clickEditOption();
	Thread.sleep(5000);
	}
	
	@Then("^verify create program page Serve On Specific days option \"([^\"]*)\"$")
	public void verify_create_program_page_Serve_On_Specific_days_option(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonSpecdays();
		programPage.programserveonevery();
		programPage.programserveoneverydata();
		programPage.checkboxdaysmonday();
		programPage.prmshcserveonSpecificdayscheck();
		
	
		}
	
	@Then("^verify create program page timezone option \"([^\"]*)\"$")
	public void verify_create_program_page_timezone_option(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		programPage.programtimezone();
		programPage.programtimezonechange();
		programPage.programtimezonecheck();
		
	}
	
	@Then("^verify create program page timezone change option \"([^\"]*)\"$")
	public void verify_create_program_page_timezone_change_option(String sheet) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetails(name);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		programPage.programtimezone();
		programPage.programtimezonechange();
		programPage.programtimezonecheck();
		
	}
	
	
	@Then("^verify create program page with deactivated product \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\"$")
	public void verify_create_program_page_with_deactivated_product(String sheet1, String sheet2) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet1);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetailsWithDeactivatedProduct(name,sheet2);
		
		
	}
	
	@Then("^verify create program page \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\"$")
	public void verify_create_program_page_from_sheet(String sheet1, String sheet2) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet1);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetailsfromSheet(name,sheet2);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgram();
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		//programPage.createProgramSaveButton();
		Thread.sleep(2000);
		programPage.programactivatebtn();
		programPage.programconfirmactivateyes();
		System.out.println("program has created successfully");
		
	
	}
	
	
	@Then("^verify create program page \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
	public void verify_create_program_page_from_sheet(String sheet1, String sheet2, String sheet3) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
//    	ExcelHelper programExcel2 = new ExcelHelper();
    	
    	programExcel.setExcelFile("programInputData", sheet1);
    	
//    	programExcel2.setExcelFile("programInputDataedit", sheet1);
    	
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		
 		
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetailsfromSheet(name,sheet2);
		
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgramFromSheet(sheet3);
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
//		programPage.prmshcselectAt();
//		programPage.programenddate();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.newprmrefreshatpgm2();
		
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		//programPage.createProgramSaveButton();
		Thread.sleep(2000);
		programPage.programactivatebtn();
		programPage.programconfirmactivateyes();
		System.out.println("program has created successfully");
	}
	
	
	
	
	@Then("^verify create program page with customer care touchpoint \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
	public void verify_create_program_With_CC_from_sheet(String sheet1, String sheet2, String sheet3) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputData", sheet1);
    	Random rn = new Random();
    	int  n = rn.nextInt(5000) + 1;
 		String name = (String) programExcel.getCell(1, 0);
  		name =  name.replaceAll("[0-9]", "")+n;
 		programExcel.setCell(1, 0, name);
 		Thread.sleep(4000);
		programPage.clickCreateProgramButton();
		programPage.enterProgramDetailsfromSheet(name,sheet2);
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgramFromSheetForCC(sheet3);
		programPage.clickPorogramProceedButton();
		programPage.programschstart();
		programPage.prmshcselectnow();
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonalldays();
		//programPage.createProgramSaveButton();
		Thread.sleep(2000);
		programPage.programactivatebtn();
		programPage.programconfirmactivateyes();
		System.out.println("program has created successfully");
	}
	
	 @Then("^choose program from sheet \"([^\"]*)\" for edit$")
	 public void chooseProgramFromSheetFromSheet(String sheet) throws InterruptedException {
		 
		    eh.setExcelFile("programInputData",sheet);
			String name = (String) eh.getCell(1, 0);
		    filterWorkaround(name);
		    commonObjects.clickOptionsIcon();
		    programPage.clickEditProgramButton();
		 
		 
	 }
	 @Then("^choose program from sheet \"([^\"]*)\" after edited$")
	 public void chooseProgramFromSheetFromSheetafteredited(String sheet) throws InterruptedException {
		 
		    eh.setExcelFile("programInputDataedit",sheet);
			String name = (String) eh.getCell(1, 0);
		    filterWorkaround(name);
		    commonObjects.clickOptionsIcon();
		    programPage.clickEditProgramButton();
		 
		 
	 }
	 
	  
	   
	   @Then("^verify edit program page \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
	public void verify_edit_program_page_from_sheet(String sheet1, String sheet2, String sheet3) throws Throwable {
		Thread.sleep(4000);
    	ExcelHelper programExcel = new ExcelHelper();
    	programExcel.setExcelFile("programInputDataedit", sheet1);
    
 		String name = (String) programExcel.getCell(1,0);

 		RandomNameGenerator.getRandomName(name);
 		programExcel.setCell(1,0,name);
 		Thread.sleep(4000);
 		System.out.println(name);
 		

		programPage.enterProgramDetailsfromSheet(name,sheet2);
		
		commonObjects.clickOptionsIcon();
		jswait.loadClick("//paper-item[contains(.,'Delete')]");
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgramFromSheet(sheet3);
		programPage.clickPorogramProceedButton();
		
		programPage.programschend();
		programPage.prmshcselectnoend();
		programPage.programschrefreshcycle();
		programPage.prmshcselectdays();
		Thread.sleep(2000);
		programPage.prmeverylabel();
		programPage.prmrecycleinputclick();
		programPage.prmrecycleinput();
		programPage.prmrefreshat();
		programPage.pgmtimeokbtn();
		programPage.programschserveon(); 
		programPage.prmshcserveonSpecdays();
		programPage.programserveonevery();
		programPage.programserveoneverydata();
		programPage.checkboxdaysmonday();
		programPage.prmshcserveonSpecificdayscheck();
		
//		programPage.clickCreateProgramAddTouchpointButton();
//		programPage.addTouchPointToProgramFromSheet(sheet3);
//		programPage.clickPorogramProceedButton();
//		programPage.programschstart();
//		programPage.prmshcselectnow();
//		programPage.programschend();
//		programPage.prmshcselectnoend();
//		programPage.programschrefreshcycle();
//		programPage.prmshcselectdays();
//		Thread.sleep(2000);
//		programPage.prmeverylabel();
//		programPage.prmrecycleinputclick();
//		programPage.prmrecycleinput();
//		programPage.prmrefreshat();
//		programPage.pgmtimeokbtn();
//		programPage.programschserveon(); 
//		programPage.prmshcserveonalldays();
		programPage.clickEditProgramSaveButton();
		Thread.sleep(2000);
		//programPage.programactivatebtn();
		programPage.confirmProgramEditSave();
		System.out.println("program has edited successfully");
	
	}
	   
	   
	   
	   //----------------------------------------------------------------------------------//
	   
		
	   
	   @Then("^verify create programpagenewcode \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
		public void verify_edit_program_page_newcodefrom_sheet(String sheet1, String sheet2, String sheet3) throws Throwable {
			Thread.sleep(4000);
	    	ExcelHelper programExcel = new ExcelHelper();
	    	programExcel.setExcelFile("programInputData", sheet1);
	    	Random rn = new Random();
	    	int  n = rn.nextInt(5000) + 1;
	 		String name = (String) programExcel.getCell(1, 0);
	  		name =  name.replaceAll("[0-9]", "")+n;
	 		programExcel.setCell(1, 0, name);
	 		Thread.sleep(4000);
			programPage.clickCreateProgramButton();
			programPage.enterProgramDetailsfromSheet(name,sheet2);
			programPage.clickPorogramProceedButton();
			programPage.clickCreateProgramAddTouchpointButton();
			programPage.addTouchPointToProgramFromSheetnewshortcode(sheet3);
			programPage.clickPorogramProceedButton();
			programPage.programschstart();
			programPage.prmshcselectnow();
			programPage.programschend();
			programPage.prmshcselectnoend();
			programPage.programschrefreshcycle();
			programPage.prmshcselectdays();
			Thread.sleep(2000);
			programPage.prmeverylabel();
			programPage.prmrecycleinputclick();
			programPage.prmrecycleinput();
			programPage.prmrefreshat();
			programPage.pgmtimeokbtn();
			programPage.programschserveon(); 
			programPage.prmshcserveonalldays();
			//programPage.clickEditProgramSaveButton();
			Thread.sleep(2000);
			programPage.programactivatebtn();
			programPage.programconfirmactivateyes();
			System.out.println("program has edited successfully");
		}
	   
	   //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-//
	   
	   
	@Then("^verify edited program for touchpoint from sheet \"([^\\\"]*)\"$")
	public void verifyAddedTouchpointsFromSheet(String sheet) throws Throwable {
		programPage.clickPorogramProceedButton();
		
		ExcelHelper programExcel = new ExcelHelper();
 	    programExcel.setExcelFile("touchpointInputData", sheet);
 	    String tp = (String) programExcel.getCell(1, 0);
 	    programPage.verifyEDitedTouchpoint(tp);
		
	}
	
	
	public void filterWorkaround(String name) throws InterruptedException {
		commonObjects.clickFilterIcon();                            //issue in filter
		commonObjects.clickFilterResetButton();						//issue in filter
		commonObjects.filterName(name);
	}
	
	 @Then("^choose program from sheet \"([^\"]*)\"$")
	 public void chooseProgramFromSheet(String sheet) throws InterruptedException {
		 
		    eh.setExcelFile("programInputData",sheet);
			String name = (String) eh.getCell(1,0);
		    filterWorkaround(name);
		    commonObjects.clickOptionsIcon();
		    programPage.clickPorogramViewRulesButton();
		 
		 
	 }
	 
	 @Then("^verify rule created from sheet \"([^\"]*)\"$")
	 public void verifyRuleCreatedFromSheet(String sheet) throws Exception {
		 Thread.sleep(2000);
		    eh.setExcelFile("ruleInputData",sheet);
			String name = (String) eh.getCell(1, 0);
		    programPage.verifyRuleCreatedFromSheet(name);
		 
		 
	 }
	    
	
		@Then("^verify create program page refreshcycle option \"([^\"]*)\"$")
		public void verify_create_program_page_refreshoption(String sheet) throws Throwable {
			Thread.sleep(4000);
	    	ExcelHelper programExcel = new ExcelHelper();
	    	programExcel.setExcelFile("programInputData", sheet);
	    	Random rn = new Random();
	    	int  n = rn.nextInt(5000) + 1;
	 		String name = (String) programExcel.getCell(1, 0);
	  		name =  name.replaceAll("[0-9]", "")+n;
	 		programExcel.setCell(1, 0, name);
	 		Thread.sleep(4000);
			programPage.clickCreateProgramButton();
			programPage.enterProgramDetails(name);
			programPage.clickCreateProgramAddTouchpointButton();
			programPage.addTouchPointToProgram();
			programPage.clickPorogramProceedButton();
			programPage.programschstart();
			programPage.prmshcselectnow();
			programPage.programschend();
			programPage.prmshcselectnoend();
			programPage.programschrefreshcycle();
			programPage.programrefreshcyclecheck();
		}
		
		@Then("^create program Verify More Actions \"([^\"]*)\"$")
		public void moreoptionsprograms(String sheet) throws Throwable {
			
			Thread.sleep(4000);
	    	ExcelHelper programExcel = new ExcelHelper();
	    	programExcel.setExcelFile("programInputData", sheet);
	    	Random rn = new Random();
	    	int  n = rn.nextInt(5000) + 1;
	 		String name = (String) programExcel.getCell(1, 0);
	  		name =  name.replaceAll("[0-9]", "")+n;
	 		programExcel.setCell(1, 0, name);
	 		Thread.sleep(4000);
			programPage.clickCreateProgramButton();
			programPage.enterProgramDetails(name);
			programPage.clickCreateProgramAddTouchpointButton();
			programPage.addTouchPointToProgram();
			programPage.clickPorogramProceedButton();
			programPage.programschedulecheck();
			
			}
		
		 @Then("^verify create new rule with deactivated product from sheet \"([^\"]*)\"$")
			public void verify_edit_program_page_with_deactivated_product(String sheet1) throws Throwable {
				Thread.sleep(4000);
		    	ExcelHelper programExcel = new ExcelHelper();
		    	programExcel.setExcelFile("productInputData", sheet1);
		    	
		 		String name = (String) programExcel.getCell(1, 0);
		 		Thread.sleep(4000);
				//programPage.clickCreateProgramButton();
				programPage.createNewProgramRuleWithDeactivatedProduct(name);
				
				
			}	
		 
		 @Then("^verify tracking field while create new rule from sheet \"([^\"]*)\"$")
			public void verifyTrackingFieldWhileCreateNewRuleWithFromSheet(String sheet1) throws Throwable {
				Thread.sleep(4000);
		    	ExcelHelper programExcel = new ExcelHelper();
		    	programExcel.setExcelFile("productInputData", sheet1);
		    	
		 		String name = (String) programExcel.getCell(1, 0);
		 		Thread.sleep(4000);
				//programPage.clickCreateProgramButton();
				programPage.createNewProgramRuleAndVerifyTrackingSession(name);
				
				
			}	
		 @Then("^create new rule from sheet \"([^\"]*)\" and offer \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
			public void CreateNewRuleWithFromSheet(String sheet1,String offerType,String touchpointList) throws Throwable {
				Thread.sleep(4000);
				
		    	ExcelHelper programExcel = new ExcelHelper();
		    	programExcel.setExcelFile("programInputData", sheet1);
		    	ExcelHelper offerExcel = new ExcelHelper();
		    	offerExcel.setExcelFile("offerInputData", offerType);
		    	
		 		String name = (String) programExcel.getCell(1,0);
		 		
		 		Thread.sleep(4000);
				//programPage.clickCreateProgramButton();
		 		System.out.println(touchpointList);
				programPage.createNewProgramRulewithenddate(name,SELENIUM_LIST_IM,touchpointList,offerExcel.getCellByColumnName("Offer Type"));
				dateForCompare = new Date();
				System.out.println(dateForCompare);
				
			}
		 @Then("^create new rule from sheet \"([^\"]*)\" and offer \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\" with list \"([^\"]*)\"$")
			public void CreateNewRuleWithFromSheetwithcglist(String sheet1,String offerType,String touchpointList,String list) throws Throwable {
				Thread.sleep(4000);
				
		    	ExcelHelper programExcel = new ExcelHelper();
		    	programExcel.setExcelFile("programInputData", sheet1);
		    	ExcelHelper offerExcel = new ExcelHelper();
		    	offerExcel.setExcelFile("offerInputData", offerType);
		    	
		 		String name = (String) programExcel.getCell(1,0);
		 		
		 		Thread.sleep(4000);
				//programPage.clickCreateProgramButton();
		 		System.out.println(touchpointList);
				programPage.createNewProgramRulewithenddate(name,list,touchpointList,offerExcel.getCellByColumnName("Offer Type"));
				dateForCompare = new Date();
				System.out.println(dateForCompare);
				
			}
	
		
		@Then("^verify Schedule tab \"([^\"]*)\"$")
		public void verify_Schedule_tab() throws Throwable {
			
			Thread.sleep(9000);
			commonObjects.filterName("autoprogram");
			Thread.sleep(5000);
			commonObjects.clickOptionsIcon();
			programPage.programmoreoptionscheck();
			
			}
		
		
		@Then("^verify Start At option \"([^\"]*)\"$")
		public void verify_Start_At_option(String sheet) throws Throwable {
			Thread.sleep(4000);
	    	ExcelHelper programExcel = new ExcelHelper();
	    	programExcel.setExcelFile("programInputData", sheet);
	    	Random rn = new Random();
	    	int  n = rn.nextInt(5000) + 1;
	 		String name = (String) programExcel.getCell(1, 0);
	  		name =  name.replaceAll("[0-9]", "")+n;
	 		programExcel.setCell(1, 0, name);
	 		Thread.sleep(4000);
			programPage.clickCreateProgramButton();
			programPage.enterProgramDetails(name);
			programPage.clickCreateProgramAddTouchpointButton();
			programPage.addTouchPointToProgram();
			programPage.clickPorogramProceedButton();
			programPage.programschstart();
			programPage.prmstartAt();
			programPage.prmstartAtcheck();
		}
		
		
		//-----------------------------------------//
		
		@Then("^edit ussd touchpoint from sheet \"([^\"]*)\"$")
		public void edit_ussd_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
//	 		name =  name.replaceAll("[0-9]", "")+n;
	 		touchpointPage.clickUssdEditTouchpoint(name);
		  touchpointPage.editUssdTouchpointDetails("edited "+name);
		  String newname="edited "+name;
		  System.out.println(newname);
		  eh.setCell(1, 0, name);
		  touchpointPage.ussdedittouchpointcheck(newname);
		  
		}
		@Then("^delete ussd touchpoint from sheet \"([^\"]*)\"$")
		public void delete_ussd_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
//	 		name =  name.replaceAll("[0-9]", "")+n;
//	 		eh.setCell(1, 0, name);
		  		  System.out.println(name);
		  touchpointPage.ussddeletetouchpointcheck(name);
		  
		}
		
		@Then("^edit api touchpoint from sheet \"([^\"]*)\"$")
		public void edit_api_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.Apiedittouchpointsclick();
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		
		  touchpointPage.editapiTouchpointDetails("edited "+name);
		  String newname="edited "+name;
		  System.out.println(newname);
		  eh.setCell(1, 0, name);
		  touchpointPage.apiedittouchpointcheck(newname);
		  
		}
		
		@Then("^delete api touchpoint from sheet \"([^\"]*)\"$")
		public void delete_api_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			eh.setExcelFile("touchpointInputData", sheet);
	 		String name = (String) eh.getCell(1, 0);
		  	System.out.println("deleting touchpoint:::"+name);
		  touchpointPage.apideletetouchpointcheck(name);
		  
		  
		}
		
		
		@Then("^delete sms touchpoint from sheet \"([^\"]*)\"$")
		public void delete_sms_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
//	 		name =  name.replaceAll("[0-9]", "")+n;
//	 		eh.setCell(1, 0, name);
		  		  System.out.println(name);
		  touchpointPage.deletesmsTouchpoint(name);
		  
		  
		}
		
		
		@Then("^edit sms touchpoint from sheet \"([^\"]*)\"$")
		public void edit_sms_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.smsedittouchpointsclick();
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
//	 		name =  name.replaceAll("[0-9]", "")+n;
	 		String newname="edited "+name;
	 		eh.setCell(1, 0, newname);
	 		Thread.sleep(3000);
		  touchpointPage.editSmsTouchpointDetails(newname);
		  
		  System.out.println(newname);
		  Thread.sleep(6000);
		  eh.setCell(1, 0, newname);
		  touchpointPage.smsedittouchpointcheck(newname);
		  
		}
		
		
		@Then("^edit sms touchpoint from sheet with new shortcode \"([^\"]*)\"$")
		public void edit_sms_touchpointnewshortcode(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.smsedittouchpointsclick();
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		String newname="edited "+name;
	 		eh.setCell(1, 0, newname);
	 		Thread.sleep(3000);
		  touchpointPage.editSmsTouchpointDetailsshortcode(newname);
		  
		  
		  
		}
		
		
	
		
		@Then("^navigate to rules after edit$")
		public void navigatetorulesafteredit() throws Throwable {
			Thread.sleep(2000);
			jswait.loadClick("//paper-button[contains(.,'Rules')]");
			driver.navigate().refresh();
			Thread.sleep(2000);
		    
		}
		
		
		
		@Then("^click customer care edit touchpoint$")
		public void clickCustEditTouchpoint() throws Throwable {
		    touchpointPage.clickCustEditTouchpoint();
		}
		
		
		@Then("^edit touchpoint with alert value$")
			public void editTouchpointWithAlertValue() throws Throwable {
				
				touchpointPage.editTouchpointWithAlertValue();	
			}
		
		@Then("^edit customer care touchpoint$")
		public void editCustomerCareTouchpoint() throws Throwable {
			
			touchpointPage.editCustomerCareTouchpoint();
			
			
		}
		
				@Then("^edit customer care touchpoint with security alert$")
		public void editCustomerCareTouchpointWithSecurityAlert() throws Throwable {
			
			touchpointPage.editCustomerCareTouchpointWithSecurityAlert();
			
			
		}
		@Then("^create new touchpoint with alert value$")
		public void createTouchpointWithAlertValue() throws Throwable {
			
			touchpointPage.createTouchpointWithAlertValue();
			
			
		}
		
		@Then("^create new customer care touchpoint and delete$")
		public void createNewCustomerCareTouchpointAndDelete() throws Throwable {
			
			touchpointPage.createNewCustomerCareTouchpointAndDelete();
			
			
		}
		
		@Then("^delete USSD touchpoint$")
		public void deleteUSSDTouchpoint() throws Throwable {
			
			touchpointPage.deleteUSSDTouchpoint();
			
			
		}
		
		
		
	
		//-----------------------------------------------------------------------------------------//
		
		
		@Then("^edit api touchpoint validation check from sheet \"([^\"]*)\"$")
		public void edit_api_touchpointvalidation_check(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.Apiedittouchpointsclick();
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		String newname="edited "+name;
	 		eh.setCell(1, 0, newname);
		  touchpointPage.editapiTouchpointDetailsvalidation(newname);
		  
		  System.out.println(newname);
		  //touchpointPage.apiedittouchpointcheck(newname);
		  
		}
		
		
		@Then("^edit sms touchpoint validation check from sheet \"([^\"]*)\"$")
		public void edit_sms_touchpointvalidation_check(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.smsedittouchpointsclick();
			System.out.println("inside sms");
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		String newname=name;
	 		
		  touchpointPage.editsmsTouchpointDetailsvalidation(newname);
		  
		  System.out.println(newname);
		  //touchpointPage.apiedittouchpointcheck(newname);
		  
		}
		
		@Then("^verify edit button for smartphone touchpoint$")
		public void verifyEditButtonForSmartphoneTouchpoint() throws Throwable {
			
		touchpointPage.verifyEditButtonForSmartphoneTouchpoint();
			
		}
		
		@Then("^verify edit button for customer care touchpoint$")
		public void verifyEditButtonForCustomercareTouchpoint() throws Throwable {
			
		touchpointPage.verifyEditButtonForCustomercareTouchpoint();
			
		}
		

		@Then("^verify edit button for API touchpoint$")
		public void verifyEditButtonForAPITouchpoint() throws Throwable {
			
		touchpointPage.verifyEditButtonForAPITouchpoint();
			
		}
		@Then("^verify edit button for USSD touchpoint$")
		public void verifyEditButtonForUSSDTouchpoint() throws Throwable {
			
		touchpointPage.verifyEditButtonForUSSDTouchpoint();
			
		}
		
		@Then("^verify edit button for trigger touchpoint$")
		public void verifyEditButtonForTriggerTouchpoint() throws Throwable {
			
		touchpointPage.verifyEditButtonForTriggerTouchpoint();
			
		}
		
		
		
		@Then("^verify edit button for sms touchpoint$")
		public void verifyEditButtonForSMSTouchpoint() throws Throwable {
			
		touchpointPage.verifyEditButtonForSMSTouchpoint();
			
		}
		
		@Then("^create api touchpoint validation check from sheet \"([^\"]*)\"$")
		public void create_api_touchpointvalidation_check(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.clickCreateNewTouchpoint();;
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		String newname=name;
	 		eh.setCell(1, 0, newname);
		  touchpointPage.editapiTouchpointDetailsvalidation(newname);
		  
		  System.out.println(newname);
		  //touchpointPage.apiedittouchpointcheck(newname);
		  
		}
		
		@Then("^filter catlog with alert value$")
		 public void filterCatlogWithAlertValue() throws InterruptedException {
			    String name="<script>alert(document.cookies)</script>";
			    filterWorkaround(name);
			    commonObjects.clickFilterIcon();
			    intentManagementPage.verifyFilterTitle(); 
		 }
		
		@Then("^filter offer with alert value$")
		 public void filterOfferWithAlertValue() throws InterruptedException {
			    String name="<script>alert(document.cookies)</script>";
			    filterWorkaround(name);
			    commonObjects.clickFilterIcon();
			    intentManagementPage.verifyFilterTitle(); 
		 }
		

		@Then("^verify edit and delete button touchpoint$")
		public void verifyEditAndDeleteButtonTouchpoints() throws InterruptedException {
			
			touchpointPage.verifyEditAndDeleteButtonTouchpoints();

		}
		
		@Then("^create sms touchpoint validation check from sheet \"([^\"]*)\"$")
		public void create_sms_touchpointvalidation_check(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eh.setCell(1, 0, name);
	 		
		  touchpointPage.createsmsTouchpointDetailsvalidation(name);
		  
		  System.out.println(name);
		  //touchpointPage.apiedittouchpointcheck(newname);
		  

		}
		
		
		@Then("^edit trigger touchpoint from sheet \"([^\"]*)\"$")
		public void editTriggerTouchpoint(String sheet) throws InterruptedException, IOException {
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eh.setCell(1, 0, name);
			touchpointPage.editTriggerTouchpoint(name);
		}
		
		
//		@Then("^create (\\d+) rule from sheet \"([^\"]*)\" and list \"([^\"]*)\"$")
//		public void create_rule_from_sheet_and_list(int arg1, String sheet1, String list) throws Throwable {
//			for(int i=0;i<arg1;i++) {
//				Thread.sleep(2000);
//				ExcelHelper programExcel = new ExcelHelper();
//		    	programExcel.setExcelFile("productInputData", sheet1);
//		    	
//		 		String name = "myy_rule_";
//		 		Thread.sleep(2000);
//				//programPage.clickCreateProgramButton();
//				programPage.createNewProgramRule(name+i,list);
//			}
//	    	
//		}
		public String getLastOfferEligibleEventTime() {
			try {
				jswait.waitUntil("//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Eligible Event')]/..//data-table-cell[2]");
				String latestTime = driver.findElement(By.xpath("(//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Eligible Event')]/..//data-table-cell[2])[1]")).getText();
				return latestTime;
			}catch (Exception e) {
				return "noOfferEligibleEventFound";
			}
		}
		public String getLastOfferRecommendedEventTime() {
			try {
				jswait.waitUntil("//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Recommended')]/..//data-table-cell[2]");
				String latestTime = driver.findElement(By.xpath("(//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Recommended')]/..//data-table-cell[2])[1]")).getText();
				return latestTime;
			}catch (Exception e) {
				return "noOfferRecommendedEventFound";
			}
		}
		public String getLastOfferAcceptedEventTime() {
			try {
				jswait.waitUntil("//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Accepted')]/..//data-table-cell[2]");
				String latestTime = driver.findElement(By.xpath("(//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Accepted')]/..//data-table-cell[2])[1]")).getText();
				return latestTime;
			}catch (Exception e) {
				return "noOfferAcceptedEventFound";
			}
		}
		
		public String getmessagerecevied() {
			try {
				jswait.waitUntil("//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Recommended')]/..//data-table-cell[2]");
				String latestTime = driver.findElement(By.xpath("(//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Offer Recommended')]/..//data-table-cell[2])[1]")).getText();
				return latestTime;
			}catch (Exception e) {
				return "noOfferRecommendedEventFound";
			}
		}
		
		public boolean checkOfferEligibleEventTime(Date startTime, Date conversionTime) {
			if(conversionTime.after(startTime))
			return true;
			else 
				return false;
			
		}
		public boolean checkOfferRecommendedEventTime(Date startTime, Date conversionTime) {
			if(conversionTime.after(startTime))
			return true;
			else 
				return false;
			
		}
		@Then("^wait for \"([^\"]*)\" status of rule$")
		public void wait_for_status_of_rule_TO_DO(String statusExpected) throws Throwable {
			String ruleStatus = programPage.getTopSuleStatus();
			TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
			while(!ruleStatus.contains(statusExpected)&& t.checkTimerMin(15)) {
				ruleStatus = programPage.getTopSuleStatus();
				System.out.println(ruleStatus);
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
			Assert.assertTrue("Invalid status of BC",ruleStatus.contains(statusExpected));
		}
		
		@Then("^wait for offer eligible event in consumer profile$")
		public void wait_for_Fullfillment_event() throws Throwable {
			CustomerProfilePage customerProfilePage = new CustomerProfilePage();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickOfferEligibleEventCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);
			TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
			String date = getLastOfferEligibleEventTime();
			if(date.equals("noOfferEligibleEventFound"))
				date = "05 Sep 2000 04:18 PM";
			Date timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			System.out.println(timeStamp);
			System.out.println(checkOfferEligibleEventTime(dateForCompare,timeStamp));
			while(t.checkTimerMin(15) && !checkOfferEligibleEventTime(dateForCompare,timeStamp)) {
				System.out.println("insie while"+dateForCompare+"::"+timeStamp);
				Thread.sleep(5000);
//				customerProfilePage.clickEventsTab();
				customerProfilePage.clickEventTypesCheckBox();
				customerProfilePage.clickSelectEventApplyButton();
				Thread.sleep(2000);
				customerProfilePage.clickEventTypesCheckBox();
				customerProfilePage.clickOfferEligibleEventCheckBox();
				customerProfilePage.clickSelectEventApplyButton();
				Thread.sleep(2000);
				
				date = getLastOfferEligibleEventTime();
				if(date.equals("noOfferEligibleEventFound"))
					date = "05 Sep 2000 04:18 PM";
				timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
				System.out.println(timeStamp);
				System.out.println(getLastOfferEligibleEventTime());
				
			}
			date = getLastOfferEligibleEventTime();
			if(date.equals("noOfferEligibleEventFound"))
				date = "05 Sep 2000 04:18 PM";
			timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			Assert.assertTrue("offer eligible event not found", checkOfferEligibleEventTime(dateForCompare,timeStamp));
		}
		
		@Then("^wait for offer recommended event in consumer profile$")
		public void wait_for_Recommended_event() throws Throwable {
			Date now = new Date();
			Calendar calendar = Calendar.getInstance();
			int min = calendar.get(Calendar.MINUTE);
			now.setMinutes(min-2);
			dateForCompare = now;
			CustomerProfilePage customerProfilePage = new CustomerProfilePage();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickOfferRecommendedEventCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);
			TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
			String date = getLastOfferRecommendedEventTime();
			if(date.equals("noOfferRecommendedEventFound"))
				date = "05 Sep 2000 04:18 PM";
			Date timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			System.out.println(timeStamp);
			System.out.println(checkOfferRecommendedEventTime(dateForCompare,timeStamp));
			while(t.checkTimerMin(15) && !checkOfferRecommendedEventTime(dateForCompare,timeStamp)) {
				System.out.println("insie while"+dateForCompare+"::"+timeStamp);
				Thread.sleep(5000);
//				customerProfilePage.clickEventsTab();
				customerProfilePage.clickEventTypesCheckBox();
				customerProfilePage.clickSelectEventApplyButton();
				Thread.sleep(2000);
				customerProfilePage.clickEventTypesCheckBox();
				customerProfilePage.clickOfferRecommendedEventCheckBox();
				customerProfilePage.clickSelectEventApplyButton();
				Thread.sleep(2000);
				
				date = getLastOfferRecommendedEventTime();
				if(date.equals("noOfferRecommendedEventFound"))
					date = "05 Sep 2000 04:18 PM";
				timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
				System.out.println(timeStamp);
				System.out.println(getLastOfferRecommendedEventTime());
				
			}
			date = getLastOfferRecommendedEventTime();
			if(date.equals("noOfferRecommendedEventFound"))
				date = "05 Sep 2000 04:18 PM";
			timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			Assert.assertTrue("offer Recommended event not found", checkOfferRecommendedEventTime(dateForCompare,timeStamp));
		}
		
		@Then("^wait for offer accepted event in consumer profile$")
		public void wait_for_offer_accepted_event() throws Throwable {
			CustomerProfilePage customerProfilePage = new CustomerProfilePage();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickOfferAcceptedEventCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);
			TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
			String date = getLastOfferEligibleEventTime();
			if(date.equals("noOfferEligibleEventFound"))
				date = "05 Sep 2000 04:18 PM";
			Date timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			System.out.println(timeStamp);
			System.out.println(checkOfferEligibleEventTime(dateForCompare,timeStamp));
			while(t.checkTimerMin(15) && !checkOfferEligibleEventTime(dateForCompare,timeStamp)) {
				System.out.println("insie while"+dateForCompare+"::"+timeStamp);
				Thread.sleep(5000);
//				customerProfilePage.clickEventsTab();
				customerProfilePage.clickEventTypesCheckBox();
				customerProfilePage.clickSelectEventApplyButton();
				Thread.sleep(2000);
				customerProfilePage.clickEventTypesCheckBox();
				customerProfilePage.clickOfferAcceptedEventCheckBox();
				customerProfilePage.clickSelectEventApplyButton();
				Thread.sleep(2000);
				
				date = getLastOfferAcceptedEventTime();
				if(date.equals("noOfferEligibleEventFound"))
					date = "05 Sep 2000 04:18 PM";
				timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
				System.out.println(timeStamp);
				System.out.println(getLastOfferAcceptedEventTime());
				
			}
			date = getLastOfferAcceptedEventTime();
			if(date.equals("noOfferEligibleEventFound"))
				date = "05 Sep 2000 04:18 PM";
			timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			Assert.assertTrue("offer eligible event not found", checkOfferEligibleEventTime(dateForCompare,timeStamp));
		}
		
		@Then("^accept offer in customer care$")
		public void acceptOfferInCustomerCare() throws Throwable {
			programPage.clickCustomerCareOfferAccept();
		}
		
		@Then("^wait until rule is picked$")
		public void waituntilRuleIsPicked() throws Throwable {
			TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
			while(programPage.getRuleLastRefreshTime().isEmpty()&&t.checkTimerMin(15)) {
				driver.navigate().refresh();
				Thread.sleep(4000);
				System.out.println("Waiting for rule to be picked by Conveyor Belt");
			}
		}
		
		@Then("^add touchpoint \"([^\"]*)\" to api_auth_policy$")
		public void addTouchpointToAuthPolicy(String touchpointSheet) throws Throwable {
			MarathonHelper m = new MarathonHelper();
			eh.setExcelFile("touchpointInputData", touchpointSheet);
			SQLHandler sql = new SQLHandler();
			sql.init(p.getValue("dbUrl"),p.getValue("dbUsername"),p.getValue("dbPassword"));
			sql.addTouchpointToApiAuthPolicy(eh.getCellByColumnName("api touchpoint name"));
		}
		String offerRecommended = "{\"status\":{\"code\":200,\"message\":\"Success\"},\"offers\":{\"offer\":[{\"id\":\"111\",\"message\":\"Enjoy the offer with 25 extar TT\",\"shortMessage\":\"Bonus offer\",\"message-encoding\":\"UTF-8\",\"message-lang\":\"English (UK)\",\"offerType\":\"usage\",\"category\":\"Balance Top ups\",\"order\":1},{\"id\":\"110\",\"message\":\"Enjoy the offer with 25 extar TT\",\"shortMessage\":\"Bonus offer\",\"message-encoding\":\"UTF-8\",\"message-lang\":\"English (UK)\",\"offerType\":\"usage\",\"category\":\"Balance Top ups\",\"order\":2}]}}";
		
		public int getRuleId(String ruleName) throws IOException, Exception {
			SQLHandler sql = new SQLHandler();
			return sql.getStringOfQuery("select SEGMENT_OFFER_ID from im_segment_offer where SEGMENT_NAME=\""+ruleName+"\";");
		}
		
		
		@Then("^accept api-server for \"([^\"]*)\" with touchpoint \"([^\"]*)\" and rule \"([^\"]*)\"$")
		public void acceptApiServerForNumber(String number,String touchpointSheet,String ruleSheet) throws Throwable {
			StringBuilder postBody = new StringBuilder();
			postBody.append("{\"event\":[\r\n" + 
					"{ \"id\":\"104\", \"type\":\"POST\", \"value\":\"");
			eh.setExcelFile("ruleInputData", ruleSheet);
			int ruleId = getRuleId(eh.getCellByColumnName("Rule Name"));
			System.out.println(ruleId);
			postBody.append(ruleId);
			postBody.append("\", \"date\":\"");
			Date now = new Date();
			Calendar calendar = Calendar.getInstance();
			int min = calendar.get(Calendar.MINUTE);
			now.setMinutes(min+2);
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
			postBody.append(timeStamp);
			postBody.append(" +0530\" }");
			postBody.append("]}");
			System.out.println(postBody.toString());
			StringBuilder str = new StringBuilder();
			str.append("http://");
			MarathonHelper m = new MarathonHelper();
			str.append(p.getValue("nginxIp"));
			str.append(":");
			str.append("8092");
			eh.setExcelFile("touchpointInputData", touchpointSheet);
			str.append("/rest/authkey/"+"selenium"+"/msisdn/"+number+"/kpi/events");
			System.out.println(str.toString());
			Request req = new Request();
			
//		        System.out.println(response.getStatusLine().getStatusCode();
			req.postRequest(str.toString(), postBody.toString());
			System.out.println(req.responseString);
		}
		
		
		
		
		   @Then("^verify edited program page \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
			public void verify_edited_program_page_from_sheet(String sheet1, String sheet2, String sheet3) throws Throwable {
				Thread.sleep(4000);
		    	ExcelHelper programExcel = new ExcelHelper();
		    	programExcel.setExcelFile("programInputDataedit", sheet1);
		    
		 		String name = (String) programExcel.getCell(1,0);
		 		Thread.sleep(4000);
		 		System.out.println(name);
				programPage.compareProgramDetailsfromSheet(name,sheet2);
				programPage.verifyTouchPointToProgramFromSheet(sheet3);
				
				System.out.println("program has verified successfully");
			
			}
		   
		   
		   @Then("^verify rule view from sheet \"([^\"]*)\" and product \"([^\"]*)\"$")
			 public void verifyRuleviewFromSheet(String sheet,String sheet2) throws Exception {
				 Thread.sleep(2000);
				 ExcelHelper programExcel = new ExcelHelper();
				    eh.setExcelFile("ruleInputData",sheet);
					String name = (String) eh.getCell(1, 0);
					programExcel.setExcelFile("productInputData", sheet2);
					
					String product=(String) programExcel.getCell(1, 0);
				    programPage.verifyRuleviewFromSheet(name,product);
				 
				 
			 }
		   
		   @Then("^verify rule deactivate$")
			 public void verifyRuledeactivate() throws Exception {
				 Thread.sleep(2000);
				
				    programPage.verifyRuledeactivate();
				 
				 
			 }
		   
		   @Then("^verify rule Copy from sheet \"([^\"]*)\" with product sheet \"([^\"]*)\" and product class sheet \"([^\"]*)\"$")
			 public void verifyRulecopy(String sheet,String sheet2,String sheet3) throws Exception {
				 Thread.sleep(2000);
				
				    programPage.verifyRulecopy(sheet,sheet2,sheet3);
				 
				 
			 }
		   
		   
		   @Then("^edit new rule from sheet \"([^\"]*)\" and offer \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\" with taget condition (.*)$")
			public void editRuleWithFromSheet(String sheet1,String offerType,String touchpointList,String condition) throws Throwable {
				Thread.sleep(4000);
				
		    	ExcelHelper programExcel = new ExcelHelper();
		    	programExcel.setExcelFile("ruleInputData", sheet1);
		    	ExcelHelper offerExcel = new ExcelHelper();
		    	offerExcel.setExcelFile("offerInputData", offerType);
		    	
		 		String name = (String) programExcel.getCell(1, 0);
		 		Thread.sleep(4000);
				//programPage.clickCreateProgramButton();
		 		System.out.println(touchpointList);
				programPage.editProgramRule(name,SELENIUM_LIST,touchpointList,offerExcel.getCellByColumnName("Offer Type"),condition);
				dateForCompare = new Date();
				System.out.println(dateForCompare);
				
			}
		   
			@Then("^edit the programrule with taget condition (.*)$")
			public void edit_the_program_with_taget_condition(String condition) throws Throwable {
				System.out.println(condition);
				Thread.sleep(3000);
				
				Thread.sleep(3000);
				programPage.editingTheprogramruleTargetConditionDetails(condition);
				
			}
		   
			
			  @Then("^verify rule view after edit from sheet \"([^\"]*)\" and product \"([^\"]*)\"$")
				 public void verifyRuleviewaftereditFromSheet(String sheet,String sheet2) throws Exception {
					 Thread.sleep(2000);
					 ExcelHelper programExcel = new ExcelHelper();
					    eh.setExcelFile("ruleInputData",sheet);
						String name = (String) eh.getCell(1, 0);
						programExcel.setExcelFile("productInputData", sheet2);
						
						String product=(String) programExcel.getCell(1, 0);
					    programPage.verifyRuleviewaftereditFromSheet(name,product);
					 
					 
				 }
				@Then("^edit the targetSelection (.*) for programrule$")
				public void edit_the_targetSelection_None_for_BC(String targetSelection) throws Throwable {
					Thread.sleep(3000);
					commonObjects.clickOptionsIcon();
					jswait.loadClick("(//paper-item[contains(.,'Edit')])[1]");
					
					Thread.sleep(2000);
					if (targetSelection.contains("None")) {
						broadcastPageObjects.clickTargetConditionNoneOption();

					} else if (targetSelection.contains("Create")) {

						broadcastPageObjects.clickcreateTargetCondition();
						Thread.sleep(2000);
						jswait.loadClick("//paper-button[contains(.,'Create Condition')]");
						TargetConditionObjects.clickBasicTargetConditionWithAge();

					} else if (targetSelection.contains("SavedSegments")) {
						broadcastPageObjects.clickOnSavedSegments();
						broadcastPageObjects.selectSavedSegmentSelectorField("SegmentForMoreThanTenConditions");
					}
					
					
					Thread.sleep(2000);
//					broadcastPageObjects.clickProceedButton();
//					Thread.sleep(2000);
//					broadcastPageObjects.clickProceedButton();
//					Thread.sleep(2000);
//					broadcastPageObjects.clickProceedButton();
					
					jswait.loadClick("//paper-button[contains(.,'Save')]");
			      	Thread.sleep(2000);
			      	jswait.loadClick("(//paper-button[contains(.,'Yes')][1])[1]");
			      	
			      	if(jswait.checkVisibility("//span[contains(.,'Changes have been saved and will be active on the next refresh cycle.  If all intended changes are done, click Close else click Continue.')]")==true) {
			      		Thread.sleep(2000);
			      		jswait.loadClick("//paper-button[contains(.,'Close')]");
			      	} 
			       	
				}
				
				
				  @Then("^verify rule target selection (.*) after edit from sheet \"([^\"]*)\" and product \"([^\"]*)\"$")
					 public void verifyRuletargetselectionaftereditFromSheet(String condition,String sheet,String sheet2) throws Exception {
						 Thread.sleep(2000);
						 ExcelHelper programExcel = new ExcelHelper();
						    eh.setExcelFile("ruleInputData",sheet);
							String name = (String) eh.getCell(1, 0);
							programExcel.setExcelFile("productInputData", sheet2);
							
							String product=(String) programExcel.getCell(1, 0);
						    programPage.verifyRuletargetselectionaftereditFromSheet(name,product,condition);
						 
						 
					 }
				  @Then("^navigate to rules$")
					 public void navigatetorules() throws Exception {
						 Thread.sleep(2000);
					
						    programPage.navigatetorules();
						 
						 
					 }
				
			
				  @Then("^verify offer \"([^\"]*)\"$")
					 public void verify_The_offer_in_CS(String offertype) throws Exception {
					  String offer;
						 Thread.sleep(2000);
						 
						 offer=jswait.getTextFormElement("//data-table-row/div[@class='cells style-scope data-table-row']/data-table-cell[@class='customer-assessment style-scope']/span[contains(.,'"+offertype+"')]");
						 System.out.println(offer);
						 Assert.assertEquals(offer,offertype);
						 
					 }
				
				  @Then("^enter msisdn again for refresh \"([^\"]*)\"$")
					 public void msisdnrefresh(String num) throws Exception {
					  String key=num;
						 Thread.sleep(2000);
					
						jswait.loadClick("//paper-icon-button[@icon=\"icons:create\"]");
						Thread.sleep(2000);
						jswait.loadSendKeys("//label[contains(text(),'Customer Number')]/../input", key);
						 
						 
					 }
				
				  @Then("^Customercare offer accept$")
					 public void customercareofferaccept() throws Exception {
						 Thread.sleep(2000);
						 jswait.loadClick("//paper-button[contains(.,'Accept')]");
						 Thread.sleep(2000);
						 jswait.loadClick("(//paper-button[contains(.,'Yes')])[1]");
						 Thread.sleep(2000);
						 
						 jswait.loadClick("//div[@class='tab-content style-scope paper-tab'][contains(.,'History')]");
						 Thread.sleep(4000);
						 driver.navigate().refresh();
						 String status=jswait.getTextFormElement("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div/data-table-row/div/data-table-cell[9]");
						 System.out.println(status);
						 Thread.sleep(2000);
							Assert.assertEquals("Accepted, No Reward",status);
					 }
				
				  @Then("^change Customercare Prioritization Logic to \"([^\"]*)\" from sheet \"([^\"]*)\"$")
					 public void changeprioritizationlogic(String type,String sheet) throws Exception {
						 Thread.sleep(2000);
						 ExcelHelper programExcel = new ExcelHelper();
						    eh.setExcelFile("touchpointInputData",sheet);
							String name = (String) eh.getCell(1, 0);
							Thread.sleep(2000);
							touchpointPage.customercaretouchpointsclick(name);
						 
						touchpointPage.customerCareSelectPrioritizationLogicnew(type);
						 
					 }
				
				  
				  @Then("^change ussd Prioritization Logic to \"([^\"]*)\" from sheet \"([^\"]*)\"$")
					 public void changeprioritizationlogicUSSD(String type,String sheet) throws Exception {
						 Thread.sleep(2000);
						 ExcelHelper programExcel = new ExcelHelper();
						    eh.setExcelFile("touchpointInputData",sheet);
							String name = (String) eh.getCell(1, 0);
							Thread.sleep(2000);
							touchpointPage.USSDtouchpointsclick(name);
						 
						touchpointPage.USSDSelectPrioritizationLogicnew(type);
						 
					 }
				  @Then("^change SMS Prioritization Logic to \"([^\"]*)\" from sheet \"([^\"]*)\"$")
					 public void changeprioritizationlogicSMS(String type,String sheet) throws Exception {
						 Thread.sleep(2000);
						 ExcelHelper programExcel = new ExcelHelper();
						    eh.setExcelFile("touchpointInputData",sheet);
							String name = (String) eh.getCell(1, 0);
							Thread.sleep(2000);
							touchpointPage.SMStouchpointsclick(name);
						 
						touchpointPage.SMSSelectPrioritizationLogicnew(type);
						 
					 }
				  
				  
				  
				  @Then("^verify create program withstarts and ends page \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
					public void verify_create_program_page_from_sheetstartsat(String sheet1, String sheet2, String sheet3) throws Throwable {
						Thread.sleep(4000);
				    	ExcelHelper programExcel = new ExcelHelper();
//				    	ExcelHelper programExcel2 = new ExcelHelper();
				    	
				    	programExcel.setExcelFile("programInputData", sheet1);
				    	
//				    	programExcel2.setExcelFile("programInputDataedit", sheet1);
				    	
				    	Random rn = new Random();
				    	int  n = rn.nextInt(5000) + 1;
				 		String name = (String) programExcel.getCell(1, 0);
				  		name =  name.replaceAll("[0-9]", "")+n;
				 		programExcel.setCell(1, 0, name);
				 		
				 		
				 		Thread.sleep(4000);
						programPage.clickCreateProgramButton();
						programPage.enterProgramDetailsfromSheet(name,sheet2);
						
						programPage.clickCreateProgramAddTouchpointButton();
						programPage.addTouchPointToProgramFromSheet(sheet3);
						programPage.clickPorogramProceedButton();
						programPage.programschstart();
						programPage.prmstartsat();
						programPage.programschend();
						programPage.prmshcselectnoend();
						programPage.programschrefreshcycle();
						programPage.prmshcselectdays();
						Thread.sleep(2000);
						programPage.prmeverylabel();
						programPage.prmrecycleinputclick();
						programPage.prmrecycleinput();
						programPage.newprmrefreshat();
//						programPage.pgmtimeokbtn();
						programPage.programschserveon(); 
						programPage.prmshcserveonalldays();
						//programPage.createProgramSaveButton();
						Thread.sleep(2000);
						programPage.programactivatebtn();
						programPage.programconfirmactivateyes();
						System.out.println("program has created successfully");
					}
				
				  @Then("^login to the vcust$")
					 public void getvcustportid() throws Exception {
						 Thread.sleep(2000);
					
//						    String port;
//						   port= MarathonHelper.getContainerPort(p.getValue("marathonip"),"neon/infra/vcust");
//						   String node=MarathonHelper.getContainerNode(p.getValue("marathonip"),"neon/infra/vcust");
//						   System.out.println("node is "+node);
////						   
//						   System.out.println("port is "+port);
//						   String url=node.concat(".flytxt.com:"+port);
//						   System.out.println("url is"+url);
//						   
//						   driver.get("http://"+url);
						   driver.get("https://vcust.infra.neon");
						   Thread.sleep(2000);
						   
						 driver.findElement(By.xpath("/html/body/table//form[@action='/login']/table//input[@name='name']")).sendKeys(p.getValue("username"));
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("/html/body/table//form[@action='/login']/table//input[@name='pass']")).sendKeys(p.getValue("vcustpass"));
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("/html/body/table//form[@action='/login']/table//input[@name='submit']")).click();
						
						 driver.findElement(By.xpath("//a[contains(.,'Inject')]")).click();
						    
					 }
				  
				  
				
				
				  @Then("^navigate back to vcust$")
					 public void logoutvcust() throws Exception {
						 Thread.sleep(2000);
						  driver.get("http://node4.soakqa.flytxt.com:8999");
						   Thread.sleep(2000);
						   driver.findElement(By.xpath("//a[contains(.,'Inject')]")).click();
						
						    
					 }
				  
				  
				
				  @Then("^hit with vcust SMS with number \"([^\"]*)\" with keyword \"([^\"]*)\"$")
					 public void getvcustmessage(String number,String keyword) throws Exception {
						 Thread.sleep(2000);
						 jswait.loadClick("//a[@href='inject_mo.htm']");	
						 
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("//textarea[@name='short_message']")).clear();
						 jswait.loadSendKeys("//textarea[@name='short_message']",keyword);
				
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("//input[@name='source_addr']")).clear();
						 jswait.loadSendKeys("//input[@name='source_addr']",number);
						 Thread.sleep(2000);
						 driver.findElement(By.xpath("//input[@name='destination_addr']")).clear();
						 jswait.loadSendKeys("//input[@name='destination_addr']","1011");
						 Thread.sleep(2000);
						 jswait.loadClick("//input[@name='submit']");
					
						
						
						    
					 }
				  @Then("^navigate to the neon again$")
					 public void navigateback() throws Exception {
						 Thread.sleep(2000);
						 
						 driver.get("http://"+p.getValue("env"));
						 try{
							 jswait.loadClick("//body[@class='fullbleed layout vertical']");
						 }
						 catch (Exception e) {
							 System.out.println("Robob x popup off....");
						 }
					 }
				  
			
				  
					 @Then("^create new rule with enddate from sheet \"([^\"]*)\" and offer \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
						public void createNewProgramRulewithenddate(String sheet1,String offerType,String touchpointList) throws Throwable {
							Thread.sleep(4000);
							
					    	ExcelHelper programExcel = new ExcelHelper();
					    	programExcel.setExcelFile("programInputData", sheet1);
					    	ExcelHelper offerExcel = new ExcelHelper();
					    	offerExcel.setExcelFile("offerInputData", offerType);
					    	
					 		String name = (String) programExcel.getCell(1,0);
					 		
					 		Thread.sleep(4000);
							//programPage.clickCreateProgramButton();
					 		System.out.println(touchpointList);
							programPage.createNewProgramRulewithenddate(name,SELENIUM_LIST_IM,touchpointList,offerExcel.getCellByColumnName("Offer Type"));
							dateForCompare = new Date();
							System.out.println(dateForCompare);
							
						}
				
				
					@Then("^get-offer api-server for \"([^\"]*)\" with touchpoint \"([^\"]*)\" and rule \"([^\"]*)\"$")
					public void getOfferApiServerForNumber(String number,String touchpointSheet,String ruleSheet) throws Throwable {
						StringBuilder str = new StringBuilder();
						str.append("http://");
						MarathonHelper m = new MarathonHelper();
						
						str.append(p.getValue("nginxIp"));
						str.append(":");
						str.append("8092");
						eh.setExcelFile("touchpointInputData", touchpointSheet);
						str.append("/rest/authkey/"+p.getValue("ApiTouchpointauthkey")+"/msisdn/"+number+"/offers");
						System.out.println(str.toString());
						Request req = new Request();
						req.getRequest(str.toString(),"");
						
						offerRecommended = req.responseString;
						System.out.println("this is the response"+req.responseString);
						eh.setExcelFile("ruleInputData", ruleSheet);
						SQLHandler sql = new SQLHandler();
						int ruleId = getRuleId(eh.getCellByColumnName("Rule Name"));
//						Assert.assertTrue("Specified rule not found in response of get offer", offerRecommended.contains("\"id\":\""+ruleId+"\","));
					}
					
												@Then("^wait for Message Recevied in consumer profile$")
								public void wait_for_MessageRecevied() throws Throwable {
									CustomerProfilePage customerProfilePage = new CustomerProfilePage();
									customerProfilePage.clickEventTypesCheckBox();
									customerProfilePage.clickEventTypesCheckBox();
									customerProfilePage.clickMessageReceivedCheckBoxCheckBox();
									customerProfilePage.clickSelectEventApplyButton();
									Thread.sleep(2000);
								
										
										if(driver.findElement(By.xpath("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row/div[1]/data-table-cell[3]")).getText().equalsIgnoreCase("Message Received")) {
											Thread.sleep(2000);
											System.out.println("inside if");
											jswait.loadClick("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row/div[1]/data-table-cell[3]");
										
										
									}
//									
//									Assert.assertTrue("offer Recommended event not found", checkOfferRecommendedEventTime(dateForCompare,timeStamp));
								}
												
												//---------------------------------------
												@Then("^get-offer USSD for \"([^\"]*)\" with touchpoint \"([^\"]*)\" and rule \"([^\"]*)\" type \"([^\"]*)\" msg \"([^\"]*)\" where cid= \"([^\"]*)\"$")
												public void getOfferUSSDForNumber(String number,String touchpointSheet,String ruleSheet,String type,String msg,String cid) throws Throwable {
													StringBuilder str = new StringBuilder();
													str.append("http://");
													MarathonHelper m = new MarathonHelper();
													
													str.append(p.getValue("nginxIp"));  
													str.append(":");
													str.append("8092");
													eh.setExcelFile("touchpointInputData", touchpointSheet);
													str.append("/ussd/authkey/"+p.getValue("ApiTouchpointauthkey")+"?msisdn="+number+"&sessionId=5599&type="+type+"&msg="+msg+"&cid="+cid+"");
													System.out.println(str.toString());
													Request req = new Request();
													req.getRequest(str.toString(),"");
													
													offerRecommended = req.responseString;
													System.out.println("this is the response"+req.responseString);
													eh.setExcelFile("ruleInputData", ruleSheet);
													
												}
												
												@Then("^wait for offer accepted event in consumer profile for program$")
												public void wait_for_offer_accepted_event_for_pgrm() throws Throwable {
													CustomerProfilePage customerProfilePage = new CustomerProfilePage();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickOfferAcceptedEventCheckBox();
													customerProfilePage.clickOfferRecommendedEventCheckBox();
													customerProfilePage.clickSelectEventApplyButton();
												Thread.sleep(2000);
													TimeoutImpl t = new TimeoutImpl();
													t.startTimer();
													String date = getLastOfferRecommendedEventTime();
													String date2=getLastOfferAcceptedEventTime();
										
													Date timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
													Date timeStamp2 = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date2);
													
													Assert.assertEquals(date,date2);
												}
				
												
												@Then("^recharge conversion job for program$")
												public void recharge_conversion_for_pgrm() throws Throwable {
													
													SQLHandler sql = new SQLHandler();
													System.out.println("Providing file for conversion ");
													BroadcastSteps.provideFileForConversion();
													
													int ss = sql.executeUpdate("UPDATE sch_data_job SET STATUS_ID=41 WHERE DATA_JOB_ID=69394");
													System.out.println("Job Scehduled... .. ."+ss);
													System.out.println("Waiting for 10 mins for job completion");
													
													Thread.sleep(600000);
													
													System.out.println("Removing file from conversion. .. .. ... .");
													BroadcastSteps.deleteFileForConversion();
													int ss2 = sql.executeUpdate("UPDATE sch_data_job SET STATUS_ID=26 WHERE DATA_JOB_ID=69394");
													System.out.println("Deactivate the JOb ... .. ." +ss2);
												}
				
												@Then("^wait for Fulfillment Success in consumer profile with offer \"([^\"]*)\"$")
												public void wait_for_fulfillment(String offerType) throws Throwable {
													
													ExcelHelper ruleExcel = new ExcelHelper();
											    	ruleExcel.setExcelFile("ruleInputData", "rule");
											    	ExcelHelper offerExcel = new ExcelHelper();
											    	offerExcel.setExcelFile("offerInputData", offerType);
													
													CustomerProfilePage customerProfilePage = new CustomerProfilePage();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickFulfillmentSuccessCheckBox();
													customerProfilePage.clickSelectEventApplyButton();
													Thread.sleep(2000);
													String rulename = (String) ruleExcel.getCell(1, 0);
													
													String offer = (String) offerExcel.getCell(1, 0);
														
														if(driver.findElement(By.xpath("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row/div[1]/data-table-cell[3]")).getText().equalsIgnoreCase("Fulfillment Success")) {
															Thread.sleep(2000);
															System.out.println("inside if");
															Thread.sleep(10000);
															jswait.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + offer + "')]");
															boolean booledn = jswait.checkVisibility(
																	"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + rulename + "')]");
														
														
													}
//													
//													Assert.assertTrue("offer Recommended event not found", checkOfferRecommendedEventTime(dateForCompare,timeStamp));
												}
												
//												@Then("^wait for offer recommended event for API in consumer profile$")
//												public void wait_for_Recommended_event_for_api() throws Throwable {
//													Date now = new Date();
//													Calendar calendar = Calendar.getInstance();
//													int min = calendar.get(Calendar.MINUTE);
//													now.setMinutes(min-2);
//													dateForCompare = now;
//												CustomerProfilePage customerProfilePage = new CustomerProfilePage();
//													customerProfilePage.clickEventTypesCheckBox();
//													customerProfilePage.clickEventTypesCheckBox();
//													customerProfilePage.clickOfferRecommendedEventCheckBox();
//													customerProfilePage.clickSelectEventApplyButton();
//													Thread.sleep(2000);
//													
//													ExcelHelper ruleExcel = new ExcelHelper();
//											    	ruleExcel.setExcelFile("ruleInputData", "rule");
//											    	
//											    	
//													if(driver.findElement(By.xpath("(//iron-data-table[@id='table']//iron-list[@id='list']//data-table-row//span[contains(.,'Offer Recommended')])[1]")).getText().equalsIgnoreCase("Offer Recommended")){
//														Thread.sleep(2000);
//														System.out.println("inside if");
//														Thread.sleep(10000);
//														jswait.checkVisibility("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div[@id='items']/div[2]/data-table-row//data-table-row-detail/events-expander//div[@title='defaultapiTPUR']");
//														
//													
//													
//												}
//												}
				
												
												
												
												
												@Then("^verify the program condition (.*) event for the bc from sheet \"([^\"]*)\" for the campaign from sheet \"([^\"]*)\"$")
												public void verify_the_condition_event_for_the_bc_from_sheet_for_the_campaign_from_sheet(String event,String bcSheet, String campaignSheet) throws Exception {
											      eh.setExcelFile("bcInputData", bcSheet);
											      String bcName =eh.getCellByColumnName("BC Name");
											      
											      
											     
											      //touchpointPage.verifyEventOfTheprogram(event,bcName,camapignName);
											     
												}
												
												
												
												
												@Then("^wait for offer recommended event for API in consumer profile$")
												public void wait_for_conversion() throws Throwable {
													Date now = new Date();
													Calendar calendar = Calendar.getInstance();
													int min = calendar.get(Calendar.MINUTE);
													now.setMinutes(min-2);
													dateForCompare = now;
													CustomerProfilePage customerProfilePage = new CustomerProfilePage();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickOfferRecommendedEventCheckBox();
													customerProfilePage.clickSelectEventApplyButton();
													Thread.sleep(2000);
													
													ExcelHelper ruleExcel = new ExcelHelper();
											    	ruleExcel.setExcelFile("ruleInputData", "rule");
											    	
											    	
													if(driver.findElement(By.xpath("(//iron-data-table[@id='table']//iron-list[@id='list']//data-table-row//span[contains(.,'Offer Recommended')])[1]")).getText().equalsIgnoreCase("Offer Recommended")){
														Thread.sleep(2000);
														System.out.println("inside if");
														Thread.sleep(10000);
														jswait.checkVisibility("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div[@id='items']/div[2]/data-table-row//data-table-row-detail/events-expander//div[@title='defaultapiTPUR']");
														
													
													
												}
												}
												
												
												@Then("^wait for conversion in consumer profile with offer \"([^\"]*)\"$")
												public void wait_for_conversion(String offerType) throws Throwable {
													
													ExcelHelper ruleExcel = new ExcelHelper();
											    	ruleExcel.setExcelFile("ruleInputData", "rule");
											    	ExcelHelper offerExcel = new ExcelHelper();
											    	offerExcel.setExcelFile("offerInputData", offerType);
													
													CustomerProfilePage customerProfilePage = new CustomerProfilePage();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickFulfillmentSuccessCheckBox();
													customerProfilePage.clickSelectEventApplyButton();
													Thread.sleep(2000);
													String rulename = (String) ruleExcel.getCell(1, 0);
													
													String offer = (String) offerExcel.getCell(1, 0);
														
														if(driver.findElement(By.xpath("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row/div[1]/data-table-cell[3]")).getText().equalsIgnoreCase("Conversion")) {
															Thread.sleep(2000);
															System.out.println("inside if");
															Thread.sleep(10000);
															jswait.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + offer + "')]");
															boolean booledn = jswait.checkVisibility(
																	"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + rulename + "')]");
														
														
													}
//													
//													Assert.assertTrue("offer Recommended event not found", checkOfferRecommendedEventTime(dateForCompare,timeStamp));
												}
												
												
												
												
												@Then("^wait for Acknowledgement in consumer profile with offer \"([^\"]*)\"$")
												public void wait_for_ack(String offerType) throws Throwable {
													
													ExcelHelper ruleExcel = new ExcelHelper();
											    	ruleExcel.setExcelFile("ruleInputData", "rule");
											    	ExcelHelper offerExcel = new ExcelHelper();
											    	offerExcel.setExcelFile("offerInputData", offerType);
													
													CustomerProfilePage customerProfilePage = new CustomerProfilePage();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickEventTypesCheckBox();
													customerProfilePage.clickFulfillmentSuccessCheckBox();
													customerProfilePage.clickSelectEventApplyButton();
													Thread.sleep(2000);
													String rulename = (String) ruleExcel.getCell(1, 0);
													
													String offer = (String) offerExcel.getCell(1, 0);
														
														if(driver.findElement(By.xpath("//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row/div[1]/data-table-cell[3]")).getText().equalsIgnoreCase("Acknowledged")) {
															Thread.sleep(2000);
															System.out.println("inside if");
															Thread.sleep(10000);
															jswait.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + offer + "')]");
															boolean booledn = jswait.checkVisibility(
																	"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + rulename + "')]");
														
														
													}
//													
//													Assert.assertTrue("offer Recommended event not found", checkOfferRecommendedEventTime(dateForCompare,timeStamp));
												}
												
												
												  @Then("^verify rule view after edit in IM from sheet \"([^\"]*)\" and product \"([^\"]*)\"$")
													 public void verifyRuleviewaftereditFromSheetim(String sheet,String sheet2) throws Exception {
														 Thread.sleep(2000);
														 ExcelHelper programExcel = new ExcelHelper();
														    eh.setExcelFile("ruleInputData",sheet);
															String name = (String) eh.getCell(1, 0);
															programExcel.setExcelFile("productInputData", sheet2);
															
															String product=(String) programExcel.getCell(1, 0);
														    programPage.verifyRuleviewaftereditFromSheetIM(name,product);
														 
														 
													 }												
												  @Then("^verify accept api-server for \"([^\"]*)\" with touchpoint \"([^\"]*)\" and rule \"([^\"]*)\"$")
													public void verifyacceptApiServerForNumber(String number,String touchpointSheet,String ruleSheet) throws Throwable {
														StringBuilder postBody = new StringBuilder();
														postBody.append("{\"event\":[\r\n" + 
																"{ \"id\":\"104\", \"type\":\"POST\", \"value\":\"");
														eh.setExcelFile("ruleInputData", ruleSheet);
														int ruleId = getRuleId(eh.getCellByColumnName("Rule Name"));
														System.out.println(ruleId);
														postBody.append(ruleId);
														postBody.append("\", \"date\":\"");
														Date now = new Date();
														Calendar calendar = Calendar.getInstance();
														int min = calendar.get(Calendar.MINUTE);
														now.setMinutes(min+2);
														String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
														postBody.append(timeStamp);
														postBody.append(" +0530\" }");
														postBody.append("]}");
														System.out.println(postBody.toString());
														StringBuilder str = new StringBuilder();
														str.append("http://");
														MarathonHelper m = new MarathonHelper();
														str.append(p.getValue("nginxIp"));
														str.append(":");
														str.append("8092");
														eh.setExcelFile("touchpointInputData", touchpointSheet);
														str.append("/rest/authkey/"+"selenium"+"/msisdn/"+number+"/kpi/events");
														System.out.println(str.toString());
														Request req = new Request();
														String resp=req.postRequeststring(str.toString(), postBody.toString());
														
														String code=resp.substring(0, 3);
														System.out.println(code);
														assertEquals("406",code);
													}
												
												
												
												
												  @Then("^verify get-offer api-server for \"([^\"]*)\" with touchpoint \"([^\"]*)\" and rule \"([^\"]*)\"$")
													public void verifygetOfferApiServerForNumber(String number,String touchpointSheet,String ruleSheet) throws Throwable {
														StringBuilder str = new StringBuilder();
														str.append("http://");
														MarathonHelper m = new MarathonHelper();
														
														str.append(p.getValue("nginxIp"));
														str.append(":");
														str.append("8092");
														eh.setExcelFile("touchpointInputData", touchpointSheet);
														str.append("/rest/authkey/"+p.getValue("ApiTouchpointauthkey")+"/msisdn/"+number+"/offers");
														System.out.println(str.toString());
														Request req = new Request();
														String resp=req.getRequeststring(str.toString(),"");
														System.out.println("response is "+resp);
														offerRecommended = req.responseString;
														System.out.println("this is the response"+req.responseString);
														eh.setExcelFile("ruleInputData", ruleSheet);
														SQLHandler sql = new SQLHandler();
														int ruleId = getRuleId(eh.getCellByColumnName("Rule Name"));
//														Assert.assertTrue("Specified rule not found in response of get offer", offerRecommended.contains("\"id\":\""+ruleId+"\","));
														
												  
												  }
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
												
				
}

