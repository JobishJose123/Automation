package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.junit.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class TouchpointPage extends Init{
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eh = new ExcelHelper(); 
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public TouchpointPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Create New Touchpoint']")
	private WebElement clickCreateNewTouchpoint;
	//ussd touchpoint objects
	@FindBy(xpath=".//*[text()='USSD']")
	private WebElement ussdTouchpoints;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement ussdFormPrioritizationLogicSelector;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement ussdFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='ussdForm']//paper-item[contains(.,'FIFO')]")
	private WebElement ussdFormPrioritizationRuleFIFO;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[2]")
	private WebElement ussdFormPrioritizationLogicFIFO;
	@FindBy(xpath="//form[@id='ussdForm']//paper-item[contains(.,'Hours')]")
	private WebElement ussdFormTimeInterval1;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement ussdFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement ussdFormTouchpointName;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Refresh Every')]/../input")
	private WebElement ussdFormRefreshEvery;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Maximum offers')]/../input")
	private WebElement ussdFormMaximumOffers;
	@FindBy(xpath=".//*[@id='ussdForm']//paper-button[contains(.,'Save')]")
	private WebElement ussdFormSaveButton;
	@FindBy(xpath=".//*[@id='ussdForm']//paper-button[contains(.,'Cancel')]")
	private WebElement ussdFormCancelButton;
	@FindBy(xpath=".//*[@id='addUssdModal']")
	private WebElement ussdFormDialogBox;
	@FindBy(xpath=".//*[@id='addUssdModal']//h2")
	private WebElement ussdFormHeading;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'USSD Application')]/../input")
	private WebElement ussdFormUssdApplicationSelector;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'USSD Application')]/../input")
	private WebElement ussdFormUssdApplicationSelectorInApi;
	@FindBy(xpath=".//form[@id='ussdForm']//paper-icon-button[@id='clearIcon']")
	private WebElement ussdFormUssdApplicationClearButton;
	
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'"+SELENIUM_USSD_APP+"')]")
	private WebElement ussdFormUssdApplication1;
	@FindBy(xpath="((.//data-table-cell[@class='ussd-touchpoint-grid style-scope']//paper-icon-button[1])//iron-icon[1])[1]")
	private WebElement ussdTouchpointEdit;
	@FindBy(xpath="((.//data-table-cell[@class='ussd-touchpoint-grid style-scope']//paper-icon-button[2])//iron-icon[1])[1]")
	private WebElement ussdDeleteTouchpoint;
	@FindBy(xpath=".//div[@class='buttons style-scope ussd-touchpoint-grid']//paper-button[contains(.,'Yes')]")
	private WebElement ussdDeleteYes;
	@FindBy(xpath=".//form[@id='ussdForm']//paper-input-error[@class='style-scope paper-input x-scope paper-input-error-0']")
	private List <WebElement> ussdCreateValidation;
	@FindBy(xpath=".//div[@class='add-on-content is-invalid style-scope paper-input-container']//paper-input-error")
	private List <WebElement> ussdEditValidation;
	
	@FindBy(xpath=".//paper-input-container[@class='style-scope vaadin-combo-box x-scope paper-input-container-4']//paper-input-error[contains(.,'This field is required.')]")
	private WebElement ussdApplicationValidation;
	
	
	//smart phone  touchpoint objects
	
	@FindBy(xpath=".//div[text()='Smartphone App']")
	private WebElement smartphoneTouchpoints;
	@FindBy(xpath=".//div[@class='buttons style-scope smartphone-touchpoint-grid']//paper-button[contains(.,'Save')]")
	private WebElement smartFormSaveButton;
	@FindBy(xpath=".//form[@id='addSmartphoneFrom']//paper-input-error[@class='style-scope paper-input x-scope paper-input-error-0']")
	private List <WebElement> smartCreateValidation;
	
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement smartphoneTouchpointsname;
	
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement appFormPrioritizationLogicSelector;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement appFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//paper-item[contains(.,'FIFO')]")
	private WebElement appFormPrioritizationRuleFIFO;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//paper-item[contains(.,'LIFO')]")
	private WebElement appFormPrioritizationRuleLIFO;
	
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//paper-item[contains(.,'Rule-based')]")
	private WebElement appFormPrioritizationLogicRuleBased;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//paper-item[contains(.,'Hours')]")
	private WebElement appFormTimeInterval1;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement appFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//label[contains(.,'Refresh Every')]/../input")
	private WebElement appFormRefreshEvery;
	@FindBy(xpath="//form[@id='addSmartphoneFrom']//label[contains(.,'Maximum offers')]/../input")
	private WebElement appFormMaximumOffers;
	
	@FindBy(xpath=".//data-table-cell[@class='smartphone-touchpoint-grid style-scope']//paper-icon-button[2]")
	private WebElement editSmartphoneTouchpoint;
	
	
	
	
	
	
	//api touchpoint objects
	@FindBy(xpath=".//*[text()='API']")
	private WebElement apiTouchpoints;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement apiFormPrioritizationLogicSelector;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement apiFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'FIFO')]")
	private WebElement apiFormPrioritizationRuleFIFO;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'LIFO')]")
	private WebElement apiFormPrioritizationRuleLIFO;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'FIFO')]")
	private WebElement apiFormPrioritizationLogicFIFO;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'LIFO')]")
	private WebElement apiFormPrioritizationLogicLIFO;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'Hours')]")
	private WebElement apiFormTimeIntervalHours;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'Days')]")
	private WebElement apiFormTimeIntervalDays;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement apiFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement apiFormTouchpointName;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement custFormTouchpointName;
	
	
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Refresh Every')]/../input")
	private WebElement apiFormRefreshEvery;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Maximum offers')]/../input")
	private WebElement apiFormMaximumOffers;
	@FindBy(xpath=".//*[@id='apiForm']//paper-button[contains(.,'Save')]")
	private WebElement apiFormSaveButton;
	@FindBy(xpath=".//*[@id='apiForm']//paper-button[contains(.,'Cancel')]")
	private WebElement apiFormCancelButton;
	@FindBy(xpath=".//*[@id='addApiModal']")
	private WebElement apiFormDialogBox;
	@FindBy(xpath=".//*[@id='addApiModal']//h2")
	private WebElement apiFormHeading;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Application Type')]/../..//input")
	private WebElement apiFormApplicationType;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Event For Tracking')]/../..//input")
	private WebElement apiFormEventForTracking;
	@FindBy(xpath="//paper-item[contains(.,'General')]")
	private WebElement apiFormApplicationTypeGeneral;
	@FindBy(xpath="//paper-item[contains(.,'USSD')]")
	private WebElement apiFormApplicationTypeUssd;
	@FindBy(xpath="//paper-item[contains(.,'Accepted Event')]")
	private WebElement apiFormEventForTrackingAcceptedEvent;
	@FindBy(xpath="//paper-item[contains(.,'Recommended Event')]")
	private WebElement apiFormEventForTrackingRecommendedEvent;
	@FindBy(xpath="((.//data-table-cell[@class='api-touchpoint-grid style-scope']//paper-icon-button[1])//iron-icon[1])[1]")
	private WebElement Apiedittouchpoints;
	@FindBy(xpath="(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'edited apiTouch')]")
	private WebElement apiedittouchpointcheck ;
	@FindBy(xpath="((.//data-table-cell[@class='api-touchpoint-grid style-scope']//paper-icon-button[2])//iron-icon[1])[1]")
	private WebElement apideletebutton;
	@FindBy(xpath=".//*[@id='deleteTP']/div/paper-button[@class='style-scope api-touchpoint-grid x-scope paper-button-0']")
	private WebElement apideleteyes;
	@FindBy(xpath="//*[@id='deleteTP']/div/paper-button[@class='style-scope ussd-touchpoint-grid x-scope paper-button-0']")
	private WebElement ussddeleteyes;
	
	@FindBy(xpath="//paper-toast[@id='toast']//span[contains(.,'Touchpoint Deleted')]")
	private WebElement deletewarningapi;
	
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Maximum offers')]/../input//following::paper-input-error[1]")
	private WebElement apivalidation ;
	
	@FindBy(xpath=".//div[@class='layout vertical style-scope api-touchpoint-grid']//paper-input-error[contains(.,'This field is required.')]")
	private WebElement apiNameValidation;
	
	@FindBy(xpath=".//form[@id='apiForm']//paper-input-error[@class='style-scope paper-input x-scope paper-input-error-0']")
	private List <WebElement> apiCreateValidation;
	
	
	
	
	
	
	//-------------------------//
	@FindBy(xpath="((.//data-table-cell[@class='customercare-touchpoint-grid style-scope']//paper-icon-button[2])//iron-icon[1])[1]")
	private WebElement editTouchpoint;
	
	@FindBy(xpath=".//div[@class='buttons style-scope customercare-touchpoint-grid']//paper-button[contains(.,'Yes')]")
	private WebElement custDeleteYes;
	//-------------------------//
	
	

	
	
	
	
	//sms touchpoint objects
	@FindBy(xpath=".//*[text()='SMS']")
	private WebElement smsTouchpoints;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Short Code')]/../input")
	private WebElement smsFormShortCodeSelector;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Keyword')]/../input")
	private WebElement smsFormKeywordInput;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement smsFormPrioritizationLogicSelector;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement smsFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='smsForm']//paper-item[contains(.,'FIFO')]")
	private WebElement smsFormPrioritizationRuleFIFO;
	@FindBy(xpath="//form[@id='smsForm']//paper-item[contains(.,'LIFO')]")
	private WebElement smsFormPrioritizationRuleLIFO;
	@FindBy(xpath="//label[contains(.,'Short Code')]/following::vaadin-combo-box-item[contains(.,'"+SMS_SHORT_CODE+"')]")
	private WebElement smsFormShortCode1;
	
	@FindBy(xpath="//label[contains(.,'Short Code')]/following::vaadin-combo-box-item[2]")
	private WebElement smsFormShortCode2;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[2]")
	private WebElement smsFormPrioritizationLogicFIFO;
	@FindBy(xpath="//form[@id='smsForm']//paper-item[contains(.,'Hours')]")
	private WebElement smsFormTimeInterval1;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement smsFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement smsFormTouchpointName;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Refresh Every')]/../input")
	private WebElement smsFormRefreshEvery;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Maximum offers')]/../input")
	private WebElement smsFormMaximumOffers;
	@FindBy(xpath=".//*[@id='smsForm']//paper-button[contains(.,'Save')]")
	private WebElement smsFormSaveButton;
	@FindBy(xpath=".//*[@id='smsForm']//paper-button[contains(.,'Cancel')]")
	private WebElement smsFormCancelButton;
	@FindBy(xpath=".//*[@id='addSmsModal']")
	private WebElement smsFormDialogBox;
	@FindBy(xpath=".//*[@id='addSmsModal']//h2")
	private WebElement smsFormHeading;
	@FindBy(xpath="((.//data-table-cell[@class='sms-touchpoint-grid style-scope']//paper-icon-button[1])//iron-icon[1])[1]")
	private WebElement smstouchpointedit ;
	@FindBy(xpath=".//*[@id='item35']/div[1]/data-table-cell[1]/span[@class='ellipsis style-scope data-table-cell']")
	private WebElement smseditcheck ;
	@FindBy(xpath=".//*[@id='deleteTP']/div/paper-button[@class='style-scope sms-touchpoint-grid x-scope paper-button-0']")
	private WebElement smsdeleteyes ;
	@FindBy(xpath="((.//data-table-cell[@class='sms-touchpoint-grid style-scope']//paper-icon-button[2])//iron-icon[1])[1]")
	private WebElement smsdeletebutton;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Maximum offers')]/../input//following::paper-input-error[1]")
	private WebElement smsvalidation ;
	
	@FindBy(xpath=".//form[@id='smsForm']//paper-input-error[@class='style-scope paper-input x-scope paper-input-error-0']")
	private List <WebElement> smsCreateValidation;
	
	@FindBy(xpath=".//vaadin-combo-box[@class='flex style-scope sms-touchpoint-grid x-scope vaadin-combo-box-1']//paper-input-error")
	private WebElement shortCodeValidation;
	@FindBy(xpath=".//paper-input[@class='style-scope sms-touchpoint-grid x-scope paper-input-0']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement smsTouchpointName;
	
	
	
	
	//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	
	//customer care touchpoint objects
	@FindBy(xpath=".//*[text()='Customer Care']")
	private WebElement customerCareTouchpoints;
	@FindBy(xpath=".//*[@id='addCustomerForm']//label[contains(.,'Maximum offers')]/../input")
	private WebElement customerCareFormMaximumOffers;
	@FindBy(xpath=".//*[@id='addCustomerCare']//paper-button[contains(.,'Save')]")
	private WebElement customerCareFormSaveButton;
	@FindBy(xpath=".//*[@id='addCustomerCare']//paper-button[contains(.,'Cancel')]")
	private WebElement customerCareFormCancelButton;
	@FindBy(xpath=".//*[@id='addCustomerCare']//h2")
	private WebElement customerCareFormHeading;
	@FindBy(xpath=".//*[@id='addCustomerCare']")
	private WebElement customerCareForm;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement customerCareFormPrioritizationLogicSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement customerCareFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'FIFO')]")
	private WebElement customerCareFormPrioritizationRuleFIFO;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[2]")
	private WebElement customerCareFormPrioritizationLogicFIFO;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'LIFO')]")
	private WebElement customerCareFormPrioritizationLogicLIFO;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[1]")
	private WebElement customerCareFormPrioritizationLogicBESTFITALGORITHM;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'Hours')]")
	private WebElement customerCareFormTimeInterval1;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement customerCareFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Refresh Every')]/../input")
	private WebElement customerCareFormRefreshEvery;
	@FindBy(xpath=".//*[@id='addTriggerModal']")
	private WebElement customerCareFormDialogBox;
	@FindBy(xpath=".//*[@id='addCustomerForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement customerCareFormTouchpointName;
	
	@FindBy(xpath="((.//data-table-cell[@class='customercare-touchpoint-grid style-scope']//paper-icon-button[2])//iron-icon[1])[1]")
	private WebElement editTouchpoint1;
	
	@FindBy(xpath=".//data-table-cell[@class='customercare-touchpoint-grid style-scope']//paper-icon-button[2]//iron-icon")
	private List <WebElement> custEditButtonList;
	
	@FindBy(xpath="((.//data-table-cell[@class='customercare-touchpoint-grid style-scope']//paper-icon-button[1])//iron-icon[1])[1]")
	private WebElement custDeleteTouchpoint;
	
	@FindBy(xpath=".//data-table-cell[@class='customercare-touchpoint-grid style-scope']//paper-icon-button[1]//iron-icon")
	private List <WebElement> custDeleteTouchpointList;

@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement custFormTouchpointName1;
	
	@FindBy(xpath=".//div[@class='buttons style-scope customercare-touchpoint-grid']//paper-button[contains(.,'Save')]")
	private WebElement custFormSaveButton;
	
	@FindBy(xpath=".//form[@id='addCustomerForm']//paper-input-error[@class='style-scope paper-input x-scope paper-input-error-0']")
	private List <WebElement> customercareCreateValidation;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	
	//trigger touchpoint objects
	@FindBy(xpath=".//*[text()='Trigger']")
	private WebElement triggerTouchpoint;
	@FindBy(xpath=".//form[@id='triggerForm']//label[contains(.,'Trigger')]/../input")
	private WebElement selectTrigger;
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Touchpoint Name')]/../input")
	private WebElement triggerTouchpointName;
	@FindBy(xpath="//vaadin-combo-box-item[contains(..,'Trigger')][2]")
	private WebElement triggerFormTriggerSelect;
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement triggerFormProritizationLogicSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Prioritization Logic')]/../input")
	private WebElement custTriggerFormPrioritizationLogicSelector;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[2]")
	private WebElement custTriggerFormPrioritizationLogicFIFO;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement custTriggerFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'FIFO')]")
	private WebElement custTriggerFormPrioritizationRuleFIFO;
	
	@FindBy(xpath=".//data-table-cell[@class='trigger-touchpoint-grid style-scope']//paper-icon-button[1]")
	private WebElement editTriggerTouchpoint;
	
	
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Prioritization Rule')]/../input")
	private WebElement triggerFormPrioritizationRuleSelector;
	@FindBy(xpath="//form[@id='triggerForm']//paper-item[contains(.,'FIFO')]")
	private WebElement triggerFormPrioritizationRuleFIFO;
	@FindBy(xpath="//form[@id='triggerForm']//paper-item[contains(.,'LIFO')]")
	private WebElement triggerFormPrioritizationRuleLIFO;
	@FindBy(xpath="//form[@id='triggerForm']//vaadin-combo-box-item[contains(.,'FIFO')]")
	private WebElement triggerFormProritizationLogicFIFO;
	@FindBy(xpath="//form[@id='triggerForm']//paper-item[contains(.,'Hours')]")
	private WebElement triggerFormTimeInterval1;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'Hours')]")
	private WebElement custTriggerFormTimeInterval;
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement triggerFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Time Interval')]/../..//input")
	private WebElement custTriggerFormTimeIntervalSelector;
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Refresh Every')]/../input")
	private WebElement triggerFormRefreshEvery;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Refresh Every')]/../input")
	private WebElement custTriggerFormRefreshEvery;
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Maximum offers')]/../input")
	private WebElement triggerFormMaximumOffers;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Maximum offers')]/../input")
	private WebElement custTriggerFormMaximumOffers;
	@FindBy(xpath="(.//paper-button[contains(.,'Save')])[3]")
	private WebElement triggerFormSaveButton;
	@FindBy(xpath="(//paper-button[contains(.,'Cancel')])[3]")
	private WebElement triggerFormCancelButton;
	@FindBy(xpath=".//*[@id='addTriggerModal']")
	private WebElement triggerFormDialogBox;
	@FindBy(xpath=".//*[@id='addTriggerModal']//h2")
	private WebElement triggerFormHeading;
	@FindBy(xpath=".//*[@id='triggerDataTable']//div[@id='items']/div[1]/data-table-row//paper-icon-button")
	private WebElement triggerTouchpointDelete;
	@FindBy(xpath="//div[@val='trigger']//*[@id='deleteTP']//paper-button[contains(.,'Yes')]")
	private WebElement triggerDeleteYes;
	
	@FindBy(xpath=".//form[@id='triggerForm']//paper-input-error[@class='style-scope paper-input x-scope paper-input-error-0']")
	private List <WebElement> triggerCreateValidation;
	@FindBy(xpath=".//vaadin-combo-box[@label='Trigger']//paper-input-error")
	private WebElement triggerFieldValidation;
	
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Maximum offers')]/../input//following::paper-input-error[1]")
	private WebElement triggervalidation ;
	
	@FindBy(xpath="((.//data-table-cell[@class='trigger-touchpoint-grid style-scope']//paper-icon-button[1])//iron-icon[1])[1]")
	private WebElement triggereditclick ;
