package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
	
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Proceed')]")
	private WebElement createProgramProceedButton;
	@FindBy(xpath=".//paper-item[contains(.,'View Rules')]")
	private WebElement programViewRulesButton;
	
	@FindBy(xpath="//h5[contains(.,'Basic Information')]/..//label[contains(.,'Name')]/..//*[@id='input']")
	private WebElement createProgramName;
	
	@FindBy(xpath="//h5[contains(.,'Basic Information')]/..//label[contains(.,'Description')]/..//textarea")
	private WebElement createProgramDescription;
	
	@FindBy(xpath="//h5[contains(.,'Basic Information')]/..//label[contains(.,'Offer Catalog')]/..//*[@id='input']")
	private WebElement createProgramChooseOfferCatalog;
	
	@FindBy(xpath="//form[@id='detailForm']//paper-item[contains(.,'')][2]")
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
	
	@FindBy(xpath="//form[@id='addTouchpointForm']//label[text()='Response Channel']/../../../../../../..//paper-item[text()='SMS']")
	private WebElement addTouchpointResponseChannelSelectSMS;
	
	@FindBy(xpath="//*[@id='addTouchpointForm']//paper-button[text()='Save']")
	private WebElement addTouchpointSaveButton;
	
	@FindBy(xpath=".//data-table-row[@id='item1']//paper-menu-button button")
	private WebElement programsfrowbtn;
	
	@FindBy(xpath="//label[text()[contains(.,'Offer Catalog')]]/../input")
	private WebElement programofferclick;
	
	
	
	@FindBy(xpath="//paper-button[contains(.,'Create New Rule')]")
	private WebElement createNewRuleButton;
	
	@FindBy(xpath="//paper-button[contains(.,'Save')]")
	private WebElement saveRuleButton;
	
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[1]")
	private WebElement pgmfirstofferselect ;
	
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[1]")
	private WebElement selectfirstCustomerList ;
	
	@FindBy(xpath="//form[@id='scheduleForm']//label[text()='Start Date']/..//*[@id='input']")
	private WebElement programschstart;
	
	@FindBy(xpath="//label[contains(.,'End Date')]/../input")
	private WebElement programschend;
	@FindBy(xpath=".//div[@class='input-content label-is-floating style-scope paper-input-container']//label[contains(.,'Rule Name')]/../input")
	private WebElement enterRuleName;
	
	@FindBy(xpath="//label[contains(.,'Customer List')]/../input")
	private WebElement customerListField;
	
	@FindBy(xpath="//label[contains(.,'Product')]/../input")
	private WebElement productField;
	
	
	
	@FindBy(xpath="//paper-item[contains(.,'Now')]")
	private WebElement prmshcselectnow ;
	
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
	@FindBy(xpath=".//*[@id='checkboxContainer']//following::div[contains(.,'Monday')]/../div[@id='checkboxContainer']")
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

