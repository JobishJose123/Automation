package pageObjetcs;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Random;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjetcs.CommonObjects;

//import com.google.api.services.gmail.Gmail.Users;
import com.itextpdf.text.log.SysoCounter;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimeoutImpl;
import cucumber.api.java.gl.E;

public class BIsheetPageObjects extends Init{
	JSWaiter jswait = new JSWaiter();
	PmConfigurationPage page = new PmConfigurationPage();
	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	public ExcelHelper eh = new ExcelHelper();
	PmConfigurationPage pmConfigurationPage = new PmConfigurationPage();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Init Init =new Init();
	
	public BIsheetPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='toggleButton']")
	private WebElement AutoRefreshbtn;
	@FindBy(xpath="//*[@id='sym' and @icon='app-primary:reportDesigner']")
	private WebElement clickBI;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//label[contains(.,'Description')]/../..//textarea")
	private WebElement segmentDescriptionField;
	@FindBy(xpath = "//paper-dialog[@id='predefinedwin']//label[contains(.,'List')]/../..//input")
	private WebElement listSelectorField;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//paper-item[contains(.,'"+SELENIUM_LIST+"')]")
	private WebElement listSelect;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//paper-button[contains(.,'Save')]")
	private WebElement segmentSaveButton;
	
	@FindBy(xpath="//*[@id='journey-icon' and @icon='app-primary:reportDesigner']")
	private WebElement clickBI2;
	
	@FindBy(xpath="//paper-button[contains(.,'Create New Worksheet')]")
	private WebElement clickcreatenewworksheet;
	@FindBy(xpath="//label[contains(.,'Name')]//following::input[1]")
	private WebElement BIname;
	@FindBy(xpath="//label[contains(.,'Description')]//following::input[1]")
	private WebElement BIdescription;
	//firstcoloumn://iron-ajax[@id="getHeaders"]//following::div[7]
	//configure://iron-image[@id="configure"]
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[7]")
	private WebElement clickfirstcolumn;
	@FindBy(xpath="//iron-image[@id=\"configure\"]")
	private WebElement clickconfigure;
	@FindBy(xpath="//paper-radio-button[@name=\"DATE\"]/div[1]")
	private WebElement headertypedate;
	@FindBy(xpath="//paper-radio-button[@name=\"DAY\"]/div[1]")
	private WebElement dateheader;
	@FindBy(xpath="//paper-radio-button[@name=\"COUNT\"]/div[1]")
	private WebElement aggregationtypecount;
	@FindBy(xpath="//paper-radio-button[@name=\"SUM\"]/div[1]")
	private WebElement aggregationtypeSum;
	@FindBy(xpath="//paper-button[contains(.,'Save')][@class='style-scope report-header-dialog x-scope paper-button-0']")
	private WebElement clicksavebutton;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[8]")
	private WebElement clicksecondcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[9]")
	private WebElement clickthirdcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[10]")
	private WebElement clickfourthcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[11]")
	private WebElement clickfifthcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[12]")
	private WebElement clicksixthcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[13]")
	private WebElement clickseventhcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[14]")
	private WebElement clickeighthcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[15]")
	private WebElement clickninthcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[16]")
	private WebElement clicktenthcolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[17]")
	private WebElement clickeleveencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[18]")
	private WebElement clicktwelvecolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[19]")
	private WebElement clickthirteencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[20]")
	private WebElement clickforteencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[21]")
	private WebElement clickfifteencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[22]")
	private WebElement clicksixteencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[23]")
	private WebElement clickseventeencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[24]")
	private WebElement clickeighteencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[25]")
	private WebElement clickninthteencolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[26]")
	private WebElement clicktweentycolumn;
	@FindBy(xpath="//iron-ajax[@id=\"getHeaders\"]//following::div[27]")
	private WebElement clicktweentyonecolumn;
	
	@FindBy(xpath="//paper-radio-button[@name='SYSTEM']/div[1]")
	private WebElement Systemeventstypeclick;
	@FindBy(xpath="//vaadin-combo-box[1]/paper-input-container/div[2]/div/input")
	private WebElement eventsselect;
	
	@FindBy(xpath="//paper-radio-button[@name='EVENTS']/div[1]")
	private WebElement elementsheaderevents;
	@FindBy(xpath="//paper-radio-button[@name=\"HEADER\"]/div[1]")
	private WebElement headertypeelements;
	@FindBy(xpath="//paper-radio-button[@name=\"CALCULATION\"]/div[1]")
	private WebElement headertypecalculations;
	@FindBy(xpath="//paper-radio-button[@name=\"PM\"]/div[1]")
	private WebElement elementheaderoutbound;
	@FindBy(xpath="//paper-radio-button[@name='Segment']/div[1]")
	private WebElement elementheadersegment;
	@FindBy(xpath="//paper-radio-button[@name=\"Engagement\"]/div[1]")
	private WebElement elementheaderEngagement;
	@FindBy(xpath="//paper-radio-button[@name='OfferProducts']/div[1]")
	private WebElement elementheaderoffersandproducts;
	@FindBy(xpath="//paper-radio-button[@name='IM']/div[1]")
	private WebElement elementheaderinbound;
	@FindBy(xpath="//paper-radio-button[@name=\"EVENT\"]/div[1]")
	private WebElement calculationheaderEvent;
	@FindBy(xpath="//paper-radio-button[@name='METRIC']/div[1]")
	private WebElement calculationheadermetric;
	@FindBy(xpath="//paper-radio-button[@name='DERIVED']/div[1]")
	private WebElement calculationheaderCreatecalculation;
	@FindBy(xpath="//input[@placeholder='Give an easily identifiable name to your calculation']")
	private WebElement calculationName;
	@FindBy(xpath="//label[contains(.,'Header Name')]//following::input[1]")
	private WebElement calculationNameforpercent;
	@FindBy(xpath="//input[@placeholder='Write a sentence describing your calculation']")
	private WebElement calculationDescription;
	@FindBy(xpath="//vaadin-combo-box[@label=\"Element\"]//input[1]")
	private WebElement elementselection;
	@FindBy(xpath="//label[text()='Attribute Name']//following::iron-icon[2]")
	private WebElement attributeNameselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Campaign Category Name')]")
	private WebElement campaigncatnameelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Engagement Name')]")
	private WebElement engagementnameelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Action Name')]")
	private WebElement actionnameelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer')][1]")
	private WebElement offerelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer Attributes')]")
	private WebElement offerattributeselementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Product')][1]")
	private WebElement productelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Product Class')]")
	private WebElement productClasselementselection;
	
	
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Campaign Name')]")
	private WebElement campaignNameelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Program')]")
	private WebElement ProgramNameselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Program Rule')]")
	private WebElement ProgramRuleNameselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Broadcast Name')]")
	private WebElement broadcastNameelementselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Broadcast Label')]")
	private WebElement broadcastLabelselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Inventory')]")
	private WebElement inventoryselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Campaign Attributes')]")
	private WebElement CampaignAttributesselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Broadcast Attributes')]")
	private WebElement broadcastAttributesselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer Attributes')]")
	private WebElement offerAttributesselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'c_attribute')]")
	private WebElement CampaignAttributenameselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'b_attributes')]")
	private WebElement broadcastAttributenameselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer_Price')]")
	private WebElement offerAttributenameselection;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer_Profit')]")
	private WebElement offerprofitAttributenameselection;
	@FindBy(xpath="//paper-button[contains(.,'Next')]")
	private WebElement clickNextbutton;
	@FindBy(xpath="//label[text()='Event Type']//following::input[1]")
	private WebElement eventdropdowncalculation;
