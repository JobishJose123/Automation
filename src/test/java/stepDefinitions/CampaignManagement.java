package stepDefinitions;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.TimePicker;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.LoginPageObjects;

public class CampaignManagement extends Init{
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eM = new ExcelHelper(); 
	CampaignObjects campaignObjects = new CampaignObjects();
	CommonObjects commonObjects = new CommonObjects();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	LoginPageObjects loginPage = new LoginPageObjects();
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
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		String catalog = (String) catalogExcel.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
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
	    	 Thread.sleep(2000);
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
	    	commonObjects.filterName(name);
	    	
//	    	Thread.sleep(30000);//NX-8537 bug wait
	    	
	    	jswait.loadClick(".//vaadin-grid-cell-content[contains(.,'"+name+"')]//following::*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
			campaignObjects.clickOptionsViewBroadcasts();
	    }
	    @Then("^click create new broadcast button$")
	    public void create_new_broadcast_button() throws Throwable
	    {
	    	campaignObjects.clickCreateNewBroadcastButton();
	    	Thread.sleep(3000);
	    }
	    @Then("^navigate to campaign categories$")
	    public void navigateToCampaignCategory() throws Throwable
	    {
	    	campaignObjects.navigateToCampaignCategories();
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
	    
}
