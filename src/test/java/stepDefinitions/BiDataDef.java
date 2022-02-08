package stepDefinitions;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
import baseClasses.Request;
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
	 
	 
	
	
	 String offerRecommended = "{\"status\":{\"code\":200,\"message\":\"Success\"},\"offers\":{\"offer\":[{\"id\":\"111\",\"message\":\"Enjoy the offer with 25 extar TT\",\"shortMessage\":\"Bonus offer\",\"message-encoding\":\"UTF-8\",\"message-lang\":\"English (UK)\",\"offerType\":\"usage\",\"category\":\"Balance Top ups\",\"order\":1},{\"id\":\"110\",\"message\":\"Enjoy the offer with 25 extar TT\",\"shortMessage\":\"Bonus offer\",\"message-encoding\":\"UTF-8\",\"message-lang\":\"English (UK)\",\"offerType\":\"usage\",\"category\":\"Balance Top ups\",\"order\":2}]}}";
	
	
	
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
		tpName = (String) ex.getCell(1, 0);
		tpName = RandomNameGenerator.getRandomName(tpName);
		ex.setCell(1, 0, tpName);
		System.out.println("::Touch point Name::" + tpName + ":::Prioritization Logic::" + prioLogic);
		biDataObject.createApiTouchpoint(tpName, prioLogic);

	}

	
	@Then("^Navigate to System Administration for BI$")
	public void navigate_to_System_Administration_for_BI() throws Throwable {
	    jswait.loadClick("//hexagon-icon[2]//div[@class='icon-container style-scope hexagon-icon']");
	}
	
	@Then("^Navigate to IP Access Control for BI$")
	public void navigate_to_IP_Access_Control_for_BI() throws Throwable {
	    jswait.loadClick("//div[contains(text(),'IP Access Control')]");
	}
	
	@Then("^create IP Access Group touchPoint Sheet \"([^\"]*)\" and AuthKey as \"([^\"]*)\" for BI$")
	public void create_IP_Access_Group_touchPoint_Sheet_and_AuthKey_as_for_BI(String sheetName, String authKey) throws Throwable {
		String tpName;
		ex.setExcelFile("biDataSetup", sheetName);
		tpName=(String) ex.getCell(1,0);
        biDataObject.createGroupforAPIinIpAccessControl(tpName, authKey);
        
	}
	
	@Then("^input detais tab from sheet \"([^\"]*)\" and offer Catalog sheet \"([^\"]*)\" for IM program$")
	public void input_detais_tab_from_sheet_and_offer_Catalog_sheet_for_IM_program(String programSheet,
			String catalogSheet) throws Throwable {

		String programName;
		String catalogName;
		ex.setExcelFile("biDataSetup", programSheet);
		excel.setExcelFile("biDataSetup", catalogSheet);
		programName = (String) ex.getCell(1, 0);
		programName = RandomNameGenerator.getRandomName(programName);
		System.out.println(programName);
		ex.setCell(1, 0, programName);
		catalogName = (String) excel.getCell(1, 0);
		biDataObject.inputDetailsTabOfProgram(programName, catalogName);

	}
	
	
	@Then("^input touchpoint Tab from Sheet \"([^\"]*)\" and channel \"([^\"]*)\"$")
	public void input_touchpoint_Tab_from_Sheet_and_channel(String touchpointSheet, String channel) throws Throwable {
		String touchpointName;
		ex.setExcelFile("biDataSetup",touchpointSheet);
		touchpointName=(String) ex.getCell(1,0);
		System.out.println("Touch point Name::"+touchpointName+" :::Channel"+channel);
		biDataObject.inputTouchpointTabOfProgram(touchpointName);
	}
	
	
	@Then("^input Schedule Tab start date \"([^\"]*)\" and End Date \"([^\"]*)\" refresh Cycle \"([^\"]*)\" for IM program$")
	public void input_Schedule_Tab_start_date_and_End_Date_refresh_Cycle_for_IM_program(String startDate, String endDate, String cycle) throws Throwable {
	    biDataObject.inputScheduleTabOfProgram(startDate, endDate, cycle);
	}
	
	
	
	@Then("^filter the program using sheet \"([^\"]*)\" for Rule create$")
	public void filter_the_program_using_sheet_for_Rule_create(String programSheet) throws Throwable {
		String programName;
		ex.setExcelFile("biDataSetup", programSheet);
		programName=(String) ex.getCell(1,0);
		System.out.println("Program Name:::"+programName);
		commonObjects.filterName(programName);
		 commonObjects.clickOptionsIcon();
		 biDataObject.click_ProgramViewRules();
	}
	
	@Then("^click on Create New Rule$")
	public void click_on_Create_New_Rule() throws Throwable {
	    jswait.loadClick("//paper-button[text()='Create New Rule']");
	}
	

		@Then("^input Rule Name and  Target Tab from Sheet \"([^\"]*)\"$")
		public void input_Rule_Name_and_Target_Tab_from_Sheet(String ruleSheet) throws Throwable {

			String ruleName;
			excel.setExcelFile("biDataSetup", ruleSheet);
			ruleName = (String) excel.getCell(1, 0);
			ruleName = RandomNameGenerator.getRandomName(ruleName);
			excel.setCell(1, 0, ruleName);
			System.out.println("Rule Name ::::" + ruleName);
			biDataObject.input_Target_Tab_For_Rule(ruleName);

		}
	
	
	
	@Then("^input offers Tab product \"([^\"]*)\" offer Sheet \"([^\"]*)\" Recommendationlimit \"([^\"]*)\" Acceptancelimit \"([^\"]*)\" rule sheet \"([^\"]*)\"$")
	public void input_offers_Tab_product_offer_Sheet_Recommendationlimit_Acceptancelimit_rule_sheet(String productSheet, String offerSheet, String recomendlimit, String acceptLimit,String ruleSheet) throws Throwable {
		excel.setExcelFile("biDataSetup", ruleSheet);
		ex.setExcelFile("biDataSetup", offerSheet);
		biDataObject.selectProduct_forProgram(productSheet);
	    biDataObject.select_RecomndAndAcceptLimit(recomendlimit,acceptLimit);
	    String recomendTimeOut=(String) excel.getCell(1, 1);
	    String acceptTimeOut=(String) excel.getCell(1, 2);
	    String conversionTimeOut=(String) excel.getCell(1, 3);
	    String declineTimeOut=(String) excel.getCell(1, 4);
	    String laterTimeOut=(String) excel.getCell(1, 5);
	    System.out.println("Offer Recommendation Timeout "+recomendTimeOut+":Hours");
	    System.out.println("Offer acceptance Timeout "+acceptTimeOut+":Hours");
	    System.out.println("Offer conversion Timeout "+conversionTimeOut+":Hours");
	    System.out.println("Offer decline Timeout "+declineTimeOut+":Hours");
	    System.out.println("Offer May-be-later Timeout "+laterTimeOut+":Hours");
	    biDataObject.select_AllTimeOuts(recomendTimeOut, acceptTimeOut, conversionTimeOut, declineTimeOut, laterTimeOut);
	    String offerName=(String) ex.getCell(1,0);
	    biDataObject.select_Offer_for_IMrule(offerName);
	    //:::::::Skipping Additional Information Tab and Moving forward::::::
	}
	
	@Then("^input delivery Tab of Rule Tracking expires \"([^\"]*)\" Day \"([^\"]*)\" Hours Daysor minute \"([^\"]*)\"$")
	public void input_delivery_Tab_of_Rule_Tracking_expires_Day_Hours_Daysor_minute(String expire, String count, String dayHour) throws Throwable {
	    biDataObject.inputDeliveryTabOfIMRule(expire, count, dayHour);
	}
	
	
	@Then("^input Schedule Tab for Rule sheet \"([^\"]*)\" start date \"([^\"]*)\" and End Date \"([^\"]*)\" refresh Cycle \"([^\"]*)\"$")
	public void input_Schedule_Tab_for_Rule_sheet_start_date_and_End_Date_refresh_Cycle(String ruleSheet, String startDate, String endDate, String cycle) throws Throwable {
	   biDataObject.inputScheduleTab_of_Rule(ruleSheet, startDate, endDate, cycle);
	}
	
	@Then("^Activate the Rule$")
	public void activate_the_Rule() throws Throwable {
	   biDataObject.activate_TheRule();
	}
	
	@Then("^wait until rule from sheet \"([^\"]*)\" is refreshed$")
	public void wait_until_rule_from_sheet_is_refreshed(String ruleSheetName) throws Throwable {
		String ruleName;
		excel.setExcelFile("biDataSetup", ruleSheetName);
		ruleName = (String) excel.getCell(1, 0);
		System.out.println("Rule name:-: " + ruleName);
		commonObjects.filterName(ruleName);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (biDataObject.getRule_Last_Refresh_Date().isEmpty() && t.checkTimerMin(50)) {
			commonObjects.filterName(ruleName);
			Thread.sleep(5000);
			System.out.println(":-::-: Waiting for Rule to be Refreshed :-:::-:");
		}

	}
			
	
		@Then("^Get Api call msisdn \"([^\"]*)\" with Auth Key \"([^\"]*)\" and Rule sheet \"([^\"]*)\" for BI$")
		public void get_Api_call_msisdn_with_Auth_Key_and_Rule_sheet_for_BI(String msisdn, String authKey,
				String ruleSheet) throws Throwable {

			StringBuilder str = new StringBuilder();
			str.append("http://");
			str.append(p.getValue("env"));
			str.append(":");
			str.append("8092");
			str.append("/rest/authkey/" + authKey + "/msisdn/" + msisdn + "/offers");
			System.out.println(str.toString());

			Request req = new Request();
			req.getRequest(str.toString(), "");
			offerRecommended = req.responseString;
			System.out.println("This is the response:-:>> " + req.responseString);
			ex.setExcelFile("biDataSetup", ruleSheet);
			String message=req.responseString;
			String messagesArray[]=message.split(":",0);
		    String successMesssage=messagesArray[3];
			
		    if (successMesssage.contains("Success")) {
				String idTemp[] = messagesArray[6].split("\"", 0);
				String ruleId = idTemp[1];
				ex.setCell(1, 7, ruleId);
				System.out.println("Successfully Stored Rule ID :-:-: " + ruleId);
			}
		 
			
			

		}
	
	
	@Then("^POST Api call msisdn \"([^\"]*)\" with auth key \"([^\"]*)\" and Rule sheet \"([^\"]*)\" for BI$")
	public void post_Api_call_msisdn_with_auth_key_and_Rule_sheet_for_BI(String msisdn, String authKey, String ruleSheet) throws Throwable {
	   
		String ruleId=null;
		excel.setExcelFile("biDataSetup", ruleSheet);
		
		StringBuilder postBody = new StringBuilder();
		postBody.append("{\"event\":[\r\n" + 
				"{ \"id\":\"104\", \"type\":\"POST\", \"value\":\"");
		
		//rule ID Append Below for use in value field in Post api Body
		ruleId=(String) excel.getCell(1, 7);
		System.out.println("Rule Id :-:>> "+ruleId);
		postBody.append(ruleId);
		postBody.append("\", \"date\":\"");
		
		Date now = new Date();
		//Calendar calendar = Calendar.getInstance();
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(now);
		postBody.append(timeStamp);
		postBody.append(" +0530\" }");
		postBody.append("]}");
		System.out.println(postBody.toString());
		
		StringBuilder str = new StringBuilder();
		str.append("http://");
		str.append(p.getValue("env"));
		str.append(":");
		str.append("8092");
		str.append("/rest/authkey/"+authKey+"/msisdn/"+msisdn+"/kpi/events");
		System.out.println(str.toString());
		Request req = new Request();
		String resp=req.postRequeststring(str.toString(), postBody.toString());
		String code=resp.substring(0, 3);
		if(code.equals("200"))
			System.out.println(":-::-:-:-:-:-:-:Post API call is Successfull:-:-:-:-:-:");
		else 
			System.out.println("!!!!!!!!!!!!! Unsuccessfull!!!!!");
		
	}
	
	
	
	
	

}
