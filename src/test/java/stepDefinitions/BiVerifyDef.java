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
	
	
	@Then("^create BI report from sheet \"([^\"]*)\" and \"([^\"]*)\" as Time Range$")
	public void create_BI_report_from_sheet_and_as_Time_Range(String sheetName, String timeRange) throws Throwable {
	  
		String reportName;
		excel.setExcelFile("BiVerify", sheetName);
		reportName = (String) excel.getCell(1, 0);
		reportName = RandomNameGenerator.getRandomName(reportName);
		excel.setCell(1, 0, reportName);
		System.out.println("Report_Name:: " + reportName);
		
		if (sheetName.equals("pmReport")) {
			biverifyobject.createPM_DetailedReport(reportName, timeRange);
		} else if (sheetName.equals("imReport")) {
			biverifyobject.createIM_DetailReport(reportName, timeRange);
		}
		else if (sheetName.equals("PMattribute")) {
			biverifyobject.createAttributeReport(reportName, timeRange);
		}
		else if (sheetName.equals("includeSeedRewards")) {
			biverifyobject.create_Include_Seed_Reward_Report(reportName, timeRange);
		}
		else if (sheetName.equals("calcReport")) {
			biverifyobject.create_custom_CalculationReport(reportName, timeRange);
		}
		else if (sheetName.equals("CustomEventSheet")) {
			biverifyobject.create_CustomEvent_Report(reportName, timeRange);
		}
		
		
	}
	
	@Then("^create BI Group report from sheet \"([^\"]*)\" and \"([^\"]*)\" as Time Range$")
	public void create_BI_Group_report_from_sheet_and_as_Time_Range(String sheetName, String timeRange) throws Throwable { 
		String reportName;
		ex.setExcelFile("BiVerify", sheetName);
		reportName=(String) ex.getCell(1,0);
		reportName = RandomNameGenerator.getRandomName(reportName);
		ex.setCell(1, 0, reportName);
		System.out.println("Report_Name:: " + reportName);
		
		if (sheetName.equals("GrpBcRpt")) {
			biverifyobject.create_Group_BCName_Report(reportName, timeRange);
		}
		else if (sheetName.equals("GrpBcOther")) {
			biverifyobject.create_Group_BCName_Other(reportName, timeRange);
		}
		else if (sheetName.equals("GrpCamp")) {
			biverifyobject.create_Group_CampaignName(reportName, timeRange);
		}
		else if (sheetName.equals("GrpCampOther")) {
			biverifyobject.create_Group_campOther(reportName, timeRange);
		}
		
		
	}
	
	
	
	
	
	
	
	
	@Then("^verify data of \"([^\"]*)\" for \"([^\"]*)\" type report$")
	public void verify_data_of_for_type_report(String dataHeader, String reportType) throws Throwable {

		biverifyobject.externalFilter("Customer Segment", "matches with", "SelBiSegment");
		Thread.sleep(3000);
		boolean caseStatus=false;
		if (reportType.equalsIgnoreCase("OutBound Marketing")) {
			
			if (dataHeader.equalsIgnoreCase("date")) {
				caseStatus = biverifyobject.checkDateColumns();
			}
			else if (dataHeader.equalsIgnoreCase("Campaign Category")) {
				caseStatus = biverifyobject.checkCampaignCategory();
			}
			else if (dataHeader.equalsIgnoreCase("Campaign")) {
				caseStatus = biverifyobject.checkCampaignColumns();
			}
			else if (dataHeader.equalsIgnoreCase("Broadcast Name")) {
				caseStatus = biverifyobject.checkBroadcastNameColumns();
			}
			else if (dataHeader.equalsIgnoreCase("Customer Segment")) {
				caseStatus = biverifyobject.checkCustomerSegmentColumn();
			}
			else if (dataHeader.equalsIgnoreCase("Acknowledgement")) {
				caseStatus = biverifyobject.checkCountsOfBcs("6");
			}
			else if (dataHeader.equalsIgnoreCase("conversion")) {
				caseStatus = biverifyobject.checkCountsOfBcs("7");
			}
			else if (dataHeader.equalsIgnoreCase("fulfillment")) {
				caseStatus = biverifyobject.checkCountsOfBcs("8");
			}
			
		

		} else if (reportType.equalsIgnoreCase("inbound marketing")) {

		}
		
		Assert.assertTrue(caseStatus);
		
	    
	}
	
	
	
	@Then("^verify GroupData \"([^\"]*)\" and Case \"([^\"]*)\" Events \"([^\"]*)\" conversion \"([^\"]*)\" and \"([^\"]*)\" fulfillment$")
	public void verify_GroupData_and_Case_Events_conversion_and_fulfillment(String sheetName, String CaseType, String Ack, String conversion, String fulfillment) throws Throwable {
	   
		boolean caseStatus=false;
		
		if (sheetName.equals("GrpBcRpt") && CaseType.equals("BcNameOneOff")) {
			caseStatus = biverifyobject.get_Status_Of_BcNameOneOff("Grp1OneOff", Ack, conversion, fulfillment);
		}
		else if (sheetName.equals("GrpBcRpt") && CaseType.equals("BcNameRecur")) {
			caseStatus = biverifyobject.get_Status_of_BcNameRecur("Grp2Recur", Ack, conversion, fulfillment);
		}
		else if (sheetName.equals("GrpBcRpt") && CaseType.equals("BcNameSeed")) {
			caseStatus = biverifyobject.get_Status_of_BcNameSeed("Grp3Seed", Ack, conversion, fulfillment);
		}
		
		else if (sheetName.equals("GrpBcOther") && CaseType.equals("BcNameOneoff")) {
			caseStatus = biverifyobject.get_Status_Of_BcNameOneOff("Grp1OneOff", Ack, conversion, fulfillment);
		}
		else if (sheetName.equals("GrpBcOther") && CaseType.equals("BcNameOther")) {
			caseStatus = biverifyobject.get_Status_of_BcNameOther("Grp2SelOther", Ack, conversion, fulfillment);
		}
		
		else if (sheetName.equals("GrpCamp") && CaseType.equals("CampNameOneOff")) {
			caseStatus = biverifyobject.get_Status_of_CampName_Oneoff("Grp1CampOneoff", Ack, conversion, fulfillment);
		}
		else if (sheetName.equals("GrpCamp") && CaseType.equals("CampNameRecur")) {
			caseStatus = biverifyobject.get_Status_of_CampName_Recur("Grp2CampRecur", Ack, conversion, fulfillment);
		}
		else if (sheetName.equals("GrpCamp") && CaseType.equals("CampNameSeed")) {
			caseStatus = biverifyobject.get_Status_of_CampName_Seed("Grp3CampSeed", Ack, conversion, fulfillment);
		}
		
		else if (sheetName.equals("GrpCampOther") && CaseType.equals("CampNameOneoff")) {
			caseStatus = biverifyobject.get_Status_of_CampName_Oneoff("Grp1CampOneoff", Ack, conversion, fulfillment);
		}
		
		else if (sheetName.equals("GrpCampOther") && CaseType.equals("CampNameOther")) {
			caseStatus = biverifyobject.get_Status_of_CampNameOther("Grp2CampOther", Ack, conversion, fulfillment);
		}

		Assert.assertTrue(caseStatus);
		
	}
	
		
		
	@Then("^Verify Custom Event \"([^\"]*)\" with value \"([^\"]*)\" for Custom Event Report$")
	public void verify_Custom_Event_with_value_for_Custom_Event_Report(String customEvent, String value) throws Throwable {
	   
		Thread.sleep(2000);
		WebElement agregateElement = driver.findElement(
				By.xpath("//div[@class='paper-carousel_wrapper style-scope paper-carousel']/div[contains(.,'"
						+ customEvent + "')]/div[2]"));
		
		boolean status = biverifyobject.getAgregate_DataStatus(agregateElement,value);
		if (status == false) {
			System.out.println("::::::!!!!!!!!Custom Event Test Case has failed!!!!!!!!:::::::");
			System.out.println("Expected Custom Event Value:: " + value);
			System.out.println("Actual found Custom Event Value:: " + agregateElement.getAttribute("title"));
		}
		Assert.assertTrue(status);
	}
	
		
	@Then("^create BI Use CaseReport from sheet \"([^\"]*)\" and \"([^\"]*)\" as Time Range$")
	public void create_BI_Use_CaseReport_from_sheet_and_as_Time_Range(String sheetName, String timeRange)
			throws Throwable {

		String reportName;
		ex.setExcelFile("BiVerify", sheetName);
		reportName = (String) ex.getCell(1, 0);
		reportName = RandomNameGenerator.getRandomName(reportName);
		ex.setCell(1, 0, reportName);
		System.out.println("Report_Name:: " + reportName);
		
		if (sheetName.equals("UseCase1")) {
			biverifyobject.create_UseCase1_Report(reportName, timeRange);
		}

	}
	
	@Then("^hello \"([^\"]*)\"$")
	public void hello(String arg1) throws Throwable {
	System.out.println(arg1);
	}
		
		
	
		
	
}
