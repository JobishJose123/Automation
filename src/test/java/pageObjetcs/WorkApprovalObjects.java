package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import stepDefinitions.AddExportLocationSteps;

public class WorkApprovalObjects extends Init{

	private static final Exception Exception = null;
	CommonObjects commonObjects = new CommonObjects();
	CampaignObjects CampaignObjects=new CampaignObjects();
	AddExportLocationSteps AddExportLocationSteps=new AddExportLocationSteps();
	
	
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
	@FindBy(xpath="//div[contains(text(),'Offer Prioritization Logic')]//following::div[3]//iron-icon[1]")
	private WebElement offerlogicclick;
	
	@FindBy(xpath=".//paper-card[contains(.,'Approval Rules')]")
	private WebElement approvalRules;
	@FindBy(xpath = "//paper-button[contains(.,'Create New Approval Rule')]")
	private WebElement createNewApprovalRuleButton;
	@FindBy(xpath = "//paper-button[contains(.,'Add User')]")
	private WebElement addUserButton;
	
	
	@FindBy(xpath = "(//paper-button[contains(.,'Add User')])[2]")
	private WebElement addUserButton2;
	@FindBy(xpath = ".//div[@class='heading layout horizontal justified style-scope create-approval-rule']//h4[contains(.,'Untitled Rule')]//paper-icon-button")
	private WebElement editRuleNameButton;
	@FindBy(xpath = ".//div[@class='layout horizontal center end-justified style-scope create-approval-rule']//paper-icon-button[@title='Save']")
	private WebElement saveRuleName;
	
	@FindBy(xpath = ".//div[@class='heading layout horizontal justified style-scope create-approval-rule']//input/../input")
	private WebElement addApprovalRuleName;
	@FindBy(xpath = "//label[contains(.,'Select required')]/../input")
	private WebElement addUserField;
	@FindBy(xpath = "//paper-item[contains(.,'selenium.flytxt@gmail.com')]")
	private WebElement ruleUserName;
	@FindBy(xpath = "//paper-item[contains(.,'joel.jose@flytxt.com')]")
	private WebElement ruleUserName2;
	
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
	@FindBy(xpath = "//paper-button[@id = 'addLevelButton']")
	private WebElement addLevel;
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
	@FindBy(xpath=".//paper-menu-button[@id='notedropdown']")
	private WebElement seleniumusernotificationclick;
	@FindBy(xpath=".//*[@id='contentWrapper']//paper-button[contains(.,'Review')]")
	private WebElement Notificationreviewbtn;
	@FindBy(xpath="//paper-button[contains(.,'Approve & Activate')]")
	private WebElement ApproveActivatebtn;
	@FindBy(xpath="//paper-button[contains(.,'Approve')]")
	private WebElement Approvebtn;
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Create')]")
	private WebElement Bccreatebtn ;
	@FindBy(xpath=".//*[@id='broadcastSummary']//paper-button[contains(.,'Request Approval')]")
	private WebElement bcRequestApproval;
	@FindBy(xpath=".//paper-dialog[@id='confirmBox']")
	private WebElement confirmbox ;
	@FindBy(xpath=".//paper-dialog[@id='confirmBox']//paper-button[contains(.,'Yes')]")
	private WebElement confirmboxyes;
	@FindBy(xpath="//paper-button[contains(.,'Edit')]")
	private WebElement approvalusereditbtn;
	@FindBy(xpath=".//iron-list[@id='list']/div[1]//span[contains(.,'Submitted for Approval')]")
	private WebElement historystatuscheck;
	
	@FindBy(xpath=".//iron-list[@id='list']/div[1]//span[contains(.,'Approved')]")
	private WebElement historystatuscheckapprove;
	@FindBy(xpath=".//*[@id='chooseHistoryDialog']//paper-button[contains(.,'OK')]")
	private WebElement historyboxokbtn;
	@FindBy(xpath="(.//div[@class='layout vertical left-justified style-scope create-approval-rule']//following::paper-checkbox)[1]")
	private WebElement campaignactivationcheckbox ;
	@FindBy(xpath="(.//div[@class='layout vertical left-justified style-scope create-approval-rule']//following::paper-checkbox)[2]")
	private WebElement broadcastactivationcheckbox ;
//	@FindBy(xpath="//vaadin-grid-table-cell[contains(., 'campaignBC3671')]/../..//vaadin-grid-table-cell[3]//div[contains(@class, 'hexagon-content')]//span[contains(., 'W')]")
//	private WebElement ;
	