//	@FindBy(xpath="")
//	private WebElement ;

public void clickUssdEditTouchpoint(String name) throws InterruptedException {
		
		Thread.sleep(2000);
		jswait.loadClick("//data-table-cell[contains(.,'"+name+"')]/..//paper-icon-button[1]");
		Thread.sleep(2000);
       
	}

 public void clickUssdEditTouchpoint() throws InterruptedException {
		
		Thread.sleep(2000);
		jswait.loadClick(ussdTouchpointEdit);
		Thread.sleep(2000);
       
	}
 
 
 public void clickDeleteUSSDTouchpoint() throws InterruptedException {
		jswait.loadClick(ussdDeleteTouchpoint);
		jswait.loadClick(ussdDeleteYes);
		
	}
	public void navigateToSms() throws InterruptedException {
		jswait.loadClick(smsTouchpoints);
	}
	public void navigateToUssd() throws InterruptedException {
		jswait.loadClick(ussdTouchpoints);
	}
	public void navigateToTrigger() throws InterruptedException {
		jswait.loadClick(triggerTouchpoint);
	}
	public void navigateToApi() throws InterruptedException {
		jswait.loadClick(apiTouchpoints);
	}
	public void navigateTosmartphone() throws InterruptedException {
		jswait.loadClick(smartphoneTouchpoints);
	}
	public void navigateToCustomerCare() throws InterruptedException {
		jswait.loadClick(customerCareTouchpoints);
	}
	public void clickCreateNewTouchpoint() throws InterruptedException {
		jswait.loadClick(clickCreateNewTouchpoint);
	}
	
	public void verifyEditButtonForSmartphoneTouchpoint() throws InterruptedException {
		Thread.sleep(2000);
		assertTrue(editSmartphoneTouchpoint.isDisplayed());
	}
	
	
	
	public void clickDeleteCustTouchpoint() throws InterruptedException {
		jswait.loadClick(custDeleteTouchpoint);
		jswait.loadClick(custDeleteYes);
		
	}
	
	public void clickCustEditTouchpoint() throws InterruptedException {
		
	
			jswait.loadClick(editTouchpoint1);
		
	}
	
	public void verifyEditButtonForCustomercareTouchpoint() throws InterruptedException {
		
		Thread.sleep(2000);
		assertTrue(editTouchpoint1.isDisplayed());
	
}
	
