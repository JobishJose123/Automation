package pageObjetcs;

import org.openqa.selenium.By;
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
	CommonObjects commonObjects =new CommonObjects();
	
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
	@FindBy(xpath="//div[contains(.,'Frequency Rules')][@class='subHeading admin-freqRule style-scope admin-panel']")
	private WebElement frequencyRule;
	@FindBy(xpath="//paper-button[contains(.,'Create New Frequency Rule')]")
	private WebElement createFreqbtn;
	@FindBy(xpath="//h3[contains(.,'Create New Frequency Rule')]//following::label[contains(.,'Frequency Rule Name')]//following::input[1]")
	private WebElement freqNameInput;
	@FindBy(xpath="//h3[contains(.,'Create New Frequency Rule')]//following::label[contains(.,'Daily Limit')]//following::input[1]")
	private WebElement dailyLimit1;
	@FindBy(xpath="//paper-button[contains(.,'Save')]")
	private WebElement saveFreqbtn;
	@FindBy(xpath="//div[contains(.,'Blackout Rules')][@class='subHeading admin-blackoutRule style-scope admin-panel']")
	private WebElement blackoutRule;
	@FindBy(xpath="//paper-button[contains(.,'Create New Blackout Rule')]")
	private WebElement createBlackoutbtn;
	@FindBy(xpath="//label[contains(.,'Blackout Rule Name')]//following::input[1]")
	private WebElement blackoutInput;
	@FindBy(xpath="(//paper-button[contains(.,'Save')])[1]")
	private WebElement blackoutSavebtn;
	@FindBy(xpath="//iron-list[@id='list']")
	private WebElement scroolBlackoutRuleList;
	@FindBy(xpath="//paper-button[contains(.,'Add New Blackout Period')]")
	private WebElement blackoutPeriodbtn;
	@FindBy(xpath="//label[contains(.,'Start Day')]//following::input[1]")
	private WebElement startDayInput;
	@FindBy(xpath="//label[contains(.,'End Day')]//following::input[1]")
	private WebElement endDayInput;
	@FindBy(xpath="(//paper-item[contains(.,'Monday')])[1]")
	private WebElement monday;
	@FindBy(xpath="(//paper-item[contains(.,'Sunday')])[2]")
	private WebElement sunday;
	@FindBy(xpath="//label[contains(.,'End Action')]//following::input[1]")
	private WebElement endActionInput;
	@FindBy(xpath="//paper-item[contains(.,'Resume Automatically')]")
	private WebElement resumeAutomatically;
	@FindBy(xpath="//label[contains(.,'Start Time')]//following::input[1]")
	private WebElement startTimeinput;
	@FindBy(xpath="//label[contains(.,'End Time')]//following::input[1]")
	private WebElement endTimeInput;
	@FindBy(xpath="(//paper-button[contains(.,'OK')])[1]")
	private WebElement startTimeOK;
	@FindBy(xpath="(//paper-button[contains(.,'OK')])[2]")
	private WebElement endTimeOK;
	@FindBy(xpath="//h3[contains(.,'Create New Blackout Period')]//following::paper-button[contains(.,'Save')]")
	private WebElement saveBlackoutPeriod;
	@FindBy(xpath="//div[contains(.,'Inventory Definitions')][@class='subHeading admin-inventory style-scope admin-panel']")
	private WebElement inventoryDefinition;
	@FindBy(xpath="//paper-button[contains(.,'Create New Inventory Definition')]")
	private WebElement createNewInventorybtn;
	@FindBy(xpath="(//label[contains(.,'Channel Type')]//following::input[1])[2]")
	private WebElement channelTypeInput;
	@FindBy(xpath="//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Inventory Priority')]//following::input[1]")
	private WebElement inventoryPriorityInput;
	@FindBy(xpath="//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Sending Priority')]//following::input[1]")
	private WebElement sendingPriorityInput;
	@FindBy(xpath="(//paper-item[contains(.,'Any')])[2]")
	private WebElement channelTypeAny;
	@FindBy(xpath="//paper-icon-button[@icon='last-page']")
	private WebElement selectAllPartnerForInventory;
	@FindBy(xpath="//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Name')]//following::input[1]")
	private WebElement inventoryNameinput;
	@FindBy(xpath="//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Inventory Partner')]//following::input[1]")
	private WebElement invetoryPartnerInput;
	@FindBy(xpath="(//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Inventory Partner')]//following::paper-item[contains(.,'System Global')])[1]")
	private WebElement systemGlobalPartner;
	@FindBy(xpath="//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Frequency Rule')]//following::input[1]")
	private WebElement frequencyRuleInput;
	@FindBy(xpath="//h3[contains(.,'Create New Inventory Definition')]//following::label[contains(.,'Blackout Rule')]//following::input[1]")
	private WebElement blackoutRuleInput;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'selenium_freq')]")
	private WebElement defaultFrequencySelect;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'sel_freq_one_per_day')]")
	private WebElement onePerDaytFrequencySelect;
	@FindBy(xpath="(//vaadin-combo-box-item[contains(.,'selenium_blackout')])[1]")
	private WebElement defaultBlackoutSelect;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'selenium_blackout_always')]")
	private WebElement blackoutAlwaysSelect;
	@FindBy(xpath="//paper-button[contains(.,'Save')]")
	private WebElement saveInventorybtn;
	
	@FindBy(xpath="(//div[@name='PM'])[1]")
	private WebElement startTimeSet;
	@FindBy(xpath="(//div[@name='PM'])[2]")
	private WebElement endTimeSet;
	@FindBy(xpath="//paper-toggle-button[@title='Activate']")
	private WebElement activeTogglebtn;
	@FindBy(xpath="//paper-icon-button[@title='Save']")
	private WebElement saveDK;
	@FindBy(xpath="//div[contains(.,'Rewards')][@class='subHeading admin-blackoutRule style-scope admin-panel']")
	private WebElement rewards;
	@FindBy(xpath="//paper-button[contains(.,'Create New Reward Type')]")
	private WebElement createNewReward;
	@FindBy(xpath="//h3[contains(.,'Create New Reward Type')]//following::input[1]")
	private WebElement rewardNameInput;
	@FindBy(xpath="//h3[contains(.,'Create New Reward Type')]//following::textarea[1]")
	private WebElement rewardDescription;
	@FindBy(xpath="//h3[contains(.,'Create New Reward Type')]//following::input[2]")
	private WebElement flowClassInput;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'com.flytxt.fulfillment.flows.sample.SampleFlow')][1]")
	private WebElement selectSampleFlow;
	@FindBy(xpath="(//paper-button[contains(.,'Save')])[1]")
	private WebElement saveReawrdbtn;
	
	
	
	
	
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
	public void enterRevenueMetricDetails(String name,String desc) throws InterruptedException {
		enterRegistrationListName(name);
		enterRegistrationListDescription(desc);
		enableTracking();
		SelectAllPartners();
	}
	public void enterEventCountDetails(String name,String desc) throws InterruptedException {
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
	public void createFrequency(String frequency) throws Exception{
		jswait.loadClick(frequencyRule);
		jswait.loadClick(createFreqbtn);
		if(frequency.equalsIgnoreCase("default")) {
			jswait.loadSendKeys(freqNameInput, "selenium_freq");
		}
		if(frequency.equalsIgnoreCase("onePerDay")) {
			jswait.loadSendKeys(freqNameInput, "sel_freq_one_per_day");
			jswait.loadClick(dailyLimit1);
			
		}
		jswait.loadClick(saveFreqbtn);
	}
	
	public void createBlackout(String blackout) throws Exception{
	jswait.loadClick(blackoutRule);
		jswait.loadClick(createBlackoutbtn);
		if(blackout.equalsIgnoreCase("default")) {
		jswait.loadSendKeys(blackoutInput,"selenium_blackout");
		jswait.loadClick(blackoutSavebtn);
		}
		if(blackout.equalsIgnoreCase("specificTime")) {
			jswait.loadSendKeys(blackoutInput,"selenium_blackout_always");
			jswait.loadClick(blackoutSavebtn);
			Thread.sleep(2000);
//			jswait.loadClick("//iron-list[@id='list']", "//span[contains(.,'selenium_blackout_always')]");
			jswait.loadClick("//span[contains(.,'selenium_blackout_always')]");
			jswait.loadClick(blackoutPeriodbtn);
			jswait.loadClick(startDayInput);
			jswait.loadClick(monday);
			jswait.loadClick(endDayInput);
			jswait.loadClick(sunday);
			jswait.loadClick(endActionInput);
			jswait.loadClick(resumeAutomatically);
			jswait.loadClick(startTimeinput);
			jswait.loadClick(startTimeSet);
			jswait.loadClick(startTimeOK);
			jswait.loadClick(endTimeInput);
			jswait.loadClick(endTimeSet);
			jswait.loadClick(endTimeOK);
			jswait.loadClick(saveBlackoutPeriod);
		
		}
		
	}
	public void createInventory(String inventory, String frequency, String blackout) throws Exception{
		Thread.sleep(2000);
		jswait.loadClick(inventoryDefinition);
		Thread.sleep(2000);
		jswait.loadClick(createNewInventorybtn);
		jswait.loadClick(channelTypeInput);
		jswait.loadClick(channelTypeAny);
		jswait.loadClick(invetoryPartnerInput);
		jswait.loadClick(systemGlobalPartner);
		jswait.loadSendKeys(inventoryPriorityInput, "1");
		jswait.loadSendKeys(sendingPriorityInput, "1");
		jswait.loadClick(selectAllPartnerForInventory);
	
		
		if(inventory.equalsIgnoreCase("default")||inventory.equalsIgnoreCase("unlimited")) {
			if(inventory.equalsIgnoreCase("default"))
			jswait.loadSendKeys(inventoryNameinput,"Unlimited");
			else
			jswait.loadSendKeys(inventoryNameinput,"sel_unlimited");
			jswait.loadClick(frequencyRuleInput);
			jswait.loadClick(defaultFrequencySelect);
			jswait.loadClick(blackoutRuleInput);
			jswait.loadClick(defaultBlackoutSelect);
		}
		if(inventory.equalsIgnoreCase("onePerDay")) {
			jswait.loadSendKeys(inventoryNameinput,"sel_one_per_day");
			jswait.loadClick(frequencyRuleInput);
			jswait.loadClick(onePerDaytFrequencySelect);
			jswait.loadClick(blackoutRuleInput);
			jswait.loadClick(defaultBlackoutSelect);
		}
		if(inventory.equalsIgnoreCase("specificTime")) {
			jswait.loadSendKeys(inventoryNameinput,"selenium_blackout_always");
			jswait.loadClick(frequencyRuleInput);
			jswait.loadClick(defaultFrequencySelect);
			jswait.loadClick(blackoutRuleInput);
			jswait.loadClick(blackoutAlwaysSelect);
		}
		jswait.loadClick(saveInventorybtn);
	}
	public void filterDkJobName(String jobName) throws Exception{
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		String activate=driver.findElement(By.xpath("//paper-toggle-button")).getAttribute("aria-pressed");
		System.out.println("the dk job is : "+activate);
		if(activate.equalsIgnoreCase("false"))
		jswait.loadClick(activeTogglebtn);
		else
			System.out.println("toggle button is already active");
         jswait.loadClick(saveDK);
		
		
	}
	public void createReward(String reward) throws Exception{
		jswait.loadClick(rewards);
		jswait.loadClick(createNewReward);
		jswait.loadSendKeys(rewardNameInput, reward);
		jswait.loadSendKeys(rewardDescription, "reward by selenium");
		jswait.loadSendKeys(flowClassInput,"com.flytxt.fulfillment.flows.sample.SampleFlow");
		jswait.loadClick(selectSampleFlow);
		jswait.loadClick(saveReawrdbtn);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