//	@FindBy(xpath="//input[@placeholder=\"Give an easily identifiable name to your calculation\"]")
//	private WebElement NameofCalculation;
	@FindBy(xpath="//label[contains(.,'Header Name')]//following::input[1]")
	private WebElement NameofCalculation;
	@FindBy(xpath="//paper-dialog-scrollable//following::div[2][contains(.,'Give a name to the Header')]//following::paper-button[1]//iron-icon")
	private WebElement ClickNameofCalculation;
	@FindBy(xpath="//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down']")
	private WebElement clickdropdownEventtypeincalculations;
	@FindBy(xpath="//input[@placeholder='Select the Customer Set from the options given']//following::iron-icon[2]")
	private WebElement clickdropdownMetrictypeincalculations;
	@FindBy(xpath="//paper-item[contains(.,'Customer was sent the message')]")
	private WebElement ACkeventTypeSelectioninCalculation;
	@FindBy(xpath="//paper-item[contains(.,'Customer was eligible for Offer')]")
	private WebElement Customerelligible;
	@FindBy(xpath="//paper-item[contains(.,'Offer Recommended')]")
	private WebElement Offerrecommended;
	@FindBy(xpath="//paper-item[contains(.,'Offer accepted')]")
	private WebElement Offeraccepted;
	@FindBy(xpath="//paper-item[contains(.,'Customer converted')]")
	private WebElement ConversioneventTypeSelectioninCalculation;
	@FindBy(xpath="//paper-item[contains(.,'Fulfillment Success')]")
	private WebElement FulfillmenteventTypeSelectioninCalculation;
	@FindBy(xpath="//paper-item[contains(.,'Control Group Conversion')]")
	private WebElement ControlGroupConversionSelectioninCalculation;
	@FindBy(xpath="//paper-item[contains(.,'Control Group Participation')]")
	private WebElement ControlGroupParticipationSelectioninCalculation;
	@FindBy(xpath="//div[@class=\"pageHeading layout horizontal justified style-scope report-header-dialog\"]")
	private WebElement randomClickontopcalculation;
	@FindBy(xpath="//paper-radio-button[@name=\"2\"]/div[1]")
	private WebElement TotalcountCalculations;
	@FindBy(xpath="//paper-radio-button[@name='3']/div[1]")
	private WebElement UniquecountCalculations;
	@FindBy(xpath="//paper-radio-button[@name='1']/div[1]")
	private WebElement EventDomainCalculations;
	@FindBy(xpath="//paper-item[contains(.,'Edit')][@class='style-scope reports-canvas x-scope paper-item-1']")
	private WebElement Editbutton;
	@FindBy(xpath="//paper-radio-button[@name=\"BC\"]/div[1]")
	private WebElement DaterefferenceBC;
	@FindBy(xpath="//paper-radio-button[@name='EVENT']/div[1]")
	private WebElement DaterefferenceEvent;
	@FindBy(xpath="//label[contains(.,'Reference Column')]//following::input[1]")
	private WebElement refferenceColumn;
	@FindBy(xpath="//paper-button[contains(.,'Schedule & Share')]")
	private WebElement ScheduleAndShare;
	@FindBy(xpath="//vaadin-combo-box[contains(.,'Broadcast Name')]")
	private WebElement referenceColmnBCName;
	@FindBy(xpath="//div[2]/div/paper-icon-button[2]/iron-icon")
	private WebElement referencecoloumndropdown;
	@FindBy(xpath="//paper-card[1]/div[1]/iron-image/div[2]//following::paper-button[2]")
	private WebElement clickOKondatepage;
	@FindBy(xpath="//div/div[3]/div[2]/vaadin-combo-box/paper-input-container/div[2]/div/input")
	private WebElement setupK1click;
	@FindBy(xpath="//div/div[4]/div[2]/vaadin-combo-box/paper-input-container/div[2]/div/input")
	private WebElement setupK2click;
	@FindBy(xpath="//div/div[5]/div[2]/vaadin-combo-box/paper-input-container/div[2]/div/input")
	private WebElement setupK3click;
	@FindBy(xpath="//create-calculation/div/paper-icon-button/iron-icon")
	private WebElement plusbuttonclickforformula;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Unique Conversion')]")
	private WebElement uniqueconversionselectfork1;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'c_attribute')]")
	private WebElement cattributeselectfork1;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'F-Conversion')]")
	private WebElement FConversion;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'G-Fulfilment')]")
	private WebElement GFulfilment;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'H:F*D')]")
	private WebElement HFD;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'I:G*D')]")
	private WebElement IGD;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer_Price')]")
	private WebElement Offer_Price;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer_Profit')]")
	private WebElement Offer_Profit;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'b_attributes')]")
	private WebElement battributeselectfork1;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'E-unique_conv')]")
	private WebElement Eunique_convk1;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'C-Unique_ACK')]")
	private WebElement CUnique_ACK;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'F-Value')]")
	private WebElement FValue;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'H-CGP_Unique')]")
	private WebElement HCGP_Unique;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'G-E/C')]")
	private WebElement GEC;
	
	
	
	
	
	@FindBy(xpath="//div/form/create-calculation/div/div[3]/div[2]/vaadin-combo-box/vaadin-combo-box-overlay/div/iron-list/div/vaadin-combo-box-item[2][contains(.,'Unique offer presented')]")
	private WebElement uniqueofferpresentedfork2;
	@FindBy(xpath="//label[contains(.,'Combination Formula')]//following::input[1]")
	private WebElement combinationformula;
	@FindBy(xpath="//report-header-dialog/paper-dialog/div[1]")
	private WebElement clickrandoncal;
	@FindBy(xpath="//div/div[4]/div[2]/vaadin-combo-box/paper-input-container/div[2]/div/paper-icon-button[2]/iron-icon")
	private WebElement clickdrop2;
	@FindBy(xpath="(//paper-icon-button[@icon=\"vaadin-combo-box:arrow-drop-down\"])[1]")
	private WebElement clickeventsdropdown;
	@FindBy(xpath="//vaadin-combo-box[2]/paper-input-container/div[2]/div/input")
	private WebElement domainclickevents;
	
	@FindBy(xpath="//vaadin-combo-box[2]/paper-input-container/div[2]/div/paper-icon-button[2]/iron-icon")
	private WebElement clickdomaindropdown;
	@FindBy(xpath="//div[text()='Create Groups']")
	private WebElement createGroups;
	@FindBy(xpath="//paper-icon-button[@icon='icons:add' and @title='Add Group']//iron-icon[1]")
	private WebElement createGroupsplusbutton;
	@FindBy(xpath="//input[@placeholder='Give an easily identifiable name to your element group']")
	private WebElement createGroupsName;
	@FindBy(xpath="//div[contains(text(),'Configure Condition')]//preceding::div[4]")
	private WebElement createGroupsconfigurecondition;
	@FindBy(xpath="//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down']")
	private WebElement createGroupsconditionclick;
	@FindBy(xpath="//paper-item[text()='begins with']")
	private WebElement createGroupsbeginswith;
	@FindBy(xpath="(//input[@id='input' and @class='style-scope paper-input' and @type='text'])[2]")
	private WebElement createGroupsconditiontext;
	@FindBy(xpath="(//paper-button[text()='Save'])[2]")
	private WebElement createGroupssave;
	
	
	
	
	
	
	
	
	
	
	
	public void clickBusinessIntelligence() throws InterruptedException{
		jswait.loadClick(clickBI2);
		Thread.sleep(3000);
	}
	public void createBIworksheetinbound(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		DateColumnSelection();
		programSelection();
		programRuleSelection();
		columnSelectionFourth();
		totalOfferElligibleSelection();
		columnSelectionFifth();
		uniqueOfferElligibleSelection();
		columnSelectionSixth();
		totalOfferRecommendedSelection();
		columnSelectionSeventh();
		uniqueOfferRecommendedSelection();
		columnSelectioneighth();
		totalOfferAcceptedSelection();
		columnSelectionninth();
		uniqueOfferAcceptedSelection();
		columnSelectiontenth();
		totalConversionsSelection();
		columnSelectioneleveen();
		uniqueIMConversionsSelection();
		columnSelectiontwelve();
//		IMConversionspercentageSelection();
//		columnSelectionthirteen();
		totalfulfillmentSelection();
//		columnSelectionforteen();
		columnSelectionthirteen();
		uniqueIMfulfillmentSelection();
//		editDateinboundFinal();
		
		
		
		
		
	}
	public void createBIworksheetEvents(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		DateColumnSelection();
//		columnSelectionSecond();
//		eventsAckMessage();
//		columnSelectionThird();
//		eventsOfferRecomented();
//		columnSelectionFourth();
//		eventsOfferAccepted();
//		columnSelectionFifth();
//		eventsCustomerConverted();
//		columnSelectionSixth();
//		eventsFulfilmentSuccess();
		columnSelectionSecond();
		campaignCategoryNameSelection();
		columnSelectionThird();
		campaignNameSelection();
		columnSelectionFourth();
		broadcastNameSelection();
		columnSelectionFifth();
		acknowledgementSelection();
		columnSelectionSixth();
		eventsAckMessage();
//		editDateEvents();
		
	}
	public void createBICommonEvents(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		columnSelectionFirst();
		offerSelection();
		columnSelectionSecond();
		totalConversionsSelection();
		columnSelectionThird();
		totalfulfillmentSelection();
		
		
	}
	public void createBIPMwithgroups(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		columnSelectionFirst();
		broadcastWithGroups();
		columnSelectionSecond();
		targetGroupSelection();
		columnSelectionThird();
		controlGroupParticipationSelectionwithoutcoloum();
		columnSelectionFourth();
		totalConversionsSelection();
		columnSelectionFifth();
		controlGroupConversionSelectionwithoutcoloumn();
	
	
	
	}
	public void createBIPMwithAttributes(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		columnSelectionFirst();
		campaignCategoryNameSelection();
		columnSelectionSecond();
		campaignNameSelection();
		columnSelectionThird();
		broadcastNameSelection();
		columnSelectionFourth();
		broadcastLabelSelection();
		columnSelectionFifth();
		inventorySelection();
		columnSelectionSixth();
		campaignAttributesSelection();
		columnSelectionSeventh();
		broadcastAttributesSelection();
		columnSelectioneighth();
		ProductSelection();
		columnSelectionninth();
		ProductClassSelection();
		columnSelectiontenth();
        offerSelection();
        columnSelectioneleveen();
        offerAttributesSelection();
        columnSelectiontwelve();
        acknowledgementSelection();
        columnSelectionthirteen();
        CustomcalCulationSelection();
        
	
	
	
	}
	
	public void createBINumAttrCustCalculation(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		columnSelectionFirst();
		campaignCategoryNameSelection();
		columnSelectionSecond();
		campaignNameSelection();
		columnSelectionThird();
		campaignAttributesSelection();
		columnSelectionFourth();
		campaignAttrpercentageSelection();
		columnSelectionFifth();
		broadcastNameSelection();
		columnSelectionSixth();
		inventorySelection();
		columnSelectionSeventh();
		broadcastLabelSelection();
		columnSelectioneighth();
		 offerSelection();
		 columnSelectionninth();
		 acknowledgementSelection();
		 columnSelectiontenth();
		 uniqueacknowledgementSelection();
		 columnSelectioneleveen();
		 totalConversionsSelection();
		 columnSelectiontwelve();
		 unique_E_ConversionsSelection();
		columnSelectionthirteen();
		Eventdomain_ConversionsSelection();
		columnSelectionforteen();
		CustomcalAckConversionSelection();
		columnSelectionfifteen();
		controlGroupParticipationSelectionwithoutcoloum();
		columnSelectionsixteen();
		controlGroupParticipationUnique();
		columnSelectionseventeen();
		controlGroupConversionSelectionwithoutcoloumn();
		columnSelectioneighteen();
		controlGroupConversionUnique();
//		columnSelectionnintheen();
//		
//		columnSelectiontwenty();
//		
//		columnSelectiontwentyone();
		
	}
	public void createBIEventDomainReport(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		DateColumnSelection();
		columnSelectionSecond();
		offerSelection();
		columnSelectionThird();
		ProductSelection();
		columnSelectionFourth();
		offerAttributesSelection();
		columnSelectionFifth();
		offerprofitAttributesSelection();
		columnSelectionSixth();
		F_conversionSelection();
		columnSelectionSeventh();
		G_fulfillmentSelection();
		columnSelectioneighth();
		H_F_DSelection();
		columnSelectionninth();
		I_G_DSelection();
		columnSelectiontenth();
		J_H_ISelection();
		columnSelectioneleveen();
		K_F_ESelection();
		columnSelectiontwelve();
		
//		columnSelectionthirteen();
	//	
//		columnSelectionforteen();
	//	
//		columnSelectionfifteen();
	//	
//		columnSelectionsixteen();
		
		
		
		
		
		
		
		
	}
