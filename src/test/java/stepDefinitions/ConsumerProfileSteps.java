package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;

public class ConsumerProfileSteps extends Init{
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CustomerProfilePage customerObjects= new CustomerProfilePage();
	CommonObjects commonObjects = new CommonObjects();
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	ExcelHelper list = new ExcelHelper();
	public ConsumerProfileSteps() {
		PageFactory.initElements(driver, this);
	}
	public String getMsisdn() throws IOException {
		String line = "";
		list.setExcelFile("registrationListInputData", "Sheet1");
		BufferedReader br = new BufferedReader(new FileReader("ExcelFiles\\list_91992273.csv"));
		line = br.readLine();
		line = br.readLine();
		System.out.println(line);
		String[] msisdn = line.split(",");
		return msisdn[0];
	}
	@Then("^verify whether breadcrumbs are displayed in the page")
	public void verifyCustomerProfileBreadcrumbs() throws InterruptedException {
		assertTrue(customerProfilePage.checkCustomerProfileBreadcrumb(), "Error in displaying Breadcrumb");
	}
	@Then("^verify 5 tabs in customer profile page")
	public void verify5tabsInCustomerProfile() throws InterruptedException {
		customerProfilePage.clickCustomerInfoTab();
		customerProfilePage.clickCustomerSupportTab();
		customerProfilePage.clickEventsTab();
		customerProfilePage.clickSubscribedToListsTab();
		customerProfilePage.clickUsageMetricsTab();
	}
	@Then("^search msisdn \"([^\"]*)\"$")
	public void searchMsisdn(String msisdn) throws InterruptedException, IOException {	
		if(msisdn.length()<10) {
			msisdn = getMsisdn();
		}
		customerProfilePage.searchMsisdn(msisdn);
	}
	@Then("^verify the data successfully uploaded$")
	public void verify_the_data_successfully_uploaded() throws Throwable {
		Thread.sleep(5000);
		String tagcategory = "http://flytxttags.epizy.com";
		String msisdn = "919846130328";
		if(msisdn.length()<10) {
			msisdn = getMsisdn();
			
		jswait.waitUntil("//data-table-cell/span[contains(.,'Email_q11')]//following::data-table-cell[2]/span");
		String txttagid = driver.findElement(By.xpath("//data-table-cell/span[contains(.,'Email_q11')]")).getText();
		System.out.println(txttagid);
		if(tagcategory.equalsIgnoreCase(txttagid))
		{
			System.out.println("uploaded successfully");
		}
		}
		//String txttagid = driver.findElement(By.xpath("//data-table-cell[contains(.,'Email_q11')]//following::data-table-cell[2]")).getText();
		//System.out.println(txttagid);
		//System.out.println(tagcategory);
	}
	
