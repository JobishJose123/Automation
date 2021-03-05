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


public class BIsheetSteps extends Init {
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	ExcelHelper eM = new ExcelHelper();
	BIsheetPageObjects BIobjects = new BIsheetPageObjects();
	CommonObjects CommonObjects=new CommonObjects();
	
	public BIsheetSteps()
	{
		PageFactory.initElements(driver, this);
	}
	@Then("^navigate to Business Intelligence$")
	public void navigate_to_Business_Intelligence() throws Throwable {
		BIobjects.clickBusinessIntelligence();
		
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