//	columnSelectionFirst();
//	
//	columnSelectionSecond();
//	
//	columnSelectionThird();
//	
//	columnSelectionFourth();
//	
//	columnSelectionFifth();
//	
//	columnSelectionSixth();
//	
//	columnSelectionSeventh();
//	
//	columnSelectioneighth();
//	
//	columnSelectionninth();
	
//	columnSelectiontenth();
//	
//	columnSelectioneleveen();
//	
//	columnSelectiontwelve();
//	
//	columnSelectionthirteen();
//	
//	columnSelectionforteen();
//	
//	columnSelectionfifteen();
//	
//	columnSelectionsixteen();
	
	public void createBIPMwithCustSegment(String name,String description,String timerange,String sheet ) throws InterruptedException, IOException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		columnSelectionFirst();
		campaignNameSelection();
		columnSelectionSecond();
		broadcastNameSelection();
		columnSelectionThird();
		segmantNameSelection(sheet);
		columnSelectionFourth();
		B_acknowledgementSelection();
		columnSelectionFifth();
		uniqueacknowledgementSelection();
		columnSelectionSixth();
		D_totalConversionsSelection();
		columnSelectionSeventh();
		unique_E_ConversionsSelection();
		columnSelectioneighth();
		Eventdomain_ConversionsSelection();
		columnSelectionninth();
		CustSegCulationSelection();
		columnSelectiontenth();
		controlGroupParticipationUnique();
		columnSelectioneleveen();
		controlGroupConversionUnique();
		columnSelectiontwelve();
		JUniqueNetconversionCal();
