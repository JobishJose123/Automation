package stepDefinitions;
import java.util.Calendar;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
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
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		String currWorksheetstatus = BIobjects.getBIsheetstatus();
		while(!BIsheetstatus.contentEquals(currWorksheetstatus)&& t.checkTimerMin(30)) {
			Thread.sleep(2000);
			currWorksheetstatus = BIobjects.getBIsheetstatus();
		}
		Assert.assertTrue("Required status not found", BIsheetstatus.contentEquals(currWorksheetstatus));
	}
	
	
}
