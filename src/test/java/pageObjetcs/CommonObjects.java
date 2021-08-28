package pageObjetcs;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.TimeoutImpl;


public class CommonObjects extends Init {
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public ExcelHelper eh = new ExcelHelper();
	
	public ExcelHelper mainexcel = new ExcelHelper();

	public CommonObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@id='input'])[1]")
	private WebElement clickdomaintxt;
	@FindBy(xpath = "//paper-button[contains(.,'Save')]")
	private WebElement clicksavefordomain;
	@FindBy(xpath = "//paper-button[contains(.,'Edit')]")
	private WebElement Editdomainvalues;
	@FindBy(xpath = "//iron-image[@id='digital-plus']")
	private WebElement Digitalplusclick;
	@FindBy(xpath = "//iron-icon[@id='tag-manager']")
	private WebElement Tagmanagerclick;
	@FindBy(xpath = "//paper-button[@id='generate-key-button']")
	private WebElement Generateaccountkey;
	@FindBy(xpath = "//label[@id='key']")
	private WebElement AccountkeyTag;

	@FindBy(xpath = "//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	private WebElement filterIcon;
	@FindBy(xpath = "(//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..)[2]")
	private WebElement filterIcon2;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Name')]/..//input")
	private WebElement filterFormName;
	
	@FindBy(xpath = "//div[@val='broadcastTriggerableViews'][@class='style-scope broadcast-list iron-selected']//flytxt-grid-filter[@class='custom-filter style-scope broadcast-list x-scope flytxt-grid-filter-0']//iron-icon[@id='icon']")
	private WebElement TriggerableFilterIcon;
	@FindBy(xpath = "//div[@val='broadcastTriggerableViews']//form[@id='filterForm']//label[contains(.,'Name')]/..//input")
	private WebElement filterTriggerFormName;
	@FindBy(xpath = "//div[@val='broadcastTriggerableViews']/..//div[@class='style-scope broadcast-list iron-selected']//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Reset Filters')]")
	private WebElement resetTriggarableFilterForm;
	@FindBy(xpath = "//div[@val='broadcastTriggerableViews']/..//div[@class='style-scope broadcast-list iron-selected']//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Apply')]")
	private WebElement applyTriggarableFilterForm;
	@FindBy(xpath = "//div[@val='broadcastTriggerableViews']/..//div[@class='style-scope broadcast-list iron-selected']//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Cancel')]")
	private WebElement cancelTriggarableFilterForm;
	
	@FindBy(xpath = "//div[@val='broadcastRecurringViews'][@class='style-scope broadcast-list iron-selected']//flytxt-grid-filter[@class='custom-filter style-scope broadcast-list x-scope flytxt-grid-filter-0']//iron-icon[@id='icon']")
	private WebElement recurrinFilterIcon;
	@FindBy(xpath = "//div[@val='broadcastRecurringViews']/.//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Cancel')]")
	private WebElement cancelRecurringFilterForm;
	@FindBy(xpath = "//div[@val='broadcastRecurringViews']//form[@id='filterForm']//label[contains(.,'Name')]/..//input")
	private WebElement filterRecurringFormName;
	@FindBy(xpath = "//div[@val='broadcastRecurringViews']/.//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Apply')]")
	private WebElement applyRecurringFilterForm;
	@FindBy(xpath = "//div[@val='broadcastRecurringViews']/.//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Reset Filters')]")
	private WebElement resetRecurringFilterForm;
	

	@FindBy(xpath = "//div[@val='broadcastSeedingViews'][@class='style-scope broadcast-list iron-selected']//flytxt-grid-filter[@class='custom-filter style-scope broadcast-list x-scope flytxt-grid-filter-0']//iron-icon[@id='icon']")
	private WebElement seedingBCFilterIcon;
	@FindBy(xpath = "//div[@val='broadcastSeedingViews']/..//div[@class='style-scope broadcast-list iron-selected']//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Cancel')]")
	private WebElement cancelSeedingFilterForm;
	@FindBy(xpath = "//div[@val='broadcastSeedingViews']//form[@id='filterForm']//label[contains(.,'Name')]/..//input")
	private WebElement filetrSeedingFormName;
	@FindBy(xpath = "//div[@val='broadcastSeedingViews']/..//div[@class='style-scope broadcast-list iron-selected']//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Apply')]")
	private WebElement applySeedingFilterForm ;
	@FindBy(xpath = "//div[@val='broadcastSeedingViews']/..//div[@class='style-scope broadcast-list iron-selected']//paper-button[@class='style-scope flytxt-grid-filter x-scope paper-button-0'][contains(text(),'Reset Filters')]")
	private WebElement resetSeedingFilterForm;
	
	
	
	
	
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Status')]/..//input")
	private WebElement filterFormstatus;
	@FindBy(xpath = "(//*[@id='filterForm']//label[contains(.,'Name')]/..//input)[2]")
	private WebElement filterFormName2;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Partner')]/..//input")
	private WebElement filterFormPartner;
	@FindBy(xpath = "//*[@id='filterDialog']/div/paper-button[3]")
	private WebElement filterFormApply;
	@FindBy(xpath = "(//paper-button[contains(.,'Apply')])[2]")
	private WebElement filterFormApply2;
	@FindBy(xpath = "//*[@id='filterDialog']/div/paper-button[1]")
	private WebElement filterFormCancel;
	@FindBy(xpath = "//*[@id='filterDialog']/div/paper-button[2]")
	private WebElement filterFormReset;
	@FindBy(xpath = "//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsIcon;
	@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[2]")
	private WebElement optionsIcon2;
	
	@FindBy(xpath = "//div[@val='broadcastSeedingViews']//vaadin-grid[@id='broadcastSeedList']//vaadin-grid-table//vaadin-grid-table-body//vaadin-grid-table-row[1]//vaadin-grid-cell-content//paper-icon-button//iron-icon[@id='icon']")
	private WebElement seedingOptionsIcon;
	
	@FindBy(xpath = "//div[@val='broadcastTriggerableViews']//vaadin-grid[@id='broadcastTriggerList']//vaadin-grid-table//vaadin-grid-table-body//vaadin-grid-table-row[1]//vaadin-grid-cell-content//paper-icon-button//iron-icon[@id='icon']")
	private WebElement triggerOptionsIcon;
	
	@FindBy(xpath = "//div[@val='broadcastRecurringViews']//vaadin-grid[@id='broadcastRecurList']//vaadin-grid-table//vaadin-grid-table-body//vaadin-grid-table-row[1]//vaadin-grid-cell-content//paper-icon-button//iron-icon[@id='icon']")
	private WebElement recurringOptionsIcon;
	
	@FindBy(xpath = "//*[@d='M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z']/../../..")
	private WebElement plusIcon;
	@FindBy(xpath = "//paper-button[contains(text(),'Yes')]")
	private WebElement paperButtonYes;
	@FindBy(xpath = "//paper-button[contains(text(),'OK')]")
	private WebElement paperButtonOk;
	@FindBy(xpath = "//paper-item[contains(.,'Edit')]")
	private WebElement optionsEdit;
	@FindBy(xpath = "(//paper-item[contains(.,'Edit')])[1]")
	private WebElement optionsEdit2;
	@FindBy(xpath = "//paper-item[contains(.,'Archive')]")
	private WebElement optionsArchive;
	@FindBy(xpath = "//paper-item[contains(.,'Duplicate')]")
	private WebElement optionsDuplicate;
	@FindBy(xpath = "//paper-item[contains(.,'Copy')]")
	private WebElement optionsCopy;
	@FindBy(xpath = "//paper-item[contains(.,'Pause')]")
	private WebElement optionsPause;
	@FindBy(xpath = "//paper-item[contains(.,'Delete')]")
	private WebElement optionsDelete;
	@FindBy(xpath = "//paper-icon-item[contains(.,'Edit')]")
	private WebElement targetConditionOptionsEdit;
	@FindBy(xpath = "//paper-icon-item[contains(.,'Delete')]")
	private WebElement targetConditionOptionsDelete;
	@FindBy(xpath = "//paper-item[contains(.,'Deactivate')]")
	private WebElement optionsDeactivate;
	@FindBy(xpath = "//paper-item[contains(.,'Activate')]")
	private WebElement optionsActivate;
	@FindBy(xpath = "//*[@src='http://192.168.150.27/images/Flip1.svg']")
	private WebElement targetConditionViewToggle;
	@FindBy(xpath = "//paper-button[contains(.,'Activate')]")
	private WebElement ActivateBCButton;
	@FindBy(xpath="//paper-button[text()='Create']")
	private WebElement createNewCustomerLocationInsightButton;
	@FindBy(xpath="//paper-button[text()='Create']")
	private WebElement createNewUsageMetricButton;
	
	@FindBy(xpath = "//*[@id='sym2']")
	private WebElement offers;
	@FindBy(xpath = ".//*[@id='items']/div[1]")
	private WebElement gridFirstItem;
	@FindBy(xpath = "//paper-item[contains(.,'Attributes')]")
	private WebElement attributeIcon;
	@FindBy(xpath = "//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsAttributeIcon;
	@FindBy(xpath = "//paper-item[contains(.,'Delete')]")
	private WebElement AttributeDelete;
	@FindBy(xpath = ".//*[@id='addProductDialog']/add-product/..//*[ contains(text(), 'Cancel')]")
	private WebElement CancelButton;
	@FindBy(xpath = "//paper-button[contains(.,'Create')]")
	private WebElement createBCButton;
	@FindBy(xpath = ".//*[@id='confirmBox']//paper-button[contains(.,'Yes')]")
	private WebElement YesBCButton;

	@FindBy(xpath = "//img[contains(@src,'/images/help.svg')]/..")
	private WebElement helpIcon;

	@FindBy(xpath = "//*[@d='M14.59 8L12 10.59 9.41 8 8 9.41 10.59 12 8 14.59 9.41 16 12 13.41 14.59 16 16 14.59 13.41 12 16 9.41 14.59 8zM12 2C6.47 2 2 6.47 2 12s4.47 10 10 10 10-4.47 10-10S17.53 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z']/../../..")
	private WebElement contextHelpCloseIcon;
	 @FindBy(xpath="//div[@id='toggleButton']")
	 private WebElement autoRefreshButton;
	 @FindBy(xpath=".//*[@id='createNew']//label[text()='Name']/../input")
		private WebElement customerLocationInsightNameField;
	 @FindBy(xpath=".//*[@id='createNew']//label[text()='Description']/..//textarea")
		private WebElement registrationListDescription;
	 
	 @FindBy(xpath="//label[contains(.,'Default Targeting Option')]/../input")
		private WebElement defaultTargetingOption;
	 
	 @FindBy(xpath="//paper-item[contains(.,'By Week')]")
		private WebElement byWeekOption;
	 
	 @FindBy(xpath=".//*[@id='createNew']//label[text()='Context Type']/..//input")
		private WebElement customerLocationInsightContextTypeSelector;
	 @FindBy(xpath=".//*[@id='createNew']//paper-item[text()='Normal']")
		private WebElement customerLocationInsightContextType;
	 
	 
	 @FindBy(xpath=".//*[@id='createNew']//label[text()='Type']/..//input")
		private WebElement customerLocationInsightTypeSelector;
	 @FindBy(xpath=".//*[@id='createNew']//paper-item[text()='Date']")
		private WebElement customerLocationInsightType;
	 
	 @FindBy(xpath=".//paper-button[contains(.,'Save')]")
		private WebElement customerLocationInsighSaveButton;
	 
//	 ================================ digital plus =============================
	 @FindBy(xpath="//label[contains(.,'Connectors')]")
		private WebElement connectors;
	 @FindBy(xpath="//div[contains(.,'Channel Connector')][@class='subHeading admin-tracking style-scope ndx-connectors']")
		private WebElement channelConnector;
	 @FindBy(xpath="//iron-icon[@id='sym2']")
		private WebElement httpConnector ;
	 @FindBy(xpath="//paper-button[contains(text(),'Create New Connector')]")
		private WebElement createNewConnector;
	 @FindBy(xpath="//a[contains(@href,'new')]")
		private WebElement WebhookNewURL;
	 @FindBy(xpath="//button[@type='button'][@ga-event-action='click-editurl']")
		private WebElement createnewUrl;
	 @FindBy(xpath="//label[contains(.,'Content Type')][@for='default_content_type']//following::input[1]")
		private WebElement contentTypeInput;
	 @FindBy(xpath="//label[contains(.,'Content ')][@for='default_content']//following::textarea[1]")
		private WebElement contentresponseInput;
	 @FindBy(xpath="//button[contains(.,'Create')][@ga-event-category='Request']")
		private WebElement createUrlbtn;
	 @FindBy(xpath="//code[contains(.,'https://webhook.site/')]")
		private WebElement url ;
	 @FindBy(xpath="//label[contains(.,'Name')]//following::input[1]")
		private WebElement httpNameInput;
	 @FindBy(xpath="//label[contains(.,'Name')]//following::textarea[1]")
		private WebElement httpdescpInput;
	 @FindBy(xpath="//label[contains(.,'URL')]//following::input[1]")
		private WebElement urlInput;
	 @FindBy(xpath="//paper-button[contains(.,'Proceed')]")
		private WebElement Proceedbtn;
	 @FindBy(xpath="//paper-textarea[@id='connectorData']")
		private WebElement requestDataInput;
	 @FindBy(xpath="//label[contains(.,'Result XPATH')]//following::input[1]")
		private WebElement successXpath ;
	 @FindBy(xpath="//label[contains(.,'Result XPATH')]//following::input[2]")
		private WebElement successString;
	 @FindBy(xpath="//label[contains(.,'Result XPATH')]//following::input[3]")
		private WebElement resultCodeXpath;
	 @FindBy(xpath="//label[contains(.,'Result XPATH')]//following::input[4]")
		private WebElement descpXpath;
	 @FindBy(xpath="(//paper-button[contains(.,'Save')])[3]")
		private WebElement ConnectorSavebtn;
	 @FindBy(xpath="(//label[contains(.,'Response Regex')])[1]//following::input[1]")
		private WebElement responseRegexInput;
	 @FindBy(xpath="//label[contains(.,'Response Regex Test')]//following::input[1]")
		private WebElement responseRegexTestInput;
	 @FindBy(xpath="//label[contains(.,'Response Regex Position')]//following::input[1]")
		private WebElement responseRegexPositionInput;
	 @FindBy(xpath="//div[contains(.,'JSON')][@id='radioLabel']")
		private WebElement jsonRadiobtn;
	 @FindBy(xpath="//div[contains(.,'Query String')][@id='radioLabel']")
		private WebElement queryStringRadiobtn;
     @FindBy(xpath="//p[contains(.,'Request Data')]//following::input[1]")
		private WebElement queryStringNameInput;
	 @FindBy(xpath="//p[contains(.,'Request Data')]//following::textarea[1]")
		private WebElement queryStringValueInput;
	 @FindBy(xpath="//p[contains(.,'Request Data')]//following::textarea[2]")
		private WebElement queryStringValueInput1;
	   @FindBy(xpath="//p[contains(.,'Request Data')]//following::input[2]")
			private WebElement queryStringNameInput1;
	 @FindBy(xpath="//p[contains(.,'Request Data')]//following::paper-icon-button[@title='Configure Dynamic Variables']")
		private WebElement httpDynamicVariable;
	 @FindBy(xpath="//p[contains(.,'Request Data')]//following::paper-icon-button[@title='Configure Dynamic Variables'][2]")
		private WebElement httpDynamicVariable1;
	 @FindBy(xpath="//h3[contains(.,'Add Parameter ')]//following::input[1]")
		private WebElement parameterNameInput;
	 @FindBy(xpath="//label[contains(.,'Parameter')]//following::input[1]")
		private WebElement  parameterInput;
	 @FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer Address')]")
		private WebElement customerAddressParameter ;
	 @FindBy(xpath="//paper-button[contains(.,'OK')]")
		private WebElement ParameterOKBtn;
	 @FindBy(xpath="//input[@id='email']")
		private WebElement webhookEmail;
	 @FindBy(xpath="//input[@id='password']")
		private WebElement webhookPassword;
	 @FindBy(xpath="//button[@type='submit']")
		private WebElement webhookLoginbtn;
	 @FindBy(xpath="(//a[@href='/control-panel'])[1]")
		private WebElement controlPanelbtn;
	 @FindBy(xpath="//p[contains(.,'Request Data')]//following::paper-icon-button[@title='Add Header']")
		private WebElement addRequestHeader;
	 @FindBy(xpath="//p[contains(.,'Request Data')]//following::textarea")
		private WebElement jsonRequestDataInput;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
//	 @FindBy(xpath="")
//		private WebElement ;
	//==============================License Generator UI=======================================// 
		@FindBy(xpath=".//*[@id='username']")
		private WebElement liceneseGeneratorUsernameinput;
		@FindBy(xpath=".//*[@id='password']")
		private WebElement liceneseGeneratorPasswordinput;
		@FindBy(xpath=".//*[@id='login']")
		private WebElement liceneseGeneratorLoginbtn;
		@FindBy(xpath="/html//input[@id='organization']")
		private WebElement liceneseGeneratorOrganizationInput;
		@FindBy(xpath="/html//input[@id='productId']")
		private WebElement licenseProductIdInput;
		@FindBy(xpath="/html//select[@id='versionSelect']")
		private WebElement versionselectdropdown;
		
		//-----------Applications------------//
		@FindBy(xpath="//div[@id='Applications']/div[contains(.,'Precision Marketer')]/input[@name='licensedFeatures']")
		private WebElement enablePrecisionMarketer;
		@FindBy(xpath="//div[@id='Applications']/div[contains(.,'Intent Management')]/input[@name='licensedFeatures']")
		private WebElement enableIntentManagement;
		@FindBy(xpath="//div[@id='Applications']/div[contains(.,'Insights Workbench')]/input[@name='licensedFeatures']")
		private WebElement enableInsightsWorkbench;
		
		//-----------Packaged models------------//
		@FindBy(xpath="//div[@id='Packaged_Models']/div[contains(.,'Churn Propensity')]/input[@name='licensedFeatures']")
		private WebElement enableChurnPropensity;
		@FindBy(xpath="//div[@id='Packaged_Models']/div[contains(.,'Multiview Clustering')]/input[@name='licensedFeatures']")
		private WebElement enableMultiviewClustering;
		@FindBy(xpath="//div[@id='Packaged_Models']/div[contains(.,'Adaptive Cognizance')]/input[@name='licensedFeatures']")
		private WebElement enableAdaptiveCognizance;
		@FindBy(xpath="//div[@id='Packaged_Models']/div[contains(.,'Trend Analysis')]/input[@name='licensedFeatures']")
		private WebElement enableTrendAnalysis;
		
		//-----------Miscellaneous------------//
		@FindBy(xpath="//div[@id='Miscellaneous']/div[contains(.,'Impact Estimation (Zain)')]/input[@name='licensedFeatures']")
		private WebElement enableImpactEstimation;
		@FindBy(xpath="//div[@id='Miscellaneous']/div[contains(.,'Customer Data Extraction (Zain)')]/input[@name='licensedFeatures']")
		private WebElement enableCustomerDataExtraction;
		@FindBy(xpath="//div[@id='Miscellaneous']/div[contains(.,'Target Inheritance (Zain)')]/input[@name='licensedFeatures']")
		private WebElement enableTargetInheritance;
		
		//-----------FB&AI------------//
		@FindBy(xpath="//div[@id='Digital_Plus']//input[@name='licensedFeatures']")
		private WebElement enableFacebook;
		
		@FindBy(xpath="//div[@id='AI']/div[contains(.,'Robo X')]/input[@name='licensedFeatures']")
		private WebElement enableRoboX;
		
		
		@FindBy(xpath="/html//button[@id='generateLicense']")
		private WebElement generateLicensebtn;
		@FindBy(xpath="/html//button[@id='copyToClipboard']")
		private WebElement copyToClipboardbtn;
	
		@FindBy(xpath="//paper-icon-button[@id='copyBtn']")
		private WebElement managelicenseproductidcopybtn;
		@FindBy(xpath=".//*[@id='upgradeBtn']")
		private WebElement managelicenselicenseupgradebtn;
		@FindBy(xpath="//label[contains(.,'License Key')]//following::textarea")
		private WebElement managelicenseTextarea;
		@FindBy(xpath="//label[text()='Reports']/..")
		private WebElement reports;
		@FindBy(xpath="(//div[@id='toggleButton'])[1]")
		 private WebElement autoRefreshButtononetime;
		@FindBy(xpath="(//div[@id='toggleButton'])[2]")
		 private WebElement autoRefreshButtonTrigger;
		@FindBy(xpath="(//div[@id='toggleButton'])[3]")
		 private WebElement autoRefreshButtonRecurr;
		@FindBy(xpath="(//div[@id='toggleButton'])[4]")
		 private WebElement autoRefreshButtonSeeding;
		@FindBy(xpath="(//hexagon-content//following::div[contains(.,'Streaming Attributes')])[1]")
		private WebElement streamigAttr;
		@FindBy(xpath="//paper-button[contains(.,'Create')]")
		private WebElement streamingAttrCreatebtn;
		@FindBy(xpath="//label[contains(.,'Name')]//following::input[1]")
		private WebElement streamingAttrName ;
		@FindBy(xpath="//label[contains(.,'Description')]//following::textarea")
		private WebElement streamingAttrDesp ;
		@FindBy(xpath="//label[contains(.,'Source')]//following::input[1]")
		private WebElement streamingAttrSourceInput;
		@FindBy(xpath="//label[contains(.,'Data Type')]//following::input[1]")
		private WebElement streamingAttrDataTypeInput ;
		@FindBy(xpath="//label[contains(.,'Label for Value 1')]//following::input[1]")
		private WebElement streamingAttrValue1 ;
		@FindBy(xpath="//label[contains(.,'Label for Value 2')]//following::input[1]")
		private WebElement streamingAttrValue2;
		@FindBy(xpath="//paper-item[contains(.,'Data Connector')]")
		private WebElement sourceDataConnector;
		@FindBy(xpath="//paper-item[contains(.,'API')]")
		private WebElement sourceAPIConnector;
		@FindBy(xpath="//paper-item[contains(.,'DOUBLE')]")
		private WebElement dataTypeDouble;
		@FindBy(xpath="//paper-button[contains(.,'Save')]")
		private WebElement streamingAttrSave;
		
		@FindBy(xpath="//p[contains(text(),'Trigger Management')]/../..")
		private WebElement trigger;
		@FindBy(xpath="//paper-button[contains(.,'Create New Trigger')]")
		private WebElement createNewTriggerbtn ;
		@FindBy(xpath="(//h3[contains(.,'Create New Trigger')]//following::label[contains(.,'Name')]//following::input)[1]")
		private WebElement triggerNameInput;
		@FindBy(xpath="//label[contains(.,'Description')]//following::textarea")
		private WebElement triggerDespInput;
		@FindBy(xpath="//div[contains(.,'Streaming Attribute')][@id='radioLabel']")
		private WebElement streamingAttrRadiobtn;
		
		@FindBy(xpath="//label[contains(.,'Select Streaming Attribute')]//following::input[1]")
		private WebElement streamingAttrSelectInput;
		@FindBy(xpath="//label[contains(.,'Variable')]//following::input[1]")
		private WebElement streamingAttrVariable;
		
	   @FindBy(xpath="//label[contains(.,'Trigger Condition')]//following::input[1]")
		private WebElement triggerConditionInput ;
	   
		@FindBy(xpath="//label[contains(.,'Value')]//following::input[1]")
		private WebElement valueInput;
		
		@FindBy(xpath="//label[contains(.,'Value')]//following::iron-icon[@id='icon'][1]")
		private WebElement addStreaminAttrValue ;
		
		@FindBy(xpath="(//label[contains(.,'Variable')]//following::input[1])[2]")
		private WebElement streamingAttrVariable2;
		
	   @FindBy(xpath="(//label[contains(.,'Trigger Condition')]//following::input[1])[2]")
	   private WebElement triggerConditionInput2;
	   @FindBy(xpath="(//label[contains(.,'Value')]//following::input[1])[2]")
	   private WebElement valueInput2;
	   @FindBy(xpath="(//paper-button[contains(.,'Save')])[1]")
	   private WebElement triggerSavebtn;
	   @FindBy(xpath="(//vaadin-combo-box-item[contains(.,'equal to')])[1]")
	   private WebElement equalTo;
	   @FindBy(xpath="(//vaadin-combo-box-item[contains(.,'greater than or equal to')])[2]")
	   private WebElement greaterThanOrEqualTo;
	   @FindBy(xpath="(//label[contains(.,'Admin')])[1]")
	   private WebElement admin;
	   @FindBy(xpath="//label[contains(.,'Fulfillment Configuration')]")
	   private WebElement fulfillmentConfig;
	   @FindBy(xpath="//div[contains(.,'Tracking Data Sources')][@class='subHeading admin-tracking style-scope fulfilment-configuration']")
       private WebElement trackingDataSource ;
	   @FindBy(xpath="//paper-button[contains(.,'Create New Tracking Data Source')]")
       private WebElement trackingSourcebtn;
	   @FindBy(xpath="(//h3[contains(.,'Create Tracking Data Source')]//following::label[contains(.,'Name')]//following::input[1])[1]")
       private WebElement trackingSourceNameInput ;
	   @FindBy(xpath="(//h3[contains(.,'Create Tracking Data Source')]//following::label[contains(.,'Type')]//following::input)[1]")
       private WebElement trackingSourceTypeInput;
	   @FindBy(xpath="//paper-item[contains(.,'Conversion And Response')][@value='BOTH']")
       private WebElement conversionAndResponse ;
       @FindBy(xpath="//label[contains(.,'Column Name')]//following::input[1]")
	   private WebElement fieldAmount;
	   @FindBy(xpath="//label[contains(.,'Data Type')]//following::input[1]")
	   private WebElement selectDataType;
		@FindBy(xpath="//paper-item[contains(.,'Number')]")
		private WebElement numberAsDataType ;
		@FindBy(xpath="//paper-icon-button[@icon='last-page']")
		private WebElement selectAllPartner;
		@FindBy(xpath="//paper-button[contains(.,'Save')]")
        private WebElement saveTrackingSource;
		   @FindBy(xpath="//div[contains(.,'Blackout Rules')][@class='subHeading admin-blackoutRule style-scope admin-panel']")
			private WebElement blackoutRules;
			@FindBy(xpath="//iron-image[@id='digital-plus']")
			private WebElement digitalPlus;
		   @FindBy(xpath="//label[contains(.,'Route')]//following::iron-icon[1]")
			private WebElement routeInput;
			@FindBy(xpath="//label[contains(.,'Field Name')]//following::input[1]")
			private WebElement fieldNameInput;
		   @FindBy(xpath="//label[contains(.,'Field Type')]//following::input[1]")
			private WebElement fieldTypeInput;
			@FindBy(xpath="//vaadin-combo-box-item[contains(.,'NUMBER')]")
			private WebElement fieldTypeNumber;
		   @FindBy(xpath="//label[contains(.,'Is Mandatory')]//following::input[1]")
			private WebElement isMandatory;
			@FindBy(xpath="//vaadin-combo-box-item[contains(.,'YES')]")
			private WebElement isMandatoryYES;
//		   @FindBy(xpath="")
//			private WebElement ;
//			@FindBy(xpath="")
//			private WebElement ;
		
		
		
		
public void clickOnReports() throws Exception {
	jswait.loadClick(reports);
}
	 
	 public void clickCreateNewCustomerLocationInsight() throws Throwable {
		 
		 jswait.loadClick(createNewCustomerLocationInsightButton);
	 }
	 
public void clickActivateOption() throws Throwable {
		 
		 jswait.loadClick(optionsActivate);
	 }
	 
 public void clickCreateNewUsageMetric() throws Throwable {
		 
		 jswait.loadClick(createNewUsageMetricButton);
	 }
	 
	 
 public void enterNewCustomerLocationInsightDetails(String name,String desc) throws Throwable {
		 
	    enterCustomerLocationInsightName(name);
	    enterCustomerLocationInsightDescription(desc);
	    selectCustomerLocationInsightContextType();
	    selectCustomerLocationInsightType();
	    clickSaveCustomerLocationInsighButton();
		
	 }
 
 
 public void enterNewUsageMetricDetails(String name,String desc) throws Throwable {
	 
	    enterCustomerLocationInsightName(name);
	    enterCustomerLocationInsightDescription(desc);
	    jswait.loadClick(defaultTargetingOption);
	    jswait.loadClick(byWeekOption);
	    clickSaveCustomerLocationInsighButton();
		
	 }
 
 
 public void enterCustomerLocationInsightName(String name) throws InterruptedException {
		jswait.loadSendKeys(customerLocationInsightNameField, name);
	}
 
 public void enterCustomerLocationInsightDescription(String desc) throws InterruptedException {
		jswait.loadSendKeys(registrationListDescription, desc);
	}
 
 public void selectCustomerLocationInsightContextType() throws InterruptedException {
		jswait.loadClick(customerLocationInsightContextTypeSelector);
		jswait.loadClick(customerLocationInsightContextType);
	}
 
 public void selectCustomerLocationInsightType() throws InterruptedException {
		jswait.loadClick(customerLocationInsightTypeSelector);
		jswait.loadClick(customerLocationInsightType);
	}
 
 public void clickSaveCustomerLocationInsighButton() throws InterruptedException {
		jswait.loadClick(customerLocationInsighSaveButton);
	}

	public void clickFilterIcon() throws InterruptedException {
		jswait.loadClick(filterIcon);
	}
	
	public void clickTrggerableFilterIcon() throws InterruptedException {
		jswait.loadClick(TriggerableFilterIcon);
	}
	
	public void clickRecurringFilterIcon() throws InterruptedException {
		jswait.loadClick(recurrinFilterIcon);
	}
	
	public void clickSeedingFilterIcon() throws InterruptedException {
		jswait.loadClick(seedingBCFilterIcon);
	}
	
	
	
	
	
	public void clickFilterIcon2() throws InterruptedException {
		jswait.loadClick(filterIcon2);
	}


	public void clickHelpIcon() throws InterruptedException {
		jswait.loadClick(helpIcon);
	}

	public void clickContextHelpCloseIcon() throws InterruptedException {
		jswait.loadClick(contextHelpCloseIcon);
	}

	public void clickTargetConditionViewToggleIcon() throws InterruptedException {
		jswait.loadClick(targetConditionViewToggle);
	}

	public void clickEditOption() throws InterruptedException {
		jswait.loadClick(optionsEdit);
	}
	public void clickEditOption2() throws InterruptedException {
		jswait.loadClick(optionsEdit2);
	}
	public void clickArchiveOption() throws InterruptedException {
		jswait.loadClick(optionsArchive); 
	}

	public void clickDuplicateOption() throws InterruptedException {
		jswait.loadClick(optionsDuplicate);
	}
	
	public void clickCopyOption() throws InterruptedException {
		jswait.loadClick(optionsCopy);
	}

	public void clickYesBCButton() throws InterruptedException {
		jswait.loadClick(YesBCButton);
	}

	public void clickPauseOption() throws InterruptedException {
		jswait.loadClick(optionsPause);
	}

	public void clickFirstItemInGrid() throws InterruptedException {
		jswait.loadClick(gridFirstItem);
	}

	public void clickDeleteOption() throws InterruptedException {
		jswait.loadClick(optionsDelete);
	}

	public void clickActivateBCButton() throws InterruptedException {
		jswait.loadClick(ActivateBCButton);
	}

	public void clickTargetConditionOptionEdit() throws InterruptedException {
		jswait.loadClick(targetConditionOptionsEdit);
	}

	public void clickTargetConditionOptionDelete() throws InterruptedException {
		jswait.loadClick(targetConditionOptionsDelete);
	}

	public void clickAttributeIcon() throws InterruptedException {
		jswait.loadClick(attributeIcon);
	}

	public void clickcreateBCButton() throws InterruptedException {
		jswait.loadClick(createBCButton);
	}

	public void navigateToOffers() throws InterruptedException {
		jswait.loadClick(offers);
	}

	public void clickAttributeDeleteIcon() throws InterruptedException {
		jswait.loadClick(AttributeDelete);
	}

	public void clickAttributeoptionIcon() throws InterruptedException {
		jswait.loadClick(optionsAttributeIcon);
	}

	public void clickOptionsIcon() throws InterruptedException {
		jswait.loadClick(optionsIcon);
	}
	public void clickEditIcon() throws InterruptedException {
		jswait.loadClick("(//paper-item[@class='predefined-targets style-scope x-scope paper-item-1'][contains(text(),Edit)])[1]");
	}
	public void clickOptionsIcon2() throws InterruptedException {
		jswait.loadClick(optionsIcon2);
	}


	public void clickPlusIcon() throws InterruptedException {
		jswait.loadClick(plusIcon);
	}
	
	public void verifyInGrid(String text) throws Exception {
		jswait.waitUntil("//data-table-cell[contains(.,'"+text+"')]");
	}

	public void clickDeactivateProductButton() throws InterruptedException {
		jswait.loadClick(optionsDeactivate);
	}

	public void clickFilterApplyButton() throws InterruptedException {
		jswait.loadClick(filterFormApply);
	}
	
	public void clickFilterApplyButton2() throws InterruptedException {
		jswait.loadClick(filterFormApply2);
	}

	public void enterFilterstatus(String name) throws InterruptedException {
		jswait.loadSendKeys(filterFormstatus, name);
	}
	
	public void enterFilterFormname(String name) throws InterruptedException {
		jswait.loadSendKeys(filterFormName, name);
	}
	
	public void enterTriggarableFilterFormname(String name) throws InterruptedException {
		jswait.loadSendKeys(filterTriggerFormName, name);
	}
	
	public void enterRecurringFilterFormname(String name) throws InterruptedException {
		jswait.loadSendKeys(filterRecurringFormName, name);
	}
	
	public void enterSeedingFilterFormname(String name) throws InterruptedException {
		jswait.loadSendKeys(filetrSeedingFormName, name);
	}
	
	public void enterFilterFormname2(String name) throws InterruptedException {
		jswait.loadSendKeys(filterFormName2, name);
	}
	
	public void enterFilterFormPartner(String name) throws InterruptedException {
		jswait.loadSendKeys(filterFormPartner, name);
	}

	public void clickFilterCancelButton() throws InterruptedException {
		jswait.loadClick(filterFormCancel);
	}

	public void clickConfirmYesButton() throws InterruptedException {
		jswait.loadClick(paperButtonYes);
	}
	
	public void clickConfirmOkButton() throws InterruptedException {
		jswait.loadClick(paperButtonOk);
	}

	public void clickFilterResetButton() throws InterruptedException {
		jswait.loadClick(filterFormReset);
	}
	
	public void clickTriggarableFilterResetButton() throws InterruptedException {
		jswait.loadClick(resetTriggarableFilterForm);
	}

	
	public void clickRecurringFilterResetButton() throws InterruptedException {
		jswait.loadClick(resetRecurringFilterForm);
	}

	
	public void clickSeedingFilterResetButton() throws InterruptedException {
		jswait.loadClick(resetSeedingFilterForm);
	}

	public void clickTriggarableFilterApplyButton() throws InterruptedException {
		jswait.loadClick(applyTriggarableFilterForm);
	}
	
	public void clickRecurringFilterApplyButton() throws InterruptedException {
		jswait.loadClick(applyRecurringFilterForm);
	}
	
	public void clickSeedingFilterApplyButton() throws InterruptedException {
		jswait.loadClick(applySeedingFilterForm);
	}

	public void filterName(String name) throws InterruptedException {
		Thread.sleep(10000);
		Thread.sleep(10000);
		//Thread.sleep(10000);
		clickFilterIcon();
		Thread.sleep(2000);
		enterFilterFormname(name);
		Thread.sleep(2000);
		clickFilterResetButton();
		clickFilterIcon();
		Thread.sleep(2000);
		enterFilterFormname(name);
		clickFilterApplyButton();
	}
	
	public void deactivateBI(String name) throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick("(//paper-icon-button[@icon='icons:more-vert']/iron-icon[@id='icon'])[1]");
		jswait.loadClick("//paper-item[contains(.,'Deactivate')]");
		jswait.loadClick("//paper-button[contains(.,'Yes')]");
		Thread.sleep(2000);
	}
	
	public void filterBCName(String sheetname, String name) throws InterruptedException {
		Thread.sleep(10000);
		Thread.sleep(10000);
		//Thread.sleep(10000);
		if(sheetname.contains("one-offBC")||sheetname.contains("TriggerOneoff")) {
		clickFilterIcon();
		Thread.sleep(2000);
		enterFilterFormname(name);
		Thread.sleep(2000);
		clickFilterResetButton();
		clickFilterIcon();
		enterFilterFormname(name);
		clickFilterApplyButton();
		}else if(sheetname.contains("seeding")){
			clickSeedingFilterIcon();
				Thread.sleep(2000);
				enterSeedingFilterFormname(name);
				Thread.sleep(2000);
				clickSeedingFilterResetButton();
				clickSeedingFilterIcon();
				enterSeedingFilterFormname(name);
				clickSeedingFilterApplyButton();
		}else if(sheetname.contains("TriggerReccurringBC")) {
			clickTrggerableFilterIcon();
			Thread.sleep(2000);
			enterTriggarableFilterFormname(name);
			Thread.sleep(2000);	
			clickTriggarableFilterResetButton();
			clickTrggerableFilterIcon();
			enterTriggarableFilterFormname(name);
			clickTriggarableFilterApplyButton();					
		}else if(sheetname.contentEquals("recurringBC")||sheetname.contentEquals("recurrBCDaily")||sheetname.contentEquals("recurringBCEdit")||sheetname.contentEquals("recurringBCForAbort")||sheetname.contentEquals("recurringBCForPause")) {
			clickRecurringFilterIcon();
			Thread.sleep(2000);
			enterRecurringFilterFormname(name);
			Thread.sleep(2000);
			clickRecurringFilterResetButton();
			clickRecurringFilterIcon();
			enterRecurringFilterFormname(name);
			clickRecurringFilterApplyButton();
			
		}
		
		
		
	}
	
	
	public void clickBCOptionsIcon(String sheet) throws InterruptedException {
		if(sheet.contains("one-offBC")||sheet.contains("TriggerOneoff")) {
			jswait.loadClick(optionsIcon);
		}else if(sheet.contains("seeding")) {
			jswait.loadClick(seedingOptionsIcon);			
		}else if(sheet.contains("TriggerReccurringBC")) {
			jswait.loadClick(triggerOptionsIcon);
		}else if(sheet.contentEquals("recurringBC")||sheet.contentEquals("recurrBCDaily")||sheet.contentEquals("recurringBCEdit")||sheet.contentEquals("recurringBCForAbort")||sheet.contentEquals("recurringBCForPause")) {
			jswait.loadClick(recurringOptionsIcon);
		}
		
	}
	
	public void filterWorkaround(String name) throws InterruptedException {
		clickFilterIcon();                            //issue in filter
		clickFilterResetButton();						//issue in filter
		filterName(name);
	}
	
	
	public void filterStatus(String name) throws InterruptedException {
		clickFilterIcon();
		Thread.sleep(2000);
		jswait.loadClick(".//label[contains(.,'Status')]//following::iron-icon[1]");
		Thread.sleep(3000);
		jswait.loadClick(".//paper-item[contains(.,'"+name+"')]");
		Thread.sleep(2000);
		jswait.loadClick(filterFormName);
		Thread.sleep(2000);
		clickFilterApplyButton();
	}
	
	
	public void filterNameEnv(String name) throws InterruptedException {
		clickFilterIcon2();
		
		enterFilterFormname2(name);
		clickFilterApplyButton2();
	}
	public void filterPartner(String name) throws InterruptedException {
		clickFilterIcon();
		enterFilterFormPartner(name);
		clickFilterApplyButton();
	}

	public void clickCancelButton() throws InterruptedException {
		jswait.loadClick(CancelButton);
	}
	
	public void toggleAutoRefresh() throws InterruptedException {
		jswait.loadClick(autoRefreshButton);
	}

	public void clickEditProductButton() throws InterruptedException {
		jswait.loadClick(optionsEdit);
	}

	public String getTextFromFilterForm() throws InterruptedException, UnsupportedFlavorException, IOException {
		String text = "";
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection stringSelection = new StringSelection("checkText");
		clipboard.setContents(stringSelection, null);
		driver.findElement(
				By.xpath("//*[@id='filterForm']/paper-input[1]/paper-input-container/div[1]/../div[2]/div[1]/input[1]"))
				.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='filterForm']/paper-input[1]/paper-input-container/div[1]/../div[2]/div[1]/input[1]"))
				.sendKeys(Keys.CONTROL, "c");
		String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		text = result;
		return text;
	}

	public String getTextFormTextField(String xpath)
			throws InterruptedException, UnsupportedFlavorException, IOException {
		String text = "";
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection stringSelection = new StringSelection("checkText");
		clipboard.setContents(stringSelection, null);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.CONTROL, "a");
		Thread.sleep(1000);
		driver.findElement(By.xpath(xpath)).sendKeys(Keys.CONTROL, "c");
		String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		text = result;
		return text;
	}

	public String getTextFormTextField(WebElement element)
			throws InterruptedException, UnsupportedFlavorException, IOException {
		String text = "";
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection stringSelection = new StringSelection("checkText");
		clipboard.setContents(stringSelection, null);
		element.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(1000);
		element.sendKeys(Keys.CONTROL, "c");
		String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		text = result;
		return text;
	}
	
	
	
	public void LIcenseGeneratorLogin() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadSendKeys(liceneseGeneratorUsernameinput,"flyops@flytxt.com");
		Thread.sleep(2000);
		jswait.loadSendKeys(liceneseGeneratorPasswordinput,"flyL1c3nc3");
		Thread.sleep(1000);
		jswait.loadClick(liceneseGeneratorLoginbtn);
	}
	
	public void LIcenseGeneratordetailspage(String Version) throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadSendKeys(liceneseGeneratorOrganizationInput,"flytxt");
		Thread.sleep(2000);
		jswait.loadSendKeys(licenseProductIdInput,Keys.chord(Keys.CONTROL, "v"));
		Thread.sleep(2000);
		jswait.loadClick(versionselectdropdown);
		Thread.sleep(3000);
		jswait.loadClick("//select[@id='versionSelect']/option[.='"+Version+"']");
	
	}
	
	
	public void LIcenseGeneratorenableallFeatures() throws Exception {

		Thread.sleep(2000);
		jswait.loadClick(enablePrecisionMarketer);
		Thread.sleep(2000);
		jswait.loadClick(enableIntentManagement);
		Thread.sleep(2000);
		jswait.loadClick(enableInsightsWorkbench);
		Thread.sleep(2000);
		jswait.loadClick(enableChurnPropensity);
		Thread.sleep(2000);
		jswait.loadClick(enableMultiviewClustering);
		Thread.sleep(2000);
		jswait.loadClick(enableAdaptiveCognizance);
		Thread.sleep(2000);
		jswait.loadClick(enableTrendAnalysis);
		Thread.sleep(2000);
		jswait.loadClick(enableRoboX);
		Thread.sleep(2000);
		jswait.loadClick(enableFacebook);
		Thread.sleep(2000);
		jswait.loadClick(enableImpactEstimation);
		Thread.sleep(2000);
		jswait.loadClick(enableCustomerDataExtraction);
		Thread.sleep(2000);
		jswait.loadClick(enableTargetInheritance);
		
		Thread.sleep(2000);
		jswait.loadClick(generateLicensebtn);
		Thread.sleep(2000);
		jswait.loadClick(copyToClipboardbtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}
	
	public void LIcenseGeneratorenableallFeatures2() throws Exception {

		Thread.sleep(2000);
		jswait.loadClick(enablePrecisionMarketer);
		Thread.sleep(2000);
		jswait.loadClick(enableIntentManagement);
		Thread.sleep(2000);
		jswait.loadClick(enableInsightsWorkbench);
		Thread.sleep(2000);
		jswait.loadClick(enableChurnPropensity);
		Thread.sleep(2000);
		jswait.loadClick(enableMultiviewClustering);
		Thread.sleep(2000);
		jswait.loadClick(enableAdaptiveCognizance);
		Thread.sleep(2000);
		jswait.loadClick(enableTrendAnalysis);
		Thread.sleep(2000);
		jswait.loadClick(enableRoboX);
		Thread.sleep(2000);
		jswait.loadClick(enableFacebook);
		Thread.sleep(2000);
		jswait.loadClick(enableImpactEstimation);
		Thread.sleep(2000);
		jswait.loadClick(enableCustomerDataExtraction);
		Thread.sleep(2000);
		jswait.loadClick(enableTargetInheritance);
		
	}
	
	
	public void clickmanagelicensePdtIdCopyBtn() throws InterruptedException {
		jswait.loadClick(managelicenseproductidcopybtn);
	}
	
	public void clickmanagelicenselicenseupgradebtn() throws InterruptedException {
		jswait.loadClick(managelicenselicenseupgradebtn);
	}
	
	public void clickmanagelicenselicenseapply() throws InterruptedException {
		jswait.loadSendKeys(managelicenseTextarea,Keys.chord(Keys.CONTROL, "v"));
	}
	
	
	
	public void LIcenseGeneratordisableanyFeatures(String Feature) throws Exception {
		LIcenseGeneratorenableallFeatures2();
	System.out.println(Feature);
		Thread.sleep(2000);
if(Feature.contentEquals("Precision Marketer")) {
	Thread.sleep(2000);
		jswait.loadClick(enablePrecisionMarketer);
}else if(Feature.contentEquals("Intent Management")) {
		Thread.sleep(2000);
		jswait.loadClick(enableIntentManagement);
}else if(Feature.contentEquals("Insights Workbench")) {
		Thread.sleep(2000);
		jswait.loadClick(enableInsightsWorkbench);
}else if(Feature.contentEquals("Churn Propensity")) {
		Thread.sleep(2000);
		jswait.loadClick(enableChurnPropensity);
}else if(Feature.contentEquals("Multiview Clustering")) {		
		Thread.sleep(2000);
		jswait.loadClick(enableMultiviewClustering);
}else if(Feature.contentEquals("Adaptive Cognizance")) {	
		Thread.sleep(2000);	
		jswait.loadClick(enableAdaptiveCognizance);
}else if(Feature.contentEquals("Trend Analysis")) {			
		Thread.sleep(2000);
		jswait.loadClick(enableTrendAnalysis);
}else if(Feature.contentEquals("Robo X")) {			
		Thread.sleep(2000);
		jswait.loadClick(enableRoboX);
}else if(Feature.contentEquals("Facebook")) {		
		Thread.sleep(2000);
		jswait.loadClick(enableFacebook);
}else if(Feature.contentEquals("Impact Estimation (Zain)")) {			
		Thread.sleep(2000);
		jswait.loadClick(enableImpactEstimation);
}else if(Feature.contentEquals("Customer Data Extraction (Zain)")) {			
		Thread.sleep(2000);
		jswait.loadClick(enableCustomerDataExtraction);
}else if(Feature.contentEquals("Target Inheritance (Zain)")) { 			
		Thread.sleep(2000);
		jswait.loadClick(enableTargetInheritance);		
}else {System.out.println("no feature found");} 

		Thread.sleep(2000);
		jswait.loadClick(generateLicensebtn);
		Thread.sleep(2000);
		jswait.loadClick(copyToClipboardbtn);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		
}
	public void saveDetailsofseedingoneoff() throws Exception {
		eh.setExcelFile("bcInputData","one-offBC");
		String name=eh.getCellByColumnName("BC Name");
		eh.setCell("seedingbcname",name);
	}
	
	
	
public void savedetailsofdatasetup() throws Exception {
		
//		File file = new File(("datasetupdetails.csv"),true);
		
			
			//File file = new File("datasetupdetails.xls");
//		FileOutputStream file=new FileOutputStream("datasetupdetails.csv",true);
		
//		StringBuilder builder = new StringBuilder();
//		 
//	
//			PrintWriter writer = new PrintWriter(file);
			mainexcel.setExcelFile("datasetupdetails","sheet1");
			
			for (int cat=0;cat<8;) {
				System.out.println(campaigncatarowcount);
		eh.setExcelFile("campaignCategoryInputData","CampaignCategory");
		mainexcel.setCell(campaigncatarowcount,1,eh.getCellByColumnName("Category Name"));
		cat++;
		campaigncatarowcount++;
			}
		
			
			
			for (int offcat=0;offcat<8;) {
			eh.setExcelFile("offerCatalogInputData","defaultCatalog");
			mainexcel.setCell(offercatarowcount,2,eh.getCellByColumnName("Catalog Name"));
			offcat++;
			offercatarowcount++;
	}
			
	
			
			for (int campaign=0;campaign<8;) {
				eh.setExcelFile("campaignInputData","campaignBC");
			mainexcel.setCell(campaignrowcount,3,eh.getCellByColumnName("Campaign Name"));
			campaign++;
			campaignrowcount++;
	}
	
			
		eh.setExcelFile("bcInputData","one-offBC");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;
		
		eh.setExcelFile("bcInputData","seedingTriggerableBC");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;
		
		eh.setExcelFile("bcInputData","seedingoneoff");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;
		
		eh.setExcelFile("bcInputData","recurringBC");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;

		eh.setExcelFile("bcInputData","seedingTriggerableRecurringBC");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;

		eh.setExcelFile("bcInputData","seedingRecurringBC");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;

		eh.setExcelFile("bcInputData","TriggerOneoff");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;
		
		eh.setExcelFile("bcInputData","TriggerReccurringBC");
		mainexcel.setCell(bcrowcount,4,eh.getCellByColumnName("BC Name"));
		bcrowcount++;
		
		
		}


//public void speadSheetTestFunction(String excelFile, String bcSheet, String key,String speadSheetID, String speadSheetName) throws Exception {
//	System.out.println("Inside Test Function"+bcSheet+":::::"+key); 
//	GoogleSpreadsheetImpl sqs = new GoogleSpreadsheetImpl();
//	eh.setExcelFile(excelFile, bcSheet);
//	sqs.initializeService();
	
//	sqs.setSpreadsheet(speadSheetID,speadSheetName);
//	int lastRow = Integer.parseInt(sqs.getCell(0, 4))-1;
//	forExcelSpreadsheet = lastRow;
//	if(forExcelSpreadsheet == -1) {
//		forExcelSpreadsheet = sqs.getLastUsedRow();
//	}
//	int row = forExcelSpreadsheet++;
////	System.out.println(row);
//	if(excelFile.contentEquals("bcInputData")) {
//		sqs.setCell(row, 0, "Broadcast");
//		sqs.setCell(row, 1, eh.getCellByColumnName("BC Name"));
//	}
//	else if(excelFile.contentEquals("offerInputData")) {
//		sqs.setCell(row, 0, "Offer");
//		sqs.setCell(row, 1, eh.getCell(1,0).toString());
//	}
//	else if(excelFile.contentEquals("productInputData")) {
//		sqs.setCell(row, 0, "Product");
//		sqs.setCell(row, 1, eh.getCell(1,0).toString());
//	}
//	else if(excelFile.contentEquals("productClassInputData")) {
//		sqs.setCell(row, 0, "Product Class");
//		sqs.setCell(row, 1, eh.getCell(1,0).toString());
//	}
//	else if(excelFile.contentEquals("offerCatalogInputData")) {
//		sqs.setCell(row, 0, "Offer Catalog");
//		sqs.setCell(row, 1, eh.getCell(1,0).toString());
//	}
//	else if(excelFile.contentEquals("campaignCategoryInputData")) {
//		sqs.setCell(row, 0, "Campaign Category");
//		sqs.setCell(row, 1, eh.getCell(1,0).toString());
//	}
//	else if(excelFile.contentEquals("campaignInputData")) {
//		sqs.setCell(row, 0, "Campaign");
//		sqs.setCell(row, 1, eh.getCell(1,0).toString());
//	}
//	else {
//		Exception e = new Exception("Excel file not adde to else if");
//		throw e;
//	}
//	sqs.setCell(row, 2, key);
//	CalenderUtility cu = new CalenderUtility();
//	sqs.setCell(row, 3, cu.getCurrentDate("dd MMM YYYY hh:mm aaa z"));
//}
	

public void filterBC(String bcname,String bctype) throws Exception{
Thread.sleep(10000);
Thread.sleep(10000);
//Thread.sleep(10000);
if(bctype.equalsIgnoreCase("onetime")||bctype.equalsIgnoreCase("one-off")) {
clickFilterIcon();
Thread.sleep(2000);
enterFilterFormname(bcname);
Thread.sleep(2000);
clickFilterResetButton();
clickFilterIcon();
enterFilterFormname(bcname);
clickFilterApplyButton();
jswait.loadClick(autoRefreshButtononetime);
}else if(bctype.equalsIgnoreCase("seeding")||bctype.equalsIgnoreCase("seedingoneoff")||bctype.equalsIgnoreCase("seedingRecurring")){
clickSeedingFilterIcon();
	Thread.sleep(2000);
	enterSeedingFilterFormname(bcname);
	Thread.sleep(2000);
	clickSeedingFilterResetButton();
	clickSeedingFilterIcon();
	enterSeedingFilterFormname(bcname);
	clickSeedingFilterApplyButton();
	jswait.loadClick(autoRefreshButtonSeeding);	
}else if(bctype.equalsIgnoreCase("trigger")) {
clickTrggerableFilterIcon();
Thread.sleep(2000);
enterTriggarableFilterFormname(bcname);
Thread.sleep(2000);	
clickTriggarableFilterResetButton();
clickTrggerableFilterIcon();
enterTriggarableFilterFormname(bcname);
clickTriggarableFilterApplyButton();	
jswait.loadClick(autoRefreshButtonTrigger);
}else if(bctype.equalsIgnoreCase("recurring")){
clickRecurringFilterIcon();
Thread.sleep(2000);
enterRecurringFilterFormname(bcname);
Thread.sleep(2000);
clickRecurringFilterResetButton();
clickRecurringFilterIcon();
enterRecurringFilterFormname(bcname);
clickRecurringFilterApplyButton();
jswait.loadClick(autoRefreshButtonRecurr);



}
}

public void BCOptionIcon(String bctype) throws Exception{
if(bctype.equalsIgnoreCase("onetime")||bctype.equalsIgnoreCase("one-off")) {
	jswait.loadClick(optionsIcon);
}else if(bctype.equalsIgnoreCase("seeding")||bctype.equalsIgnoreCase("seedingoneoff")||bctype.equalsIgnoreCase("seedingRecurring")) {
	jswait.loadClick(seedingOptionsIcon);			
}else if(bctype.equalsIgnoreCase("trigger")) {
	jswait.loadClick(triggerOptionsIcon);
}else if(bctype.equalsIgnoreCase("recurring")) {
	jswait.loadClick(recurringOptionsIcon);
}

}
public void filterTemplate(String campaignTemplateName) throws Exception{
		Thread.sleep(10000);
	Thread.sleep(10000);
	//Thread.sleep(10000);
	clickFilterIcon2();
	Thread.sleep(2000);
	enterFilterFormname2(campaignTemplateName);
	Thread.sleep(2000);
	
	clickFilterApplyButton2();
}
public void navigateToStreamingAttr() throws Exception{
	jswait.loadClick(streamigAttr);
}
public void createStreamingAttr(String attrName,String description,String value1,String value2) throws Exception{
	jswait.loadClick(streamingAttrCreatebtn);
	jswait.loadSendKeys(streamingAttrName, attrName);
	jswait.loadSendKeys(streamingAttrDesp,description);
	jswait.loadClick(streamingAttrSourceInput);
	jswait.loadClick(sourceDataConnector);
	jswait.loadClick(streamingAttrDataTypeInput);
	jswait.loadClick(dataTypeDouble);
	jswait.loadSendKeys(streamingAttrValue1, value1);
	jswait.loadSendKeys(streamingAttrValue2,value2);
	jswait.loadClick(streamingAttrSave);
}


public void createStreamingAttr(String attrName,String description,String value1,String value2,String route) throws Exception{
	jswait.loadClick(streamingAttrCreatebtn);
	jswait.loadSendKeys(streamingAttrName, attrName);
	jswait.loadSendKeys(streamingAttrDesp,description);
	jswait.loadClick(streamingAttrSourceInput);
	jswait.loadClick(sourceAPIConnector);
	jswait.loadClick(routeInput);
	jswait.loadClick("//paper-item[contains(.,'"+route+"')]");
	jswait.loadClick(fieldNameInput);
	jswait.loadSendKeys(fieldNameInput,value1 );
	jswait.loadClick(fieldTypeInput);
	jswait.loadClick(fieldTypeNumber);
	jswait.loadClick(isMandatory);
	jswait.loadClick(isMandatoryYES);
	jswait.loadClick(streamingAttrSave);
}


public void verifyStreamingAttrCreation(String attrName) throws Exception{
	Assert.assertTrue(jswait.checkVisibility("//span[contains(.,'"+attrName+"')]"));
}

public void navigateToTrigger() throws Exception{
	Thread.sleep(2000);
	jswait.loadClick(trigger);
}

public void createTrigger(String attrName,String value1, String value2,String triggerName) throws Exception{
	jswait.loadClick(createNewTriggerbtn);
	Thread.sleep(2000);
	jswait.loadSendKeys(triggerNameInput,triggerName);
	jswait.loadSendKeys(triggerDespInput, "trigger by selenium");
	jswait.loadClick(streamingAttrRadiobtn);
	Thread.sleep(2000);
	jswait.loadSendKeys(streamingAttrSelectInput,attrName);
	Thread.sleep(2000);
	jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+attrName+"')]");
	jswait.loadSendKeys(streamingAttrVariable, value1);
	jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+value1+"')]");
	jswait.loadClick(triggerConditionInput);
	jswait.loadClick(equalTo);
	jswait.loadSendKeys(valueInput, "10");
	Thread.sleep(2000);
	jswait.loadClick(triggerSavebtn);
	
}