//		columnSelectionthirteen();
//		
//		columnSelectionforteen();
		
		
	
	
	
	
	
	
	
	
	}
	
	public void createBISeedingSheet(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		DateColumnSelection();
		columnSelectionSecond();
		campaignCategoryNameSelection();
		columnSelectionThird();
		campaignNameSelection();
		columnSelectionFourth();
		broadcastNameSelection();
		columnSelectionFifth();
		targetGroupSelection();
		columnSelectionSixth();
		controlGroupParticipationSelectionwithoutcoloum();
		columnSelectionSeventh();
		totalConversionsSelection();
		columnSelectioneighth();
		controlGroupConversionSelectionwithoutcoloumn();
		columnSelectionninth();
		totalfulfillmentSelection();
		
		
	}
	
	
	public void createBIEandASheet(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		columnSelectionFirst();
		engagementColumnSelection();
		columnSelectionSecond();
		actionColumnSelection();
		columnSelectionThird();
		totalOfferRecommendedSelection();
		columnSelectionFourth();
		targetGroupSelection();
		columnSelectionFifth();
		totalOfferAcceptedSelection();
		columnSelectionSixth();
		totalConversionsSelection();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void createBIworksheetoffersproducts(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		DateColumnSelection();
		columnSelectionSecond();
		ProductSelection();
		columnSelectionThird();
		ProductClassSelection();
		columnSelectionFourth();
		offerSelection();
		columnSelectionFifth();
		totalOfferElligibleSelection();
		columnSelectionSixth();
		uniqueOfferElligibleSelection();
		columnSelectionSeventh();
		totalOfferRecommendedSelection();
		columnSelectioneighth();
		uniqueOfferRecommendedSelection();
		columnSelectionninth();
		totalOfferAcceptedSelection();
		columnSelectiontenth();
		uniqueOfferAcceptedSelection();
		columnSelectioneleveen();
		imacknowledgementSelection();
		columnSelectiontwelve();
		totalConversionsSelection();
		columnSelectionthirteen();
		uniqueIMConversionsSelection();
		columnSelectionforteen();
		IMConversionspercentageSelection();
		columnSelectionfifteen();
		totalfulfillmentSelection();
		columnSelectionsixteen();
		uniqueIMfulfillmentSelection();
//		editDateinboundFinal();
		
		
		
	}
	
	public void createBIworksheetoutbound(String name,String description,String timerange ) throws InterruptedException{
		jswait.loadClick(clickcreatenewworksheet);
		Thread.sleep(3000);
		jswait.loadSendKeys(BIname, name);
		jswait.loadSendKeys(BIdescription, description);
		jswait.loadClick("//div[text()='No time ranges defined.']//following::iron-icon[1]");
		jswait.loadSendKeys("//label[text()='Time Range Name']//following::input[1]", timerange);
		if(timerange.equals("between yesterday and tomorrow"))
		{
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]");
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			
			
//			jswait.loadClick("//div[@id=\"no-custom-message\"]//following::iron-icon[1]");
//			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
//			jswait.loadClick("//paper-item[contains(.,'is between')]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[2]");
//			jswait.loadClick("(//paper-item[contains(.,'yesterday (start of)')])[1]");
//			jswait.loadClick("(//label[contains(.,'Select')]//following::input[1])[3]");
//			jswait.loadClick("(//paper-item[contains(.,'tomorrow (start of)')])[2]");
			
			jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
			
		}
		else {
		if(timerange.equals("Yesterday"))
				{
			timerange="1";
				}else if(timerange.equals("Last_week")) {
					timerange="2";
				}else if(timerange.equals("Last_month")) {
					timerange="3";
				}else if(timerange.equals("This_Month_to_Date")) {
					timerange="4";
				}else if(timerange.equals("Last_Month_to_Date")) {
					timerange="5";
				}
		jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
		Thread.sleep(1000);
		jswait.loadClick("//h4[text()='Select Popular Range Type(s)']//following::paper-radio-group//following::paper-radio-button["+timerange+"]");
		jswait.loadClick("(//paper-button[text()='Save'])[2]");
//		jswait.loadClick("//h5[contains(.,'Select Popular Range Type(s)')]//following::paper-radio-button["+timerange+"]");
		}
		DateColumnSelection();
		columnSelectionSecond();
		campaignCategoryNameSelection();
		columnSelectionThird();
		campaignNameSelection();
		columnSelectionFourth();
		broadcastNameSelection();
		columnSelectionFifth();
		acknowledgementSelection();
//		conversionSelection();
//		fulfillmentSelection();
//		controlGroupConversionSelection();
//		controlGroupParticipationSelection();
//		editDateoutboundFinal();
		
		
		
	}
	
	
	
	public void saveBISheet() throws InterruptedException{
		scheduleAndShare();
		
	}
	
	public void columnSelectionFirst() throws InterruptedException{
		jswait.loadClick(clickfirstcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionSecond() throws InterruptedException{
		jswait.loadClick(clicksecondcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionThird() throws InterruptedException{
		jswait.loadClick(clickthirdcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionFourth() throws InterruptedException{
		jswait.loadClick(clickfourthcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionFifth() throws InterruptedException{
		jswait.loadClick(clickfifthcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionSixth() throws InterruptedException{
		jswait.loadClick(clicksixthcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionSeventh() throws InterruptedException{
		jswait.loadClick(clickseventhcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectioneighth() throws InterruptedException{
		jswait.loadClick(clickeighthcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionninth() throws InterruptedException{
		jswait.loadClick(clickninthcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectiontenth() throws InterruptedException{
		jswait.loadClick(clicktenthcolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectioneleveen() throws InterruptedException{
		jswait.loadClick(clickeleveencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectiontwelve() throws InterruptedException{
		jswait.loadClick(clicktwelvecolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionthirteen() throws InterruptedException{
		jswait.loadClick(clickthirteencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionforteen() throws InterruptedException{
		jswait.loadClick(clickforteencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionfifteen() throws InterruptedException{
		jswait.loadClick(clickfifteencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionsixteen() throws InterruptedException{
		jswait.loadClick(clicksixteencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionseventeen() throws InterruptedException{
		jswait.loadClick(clickseventeencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectioneighteen() throws InterruptedException{
		jswait.loadClick(clickeighteencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectionnintheen() throws InterruptedException{
		jswait.loadClick(clickninthteencolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectiontwenty() throws InterruptedException{
		jswait.loadClick(clicktweentycolumn);
		jswait.loadClick(clickconfigure);
	}
	public void columnSelectiontwentyone() throws InterruptedException{
		jswait.loadClick(clicktweentyonecolumn);
		jswait.loadClick(clickconfigure);
	}
	public void ProductSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoffersandproducts);
		jswait.loadSendKeys(elementselection, "Product");
		jswait.loadClick(productelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	public void ProductClassSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoffersandproducts);
		jswait.loadSendKeys(elementselection, "Product Class");
		jswait.loadClick(productClasselementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	public void offerSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoffersandproducts);
		jswait.loadSendKeys(elementselection, "Offer");
		jswait.loadClick(offerelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	
//	public void offerAttributeSelection() throws InterruptedException{
//		columnSelectionFifth();
//		jswait.loadClick(headertypeelements);
//		jswait.loadClick(elementheaderoffersandproducts);
//		jswait.loadSendKeys(elementselection, "Offer Attributes");
//		jswait.loadClick(offerelementselection);
//		jswait.loadClick(aggregationtypecount);
//		jswait.loadClick(clicksavebutton);
//	}
	public void engagementColumnSelection() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderEngagement);
		jswait.loadSendKeys(elementselection, "Engagement Name");
		jswait.loadClick(engagementnameelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
	}
	
	public void actionColumnSelection() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderEngagement);
		jswait.loadSendKeys(elementselection, "Action Name");
		jswait.loadClick(actionnameelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
	}
	
	
	public void DateColumnSelection() throws InterruptedException{
		columnSelectionFirst();
		jswait.loadClick(headertypedate);
		jswait.loadClick(dateheader);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	public void campaignCategoryNameSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoutbound);
		jswait.loadSendKeys(elementselection, "Campaign Category Name");
		jswait.loadClick(campaigncatnameelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	public void programSelection() throws InterruptedException{
		columnSelectionSecond();
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderinbound);
		jswait.loadSendKeys(elementselection, "Program");
		jswait.loadClick(ProgramNameselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
	}
	public void programRuleSelection() throws InterruptedException{
		columnSelectionThird();
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderinbound);
		jswait.loadSendKeys(elementselection, "Program Rule");
		jswait.loadClick(ProgramRuleNameselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	public void totalOfferElligibleSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Total offers elligible");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
//		jswait.pasteText(eventdropdowncalculation, "Customer was eligible for Offer");
//		jswait.loadSendKeys(" //label[text()='Event Type']//following::input[1]", "Customer was eligible for Offer");
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(Customerelligible);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);	
	}
	public void uniqueOfferElligibleSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Unique offers elligible");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(Customerelligible);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);	
	}
	public void totalOfferRecommendedSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Total Offers presented");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(Offerrecommended);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
	}
	public void uniqueOfferRecommendedSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Unique offer presented");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(Offerrecommended);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
	}
	public void totalOfferAcceptedSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Total Acceptance");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(Offeraccepted);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void uniqueOfferAcceptedSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Unique Acceptance");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(Offeraccepted);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
	}
	public void totalConversionsSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Total Conversion");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ConversioneventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
	}
	public void D_totalConversionsSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "D-CONV");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ConversioneventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
	}
	public void uniqueIMConversionsSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Unique Conversion");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ConversioneventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
	}
public void unique_E_ConversionsSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "E-unique_conv");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ConversioneventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
	}
public void Eventdomain_ConversionsSelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderEvent);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "F-Value");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadClick(clickdropdownEventtypeincalculations);
	jswait.loadClick(ConversioneventTypeSelectioninCalculation);
	jswait.loadClick(randomClickontopcalculation);
	jswait.loadClick(EventDomainCalculations);
	jswait.loadSendKeys("//label[text()='Sub-Domain']//following::input[1]", "Value");
	jswait.loadClick("//paper-radio-button[@name='SUM']");
	jswait.loadClick(clicksavebutton);
}
	public void IMConversionspercentageSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderCreatecalculation);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(calculationNameforpercent, "Conv %");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadSendKeys(calculationDescription, "To find conversion %");
		jswait.loadSendKeys(setupK1click, "Unique Conversion");
		//jswait.loadClick(setupK1click);
		jswait.loadClick(uniqueconversionselectfork1);
		jswait.loadClick(plusbuttonclickforformula);
		
		jswait.loadSendKeys(setupK2click, "Unique offer presented");
		//jswait.loadClick(setupK2click);
		//jswait.loadClick(clickrandoncal);
		Thread.sleep(2000);
		//jswait.loadClick(uniqueofferpresentedfork2);
		jswait.loadClick(clickdrop2);
		jswait.loadSendKeys(combinationformula, "K1/K2*100");
		jswait.loadClick(clicksavebutton);
		
	}
	public void totalfulfillmentSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Total Fulfillment");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(FulfillmenteventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void G_fulfillmentSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "G-Fulfilment");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(FulfillmenteventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	
public void CustomcalCulationSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderCreatecalculation);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Custom calculation");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadSendKeys(calculationDescription, "sum");
		jswait.loadSendKeys(setupK1click, "c_attribute");
		//jswait.loadClick(setupK1click);
		jswait.loadClick(cattributeselectfork1);
		jswait.loadClick(plusbuttonclickforformula);
		
		jswait.loadSendKeys(setupK2click, "b_attributes");
		//jswait.loadClick(setupK2click);
		//jswait.loadClick(clickrandoncal);
		Thread.sleep(2000);
		//jswait.loadClick(uniqueofferpresentedfork2);
		jswait.loadClick(battributeselectfork1);
		jswait.loadSendKeys(combinationformula, "K1+K2");
		jswait.loadClick(clicksavebutton);
		
	}
public void H_F_DSelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "H:F*D");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "f*d");
	jswait.loadSendKeys(setupK1click, "F-Conversion");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(FConversion);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "Offer_Price");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(Offer_Price);
	jswait.loadSendKeys(combinationformula, "K1*K2");
	jswait.loadClick(clicksavebutton);
	
}
public void I_G_DSelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "I:G*D");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "G*D");
	jswait.loadSendKeys(setupK1click, "G-Fulfilment");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(GFulfilment);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "Offer_Price");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(Offer_Price);
	jswait.loadSendKeys(combinationformula, "K1*K2");
	jswait.loadClick(clicksavebutton);
	
}
public void J_H_ISelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "J:H+I");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "J");
	jswait.loadSendKeys(setupK1click, "H:F*D");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(HFD);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "I:G*D");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(IGD);
	jswait.loadSendKeys(combinationformula, "K1+K2");
	jswait.loadClick(clicksavebutton);
	
}
public void K_F_ESelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "K:F*E");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "F*e");
	jswait.loadSendKeys(setupK1click, "F-Conversion");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(FConversion);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "Offer_Profit");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(Offer_Profit);
	jswait.loadSendKeys(combinationformula, "K1+K2");
	jswait.loadClick(clicksavebutton);
	
}
public void L_G_ESelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "L:G*E");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "G*E");
	jswait.loadSendKeys(setupK1click, "G-Fulfilment");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(GFulfilment);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "Offer_Profit");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(Offer_Profit);
	jswait.loadSendKeys(combinationformula, "K1*K2");
	jswait.loadClick(clicksavebutton);
	
}

