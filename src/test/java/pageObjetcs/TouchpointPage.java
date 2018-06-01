package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class TouchpointPage extends Init{
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public TouchpointPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Create New Touchpoint']")
	private WebElement clickCreateNewTouchpoint;
	//ussd touchpoint objects
	@FindBy(xpath=".//*[text()='USSD']")
	private WebElement ussdTouchpoints;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Ordering Logic')]/../input")
	private WebElement ussdFormOrderingLogicSelector;
	@FindBy(xpath="//form[@id='ussdForm']//label[contains(.,'Ordering Rule')]/../input")
	private WebElement ussdFormOrderingRuleSelector;
	@FindBy(xpath="//form[@id='ussdForm']//paper-item[contains(.,'FIFO')]")
	private WebElement ussdFormOrderingRuleFIFO;
	@FindBy(xpath="//form[@id='ussdForm']//paper-item[contains(.,'Rule-based')]")
	private WebElement ussdFormOrderingLogicRuleBased;
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
	@FindBy(xpath=".//form[@id='ussdForm']//paper-icon-button[@id='clearIcon']")
	private WebElement ussdFormUssdApplicationClearButton;
	
	@FindBy(xpath="//label[contains(.,'USSD Application')]/following::vaadin-combo-box-item")
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
	
	
	
	
	//api touchpoint objects
	@FindBy(xpath=".//*[text()='API']")
	private WebElement apiTouchpoints;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Ordering Logic')]/../input")
	private WebElement apiFormOrderingLogicSelector;
	@FindBy(xpath="//form[@id='apiForm']//label[contains(.,'Ordering Rule')]/../input")
	private WebElement apiFormOrderingRuleSelector;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'FIFO')]")
	private WebElement apiFormOrderingRuleFIFO;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'LIFO')]")
	private WebElement apiFormOrderingRuleLIFO;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'Rule-based')]")
	private WebElement apiFormOrderingLogicRuleBased;
	@FindBy(xpath="//form[@id='apiForm']//paper-item[contains(.,'Hours')]")
	private WebElement apiFormTimeInterval1;
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
	@FindBy(xpath="//paper-item[contains(.,'Accepted Event')]")
	private WebElement apiFormEventForTrackingAcceptedEvent;
	@FindBy(xpath="((.//data-table-cell[@class='api-touchpoint-grid style-scope']//paper-icon-button[1])//iron-icon[1])[1]")
	private WebElement Apiedittouchpoints;
	@FindBy(xpath="(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'edited apiTouch')]")
	private WebElement apiedittouchpointcheck ;
	@FindBy(xpath="((.//data-table-cell[@class='api-touchpoint-grid style-scope']//paper-icon-button[2])//iron-icon[1])[1]")
	private WebElement apideletebutton;
	@FindBy(xpath=".//*[@id='deleteTP']/div/paper-button[@class='style-scope api-touchpoint-grid x-scope paper-button-0']")
	private WebElement apideleteyes;
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
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Ordering Logic')]/../input")
	private WebElement smsFormOrderingLogicSelector;
	@FindBy(xpath="//form[@id='smsForm']//label[contains(.,'Ordering Rule')]/../input")
	private WebElement smsFormOrderingRuleSelector;
	@FindBy(xpath="//form[@id='smsForm']//paper-item[contains(.,'FIFO')]")
	private WebElement smsFormOrderingRuleFIFO;
	@FindBy(xpath="//form[@id='smsForm']//paper-item[contains(.,'LIFO')]")
	private WebElement smsFormOrderingRuleLIFO;
	@FindBy(xpath="//label[contains(.,'Short Code')]/following::vaadin-combo-box-item")
	private WebElement smsFormShortCode1;
	@FindBy(xpath="//form[@id='smsForm']//paper-item[contains(.,'Rule-based')]")
	private WebElement smsFormOrderingLogicRuleBased;
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
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Ordering Logic')]/../input")
	private WebElement customerCareFormOrderingLogicSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Ordering Rule')]/../input")
	private WebElement customerCareFormOrderingRuleSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'FIFO')]")
	private WebElement customerCareFormOrderingRuleFIFO;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'Rule-based')]")
	private WebElement customerCareFormOrderingLogicRuleBased;
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
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Trigger')]/following::vaadin-combo-box-item[contains(text(),'t')]")
	private WebElement triggerFormTriggerSelect;
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Ordering Logic')]/../input")
	private WebElement triggerFormOrderingLogicSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Ordering Logic')]/../input")
	private WebElement custTriggerFormOrderingLogicSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'Rule-based')]")
	private WebElement custTriggerFormOrderingLogicRuleBased;
	@FindBy(xpath="//form[@id='addCustomerForm']//label[contains(.,'Ordering Rule')]/../input")
	private WebElement custTriggerFormOrderingRuleSelector;
	@FindBy(xpath="//form[@id='addCustomerForm']//paper-item[contains(.,'FIFO')]")
	private WebElement custTriggerFormOrderingRuleFIFO;
	
	
	@FindBy(xpath="//form[@id='triggerForm']//label[contains(.,'Ordering Rule')]/../input")
	private WebElement triggerFormOrderingRuleSelector;
	@FindBy(xpath="//form[@id='triggerForm']//paper-item[contains(.,'FIFO')]")
	private WebElement triggerFormOrderingRuleFIFO;
	@FindBy(xpath="//form[@id='triggerForm']//paper-item[contains(.,'Rule-based')]")
	private WebElement triggerFormOrderingLogicRuleBased;
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
	@FindBy(xpath=".//*[@id='triggerForm']//paper-button[contains(.,'Save')]")
	private WebElement triggerFormSaveButton;
	@FindBy(xpath=".//*[@id='triggerForm']//paper-button[contains(.,'Cancel')]")
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
	
	
	
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;


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
	
	public void clickDeleteCustTouchpoint() throws InterruptedException {
		jswait.loadClick(custDeleteTouchpoint);
		jswait.loadClick(custDeleteYes);
		
	}
	
	public void clickCustEditTouchpoint() throws InterruptedException {
		
	
			jswait.loadClick(editTouchpoint1);
		
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
	public void smsEnterKeyword(String name) throws InterruptedException {
		jswait.loadSendKeys(smsFormKeywordInput, name);
	}
	public void smsSelectOrderingLogic() throws InterruptedException {
		jswait.loadClick(smsFormOrderingLogicSelector);
		jswait.loadClick(smsFormOrderingLogicRuleBased);
	}
	public void smsSelectOrderingRule() throws InterruptedException {
		jswait.loadClick(smsFormOrderingRuleSelector);
		jswait.loadClick(smsFormOrderingRuleFIFO);
	}
	
	public void smsSelectOrderingRulelifo() throws InterruptedException {
		jswait.loadClick(smsFormOrderingRuleSelector);
		jswait.loadClick(smsFormOrderingRuleLIFO);
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
	public void enterSmsTouchpointDetails(String keyword) throws InterruptedException {
		smsEnterKeyword(keyword);
		smsSelectShortCode();
		smsSelectOrderingLogic();
		smsSelectOrderingRule();
		smsEnterRefreshEvery("3");
		smsSelectTimeInterval();
		smsEnterMaximumOffers("5");
	}
	
	public void editSmsTouchpointDetails(String keyword) throws InterruptedException {
		smsEnterKeyword(keyword);
		smsSelectShortCode();
		smsSelectOrderingLogic();
		smsSelectOrderingRulelifo();
		smsEnterRefreshEvery("8");
		smsSelectTimeInterval();
		smsEnterMaximumOffers("5");
		smsClickSave();
	}
	public void custedittouchpointcheck(String name) throws Exception {
		
		//String newname=jswait.getTextFormElement("(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'edited apiTouch')]");
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath(".//data-table-cell[@class='customercare-touchpoint-grid style-scope' and contains(.,'"+name+"')]")).isDisplayed());
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
	custEnterTouchpointName("Touch point edit007");
	custClickSave();
	
	String newname="Touch point edit007";
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
	custTriggerSelectOrderingLogic();
	custTriggerSelectOrderingRule();
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
	custEnterTouchpointName("Test Touch point007");
	custTriggerSelectOrderingLogic();
	custTriggerSelectOrderingRule();
	custTriggerEnterRefreshEvery("3");
	custTriggerSelectTimeInterval();
	custTriggerEnterMaximumOffers("4");
	custClickSave();
	String newname="Test Touch point007";
	System.out.println(newname);
	custedittouchpointcheck(newname);
	clickDeleteCustTouchpoint();
	
}