	@FindBy(xpath="//paper-button[contains(., 'Reject')]")
	private WebElement rejectButton;
	@FindBy(xpath="//paper-dialog[@id ='approveReject']")
	private WebElement rejectMessagePanel;
	@FindBy(xpath="//paper-dialog[@id ='approveReject' ]//textarea[@id = 'textarea']")
	private WebElement rejectMessage;
	@FindBy(xpath="//paper-dialog[@id ='approveReject' ]//paper-button[contains(., 'Send')]")
	private WebElement sendRejectMessageButton;
	@FindBy(css=".flex.broadcast-view")
	private WebElement heading;
	@FindBy(xpath="//paper-button[contains(., 'Edit')]")
	private WebElement editButton;
	@FindBy(xpath="//h4[@id='headingdet']")
	private WebElement basicDetailsHeading;
	@FindBy(xpath="//h4[@id='heading']")
	private WebElement targetDetailsHeading;
	@FindBy(xpath="//h4[@id='headingoffer']")
	private WebElement offerDetailsHeading;
	@FindBy(xpath="//h4[@id='headingdel']")
	private WebElement deliverDetailsHeading;
	
	
	@FindBy(xpath="//paper-item[contains(.,'Show History')]")
	private WebElement optionsshowhistory;
	@FindBy(xpath="//paper-item[contains(.,'Review')]")
	private WebElement optionsReview;
	
	
	
	
	public void navigateToConfiguration() throws InterruptedException {
		jswait.loadClick(configuration);
	}
	public void navigateToOfferLogic() throws InterruptedException {
		jswait.loadClick(offerlogicclick);
	}
	
	public void creatNewlogic(String logic) throws InterruptedException {
		jswait.loadClick("//paper-icon-button[@icon='filter-list']//iron-icon[@id='icon']");
		commonObjects.enterFilterFormname(logic);
		Thread.sleep(2000);
		commonObjects.clickFilterResetButton();

		//commonObjects.clickFilterIcon();
		jswait.loadClick("//paper-icon-button[@icon='filter-list']//iron-icon[@id='icon']");
		Thread.sleep(2000);
		commonObjects.enterFilterFormname(logic);
		commonObjects.clickFilterApplyButton();
		Thread.sleep(2000);
	try{
		String expected=	driver.findElement(By.xpath("(//span[@class='ellipsis style-scope data-table-cell'])[1]")).getText();
		jswait.loadClick("(//paper-icon-button[@icon='icons:more-vert']//iron-icon)[1]");
		
	}catch(Exception e) {
		jswait.loadClick("//paper-button[text()='Create New Prioritization Logic']");
		jswait.loadSendKeys("//label[text()='Name']//following::input[1]", logic);
		jswait.loadSendKeys("//textarea[@id='textarea']", "create new prioritization Logic");
		jswait.loadClick("//paper-button[text()='Proceed']");
		jswait.loadClick("//label[text()='Prioritization Logic']//following::input[1]");
		jswait.loadClick("//paper-item[text()='Analytics Model']");
		jswait.loadClick("//label[text()='Model']//following::input[1]");
		jswait.loadClick("//paper-item[text()='Adaptive Cognizance']");
		jswait.loadClick("(//paper-button[text()='Save'])[3]");
		jswait.loadClick("//paper-button[text()='Save Logic']");
		jswait.loadClick("//paper-button[text()='Yes']");
	}
		
		}
	
	
	
	public void clickApprovalRulesOption() throws InterruptedException {
		jswait.loadClick(approvalRules);
	}
	public void campaignactivationcheckbox() throws InterruptedException {
		jswait.loadClick(campaignactivationcheckbox);
	}
	public void broadcastactivationcheckbox() throws InterruptedException {
		jswait.loadClick(broadcastactivationcheckbox);
	}
	
	public void clickreviewOption() throws InterruptedException {
		jswait.loadClick(optionsReview);
	}
	
	public void createNewApprovalRule(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		Thread.sleep(3000);
		enterApprovalRuleDetailsFromSheet(sheet);
		//clickSaveOfferButton();
	}
	
	public void userlevelclosebutton() throws InterruptedException {
		jswait.loadClick(userlevelclosebutton);
	}
	
