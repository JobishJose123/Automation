package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LandingPageObjects;

public class exportPDFForBC extends Init{
	JSWaiter jswait = new JSWaiter();
	LandingPageObjects landingPage = new LandingPageObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CampaignObjects CampaignObjects=new CampaignObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public ExcelHelper eM = new ExcelHelper();
	CommonObjects commonObjects = new CommonObjects();
	public exportPDFForBC() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^verify pdf generated for broadcast from sheet \"([^\"]*)\"$")
	public void verify_pdf_generated_for_broadcast(String sheet) throws Throwable {
		broadcastPageObjects.exportBroadcast();
		broadcastPageObjects.verifyExportBroadcast(sheet);
	
		
	}
	
	@Then("^find the planned status broadcast \"([^\"]*)\"$")
	public void find_the_planned_status_broadcast_status(String sheet) throws Throwable {
		eM.setExcelFile("bcInputData", sheet);
    	String name = eM.getCell(1, 0).toString();
       commonObjects.filterStatus(name);
	}
	
}
