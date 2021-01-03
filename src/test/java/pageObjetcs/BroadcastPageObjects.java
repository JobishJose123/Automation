package pageObjetcs;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.openqa.selenium.chrome.ChromeDriver;
import baseClasses.ShellExecuter;
import com.google.common.collect.Table.Cell;

import baseClasses.CalenderUtility;
import baseClasses.EmailHandlergmail;
//import baseClasses.EmailHandlergmail;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.PdfReader;
import baseClasses.SQLHandler;
import baseClasses.TimeoutImpl;
import stepDefinitions.BroadcastSteps;
import org.apache.poi.ss.usermodel.Sheet;

public class BroadcastPageObjects extends Init {
	public BroadcastPageObjects() {
		PageFactory.initElements(driver, this);
	}
	LandingPageObjects landingPage = new LandingPageObjects();

	JSWaiter jswait = new JSWaiter();
	PdfReader pdfReader = new PdfReader();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	public ExcelHelper eh = new ExcelHelper();
	public ExcelHelper eM = new ExcelHelper();
	CampaignObjects campaignObjects = new CampaignObjects();
	CommonObjects commonObjects = new CommonObjects();
	CalenderUtility calenderUtility = new CalenderUtility();
	@FindBy(xpath = "//paper-button[contains(.,'Create New Broadcast')]")
	private WebElement createNewBroadcastButton;
	@FindBy(xpath = "//paper-item[contains(.,'View Broadcasts')]")
	private WebElement viewBroadcast;
	@FindBy(xpath = "//paper-item[contains(.,'Export As PDF')]")
	private WebElement exportBroadcast;
	@FindBy(xpath = "//paper-item[contains(.,'View')]")
	private WebElement broadcastView;
	 @FindBy(xpath = "//paper-icon-button[@icon='block']")
		private WebElement broadcastAbort;
		@FindBy(xpath = "//paper-icon-button[@icon='pan-tool']")
		private WebElement broadcastAbortOtherThanOneTime;
		
		
		@FindBy(xpath = ".//paper-item[contains(.,'Copy')]")
		private WebElement broadcastCopy;
		@FindBy(xpath = ".//paper-item[contains(.,'View Details')]")
		private WebElement broadcastViewDetails;
		@FindBy(xpath = "//paper-icon-button[@icon='av:pause-circle-filled']")
		private WebElement broadcastPause;;
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

	@FindBy(xpath = "//paper-dialog[@id='confirmBoxAbort']//paper-button[contains(.,'Yes')]")
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
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-listbox/paper-item[contains(.,'At')]")
	private WebElement trackSessionAT;
	@FindBy(xpath = "//paper-item[contains(.,'" + SELENIUM_DND_LIST + "')]")
	private WebElement DNCList;

	@FindBy(xpath = "//paper-item[text()='" + SELENIUM_MANDATORY_DND_LIST + "']")
	private WebElement seleniumDNDMandatoryList;
	@FindBy(xpath = "//paper-item[text()='" + SELENIUM_OPTIONAL_DND_LIST + "']")
	private WebElement seleniumDNDOptionalList;

	@FindBy(xpath = ".//paper-button[contains(.,'DNC Exclusions')]")
	private WebElement DNCExclusionOption;
	@FindBy(xpath = ".//paper-dialog[@class='style-scope dnc-exclusion x-scope paper-dialog-0']")
	private WebElement DNCExclusionList;
	@FindBy(css = "[icon=\"icons\\:remove-circle\"]")
	private WebElement DNCListRemoveButton;
	// paper-dialog[@class='style-scope dnc-exclusion x-scope
	// paper-dialog-0']//data-table-cell//iron-icon

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
//	@FindBy(xpath = ".//paper-dialog[@id='changeSettings']//div[contains(.,'Fixed percentage of Target Base')]//following::input[2]")
//	private WebElement enterLimitField;
	@FindBy(xpath = ".//paper-radio-group//paper-input-wrapper[@class='define-limit-style style-scope cvm-settings']//input[@id='input']")
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
	private List<WebElement> statusValidatingCG;
	@FindBy(xpath = ".//paper-dialog[@id='changeSettings']//div[contains(.,'Fixed percentage of Target Base')]")
	private WebElement defineCGSize;
	@FindBy(xpath = ".//*[@id='offerDetailForm']//paper-input-wrapper//input")
	private WebElement trackSession2Days;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Broadcast')]/../input")
	private WebElement senderIdBroadcastSelector;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/../input")
	private WebElement senderIdFulfillmentSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'" + SENDER_SMPP + "')]")
	private WebElement senderIdBroadcastAdressSmpp;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'" + SENDER_EMAIL + "')]")
	private WebElement senderIdBroadcastEmail;
	@FindBy(xpath = ".//label[contains(.,'Route over which this broadcast')]/../input")
	private WebElement routeBroadcast;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/../input")
	private WebElement routeFulfillment;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'" + ROUTE_SMPP + "')]")
	private WebElement routeBroadcastSmppRobioutbound;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'" + ROUTE_EMAIL + "')]")
	private WebElement routeBroadcastEmail;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"
			+ SENDER_SMPP + "')]")
	private WebElement senderIdFulfillmentAdressSmpp;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"
			+ ROUTE_SMPP + "')]")
	private WebElement routeFulfillmentSmppRobioutbound;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"
			+ SENDER_EMAIL + "')]")
	private WebElement senderIdFulfillmentEmail;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"
			+ ROUTE_EMAIL + "')]")
	private WebElement routeFulfillmentEmail;
	@FindBy(xpath = ".//label[contains(.,'Track session')]/../input")
	private WebElement trackSessionSelector;
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-listbox/paper-item[contains(.,'After')]")
	private WebElement trackSessionAfter;
	@FindBy(xpath = "//*[@id='offerDetailForm']//paper-input-wrapper//input")
	private WebElement trackSessionInput;
	@FindBy(xpath = ".//label[contains(.,'Tracking Source')]/../input")
	private WebElement trackingSourceSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'"+TRACK_SOURCE+"')]")
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
	@FindBy(xpath = "//div[@val='broadcastViews']//vaadin-grid-table-row[3]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
	private WebElement topBcStatusGridForRecurrChild;
	@FindBy(xpath = "//div[@val='broadcastViews']//vaadin-grid-table-row[2]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
	private WebElement topBcStatusGridForSeedingChild;
	@FindBy(xpath = "//div[@val='broadcastViews']//vaadin-grid-table-row[6]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
	private WebElement topBcStatusGridForSeedingrecurringChild;
	
	@FindBy(xpath = "//div[@val='broadcastViews']//vaadin-grid-table-row[1]/vaadin-grid-table-cell[5]/vaadin-grid-cell-content")
	private WebElement topBcTargetedGrid;
	@FindBy(xpath = ".//label[contains(.,'Start Date/Time')]")
	private WebElement StartBroadcastDateTimeField;

	@FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'8,00,000')]")
	private WebElement targetCountPartnerLevelCG;

	@FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'9,00,000')]")
	private WebElement targetCount;

	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Targeting')]")
	private List<WebElement> statusTargetingCG;

	@FindBy(xpath = ".//vaadin-grid-cell-content[contains(.,'Delivering')]")
	private List<WebElement> statusDelivering;

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

	@FindBy(xpath = "//*[contains(text(),'One-time')]/..")
	private WebElement oneOffRadioButton;
	@FindBy(xpath = ".//label[contains(.,'Send Time')]/../input")
	private WebElement oneOffSendTimeField;
	@FindBy(xpath = ".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]")
	private WebElement oneOffSendTimeDateOkButton;
	@FindBy(xpath = "//paper-dialog[@id='productDialog']//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	private WebElement productFilterIcon;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Product Name')]/../input")
	private WebElement filterProductNameField;
	@FindBy(xpath = "//iron-data-table[@id='productTable']//paper-dialog[@id='filterDialog']/div/paper-button[3]")
	private WebElement productFilterApplyButton;
	@FindBy(xpath = "//form[@id='bcNotificationForm']//label[contains(.,'Recipient')]//..//input")
	private WebElement bcnotificationrecipient;
	@FindBy(xpath = "//form[@id='bcNotificationForm']//label[contains(.,'Before Sending')]//following::iron-icon[1]")
	private WebElement bcnotificationbeforesendingtime;
	@FindBy(xpath = "//form[@id='bcNotificationForm']//label[contains(.,'Before Sending')]//following::paper-listbox//paper-item[2]")
	private WebElement bcnotificationbeforesendingtime1min;
	@FindBy(xpath = "//form[@id='bcNotificationForm']//label[contains(.,'Before Rendering')]//following::iron-icon[1]")
	private WebElement bcnotificationbeforeRendertime;
	@FindBy(xpath = "//form[@id='bcNotificationForm']//label[contains(.,'Before Rendering')]//following::paper-listbox//paper-item[2]")
	private WebElement bcnotificationbeforerendertime1min;
	@FindBy(xpath = "//*[@id='bcNotificationForm']//vaadin-combo-box//following::vaadin-combo-box-item[contains(.,'Selenium user')]")
	private WebElement bcnotificationrecipientclick;
	@FindBy(xpath = "//*[@id='bcNotificationForm']//vaadin-combo-box//following::vaadin-combo-box-item[contains(.,'System Administrator')]")
	private WebElement bcnotificationrecipientclick2;
	@FindBy(xpath = "//bc-notifications-list//paper-button[contains(.,'Remove')]")
	private WebElement bcremovebutton;
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
	private List<WebElement> deliveringStatusBC;
	@FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'Completed')]")
	private List<WebElement> compltedeStatusBC;
	@FindBy(xpath = "//vaadin-grid-cell-content[contains(.,'Render Scheduled')]")
	private List<WebElement> renderScheduledStatusBC;
	@FindBy(xpath = "//div[@id='contentWrapper']/div/paper-menu/div//label[contains(.,'Permissions')]")
	private WebElement Permissions;
	@FindBy(xpath = ".//label[contains(.,'Select users who can edit this broadcast')]/../../../div")
	private WebElement clickusers;
	@FindBy(xpath = "//paper-dialog[@id='addUserDialog']//span[.='Broadcast Edit Permissions']")
	private WebElement PermissionTitle;
	@FindBy(xpath = "//paper-button[contains(.,'Save')]")
	private WebElement PermissionSave;

	@FindBy(xpath = ".//p[contains(.,'04 Sep 2018 03:21 PM GMT+05:30')]")
	private WebElement sendTimeData;
	@FindBy(xpath = ".//p[contains(.,'04 Sep 2018 03:21 PM GMT+05:30')]")
	private WebElement sendTimeText;
	@FindBy(xpath = "//paper-radio-button[contains(.,'No Control Group')]")
	private WebElement noControlGroupRadioButton;
	@FindBy(xpath = ".//h4[contains(.,'Target Details')]")
	private WebElement viewTargetDetails;

	@FindBy(xpath = "(//form[@id='bcNotificationForm']//..//paper-checkbox[1])[1]")
	private WebElement bcnotificationatcompletion;
	@FindBy(xpath = "(//form[@id='bcNotificationForm']//..//paper-checkbox[1])[2]")
	private WebElement bcnotificationatreceivebroadcastmsg;
	@FindBy(xpath = "(//label[contains(.,'Recipient')]//following::paper-icon-button[2])[2]")
	private WebElement recipientclick;

//	@FindBy(xpath = ".//form[@id='bcExpiryForm']//paper-checkbox//div[contains(.,'Broadcast Expiry')]")
//	private WebElement bcExpiryclick;
	
	@FindBy(xpath = ".//form[@id='bcExpiryForm']//paper-checkbox//div[contains(.,'Broadcast Expiry')]")
	private WebElement bcExpiryclick;
	
	
//	@FindBy(xpath = " .//form[@id='bcExpiryForm']//label[contains(.,'Expires')]//following::iron-icon[2]")
//	private WebElement expirestime;
	
	@FindBy(xpath = "//paper-input-container[@id='inputContainer']//div[@class='input-content style-scope paper-input-container']//input[@id='input']")
	private WebElement expirestime;
	
	
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'At')]")
	private WebElement expiresAtoption;
