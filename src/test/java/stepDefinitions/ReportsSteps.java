package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TextFileUtil;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageObjetcs.ReportPageObjects;

public class ReportsSteps extends Init{
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eh = new ExcelHelper(); 
	 TextFileUtil textFile=new TextFileUtil();
	 ReportPageObjects  ReportPageObject = new  ReportPageObjects();
	 
	 
//	 @Then("^navigate to Supports$")
//	 public void navigate_to_Supports() throws Throwable {
//	   IMReportPageObject.navigatetoSupports();
//	 }
//	 @Then("^navigate to Data QC job$")
//	 public void navigate_to_Data_QC_job() throws Throwable {
//		 IMReportPageObject.dataQCjob();
//	 }
//
//	 @Then("^enter the job name from sheet  \"([^\"]*)\" and activate$")
//	 public void enter_the_job_name_from_sheet(String QCJob) throws Throwable {
//		 eh.setExcelFile("programInputData", QCJob);
//		 String JobName = eh.getCellByColumnName("DataQCJobName");
//		 JobName = RandomNameGenerator.getRandomName(JobName);
//		 eh.setCell("DataQCJobName", JobName);
//		 IMReportPageObject.enterTheJobName(JobName);
//		 
	   
//	 }


@Then("^filter program from sheet \"([^\"]*)\"$")
public void filter_the_program(String sheet)  throws Exception{
	eh.setExcelFile("programInputData", sheet);
	String programName = eh.getCellByColumnName("program Name");
	ReportPageObject.filterProgram(programName);
}

@Then("^verify whether the conversion and fulfillment % are \"([^\"]*)\" and \"([^\"]*)\"$")
public void verify_whether_the_conversion_and_fulfillment_are_and(String conversion, String fulfillment) throws Throwable {
	ReportPageObject.conversionFulfillment(conversion, fulfillment);
	
	
}

@Then("^verify acknowledged conversion and fulfillment % are \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void verify_acknowledged_conversion_and_fulfillment_are_and(String ack, String conversion, String fulfillment) throws Throwable {
	ReportPageObject.ackConversionFulfillment(ack,conversion,fulfillment);

}

@Then("^verify the impression value is \"([^\"]*)\"$")
public void verify_impression_value(int offerRecommended ) throws Exception{
	ReportPageObject.impressionValue(offerRecommended);
}

@Then("^filter broadcast from sheet \"([^\"]*)\"$")
public void filter_the_broadcast(String sheet) throws Exception{
	eh.setExcelFile("bcInputData", sheet);
	String bcName=eh.getCellByColumnName("BC Name");
	ReportPageObject.filterbroadcast(bcName);
}

@Then("^click customer profile and enter the msisdn \"([^\"]*)\"$")
public void click_customer_profile_and_enter_the_msisdn(String number) throws Exception{
	ReportPageObject.entermsisdn(number);
}
@Then("^verify the profile values for \"([^\"]*)\"$")
public void verify_the_profile_values(String profileType) throws Throwable {
	ReportPageObject.customerprofile(profileType);
	
}
@Then("^click event tab$")
public void click_event_tab() throws Throwable {
	ReportPageObject.eventTab();
}


@Then("^verify the event displayed$")
public void verify_the_event_displayed() throws Throwable {
	ReportPageObject.eventVerify();
}
@Then("^click metric tab$")
public void click_metric_tab() throws Throwable {
	ReportPageObject.metricTab();
}
@Then("^verify the metric data$")
public void verify_the_metric_data() throws Throwable {
	ReportPageObject.verifyMetricData();
}

	 
}
