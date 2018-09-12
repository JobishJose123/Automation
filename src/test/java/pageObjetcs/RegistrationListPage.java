package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class RegistrationListPage extends Init{

	public RegistrationListPage() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();
	
	@FindBy(xpath="//div[contains(text(),'Customer Lists')]/../..")
	private WebElement registrationListButton;
	@FindBy(xpath="//div[contains(text(),'Customer Location Insights')]/../..")
	private WebElement customerLocationInsightsButton;
	@FindBy(xpath="//div[contains(text(),'Customer Demographics')]/../..")
	private WebElement customerDemographicsCategoryButton;
	@FindBy(xpath="//div[contains(text(),'Customer Digital Persona')]/../..")
	private WebElement customerDigitalPersonaButton;
	@FindBy(xpath="//div[contains(text(),'Learned Behaviors')]/../..")
	private WebElement learnedBehaviourButton;
	@FindBy(xpath="//div[contains(text(),'AI powered Analytical Scores')]/../..")
	private WebElement AIPoweredAnalyticalScoresButton;
	@FindBy(xpath="//div[contains(text(),'Customer Device Info')]/../..")
	private WebElement customerDeviceInfoButton;
	@FindBy(xpath="//div[contains(text(),'Digital Engagement Preferences')]/../..")
	private WebElement digitalEngagementPreferencesCategoryButton;
	@FindBy(xpath="//paper-button[text()='Create']")
	private WebElement createNewRegistrationListButton;
	@FindBy(xpath=".//*[@id='createNew']//label[text()='Name']/../input")
	private WebElement registrationListName;
	@FindBy(xpath=".//*[@id='createNew']//label[text()='Description']/..//textarea")
	private WebElement registrationListDescription;
	@FindBy(xpath=".//*[@id='createNew']//label[text()='List Type']/..//input")
	private WebElement registrationListTypeSelector;
	@FindBy(xpath=".//*[@id='createNew']//paper-item[text()='Standard']")
	private WebElement registrationListTypeStandard;
	@FindBy(xpath=".//*[@id='createNew']//paper-item[text()='Do-not-Contact List']")
	private WebElement registrationListTypeDND;
	@FindBy(xpath=".//*[@id='createNew']//paper-button[text()='Save']")
	private WebElement registrationListSaveButton;
	@FindBy(xpath=".//table-select//paper-icon-button[2]")
	private WebElement registrationListSelectAllPartners;
	@FindBy(xpath="//div[@id='radioLabel'][contains(.,'Mandatory')]/..")
	private WebElement dndListMandatorySelect;
	@FindBy(xpath="//div[contains(text(),'Enable Tracking')]")
	private WebElement enableTrackingCheckbox;
//	@FindBy(xpath="")
//	private WebElement registrationListButton;
//	@FindBy(xpath="")
//	private WebElement registrationListButton;
//	@FindBy(xpath="")
//	private WebElement registrationListButton;
//	@FindBy(xpath="")
//	private WebElement registrationListButton;
//	@FindBy(xpath="")
//	private WebElement registrationListButton;
	
	
	
	public void navigateToRegistrationList() throws InterruptedException {
		jswait.loadClick(registrationListButton);
	}
	public void navigateToCustomerLocationInsights() throws InterruptedException {
		jswait.loadClick(customerLocationInsightsButton);
	}
	public void navigateToCustomerDeviceInfo() throws InterruptedException {
		jswait.loadClick(customerDeviceInfoButton);
	}
	public void navigateToCustomerDemographicsCategory() throws InterruptedException {
		jswait.loadClick(customerDemographicsCategoryButton);
	}
	public void navigateToCustomerDigitalPersona() throws InterruptedException {
		jswait.loadClick(customerDigitalPersonaButton);
	}
	public void navigateToLearnedBehaviour() throws InterruptedException {
		jswait.loadClick(learnedBehaviourButton);
	}
	public void navigateToAIPoweredAnalyticalScores() throws InterruptedException {
		jswait.loadClick(AIPoweredAnalyticalScoresButton);
	}
	public void navigateToDigitalEngagementPreferencesCategory() throws InterruptedException {
		jswait.loadClick(digitalEngagementPreferencesCategoryButton);
	}
	
	public void enterRegistrationListName(String name) throws InterruptedException {
		jswait.loadSendKeys(registrationListName, name);
	}
	public void enterRegistrationListDescription(String desc) throws InterruptedException {
		jswait.loadSendKeys(registrationListDescription, desc);
	}
	public void selectRegistrationListTypeStandard() throws InterruptedException {
		jswait.loadClick(registrationListTypeSelector);
		jswait.loadClick(registrationListTypeStandard);
	}
	public void selectRegistrationListTypeDND() throws InterruptedException {
		jswait.loadClick(registrationListTypeSelector);
		jswait.loadClick(registrationListTypeDND);
	}
	public void selectRegistrationListTypeDNDMandatory() throws InterruptedException {
		jswait.loadClick(registrationListTypeSelector);
		jswait.loadClick(registrationListTypeDND);
		jswait.loadClick(dndListMandatorySelect);
	}
	public void clickSaveButton() throws InterruptedException {
		jswait.loadClick(registrationListSaveButton);
	}
	public void enableTracking() throws InterruptedException {
		jswait.loadClick(enableTrackingCheckbox);
	}
	public void SelectAllPartners() throws InterruptedException {
		jswait.loadClick(registrationListSelectAllPartners);
	}
	public void enterRegistratonListDetails(String name,String desc) throws InterruptedException {
		enterRegistrationListName(name);
		enterRegistrationListDescription(desc);
		selectRegistrationListTypeStandard();
		SelectAllPartners();
	}
	public void enterCustomerDrivenEventDetails(String name,String desc) throws InterruptedException {
		enterRegistrationListName(name);
		enterRegistrationListDescription(desc);
	}
	public void enterUsageMetricDetails(String name,String desc) throws InterruptedException {
		enterRegistrationListName(name);
		enterRegistrationListDescription(desc);
		enableTracking();
		SelectAllPartners();
	}
	
	public void enterDNDRegistratonListDetails(String name,String desc) throws InterruptedException {
		enterRegistrationListName(name);
		enterRegistrationListDescription(desc);
		selectRegistrationListTypeDND();
		SelectAllPartners();
	}public void enterMandatoryDNDRegistratonListDetails(String name,String desc) throws InterruptedException {
		enterRegistrationListName(name);
		enterRegistrationListDescription(desc);
		selectRegistrationListTypeDNDMandatory();
		SelectAllPartners();
	}
	public void clickCreateNewRegistrationListButton() throws InterruptedException {
		jswait.loadClick(createNewRegistrationListButton);
	}
}
