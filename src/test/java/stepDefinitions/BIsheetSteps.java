package stepDefinitions;
import java.util.Calendar;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.BIsheetPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.ReportPageObjects;


public class BIsheetSteps extends Init {
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	ExcelHelper eM = new ExcelHelper();
	BIsheetPageObjects BIobjects = new BIsheetPageObjects();
	CommonObjects CommonObjects=new CommonObjects();
	 ReportPageObjects  ReportPageObject = new  ReportPageObjects();
	 
	 @FindBy(xpath="//paper-button[contains(.,'Add')]")
	  private WebElement BIAdd;
	
	@FindBy(xpath="//iron-icon[@icon='icons:filter-list']")
 private WebElement setFilter;
	
	
	public BIsheetSteps()
	{
		PageFactory.initElements(driver, this);
	}
	
	@Then("^navigate to Business Intelligence$")
	public void navigate_to_Business_Intelligence() throws Throwable {
		BIobjects.clickBusinessIntelligence();
		
	}
	@Then("^filter BI worksheet from sheet \"([^\"]*)\"$")
	public void filter_BI_worksheet_from_sheet(String sheetname) throws Throwable {
		eh.setExcelFile("BIworksheet", sheetname);
		String name = eh.getCellByColumnName("BI_sheetname");
		CommonObjects.filterName(name);
		
	}
	@Then("^deactivate the BIsheet from \"([^\"]*)\"$")
	public void deactivate_the_BIsheet_from(String sheetname) throws Throwable {
		eh.setExcelFile("BIworksheet", sheetname);
		String name = eh.getCellByColumnName("BI_sheetname");
		CommonObjects.filterName(name);
	}
	
	@Then("^verify the Acknowledgement count is equal to \"([^\"]*)\"$")
	public void verify_the_Acknowledgement_count_is_equal_to(String ack) throws Throwable {
		ReportPageObject.biAckVerification(ack);
	}
	@Then("^verify the Offer elligible count is equal to \"([^\"]*)\"$")
	public void verify_the_Offer_elligible_count_is_equal_to(String offerelligible) throws Throwable {
		ReportPageObject.biofferelligibleVerification(offerelligible);
	}
	@Then("^verify the ack count is equal to \"([^\"]*)\"$")
	public void verify_the_ack_count_is_equal_to(String offerack) throws Throwable {
		ReportPageObject.biofferackVerification(offerack);
	}
	@Then("^verify the Ack_count is equal to \"([^\"]*)\"$")
	public void verify_the_Ack_count_is_equal_to(String ack_event) throws Throwable {
		ReportPageObject.biAckevents(ack_event);
	}
	@Then("^click on the BI sheet \"([^\"]*)\"\\.$")
	public void click_on_the_BI_sheet(String sheetname) throws Throwable {
		eh.setExcelFile("BIworksheet", sheetname);
		String name = eh.getCellByColumnName("BI_sheetname");
		jswait.loadClick("(//vaadin-grid-cell-content/div[contains(.,'"+name+"')])[1]");
		
	}
	@Then("^filter program rule from \"([^\"]*)\" sheet$")
	public void filter_program_rule_from_sheet(String sheet) throws Throwable {
		eh.setExcelFile("ruleInputData", sheet);
		String rulename=eh.getCellByColumnName("Rule Name");
		ReportPageObject.FilterBiinbound(rulename);
	}
	@Then("^filter offer name from \"([^\"]*)\" sheet$")
	public void filter_offer_name_from_sheet(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		String offername=eh.getCellByColumnName("Offer Name");
		ReportPageObject.FilterBioffers(offername);
	}
	
	@Then("^filter broadcast from \"([^\"]*)\" sheet$")
	public void filter_broadcast_from_sheet(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String bcName=eh.getCellByColumnName("BC Name");
		ReportPageObject.FilterBifunction(bcName);
	}
	@Then("^verify \"([^\"]*)\" worksheet$")
	public void verify_worksheet(String arg1) throws Throwable {
		jswait.loadClick(setFilter);
		jswait.loadClick(BIAdd);
	}
	
	
	@Then("^create BI worksheet from sheet \"([^\"]*)\" with time range \"([^\"]*)\"$")
	public void create_BI_worksheet_from_sheet_with_time_range(String sheetname, String timerange) throws Throwable {
		eh.setExcelFile("BIworksheet", sheetname);
		String name = eh.getCellByColumnName("BI_sheetname");
		String description = eh.getCellByColumnName("BI_sheet-description");
		name = RandomNameGenerator.getRandomName(name);
		eh.setCell("BI_sheetname",name);
//		System.out.println(name);
//		System.out.println(description);
//		timerange = "1";
//		System.out.println(timerange);
		if(sheetname.equals("BIworksheetoutbound")) {
			BIobjects.createBIworksheetoutbound(name,description,timerange);
		}
		else if(sheetname.equals("BIworksheetinbound")){
			BIobjects.createBIworksheetinbound(name,description,timerange);
		}
		else if(sheetname.equals("BIworksheetoffersproducts")){
			BIobjects.createBIworksheetoffersproducts(name,description,timerange);
		}
		else if(sheetname.equals("BIworksheetEvents")){
			BIobjects.createBIworksheetEvents(name,description,timerange);
		}
		else if(sheetname.equals("BIEandASheet")) {
			BIobjects.createBIEandASheet(name,description,timerange);
		}
		else if(sheetname.equals("BISeeding")) {
			BIobjects.createBISeedingSheet(name,description,timerange);
		}
		else if(sheetname.equals("BIEventscope")) {
			BIobjects.createBICommonEvents(name,description,timerange);
		}	
		else if(sheetname.equals("BIPMwithgroup")) {
			BIobjects.createBIPMwithgroups(name,description,timerange);
		}
		else if(sheetname.equals("BIwithAttributes")) {
			BIobjects.createBIPMwithAttributes(name,description,timerange);
		}
		else if(sheetname.equals("BIwithCustSegment")) {
			BIobjects.createBIPMwithCustSegment(name,description,timerange,sheetname);
		}
		else if(sheetname.equals("NumAttrCustCalculation")) {
			BIobjects.createBINumAttrCustCalculation(name,description,timerange);
		}
		else if(sheetname.equals("EventDomainReport")) {
			BIobjects.createBIEventDomainReport(name,description,timerange);
		}
	}
	
