package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itextpdf.text.log.SysoCounter;


import baseClasses.EmailHandlergmail;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.BiDataObject;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.RegistrationListPage;

public class BiDataDef extends Init {
	
	JSWaiter jswait = new JSWaiter();
	
	ExcelHelper excel = new ExcelHelper();
	ExcelHelper ex=new ExcelHelper();
	 BiDataObject biDataObject=new BiDataObject();
	 RegistrationListPage listpg= new RegistrationListPage();

	 
	 
	 CampaignObjects campaignobject = new CampaignObjects();
	 CommonObjects commonObjects = new CommonObjects();
	 BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	 
	 
	
	
	
	
	
	
	 public BiDataDef()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@Then("^create New CustomerList Name \"([^\"]*)\" type as \"([^\"]*)\" for BI$")
	public void create_New_CustomerList_Name_type_as_for_BI(String listName, String listType) throws Throwable {
		
		if(listType.equalsIgnoreCase("Standard"))
		{    Thread.sleep(2000);
			listpg.enterRegistratonListDetails(listName,"BySeleniumforBi");
			Thread.sleep(2000);
			listpg.clickSaveButton();
		}
	   
	}
	
	@Then("^create usageMetric Bi with name \"([^\"]*)\" for BI$")
	public void create_usageMetric_Bi_with_name_for_BI(String metricName) throws Throwable {
		Thread.sleep(2000);
		listpg.enterRegistrationListName(metricName);
		listpg.enterRegistrationListDescription("Selenium for BI");
		listpg.enableTracking();
		listpg.SelectAllPartners();
	    
	}
	
	@Then("^save usage metric \"([^\"]*)\" for BI$")
	public void save_usage_metric_for_BI(String metricName) throws Throwable {
		listpg.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(metricName);
		commonObjects.clickOptionsIcon();  
	}
	
	@Then("^create segment with name \"([^\"]*)\" with condition \"([^\"]*)\"$")
	public void create_segment_with_name_with_condition(String segmentName, String condition) throws Throwable {
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(segmentName);
		
		try {
			commonObjects.clickOptionsIcon();
			System.out.println("Saved Segment Already present !! with name as "+segmentName);
			
		} catch (Exception e) {
			System.out.println("Creating new segment for List selenium_BiList");
			biDataObject.clickCreateNewSegment();
			if(condition.equalsIgnoreCase("listSubscribed"))
			{
				biDataObject.createSegment(segmentName);
			}
		}
	   
	}
	
	
	@Then("^navigate to Campaign Attributes$")
	public void navigate_to_Campaign_Attributes() throws Throwable {
		jswait.loadClick("//a[contains(.,'Campaign Attributes')]");
	    
	}
	

	@Then("^create campaign attribute with name \"([^\"]*)\" and label \"([^\"]*)\"$")
	public void create_campaign_attribute_with_name(String campaignAttribute, String label) throws Throwable {

		biDataObject.createCampaignAttribute(campaignAttribute, label);
		Thread.sleep(1000);

	}

	@Then("^create offer attribute with name \"([^\"]*)\" and label \"([^\"]*)\"$")
	public void create_offer_attribute_with_name_and_label(String offerAttribute, String label) throws Throwable {
		biDataObject.createOfferAttribute(offerAttribute, label);
	    
	}
	
	@Then("^navigate to broadcast attribute$")
	public void navigate_to_broadcast_attribute() throws Throwable {
		jswait.loadClick("//a[contains(.,'Broadcast Attributes')]");
	   
	}
	
	@Then("^create broadcast atribute with name \"([^\"]*)\" and label \"([^\"]*)\"$")
	public void create_broadcast_atribute_with_name_and_label(String broadcastAttribute, String label) throws Throwable {
		biDataObject.createBroadcastAttribute(broadcastAttribute, label);
	}
	
	
	@Then("^create New Campaign Category from sheet \"([^\"]*)\" for BI$")
	public void create_New_Campaign_Category_from_sheet_for_BI(String categoryName) throws Throwable {
		String name;
		ex.setExcelFile("biDataSetup", categoryName);
		name = (String) ex.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		ex.setCell(1, 0, name);
		System.out.println("Created Campaign Category with name  " + name);
		campaignobject.createNewCampaignCategory(name);

	}
	
	
	@Then("^create offer from Sheet \"([^\"]*)\" with product \"([^\"]*)\" with Reward \"([^\"]*)\" and Attribute value \"([^\"]*)\"$")
	public void create_offer_from_Sheet_with_product_with_Reward_and_Attribute_value(String offerSheet, String productSheet, String rewardName, String attributeValue) throws Throwable {
	   biDataObject.createOfferforBI(offerSheet, productSheet, rewardName,attributeValue);
	}
	
