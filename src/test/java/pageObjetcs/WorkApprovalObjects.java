package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
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
import baseClasses.RandomNameGenerator;

public class WorkApprovalObjects extends Init{

	private static final Exception Exception = null;
	CommonObjects commonObjects = new CommonObjects();
	 
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public WorkApprovalObjects() {
		PageFactory.initElements(driver, this);
	}
	
//===========================================================================================================================================================================//
//                                                                           ELEMENTS
//===========================================================================================================================================================================//	
	
	@FindBy(xpath=".//*[@id='programList']")
	private WebElement programList;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Name')]")
	private WebElement programListNameColumn;
	@FindBy(xpath="//label[text()='Configuration']/..")
	private WebElement configuration;
	@FindBy(xpath=".//paper-card[contains(.,'Approval Rules')]")
	private WebElement approvalRules;
	@FindBy(xpath = "//paper-button[contains(.,'Create New Approval Rule')]")
	private WebElement createNewApprovalRuleButton;
	@FindBy(xpath = "//paper-button[contains(.,'Add User')]")
	private WebElement addUserButton;
	@FindBy(xpath = ".//div[@class='heading layout horizontal justified style-scope create-approval-rule']//h4[contains(.,'Untitled Rule')]//paper-icon-button")
	private WebElement editRuleNameButton;
	@FindBy(xpath = ".//div[@class='layout horizontal center end-justified style-scope create-approval-rule']//paper-icon-button[@title='Save']")
	private WebElement saveRuleName;
	
	@FindBy(xpath = ".//div[@class='heading layout horizontal justified style-scope create-approval-rule']//input/../input")
	private WebElement addApprovalRuleName;
	@FindBy(xpath = "//label[contains(.,'Select required')]/../input")
	private WebElement addUserField;
	@FindBy(xpath = "//paper-item[contains(.,'syam.krishna@flytxt.com')]")
	private WebElement ruleUserName;
	@FindBy(xpath = "//paper-item[contains(.,'Recharge')]")
	private WebElement ruleCategory;
	@FindBy(xpath = ".//div[@class='buttons style-scope approver-level-details']//paper-button[contains(.,'Save')]")
	private WebElement addUserSave;
	@FindBy(xpath = ".//div[@class='buttons style-scope create-approval-rule']//paper-button[contains(.,'Save')]")
	private WebElement addCategorySave;
	@FindBy(xpath = "//paper-button[contains(.,'Save')]")
	private WebElement approvalRuleSave;
	@FindBy(xpath = ".//paper-checkbox")
	private List <WebElement> checkboxes;
	@FindBy(xpath = "//paper-button[contains(.,'Add Category')]")
	private WebElement addCategoryButton;
//	@FindBy(xpath = ".//div[@class='input-content label-is-floating style-scope paper-input-container']//iron-icon")
//	private WebElement addCategoryDropdown;
	@FindBy(xpath = ".//label[contains(.,'Select required campaign categories')]//following::iron-icon[1]")
	private WebElement addCategoryDropdown;
	@FindBy(xpath = ".//span[contains(.,'Add Category')]")
	private WebElement paperDialogBox;
	@FindBy(xpath = ".//*[@id='checkboxContainer']//following::div[contains(.,'Campaign Activation')]//following::div[@id='checkboxContainer']")
	private WebElement broadcastpaperDialogBox;
	
	
	@FindBy(xpath = ".//label[contains(.,'Select required campaign categories')]//following::input[1]")
	private WebElement cataloginput;
	
	
	@FindBy(xpath=".//*[@id='deleteApprovalRule']/div/paper-button[contains(.,'Yes')]")
	private WebElement ruledeleteyes;
	@FindBy(xpath=".//*[@id='deleteApprovalRule']/span[contains(.,'Are you sure you want to delete this rule?')]")
	private WebElement deletewaringboxcheck;
	@FindBy(xpath=".//div[@id='levelCheckBox1']//following::iron-icon[1]")
	private WebElement userlevelclosebutton;
	@FindBy(xpath=".//*[@id='toast']//span[contains(.,'Please choose at least one check-box.')]")
	private WebElement warningmessage ;
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
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	
	
	
	
	
	
	public void navigateToConfiguration() throws InterruptedException {
		jswait.loadClick(configuration);
	}
	public void clickApprovalRulesOption() throws InterruptedException {
		jswait.loadClick(approvalRules);
	}
	
	public void createNewApprovalRule(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		enterApprovalRuleDetailsFromSheet(sheet);
		//clickSaveOfferButton();
	}
	
	public void userlevelclosebutton() throws InterruptedException {
		jswait.loadClick(userlevelclosebutton);
	}
	
	
	