//	@FindBy(xpath = "//form[@id='bcExpiryForm']//paper-item[contains(.,'After')]")
//	private WebElement expiresAfteroption;
	@FindBy(xpath = ".//vaadin-combo-box-item[contains(text(),'After')]")
	private WebElement expiresAfteroption;
	@FindBy(xpath = ".//form[@id='bcExpiryForm']//label[contains(.,'Expires')]//following::iron-icon[5]")
	private WebElement expirestimezone;
	@FindBy(xpath = "//paper-radio-button[contains(.,'Saved Segments')]")
	private WebElement savedSegmentRadioButtion;
	@FindBy(xpath = "//label[contains(.,'Saved Segments')]/../..//input")
	private WebElement savedSegmentSelectorField;

	@FindBy(xpath = "//p[contains(.,'DNC Count')]//following::p[1]")
	private WebElement DNC_count_bc;
	@FindBy(xpath = "//paper-button[contains(.,'Calculate')]//following::label[@class='calc style-scope stats-calculate']")
	private WebElement targetcountstatus;
	@FindBy(xpath = "//paper-button[contains(.,'Target Count:')]")
	private WebElement targetcountbtn;
	@FindBy(xpath = "//label[contains(.,'Target Count')]//following::label[contains(.,'200')]")
	private WebElement targetverify;
	@FindBy(xpath = "//paper-button[contains(.,'Calculate')]")
	private WebElement calculatebtn;
	@FindBy(xpath = "//schedule-expiry-settings//paper-input-wrapper//input[@id=\"input\"]")
	private WebElement bcExpireAfterHours;
	@FindBy(xpath = "//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	private WebElement filterIcon;
	@FindBy(xpath="(//div[@id='toggleButton'])[2]")
	 private WebElement autoRefreshButtonTrigger;
	@FindBy(xpath="(//div[@id='toggleButton'])[3]")
	 private WebElement autoRefreshButtonRecurr;
	@FindBy(xpath="(//div[@id='toggleButton'])[4]")
	 private WebElement autoRefreshButtonSeeding;
	 @FindBy(xpath="(//span[contains(.,'Do you want to abort all related broadcasts')]//following::paper-button[contains(.,'Yes')])[2]")
	 private WebElement AbortYes ;
	
	 @FindBy(xpath="//label[@id='label']//following::input[@placeholder='Select a Language']")
	 private WebElement selectLanguage;
	 @FindBy(xpath="//vaadin-combo-box-item[contains(.,'Arabic')]")
	 private WebElement selectArabic ;
	 @FindBy(xpath="//paper-button[contains(.,'Target Group')]")
	 private WebElement selectTargetGroup ;
	 @FindBy(xpath="//div[@id='radioContainer']//following::div[contains(.,'No Limit')][@id='radioLabel']")
	private WebElement noLimitTGRadiobtn;
		 @FindBy(xpath="(//div[@class='buttons style-scope cvm-settings']//paper-button[contains(.,'Save')])[2]")
	 private WebElement TGSavebtn ;
	 @FindBy(xpath="(//div[@class='buttons style-scope cvm-settings']//paper-button[contains(.,'Save')])[1]")
	 private WebElement CGSavebtn ;
	 @FindBy(xpath="//paper-button[contains(.,'Control Group')]")
	 private WebElement selectControlGroup;

	@FindBy(xpath = "//paper-button[@class='btn-back style-scope broadcast-offer-selected x-scope paper-button-0']")
	private WebElement backToOffers;
	@FindBy(xpath = "//paper-button[@class='btn-back style-scope broadcast-offer-selected x-scope paper-button-0']")
	private WebElement clearSavedSegment;
	@FindBy(xpath = "//div[@id='radioContainer']//following::div[contains(.,'No Control Group')][@id='radioLabel']")
	private WebElement noControlGroup;
	@FindBy(xpath = "//div[@id='radioContainer']//following::div[contains(.,'Fixed percentage')][@id='radioLabel']")
	private WebElement fixedPercentageOfTargetBase;
	@FindBy(xpath = "(//input[@id='input'][@type='number'])[1]")
	private WebElement fixedPercentNumber;
	@FindBy(xpath = "(//h2[contains(.,'Exclude Do-Not-Contact List ')]//following::paper-icon-button[@id='clear'])[1]")
	private WebElement DNCListClose;
	@FindBy(xpath = "//paper-button[contains(.,'DNC Exclusions')]")
	private WebElement DNCExclusion;
	@FindBy(xpath = "//div[@id='radioLabel'][contains(.,'Never')]")
	private WebElement neverRadiobtn;
	@FindBy(xpath = "//div[@id='radioLabel'][contains(.,'At')]")
	private WebElement atRadiobtn;
	@FindBy(xpath = "//label[contains(.,'End Date/Time')]//following::input[1]")
	private WebElement endDateInput;
	@FindBy(xpath = "//label[contains(.,'End Date/Time')]//following::input[2]")
	private WebElement endTimeInput;
	@FindBy(xpath = "(//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2])[2]")
	private WebElement dateOkbtn;
	@FindBy(xpath = "(.//*[@id='timeDialog']/div/paper-button[2])[2]")
	private WebElement timeOkbtn;
	@FindBy(xpath = ".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input")
	private WebElement recurrencePatternInput;
	@FindBy(xpath = "//*[@id='deliver-card']//paper-item[contains(.,'Days')]")
	private WebElement recurrencePatternDays;
	@FindBy(xpath = "//*[contains(@class,'recurrence')]//input")
	private WebElement recurrenceInput;
	@FindBy(xpath = "//*[@id='deliver-card']//paper-item[contains(.,'Months')]")
	private WebElement recurrencePatternMonth;
	@FindBy(xpath = "//div[@id='radioLabel'][contains(.,'Select special day')]/..")
	private WebElement selectSpecialDay;
	@FindBy(xpath = "(//label[contains(.,'Order of the Day')]//following::input)[1]")
	private WebElement  orderOfTheDayInput;
	@FindBy(xpath = "//paper-item[contains(.,'5th')]")
    private WebElement orederOfDay5;
	@FindBy(xpath = "//label[contains(.,'Type of Day')]/..//input")
	private WebElement TypeOfDayInput;
	@FindBy(xpath = "//paper-item[contains(.,'Weekend Day')]")
	private WebElement weekEndDay;
	@FindBy(xpath = "//*[@id='deliver-card']//paper-item[contains(.,'Months')]")
	private WebElement recurrencePatternMonths;
	@FindBy(xpath = "//*[@id='deliver-card']//paper-item[contains(.,'Weeks')]")
	private WebElement recurrencePatternWeeks;
	@FindBy(xpath = "(//label[contains(.,'Start broadcasts at')]//following::input)[1]")
	private WebElement startBroadcastAtInput;
	@FindBy(xpath = "//div[contains(.,'Broadcast Expiry')][@id='checkboxLabel']")
	private WebElement broadcastExpiryCheckbox;
	@FindBy(xpath = "(//label[contains(.,'Expires')]//following::input)[1]")
	private WebElement expiresInput;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'After')]")
	private WebElement expiresAfter;
	@FindBy(xpath = "//label[contains(.,'Hours')]//preceding::input[1]")
	private WebElement expiresTimeInput;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'After')]//following::vaadin-combo-box-item[contains(.,'At')]")
	private WebElement expiresAt;
	@FindBy(xpath = "(.//*[@id='timeDialog']/div/paper-button[2])[3]")
	private WebElement expiryTimeOkbtn;
	@FindBy(xpath="(//label[contains(.,'Start broadcasts at')]//following::paper-button[contains(.,'OK')])[2]")
	private WebElement  startBroadcastOkbtn;
	 @FindBy(xpath="//paper-item[contains(.,'View')]")
		private WebElement BcViewbtn;
		@FindBy(xpath="//h4[contains(.,'Target Details')]")
		private WebElement ViewTargetDetails;
		@FindBy(xpath="//h4[contains(.,'Offer details')]")
		private WebElement ViewOfferDetails;
		@FindBy(xpath="//iron-icon[@title='Select Columns']")
		private WebElement selectColumn;
		@FindBy(xpath="//label[contains(.,'Delivery Information')]//following::div[@id='checkboxLabel'][contains(.,'Delivered')]")
		private WebElement selectColumnDelivered;
		@FindBy(xpath="//paper-checkbox[@id='overall_cg']")
		private WebElement selectCg;
		@FindBy(xpath="//paper-button[contains(.,'Next')]")
		private WebElement nextbtn;
		@FindBy(xpath="//paper-button[contains(.,'Save')]")
		private WebElement savebtn;
		@FindBy(xpath="//div[@id='refresh']")
		private WebElement refreshReport;
		@FindBy(xpath = "//h4[contains(.,'Broadcast Expiry')]//following::input[2]")
		private WebElement expiresTimeInputAt;
		@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[3]")
		private WebElement recurringChildOptionIcon;
		@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[5]")
		private WebElement seedingRecurrRewardingChildOptionIcon;
		@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[6]")
		private WebElement seedingRecurrMessagingChildOptionIcon;
		@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[2]")
		private WebElement RecurringChildOptionIconAt;
		@FindBy(xpath="//div[@class='headingDiv layout horizontal justified style-scope stats-calculate']//iron-icon[@id='icon']")
		private WebElement calculatedCountsCloseBtn;
		@FindBy(xpath="//div[contains(.,'Confirmed Delivery')][@id='checkboxLabel']/..")
		private WebElement drCheckBox ;
		@FindBy(xpath="(//div[contains(.,'Conversion')][@id='checkboxLabel'])[1]")
		private WebElement conversionCheckBox ;
		@FindBy(xpath="//div[contains(.,'Fulfillment Success')][@id='checkboxLabel']")
		private WebElement fulfillmentCheckBox;
		@FindBy(xpath="//iron-icon[@title='Apply']")
		private WebElement applyEventFilter;
		
		@FindBy(xpath="//label[contains(.,'Triggers')]//following::input[1]")
		private WebElement triggerInput;
		@FindBy(xpath="//paper-checkbox[@id='broadcast_cg']")
	    private WebElement selectBCCg;
	    @FindBy(xpath="//div[contains(.,'Control Group Participation')][@id='checkboxLabel']/..")
		private WebElement  controlGroupParticipation;
		@FindBy(xpath="//div[contains(.,'Is Seeding')][@id='checkboxLabel']")
		private WebElement isSeedingCheckBox;
		@FindBy(xpath="//div[contains(.,'Is Triggered')][@id='checkboxLabel']")
		private WebElement isTriggeredCheckBox;
		@FindBy(xpath="//div[@id='checkboxLabel'][contains(.,'Control Group Participation')]/..")
		private WebElement cgParticipationEvent;
		@FindBy(xpath="//div[@id='checkboxLabel'][contains(.,'Control Group Conversion')]/..")
		private WebElement cgConversionEvent;
		@FindBy(xpath="//iron-icon[@title='Save']")
		private WebElement saveBCReport;
		@FindBy(xpath="(//h2[contains(.,'Save Filter')]//following::paper-button[contains(.,'Save')])[1]")
		private WebElement saveBCReportPaperbtn;
		@FindBy(xpath="//div[contains(.,'Select Event Types')][@id='checkboxLabel']")
		private WebElement selectAllEventCheckBox;
		@FindBy(xpath="//span[contains(.,'blackout_manual')]")
		private WebElement blackoutRule;
		@FindBy(xpath="//paper-button[contains(.,'Add New Blackout Period')]")
		private WebElement addBlackoutPeriodbtn;
		@FindBy(xpath="//label[contains(.,'Start Day')]//following::input[1]")
		private WebElement blackoutstartDayInput;
		@FindBy(xpath="//label[contains(.,'End Day')]//following::input[1]")
		private WebElement  blackoutendDayInput;
		@FindBy(xpath="//label[contains(.,'End Action')]//following::input[1]")
		private WebElement blackoutendActionInput;
		@FindBy(xpath="//paper-item[contains(.,'Resume Manually')]")
		private WebElement blackoutresumeManually;
		@FindBy(xpath="//label[contains(.,'Start Time')]//following::input[1]")
		private WebElement startTimeInput;
		@FindBy(xpath="//label[contains(.,'End Time')]//following::input[1]")
		private WebElement blackoutendTimeInput;
		@FindBy(xpath="//label[contains(.,'Expiry Day')]//following::input[1]")
		private WebElement blackoutexpiryDayInput; 
		@FindBy(xpath="//label[contains(.,'Expiry Time')]//following::input[1]")
		private WebElement blackoutexpiryTimeInput;
		@FindBy(xpath="//h3[contains(.,'Create New Blackout Period')]//following::paper-button[contains(.,'Save')]")
		private WebElement saveBlackoutPeriod;
		@FindBy(xpath="//div[@id='radioLabel'][contains(.,'Broadcast Schedule')]")
		private WebElement bcScheduleRadiobtn;
		@FindBy(xpath="(//h4[contains(.,'Target Render Time')]//following::label[contains(.,'Start broadcasts')]//following::input[1])[1]")
		private WebElement startBroadcastInput;
		@FindBy(xpath="(//h4[contains(.,'Target Render Time')]//following::label[contains(.,'Start broadcasts')]//following::input[1])[2]")
		private WebElement startBcAtInput; 
		@FindBy(xpath="//h4[contains(.,'Target Render Time')]//following::paper-item[contains(.,'At')]")
		private WebElement renderTimeAt;
		@FindBy(xpath="(//h4[contains(.,'Target Render Time')]//following::paper-button[contains(.,'OK')])[2]")
		private WebElement TargetRenderTimeOKbtn;
		@FindBy(xpath="(//paper-button[contains(.,'OK')])[1]")
		private WebElement startTimeOKbtn;
		@FindBy(xpath="(//paper-button[contains(.,'OK')])[2]")
		private WebElement endTimeOKbtn;
		@FindBy(xpath="(//paper-button[contains(.,'OK')])[3]")
		private WebElement blackoutExpiryOKbtn;
		@FindBy(xpath="//h4[contains(.,'Target Render Time')]//following::paper-item[contains(.,'Before')]")
		private WebElement renderTimeBefore;
		@FindBy(xpath="//label[contains(.,'Hours')]//following::input[1]")
		private WebElement broadcastRenderBeforeInput;
		@FindBy(xpath = "//label[contains(.,'Email Profile Field')]/../input")
		private WebElement emailProfileField;
		@FindBy(xpath="//label[contains(.,'Feedback Name')]//following::input[1]")
		private WebElement feedbackNameInput;
		@FindBy(xpath="//label[contains(.,'Feedback Name')]//following::input[2]")
		private WebElement feedbackDescpInput;
		@FindBy(xpath="//label[contains(.,'Channel')]//following::input[1]")
		private WebElement channelInput;
		@FindBy(xpath="//paper-item[contains(.,'SMS')]")
		private WebElement channelSMS;
		@FindBy(xpath="//label[contains(.,'Language')]//following::input[1]")
		private WebElement feedbackCreativeLanguage;
		@FindBy(xpath="//paper-item[contains(.,'English')]")
		private WebElement feedbackLangEng;
		@FindBy(xpath="//label[contains(.,'Title')]//following::input[1]")
		private WebElement feedbackTitleInput;
		@FindBy(xpath="//label[contains(.,'Title')]//following::textarea")
		private WebElement feedbackDetailsInput;
		
		
		
		
		
		
		public void calculatedCountsCloseBtn() throws InterruptedException {
			jswait.loadClick(calculatedCountsCloseBtn);
		}
	public void backToOffers() throws InterruptedException {
		jswait.loadClick(backToOffers);
	}

	public void targetDetailsBC() throws InterruptedException {
		jswait.loadClick(targetDetailsBC);
	}

	public void savedSegmentSelectorField() throws InterruptedException {
		jswait.loadClick(savedSegmentSelectorField);
	}

	public void offerDetailsBC() throws InterruptedException {
		jswait.loadClick(offerDetailsBC);
	}

	public void enterBroadcastName(String name) throws InterruptedException {
		jswait.loadSendKeys(broadcastName, name);
	}

	public void enterFilterProductName(String name) throws InterruptedException {
		jswait.loadSendKeys(filterProductNameField, name);
	}

	public void selectOneOffSendTimeDate(String date) throws InterruptedException {
		jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
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

	// *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//
	public void bcnotificationrecipient() throws InterruptedException {
		//jswait.loadSendKeys(bcnotificationrecipient, "selenium");
		jswait.loadSendKeys(bcnotificationrecipient, "Selenium");

		wait.until(ExpectedConditions.visibilityOf(bcnotificationrecipient)).sendKeys(Keys.SPACE, Keys.BACK_SPACE);
		Thread.sleep(2000);
		// jswait.loadClick(recipientclick);
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

	public void selectRecurrancePattern(String type, String sheet) throws InterruptedException {
		eh.setExcelFile("bcInputData", sheet);
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

		if (type.contentEquals("days")) {
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
			Thread.sleep(1000);
			jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
			Thread.sleep(1000);

		} else if (type.contentEquals("months")) {
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Months')]");
			Thread.sleep(1000);
			jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input",
					eh.getCellByColumnName("Recur every months"));
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Select days')]/..//input");
			String daysStr = eh.getCellByColumnName("Recur on");
			String[] days = daysStr.split(",");
			for (int i = 0; i < days.length; i++)
				jswait.loadClick(".//*[@id='days']//div[text()='" + days[i] + "']/../..");
			jswait.loadClick(".//*[@id='dayDialog']//paper-button[text()='Done']");
		}
		jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
		Thread.sleep(2000);
		jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
		WebElement num = driver.findElement(By.xpath(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
						+ (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
//	      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
		WebElement num1 = driver.findElement(By.xpath(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
						+ (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();

		Thread.sleep(1000);
		if (am_pm == 0)
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
		else
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
		Thread.sleep(2000);
		jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
		Thread.sleep(2000);
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");

	}

	public void selectOneOffDateAndTimeNow() throws InterruptedException {
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
	
	
public String getTopBcStatus(String bcType) throws Exception {
		
		String status="";
		if (bcType.equals("one-off")||bcType.equals("seedingoneoff")||bcType.equals("TriggerOneoff")||bcType.equals("seedingTriggerable")) {
			jswait.waitUntil(topBcStatusGrid);
			 status = topBcStatusGrid.getText();			
		}else if(bcType.equals("recurring")||bcType.equals("TriggerReccurringBC")) {
			
			jswait.waitUntil(topBcStatusGridForRecurrChild);
			 status = topBcStatusGridForRecurrChild.getText();
			
		}else if(bcType.equals("seedingRecurring")||bcType.equals("seedingTriggerableRecurringBC")) {
			
			jswait.waitUntil(topBcStatusGridForSeedingrecurringChild);
			status = topBcStatusGridForSeedingrecurringChild.getText();
		}
		
		return status;
	}
	

	public String getTopBcTargeted() throws InterruptedException {
		jswait.waitUntil(topBcTargetedGrid);
		String status = topBcTargetedGrid.getText();
		return status;
	}

	public String getBcStatus(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'" + bcName
				+ "')]/../vaadin-grid-table-cell[2]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"
				+ bcName + "')]/../vaadin-grid-table-cell[2]/vaadin-grid-cell-content")).getText();
		return status;
	}

	public String getBcTargtedCount(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'" + bcName
				+ "')]/../vaadin-grid-table-cell[6]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"
				+ bcName + "')]/../vaadin-grid-table-cell[6]/vaadin-grid-cell-content")).getText();
		return status;
	}

	public String getBcSentCount(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'" + bcName
				+ "')]/../vaadin-grid-table-cell[7]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"
				+ bcName + "')]/../vaadin-grid-table-cell[7]/vaadin-grid-cell-content")).getText();
		return status;
	}

	public String getBcAcknowledgedCount(String bcName) throws Exception {
		jswait.waitUntil(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'" + bcName
				+ "')]/../vaadin-grid-table-cell[8]/vaadin-grid-cell-content");
		String status = driver.findElement(By.xpath(".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[1][contains(.,'"
				+ bcName + "')]/../vaadin-grid-table-cell[8]/vaadin-grid-cell-content")).getText();
		return status;
	}

	public void clickCreateButton() throws InterruptedException {
		jswait.loadClick(createButtonBc);
	}

	public void getSendTimeData() throws InterruptedException, UnsupportedFlavorException, IOException {

		String SendTime = jswait.getTextFormElement("//h4[@class='style-scope broadcast-deliver-summary']");
		int index1 = SendTime.indexOf(",");

		SEND_TIME_DATA = SendTime.substring(index1 + 2, index1 + 6);
		System.out.println("Send Time Data:" + SEND_TIME_DATA);
		System.out.println("SendTime:" + SendTime);

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
		verifyStatusOfBCAfterAbortion();

	}

	public void copyBC() throws InterruptedException {

		commonObjects.clickOptionsIcon();
		clickCopyBroadcastOption();
	}

	public void pauseBC() throws InterruptedException {

		int size_RS = renderScheduledStatusBC.size();
		System.out.println("Size RS: " + size_RS);
		int size = deliveringStatusBC.size();
		System.out.println("Size before loop: " + size);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (size == 0 && t.checkTimerMin(15)) {

			Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			size = deliveringStatusBC.size();
			System.out.println(size);
			int size2 = compltedeStatusBC.size();

			if (size2 == 1) {
				System.out.println("Size2: " + size2);
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

		/*
		 * Thread.sleep(5000); String Text=trialMessageEventField.getText();
		 * System.out.println("Text: "+Text); Exception sendTrialExcep=new
		 * Exception("Send Trial Exception"); if(Text.equals("Trial Message Event"))
		 * System.out.println("Trial message send successfully"); else throw
		 * sendTrialExcep;
		 */

	}

	public void verifyBroadcastView(String name) throws InterruptedException {

		assertTrue(driver.findElement(By.xpath("//h3[contains(.,'" + name + "')]")).isDisplayed());
		assertTrue(basicDetailsBC.isDisplayed());
		assertTrue(targetDetailsBC.isDisplayed());
		assertTrue(offerDetailsBC.isDisplayed());
		assertTrue(deliveryDetailsBC.isDisplayed());
		jswait.loadClick(basicDetailsBC);
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath(".//p[contains(.,'" + name + "')]")).isDisplayed());

	}

	public void defaultSendID() throws Exception {

		jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
		jswait.loadClick(senderIdBroadcastAdressSmpp);
		jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

		jswait.loadClick(routeBroadcastSmppRobioutbound);

		// jswait.loadClick(routeBroadcastSmppRobiOutbond);
	}

	public void verifyExportBroadcast() throws InterruptedException {

		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "j");

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
		assertTrue(
				driver.findElement(By.xpath("//vaadin-grid-cell-content[contains(.,'" + name + "')]")).isDisplayed());
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
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]");
	}

	public void selectBaseList(String baseList) throws InterruptedException {
		jswait.loadSendKeys(baseListSelector, baseList);
		Thread.sleep(2000);
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
		jswait.loadSendKeys(fixedPercentNumber, "10");
		jswait.loadClick(defineCGLimitSave);
		jswait.loadClick(calculateLimit);
		Thread.sleep(4000);
		;
		assertTrue(calculateText.isDisplayed());
		Thread.sleep(2000);

	}

	public void createBCAndSelectDNCListForPartnerLevelCG(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList("both");
		calculate_CG_TG();

		clickProceedButton();
		selectOffer(offer);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}
