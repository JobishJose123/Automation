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
public class WorkApprovalObjects extends Init{

	private static final Exception Exception = null;
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
	@FindBy(xpath = ".//div[@class='heading layout horizontal justified style-scope create-approval-rule']//input/../input")
	private WebElement addApprovalRuleName;
	@FindBy(xpath = "//label[contains(.,'Select required')]/../input")
	private WebElement addUserField;
	@FindBy(xpath = "//paper-item[contains(.,'ashitha.george@flytxt.com')]")
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
	@FindBy(xpath = ".//div[@class='input-content label-is-floating style-scope paper-input-container']//iron-icon")
	private WebElement addCategoryDropdown;
	@FindBy(xpath = ".//span[contains(.,'Add Category')]")
	private WebElement paperDialogBox;
	
	

	
	
	
	
	
	
	
	
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
	
	public void enterApprovalRuleDetailsFromSheet(String sheet) throws Throwable {
		
		clickEditRuleNameButton();
		enterRuleName(sheet);
		clickAddUserButton();
		enterLevel1User();
		chooseLevel1User();
		clickAddUserNameSave();
		clickCheckboxes();
		clickAddCategoryButton();
		enterCategory();
		chooseCategory();
		clickAddCategorySave();
		clickApprovalRuleSave();
		
	}
	
	public void clickAddUserButton() throws InterruptedException {
		jswait.loadClick(addUserButton);
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
	
	public void enterRuleName(String sheet) throws InterruptedException, IOException {
		
		eh.setExcelFile("appRuleInputData", sheet);
	    Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
 	    eh.setCell(1, 0, name);
 	    addApprovalRuleName.clear();
	    jswait.loadSendKeys(addApprovalRuleName, name);
	}
	public void enterLevel1User() throws InterruptedException {
		jswait.loadSendKeys(addUserField, "ash");
		Thread.sleep(2000);
	}
	public void enterCategory() throws InterruptedException {
		jswait.loadClick(addCategoryDropdown);
		
	}
	
	public void clickApprovalRuleSave() throws InterruptedException {
		jswait.loadClick(approvalRuleSave);
		
	}
	
	public void chooseLevel1User() throws InterruptedException {
		jswait.loadClick(ruleUserName);
		Thread.sleep(2000);
	}
	public void chooseCategory() throws InterruptedException {
		jswait.loadClick(ruleCategory);
		jswait.loadClick(paperDialogBox);
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
	

	
	
	
	
}