public void verifyEditButtonForAPITouchpoint() throws InterruptedException {
		
	Thread.sleep(2000);
		assertTrue(Apiedittouchpoints.isDisplayed());
	
}
public void verifyEditButtonForUSSDTouchpoint() throws InterruptedException {
	
	    Thread.sleep(2000);
		assertTrue(ussdTouchpointEdit.isDisplayed());
	
}
public void verifyEditButtonForSMSTouchpoint() throws InterruptedException {
		
	Thread.sleep(10000);
		assertTrue(smstouchpointedit.isDisplayed());
	
}

public void verifyEditButtonForTriggerTouchpoint() throws InterruptedException {
	
	Thread.sleep(2000);
	assertTrue(editTriggerTouchpoint.isDisplayed());

}

	
	
	//sms touchpoint functions
	public void smsClickSave() throws InterruptedException {
		jswait.loadClick(smsFormSaveButton);
	}
	public void smsClickCancel() throws InterruptedException {
		jswait.loadClick(smsFormCancelButton);
	}
	public void smsSelectShortCode() throws InterruptedException {
//		jswait.loadSendKeys(smsFormShortCodeSelector,"1024");
		jswait.loadClick(smsFormShortCodeSelector);
//		Thread.sleep(8000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(smsFormShortCode1).click().build().perform();
		jswait.loadClick(smsFormShortCode1);
	}
	
	//--------------------------------------------------------///
	
	public void smsSelectnewShortCode() throws InterruptedException {
//		jswait.loadSendKeys(smsFormShortCodeSelector,"1024");
		jswait.loadClick(smsFormShortCodeSelector);
//		Thread.sleep(8000);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(smsFormShortCode1).click().build().perform();
		jswait.loadClick(smsFormShortCode2);
	}
	
	
	
	
	
	
	
	public void smsEnterKeyword(String name) throws InterruptedException {
		jswait.loadSendKeys(smsFormKeywordInput, name);
	}
	public void smsSelectPrioritizationLogic() throws InterruptedException {
		jswait.loadClick(smsFormPrioritizationLogicSelector);
		Thread.sleep(2000);
		jswait.loadClick(smsFormPrioritizationLogicFIFO);
	}
	public void smsSelectPrioritizationRule() throws InterruptedException {
		jswait.loadClick(smsFormPrioritizationRuleSelector);
		jswait.loadClick(smsFormPrioritizationRuleFIFO);
	}
	
	public void smsSelectPrioritizationRulelifo() throws InterruptedException {
		jswait.loadClick(smsFormPrioritizationRuleSelector);
		jswait.loadClick(smsFormPrioritizationRuleLIFO);
	}
	
	public void smsEnterRefreshEvery(String name) throws InterruptedException {
		jswait.loadSendKeys(smsFormRefreshEvery, name);
	}
	public void smsSelectTimeInterval() throws InterruptedException {
		jswait.loadClick(smsFormTimeIntervalSelector);
		jswait.loadClick(smsFormTimeInterval1);
	}
	public void smsEnterMaximumOffers(String name) throws InterruptedException {
		jswait.loadSendKeys(smsFormMaximumOffers, name);
	}
	public void enterSmsTouchpointDetails(String keyword) throws InterruptedException, IOException {
		smsEnterKeyword(keyword);
		smsSelectPrioritizationLogic();
		smsSelectShortCode();
		eh.setExcelFile("touchpointInputData", "smsTouchpoint");
 		String name = smsTouchpointName.getText();
 		eh.setCell(1, 0, name);
		
//		smsSelectPrioritizationRule();
		smsEnterRefreshEvery("3");
		smsSelectTimeInterval();
		smsEnterMaximumOffers("5");
	}
	
	public void editSmsTouchpointDetails(String keyword) throws InterruptedException, IOException {
		smsEnterKeyword(keyword);
		eh.setExcelFile("touchpointInputData", "smsTouchpoint");
 		String name = smsTouchpointName.getText();
 		eh.setCell(1, 0, name);
		smsSelectPrioritizationLogic();
//		smsSelectPrioritizationRule();
		smsEnterRefreshEvery("3");
		smsSelectTimeInterval();
		smsEnterMaximumOffers("5");
		smsClickSave();
	}
	
	
	public void editSmsTouchpointDetailsshortcode(String keyword) throws InterruptedException {
		smsEnterKeyword(keyword);
		smsSelectnewShortCode();
		smsSelectPrioritizationLogic();
//		smsSelectPrioritizationRulelifo();
		smsEnterRefreshEvery("8");
		smsSelectTimeInterval();
		smsEnterMaximumOffers("5");
		smsClickSave();
	}
	public void custedittouchpointcheck(String name) throws Exception {
		
		//String newname=jswait.getTextFormElement("(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'edited apiTouch')]");
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath(".//span[contains(.,'"+name+"')]")).isDisplayed());
//		System.out.println(newname);
//       Assert.assertEquals(name,newname);
//		System.out.println("edit success");
//		
		
		
	}