	public void enterApprovalRuleDetailsFromSheet(String sheet) throws Throwable {
		
		clickEditRuleNameButton();
		enterRuleName(sheet);
		saveRuleName();
		clickAddUserButton();
		enterLevel1User();
		chooseLevel1User();
		clickAddUserNameSave();
		clickCheckboxes();
		clickAddCategoryButton();
		cataloginput();
		Thread.sleep(2000);
		enterCategory();
		Thread.sleep(2000);
		chooseCategory();
		Thread.sleep(2000);
		clickAddCategorySave();
		clickApprovalRuleSave();
		
	}
	
	public void createNewApprovalRulecheckboxverify(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		clickEditRuleNameButton();
		enterRuleName(sheet);
		saveRuleName();
		userlevelclosebutton();
		clickCheckboxesverify();
		clickAddCategoryButton();
		cataloginput();
		Thread.sleep(2000);
		enterCategory();
		Thread.sleep(2000);
		chooseCategory();
		Thread.sleep(2000);
		clickAddCategorySave();
		clickApprovalRuleSave();
		Thread.sleep(1000);
		clickCheckboxesverifywarning();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='addLevelButton']")).click();
		clickAddUserButton();
		enterLevel1User();
		Thread.sleep(2000);
		chooseLevel1User();
		clickAddUserNameSave();
		clickCheckboxes();
		clickApprovalRuleSave();
		
								
	}
	
	
	
	public void createNewApprovalRule_multiplerule_verify(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		clickEditRuleNameButton();
		enterRuleName(sheet);
		saveRuleName();
		clickAddUserButton();
		enterLevel1User();
		chooseLevel1User();
		clickAddUserNameSave();
		clickAddCategoryButton();
		cataloginput();
		Thread.sleep(2000);
		chooseCategorycheck();
//		Thread.sleep(2000);
//		enterCategory();
//		Thread.sleep(2000);
//		chooseCategory();
//		Thread.sleep(2000);
//		clickAddCategorySave();
//		clickApprovalRuleSave();
//		Thread.sleep(1000);
//			clickCheckboxes();
//		clickApprovalRuleSave();
		
								
	}
	
		
	
	
	
public void editApprovalRuleDetailsFromSheet(String sheet) throws Throwable {
	eh.setExcelFile("appRuleInputData", sheet);
  	String name = (String) eh.getCell(1, 0);
	Thread.sleep(9000);
	filterWorkaround(name);
	Thread.sleep(9000);
	commonObjects.clickOptionsIcon();
	commonObjects.clickEditOption();
	Thread.sleep(5000);
	//WebElement nameclick=driver.findElement(By.xpath("//div[@class='heading layout horizontal justified style-scope create-approval-rule']//h4[contains(.,'"+name+"')]//paper-icon-button"));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='heading layout horizontal justified style-scope create-approval-rule']//h4[contains(.,'"+name+"')]//paper-icon-button"))).click();
	Thread.sleep(2000);
		//clickEditRuleNameButton();
	addApprovalRuleName.clear();
		editRuleName(name);
		saveRuleName();
//		clickAddUserButton();
//		enterLevel1User();
//		chooseLevel1User();
//		clickAddUserNameSave();
		broadcastpaperDialogBox();
//		clickAddCategoryButton();
//		cataloginput();
//		Thread.sleep(2000);
//		enterCategory();
//		Thread.sleep(2000);
//		chooseCategory();
		Thread.sleep(2000);
		//clickAddCategorySave();
		clickApprovalRuleSave();
		
	}






public void deleteApprovalRuleDetailsFromSheet(String sheet) throws Exception {
	eh.setExcelFile("appRuleInputData", sheet);
  	String name = (String) eh.getCell(1, 0);
	Thread.sleep(9000);
	filterWorkaround(name);
	Thread.sleep(9000);
	commonObjects.clickOptionsIcon();
	commonObjects.clickDeleteOption();
	ruledeleteyes(); 
	try {
		filterWorkaround(name);
		
		Boolean n=driver.findElement(By.xpath(".//*[@id='item26']/div[1]/data-table-cell[1]/span[contains(.,'"+name+"')]")).isDisplayed();
		if(n=false) {
		throw Exception;}
	}
	catch (Exception e){
		
		
	}
	Thread.sleep(5000);


}



public void verifydeletecheckbox(String sheet) throws Exception {
	eh.setExcelFile("appRuleInputData", sheet);
  	String name = (String) eh.getCell(1, 0);
	Thread.sleep(9000);
	filterWorkaround(name);
	Thread.sleep(9000);
	
	commonObjects.clickOptionsIcon();
	commonObjects.clickDeleteOption();
	Boolean n=deletewaringboxcheck.isDisplayed();
	try {
		
		if(n=false) {
		throw Exception;}
	}
	catch (Exception e){
		
		
	}
	Thread.sleep(5000);


}

