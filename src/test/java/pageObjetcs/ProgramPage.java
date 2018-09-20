package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
public class ProgramPage extends Init{

	private static final Exception Exception = null;
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public ProgramPage() {
		PageFactory.initElements(driver, this);
	}
	
//===========================================================================================================================================================================//
//                                                                          PROGRAM PAGE ELEMENTS
//===========================================================================================================================================================================//	
	
	@FindBy(xpath=".//*[@id='programList']")
	private WebElement programList;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Name')]")
	private WebElement programListNameColumn;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Status')]")
	private WebElement programListStatusColumn;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Offer Catalog')]")
	private WebElement programListOfferCatalogColumn;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Channels')]")
	private WebElement programListChannelsColumn;
	
	@FindBy(xpath="//data-table-cell[contains(.,'# Rules')]")
	private WebElement programListRulesColumn;
	
	@FindBy(xpath="//data-table-cell[contains(.,'# Views')]")
	private WebElement programListViewsColumn;
	
	@FindBy(xpath="//paper-button[contains(.,'Create Program')]")
	private WebElement createProgramButton;
		
	@FindBy(xpath="//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	private WebElement filterButton;
	
	@FindBy(xpath=".//*[@id='filterDialog']/div//paper-button[contains(.,'Cancel')]")
	private WebElement filterCancelButton;
	
	@FindBy(xpath=".//*[@id='topBar']/paper-button[1]")
	private WebElement createProgramCancelButton;
	
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Save')]")
	private WebElement createProgramSaveButton;
	@FindBy(xpath=".//div[@id='topBar']/paper-button[4]")
	private WebElement editProgramSaveButton;
	
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Proceed')]")
	private WebElement createProgramProceedButton;
	@FindBy(xpath=".//paper-card[contains(.,'Edit')]")
	private WebElement programEditButton;
	
	@FindBy(xpath=".//paper-item[contains(.,'View Rules')]")
	private WebElement programViewRulesButton;
	
	@FindBy(xpath=".//paper-item[contains(.,'Edit')]")
	private WebElement EditProgramButton;
	
	@FindBy(xpath="//h5[contains(.,'Basic Information')]/..//label[contains(.,'Name')]/..//*[@id='input']")
	private WebElement createProgramName;
	
	@FindBy(xpath="//h5[contains(.,'Basic Information')]/..//label[contains(.,'Description')]/..//textarea")
	private WebElement createProgramDescription;
	
	@FindBy(xpath="//h5[contains(.,'Basic Information')]/..//label[contains(.,'Offer Catalog')]/..//*[@id='input']")
	private WebElement createProgramChooseOfferCatalog;
	
	@FindBy(xpath="//form[@id='detailForm']//*[@id='items']/vaadin-combo-box-item")
	private WebElement createProgramCatalogSelect;
	
	@FindBy(xpath=".//*[@id='crumbs']/flytxt-breadcrumb[4]//paper-button[contains(.,'Create Program')]")
	private WebElement createProgramBreadcrumb;
	
	@FindBy(xpath="//paper-button[contains(.,'Add Touchpoint')]")
	private WebElement createProgramAddTouchpointButton;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Touchpoint')]")
	private WebElement createProgramTouchpointGridName;
	
	@FindBy(xpath="//data-table-cell[text()='Channel']")
	private WebElement createProgramTouchpointGridChannel;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Response Channel')]")
	private WebElement createProgramTouchpointGridResponseChannel;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Other Attrib')]")
	private WebElement createProgramTouchpointGridOttherAttributes;
	
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Channel']/..//*[@id='input']")
	private WebElement addTouchpointChannel;
	
	@FindBy(xpath="//label[@id='paper-input-label-21']/..//*[@id='input']")
	private WebElement programserveoninput;
	
	
	@FindBy(xpath="//paper-item[text()='SMS']")
	private WebElement addTouchpointSelectSMS;
	
	
	@FindBy(xpath=".//data-table-row [@id='item20']//paper-icon-button[1]")
	private WebElement Apiedittouchpoints;
	
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Keyword Aliases']/..//textarea")
	private WebElement addTouchpointKeywordAliases;
	
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Touchpoint']/..//*[@id='input']")
	private WebElement addTouchpointTouchpointName;
	
	@FindBy(xpath="(//*[@id='items']/vaadin-combo-box-item[1])[2]")
	private WebElement addTouchpointSelectSMS1024;
	
	
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Response Channel']/..//*[@id='input']")
	private WebElement addTouchpointResponseChannel;
	
	@FindBy(xpath="//paper-item[text()='SMS']")
	private WebElement addTouchpointChannelSelectSMS;
	@FindBy(xpath="//paper-item[text()='Customer Care']")
	private WebElement addTouchpointChannelSelectCC;
	
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Response Channel']/../../../../../../..//paper-item[text()='SMS']")
	private WebElement addTouchpointResponseChannelSelectSMS;
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Response Channel']/../../../../../../..//paper-item[text()='CustomerCare']")
	private WebElement addTouchpointResponseChannelSelectCC;
	
	@FindBy(xpath="//*[@id='addTouchpointForm']//paper-button[text()='Save']")
	private WebElement addTouchpointSaveButton;
	
	@FindBy(xpath=".//data-table-row[@id='item1']//paper-menu-button button")
	private WebElement programsfrowbtn;
	
	@FindBy(xpath="//label[text()[contains(.,'Offer Catalog')]]/../input")
	private WebElement programofferclick;
	
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[1]")
	private WebElement pgmfirstofferselect ;
	@FindBy(xpath="//paper-button[contains(.,'Create New Rule')]")
	private WebElement createNewRuleButton;
	
	@FindBy(xpath="//paper-button[contains(.,'Save')]")
	private WebElement saveRuleButton;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Start Date']/..//*[@id='input']")
	private WebElement programschstart;
	
	@FindBy(xpath="//label[contains(.,'End Date')]/../input")
	private WebElement programschend;
	
	@FindBy(xpath="//paper-item[contains(.,'Now')]")
	private WebElement prmshcselectnow ;
	
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[1]")
	private WebElement selectfirstCustomerList ;
	
	@FindBy(xpath="//paper-item[contains(.,'At')]")
	private WebElement prmstartAt ;
	
	@FindBy(xpath="//label[contains(.,'Customer List')]/../input")
	private WebElement customerListField;
	
	@FindBy(xpath="//label[text()[contains(.,'Product')]]/../input")
	private WebElement productField;
	
	@FindBy(xpath="//paper-item[contains(.,'No End')]")
	private WebElement prmshcselectnoend ;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Refresh Cycle']/..//*[@id='input']")
	private WebElement programschrefreshcycle;
	
	@FindBy(xpath="//paper-item[contains(.,'Days')]")
	private WebElement prmshcselectdays;
	
	@FindBy(xpath="//paper-item[contains(.,'Weeks')]")
	private WebElement prmshcselectweeks;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Every']/..//*[@id='input']")
	private WebElement prmrecycleinput ;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Every']/..//*[@id='input']")
	private WebElement prmeverylabel ;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Refresh At']/..//*[@id='input']")
	private WebElement prmrefreshat ;
	
	@FindBy(xpath=".//*[@id='timeDialog']//paper-button[contains(.,'OK')]")
	private WebElement pgmtimeokbtn ;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Serve on']/..//*[@id='input']")
	private WebElement programschserveon;

	@FindBy(xpath="//paper-item[contains(.,'All Days')]")
	private WebElement prmshcserveonalldays ;
	
	@FindBy(xpath="//paper-item[contains(.,'Specific Days')]")
	private WebElement prmshcserveonSpecdays ;
	
	
	@FindBy(xpath="//paper-dialog[@id='confirmActivate']//paper-button[text()='Yes']")
	private WebElement programconfirmactivateyes;
	@FindBy(xpath="//paper-dialog[@id='confirmSave']//paper-button[text()='Yes']")
	private WebElement confirmProgramEditSave;
	
	@FindBy(xpath="//paper-dialog[@id='confirmSave']//paper-button[text()='Yes']")
	private WebElement programconfirmSaveyes;
	
	@FindBy(xpath="//paper-button[contains(.,'Activate')]")
	private WebElement programactivatebtn ;
	
	
	@FindBy(xpath="(//*[@id='topBar']/paper-button[contains(.,'Save')])[2]")
	private WebElement programsavebutton ;

	@FindBy(xpath="(//span[contains(.,'programedit')])[1]")
	private WebElement editprogramcheck;
	
	@FindBy(xpath="//paper-toast[@id='toast']//span[contains(.,'This touchpoint has already been added. Please choose another.')]")
	private WebElement warningmessage ;
	
	@FindBy(xpath="//*[@id='wizard']/li[2]/span[text()='Touchpoints']")
	private WebElement programTouchpointtab ;
	
	@FindBy(xpath="//*[@id='item30']/div[1]/data-table-cell[1]")
	private WebElement checktouchpoints;
	
	@FindBy(xpath="//*[@id='addTouchpointForm']//paper-button[text()='Cancel']")
	private WebElement touchpointcancel;
	
	@FindBy(xpath="//paper-toast[@id='toast']//span[contains(.,'Add Touchpoint')]")
	private WebElement warningmessageaddtouchpoint ;
	
	@FindBy(xpath="//*[@id='topBar']/paper-button[contains(.,'Cancel')]")
	private WebElement programtopcancel;
		
	@FindBy(xpath="(//form[@id='scheduleForm']//label[text()='Every']/..//*[@id='input'])[2]")	
	private WebElement programserveonevery;
	@FindBy(xpath=".//*[@id='checkboxContainer']//following::div[contains(.,'Monday')]/../div[@id='checkboxContainer']/..")
	private WebElement checkboxdaysmonday;
	@FindBy(xpath="(.//*[@id='items']//*[@id='icon'])[1]")
	private WebElement touchpointoptions ;
	@FindBy(xpath="(.//*[@id='contentWrapper']//paper-item[contains(.,'Delete')])[1]")
	private WebElement touchpointdelete;
	@FindBy(xpath=".//*[@id='item92']/div[1]/data-table-cell[contains(.,'SMS')]")
	private WebElement touchpointpgmdeletecheck ;
	@FindBy(xpath=".//*[@id='item1']//data-table-cell[1]/span[contains(.,'autoprogram')]")
	private WebElement filterprogramcheck ;
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Time Zone']/..//*[@id='input']")
	private WebElement programtimezone ;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'Kathmandu')]")
	private WebElement programtimezonechange;
	@FindBy(xpath=".//*[@id='wizard']/li[contains(.,'Schedule')]")
	private WebElement programScheduletab ;
	
	
	@FindBy(xpath=".//paper-item[@value='false' and contains(.,'After')]")
	private WebElement optionAfter;
	
	@FindBy(xpath="//div[@id='contentWrapper']//paper-listbox[@role='listbox']/paper-item[contains(.,'After')]")
	private WebElement optionAfterselect;
	
	@FindBy(xpath=".//paper-item[@value='true' and contains(.,'At')]")
	private WebElement optionAt;
	@FindBy(xpath=".//paper-item[@aria-selected='true' @value='true' and contains(.,'At')]")
	private WebElement optionAtAfterSelection;
	
	@FindBy(xpath=".//h5[contains(.,'Tracking expires')]//following::input")
	private WebElement trackingSessionField;
	
	@FindBy(xpath="//label[contains(.,'Product')]/../../../..//vaadin-combo-box-item[1]")
	private WebElement product;
	
	
	@FindBy(xpath=".//*[@id='item1']//span[contains(.,'autoprogram')]")
	private WebElement filterpgm ;
	
	@FindBy(xpath=".//paper-input-error[contains(.,'The value does not match the specified pattern.')]")
	private WebElement errorProgrammTitle ;

	
	//rules
	
	
	