public void CustomcalAckConversionSelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "E/C");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "E/C");
	jswait.loadSendKeys(setupK1click, "C-Unique_ACK");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(CUnique_ACK);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "E-unique_conv");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(Eunique_convk1);
	jswait.loadSendKeys(combinationformula, "K1/K2");
	jswait.loadClick(clicksavebutton);
	
}
public void campaignAttrpercentageSelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "Custom calculation");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "sum");
	jswait.loadSendKeys(setupK1click, "c_attribute");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(cattributeselectfork1);
	jswait.loadSendKeys(combinationformula, "K1*100");
	jswait.loadClick(clicksavebutton);
	
}
public void CustSegCulationSelection() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "G-E/C");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "G");
	jswait.loadSendKeys(setupK1click, "E-unique_conv");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(Eunique_convk1);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "C-Unique_ACK");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(CUnique_ACK);
	jswait.loadSendKeys(combinationformula, "K1/K2");
	jswait.loadClick(clicksavebutton);
	
}
public void JUniqueNetconversionCal() throws InterruptedException{
	
	jswait.loadClick(headertypecalculations);
	jswait.loadClick(calculationheaderCreatecalculation);
	Thread.sleep(2000);
	jswait.loadClick(ClickNameofCalculation);
	Thread.sleep(2000);
//	jswait.loadClick(ClickNameofCalculation);
	NameofCalculation.clear();
	jswait.loadClick(ClickNameofCalculation);
	jswait.loadSendKeys(NameofCalculation, "J-Unique Net conversion");
	jswait.loadClick(aggregationtypeSum);
	jswait.loadClick(clickNextbutton);
	Thread.sleep(2000);
	
	jswait.loadSendKeys(calculationDescription, "Unique Net conversion %");
	jswait.loadSendKeys(setupK1click, "F-Value");
	//jswait.loadClick(setupK1click);
	jswait.loadClick(FValue);
	jswait.loadClick(plusbuttonclickforformula);
	
	jswait.loadSendKeys(setupK2click, "H-CGP_Unique");
	//jswait.loadClick(setupK2click);
	//jswait.loadClick(clickrandoncal);
	Thread.sleep(2000);
	//jswait.loadClick(uniqueofferpresentedfork2);
	jswait.loadClick(HCGP_Unique);
	jswait.loadClick(plusbuttonclickforformula);
	jswait.loadSendKeys(setupK3click, "G-E/C");
	jswait.loadClick(GEC);
	jswait.loadSendKeys(combinationformula, "K1-(K2/K3)");
	jswait.loadClick(clicksavebutton);
	
}
	public void uniqueIMfulfillmentSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Unique Fulfillment");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(FulfillmenteventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	
	
	
	public void campaignNameSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoutbound);
		jswait.loadSendKeys(elementselection, "Campaign Name");
		jswait.loadClick(campaignNameelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
	}
	public void broadcastNameSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoutbound);
		jswait.loadSendKeys(elementselection, "Broadcast Name");
		jswait.loadClick(broadcastNameelementselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);	
	}
	public void segmantNameSelection(String sheet) throws InterruptedException, IOException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheadersegment);
		jswait.loadClick("//paper-button[contains(text(),'Create Saved Segment')]");
		Thread.sleep(2000);
		eh.setExcelFile("BIworksheet", sheet);
		String Name = (String) eh.getCell(1, 2);
		String segmentName=RandomNameGenerator.getRandomName(Name);
		eh.setCell(1, 2,segmentName);
		page.enterSavedSegmentName(segmentName);
		jswait.loadSendKeys(segmentDescriptionField, segmentName+"_Description");
		jswait.loadSendKeys(listSelectorField,SELENIUM_LIST);
		jswait.loadClick(listSelect);