	@Then("^save the BI sheet$")
	public void save_the_BI_sheet() throws Throwable {
		BIobjects.saveBISheet();
		
	}
	
	@Then("^filter the BI worksheet for status check from sheet \"([^\"]*)\"$")
	public void filter_the_BI_worksheet_for_status_check_from_sheet(String sheetname) throws Throwable {
		eh.setExcelFile("BIworksheet", sheetname);
		String name = eh.getCellByColumnName("BI_sheetname");
		CommonObjects.filterName(name);
		
	}
	
	@Then("^wait until BI worksheet status is changed to \"([^\"]*)\"$")
	public void wait_until_BI_worksheet_status_is_changed_to(String BIsheetstatus) throws Throwable {
		Thread.sleep(5000);
		jswait.loadClick("//div[@id='toggleButton']");
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		String currWorksheetstatus = BIobjects.getBIsheetstatus();
		while(!BIsheetstatus.contentEquals(currWorksheetstatus)&& t.checkTimerMin(180)) {
			Thread.sleep(2000);
			currWorksheetstatus = BIobjects.getBIsheetstatus();
		}
		Assert.assertTrue("Required status not found", BIsheetstatus.contentEquals(currWorksheetstatus));
	}
	
	
///////==============================================================================================================================================================
	

	@Then("^save \"([^\"]*)\" data to sheet \"([^\"]*)\" to the column \"([^\"]*)\"$")
	public void save_data_to_sheet_to_the_column(String header, String sheet, String columnName) throws Throwable {
		
		Thread.sleep(2000);
		String BcName;
		eM.setExcelFile("bcInputData", "one-offBC");
		eh.setExcelFile("BIworksheet", sheet);
		
		if(header.equalsIgnoreCase("Ack"))
		{   
			BcName=(String)eM.getCellByColumnName("BC Name");
			WebElement ack=driver.findElement(By.xpath("//vaadin-grid-cell-content[contains(.,'"+BcName+"')]//following::vaadin-grid-cell-content[7]"));
			System.out.println("Ack Count In Broadcast Under Campaign ===> "+ack.getText()+" <=================");
			eh.setCell(columnName, ack.getText());
			System.out.println("Ack countt ++++++++++++=========="+eh.getCellByColumnName("BC_ACK"));
			
		}		
	}
	
	
	@Then("^filter based on HeaderName \"([^\"]*)\" from WorkBook \"([^\"]*)\" and sheet \"([^\"]*)\"$")
	public void filter_based_on_HeaderName_from_WorkBook_and_sheet(String headerName, String workBook, String sheetName) throws Throwable {
	
		String headerRef="";
		eM.setExcelFile(workBook, sheetName);
		jswait.loadClick(setFilter);
		jswait.loadClick(BIAdd);
		 
		headerRef=(String) eM.getCell(1,0);
		System.out.println("==> "+headerRef);
		BIobjects.applyFilter(headerRef, headerName);
		
		//jswait.checkVisibility("(//vaadin-grid-cell-content[text()='"+headerName+"']//following::vaadin-grid-cell-content[6]//span)[1]");
	
		
	}

	
	@Then("^verify \"([^\"]*)\" Data from WorkBook \"([^\"]*)\" and Sheet \"([^\"]*)\"$")
	public void verify_Data_from_WorkBook_and_Sheet(String check, String workBook, String sheetName) throws Throwable {
	    
		if(check.equalsIgnoreCase("Ack"))
		{
			System.out.println("=================Verifying ACK count In BI Sheet OutBound ========");
			eM.setExcelFile(workBook, sheetName);
			eh.setExcelFile("BIworksheet","BiData");
			String ackInBC=(String)eh.getCellByColumnName("BC_ACK");
			System.out.println("Acknowledgement Count In Broad cast In campaign category "+ackInBC);
			
			String BcName=(String) eM.getCell(1,0);
			Assert.assertTrue(BIobjects.getStatusOfAck(BcName,ackInBC));
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