@FindBy(xpath="//paper-dialog[@id='view']//label[contains(.,'Rule Name')]//..//input")
private WebElement programrulename ;
	

	
@FindBy(xpath="//div[@id='contentWrapper']//paper-listbox[@role='listbox']/paper-item[contains(.,'After')]//following::input[1]")
private WebElement ruleaftervalue ;
@FindBy(xpath="//div[@id='contentWrapper']//paper-listbox[@role='listbox']/paper-item[contains(.,'After')]//following::input[2]")
private WebElement ruleafterinput2 ;
@FindBy(xpath="//form[@id='deliverySegment']//div[@id='contentWrapper']//paper-listbox[@role='listbox']/paper-item[contains(.,'Days')]")
private WebElement ruledays;
@FindBy(xpath="//form[@id='deliverySegment']//label[contains(.,'Sender ID: Broadcast message would appear from this ID')]//following::input[1]")
private WebElement rulessenderid ;
@FindBy(xpath="//vaadin-combo-box-overlay[@id='overlay']//vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
private WebElement addresssprule;
@FindBy(xpath="(//vaadin-combo-box-overlay[@id='overlay']//vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')])[2]")
private WebElement addresssprule2;

@FindBy(xpath="//form[@id='deliverySegment']//label[contains(.,'Route over which this broadcast can be sent')]//following::input[1]")
private WebElement rulerouteid;
@FindBy(xpath="//vaadin-combo-box-overlay[@id='overlay']//vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]")
private WebElement ruleroute;
@FindBy(xpath="(//vaadin-combo-box-overlay[@id='overlay']//vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')])[2]")
private WebElement ruleroute2;
@FindBy(xpath="//form[@id='deliverySegment']//label[contains(.,'Route over which Fulfillment success or failure confirmation message can be sent')]//following::input[1]")
private WebElement rulerouteid2;

	
@FindBy(xpath="//form[@id='deliverySegment']//label[contains(.,'Sender ID: Fulfillment success or failure message would appear from this ID')]/../input")
//form[@id='deliverySegment']//label[contains(.,'Sender ID: Fulfillment success or failure message would appear from this ID')]//following::input[1]")
private WebElement rulessenderid2 ;
	
	
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;

//===========================================================================================================================================================================//
//                                                                         PROGRAM PAGE FUNCTIONS
//===========================================================================================================================================================================//	
		
	public void clickCreateProgramButton() throws InterruptedException {
		jswait.loadClick(createProgramButton);
	}
	
	

   public void checkProgramTitleValidationErrorMessage() throws InterruptedException {
		assertTrue(errorProgrammTitle.isDisplayed());
	}
	public void clickCreateProgramCancelButton() throws InterruptedException {
		jswait.loadClick(createProgramCancelButton);
	}
	public void clickFilterButton() throws InterruptedException {
		jswait.loadClick(filterButton);
	}
	public void clickFilterCancelButton() throws InterruptedException {
		jswait.loadClick(filterCancelButton);
	}
	public void clickPorogramProceedButton() throws InterruptedException {
		jswait.loadClick(createProgramProceedButton);
	}
	
	public void clickPorogramEditButton() throws InterruptedException {
		jswait.loadClick(programEditButton);
	}
	public void clickCreateNewRuleButton() throws InterruptedException {
		jswait.loadClick(createNewRuleButton);
	}
	public void checkCancelButtonCreateProgram() throws InterruptedException {
		clickCreateProgramButton();
		clickCreateProgramCancelButton();
	}
	public void clickSaveRuleButton() throws InterruptedException {
		jswait.loadClick(saveRuleButton);
	}

	public void clickCustomerListField() throws InterruptedException {
		jswait.loadClick(customerListField);
	}
	
	public void clickPorogramViewRulesButton() throws InterruptedException {
		jswait.loadClick(programViewRulesButton);
	}
	
	public void verifyRuleCreatedFromSheet(String name) throws InterruptedException {
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//data-table-cell[contains(.,'"+name+"')]")).isDisplayed());
	}
	
	
	public void clickEditProgramButton() throws InterruptedException {
		jswait.loadClick(EditProgramButton);
	}
	
	public void clickProductField(String name) throws InterruptedException {
		jswait.loadClick(productField);
		jswait.loadSendKeys(productField, name);
		
	}
	public void clickProductFieldOption() throws InterruptedException {
		jswait.loadClick(productField);
	}
	public void checkFilterCancelButton() throws InterruptedException {
		clickFilterButton();
		clickFilterCancelButton();
	}
	

   public void clickAtOption() throws InterruptedException {
		jswait.loadClick(optionAt);
		}
   public void optionAfterselect() throws InterruptedException {
		jswait.loadClick(optionAfterselect);
		}
   
   public void clickTrackingSessionField() throws InterruptedException {
		jswait.loadClick(trackingSessionField);
		}
   public void chooseProduct(String name) throws InterruptedException {
	   Thread.sleep(7000);
		Actions act = new Actions(driver);
		
				act.moveToElement(driver.findElement(By.xpath("(.//vaadin-combo-box-item[@class='style-scope vaadin-combo-box-overlay'][1])[2]//..//vaadin-combo-box-item[1]"))).click().build().perform();
		//act.moveToElement(driver.findElement(By.xpath("//vaadin-combo-box-item[contains(.,'singleProd477')]"))).click().build().perform();
		//act.moveToElement(driver.findElement(By.xpath("//vaadin-combo-box-item[contains(.,'"+name+"')]"))).click().build().perform();
//		act.moveToElement(product).click().build().perform();
		Thread.sleep(3000);
//	   jswait.loadClick(product);
		
	}

   public void createNewProgramRuleAndVerifyTrackingSession(String name)throws Exception {
		
		clickCreateNewRuleButton();
		//enterRuleName();
		clickSaveRuleButton();
		Thread.sleep(2000);
		clickCustomerListField();
		Thread.sleep(2000);
		selectCustomerList(SELENIUM_LIST);
		Thread.sleep(2000);
		clickPorogramProceedButton();
		Thread.sleep(2000);
		clickProductFieldOption();
		chooseProduct(name);
		Thread.sleep(2000);
		clickPorogramProceedButton();
		clickTrackingSessionField();
		Thread.sleep(3000);
		assertTrue(optionAt.isDisplayed());
		assertTrue(optionAfter.isDisplayed());
		clickAtOption();
		clickTrackingSessionField();
		Thread.sleep(2000);
		assertTrue(optionAt.isDisplayed());
		
	}
   
   //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-///
   public void createNewProgramRule(String name,String listname)throws Exception {
		
		clickCreateNewRuleButton();
		enterruleName();
		clickSaveRuleButton();
		Thread.sleep(2000);
		clickCustomerListField();
		Thread.sleep(2000);
		selectCustomerList(listname);
		Thread.sleep(2000);
		clickPorogramProceedButton();
		Thread.sleep(2000);
		clickProductFieldOption();
		chooseProduct(name);
		Thread.sleep(2000);
		clickPorogramProceedButton();
		//System.out.println("test");
		clickTrackingSessionField();
		Thread.sleep(3000);
		optionAfterselect();
		Thread.sleep(3000);
		ruledelivryafterinput();
		Thread.sleep(3000);
		ruleafterinput2(); 
		ruledays();
		Thread.sleep(2000);
		rulessenderid();
		addresssprule();
		Thread.sleep(3000);
		rulerouteid();
		ruleroute();
		Thread.sleep(2000);
		rulessenderid2();
		addresssprule2();
		Thread.sleep(2000);
		rulerouteid2(); 
		ruleroute2();
		clickPorogramProceedButton();
		
		
		// same path for both program and rule thats why used this fns here//
		Thread.sleep(2000);
		programschstart(); 
		prmshcselectnow();
		Thread.sleep(2000);
		programactivatebtn();
		programconfirmactivateyes();
		System.out.println("test");
	
		
	}
   
   
   
   
   public void enterruleName()throws InterruptedException, IOException {
	   ExcelHelper programExcel = new ExcelHelper();
   	   eh.setExcelFile("ruleInputData", "rule");
	   Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		
    	eh.setCell(1, 0, name);
		
		jswait.loadSendKeys(programrulename, name);
	} 
   
   
   
   public void selectCustomerList(String listname) throws InterruptedException {
			
		Thread.sleep(1000);
//		eh.setExcelFile("listname",listname);
		String list = SELENIUM_LIST;
		jswait.loadSendKeys(customerListField, list);
		Thread.sleep(3000);
		jswait.loadClick("//vaadin-combo-box-overlay[@id='overlay']//vaadin-combo-box-item[contains(.,'"+list+"')]");
//		driver.findElement(By.xpath("//vaadin-combo-box-overlay[@id='overlay']//vaadin-combo-box-item[contains(.,'"+list+"')]")).click();
		
	}
   
   public void ruledelivryafterinput() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(ruleaftervalue)).sendKeys(Keys.ARROW_UP);
		}
   public void ruleafterinput2() throws InterruptedException {
		jswait.loadClick(ruleafterinput2);
	}
   
   
   public void ruledays() throws InterruptedException {
		jswait.loadClick(ruledays);
	}
   
   public void rulessenderid() throws InterruptedException {
	   Thread.sleep(2000);
		jswait.loadClick(rulessenderid);
	}
   
   public void addresssprule() throws InterruptedException {
	   Thread.sleep(2000);
		jswait.loadClick(addresssprule);
	
	}
   public void addresssprule2() throws InterruptedException {
	   Thread.sleep(2000);
		jswait.loadClick(addresssprule2);
//		 Thread.sleep(2000);
//			jswait.loadClick(addresssprule2);
	
	}
   
   public void rulerouteid() throws InterruptedException {
	   Thread.sleep(2000);
		jswait.loadClick(rulerouteid);
		
		
	}
   
   public void ruleroute() throws InterruptedException {
	   Thread.sleep(2000);
	
	   while(ruleroute.isDisplayed()==false) {
	   
		   rulerouteid.sendKeys(Keys.DOWN);
		   
	   }
	    wait.until(ExpectedConditions.visibilityOf(ruleroute));
		jswait.loadClick(ruleroute);
//		Thread.sleep(1000);
//		jswait.loadClick(ruleroute);
		
	}
   public void ruleroute2() throws InterruptedException {
	   Thread.sleep(3000);
	 jswait.loadClick(ruleroute2);
		
		
	}
   public void rulessenderid2() throws InterruptedException {
	   Thread.sleep(4000);
	   //wait.until(ExpectedConditions.visibilityOf(rulessenderid2)).click();
		jswait.loadClick(rulessenderid2);
//		Thread.sleep(2000);
//		jswait.loadClick(rulessenderid2);
	}
   
   public void rulerouteid2() throws InterruptedException {
	   Thread.sleep(2000);
		jswait.loadClick(rulerouteid2);
//		 Thread.sleep(2000);
//			jswait.loadClick(rulerouteid2);
	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*//
	public void checkAllColumnsInProductList() throws InterruptedException {
		jswait.checkClickable(programListNameColumn);
		jswait.checkClickable(programListChannelsColumn);
		jswait.checkClickable(programListOfferCatalogColumn);
		jswait.checkClickable(programListRulesColumn);
		jswait.checkClickable(programListViewsColumn);
		jswait.checkClickable(programListStatusColumn);
	}
	
	public void verifyProduct(String name) throws InterruptedException {
		try {
			assertTrue(driver.findElement(By.xpath("//vaadin-combo-box-item[contains(.,'"+name+"')]")).isDisplayed());
			
		}
		catch(Exception e) {
			
			
		}
		
		
	}
	
	public void enterProgramName(String name)throws InterruptedException {
		jswait.loadSendKeys(createProgramName, name);
	}
	public void enterProgramDescription()throws InterruptedException {
		jswait.loadSendKeys(createProgramDescription,"This is selenium created program");
	}
	public void enterProgramDescriptionedit()throws InterruptedException {
		jswait.loadSendKeys(createProgramDescription,"This is selenium edited program");
	}
	public void selectOfferCatalog() throws InterruptedException {
		jswait.loadClick(createProgramChooseOfferCatalog);
		jswait.loadClick(createProgramCatalogSelect);
	}
	public void enterProgramDetails(String name)throws InterruptedException {
		
	
		enterProgramName(name);
		enterProgramDescription();
		Thread.sleep(4000);
		programofferclick();
		Thread.sleep(4000);
		pgmfirstofferselect();
		Thread.sleep(4000);
		clickPorogramProceedButton();
	}
	
	public void enterProgramDetailsWithAlertValue()throws InterruptedException {
		
		
		enterProgramName("<script>alert(document.cookies)</script>");
		enterProgramDescription();
		Thread.sleep(4000);
		programofferclick();
		Thread.sleep(4000);
		pgmfirstofferselect();
		Thread.sleep(4000);
		clickPorogramProceedButton();
		checkProgramTitleValidationErrorMessage();
	}
	public void cancelProgramDetails(String name)throws InterruptedException {
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
	
		name =  name.replaceAll("[0-9]", "")+n;
		enterProgramName(name);
		enterProgramDescription();
		Thread.sleep(4000);
		programofferclick();
		Thread.sleep(4000);
		pgmfirstofferselect();
		Thread.sleep(4000);
		programtopcancel();
		Thread.sleep(4000);
		 jswait.checkVisible(createProgramButton);
		clickCreateProgramButton();
	}
	
	
	
	
	
	
	
	public String editProgramDetails(String name)throws InterruptedException {
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		name =  name.replaceAll("[0-9]", "")+n;
		enterProgramName(name);
		enterProgramDescriptionedit();
		Thread.sleep(4000);
		programofferclick();
		Thread.sleep(4000);
		pgmfirstofferselect();
		Thread.sleep(4000);
		clickPorogramProceedButton();
		String editname=name;
		return editname;
	}
	public void checkCreateProgramTopbarButtons()throws InterruptedException {
		jswait.checkClickable(createProgramCancelButton);
		jswait.checkClickable(createProgramSaveButton);
		jswait.checkClickable(createProgramProceedButton);
		jswait.checkVisible(createProgramBreadcrumb);
	}
	public void clickCreateProgramAddTouchpointButton() throws InterruptedException {
		jswait.loadClick(createProgramAddTouchpointButton);
	}
	public void createProgramCheckOfferCatalogField() throws Exception {
		Exception e = new Exception("offer catalog displayed exceeds limit");
		jswait.loadClick(createProgramChooseOfferCatalog);
//		jswait.waitUntil("//form[@id='detailForm']//*[@id='items']/vaadin-combo-box-item");
		Thread.sleep(2000);
		
		int offerCatalogesCount = driver.findElements(By.xpath("//*[@id='items']/vaadin-combo-box-item")).size();
		System.out.println("count of catalogs:"+offerCatalogesCount);
		if(offerCatalogesCount>20) {
			throw e;
		}
		jswait.loadSendKeys(createProgramChooseOfferCatalog, "at");
		Thread.sleep(3000);
		jswait.loadClick("//*[@id='items']/vaadin-combo-box-item");
	}
	public void checkCreateProgramTouchpointGrid() throws InterruptedException {
		jswait.checkVisible(createProgramTouchpointGridChannel);
		jswait.checkVisible(createProgramTouchpointGridName);
		jswait.checkVisible(createProgramTouchpointGridOttherAttributes);
		jswait.checkVisible(createProgramTouchpointGridResponseChannel);
		jswait.checkClickable(createProgramAddTouchpointButton);
	}
	public void addTouchPointSelectSmsChannel() throws InterruptedException {
		jswait.loadClick(addTouchpointChannel);
		jswait.loadClick(addTouchpointChannelSelectSMS);
	}
	public void addTouchPointSelectCCChannel() throws InterruptedException {
		jswait.loadClick(addTouchpointChannel);
		jswait.loadClick(addTouchpointChannelSelectCC);
	}
	public void addTouchPointEnterKeywordAliase() throws InterruptedException {
		jswait.loadSendKeys(addTouchpointKeywordAliases, "SampleKey");
	}
	public void programserveoninput()throws InterruptedException {
		jswait.loadSendKeys(programserveoninput, "1");
	}
	
	
	
	public void addTouchPointSelectSmsTouchpoint() throws InterruptedException {
		jswait.loadClick(addTouchpointTouchpointName);
		Thread.sleep(2000);
		jswait.loadClick(addTouchpointSelectSMS1024);
	}
	
	public void addTouchPointSelectSmsTouchpointFromSheet(String sheet2) throws InterruptedException {
		jswait.loadClick(addTouchpointTouchpointName);
		Thread.sleep(2000);
		eh.setExcelFile("touchpointInputData",sheet2);
		String tp = (String) eh.getCell(1, 0);
		jswait.loadSendKeys(addTouchpointTouchpointName, tp);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='items']/vaadin-combo-box-item[contains(.,'"+tp+"')]")).click();
		
	}
	public void addTouchPointSelectSmsTouchpointFromSheetnewshortcode(String sheet2) throws InterruptedException {
		jswait.loadClick(addTouchpointTouchpointName);
		Thread.sleep(2000);
		eh.setExcelFile("touchpointInputData",sheet2);
		String tp = (String) eh.getCell(1, 0);
		jswait.loadSendKeys(addTouchpointTouchpointName, tp);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='items']/vaadin-combo-box-item[contains(.,'2255-"+tp+"')]")).click();
		
	}
	
	
	public void addTouchPointSelectSmsResponseChannel() throws InterruptedException {
		jswait.loadClick(addTouchpointResponseChannel);
		jswait.loadClick(addTouchpointResponseChannelSelectSMS);
	}
	public void addTouchPointSelectCCResponseChannel() throws InterruptedException {
		jswait.loadClick(addTouchpointResponseChannel);
		jswait.loadClick(addTouchpointResponseChannelSelectCC);
	}
	public void addTouchPointToProgram() throws InterruptedException {
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		addTouchPointSelectSmsTouchpoint();
		addTouchPointSelectSmsResponseChannel();
		jswait.loadClick(addTouchpointSaveButton);
	}
	public void addTouchPointToProgramFromSheet(String sheet) throws InterruptedException {
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		Thread.sleep(2000);
		addTouchPointSelectSmsTouchpointFromSheet(sheet);
		addTouchPointSelectSmsResponseChannel();
		jswait.loadClick(addTouchpointSaveButton);
	}
	public void addTouchPointToProgramFromSheetnewshortcode(String sheet) throws InterruptedException {
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		Thread.sleep(2000);
		addTouchPointSelectSmsTouchpointFromSheetnewshortcode(sheet);
		addTouchPointSelectSmsResponseChannel();
		jswait.loadClick(addTouchpointSaveButton);
	}
	public void addTouchPointToProgramFromSheetForCC(String sheet) throws InterruptedException {
		addTouchPointSelectCCChannel();
		//addTouchPointEnterKeywordAliase();
		Thread.sleep(2000);
		addTouchPointSelectSmsTouchpointFromSheet(sheet);
		addTouchPointSelectCCResponseChannel();
		jswait.loadClick(addTouchpointSaveButton);
	}
	public void addTouchPointToProgramedit() throws InterruptedException {
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		//addTouchPointSelectSmsTouchpoint();
		addTouchPointSelectSmsResponseChannel();
		jswait.loadClick(addTouchpointSaveButton);
	}
	public void Programtouchpointduplicate() throws InterruptedException {
		
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		addTouchPointSelectSmsTouchpoint();
		addTouchPointSelectSmsResponseChannel();
		jswait.loadClick(addTouchpointSaveButton);
		//boolean check =jswait.checkVisible(warningmessage);
		jswait.checkVisible(warningmessage);
			    
				}
	
	
	public void Programsfirstrowbtn() throws InterruptedException {
		jswait.loadClick(programsfrowbtn);
	}
	
	
	public void programofferclick() throws InterruptedException {
		jswait.loadClick(programofferclick);
	}
	public void programofferclear() throws InterruptedException {
		programofferclick.clear();
	}
	
	public void checkboxdaysmonday() throws InterruptedException {
		jswait.loadClick(checkboxdaysmonday);
	}
	
		
	public void pgmfirstofferselect() throws InterruptedException {
		jswait.loadClick(pgmfirstofferselect);
	}
	
	
	public void createProgramTouchpointGridName() throws InterruptedException {
		jswait.loadClick(createProgramTouchpointGridName);
	}

	public void addTouchpointSelectSMS1024() throws InterruptedException {
		jswait.loadClick(addTouchpointSelectSMS1024);
	}

	
	
	public void programschstart() throws InterruptedException {
		jswait.loadClick(programschstart);
	}
	
	public void prmshcselectnow() throws InterruptedException {
		jswait.loadClick(prmshcselectnow);
		
	}
	public void checkprmshcselectnow() throws InterruptedException {
		String str= driver.findElement(By.xpath("//paper-item[contains(.,'Now')]")).getText();
		Assert.assertEquals(str,"Now");
		}
		
	
	//------------------------------------------------------------------------------//
	public void Apiedittouchpoints() throws InterruptedException {
		jswait.loadClick(Apiedittouchpoints);
	}
	
	
	
	
	
	
	
	
	public void programschend() throws InterruptedException {
		jswait.loadClick(programschend);
	}

	public void prmshcselectnoend() throws InterruptedException {
		jswait.loadClick(prmshcselectnoend);
	}

	
	public void programschrefreshcycle() throws InterruptedException {
		jswait.loadClick(programschrefreshcycle);
	}

	public void prmshcselectdays() throws InterruptedException {
		jswait.loadClick(prmshcselectdays);
	}

	public void prmrecycleinputclick() throws InterruptedException {
		jswait.loadClick(prmrecycleinput);
	}

	public void prmrecycleinput() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(prmrecycleinput)).sendKeys(Keys.ARROW_UP);
		}

	public void prmeverylabel() throws InterruptedException {
		jswait.loadClick(prmeverylabel);
		}

		
	public void prmrefreshat() throws InterruptedException {
		jswait.loadClick(prmrefreshat);
		}

	public void pgmtimeokbtn() throws InterruptedException {
		jswait.loadClick(pgmtimeokbtn);
		}
	
	public void programschserveon() throws InterruptedException {
		jswait.loadClick(programschserveon);
		Thread.sleep(2000);
		}

	public void prmshcserveonalldays() throws InterruptedException {
		jswait.loadClick(prmshcserveonalldays);
		}
	
	public void prmstartAt() throws InterruptedException {
		jswait.loadClick(prmstartAt);
		}
	
	
	

	public void prmshcserveonalldayscheck() throws Exception {
		try{
		jswait.checkVisible(prmshcserveonalldays);
		Assert.assertTrue(" worked",true);
		throw Exception;
	  } catch (Exception e){
		  System.out.println("passed");
	   	 }
		}
	
	public void createProgramSaveButton() throws InterruptedException {
		jswait.loadClick(createProgramSaveButton);
		}
	
	public void clickEditProgramSaveButton() throws InterruptedException {
		jswait.checkClickable(editProgramSaveButton);
		jswait.loadClick(editProgramSaveButton);
		}
	
	
	public void programconfirmactivateyes() throws InterruptedException {
		jswait.loadClick(programconfirmactivateyes);
		}
	public void confirmProgramEditSave() throws InterruptedException {
		jswait.loadClick(confirmProgramEditSave);
		}
	
	public void verifyEDitedTouchpoint(String tp) throws InterruptedException {
		
		assertTrue(driver.findElement(By.xpath(".//data-table-cell[contains(.,'"+tp+"')]")).isDisplayed());
	}
	
	public void programactivatebtn() throws InterruptedException {
		jswait.loadClick(programactivatebtn);
		}
	
	public void programsavebutton() throws InterruptedException {
		jswait.loadClick(programsavebutton);
		}
	public void programconfirmSaveyes() throws InterruptedException {
		jswait.loadClick(programconfirmSaveyes);
		}
	public void programtopcancel() throws InterruptedException {
		jswait.loadClick(programtopcancel);
		}
	
	public void prmshcserveonSpecdays() throws InterruptedException {
		jswait.loadClick(prmshcserveonSpecdays);
		}
	
	public void programserveonevery() throws InterruptedException {
		jswait.loadClick(programserveonevery);
		}
	public void programserveoneverydata() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(programserveonevery)).sendKeys(Keys.NUMPAD1);
		}
	
	public void programdayscheck() throws InterruptedException {
//	wait.until(ExpectedConditions.elementSelectionStateToBe(checkboxdaysmonday,true));
		Assert.assertEquals("Monday is not checked",checkboxdaysmonday.getAttribute("checked"), "true");
	}
	
	public void editprogramcheck() throws InterruptedException {
		jswait.checkVisible(editprogramcheck);
		}
	public void touchpointoptions() throws InterruptedException {
		jswait.loadClick(touchpointoptions);
		}
	
	

	public void programTouchpointtab() throws InterruptedException {
		jswait.loadClick(programTouchpointtab);
		}
	
	public void touchpointdelete() throws InterruptedException {
		jswait.loadClick(touchpointdelete);
		}
	
	public void programtimezone() throws InterruptedException {
		jswait.loadClick(programtimezone);
		}
	
	public void programtimezonechange() throws InterruptedException {
		jswait.loadClick(programtimezonechange);
		}
	
	
	
	public void checktouchpoints() throws Exception{
		jswait.checkVisible(warningmessageaddtouchpoint);
		
	}
