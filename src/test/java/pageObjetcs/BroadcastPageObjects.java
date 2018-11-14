package pageObjetcs;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import baseClasses.EmailHandler;
import baseClasses.EmailHandlergmail;
//import baseClasses.EmailHandlergmail;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.TimeoutImpl;

public class BroadcastPageObjects extends Init {
	public BroadcastPageObjects() {
		PageFactory.initElements(driver, this);
	}

	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	public ExcelHelper eh = new ExcelHelper();
	CampaignObjects campaignObjects = new CampaignObjects();
	CommonObjects commonObjects = new CommonObjects();

	@FindBy(xpath="//paper-button[contains(.,'Create New Broadcast')]")
	private WebElement createNewBroadcastButton;
	@FindBy(xpath = "//paper-item[contains(.,'View Broadcasts')]")
	private WebElement viewBroadcast;
	@FindBy(xpath = "//paper-item[contains(.,'Export As PDF')]")
	private WebElement exportBroadcast;
	@FindBy(xpath = "//paper-item[contains(.,'View')]")
	private WebElement broadcastView;
	@FindBy(xpath = ".//paper-icon-button[@icon='block']")
	private WebElement broadcastAbort;
	@FindBy(xpath = ".//paper-item[contains(.,'Copy')]")
	private WebElement broadcastCopy;
	@FindBy(xpath = ".//paper-item[contains(.,'View Details')]")
	private WebElement broadcastViewDetails;
	@FindBy(xpath = ".//paper-icon-button[@icon='av:pause-circle-filled']")
	private WebElement broadcastPause;
	@FindBy(xpath = ".//paper-item[contains(.,'Send Trial')]")
	private WebElement broadcastSendTrial;
	@FindBy(xpath = "//paper-button[contains(.,'Send')]")
	private WebElement sendTrialMailButton;
	@FindBy(xpath = ".//paper-dialog[@id='savedialog']")
	private WebElement sendingMessageDialogueForSendTrialBC;
	@FindBy(xpath = ".//*[@id='sendTrialDialogNumberBC']/div/paper-button[contains(.,'Cancel')]")
	private WebElement sendTrialCancel;
	@FindBy(xpath = "//iron-icon[@icon='close']")
	private WebElement sendTrialCloseButton;
	
	@FindBy(xpath = "//span[contains(.,'Trial Message Event')]")
	private WebElement trialMessageEventField;
	
	@FindBy(xpath = "//label[contains(.,'Please enter the email addresses/MSISDNs of recipients')]//following::input[1]")
	private WebElement sendTrialMailIdField;
	
