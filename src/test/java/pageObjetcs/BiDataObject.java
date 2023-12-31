package pageObjetcs;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.CalenderUtility;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;


public class BiDataObject extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper excel = new ExcelHelper();
	ExcelHelper ex=new ExcelHelper();
	
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	CommonObjects commonObjects = new CommonObjects();
	CampaignObjects campaignObjects = new CampaignObjects();
	WebDriverWait wait = new WebDriverWait(driver, 8);
	
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	CalenderUtility calender=new CalenderUtility();
	TouchpointPage touchpointPage = new TouchpointPage();
	ProgramPage programPage = new ProgramPage();
	
	
	
	
	
	
	
	@FindBy(xpath="//paper-button[contains(text(),'Create New Segment')]")
	private WebElement createNewSegmentButton;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//label[contains(.,'Segment Name')]/../..//input")
	private WebElement segmentNameField;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//label[contains(.,'Description')]/../..//textarea")
	private WebElement segmentDescriptionField;
	@FindBy(xpath = "//paper-dialog[@id='predefinedwin']//label[contains(.,'List')]/../..//input")
	private WebElement listSelectorField;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
	private WebElement targetConditionTypeSelector;
	@FindBy(xpath="//paper-item[contains(.,'Customer Lists')]")
	private WebElement CustomerList;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../..//input/following::label[contains(.,'List')]/../..//input")
	private WebElement List;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../..//input/following::paper-item[contains(.,'selenium_BiList')]")
	private WebElement customerlistName;
	@FindBy(xpath="//label[text()='Condition']/../..//input")
	private WebElement conditionClick;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//paper-button[contains(.,'Save')]")
	private WebElement segmentSaveButton;
	
	//xpath for attribute creations 
	
	@FindBy(xpath = "//paper-button[text()='Create New Campaign Attribute']")
	private WebElement newCamAtbtn;
	@FindBy(xpath = "//paper-button[text()='Create New Offer Attribute']")
	private WebElement newOffAtbtn;
	@FindBy(xpath = "//paper-button[text()='Create New Broadcast Attribute']")
	private WebElement newBroadcastAtbtn;
	/////
	
	///************X paths for Offer creation and Catalog creation adding Offers to catalog   ******////
	
	@FindBy(xpath = "//div[@class='addAttrButn style-scope offer-details']//paper-button[text()='Add']")
	private WebElement offerAttributeAddBtn;
	@FindBy(xpath = "//label[text()='Attribute']/../input")
	private WebElement attributefield;
	@FindBy(xpath = "//label[text()='Value']/../input")
	private WebElement offerttributeValfield;
	@FindBy(xpath = "//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//paper-button[text()='Save']")
	private WebElement offerRuleSaveBtn;
	@FindBy(xpath = "//rewards-container[2]//paper-button")
	private WebElement Rule1AddBtn;
	@FindBy(xpath = "//rewards-container[2]//rewards-list[1]//label[contains(.,'Reward Type')]/..//input")
	private WebElement Rule1Inputfield;
	@FindBy(xpath = "//seeding-reward//vaadin-combo-box[@id='reward']//input")
	private WebElement seedRewardField;
	@FindBy(xpath="//paper-button[text()='Create New Catalog']")
	private WebElement CreateNewCatalogButton;
	@FindBy(xpath="//div[2]/paper-input[1]/paper-input-container/div[2]/div/input")
	private WebElement CatalogName;
	@FindBy(xpath="//paper-input[2]/paper-input-container/div[2]/div/input")
	private WebElement CatalogDescription;
	@FindBy(xpath="//create-offer-catalogue//paper-button[contains(text(),'Save')]")
	private WebElement CatalogSaveButton;
	@FindBy(xpath="//paper-button[contains(text(),'Add Offers')]")
	private WebElement CatalogAddOffer;
	@FindBy(xpath="//paper-button[text()='Add to Catalog']")
	private WebElement AddToCatalogButton;
	//////////////////////////////////////////////////////////////////
	////////////////////// X path for campaign, Broadcast creations  //////////////////////////////
	
	@FindBy(xpath = "//paper-button[text()='Add']")
	private WebElement camAtbtAddButton;
	@FindBy(xpath = "//label[text()='Campaign Attributes']/../input")
	private WebElement campAtbtField;
	@FindBy(xpath = "//label[text()='Value']/../input")
	private WebElement camAtbtValueField;
	 @FindBy(xpath="//paper-button[contains(text(),'Create Condition')]")
	 private WebElement CreateConditionButton;
	 @FindBy(xpath = "//label[text()='List']/../input")
	 private WebElement campListfield;
	 @FindBy(xpath = "//label[text()='Condition']/../input")
	 private WebElement campaignListCondition;
	