public boolean checkCalculateBtnDisplayed() {
		
		boolean checkCalculateBtnDisplayed = jswait.checkVisibility(calculateLimit);
		return checkCalculateBtnDisplayed;
	}
	
	public String getCalculatingString() throws InterruptedException, UnsupportedFlavorException, IOException {
		
		String value=driver.findElement(By.xpath(".//label[text()='Calculating']")).getText();
		return value;
	}
	
	public boolean checkTargetCountVisible() {
		
		boolean value=jswait.checkVisibility(
				"//paper-button[@class='statsPopup style-scope stats-calculate x-scope paper-button-0'][contains(.,'Target Count')]");
	return value;
	}

	public void calculate_CG_TG() throws InterruptedException {

		jswait.loadClick(calculateLimit);
		Thread.sleep(2000);
		try {
			jswait.checkVisibility("//paper-dialog[@id='calculateConfirm']//paper-button[contains(.,'Yes')]");
			jswait.loadClick("//paper-dialog[@id='calculateConfirm']//paper-button[contains(.,'Yes')]");
		}catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(2000);
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

		// Set <String> handle=driver.getWindowHandles();

		// driver.switchTo().frame(DNCExclusionList);

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

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))
				.click();
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))
				.click();
		clickBroadcastViewOption();

		clickBroadcastDeliveryDetails();
		Thread.sleep(3000);
		System.out.print("Send Time:" + SEND_TIME_DATA);

		assertTrue(driver.findElement(By.xpath(".//p[contains(.,'" + SEND_TIME_DATA + "')]")).isDisplayed());
		assertTrue(driver.findElement(By.xpath(".//p[contains(.,'" + SEND_TIME_DATA + "')]")).isDisplayed());

	}

	public void verifyValidatingCGStatusForBC() throws Throwable {

		int size = statusValidatingCG.size();
		System.out.println("Size before loop: " + size);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (size == 0 && t.checkTimerMin(15)) {

			Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			size = statusValidatingCG.size();
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

		int size2 = statusValidatingCG.size();
		if (size2 > 0) {
			for (WebElement ValidatingCG : statusValidatingCG) {

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
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + inventory + "')]");
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
		jswait.loadSendKeys(trackSession2Days, "2");
	}
	public void selectTrackSource(String trackSource) throws InterruptedException {
		
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+trackSource+"')]");
	}
	public void selectTrackingSource() throws InterruptedException {
//		jswait.loadSendKeys(trackingSourceSelector, "track");
//		jswait.loadClick(trackingSourceTrack);
		try {
			try {
				jswait.loadSendKeys(trackingSourceSelector, "track");
				jswait.loadClick(trackingSourceTrack);
			}catch (Exception e) {
				jswait.loadSendKeys(trackingSourceSelector, "Usage");
				selectTrackSource("Usage Metric");
			}
		}catch (Exception e) {
			jswait.loadSendKeys(trackingSourceSelector, "Global Response");
			selectTrackSource("Global Response App");
		}
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
		Thread.sleep(2000);
		jswait.loadClick(senderIdBroadcastAdressSmpp);
		Thread.sleep(2000);
		jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);
//		jswait.loadClick(routeBroadcast);
		Thread.sleep(5000);
		System.out.println("broadcast route select");
	    jswait.loadClick("//label[contains(.,'Route over which this broadcast can be sent')]//following::vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]");
		Thread.sleep(2000);
		jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
		Thread.sleep(2000);
		jswait.loadClick(senderIdFulfillmentAdressSmpp);
		Thread.sleep(2000);
		jswait.loadSendKeys(routeFulfillment,ROUTE_SMPP);
		System.out.println("fulfillment route select");
		Thread.sleep(5000);
		jswait.loadClick(".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]");
	}
	
//
//		jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
//		Thread.sleep(2000);
//		jswait.loadClick(senderIdBroadcastAdressSmpp);
//		Thread.sleep(2000);
//		jswait.loadSendKeys(routeBroadcast,"sel_outbound");
//		System.out.println("trying to click the outbound route rule1");
//		Thread.sleep(10000);
//		try {
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//vaadin-combo-box-item[contains(.,'sel_outbound')]"))).click();
//		}
//		catch(Exception e) {
//			System.out.println("inside catch of route outbound");
//			try{
//			jswait.loadClick("(//label[contains(.,'Route over which this broadcast can be sent')]//following::paper-icon-button[@id='clearIcon'])[1]");
//			Thread.sleep(2000);
//			jswait.loadSendKeys(routeBroadcast,"sel_outbound");
//			Thread.sleep(2000);
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//vaadin-combo-box-item[contains(.,'sel_outbound')]"))).click();
//			}
//			catch(Exception e1) {
//				System.out.println("inside catch of catch route outbound");
//				jswait.loadSendKeys(routeBroadcast,"sel_outbound");
//				Thread.sleep(2000);
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//vaadin-combo-box-item[contains(.,'sel_outbound')]"))).click();
//			}
//		}
//		Thread.sleep(2000);
//		jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
//		Thread.sleep(2000);
//		jswait.loadClick(senderIdFulfillmentAdressSmpp);
//		jswait.loadSendKeys(routeFulfillment, "sel_outbound");
//		Thread.sleep(5000);
//		System.out.println("trying to click the outbound route rule2");
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//label[contains(.,'Sender ID: Fulfillment')]//following::vaadin-combo-box-item[contains(.,'sel_outbound')]"))).click();
//		 Thread.sleep(10000);
//	}

	public void selectSenderAndRouteEmail() throws InterruptedException {
		jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_EMAIL);
		jswait.loadClick(senderIdBroadcastEmail);
		jswait.loadSendKeys(routeBroadcast, ROUTE_EMAIL);