	@Then("^verify customer info page of \"([^\"]*)\"$")
	public void verifyCustomerProfiile(String msisdn) throws Exception {
		if(msisdn.length()<=10) {
			msisdn = getMsisdn();
		}
		jswait.waitUntil("//consumer-profile/div/h3[contains(.,'"+msisdn+"')]");
	}
	@Then("^verify details in customer info page of \"([^\"]*)\"$")
	public void verifyDetailsInCustomerProfiile(String msisdn) throws Exception {
		list.setExcelFile("registrationListInputData", "Sheet1");
		eh.setExcelFile(list.getCell(1, 2).toString(), list.getCell(1, 2).toString());
		jswait.waitUntil("//data-table-cell/span[contains(.,'"+msisdn+"')]");
		
		String line = "";
		list.setExcelFile("registrationListInputData", "Sheet1");
		BufferedReader br = new BufferedReader(new FileReader("ExcelFiles\\list_91992273.csv"));
		line = br.readLine();
		line = br.readLine();
		System.out.println(line);
		String[] userData = line.split(",");
		
		if(msisdn.length()<10) {
			msisdn = getMsisdn();
			jswait.waitUntil("//data-table-cell/span[contains(.,'First Name_q11')]/../..//span[contains(.,'Text')]/../..//span[contains(.,'"+eh.getCell(1, 1).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Last Name_q11')]/../..//span[contains(.,'Text')]/../..//span[contains(.,'"+eh.getCell(1, 2).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Country_q11')]/../..//span[contains(.,'Single Select')]/../..//span[contains(.,'"+eh.getCell(1, 3).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Email_q11')]/../..//span[contains(.,'Text')]/../..//span[contains(.,'"+eh.getCell(1, 4).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Languages_q11')]/../..//span[contains(.,'Multi Select')]/../..//span[contains(.,'"+eh.getCell(1, 5).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Languages_q11')]/../..//span[contains(.,'Multi Select')]/../..//span[contains(.,'"+eh.getCell(1, 6).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Balance_q11')]/../..//span[contains(.,'Number')]/../..//span[contains(.,'"+eh.getCell(1, 7).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Boolean_q11')]/../..//span[contains(.,'Yes or No')]/../..//span[contains(.,'"+eh.getCell(1, 8).toString()+"')]");
			jswait.waitUntil("//data-table-cell/span[contains(.,'Age_q11')]/../..//span[contains(.,'Number')]/../..//span[contains(.,'"+eh.getCell(1, 9).toString()+"')]");
		}		
	}
	@Then("^verify changing customer number from all tabs of \"([^\"]*)\"$")
	public void verifyChangingCustomerNumberFromAllTabs(String msisdn) throws Exception {
		list.setExcelFile("registrationListInputData", "Sheet1");
		if(msisdn.length()<10) {
			msisdn = getMsisdn();
		}
		msisdn +=1;
		customerProfilePage.enterValueForMsisdn(msisdn);
		customerProfilePage.clickSearchIcon();
		customerProfilePage.clickCustomerSupportTab();
		msisdn +=1;
		customerProfilePage.enterValueForMsisdn(msisdn);
		customerProfilePage.clickSearchIcon();
		customerProfilePage.clickEventsTab();
		msisdn +=1;
		customerProfilePage.enterValueForMsisdn(msisdn);
		customerProfilePage.clickSearchIcon();
		customerProfilePage.clickSubscribedToListsTab();
		msisdn +=1;
		customerProfilePage.enterValueForMsisdn(msisdn);
		customerProfilePage.clickSearchIcon();
		customerProfilePage.clickUsageMetricsTab();
		msisdn +=1;
		customerProfilePage.enterValueForMsisdn(msisdn);
		customerProfilePage.clickSearchIcon();
	}
	
	
	@Then("^enter customer number \"([^\"]*)\"$")
	public void enterCustomerNumber(String msisdn) throws InterruptedException, IOException {
		list.setExcelFile("registrationListInputData", "Sheet1");
		if(msisdn.length()<10) {
			msisdn = getMsisdn();
		}
		customerObjects.enterCustomerNumber(msisdn);
	}
	@Then("^click on search button$")
	public void clickSearchNumberButton() throws InterruptedException {
		
		customerObjects.clickSearchNumberIcon();
		
	}
	
	@Then("^click on events tab$")
	public void clickEventsTab() throws Exception {
		
		customerObjects.clickEventsTab();
		
	}
	
	@Then("^click on event type checkbox$")
	public void clickEventsTypeCheckBox() throws Exception {
		
		customerObjects.clickEventTypeCheckbox();
		
	}
	@Then("^choose all events$")
	public void chooseAllEvents() throws Exception {
		
		customerObjects.chooseAllEvents();	
	}
	
	@Then("^choose Acknowledged event$")
	public void choose_Acknowledged_event() throws Throwable {
		customerObjects.clickOnAckEventCheckBox();
	}
	
	@Then("^click on apply button$")
	public void clickApplyButton() throws Exception {
		
		customerObjects.clickApplyButton();
		
	}
	
	@Then("^verify toast message$")
	public void verifyToastMessage() throws Exception {
		
		customerObjects.verifyToastMessagege();
		
	}
	
	
	@Then("^click subscribed to lists tab$")
	public void clickSubscribedToListsTab() throws Exception {
		
		customerObjects.clickSubscribedToListsTab();
		
	}
	
	@Then("^click unsubscribe button$")
	public void clickUnsubscribeButton() throws Exception {
		
		customerObjects.clickUnsubscribeButton();
		
	}
	
	@Then("^verify confirmation message panel$")
	public void verifyConfirmationMessagePanel() throws Exception {
		
		customerObjects.verifyConfirmationMessagePanel();
		
	}
	
	
	@Then("^click usage metrics tab$")
	public void clickUsageMetricsTab() throws Exception {
		
		
		customerObjects.clickUsageMetricsTab();
		Thread.sleep(2000);
		
	}
	
	@Then("^click customer support tab$")
	public void clickCustomerSupportTab() throws Exception {
		
		customerObjects.clickCustomerSupportTab();
		
	}
	
	@Then("^verify add delete check and uncheck of attributes$")
	public void addDeleteSaveAttributes() throws Exception {
		
		customerObjects.addDeleteSaveAttributes();
		
	}
	
	@Then("^verify include sub partners option$")
	public void verifyIncludeSubPartnersOption() throws Exception {
		
		customerObjects.verifyIncludeSubPartnersOption();
		
	}
	
	@Then("^verify subscribed to lists$")
	public void verifySubscribedToLists() throws Exception {
		
		customerObjects.verifySubscribedToLists();
	
	}
	
	@Then("^verify events row$")
    public void verifyEventsRow() throws Exception {
		
		customerObjects.verifyEventsRow();
	
	}
	
	@Then("^verify fulfillment events row$")
    public void verifyFulfillmentEventsRow() throws Exception {
		
		customerObjects.verifyFulfillmentEventsRow();
	
	}
	
	@Then("^verify conversion events row$")
    public void verifyConvrsionEventsRow() throws Exception {
		
		customerObjects.verifyConversionEventsRow();
	
	}
	
	
	@Then("^try to add more than five attributse and check for toast message$")
	
	public void addMaxAttributes() throws Exception {
		
		customerObjects.addMaxAttributes();
		
	}
	
   @Then("^verify events row in customer support page$")
	
	public void verifyCustomerSupportEventsRow() throws Exception {
		
		customerObjects.verifyCustomerSupportEventsRow();
		
	}
   
   @Then("^verify events row in customer support events time details$")
	
	public void verifyCustomerSupportEventsTimeDetails() throws Exception {
		
		customerObjects.verifyCustomerSupportEventsTimeDetails();
		
	}
	
 
   
   @Then("^unsubscribe a list$")
   public void unsubscribeList() throws Exception {
	   
	   
		
		customerObjects.clickYesButton();
		
	}
   
   @Then("^verify events row in customer support tab$")
   public void verifyEventsRowInCustomerSupportTab() throws Exception {
	   
	   customerObjects.verifyEventsRowInCustomerSupportTab();
	   
   }
	
   @Then("^verify tab selected by default$")
   public void verifyTabSelectedByDefault() throws Exception {
	   
	   customerObjects.verifyTabSelectedByDefault();
   }
   
   @Then("^verify filterig event types$")
   public void verifyFilterigEventTypes() throws Exception {
	   
	   customerObjects.verifyFilterigEventTypes();
   
   }
   
   @Then("^verify event types selected by default$")
   public void verifyEventTypesSelectedByDefault() throws Throwable {
	   
	   customerObjects.verifyEventTypesSelectedByDefault();
   
   }
   
   @Then("^verify for saving checked attributes$")
   public void verifyForSavingCheckedAttributes() throws Throwable {
	   
	   customerObjects.verifyForSavingCheckedAttributes();
   
   }
   @Then("^verify Color of selected attribute and graph$")
   public void verifyColorOfSelectedAttributeAndGraph() throws Throwable {
	   
	   customerObjects.verifyColorOfSelectedAttributeAndGraph();
   }
   
   @Then("^verify charts in usage metric screen$")
   public void verifyCharts() throws Throwable {
	   
	   customerObjects.verifyCharts();
	   
   }
   
   @Then("^verify selected events displayed in the events tab$")
   public void verifySelectedEventsDisplayedInTheEventsTab() throws Throwable {
	   
	   customerObjects.verifySelectedEventsDisplayedInTheEventsTab();
	   
	   
   }
   
   @Then("^verify mouse hover in usage metrics tab$")
     public void verifyMouseHover() throws Throwable {
	   
	   customerObjects.verifyMouseHover();
   }
   
   
   @Then("^enter customer number for send trial verification \"([^\"]*)\"$")
	public void enterCustomerNumberForSendTrialVerification(String msisdn) throws InterruptedException, IOException {
		
		
		customerObjects.enterCustomerNumber(msisdn);
	}
	@Then("^verify trial message event details from sheet \"([^\"]*)\"$") 
	public void verifyTrialMessageEventDetails(String sheet) throws Exception {
		
		Thread.sleep(5000);
		customerObjects.verifyTrialMessageEventDetails(sheet);
		
	}
	@Then("^verify trial message event details with dynamic from sheet \"([^\"]*)\"$") 
	public void verifyTrialMessageEventDetailsDynamic(String sheet) throws Exception {
		
		Thread.sleep(5000);
		customerObjects.verifyTrialMessageEventDetailsDynamic(sheet);
		
	}
	
		
	@Then("^verify Acknowledged event from BC Sheet \"([^\"]*)\" and \"([^\"]*)\" offer \"([^\"]*)\"$")
	public void verify_Acknowledged_event_from_BC_Sheet_and_offer(String bcSheet, String campaignSheet, String offerSheet) throws Throwable {
	   if(bcSheet.contains("Edit")||bcSheet.contains("seedingTriggerableRecurringBCEd")) {
		eh.setExcelFile("bcInputDataForEdit", bcSheet);
	 }else {
		 eh.setExcelFile("bcInputData", bcSheet);
	 }
	   String bcName=eh.getCell(1, 0).toString();
	   eh.setExcelFile("campaignInputData", campaignSheet);
	   String CampaignName=eh.getCell(1,0).toString();
	   eh.setExcelFile("offerInputData", offerSheet);
	   String offerName=eh.getCell(1, 0).toString();
	   customerObjects. verifyAcknowledgedEvent(bcName,CampaignName,offerName);
	}
	
	@Then("^verify the Acknowledgement event from Sheet  \"([^\"]*)\" and inventory \"([^\"]*)\"$")
	public void verify_the_Acknowledgement_event_from_Sheet_and_inventory(String parallelRunBCSheet, String inventory) throws Throwable {
	   System.out.println("event verification");
		String bcName="";
		String campaignName="";
		String offerName="";
		String msisdn="";
		eh.setExcelFile("parallelRunBC", parallelRunBCSheet);
		
		int bcNameColumn = eh.getColumnNumber("Name");
		int campaignColumn = eh.getColumnNumber("Campaign name");
		int offerNamecolumn = eh.getColumnNumber("offer name");
		int msisdnColumn = eh.getColumnNumber("MSISDN");
		
		LinkedHashMap<String, String> dataList = eh.extractDataFromExcelFile(parallelRunBCSheet, "Name", "Inventory");
		
		System.out.println(dataList);
		for (Entry<String, String> hm: dataList.entrySet()) {
			
			commonObjects.clickOnReports();
			customerProfilePage.navigateToCustomerProfile();
			
			if(hm.getValue().equals("Unlimited")){
				
				bcName=hm.getKey();
				campaignName=eh.getCell(bcNameColumn, campaignColumn).toString();
				offerName=eh.getCell(bcNameColumn, offerNamecolumn).toString();
				msisdn=eh.getCell(bcNameColumn, msisdnColumn).toString();
				System.out.println("mssidn"+msisdn);
				System.out.println("bcname"+bcName);
				System.out.println("campaign name"+campaignName);
				System.out.println("offer Name"+offerName);
				
			}
			
			customerObjects.enterCustomerNumber(msisdn);
					
			customerObjects.clickSearchNumberIcon();
			customerObjects.clickEventsTab();
			customerObjects.chooseAllEvents();
			customerObjects.clickApplyButton();
			customerObjects.chooseAllEvents();
			customerObjects.clickOnAckEventCheckBox();
			customerObjects.clickApplyButton();
			customerObjects. verifyAcknowledgedEvent(bcName,campaignName,offerName);
			
			
		
		}
		
	}

	@Then("^verify the Conversion event from Sheet  \"([^\"]*)\" and inventory \"([^\"]*)\"$")
	public void verify_the_Conversion_event_from_Sheet_and_inventory(String parallelRunBCSheet, String inventory) throws Throwable {
	   
		String bcName="";
		String campaignName="";
		String offerName="";
		String msisdn="";
		eh.setExcelFile("parallelRunBC", parallelRunBCSheet);
		
		int bcNameColumn = eh.getColumnNumber("Name");
		int campaignColumn = eh.getColumnNumber("Campaign name");
		int offerNamecolumn = eh.getColumnNumber("offer name");
		int msisdnColumn = eh.getColumnNumber("MSISDN");
		
		LinkedHashMap<String, String> dataList = eh.extractDataFromExcelFile(parallelRunBCSheet, "Name", "Inventory");
		
		System.out.println(dataList);
		for (Entry<String, String> hm: dataList.entrySet()) {
			if(hm.getValue().equals("Unlimited")){
				
				bcName=hm.getKey();
				campaignName=eh.getCell(bcNameColumn, campaignColumn).toString();
				offerName=eh.getCell(bcNameColumn, offerNamecolumn).toString();
				msisdn=eh.getCell(bcNameColumn, msisdnColumn).toString();
				System.out.println("mssidn"+msisdn);
				System.out.println("bcname"+bcName);
				System.out.println("campaign name"+campaignName);
				System.out.println("offer Name"+offerName);
				
			}
			
			customerObjects.enterCustomerNumber("9491750004");
			
			customerObjects.clickSearchNumberIcon();
			customerObjects.clickEventsTab();
			customerObjects.chooseAllEvents();
			customerObjects.clickApplyButton();
			customerObjects.chooseAllEvents();
			customerObjects.clickOnAckEventCheckBox();
			customerObjects.clickApplyButton();
			customerObjects. verifyAcknowledgedEvent(bcName,campaignName,offerName);
		
		}
	}
	@Then("^create a field age$")
	public void create_a_field_age() throws Throwable {
		customerObjects.createProfileWithNumberFormat();
	
	}
	@Then("^verify profile age is create$")
	public void verify_profile_age_is_create() throws Throwable {
		commonObjects.clickFilterIcon();
		commonObjects.filterName("age");
		customerObjects.verifyProfileAge();
		
	}
	
}