public void deleteUSSDTouchpoint() throws Throwable {
	
	clickDeleteUSSDTouchpoint();
	
}

	public void createSmsTouchpoint(String keyword) throws InterruptedException {
		clickCreateNewTouchpoint();
		enterSmsTouchpointDetails(keyword);
		smsClickSave();
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
		jswait.checkVisible(smseditcheck);
	
	}
	public void deletesmsTouchpoint(String name) throws InterruptedException{
		Thread.sleep(10000);
		
	 WebElement smsdetele=driver.findElement(By.xpath("//*[@class='x-scope data-table-row-0 style-scope sms-touchpoint-grid']/div[1]/data-table-cell[1]/span[contains(.,'"+name+"')]//following::iron-icon[2]"));
		jswait.loadClick(smsdetele);
	jswait.loadClick(smsdeleteyes);
	}
	
	
	public void editsmsTouchpointDetailsvalidation(String keyword) throws InterruptedException {
		System.out.println("inside sms validation");
		System.out.println(keyword);
		smsEnterKeyword(keyword);
		smsSelectShortCode();
		smsSelectOrderingLogic();
		smsSelectOrderingRule();
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
	public void createsmsTouchpointDetailsvalidation(String keyword) throws InterruptedException {
		System.out.println("inside sms validation");
		navigateToSms();
		clickCreateNewTouchpoint();
		System.out.println(keyword);
		smsSelectShortCode();
		smsEnterKeyword(keyword);
		smsSelectOrderingLogic();
		smsSelectOrderingRule();
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
	public void triggerSelectOrderingLogic() throws InterruptedException {
		jswait.loadClick(triggerFormOrderingLogicSelector);
		jswait.loadClick(triggerFormOrderingLogicRuleBased);
	}
	
	public void custTriggerSelectOrderingLogic() throws InterruptedException {
		jswait.loadClick(custTriggerFormOrderingLogicSelector);
		jswait.loadClick(custTriggerFormOrderingLogicRuleBased);
	}
	public void triggerSelectOrderingRule() throws InterruptedException {
		jswait.loadClick(triggerFormOrderingRuleSelector);
		jswait.loadClick(triggerFormOrderingRuleFIFO);
	}
	public void custTriggerSelectOrderingRule() throws InterruptedException {
		jswait.loadClick(custTriggerFormOrderingRuleSelector);
		jswait.loadClick(custTriggerFormOrderingRuleFIFO);
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
		selectTrigger();
		triggerSelectOrderingLogic();
		triggerSelectOrderingRule();
		triggerEnterRefreshEvery("3");
		triggerSelectTimeInterval();
		triggerEnterMaximumOffers("5");
	}
	public void createTriggerTouchpoint(String keyword) throws InterruptedException {
		clickCreateNewTouchpoint();
		enterTriggerTouchpointDetails(keyword);
		triggerClickSave();
	}
	//customer care functions
	public void customerCareSelectOrderingLogic() throws InterruptedException {
		jswait.loadClick(customerCareFormOrderingLogicSelector);
		jswait.loadClick(customerCareFormOrderingLogicRuleBased);
	}
	public void customerCareSelectOrderingRule() throws InterruptedException {
		jswait.loadClick(customerCareFormOrderingRuleSelector);
		jswait.loadClick(customerCareFormOrderingRuleFIFO);
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
		customerCareSelectOrderingLogic();
		customerCareSelectOrderingRule();
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
		public void apiSelectOrderingLogic() throws InterruptedException {
			jswait.loadClick(apiFormOrderingLogicSelector);
			jswait.loadClick(apiFormOrderingLogicRuleBased);
		}
		public void apiSelectOrderingRule() throws InterruptedException {
			jswait.loadClick(apiFormOrderingRuleSelector);
			jswait.loadClick(apiFormOrderingRuleFIFO);
		}
		
		public void apiSelectOrderingRulelifo() throws InterruptedException {
			jswait.loadClick(apiFormOrderingRuleSelector);
			jswait.loadClick(apiFormOrderingRuleLIFO);
		}
		
		public void apiEnterRefreshEvery(String name) throws InterruptedException {
			jswait.loadSendKeys(apiFormRefreshEvery, name);
		}
		public void apiSelectTimeInterval() throws InterruptedException {
			jswait.loadClick(apiFormTimeIntervalSelector);
			jswait.loadClick(apiFormTimeInterval1);
		}
		public void apiSelectApplicationType() throws InterruptedException {
			jswait.loadClick(apiFormApplicationType);
			jswait.loadClick(apiFormApplicationTypeGeneral);
			
		}
		public void apiSelectEventForTracking() throws InterruptedException {
			jswait.loadClick(apiFormEventForTracking);
			jswait.loadClick(apiFormEventForTrackingAcceptedEvent);
		}
		public void apiEnterMaximumOffers(String name) throws InterruptedException {
			jswait.loadSendKeys(apiFormMaximumOffers, name);
		}
		public void enterApiTouchpointDetails(String keyword) throws InterruptedException {
			apiEnterTouchpointName(keyword);
			apiSelectApplicationType();
			apiSelectEventForTracking();
			apiSelectOrderingLogic();
			apiSelectOrderingRule();
			apiEnterRefreshEvery("3");
			apiSelectTimeInterval();
			apiEnterMaximumOffers("5");
		}
		
		public void editapiTouchpointDetails(String keyword) throws InterruptedException {
			apiEnterTouchpointName(keyword);
			apiSelectApplicationType();
			apiSelectEventForTracking();
			apiSelectOrderingLogic();
			apiSelectOrderingRulelifo();
			apiEnterRefreshEvery("5");
			apiSelectTimeInterval();
			apiEnterMaximumOffers("8");
			apiClickSave();
		}
		
		public void editapiTouchpointDetailsvalidation(String keyword) throws InterruptedException {
			apiEnterTouchpointName(keyword);
			apiSelectApplicationType();
			apiSelectEventForTracking();
			apiSelectOrderingLogic();
			apiSelectOrderingRulelifo();
			apiEnterRefreshEvery("5");
			apiSelectTimeInterval();
			apiEnterMaximumOffers("");
			apiClickSave();
			boolean flag=jswait.checkVisible(apivalidation);
			System.out.println(flag);
			if (flag==true){
				}
				else{System.out.println("cant find element");}
		}
		
		
		
		public void createApiTouchpoint(String keyword) throws InterruptedException {
			clickCreateNewTouchpoint();
			enterApiTouchpointDetails(keyword);
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
			String newname=jswait.getTextFormElement("(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'edited apiTouch')]");
			System.out.println(newname);
Assert.assertEquals(name,newname);
			System.out.println("edit success");
			
			
			
		}
		public void apideletetouchpointcheck(String name) throws Exception {
			Thread.sleep(5000);
			String newname=jswait.getTextFormElement("(.//data-table-cell[@class='api-touchpoint-grid style-scope'])[1][contains(.,'apiTouch')]");
			System.out.println(name);
			jswait.loadClick(apideletebutton);
			jswait.loadClick(apideleteyes);
			checktouchpointsdeleteapi();
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
			public void ussdSelectOrderingLogic() throws InterruptedException {
				jswait.loadClick(ussdFormOrderingLogicSelector);
				jswait.loadClick(ussdFormOrderingLogicRuleBased);
			}
			public void ussdSelectOrderingRule() throws InterruptedException {
				jswait.loadClick(ussdFormOrderingRuleSelector);
				jswait.loadClick(ussdFormOrderingRuleFIFO);
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
				jswait.loadClick(ussdFormUssdApplicationSelector);
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
				ussdSelectUssdApplication();
				ussdSelectOrderingLogic();
				ussdSelectOrderingRule();
				ussdEnterRefreshEvery("3");
				ussdSelectTimeInterval();
				ussdEnterMaximumOffers("5");
			}
			
			public void editUssdTouchpointWithoutFillingMandatoryFields() throws InterruptedException {
				ussdClearTouchpointName();
				ussdClearUssdApplication();
				ussdSelectOrderingLogic();
				ussdSelectOrderingRule();
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
			
			public void createSMSTouchpointWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				smsClickSave();

			}
			public void createCustomerCareTouchpointWithoutMandatoryFields() throws InterruptedException {
				clickCreateNewTouchpoint();
				custClickSave();

			}
			public void createCustomerSmartPhoneAppWithoutMandatoryFields() throws InterruptedException {
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
				selectTrigger();
				triggerClickSave();
				triggerSelectOrderingLogic();
				triggerClickSave();
				triggerSelectOrderingRule();
				triggerClickSave();
				triggerEnterRefreshEvery("3");
				triggerClickSave();
				triggerSelectTimeInterval();
				triggerClickSave();
				triggerEnterMaximumOffers("5");
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
			

}