//		jswait.loadClick(emailProfileField);
//		jswait.loadClick("//paper-item[contains(.,'"+EMAIL_PROFILE_FIELD+"')]");
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

	public void enterBroadcastBasicDetails(String name, String inventory) throws InterruptedException {
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
		
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
		
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
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")||bc_type.contentEquals("TriggerReccurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		jswait.loadClick(CGConfigure);
		jswait.loadClick(noControlGroupRadioButton);
		jswait.loadClick(defineCGLimitSave);
		clickProceedButton();
		selectOffer(offerExcel.getCellByColumnName("Offer Name"));
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			if (offerExcel.getCellByColumnName("Channel").contains("Email")) {
				selectSenderAndRouteEmail();
			} else
				selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void createBCForUseTemplate(String name, String bc_type, String baseList, String offer) throws Throwable {
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		Thread.sleep(3000);
		campaignObjects.CheckUsageMetricField();
	}

	public void createBC(String name, String bc_type, String baseList, String offer, String condition, String inventory,
			String dndExclusion) throws Exception {
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name, inventory);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
//			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
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
		if (condition.contains("segmentAgeGT40")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);
			jswait.loadClick("//paper-item[contains(.,'segmentAgeGT40')]");
		} else if (condition.equals("SegmentForMoreThanTenConditions")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);
			jswait.loadClick("//paper-item[contains(.,'SegmentForMoreThanTenConditions')]");
		} else if (condition.equals("SegmentForMoreThanTenConditionsOR")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);
			jswait.loadClick("//paper-item[contains(.,'SegmentForMoreThanTenConditionsOR')]");

		} else if (condition.equals("SegmentAnalysis")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);

			jswait.loadClick("(//paper-item[contains(.,'" + condition + "')])[1]");
		} else {
			targetConditionObjects.clickBasicTargetCondition(condition);
		}

		Thread.sleep(3000);
		selectDNCList(dndExclusion);

		clickProceedButton();
		selectOffer(offerExcel.getCellByColumnName("Offer Name"));
		System.out.println("bc_type=" + bc_type);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			if (offerExcel.getCellByColumnName("Channel").contains("Email")) {
				selectSenderAndRouteEmail();
			} else if (offerExcel.getCellByColumnName("Channel").contains("Facebook")) {
				selectSenderAndRouteFacebook();
			} else
				selectSenderAndRoute();

		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void createBCWithCopyOption() throws InterruptedException {
		Thread.sleep(2000);
		commonObjects.clickOptionsIcon();
		Thread.sleep(2000);
		commonObjects.clickCopyOption();
		Thread.sleep(2000);
		clickProceedButton();
		Thread.sleep(2000);
		clickProceedButton();
		Thread.sleep(2000);
		clickProceedButton();
	}

	public void createBCAndConfigurCG_TG(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		verifyTG_And_CG_Configure_Options();

		clickProceedButton();
		selectOffer(offer);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void createBCAndCalculateCG_TG(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		jswait.loadClick(selectControlGroup);
		jswait.loadClick(fixedPercentageOfTargetBase);
		jswait.loadSendKeys(fixedPercentNumber, "10");
		jswait.loadClick(CGSavebtn);
		calculate_CG_TG();
		

		clickProceedButton();
		selectOffer(offer);
		try {
			selectALanguage();
		}catch (Exception e) {
			System.out.println("language already selected");
		}
		
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void createBCAndSelectDNCList(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		//selectDNCList();
		selectDNCList("both");
		calculate_CG_TG();

		clickProceedButton();
		selectOffer(offer);
		try {
			selectALanguage();
		}catch (Exception e) {
			System.out.println("language already selected");
		}
		
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void createBCAndSelectDNCListForSeedingBC(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList("both");
		verifyTG_And_CG_Configure_Options();
		// calculate_CG_TG();

		clickProceedButton();
		selectOffer(offer);
		try {
			selectALanguage();
		}catch (Exception e) {
			System.out.println("language already selected");
		}
		if (bc_type.contentEquals("facebook")) {
			selectTrackSession();
			selectTrackingSource();

			jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
			// jswait.loadClick(senderIdFulfillmentSelector);
			// Thread.sleep(4000);
			jswait.loadClick(senderIdFulfillmentAdressSmpp);
			// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
			jswait.loadSendKeys(routeFulfillment, ROUTE_SMPP);
			Thread.sleep(2000);
			jswait.loadClick(routeFulfillmentSmppRobioutbound);

//				  	  Thread.sleep(1000);	
//				  	  jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[1]");
//				  	  Thread.sleep(3000);
//				  	  jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'After')]");
//				  	  
//				  	  Thread.sleep(2000);
//				  	  jswait.loadSendKeys("//label[contains(.,'Expires')]//following::input[2]","1");
//				  	  
//					  Thread.sleep(1000);	
//				  	  jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[2]");
//				  	  Thread.sleep(3000);
//				  	  jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'Days')]");
//				  	  
//				  	  Thread.sleep(2000);
//				  	  jswait.loadSendKeys("//label[contains(.,'Budget Amount')]//following::input[1]","50");
//					

		} else if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void createBCAndSelectDNCList_AndConfigureCG_TG(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		selectDNCList();
		verifyTG_And_CG_Configure_Options();
		// calculate_CG_TG();

		clickProceedButton();
		selectOffer(offer);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void validateNameField() throws InterruptedException, UnsupportedFlavorException, IOException {
		enterBroadcastName("efwefwefwefwefwefwefwefwefwefw");
		int count = commonObjects.getTextFormTextField(broadcastName).length();
		System.out.println(count);
		Assert.assertTrue(commonObjects.getTextFormTextField(broadcastName).length() == 30);
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
		enterBroadcastName("efwefwefwefwefwefwefwefwefwefw");
		jswait.loadSendKeys(broadcastPurpose,
				"aaaaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasasdsd");
		int count = commonObjects.getTextFormTextField(broadcastPurpose).length();
		System.out.println(count);
		Assert.assertTrue(commonObjects.getTextFormTextField(broadcastPurpose).length() == 500);
	}

	public void verifySelectionFields() throws InterruptedException, UnsupportedFlavorException, IOException {
		selectLabelCrossell();
		selectLabelInformation();
		selectInventory(INVENTORY_UNLIMITED);
		selectInventory1();
		selectTrigger1();
		selectTrigger2();
		List<WebElement> tags = driver.findElements(By.xpath("//paper-tags[@id='paperTags']/div"));
		int tagssize = tags.size();
		System.out.println(tagssize);
		Assert.assertTrue(tags.size() == 2);
	}

	public void clickValidateButton() throws InterruptedException {
		jswait.loadClick(validateButtonBc);
	}

	public void createBCAndVerifyStartBroadcastAtOption(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickProceedButton();
		selectOffer(offer);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();

		verifyStartBroadcastDateTimeField();

	}

	public void createBCWithoutTargetCondition(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickTargetConditionNoneOption();
		clickProceedButton();
		selectOffer(offer);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

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

	public void createBCWith1MSubscribersAndConfigurCG_TG(String name, String bc_type, String baseList, String offer)
			throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickTargetConditionNoneOption();
		verifyCG_Configure_Options();

		clickProceedButton();
		selectOffer(offer);
		try {
			selectALanguage();
		}catch (Exception e) {
			System.out.println("language already selected");
		}
		
		System.out.println(bc_type);
		if (bc_type.contentEquals("facebook")) {
			selectTrackSession();
			selectTrackingSource();

			jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
			// jswait.loadClick(senderIdFulfillmentSelector);
			// Thread.sleep(4000);
			jswait.loadClick(senderIdFulfillmentAdressSmpp);
			// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
			jswait.loadSendKeys(routeFulfillment, ROUTE_SMPP);
			Thread.sleep(2000);
			jswait.loadClick(routeFulfillmentSmppRobioutbound);

//		  	  Thread.sleep(1000);	
//		  	  jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[1]");
//		  	  Thread.sleep(3000);
//		  	  jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'After')]");
//		  	  
//		  	  Thread.sleep(2000);
//		  	  jswait.loadSendKeys("//label[contains(.,'Expires')]//following::input[2]","1");
//		  	  
//			  Thread.sleep(1000);	
//		  	  jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[2]");
//		  	  Thread.sleep(3000);
//		  	  jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'Days')]");
//		  	  
//		  	  Thread.sleep(2000);
//		  	  jswait.loadSendKeys("//label[contains(.,'Budget Amount')]//following::input[1]","50");
//			

		}

		else if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		}

		else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

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

		jswait.loadSendKeys(
				".//paper-dialog[@id='changeSettings']//div[contains(.,'Fixed percentage of Target Base')]//following::input[1]",
				"10");
		Thread.sleep(2000);
		jswait.loadClick(defineCGLimitSave);
		jswait.loadClick(calculateLimit);
		Thread.sleep(4000);
		assertTrue(calculateText.isDisplayed());
		Thread.sleep(2000);

	}

	public void verifyDeliveringStatusForBC() throws Throwable {

		int size = statusDelivering.size();
		System.out.println("Size before loop: " + size);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (size == 0 && t.checkTimerMin(15)) {

			Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			size = statusDelivering.size();
			System.out.println(size);

		}

		int size2 = statusDelivering.size();
		if (size2 > 0) {
			for (WebElement Delivering : statusDelivering) {

				assertTrue(Delivering.isDisplayed());

			}

		}

	}

	public void verifyTargetedCount() throws Throwable {

		String count = targetCount.getText();
		System.out.println("Count: " + count);
		Exception targetCountExcep = new Exception("Target count is not correct");
		if (count.equals("9,00,000"))
			System.out.println("Target count is correct");
		else
			throw targetCountExcep;

	}

	public void verifyTargetingStatusForBC() throws Throwable {

		int size = statusTargetingCG.size();
		System.out.println("Size before loop: " + size);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (size == 0 && t.checkTimerMin(15)) {

			Thread.sleep(20000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			size = statusTargetingCG.size();
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

		int size2 = statusTargetingCG.size();
		if (size2 > 0) {
			for (WebElement Targeting : statusTargetingCG) {

				assertTrue(Targeting.isDisplayed());

			}

		}

	}

	public void verifyPermissions() throws Exception {
		jswait.failIfVisible(Permissions);
	}

	public void createBCWith1MSubscribersAndConfigurPartnerLevelCG(String name, String bc_type, String baseList,
			String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickTargetConditionNoneOption();
		// verifyCG_Configure_Options();

		clickProceedButton();
		selectOffer(offer);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbound");

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}

	public void verifyTargetedCountForPartnerLevelCG() throws Throwable {

		String count = targetCountPartnerLevelCG.getText();
		System.out.println("Count: " + count);
		Exception targetCountExcep = new Exception("Target count is not correct");
		if (count.equals("8,00,000"))
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

	public void addNotificationuser() throws Exception {

		bcnotificationrecipient();
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

	public void addNotification2users() throws Exception {

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
		System.out.println("inside the verify email");
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);

		List<String> emaildata = EmailHandlergmail.fetch();
		System.out.println("after verify email");
		System.out.println(emaildata.get(1));
		System.out.println(emaildata.get(2));
		System.out.println(emaildata.get(3));
		System.out.println(emaildata.get(4));
		String html = emaildata.get(1);
		String Subject = emaildata.get(2);
		String fromid = emaildata.get(3);
		if (Subject == "Broadcast Rendering Notification -" + name) {
			assertTrue(Subject.contains("Broadcast Finished - oneOffBC"));
			assertTrue(fromid.contains("flyops@flytxt.com <flyops@flytxt.com>"));
		} else if (Subject == "Broadcast Delivery Notification -" + name) {
			assertTrue(Subject.contains("Broadcast Delivery Notification -" + name));
			assertTrue(fromid.contains("flyops@flytxt.com <flyops@flytxt.com>"));
		} else if (Subject == "Broadcast Finished -" + name)

			assertTrue(Subject.contains("Broadcast Finished -" + name));
		assertTrue(fromid.contains("flyops@flytxt.com <flyops@flytxt.com>"));
	}

	public void Verifyemail(String sheet) throws Exception {
		System.out.println("inside the verify email");
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);

		List<String> emaildata = EmailHandlergmail.fetch();
		System.out.println("after verify email");
		System.out.println(emaildata.get(1));
		System.out.println(emaildata.get(2));
		System.out.println(emaildata.get(3));
		System.out.println(emaildata.get(4));
		String html = emaildata.get(1);
		String Subject = emaildata.get(2);
		String fromid = emaildata.get(3);
		Assert.assertTrue(html.contains(
				"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><meta name=\"viewport\" content=\"target-densitydpi=device-dpi\"><meta name=\"viewport\" content=\"width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;\" /><meta name=\"apple-mobile-web-app-capable\" content=\"yes\" /><meta name=\"HandheldFriendly\" content=\"true\" /><meta name=\"MobileOptimized\" content=\"width\" /><title>HDFC BANK</title><!-- Facebook sharing information tags --><!--<meta property=\"og:title\" content=\"HDFC BANK\" />--><style type=\"text/css\">/*img { height: auto; max-width: 100%;}*//* Forces Hotmail to display emails at full width. */.ExternalClass { width: 100%;}/* Forces Hotmail to display normal line spacing. */.ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div { line-height: 100%;}/* Prevents Webkit and Windows Mobile platforms from changing default font sizes. */body { -webkit-text-size-adjust: none; -ms-text-size-adjust: none; margin: 0; padding: 0;}/* Resets all body margins and padding to \"0\" for good measure. *//* Resolves webkit padding issue. */table { border-spacing: 0;}/* Resolves the Outlook 2007, 2010, and Gmail td padding issue. */table td { border-collapse: collapse;}/****** END BUG FIXES ********//****** EDITABLE STYLES - FOR YOUR TEMPLATE ********//* The \"body\" is defined here for Yahoo Beta because it does not support your body tag. Instead, it will create a wrapper div around your email and that div will inherit your embedded body styles. The \"#body_style\" is defined for AOL because it does not support your embedded body definition nor your body tag, we will use this class in our wrapper div. */body, #body_style { /* width:100% !important;*/ color: #333333; font-family: Arial, Helvetica, sans-serif; font-size: 13px; line-height: 1.4;}body {*width:600px; margin: 0 auto; width: 600px\\9;}/****** MEDIA QUERIES ********/ /* You must use attribute selectors in your media queries to prevent Yahoo from rendering these styles.  We added a yahoo attribute in the body tag to complete this fix.  More info: http://www.emailonacid.com/blog/details/C13/stop_yahoo_mail_from_rendering_your_media_queries */ /* Target mobile devices. */ /* @media only screen and (max-device-width: 600px) { */@media only screen and (min-width: 600px) {body { /*width:44.7%;*/ margin: 0 auto; width: 600px;}/*table{width:600px;}*/}@media only screen and (max-width: 480px) {body, table { width: 100%!important;}.font320 { font-size: 0.7em!important;}.font3201 { font-size: 1.2em!important;}.font3202 { font-size: 1.1em!important;}}@media only screen and (max-width: 599px) { /* TEMPORARY *//* Hide elements at smaller screen sizes (!important needed to override inline CSS). */body[yahoo] .hide { display: none !important;}/* Adjust table widths at smaller screen sizes. */body, table { width: 100% !important;}/*** END EDITABLE STYLES ***//*img { display: block; border: none; outline: none; text-decoration: none; width: 100%; height: 100%;} Remove spacing around Outlook 07, 10 tables */table { border-collapse: collapse; mso-table-lspace: 0pt; mso-table-rspace: 0pt;}}/*** END TEMPORARY ***/</style></head><body yahoo=\"fix\"><div id=\"body_style\"><h1></h1><img src=\"cid:logo.png\"><h1>THIS IS THE BODY OF EMAIL</h1><img height='0' width='0' alt='' src='http://t.mailer.hdfcbank.net/r/?id=h11b94d41,6e08f87,1'/><FORM method=\"POST\"      onSubmit=      \"return checkAnswer(this, 'C',       'correct.htm', 'wrong.htm');\"><INPUT TYPE=\"RADIO\" VALUE=\"A\" NAME=\"cc\">Another name for Java<BR><INPUT TYPE=\"RADIO\" VALUE=\"B\" NAME=\"cc\">When you use Java without compiling<BR><INPUT TYPE=\"RADIO\" VALUE=\"C\" NAME=\"cc\">A scripting language mostly for the web<BR><INPUT TYPE=\"SUBMIT\" VALUE=\"Submit Answer\"></FORM><SCRIPT language=\"JavaScript\"        type=\"text/javascript\"><!--//// Documentation://   http://chami.com/tips/javascript///function checkAnswer(quizForm,                     theAnswer,                     urlRight,                     urlWrong){  var s = \"?\";  // go through the \"current choices\"  // to find the selected choice.  // radio boxes pointing to choices  // must be named \"cc\"  // change if necessary  //  var i = 0;  for(;i<quizForm.elements.length;i++)  {    if((\"cc\" ==        quizForm.elements[i].name) &&       (quizForm.elements[i].checked))    {      s = quizForm.elements[i].value;    }  }  // no choice was selected  //  if(\"?\" == s)  {    alert(\"Please make a selection.\");    return false;  }  // check if we have the correct  // choice selected  //  if(s == theAnswer)  {    alert(\"'\"+s+\"' is correct!\");    if(urlRight)    {    document.location.href = urlRight;    }  }  else  {    alert(\"'\"+s+\"' is incorrect.\");    if( urlWrong )    {    document.location.href = urlWrong;    }  }  // return \"false\" to indicate not to  // submit the form.  // change this to \"true\" if the form  // \"action\" is valid,  // i.e. points to a valid CGI script  //  return false;}//--></SCRIPT></body></html>"));
		Assert.assertEquals(fromid, "flyops@flytxt.com");
//	assertTrue(Subject.contains("Broadcast Finished - oneOffBC"));
//	assertTrue(fromid.contains(""flyops@flytxt.com" <flyops@flytxt.com>"));
	}

	public void selectSenderAndRouteFacebook() throws InterruptedException {
//	jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
//	jswait.loadClick(senderIdBroadcastAdressSmpp);
//	jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);
//	jswait.loadClick(routeBroadcastSmppRobioutbound);
		jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
		// jswait.loadClick(senderIdFulfillmentSelector);
		// Thread.sleep(4000);
		jswait.loadClick(senderIdFulfillmentAdressSmpp);
		// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
		jswait.loadSendKeys(routeFulfillment, ROUTE_SMPP);
		Thread.sleep(2000);
		jswait.loadClick(routeFulfillmentSmppRobioutbound);
	}

	public void Verify_DNC_Exclusion(String sheet, String count) throws Exception {
		System.out.println("inside the verify DNC");
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);

		commonObjects.clickOptionsIcon();
		jswait.loadClick("//label[contains(.,'View')]");

		String DCNcount = DNC_count_bc.getText();
		Thread.sleep(3000);
		Assert.assertEquals(DCNcount, count, "Count is Matching");

	}

	public void Broadcast_Expiry(String Expires) throws Exception {

		Thread.sleep(2000);
		jswait.loadClick(bcExpiryclick);
		Thread.sleep(2000);
		jswait.loadClick(expirestime);
		Thread.sleep(2000);
		jswait.loadSendKeys(expirestime, "After");
		Thread.sleep(2000);
		jswait.loadClick(expiresAfteroption);
		Thread.sleep(2000);
		jswait.loadSendKeys(bcExpireAfterHours, Expires);

	}

	public void Broadcast_Expiry() throws Exception {
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

		jswait.loadClick(
				"//paper-date-time-input[contains(@class,'style-scope schedule-expiry-settings x-scope paper-date-time-input-0')]//div[contains(@class,'container style-scope paper-date-time-input')]//input[@id='input']");

		Actions builder = new Actions(driver);

		WebElement num = driver.findElement(By.xpath(
				".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
		// jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
		WebElement num1 = driver.findElement(By.xpath(
				".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();
		// jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
		// num1 =
		// driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number
		// style-scope paper-clock-selector'][41]"));
		// builder.moveToElement(num1).click().build().perform();
		// Thread.sleep(2000);
		if (am_pm == 0)
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[3]");
		else
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[3]");

		jswait.loadClick("(.//*[@id='timeDialog']/div/paper-button[contains(.,'OK')])[3]");
		Thread.sleep(2000);

		jswait.loadClick(expirestimezone);
	}

//public void verifyExportBroadcast(String sheet) throws FileNotFoundException, IOException, Exception {
//
//	eM.setExcelFile("bcInputData", sheet);
//	String name = eM.getCell(1, 0).toString();
//	System.out.println(name);
//	//System.out.println("Checking downloaded PDF");
//	//String newBCName = newlyCreatedBC.getText();
//	//String statusOFbroadcast=statusOfBC.getText();
//	//System.out.println(newBCName);
//	// replacing the spaces with _ for created new variable 'newBCNameWithOutSpace'
//	String newBCNameWithOutSpace = name.replaceAll("[^a-zA-Z0-9-]", "_");
//
//	//System.out.println(newBCNameWithOutSpace);
//
//	// to print the system username like computer name
//	// System.out.println(systemUserName);
//	// System.out.println("waiting for PDF");
//	//Thread.sleep(3000);
//	System.out.println(statusOFbroadcast);
//	String systemUserName = System.getProperty("user.name");
//	SQLHandler sql = new SQLHandler();
//	String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='" + name
//			+ "';";
//	int bcID = sql.getStringOfQuery(query);
//	//System.out.println(bcID);
//	String path = "C:\\Users\\" + systemUserName + "\\Downloads\\BC_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
//	System.out.println(path);
//	System.out.println("open PDF property class");
//	Thread.sleep(1000);
//  // to load the pdf file
//	pdfReader.loadPDFFile(path, name,statusOFbroadcast);
//
//	System.out.println("Verified PDF");
//}

	@FindBy(xpath = "(//vaadin-grid-table-row[1]//vaadin-grid-table-cell[2])[2]")
	private WebElement statusOfBC;

	@FindBy(xpath = "//paper-icon-button[@id='exportBtn']//iron-icon[@id='icon']")
	private WebElement exportBtnViewBC;
	@FindBy(xpath = "//div[@id='tabsContainer']//paper-tab//div[contains(.,'Seedings Broadcasts')]")
	private WebElement seedingsBroadcastInBCPage;
	@FindBy(xpath = "//div[@val='broadcastSeedingViews']//paper-icon-button[@icon='filter-list']//*[@id=\"icon\"]")
	private WebElement seedingsBroadcastFilterOption;

	public void seedingsBroadcastFilterOption() throws InterruptedException {
		jswait.loadClick(seedingsBroadcastFilterOption);
	}

	public void exportBroadcastAsPDF() throws InterruptedException {
		System.out.println("Exporting the PDF");
		commonObjects.clickOptionsIcon();
		clickExportBroadcastOption();

	}

	public void verifyExportedBCwithNameAndStatus(String sheet) throws FileNotFoundException, IOException, Exception {
		Thread.sleep(4000);
		eM.setExcelFile("bcInputData", sheet);
		String bcNamefromSheet = eM.getCell(1, 0).toString();
		// to provide broadcast name and Broadcast Status
		// String statusOFbroadcast = statusOfBC.getText();
		String statusOFbroadcast = getTopBcStatus(sheet,bcNamefromSheet);

		String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='"
				+ bcNamefromSheet + "';";
		String newBCNameWithOutSpace = bcNamefromSheet.replaceAll("[^a-zA-Z0-9-]", "_");
		String systemUserName = System.getProperty("user.name");
		System.out.println(systemUserName);
		SQLHandler sql = new SQLHandler();
		// String query = "select APPLICATION_INSTANCE_ID from app_instance where
		// APPLICATION_INSTANCE_NAME='" + bcName
		// + "';";
		int bcID = sql.getStringOfQuery(query);
		// System.out.println(bcID);
		String path = "C:\\Users\\" + systemUserName + "\\Downloads\\BC_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
		System.out.println(path);
		pdfReader.verifyBroadcastNameWithStatusInPDF(path, bcNamefromSheet, statusOFbroadcast);
		Thread.sleep(2000);
		System.out.println("Verified PDF  ");
	}

	public void verifyExportedBCForRename(String sheet) throws FileNotFoundException, IOException, Exception {
		Thread.sleep(3000);

		eM.setExcelFile("bcInputData", sheet);
		String bcNamefromSheet = eM.getCell(1, 0).toString();
		// to provide broadcast name and Broadcast Status
		// String statusOFbroadcast = statusOfBC.getText();
		String statusOFbroadcast = getTopBcStatus();

		pdfReader.renameAndDeletePDF(bcNamefromSheet, statusOFbroadcast);
		Thread.sleep(2000);
		commonObjects.toggleAutoRefresh();
		System.out.println("Verified PDF ");
	}

	public void verifyExportedTimeForBC(String sheet) throws FileNotFoundException, IOException, Exception {

		DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY hh:mm");
		String afterClickOnExport = calenderUtility.getCurrentDate("dd MMM YYYY hh:mm");
		System.out.println(afterClickOnExport);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 3);
		String addingthreemin = dateFormat.format(cal.getTime());

		System.out.println(afterClickOnExport);
		Thread.sleep(4000);
		eM.setExcelFile("bcInputData", sheet);
		String bcNamefromSheet = eM.getCell(1, 0).toString();

		String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='"
				+ bcNamefromSheet + "';";
		String newBCNameWithOutSpace = bcNamefromSheet.replaceAll("[^a-zA-Z0-9-]", "_");
		String systemUserName = System.getProperty("user.name");
		System.out.println(systemUserName);
		SQLHandler sql = new SQLHandler();
		// String query = "select APPLICATION_INSTANCE_ID from app_instance where
		// APPLICATION_INSTANCE_NAME='" + bcName
		// + "';";
		int bcID = sql.getStringOfQuery(query);
		// System.out.println(bcID);
		String path = "C:\\Users\\" + systemUserName + "\\Downloads\\BC_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
		System.out.println(path);

		// to provide broadcast name and Broadcast Status
		pdfReader.verifyExportedBroadcastDateAndTime(path, afterClickOnExport, addingthreemin);

	}

	public void verifyExportBroadcastInSummaryPage(String sheet) throws FileNotFoundException, IOException, Exception {
		Thread.sleep(2000);
		eM.setExcelFile("bcInputData", sheet);
		String bcNamefromSheet = eM.getCell(1, 0).toString();

		String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='"
				+ bcNamefromSheet + "';";
		String newBCNameWithOutSpace = bcNamefromSheet.replaceAll("[^a-zA-Z0-9-]", "_");
		String systemUserName = System.getProperty("user.name");
		System.out.println(systemUserName);
		SQLHandler sql = new SQLHandler();
		// String query = "select APPLICATION_INSTANCE_ID from app_instance where
		// APPLICATION_INSTANCE_NAME='" + bcName
		// + "';";
		int bcID = sql.getStringOfQuery(query);
		// System.out.println(bcID);
		String path = "C:\\Users\\" + systemUserName + "\\Downloads\\BC_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
		System.out.println(path);

		pdfReader.verifyBroadcastName(bcNamefromSheet, path);
		System.out.println("Verified PDF");
	}

	public void clickOnSeedingsBroadcast() throws InterruptedException {
		jswait.loadClick(seedingsBroadcastInBCPage);

	}

	public void Verify_targetcountbc() throws Exception {
		Thread.sleep(2000);

		jswait.loadClick("//li//span[contains(.,'Target')]");

		String statusOfcalculate = targetcountstatus.getText();
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();

		boolean flag = true;
		System.out.println("the flag is" + flag);
		while ((flag != false) && t.checkTimerMin(15)) {
			statusOfcalculate = targetcountstatus.getText();
			System.out.println(statusOfcalculate);
			Thread.sleep(3000);

			try {
				targetcountbtn.isEnabled();
				System.out.println(flag);
				flag = false;
			} catch (Exception e) {

			}
		}
		Thread.sleep(2000);
		jswait.loadClick(targetcountbtn);
		Thread.sleep(2000);
		try {
			targetverify.isDisplayed();
		} catch (Exception e) {
			System.out.println(e);
		}

		jswait.loadClick("//h2[contains(.,'Calculated Counts ')]//following::paper-icon-button[@id='clear'][1]");
		clickProceedButton();
		clickProceedButton();

	}

	@FindBy(xpath = "(//paper-icon-button[@id='toggleIcon'])[4]")
	private WebElement clickOnLanguageToggleIcon;
	@FindBy(xpath = "//div[@id='labelAndInputContainer']//input[@placeholder='Select a Language']")
	private WebElement selectALanguage;
	@FindBy(xpath = "(//paper-icon-button[@id='clearIcon'])[4]")
	private WebElement clearSelectALanguage;
//@FindBy(xpath="//vaadin-combo-box-item[contains(text(),'"+LANGUAGE1+"')]")
//private WebElement selectALanguageFromDropDown ;

	public void selectALanguage() throws Exception {
		jswait.loadSendKeys(selectALanguage, "Customer P");
		jswait.loadClick("//vaadin-combo-box-item[contains(text(),'Customer Preferred')]");
	}
	
	public void createBCWithLanguage(String name, String bc_type, String baseList, String offer, String language)
			throws InterruptedException {
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name, INVENTORY_UNLIMITED);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		jswait.loadClick(CGConfigure);
		jswait.loadClick(noControlGroupRadioButton);
		jswait.loadClick(defineCGLimitSave);
		clickProceedButton();
		selectOffer(offerExcel.getCellByColumnName("Offer Name"));

		if (LANGUAGE1.equalsIgnoreCase(language)) {
			jswait.loadClick(clearSelectALanguage);
			jswait.loadClick(selectALanguage);
			jswait.loadSendKeys(selectALanguage, language);
			jswait.loadClick("//vaadin-combo-box-item[contains(text(),'" + LANGUAGE1 + "')]");
		} else if (LANGUAGE2.equalsIgnoreCase(language)) {
			jswait.loadClick(clearSelectALanguage);
			jswait.loadClick(selectALanguage);
			jswait.loadSendKeys(selectALanguage, language);
			jswait.loadClick("//vaadin-combo-box-item[contains(text(),'" + LANGUAGE2 + "')]");
		} else {
			jswait.loadClick(clearSelectALanguage);
			jswait.loadClick(selectALanguage);
			jswait.loadSendKeys(selectALanguage, "Customer P");
			jswait.loadClick("//vaadin-combo-box-item[contains(text(),'Customer Preferred')]");
		}

		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			if (offerExcel.getCellByColumnName("Channel").contains("Email")) {
				selectSenderAndRouteEmail();
			} else
				selectSenderAndRoute();
		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

//jswait.loadClick(routeBroadcastSmppRobiOutbond);	

		}
		clickProceedButton();
	}

	public void clickOnSavedSegments() throws InterruptedException {

		jswait.loadClick(savedSegmentRadioButtion);
	}

	public void selectSavedSegmentSelectorField(String condition) throws Exception {

		jswait.loadClick(savedSegmentSelectorField);
		jswait.loadClick("//paper-item[contains(.,'" + condition + "')]");
	}

//******************Editing the BC*********************

	public void selectLabelDynamically(String label) throws InterruptedException {
		jswait.loadClick(labelSelector);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + label + "')]");
	}

	public void editingTheBcBasicDeatils(String bcName, String sheet1) throws InterruptedException {
		eh.setExcelFile("bcInputDataForEdit", sheet1);
		enterBroadcastName(bcName);
		enterBroadcastPurpose(eh.getCell(1, 2).toString());
		selectLabelDynamically(eh.getCell(1, 3).toString());
//		String trigger=eh.getCell(1, 7).toString();
//		if (trigger.contentEquals("triggerable") || trigger.contentEquals("seedingTriggerable")|| trigger.contentEquals("seedingTriggerableRecurringBC")) {
//			System.out.println("inside triggerable");
//			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
//			Thread.sleep(1000);
//			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
//			Thread.sleep(2000);
//			jswait.loadClick("//paper-item[contains(.,'"+TRIGGER+"')]");
//			Thread.sleep(1500);
//			}
		selectInventory(eh.getCell(1, 4).toString());
	}

	public void editingTheBCTargetConditionDetails(String condition) throws Exception {
		TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		commonObjects.clickOptionsIcon();
		targetConditionObjects.clickTargetConditionDeletet();
		if (condition.contains("conditionForOROperation")) {
			commonObjects.clickOptionsIcon();
			targetConditionObjects.clickTargetConditionDeletet();
		}
		if (condition.contains("segmentAgeGT40")) {
			clickOnSavedSegments();
			selectSavedSegmentSelectorField(condition);
		} else if (condition.equals("SegmentForMoreThanTenConditions")) {
			clickOnSavedSegments();
			selectSavedSegmentSelectorField(condition);
		} else if (condition.equals("SegmentForMoreThanTenConditionsOR")) {
			clickOnSavedSegments();
			selectSavedSegmentSelectorField(condition);
		} else {
			targetConditionObjects.clickBasicTargetCondition(condition);
		}

	}

	public void editTheDeleveryTabDetails(String workbook, String sheet) throws Exception {
		BroadcastSteps broascastSteps = new BroadcastSteps();
		eh.setExcelFile(workbook, sheet);

		broascastSteps.enterDeliveryTabDetails(eh.getCell(1, 7).toString(), sheet);
	}

	// *****************************verification******************

	public void verifyTheBcBasicDetailsBeforeEdit(String sheet) throws Exception {
		jswait.loadClick(basicDetailsBC);
		Thread.sleep(3000);
		eh.setExcelFile("bcInputData", sheet);
		String bc_type = eh.getCell(1, 7).toString();
		Assert.assertTrue(
				driver.findElement(By.xpath(".//p[contains(.,'" + eh.getCell(1, 0).toString() + "')]")).isDisplayed());
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'Purpose of BC is NOTHING')]"));
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'Crossell')]"));
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'" + INVENTORY_UNLIMITED + "')]"));
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {

			Assert.assertTrue(
					jswait.checkVisibility("//p[contains(text(),'Triggers')]/..//p[contains(.,'" + TRIGGER + "')]"));
		}
	}

	public void verifyTheBcBasicDetails(String sheet) throws InterruptedException {
		jswait.loadClick(basicDetailsBC);
		Thread.sleep(3000);
		eh.setExcelFile("bcInputDataForEdit", sheet);
		String bc_type = eh.getCell(1, 7).toString();
		Assert.assertTrue(
				driver.findElement(By.xpath(".//p[contains(.,'" + eh.getCell(1, 0).toString() + "')]")).isDisplayed());
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'" + eh.getCell(1, 2).toString() + "')]"));
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'" + eh.getCell(1, 3).toString() + "')]"));
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'" + eh.getCell(1, 4).toString() + "')]"));

		eM.setExcelFile("campaignInputData", "campaignBC");
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'" + eM.getCell(1, 0).toString() + "')]"));

		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {

			Assert.assertTrue(
					jswait.checkVisibility("//p[contains(text(),'Triggers')]/..//p[contains(.,'" + TRIGGER + "')]"));
		}

	}

	public void verifyTheBCTargetList(String workbook, String sheet) throws InterruptedException {
		eh.setExcelFile(workbook, sheet);
		assertTrue(targetDetailsBC.isDisplayed());
		jswait.loadClick(targetDetailsBC);
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'" + eh.getCell(1, 5).toString() + "')]"));
		// BASE_LIST
	}

	public void verifyDeleveryTabDetails(String workbook, String sheet) throws InterruptedException {

		jswait.loadClick(deliveryDetailsBC);

		eh.setExcelFile(workbook, sheet);
		String Start_Date = eh.getCell(1, 11).toString();
		System.out.println(Start_Date);
		String bcType = eh.getCell(1, 7).toString();

		if ((eh.getCell(1, 7).toString()).contains("recurring")
				|| (eh.getCell(1, 7).toString()).contentEquals("seedingRecurring")
				|| (eh.getCell(1, 7).toString()).contentEquals("seedingTriggerableRecurringBC")) {
			String rucurrence = (eh.getCell(1, 8).toString()).substring(0, 1);
			Assert.assertTrue(
					jswait.checkVisibility("//p[contains(.,'Start Date')]/..//p[contains(.,'" + Start_Date + "')]"));
			Assert.assertTrue(jswait.checkVisibility(
					"//p[contains(.,'Recurrence Pattern')]/..//p//a[contains(.,'Recur every')]/..//a[contains(.,'"
							+ rucurrence + "')]"));
		}  else if (bcType.contains("one-off") || bcType.contains("seedingTriggerable") ||bcType.contains("TriggerOneoff")||bcType.contains("TriggerReccurringBC"))
		{
			Assert.assertTrue(
					jswait.checkVisibility("//p[contains(.,'Send Time')]/..//p[contains(.,'" + Start_Date + "')]"));

		} else {
			Assert.assertTrue(false);
		}

	}

	public void verifyTheBCTargetConditionDetails(String segmentCondition) throws InterruptedException {
		jswait.loadClick(targetDetailsBC);
		Thread.sleep(2000);
		if (segmentCondition.contentEquals("customerWasSentTheTrialMessage")) {
			Assert.assertTrue(
					jswait.checkVisibility("//target-event//b[contains(.,'Customer was sent the trial message')]"));

		} else if (segmentCondition.contentEquals("digitalPersonaGT15")) {
			Assert.assertTrue(
					jswait.checkVisibility("//profile-field//b[contains(.,'" + DIGITAL_PERSONA_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("customerDemographicsGT25")) {
			Assert.assertTrue(jswait.checkVisibility("//profile-field//b[contains(.,'" + DEMOGRAPHICS_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("learnedBehaviourGT35")) {
			Assert.assertTrue(
					jswait.checkVisibility("//profile-field//b[contains(.,'" + LEARNED_BEHAVIOR_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("analyticalScoresGT45")) {
			Assert.assertTrue(
					jswait.checkVisibility("//profile-field//b[contains(.,'" + ANALYTICAL_SCORES_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("digitalEngagementGT235")) {
			Assert.assertTrue(
					jswait.checkVisibility("//profile-field//b[contains(.,'" + DIGITAL_ENGAGEMENT_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("customerLocationInsightsGT5")) {
			Assert.assertTrue(
					jswait.checkVisibility("//profile-field//b[contains(.,'" + LOCATION_PROFILE_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("customerList")) {
			Assert.assertTrue(jswait.checkVisibility("//fixed-segment//b[contains(.,'" + BASE_LIST + "')]"));

		} else if (segmentCondition.contentEquals("discoveredClusters200")) {
			Assert.assertTrue(jswait
					.checkVisibility("//fixed-segment//b[contains(.,'" + SELENIUM_DISCOVERED_CLUSTERS_LIST + "')]"));

		} else if (segmentCondition.contentEquals("customerDrivenEvent")) {
			Assert.assertTrue(
					jswait.checkVisibility("//target-event//b[contains(.,'" + SELENIUM_CUSTOMER_DRIVEN_EVENT + "')]"));

		} else if (segmentCondition.contentEquals("usageMetric")) {
			Assert.assertTrue(jswait.checkVisibility("//usage-metric//b[contains(.,'" + SELENIUM_USAGE_METRIC + "')]"));

		} else if (segmentCondition.contentEquals("eventCounts")) {
			Assert.assertTrue(jswait.checkVisibility("//usage-metric//b[contains(.,'" + SELENIUM_EVENT_COUNTS + "')]"));

		} else if (segmentCondition.contentEquals("revenueMetric")) {
			Assert.assertTrue(
					jswait.checkVisibility("//usage-metric//b[contains(.,'" + SELENIUM_REVENUE_METRIC + "')]"));

		} else if (segmentCondition.contentEquals("IMEventsOfferAccepted")) {
			Assert.assertTrue(jswait.checkVisibility("//target-event//b[contains(.,'Offer accepted')]"));

		} else if (segmentCondition.contentEquals("IMEventsCustomerCareUsage")) {
			Assert.assertTrue(jswait.checkVisibility("//target-event//b[contains(.,'Customer Care Usage')]"));

		} else if (segmentCondition.contentEquals("customerDeviceInfo")) {
			Assert.assertTrue(jswait.checkVisibility("//profile-field//b[contains(.,'" + DEVICE_INFO_FIELD + "')]"));

		} else if (segmentCondition.contentEquals("segmentAgeGT40")) {
			Assert.assertTrue(
					jswait.checkVisibility("//p[contains(.,'Segment Name')]/..//p[contains(.,'segmentAgeGT40')]"));

		} else if (segmentCondition.contentEquals("customerWasSentTheTrialMessageNOtOccurred")) {
			Assert.assertTrue(jswait.checkVisibility("//target-event[contains(.,'This event has not occured')]"));
			Assert.assertTrue(
					jswait.checkVisibility("//target-event//b[contains(.,'Customer was sent the trial message')]"));

		} else if (segmentCondition.contentEquals("customerDrivenEventNotOccurred")) {
			Assert.assertTrue(jswait.checkVisibility("//target-event[contains(.,'This event has not occured')]"));
			Assert.assertTrue(
					jswait.checkVisibility("//target-event//b[contains(.,'" + SELENIUM_CUSTOMER_DRIVEN_EVENT + "')]"));
		} else if (segmentCondition.contentEquals("conditionForANDOperation")
				|| segmentCondition.contentEquals("conditionForOROperation")) {
			Assert.assertTrue(
					jswait.checkVisibility("//target-event//b[contains(.,'Customer was sent the trial message')]"));
			Assert.assertTrue(
					jswait.checkVisibility("//target-event//b[contains(.,'" + SELENIUM_CUSTOMER_DRIVEN_EVENT + "')]"));
			if (segmentCondition.contentEquals("conditionForOROperation")) {
				Assert.assertTrue(jswait.checkVisibility(
						"//paper-card[@class='mainCard display-target style-scope targets-display x-scope paper-card-0']//div[contains(.,'Or')]"));
			}
			Assert.assertTrue(jswait.checkVisibility(
					"//paper-card[@class='mainCard display-target style-scope targets-display x-scope paper-card-0']//div[contains(.,'And')]"));

		} else if (segmentCondition.contentEquals("sharedMetricOtherPartner")) {
			Assert.assertTrue(
					jswait.checkVisibility("//usage-metric//b[contains(.,'" + SELENIUM_SHARED_METRIC + "')]"));

		} else if (segmentCondition.contentEquals("SegmentForMoreThanTenConditions")) {
			Assert.assertTrue(jswait.checkVisibility(
					"//p[contains(.,'Segment Name')]/..//p[contains(.,'SegmentForMoreThanTenConditions')]"));

		} else if (segmentCondition.contentEquals("SharedcustomerList")) {

			Assert.assertTrue(jswait.checkVisibility("//fixed-segment//b[contains(.,'" + SELENIUM_SHARED_List + "')]"));

		} else if (segmentCondition.contentEquals("targetGroup")) {

			Assert.assertTrue(jswait.checkVisibility(
					"//profile-field[contains(.,'Customer Profile Info')]/..//profile-field//b[contains(.,'Target Group_q11')]"));

		} else {
			Assert.assertTrue(false);
		}
	}

	// **************************************************//

	@FindBy(xpath = "//data-table-cell[5]//iron-icon[@icon='icons:remove-circle']")
	private List<WebElement> dncRemoveIcon;

	public void selectDNCList(String dndListType) throws InterruptedException {

		Thread.sleep(2000);
		jswait.loadClick(DNCExclusionOption);
		Thread.sleep(3000);

		List<WebElement> removeButton = driver
				.findElements(By.xpath("//iron-data-table//iron-icon[@icon='icons:remove-circle']"));
		System.out.println(removeButton.size());
		for (WebElement webElement : removeButton) {
			Thread.sleep(3000);
			jswait.loadClick("//iron-icon[@title='Remove']");

		}

		if (dndListType.equals("both")) {
			jswait.loadClick(DNCListTextbox);
			jswait.loadClick(seleniumDNDMandatoryList);
			jswait.loadClick(DNCListAddButton);
			jswait.loadClick(DNCListTextbox);
			jswait.loadClick(seleniumDNDOptionalList);
			jswait.loadClick(DNCListAddButton);
			System.out.println("both DNC exclusion list selected");
		} else if (dndListType.equals("mandatory")) {
			jswait.loadClick(DNCListTextbox);
			jswait.loadClick(seleniumDNDMandatoryList);
			jswait.loadClick(DNCListAddButton);
			System.out.println("mandatory DNC exclusion list selected");
		} else if (dndListType.equals("optional")) {
			jswait.loadClick(DNCListTextbox);
			jswait.loadClick(seleniumDNDOptionalList);
			jswait.loadClick(DNCListAddButton);
			System.out.println("optional DNC exclusion list selected");
		} else if (dndListType.equals("none")) {

			System.out.println("No DNC exclusion list selected");
		}
		jswait.loadClick(DNCListCloseButton);
	}

	
	
	
	public String getTopBcStatusofTrigger(String bcName) throws Exception {

		jswait.waitUntil(
				"//div[@val='broadcastViews']/..//div[@val='broadcastTriggerableViews']//vaadin-grid[@id='broadcastTriggerList']//vaadin-grid-table-row[1]//vaadin-grid-table-cell[1]//vaadin-grid-cell-content[contains(.,'"
						+ bcName + "')]/../..//vaadin-grid-table-cell[2]//vaadin-grid-cell-content");
		String status = jswait.getTextFormElement(
				"//div[@val='broadcastViews']/..//div[@val='broadcastTriggerableViews']//vaadin-grid[@id='broadcastTriggerList']//vaadin-grid-table-row[1]//vaadin-grid-table-cell[1]//vaadin-grid-cell-content[contains(.,'"
						+ bcName + "')]/../..//vaadin-grid-table-cell[2]//vaadin-grid-cell-content");
		return status;
	}

	public String getTopBcStatusOfRecurring(String bcName) throws Exception, UnsupportedFlavorException, IOException {

		String status = jswait.getTextFormElement(
				"//div[@val='broadcastViews']/..//div[@val='broadcastRecurringViews']//vaadin-grid[@id='broadcastRecurList']//vaadin-grid-table-row[1]//vaadin-grid-table-cell[1]//vaadin-grid-cell-content[contains(.,'"
						+ bcName + "')]/../..//vaadin-grid-table-cell[2]//vaadin-grid-cell-content");
		return status;
	}

	public String getTopBcStatusOfSeeding(String bcName) throws Exception, UnsupportedFlavorException, IOException {

		String status = jswait.getTextFormElement(
				"//div[@val='broadcastViews']/..//div[@val='broadcastSeedingViews']//vaadin-grid[@id='broadcastSeedList']//vaadin-grid-table-row[1]//vaadin-grid-table-cell[1]//vaadin-grid-cell-content[contains(.,'"
						+ bcName + "')]/../..//vaadin-grid-table-cell[2]//vaadin-grid-cell-content");
		return status;
	}

	public String getTopBcStatus(String sheetname, String bcName) throws Exception {
		String status = "";

		if (sheetname.contains("one-offBC") || sheetname.contains("TriggerOneoff")) {
			jswait.waitUntil(topBcStatusGrid);
			status = topBcStatusGrid.getText();
		} else if (sheetname.contains("seeding")) {
			status = getTopBcStatusOfSeeding(bcName);
		} else if (sheetname.contains("TriggerReccurringBC")) {
			status = getTopBcStatusofTrigger(bcName);
		} else if (sheetname.contentEquals("recurringBC")||sheetname.contentEquals("recurrBCDaily") || sheetname.contentEquals("recurringBCEdit")|| sheetname.contentEquals("recurringBCForPause") ){
			status = getTopBcStatusOfRecurring(bcName);
		}

		return status;
	}

	public void navigate_to_broadcasts(String bcSheetName) throws Exception {
		if (bcSheetName.contains("one-offBC")||bcSheetName.contains("TriggerOneoff")) {
			System.out.println(bcSheetName);
			jswait.loadClick("//paper-tab//div[contains(.,'One-time Broadcasts')]");

		} else if (bcSheetName.contains("seeding")) {
			System.out.println(bcSheetName);
			jswait.loadClick("//paper-tab//div[contains(.,'Seedings Broadcasts')]");

		} else if (bcSheetName.contentEquals("recurringBC")||bcSheetName.contentEquals("recurrBCDaily")) {
			System.out.println(bcSheetName);
			jswait.loadClick("//paper-tab//div[contains(.,'Recurring Broadcasts')]");
		} else if(bcSheetName.contains("TriggerReccurringBC")) {
			System.out.println(bcSheetName);
			jswait.loadClick("//paper-tab//div[contains(.,'Triggerable Broadcasts')]");
		}// elseif end

	}

	
	public void pauseBC(String bctype) throws Exception {
		  
		  commonObjects.BCOptionIcon(bctype);
		  clickPauseBroadcastOption();
		  clickPauseYesButton();
		  Thread.sleep(3000);

	}
	public void abortBC(String bctype) throws Exception {

		 commonObjects.BCOptionIcon(bctype);
		 if(bctype.equalsIgnoreCase("onetime")) {
		clickAbortBroadcastOption();
		clickAbortYesButton();
		 }
		 else {
			 jswait.loadClick(broadcastAbortOtherThanOneTime);
			 jswait.loadClick(AbortYes);
		 }
		
		Thread.sleep(3000);
//		commonObjects.clickOptionsIcon();
//		clickAbortBroadcastOption();
//		clickAbortYesButton();
//		verifyStatusOfBCAfterAbortion();
	}

	public String getTopBcStatus(String sheetname, String bcName,String bctype) throws Exception {
		String status = "";
		if (bctype.equalsIgnoreCase("onetime") ) {
			jswait.waitUntil(topBcStatusGrid);
			status = topBcStatusGrid.getText();
		} else if (bctype.equalsIgnoreCase("seeding")) {
			status = topBcStatusGridForSeedingChild.getText();
			
           		} else if (bctype.contains("trigger")) {      
			status = getTopBcStatusofTrigger(bcName);
		} else if (bctype.equalsIgnoreCase("recurring") ){
			status = topBcStatusGridForRecurrChild.getText();
		
		}
		else if (bctype.equalsIgnoreCase("seedingRecurr")) {
			status=topBcStatusGridForSeedingrecurringChild.getText();
		}

		return status;
		
	}

	public String getStatusForChildBC(String sheetname, String bcName) throws Exception{
		String status = "";

		
			jswait.waitUntil(topBcStatusGridForRecurrChild);
			status = topBcStatusGridForRecurrChild.getText();
			return status;
	}
	
	public void createBCWithBroadcastAndPartnerLevel(String name, String bc_type, String baseList, String offer, String condition, String inventory,
			String dndExclusion) throws Exception {
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		enterBroadcastBasicDetails(name, inventory);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")||bc_type.contains("Trigger")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'" + TRIGGER + "')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
        TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		commonObjects.clickOptionsIcon();
		targetConditionObjects.clickTargetConditionDeletet();
		if (condition.contains("segmentAgeGT40")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);
			jswait.loadClick("//paper-item[contains(.,'segmentAgeGT40')]");
		} else if (condition.equals("SegmentForMoreThanTenConditions")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);
			jswait.loadClick("//paper-item[contains(.,'SegmentForMoreThanTenConditions')]");
		} else if (condition.equals("SegmentForMoreThanTenConditionsOR")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);
			jswait.loadClick("//paper-item[contains(.,'SegmentForMoreThanTenConditionsOR')]");

		} else if (condition.equals("SegmentAnalysis")) {
			jswait.loadClick(savedSegmentRadioButtion);
			jswait.loadClick(savedSegmentSelectorField);

			jswait.loadClick("(//paper-item[contains(.,'" + condition + "')])[1]");
		} else {
			targetConditionObjects.clickBasicTargetCondition(condition);
		}

		Thread.sleep(3000);
		selectDNCList(dndExclusion);

		clickProceedButton();
		selectOfferWithMultipleCreative(offerExcel.getCellByColumnName("Offer Name"),offerExcel.getCell(1, 20).toString());
		System.out.println("bc_type=" + bc_type);
		if (!bc_type.contains("Informational")) {
			selectTrackSession();
			selectTrackingSource();
			if (offerExcel.getCellByColumnName("Channel").contains("Email")) {
				selectSenderAndRouteEmail();
			} else if (offerExcel.getCellByColumnName("Channel").contains("Facebook")) {
				selectSenderAndRouteFacebook();
			} else
				selectSenderAndRoute();

		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

			// jswait.loadClick(routeBroadcastSmppRobiOutbond);

		}
		clickProceedButton();
	}
	
	public void selectOfferWithMultipleCreative(String offerName,String SecondCreative) throws Exception{
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
		if (SecondCreative.equalsIgnoreCase("extra Bonus Offer")) {
			jswait.loadClick(selectLanguage);
			jswait.loadClick(selectArabic);
		}
		else{
			System.out.println("default language selected");
		}
		
		
	}
//	======================================================================================================================================//
	
	
	
	
	public void enterBasicDetailsOfBC(String bcName,String inventory,String trigger) throws Exception{
		jswait.loadSendKeys(broadcastName, bcName);
		jswait.loadSendKeys(broadcastPurpose, "verify complete flow of bc");
		jswait.loadClick(labelSelector);
		jswait.loadClick(labelCrossell);
		jswait.loadSendKeys(inventorySelector, inventory);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + inventory + "')]");
		
		if(trigger.contains("none")) {
			System.out.println("no trigger selected");
		}
		else {
		jswait.loadSendKeys(triggerInput,trigger);
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'"+trigger+"')]");
		}
		jswait.loadClick(proceedButton);
		
	}
	
	public void enterTargetTabDetails(String condition,String targetType,String TG,String CG,String DNC) throws Exception{
		selectBaseList(SELENIUM_LIST);
		Thread.sleep(10000);
		jswait.loadClick("(//div[@id='radioContainer']//following::div[contains(.,'"+targetType+"')])[1]");
		Thread.sleep(10000);
		jswait.loadClick(selectTargetGroup);
		
		if(TG.equalsIgnoreCase("no limit")) {
			jswait.loadClick(noLimitTGRadiobtn);
		}
		else if(TG.contains("defineLimitFixed")){
			
			try {
				int size = TG.length();
				String targetGroup = TG.substring(16, size);
//				int result = Integer.parseInt(targetGroup);
				System.out.println(targetGroup);

				jswait.loadClick(defineLimit);
				jswait.loadSendKeys(enterLimitField, targetGroup);
			} catch (Exception e) {
				jswait.loadClick(defineLimit);
				jswait.loadSendKeys(enterLimitField, "10");
			}
			
		}
		else if(TG.equalsIgnoreCase("defineLimitsDynamic")) {
			
		}
		jswait.loadClick(TGSavebtn);
		
		jswait.loadClick(selectControlGroup);
		if(CG.equalsIgnoreCase("no limit")) {
			jswait.loadClick(noControlGroup);
			
		}
		else if(CG.equalsIgnoreCase("fixedPercentage")) {
			jswait.loadClick(fixedPercentageOfTargetBase);
			jswait.loadSendKeys(fixedPercentNumber, "10");
		}
		else if(CG.equalsIgnoreCase("advancedParameters")) {
			
		}
		jswait.loadClick(CGSavebtn);
		selectDNCList(DNC);
		TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		if(targetType.equalsIgnoreCase("create")){
			commonObjects.clickOptionsIcon();
			targetConditionObjects.clickTargetConditionDeletet();
			Thread.sleep(2000);
			System.out.println("selected condition is "+condition);
			targetConditionObjects.clickBasicTargetCondition(condition);
			}
		else if(targetType.equalsIgnoreCase("saved segments")) {
			jswait.loadClick(savedSegmentRadioButtion);
		Thread.sleep(1000);
		jswait.loadClick(savedSegmentSelectorField);
		Thread.sleep(1000);  
		{
			if (condition.contains("segmentAgeGT40")) {
					jswait.loadClick("//paper-item[contains(.,'segmentAgeGT40')]");
			} else if (condition.equals("SegmentForMoreThanTenConditions")) {
				jswait.loadClick("//paper-item[contains(.,'SegmentForMoreThanTenConditions')]");
			} else if (condition.equals("SegmentForMoreThanTenConditionsOR")) {
				jswait.loadClick("//paper-item[contains(.,'SegmentForMoreThanTenConditionsOR')]");
	
				} else if (condition.equals("SegmentAnalysis")) {
					jswait.loadClick("(//paper-item[contains(.,'" + condition + "')])[1]");
				}
		}
	}

			else {
				System.out.println("none selected as target condition");
			}
		
			
			clickProceedButton();
		}
		
	public void selectOffer(String offerSheet, String bc_type,String creative,String trackExpires,String filterCriteria,String giverRewardsTo) throws Exception{
		ExcelHelper offerExcel=new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offerSheet);
		String offerName = offerExcel.getCellByColumnName("Offer Name");
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
		if(creative.equalsIgnoreCase("multiple creative")) {
			jswait.loadClick(selectLanguage);
			Thread.sleep(2000);
			jswait.loadClick(selectArabic);
		}
		else if (creative.equalsIgnoreCase("single creative")){
			System.out.println("singlecreative");
			
		}
		if (!bc_type.contains("Informational")) {
			selectTrackSession(trackExpires);
			selectTrackingSource();
//			selectFiletrCriteria(filterCriteria);
//			selectGiveRewardsTo(giverRewardsTo);
			
			if (offerExcel.getCellByColumnName("Channel").contains("Email")) {
				selectSenderAndRouteEmail();
			} else if (offerExcel.getCellByColumnName("Channel").contains("Facebook")) {
				selectSenderAndRouteFacebook();
			} else
				selectSenderAndRoute();

		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			Thread.sleep(2000);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			Thread.sleep(1000);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);
			Thread.sleep(2000);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

		}
		clickProceedButton();
	}
	public void selectOffer(String offerSheet,String bc_type,String connectorSheet) throws Exception{
		ExcelHelper offerExcel=new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offerSheet);
		String offerName = offerExcel.getCellByColumnName("Offer Name");
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
		eh.setExcelFile("DigitalPlus", connectorSheet);
		String connector=(String) eh.getCell(1, 0);
		jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
		jswait.loadClick(senderIdBroadcastAdressSmpp);
		Thread.sleep(2000);
		jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);
	    jswait.loadClick("//label[contains(.,'Route over which this broadcast can be sent')]//following::vaadin-combo-box-item[contains(.,'"+connector+"')]");
		Thread.sleep(2000);
		jswait.loadSendKeys(senderIdFulfillmentSelector, SENDER_SMPP);
		jswait.loadClick(senderIdFulfillmentAdressSmpp);
		Thread.sleep(2000);
		jswait.loadSendKeys(routeFulfillment,ROUTE_SMPP);
		jswait.loadClick(".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'"+connector+"')]");
		clickProceedButton();
	}
	
	public void selectCopiedOffer(String offerSheet, String bc_type,String creative,String trackExpires,String filterCriteria,String giverRewardsTo) throws Exception{
		ExcelHelper offerExcel=new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offerSheet);
		String offerName = (offerExcel.getCellByColumnName("Offer Name"))+"_Copy";
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
		if(creative.equalsIgnoreCase("multiple creative")) {
			jswait.loadClick(selectLanguage);
			Thread.sleep(2000);
			jswait.loadClick(selectArabic);
		}
		else if (creative.equalsIgnoreCase("single creative")){
			System.out.println("singlecreative");
			
		}
		if (!bc_type.contains("Informational")) {
			selectTrackSession(trackExpires);
			selectTrackingSource();
//			selectFiletrCriteria(filterCriteria);
//			selectGiveRewardsTo(giverRewardsTo);
			
			if (offerExcel.getCellByColumnName("Channel").contains("Email")) {
				selectSenderAndRouteEmail();
			} else if (offerExcel.getCellByColumnName("Channel").contains("Facebook")) {
				selectSenderAndRouteFacebook();
			} else
				selectSenderAndRoute();

		} else {
			jswait.loadSendKeys(senderIdBroadcastSelector, SENDER_SMPP);
			Thread.sleep(2000);
			jswait.loadClick(senderIdBroadcastAdressSmpp);
			Thread.sleep(1000);
			jswait.loadSendKeys(routeBroadcast, ROUTE_SMPP);
			Thread.sleep(2000);

			jswait.loadClick(routeBroadcastSmppRobioutbound);

		}
		clickProceedButton();
	}
	
	public void recurringBCDeliverTabDetails(String endType,String targetRenderTime,String bcExpiry,String bcSheet)  throws Exception{
		Actions builder =new Actions(driver);
		eM.setExcelFile("bcInputData", bcSheet);
		String recurrencePattern =eM.getCellByColumnName("Recurrance Pattern");
		System.out.println(recurrencePattern);
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
			System.out.println("Inside recurring");
			Thread.sleep(5000);
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
			jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
			if(targetRenderTime.equalsIgnoreCase("broadcast schedule before")){
			jswait.loadClick(".//*[@id='months']//div[@date='" + date1 + "']");
			}
			else
				jswait.loadClick(".//*[@id='months']//div[@date='" + date + "']");	
			jswait.loadClick("//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			// }
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			Thread.sleep(3000);
			if(targetRenderTime.equalsIgnoreCase("broadcast schedule at")){
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 2) + "]"));
			Thread.sleep(2000);
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			}
			else {
				WebElement num = driver.findElement(By.xpath(
						".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				Thread.sleep(2000);
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(2000);
			}
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(2000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
		 if(endType.equalsIgnoreCase("none")) {
				System.out.println("end type :"+endType);
				jswait.loadClick(neverRadiobtn);
		if(recurrencePattern.equalsIgnoreCase("daily")) {
			jswait.loadClick(recurrencePatternInput);
			Thread.sleep(1000);
			jswait.loadClick(recurrencePatternDays);
			Thread.sleep(1000);
			jswait.loadSendKeys(recurrenceInput,"1");
			Thread.sleep(1000);
			
		}
		else if(recurrencePattern.equalsIgnoreCase("2days")) {
			jswait.loadClick(recurrencePatternInput);
			Thread.sleep(1000);
			jswait.loadClick(recurrencePatternDays);
			Thread.sleep(1000);
			jswait.loadSendKeys(recurrenceInput,"2");
			Thread.sleep(1000);
		}
		else if (recurrencePattern.equalsIgnoreCase("every week")) {
			jswait.loadClick(recurrencePatternInput);
		    Thread.sleep(1000);
			jswait.loadClick(recurrencePatternWeeks);
			Thread.sleep(2000);
			jswait.loadSendKeys(recurrenceInput,"1");
			Calendar c =Calendar.getInstance();
			SimpleDateFormat df=new SimpleDateFormat("EEEE");
			String today=df.format(c.getTime());
			System.out.println("today's day is :"+today);
			Thread.sleep(1000);
			jswait.loadClick("//div[@id='checkboxLabel'][contains(.,'"+today+"')]");
		
			
		}
		else if (recurrencePattern.equalsIgnoreCase("months")) {
			    jswait.loadClick(recurrencePatternInput);
			    Thread.sleep(1000);
			    jswait.loadClick(recurrencePatternMonths);
			    Thread.sleep(2000);
				Thread.sleep(1000);
				jswait.loadSendKeys(recurrenceInput,"1");
				jswait.loadClick(selectSpecialDay);
				Thread.sleep(1000);
				jswait.loadClick(orderOfTheDayInput);
				Thread.sleep(1000);
				jswait.loadClick(orederOfDay5);
				jswait.loadClick(TypeOfDayInput);
				Thread.sleep(1000);
				jswait.loadClick(weekEndDay);
		}
		jswait.loadClick(startBroadcastAtInput);
		Thread.sleep(4000);
		if(targetRenderTime.equalsIgnoreCase("broadcast schedule at")) {
		WebElement num2 = driver.findElement(By.xpath(
				"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 2) +"])[2]"));
		builder.moveToElement(num2).click().build().perform();
		Thread.sleep(2000);
		}
		else {
			System.out.println("+++++++++++++++++++++++inside satrt broadcast at time+++++++++++++++++++++");
			WebElement num2 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[2]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(2000);
		}
		WebElement num3 = driver.findElement(By.xpath(
				"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "])[2]"));
		Thread.sleep(3000);
		builder.moveToElement(num3).click().build().perform();
		Thread.sleep(3000);
		if (am_pm == 0)
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
		else
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");
          jswait.loadClick(startBroadcastOkbtn);
		
	
	if(targetRenderTime.equalsIgnoreCase("real time")) {
		System.out.println("render schedule is real time");
	}
	else if(targetRenderTime.equalsIgnoreCase("broadcast schedule at")) {
		jswait.loadClick(bcScheduleRadiobtn);
		jswait.loadClick(startBroadcastInput);
		jswait.loadClick(renderTimeAt);
		jswait.loadClick(startBcAtInput);
		Thread.sleep(4000);
		WebElement num4 = driver.findElement(By.xpath(
				"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[3]"));
		builder.moveToElement(num4).click().build().perform();
		Thread.sleep(2000);
		WebElement num5 = driver.findElement(By.xpath(
				"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min+1) + "])[3]"));
		Thread.sleep(3000);
		builder.moveToElement(num5).click().build().perform();
		Thread.sleep(3000);
		if (am_pm == 0)
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[3]");
		else
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[3]");
          jswait.loadClick(TargetRenderTimeOKbtn);
		
	}
	else if(targetRenderTime.equalsIgnoreCase("broadcast schedule before")) {
		jswait.loadClick(bcScheduleRadiobtn);
		jswait.loadClick(startBroadcastInput);
		jswait.loadClick(renderTimeBefore);
		jswait.loadSendKeys(broadcastRenderBeforeInput, "24");
	}
	if(bcExpiry.equalsIgnoreCase("after")) {
		jswait.loadClick(broadcastExpiryCheckbox);
		jswait.loadClick(expiresInput);
		jswait.loadClick(expiresAfter);
		jswait.loadSendKeys(expiresTimeInput,"24");
	}
	else if(bcExpiry.equalsIgnoreCase("at")){
		jswait.loadClick(broadcastExpiryCheckbox);
		jswait.loadClick(expiresInput);
		jswait.loadClick(expiresAt);
		jswait.loadClick(expiresTimeInput);
		WebElement num4 = driver.findElement(By.xpath(
				"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[3]"));
		builder.moveToElement(num4).click().build().perform();
		Thread.sleep(2000);
		WebElement num5 = driver.findElement(By.xpath(
				"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 10) + "])[3]"));
		Thread.sleep(1000);
		builder.moveToElement(num5).click().build().perform();
		if (am_pm == 0)
			jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
		else
			jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

		jswait.loadClick(expiryTimeOkbtn);
	}
		
	}

		 
	else if(endType.equalsIgnoreCase("at")) {
		System.out.println("end type :"+endType);
		Thread.sleep(2000);
		jswait.loadClick(atRadiobtn);
		jswait.loadClick(endDateInput);
		Thread.sleep(2000);
		jswait.loadClick("(.//*[@id='months']//div[@date=('"+date2+"')])[2]");
		jswait.loadClick(dateOkbtn);
		Thread.sleep(2000);
		jswait.loadClick(endTimeInput);
		Thread.sleep(2000);
		WebElement num6 = driver.findElement(By.xpath(
				"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[2]"));
		builder.moveToElement(num6).click().build().perform();
		Thread.sleep(2000);
		WebElement num7 = driver.findElement(By.xpath(
				"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min - 2) + "])[2]"));
		Thread.sleep(1000);
		builder.moveToElement(num7).click().build().perform();
		if (am_pm == 0)
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
		else
			jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");

		jswait.loadClick(timeOkbtn);
		{
			if(recurrencePattern.equalsIgnoreCase("daily")) {
				jswait.loadClick(recurrencePatternInput);
				Thread.sleep(1000);
				jswait.loadClick(recurrencePatternDays);
				Thread.sleep(1000);
				jswait.loadSendKeys(recurrenceInput,"1");
				Thread.sleep(1000);
				
			}
			else if(recurrencePattern.equalsIgnoreCase("2days")) {
				jswait.loadClick(recurrencePatternInput);
				Thread.sleep(1000);
				jswait.loadClick(recurrencePatternDays);
				Thread.sleep(1000);
				jswait.loadSendKeys(recurrenceInput,"2");
				Thread.sleep(1000);
			}
			else if (recurrencePattern.equalsIgnoreCase("every week")) {
				jswait.loadClick(recurrencePatternInput);
			    Thread.sleep(1000);
				jswait.loadClick(recurrencePatternWeeks);
				Thread.sleep(2000);
				jswait.loadSendKeys(recurrenceInput,"1");
				Thread.sleep(1000);
				Calendar c =Calendar.getInstance();
				SimpleDateFormat df=new SimpleDateFormat("EEEE");
				String today=df.format(c.getTime());
				System.out.println("today's day is :"+today);
				Thread.sleep(1000);
				jswait.loadClick("//div[@id='checkboxLabel'][contains(.,'"+today+"')]");
				
			}
			else if (recurrencePattern.equalsIgnoreCase("months")) {
				    jswait.loadClick(recurrencePatternInput);
				    Thread.sleep(1000);
				    jswait.loadClick(recurrencePatternMonths);
				    jswait.loadClick(recurrencePatternDays);
					Thread.sleep(1000);
					jswait.loadSendKeys(recurrenceInput,"1");
					jswait.loadClick(selectSpecialDay);
					Thread.sleep(1000);
					jswait.loadClick(orderOfTheDayInput);
					Thread.sleep(1000);
					jswait.loadClick(orederOfDay5);
					jswait.loadClick(TypeOfDayInput);
					Thread.sleep(1000);
					jswait.loadClick(weekEndDay);
			}
			
			jswait.loadClick(startBroadcastAtInput);
			Thread.sleep(2000);
			WebElement num8 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[3]"));
			builder.moveToElement(num8).click().build().perform();
			Thread.sleep(2000);
			WebElement num9 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "])[3]"));
			Thread.sleep(1000);
			builder.moveToElement(num9).click().build().perform();
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[3]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[3]");
jswait.loadClick(startBroadcastOkbtn);
			}
		if(targetRenderTime.equalsIgnoreCase("real time")) {
			System.out.println("render schedule is real time");
		}
		else if(targetRenderTime.equalsIgnoreCase("broadcast schedule at")) {
			jswait.loadClick(bcScheduleRadiobtn);
			jswait.loadClick(startBroadcastInput);
			jswait.loadClick(renderTimeAt);
			jswait.loadClick(startBcAtInput);
			Thread.sleep(4000);
			WebElement num4 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 1) +"])[3]"));
			builder.moveToElement(num4).click().build().perform();
			Thread.sleep(2000);
			WebElement num5 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min+1) + "])[3]"));
			Thread.sleep(3000);
			builder.moveToElement(num5).click().build().perform();
			Thread.sleep(3000);
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[3]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[3]");
	          jswait.loadClick(TargetRenderTimeOKbtn);
			
		}
		else if(targetRenderTime.equalsIgnoreCase("broadcast schedule before")) {
			jswait.loadClick(bcScheduleRadiobtn);
			jswait.loadClick(startBroadcastInput);
			jswait.loadClick(renderTimeBefore);
			jswait.loadSendKeys(broadcastRenderBeforeInput, "48");
		}
		if(bcExpiry.equalsIgnoreCase("after")) {
			jswait.loadClick(broadcastExpiryCheckbox);
			jswait.loadClick(expiresInput);
			jswait.loadClick(expiresAfter);
			jswait.loadSendKeys(expiresTimeInput,"24");
		}
		else if(bcExpiry.equalsIgnoreCase("at")){
			jswait.loadClick(broadcastExpiryCheckbox);
			jswait.loadClick(expiresInput);
			jswait.loadClick(expiresAt);
			jswait.loadClick(expiresTimeInput);
			WebElement num10 = driver.findElement(By.xpath(
					"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours + 2) +"])[4]"));
			builder.moveToElement(num10).click().build().perform();
			Thread.sleep(2000);
			WebElement num11 = driver.findElement(By.xpath(
					"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "])[4]"));
			Thread.sleep(1000);
			builder.moveToElement(num11).click().build().perform();
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[4]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[4]");

			
			jswait.loadClick(expiryTimeOkbtn);
			
		}
}
	}
	