public void clickOnToggleRefreshICon(String sheet) throws Exception {
if(sheet.contains("one-offBC")||sheet.contains("TriggerOneoff")) {
jswait.loadClick(autoRefreshButtononetime);
}else if(sheet.contains("seeding")) {
jswait.loadClick(autoRefreshButtonSeeding);			
}else if(sheet.contains("TriggerReccurringBC")) {
jswait.loadClick(autoRefreshButtonTrigger);
}else if(sheet.contentEquals("recurringBC")||sheet.contentEquals("recurrBCDaily")||sheet.contentEquals("recurringBCEdit")||sheet.contentEquals("recurringBCForAbort")||sheet.contentEquals("recurringBCForPause")) {
jswait.loadClick(autoRefreshButtonRecurr);
}

}

public void navigateToAdmin() throws Exception{
	jswait.loadClick(admin);
}

public void navigateToFulfillmentConfig() throws Exception{
	jswait.loadClick(fulfillmentConfig);
}

public void navigateToTrackingDataSource() throws Exception{
	jswait.loadClick(trackingDataSource);
}
public void createNewTrackSource(String trackSourceName) throws Exception{
	Thread.sleep(2000);
	jswait.loadClick(trackingSourcebtn);
	jswait.loadSendKeys(trackingSourceNameInput, trackSourceName);
	Thread.sleep(2000);
	jswait.loadClick(trackingSourceTypeInput);
	jswait.loadClick(conversionAndResponse);
	jswait.loadSendKeys(fieldAmount,"amount");
	jswait.loadClick(selectDataType);
	Thread.sleep(2000);
	jswait.loadClick(numberAsDataType);
	jswait.loadClick(selectAllPartner);
	Thread.sleep(2000);
	jswait.loadClick(saveTrackingSource);
	
	
}
public void blackoutRulesCreate() throws Exception{
	jswait.loadClick(blackoutRules);
}