	@FindBy(xpath = ".//paper-dialog[@id='confirmBoxAbort']//paper-button[contains(.,'Yes')]")
	private WebElement broadcastAbortYes;
	@FindBy(xpath = "//paper-dialog[@id='confirmBoxPause']//paper-button[contains(.,'Yes')]")
	private WebElement broadcastPauseYes;
	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Aborted')]")
	private WebElement statusOfBCAfterAbortion;
	@FindBy(xpath = "//label[contains(.,'Broadcast Name')]/../input")
	private WebElement broadcastName;
	@FindBy(xpath = "//label[contains(.,'Purpose')]/../input")
	private WebElement broadcastPurpose;
	@FindBy(xpath = "//label[contains(.,'Label')]/../input")
	private WebElement labelSelector;
	@FindBy(xpath = "//label[contains(.,'Triggers')]/following::iron-icon")
	private WebElement triggersSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Crossell')]")
	private WebElement labelCrossell;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Information')]")
	private WebElement labelInformation;
	@FindBy(xpath = "//label[contains(.,'Inventory')]/../input")
	private WebElement inventorySelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'limited')]")
	private WebElement inventoryUnlimited;
	@FindBy(xpath = "//paper-button[contains(.,'Proceed')]")
	private WebElement proceedButton;
	@FindBy(xpath = "//paper-radio-group//paper-radio-button[@name='none'][1]")
	private WebElement targetConditionNoneOption;
	@FindBy(xpath = "//offer-form//paper-button[contains(.,'Proceed')]")
	private WebElement offerPopUpProceedButton;
	@FindBy(xpath = ".//label[contains(.,'Base Lists')]/../input")
	private WebElement baseListSelector;
	@FindBy(xpath = ".//paper-button[contains(.,'Target Group')]")
	private WebElement TGConfigure;
	
	@FindBy(xpath = "//paper-item[contains(.,'"+SELENIUM_DND_LIST+"')]")
	private WebElement DNCList;
	@FindBy(xpath = ".//paper-button[contains(.,'DNC Exclusions')]")
	private WebElement DNCExclusionOption;
	@FindBy(xpath = ".//paper-dialog[@class='style-scope dnc-exclusion x-scope paper-dialog-0']")
	private WebElement DNCExclusionList;
	@FindBy(css = "[icon=\"icons\\:remove-circle\"]")
	private WebElement DNCListRemoveButton;
	//paper-dialog[@class='style-scope dnc-exclusion x-scope paper-dialog-0']//data-table-cell//iron-icon
	
	@FindBy(css = "[class=\"addDNCBtn style-scope dnc-exclusion x-scope paper-button-0\"]")
	private WebElement DNCListAddButton;
	@FindBy(xpath = ".//paper-dialog[@class='style-scope dnc-exclusion x-scope paper-dialog-0']//paper-icon-button[@id='clear']//iron-icon")
	private WebElement DNCListCloseButton;
	@FindBy(xpath = ".//label[contains(.,'Removed DNC Lists')]/../input")
	private WebElement DNCListTextbox;
	@FindBy(xpath = ".//paper-button[contains(.,'Control Group')]")
	private WebElement CGConfigure;
	@FindBy(xpath = ".//paper-dialog[@id='changeLRSettings']//div[contains(.,'Define Limit')]")
	private WebElement defineLimit;
	@FindBy(xpath = ".//div/label[contains(.,'Limit Recipients')]/../input")
	private WebElement enterLimitField;
	@FindBy(xpath = ".//paper-dialog[@id='changeLRSettings']//paper-button[contains(.,'Save')]")
	private WebElement defineLimitSave;
	@FindBy(xpath = ".//paper-dialog[@id='changeSettings']//paper-button[contains(.,'Save')]")
	private WebElement defineCGLimitSave;
	@FindBy(xpath = ".//paper-button[contains(.,'Calculate')]")
	private WebElement calculateLimit;
	@FindBy(xpath = ".//label[text()='Calculating']")
	private WebElement calculateText;
	
	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Submitted for CG Validation')]")
	private WebElement statusValidation;
	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Validating CG')]")
	private List <WebElement> statusValidatingCG;
	@FindBy(xpath = ".//paper-dialog[@id='changeSettings']//div[contains(.,'Fixed percentage of Target Base')]")
	private WebElement defineCGSize;
	@FindBy(xpath = ".//*[@id='offerDetailForm']//paper-input-wrapper//input")
	private WebElement trackSession2Days;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Broadcast')]/../input")
	private WebElement senderIdBroadcastSelector;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/../input")
	private WebElement senderIdFulfillmentSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
	private WebElement senderIdBroadcastAdressSmpp;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'"+SENDER_EMAIL+"')]")
	private WebElement senderIdBroadcastEmail;
	@FindBy(xpath = ".//label[contains(.,'Route over which this broadcast')]/../input")
	private WebElement routeBroadcast;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/../input")
	private WebElement routeFulfillment;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]")
	private WebElement routeBroadcastSmppRobioutbound;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'"+ROUTE_EMAIL+"')]")
	private WebElement routeBroadcastEmail;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
	private WebElement senderIdFulfillmentAdressSmpp;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]")
	private WebElement routeFulfillmentSmppRobioutbound;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+SENDER_EMAIL+"')]")
	private WebElement senderIdFulfillmentEmail;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+ROUTE_EMAIL+"')]")
	private WebElement routeFulfillmentEmail;
	@FindBy(xpath = ".//label[contains(.,'Track session')]/../input")
	private WebElement trackSessionSelector;
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-listbox/paper-item[contains(.,'After')]")
	private WebElement trackSessionAfter;
	@FindBy(xpath = "//*[@id='offerDetailForm']//paper-input-wrapper//input")
	private WebElement trackSessionInput;
	@FindBy(xpath = ".//label[contains(.,'Tracking Source')]/../input")
	private WebElement trackingSourceSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'track')]")
	private WebElement trackingSourceTrack;
	@FindBy(xpath = "//label[contains(.,'Triggers')]/following::paper-item[2]")
	private WebElement triggerSelect1;
	@FindBy(xpath = "//label[contains(.,'Triggers')]/following::paper-item[1]")
	private WebElement triggerSelect2;
	@FindBy(xpath = "//label[contains(.,'Inventory')]/following::vaadin-combo-box-item[4]")
	private WebElement inventorySelect1;
	@FindBy(xpath = "//label[contains(.,'Inventory')]/following::paper-icon-button")
	private WebElement inventoryClearButton;
	@FindBy(xpath = ".//*[@id='wizard']/li[1]")
	private WebElement detailsTabHeader;
	@FindBy(xpath = "//paper-button[text()='Create']")
	private WebElement createButtonBc;
	@FindBy(xpath = "//paper-button[text()='Activate']")
	private WebElement activateButtonBc;
	@FindBy(xpath = "//paper-dialog[@id='broadcastSummary']//paper-button[text()='Save']")
	private WebElement saveButtonBc;
	@FindBy(xpath = ".//*[@id='confirmBox']//paper-button[2]")
	private WebElement activateConfirmYes;
	@FindBy(xpath = "(.//*[@id='checkboxContainer'])[2]")
	private WebElement firstOfferCheckBox;
	@FindBy(xpath = ".//div[@id='radioLabel' and contains(.,'Never')]/../div[1]")
	private WebElement recurringBcEndNeverRadio;
	@FindBy(xpath = ".//div[@id='radioLabel' and contains(.,'At')]/../div[1]")
	private WebElement recurringBcEndAtRadio;
	@FindBy(xpath = "//div[@val='broadcastViews']//vaadin-grid-table-row[1]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
	private WebElement topBcStatusGrid;
	@FindBy(xpath = "//div[@val='broadcastViews']//vaadin-grid-table-row[1]/vaadin-grid-table-cell[5]/vaadin-grid-cell-content")
	private WebElement topBcTargetedGrid;
	@FindBy(xpath = ".//label[contains(.,'Start Date/Time')]")
	private WebElement StartBroadcastDateTimeField;
	
	@FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'8,00,000')]")
	private WebElement targetCountPartnerLevelCG;
	
	
	@FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'9,00,000')]")
	private WebElement targetCount;
	
	
	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Targeting')]")
	private List <WebElement> statusTargetingCG;
	
	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Delivering')]")
	private List <WebElement> statusDelivering;

	@FindBy(xpath = ".//div[@id='radioLabel' and contains(text(),'Create')]")
	private WebElement targetbccreate;
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-menu/div/paper-icon-item[3]")
	private WebElement bccopyasand;
	@FindBy(xpath = "(//iron-icon[@id='icon'])[23]")
	private WebElement clickCopiedAnd;
	@FindBy(xpath = "//target-form//condition-form[3]//following::paper-button[contains(text(),'Add AND')]")
	private WebElement AddAnd; // change the form number for the conditions in the page
	@FindBy(xpath = ".//*[@id='router']//paper-button[contains(text(),'Notifications')]")
	private WebElement bcNotifications;
	@FindBy(xpath = ".//*[@id='dialognotification']//paper-button[contains(text(),'Add')]")
	private WebElement bcNotificationsadd;
	@FindBy(xpath = ".//*[@id='dialognotification']//paper-button[contains(text(),'OK')]")
	private WebElement bcNotificationsok;
	@FindBy(xpath = ".//*[@id='dialognotification']//paper-button[contains(text(),'Cancel')]")
	private WebElement bcNotificationscancel;

	 @FindBy(xpath="//*[contains(text(),'One-time')]/..")
	 private WebElement oneOffRadioButton;
	 @FindBy(xpath=".//label[contains(.,'Send Time')]/../input")
	 private WebElement oneOffSendTimeField;
	 @FindBy(xpath=".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]")
	 private WebElement oneOffSendTimeDateOkButton;
	 @FindBy(xpath="//paper-dialog[@id='productDialog']//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
		private WebElement productFilterIcon;
	 @FindBy(xpath="//*[@id='filterForm']//label[contains(.,'Product Name')]/../input")
	 private WebElement filterProductNameField;
	 @FindBy(xpath="//iron-data-table[@id='productTable']//paper-dialog[@id='filterDialog']/div/paper-button[3]")
	 private WebElement productFilterApplyButton;
	 @FindBy(xpath="//form[@id='bcNotificationForm']//label[contains(.,'Recipient')]//..//input")
	 private WebElement bcnotificationrecipient ;
	 @FindBy(xpath="//form[@id='bcNotificationForm']//label[contains(.,'Before Sending')]//following::iron-icon[1]")
	 private WebElement bcnotificationbeforesendingtime ;
	 @FindBy(xpath="//form[@id='bcNotificationForm']//label[contains(.,'Before Sending')]//following::paper-listbox//paper-item[2]")
	 private WebElement bcnotificationbeforesendingtime1min;
	 @FindBy(xpath="//form[@id='bcNotificationForm']//label[contains(.,'Before Rendering')]//following::iron-icon[1]")
	 private WebElement bcnotificationbeforeRendertime ;
	 @FindBy(xpath="//form[@id='bcNotificationForm']//label[contains(.,'Before Rendering')]//following::paper-listbox//paper-item[2]")
	 private WebElement bcnotificationbeforerendertime1min ;
	 @FindBy(xpath="//*[@id='bcNotificationForm']//vaadin-combo-box//following::vaadin-combo-box-item[contains(.,'Selenium user')]")
	 private WebElement bcnotificationrecipientclick;
	 @FindBy(xpath="//*[@id='bcNotificationForm']//vaadin-combo-box//following::vaadin-combo-box-item[contains(.,'System Administrator')]")
	 private WebElement bcnotificationrecipientclick2;
	 @FindBy(xpath="//bc-notifications-list//paper-button[contains(.,'Remove')]")
	 private WebElement bcremovebutton ;
	 @FindBy(xpath = "//paper-button[text()='Validate']")
     private WebElement validateButtonBc;
	 @FindBy(xpath = "//paper-card[contains(.,'Basic Details')]")
     private WebElement basicDetailsBC;
	 @FindBy(xpath = "//paper-card[contains(.,'Target Details')]")
     private WebElement targetDetailsBC;
	 @FindBy(xpath = "//paper-card[contains(.,'Offer details')]")
     private WebElement offerDetailsBC;
	 @FindBy(xpath = "//div//h4[contains(.,'Delivery Details')]")
     private WebElement deliveryDetailsBC;
	 @FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'Delivering')]")
     private List <WebElement> deliveringStatusBC;
	 @FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'Completed')]")
     private List <WebElement> compltedeStatusBC;
	 @FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'Render Scheduled')]")
     private List <WebElement> renderScheduledStatusBC;
	 @FindBy(xpath="//div[@id='contentWrapper']/div/paper-menu/div//label[contains(.,'Permissions')]")
	 private WebElement Permissions;
	 @FindBy(xpath=".//label[contains(.,'Select users who can edit this broadcast')]/../../../div")
	 private WebElement clickusers;
	 @FindBy(xpath="//paper-dialog[@id='addUserDialog']//span[.='Broadcast Edit Permissions']")
	 private WebElement PermissionTitle;
	 @FindBy(xpath="//paper-dialog[@id='addUserDialog']//paper-button[2][contains(.,Save)]")
	 private WebElement PermissionSave;
	 
	 
	 @FindBy(xpath = ".//p[contains(.,'04 Sep 2018 03:21 PM GMT+05:30')]")
     private WebElement sendTimeData;
	 @FindBy(xpath = ".//p[contains(.,'04 Sep 2018 03:21 PM GMT+05:30')]")
     private WebElement sendTimeText;
	 
	
	 
	 @FindBy(xpath="//paper-radio-button[contains(.,'No Control Group')]")
	 private WebElement noControlGroupRadioButton;
	 @FindBy(xpath=".//h4[contains(.,'Target Details')]")
	 private WebElement viewTargetDetails;
	 
	 
	 @FindBy(xpath="(//form[@id='bcNotificationForm']//..//paper-checkbox[1])[1]")
	 private WebElement bcnotificationatcompletion ;
	 @FindBy(xpath="(//form[@id='bcNotificationForm']//..//paper-checkbox[1])[2]")
	 private WebElement bcnotificationatreceivebroadcastmsg ;
 @FindBy(xpath="(//label[contains(.,'Recipient')]//following::paper-icon-button[2])[2]")
