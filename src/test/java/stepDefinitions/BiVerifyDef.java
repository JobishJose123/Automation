package stepDefinitions;









import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.BiVerifyObject;
import pageObjetcs.CommonObjects;

public class BiVerifyDef extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper excel = new ExcelHelper();
	ExcelHelper ex=new ExcelHelper();
	
	BiVerifyObject biverifyobject=new BiVerifyObject();
	CommonObjects commonObjects = new CommonObjects();
	 
	
	
	
	@Then("^click create New Worksheet$")
	public void click_create_New_Worksheet() throws Throwable {
		jswait.loadClick("//paper-button[text()='Create New Worksheet']");
	}
	
	@Then("^verify outbound options are disabled when selected inbound$")
	public void verify_outbound_options_are_disabled_when_selected_inbound() throws Throwable {

		boolean status = biverifyobject.isPM_disabled();

		if (status == false)
			System.out.println("!!!!!!:: TestCase has Failed Outbound Marketing Radio Button is Not Disabled ::!!!");

		Assert.assertTrue(status);

	}

	@Then("^verify inbound options are disabled when selected outbound$")
	public void verify_inbound_options_are_disabled_when_selected_outbound() throws Throwable {

		boolean status = biverifyobject.isIM_disabled();
		if (status == false)
			System.out.println("!!!!!!:: TestCase has Failed Inbound Marketing Radio Button is Not Disabled ::!!!");

		Assert.assertTrue(status);

	}

	@Then("^verify create calculation is disabled before header save$")
	public void verify_create_calculation_is_disabled_before_header_save() throws Throwable {
		boolean status = biverifyobject.isCreateCalcDisabled();
		if (status == false)
			System.out.println("!!!!!!!!!!Tescase has failed Create calculation radio button not disabled !!!!!!!");

		Assert.assertTrue(status);
	}

	
	
	@Then("^create offer and Product Report from sheet \"([^\"]*)\" and \"([^\"]*)\" as Time Range$")
	public void create_offer_and_Product_Report_from_sheet_and_as_Time_Range(String sheetName, String timeRange) throws Throwable {
	  
		String reportName;
		excel.setExcelFile("BiVerify", sheetName);
		reportName = (String) excel.getCell(1, 0);
		reportName = RandomNameGenerator.getRandomName(reportName);
		excel.setCell(1, 0, reportName);
		System.out.println("Offers and Prod_Report_Name:: " + reportName);
		biverifyobject.createOffersAndProductReport(reportName, timeRange, sheetName);		
	}
	
	
	
	
	@Then("^create metric report from sheet \"([^\"]*)\" Report TimeRange \"([^\"]*)\" Metric TimeRange \"([^\"]*)\" and \"([^\"]*)\"$")
	public void create_metric_report_from_sheet_Report_TimeRange_Metric_TimeRange_and(String sheetName, String reportTime, String metricTimeDayWeek, String metricTimeDays) throws Throwable {
		
		String reportName;
		excel.setExcelFile("BiVerify", sheetName);
		reportName=(String) excel.getCell(1,0);
		reportName=RandomNameGenerator.getRandomName(reportName);
		 excel.setCell(1,0,reportName);
		System.out.println("Metric_Report_Name:: "+reportName);
		biverifyobject.createMetricAckReport(reportName, reportTime, metricTimeDayWeek, metricTimeDays);				    
	}

	@Then("^filter the Bi sheet from \"([^\"]*)\" using excel sheet$")
	public void filter_the_Bi_sheet_from_using_excel_sheet(String sheetName) throws Throwable {
		String reportName;
		excel.setExcelFile("BiVerify", sheetName);
		reportName = (String) excel.getCell(1, 0);
		commonObjects.filterName(reportName);
		Thread.sleep(3000);
		jswait.loadClick("//div[@id='toggleButton']");
	}
	
	@Then("^wait for \"([^\"]*)\" status for worksheet$")
	public void wait_for_status_for_worksheet(String statusExpected) throws Throwable {
		Thread.sleep(2000);		
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		String currentStatus;
		currentStatus=biverifyobject.getBiSheetStatus();
		while (!currentStatus.equals(statusExpected) && t.checkTimerMin(120)) {
			Thread.sleep(3000);
			currentStatus = biverifyobject.getBiSheetStatus();
		}
		Assert.assertTrue(currentStatus.equals(statusExpected),"Required status not found ");
	    
	}

	@Then("^click on BiSheet from \"([^\"]*)\" sheet$")
	public void click_on_BiSheet_from_sheet(String sheetName) throws Throwable {
		String reportName;
		ex.setExcelFile("BiVerify", sheetName);
		reportName = (String) ex.getCell(1, 0);
		Thread.sleep(2000);
		jswait.loadClick("//div[text()='" + reportName + "']");
		Thread.sleep(3000);
	}
	
	
	@Then("^verify Aggregated data of header \"([^\"]*)\" with \"([^\"]*)\" as value$")
	public void verify_Aggregated_data_of_header_with_as_value(String headerName, String dataValue) throws Throwable {

		biverifyobject.externalFilter("Customer Segment", "matches with", "SelBiSegment");
		Thread.sleep(3000);
		WebElement agregateElement = driver.findElement(
				By.xpath("//div[@class='paper-carousel_wrapper style-scope paper-carousel']/div[contains(.,'"
						+ headerName + "')]/div[2]"));
		boolean status = biverifyobject.getAgregate_DataStatus(agregateElement, dataValue);
		if (status == false) {
			System.out.println("::- Verification failed -:::");
			System.out.println("Expected Agregated Data " + headerName + " = " + dataValue);
			System.out.println("Found Agregated Data " + headerName + " = " + agregateElement.getAttribute("title"));
			
		}
		Assert.assertTrue(status);
		
	}
	
	
	
	
	
	
	
		
	
}