public void custClickSave() throws InterruptedException {
		jswait.loadClick(custFormSaveButton);
	}

public void smartClickSave() throws InterruptedException {
	jswait.loadClick(smartFormSaveButton);
}




public void custEnterTouchpointName(String name) throws InterruptedException {
	jswait.loadSendKeys(custFormTouchpointName1, name);
}


/*public void clickEditTouchpoint() throws InterruptedException {
	
	
	
	Thread.sleep(5000);
	jswait.checkClickable(editTouchpoint);
	boolean flag=jswait.checkVisible(editTouchpoint);
	if (flag==true){
		jswait.loadClick(editTouchpoint);}
	else{System.out.println("cant find element");}
}*/


public void editTouchpointWithAlertValue() throws Throwable {
	Thread.sleep(3000);
	custEnterTouchpointName("<script>alert(document.cookies)</script>");
	custClickSave();
	
	String newname="<script>alert(document.cookies)</script>";
	  System.out.println(newname);
	  custedittouchpointcheck(newname);
	  clickDeleteCustTouchpoint();
}



public void editCustomerCareTouchpoint() throws Throwable {
	Thread.sleep(3000);
	
	    Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String newname = "Touch point edit";
		newname =  newname.replaceAll("[0-9]", "")+n;
	   custEnterTouchpointName(newname);
	  custClickSave();
	  System.out.println(newname);
	  custedittouchpointcheck(newname);
	  clickDeleteCustTouchpoint();
}

public void editCustomerCareTouchpointWithSecurityAlert() throws Throwable {
	Thread.sleep(3000);
	custEnterTouchpointName("<script>alert(\"Security error\")</script>");
	custClickSave();
	
	String newname="<script>alert(\"Security error\")</script>";
	  System.out.println(newname);
	  custedittouchpointcheck(newname);
	  clickDeleteCustTouchpoint();
}

public void createTouchpointWithAlertValue() throws Throwable {
	
	Thread.sleep(3000);
	custEnterTouchpointName("<script>alert(document.cookies)</script>");
	custTriggerSelectPrioritizationLogic();
//	custTriggerSelectPrioritizationRule();
	custTriggerEnterRefreshEvery("3");
	custTriggerSelectTimeInterval();
	custTriggerEnterMaximumOffers("4");
	custClickSave();
	String newname="<script>alert(document.cookies)</script>";
	System.out.println(newname);
	custedittouchpointcheck(newname);
	clickDeleteCustTouchpoint();
	
}

public void createNewCustomerCareTouchpointAndDelete() throws Throwable {
	
	Thread.sleep(3000);
	Random rn = new Random();
	int  n = rn.nextInt(5000) + 1;
	String newname = "TouchPointDelete"+n;
	custEnterTouchpointName(newname);
	custTriggerSelectPrioritizationLogic();
//	custTriggerSelectPrioritizationRule();
	custTriggerEnterRefreshEvery("3");
	custTriggerSelectTimeInterval();
	custTriggerEnterMaximumOffers("4");
	custClickSave();
	System.out.println(newname);
	custedittouchpointcheck(newname);
	clickDeleteCustTouchpoint();
	
}