	@Then("^create Offer catalog from Sheet \"([^\"]*)\"$")
	public void create_Offer_catalog_from_Sheet(String sheetName) throws Throwable {
		String name;
		Thread.sleep(2000);
		excel.setExcelFile("biDataSetup", sheetName);
		name = (String) excel.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		excel.setCell(1, 0, name);
		System.out.println("Catalog Name::"+ name);
		biDataObject.createOfferCatalog(name);
		Thread.sleep(3000);

	}
	
	@Then("^add offer from Sheet \"([^\"]*)\" to catalog$")
	public void add_offer_from_Sheet_to_catalog(String offerSheet) throws Throwable {
		ex.setExcelFile("biDataSetup", offerSheet);
		String offerName = (String) ex.getCell(1, 0);
		biDataObject.addOfferTocatalog(offerName);

	}
	
	
	@Then("^Navigate to Bi campaign Category from sheet \"([^\"]*)\"$")
	public void navigate_to_Bi_campaign_Category_from_sheet(String sheetName) throws Throwable {
		excel.setExcelFile("biDataSetup", sheetName);
		String name = (String) excel.getCell(1, 0);
		campaignobject.scrollToCampaignCategory(name);

	}
	
	@Then("^Create New Campaign from Sheet \"([^\"]*)\" with catalog as \"([^\"]*)\" with \"([^\"]*)\" Attribute$")
	public void create_New_Campaign_from_Sheet_with_catalog_as_with_Attribute(String campaignSheet, String catalogSheet,
			String atbtValue) throws Throwable {

		ex.setExcelFile("biDataSetup", campaignSheet);
		excel.setExcelFile("biDataSetup", catalogSheet);
		String camapaignName;
		String catalogName;
		camapaignName = (String) ex.getCell(1, 0);
		catalogName = (String) excel.getCell(1, 0);
		camapaignName = RandomNameGenerator.getRandomName(camapaignName);
		ex.setCell(1, 0, camapaignName);
		System.out.println("camapaignName::" + camapaignName);
		Thread.sleep(4000);
		biDataObject.createCampaign(camapaignName, catalogName, atbtValue);

	}
	
	
	@Then("^Navigate to \"([^\"]*)\" View Broadcast$")
	public void navigate_to_View_Broadcast(String campaignSheet) throws Throwable {
		 String campaignName;
		excel.setExcelFile("biDataSetup", campaignSheet);
	   campaignName= excel.getCell(1, 0).toString();
	   System.out.println("CampaignName::"+campaignName);
	   commonObjects.filterName(campaignName);
	 jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+campaignName+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
	 jswait.loadClick("//paper-item[contains(.,'View Broadcasts')]");
	}
	
	
	@Then("^input details Tab \"([^\"]*)\" with inventory \"([^\"]*)\" Attribute value \"([^\"]*)\" and triger \"([^\"]*)\"$")
	public void input_details_Tab_with_inventory_Attribute_value_and_triger(String BcSheet, String inventory, String attribute, String triger) throws Throwable {
	   String BcName;
	   excel.setExcelFile("biDataSetup", BcSheet);
	   BcName=(String) excel.getCell(1, 0);
	   BcName = RandomNameGenerator.getRandomName(BcName);
	   excel.setCell(1,0, BcName);
	   System.out.println("BroadcastName::"+BcName);
	   biDataObject.inputDetailsTabOfBc(BcName, inventory, attribute, triger);	
	}
	
	
	@Then("^input Target Tab with customerList \"([^\"]*)\" and TG \"([^\"]*)\" CG \"([^\"]*)\" DNC \"([^\"]*)\"$")
	public void input_Target_Tab_with_customerList_and_TG_CG_DNC(String customerList, String TG, String CG, String DNC) throws Throwable {
	  biDataObject.inputTargetTab(customerList, TG, CG, DNC);
	}

