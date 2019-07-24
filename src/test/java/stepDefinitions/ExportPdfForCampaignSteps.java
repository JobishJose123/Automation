package stepDefinitions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;

import baseClasses.CalenderUtility;
import baseClasses.ExcelHelper;
import baseClasses.JSWaiter;
import baseClasses.PdfReader;
import baseClasses.RandomNameGenerator;
import baseClasses.SQLHandler;
import baseClasses.TimePicker;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LandingPageObjects;
import baseClasses.Init;
public class ExportPdfForCampaignSteps extends Init{
	
	JSWaiter jswait = new JSWaiter();
	LandingPageObjects landingPage = new LandingPageObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CampaignObjects CampaignObjects=new CampaignObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public ExcelHelper eM = new ExcelHelper();
	PdfReader pdfReader=new PdfReader();
	CommonObjects commonObjects = new CommonObjects();
	CalenderUtility calenderUtility=new CalenderUtility();
	BroadcastSteps broadcastSteps=new BroadcastSteps();
	CampaignObjects campaignObjects=new CampaignObjects();
	public ExportPdfForCampaignSteps() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Then("^create new campaign with Multiple OR operations from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	public void create_new_campaign_with_Multople_OR_operations_from_sheet_with_catalog(String sheet, String catalogSheet) throws Throwable {
		
		
		
	}
	
	
	@Then("^create new campaign with Multiple OR operations from sheet \"([^\"]*)\" with catalog \"([^\"]*)\" with end type \"([^\"]*)\" recurrence \"([^\"]*)\" Recurring Frequency \"([^\"]*)\"$")
	public void create_new_campaign_with_Multiple_OR_operations_from_sheet_with_catalog_with_end_type_recurrence_Recurring_Frequency(String sheet, String catalogSheet, String endType, String recurrence, String recurringFrequency) throws Throwable {	
		Thread.sleep(4000);
    	ExcelHelper catalogExcel = new ExcelHelper();
    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
    	Thread.sleep(4000);
    	eM.setExcelFile("campaignInputData",sheet);
 		String name = (String) eM.getCell(1, 0);
 		String catalog = (String) catalogExcel.getCell(1, 0);
 		name =  RandomNameGenerator.getRandomName(name);
 		eM.setCell(1, 0, name);
 		campaignObjects.clickCreateNewCampaignButton();	    
		campaignObjects.createCampaignWithAddMultipleOROption(name,catalog,recurrence,endType,recurringFrequency);
	}
	
	
		
		@Then("^Verify the campaign Schedule time and Recurrence time for exported PDF from sheet \"([^\"]*)\" with end type \"([^\"]*)\" Recurring Frequency \"([^\"]*)\"$")
		public void verify_the_campaign_Schedule_time_and_Recurrence_time_for_exported_PDF_from_sheet_with_end_type_Recurring_Frequency(String sheet, String endType, String recurringFrequency) throws Throwable {	    		
		DateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
		Date date=new Date();
		String currentSystemDate=simpleDateFormat.format(date);	
		System.out.println(currentSystemDate);
		
		broadcastPageObjects.exportBroadcastAsPDF();

		Thread.sleep(2000);
		
 	    
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
		System.out.println("going to pdf reader");
		pdfReader.verifyCampaignPDFMoreThanTenConditions(path, endType, currentSystemDate, recurringFrequency);
			    
    	Thread.sleep(2000);
	}
	
	
		
		@Then("^delete all locations$")
		public void delete_all_locations() throws Throwable {
			Thread.sleep(2000);
			driver.get("https://192.168.150.209/#/platform-setting/systemAdministration/exportCampaign");
			
			Thread.sleep(2000);
			for(int i=1;i<40;) {
			jswait.loadClick("(//data-table-cell//div[contains(@class,'edit')]/paper-item[2]/iron-icon)[2]");
			
			
			
			jswait.loadClick("//div/paper-button[contains(.,'Yes')]");
			
			i++;}
		}
	

}
