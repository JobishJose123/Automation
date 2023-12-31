package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimePicker;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.WorkApprovalObjects;

public class CampaignManagement extends Init{
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eM = new ExcelHelper(); 
	CampaignObjects campaignObjects = new CampaignObjects();
	CommonObjects commonObjects = new CommonObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	LoginPageObjects loginPage = new LoginPageObjects();
	WorkApprovalObjects WorkApprovalObjects=new WorkApprovalObjects();
	public CampaignManagement() {
		PageFactory.initElements(driver, this);
	}

	 @Then("^create new campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void create_new_campaign(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  RandomNameGenerator.getRandomName(name);
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaign(name, catalog);

//	    	 
//	    	 List<WebElement> condition_form = driver.findElements(By.xpath("//target-form/form/condition-form"));
//	    	 System.out.println(condition_form.size());
//	    	 condition_form.get(0).click();
//	    	 String condition_input_xpath = "//target-form/form/condition-form[1]//input";
//	    	 List<WebElement> condition_inputs = driver.findElements(By.xpath(condition_input_xpath));
//	    	 String xpath = "";
//	    	 condition_inputs = driver.findElements(By.xpath(condition_input_xpath));
//	    	 System.out.println("size:"+condition_inputs.size());
//	    	 System.out.println("get value:"+condition_inputs.get(condition_inputs.size()-1));
//	    	 condition_inputs.get(condition_inputs.size()-1).click();
//	    	 Thread.sleep(4000);
//	    	 int i = condition_inputs.get(condition_inputs.size()-1).toString().indexOf("xpath:");
//	    	 i+=7;
//	    	 xpath = condition_inputs.get(condition_inputs.size()-1).toString().substring(i);
//	    	 xpath = xpath.substring(0, xpath.length()-1);
//	    	 xpath = xpath+"/../../../../../../..//paper-item";
//	    	 System.out.println(xpath);
//	    	 driver.findElement(By.xpath(xpath)).click(); 
//	    	 Thread.sleep(4000);
//	    	 condition_inputs = driver.findElements(By.xpath(condition_input_xpath));
//	    	 System.out.println("size:"+condition_inputs.size());
//	    	 System.out.println("get value:"+condition_inputs.get(condition_inputs.size()-1));
//	    	 condition_inputs.get(condition_inputs.size()-1).click();
//	    	 Thread.sleep(4000);
//	    	 i = condition_inputs.get(condition_inputs.size()-1).toString().indexOf("xpath:");
//	    	 i+=7;
//	    	 xpath = condition_inputs.get(condition_inputs.size()-1).toString().substring(i);
//	    	 xpath = xpath.substring(0, xpath.length()-1);
//	    	 xpath = xpath+"/../../../../../../..//paper-item";
//	    	 System.out.println(xpath);
//	    	 driver.findElement(By.xpath(xpath)).click(); 
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 //-------------------------------------------------------//
	 
	 @Then("^create new campaign from sheet for approval \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void create_new_campaign_approval(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  RandomNameGenerator.getRandomName(name);
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaignfroapproval(name, catalog);
   	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 @Then("^create new campaign from sheet for approval \"([^\"]*)\" with catalog \"([^\"]*)\" with two approvers$")
	    public void create_new_campaign_approval_with_two_approvers(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  RandomNameGenerator.getRandomName(name);
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaignfroapprovalWithTwoLvelUsers(name, catalog);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //-----------------------------------------------------------------------//
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @Then("^create new campaign from sheet with add AND option \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void create_new_campaign_with_add_AndOption(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaignWithAddAndOption(name, catalog);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 
	 
	 @Then("^create new campaign from sheet with add multiple AND option \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void create_new_campaign_with_add_Multiple_And_Option(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaignWithAddMultipleAndOption(name, catalog);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 
	 
	 
	 @Then("^edit campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void editCampaign(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		commonObjects.clickOptionsIcon();
	 		campaignObjects.clickEditCampaignOption();
	 		campaignObjects.editCampaign(name+" Edited", catalog);
	 		//eM.setCell(1, 0, name+" Edited");
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	 		eM.setCell(1, 0, name+" Edited");
	    	Thread.sleep(2000);
	    }
	 
	 
	 
	 
	 @Then("^edit campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\" for use template$")
	    public void editCampaignForUseTemplate(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		commonObjects.clickOptionsIcon();
	 		campaignObjects.clickEditCampaignOption();
	 		campaignObjects.editCampaignForUseTemplate(name+" Edited", catalog);
	 		eM.setCell(1, 0, name+" Edited");
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 
	 @Then("^verify edited campaign from sheet \"([^\"]*)\"$")
	    public void verifyEditedCampaign(String sheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		commonObjects.filterName(name);
	 		commonObjects.clickOptionsIcon();
	    }
	 
	 
	 
	 
	 @Then("^edit campaign from sheet by approve user \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void editCampaignbyapproveuser(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
 		commonObjects.clickOptionsIcon();
 		WorkApprovalObjects.clickreviewOption();
	 		campaignObjects.clickEditCampaignApprovalButton();
	 		campaignObjects.editCampaignselsuer(name+"Editedbyseluser", catalog);
	 		eM.setCell(1, 0, name+" Editedbyseluser");
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 
	 @Then("^edit target conditions for campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void editTargetConditionsForCampaign(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		commonObjects.clickOptionsIcon();
	 		campaignObjects.clickEditCampaignOption();
	 		campaignObjects.editTargetConditionsForCampaign(name+" Edited", catalog);
	 		eM.setCell(1, 0, name+" Edited");
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	 
	 
	 
	 @Then("^create new campaign use template from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void createNewCampaignUseTemplate(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		//campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaignUseTemplate(name, catalog);
//	 		TimePicker dt = new TimePicker();
//	 		dt.gteDateTime();
//	    	 Thread.sleep(2000);
	    }
	 
	 
	 @Then("^create new template from sheet \"([^\"]*)\"$")
	    public void create_new_template(String sheet) throws Throwable
	    {
	    	
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignTemplateInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewTemplateButton();
	 		campaignObjects.createCampaignTemplate(name);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	 Thread.sleep(2000);
	    }
	 
	 @Then("^create new template customer insight condition type from sheet \"([^\"]*)\"$")
	    public void create_new_template_with_customer_insight(String sheet) throws Throwable
	    {
	    	
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignTemplateInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewTemplateButton();
	 		campaignObjects.createCampaignTemplateWithCustomerInsight(name);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	 Thread.sleep(2000);
	    }
	 
	 @Then("^create new template from sheet with add AND option \"([^\"]*)\"$")
	    public void create_new_template_with_add_and_option(String sheet) throws Throwable
	    {
	    	
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignTemplateInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewTemplateButton();
	 		campaignObjects.createCampaignTemplateWithAddAnd(name);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    
	    }
	 
	 
	 @Then("^verify template created from sheet \"([^\"]*)\"$")
	    public void VerifyTemplateCreated(String sheet) throws Throwable
	    {
	    	
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignTemplateInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		campaignObjects.VerifyTemplateCreated(name);
	    	 Thread.sleep(2000);
	    }
	 
	 @Then("^verify campaign created from sheet \"([^\"]*)\"$")
	    public void VerifyCampaignCreated(String sheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		campaignObjects.VerifyCampaignCreated(name);
	    	 Thread.sleep(4000);
	    }
	 
	 @Then("^verify template edited from sheet \"([^\"]*)\"$")
	    public void VerifyTemplateEdited(String sheet) throws Throwable
	    {
	    	
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignTemplateInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		campaignObjects.VerifyTemplateCreated(name);
	    	 Thread.sleep(2000);
	    }
	 
	 
	 
	 
	 @Then("^create duplicate campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void create_duplicate_campaign(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 	    //Random rn = new Random();
	 		//int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		//name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.createCampaign(name, catalog);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	 Thread.sleep(2000);
	    	 campaignObjects.verifyDuplicateCampaignNameToast();
	    
	    }
	 @Then("^navigate to life cycle marketing$")
		public void naviagte_to_life_cycle_marketing() throws Exception
		{
		 	campaignObjects.navigateToLIfeCycleMarketing();
		}
	 
	 @Then("^click on use template button$")
		public void clickOnUseTemplateButton() throws Exception
		{
		 	campaignObjects.clickOnUseTemplateButton();
		}
	 
	 
	    @Then("^navigate to \"([^\"]*)\" category$")
	    public void navigate_to_category(String category) throws Throwable
	    {
	    	jswait.scrollAndClick("//campaign-category-chart", "//div[text()='"+category+"']");
	    }
	    @Then("^naigate to \"([^\"]*)\" campaign view broadcasts$")
	    public void navigateToCampaign(String sheet) throws Throwable
	    {
	    	eM.setExcelFile("campaignInputData", sheet);
	    	String name = eM.getCell(1, 0).toString();
	    	System.out.println(name);
	    	commonObjects.filterName(name);
	    	
//	    	Thread.sleep(30000);//NX-8537 bug wait
	    	
	    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
			campaignObjects.clickOptionsViewBroadcasts();
			
	    }
	    
	    
	    
	    @Then("^find template from sheet \"([^\"]*)\"$")
	    public void findTemplateFromSheet(String sheet) throws Throwable
	    {
	    	eM.setExcelFile("campaignInputData", sheet);
	    	String name = eM.getCell(1, 0).toString();
	    	Thread.sleep(3000);
	    	commonObjects.filterNameEnv(name);
	    	
//	    	Thread.sleep(30000);//NX-8537 bug wait
	    	
	    }
	    
	    
	    @Then("^check category while click on use template$")
	    public void checkCategoryWhileClickOnUseTemplate() throws Throwable {
	    	
	    	campaignObjects.clickOnUseTemplateButton();
	    	eM.setExcelFile("CategoryEnv2", "category");
	    	String name = eM.getCell(1, 0).toString();
	    	campaignObjects.checkCategoryName(name);
	    	
	    	
	    }
	    
	    @Then("^check usage metric KPI showing while click on use template option$")
	    public void checkUsageMetricKPIShowingWhileClickOnUseTemplateOption() throws Throwable {
	    	
	    	campaignObjects.clickOnUseTemplateButton();
	    	
	    	campaignObjects.enterCampaignDeailsForExportCampaign();
	    	
	    	
	    }
	    
	    
	    @Then("^veify imported campaign template conditions are same after importing$")
	    public void veifyImportedCampaignTemplateConditionsAreSameAfterImporting() throws Throwable {
	    	
	    	campaignObjects.clickOnUseTemplateButton();
	    	
	    	campaignObjects.enterCampaignDeailsForCompareTargetConditions();
	    	
	    	
	    }
	    
	    
	    
	    @Then("^clear campaign name field$")
	    public void clearCampaignNameField() throws Throwable {
	    	
	    	campaignObjects.clearCampaignNameField();
	    	
	    }
	    
	    
	    
	    
	    
	    
	    @Then("^create campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\" for use template$")
	    public void createCampaignForUseTemplate(String sheet,String catalogSheet) throws Throwable {
	    	
	    	campaignObjects.clickOnUseTemplateButton();
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  RandomNameGenerator.getRandomName(name);
	 		eM.setCell(1, 0, name);
	 		campaignObjects.createCampaignForUseTemplate(name, catalog);
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    
	    	
	    	
	    }
	    
	    
	    
	    @Then("^choose export to location option from sheet \"([^\"]*)\"$")
	    public void chooseExportToLocationOption(String sheet) throws Throwable
	    {
	    	eM.setExcelFile("campaignInputData", sheet);
	    	String name = eM.getCell(1, 0).toString();
	    	commonObjects.filterName(name);
	    	
//	    	Thread.sleep(30000);//NX-8537 bug wait
	    	
	    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
			campaignObjects.clickOptionsExportToLocation();
	    }
	    
	    @Then("^check export to location option available for campaign from sheet \"([^\"]*)\"$")
	    public void checkExportToLocationOptionAvailableForCampaign(String sheet) throws Throwable
	    {
	    	eM.setExcelFile("campaignInputData", sheet);
	    	String name = eM.getCell(1, 0).toString();
	    	commonObjects.filterName(name);
	    	
//	    	Thread.sleep(30000);//NX-8537 bug wait
	    	
	    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
			campaignObjects.checkExportToLocationOptionAvailableForCampaign();
	    }
	    @Then("^click create new broadcast button$")
	    public void create_new_broadcast_button() throws Throwable
	    { Thread.sleep(3000);
	    	campaignObjects.clickCreateNewBroadcastButton();
	    	Thread.sleep(3000);
	    }
	    @Then("^navigate to campaign categories$")
	    public void navigateToCampaignCategory() throws Throwable
	    {
	    	campaignObjects.navigateToCampaignCategories();
	    }
	    
	    @Then("^navigate to campaign Attributes$")
	    public void navigate_to_campaign_Attributes() throws Throwable {
	    	campaignObjects.navigateToCampaignAttributes();
	    	
	    }
	    
	    @Then("^navigate to broadcast Attributes$")
	    public void navigate_to_broadcast_Attributes() throws Throwable {
	    	campaignObjects.navigateToBroadcastAttributes();
	    }
	    @Then("^create new campaign Attributes \"([^\"]*)\"$")
	    public void create_new_campaign_Attributes(String attributename) throws Throwable {
	    	campaignObjects.createNewCampaignAttributes(attributename);
	    }
	    
	    @Then("^create new broadcast Attributes \"([^\"]*)\"$")
	    public void create_new_broadcast_Attributes(String attributename) throws Throwable {
	    	campaignObjects.createNewBroadcastAttributes(attributename);
	    }
	    
	    @Then("^verify toast message after successful export of a campaign$")
	    public void verifyToastMessageAfterSuccessfulExportOfCampaign() throws Throwable
	    {
	    	campaignObjects.verifyToastMessageAfterSuccessfulExportOfCampaign();
	    }
	    
	    
	    
	    @Then("^verify toast message after successful export of a campaign template$")
	    public void verifyToastMessageAfterSuccessfulExportOfCampaignTemplate() throws Throwable
	    {
	    	campaignObjects.verifyToastMessageAfterSuccessfulExportOfCampaignTemplate();
	    }
	    
	   
	    @Then("^verify toast message after successful import of a campaign$")
	    public void verifyToastMessageAfterSuccessfulImportOfCampaign() throws Throwable
	    {
	    	campaignObjects.verifyToastMessageAfterSuccessfulImportOfCampaign();
	    }
	    
	    
	    
	    
	   
	    @Then("^create new campaign category from sheet \"([^\"]*)\"$")
	    public void create_new_campaign_category_from_sheet(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	    	Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		campaignObjects.createNewCampaignCategory(name);
	    }
	    @Then("^navigate to campaign category from sheet \"([^\"]*)\"$")
	    public void navigate_to_campaign_category_from_sheet(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	    	String name = (String) eM.getCell(1, 0);
	    	campaignObjects.scrollToCampaignCategory(name);
	    	//campaignObjects.campaigncategoryTopTag();
	    }
	    
	    
	    @Then("^navigate to export campaign location from sheet \"([^\"]*)\" and click edit button$")
	    public void navigate_to_export_campaign_location_from_sheet_and_edit(String sheet) throws Throwable {
	    	eM.setExcelFile("ExportCampaignLocation",sheet);
	    	String name = (String) eM.getCell(1, 0);
	    	campaignObjects.scrollToExportCampaignLocationAndClickEditButton(name);
	    }
	    
	    
	    
	    
	    @Then("^navigate to export campaign location from sheet \"([^\"]*)\" and click delete button$")
	    public void navigate_to_export_campaign_location_from_sheet_and_delete(String sheet) throws Throwable {
	    	eM.setExcelFile("ExportCampaignLocation",sheet);
	    	String name = (String) eM.getCell(1, 0);
	    	campaignObjects.scrollToExportCampaignLocationAndClickDeleteButton(name);
	    	campaignObjects.deleteExportLocationYesButton();
	    
	    }
	    
	    
	    
	    @Then("^navigate to templates tab$")
	    public void navigate_to_templates_tab() throws Throwable {
	    	
	    	campaignObjects.clickCampaignTemplateTab();
	    	Thread.sleep(2000);
	    }
	    
	    
	    @Then("^create new campaign category without adding name$")
	    public void createCampaignCategoryWithoutName() throws Throwable {
	    	campaignObjects.createNewCampaignCategory("");
	    	campaignObjects.enterCategoryName("new");
	    }
	    @Then("^verify campaign count from sheet \"([^\"]*)\"$")
	    public void verifyCampaignCount(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	    	String name = (String) eM.getCell(1, 0);
	    	campaignObjects.scrollToViewCampaignCategory(name);
	    	String campCount = driver.findElement(By.xpath("//div[text()='"+name+"']/../../../..//span[contains(.,'Campaigns')]/../../span")).getText();
	    	Assert.assertTrue(campCount.contentEquals("0"), "Invalid count displayed(0)");
	    	campaignObjects.scrollToCampaignCategory(name);
	    	create_new_campaign("campaignBC","defaultCatalog");
	    	campaignObjects.navigateToLIfeCycleMarketing();
	    	campaignObjects.scrollToViewCampaignCategory(name);
	    	campCount = driver.findElement(By.xpath("//div[text()='"+name+"']/../../../..//span[contains(.,'Campaigns')]/../../span")).getText();
	    	Assert.assertTrue(campCount.contentEquals("1"), "Invalid count displayed(1)");
	    }
	    @Then("^verify campaign template count from sheet \"([^\"]*)\"$")
	    public void verifyCampaignTemplateCount(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	    	String name = (String) eM.getCell(1, 0);
	    	campaignObjects.scrollToViewCampaignCategory(name);
	    	String campCount = driver.findElement(By.xpath("//div[text()='"+name+"']/../../../..//span[contains(.,'Templates')]/../../span")).getText();
	    	Assert.assertTrue(campCount.contentEquals("0"), "Invalid count displayed(0)");
	    	campaignObjects.scrollToCampaignCategory(name);
	    	campaignObjects.createCampaignTemplate(name+"template");
	    	campaignObjects.navigateToLIfeCycleMarketing();
	    	campaignObjects.scrollToViewCampaignCategory(name);
	    	campCount = driver.findElement(By.xpath("//div[text()='"+name+"']/../../../..//span[contains(.,'Templates')]/../../span")).getText();
	    	Assert.assertTrue(campCount.contentEquals("1"), "Invalid count displayed(1)");
	    }
	    @Then("^verify options of category$")
	    public void verifyOptionsOfCategory() throws Throwable {
	    	commonObjects.clickOptionsIcon();
	    }
	    @Then("^edit campaign category from sheet \"([^\"]*)\"$")
	    public void editCampaign_category_from_sheet(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		commonObjects.filterName(name);
	 		commonObjects.clickOptionsIcon();
	 		commonObjects.clickEditOption();
	 		campaignObjects.enterCategoryName(name+"edit");
	 		campaignObjects.clickCreateCategorySaveButton();
	 		commonObjects.filterName(name+"edit");
	 		commonObjects.clickOptionsIcon();
	    }
	   
	    
	    @Then("^delete campaign category from sheet \"([^\"]*)\"$")
	    public void deleteCampaign_category_from_sheet(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		commonObjects.filterName(name);
	 		commonObjects.clickOptionsIcon();
	 		commonObjects.clickDeleteOption();
	 		commonObjects.filterName(name);
	 		try {
	 			commonObjects.clickOptionsIcon();
	 			Assert.assertTrue(false, "Campaign Category not deleted");
	 		}catch(Exception e)
	 		{
	 			
	 		}
	    }
	    @Then("^check delete campaign category with linked campaigns from sheet \"([^\"]*)\"$")
	    public void deleteCampaign_categoryWithCampaigns_from_sheet(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignCategoryInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		commonObjects.filterName(name);
	 		commonObjects.clickOptionsIcon();
	 		commonObjects.clickDeleteOption();
	 		commonObjects.filterName(name);
	 		try {
	 			commonObjects.clickOptionsIcon();
	 			
	 		}catch(Exception e)
	 		{
	 			Assert.assertTrue(false, "Campaign Category with linked campaigns deleted");
	 		}
	    }
	    
	    @Then("^edit campaign template from sheet \"([^\"]*)\"$")
	    public void editCampaignTemplateFromSheet(String sheet) throws Throwable {
	    	eM.setExcelFile("campaignTemplateInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		campaignObjects.clickOptionsIcon();
//	 		Thread.sleep(3000);
	 		campaignObjects.clickEditOption();
	 		Thread.sleep(2000);
	 		campaignObjects.editCaampaignTemplateDetails(name+"edit");
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    	String nameEdited=name+"edit";
	    	eM.setCell(1, 0, nameEdited);
	 		
	    }
	    
	    @Then("^edit target conditions for a template from sheet$")
	    public void editTargetConditionForATemplate() throws Throwable {
	    	
	 		campaignObjects.clickOptionsIcon();
//	 		Thread.sleep(3000);
	 		campaignObjects.clickEditOption();
	 		Thread.sleep(2000);
	 		campaignObjects.editTargetConditionForATemplate();
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    	
	 		
	    }
	    
	    
	    @Then("^verify filter for campaign from sheet \"([^\"]*)\"$")
	    public void verifyFilterForCampaignFromSheet(String sheet) throws InterruptedException {
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	    	commonObjects.clickFilterIcon();                            //issue in filter
			commonObjects.clickFilterResetButton();						//issue in filter
			commonObjects.filterName(name);
	    }

	    
	    
	    @Then("^delete target conditions for template$")
	    public void deletTargetTemplateFromSheet() throws Throwable {
	 		campaignObjects.clickOptionsIcon();
//	 		Thread.sleep(3000);
	 		campaignObjects.clickEditOption();
	 		Thread.sleep(2000);
	 		campaignObjects.deleteTargetTemplateFromSheet();
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	    
	    @Then("^click on campaign  to verify expanding the campaign row from sheet \"([^\"]*)\"$")
	    public void click_on_campaign(String sheet) throws Throwable
	    {
	    	Thread.sleep(3000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		campaignObjects.click_on_campaign_and_verify_row(name);
	    }
	    
	    @Then("^verify targeted customers label and count$")
	    public void verifyTargetdCustomersLabelAndCount() throws Throwable
	    {
	
	 		campaignObjects.verifyTargetdCustomersLabelAndCount();
	    }
	    
	    @Then("^delete target conditions for campaign$")
	    public void deleteTargetConditionForCampaign() throws Throwable
	    {
	    	commonObjects.clickOptionsIcon();
//	 		Thread.sleep(3000);
	 		campaignObjects.clickEditCampaignOption();
	 		Thread.sleep(2000);
	 		campaignObjects.deleteTargetConditionForCampaign();
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	    @Then("^delete textual target conditions for campaign$")
	    public void deleteTextualTargetConditionForCampaign() throws Throwable
	    {
	    	commonObjects.clickOptionsIcon();
//	 		Thread.sleep(3000);
	 		campaignObjects.clickEditCampaignOption();
	 		Thread.sleep(2000);
	 		campaignObjects.deleteTextualTargetConditionForCampaign();
	 		TimePicker dt = new TimePicker();
	 		dt.gteDateTime();
	    	Thread.sleep(2000);
	    }
	    
	    
	    @Then("^verify number of offers while create new campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void verifyNumberOfOffersWhileCreateCampaign(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.verifyNumberOfOffersWhileCreateCampaign(name, catalog);
 
	    }
	    
	    
	    @Then("^verify pause and resume option for campaign$")
	    public void verifyPauseAndResumeForCampaign() throws Throwable
	    {
	    	campaignObjects.verifyStatusOfCampaign();
	 		
	    }
	    
	    @Then("^verify pause for campaign$")
	    public void verifyPauseOptionForCampaign() throws Throwable
	    {
	    	campaignObjects.verifyPauseOptionForCampaign();
	 		
	    }
	    
	    
	    @Then("^verify the duplicate option for the added virtual condition while creating new campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
	    public void VerifyDuplicateOptionForAdedVirtualConditions(String sheet, String catalogSheet) throws Throwable
	    {
	    	Thread.sleep(4000);
	    	ExcelHelper catalogExcel = new ExcelHelper();
	    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
	    	Thread.sleep(4000);
	    	eM.setExcelFile("campaignInputData",sheet);
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  RandomNameGenerator.getRandomName(name);
	 		campaignObjects.clickCreateNewCampaignButton();
	 		campaignObjects.VerifyDuplicateOptionForAdedVirtualConditions(name, catalog);
	 		
	    }
	    
	    

		 @Then("^verify abort option for campaign$")
		    public void abortCampaign() throws Throwable
		    {
		 		campaignObjects.abortCampaign();
		
		    }
		 
		 @Then("^verify delete option for campaign$")
		    public void deleteCampaign() throws Throwable
		    {
		 		campaignObjects.deleteCampaign();
		
		    }
		 
		 @Then("^verify deleted campaign from sheet \"([^\"]*)\"$")
		    public void verifyDeletedCampaign(String sheet) throws Throwable
		    {
			    
		    	Thread.sleep(4000);
		    	eM.setExcelFile("campaignInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		campaignObjects. verifyDeletedCampaign(name);
		    }
		 
		 @Then("^pause campaign from sheet \"([^\"]*)\"$")
		    public void pauseCampaign(String sheet) throws Throwable
		    {
		    	Thread.sleep(2000);
		    	eM.setExcelFile("campaignInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		commonObjects.filterName(name);
		 		campaignObjects.verifyStatusBeforePause();
				commonObjects.clickOptionsIcon();
				campaignObjects.clickPauseCampaignOption();
				campaignObjects.clickConfirmPauseYes();
		    }
		 @Then("^verify activating bc in paused campaign$")
		    public void verifyActivatingBcInPausedCampaign() throws Throwable
		    {
			 	Exception ex = new Exception("Activate button available even after campaign pause");
			   BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
			   try{
				   broadcastPageObjects.clickCreateButton();
					broadcastPageObjects.clickActivateButton();
					broadcastPageObjects.clickActivateConfirmYes();
					Thread.sleep(10000);
				   throw ex;
			   }catch(Exception e) {
				   
			   }
		    }
	    
		 
		 
		 @Then("^click on use template button from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
			public void clickOnUseTemplateButton(String sheet, String fileName) throws Exception
			{
		 		ExcelHelper excelHelper = new ExcelHelper();
		 		excelHelper.setExcelFile(fileName, sheet);
			 	campaignObjects.clickOnUseTemplateButton((String)excelHelper.getCell(1, 0));
			}

		 @Then("^create new template from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void create_new_template(String sheet, String fileName) throws Throwable
		    {
		    	
		    	Thread.sleep(4000);
		    	eM.setExcelFile(fileName,sheet);
		 		String name = RandomNameGenerator.getRandomName((String) eM.getCell(1, 0));
		 		eM.setCell(1, 0, name);
		 		campaignObjects.clickCreateNewTemplateButton();
		 		campaignObjects.createCampaignTemplate(name);
		 		TimePicker dt = new TimePicker();
		 		dt.gteDateTime();
		    	Thread.sleep(2000);
		    }

		    @Then("^create new campaign category from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void create_new_campaign_category_from_sheet_of_file(String sheet, String fileName) throws Throwable {
		    	eM.setExcelFile(fileName,sheet);
		 		String name = RandomNameGenerator.getRandomName((String) eM.getCell(1, 0));
		 		eM.setCell(1, 0, name);
		 		campaignObjects.createNewCampaignCategory(name);
		    }
		    
		    
		    @Then("^choose export location for campaign from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void chooseExportLocationForCampaign(String sheet, String fileName) throws Throwable {
		    	eM.setExcelFile(fileName,sheet);
		    	String name = (String) eM.getCell(1, 0);
		 		campaignObjects.chooseExportLocationForCampaign(name);
		    }
		    
		    @Then("^navigate to campaign category from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void navigate_to_campaign_category_from_sheet_of_file(String sheet, String fileName) throws Throwable {
		    	eM.setExcelFile(fileName,sheet);
		    	String name = (String) eM.getCell(1, 0);
		    	campaignObjects.scrollToCampaignCategory(name);
		    }
		    
		    
		    @Then("^select a category and import$")
		    public void selectCategoryAndImport() throws Throwable {
		    	
		    	campaignObjects.selectCategoryAndImport();
		    }
		    
		    @Then("^click import button without selecting campaign category$")
		    public void clickImportButtonWithoutSelectingACampaignCategory() throws Throwable {
		    	
		    	campaignObjects.clickImportButtonWithoutSelectingACampaignCategory();
		    }
		    
		    


		    @Then("^click on export location option of template from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void clickExportLocationOnCampaignTemplate(String sheet, String fileName) throws Throwable
		    {
		    	Thread.sleep(4000);
		    	eM.setExcelFile(fileName,sheet);
		 		String name = (String) eM.getCell(1, 0);
		    	campaignObjects.clickOnTemplatesExportToLocationOption(name);	 		
		    }
		    
		    @Then("^click on export location option of campaign from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void clickExportLocationOnCampaign(String sheet, String fileName) throws Throwable
		    {
		    	Thread.sleep(4000);
		    	eM.setExcelFile(fileName,sheet);
		 		String name = (String) eM.getCell(1, 0);
		    	campaignObjects.clickOnCampaignExportToLocationOption(name);	 		
		    }
		    
		    @Then("^verify the location name from sheet \"([^\"]*)\" of file \"([^\"]*)\" can be selected from the drop down$")
		    public void verifyLocationNameInDropDown(String sheet, String fileName) throws Throwable
		    {
		    	Thread.sleep(4000);
		    	eM.setExcelFile(fileName,sheet);
		 		String locationName = (String) eM.getCell(1, 0);
		    	campaignObjects.verifyLocationNameInDropDown(locationName);	 		
		    }
		    
		    @Then("^verify whether Graphical conditions in target conditions are working properly from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
		    public void VerifyGraphicalConditionsInTargetConditionsAreWorkingProperly(String sheet, String catalogSheet) throws Throwable
		    {
		    	Thread.sleep(4000);
		    	ExcelHelper catalogExcel = new ExcelHelper();
		    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
		    	Thread.sleep(4000);
		    	eM.setExcelFile("campaignInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		String catalog = (String) catalogExcel.getCell(1, 0);
		 		name =  RandomNameGenerator.getRandomName(name);
		 		campaignObjects.clickCreateNewCampaignButton();
		 		campaignObjects.VerifyGraphicalConditionsInTargetConditionsAreWorkingProperly(name, catalog);
		 		
		    }
		    
		    @Then("^verify target status of bc$")
		    public void verifyTargetStatusOfBC() throws Throwable
		    {
		    	
		    	campaignObjects.verifyTargetStatusOfBC();	 		
		    }
		    
		    @Then("^create new campaign from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
		    public void create_new_campaign_from_file(String sheet, String fileName) throws Throwable
		    {
		    	Thread.sleep(4000);
		    	eM.setExcelFile(fileName, sheet);
		    	Thread.sleep(4000);
		 		String name = RandomNameGenerator.getRandomName((String) eM.getCell(1, 0));
		 		String catalog = (String) eM.getCell(2, 0);
		 		eM.setCell(1, 0, name);
		 		campaignObjects.clickCreateNewCampaignButton();
		 		campaignObjects.createCampaign(name, catalog);

		    }
		    
		    
		    
		    
		    @Then("^create new campaign with unique KPI from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
		    public void create_new_campaign_with_unique_KPI_from_sheet_with_catalog(String sheet, String catalogSheet) throws Throwable {
		      
		    	
		    	Thread.sleep(4000);
		    	ExcelHelper catalogExcel = new ExcelHelper();
		    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
		    	Thread.sleep(4000);
		    	eM.setExcelFile("campaignInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		String catalog = (String) catalogExcel.getCell(1, 0);
		 		name =  RandomNameGenerator.getRandomName(name);
		 		eM.setCell(1, 0, name);
		 		campaignObjects.clickCreateNewCampaignButton();
		 		campaignObjects.createCampaignWithUniqueKPI(name, catalog);
		    	
		    	
		    }
		    
		    
		    
		    
		    
		    @Then("^create new campaign with usage metric from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
		    public void create_new_campaign_with_usage_metric_from_sheet_with_catalog(String sheet, String catalogSheet) throws Throwable {
		      
		    	
		    	Thread.sleep(4000);
		    	ExcelHelper catalogExcel = new ExcelHelper();
		    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
		    	Thread.sleep(4000);
		    	eM.setExcelFile("campaignInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		String catalog = (String) catalogExcel.getCell(1, 0);
		 		name =  RandomNameGenerator.getRandomName(name);
		 		eM.setCell(1, 0, name);
		 		campaignObjects.clickCreateNewCampaignButton();
		 		campaignObjects.createCampaignWithUsageMetric(name, catalog);
		    	
		    	
		    }
		    
		    
		    @Then("^create new campaign with customer location insight from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
		    public void create_new_campaign_with_customer_location_insight_from_sheet_with_catalog(String sheet, String catalogSheet) throws Throwable {
		      
		    	
		    	Thread.sleep(4000);
		    	ExcelHelper catalogExcel = new ExcelHelper();
		    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
		    	Thread.sleep(4000);
		    	eM.setExcelFile("campaignInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		String catalog = (String) catalogExcel.getCell(1, 0);
		 		name =  RandomNameGenerator.getRandomName(name);
		 		eM.setCell(1, 0, name);
		 		campaignObjects.clickCreateNewCampaignButton();
		 		campaignObjects.createCampaignWithCustomerLocationInsight(name, catalog);
		    	
		    	
		    }
		    
		    
		    
		    
		   @Then("^map to the native condition$")
		   public void map_to_the_native_condition() throws Throwable {
			   
			   campaignObjects.map_to_the_native_condition();
			   
			   
		   }
		   
		   @Then("^map to the native condition from sheet \"([^\"]*)\"$")
		   public void map_to_the_native_condition_from_sheet(String sheet) throws Throwable {
			    Thread.sleep(4000);
		    	eM.setExcelFile("usageMetricInputData",sheet);
		 		String name = (String) eM.getCell(1, 0);
		 		eM.setCell(1, 0, name);
			   campaignObjects.map_to_the_native_condition_from_sheet(name);
			   
			   
		   }
		   
		   @Then("^verify texts of KPI  conditions before and after mapping$")
		   public void verifyTextsOfKPIConditionsBeforeAndAfterMapping() throws Throwable {
			   
			   campaignObjects.verifyTextsOfKPIConditionsBeforeAndAfterMapping();
			   
			   
		   }
		    
		    
		    
			 @Then("^resume campaign from sheet \"([^\"]*)\"$")
			    public void resumeCampaign(String sheet) throws Throwable
			    {
			    	Thread.sleep(2000);
			    	eM.setExcelFile("campaignInputData",sheet);
			 		String name = (String) eM.getCell(1, 0);
			 		commonObjects.filterName(name);
			 		campaignObjects.verifyStatusAfterPause();
					commonObjects.clickOptionsIcon();
					campaignObjects.clickResumeCampaignOption();
					campaignObjects.clickConfirmResumeYes();
			    }
		    @Then("^verify whether validation messasge for invalid usag metric shown$")
		    public void verifyValidationErrorOfUsageMetrics() throws Throwable
		    {
		    	
		    	Thread.sleep(4000);
		    	campaignObjects.verifyColorOfKPIConditionText();
		    	
		    	
		    }
		    
		    
		    @Then("^verify color of KPI condition box after successful mapping$")
		    public void verifyColorOfKPIConditionBoxAfterSuccessfulMapping() throws Throwable
		    {
		    	
		    	Thread.sleep(4000);
		    	campaignObjects.verifyColorOfKPIConditionTextAfterMapping();
		    	
		    	
		    }
		    @Then("^verify descrption of graphical condition on mouse hover$")
		    public void verifyThisCase() throws Throwable
		    {
		    	commonObjects.clickOptionsIcon();
		    	commonObjects.clickEditOption();
		    	campaignObjects.clickProceedButton();
		    	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		    	targetConditionObjects.clickTargetConditionViewToggle();
		    	Thread.sleep(3000);
		    	 WebElement element = driver.findElement(By.xpath("//div[@id='graph-holder']/div/div"));
		    	 
		         Actions action = new Actions(driver);
		  
		         action.moveToElement(element).build().perform();
		         
		       jswait.waitUntil("//div[@id='tooltip']/*[contains(.,'Customer Profile Info')]");
		       jswait.waitUntil("//div[@id='tooltip']/*[contains(.,'Age_q11')]");
		       jswait.waitUntil("//div[@id='tooltip']/*[contains(.,'is greater than')]");
		       jswait.waitUntil("//div[@id='tooltip']/*[contains(.,'18')]");
		    }
		    
		    @Then("^navigate to campaign category and check template count from sheet \"([^\"]*)\"$")
		    public void navigate_to_campaign_category_from_sheet_and_check_count(String sheet) throws Throwable {
		    	eM.setExcelFile("campaignCategoryInputData",sheet);
		    	String name = (String) eM.getCell(1, 0);
		    	campaignObjects.scrollToCampaignCategoryAndCheckCount(name);
		    }
		    
		    
		    
		    @Then("^verify converted customers label and count$")
		    public void verifyConvertedCustomersLabelAndCount() throws Throwable
		    {
		
		 		campaignObjects.verifyConvertedCustomersLabelAndCount();
		    }
		    
		    
		    
		    @Then("^verify import button is disabled$")
		    public void verifyImportButtonDisabled() throws Throwable
		    {
		
		 		campaignObjects.verifyImportButtonDisabled();
		    }
		    
		    
		    @Then("^verify select category error message$")
		    public void verifySelectACategoryErrorMessage() throws Throwable
		    {
		
		 		campaignObjects.verifySelectACategoryErrorMessage();
		    }
		    
		    
		    @Then("^verify validation message for import page$")
		    public void verifyValidationErrorMessageForImport() throws Throwable
		    {
		
		 		campaignObjects.verifyValidationErrorMessageForImport();
		    }
		    
		    
		    @Then("^verify edit option for campaign template$")
		    public void verifyEditOptionForCampainTemplate() throws Throwable
		    {
		
		 		campaignObjects.verifyEditOptionForCampainTemplate();
		    }
		    
		    
		    
		    @Then("^check import status for campaign template$")
		    public void checkImportStatusOfCampainTemplate() throws Throwable
		    {
		
		 		campaignObjects.checkImportStatusOfCampainTemplate();
		    }
		    
		    
		    @Then("^click export location option for campaign template$")
		    public void clickExportLocationOptionForCampainTemplate() throws Throwable
		    {
		
		 		campaignObjects.clickExportLocationOptionForCampainTemplate();
		    }
		    
		  
		    
		    
		    @Then("^verify toast message for successful creation of export location$")
		    public void verifyToastMessageForSucessfulCreationOfExportLocation() throws Throwable
		    {
		
		 		campaignObjects.verifyToastMessageForSucessfulCreationOfExportLocation();
		    
		    }
		    
		    
		    @Then("^edit export campaign location name$")
		    public void editExportCampaignLocationName() throws Throwable
		    {
		
		 		campaignObjects.editExportCampaignLocationName();
		    
		    }
		    
		    
			 @Then("^click on Campaign edit button from sheet \"([^\"]*)\"$")
			    public void clickCampaignEditOption(String sheet) throws Throwable
			    {
			    	Thread.sleep(2000);
			    	eM.setExcelFile("campaignInputData",sheet);
			 		String name = (String) eM.getCell(1, 0);
			 		commonObjects.filterName(name);
			 		commonObjects.clickOptionsIcon();
			 		campaignObjects.clickEditCampaignOption();
			    }
			 
				@Then("^edit the campaign with taget condition (.*)$")
				public void edit_the_campaign_with_taget_condition(String condition) throws Throwable {
					System.out.println(condition);
					Thread.sleep(3000);
					broadcastPageObjects.clickProceedButton();
					Thread.sleep(3000);
					broadcastPageObjects.editingTheBCTargetConditionDetails(condition);
					broadcastPageObjects.clickProceedButton();
					campaignObjects.enterCampaignStartTime();
					campaignObjects.clickSaveCampaignButton();
				}
				 @Then("^click on Campaign view button from sheet \"([^\"]*)\"$")
				    public void clickCampaignViewOption(String sheet) throws Throwable
				    {
				    	Thread.sleep(2000);
				    	eM.setExcelFile("campaignInputData",sheet);
				 		String name = (String) eM.getCell(1, 0);
				 		commonObjects.filterName(name);
				 		commonObjects.clickOptionsIcon();
						broadcastPageObjects.clickBroadcastViewOption();
						Thread.sleep(2000);				 		
				    }
				 @Then("^select the user for bc approval$")
				    public void bcApprovalByBothUser() throws Exception{
				    	Thread.sleep(2000);
				    campaignObjects.selectBothUserForBCApproval();
				 }
				 @Then("^create new recurring campaign from sheet \"([^\"]*)\" with catalog \"([^\"]*)\"$")
				    public void create_new_recurring_campaign(String sheet, String catalogSheet) throws Throwable
				    {
				    	Thread.sleep(4000);
				    	ExcelHelper catalogExcel = new ExcelHelper();
				    	catalogExcel.setExcelFile("offerCatalogInputData", catalogSheet);
				    	Thread.sleep(4000);
				    	eM.setExcelFile("campaignInputData",sheet);
				 		String name = (String) eM.getCell(1, 0);
				 		String catalog = (String) catalogExcel.getCell(1, 0);
				 		name =  RandomNameGenerator.getRandomName(name);
				 		eM.setCell(1, 0, name);
				 		campaignObjects.clickCreateNewCampaignButton();
				 		campaignObjects.createRecurringCampaign(name, catalog);


				 		TimePicker dt = new TimePicker();
				 		dt.gteDateTime();
				    	Thread.sleep(2000);
				    }
				 @Then("^edit the campaign recurrece from sheet \"([^\"]*)\"$")
				    public void clickCampaignRecurrence(String sheet) throws Throwable
				    {
				    	Thread.sleep(2000);
						campaignObjects.enterCampaignDescription("EDITED Campaign to check bc creation in selenium");
						campaignObjects.clickProceedButton();
						campaignObjects.clickProceedButton();
						campaignObjects.enterCampaignStartTime();
						campaignObjects.editCampaignRecurringDetails();	
						campaignObjects.clickSaveCampaignButton();
						
				    }
				 
				 @Then("^verify the campaign recurrece from sheet \"([^\"]*)\"$")
				    public void verifyCampaignRecurrence(String sheet) throws Throwable
				    {   
				    	Thread.sleep(2000);
				    	campaignObjects.verifyCampaignview();						
				    }
				
				 @Then("^abort campaign from sheet \"([^\"]*)\"$")
								 public void abort_campaign_from_sheet(String campaignSheet) throws Throwable {
									 eM.setExcelFile("campaignInputData", campaignSheet);
									 String campaignName=eM.getCellByColumnName("Campaign Name");
									 campaignObjects.abortCampaign(campaignName);
								    
								 }
								 
 @Then("^wait until campaign from sheet \"([^\"]*)\" status is \"([^\"]*)\"$")
 public void wait_until_campaign_from_sheet_status_is(String campaignSheet, String statusExpected) throws Throwable {
eM.setExcelFile("campaignInputData", campaignSheet);
String campaignName=eM.getCellByColumnName("Campaign Name");
commonObjects.filterName(campaignName);
commonObjects.toggleAutoRefresh();
Thread.sleep(2000);
String campaignStatus = campaignObjects.getStatusOfCampaign(campaignName);
TimeoutImpl t = new TimeoutImpl();
t.startTimer();
while (!campaignStatus.contains(statusExpected) && t.checkTimerMin(5)) {
campaignStatus = campaignObjects.getStatusOfCampaign(campaignName);
System.out.println(campaignStatus);
Thread.sleep(3000);
}
Thread.sleep(3000);
Assert.assertTrue(campaignStatus.contains(statusExpected));
}
								 
@Then("^verify \"([^\"]*)\" status is in show history$")
public void verify_status_is_in_show_history(String statusShown) throws Exception {
campaignObjects.showHistoryDetailsOfCampaign(statusShown);
}
								 
@Then("^create new approval rule from sheet \"([^\"]*)\" with campaign category from sheet \"([^\"]*)\"$")
public void create_new_approval_rule_from_sheet_with_camapign_category_from_sheet(String approvalSheet, String campaignSheet) throws Exception {
eM.setExcelFile("appRuleInputData", approvalSheet);
String approvalname = (String) eM.getCell(1, 0);
approvalname =  RandomNameGenerator.getRandomName(approvalname);
eM.setCell(1, 0, approvalname);
eM.setExcelFile("campaignCategoryInputData", campaignSheet);
String campaignname = (String) eM.getCell(1, 0);
campaignObjects.newApprovalForCampaignHistory(approvalname,campaignname);
				                 	    
}
 @Then("^navigate to campaign template$")
public void navigate_to_campaign_template() throws Throwable {
campaignObjects.navigateToCampaigTemplate();
}
@Then("^enter the details of campaign template from sheet \"([^\"]*)\" and save$")
public void enter_the_details_of_campaign_template_from_sheet_and_save(String campaignSheet) throws Exception {
		eM.setExcelFile("campaignInputData", campaignSheet);	
		String campaignTemplateName=(String) eM.getCell(1, 0);
		campaignTemplateName=RandomNameGenerator.getRandomName(campaignTemplateName);
		eM.setCell(1, 0,campaignTemplateName );
		campaignObjects.detailsOfCampaignTemplate(campaignTemplateName);
 }
@Then("^filter the campaign template from sheet \"([^\"]*)\"$")
public void filter_the_campaign_template_from_sheet(String campaignSheet) throws Throwable {
	eM.setExcelFile("campaignInputData", campaignSheet);	
	String campaignTemplateName=(String) eM.getCell(1, 0);
	commonObjects.filterTemplate(campaignTemplateName);
}
@Then("^edit the campaign template with target condition (.*)$")
public void edit_the_campaign_template_with_target_condition(String condition) throws Throwable {
	commonObjects.clickOptionsIcon2();
	commonObjects.clickEditOption2();
	campaignObjects.editTargetConditionOfCampaignTemplate(condition);
	
}
@Then("^verify the camapign template edited with condition (.*) are reflected$")
public void verify_campaign_template_edited_(String condition) throws Exception{
	campaignObjects.verifyCampaignTemplateTaregetCondition(condition);
}
@Then("^add campaign from sheet \"([^\"]*)\" to sheet \"([^\"]*)\" and row \"([^\"]*)\"$")
public void add_campaign_from_sheet_to_sheet_and_row(String campaignSheet, String campaignStorageSheet, int row) throws Throwable {
	eM.setExcelFile("campaignInputData", campaignSheet);
	String CampaignName= eM.getCellByColumnName("Campaign Name");
	campaignObjects.addCampaignDetails(CampaignName,campaignStorageSheet,row);
}

@Then("^filter the campaign from sheet \"([^\"]*)\" from row \"([^\"]*)\" and column \"([^\"]*)\" and write in sheet \"([^\"]*)\"$")
public void filter_the_campaign_from_sheet_from_row_and_column_and_write_in_sheet(String campaignStorageSheet, int row, int col, String campaignSheet) throws Throwable {
	eM.setExcelFile("BambooBuildDetails", campaignStorageSheet);
	String campaignName=(String) eM.getCell(row, col);
	eM.setExcelFile("campaignInputData", campaignSheet);
	eM.setCell("Campaign Name", campaignName);
}
}

