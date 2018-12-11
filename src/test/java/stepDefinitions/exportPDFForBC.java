package stepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import baseClasses.CalenderUtility;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.PdfReader;
import baseClasses.SQLHandler;
import cucumber.api.java.en.Then;

import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LandingPageObjects;
import java.text.DateFormat;

public class exportPDFForBC extends Init{
	JSWaiter jswait = new JSWaiter();
	LandingPageObjects landingPage = new LandingPageObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CampaignObjects CampaignObjects=new CampaignObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public ExcelHelper eM = new ExcelHelper();
	PdfReader pdfReader=new PdfReader();
	CommonObjects commonObjects = new CommonObjects();
	CalenderUtility calenderUtility=new CalenderUtility();
	public exportPDFForBC() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^verify pdf generated for broadcast from sheet \"([^\"]*)\"$")
	public void verify_pdf_generated_for_broadcast(String sheet) throws Throwable {
		
		broadcastPageObjects.verifyExportedBCwithNameAndStatus(sheet);
	
		
	}
	
	@Then("^after saving the BC activation$")
	public void after_saving_the_BC_activation() throws Throwable {
		commonObjects.clickOptionsIcon();
		jswait.loadClick(driver.findElement(By.xpath("//paper-item[contains(.,'Activate')]")));
		jswait.loadClick(driver.findElement(By.xpath("//paper-dialog[@id='confirmBoxActivate']//paper-button[@class='style-scope broadcast-list x-scope paper-button-0'][contains(text(),'Yes')]")));
		 //broadcastPageObjects.clickActivateConfirmYes();
	}

	
	@Then("^verify pdf generated for broadcast from sheet \"([^\"]*)\" in broadcast Summary$")
	public void verify_pdf_generated_for_broadcast_from_sheet_in_broadcast_Summary(String sheet) throws Throwable {
		
		jswait.loadClick(driver.findElement(By.xpath("//paper-icon-button[@id='exportBtn']")));
		Assert.assertTrue(driver.findElement(By.xpath("//paper-icon-button[@id='exportBtn']")).isDisplayed());
		Thread.sleep(2000);
       	broadcastPageObjects.verifyExportBroadcastInSummaryPage(sheet);
	}
	
	@Then("^click on Seeding BC tab in BC page and filter the BC name from sheet \"([^\"]*)\"$")
	public void click_on_Seeding_BC_tab_in_BC_page(String bcSheet) throws Throwable {
	    broadcastPageObjects.clickOnSeedingsBroadcast();
	    Thread.sleep(2000);
	    broadcastPageObjects.seedingsBroadcastFilterOption();
	    Thread.sleep(2000);
	    eM.setExcelFile("bcInputData", bcSheet);
	    jswait.loadSendKeys(driver.findElement(By.xpath("(//*[@id='filterForm']//label[contains(.,'Name')]/..//input)[4]")), eM.getCellByColumnName("BC Name"));
		//commonObjects.enterFilterFormname(eM.getCellByColumnName("BC Name"));
		jswait.loadClick(driver.findElement(By.xpath("(//*[@id='filterDialog']/div/paper-button[3])[4]")));
	    
	}
	
	@Then("^find the planned status broadcast \"([^\"]*)\"$")
	public void find_the_planned_status_broadcast_status(String sheet) throws Throwable {
		eM.setExcelFile("bcInputData", sheet);
    	String name = eM.getCell(1, 0).toString();
       commonObjects.filterStatus(name);
	}
	
	
	@Then("^Exporting the pdf from broacastpage$")
	public void exporting_the_pdf_from_broacastpage() throws Throwable {
	    broadcastPageObjects.exportBroadcastAsPDF();
	}

	@Then("^Verify the exported BC time from sheet \"([^\"]*)\"$")
	public void verify_the_exported_BC_time_from_sheet(String sheet) throws Throwable {
		
		broadcastPageObjects.verifyExportedTimeForBC(sheet);
		   
	   
	}

	@Then("^Renaming the Exported Boadcast from sheet  \"([^\"]*)\"$")
	public void renaming_the_Exported_Boadcast_from_sheet(String sheet) throws Throwable {
	    broadcastPageObjects.verifyExportedBCForRename(sheet);
	}
	
	@Then("^Verify the multiple tracking rules from downloaded pdf from sheet \"([^\"]*)\"$")
	public void verify_the_multiple_tracking_rules_from_downloaded_pdf_from_sheet(String sheet) throws Throwable {
		Thread.sleep(2000);
		eM.setExcelFile("bcInputData", sheet);
		String bcNamefromSheet = eM.getCell(1, 0).toString();
		// to provide broadcast name and Broadcast Status
		//String statusOFbroadcast = statusOfBC.getText();
		//String statusOFbroadcast =broadcastPageObjects.getTopBcStatus();
		String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='" + bcNamefromSheet
				+ "';";		
		
		String newBCNameWithOutSpace = bcNamefromSheet.replaceAll("[^a-zA-Z0-9-]", "_");
		String systemUserName = System.getProperty("user.name");
		System.out.println(systemUserName);
		SQLHandler sql = new SQLHandler();
		//String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='" + bcName
		//		+ "';";
		int bcID = sql.getStringOfQuery(query);
		// System.out.println(bcID);
		String path = "C:\\Users\\" + systemUserName + "\\Downloads\\BC_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
		System.out.println(path);
		
		pdfReader.verifyMultipleTrackingRules(path);
		Thread.sleep(2000);
		
		System.out.println("Verified PDF multipletracking rules ");
	}
	
	@Then("^Verify the exported campaign time from sheet \"([^\"]*)\"$")
	public void verify_the_exported_campaign_time_from_sheet(String sheet) throws Throwable {
		DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY hh:mm");
		String afterClickOnExport = calenderUtility.getCurrentDate("dd MMM YYYY hh:mm");
		System.out.println(afterClickOnExport);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 3);
		String addingthreemin = dateFormat.format(cal.getTime());
		
		System.out.println(afterClickOnExport);
		Thread.sleep(4000);
		eM.setExcelFile("campaignInputData", sheet);
		String campaignNamefromSheet = eM.getCell(1, 0).toString();
		
		String query = "select CAMPAIGN_ID from app_campaign where CAMPAIGN_NAME='" + campaignNamefromSheet
				+ "';";
		String newBCNameWithOutSpace = campaignNamefromSheet.replaceAll("[^a-zA-Z0-9-]", "_");
		String systemUserName = System.getProperty("user.name");
		System.out.println(systemUserName);
		SQLHandler sql = new SQLHandler();
		//String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='" + bcName
		//		+ "';";
		int bcID = sql.getStringOfQuery(query);
		// System.out.println(bcID);
		String path = "C:\\Users\\" + systemUserName + "\\Downloads\\campaign_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
		System.out.println(path);
		
		
		// to provide broadcast name and Broadcast Status
		pdfReader.verifyExportedCampaignDateAndTime(path,afterClickOnExport,addingthreemin,query);
	}
	
	
}