//		if(segmentName.contains("TEMP"))
//			segmentName = segmentName.replaceAll("TEMP", "");
//		System.out.println(segmentName);
		targetConditionObjects.clickBasicTargetCondition("Segment");
		pmConfigurationPage.clickSegmentSaveButton();
		jswait.loadSendKeys("//label[text()='Saved Segments']//following::input[1]", segmentName);
		jswait.loadClick("//paper-item[text()='"+segmentName+"']");
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);	
	}
	
public void broadcastLabelSelection() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoutbound);
		jswait.loadSendKeys(elementselection, "Broadcast Label");
		jswait.loadClick(broadcastLabelselection);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);	
	}
public void inventorySelection() throws InterruptedException{
	
	jswait.loadClick(headertypeelements);
	jswait.loadClick(elementheaderoutbound);
	jswait.loadSendKeys(elementselection, "Inventory");
	jswait.loadClick(inventoryselection);
	jswait.loadClick(aggregationtypecount);
	jswait.loadClick(clicksavebutton);	
}
public void campaignAttributesSelection() throws InterruptedException{
	
	jswait.loadClick(headertypeelements);
	jswait.loadClick(elementheaderoutbound);
	jswait.loadSendKeys(elementselection, "Campaign Attributes");
	jswait.loadClick(CampaignAttributesselection);
    jswait.loadSendKeys("//label[text()='Attribute Name']//following::input[1]", "c_attribute");
    jswait.loadClick(CampaignAttributenameselection);
    jswait.loadClick(aggregationtypecount);
	jswait.loadClick(clicksavebutton);	
}