//////// ****** X path for BC creation *********///////////////////////////////////////////////////
	 @FindBy(xpath = "//label[contains(.,'Broadcast Name')]/../input")
	 private WebElement BroadcastName;
	 @FindBy(xpath = "//label[contains(.,'Purpose')]/../input")
	 private WebElement BroadcastPurpose;
	 @FindBy(xpath = "//label[contains(.,'Label')]/../input")
	 private WebElement LabelSelector;
	 @FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Crossell')]")
	 private WebElement LabelCrossell;
	 @FindBy(xpath = "//label[contains(.,'Inventory')]/../input")
	 private WebElement InventorySelector;
	 @FindBy(xpath = "//div[@class='addAttrButn style-scope broadcast-details']//paper-button[text()='Add']")
	 private WebElement bcAttributeAdd;
	 @FindBy(xpath = "//label[text()='Broadcast Attributes']/../input")
	 private WebElement bcAttributeField;
	 @FindBy(xpath = "//label[text()='Value']/../input")
	 private WebElement bcAttributeValueField;
	 @FindBy(xpath = "//paper-button[contains(.,'Proceed')]")
	 private WebElement ProceedButton;
	 
	 @FindBy(xpath="//paper-button[contains(.,'Target Group')]")
	 private WebElement SelectTargetGroup;
	 @FindBy(xpath="//div[@id='radioContainer']//following::div[contains(.,'No Limit')][@id='radioLabel']")
	 private WebElement NoLimitTGRadiobtn;
	 @FindBy(xpath="(//div[@class='buttons style-scope cvm-settings']//paper-button[contains(.,'Save')])[2]")
	 private WebElement TGSaveButton;
	 @FindBy(xpath="//paper-button[contains(.,'Control Group')]")
	 private WebElement SelectControlGroup;
	 @FindBy(xpath = "//div[@id='radioContainer']//following::div[contains(.,'No Control Group')][@id='radioLabel']")
	 private WebElement NocontrolGroup;
	 @FindBy(xpath="(//div[@class='buttons style-scope cvm-settings']//paper-button[contains(.,'Save')])[1]")
	 private WebElement CGSaveButton;
	 @FindBy(xpath = ".//paper-button[contains(.,'DNC Exclusions')]")
	 private WebElement DNCexclusions;
	 @FindBy(xpath = ".//paper-dialog[@class='style-scope dnc-exclusion x-scope paper-dialog-0']//paper-icon-button[@id='clear']//iron-icon")
	 private WebElement DNCListcloseButton;
	 @FindBy(xpath = ".//label[contains(.,'Track session')]/../input")
	 private WebElement trackSessionSelect;
	 @FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-listbox/paper-item[contains(.,'After')]")
	 private WebElement TrackSessionAfter;
	 @FindBy(xpath = ".//*[@id='offerDetailForm']//paper-input-wrapper//input")
	 private WebElement trackSessionDaysField;
	 @FindBy(xpath = ".//label[contains(.,'Tracking Source')]/../input")
	 private WebElement trackingSource;
	 @FindBy(xpath = ".//label[contains(.,'Sender ID: Broadcast')]/../input")
	 private WebElement senderIdBroadcast;
	 @FindBy(xpath = ".//label[contains(.,'Route over which this broadcast')]/../input")
	 private WebElement routeOverBroadcast;
	 
	 @FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment success or failure message would appear from this ID')]/../input")
	 private WebElement senderIdFulfillment;
	 @FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/../input")
	 private WebElement RouteFulfillment;
	 @FindBy(xpath = "//*[contains(text(),'One-time')]/..")
	 private WebElement oneOffRadiobutton;
	 
	 @FindBy(xpath = "//div[@id='radioLabel'][contains(.,'Never')]")
	 private WebElement neverRadiobutton;
	 @FindBy(xpath = ".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input")
	 private WebElement RecurrencePatternInput;
	 @FindBy(xpath = "//*[contains(@class,'recurrence')]//input")
	 private WebElement RecurrenceInput;
	 @FindBy(xpath = "(//label[contains(.,'Default Start Time')]//following::input)[1]")
	 private WebElement StartBroadcastAtInput;
	 @FindBy(xpath="(//label[contains(.,'Default Start Time')]//following::paper-button[contains(.,'OK')])[2]")
	 private WebElement  startBroadcastOkbutton;
	 @FindBy(xpath = "//div[@id='radioLabel'][contains(.,'At')]")
	 private WebElement atRadiobutton;
	 @FindBy(xpath = "//label[contains(.,'End Date/Time')]//following::input[1]")
	 private WebElement EndDateInput;
	 @FindBy(xpath = "(//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2])[2]")
	 private WebElement dateOkbutton;
	 @FindBy(xpath = "//label[contains(.,'End Date/Time')]//following::input[2]")
	 private WebElement EndTimeInput;
	 @FindBy(xpath = "(.//*[@id='timeDialog']/div/paper-button[2])[2]")
	 private WebElement timeOkbutton;
	 @FindBy(xpath = "//div[@id='radioContainer']//following::div[contains(.,'Fixed percentage')][@id='radioLabel']")
	 private WebElement FixedPercentageOfTargetBase;
	 @FindBy(xpath = "(//input[@id='input'][@type='number'])[1]")
	 private WebElement fixedPercentnumber;
	 
	 @FindBy(xpath = "//div[text()='Define Limit (Fixed)']")
	 private WebElement TGFixedLimitRadio;
	 @FindBy(xpath = ".//paper-radio-group//paper-input-wrapper[@class='define-limit-style style-scope cvm-settings']//input[@id='input']")
	 private WebElement TGLimitField;
	 
	 ///////////////X path for IM Data SetUp  ///////////////////////////////////////
	 
	 @FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Time Interval')]/../..//input")
	 private WebElement TpTimeIntervalSelector;
	 @FindBy(xpath="//vaadin-combo-box-item[contains(.,'Hours')]")
	 private WebElement TpTimeIntervalHours;
	 @FindBy(xpath = "//serving-rule//div[contains(.,'Max. minutes allowed to accept an offer after recommendation')]/../div[2]//div//div[2]//input")
	 private WebElement fieldMinuteToaceptOffer;
	 @FindBy(xpath="//paper-button[contains(.,'Save')]")
	 private WebElement apiSaveButton;
	 @FindBy(xpath = "//paper-button[text()='Create New Group']")
	 private WebElement IpAccessControlNewBTn;
	 @FindBy(xpath = "//label[text()='Name']/../input")
	 private WebElement IPNameField;
	 @FindBy(xpath = "//label[text()='Hosts']/../input")
	 private WebElement IPHostfield;
	 @FindBy(xpath = "//label[text()='Touchpoint Name']/../input")
	 private WebElement IPtouchPointNamefield;
	 @FindBy(xpath = "//label[text()='Authentication Key']/../input")
	 private WebElement BiAuthKeyField;
	 @FindBy(xpath = "//paper-button[text()='Save']")
	 private WebElement IPAccessGroupSaveBtn;
	 @FindBy(xpath = "//label[text()[contains(.,'Offer Catalog')]]/../input")
	 private WebElement programCatalogField;
	 @FindBy(xpath = ".//*[@id='topBar']/paper-button[contains(.,'Proceed')]")
	 private WebElement programProceedBtn;
	 
	 @FindBy(xpath = "//paper-button[contains(.,'Add Touchpoint')]")
	 private WebElement addTouchPointButton;
	 @FindBy(xpath = "//form[@id='addTouchpointForm']//label[text()='Touchpoint']/..//*[@id='input']")
	 private WebElement touchPointField;
	 @FindBy(xpath="//*[@id='addTouchpointForm']//paper-button[text()='Save']")
	 private WebElement addtouchpointSaveBtn;
	 @FindBy(xpath = "//form[@id='scheduleForm']//label[text()='Start Date']/..//*[@id='input']")
	 private WebElement programStartDate;
	 @FindBy(xpath = "//label[contains(.,'End Date')]/../input")
	 private WebElement programEndField;
	 
	 @FindBy(xpath = "//label[contains(.,'End Date/Time')]//..//input")
	 private WebElement endDateCalenderIn;
	 
	 @FindBy(xpath = "//form[@id='scheduleForm']//label[text()='Refresh Cycle']/..//*[@id='input']")
	 private WebElement refreshCycleIn;
	 @FindBy(xpath = "//form[@id='scheduleForm']//label[text()='Every']/..//*[@id='input']")
	 private WebElement refreshEveryPgm;
	 @FindBy(xpath = "//form[@id='scheduleForm']//label[text()='Refresh At']/..//*[@id='input']")
	 private WebElement refreshAtPgm;
	 
	 @FindBy(xpath = "//label[text()='Time Zone']/../input")
	 private WebElement timeZonePgmField;
	 @FindBy(xpath="//paper-button[contains(.,'Activate')]")
	 private WebElement programActivatebutton;
	 @FindBy(xpath="//paper-dialog[@id='confirmActivate']//paper-button[text()='Yes']")
	 private WebElement programConfirmActivateYesBtn;
	 
	 @FindBy(xpath = "//data-table-row[@id='item1']//data-table-cell[8]//paper-item[contains(.,'View Rules')]")
	 private WebElement programViewRules;
	
	 ///////////////////:::::::X path for Rule ////////////////////////////////////
	 @FindBy(xpath = "//paper-dialog[@id='view']//label[contains(.,'Rule Name')]//..//input")
	 private WebElement ruleNameField;
	 @FindBy(xpath = "//label[contains(.,'Customer List')]/../input")
	 private WebElement ruleCustomerListField;
	 
	 @FindBy(xpath = ".//*[@id='topBar']/paper-button[contains(.,'Proceed')]")
	 private WebElement programProceedButton;
	 
	 @FindBy(xpath = "//label[contains(.,'Product')]//following::input[1]")
	 private WebElement programProductfield;
	 @FindBy(xpath = "//form//div[2]//paper-radio-button[@name='unlimited']//div[@id='radioContainer']")
	 private WebElement ruleUnlimitedRecmndLimitRadio;
	 
	 @FindBy(xpath = "//form//div[4]//paper-radio-button[@name='unlimited']//div[@id='radioContainer']")
	 private WebElement ruleUnlimitedAceptRadio;
	 @FindBy(xpath = "//div[contains(.,'Recommendation Limit')]/paper-icon-button[@role='button']/iron-icon[@id='icon']")
	 private WebElement ruleTimingsPencil;
	 @FindBy(xpath = "//label[text()='Recommendation timeout (in hours)']/../input")
	 private WebElement recomendTimeOutField;
	 @FindBy(xpath = "//label[text()='Acceptance timeout (in hours)']/../input")
	 private WebElement acceptTimeOutFieled;
	 @FindBy(xpath = "//label[text()='Conversion timeout (in hours)']/../input")
	 private WebElement conversionTimeOutField;
	 @FindBy(xpath = "//label[text()='Decline timeout (in hours)']/../input")
	 private WebElement declineTimeOutField;
	 @FindBy(xpath = "//label[text()='Maybe later timeout (in hours)']/../input")
	 private WebElement maybeLaterTimeOutField;
	 @FindBy(xpath = "//div[@class='buttons style-scope set-product-limits']//paper-button[text()='Save']")
	 private WebElement ruleTimeOutsSaveButton;
	 
	 @FindBy(xpath = "//h5[text()='Tracking expires']/../div[1]//div[1]//vaadin-combo-box//div[2]//div[1]/input")
	 private WebElement TrackingexpiresField;
	 @FindBy(xpath = "//div[@id='items']/vaadin-combo-box-item[contains(.,'After')]//following::label[1]//..//input")
	 private WebElement ruleExpiresValueField;
	 @FindBy(xpath = "//div[@id='items']/vaadin-combo-box-item[contains(.,'After')]//following::label[2]//..//input")
	 private WebElement ruleExpireHourOrDaysField;
	 @FindBy(xpath = "//rule-tracking//label[text()='Time Zone']/../input")
	 private WebElement timeZoneFieldRuleDelTab;
	 
	 @FindBy(xpath = "//label[text()='Sender ID: Fulfillment success or failure message would appear from this ID']/../input")
	 private WebElement senderIDruleIM;
	 @FindBy(xpath = "//label[text()='Route over which Fulfillment success or failure confirmation message can be sent']/../input")
	 private WebElement routeOverRuleIM;
	 @FindBy(xpath = "(//label[text()='Time Zone']/../input)[2]")
	 private WebElement ruleTimezoneField;
	 
	 
	 //x path for Record Conversions for Seeding Reward check box
	 @FindBy(xpath ="//div[text()='Record Conversions for Seeding Reward']/../div[1]")
	 private WebElement ConvForSeedBcCheckBox;
	 
	 
	 
	
	public BiDataObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickCreateNewSegment() throws Exception
	{
		jswait.loadClick(createNewSegmentButton);
	}
	
	public void createSegment(String segmentName) throws Exception {
		jswait.loadSendKeys(segmentNameField, segmentName);
		jswait.loadSendKeys(segmentDescriptionField, "Segment By seleniumBI");
		jswait.loadSendKeys(listSelectorField, "selenium_BiList");
		jswait.loadClick("//paper-dialog[@id='predefinedwin']//paper-item[contains(.,'selenium_BiList')]");
		// Segment condition selecting
		jswait.loadClick(targetConditionTypeSelector);
		jswait.loadClick(CustomerList);
		jswait.loadSendKeys(List, "selenium_BiList");
		jswait.loadClick(customerlistName);
		jswait.loadClick(conditionClick);
		jswait.loadClick("//paper-item[contains(.,'is subscribed')]");
		jswait.loadClick(".//*[@id='conditionCard']/paper-button[@id='saveButton']");
		jswait.loadClick(segmentSaveButton);

	}

	public void inputNameAndLabel(String name,String label)throws Exception
	{
		Thread.sleep(1000);
		jswait.loadSendKeys("//paper-dialog[@id='columnDialog']//label[text()='Name']/../input", name);
		Thread.sleep(1000);
		jswait.loadSendKeys("//paper-dialog[@id='columnDialog']//label[text()='Label']/../input", label);	
	}

	public void selectAtributeNumber() throws Exception {
		jswait.loadClick("//paper-dialog[@id='columnDialog']//label[text()='Type']/../input");
		Thread.sleep(2000);
		jswait.loadClick("//paper-listbox//paper-item[text()='Number']");
		Thread.sleep(1000);
		jswait.loadClick("//paper-button[text()='Save']");
	}
	
	public void createCampaignAttribute(String atbtName, String label) throws Exception {
		jswait.loadClick(newCamAtbtn);
		Thread.sleep(1000);
		inputNameAndLabel(atbtName, label);
		selectAtributeNumber();

	}

	public void inputNameLabelforOfferAtbt(String name, String label) throws Exception {
		Thread.sleep(1000);
		jswait.loadSendKeys("//paper-dialog[@id='createNew']//label[text()='Name']/../input", name);
		Thread.sleep(1000);
		jswait.loadSendKeys("//paper-dialog[@id='createNew']//label[text()='Label']/../input", label);

	}

	public void selectTypeNumber() throws Exception {
		jswait.loadClick("//paper-dialog[@id='createNew']//label[text()='Type']/../input");
		Thread.sleep(2000);
		jswait.loadClick("//paper-listbox//paper-item[text()='Number']");
		Thread.sleep(1000);
		jswait.loadClick("//paper-button[text()='Save']");

	}

	public void createOfferAttribute(String atbtName, String label) throws Exception {
		jswait.loadClick(newOffAtbtn);
		Thread.sleep(1000);
		inputNameLabelforOfferAtbt(atbtName, label);
		selectTypeNumber();
		Thread.sleep(1000);

	}

	public void createBroadcastAttribute(String name, String label) throws Exception {
		jswait.loadClick(newBroadcastAtbtn);
		Thread.sleep(1000);
		inputNameAndLabel(name, label);
		selectAtributeNumber();

	}
	
	
