package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CustomerProfilePage;

public class ConsumerProfileSteps extends Init{
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CustomerProfilePage customerObjects= new CustomerProfilePage();
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	ExcelHelper list = new ExcelHelper();
	public ConsumerProfileSteps() {
		PageFactory.initElements(driver, this);
	}
	public String getMsisdn() throws IOException {
		String line = "";
		list.setExcelFile("registrationListInputData", "Sheet1");
		BufferedReader br = new BufferedReader(new FileReader(list.getCell(1, 1).toString()));
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
		if(msisdn.length()<=10) {
			msisdn = getMsisdn();
		}
		customerProfilePage.searchMsisdn(msisdn);
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
		jswait.waitUntil("//data-table-cell/span[contains(.,'"+msisdn+"')]");
		if(msisdn.length()<=10) {
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
		if(msisdn.length()<=10) {
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
	
	
	@Then("^enter customer number from sheet \"([^\"]*)\"$")
	public void enterCustomerNumber(String sheet) throws InterruptedException {
		
		ExcelHelper consumerFile = new ExcelHelper();
		consumerFile.setExcelFile("consumerInputData",sheet);
		eh.setExcelFile("consumerInputData",sheet);
		String number = (String) eh.getCell(1, 0);
		customerObjects.enterCustomerNumber(number);
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
		
	}
	
	@Then("^click customer support tab$")
	public void clickCustomerSupportTab() throws Exception {
		
		customerObjects.clickCustomerSupportTab();
		
	}
	
	@Then("^verify add delete check and uncheck of attributes$")
	public void addDeleteSaveAttributes() throws Exception {
		
		customerObjects.addDeleteSaveAttributes();
		
	}
	
	@Then("^verify include sub departments option$")
	public void verifyIncludeSubDepartmentsOption() throws Exception {
		
		customerObjects.verifyIncludeSubDepartmentsOption();
		
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
	
   @Then("^choose all events$")
	
	public void clickAllEventsCheckbox() throws Exception {
		
		customerObjects.clickAllEventsCheckbox();
		
	}
   
   @Then("^unsubscribe a list$")
   public void unsubscribeList() throws Exception {
	   
	   
		
		customerObjects.clickYesButton();
		
	}
	
	
	
}