public void DigitalPlusModules() throws Exception{
	jswait.loadClick(digitalPlus);
}

public void navigateToConnector() throws Exception {
jswait.loadClick(connectors);
}

public void navigatetToChannelConnector() throws Exception {
	jswait.loadClick(channelConnector);
}

public void navigatetToHttpConnector() throws Exception {
	jswait.loadClick(httpConnector);
}

public void createNewConnector() throws Exception {
	jswait.loadClick(createNewConnector);
}
public void createNewUrlInWebhook(String response,String httpSheet) throws Exception {
	jswait.loadClick(WebhookNewURL);
	 jswait.loadClick(createnewUrl);
	 if(httpSheet.equalsIgnoreCase("httpXML")) {
	 jswait.loadSendKeys(contentTypeInput, "text/xml");
	 jswait.loadSendKeys(contentresponseInput, response);
	 }
	 else if(httpSheet.equalsIgnoreCase("httpJson")) {
		 jswait.loadSendKeys(contentTypeInput, "text/json");
		 jswait.loadSendKeys(contentresponseInput, response);
	 }
	 else if(httpSheet.equalsIgnoreCase("httpQueryString")) {
		 jswait.loadSendKeys(contentTypeInput, "text/query string");
		 jswait.loadSendKeys(contentresponseInput, response); 
	 }
	 jswait.loadClick(createUrlbtn);
}