public boolean verifyCountsinGrid(String bcName,String statusOffBc,int targetCount, int sentCount, int ackCount) throws InterruptedException {
		
		boolean elementVisible = jswait.checkVisibility(".//vaadin-grid-table-row/vaadin-grid-table-cell[1][contains(.,'"+bcName+"')]/..//vaadin-grid-table-cell[2][contains(.,'"+statusOffBc+"')]/..//vaadin-grid-table-cell[4][contains(.,'"+targetCount+"')]/..//vaadin-grid-table-cell[5][contains(.,'"+sentCount+"')]/..//vaadin-grid-table-cell[6][contains(.,'"+ackCount+"')]");
	return elementVisible;
	}
	
	
	public void navigateToLandingPageToBcFilterPage(String campaignCategory,String campaignName,String bcName) throws Exception {
		campaignObjects.navigateToLIfeCycleMarketing();
		campaignObjects.scrollToCampaignCategory(campaignCategory);
		commonObjects.filterName(campaignName);
		jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'" + campaignName
				+ "')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
		campaignObjects.clickOptionsViewBroadcasts();
		commonObjects.filterName(bcName);
		
	}
	
	
	
	public void selectFiletrCriteria(String filterCriteria) throws InterruptedException {
		try {
			jswait.loadClick(
					"//div[@class='style-scope broadcast-offers-config']//p[contains(.,'Filter Criteria')]/..//div//paper-radio-group[@id='convert-all-radio']//div[@id='radioLabel'][contains(.,'"
							+ filterCriteria + "')]");

		} catch (Exception e) {
			System.out.println("Selected rule based and Unique conversion of a customer");
		}
	}

	public void selectGiveRewardsTo(String giverRewardsTo) throws InterruptedException {
		try {
			jswait.loadClick(
					"//div//p[contains(.,'Give rewards to')]/..//paper-radio-group[@id='reward-all-radio']//paper-radio-button//div[@id='radioLabel'][contains(.,'"
							+ giverRewardsTo + "')]");
		} catch (Exception e) {
			System.out.println("Selected rule based and Unique conversion of a customer");
		}
	}
	
	public void selectTrackSession(String trackExpires) throws InterruptedException {
	if(trackExpires.equalsIgnoreCase("After")) {
	jswait.loadClick(trackSessionSelector);
	jswait.loadClick(trackSessionAfter);
	jswait.loadSendKeys(trackSession2Days, "3");
	}else if(trackExpires.equalsIgnoreCase("At")) {
			
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
			
			
			
			jswait.loadClick(trackSessionSelector);
			jswait.loadClick(trackSessionAT);
			
			jswait.loadClick("//paper-date-time-input[@class='flex style-scope broadcast-tracking x-scope paper-date-time-input-0']//div[@class='container style-scope paper-date-time-input']//input[@id='input']");
			
				Actions builder =new Actions(driver);
				Thread.sleep(3000);
			WebElement num = driver.findElement(By.xpath(
					"(.//*[@id='clockArea']//div//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"])[1]"));
			Thread.sleep(2000);
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			// jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					"(.//*[@id='clockArea']//div//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"])[1]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
					jswait.loadClick("(//*[@id='heading']/iron-selector[2]/div[1])[1]");
			
			else
				Thread.sleep(1000);
				jswait.loadClick("(//*[@id='heading']/iron-selector[2]/div[2])[1]");
			Thread.sleep(1000);
			//num1 = driver.findElement(By.xpath(
			//		".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			//builder.moveToElement(num1).click().build().perform();
			
			
			
			jswait.loadClick("(.//*[@id='timeDialog']/div/paper-button[2])[1]");
			
			jswait.loadClick("//paper-dropdown-menu[@id='dropAtOn']/..//div//label[contains(.,'On/After')]/..//input[@id='input']");
			jswait.loadClick("//paper-dropdown-menu[@id='dropAtOn']//paper-item[text()='After']");
			
//			jswait.loadClick("(.//paper-input-wrapper//div[@class='input-content label-is-floating style-scope paper-input-container']//div[@id='labelAndInputContainer']//input)[2]");
//			jswait.loadSendKeys("//paper-dropdown-menu/..//paper-input-wrapper//div[@class='input-content label-is-floating style-scope paper-input-container']//div[@id='labelAndInputContainer']//input", "24");
		driver.findElement(By.xpath("//paper-dropdown-menu/..//paper-input-wrapper//div[@class='input-content label-is-floating style-scope paper-input-container']//div[@id='labelAndInputContainer']//input")).sendKeys("24");
			jswait.loadClick("//paper-dropdown-menu[@id='dropAtAfterType']//input");
			jswait.loadClick("//iron-dropdown[@id='dropdown']//paper-item[text()='Hours']");
		
		}
	}
	public void verifyViewDetailsOfBc(String targetCount,String offerChannel) throws Exception{
		jswait.loadClick(ViewTargetDetails);
		Thread.sleep(10000);
		Assert.assertTrue(jswait.checkVisibility("(//p[contains(.,'Target Count')]//following::p[contains(.,'"+targetCount+"')])[1]"));
		Thread.sleep(2000);
		jswait.loadClick(ViewTargetDetails);
		Thread.sleep(2000);
		jswait.loadClick(ViewOfferDetails);
		Thread.sleep(2000);
		Assert.assertTrue(jswait.checkVisibility("//p[contains(.,'Channel Type')]//following::p[contains(.,'"+offerChannel+"')]"));
	}
	
	public void viewBCbtn(String bcToView, String bctype) throws Exception{
		Thread.sleep(3000);
	if(bcToView.equalsIgnoreCase("recurringchildbc")) {
		System.out.println("++++++++++++++++++++ to view is the recurring child bc thatis third column");
	jswait.loadClick(recurringChildOptionIcon);
	}
	if(bcToView.equalsIgnoreCase("RecurringChildAt")||bcToView.equalsIgnoreCase("seedingonetime-messaging")) {
		System.out.println("++++++++++++++++++ bc to view is the second column ++++++++++++++++++++");
		jswait.loadClick(RecurringChildOptionIconAt);
	}
	else if(bcToView.equalsIgnoreCase("seedingRecurring-Rewarding")) {
	jswait.loadClick(seedingRecurrRewardingChildOptionIcon);
	}
	else if(bcToView.equalsIgnoreCase("seedingRecurring-Messaging")) {
	jswait.loadClick(seedingRecurrMessagingChildOptionIcon);
	}
	else if(bcToView.equalsIgnoreCase("onetime")||bcToView.equalsIgnoreCase("seedingonetime-rewarding")) {   
    	System.out.println("+++++++++++++   the bc to view is the first column  ++++++++++++++++++++++++");
        commonObjects.BCOptionIcon(bctype);
    }
	jswait.loadClick(BcViewbtn);
	}
	
	public void verifyCountFromBCReport(String bcName,String targetCount,String targetCountSheet,String cgCount,String cgRequired,String bcLevelCg) throws Exception{
		Thread.sleep(3000);
		jswait.loadClick(selectColumn);
		Thread.sleep(2000);
		String checkboxOfDr =driver.findElement(By.xpath("//paper-checkbox[@id='delivered_count']")).getAttribute("aria-checked");
		String checkboxOfOverallCg=driver.findElement(By.xpath("//paper-checkbox[@id='overall_cg']")).getAttribute("aria-checked");
		String checkBoxOfBCLevelCg=driver.findElement(By.xpath("//paper-checkbox[@id='broadcast_cg']")).getAttribute("aria-checked");
		if(checkboxOfDr.equalsIgnoreCase("false")) {
		jswait.loadClick(selectColumnDelivered);
		Thread.sleep(2000);
		if(checkboxOfOverallCg.equalsIgnoreCase("false")) {
		jswait.loadClick(selectCg);
		Thread.sleep(2000);
		}
		if(checkBoxOfBCLevelCg.equalsIgnoreCase("false")) {
		jswait.loadClick(selectBCCg);
		}
		}
		else {
			System.out.println("overall and bc cg checkbox is already true");
			System.out.println("delivered checkbox is already true");
		}
	   jswait.loadClick(nextbtn);
		Thread.sleep(2000);
		jswait.loadClick(savebtn);
		jswait.loadClick(saveBCReport);
		jswait.loadClick(saveBCReportPaperbtn);
		jswait.loadClick(refreshReport);
		Thread.sleep(3000);
		ReportPageObjects ReportPageObject=new ReportPageObjects();
		ReportPageObject.filterbroadcast(bcName);
		Assert.assertTrue(jswait.checkVisibility("(//span[contains(.,'"+targetCount+"')])[3]"));
		Assert.assertTrue(jswait.checkVisibility("(//span[contains(.,'"+targetCount+"')])[2]"));
		if(cgRequired.equalsIgnoreCase("if required")) {
		if(targetCountSheet.equalsIgnoreCase("targetConditionCount")) {
		Assert.assertTrue(jswait.checkVisibility("(//span[contains(.,'"+cgCount+"')])"));
		Assert .assertTrue(jswait.checkVisibility("(//span[contains(.,'"+bcLevelCg+"')])"));
		}
		else if(targetCountSheet.equalsIgnoreCase("targetCountWithTrigger"))
				Assert.assertTrue(jswait.checkVisibility("(//span[contains(.,'"+cgCount+"')])"));
		        Assert .assertTrue(jswait.checkVisibility("(//span[contains(.,'"+bcLevelCg+"')])"));
		}
		else {
			System.out.println("cg count need not to be verified");
		}
	
	}
	public void verifyEventOfTheBC(String event,String bcName,String campaignName) throws Exception{
		System.out.println("========"+event+" :is the event tht need to be verified");
		System.out.println(bcName);
		CustomerProfilePage CustomerProfilePage= new CustomerProfilePage();
		CustomerProfilePage.searchEventsDynammically("Last 2 Days");
		 Thread.sleep(4000);
		jswait.loadClick(selectAllEventCheckBox);
		jswait.loadClick(selectAllEventCheckBox);
		jswait.loadClick("(//div[contains(.,'"+event+"')][@id='checkboxLabel'])[1]");
		Thread.sleep(2000);
		 jswait.loadClick(applyEventFilter);
		 CustomerProfilePage.clickOnEventTabFilter();
		 CustomerProfilePage.enterEventDetails(campaignName);
		 CustomerProfilePage.filterResetFilterButton();
		 Thread.sleep(3000);
		  CustomerProfilePage.clickOnEventTabFilter();
		 CustomerProfilePage.enterEventDetails(campaignName);	 
		 CustomerProfilePage.filterApplyButton();
		 Thread.sleep(10000);
		 List<WebElement> ackEvents = driver.findElements(By.xpath("//iron-data-table//iron-list//div[@class='item style-scope iron-data-table']//data-table-row//data-table-cell[3]//span[contains(.,'"+event+"')]/../..//data-table-cell[4]//span[contains(.,'"+campaignName+"')]"));
			Thread.sleep(1000);
			System.out.println(ackEvents.size());
			 System.out.println("print "+ackEvents);
			 System.out.println("before for loop");
			 
			for (int i=1;i<=ackEvents.size()+1;i++) {
				
						try {
							Thread.sleep(2000);
							jswait.loadClick("(//iron-icon[@icon='app-icons:arrow-right'])["+i+"]");
							Thread.sleep(1000);
							
							boolean booln = jswait.checkVisibility(
									"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
							System.out.println(booln);
						
							if (booln == true) {
								System.out.println(event+"  verified");
								break;
							}
						
							else {
						System.out.println("inside else loop and value of i is ::::::::"+i);
				
			}
						}
							catch(Exception e) {
								Assert.assertTrue(false,"event not persisted");
							}
			}
		
	} 
//	}    
	
	public void verifyBCAckCountFromGrid(String bcName,String targetCount,String bctype) throws Exception{
		System.out.println("==============================="+targetCount+"========================");
			Thread.sleep(3000);
			switch(bctype) {
			case "onetime" :
				System.out.println("+++++++++++++++++++++++inside case 1 of switch case+++++++++++++++++++");
				Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][2]"));
				break;
			case "recurringWithEndAt":
				System.out.println("+++++++++++++++++++++++inside case 2 of switch case+++++++++++++++++++");
				Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][2]"));
				break;
			case "recurring" :
				Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][2]"));
				break;
			case "seedingonetime":
				Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"_OneOff_RewardingBC')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][1]"));
			    Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"_OneOff_RewardingBC')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][2]"));
			    Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"_OneOff_MessagingBC')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][1]"));
			    Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"_OneOff_MessagingBC')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][2]"));
			    break;
			case "seedingRecurring"	:
			Assert.assertTrue(jswait.checkVisibility("//vaadin-grid-cell-content[contains(.,'"+bcName+"')]//following::vaadin-grid-cell-content[contains(.,'"+targetCount+"')][2]"));
				
			}	
		}
	
	public void addBcToSheet(String bcSheet,String bcName,String bcType,String bcStorageSheet,int row) throws Exception{
		eh.setExcelFile("parallelRunBC", bcStorageSheet);
	    eh.setCell(row, 0, bcName);
  	    eh.setCell(row, 1, bcType);
//  	    eh.setCell(row ,2, bcSheet);

	
	}
	
	public void verifyCGCount(String targetCount) throws Exception{
		Thread.sleep(3000);
		jswait.loadClick(ViewTargetDetails);
		Thread.sleep(3000);
		Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("//p[contains(.,'Control Group Exclusion Count')]//following::p[contains(.,'"+targetCount+"')][1]"))));
		
	}
	
	
	public void verifyDynamicTagOfTheBC(String dynamicTag,String bcName,String campaignName) throws Exception{
		CustomerProfilePage CustomerProfilePage= new CustomerProfilePage();
		 CustomerProfilePage.searchEventsDynammically("Last 3 Days");
		jswait.loadClick(selectAllEventCheckBox);
       jswait.loadClick(selectAllEventCheckBox);
       jswait.loadClick("//div[contains(.,'Acknowledged')][@id='checkboxLabel']"); 
       Thread.sleep(3000);
		 jswait.loadClick(applyEventFilter);
		 Thread.sleep(3000);
		 CustomerProfilePage.clickOnEventTabFilter();
		 CustomerProfilePage.enterEventDetails(campaignName);
		 CustomerProfilePage.filterApplyButton();
		 Thread.sleep(3000);
		 List<WebElement> Events = driver.findElements(By.xpath("//iron-data-table//iron-list//div[@class='item style-scope iron-data-table']//data-table-row//data-table-cell[3]//span[contains(.,'Acknowledged')]/../..//data-table-cell[4]//span[contains(.,'"+campaignName+"')]"));
			Thread.sleep(1000);
			System.out.println(Events.size());
			 int count=1;
			 System.out.println("print "+Events);
			 System.out.println("before for loop");
			 if(Events.size()==0) {
				 Assert.assertTrue(false);
			 }
			 
			for (WebElement webElement : Events) {
					if ((webElement.getText()).contains(campaignName)) {
						System.out.println(webElement.getText());
						try {
							jswait.loadClick("(//iron-icon[@class='deselect consumer-events style-scope x-scope iron-icon-0'])["+count+"]");
							Thread.sleep(1000);
							boolean booln = jswait.checkVisibility("//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
							Assert.assertTrue(jswait.checkVisibility("//label[contains(.,'Creative')]//following::label[contains(.,'"+dynamicTag+"')]"));
							System.out.println(booln);
							if (booln == true) {
								System.out.println("dynamic tag verified");
								break;
								
							}
							 else {
								 
								System.out.println(".. waiting for BC name "+bcName);
							}
						} catch (Exception e) {
							System.out.println("catch block");
							Assert.assertTrue(false);
						}
						Thread.sleep(2000);
						count++;
				}
			}
	
	}
	
	
	
	public void provideFileForConversion(String path, String fileName) throws Throwable {
		String csvFileData = "";
		File conversionCSV = new File("ExcelFiles\\" + fileName);
		BufferedReader br = null;
		String temp = "";
		int initial = 1;
		br = new BufferedReader(new FileReader(conversionCSV.getCanonicalPath()));
		while ((temp = br.readLine()) != null) {
			if (initial == 0) {
				csvFileData += "\n";
			}
			initial = 0;
			csvFileData += temp;
		}
		System.out.println(csvFileData);
		System.out.println("test");
		br.close();
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd "+path+"; echo '" + csvFileData + "' >"+fileName+"");
	}
	
		public void deleteFileForConversion(String path, String filename) throws Throwable {
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd "+path+"; rm "+filename+" -f");
	}
		public void verifyIsSeedingInReport(String bcName,String bcType) throws Exception{
			Thread.sleep(3000);
			jswait.loadClick(selectColumn);
			Thread.sleep(2000);
			String checkboxOfIsSeeding = driver.findElement(By.xpath("//paper-checkbox[@id='seeding']")).getAttribute("toggles aria-checked");
			String checkboxIsTriggered = driver.findElement(By.xpath("//paper-checkbox[@id='triggered']")).getAttribute("toggles aria-checked");
			if(checkboxOfIsSeeding.equalsIgnoreCase("false")&&checkboxIsTriggered.equalsIgnoreCase("false")) {
			jswait.loadClick(isSeedingCheckBox);
			jswait.loadClick(isTriggeredCheckBox);
			}
			else {
				System.out.println("is seeding and triggered checkbox is already true");
				}
		   jswait.loadClick(nextbtn);
			Thread.sleep(2000);
			jswait.loadClick(savebtn);
			jswait.loadClick(refreshReport);
			Thread.sleep(3000);
			ReportPageObjects ReportPageObject=new ReportPageObjects();
			String bcNameRewarding=bcName+"_RewardingBC";
			String bcNameMessaging=bcName+"_MessagingBC";
			ReportPageObject.filterbroadcast(bcName);
			if(bcType.equalsIgnoreCase("seeding")) {
			Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("//span[contains(.,'"+bcNameRewarding+"')]//following::span[contains(.,'Yes')]"))));
			Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("//span[contains(.,'"+bcNameRewarding+"')]//following::span[contains(.,'No')]"))));
			Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("(//span[contains(.,'"+bcNameMessaging+"')]//following::span[contains(.,'Yes')])[1]"))));
			Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("(//span[contains(.,'"+bcNameMessaging+"')]//following::span[contains(.,'Yes')])[2]"))));
			}
			else if(bcType.equalsIgnoreCase("trigger")) {
				Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("(//span[contains(.,'"+bcNameRewarding+"')]//following::span[contains(.,'Yes')])[1]"))));
				Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("(//span[contains(.,'"+bcNameRewarding+"')]//following::span[contains(.,'Yes')])[2]"))));
				Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("(//span[contains(.,'"+bcNameMessaging+"')]//following::span[contains(.,'Yes')])[1]"))));
				Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("(//span[contains(.,'"+bcNameMessaging+"')]//following::span[contains(.,'Yes')])[2]"))));	
			}
			else
				System.out.println("no verification in bc report given");
	
}	
		
		public void AddBlackoutPeriods() throws Exception{
			SimpleDateFormat df=new SimpleDateFormat("EEEE");
			Actions builder =new Actions(driver);
		Calendar rightNow = Calendar.getInstance();
			int hours = rightNow.get(Calendar.HOUR);
			int min = rightNow.get(Calendar.MINUTE);
			int am_pm = rightNow.get(Calendar.AM_PM);
//	        min +=2;
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
			 System.out.println("value of min :::::::::::::"+min);
			jswait.loadClick(blackoutRule);
			jswait.loadClick(addBlackoutPeriodbtn);
			Thread.sleep(2000);
			jswait.loadClick(blackoutstartDayInput);
			System.out.println(df.format(rightNow.getTime()));
			jswait.loadClick("(//paper-item[contains(.,'"+df.format(rightNow.getTime())+"')])[1]");
			jswait.loadClick(blackoutendDayInput);
			jswait.loadClick("(//paper-item[contains(.,'"+df.format(rightNow.getTime())+"')])[2]");
			Thread.sleep(2000);
            jswait.loadClick(startTimeInput);
            Thread.sleep(2000);
    		WebElement num = driver.findElement(By.xpath(
					"(.//*[@id='blackoutPeriodForm']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"])[1]"));
			Thread.sleep(2000);
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			WebElement num1 = driver.findElement(By.xpath(
					"(.//*[@id='blackoutPeriodForm']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+ (min+1) + "])[1]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("(//*[@id='blackoutPeriodForm']//*[@id='heading']/iron-selector[2]/div[1])[1]");
			
			else
				jswait.loadClick("(//*[@id='blackoutPeriodForm']//*[@id='heading']/iron-selector[2]/div[2])[1]");
			Thread.sleep(1000);
			jswait.loadClick(startTimeOKbtn);
			Thread.sleep(1000);
			jswait.loadClick(blackoutendTimeInput);
			 Thread.sleep(2000);
			 int min1 = rightNow.get(Calendar.MINUTE);
				int am_pm1 = rightNow.get(Calendar.AM_PM);
		        min1 +=5;
				int rem1 = min1 % 5;
				rem1 = 5 - rem1;
				min1 += rem1;
				if (min1 > 59) {
					min1 -= 60;
					hours++;
				}
				 if(min1==0)
					{
						min1+=5;
					}
				 System.out.println("value of min1 :::::::::::::"+min1);
			WebElement num2 = driver.findElement(By.xpath(
					"(.//*[@id='blackoutPeriodForm']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"])[2]"));
			Thread.sleep(2000);
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(2000);
			WebElement num3 = driver.findElement(By.xpath(
					"(.//*[@id='blackoutPeriodForm']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+ (min1+1) + "])[2]"));
			Thread.sleep(1000);
			builder.moveToElement(num3).click().build().perform();
			Thread.sleep(1000);
			if (am_pm1 == 0)
				jswait.loadClick("(//*[@id='blackoutPeriodForm']//*[@id='heading']/iron-selector[2]/div[1])[2]");
			
			else
				jswait.loadClick("(//*[@id='blackoutPeriodForm']//*[@id='heading']/iron-selector[2]/div[2])[2]");
			Thread.sleep(1000);
			jswait.loadClick(endTimeOKbtn);
			jswait.loadClick(blackoutendActionInput);
			jswait.loadClick(blackoutresumeManually);
			jswait.loadClick(blackoutexpiryDayInput);
			jswait.loadClick("(//paper-item[contains(.,'"+df.format(rightNow.getTime())+"')])[3]");
			 Thread.sleep(2000);
			jswait.loadClick(blackoutexpiryTimeInput);
			int min2 = rightNow.get(Calendar.MINUTE);
			int am_pm2 = rightNow.get(Calendar.AM_PM);
	        min2 +=10;
			int rem2 = min2 % 5;
			rem2 = 5 - rem2;
			min2 += rem2;
			if (min2 > 59) {
				min2 -= 60;
				hours++;
			}
			 if(min2==0)
				{
					min2+=5;
				}
			 System.out.println("value of min2 :::::::::::::"+min2);
			 Thread.sleep(2000);
			WebElement num4 = driver.findElement(By.xpath(
					"(.//*[@id='blackoutPeriodForm']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+ (hours+1) + "])[3]"));
			Thread.sleep(2000);
			builder.moveToElement(num4).click().build().perform();
			Thread.sleep(2000);
			WebElement num5 = driver.findElement(By.xpath(
					"(.//*[@id='blackoutPeriodForm']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+ (min2+1) + "])[3]"));
			Thread.sleep(1000);
			builder.moveToElement(num5).click().build().perform();
			Thread.sleep(1000);
			if (am_pm2 == 0)
				jswait.loadClick("(//*[@id='blackoutPeriodForm']//*[@id='heading']/iron-selector[2]/div[1])[3]");
			
			else
				jswait.loadClick("(//*[@id='blackoutPeriodForm']//*[@id='heading']/iron-selector[2]/div[2])[3]");
			Thread.sleep(1000);
			jswait.loadClick(blackoutExpiryOKbtn);
			Thread.sleep(2000);
			jswait.loadClick(saveBlackoutPeriod);
			
	}
		
		public void verifyofferDetailsInViewPage(String offerName) throws Exception {
			jswait.loadClick(ViewOfferDetails);
			Thread.sleep(2000);
			Assert.assertTrue(jswait.checkVisibility("//p[contains(.,'Offer Name')]//following::p[contains(.,'"+offerName+"')]"));
			
		}
		public void verifycopiedofferDetailsInViewPage(String offerName) throws Exception {
			jswait.loadClick(ViewOfferDetails);
			Thread.sleep(2000);
			offerName=offerName+"_Copy";
			Assert.assertTrue(jswait.checkVisibility("//p[contains(.,'Offer Name')]//following::p[contains(.,'"+offerName+"')]"));
			
		}
		public void addBambooRunBcToSheet(String bcSheet,String bcName,String bcType,String bcStorageSheet,int row) throws Exception{
			eh.setExcelFile("BambooBuildDetails", bcStorageSheet);
		    eh.setCell(row, 0, bcName);
	  	    eh.setCell(row, 1, bcType);
	  	    eh.setCell(row ,2, bcSheet);

		
		}
		
		public void verifyEventOfTheRecurringSeedingBC(String event,String bcName,String campaignName) throws Exception{
			bcName=bcName+"_MessagingBC";
			System.out.println(bcName);
			System.out.println("========"+event+" :is the event tht need to be verified");
			CustomerProfilePage CustomerProfilePage= new CustomerProfilePage();
			CustomerProfilePage.searchEventsDynammically("Last 3 Days");
			 Thread.sleep(4000);
			jswait.loadClick(selectAllEventCheckBox);
			jswait.loadClick(selectAllEventCheckBox);
			jswait.loadClick("(//div[contains(.,'"+event+"')][@id='checkboxLabel'])[1]");
			Thread.sleep(2000);
			 jswait.loadClick(applyEventFilter);
			 CustomerProfilePage.clickOnEventTabFilter();
			 CustomerProfilePage.enterEventDetails(campaignName);
			 CustomerProfilePage.filterResetFilterButton();
			 Thread.sleep(3000);
			  CustomerProfilePage.clickOnEventTabFilter();
			 CustomerProfilePage.enterEventDetails(campaignName);	 
			 CustomerProfilePage.filterApplyButton();
			 Thread.sleep(10000);
			 List<WebElement> ackEvents = driver.findElements(By.xpath("//iron-data-table//iron-list//div[@class='item style-scope iron-data-table']//data-table-row//data-table-cell[3]//span[contains(.,'"+event+"')]/../..//data-table-cell[4]//span[contains(.,'"+campaignName+"')]"));
				Thread.sleep(1000);
				System.out.println(ackEvents.size());
				 int count=1;
//				 System.out.println("print "+ackEvents);
				 System.out.println("before for loop");
				 for (int i=1;i<=ackEvents.size()+1;i++) {
						try {
							jswait.loadClick("(//iron-icon[@icon='app-icons:arrow-right'])["+i+"]");
							Thread.sleep(1000);
							
							boolean booln = jswait.checkVisibility(
									"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
							System.out.println(booln);
						
							if (booln == true) {
								System.out.println(event+"  verified");
								break;
							}
						
							else {
						System.out.println("inside else loop and value of i is ::::::::"+i);
				
			}
						}
							catch(Exception e) {
								Assert.assertTrue(false,"event not persisted");
							}
			}
		
	}
				
		
		
		
		
		public void verifyEventOfTheOneTimeSeedingBC(String event,String bcName,String campaignName) throws Exception{
			
			bcName=bcName+"_OneOff_MessagingBC";
			System.out.println("========"+event+" :is the event tht need to be verified");
			CustomerProfilePage CustomerProfilePage= new CustomerProfilePage();
			CustomerProfilePage.searchEventsDynammically("Last 3 Days");
			 Thread.sleep(4000);
			jswait.loadClick(selectAllEventCheckBox);
			jswait.loadClick(selectAllEventCheckBox);
			jswait.loadClick("(//div[contains(.,'"+event+"')][@id='checkboxLabel'])[1]");
			Thread.sleep(2000);
			 jswait.loadClick(applyEventFilter);
			 CustomerProfilePage.clickOnEventTabFilter();
			 CustomerProfilePage.enterEventDetails(campaignName);
			 CustomerProfilePage.filterResetFilterButton();
			 Thread.sleep(3000);
			  CustomerProfilePage.clickOnEventTabFilter();
			 CustomerProfilePage.enterEventDetails(campaignName);	 
			 CustomerProfilePage.filterApplyButton();
			 Thread.sleep(10000);
			 List<WebElement> ackEvents = driver.findElements(By.xpath("//iron-data-table//iron-list//div[@class='item style-scope iron-data-table']//data-table-row//data-table-cell[3]//span[contains(.,'"+event+"')]/../..//data-table-cell[4]//span[contains(.,'"+campaignName+"')]"));
				Thread.sleep(1000);
				System.out.println(ackEvents.size());
				 int count=1;
				 System.out.println("print "+ackEvents);
				 System.out.println("before for loop");
				 
				 for (int i=1;i<=ackEvents.size()+1;i++) {
						try {
							jswait.loadClick("(//iron-icon[@icon='app-icons:arrow-right'])["+i+"]");
							Thread.sleep(1000);
							
							boolean booln = jswait.checkVisibility(
									"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
							System.out.println(booln);
						
							if (booln == true) {
								System.out.println(event+"  verified");
								break;
							}
						
							else {
						System.out.println("inside else loop and value of i is ::::::::"+i);
				
			}
						}
							catch(Exception e) {
								Assert.assertTrue(false,"event not persisted");
							}
			}
		
	}
		
	public void BCOptionToClick(String optionToClick, String bcToView, String bctype) throws Exception {
		if(bcToView.equalsIgnoreCase("recurringchildbc")) {
			System.out.println("++++++++++++++++++++ to view is the recurring child bc thatis third column");
		jswait.loadClick(recurringChildOptionIcon);
		}
		else if(bcToView.equalsIgnoreCase("RecurringChildAt")||bcToView.equalsIgnoreCase("seedingonetime-messaging")) {
			System.out.println("++++++++++++++++++ bc to view is the second column ++++++++++++++++++++");
			jswait.loadClick(RecurringChildOptionIconAt);
		}
		else if(bcToView.equalsIgnoreCase("seedingRecurring-Rewarding")) {
		jswait.loadClick(seedingRecurrRewardingChildOptionIcon);
		}
		else if(bcToView.equalsIgnoreCase("seedingRecurring-Messaging")) {
		jswait.loadClick(seedingRecurrMessagingChildOptionIcon);
		}
		else if(bcToView.equalsIgnoreCase("onetime")||bcToView.equalsIgnoreCase("seedingonetime-rewarding")) {   
	    	System.out.println("+++++++++++++   the bc to view is the first column  ++++++++++++++++++++++++");
	        commonObjects.BCOptionIcon(bctype);
	    }
		jswait.loadClick("//paper-item[contains(.,'"+optionToClick+"')]");
	
}	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	public void configureFeedbackBC(String bcSheet,String bcType)	throws Exception{
		jswait.loadSendKeys(feedbackNameInput, "selenium_feedback");
		jswait.loadSendKeys(feedbackDescpInput, "bc feedback by selenium");
		jswait.loadClick(channelInput);
		jswait.loadClick(channelSMS);
		clickProceedButton();
		jswait.loadClick(feedbackCreativeLanguage);
		jswait.loadClick(feedbackLangEng);
	    jswait.loadSendKeys(feedbackTitleInput,"selenium_title");
		jswait.loadSendKeys(feedbackDetailsInput,"selenium_details");
		
	}
}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	