public void broadcastAttributesSelection() throws InterruptedException{
	
	jswait.loadClick(headertypeelements);
	jswait.loadClick(elementheaderoutbound);
	jswait.loadSendKeys(elementselection, "Broadcast Attributes");
	jswait.loadClick(broadcastAttributesselection);
    jswait.loadSendKeys("//label[text()='Attribute Name']//following::input[1]", "b_attributes");
    jswait.loadClick(broadcastAttributenameselection);
    jswait.loadClick(aggregationtypecount);
	jswait.loadClick(clicksavebutton);	
}

public void offerAttributesSelection() throws InterruptedException{
	
	jswait.loadClick(headertypeelements);
	jswait.loadClick(elementheaderoffersandproducts);
	jswait.loadSendKeys(elementselection, "Offer Attributes");
	jswait.loadClick(offerAttributesselection);
    jswait.loadSendKeys("//label[text()='Attribute Name']//following::input[1]", "Offer_Price");
    jswait.loadClick(offerAttributenameselection);
    jswait.loadClick(aggregationtypecount);
	jswait.loadClick(clicksavebutton);	
}
public void offerprofitAttributesSelection() throws InterruptedException{
	
	jswait.loadClick(headertypeelements);
	jswait.loadClick(elementheaderoffersandproducts);
	jswait.loadSendKeys(elementselection, "Offer Attributes");
	jswait.loadClick(offerAttributesselection);
    jswait.loadSendKeys("//label[text()='Attribute Name']//following::input[1]", "Offer_Profit");
    jswait.loadClick(offerprofitAttributenameselection);
    jswait.loadClick(aggregationtypecount);
	jswait.loadClick(clicksavebutton);	
}
	
public void broadcastWithGroups() throws InterruptedException{
		
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementheaderoutbound);
		jswait.loadSendKeys(elementselection, "Broadcast Name");
		jswait.loadClick(broadcastNameelementselection);
		Thread.sleep(2000);
		jswait.loadClick(createGroups);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		jswait.loadClick(createGroupsplusbutton);
		jswait.loadSendKeys(createGroupsName, "Broadcast campaign");
		//jswait.loadClick(createGroupsconfigurecondition);
		jswait.loadClick(createGroupsconditionclick);
		jswait.loadClick(createGroupsbeginswith);
		jswait.loadSendKeys(createGroupsconditiontext, "smpp");
//		jswait.loadClick(createGroupssave);
		jswait.loadClick(clicksavebutton);	
	}
	
	public void imacknowledgementSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Acknowledgement");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ACkeventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	
	public void targetGroupSelection() throws InterruptedException{
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "TG");
		Thread.sleep(2000);
		jswait.loadClick(aggregationtypeSum);
		Thread.sleep(2000);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ACkeventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void B_acknowledgementSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "B-ACK");
		Thread.sleep(2000);
		jswait.loadClick(aggregationtypeSum);
		Thread.sleep(2000);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ACkeventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	
public void uniqueacknowledgementSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "C-Unique_ACK");
		Thread.sleep(2000);
		jswait.loadClick(aggregationtypeSum);
		Thread.sleep(2000);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ACkeventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	
	public void acknowledgementSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
//		jswait.loadClick(ClickNameofCalculation);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Acknowledgement");
		Thread.sleep(2000);
		jswait.loadClick(aggregationtypeSum);
		Thread.sleep(2000);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ACkeventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void conversionSelection() throws InterruptedException{
		columnSelectionSixth();
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Conversion");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ConversioneventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
		
	}
	public void F_conversionSelection() throws InterruptedException{
		columnSelectionSixth();
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "F-Conversion");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ConversioneventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
		
	}
	public void fulfillmentSelection() throws InterruptedException{
		columnSelectionSeventh();
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Fulfillment");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(FulfillmenteventTypeSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void controlGroupConversionSelectionwithoutcoloumn() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Control Group Conversion");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ControlGroupConversionSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void controlGroupConversionSelection() throws InterruptedException{
		columnSelectioneighth();
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Control Group Conversion");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ControlGroupConversionSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void controlGroupParticipationSelectionwithoutcoloum() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Control Group Participation");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ControlGroupParticipationSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	
	public void clickSegmentSaveButton() throws InterruptedException{
		jswait.loadClick(segmentSaveButton);
	}
	public void controlGroupParticipationUnique() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "H-CGP_Unique");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ControlGroupParticipationSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void controlGroupConversionUnique() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "I-CGC_Unique");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ControlGroupConversionSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
	}