	@Then("^input offer from Sheet \"([^\"]*)\" with filter Criteria \"([^\"]*)\" and Give Rewards to \"([^\"]*)\"$")
	public void input_offer_from_Sheet_with_filter_Criteria_and_Give_Rewards_to(String offerSheet, String filterCriteria, String giveRewardsTo) throws Throwable {
	    String offerName;
	    Thread.sleep(2000);
		excel.setExcelFile("biDataSetup", offerSheet);
		offerName=(String) excel.getCell(1,0);
		 biDataObject.inputOfferTab(offerName, filterCriteria, giveRewardsTo);
	}
	
	@Then("^input Deliver Tab from sheet \"([^\"]*)\" with end Type as \"([^\"]*)\"$")
	public void input_Deliver_Tab_from_sheet_with_end_Type_as(String bcSheet, String endType) throws Throwable {
		String bc_Type;
		excel.setExcelFile("biDataSetup", bcSheet);
		bc_Type = (String) excel.getCell(1, 1);
		System.out.println("Bc_Type is :: " + bc_Type);
		if (bc_Type.equalsIgnoreCase("oneoff")) {
			biDataObject.oneOffBcDeliverTab(bcSheet);
		}
		else if(bc_Type.equalsIgnoreCase("Recuring"))
		{
			biDataObject.recuringBcDeliverTab(bcSheet,endType);
		}

	}
	
	
	
	@Then("^wait for Status of Bc \"([^\"]*)\" is \"([^\"]*)\"$")
	public void wait_for_Status_of_Bc_is(String bcSheet, String statusExpected) throws Throwable {
		String bcName;
		String statusOfBc;
		excel.setExcelFile("biDataSetup", bcSheet);
		bcName = (String) excel.getCell(1, 0);
		if (bcSheet.contains("RecuringBc")) {
			System.out.println(":::::::::::Inside Recurring BC Filtering::::::::");
			String date = (String) excel.getCell(1, 3);
			bcName = bcName + "-" + date;
			System.out.println("Bc Name::: " + bcName);

		}
		else if (bcSheet.contains("SeedingBc")) {
			System.out.println(":::::::::::::Inside Seeding Bc Filtering::::::::");
			String bcType = (String) excel.getCell(1, 1);
			String date = (String) excel.getCell(1, 3);
			if (bcType.equalsIgnoreCase("recuring")) {
				bcName = bcName + "_MessagingBC" + "-" + date;

			} else
				bcName = bcName + "_OneOff_MessagingBC";
		}
		System.out.println("Bc Name::: " + bcName);
		commonObjects.filterName(bcName);
		commonObjects.toggleAutoRefresh();
		statusOfBc = broadcastPageObjects.getTopBcStatus();
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (!statusOfBc.contains(statusExpected) && t.checkTimerMin(50)) {
			statusOfBc = broadcastPageObjects.getTopBcStatus();
			System.out.println(statusOfBc);
			Thread.sleep(3000);
		}
		Assert.assertTrue("Invalid status of BC", statusOfBc.contains(statusExpected));

	}
	
	
	
	@Then("^Save Ack to workBook \"([^\"]*)\" to Sheet \"([^\"]*)\" to the column \"([^\"]*)\"$")
	public void save_Ack_to_workBook_to_Sheet_to_the_column(String workBook, String sheetName, String columnName) throws Throwable {
	   
		Thread.sleep(2000);
		String BcName;
		excel.setExcelFile(workBook, sheetName);
		BcName=(String) excel.getCell(1,0);
		WebElement ack=driver.findElement(By.xpath("//vaadin-grid-cell-content[contains(.,'"+BcName+"')]//following::vaadin-grid-cell-content[6]"));
		System.out.println("Ack Count In Broadcast Under Campaign ===> "+ack.getText()+" <=================");
		excel.setCell(columnName, ack.getText());
		System.out.println("**********Successfully Stored Acknowledgement count in Sheet****************");
		
	}
	
	
	@Then("^create Touch point from Sheet \"([^\"]*)\" and Logic \"([^\"]*)\"$")
	public void create_Touch_point_from_Sheet_and_Logic(String sheetName, String prioLogic) throws Throwable {
		String tpName;
		ex.setExcelFile("biDataSetup", sheetName);
		tpName=(String) ex.getCell(1, 0);
		tpName=RandomNameGenerator.getRandomName(tpName);
		ex.setCell(1, 0, tpName);
		System.out.println("::Touch point Name::"+tpName+":::Prioritization Logic::"+prioLogic);
		biDataObject.createApiTouchpoint(tpName, prioLogic);
	   
	}

	
	
	
	
	
	
	
	

}