public void checkproceedtouchpoints() throws Exception{
		
		
		jswait.checkVisible(checktouchpoints);
		//Assert.assertTrue("checkpoint proceed worked", true);
	  
	}


public void touchpointpgmdeletecheck() throws Exception{
	
		jswait.checkVisible(touchpointpgmdeletecheck);
	
}




	public void cancelTouchPointToProgram() throws InterruptedException {
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		addTouchPointSelectSmsTouchpoint();
		addTouchPointSelectSmsResponseChannel();
		jswait.loadClick(touchpointcancel);
	}
	
	
	
	
	public void filterprogramcheck(String name) throws InterruptedException {
		Thread.sleep(5000);
		jswait.checkVisible(filterpgm);
		}
	
	public void refreshatprogramcheck() throws InterruptedException {
		Thread.sleep(5000);
			jswait.checkVisible(prmrefreshat);
			Assert.assertTrue(" worked",true);
				}
	
	public void prmshcserveonSpecificdayscheck() throws Exception {
		Thread.sleep(5000);
		String name2=driver.findElement(By.xpath(".//*[@id='checkboxContainer']//following::div[contains(.,'Monday')]")).getText();
		System.out.println(name2);
		Thread.sleep(5000);
		Assert.assertEquals("Monday", name2);
		}
	public void programtimezonecheck() throws Exception {
		Thread.sleep(5000);
		boolean test=driver.findElement(By.xpath(".//*[@id='items']/vaadin-combo-box-item[contains(.,'Kathmandu')]")).isDisplayed();
	
		}
	
	

	
	
	public void selectOfferCatalogfromsheet(String sheet2) throws InterruptedException {
		
		eh.setExcelFile("offerCatalogInputData",sheet2);
		String offer = (String) eh.getCell(1, 0);
		jswait.loadSendKeys(programofferclick, offer);
		Thread.sleep(3000);
		System.out.println("Offer: "+offer);
		
		try {
		assertTrue(driver.findElement(By.xpath(".//*[@id='items']/vaadin-combo-box-item[contains(.,'"+offer+"')]")).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='items']/vaadin-combo-box-item[contains(.,'"+offer+"')]")).click();
		}
		catch(Exception e) {
			
			
		}
	}

	
	public void programrefreshcyclecheck() throws Exception {
		Thread.sleep(5000);
		
		
		//jswait.checkVisible(prmshcselectweeks);
		//jswait.checkVisible(prmshcselectdays);
		
		try {
			assertTrue(driver.findElement(By.xpath("//paper-item[contains(.,'Weeks')]")).isDisplayed());
			assertTrue(driver.findElement(By.xpath("//paper-item[contains(.,'Days')]")).isDisplayed());
			
			}
			catch(Exception e) {
				
				
			}
		}
	