//********Methods for Offer Creation
	public void includeOfferAttribute(String val) throws Exception {
		jswait.loadClick(offerAttributeAddBtn);
		jswait.loadClick(attributefield);
		jswait.loadClick("//paper-item[text()='SelOfferAttribute']");
		jswait.loadSendKeys(offerttributeValfield, val);

	}

	public void selectRuleforOffer() throws Exception {
		offerPageObjects.clickAddRuleButton();
		Thread.sleep(2000);
		offerPageObjects.enterRuleName("rule1");
		offerPageObjects.selectPriority("2");
		offerPageObjects.createTrackRuleCondition();
		jswait.loadClick(offerRuleSaveBtn);

	}
	
	public void selectRewards(String offerType,String rewardName)throws Exception
	{
		if(offerType.equalsIgnoreCase("Seeding"))
		{
			System.out.println("******Seeding Offer *********");
			jswait.loadClick(Rule1AddBtn);
			jswait.loadClick(Rule1Inputfield);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+rewardName+"')]");
			offerPageObjects.enterSuccessMessage("Default Reward Success from Selenium");
			offerPageObjects.enterFailureMessage("Default Reward Failure from Selenium");
			jswait.loadClick(seedRewardField);
			jswait.loadSendKeys(seedRewardField, rewardName);
			jswait.loadClick("//seeding-reward//add-seeding-reward//label[contains(.,'Reward Type')]//following::vaadin-combo-box-item[contains(.,'"+rewardName+"')]");
			
			
		}
		else
		{
			jswait.loadClick(Rule1AddBtn);
			jswait.loadClick(Rule1Inputfield);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+rewardName+"')]");	
			offerPageObjects.enterSuccessMessage("Default Reward Success from Selenium");
			offerPageObjects.enterFailureMessage("Default Reward Failure from Selenium");
		}
		
	}
	
	
	public void createOfferforBI(String offerSheet,String productSheet,String rewardName,String attributeVal)throws Exception
	{
		String offerName;
		excel.setExcelFile("biDataSetup", offerSheet);
		offerName=(String) excel.getCell(1,0);
		offerName=RandomNameGenerator.getRandomName(offerName);
		excel.setCell(1, 0, offerName);
		System.out.println("****"+offerName);
		
		offerPageObjects.clickCreateNewOfferButton();
		Thread.sleep(4000);

		//////*************Offer Details Tab ***************************///////////////////////////////
		
		offerPageObjects.enterOfferName(offerName);
		offerPageObjects.enterOfferDescription((String) excel.getCell(1, 1));
		String offerType=excel.getCellByColumnName("Offer Type");
		offerPageObjects.selectOfferType(offerType);
		offerPageObjects.selectOfferChannel("SMS");
		offerPageObjects.selectOfferCategory("Recharge offer");
		 includeOfferAttribute(attributeVal);
		 offerPageObjects.clickProceedButton();
		 
		 //////**********Products Tab *****************/////////////////////////////////////////////
		 Thread.sleep(4000);
		 offerPageObjects.enterProductTabFields(productSheet);
		 offerPageObjects.clickProceedButton();
		 /////***************Creative Tab *********************////////////////////////////////////////
		 Thread.sleep(3000);
		 offerPageObjects.selectCreativeLanguageEnglish();
		 offerPageObjects.enterSmsCreative("Hai","cucumber");
		 offerPageObjects.clickProceedButton();
			Thread.sleep(4000);
		////*************** Track  Tab *************////////////////////////////////
		 offerPageObjects.clickTrackSourceSelector();
		 offerPageObjects.selectTrackSource(TRACK_SOURCE);
		 Thread.sleep(1000);
		 selectRuleforOffer();
		 offerPageObjects.clickProceedButton();
		 Thread.sleep(4000);
		 /////////********* Rewards Tab**************************///////////////////////////////////////
		 selectRewards(offerType,rewardName);
		 offerPageObjects.clickSaveOfferButton();
	}
	
	public void createOfferCatalog(String name) throws Exception {
		jswait.loadClick(CreateNewCatalogButton);
		Thread.sleep(2000);
		jswait.loadSendKeys(CatalogName, name);
		Thread.sleep(1000);
		jswait.loadSendKeys(CatalogDescription, "Selenium Created");
		Thread.sleep(2000);
		jswait.loadClick(CatalogSaveButton);

	}
	
	public void addOfferTocatalog(String offerName) throws Exception {
		Thread.sleep(3000);
		jswait.loadClick(CatalogAddOffer);
		commonObjects.filterName(offerName);
		jswait.loadClick("//data-table-cell[contains(.,'" + offerName + "')]");
		Thread.sleep(1000);
		jswait.loadClick(AddToCatalogButton);
		Thread.sleep(1000);
		System.out.println("Added Offer::" + offerName);

	}

	public void selectTargetCondition() throws Exception {
		jswait.loadClick(CreateConditionButton);
		jswait.loadClick(targetConditionTypeSelector);
		jswait.loadClick("//paper-item[contains(.,'Customer Lists')]");
		jswait.loadSendKeys(campListfield, "selenium_BiList");
		jswait.loadClick("//paper-item[contains(.,'selenium_BiList')]");
		jswait.loadClick(campaignListCondition);
		jswait.loadClick("//paper-item[text()='is subscribed']");
		jswait.loadClick("//paper-card[@id='conditionCard']//paper-button[text()='Save']");

	}
	public void enterCampaignAttribute(String atbtValue) throws Exception {
		jswait.loadClick(camAtbtAddButton);
		Thread.sleep(1000);
		jswait.loadClick(campAtbtField);
		jswait.loadClick("//paper-item[contains(.,'selCamAtbt')]");
		jswait.loadSendKeys(camAtbtValueField, atbtValue);
		

	}
	
	public void selectCampaignDateAndTime()throws Exception
	{
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//campaign-schedule//paper-input-container)[2]//input"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
    	 
    	 
    	 
	}

	public void createCampaign(String campaignName, String catalogName, String atbtValue) throws Exception {
		campaignObjects.clickCreateNewCampaignButton();
		Thread.sleep(5000);
		campaignObjects.enterCampaignDeails(campaignName, catalogName);
		enterCampaignAttribute(atbtValue);
		campaignObjects.clickProceedButton();
		Thread.sleep(3000);
		selectTargetCondition();
		campaignObjects.clickProceedButton();
		Thread.sleep(3000);
		selectCampaignDateAndTime();
		Thread.sleep(2000);
		campaignObjects.clickSaveCampaignButton();
		Thread.sleep(3000);
	}
	
	public void selectAttributeforBc(String atbtValue)throws Exception
	{
		jswait.loadClick(bcAttributeAdd);
		jswait.loadClick(bcAttributeField);
		jswait.loadClick("//paper-item[contains(.,'selBcAtbt')]");
		jswait.loadSendKeys(bcAttributeValueField, atbtValue);
		
		
	}
	public void clickProceedButton() throws Exception
	{
		jswait.loadClick(ProceedButton);
	}

	public void inputDetailsTabOfBc(String bcName, String inventory, String atbtValue, String triger) throws Exception {
		Thread.sleep(2000);
		jswait.loadSendKeys(BroadcastName, bcName);
		jswait.loadSendKeys(BroadcastPurpose, "forBiReportRegression");
		jswait.loadClick(LabelSelector);
		jswait.loadClick(LabelCrossell);
		System.out.println("trigger::" + triger);
		jswait.loadSendKeys(InventorySelector, inventory);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + inventory + "')]");
		selectAttributeforBc(atbtValue);
		clickProceedButton();

	}
	
	public void Target_Group(String TG) throws Exception {
		jswait.loadClick(SelectTargetGroup);
		if (TG.equalsIgnoreCase("none")) {
			jswait.loadClick(NoLimitTGRadiobtn);
		} else {
			jswait.loadClick(TGFixedLimitRadio);
			jswait.loadSendKeys(TGLimitField, TG);

		}
		jswait.loadClick(TGSaveButton);
	}
	public void Control_Group(String CG)throws Exception
	{
		jswait.loadClick(SelectControlGroup);
		if (CG.equalsIgnoreCase("none")) {
			jswait.loadClick(NocontrolGroup);
		} else {
			System.out.println("Selected Control Group:: " + CG);
			jswait.loadClick(FixedPercentageOfTargetBase);
			jswait.loadSendKeys(fixedPercentnumber, CG);

		}
		jswait.loadClick(CGSaveButton);
	}
	public void select_DNC(String DNC)throws Exception
	{    Thread.sleep(2000);
		jswait.loadClick(DNCexclusions);
		Thread.sleep(3000);
		List<WebElement> removeButton=driver.findElements(By.xpath("//iron-data-table//iron-icon[@icon='icons:remove-circle']"));
		System.out.println("DNC_List_Counts::"+removeButton.size());
		for (WebElement remove : removeButton) {
			Thread.sleep(3000);
			jswait.loadClick("//iron-icon[@title='Remove']");

		}
		jswait.loadClick(DNCListcloseButton);
	}

	public void inputTargetTab(String customerList,String TG,String CG,String DNC) throws Exception
	{
		Thread.sleep(2000);
		broadcastPageObjects.selectBaseList(customerList);
		Thread.sleep(10000);
		jswait.loadClick("//div[@id='radioContainer']//following::div[contains(.,'None')]");
		Thread.sleep(8000);
		Target_Group(TG);
		Control_Group(CG);
		select_DNC(DNC);
		clickProceedButton();	
	}
	
	public void SelectTrackSession()throws Exception {
		jswait.loadClick(trackSessionSelect);
		jswait.loadClick(TrackSessionAfter);
		jswait.loadSendKeys(trackSessionDaysField, "2");
	}
	
	public void selectTrackSource() throws Exception {
		jswait.loadSendKeys(trackingSource, TRACK_SOURCE);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + TRACK_SOURCE + "')]");
	}
	public void select_SenderAndRoute()throws Exception
	{
		jswait.loadSendKeys(senderIdBroadcast, SENDER_SMPP);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" +SENDER_SMPP+ "')]");
		Thread.sleep(2000);
		jswait.loadSendKeys(routeOverBroadcast, ROUTE_SMPP);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + ROUTE_SMPP + "')]");
		Thread.sleep(2000);
		jswait.loadSendKeys(senderIdFulfillment,  SENDER_SMPP);
		Thread.sleep(2000);
		jswait.loadClick(".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"
			+ SENDER_SMPP + "')]");
		Thread.sleep(2000);
		jswait.loadSendKeys(RouteFulfillment, ROUTE_SMPP);
		Thread.sleep(3000);
		jswait.loadClick(".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]");
		Thread.sleep(2000);
	}
	
	public void inputOfferTab(String offerName, String filterCriteria, String giveRewardsTo,String offerSheet) throws Exception {
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
		Thread.sleep(2000);
		SelectTrackSession();
		selectTrackSource();
		if (offerSheet.equals("biSeedOffer")) {
			jswait.loadClick(ConvForSeedBcCheckBox);
			System.out.println("::Included Conversion for Rewarding Bc :: for Seeding BC");
		}
		jswait.loadClick("//div[text()='Rule-based']/../div[1]");
		select_SenderAndRoute();
		clickProceedButton();
	}
	
	public void clickOneOffRadioButton()throws Exception
	{
		jswait.loadClick(oneOffRadiobutton);
	}
	
	public void oneOffBcDeliverTab(String bcSheet)throws Exception
	{
		System.out.println("::inside oneOffBc Deliver Tab::");
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		 if(min==0)
			{
				min+=5;
			}
			
	//Getting send Time for Storing in sheet 	
		 ex.setExcelFile("biDataSetup", bcSheet);
		 String Start_Date="";

			String monthString = calender.getMonthForInt(rightNow.get(Calendar.MONTH));

			Start_Date = String.format("%02d", day) + " " + monthString.substring(0, 3) + " " + year;

			System.out.println("Bc_Send Date ::" + Start_Date);
			ex.setCell(1, 3, Start_Date);
			System.out.println("Bc_Send Year Date -:: "+date);
			ex.setCell(1, 4, date);
			System.out.println(":::- Successfully Stored in Sheet  ");
		 
	//send Time ///////////////////	 
			
		 Actions builder = new Actions(driver);
		 Thread.sleep(5000);
		 
		 clickOneOffRadioButton();
		 Thread.sleep(1000);
		 jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
		 //Input Send Time :::::::://// 	 
		 Thread.sleep(2000);
		 
		 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");
			
			
			
			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			//Selected Date and time for SendTime ::::::::::::////
			
			//Selecting Target Render Time :::///////////////////////
			jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(3000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
			Thread.sleep(2000);
			num = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(1000);
			
			
			WebElement num2 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0) {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
				builder.moveToElement(num1).click().build().perform();

			} else {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
				builder.moveToElement(num1).click().build().perform();
			}

			
			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(2000);
	//Selecting Time Zone:: ***********/////////////////////
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);				
		 
	}
	
	
	public void recuringBcDeliverTab(String bcSheet,String endType)throws Exception
	{
		System.out.println(":::::::::::::::::INSIDE RECURRING BROADCAST DELIVER TAB :::::::::::::::::::::::::::::");
		Thread.sleep(5000);
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
		Thread.sleep(1000);
		jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
		
		Actions builder =new Actions(driver);
		
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		String date2= Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH)+2);
		String date1= Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH)+1);
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		 if(min==0)
			{
				min+=5;
			}
		
		//For storing to Excel sheet Start date
		String start_Date;
		String monthString = calender.getMonthForInt(rightNow.get(Calendar.MONTH));
		start_Date = String.format("%02d", day) + " " + monthString.substring(0, 3) + " " + year;
		System.out.println(" Recurring Broadcast Start Date::::: "+start_Date);
		
		 ex.setExcelFile("biDataSetup", bcSheet);
		 ex.setCell(1, 3, start_Date);
		 System.out.println("Recurring Broadcast Start year Date: "+date);
		 ex.setCell(1, 4,date);
		 System.out.println("::- Successfully stored in sheet");
		
		
		////:::::::::::::Selecting Start Date and Time  ::::::::::::::::::::
		
		jswait.loadClick(".//*[@id='months']//div[@date='" + date + "']");	
		jswait.loadClick("//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
		
		Thread.sleep(2000);
		jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
		Thread.sleep(2000);
		jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
		Thread.sleep(3000);
		WebElement num = driver.findElement(By.xpath(
				".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
						+ (hours + 1) + "]"));
		Thread.sleep(2000);
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
		WebElement num1 = driver.findElement(By.xpath(
				".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
						+ (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();
		Thread.sleep(1000);
		
		WebElement seconds=driver.findElement(By.xpath(".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='secondClock']//*[@class='number style-scope paper-clock-selector'][1]"));
		builder.moveToElement(seconds).click().build().perform();
		Thread.sleep(1000);
		
		if (am_pm == 0)
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
		
		else
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
		Thread.sleep(1000);
		
		
		num1 = driver.findElement(By.xpath(
				".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
		builder.moveToElement(num1).click().build().perform();
		
		
		
		///Selected Start  Time and Date++++++++++++///////////////////////////////////
		
		if(endType.equalsIgnoreCase("none"))
		{
			System.out.println(":::::::::End type Selected Is Never  ++++");
			jswait.loadClick(neverRadiobutton);
			
			Thread.sleep(2000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			
			select_Recurrence_Pattern();
			Thread.sleep(2000);
			
			//::::::::::::::::::::::::::::Selecting Time for Start Broadcast At ::::::::::::::::
			jswait.loadClick(StartBroadcastAtInput);
			Thread.sleep(3000);
			
			WebElement num2 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[2]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(2000);
			
			WebElement num3 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "])[2]"));
			Thread.sleep(3000);
			builder.moveToElement(num3).click().build().perform();
			Thread.sleep(3000);
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");
			
			
			jswait.loadClick(startBroadcastOkbutton);
			
		
		}
		else if(endType.equalsIgnoreCase("At"))
		{
			System.out.println("++++++++++++==End Type Selected as At==========+++++++++");
			Thread.sleep(2000);
			jswait.loadClick(atRadiobutton);
			//Selecting End Date ::::::::::::///////////////
			Thread.sleep(2000);
			jswait.loadClick(EndDateInput);

			Thread.sleep(2000);
			jswait.loadClick("(.//*[@id='months']//div[@date=('"+date1+"')])[2]");
			jswait.loadClick(dateOkbutton);
			/////////////////Finished Selected Date to End /////////////////
			Thread.sleep(2000);
			//Selecting End Time ::::::::::::////////////////////
			jswait.loadClick(EndTimeInput);
			Thread.sleep(2000);
			
			WebElement num6 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[2]"));
			builder.moveToElement(num6).click().build().perform();
			Thread.sleep(2000);
			WebElement num7 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "])[2]"));
			Thread.sleep(1000);
			builder.moveToElement(num7).click().build().perform();
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");

			
			jswait.loadClick(timeOkbutton);
			
			
			//Selecting Time Range:::::::::::::;
			Thread.sleep(2000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			
			////:::::::::::: Setting , Recurrence Pattern and Delivery:::::::::::::///////////////
			select_Recurrence_Pattern();
			Thread.sleep(2000);
			
			//::::::::::::::::::::::::::::Selecting Time for Start Broadcast At ::::::::::::::::
			jswait.loadClick(StartBroadcastAtInput);
			Thread.sleep(3000);
			
			WebElement num2 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[3]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(2000);
			
			WebElement num3 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "])[3]"));
			Thread.sleep(3000);
			builder.moveToElement(num3).click().build().perform();
			Thread.sleep(3000);
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[3]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[3]");
			
			
			jswait.loadClick(startBroadcastOkbutton);
			
			
		}	
		
		
	}
	
	
	public void select_Recurrence_Pattern() throws Exception {
		jswait.loadClick(RecurrencePatternInput);
		Thread.sleep(1000);
		jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
		Thread.sleep(1000);
		jswait.loadSendKeys(RecurrenceInput, "1");

	}
	
//////////////////////////////////////////Intent Management Data SetUp //////////////////////////////////////////////
	
	public void selectTimeIntervalHours() throws Exception {
		jswait.loadClick(TpTimeIntervalSelector);
		Thread.sleep(2000);
		jswait.loadClick(TpTimeIntervalHours);

	}
	
	public void selectAcceptMinRecomndation()throws Exception
	{
		jswait.clearTextField(fieldMinuteToaceptOffer);
		jswait.loadSendKeys(fieldMinuteToaceptOffer, "45");
		
	}
	
	public void createApiTouchpoint(String tpName,String prioLogic)throws Exception
	{
		touchpointPage.clickCreateNewTouchpoint();
		Thread.sleep(3000);
		touchpointPage.apiEnterTouchpointName(tpName);
		Thread.sleep(2000);
		touchpointPage.apiSelectApplicationTypeGeneral();
		Thread.sleep(2000);

		touchpointPage.apiSelectEventForTrackingAccepted();
		selectAcceptMinRecomndation();

		touchpointPage.apiEnterRefreshEvery("3");
		selectTimeIntervalHours();
	
		if (prioLogic.equalsIgnoreCase("LIFO")) {
			touchpointPage.apiSelectPrioritizationLogicLifo();
		} else if (prioLogic.equalsIgnoreCase("FIFO")) {
			touchpointPage.apiSelectPrioritizationLogicFifo();
		}
		
		touchpointPage.apiEnterMaximumOffers("3");
		Thread.sleep(2000);
		jswait.loadClick(apiSaveButton);
		
	}
	
 
	public void createGroupforAPIinIpAccessControl(String touchPointName,String authKey) throws Exception
	{
		jswait.loadClick("//div[text()='API']");
		Thread.sleep(1000);
		jswait.loadClick(IpAccessControlNewBTn);
		jswait.loadSendKeys(IPNameField,"BiSelenium");
		jswait.loadSendKeys(IPHostfield, "*");
		jswait.loadSendKeys(IPtouchPointNamefield, touchPointName);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+touchPointName+"')]");
		jswait.loadSendKeys(BiAuthKeyField, authKey);
		jswait.loadClick(IPAccessGroupSaveBtn);
		Thread.sleep(2000);
	}
	
	public void clickProgramProceedButton() throws Exception {
		jswait.loadClick(programProceedBtn);
	}
	
	public void inputDetailsTabOfProgram(String programName, String catalogName) throws Exception {
		Thread.sleep(4000);
		programPage.enterProgramName(programName);
		programPage.enterProgramDescription();
		jswait.loadSendKeys(programCatalogField, catalogName);
		Thread.sleep(4000);
		jswait.loadClick(".//*[@id='items']/vaadin-combo-box-item[contains(.,'" + catalogName + "')]");
		Thread.sleep(2000);
		clickProgramProceedButton();
	}
	
	public void clickADDTouchPoint() throws Exception {
		jswait.loadClick(addTouchPointButton);
	}
	
	public void inputTouchpointTabOfProgram(String touchPointName) throws Exception {
		Thread.sleep(3000);
		clickADDTouchPoint();
		programPage.addTouchPointSelectApiChannel();
		// jswait.loadClick(touchPointField);
		Thread.sleep(1000);
		jswait.loadSendKeys(touchPointField, touchPointName);
		jswait.loadClick("//*[@id='items']/vaadin-combo-box-item[contains(.,'" + touchPointName + "')]");
		Thread.sleep(2000);
		programPage.addTouchPointSelectApiResponseChannel();
		Thread.sleep(2000);
		jswait.loadClick(addtouchpointSaveBtn);
		clickProgramProceedButton();
	}

	
	
	public void selectProgramStartDate(String startDate) throws Exception {
		jswait.loadClick(programStartDate);
		Thread.sleep(1000);
		if (startDate.equalsIgnoreCase("Now")) {
			jswait.loadClick("//paper-item[contains(.,'Now')]");
		} else if (startDate.equalsIgnoreCase("At")) {
			jswait.loadClick("//paper-item[contains(.,'At')]");
		}
	}
	
	public void selectProgramEndDate(String endDate)throws Exception
	{
		jswait.loadClick(programEndField);
		if (endDate.equalsIgnoreCase("NoEnd")||endDate.equalsIgnoreCase("No End")) {
			jswait.loadClick("//paper-item[@val='NOEND']");
		}
		else if(endDate.equalsIgnoreCase("At"))
		{
			jswait.loadClick("//paper-card//div[2]//form//div[2]//paper-item[@val='AT']");
			selectEndDate_Program();
		}
	}
	
	
	public void selectEndDate_Program() throws Exception {
		Calendar rightNow =Calendar.getInstance();
    	String mn = "";
    	if(rightNow.get(Calendar.MONTH)+1<=9) {
    		mn = "0"+Integer.toString(rightNow.get(Calendar.MONTH)+1);
    	}
    	else 
    		mn = Integer.toString(rightNow.get(Calendar.MONTH)+1);
		jswait.loadClick(endDateCalenderIn);
		
		String date = Integer.toString(rightNow.get(Calendar.YEAR))+"-"+mn+"-"+String.format("%02d",rightNow.get(Calendar.DAY_OF_MONTH)+1);
		Thread.sleep(2000);
		jswait.loadClick("//label[contains(.,'End Date/Time')]//following::div[@id='months'][1]//div[@date='" + date + "']");
		Thread.sleep(2000);
		jswait.loadClick("//label[contains(.,'End Date/Time')]//following::paper-button[contains(.,'OK')][1]");		
	}
	
	
	public void selectRefreshCycle(String cycle) throws Exception {
		jswait.loadClick(refreshCycleIn);
		Thread.sleep(2000);
		if (cycle.equalsIgnoreCase("Days")) {
			jswait.loadClick("//paper-item[contains(.,'Days')]");
		} else if (cycle.equalsIgnoreCase("Weeks")) {
			jswait.loadClick("//paper-item[contains(.,'Weeks')]");
		}
	}
	
	public void selectRefresh_Time_Program(String endDate)throws Exception
	{
		jswait.loadClick(refreshAtPgm);
		Thread.sleep(2000);
		
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		Actions builder = new Actions(driver);
		Thread.sleep(4000);
		
		
		if (endDate.equalsIgnoreCase("NoEnd")||endDate.equalsIgnoreCase("No End")) {
			
			System.out.println(":::::::No End Selected :::::");
			Thread.sleep(2000);
			WebElement num = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours+1) + "])[1]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(4000);

			WebElement num1 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min+1) + "])[1]"));
			Thread.sleep(1000);
	    	 builder.moveToElement(num1).click().build().perform();
				if (am_pm == 0)
					jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[1]");
				else
					jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[1]");
	      	
			jswait.loadClick("(//paper-button[contains(.,'OK')])[2]");
			
		}
		else if(endDate.equalsIgnoreCase("At"))
		{
			System.out.println(":::End After 2 days :::");
			Thread.sleep(2000);
			WebElement num = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours+1) + "])[2]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(4000);

			WebElement num1 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min+1) + "])[2]"));
			Thread.sleep(1000);
	    	 builder.moveToElement(num1).click().build().perform();
	      	if(am_pm==0)
	      	  jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
	       else
	      	  jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");
			
	      	Thread.sleep(2000);
	      	jswait.loadClick("(//paper-button[contains(.,'OK')])[4]");
			
		}
          
		
		
	}
	
	public void selectTimeZone_Program() throws Exception {
		jswait.loadSendKeys(timeZonePgmField, "(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi')]");
	}
	
	
	public void inputScheduleTabOfProgram(String startDate, String endDate, String cycle) throws Exception {
		Thread.sleep(3000);
		selectProgramStartDate(startDate);
		Thread.sleep(2000);
		selectProgramEndDate(endDate);
		Thread.sleep(1000);
		selectRefreshCycle(cycle);
		Thread.sleep(2000);
		jswait.loadSendKeys(refreshEveryPgm,"1");
		Thread.sleep(1000);
		selectRefresh_Time_Program(endDate);
		jswait.loadClick("//div[text()='On All Days']");
		Thread.sleep(1000);
		selectTimeZone_Program();
		jswait.loadClick(programActivatebutton);
		Thread.sleep(2000);
		jswait.loadClick(programConfirmActivateYesBtn);
	}
	
	public void clickProgramProceed_Button() throws Exception {
		jswait.loadClick(programProceedButton);
		 Thread.sleep(2000);
	}
	
	public void click_ProgramViewRules()throws Exception
	{
		jswait.loadClick(programViewRules);
	}
	
	public void selectCustomerListInRule(String customerList)throws Exception
	{
	  jswait.loadSendKeys(ruleCustomerListField, customerList);	
	  Thread.sleep(8000);
	  jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+customerList+"')][1]");
	  Thread.sleep(2000);
	  jswait.loadClick("//div[text()='None']");
	  Thread.sleep(1000);
	}
	public void input_Target_Tab_For_Rule(String ruleName) throws Exception {
		Thread.sleep(2000);
		jswait.clearTextField(ruleNameField);
		Thread.sleep(1000);
		jswait.loadSendKeys(ruleNameField, ruleName);
		Thread.sleep(2000);
		jswait.loadClick("//paper-button[text()='Save']");
		Thread.sleep(4000);
		selectCustomerListInRule("selenium_BiList");
		clickProgramProceed_Button();
		Thread.sleep(4000);
	}
	
	public void selectProduct_forProgram(String productSheet) throws Exception {
		excel.setExcelFile("productInputData", productSheet);
		String productName = (String) excel.getCell(1, 0);
		jswait.loadSendKeys(programProductfield, productName);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + productName + "')]");
		Thread.sleep(1000);
	}
	
	public void select_RecomndAndAcceptLimit(String recomendlimit, String acceptLimit) throws Exception {
		jswait.loadClick(ruleTimingsPencil);
		Thread.sleep(1000);
		if (recomendlimit.equalsIgnoreCase("Unlimited")) {
			jswait.loadClick(ruleUnlimitedRecmndLimitRadio);
		}

		if (acceptLimit.equalsIgnoreCase("Unlimited")) {
			jswait.loadClick(ruleUnlimitedAceptRadio);
		}

	}
	
	public void select_AllTimeOuts(String recomendTimeOut,String acceptTimeOut, String conversionTimeOut,String declineTimeOut,String laterTimeOut)throws Exception
	{
		jswait.loadSendKeys(recomendTimeOutField, recomendTimeOut);
		jswait.loadSendKeys(acceptTimeOutFieled, acceptTimeOut);
		jswait.loadSendKeys(conversionTimeOutField,conversionTimeOut);
		jswait.loadSendKeys(declineTimeOutField,declineTimeOut);
		jswait.loadSendKeys(maybeLaterTimeOutField,laterTimeOut);
		jswait.loadClick(ruleTimeOutsSaveButton);
	}
	
	public void select_Offer_for_IMrule(String offerName) throws Exception {
		jswait.loadClick("//paper-button[contains(.,'Select Offer')]");
		Thread.sleep(2000);
		jswait.loadClick("//h4[contains(.,'" + offerName + "')]");
		Thread.sleep(1000);
		jswait.loadClick("//paper-button[contains(.,'Done')]");
		//Skipping Additional Information Tab and Moving forward
		clickProgramProceed_Button();
		clickProgramProceed_Button();
		Thread.sleep(2000);
	}

	public void selectTimeZoneForRuleIM() throws Exception {
		jswait.clearTextField(timeZoneFieldRuleDelTab);
		Thread.sleep(1000);
        jswait.loadSendKeys(timeZoneFieldRuleDelTab,"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi");
        Thread.sleep(1000);
        jswait.loadClick("//vaadin-combo-box-item[contains(.,'(GMT+05:30) Chennai')]");
	}
	
	public void selectSenderID_and_Route_forIMRule()throws Exception
	{
		jswait.loadSendKeys(senderIDruleIM,SENDER_SMPP);
		Thread.sleep(1000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]");
		jswait.loadSendKeys(routeOverRuleIM,ROUTE_SMPP);
		Thread.sleep(1000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]");
		Thread.sleep(1000);
	}
	
	public void inputDeliveryTabOfIMRule(String expire, String count, String dayHour) throws Exception {
		jswait.loadClick(TrackingexpiresField);
		Thread.sleep(1000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + expire + "')]");
		jswait.loadSendKeys(ruleExpiresValueField, count);
		jswait.loadClick(ruleExpireHourOrDaysField);
		if(dayHour.equalsIgnoreCase("Days"))
			jswait.loadClick("//div[@id='items']/vaadin-combo-box-item[contains(.,'Days')]");
		else if(dayHour.equalsIgnoreCase("Hours"))
			jswait.loadClick("//div[@id='items']/vaadin-combo-box-item[contains(.,'Hours')]");
		selectTimeZoneForRuleIM();
		selectSenderID_and_Route_forIMRule();
		clickProgramProceed_Button();
	}
	
	public void saveDateOfRuleToSheet(String ruleSheet) throws Exception {
		Calendar rightNow = Calendar.getInstance();
		excel.setExcelFile("biDataSetup", ruleSheet);
		
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
																			
		System.out.println("Rule Date :: " +date);
		excel.setCell(1, 6, date);
		System.out.println("::Successfully Stored Rule Date to Excel Sheet ::");

	}
	
	public void activate_TheRule() throws Exception {
		jswait.loadClick(programActivatebutton);
		Thread.sleep(2000);
		jswait.loadClick(programConfirmActivateYesBtn);
		Thread.sleep(2000);
	}
	
	public void inputScheduleTab_of_Rule(String ruleSheet, String startDate, String endDate, String cycle)
			throws Exception {
		Thread.sleep(3000);
		selectProgramStartDate(startDate);
		Thread.sleep(2000);
		selectProgramEndDate(endDate);
		Thread.sleep(1000);
		selectRefreshCycle(cycle);
		Thread.sleep(2000);
		jswait.loadSendKeys(refreshEveryPgm, "1");
		Thread.sleep(1000);
		selectRefresh_Time_Program(endDate);
		jswait.loadClick("//div[text()='On All Days']");
		Thread.sleep(1000);
		saveDateOfRuleToSheet(ruleSheet);
	}
	
	public String getRule_Last_Refresh_Date() throws Exception {
		String col = jswait.getGridColumnNumber(
				"//iron-data-table[@id='ruleList']//data-table-row[@header]//data-table-cell", "Last Refresh Date");
		jswait.waitUntil("//iron-data-table[@id='ruleList']//iron-list//data-table-cell[" + col + "]");
		return jswait.getTextFormElement("//iron-data-table[@id='ruleList']//iron-list//data-table-cell[" + col + "]");

	}
	
	
	
	
	
}
