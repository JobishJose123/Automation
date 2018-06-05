package stepDefinitions;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.IntentManagementPageObjects;
import pageObjetcs.ProgramPage;
import pageObjetcs.TouchpointPage;

public class IntentManagement extends Init{
	CommonObjects commonObjects = new CommonObjects();
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eh = new ExcelHelper(); 
	WebDriverWait wait = new WebDriverWait(driver, 10);
	IntentManagementPageObjects intentManagementPage = new IntentManagementPageObjects();
	TouchpointPage touchpointPage = new TouchpointPage();
	ProgramPage programPage = new ProgramPage();
	@Then("^navigate to touchpoints")
	public void navigateToTouchpoints() throws InterruptedException {
		intentManagementPage.navigateToTouchpoints();
		Thread.sleep(3000);
	}
	@Then("^navigate to programs")
	public void navigateToPrograms() throws InterruptedException {
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
 		name =  name.replaceAll("[0-9]", "")+n;
 		eh.setCell(1, 0, name);
		touchpointPage.createTriggerTouchpoint(name);
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
 		name =  name.replaceAll("[0-9]", "")+n;
 		eh.setCell(1, 0, name);
		touchpointPage.createSmsTouchpoint(name);
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
 		name =  name.replaceAll("[0-9]", "")+n;
 		eh.setCell(1, 0, name);
	  touchpointPage.createApiTouchpoint(name);
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
	public void createSMSTouchpointWithoutMandatoryFields(String name) throws Throwable {
	  touchpointPage.createSMSTouchpointWithoutMandatoryFields(name);
	
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
		programPage.selectOfferCatalog();
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
		System.out.println("deleted");
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
		programPage.addTouchPointToProgramFromSheet(sheet3);
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
	   
	   
	   @Then("^verify edit program page \"([^\"]*)\" and offer catalog sheet \"([^\"]*)\" and touchpoint from sheet \"([^\"]*)\"$")
	public void verify_edit_program_page_from_sheet(String sheet1, String sheet2, String sheet3) throws Throwable {
//		Thread.sleep(4000);
//    	ExcelHelper programExcel = new ExcelHelper();
//    	programExcel.setExcelFile("programInputData", sheet1);
//    	Random rn = new Random();
//    	int  n = rn.nextInt(5000) + 1;
// 		String name = (String) programExcel.getCell(1, 0);
//  		name =  name.replaceAll("[0-9]", "")+n;
// 		programExcel.setCell(1, 0, name);
// 		Thread.sleep(4000);
//		programPage.clickCreateProgramButton();
//		programPage.enterProgramDetailsfromSheet(name,sheet2);
		programPage.clickPorogramProceedButton();
		programPage.clickCreateProgramAddTouchpointButton();
		programPage.addTouchPointToProgramFromSheet(sheet3);
		programPage.clickPorogramProceedButton();
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
		//programPage.clickEditProgramSaveButton();
		Thread.sleep(2000);
		//programPage.programactivatebtn();
		programPage.confirmProgramEditSave();
		System.out.println("program has edited successfully");
	}
	   
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
			String name = (String) eh.getCell(1, 0);
		    filterWorkaround(name);
		    commonObjects.clickOptionsIcon();
		    programPage.clickPorogramViewRulesButton();
		 
		 
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
		
		@Then("^edit api touchpoint from sheet \"([^\"]*)\"$")
		public void edit_api_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			touchpointPage.Apiedittouchpointsclick();
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eh.setCell(1, 0, name);
		  touchpointPage.editapiTouchpointDetails("edited "+name);
		  String newname="edited "+name;
		  System.out.println(newname);
		  touchpointPage.apiedittouchpointcheck(newname);
		  
		}
		
		@Then("^delete api touchpoint from sheet \"([^\"]*)\"$")
		public void delete_api_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eh.setCell(1, 0, name);
		  		  System.out.println(name);
		  touchpointPage.apideletetouchpointcheck(name);
		  
		  
		}
		
		
		@Then("^delete sms touchpoint from sheet \"([^\"]*)\"$")
		public void delete_sms_touchpoint(String sheet) throws Throwable {
			Thread.sleep(4000);
			
			eh.setExcelFile("touchpointInputData", sheet);
			Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eh.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eh.setCell(1, 0, name);
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
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		String newname="edited "+name;
	 		eh.setCell(1, 0, newname);
	 		Thread.sleep(3000);
		  touchpointPage.editSmsTouchpointDetails(newname);
		  
		  System.out.println(newname);
		  Thread.sleep(6000);
		  eh.setCell(1, 0, newname);
		  touchpointPage.smsedittouchpointcheck(newname);
		  
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
		
	
}
