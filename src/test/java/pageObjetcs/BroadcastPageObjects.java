package pageObjetcs;


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

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class BroadcastPageObjects extends Init {
	public BroadcastPageObjects() {
		PageFactory.initElements(driver, this);
	}

	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	public ExcelHelper eh = new ExcelHelper();
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
	@FindBy(xpath = ".//paper-icon-button[@icon='av:pause-circle-filled']")
	private WebElement broadcastPause;
	@FindBy(xpath = ".//paper-item[contains(.,'Send Trial')]")
	private WebElement broadcastSendTrial;
	@FindBy(xpath = "//paper-button[contains(.,'Send')]")
	private WebElement sendTrialMailButton;
	@FindBy(xpath = ".//paper-dialog[@id='savedialog']")
	private WebElement sendingMessageDialogueForSendTrialBC;
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
	
	@FindBy(xpath = "//paper-item[contains(.,'selenium_list_DND')]")
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
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Address-SMPP')]")
	private WebElement senderIdBroadcastAdressSmpp;
	@FindBy(xpath = ".//label[contains(.,'Route over which this broadcast')]/../input")
	private WebElement routeBroadcast;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/../input")
	private WebElement routeFulfillment;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'SMPP Robi outbound')]")
	private WebElement routeBroadcastSmppRobioutbound;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'Address-SMPP')]")
	private WebElement senderIdFulfillmentAdressSmpp;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'SMPP Robi outbound')]")
	private WebElement routeFulfillmentSmppRobioutbound;
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
	@FindBy(xpath = ".//*[@id='checkboxContainer']")
	private WebElement firstOfferCheckBox;
	@FindBy(xpath = ".//div[@id='radioLabel' and contains(.,'Never')]/../div[1]")
	private WebElement recurringBcEndNeverRadio;
	@FindBy(xpath = ".//div[@id='radioLabel' and contains(.,'At')]/../div[1]")
	private WebElement recurringBcEndAtRadio;
	@FindBy(xpath = ".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
	private WebElement topBcStatusGrid;
	@FindBy(xpath = ".//label[contains(.,'Start Date/Time')]")
	private WebElement StartBroadcastDateTimeField;
	
	
	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Targeting')]")
	private List <WebElement> statusTargetingCG;

	@FindBy(xpath = ".//div[@id='radioLabel' and contains(text(),'Create')]")
	private WebElement targetbccreate;
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-menu/div/paper-icon-item[3]")
	private WebElement bccopyasand;
	@FindBy(xpath = "(//iron-icon[@id='icon'])[23]")
	private WebElement clickCopiedAnd;
	@FindBy(xpath = "//target-form//condition-form[2]//following::paper-button[contains(text(),'Add AND')]")
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
	 @FindBy(xpath="//*[@id='bcNotificationForm']//vaadin-combo-box//following::vaadin-combo-box-item[contains(.,'syamkrishna cs')]")
	 private WebElement bcnotificationrecipientclick;
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
	 @FindBy(xpath="//div[@id='contentWrapper']/div/paper-menu/div//label[contains(.,'Permissions')")
	 private WebElement Permissions;
	 @FindBy(xpath=".//label[contains(.,'Select users who can edit this broadcast')]/../../../div")
	 private WebElement clickusers;
	 @FindBy(xpath="//paper-dialog[@id='addUserDialog']//span[.='Broadcast Edit Permissions']")
	 private WebElement PermissionTitle;
	 @FindBy(xpath="//paper-dialog[@id='addUserDialog']//paper-button[2][contains(.,Save)]")
	 private WebElement PermissionSave;
	 
	
	 
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
		jswait.loadSendKeys(bcnotificationrecipient, "syamkrishna cs");
		
		wait.until(ExpectedConditions.visibilityOf(bcnotificationrecipient)).sendKeys(Keys.SPACE);
		Thread.sleep(2000);
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
	public void bcremovebutton() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(bcremovebutton);
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
	 
	  while(size==0) {
		  
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
	
	 public void verifyValidatingCGStatusForBC() throws Throwable {
		  
		  
		  
		 
		  int size=statusValidatingCG.size();
		  System.out.println("Size before loop: "+size);
		 
		  while(size==0) {
			  
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

	public void selectInventoryUnlimited() throws InterruptedException {
		jswait.loadSendKeys(inventorySelector, "Unlimited");
		jswait.loadClick(inventoryUnlimited);
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
		jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
		jswait.loadClick(senderIdBroadcastAdressSmpp);
		jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");
		jswait.loadClick(routeBroadcastSmppRobioutbound);
		jswait.loadSendKeys(senderIdFulfillmentSelector, "Address-SMPP");
		// jswait.loadClick(senderIdFulfillmentSelector);
		// Thread.sleep(4000);
		jswait.loadClick(senderIdFulfillmentAdressSmpp);
		// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
		jswait.loadSendKeys(routeFulfillment, "SMPP Robi outbound");
		Thread.sleep(2000);
		jswait.loadClick(routeFulfillmentSmppRobioutbound);
	}

	public void enterBroadcastBasicDetails(String name) throws InterruptedException {
		enterBroadcastName(name);
		enterBroadcastPurpose("Purpose of BC is NOTHING");
		selectLabelCrossell();		
		selectInventoryUnlimited();
		selectROI();
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
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

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
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	public void createBCAndCalculateCG_TG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	public void createBCAndSelectDNCList(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	
	
	public void createBCAndSelectDNCListForSeedingBC(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}
	
	
	public void createBCAndSelectDNCList_AndConfigureCG_TG(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

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
		selectInventoryUnlimited();
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
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

			jswait.loadClick(routeBroadcastSmppRobioutbound);	

			//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
		
		verifyStartBroadcastDateTimeField();
		
	}
	
	
	
	
	
	public void createBCWithoutTargetCondition(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

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
		enterBroadcastBasicDetails(name);
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
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

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
		jswait.loadClick(calculateLimit);
		Thread.sleep(4000);;
		assertTrue(calculateText.isDisplayed());
		Thread.sleep(2000);
		
	}
	
	
	
	 public void verifyTargetingStatusForBC() throws Throwable {
		  
		  
		  
		 
		  int size=statusTargetingCG.size();
		  System.out.println("Size before loop: "+size);
		 
		  while(size==0) {
			  
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
	


}
