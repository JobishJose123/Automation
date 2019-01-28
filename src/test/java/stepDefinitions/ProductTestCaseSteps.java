package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.ProductPage;

public class ProductTestCaseSteps extends Init{
	JSWaiter jswait = new JSWaiter();
	CommonObjects commonObjects = new CommonObjects();
	ProductPage productPage = new ProductPage();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	WebDriverWait wait = new WebDriverWait(driver, 5);
	public ExcelHelper eh = new ExcelHelper();	
	@Then("^click create new product button$")
    public void clickCreateNewProduct() throws AWTException, InterruptedException, IOException {
		productPage.clickCreateNewProduct();
	}
	@Then("^navigate to prepaid telecom$")
    public void clickPrepaidTelecom() throws AWTException, InterruptedException, IOException {
		productPage.clickPrepaidTelecom();
	}
	@Then("^enter product details from sheet \"([^\"]*)\"$")
    public void enterProductDetailsFromSheet(String sheet) throws AWTException, InterruptedException, IOException {
		eh.setExcelFile("productInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		name= n+name;
		eh.setCell(1, 0, name);
		productPage.enterProductDetails(name,"Open Market",sheet);
	}
	@Then("^save product$")
    public void clickSaveProductButton() throws AWTException, InterruptedException, IOException {
		productPage.clickCreateProductSaveButton();
	}
	
	@Then("^create single product from sheet \"([^\"]*)\"$")
    public void singleProduct(String sheet) throws AWTException, InterruptedException, IOException {
		eh.setExcelFile("productInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productPage.enterProductDetails(name,"Open Market",sheet);
		productPage.clickCreateProductSaveButton();
	}
	
	@Then("^create new product from sheet \"([^\"]*)\"$")
    public void newProduct(String sheet) throws AWTException, InterruptedException, IOException {
		eh.setExcelFile("inputData",sheet);
//		int rows = eh.numRows();
		//for(int i=1;i<rows;i++){
			Thread.sleep(3000);
			Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "");
		name= n+name;
		eh.setCell(1, 0, name);
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Product Name')]/..//input"))).sendKeys(name);
		Thread.sleep(400);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='textarea']"))).sendKeys(eh.getCell(1, 1));
		Thread.sleep(400);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Category')]/..//input"))).click();
		Thread.sleep(400);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-item[contains(.,'"+eh.getCell(1, 2)+"')]"))).click();
		Thread.sleep(400);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Validity')]/..//input"))).sendKeys(eh.getCell(1, 3));
		Thread.sleep(400);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Price')]/..//input"))).sendKeys(eh.getCell(1, 4));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Processing Fee')]/..//input"))).sendKeys(eh.getCell(1, 5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(.,'Service Tax')]/following::input[1]"))).sendKeys(eh.getCell(1, 6));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Short Description')]/..//input"))).sendKeys(eh.getCell(1, 7));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Usage Leg')]/..//input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-item[contains(.,'"+eh.getCell(1, 8)+"')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Type')]/..//input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-item[contains(.,'"+eh.getCell(1, 9)+"')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Value')]/..//input"))).sendKeys(eh.getCell(1, 10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='form']/..//paper-button[contains(.,'Save')]"))).click();
		Thread.sleep(2000);
		Exception e = new Exception("Product not saved");
		try{
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Value')]/..//input"))).sendKeys("223");
			System.out.println("fail");
			throw e;
			}
		catch(Exception e1)
		{
			
		}		
		//}
	}
	@Then("^delete product from sheet \"([^\"]*)\"$")
    public void deleteProduct(String sheet) throws Exception {
		eh.setExcelFile("productInputData",sheet);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		Exception e = new Exception("product not deleted");
		commonObjects.filterName(eh.getCell(1, 0).toString());
		productPage.clickProductGridOptions();
		productPage.clickProductDeleteButton();
		productPage.clickDeleteConfirmYes();
		Thread.sleep(2000);
		commonObjects.filterName(eh.getCell(1, 0).toString());
		try{
			productPage.clickProductGridOptions();
			Assert.assertTrue(false,"Product not deleted");
		}catch(Exception e1){

		}
	}
	@Then("^enter special characters for name and validate$")
    public void enterSpecialCharacterForName() throws AWTException, InterruptedException {
		char[] specialChars = {';','>','\'','\"','+','*','{','}','$','%'};
		productPage.enterProductDetails("SpecialCharTest<","Open Market");
		for(int i=0;i<=4;i++){
		productPage.enterCreateProductName("SpecialCharTest"+specialChars[i]);	
		productPage.clickCreateProductSaveButton();
		}
	}
	@Then("^enter valid details and click cancel$")
    public void enterDetailAndCancel() throws AWTException, InterruptedException {
		productPage.enterProductDetails("CancelProduct","Open Market");
		productPage.clickCreateProductCancelButton();
	}
	@Then("^check if product is saved after cancel$")
    public void checkIfOfferExists() throws Exception {
		commonObjects.filterName("CancelProduct");
		try{
			Assert.assertFalse(jswait.checkClickable("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."),"Product saved after clicking cancel");
		}catch(Exception e){
			
		}
	}
	@Then("^create product having multiple benefits with same usage leg and type combinations$")
    public void productWithMultipleBenefits() throws AWTException, InterruptedException {
	
		
		Thread.sleep(1500);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='form']//label[contains(.,'Product Name')]/..//input")).sendKeys("enterDetails-Cancel");	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='textarea']"))).sendKeys("Checking cross site scripting in creation of new product under CLV Max");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Category')]/..//input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-item[contains(.,'Combo Vouchers')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Validity')]/..//input"))).sendKeys("31");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Price')]/..//input"))).sendKeys("199");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Processing Fee')]/..//input"))).sendKeys("3");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(.,'Service Tax')]/following::input[1]"))).sendKeys("3");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Short Description')]/..//input"))).sendKeys("Checking cross site scripting");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Usage Leg')]/..//input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-item[contains(.,'Data 2G')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Type')]/..//input"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-item[contains(.,'Data MB')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Value')]/..//input"))).sendKeys("223");
		 
		driver.findElement(By.xpath(".//*[@id='scrollable']/div/div[2]/div/paper-button")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//*[@id='modal']/div[2]/div[2]/benefit-form[2]/form/paper-material/paper-dropdown-menu[1]/paper-menu-button/div[1]/div[1]/paper-input/paper-input-container/div[2]/div[1]/input")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='modal']/div[2]/div[2]/benefit-form[2]/form/paper-material/paper-dropdown-menu/paper-menu-button/iron-dropdown/div[1]/div[1]/paper-listbox/paper-item[1]"))).click();
		driver.findElement(By.xpath("//*[@id='modal']/div[2]/div[2]/benefit-form[2]/form/paper-material/paper-dropdown-menu[2]/paper-menu-button/div[1]/div[1]/paper-input/paper-input-container/div[2]/div[1]/input")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='modal']/div[2]/div[2]/benefit-form[2]/form/paper-material/paper-dropdown-menu[2]/paper-menu-button/iron-dropdown/div[1]/div[1]/paper-listbox/paper-item[1]"))).click();
		driver.findElement(By.xpath("//*[@id='modal']/div[2]/div[2]/benefit-form[2]/form/paper-material/paper-input")).sendKeys("223");
		int pass=0;
		NoSuchElementException ee = new NoSuchElementException("no element");
		try{
			Thread.sleep(1500);
			if(driver.findElement(By.xpath("//paper-input-error[contains(.,'This field is required') and @invalid='']")).isDisplayed()){
			pass=1;
			}
		}
			catch(NoSuchElementException e)
			{
				System.out.println(e.toString());
				pass=0;
			}
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='toast']/span[contains(.,'Product saved successfully.')]"))).click();
			if(pass==1)
				System.out.println("pass");
			else{
				System.out.println("fail");
				throw ee;
			}
			
	}
	@Then("^verify saving the product without adding benefits$")
    public void productWithoutBenefits() throws AWTException, InterruptedException {
		productPage.enterCreateProductName("simpleProd");
		productPage.enterCreateProductDescription("Description");
		productPage.selectCreateProductScopeOpenMarket();
		productPage.selectCreateProductCategory();
		productPage.enterCreateProductValidity("3");
		productPage.enterCreateProductPrice("100");
		productPage.enterCreateProductProcessingFee("5");
		productPage.enterCreateProductServiceTax("4");
		productPage.enterCreateProductBenefitDescription("benefit desription");
		productPage.clickCreateProductSaveButton();
		try {
			productPage.clickCreateNewProduct();
			Assert.assertTrue(false,"Product saved without benefit");
		}catch(Exception e) {
			
		}
	}
	@Then("^saving product with multiple benefits$")
    public void saveProductWithMultipleBenefits() throws AWTException, InterruptedException {
		Random rand = new Random();
		int  n = rand.nextInt(5000) + 1;
		productPage.enterProductDetails("newProd"+n,"Open Market");
		productPage.clickAddBenefitButton();
		productPage.addProductBenefit2();
		productPage.clickCreateProductSaveButton();
	}
	@Then("^check field validations under the benefits grid$")
    public void fieldValidationBenefits() throws Exception {
		
//		productPage.enterCreateProductBenefitDescription("sadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasdddddddddddddddddddddddddddsadasdasdsadasdsadsadasddddddddddddddddddddd343434dfbfdbd");
//		Exception charCountException = new Exception("Character count doesnt meet requirement");
//		Exception invalidCharException = new Exception("invalid character in field");
//		Thread.sleep(500);
//		String s = driver.findElement(By.xpath("//*[@id='form']//label[contains(.,'Value')]/..//input")).getAttribute("value");
//		if(!s.matches("^[0-9]*$"))
//			throw invalidCharException;
//		String shortDesc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form']//label[contains(.,'Short Description')]/..//input"))).getAttribute("value");
//		if(shortDesc.length()!=500){
//		  throw charCountException;
//		}
		
		
	}
	@Then("^verify adding more than 3 benefits for product$")
    public void moreThan3Benefits() throws Exception {
		productPage.clickAddBenefitButton();
		productPage.clickAddBenefitButton();
		productPage.clickAddBenefitButton();
		productPage.clickAddBenefitButton();
        boolean disp = driver.findElement(By.xpath("//*[@id='toast']")).isDisplayed();
		Exception noErrorMessage = new Exception("no error message on adding fourth benefit");
		if(disp){
			System.out.println("error message on adding fourth benefit");
		}
		else{
			System.out.println("no error message on adding fourth benefit");
			throw noErrorMessage;
		}
	}
	@Then("^clicking on the Add button to add benefits for the product$")
    public void addBenefit() throws Exception {
		productPage.clickCreateProductAddBenefit();
		Thread.sleep(400);
		List<WebElement> usageLeg = driver.findElements(By.xpath("//*[@id='form']//label[contains(.,'Usage Leg')]/..//input"));
		Assert.assertTrue(usageLeg.size()==2, "new benefit description not added");
	}
	@Then("^saving the products by not adding the mandatory fields$")
    public void saveWithoutMandatoryFields() throws Exception {
		Random r = new Random();
		int n = r.nextInt(5000)+1;
		productPage.enterCreateProductName("multipleBenefit_Check"+n);
		productPage.clickCreateProductSaveButton();
		productPage.selectCreateProductCategory();
		productPage.clickCreateProductSaveButton();
		productPage.enterCreateProductValidity("21");
		productPage.clickCreateProductSaveButton();
		productPage.enterCreateProductPrice("19");
		productPage.clickCreateProductSaveButton();
		
		productPage.enterCreateProductDescription("description");
		productPage.clickCreateProductSaveButton();
		
		productPage.selectCreateProductUsageLeg();
		productPage.clickCreateProductSaveButton();
		productPage.selectCreateProductType();
		productPage.clickCreateProductSaveButton();
		productPage.enterCreateProductValue("22");
		productPage.clickCreateProductSaveButton();
	}
	@Then("^field validations for the Basic Information$")
    public void basicFieldValidation() throws Exception {
		String str300 = "";
		for(int i=0;i<500;i++)
			str300+='a';
		for(int i=0;i<100;i++)
			str300+='b';
		String str30 = "";
		for(int i=0;i<30;i++)
			str30+='a';
		for(int i=0;i<10;i++)
			str30+='b';
		
		
		
		productPage.enterCreateProductName(str30);	
		productPage.enterCreateProductDescription(str300);

		productPage.enterCreateProductValidity("1bbb");
		productPage.enterCreateProductValue("bbb1");
		productPage.enterCreateProductProcessingFee("bbb1");
		productPage.enterCreateProductServiceTax("bbb1");
		productPage.validatePrepaidProductDetails();

	}

	@Then("^scrolling to view \"([^\"]*)\" in the entire product list$")
    public void scrollingInProductGrid(String sheet) throws Exception {
		eh.setExcelFile("productInputData",sheet);
		jswait.scrollIntoView("//iron-list[@id='list']", "//span[contains(.,'"+eh.getCell(1, 0)+"')]");
	}
	@Then("^check if \"([^\"]*)\" products with same price under open market$")
    public void verifyOpenProductPrice(String sheet) throws Exception {
		Exception samePriceProductInOpenMarket = new Exception("product with same price under open market");
		eh.setExcelFile("productInputData",sheet);
		commonObjects.filterName(eh.getCell(1, 0).toString());
//	  try{
		  System.out.println((String)eh.getCell(1, 0));
		  jswait.waitUntil("//span[contains(.,'"+eh.getCell(1, 0).toString()+"')]");
		  throw samePriceProductInOpenMarket;
//	  }
//	  catch(Exception e1){
		  
//	  }
	}
	@Then("^check if products with same price under segmented market$")
    public void verifySegmentedProductPrice() throws Exception {
	Exception e = new Exception("Product with same price cannot be saved in segmented market");	
	  try{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='toast']/span[contains(.,'Product saved successfully.')]"))).click();
	    
	  }
	  catch(Exception e1){
		  throw e;
	  }
	}
	@Then("^verify \"([^\"]*)\" product details displayed in the products screen$")
    public void verifyProductsGrid(String sheet) throws Exception {
		eh.setExcelFile("productInputData",sheet);
		commonObjects.filterName(eh.getCell(1, 0).toString());
		jswait.waitUntil("(//div[@class='item style-scope iron-data-table'])[1]");
	}
	
	@Then("^check if  the filter option is saving data after cancel$")
	public void check_filter_cancel_button() throws Exception{
		commonObjects.clickFilterIcon();
		commonObjects.enterFilterFormname("product_check");
		commonObjects.clickFilterCancelButton();
		commonObjects.clickFilterIcon();
		Thread.sleep(1500);
		Assert.assertEquals(commonObjects.getTextFromFilterForm(), "checkText");
	}
	@Then("^create new segmented product from sheet \"([^\"]*)\"$")
    public void newSegmentedProduct(String sheet) throws AWTException, InterruptedException, IOException {
		eh.setExcelFile("inputData",sheet);
		WebDriverWait wait = new WebDriverWait(driver, 2);
		Thread.sleep(3000);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "");
		name= n+name;
		eh.setCell(1, 0, name);
		productPage.createProduct(name,"Segmented");
		
	}
	@Then("^check if \"([^\"]*)\" offer is shown in view offers of \"([^\"]*)\"$")
    public void check_offer_in_view_offer(String offerSheet, String productSheet) throws AWTException, InterruptedException {
		eh.setExcelFile("productInputData",productSheet);
		ExcelHelper offer  = new ExcelHelper();
		offer.setExcelFile("offerInputData", offerSheet);
		commonObjects.filterName((String)eh.getCell(1, 0));
		commonObjects.clickOptionsIcon();
		productPage.clickProdcutViewOffers();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='offer-view style-scope'][2][contains(.,'"+offer.getCell(1, 0)+"')]")));		
	}
	@Then("^create duplicate product of \"([^\"]*)\"$")
    public void check_duplicate_product_functionality(String sheet) throws AWTException, InterruptedException {
		eh.setExcelFile("productInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		commonObjects.filterName(eh.getCell(1, 0).toString());
		productPage.clickProductGridOptions();
		productPage.clickProductDuplicateButton();
		productPage.enterCreateProductName("Dupe"+eh.getCell(1, 0).toString());
		productPage.clickCreateProductSaveButton();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(.,'Dupe"+eh.getCell(1, 0).toString()+"')]"));

	}
	@Then("^check edit product functionality$")
    public void check_edit_product_functionality() throws AWTException, InterruptedException, IOException {
		eh.setExcelFile("inputData","singleProductPage");
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		commonObjects.filterName(name);
		eh.setCell(1, 0, name);
		productPage.clickProductGridOptions();
		productPage.clickProductEditButton();
		productPage.enterCreateProductName(name+"Edit");
		productPage.enterCreateProductDescription("Edited Description");
		productPage.clickCreateProductSaveButton();
		commonObjects.filterName(name+"Edit");
		productPage.checkProductNameInGrid(name+"Edit");
	}
	@Then("^verify clicking on options icon$")
    public void verify_clicking_options_icon() throws Exception {
		productPage.clickProductGridOptions();
		productPage.checkProductGridOptions();
//		Exception e = new Exception("options not found in options menu");
//		Random rn = new Random();
//		int  n = rn.nextInt(5000) + 1;
//		Thread.sleep(1000);
//		List<WebElement> ele = driver.findElements(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."));
//		List<WebElement> button1 = driver.findElements(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[1]"));
//		List<WebElement> button2 = driver.findElements(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[2]"));
//		List<WebElement> button3 = driver.findElements(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[3]"));
//		List<WebElement> button4 = driver.findElements(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[4]"));
//		
//		Iterator<WebElement> iter = ele.iterator();
//		Iterator<WebElement> iter1 = button1.iterator();
//		Iterator<WebElement> iter2 = button2.iterator();
//		Iterator<WebElement> iter3 = button3.iterator();
//		Iterator<WebElement> iter4 = button4.iterator();
//		int i = 2;
//		while(iter.hasNext()) {
//			i++;
//			Thread.sleep(1000);
//		    WebElement we = iter.next();
//		    WebElement we1 = iter1.next();
//		    WebElement we2 = iter2.next();
//		    WebElement we3 = iter3.next();
//		    WebElement we4 = iter4.next();
//		    we.click();
//		    System.out.println("start while"+i);
//		    Thread.sleep(1000);
//		    if( we1.isDisplayed()  && we2.isDisplayed() && we3.isDisplayed() && we4.isDisplayed()){
//		    	System.out.println("displayed");
//		    }
//		    else
//		    	 throw e;
//		    
//		    driver.findElement(By.xpath(".//*[@id='item"+i+"']/div[1]/data-table-cell[3]")).click();
//		    System.out.println("end while");
//		  
//		}
	}
	@Then("^check script in product name field \"([^\"]*)\"$")
    public void check_script_in_product_name_field(String script) throws Exception {
		commonObjects.filterName(script);
		Exception e = new Exception("data displayed after script");
		Thread.sleep(3000);
		try{
			driver.findElement(By.xpath(".//*[@id='item1']/div[1]/data-table-cell[1]/span")).isDisplayed();
			throw e;
		}catch(Exception e1) {
			
		}
			
	}
	@Then("^veirfy help icon of products$")
	   public void verifyHelpOfProducts() throws Throwable
	   {   
		  Thread.sleep(3000);
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flytxt-context-help/paper-icon-button/iron-icon/img")))).click();
		   Thread.sleep(1500);
		   String secondUrl = driver.findElement(By.xpath(".//*[@id='content']/object")).getAttribute("data");
		   ((JavascriptExecutor)driver).executeScript("window.open()");
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.get(secondUrl);
//		    driver.switchTo().frame(1);
		    try{
		    driver.findElement(By.xpath("//h1//span[contains(text(),'Products')]"));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    }
		    catch (Exception e) {
		    	driver.close();
			    driver.switchTo().window(tabs2.get(0));
			    throw e;
			}
		   
		   
	   }
	@Then("^verify scroll bar for list of offers$")
    public void scrollingInOffersGrid() throws Exception {
		Thread.sleep(2000);
		Actions clickAction = new Actions(driver);
        WebElement scrollablePane = driver.findElement(By.xpath("//*[@id='offerGrid']/div[1]/iron-list"));
        Thread.sleep(2000);
        clickAction.moveToElement(scrollablePane).click().build().perform();
        Actions scrollAction = new Actions(driver);
        for(int i=0;i<10;i++){
        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1500);
        }
	}
	@Then("^verify quick summary of product \"([^\"]*)\" in offer grid of \"([^\"]*)\"$")
    public void verifyQuickSummaryOfferGrid(String productSheet,String sheet) throws Exception {
		eh.setExcelFile("productInputData",productSheet);
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData",sheet);
		commonObjects.filterName((String)offerExcel.getCell(1, 0));
		Thread.sleep(1500);
		commonObjects.clickFirstItemInGrid();
		Thread.sleep(1500);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'"+eh.getCell(1, 0)+"')]/../../div[2]/label[2][contains(text(),'"+eh.getCell(1, 1)+"')]")));	
	}
	@Then("^verify offer details in grid from sheet \"([^\"]*)\"$")
    public void verifyDetailsInGrid(String sheet) throws Exception {
		eh.setExcelFile("offerInputData",sheet);
		commonObjects.filterName((String)eh.getCell(1, 0));
		commonObjects.clickFirstItemInGrid();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'"+(String)eh.getCell(1, 10)+"')]")));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='items']/div[1]/data-table-row/div[1]/data-table-cell[3][text()='"+(String)eh.getCell(1, 2)+"']")));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'"+(String)eh.getCell(1, 11)+"')]")));
	}
	@Then("^verify collapsing and expanding offer summary$")
    public void verifyCollapsingAndExpandingOffer() throws Exception {
		commonObjects.clickFirstItemInGrid();	
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[contains(.,'Product Details')]")));
		commonObjects.clickFirstItemInGrid();
	
	}
	
	@Then("^verify clicking on options icon in offer grid$")
    public void verify_clicking_options_icon_in_offer_grid() throws Exception {
		Exception e = new Exception("options not found in options menu");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."));
		List<WebElement> button1 = driver.findElements(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/a[1]"));
		List<WebElement> button2 = driver.findElements(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/paper-item"));
		List<WebElement> button3 = driver.findElements(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/a[2]"));
		List<WebElement> button4 = driver.findElements(By.xpath(".//*[@id='contentWrapper']/div/paper-menu/div/a[3]"));
			
		Iterator<WebElement> iter = ele.iterator();
		Iterator<WebElement> iter1 = button1.iterator();
		Iterator<WebElement> iter2 = button2.iterator();
		Iterator<WebElement> iter3 = button3.iterator();
		Iterator<WebElement> iter4 = button4.iterator();
		while(iter.hasNext()) {
			Thread.sleep(500);
		    WebElement we = iter.next();
		    WebElement we1 = iter1.next();
		    WebElement we2 = iter2.next();
		    WebElement we3 = iter3.next();
		    WebElement we4 = iter4.next();
		    Thread.sleep(500);
		    jswait.loadClick(we);
		    Thread.sleep(1000);
		    if( we1.isDisplayed()  && we2.isDisplayed() && we3.isDisplayed() && we4.isDisplayed()){
		    	
		    }
		    else
		    	 throw e;
		    
		    action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Offers')]"))).click().build().perform();
		  
		}
	}
	@Then("^check edit offer functionality for \"([^\"]*)\"$")
    public void verifyEditOffer(String sheet) throws Exception {
		eh.setExcelFile("offerInputData",sheet);
		commonObjects.filterName((String)eh.getCell(1, 0));
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		offerPageObjects.enterOfferName((String)eh.getCell(1, 0)+"_edit");
		offerPageObjects.selectOfferType("STV");
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickSaveOfferButton();
		commonObjects.filterName((String)eh.getCell(1, 0)+"_edit");
		jswait.waitUntil("//data-table-cell[contains(.,'"+(String)eh.getCell(1, 0)+"_edit')]");		
	}
	@Then("^navigate to product class \"([^\"]*)\"$")
    public void navigateToProductClass(String sheet) throws Exception {
		eh.setExcelFile("productClassInputData",sheet);
		jswait.scrollAndClick("//paper-card/div[2]", "//h4[contains(.,'"+eh.getCell(1, 0)+"')]/../..//a");
	}
	@Then("^create selClass product from sheet \"([^\"]*)\"$")
    public void createSelClassProduct(String sheet) throws Exception {
		eh.setExcelFile("productInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productPage.createSelClassProduct(name);
	}
	@Then("^veirfy SelClass product \"([^\"]*)\" in grid$")
	public void veirfy_SelClass_product_in_grid(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		jswait.waitUntil("//span[contains(.,'"+name+"')]");
	}
	@Then("^verify name field character limit$")
    public void verifyProductNameCharacterLimit() throws Exception {
		productPage.enterCreateProductName("aasdfsdddddddddddddddddddddddddddddddffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffsdfsdddddddddddddddddddddddddddddddffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff203");
		Thread.sleep(2000);
		String text = productPage.getTextFromNameField();
		Assert.assertTrue(text.length()<=200, "More than 200 characters accepted in name field");
	}
	@Then("^verify description field character limit$")
    public void verifyProductDescriptionCharacterLimit() throws Exception {
		productPage.enterCreateProductDescription("aasdfsdddddddddddddddddddddddddddddddffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffsdfsdddddddddddddddddddddddddddddddffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
		Thread.sleep(2000);
		String text = productPage.getTextFromDescrptionField();
		Assert.assertTrue(text.length()==200, "More than 200 characters accepted in Description field");
	}
	@Then("^verify SelClass number field$")
    public void verifyProductNumberField() throws Exception {
		productPage.enterSelClassNum("ghggh12sdfs");
		String text = productPage.getTextFromNumField();
		Assert.assertTrue(text.length()==2, "alphabets entered in number field");
	}
	@Then("^verify SelClass text field$")
    public void verifyProductTextField() throws Exception {
		productPage.enterSelClassTxt("[].:()?12s");
		String text = productPage.getTextFromTxtField();
		Assert.assertTrue(text.length()==10, "Error in Text field");
	}
	@Then("^verify SelClass single select field$")
    public void verifyProductSingleSelectField() throws Exception {
		productPage.selectSelClassSingleSelect();
		productPage.selectSelClassSingleSelect2();
	}
	@Then("^verify SelClass multi select field$")
    public void verifyProductMultiSelectField() throws Exception {
		productPage.selectSelClassMultiSelect();
	}
	@Then("^verify product listing page$")
	public void verifyProductListingPage() throws Throwable {
		jswait.checkVisible(driver.findElement(By.xpath(".//*[@id='productGrid']")));
		productPage.clickCreateNewProduct();
	    productPage.clickCreateProductCancelButton();
	}
	@Then("^verify name and description \"([^\"]*)\"$")
	public void verifyNameAndDescription(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		commonObjects.filterName(name);
		jswait.checkVisible(driver.findElement(By.xpath(".//span[contains(.,'"+name+"')]")));
		jswait.checkVisible(driver.findElement(By.xpath(".//span[contains(.,'Description for singleProd')]")));
	}
	@Then("^verify details of user who created / edited$")
	public void verifyCreatebByAndModifiedBy() throws Throwable {
		jswait.checkVisible(driver.findElement(By.xpath("//div/data-table-cell[6]/span[contains(.,'"+p.getValue("user")+"')]")));
		jswait.checkVisible(driver.findElement(By.xpath("//div/data-table-cell[8]/span[contains(.,'"+p.getValue("user")+"')]")));
	}
	@Then("^verify timestamps in product grid$")
	public void verifyTimestanpInGrid() throws Throwable {
		jswait.checkVisible(driver.findElement(By.xpath("//div/data-table-cell[5][contains(.,':')]")));
		jswait.checkVisible(driver.findElement(By.xpath("//div/data-table-cell[7][contains(.,':')]")));
	}
	@Then("^verify SelClass product details in grid$")
	public void verifySelClassDetails() throws Throwable {
		productPage.expandFirstProduct();
		productPage.verifySelClassDetailsInGrid();
	}
	@Then("^create product without any attributes from sheet \"([^\"]*)\"$")
	public void createProductWithoutAttributes(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		productPage.createProductClassWithoutAttributes(name);
	}
	@Then("^deactivate product from sheet \"([^\"]*)\"$")
	public void deactivateProduct(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		commonObjects.filterName(name);
		commonObjects.clickOptionsIcon();
		productPage.clickDeactivateButton();
	}
	@Then("^activate product from sheet \"([^\"]*)\"$")
	public void activateProduct(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		commonObjects.filterName(name);
		commonObjects.clickOptionsIcon();
		productPage.clickActivateButton();
	}
	@Then("^verify deactivated product from sheet \"([^\"]*)\" in offer creation$")
	public void verifyDeactivatedProductInOffers(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("rechargeWAP");
		offerPageObjects.clickProceedButton();
		try {
			offerPageObjects.enterProductTabFields(sheet);
			Assert.assertTrue(false,"Product Avaliable even after deactivation");
		}catch(Exception e) {
			
		}
	}
	@Then("^verify activated product from sheet \"([^\"]*)\" in offer creation$")
	public void verifyActivatedProductInOffers(String sheet) throws Throwable {
		eh.setExcelFile("productInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("rechargeWAP");
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterProductTabFields(sheet);
	}
	@Then("^check product details in offer grid$")
	public void checkNoAttributesProductInOfferGrid() throws Throwable {
		eh.setExcelFile("offerInputData","rechargeWAP");
		String name = (String) eh.getCell(1, 0);
		commonObjects.filterName(name);
		jswait.loadClick("//data-table-cell[contains(.,'"+name+"')]");
		eh.setExcelFile("productInputData","fullDetails");
		String productName = (String) eh.getCell(1, 0);
		jswait.waitUntil("//label[contains(.,'"+productName+"')]");
		jswait.waitUntil("//label[contains(.,'NO ATTRIBUTES HERE')]");
		jswait.waitUntil("//label[contains(.,'SelClass')]");
	}
}