public void loginToWebhook(String username,String password) throws Exception{
	webhookEmail.sendKeys(username);
	webhookPassword.sendKeys(password);
	webhookLoginbtn.click();
}

public void webhookControlPanel() throws Exception{
	jswait.loadClick(controlPanelbtn);
}
public void copyGeneratedUrl(String httpSheet) throws Exception{
	String urlGenerated=url.getText();
	eh.setExcelFile("DigitalPlus", httpSheet);
	eh.setCell("url", urlGenerated);
}


public void createHttpConnector(String httpSheet,String httpConnectorName,String webhookUrl) throws InterruptedException {
	jswait.loadSendKeys(httpNameInput, httpConnectorName);
	jswait.loadSendKeys(httpdescpInput, "http connector by selenium");
	jswait.loadSendKeys(urlInput, webhookUrl);
	if(httpSheet.equalsIgnoreCase("httpXML")) {
	jswait.loadClick(Proceedbtn);
	Thread.sleep(3000);
	requestDataInput.sendKeys("<xml>Success ");
	jswait.loadClick(httpDynamicVariable);
	jswait.loadSendKeys(parameterNameInput,"msisdn");
	jswait.loadSendKeys(parameterInput,"Customer Address");
	jswait.loadClick(customerAddressParameter) ;
	jswait.loadClick(ParameterOKBtn);
	requestDataInput.sendKeys("</xml>");
	jswait.loadClick(Proceedbtn);
	Thread.sleep(3000);
	jswait.loadSendKeys(successXpath, "//response");
	jswait.loadSendKeys(successString, "Success from selenium");
	jswait.loadSendKeys(resultCodeXpath, "//responseCode");
	jswait.loadSendKeys(descpXpath, "//responseDescp");
	
	}
	else if(httpSheet.equalsIgnoreCase("httpJson")) {
		jswait.loadClick(jsonRadiobtn);
		jswait.loadClick(Proceedbtn);
		eh.setExcelFile("DigitalPlus", httpSheet);
		jswait.loadSendKeys(jsonRequestDataInput,eh.getCell(1, "request data"));
		jswait.loadClick(httpDynamicVariable);
		jswait.loadSendKeys(parameterNameInput,"msisdn");
		jswait.loadSendKeys(parameterInput,"Customer Address");
		jswait.loadClick(customerAddressParameter) ;
		jswait.loadClick(ParameterOKBtn);
		jsonRequestDataInput.sendKeys("\"}");
		jswait.loadClick(Proceedbtn);
		Thread.sleep(3000);
		jswait.loadSendKeys(responseRegexInput, "*");
		jswait.loadSendKeys(responseRegexTestInput,"*");
		jswait.loadSendKeys(responseRegexPositionInput, "0");
		
	}
	else if(httpSheet.equalsIgnoreCase("httpQueryString")) {
		jswait.loadClick(queryStringRadiobtn);
		jswait.loadClick(Proceedbtn);
		jswait.loadSendKeys(queryStringNameInput, "Name");
		jswait.loadSendKeys(queryStringValueInput,httpConnectorName );
		jswait.loadClick(addRequestHeader);
		jswait.loadSendKeys(queryStringNameInput1, "msisdn");
		jswait.loadClick(queryStringValueInput1);
		jswait.loadClick(httpDynamicVariable1);
		jswait.loadSendKeys(parameterNameInput,"msisdn");
		jswait.loadSendKeys(parameterInput,"Customer Address");
		jswait.loadClick(customerAddressParameter) ;
		jswait.loadClick(ParameterOKBtn);
		jswait.loadClick(Proceedbtn);
		Thread.sleep(3000);
		jswait.loadSendKeys(responseRegexInput, "*");
		jswait.loadSendKeys(responseRegexTestInput,"*");
		jswait.loadSendKeys(responseRegexPositionInput, "0");
	}
	jswait.loadClick(ConnectorSavebtn);
}
public void clickDigitalPlusModule() throws InterruptedException {
	jswait.loadClick(Digitalplusclick);
}
public void clickTagManagerConfigurations() throws InterruptedException {
	jswait.loadClick(Tagmanagerclick);
}
public void generateAccountkey() throws InterruptedException {

	//jswait.loadClick(Generateaccountkey);
	boolean accntkey = driver.findElements(By.xpath("//paper-button[@id='generate-key-button']")).size() > 0;
	
	if(accntkey==true) {
	jswait.loadClick(Generateaccountkey);
	}else if(accntkey==false) {
	
	
		System.out.println("Account key exist");
	}
//	Thread.sleep(5000);
//	TimeoutImpl t = new TimeoutImpl();
//	t.startTimer();
	
	
	
}

//public String getTagbuttontext() throws InterruptedException {
//	String status = driver.findElement(By.xpath("//paper-button[@id='generate-key-button']")).getText();
//	System.out.println(status);
//	return status;
//}
public void randonclicklogin() throws InterruptedException {
	jswait.loadClick("(//img[@src=\"https://192.168.160.142/images/robo-x-top-pane.svg\"])[1]");
}

public void accountKeyCopy(String tagsheet) throws Exception {
	String txttagid = driver.findElement(By.xpath("//label[@id='key']")).getText();
	System.out.println(txttagid);
	eh.setExcelFile("tagManager", tagsheet);
	 eh.setCell(1, 0, txttagid);
	   // eh.setCell(4, 1, txttagid);
	
}
public void configureDomainVariables(String name) throws InterruptedException {
	jswait.loadClick(Editdomainvalues);
	jswait.loadSendKeys(clickdomaintxt, name);
	jswait.loadClick(clicksavefordomain);
}


}


	
	