	public void Notificationreviewbtn() throws InterruptedException {
		
	
		jswait.loadClick(Notificationreviewbtn);
	}
	public void ApproveActivatebtn() throws InterruptedException {
		jswait.loadClick(ApproveActivatebtn);
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
	
public void createApprovalRuleDetailsFromSheetWithTwoApprovers(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		clickEditRuleNameButton();
		enterRuleName(sheet);
		saveRuleName();
		clickAddUserButton();
		enterLevel1User();
		Thread.sleep(2000);
		chooseLevel1User();
		clickAddUserNameSave();
		addLevel2Approver();
		clickAddUserButton2();
		enterLevel2User();
		Thread.sleep(2000);
		chooseLevel2User();
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
	
	public void createNewApprovalRulecampaignonly(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		clickEditRuleNameButton();
		enterRuleName(sheet);
		saveRuleName();
		clickAddUserButton();
		enterLevel1User();
		chooseLevel1User();
		clickAddUserNameSave();
		campaignactivationcheckbox();
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
	
	public void createNewApprovalRulebroadcastonly(String sheet) throws Throwable {
		clickCreateNewApprovalRuleButton();
		clickEditRuleNameButton();
		enterRuleName(sheet);
		saveRuleName();
		clickAddUserButton();
		enterLevel1User();
		chooseLevel1User();
		clickAddUserNameSave();
		broadcastactivationcheckbox();
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
	commonObjects.filterName("Campaigns and Broadcasts");
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
	
	public void cataloginputFromExcel() throws InterruptedException {
		
		String sheet="CampaignCategory2";
		eh.setExcelFile("ExportCampaignLocation", sheet);
	    
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);
		jswait.loadSendKeys(cataloginput, name);
	}
	
	public void chooseCategoryFromExcel() throws InterruptedException {
		String sheet="CampaignCategory2";
		eh.setExcelFile("ExportCampaignLocation", sheet);
	    
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'"+name+"')]"))).click();
		//driver.findElement(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'"+name+"')]")).click();
		Thread.sleep(2000);
	}
	
	
	public void chooseCategory() throws InterruptedException {
		String sheet="campaignCategory";
		eh.setExcelFile("campaignCategoryInputData", sheet);
	    
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'"+name+"')]"))).click();
		//driver.findElement(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'"+name+"')]")).click();
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
	public void enterLevel1User() throws Exception {
		String user1 = p.getValue("seleniumUser");
		jswait.loadSendKeys(addUserField, user1);
		Thread.sleep(2000);
	}
	