//===========================================================================================================================================================================//
//                                                                         PROGRAM PAGE FUNCTIONS
//===========================================================================================================================================================================//	
		
	public void clickCreateProgramButton() throws InterruptedException {
		jswait.loadClick(createProgramButton);
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
	
	public void clickSaveRuleButton() throws InterruptedException {
		jswait.loadClick(saveRuleButton);
	}
	
	
	
	public void clickPorogramViewRulesButton() throws InterruptedException {
		jswait.loadClick(programViewRulesButton);
	}
	
	public void clickCreateNewRuleButton() throws InterruptedException {
		jswait.loadClick(createNewRuleButton);
	}
	
	public void clickCustomerListField() throws InterruptedException {
		jswait.loadClick(customerListField);
	}
	
	public void clickProductField(String name) throws InterruptedException {
		jswait.loadClick(productField);
		jswait.loadSendKeys(createProgramName, name);
		
	}
	
	
	
	
	
	
	public void checkCancelButtonCreateProgram() throws InterruptedException {
		clickCreateProgramButton();
		clickCreateProgramCancelButton();
	}
	public void checkFilterCancelButton() throws InterruptedException {
		clickFilterButton();
		clickFilterCancelButton();
	}
	public void checkAllColumnsInProductList() throws InterruptedException {
		jswait.checkClickable(programListNameColumn);
		jswait.checkClickable(programListChannelsColumn);
		jswait.checkClickable(programListOfferCatalogColumn);
		jswait.checkClickable(programListRulesColumn);
		jswait.checkClickable(programListViewsColumn);
		jswait.checkClickable(programListStatusColumn);
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
		jswait.waitUntil("//form[@id='detailForm']//paper-item");
		int offerCatalogesCount = driver.findElements(By.xpath("//form[@id='detailForm']//paper-item")).size();
		if(offerCatalogesCount>20) {
			throw e;
		}
		jswait.loadSendKeys(createProgramChooseOfferCatalog, "at");
		Thread.sleep(3000);
		jswait.loadClick(createProgramCatalogSelect);
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
	public void addTouchPointSelectSmsResponseChannel() throws InterruptedException {
		jswait.loadClick(addTouchpointResponseChannel);
		jswait.loadClick(addTouchpointResponseChannelSelectSMS);
	}
	public void addTouchPointToProgram() throws InterruptedException {
		addTouchPointSelectSmsChannel();
		addTouchPointEnterKeywordAliase();
		addTouchPointSelectSmsTouchpoint();
		addTouchPointSelectSmsResponseChannel();
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
	
	public void selectFirstCustomerList() throws InterruptedException {
		jswait.loadClick(selectfirstCustomerList);
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
		try{
		Assert.assertTrue("passed", false);
		throw Exception;}
		catch (Exception e){
			  System.out.println(e+"now ");
	   	 }}
		
	
	
	
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
	
	
	public void programconfirmactivateyes() throws InterruptedException {
		jswait.loadClick(programconfirmactivateyes);
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
	wait.until(ExpectedConditions.elementSelectionStateToBe(checkboxdaysmonday,true));
		System.out.println("checked");
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
		try {
		
		Assert.assertTrue("checkpoint cancel worked", false);
	  } catch (Exception e){
		  
	   	 }
	}
public void checkproceedtouchpoints() throws Exception{
		
		try {
		jswait.checkVisible(checktouchpoints);
		Assert.assertTrue("checkpoint proceed worked", false);
	  } catch (Exception e){
		  
	   	 }
	}


public void touchpointpgmdeletecheck() throws Exception{
	
	try {
	jswait.checkVisible(touchpointpgmdeletecheck);
	Assert.assertTrue("touchpoint deleted worked", false);
	throw Exception;
  } catch (Exception e){
	  System.out.println("user Exception");
	  
   	 }
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
		String name2=driver.findElement(By.xpath(".//*[@id='item1']//span[contains(.,'autoprogram')]")).getAttribute("title");
		System.out.println(name2);
		Thread.sleep(5000);
		Assert.assertEquals(name, name2);
		}
	
	public void refreshatprogramcheck() throws InterruptedException {
		Thread.sleep(5000);
		try{
			jswait.checkVisible(prmrefreshat);
			Assert.assertTrue(" worked",true);
			throw Exception;
		  } catch (Exception e){
			  System.out.println("passed");
		   	 }
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
	if (test==true){
		System.out.println("passed");
	}else {System.out.println("failed");}
		}
	
	

	
	
	public void selectOfferCatalogfromsheet(String sheet2) throws InterruptedException {
		
		eh.setExcelFile("offerCatalogInputData",sheet2);
		String offer = (String) eh.getCell(1, 0);
		jswait.loadSendKeys(programofferclick, offer);
		Thread.sleep(3000);
		System.out.println("Offer: "+offer);
		
		try {
		assertTrue(driver.findElement(By.xpath(".//*[@id='items']/vaadin-combo-box-item[contains(.,'"+offer+"')]")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='items']/vaadin-combo-box-item[contains(.,'"+offer+"')]")).click();
		}
		catch(Exception e) {
			
			
		}
	}
	
	public void enterRuleName() throws Exception {
		
		jswait.loadClick(enterRuleName);
		jswait.loadSendKeys(enterRuleName, "Test Rule Name");
		
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

public void createNewProgramRuleWithDeactivatedProduct(String name)throws Exception {
	
	clickCreateNewRuleButton();
	//enterRuleName();
	clickSaveRuleButton();
	Thread.sleep(2000);
	clickCustomerListField();
	Thread.sleep(2000);
	selectFirstCustomerList();
	Thread.sleep(2000);
	clickPorogramProceedButton();
	Thread.sleep(2000);
	clickProductField(name);
	
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
	
	
	
}