private WebElement recipientclick;
 
 
	 @FindBy(xpath=".//form[@id='bcExpiryForm']//paper-checkbox//div[contains(.,'Broadcast Expiry')]")
	 private WebElement bcExpiryclick ;
	 @FindBy(xpath=" .//form[@id='bcExpiryForm']//label[contains(.,'Expires')]//following::iron-icon[1]")
	 private WebElement expirestime ;
	 @FindBy(xpath="//form[@id='bcExpiryForm']//paper-item[contains(.,'At')]")
	 private WebElement expiresAtoption;
	 @FindBy(xpath=".//form[@id='bcExpiryForm']//label[contains(.,'Expires')]//following::iron-icon[5]")
	 private WebElement expirestimezone ;
	 @FindBy(xpath="//paper-radio-button[contains(.,'Saved Segments')]")
	 private WebElement savedSegmentRadioButtion;
	 @FindBy(xpath="//label[contains(.,'Saved Segments')]/../..//input")
	 private WebElement savedSegmentSelectorField;
	 
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;

	public void enterBroadcastName(String name) throws InterruptedException {
		jswait.loadSendKeys(broadcastName, name);
	}
	public void enterFilterProductName(String name) throws InterruptedException {
		jswait.loadSendKeys(filterProductNameField, name);
	}
	public void selectOneOffSendTimeDate(String date) throws InterruptedException {
		jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='"+date+"']");
	}
	public void clickTargetDetailsInBcView() throws InterruptedException {
		jswait.loadClick(viewTargetDetails);
	}
	public void clickOneOffRadioButton() throws InterruptedException {
		jswait.loadClick(oneOffRadioButton);
	}
	public void clickProductFilterApplyButton() throws InterruptedException {
		jswait.loadClick(productFilterApplyButton);
	}
	public void clickProductFilterButton() throws InterruptedException {
		jswait.loadClick(productFilterIcon);
	}
	public void clickOfferPopUpProceedButton() throws InterruptedException {
		jswait.loadClick(offerPopUpProceedButton);
	}
	public void clickOneOffSendTimeDateOkButton() throws InterruptedException {
		jswait.loadClick(oneOffSendTimeDateOkButton);
	}
	public void clickOneOffSendTimeField() throws InterruptedException {
		jswait.loadClick(oneOffSendTimeField);
	}
	
	//*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//
	public void bcnotificationrecipient() throws InterruptedException {
		jswait.loadSendKeys(bcnotificationrecipient, "Selenium user");
		
		wait.until(ExpectedConditions.visibilityOf(bcnotificationrecipient)).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		jswait.loadClick(recipientclick);
	}
	
	public void bcnotificationbeforesendingtime() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationbeforesendingtime);
	}
	public void bcnotificationbeforesendingtime1min() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationbeforesendingtime1min);
	}
	public void bcnotificationbeforeRendertime() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationbeforeRendertime);
	}
	
	public void bcnotificationbeforerendertime1min() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationbeforerendertime1min);
	}
	
	public void bcnotificationrecipientclick() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationrecipientclick);
	}
	public void bcnotificationrecipientclick2() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationrecipientclick2);
	}
	
	public void bcremovebutton() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcremovebutton);
	}
	
	public void bcnotificationatcompletion() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationatcompletion);
	}
	
	public void bcnotificationatreceivebroadcastmsg() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcnotificationatreceivebroadcastmsg);
	}
	
	
	public void selectRecurrancePattern(String type,String sheet) throws InterruptedException {
		eh.setExcelFile("bcInputData",sheet);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
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
		Thread.sleep(1000);

		Thread.sleep(1000);
		
		if(type.contentEquals("days")){
			  jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			 Thread.sleep(1000);
			  jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
			 Thread.sleep(1000);
			  jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input","1");
			 Thread.sleep(1000);
		
	}
		else if(type.contentEquals("months")) {
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			 Thread.sleep(1000);
			  jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Months')]");
			  Thread.sleep(1000);
			  jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input",eh.getCellByColumnName("Recur every months"));
			 Thread.sleep(1000);
			 jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Select days')]/..//input");
			 String daysStr = eh.getCellByColumnName("Recur on");
			 String[] days = daysStr.split(",");
			 for(int i =0; i<days.length;i++)
			   jswait.loadClick(".//*[@id='days']//div[text()='"+days[i]+"']/../..");
			 jswait.loadClick(".//*[@id='dayDialog']//paper-button[text()='Done']");
		}
		jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
		 Thread.sleep(2000);
	   	 jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
	   	WebElement num = driver.findElement(By.xpath("//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
	     builder.moveToElement(num).click().build().perform();
	     Thread.sleep(2000);
//	      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
	     WebElement num1 = driver.findElement(By.xpath("//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
		 Thread.sleep(1000);
		 builder.moveToElement(num1).click().build().perform();
		
		    Thread.sleep(1000);     
	     if(am_pm==0)
	    	  jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
	     else
	    	  jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
	     Thread.sleep(2000);
	      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
		    Thread.sleep(2000);
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");

	}
	
	public void selectOneOffDateAndTimeNow() throws InterruptedException {
		Calendar rightNow =Calendar.getInstance();
    	String mn = "";
    	if(rightNow.get(Calendar.MONTH)+1<9) {
    		mn = "0"+Integer.toString(rightNow.get(Calendar.MONTH)+1);
    	}
    	else 
    		mn = Integer.toString(rightNow.get(Calendar.MONTH)+1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR))+"-"+mn+"-"+String.format("%02d",rightNow.get(Calendar.DAY_OF_MONTH));
    	int hours = rightNow.get(Calendar.HOUR);
      	 int min = rightNow.get(Calendar.MINUTE);
      	 int am_pm = rightNow.get(Calendar.AM_PM);
      	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
      	 int year = rightNow.get(Calendar.YEAR);
      	 int month = rightNow.get(Calendar.MONTH)+1;
      	 min+=2;
      	 int rem = min%5;
      	 rem = 5-rem;
      	 min+=rem;
      	 if(min>59){
      		 min-=60;
      		 hours++;
      	 }
      	 clickOneOffRadioButton();
      	clickOneOffSendTimeField();
      	selectOneOffSendTimeDate(date);
      	clickOneOffSendTimeDateOkButton();
	}

	public String getTopBcStatus() throws InterruptedException {
		jswait.waitUntil(topBcStatusGrid);
		String status = topBcStatusGrid.getText();
		return status;
	}
	public String getTopBcTargeted() throws InterruptedException {
		jswait.waitUntil(topBcTargetedGrid);
		String status = topBcTargetedGrid.getText();
		return status;
	}
	
	
	public String getBcStatus(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[2]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[2]/vaadin-grid-cell-content")).getText();
		return status;
	}
	
	public String getBcTargtedCount(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[5]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[5]/vaadin-grid-cell-content")).getText();
		return status;
	}
	
	public String getBcSentCount(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[6]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[6]/vaadin-grid-cell-content")).getText();
		return status;
	}
	public String getBcAcknowledgedCount(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[7]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/../vaadin-grid-table-cell[7]/vaadin-grid-cell-content")).getText();
		return status;
	}

	public void clickCreateButton() throws InterruptedException {
		jswait.loadClick(createButtonBc);
	}
	
	
	public void getSendTimeData() throws InterruptedException, UnsupportedFlavorException, IOException {
		
		String SendTime=jswait.getTextFormElement("//h4[@class='style-scope broadcast-deliver-summary']");
		int index1=SendTime.indexOf(",");
		
		SEND_TIME_DATA=SendTime.substring(index1+2, index1+6);
		System.out.println("Send Time Data:"+SEND_TIME_DATA);
		System.out.println("SendTime:"+SendTime);
	
	}
	
	public void clickCreateNewBroadcastButton() throws InterruptedException {
		jswait.loadClick(createNewBroadcastButton);
	}
	
	public void exportBroadcast() throws InterruptedException {
		
		commonObjects.clickOptionsIcon();
		clickExportBroadcastOption();
		Thread.sleep(4000);
		verifyExportBroadcast();
	}
	
  public void broadcastView(String name) throws InterruptedException {
		
		commonObjects.clickOptionsIcon();
		clickBroadcastViewOption();
		Thread.sleep(2000);
		verifyBroadcastView(name);
	}
  
  
  public void abortBC() throws InterruptedException {
		
		commonObjects.clickOptionsIcon();
		clickAbortBroadcastOption();
		clickAbortYesButton();
		Thread.sleep(3000);
		commonObjects.clickOptionsIcon();
		clickAbortBroadcastOption();
		clickAbortYesButton();
		verifyStatusOfBCAfterAbortion();
		
	}
  
  
  public void copyBC() throws InterruptedException {
		

	   commonObjects.clickOptionsIcon();
	   clickCopyBroadcastOption();
	}
  
  
  
  
  public void pauseBC() throws InterruptedException {
	  
	  
	  int size_RS=renderScheduledStatusBC.size();
	  System.out.println("Size RS: "+size_RS);
	  int size=deliveringStatusBC.size();
	  System.out.println("Size before loop: "+size);
	  TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
	  while(size==0&& t.checkTimerMin(15)) {
		  
	  Thread.sleep(20000);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  size=deliveringStatusBC.size();
	  System.out.println(size);
	  int size2=compltedeStatusBC.size();
	  
	  if(size2==1) { 
		  System.out.println("Size2: "+size2);
		  break;
		  }
	  
	  }
//	  WebDriverWait wait = new WebDriverWait(driver,50);
//	  driver.navigate().refresh();
//	  commonObjects.clickOptionsIcon();
//	  
//	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//paper-item[contains(.,'Pause')]")));
	  commonObjects.clickOptionsIcon();
	  clickPauseBroadcastOption();
	  clickPauseYesButton();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
		
	}
  
  public void clickCloseSendTrialWindow() throws InterruptedException {
		
	  jswait.loadClick(sendTrialCloseButton);	
		 
}
  
  
  public void verifySendTrialOptionForBc() throws InterruptedException {
	  
	  commonObjects.clickOptionsIcon();
	  clickSendTrialBroadcastOption();
	  enterSendTrialMailId();
	  clickSendTrialMailButton();
	  verifySendingMessageDialogueForSendTrialBC();
	  clickCloseSendTrialWindow();
	 
	  
  }
  
  public void verifyTrialMessageEvent() throws Exception {
	  
	  Thread.sleep(5000);
	  
	  assertTrue(trialMessageEventField.isDisplayed());
	  
	  
	  /*  Thread.sleep(5000);	
	  String Text=trialMessageEventField.getText();
	  System.out.println("Text: "+Text);
	  Exception sendTrialExcep=new Exception("Send Trial Exception");
	  if(Text.equals("Trial Message Event"))
		  System.out.println("Trial message send successfully");
	  else
		  throw sendTrialExcep; */
	  
  
  }
  
 
  public void verifyBroadcastView(String name) throws InterruptedException {
		
	 assertTrue(driver.findElement(By.xpath("//h3[contains(.,'"+name+"')]")).isDisplayed());
	 assertTrue(basicDetailsBC.isDisplayed());
	 assertTrue(targetDetailsBC.isDisplayed());
	 assertTrue(offerDetailsBC.isDisplayed());
	 assertTrue(deliveryDetailsBC.isDisplayed());
	 jswait.loadClick(basicDetailsBC);
	 assertTrue(driver.findElement(By.xpath(".//p[contains(.,'"+name+"')]")).isDisplayed());
	 
	  
	}
	
	
  public void verifyExportBroadcast() throws InterruptedException {
		
	  
	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"j");
	  
	}
	
	public void clickBcEndNeverRadioButton() throws InterruptedException {
		jswait.loadClick(recurringBcEndNeverRadio);
	}

	public void clickBcEndAtRadioButton() throws InterruptedException {
		jswait.loadClick(recurringBcEndAtRadio);
	}

	public void clickActivateConfirmYes() throws InterruptedException {
		jswait.loadClick(activateConfirmYes);
	}
	
	public void verifyBCFromSheet(String name) throws InterruptedException {
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//vaadin-grid-cell-content[contains(.,'"+name+"')]")).isDisplayed());
	}
	
	

	public void clickActivateButton() throws InterruptedException {
		jswait.loadClick(activateButtonBc);
	}
	public void clickSaveButton() throws InterruptedException {
		jswait.loadClick(saveButtonBc);
	}

	public void enterBroadcastPurpose(String pur) throws InterruptedException {
		jswait.loadSendKeys(broadcastPurpose, pur);
	}

	public void clickProceedButton() throws InterruptedException {
		jswait.loadClick(proceedButton);
	}
	
	public void clickTargetConditionNoneOption() throws InterruptedException {
		jswait.loadClick(targetConditionNoneOption);
	}
	
	public void expandOfferInChooseOffers(String offerName) throws InterruptedException {
		jswait.loadClick(".//data-table-cell[contains(.,'"+offerName+"')]");
	}

	public void selectBaseList(String baseList) throws InterruptedException {
		jswait.loadSendKeys(baseListSelector, baseList);
		jswait.loadClick(
				"//form[@id='baseListsForm']//following::vaadin-combo-box-item[contains(.,'" + baseList + "')]");
	}
	
	public void verifyTG_And_CG_Configure_Options() throws InterruptedException {
		assertTrue(TGConfigure.isDisplayed());
		assertTrue(CGConfigure.isDisplayed());
		jswait.loadClick(TGConfigure);
		jswait.loadClick(defineLimit);
		jswait.loadSendKeys(enterLimitField, "10");
		jswait.loadClick(defineLimitSave);
		jswait.loadClick(CGConfigure);
		jswait.loadClick(defineCGSize);
		jswait.loadClick(defineCGLimitSave);
		jswait.loadClick(calculateLimit);
		Thread.sleep(4000);;
		assertTrue(calculateText.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	
	public void createBCAndSelectDNCListForPartnerLevelCG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList();
		calculate_CG_TG();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	
	public void calculate_CG_TG() throws InterruptedException {
		
		jswait.loadClick(calculateLimit);
		Thread.sleep(2000);;
		assertTrue(calculateText.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	public void selectDNCList() throws InterruptedException {
		
		
		jswait.loadClick(DNCExclusionOption);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(DNCExclusionList).click().perform();
//		actions.moveToElement(DNCListRemoveButton).click().perform();
//		actions.moveToElement(DNCListRemoveButton).click().perform();
//		actions.moveToElement(DNCListRemoveButton).click().perform();
//		actions.moveToElement(DNCListRemoveButton).click().perform();
		
		//Set <String> handle=driver.getWindowHandles();
		
		
		//driver.switchTo().frame(DNCExclusionList);
		
		
		jswait.loadClick(DNCListRemoveButton);
//		jswait.loadClick(DNCListRemoveButton);
//		jswait.loadClick(DNCListRemoveButton);
//		jswait.loadClick(DNCListRemoveButton);
		jswait.loadClick(DNCListTextbox);
		jswait.loadClick(DNCList);
		jswait.loadClick(DNCListAddButton);
		jswait.loadClick(DNCListCloseButton);
	
	}
	
	
	public void verifyActiveOptionForBC() throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."))).click();
	}
	
	public void verifyValidateOptionForBC() throws Throwable {
		
		assertTrue(statusValidation.isDisplayed());
	}
	
	
	
	
public void verifyViewOptionForBC() throws InterruptedException {
		
//		List <WebElement> OptionIcon=driver.findElements(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."));
//		int sizeOption=OptionIcon.size();
//		while(sizeOption==0) {
//			
//			Thread.sleep(30000);
//		}
		
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."))).click();
		clickBroadcastViewOption();
		
		clickBroadcastDeliveryDetails();
		Thread.sleep(3000);
		System.out.print("Send Time:"+SEND_TIME_DATA);
		
		assertTrue(driver.findElement(By.xpath(".//p[contains(.,'"+SEND_TIME_DATA+"')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath(".//p[contains(.,'"+SEND_TIME_DATA+"')]")).isDisplayed());
		
		
	}
	
	 public void verifyValidatingCGStatusForBC() throws Throwable {
		  
		  
		  
		 
		  int size=statusValidatingCG.size();
		  System.out.println("Size before loop: "+size);
		  TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
		  while(size==0&& t.checkTimerMin(15)) {
			  
		  Thread.sleep(20000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  size=statusValidatingCG.size();
		  System.out.println(size);
		
		  
		  }
		 
//		  Thread.sleep(200000);
//		  driver.navigate().refresh();
//		  Thread.sleep(200000);
//		  driver.navigate().refresh();
//		  Thread.sleep(100000);
//		  driver.navigate().refresh();
//		  Thread.sleep(100000);
//		  driver.navigate().refresh();
//		  Thread.sleep(100000);
//		  driver.navigate().refresh();
//		  WebDriverWait wait = new WebDriverWait(driver,50);
//		  driver.navigate().refresh();
//		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//vaadin-grid-cell-content[contains(.,'Validating CG')]")));
		 
		  int size2=statusValidatingCG.size();
		  if(size2>0) {
			  for(WebElement ValidatingCG : statusValidatingCG) {
				 
				  assertTrue(ValidatingCG.isDisplayed());
				  
			  }
			  
		  }
		 
		
	  }
	

	public void selectLabelCrossell() throws InterruptedException {
		jswait.loadClick(labelSelector);
		jswait.loadClick(labelCrossell);
	}

	public void selectLabelInformation() throws InterruptedException {
		jswait.loadClick(labelSelector);
		jswait.loadClick(labelInformation);
	}

	public void selectInventory(String inventory) throws InterruptedException {
		jswait.loadSendKeys(inventorySelector, inventory);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+inventory+"')]");
	}
	
	

	public void selectInventory1() throws InterruptedException {
		jswait.loadClick(inventoryClearButton);
		jswait.loadClick(inventorySelector);
		jswait.loadClick(inventorySelect1);
	}

	public void selectTrigger1() throws InterruptedException {
		jswait.loadClick(triggersSelector);
		Thread.sleep(2500);
		jswait.loadClick(triggersSelector);
		// jswait.loadClick(triggersSelector);
		jswait.loadClick(triggerSelect2);
	}

	public void selectTrigger2() throws InterruptedException {
		jswait.loadClick(triggerSelect1);
	}

	public void viewBroadcast() throws InterruptedException {
		jswait.loadClick(viewBroadcast);
	}
	
	public void clickExportBroadcastOption() throws InterruptedException {
		jswait.loadClick(exportBroadcast);
	}
	public void clickBroadcastViewOption() throws InterruptedException {
		jswait.loadClick(broadcastView);
	}
	
	public void clickAbortBroadcastOption() throws InterruptedException {
		jswait.loadClick(broadcastAbort);
	}
	
	public void clickBroadcastDeliveryDetails() throws InterruptedException {
		jswait.loadClick(deliveryDetailsBC);
	}
	
	public void clickCopyBroadcastOption() throws InterruptedException {
		jswait.loadClick(broadcastCopy);
	}
	
	public void clickPauseBroadcastOption() throws InterruptedException {
		jswait.loadClick(broadcastPause);
	}
	
	public void clickSendTrialBroadcastOption() throws InterruptedException {
		jswait.loadClick(broadcastSendTrial);
	}
	
	public void enterSendTrialMailId() throws InterruptedException {
		jswait.loadClick(sendTrialMailIdField);
		jswait.loadSendKeys(sendTrialMailIdField, "919717802050");
		
	}
	
	public void clickSendTrialMailButton() throws InterruptedException {
		jswait.loadClick(sendTrialMailButton);
		
	}
	
	public void verifySendingMessageDialogueForSendTrialBC() throws InterruptedException {
		assertTrue(sendingMessageDialogueForSendTrialBC.isDisplayed());
		
	}
	
	public void clickAbortYesButton() throws InterruptedException {
		jswait.loadClick(broadcastAbortYes);
	}
	
	public void clickPauseYesButton() throws InterruptedException {
		jswait.loadClick(broadcastPauseYes);
	}

   public void verifyStatusOfBCAfterAbortion() throws InterruptedException {
	   
	   
	   driver.navigate().refresh();
	   Thread.sleep(5000);
	   driver.navigate().refresh();
	   Thread.sleep(3000);
	   assertTrue(statusOfBCAfterAbortion.isDisplayed());
	
    }


	public void selectTrackSession() throws InterruptedException {
		jswait.loadClick(trackSessionSelector);
		jswait.loadClick(trackSessionAfter);
		jswait.loadSendKeys(trackSession2Days, "5");
	}

	public void selectTrackingSource() throws InterruptedException {
		jswait.loadSendKeys(trackingSourceSelector, "track");
		jswait.loadClick(trackingSourceTrack);
	}

	// --------------------------------------------------------------//
	public void clickcreateTargetCondition() throws InterruptedException {
		jswait.loadClick(targetbccreate);
	}

	public void ClickCopyAsAnd() throws InterruptedException {
		jswait.loadClick(bccopyasand);
	}

	public void ClickCopiedAnd() throws InterruptedException {
		jswait.loadClick(clickCopiedAnd);
	}

	public void AddAnd() throws InterruptedException {
		jswait.loadClick(AddAnd);
	}

	public void bcNotifications() throws InterruptedException {
		jswait.loadClick(bcNotifications);
	}

	public void bcNotificationsadd() throws InterruptedException {
		jswait.loadClick(bcNotificationsadd);
	}

	public void bcNotificationsok() throws InterruptedException {
		jswait.loadClick(bcNotificationsok);
	}

	public void bcNotificationscancel() throws InterruptedException {
		jswait.loadClick(bcNotificationscancel);
	}

	// ----------------------------------------------------------------//

	public void selectSenderAndRoute() throws InterruptedException {
		jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
		jswait.loadClick(senderIdBroadcastAdressSmpp);
		jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);
		jswait.loadClick(routeBroadcastSmppRobioutbound);
		jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
		// jswait.loadClick(senderIdFulfillmentSelector);
		// Thread.sleep(4000);
		jswait.loadClick(senderIdFulfillmentAdressSmpp);
		// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
		jswait.loadSendKeys(routeFulfillment, ROUTE_SMPP);
		Thread.sleep(2000);
		jswait.loadClick(routeFulfillmentSmppRobioutbound);
	}
	public void selectSenderAndRouteEmail() throws InterruptedException {
		jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_EMAIL);
		jswait.loadClick(senderIdBroadcastEmail);
		jswait.loadSendKeys(routeBroadcast, ROUTE_EMAIL);
		jswait.loadClick(routeBroadcastEmail);
		jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_EMAIL);
		// jswait.loadClick(senderIdFulfillmentSelector);
		// Thread.sleep(4000);
		jswait.loadClick(senderIdFulfillmentEmail);
		// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
		jswait.loadSendKeys(routeFulfillment, ROUTE_EMAIL);
		Thread.sleep(2000);
		jswait.loadClick(routeFulfillmentEmail);
	}

	public void enterBroadcastBasicDetails(String name,String inventory) throws InterruptedException {
		enterBroadcastName(name);
		enterBroadcastPurpose("Purpose of BC is NOTHING");
		selectLabelCrossell();		
		selectInventory(inventory);
//		selectROI();
	}
	
	public void selectROI() throws InterruptedException {
		jswait.loadClick("//label[contains(.,'Expected ROI')]/../../iron-icon");
		jswait.loadClick("//paper-item[contains(.,'10%')]");
		
	}

	public void selectOffer(String offerName) throws InterruptedException {
		jswait.loadClick(".//data-table-cell[contains(.,'"+offerName+"')]/..//*[@id='checkboxContainer']");
	}

	public void selectFirstOffer() throws InterruptedException {
		jswait.loadClick(firstOfferCheckBox);
	}

	public void selectRecurrancePattern() throws InterruptedException {
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
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
		Thread.sleep(1000);
		jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
		Thread.sleep(1000);
		jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
		Thread.sleep(1000);
		jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
		Thread.sleep(1000);
		jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
		Thread.sleep(2000);
		jswait.loadClick(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/paper-input[1]//div");
		WebElement num = driver.findElement(By.xpath(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
						+ (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
		jswait.loadClick(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/paper-input[2]//div");
		WebElement num1 = driver.findElement(By.xpath(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
						+ (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();

		Thread.sleep(1000);

		jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
		Thread.sleep(2000);
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");

	}

	public void createBC(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		ExcelHelper offerExcel = new ExcelHelper(); 
    	offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		jswait.loadClick(CGConfigure);
		jswait.loadClick(noControlGroupRadioButton);
		jswait.loadClick(defineCGLimitSave);
		clickProceedButton();
		selectOffer(offerExcel.getCellByColumnName("Offer Name"));
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			if(offerExcel.getCellByColumnName("Channel").contains("Email"))
			{
				selectSenderAndRouteEmail();
			}
			else
				selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	
	public void createBCForUseTemplate(String name, String bc_type, String baseList, String offer) throws Throwable {
		ExcelHelper offerExcel = new ExcelHelper(); 
    	offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		Thread.sleep(3000);
		campaignObjects.CheckUsageMetricField();
	}
	
	
	
	
	
	
	
	public void createBC(String name, String bc_type, String baseList, String offer,String condition,String inventory) throws InterruptedException {
		ExcelHelper offerExcel = new ExcelHelper(); 
    	offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name,inventory);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		jswait.loadClick(CGConfigure);
		jswait.loadClick(noControlGroupRadioButton);
		jswait.loadClick(defineCGLimitSave);
		
			TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
			commonObjects.clickOptionsIcon();
			targetConditionObjects.clickTargetConditionDeletet();
			if(condition.contains("segmentAgeGT40")) {
				jswait.loadClick(savedSegmentRadioButtion);
				jswait.loadClick(savedSegmentSelectorField);
				jswait.loadClick("//paper-item[contains(.,'segmentAgeGT40')]");
			}
			else 
				targetConditionObjects.clickBasicTargetCondition(condition);
			Thread.sleep(3000);
		
		clickProceedButton();
		selectOffer(offerExcel.getCellByColumnName("Offer Name"));
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			if(offerExcel.getCellByColumnName("Channel").contains("Email"))
			{
				selectSenderAndRouteEmail();
			}
			else
				selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	public void createBCWithCopyOption() throws InterruptedException {
		
		clickProceedButton();
		clickProceedButton();
		clickProceedButton();
	}
	
	
	public void createBCAndConfigurCG_TG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		verifyTG_And_CG_Configure_Options();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	public void createBCAndCalculateCG_TG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		calculate_CG_TG();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	public void createBCAndSelectDNCList(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList();
		calculate_CG_TG();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	
	public void createBCAndSelectDNCListForSeedingBC(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList();
		verifyTG_And_CG_Configure_Options();
		//calculate_CG_TG();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	public void createBCAndSelectDNCList_AndConfigureCG_TG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList();
		verifyTG_And_CG_Configure_Options();
		//calculate_CG_TG();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	


	public void validateNameField() throws InterruptedException, UnsupportedFlavorException, IOException {
		enterBroadcastName("efwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaqwqw");
		Assert.assertTrue(commonObjects.getTextFormTextField(broadcastName).length() == 50,
				"Error in character limit of name field");
	}

	public void checkDetailsTabHeaderColor() throws Exception {
		jswait.waitUntil(detailsTabHeader);
		String color = detailsTabHeader.getCssValue("background-color");
		Assert.assertEquals(color, "rgba(84, 205, 152, 1)", "wrong header color after pproceed");
	}
	
	public void verifyStartBroadcastDateTimeField() throws InterruptedException {
		assertTrue(StartBroadcastDateTimeField.isDisplayed());
	}

	public void validatePurposeField() throws InterruptedException, UnsupportedFlavorException, IOException {
		enterBroadcastName(
				"aaaaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasasdsd");
		Assert.assertTrue(commonObjects.getTextFormTextField(broadcastPurpose).length() == 500,
				"Error in character limit of purpose field");
	}

	public void verifySelectionFields() throws InterruptedException, UnsupportedFlavorException, IOException {
		selectLabelCrossell();
		selectLabelInformation();
		selectInventory(INVENTORY_UNLIMITED);
		selectInventory1();
		selectTrigger1();
		selectTrigger2();
		List<WebElement> tags = driver.findElements(By.xpath("//paper-tag/div"));
		Assert.assertTrue(tags.size() == 2, "error in multi select field");
	}
	
	public void clickValidateButton() throws InterruptedException {
		jswait.loadClick(validateButtonBc);
	}
	
	
	
	public void createBCAndVerifyStartBroadcastAtOption(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
		
		verifyStartBroadcastDateTimeField();
		
	}
	
	
	
	
	
	public void createBCWithoutTargetCondition(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickTargetConditionNoneOption();
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	public void ClickPermissions() throws InterruptedException {
		jswait.loadClick(Permissions);
	}
	public void Clickclickusers() throws InterruptedException {
		jswait.loadClick(clickusers);
	}
	public void ClickPermissionTitle() throws InterruptedException {
		jswait.loadClick(PermissionTitle);
	}
	
	public void ClickPermissionSave() throws InterruptedException {
		jswait.loadClick(PermissionSave);
	}
	
	
	public void createBCWith1MSubscribersAndConfigurCG_TG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickTargetConditionNoneOption();
		verifyCG_Configure_Options();
		
		clickProceedButton();
		selectOffer(offer);
		if(!bc_type.contains("Informational"))
		{
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}
		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	public void verifyCG_Configure_Options() throws InterruptedException {
		assertTrue(TGConfigure.isDisplayed());
		assertTrue(CGConfigure.isDisplayed());
//		jswait.loadClick(TGConfigure);
//		jswait.loadClick(defineLimit);
//		jswait.loadSendKeys(enterLimitField, "10");
//		jswait.loadClick(defineLimitSave);
		jswait.loadClick(CGConfigure);
		jswait.loadClick(defineCGSize);
		jswait.loadClick(defineCGLimitSave);
//		jswait.loadClick(calculateLimit);
//		Thread.sleep(4000);;
//		assertTrue(calculateText.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	
	
	
	public void verifyDeliveringStatusForBC() throws Throwable {
		  
		  
		  
		 
		  int size=statusDelivering.size();
		  System.out.println("Size before loop: "+size);
		  TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
		  while(size==0&& t.checkTimerMin(15)) {
			  
		  Thread.sleep(20000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  size=statusDelivering.size();
		  System.out.println(size);
		
		  
		  }
		 

		 
		  int size2=statusDelivering.size();
		  if(size2>0) {
			  for(WebElement Delivering : statusDelivering) {
				 
				  assertTrue(Delivering.isDisplayed());
				  
			  }
			  
		  }
		 
		
	  }
	
	
	
	
	
   public void verifyTargetedCount() throws Throwable {
		
		String count=targetCount.getText();
		System.out.println("Count: "+count);
		Exception targetCountExcep=new Exception("Target count is not correct");
		if(count.equals("9,00,000"))
			System.out.println("Target count is correct");
		else
			throw targetCountExcep;
			
		
		
	}
	
	
	
	
	
	
	 public void verifyTargetingStatusForBC() throws Throwable {
		  
		  
		  
		 
		  int size=statusTargetingCG.size();
		  System.out.println("Size before loop: "+size);
		  TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
		  while(size==0&& t.checkTimerMin(15)) {
			  
		  Thread.sleep(20000);
		  driver.navigate().refresh();
		  Thread.sleep(3000);
		  size=statusTargetingCG.size();
		  System.out.println(size);
		
		  
		  }
		 
//		  Thread.sleep(200000);
//		  driver.navigate().refresh();
//		  Thread.sleep(200000);
//		  driver.navigate().refresh();
//		  Thread.sleep(100000);
//		  driver.navigate().refresh();
//		  Thread.sleep(100000);
//		  driver.navigate().refresh();
//		  Thread.sleep(100000);
//		  driver.navigate().refresh();
//		  WebDriverWait wait = new WebDriverWait(driver,50);
//		  driver.navigate().refresh();
//		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//vaadin-grid-cell-content[contains(.,'Validating CG')]")));
		 
		  int size2=statusTargetingCG.size();
		  if(size2>0) {
			  for(WebElement Targeting : statusTargetingCG) {
				 
				  assertTrue(Targeting.isDisplayed());
				  
			  }
			  
		  }
		 
		
	  }
	   public void verifyPermissions() throws Exception {
		   jswait.failIfVisible(Permissions); 
	  }
	   
	   
	   
	   public void createBCWith1MSubscribersAndConfigurPartnerLevelCG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
			enterBroadcastBasicDetails(name,INVENTORY_UNLIMITED);
			if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
				System.out.println("inside triggerable");
				jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
				Thread.sleep(1000);
				jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
				Thread.sleep(2000);
				jswait.loadClick("//paper-item[contains(.,'trigger')]");
				Thread.sleep(1500);
			}
			clickProceedButton();
			selectBaseList(baseList);
			clickTargetConditionNoneOption();
			//verifyCG_Configure_Options();
			
			clickProceedButton();
			selectOffer(offer);
			if(!bc_type.contains("Informational"))
			{
				selectTrackSession();
				selectTrackingSource();
				selectSenderAndRoute();
			}
			else {
				jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
				jswait.loadClick(senderIdBroadcastAdressSmpp);
				jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

				jswait.loadClick(routeBroadcastSmppRobioutbound);	

				//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

			}
			clickProceedButton();
		}
		
	
	   
	   public void verifyTargetedCountForPartnerLevelCG() throws Throwable {
			
			String count=targetCountPartnerLevelCG.getText();
			System.out.println("Count: "+count);
			Exception targetCountExcep=new Exception("Target count is not correct");
			if(count.equals("8,00,000"))
				System.out.println("Target count is correct");
			else
				throw targetCountExcep;
				
			
			
		}
	   
	   public void VerifySendTrialPage() throws InterruptedException {
			
		   assertTrue(sendTrialMailIdField.isDisplayed());
		   assertTrue(sendTrialMailButton.isDisplayed());
		   assertTrue(sendTrialCloseButton.isDisplayed());
		   assertTrue(sendTrialMailIdField.isDisplayed());
		   assertTrue(sendTrialCancel.isDisplayed());
		   	   			  
			}
	   
public void addNotificationuser() throws Exception{
	
	//bcnotificationrecipient();
	Thread.sleep(2000);
	
	bcnotificationrecipientclick();
	Thread.sleep(2000);
	bcnotificationbeforesendingtime();
	bcnotificationbeforesendingtime1min();
	bcnotificationbeforeRendertime();
	bcnotificationbeforerendertime1min();
	
	bcnotificationatreceivebroadcastmsg();
	bcnotificationatcompletion();
	
}


public void addNotification2users() throws Exception{
	
	bcnotificationrecipient();
	Thread.sleep(2000);
	
	bcnotificationrecipientclick();
	bcnotificationbeforesendingtime();
	bcnotificationbeforesendingtime1min();
	bcnotificationbeforeRendertime();
	Thread.sleep(2000);
	bcnotificationbeforerendertime1min();
	bcnotificationatreceivebroadcastmsg();
	bcnotificationatcompletion();
	Thread.sleep(2000);
	bcNotificationsadd();
	bcnotificationrecipientclick2();
	bcnotificationbeforesendingtime();
	bcnotificationbeforesendingtime1min();
	Thread.sleep(2000);
	bcnotificationbeforeRendertime();
	bcnotificationbeforerendertime1min();
	bcnotificationatreceivebroadcastmsg();
	bcnotificationatcompletion();
	
}


public void Verifyemailnotification(String sheet) throws Exception {
	System.out.println("inside the verify email" );
	eh.setExcelFile("bcInputData",sheet);
	String name = (String) eh.getCell(1, 0);

	List<String> emaildata=EmailHandlergmail.fetch();
	System.out.println("after verify email" );
	System.out.println(emaildata.get(1));
	System.out.println(emaildata.get(2));
	System.out.println(emaildata.get(3));
	System.out.println(emaildata.get(4));
	String html=emaildata.get(1);
	String Subject=emaildata.get(2);
	String fromid=emaildata.get(3);
	if(Subject=="Broadcast Rendering Notification -"+name) {
	assertTrue(Subject.contains("Broadcast Finished - oneOffBC"));
	assertTrue(fromid.contains("flyops@flytxt.com <flyops@flytxt.com>"));}
	else if(Subject=="Broadcast Delivery Notification -"+name)
	{
		assertTrue(Subject.contains("Broadcast Delivery Notification -"+name));
		assertTrue(fromid.contains("flyops@flytxt.com <flyops@flytxt.com>"));}
	else if(Subject=="Broadcast Finished -"+name) 
	
	assertTrue(Subject.contains("Broadcast Finished -"+name));
	assertTrue(fromid.contains("flyops@flytxt.com <flyops@flytxt.com>"));
}

	
	
		



public void Verifyemail(String sheet) throws Exception {
	System.out.println("inside the verify email" );
	eh.setExcelFile("bcInputData",sheet);
	String name = (String) eh.getCell(1, 0);

	List<String> emaildata=EmailHandlergmail.fetch();
	System.out.println("after verify email" );
	System.out.println(emaildata.get(1));
	System.out.println(emaildata.get(2));
	System.out.println(emaildata.get(3));
	System.out.println(emaildata.get(4));
	String html=emaildata.get(1);
	String Subject=emaildata.get(2);
	String fromid=emaildata.get(3);
	Assert.assertTrue(html.contains("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><meta name=\"viewport\" content=\"target-densitydpi=device-dpi\"><meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;\" /><meta name=\"apple-mobile-web-app-capable\" content=\"yes\" /><meta name=\"HandheldFriendly\" content=\"true\" /><meta name=\"MobileOptimized\" content=\"width\" /><title>HDFC BANK</title><!-- Facebook sharing information tags --><!--<meta property=\"og:title\" content=\"HDFC BANK\" />--><style type=\"text/css\">/*img { height: auto; max-width: 100%;}*//* Forces Hotmail to display emails at full width. */.ExternalClass { width: 100%;}/* Forces Hotmail to display normal line spacing. */.ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div { line-height: 100%;}/* Prevents Webkit and Windows Mobile platforms from changing default font sizes. */body { -webkit-text-size-adjust: none; -ms-text-size-adjust: none; margin: 0; padding: 0;}/* Resets all body margins and padding to \"0\" for good measure. *//* Resolves webkit padding issue. */table { border-spacing: 0;}/* Resolves the Outlook 2007, 2010, and Gmail td padding issue. */table td { border-collapse: collapse;}/****** END BUG FIXES ********//****** EDITABLE STYLES - FOR YOUR TEMPLATE ********//* The \"body\" is defined here for Yahoo Beta because it does not support your body tag. Instead, it will create a wrapper div around your email and that div will inherit your embedded body styles. The \"#body_style\" is defined for AOL because it does not support your embedded body definition nor your body tag, we will use this class in our wrapper div. */body, #body_style { /* width:100% !important;*/ color: #333333; font-family: Arial, Helvetica, sans-serif; font-size: 13px; line-height: 1.4;}body {*width:600px; margin: 0 auto; width: 600px\\9;}/****** MEDIA QUERIES ********/ /* You must use attribute selectors in your media queries to prevent Yahoo from rendering these styles.  We added a yahoo attribute in the body tag to complete this fix.  More info: http://www.emailonacid.com/blog/details/C13/stop_yahoo_mail_from_rendering_your_media_queries */ /* Target mobile devices. */ /* @media only screen and (max-device-width: 600px) { */@media only screen and (min-width: 600px) {body { /*width:44.7%;*/ margin: 0 auto; width: 600px;}/*table{width:600px;}*/}@media only screen and (max-width: 480px) {body, table { width: 100%!important;}.font320 { font-size: 0.7em!important;}.font3201 { font-size: 1.2em!important;}.font3202 { font-size: 1.1em!important;}}@media only screen and (max-width: 599px) { /* TEMPORARY *//* Hide elements at smaller screen sizes (!important needed to override inline CSS). */body[yahoo] .hide { display: none !important;}/* Adjust table widths at smaller screen sizes. */body, table { width: 100% !important;}/*** END EDITABLE STYLES ***//*img { display: block; border: none; outline: none; text-decoration: none; width: 100%; height: 100%;} Remove spacing around Outlook 07, 10 tables */table { border-collapse: collapse; mso-table-lspace: 0pt; mso-table-rspace: 0pt;}}/*** END TEMPORARY ***/</style></head><body yahoo=\"fix\"><div id=\"body_style\"><h1></h1><img src=\"cid:logo.png\"><h1>THIS IS THE BODY OF EMAIL</h1><img height='0' width='0' alt='' src='http://t.mailer.hdfcbank.net/r/?id=h11b94d41,6e08f87,1'/><FORM method=\"POST\"      onSubmit=      \"return checkAnswer(this, 'C',       'correct.htm', 'wrong.htm');\"><INPUT TYPE=\"RADIO\" VALUE=\"A\" NAME=\"cc\">Another name for Java<BR><INPUT TYPE=\"RADIO\" VALUE=\"B\" NAME=\"cc\">When you use Java without compiling<BR><INPUT TYPE=\"RADIO\" VALUE=\"C\" NAME=\"cc\">A scripting language mostly for the web<BR><INPUT TYPE=\"SUBMIT\" VALUE=\"Submit Answer\"></FORM><SCRIPT language=\"JavaScript\"        type=\"text/javascript\"><!--//// Documentation://   http://chami.com/tips/javascript///function checkAnswer(quizForm,                     theAnswer,                     urlRight,                     urlWrong){  var s = \"?\";  // go through the \"current choices\"  // to find the selected choice.  // radio boxes pointing to choices  // must be named \"cc\"  // change if necessary  //  var i = 0;  for(;i<quizForm.elements.length;i++)  {    if((\"cc\" ==        quizForm.elements[i].name) &&       (quizForm.elements[i].checked))    {      s = quizForm.elements[i].value;    }  }  // no choice was selected  //  if(\"?\" == s)  {    alert(\"Please make a selection.\");    return false;  }  // check if we have the correct  // choice selected  //  if(s == theAnswer)  {    alert(\"'\"+s+\"' is correct!\");    if(urlRight)    {    document.location.href = urlRight;    }  }  else  {    alert(\"'\"+s+\"' is incorrect.\");    if( urlWrong )    {    document.location.href = urlWrong;    }  }  // return \"false\" to indicate not to  // submit the form.  // change this to \"true\" if the form  // \"action\" is valid,  // i.e. points to a valid CGI script  //  return false;}//--></SCRIPT></body></html>"));
	Assert.assertEquals(fromid,"flyops@flytxt.com");
//	assertTrue(Subject.contains("Broadcast Finished - oneOffBC"));
//	assertTrue(fromid.contains(""flyops@flytxt.com" <flyops@flytxt.com>"));
		}

public void Broadcast_Expiry() throws Exception{
	Thread.sleep(2000);
	jswait.loadClick(bcExpiryclick);
	Thread.sleep(4000);
	jswait.loadClick(expirestime);
	Thread.sleep(2000);
	jswait.loadClick(expiresAtoption);
	
	Calendar rightNow = Calendar.getInstance();
	String mn = "";
	if (rightNow.get(Calendar.MONTH) + 1 < 9) {
		mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
	} else
		mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
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
	
	jswait.loadClick(expirestimezone);
}






}
