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
	
	
}