	public void enterLevel2User() throws Exception {
		String user2 = p.getValue("user2");
		jswait.loadSendKeys(addUserField, user2);
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
	
	
	public void chooseLevel2User() throws Exception {
		String user2 =p.getValue("user2");
		user2=user2.trim();
		System.out.println(user2);
		jswait.loadClick("//paper-item[contains(.,'"+user2+"')]");
		Thread.sleep(2000);
	} 
	public void clickAddUserNameSave() throws InterruptedException {
		Thread.sleep(2000);
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
	
	
	
	
    public void verify_campaign_show_history(String sheet) throws Exception
    {
    	eh.setExcelFile("campaignInputData", sheet);
    	String name = eh.getCell(1, 0).toString();
    	commonObjects.filterName(name);
    	
    	Thread.sleep(5000);
    	
    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
    	CampaignObjects.optionsshowhistory();
    	jswait.loadClick(historyboxokbtn);
    	Thread.sleep(5000);

   	Thread.sleep(3000);
   	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
	CampaignObjects.optionsshowhistory();
	Thread.sleep(5000);

   	try {
    		historystatuscheck.isDisplayed();
    	}catch(Exception e) {
    		Assert.assertTrue(false);
    	}
    	Thread.sleep(2000);
    	jswait.loadClick(historyboxokbtn);
    	
    }
	
    
    
    public void verify_campaign_show_historyapprove(String sheet) throws Exception
    {
    	eh.setExcelFile("campaignInputData", sheet);
    	String name = eh.getCell(1, 0).toString();
    	commonObjects.filterName(name);
    	
Thread.sleep(5000);
    	
    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
    	CampaignObjects.optionsshowhistory();
    	jswait.loadClick(historyboxokbtn);
    	Thread.sleep(5000);

   	Thread.sleep(3000);
   	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
	CampaignObjects.optionsshowhistory();
	Thread.sleep(5000);
    	
    	try {
    		boolean n=historystatuscheckapprove.isDisplayed();
    		System.out.println(n);
    		
    	}catch(Exception e) {
    		Assert.assertTrue(false);
    	}
    	Thread.sleep(2000);
    	jswait.loadClick(historyboxokbtn);
    	
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

	
	
	
	
	
	
	public void requestBCaproveseleniumuser() throws InterruptedException {
		Thread.sleep(2000);
		Bccreatebtn.click();
		bcRequestApproval.click();
		   Thread.sleep(3000);
		   CampaignObjects.firstleveluserselect();
		   CampaignObjects.approvalboxOKbtn();
	}
	
	public void campaignaproveseleniumuser() throws Exception {
//		
		
		Thread.sleep(2000);
//		
//		Notificationreviewbtn();
		ApproveActivatebtn();
		Thread.sleep(2000);
		try {
		boolean n=confirmbox.isDisplayed();
		
		if(n=true) {
			confirmboxyes.click();
			
		}
		}
		catch(Exception e) {
			
		
		}
		Thread.sleep(3000);
		
	}
	public void BCAprovalbyseleniumuser() throws InterruptedException {
		Thread.sleep(2000);
		seleniumusernotificationclick.click();
		Notificationreviewbtn();
		ApproveActivatebtn();
		
	}
	
	public void BCAprovalbyseleniumuserwithoutnotificationclick() throws InterruptedException {
		Thread.sleep(2000);
		eh.setExcelFile("bcInputData", "one-offBC");
    	String name = eh.getCell(1, 0).toString();
    	commonObjects.filterName(name);
    	
    	Thread.sleep(5000);
    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
		Thread.sleep(2000);
    	jswait.loadClick(optionsReview);
		ApproveActivatebtn();
		
	}
	
	
	public void BCeditbyseleniumuser() throws InterruptedException {
		Thread.sleep(2000);
		seleniumusernotificationclick.click();
		Notificationreviewbtn();
		Thread.sleep(3000);
		approvalusereditbtn.click();
		
		
	}
	
	public void clickOnCampaignReviewButton() throws InterruptedException {
		Thread.sleep(5000);
		jswait.loadClick(seleniumusernotificationclick);
		
		Notificationreviewbtn();
		Thread.sleep(2000);
	}
	
	public void isWaitingForApprovalStatusDisplayed(String campaignName) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement approvalStatus = driver.findElement(By.xpath("//vaadin-grid-table-cell[contains(., '"+campaignName+"')]/../..//vaadin-grid-table-cell[3]//div[contains(@class, 'hexagon-content')]//span[contains(., 'W')]"));
		Assert.assertTrue(approvalStatus.isDisplayed());
	}
	public void isRejectedStatusDisplayed(String campaignName) throws InterruptedException
	{
		System.out.println(campaignName);
		Thread.sleep(2000);
		WebElement approvalStatus = driver.findElement(By.xpath("(//vaadin-grid-cell-content[contains(.,'"+campaignName+"')]//following::span[contains(.,'R')]//span[contains(.,'R')])[1]"));
		Thread.sleep(2000);
		Assert.assertTrue(approvalStatus.isDisplayed());
	}
	
	public void isApprovedStatusDisplayed(String campaignName) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement approvalStatus = driver.findElement(By.xpath("//vaadin-grid-table-cell[contains(., '"+campaignName+"')]/../..//vaadin-grid-table-cell[3]//div[contains(@class, 'hexagon-content')]//span[contains(., 'A')]"));
		Thread.sleep(2000);
		Assert.assertTrue(approvalStatus.isDisplayed());
	}
	public void addLevel2Approver() throws InterruptedException {
		jswait.loadClick(addLevel);
	}
	
	public void isApprovedAndActivateButtonDisplayed() throws Exception{
		Thread.sleep(2000);
		Assert.assertTrue(ApproveActivatebtn.isDisplayed());
	}
	
	public void isApprovedButtonDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(Approvebtn));
		Assert.assertTrue(Approvebtn.isDisplayed());
	}
	
	public void clickAddUserButton2() throws InterruptedException {
		jswait.loadClick(addUserButton2);
	}
	
	
	public void approveCampaign() throws Exception {
		Thread.sleep(2000);
		jswait.loadClick(Approvebtn);
		Thread.sleep(2000);
		try {
			boolean isElementDisplayed=confirmbox.isDisplayed();
			
			if(isElementDisplayed) {
				confirmboxyes.click();			
			}
		}
		catch(Exception e) {
			// Do nothing		
		}
		Thread.sleep(3000);		
	}
	
	public void clickOnRejectButton() throws Exception {
		Thread.sleep(2000);
		jswait.loadClick(rejectButton);
		Thread.sleep(2000);
	}
	
	public void verifyRejectMessagePanelDisplayed() throws Exception {
		Thread.sleep(2000);
		Assert.assertTrue(rejectMessagePanel.isDisplayed());
		Thread.sleep(2000);
	}
	
	public void enterRejectMessage(String message)throws Exception {
		Thread.sleep(2000);
		jswait.loadSendKeys(rejectMessage, message);
		Thread.sleep(2000);
		jswait.loadClick(sendRejectMessageButton);
	}
	public void verifyRejectMessage(String campaignName) throws Exception {
		String scrollPanel = "//iron-list[@id='list']";
		jswait.scrollIntoView(scrollPanel, campaignName); 
		WebElement element = driver.findElement(By.xpath("//span[contains(@class, 'notification-listing') and contains(.,'"+campaignName+"') and contains(.,'has been rejected by')]"));
		Thread.sleep(2000);
		Assert.assertTrue(element.isDisplayed());
		Thread.sleep(2000);
	}
	
	public void verifyApprovedMessage(String campaignName) throws Exception {
		String scrollPanel = "//iron-list[@id='list']";
		jswait.scrollIntoView(scrollPanel, campaignName); 
		WebElement element = driver.findElement(By.xpath("//span[contains(@class, 'notification-listing') and contains(.,'"+campaignName+"') and contains(.,'has been approved by')]"));
		Assert.assertTrue(element.isDisplayed());
		Thread.sleep(2000);
	}
	
	public void verifyCampaignReviewPage() throws Exception {
		Thread.sleep(2000);
		//Assert.assertTrue(heading.isDisplayed());
		Assert.assertTrue(Approvebtn.isDisplayed());
		Assert.assertTrue(rejectButton.isDisplayed());
		Assert.assertTrue(editButton.isDisplayed());
		Assert.assertTrue(basicDetailsHeading.isDisplayed());
		Assert.assertTrue(targetDetailsHeading.isDisplayed());
		// Assert.assertTrue(offerDetailsHeading.isDisplayed());
		Assert.assertTrue(deliverDetailsHeading.isDisplayed());
	}
	public void deleteCampaignFromAprovalRule(String campaignName, String appRuleName) throws Exception {
		Thread.sleep(2000);
		filterWorkaround(appRuleName);
		Thread.sleep(9000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='heading layout horizontal justified style-scope create-approval-rule']//h4[contains(.,'"+appRuleName+"')]//paper-icon-button"))).click();
		Thread.sleep(2000);
		deleteCampaignNameInAppRule(campaignName);
		clickAddCategoryButton();
		cataloginputFromExcel();
		enterCategory();
		Thread.sleep(2000);
		chooseCategoryFromExcel();
		clickAddCategorySave();
		clickApprovalRuleSave();
	}
	
	public void deleteCampaignNameInAppRule(String campaignName) throws InterruptedException {
		WebElement closeButton = driver.findElement(By.xpath("//span[contains(., '"+campaignName+"')]/../paper-icon-button[1]"));
		jswait.loadClick(closeButton);
	}
	
	public void isRenderScheduledStatusDisplayed(String campaignName) throws InterruptedException
	{
		WebElement approvalStatus = driver.findElement(By.xpath("//vaadin-grid-table-cell[contains(., '"+campaignName+"')]//following::vaadin-grid-cell-content[contains(.,'Render')]"));
		Assert.assertTrue(approvalStatus.isDisplayed());
	}
	public void verifyHistoryandReview(String sheet) throws InterruptedException
	{
		eh.setExcelFile("campaignInputData", sheet);
    	String name = eh.getCell(1, 0).toString();
    	commonObjects.filterName(name);
    	
    	Thread.sleep(5000);
    	
    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
    	Thread.sleep(3000);
    	
    	try {
    		boolean n=optionsshowhistory.isDisplayed();
    		boolean m=optionsReview.isDisplayed();
    		
    		
    	}catch(Exception e) {
    		Assert.assertTrue(false);
    	}
    	Thread.sleep(2000);
    	
	}
	public void verifyBCStatusWaitingForApproval(String bcName) throws Exception{
		Thread.sleep(2000);
		WebElement approvalStatus = driver.findElement(By.xpath("//vaadin-grid-table-cell[contains(., '"+bcName+"')]//following::vaadin-grid-cell-content[contains(.,'Waiting for Approval')]"));
		Thread.sleep(2000);
		Assert.assertTrue(approvalStatus.isDisplayed());
		
	}
	
}