public void deleteApprovalRuleDefault() throws Exception {
	
	Thread.sleep(9000);
	filterWorkaround("Campaigns and Broadcasts");
	commonObjects.clickOptionsIcon();
	Thread.sleep(9000);
	 
	try {
		
		assertTrue(driver.findElement(By.xpath("//paper-item[contains(.,'Edit')]")).isDisplayed());
		Boolean n=driver.findElement(By.xpath("//paper-item[contains(.,'Delete')]")).isDisplayed();
		if(n=true) {
		throw Exception;}
	}
	catch (Exception e){
		
		
	}
	commonObjects.clickEditOption();
	clickApprovalRuleSave();
	Thread.sleep(5000);
	
}



public void ruledeleteyes() throws InterruptedException {
	jswait.loadClick(ruledeleteyes);
}
	public void clickAddUserButton() throws InterruptedException {
		jswait.loadClick(addUserButton);
	}
	
	public void broadcastpaperDialogBox() throws InterruptedException {
		jswait.loadClick(broadcastpaperDialogBox);
	}
	
	public void filterWorkaround(String name) throws InterruptedException {
		  commonObjects.clickFilterIcon();                            //issue in filter
		  commonObjects.clickFilterResetButton();      //issue in filter
		  commonObjects.filterName(name);
		 }
	
	
	public void cataloginput() throws InterruptedException {
				
		String sheet="campaignCategory";
		eh.setExcelFile("campaignCategoryInputData", sheet);
	    
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);
		jswait.loadSendKeys(cataloginput, name);
	}
	
	
	public void chooseCategory() throws InterruptedException {
		String sheet="campaignCategory";
		eh.setExcelFile("campaignCategoryInputData", sheet);
	    
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'"+name+"')]")).click();
		Thread.sleep(2000);
	}
	
	
	
	public void chooseCategorycheck() throws Exception {
		String sheet="campaignCategory";
		eh.setExcelFile("campaignCategoryInputData", sheet);
	    
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);
try {
		Boolean n=driver.findElement(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'"+name+"')]")).isSelected();
		Thread.sleep(2000);
		if(n=true) {
			throw Exception;
		}
		}
catch(Exception e) {
	System.out.println("error:catagory is present");
	
}



	}
	
	public void clickAddCategoryButton() throws InterruptedException {
		jswait.loadClick(addCategoryButton);
	}
	
	public void clickCreateNewApprovalRuleButton() throws InterruptedException {
		jswait.loadClick(createNewApprovalRuleButton);
	}
	
	public void clickEditRuleNameButton() throws InterruptedException {
		jswait.loadClick(editRuleNameButton);
	}
	public void saveRuleName() throws InterruptedException {
		jswait.loadClick(saveRuleName);
	}
	
	public void editRuleName(String name) throws InterruptedException, IOException {
		
	
		name=("edit"+name);
 	    
 	    addApprovalRuleName.clear();
	    jswait.loadSendKeys(addApprovalRuleName, name);
	}
	
	
	public void enterRuleName(String sheet) throws InterruptedException, IOException {
		
		eh.setExcelFile("appRuleInputData", sheet);
//	    Random rn = new Random();
//		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  RandomNameGenerator.getRandomName(name);
 	    eh.setCell(1, 0, name);
 	    addApprovalRuleName.clear();
	    jswait.loadSendKeys(addApprovalRuleName, name);
	}
	public void enterLevel1User() throws InterruptedException {
		
		jswait.loadSendKeys(addUserField, "syam.krishna@flytxt.com");
		Thread.sleep(2000);
	}
	public void enterCategory() throws InterruptedException {
		Thread.sleep(2000);
		jswait.loadClick(addCategoryDropdown);
//		Thread.sleep(2000);
//		jswait.loadClick(addCategoryDropdown);
		
	}
	
	public void clickApprovalRuleSave() throws InterruptedException {
		jswait.loadClick(approvalRuleSave);
		
	}
	
	public void chooseLevel1User() throws InterruptedException {
		jswait.loadClick(ruleUserName);
		Thread.sleep(2000);
	}
	
	public void clickAddUserNameSave() throws InterruptedException {
		jswait.loadClick(addUserSave);
		Thread.sleep(2000);
	}
	
	public void clickAddCategorySave() throws InterruptedException {
		jswait.loadClick(addCategorySave);
		Thread.sleep(2000);
	}
	
	
	
	public void clickCheckboxes() throws InterruptedException {
		if(checkboxes.size()>0) {
			for(WebElement checkbox: checkboxes) {
				jswait.loadClick(checkbox);
			}
		}
	}
	
	
	public void clickCheckboxesverify() throws Exception {
		try {
		if(checkboxes.size()>0) {
			for(WebElement checkbox: checkboxes) {
				jswait.loadClick(checkbox);
				throw Exception;
			}}
		
		}catch(Exception e) {
			System.out.println("checkbox not enabled");
		}
		
		
		
	}
	public void clickCheckboxesverifywarning() throws Exception {
		
		
		boolean n=warningmessage.isDisplayed();
		
		try {
			if(n=false) {
				throw Exception;
			}
			
		}
		catch(Exception e) {
			System.out.println("warning message  not displayed");
		}
		
	}

	
	
	
	
}