public void enterProgramDetailsWithDeactivatedProduct(String name, String sheet)throws InterruptedException {
		
		
		enterProgramName(name);
		enterProgramDescription();
		Thread.sleep(4000);
		programofferclick();
		Thread.sleep(4000);
		selectOfferCatalogfromsheet(sheet);
		
	}

public void editProgramDetailsWithDeactivatedProduct(String name, String sheet)throws InterruptedException {
	
	
	
	programofferclick();
	programofferclear();
	Thread.sleep(4000);
	selectOfferCatalogfromsheet(sheet);
	
}
	
	
	
	
	
	
   public void enterProgramDetailsfromSheet(String name, String sheet)throws InterruptedException {
		
		
		enterProgramName(name);
		enterProgramDescription();
		Thread.sleep(4000);
		programofferclick();
		Thread.sleep(4000);
		selectOfferCatalogfromsheet(sheet);
		Thread.sleep(4000);
		clickPorogramProceedButton();
		
		
	}
   public void createNewProgramRuleWithDeactivatedProduct(String name)throws Exception {
		
		clickCreateNewRuleButton();
		//enterRuleName();
		clickSaveRuleButton();
		Thread.sleep(2000);
		clickCustomerListField();
		Thread.sleep(2000);
		selectCustomerList("listname");
		Thread.sleep(2000);
		clickPorogramProceedButton();
		Thread.sleep(2000);
		clickProductField(name);
		verifyProduct(name);
		
		
		
	}
   
   
   
   public void prmstartAtcheck() throws Exception {
		Thread.sleep(5000);
		
		
		//jswait.checkVisible(prmshcselectweeks);
		//jswait.checkVisible(prmshcselectdays);
		
		try {
			jswait.checkVisible(prmstartAt);
			
			}
			catch(Exception e) {
				
				
			}
		}
   
   
   
	public void programmoreoptionscheck() throws Exception {
		Thread.sleep(5000);
		
		
		//jswait.checkVisible(prmshcselectweeks);
		//jswait.checkVisible(prmshcselectdays);
		
		try {
			assertTrue(driver.findElement(By.xpath("//paper-item[contains(.,'Delete')]")).isDisplayed());
			assertTrue(driver.findElement(By.xpath("//paper-item[contains(.,'Edit')]")).isDisplayed());
			
			}
			catch(Exception e) {
				
				
			}
		}
	
	public void programschedulecheck() throws Exception {
		Thread.sleep(5000);
		
		
		//jswait.checkVisible(prmshcselectweeks);
		//jswait.checkVisible(prmshcselectdays);
		
		try {
			assertTrue(driver.findElement(By.xpath(".//*[@id='wizard']/li[contains(.,'Schedule')]")).isEnabled());
			jswait.checkVisible(createProgramSaveButton);
			jswait.checkVisible(createProgramCancelButton);
						
			
			}
			catch(Exception e) {
				
				
			}
		}
	
	
}
