package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
//import junit.framework.Assert;
import org.junit.Assert; 
import pageObjetcs.AdminPageObjects;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.ProductClassesPageObjects;
import pageObjetcs.ProductPage;

public class GenericProductDefinitionSteps extends Init{
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	CommonObjects commonObjects = new CommonObjects();
	OfferPageObjects offerPageObjects= new OfferPageObjects();
	ProductPage productPageObjects= new ProductPage();
	AdminPageObjects adminPageObjects= new AdminPageObjects();
	BroadcastPageObjects bcObjects= new BroadcastPageObjects();
	ProductClassesPageObjects productClassesPageObjects = new ProductClassesPageObjects();
	public GenericProductDefinitionSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^naviagte to product classes")
	public void navigateToProductClasses() throws InterruptedException {
		productClassesPageObjects.navigateToProductClasses();
	}
	public void filterWorkaround(String name) throws InterruptedException {
		commonObjects.clickFilterIcon();                            //issue in filter
		commonObjects.clickFilterResetButton();						//issue in filter
		commonObjects.filterName(name);
	}
	@Then("^create product class and add attributes from \"([^\"]*)\"$")
	public void create_product_class_and_add_attributes_from(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productClassesPageObjects.createProductClass(name, (String) eh.getCell(1, 1));
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickAttributes();
		productClassesPageObjects.addDefaultAttributes();
	}
	@Then("^duplicate \"([^\"]*)\"$")
	public void duplicateProductClass(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickDuplicate();
		productClassesPageObjects.clickCreateProcutClassSave();
	}
	@Then("^verify deactivating product class \"([^\"]*)\"$")
	public void verifyDeactivatingProductClass(String sheet) throws Exception {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name+"_copy");
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickDeactivate();
		jswait.waitUntil("//span[contains(.,'I')]");
	}
	@Then("^verify activating product class \"([^\"]*)\"$")
	public void verifyActivatingProductClass(String sheet) throws Exception {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name+"_copy");
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickActivate();
		jswait.waitUntil("//span[contains(.,'A')]");
	}
	@Then("^verify duplicating attribute of \"([^\"]*)\"$")
	public void verifyDuplicatingAttributeOfProductClass(String sheet) throws Exception {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name+"_copy");
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickAttributes();
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickDuplicate();
		productClassesPageObjects.clickAddAttributeSave();
	}
	@Then("^verify edit attribute$")
	public void verifyEditAttribute() throws Exception {
		jswait.loadClick("//span[contains(.,'copy')]/../..//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
		jswait.loadClick("//span[contains(.,'copy')]/../..//paper-item[contains(.,'Edit')]");
		productClassesPageObjects.enterAttributeName("edit");
		productClassesPageObjects.clickAddAttributeSave();
	}
	@Then("^verify delete attribute$")
	public void verifyDeleteAttribute() throws Exception {
		jswait.loadClick("//span[contains(.,'edit')]/../..//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
		jswait.loadClick("//span[contains(.,'edit')]/../..//paper-item[contains(.,'Delete')]");
		commonObjects.clickConfirmYesButton();
		jswait.waitForInvisibility("//span[contains(.,'edit')]");
	}
	
	@Then("^verify edit product class of \"([^\"]*)\"$")
	public void verifyEditProductClass(String sheet) throws Exception {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name+"_copy");
		jswait.loadClick("//span[contains(.,'copy')]/../..//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
		jswait.loadClick("//span[contains(.,'copy')]/../..//paper-item[contains(.,'Edit')]");
		productClassesPageObjects.enterClassName(name+"_copy"+"_edit");
		productClassesPageObjects.clickCreateProcutClassSave();
	}
	@Then("^delete duplicate of \"([^\"]*)\"$")
	public void deleteProductClass(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name+"_copy");
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickDelete();
		commonObjects.clickConfirmYesButton();
	}
	@Then("^create product class without any attributes from \"([^\"]*)\"$")
	public void createProductClassWithoutAnyAttributes(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productClassesPageObjects.createProductClass(name, (String) eh.getCell(1, 1));
	}
	
	@Then("^create product with attributes from sheet \"([^\"]*)\"$")
	public void createProductWithoutAttributes(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productClassesPageObjects.createProductWithAttributes(name);
	}
	
	@Then("^delete attribute from \"([^\"]*)\"$")
	public void delete_Product_class(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		commonObjects.clickAttributeIcon();
		commonObjects.clickAttributeoptionIcon();
		commonObjects.clickAttributeDeleteIcon();
		commonObjects.clickConfirmYesButton();
		
	}
	@Then("^create new class$")
	public void create_new_class() throws Throwable {
		
	}
	
	@Then("^create product class and number attribute from \"([^\"]*)\"$")
	public void create_product_class_and_number_attribute_from(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productClassesPageObjects.createProductClass(name, (String) eh.getCell(1, 1));
		Thread.sleep(2000);
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickAttributes();
		productClassesPageObjects.addNumberAttributes();
	}
	
	@Then("^create number attribute from \"([^\"]*)\"$")
	public void create_number_attribute_from(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(2000);
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickAttributes();
		//productClassesPageObjects.addNumberAttributes();
		productClassesPageObjects.verifyDefaultValField();
	}
	
	 @Then("^verify attribute created from sheet \"([^\"]*)\"$")
	 public void verifyAttributeCreatedFromSheet(String sheet) throws InterruptedException {
		 Thread.sleep(2000);
		    eh.setExcelFile("attrInputData",sheet);
			String name = (String) eh.getCell(1, 0);
			productClassesPageObjects.verifyAttributeCreatedFromSheet(name);
		 
		 
	 }
	
	@Then("^choose product class and share from \"([^\"]*)\"$")
	public void choose_product_class_and_share_from(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		productClassesPageObjects.clickShare();

	
	}
	
	@Then("^verify product class is displayed is available in the sheet \"([^\"]*)\"$")
	public void verify_product_class_dispalyed(String sheet) throws Throwable {
		eh.setExcelFile("productClassInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name);
		try{
		
		assertTrue(driver.findElement(By.xpath(".//vaadin-combo-box-item[contains(.,'"+name+"')]")).isDisplayed());
		
		}
		catch(Exception e) {
			
			
		}

	
	}
	
	
	
	@Then("^choose a partner and share$") 
	public void choosePartnerAndShare() throws Throwable {
		productPageObjects.sharePartner();
		//productPageObjects.verifySharePartner();
	}
	
	@Then("^check attribute while editing a product$")
	public void EditProductCheck() throws Throwable {
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditProductButton();
		productClassesPageObjects.checkAttributeField();
		commonObjects.clickCancelButton();
		}
	
	@Then("^check attribute while creating a product$")
	public void CreateProductCheck() throws Throwable {
		
		productClassesPageObjects.clickCreateNewProduct();
		productClassesPageObjects.checkAttributeField();
		
		}
	
	@Then("^click on create new ofer button$")
    public void clickCreateNewOfferButton() throws Throwable {
		
		offerPageObjects.clickCreateNewOfferButton();
		Thread.sleep(5000);
		
	}
	
	@Then("^deactivate the product with attributes from sheet \"([^\"]*)\"$")
	public void deactivateProduct(String sheet) throws Throwable {
		
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		Thread.sleep(3000);
		
		if (driver.findElement(By.xpath("//span[contains(.,'"+eh.getCell(1, 0)+"')]")).isDisplayed())
		  {  
			commonObjects.clickOptionsIcon();
			commonObjects.clickDeactivateProductButton();
			
		  }
		
	}
	
	@Then("^navigate to campaign category \"([^\"]*)\"$")
	public void navigateToCampaignCategories(String sheet) throws Throwable {
		
		eh.setExcelFile("campaignCategoryInputData",sheet);
		jswait.scrollAndClick("//iron-scroll-threshold", ".//*[contains(text(),'"+eh.getCell(1, 0)+"')]");		
		}
	
	@Then("^navigate to campaign \"([^\"]*)\"$")
	public void navigateToCampaign(String sheet) throws Throwable {
		
		eh.setExcelFile("campaignInputData",sheet);
		jswait.scrollAndClick("//iron-scroll-threshold", ".//*[contains(text(),'"+eh.getCell(1, 0)+"')]");		
		}
	
	@Then("^click on create button$")
	public void clickcreateBCButton() throws Throwable {
		
		commonObjects.clickcreateBCButton();
	}
	
	@Then("^click on activate button$")
	public void clickActivateBCButton() throws Throwable {
		
		commonObjects.clickActivateBCButton();
		Thread.sleep(3000);
		commonObjects.clickYesBCButton();
	
	}
	@Then("^Change partner$") 
	public void changePartner() throws Throwable {
		productPageObjects.changePartner();
	
}
	@Then("^navigate to product class after changing partner \"([^\"]*)\"$")
    public void navigateToProductClass(String sheet) throws Exception {
		eh.setExcelFile("productClassInputData",sheet);
		try {
		jswait.scrollAndClick("//iron-scroll-threshold", eh.getCell(1, 0).toString());
		
		Assert.assertTrue(false);
		}catch(Exception e) {
			Assert.assertTrue(true);
		}
//		Actions clickAction = new Actions(driver);
//        WebElement scrollablePane = driver.findElement(By.xpath("//iron-scroll-threshold"));
//        clickAction.moveToElement(scrollablePane).click().build().perform();
//        Actions scrollAction = new Actions(driver);
//        for(int i=0;i<50;i++){
//        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//        try{
//        	if(driver.findElement(By.xpath("//h4[contains(.,'"+eh.getCell(1, 0)+"')]"))!=null)
//        	{
//        		System.out.println("Product class is displayed. Not expected");
//        		break;
//        	}
//        	
//        }
//        catch(Exception e){
//        	
//        	System.out.println("Product class is not displayed");
//        	break;
//        }
//        Thread.sleep(1000);
//        }
        
	}
	
	@Then("^navigate to partners$")
	public void navigateToPartnersPage() throws Exception {
		
		adminPageObjects.clickPartnerOption();
		
		}
	
	@Then("^navigate to dashboard page$")
	public void navigateToDashboardPage() throws Exception {
		commonObjects.clickOptionsIcon();
		adminPageObjects.clickEditOption();
		//adminPageObjects.clickDashboardSettingsOption();
		//adminPageObjects.checkStatusTitle();
		}
	
	@Then("^edit partner name from sheet \"([^\"]*)\"$")
	public void editPartnerName(String sheet) throws Exception {
		eh.setExcelFile("partnerInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		adminPageObjects.editPartnerName(name);
		commonObjects.clickFilterIcon();
		commonObjects.clickFilterResetButton();	
		commonObjects.filterPartner(name);
		Thread.sleep(3000);
		
		try
		{
		if(driver.findElement(By.xpath("//data-table-cell [contains(.,'"+eh.getCell(1, 0)+"')]"))!=null)
    	{
    		System.out.println("Partner is displayed. Not expected");
    		
    	}
    	
    }
    catch(Exception e){
    	
    	System.out.println("Partner is not displayed");
    	
    }
	
		}
	
	@Then("^click on options and view broadcast$")
	public void viewBroadcast() throws Exception {
		
		commonObjects.clickOptionsIcon();
		bcObjects.viewBroadcast();
		
	}
	@Then("^verify offer details in create broadcast using offer \"([^\"]*)\" and product \"([^\"]*)\"$")
	public void verify_offer_details_in_create_broadcast_using_offer_and_product_and_bc(String offer, String product) throws Throwable {
		eh.setExcelFile("offerInputData",offer);
	    BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	    broadcastPageObjects.enterBroadcastBasicDetails("tempBC",INVENTORY_UNLIMITED);
	    broadcastPageObjects.clickProceedButton();
	    broadcastPageObjects.selectBaseList(BASE_LIST);
	    broadcastPageObjects.clickProceedButton();
	    broadcastPageObjects.expandOfferInChooseOffers(eh.getCellByColumnName("Offer Name"));
	    offerPageObjects.verifyOfferDetails(offer,product);
	}
	@Then("^test$")
	public void test() throws InterruptedException {
		jswait.loadClick("//paper-button[contains(.,'Create')]");
		jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","First Name_q11");
		jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
		jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
		jswait.loadClick("//paper-item[contains(.,'Normal')]");
		jswait.loadClick("//create-profile//label[text()='Type']/../input");
		jswait.loadClick("//create-profile//paper-item[text()='Text']");
		jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
		
	}
	
//	@Then("^create product class and number attribute from \"([^\"]*)\" with \"([^\"]*)\"$")
//	public void create_product_class_and_number_attribute_from(String sheet,String att) throws Throwable {
//		eh.setExcelFile("productClassInputData",sheet);
//		Random rn = new Random();
//		int  n = rn.nextInt(5000) + 1;
//		String name = (String) eh.getCell(1, 0);
//		name =  name.replaceAll("[0-9]", "")+n;
//		eh.setCell(1, 0, name);
//		productClassesPageObjects.createProductClass(name, (String) eh.getCell(1, 1));
//		Thread.sleep(2000);
//		filterWorkaround(name);
//		commonObjects.clickOptionsIcon();
//		productClassesPageObjects.clickAttributes();
//		productClassesPageObjects.addNumberAttributes2(att);
//	}
	@Then("^navigate to Email Settings$")
	public void navigate_to_Email_Settings() throws Throwable {
		adminPageObjects.emailSettings();
	}

	@Then("^select the \"([^\"]*)\" email option$")
	public void select_the_email_option(String inputoption) throws Throwable {
		adminPageObjects.typeofEmailIntegration(inputoption);
	}

	@Then("^fill from name as \"([^\"]*)\"\\.$")
	public void fill_from_name_as(String fname) throws Throwable {
	   adminPageObjects.fromName(fname);
	}

	@Then("^select the sender route as \"([^\"]*)\"$")
	public void select_the_sender_route_as(String eroute) throws Throwable {
		adminPageObjects.senderRoute(eroute);
	}

	@Then("^save the settings$")
	public void save_the_settings() throws Throwable {
		adminPageObjects.saveEmail();
	}
	
	@Then("^fill the from Email Address as \"([^\"]*)\" and Mandrill API key as \"([^\"]*)\"$")
	public void fill_the_from_Email_Address_as_and_Mandrill_API_key_as(String fromemail, String apikey) throws Throwable {
		adminPageObjects.mandrilldetails(fromemail,apikey);
	}
	
	
	
	
	
	
	
}