public void metricSelection() throws InterruptedException{
		
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheadermetric);
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownMetrictypeincalculations);
		jswait.loadClick(ControlGroupConversionSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(UniquecountCalculations);
		jswait.loadClick(clicksavebutton);
	}
	
	public void controlGroupParticipationSelection() throws InterruptedException{
		columnSelectionninth();
		jswait.loadClick(headertypecalculations);
		jswait.loadClick(calculationheaderEvent);
		Thread.sleep(2000);
		jswait.loadClick(ClickNameofCalculation);
		Thread.sleep(2000);
		NameofCalculation.clear();
		jswait.loadClick(ClickNameofCalculation);
		jswait.loadSendKeys(NameofCalculation, "Control Group Participation");
		jswait.loadClick(aggregationtypeSum);
		jswait.loadClick(clickNextbutton);
		Thread.sleep(2000);
		
		jswait.loadClick(clickdropdownEventtypeincalculations);
		jswait.loadClick(ControlGroupParticipationSelectioninCalculation);
		jswait.loadClick(randomClickontopcalculation);
		jswait.loadClick(TotalcountCalculations);
		jswait.loadClick(clicksavebutton);
		
	}
	public void editDateoutboundFinal() throws InterruptedException{
		jswait.loadClick(clickfirstcolumn);
		jswait.loadClick(Editbutton);
		jswait.loadClick(DaterefferenceBC);
		jswait.loadClick(referencecoloumndropdown);
		//jswait.loadSendKeys(refferenceColumn, "Broadcast Name");
		//jswait.loadClick(DaterefferenceBC);
		Thread.sleep(2000);
		//jswait.loadClick(randomClickontopcalculation);
		jswait.loadSendKeys(refferenceColumn, "Broadcast Name");
		jswait.loadClick(referencecoloumndropdown);
		//jswait.loadClick(referenceColmnBCName);
		jswait.loadClick(clicksavebutton);
	}
	public void editDateEvents() throws InterruptedException{
		jswait.loadClick(clickfirstcolumn);
		jswait.loadClick(Editbutton);
		jswait.loadClick(DaterefferenceBC);
		jswait.loadClick(referencecoloumndropdown);
		//jswait.loadSendKeys(refferenceColumn, "Broadcast Name");
		//jswait.loadClick(DaterefferenceBC);
		Thread.sleep(2000);
		//jswait.loadClick(randomClickontopcalculation);
		jswait.loadSendKeys(refferenceColumn, "Broadcast Name");
		jswait.loadClick(referencecoloumndropdown);
		//jswait.loadClick(referenceColmnBCName);
		jswait.loadClick(clicksavebutton);
	}
	public void editDateinboundFinal() throws InterruptedException{
		jswait.loadClick(clickfirstcolumn);
		jswait.loadClick(Editbutton);
		jswait.loadClick(DaterefferenceEvent);
		jswait.loadClick(referencecoloumndropdown);
		//jswait.loadSendKeys(refferenceColumn, "Broadcast Name");
		//jswait.loadClick(DaterefferenceBC);
		Thread.sleep(2000);
		//jswait.loadClick(randomClickontopcalculation);
		jswait.loadSendKeys(refferenceColumn, "Total offers elligible");
		jswait.loadClick(referencecoloumndropdown);
		//jswait.loadClick(referenceColmnBCName);
		jswait.loadClick(clicksavebutton);
	}
	
	public void eventsAckMessage() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementsheaderevents);
		jswait.loadClick(Systemeventstypeclick);
		jswait.loadSendKeys(eventsselect, "Customer was sent the message");
		jswait.loadClick(clickeventsdropdown);
		jswait.loadSendKeys(domainclickevents, "Message Type");
		jswait.loadClick(clickdomaindropdown);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
		
	}
	public void eventsOfferRecomented() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementsheaderevents);
		jswait.loadClick(Systemeventstypeclick);
		jswait.loadSendKeys(eventsselect, "Offer Recommended");
		jswait.loadClick(clickeventsdropdown);
		jswait.loadSendKeys(domainclickevents, "SegmentOfferID");
		jswait.loadClick(clickdomaindropdown);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
		
	}
	public void eventsOfferAccepted() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementsheaderevents);
		jswait.loadClick(Systemeventstypeclick);
		jswait.loadSendKeys(eventsselect, "Offer accepted");
		jswait.loadClick(clickeventsdropdown);
		jswait.loadSendKeys(domainclickevents, "SegmentOfferID");
		jswait.loadClick(clickdomaindropdown);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
		
	}
	public void eventsCustomerConverted() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementsheaderevents);
		jswait.loadClick(Systemeventstypeclick);
		jswait.loadSendKeys(eventsselect, "Customer converted");
		jswait.loadClick(clickeventsdropdown);
		jswait.loadSendKeys(domainclickevents, "Value");
		jswait.loadClick(clickdomaindropdown);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
		
	}
	public void eventsFulfilmentSuccess() throws InterruptedException{
		jswait.loadClick(headertypeelements);
		jswait.loadClick(elementsheaderevents);
		jswait.loadClick(Systemeventstypeclick);
		jswait.loadSendKeys(eventsselect, "Fulfillment Success");
		jswait.loadClick(clickeventsdropdown);
		jswait.loadSendKeys(domainclickevents, "ResponseMessage");
		jswait.loadClick(clickdomaindropdown);
		jswait.loadClick(aggregationtypecount);
		jswait.loadClick(clicksavebutton);
		
		
	}
	
	public void scheduleAndShare() throws InterruptedException{
		jswait.loadClick(ScheduleAndShare);
		Thread.sleep(1000);
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
		 Actions builder = new Actions(driver);
		 jswait.loadClick("//paper-card[1]/paper-date-time-input/div/paper-input[1]/paper-input-container/div[2]/div/input");
		 Thread.sleep(1000);
		 jswait.loadClick("//paper-card[1]//paper-date-time-input[1]//div[@date='" + date + "']");
	     jswait.loadClick(clickOKondatepage);
	     Thread.sleep(1000);
	     jswait.loadClick("//paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]/div/input");
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
			jswait.loadClick("//paper-radio-button[@name=\"NEVER\"]/div[1]");
			jswait.loadClick("//label[contains(.,'Recurrence Pattern')]//following::input[1]");
			jswait.loadClick("//paper-item[@name=\"DAILY\"]");
			jswait.loadSendKeys("//paper-input-wrapper/div/paper-input/paper-input-container/div[2]/div/input", "1");
			startsAt();
			
	         
			}
	
	public void startsAt() throws InterruptedException{
		
		
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
		Thread.sleep(2000);
		jswait.loadClick("//schedule-component/div/paper-card[2]/paper-date-time-input/div/paper-input/paper-input-container/div[2]/div/input");
		Thread.sleep(2000);

		WebElement num = driver.findElement(By.xpath(
				"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours+1) + "])[2]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);

		Thread.sleep(2000);
		WebElement num1 = driver.findElement(By.xpath(
				"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min+1) + "])[2]"));
		Thread.sleep(1000);
    	 builder.moveToElement(num1).click().build().perform();
      	if(am_pm==0)
      	  jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
       else
      	  jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");
		jswait.loadClick("(//paper-button[contains(.,'OK')])[4]");
		jswait.loadClick("//paper-button[contains(.,'Proceed')]");
		jswait.loadSendKeys("(//input[@id='input'])[3]", "Regression");
		driver.findElement(By.xpath("(//input[@id='input'])[3]")).sendKeys(Keys.ENTER);
		jswait.loadSendKeys("(//input[@id='input'])[3]", "z");
		//Thread.sleep(1000);
//		driver.findElement(By.xpath("//h2[contains(.,'STEP 2: Save, Export, Tags & Share')]")).click();
//		Thread.sleep(1000);
//		jswait.loadClick("(//*[@id=\"scrollable\"])[1]");
//		jswait.loadClick("//h2[contains(.,'STEP 2: Save, Export, Tags & Share')]");
////		jswait.loadClick("(//input[@id='input'])[4]");
////		jswait.loadClick("(//input[@id='input'])[4]");
//		jswait.loadClick("(//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down'])[1]");
//		Thread.sleep(1000);
//		jswait.loadClick("//paper-item[contains(.,'System Administrator')]");
//		jswait.loadClick("//h2[contains(.,'STEP 2: Save, Export, Tags & Share')]");
//		jswait.loadClick("(//input[@id='input'])[3]");
		jswait.loadClick("(//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down'])[3]");
//		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'flyops@flytxt.com')]");
		jswait.loadClick("//label[contains(.,'Write Email Message')]//following::input[1]");
		jswait.loadSendKeys("//label[contains(.,'Write Email Message')]//following::input[1]", "BI Report");
		jswait.loadClick("//paper-button[contains(.,'Done')]");
	}
	
	public String getBIsheetstatus() throws Exception{
		jswait.loadClick(AutoRefreshbtn);
		Thread.sleep(2000);
		String status = driver.findElement(By.xpath("//span[@class='style-scope reports-grid']")).getText();
		System.out.println(status);
		return status;
	}
	
	
	

}