public void deleteUSSDTouchpoint() throws Throwable {
	
	clickDeleteUSSDTouchpoint();
	
}

	public void createSmsTouchpoint(String keyword) throws InterruptedException, IOException {
		clickCreateNewTouchpoint();
		enterSmsTouchpointDetails(keyword);
		smsClickSave();
		Thread.sleep(3000);
	}
	public String getSmsFormHeading() throws InterruptedException {
		Exception wrongForm = new Exception("wrong form displayed");
		try{
			smsFormDialogBox.getAttribute("display");
			throw wrongForm;
		}catch(Exception e) {
			
		}
		jswait.waitUntil(smsFormHeading);
		return smsFormHeading.getText();
	}
	//--------------------------------//
	public void smsedittouchpointsclick() throws InterruptedException {
		Thread.sleep(5000);
		jswait.checkClickable(smstouchpointedit);
		boolean flag=jswait.checkVisible(smstouchpointedit);
		if (flag==true){
		jswait.loadClick(smstouchpointedit);}
		else{System.out.println("cant find element");}
		
		
	}
	
	
	public void smsedittouchpointcheck(String name) throws Exception {
		Thread.sleep(5000);
		jswait.waitUntil("//sms-touchpoint-grid//iron-list//data-table-row//data-table-cell//span[contains(.,'"+name+"')]");
	
	}
	public void deletesmsTouchpoint(String name) throws InterruptedException{
		Thread.sleep(4000);
		jswait.loadClick("//*[@class='x-scope data-table-row-0 style-scope sms-touchpoint-grid']/div[1]/data-table-cell[1]/span[contains(.,'"+name+"')]//following::iron-icon[2]");
	jswait.loadClick(smsdeleteyes);
	}
	
	
	public void editsmsTouchpointDetailsvalidation(String keyword) throws InterruptedException {
		System.out.println("inside sms validation");
		System.out.println(keyword);
		smsEnterKeyword(keyword);
//		smsSelectShortCode();
		smsSelectPrioritizationLogic();
//		smsSelectPrioritizationRule();
		smsEnterRefreshEvery("3");
		smsSelectTimeInterval();
		smsEnterMaximumOffers("");
		smsClickSave();
		
		boolean flag=jswait.checkVisible(smsvalidation);
		System.out.println(flag);
		if (flag==true){
			}
			else{System.out.println("cant find element");}
	}
	public void createsmsTouchpointDetailsvalidation(String keyword) throws InterruptedException, IOException {
		System.out.println("inside sms validation");
		navigateToSms();
		clickCreateNewTouchpoint();
		System.out.println(keyword);
		enterSmsTouchpointDetails(keyword);
		smsClickSave();
		
		boolean flag=jswait.checkVisible(smsvalidation);
		System.out.println(flag);
		if (flag==true){
			}
			else{System.out.println("cant find element");}
	}
	
	
	
	
	
	
	
	
	//trigger touchpoint functions
	public void triggerEnterTouchpointName(String name) throws InterruptedException {
		jswait.loadSendKeys(triggerTouchpointName, name);
	}
	public void selectTrigger() throws InterruptedException {
		jswait.loadClick(selectTrigger);
		jswait.loadClick(triggerFormTriggerSelect);
	}
	public void triggerClickSave() throws InterruptedException {
		jswait.loadClick(triggerFormSaveButton);
	}
	public void triggerClickCancel() throws InterruptedException {
		jswait.loadClick(triggerFormCancelButton);
	}
	public void triggerSelectPrioritizationLogic() throws InterruptedException {
		jswait.loadClick(triggerFormProritizationLogicSelector);
		Thread.sleep(2000);
		jswait.loadClick(smsFormPrioritizationLogicFIFO);
	}
	
	public void custTriggerSelectPrioritizationLogic() throws InterruptedException {
		jswait.loadClick(custTriggerFormPrioritizationLogicSelector);
		jswait.loadClick(custTriggerFormPrioritizationLogicFIFO);
	}
	public void triggerSelectPrioritizationRule() throws InterruptedException {
		jswait.loadClick(triggerFormPrioritizationRuleSelector);
		jswait.loadClick(triggerFormPrioritizationRuleFIFO);
	}
	public void triggerFormPrioritizationRuleLIFO() throws InterruptedException {
		jswait.loadClick(triggerFormPrioritizationRuleSelector);
		jswait.loadClick(triggerFormPrioritizationRuleLIFO);
	}
	
	
	public void custTriggerSelectPrioritizationRule() throws InterruptedException {
		jswait.loadClick(custTriggerFormPrioritizationRuleSelector);
		jswait.loadClick(custTriggerFormPrioritizationRuleFIFO);
	}
	public void triggerEnterRefreshEvery(String name) throws InterruptedException {
		jswait.loadSendKeys(triggerFormRefreshEvery, name);
	}
	public void custTriggerEnterRefreshEvery(String name) throws InterruptedException {
		jswait.loadSendKeys(custTriggerFormRefreshEvery, name);
	}
	public void triggerSelectTimeInterval() throws InterruptedException {
		jswait.loadClick(triggerFormTimeIntervalSelector);
		jswait.loadClick(triggerFormTimeInterval1);
	}
	public void custTriggerSelectTimeInterval() throws InterruptedException {
		jswait.loadClick(custTriggerFormTimeIntervalSelector);
		jswait.loadClick(custTriggerFormTimeInterval);
	}
	public void triggerEnterMaximumOffers(String name) throws InterruptedException {
		jswait.loadSendKeys(triggerFormMaximumOffers, name);
	}
	public void custTriggerEnterMaximumOffers(String name) throws InterruptedException {
		jswait.loadSendKeys(custTriggerFormMaximumOffers, name);
	}
	public void enterTriggerTouchpointDetails(String name) throws InterruptedException {
		triggerEnterTouchpointName(name);
		
		triggerSelectPrioritizationLogic();
		selectTrigger();
		jswait.loadClick("//label[contains(.,'Inventory')]//following::paper-icon-button[2]");
		Thread.sleep(2000);
		jswait.loadSendKeys("//label[contains(.,'Inventory')]//..//input", "Unlimited");
//		triggerSelectPrioritizationRule();
		jswait.loadClick("(//vaadin-combo-box-item[contains(..,'sel_unlimited')])[2]");
		triggerEnterRefreshEvery("3");
		triggerSelectTimeInterval();
//		triggerEnterMaximumOffers("5");
	}
	public void editTriggerTouchpointDetails(String name) throws InterruptedException {
		triggerEnterTouchpointName(name);
		triggerSelectPrioritizationLogic();
		selectTrigger();
//		triggerFormPrioritizationRuleLIFO();
		triggerEnterRefreshEvery("2");
		triggerSelectTimeInterval();
//		triggerEnterMaximumOffers("2");
		triggerClickSave();
	}
	public void createTriggerTouchpoint(String keyword) throws InterruptedException {
		clickCreateNewTouchpoint();
		enterTriggerTouchpointDetails(keyword);
		
		triggerClickSave();
	}
	public void editTriggerTouchpoint(String keyword) throws InterruptedException {
		triggereditclick();
		editTriggerTouchpointDetails(keyword);
		
		jswait.checkVisible(triggerFieldValidation);
	}
	//customer care functions
	public void customerCareSelectPrioritizationLogic() throws InterruptedException {
		jswait.loadClick(customerCareFormPrioritizationLogicSelector);
		jswait.loadClick(customerCareFormPrioritizationLogicFIFO);
	}
	public void customerCareSelectPrioritizationRule() throws InterruptedException {
		jswait.loadClick(customerCareFormPrioritizationRuleSelector);
		jswait.loadClick(customerCareFormPrioritizationRuleFIFO);
	}
	public void customerCareEnterRefreshEvery(String name) throws InterruptedException {
		jswait.loadSendKeys(customerCareFormRefreshEvery, name);
	}
	public void customerCareSelectTimeInterval() throws InterruptedException {
		jswait.loadClick(customerCareFormTimeIntervalSelector);
		jswait.loadClick(customerCareFormTimeInterval1);
	}
	public void customerCareEnterMaximumOffers(String name) throws InterruptedException {
		jswait.loadSendKeys(customerCareFormMaximumOffers, name);
	}
	public void enterCustomerCareTouchpointDetails(String keyword) throws InterruptedException {
		customerCareEnterTouchpointName(keyword);
		customerCareSelectPrioritizationLogic();
//		customerCareSelectPrioritizationRule();
		customerCareEnterRefreshEvery("3");
		customerCareSelectTimeInterval();
		customerCareEnterMaximumOffers("5");
	}
	public void createCustomerCareTouchpoint(String keyword) throws InterruptedException {
		clickCreateNewTouchpoint();
		enterCustomerCareTouchpointDetails(keyword);
		customerCareClickSave();
	}
	public void customerCareEnterTouchpointName(String name) throws InterruptedException {
		jswait.loadSendKeys(customerCareFormTouchpointName, name);
	}
	public void customerCareEnterMaximumOffers() throws InterruptedException {
		jswait.loadSendKeys(customerCareFormMaximumOffers, "5");
	}
	public void customerCareClickSave() throws InterruptedException {
		jswait.loadClick(customerCareFormSaveButton);
	}
	public void customerCareClickCancel() throws InterruptedException {
		jswait.loadClick(customerCareFormCancelButton);
	}
	public String getCustomerCareFormHeading() throws InterruptedException {
		jswait.waitUntil(customerCareFormHeading);
		return customerCareFormHeading.getText();
	}
	public boolean checkCustomerCareFormDisplayed() {
		if(customerCareForm.isDisplayed())
			return true;
		return false;
	}
	//api touchpoint functions
	public void apiEnterTouchpointName(String name) throws InterruptedException {
		jswait.loadSendKeys(apiFormTouchpointName, name);
	}
	
	
	
	
	
	
		public void apiClickSave() throws InterruptedException {
			jswait.loadClick(apiFormSaveButton);
		}
		public void apiClickCancel() throws InterruptedException {
			jswait.loadClick(apiFormCancelButton);
		}
		public void apiSelectPrioritizationLogicFifo() throws InterruptedException {
			jswait.loadClick(apiFormPrioritizationLogicSelector);
			jswait.loadClick(apiFormPrioritizationLogicFIFO);
		}
		public void apiSelectPrioritizationLogicLifo() throws InterruptedException {
			jswait.loadClick(apiFormPrioritizationLogicSelector);
			jswait.loadClick(apiFormPrioritizationLogicLIFO);
		}
		public void apiSelectPrioritizationRule() throws InterruptedException {
			jswait.loadClick(apiFormPrioritizationRuleSelector);
			jswait.loadClick(apiFormPrioritizationRuleFIFO);
		}
		
		public void apiSelectPrioritizationRulelifo() throws InterruptedException {
			jswait.loadClick(apiFormPrioritizationRuleSelector);
			jswait.loadClick(apiFormPrioritizationRuleLIFO);
		}
		
		public void apiEnterRefreshEvery(String name) throws InterruptedException {
			jswait.loadSendKeys(apiFormRefreshEvery, name);
		}
		public void apiSelectTimeIntervalHours() throws InterruptedException {
			jswait.loadClick(apiFormTimeIntervalSelector);
			jswait.loadClick(apiFormTimeIntervalHours);
		}
		public void apiSelectTimeIntervalDays() throws InterruptedException {
			jswait.loadClick(apiFormTimeIntervalSelector);
			jswait.loadClick(apiFormTimeIntervalDays);
		}
		public void apiSelectApplicationTypeGeneral() throws InterruptedException {
			jswait.loadClick(apiFormApplicationType);
			jswait.loadClick(apiFormApplicationTypeGeneral);
			
		}
		public void apiSelectApplicationTypeUssd() throws InterruptedException {
			jswait.loadClick(apiFormApplicationType);
			jswait.loadClick(apiFormApplicationTypeUssd);
			
		}
		public void apiSelectEventForTrackingRecommended() throws InterruptedException {
			jswait.loadClick(apiFormEventForTracking);
			jswait.loadClick(apiFormEventForTrackingRecommendedEvent);
		}
		public void apiSelectEventForTrackingAccepted() throws InterruptedException {
			jswait.loadClick(apiFormEventForTracking);
			jswait.loadClick(apiFormEventForTrackingAcceptedEvent);
		}
		public void apiEnterMaximumOffers(String name) throws InterruptedException {
			jswait.loadSendKeys(apiFormMaximumOffers, name);
		}
		public void enterApiTouchpointDetails(String keyword) throws InterruptedException {
			apiEnterTouchpointName(keyword);
			apiSelectApplicationTypeGeneral();
			apiSelectEventForTrackingAccepted();
			apiSelectPrioritizationLogicFifo();
//			apiSelectPrioritizationRule();
			apiEnterRefreshEvery("3");
			apiSelectTimeIntervalHours();
			apiEnterMaximumOffers("5");
		}
		
		public void enterApiTouchpointDetails(String name,String applicationType,String eventForTracking,String refreshEvery, String timeInterval,String prioritizationLogic,String maximumOffers) throws InterruptedException {
			apiEnterTouchpointName(name);
			if(applicationType.contentEquals("General")) {
				apiSelectApplicationTypeGeneral();
			}
			else if(applicationType.contentEquals("USSD")) {
				apiSelectApplicationTypeUssd();
				ussdSelectUssdApplicationInApi();
			}
			if(eventForTracking.contentEquals("Accepted Event")) {
				apiSelectEventForTrackingAccepted();
			}
			else if(eventForTracking.contentEquals("Recommended Event")) {
				apiSelectEventForTrackingRecommended();
			}
			if(prioritizationLogic.contentEquals("FIFO")) {
				apiSelectPrioritizationLogicFifo();
			}
			else if(prioritizationLogic.contentEquals("LIFO")) {
				apiSelectPrioritizationLogicLifo();
			}
			
//			apiSelectPrioritizationRule();
			apiEnterRefreshEvery(refreshEvery);
			if(timeInterval.contentEquals("Hours")) {
				apiSelectTimeIntervalHours();
			}
			else if(timeInterval.contentEquals("Days")) {
				apiSelectTimeIntervalDays();
			}
			apiEnterMaximumOffers(maximumOffers);
		}
		
		public void editapiTouchpointDetails(String keyword) throws InterruptedException {
			apiEnterTouchpointName(keyword);
			apiSelectApplicationTypeGeneral();
			apiSelectEventForTrackingAccepted();
			apiSelectPrioritizationLogicFifo();
//			apiSelectPrioritizationRulelifo();
			apiEnterRefreshEvery("5");
			apiSelectTimeIntervalHours();
			apiEnterMaximumOffers("8");
			apiClickSave();
		}
		public void editUssdTouchpointDetails(String keyword) throws InterruptedException {
			ussdEnterTouchpointName(keyword);
			ussdClickSave();
		}
		
		public void editapiTouchpointDetailsvalidation(String keyword) throws InterruptedException {
			apiEnterTouchpointName(keyword);
			apiSelectApplicationTypeGeneral();
			apiSelectEventForTrackingAccepted();
			apiSelectPrioritizationLogicFifo();
//			apiSelectPrioritizationRulelifo();
			apiEnterRefreshEvery("5");
			apiSelectTimeIntervalHours();
			apiEnterMaximumOffers("");
			apiClickSave();
			boolean flag=jswait.checkVisible(apivalidation);
			System.out.println(flag);
			if (flag==true){
				}
				else{System.out.println("cant find element");}
		}
		
		
		
		public void createApiTouchpoint(String name,String applicationType,String eventForTracking,String refreshEvery, String timeInterval,String prioritizationLogic,String maximumOffers) throws InterruptedException {
			clickCreateNewTouchpoint();
			System.out.println(name+applicationType+eventForTracking+refreshEvery+timeInterval+prioritizationLogic+maximumOffers);
			enterApiTouchpointDetails(name,applicationType,eventForTracking,refreshEvery, timeInterval, prioritizationLogic, maximumOffers);
			apiClickSave();
		}
		
		
		
		
		
		public void Apiedittouchpointsclick() throws InterruptedException {
			Thread.sleep(5000);
			jswait.checkClickable(Apiedittouchpoints);
			boolean flag=jswait.checkVisible(Apiedittouchpoints);
			if (flag==true){
			jswait.loadClick(Apiedittouchpoints);}
			else{System.out.println("cant find element");}
			
			
		}
		
		public void apiedittouchpointcheck(String name) throws Exception {
			Thread.sleep(5000);
			boolean flag=jswait.checkVisible(apiedittouchpointcheck);
			String newname=jswait.getTextFormElement("(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'"+name+"')]");
			System.out.println(newname);
Assert.assertEquals(name,newname);
			System.out.println("edit success");
			
			
			
		}
		public void ussdedittouchpointcheck(String name) throws Exception {
			Thread.sleep(5000);
			boolean flag=jswait.checkVisible(apiedittouchpointcheck);
			String newname=jswait.getTextFormElement("//data-table-cell[contains(.,'"+name+"')]");
			System.out.println(newname);
Assert.assertEquals(name,newname);
			System.out.println("edit success");
			
			
			
		}
		public void clickToucpointDeleteButton(String touchpointName) throws InterruptedException {
			jswait.loadClick("//span[contains(.,'"+touchpointName+"')]/../..//paper-icon-button[2]//iron-icon[1]");
		}
		public void apideletetouchpointcheck(String name) throws Exception {
			Thread.sleep(5000);
//			String newname=jswait.getTextFormElement("(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'"+name+"')]");
			System.out.println(name);
			clickToucpointDeleteButton(name);
			jswait.loadClick(apideleteyes);
//			checktouchpointsdeleteapi();
			Thread.sleep(5000);
			try {
				clickToucpointDeleteButton(name);
				Assert.assertTrue("element not deleted after clicking delte, waiting for 5 SEC", false);
			}
			catch(Exception e) {
				
			}
		}
		
		public void ussddeletetouchpointcheck(String name) throws Exception {
			Thread.sleep(5000);
			jswait.loadClick("//data-table-cell[contains(.,'"+name+"')]/..//paper-icon-button[2]");
			System.out.println(name);
			jswait.loadClick(ussddeleteyes);
			jswait.failIfVisible("//data-table-cell[contains(.,'"+name+"')]/..//paper-icon-button[2]");
		}
		
		
		
		
		public void checktouchpointsdeleteapi() throws Exception{
			jswait.checkVisible(deletewarningapi);
			try {
			
			Assert.assertTrue("checkpoint del worked", true);
		  } catch (Exception e){
			  
		   	 }
		}
		
		
		public String getApiFormHeading() throws InterruptedException {
			Exception wrongForm = new Exception("wrong form displayed");
			try{
				smsFormDialogBox.getAttribute("display");
				throw wrongForm;
			}catch(Exception e) {
				
			}
			jswait.waitUntil(smsFormHeading);
			return smsFormHeading.getText();
		}
		//ussd touchpoint functions
		public void ussdEnterTouchpointName(String name) throws InterruptedException {
			jswait.loadSendKeys(ussdFormTouchpointName, name);
		}
		public void ussdClearTouchpointName() throws InterruptedException {
			ussdFormTouchpointName.clear();
		}
		
			public void ussdClickSave() throws InterruptedException {
				jswait.loadClick(ussdFormSaveButton);
			}
			public void ussdClickCancel() throws InterruptedException {
				jswait.loadClick(ussdFormCancelButton);
			}
			public void ussdSelectPrioritizationLogic() throws InterruptedException {
				jswait.loadClick(ussdFormPrioritizationLogicSelector);
				jswait.loadClick(ussdFormPrioritizationLogicFIFO);
			}
			public void ussdSelectPrioritizationRule() throws InterruptedException {
				jswait.loadClick(ussdFormPrioritizationRuleSelector);
				jswait.loadClick(ussdFormPrioritizationRuleFIFO);
			}
			public void ussdEnterRefreshEvery(String name) throws InterruptedException {
				jswait.loadSendKeys(ussdFormRefreshEvery, name);
			}
			public void ussdClearRefreshEvery() throws InterruptedException {
				ussdFormRefreshEvery.clear();
			}
			public void ussdSelectTimeInterval() throws InterruptedException {
				jswait.loadClick(ussdFormTimeIntervalSelector);
				jswait.loadClick(ussdFormTimeInterval1);
			}
			public void ussdSelectUssdApplication() throws InterruptedException {
				jswait.loadSendKeys(ussdFormUssdApplicationSelector,SELENIUM_USSD_APP);
				Thread.sleep(2000);
				jswait.loadClick(ussdFormUssdApplication1);
				
			}
			public void ussdSelectUssdApplicationInApi() throws InterruptedException {
				jswait.loadSendKeys(ussdFormUssdApplicationSelectorInApi,SELENIUM_USSD_APP);
				Thread.sleep(2000);
				jswait.loadClick(ussdFormUssdApplication1);
				
			}
			
			public void ussdClearUssdApplication() throws InterruptedException {
				jswait.loadClick(ussdFormUssdApplicationClearButton);
				
				
			}
			
			
			public void ussdEnterMaximumOffers(String name) throws InterruptedException {
				jswait.loadSendKeys(ussdFormMaximumOffers, name);
			}
			public void ussdClearMaximumOffers() throws InterruptedException {
				ussdFormMaximumOffers.clear();
			}
			public void enterUssdTouchpointDetails(String keyword) throws InterruptedException {
				ussdEnterTouchpointName(keyword);
				ussdSelectPrioritizationLogic();
				ussdSelectUssdApplication();

//				ussdSelectPrioritizationRule();
				ussdEnterRefreshEvery("3");
				ussdSelectTimeInterval();
				ussdEnterMaximumOffers("5");
			}
			
			public void editUssdTouchpointWithoutFillingMandatoryFields() throws InterruptedException {
				ussdClearTouchpointName();
				ussdClearUssdApplication();
				ussdSelectPrioritizationLogic();
//				ussdSelectPrioritizationRule();
				ussdClearRefreshEvery();
				ussdSelectTimeInterval();
				ussdClearMaximumOffers();
			}
			public void createUssdTouchpoint(String keyword) throws InterruptedException {
				clickCreateNewTouchpoint();
				enterUssdTouchpointDetails(keyword);
				ussdClickSave();
			}
			
			public void editUSSDTouchpointWithoutFillingMandatoryFields() throws InterruptedException {
				clickUssdEditTouchpoint();
				editUssdTouchpointWithoutFillingMandatoryFields();
				ussdClickSave();
			}
			public void createUssdTouchpointWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				ussdClickSave();
			}
			
			public void createAPITouchpointWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				apiClickSave();
			}
			public void createTriggerTouchpointWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				triggerClickSave();

			}
			
			//----------------*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--------------------------------------***///
			public void createSMSTouchpointWithoutMandatoryFields(String name) throws InterruptedException {
				clickCreateNewTouchpoint();
//				smsEnterKeyword(name);
//				smsClickSave();
//				smsSelectShortCode();
//				smsSelectPrioritizationLogic();
//				smsClickSave();
////				smsSelectPrioritizationRule();
//				smsEnterRefreshEvery("3");
//				smsSelectTimeInterval();
//				smsClickSave();
//				smsEnterMaximumOffers("5");
				
				
				smsClickSave();

			}
			
			
			
			
			
			
			
			
			
			
			

			//-------------------------------------------//
			public void createCustomerCareTouchpointWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				custClickSave();

			}
			public void createCustomerSmartPhoneAppWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				smartClickSave();

			}
			
			
			
			
			public void createCustomerSmartPhone() throws InterruptedException {
				clickCreateNewTouchpoint();
				
				smartClickSave();

			}
			
			
			public void verifyValidationErrorMessagesInUSSDEdit() throws Throwable {
				
				int sizename= ussdEditValidation.size();
				System.out.println("ussdEditValidation: "+sizename);
				if(ussdCreateValidation.size()>0) {
					
					for(WebElement NameValidation: ussdEditValidation ) {
						
						assertTrue(NameValidation.isDisplayed());
					}
				}
				//assertTrue(ussdApplicationValidation.isDisplayed());
				assertTrue(ussdFormSaveButton.isDisplayed());
				
			}
			
     public void verifyValidationErrorMessagesInAPICreation() throws Throwable {
				
				assertTrue(apiNameValidation.isDisplayed());
    	        int sizename= apiCreateValidation.size();
				System.out.println("apiCreateValidation: "+sizename);
				if(apiCreateValidation.size()>0) {
					
					for(WebElement NameValidation: apiCreateValidation ) {
						
						assertTrue(NameValidation.isDisplayed());
					}
				}
				
				assertTrue(apiFormSaveButton.isDisplayed());
			}
     
     public void verifyValidationErrorMessagesInTriggerCreation() throws Throwable {
			
			
	        int sizename= triggerCreateValidation.size();
			System.out.println("triggerCreateValidation: "+sizename);
			if(triggerCreateValidation.size()>0) {
				
				for(WebElement NameValidation: triggerCreateValidation ) {
					
					assertTrue(NameValidation.isDisplayed());
				}
			}
			
			assertTrue(triggerFieldValidation.isDisplayed());
			assertTrue(triggerFormSaveButton.isDisplayed());
		}
     
     public void verifyValidationErrorMessagesInSMSCreation() throws Throwable {
			
			
	        int sizename= smsCreateValidation.size();
			System.out.println("smsCreateValidation: "+sizename);
			if(smsCreateValidation.size()>0) {
				
				for(WebElement NameValidation: smsCreateValidation ) {
					
					assertTrue(NameValidation.isDisplayed());
				}
			}
			
			assertTrue(shortCodeValidation.isDisplayed());
			assertTrue(smsFormSaveButton.isDisplayed());
		}
     
     public void verifyValidationErrorMessagesInCustomercareCreation() throws Throwable {
			
			
	        int sizename= customercareCreateValidation.size();
			System.out.println("customercareCreateValidation: "+sizename);
			if(customercareCreateValidation.size()>0) {
				
				for(WebElement NameValidation: customercareCreateValidation ) {
					
					assertTrue(NameValidation.isDisplayed());
				}
			}
			
			
			assertTrue(custFormSaveButton.isDisplayed());
		}
     
      public void verifyValidationErrorMessagesInSmartPhoneApp() throws Throwable {
			
			
	        int sizename= smartCreateValidation.size();
			System.out.println("smartCreateValidation: "+sizename);
			if(smartCreateValidation.size()>0) {
				
				for(WebElement NameValidation: smartCreateValidation ) {
					
					assertTrue(NameValidation.isDisplayed());
				}
			}
			assertTrue(smartFormSaveButton.isDisplayed());
		}
      
      public void verifyValidationErrorMessagesInUSSD() throws Throwable {
			
			
	        int sizename= ussdCreateValidation.size();
			System.out.println("ussdCreateValidation: "+sizename);
			if(ussdCreateValidation.size()>0) {
				
				for(WebElement NameValidation: ussdCreateValidation ) {
					
					assertTrue(NameValidation.isDisplayed());
				}
			}
			assertTrue(ussdFormSaveButton.isDisplayed());
		}
     
			
			public String getUssdFormHeading() throws InterruptedException {
				Exception wrongForm = new Exception("wrong form displayed");
				try{
					smsFormDialogBox.getAttribute("display");
					throw wrongForm;
				}catch(Exception e) {
					
				}
				jswait.waitUntil(smsFormHeading);
				return smsFormHeading.getText();
			}
			public void deleteTriggerTouchpoint(String name) throws InterruptedException{
				jswait.loadClick("//data-table-cell[contains(.,'"+name+"')]/..//paper-icon-button[2]");
				jswait.loadClick(triggerDeleteYes);
			}
			public void checkTriggerMandatoryFields() throws InterruptedException{
				clickCreateNewTouchpoint();
				triggerEnterTouchpointName("mandatory");
				triggerClickSave();
				
				triggerSelectPrioritizationLogic();
//				triggerClickSave();
//				triggerSelectPrioritizationRule();
				triggerClickSave();
				selectTrigger();
				triggerClickSave();
				triggerEnterRefreshEvery("3");
				triggerClickSave();
				triggerSelectTimeInterval();
				triggerClickSave();
				triggerEnterMaximumOffers("5");
			}

			public void triggereditclick() throws InterruptedException {
				jswait.loadClick(triggereditclick);
				
				
			}
			
			
			
			
			
			public void verifyEditAndDeleteButtonTouchpoints() throws InterruptedException {
				
				if(custEditButtonList.size()>0) {
					for(WebElement EditButton: custEditButtonList ) {
						assertTrue(EditButton.isDisplayed());
						
					}
					
				}
				
				if(custDeleteTouchpointList.size()>0) {
					for(WebElement DeleteButton: custDeleteTouchpointList ) {
						assertTrue(DeleteButton.isDisplayed());	
					}
				}
				}
			
			
			
			
			
			//-------------------------------smartphoneapp--------------------------------------------//
			
			public void smartappEnterKeyword(String name) throws InterruptedException {
				jswait.loadSendKeys(smartphoneTouchpointsname, name);
			}
			
			public void appSelectPrioritizationLogic() throws InterruptedException {
				jswait.loadClick(appFormPrioritizationLogicSelector);
				jswait.loadClick(apiFormPrioritizationLogicFIFO);
			}
			public void appSelectPrioritizationRule() throws InterruptedException {
				jswait.loadClick(appFormPrioritizationRuleSelector);
				jswait.loadClick(appFormPrioritizationRuleFIFO);
			}
			
			public void appSelectPrioritizationRulelifo() throws InterruptedException {
				jswait.loadClick(appFormPrioritizationRuleSelector);
				jswait.loadClick(appFormPrioritizationRuleLIFO);
			}
			
			public void appEnterRefreshEvery(String name) throws InterruptedException {
				jswait.loadSendKeys(appFormRefreshEvery, name);
			}
			public void appSelectTimeInterval() throws InterruptedException {
				jswait.loadClick(appFormTimeIntervalSelector);
				jswait.loadClick(appFormTimeInterval1);
			}
			public void appEnterMaximumOffers(String name) throws InterruptedException {
				jswait.loadSendKeys(appFormMaximumOffers, name);
			}
			
			public void createCustomerSmartPhone(String name) throws InterruptedException {
				clickCreateNewTouchpoint();
				smartappEnterKeyword(name);
				appSelectPrioritizationLogic();
//				appSelectPrioritizationRule();
//				appSelectPrioritizationRulelifo();
				appEnterRefreshEvery(name);
				appSelectTimeInterval();
				appEnterMaximumOffers(name);
				smartClickSave();

			}
			
			public void customercaretouchpointsclick(String name) throws Exception {
				Thread.sleep(5000);
				
				boolean flag=jswait.checkClickable(".//data-table-cell[contains(@class,'customercare-touchpoint-grid style-scope') and contains(.//span,'"+name+"')]//following::paper-icon-button[2]");
				if (flag==true){
					Thread.sleep(2000);
				jswait.loadClick(".//data-table-cell[contains(@class,'customercare-touchpoint-grid style-scope') and contains(.//span,'"+name+"')]//following::paper-icon-button[2]");}
				
				else{jswait.scrollIntoView("#customerTable [class='style-scope iron-data-table x-scope iron-list-1']",".//data-table-cell[contains(@class,'customercare-touchpoint-grid style-scope') and contains(.//span,'"+name+"')]//following::paper-icon-button[2]");}
				
				
				
			}

			
			public void customerCareSelectPrioritizationLogicnew(String type) throws InterruptedException {
				
				if(type.equalsIgnoreCase("FIFO")){
				
				jswait.loadClick(customerCareFormPrioritizationLogicSelector);
				jswait.loadClick(customerCareFormPrioritizationLogicFIFO);
				}else if (type.equalsIgnoreCase("LIFO")){
				
					jswait.loadClick(customerCareFormPrioritizationLogicSelector);
					jswait.loadClick(customerCareFormPrioritizationLogicLIFO);
				}else if (type.equalsIgnoreCase("BEST FIT ALGORITHM")){
				
					jswait.loadClick(customerCareFormPrioritizationLogicSelector);
					jswait.loadClick(customerCareFormPrioritizationLogicBESTFITALGORITHM);
				}
				Thread.sleep(2000);
				jswait.loadClick("(//paper-button[contains(.,'Save')])[2]");
				
			
	}









































}
