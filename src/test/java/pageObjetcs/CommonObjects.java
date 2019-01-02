package pageObjetcs;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class CommonObjects extends Init {
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public ExcelHelper eh = new ExcelHelper();
	
	public ExcelHelper mainexcel = new ExcelHelper();

	public CommonObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	private WebElement filterIcon;
	@FindBy(xpath = "(//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..)[2]")
	private WebElement filterIcon2;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Name')]/..//input")
	private WebElement filterFormName;
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
	@FindBy(xpath = "//*[@d='M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z']/../../..")
	private WebElement plusIcon;
	@FindBy(xpath = "//paper-button[contains(text(),'Yes')]")
	private WebElement paperButtonYes;
	@FindBy(xpath = "//paper-button[contains(text(),'OK')]")
	private WebElement paperButtonOk;
	@FindBy(xpath = "//paper-item[contains(.,'Edit')]")
	private WebElement optionsEdit;
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
	 @FindBy(xpath="//paper-toggle-button")
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
//		@FindBy(xpath="")
//		private WebElement ;
//		@FindBy(xpath="")
//		private WebElement ;
//		@FindBy(xpath="")
//		private WebElement ;

	 
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

	public void filterName(String name) throws InterruptedException {
		Thread.sleep(10000);
		Thread.sleep(10000);
		Thread.sleep(10000);
		clickFilterIcon();
		Thread.sleep(2000);
		enterFilterFormname(name);
		Thread.sleep(2000);
		clickFilterResetButton();
		clickFilterIcon();
		enterFilterFormname(name);
		clickFilterApplyButton();
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
	
	
	
}
