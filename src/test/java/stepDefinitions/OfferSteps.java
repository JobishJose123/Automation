package stepDefinitions;

import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;

public class OfferSteps extends Init{
	public ExcelHelper eh = new ExcelHelper();
	Offer_creation_steps offer_creation = new Offer_creation_steps();
	JSWaiter jswait = new JSWaiter();
	LoginPageObjects loginPage = new LoginPageObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CommonObjects commonObjects = new CommonObjects();
	public OfferSteps() {
		PageFactory.initElements(driver, this);
	}
//	@Then("^navigate to offers")
//	public void logout() throws InterruptedException {
//		offerPageObjects.navigateToOffer();
//	}
	
	@Then("^create new offer from sheet \"([^\"]*)\" with product \"([^\"]*)\"$")
	public void create_new_Offer(String sheet, String productSheet) throws Throwable 
	{
		offerPageObjects.createOffer(sheet, productSheet);
	}
	@Then("^verify \"([^\"]*)\" offer in grid$")
	public void verifyOfferInGrid(String sheet) throws Throwable 
	{
		eh.setExcelFile("offerInputData", sheet);
		commonObjects.filterName(eh.getCell(1, 0).toString());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(.,'"+eh.getCell(1, 0).toString()+"')]")));
	}
	WebDriverWait wait = new WebDriverWait(driver, 15);
	Actions actions = new Actions(driver);
	
	
	
	@Then("^check offer cancel button$")
	public void Check_cancel_button() throws Throwable
	{
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.clickCancelOfferButton();
		offerPageObjects.clickCreateNewOfferButton();
	}
	
	@Then("^check offer help icon$")
	public void Check_Offer_help_icon() throws Throwable
	{
		offerPageObjects.checkOfferContextHelp();
	}
	
	@Then("^Check_details_tab_without_entering_details$")
	public void Check_details_tab_without_entering_details() throws Throwable
	{
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterOfferName("details");	
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterOfferDescription("description");
	}
	
	@Then("^Check_add_button_in_product_tab$")
	public void Check_add_button_in_product_tab() throws Throwable
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-button[contains(.,'Create New Offer')]"))).click();
		Thread.sleep(2000);
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Offer Name')]"))).click().sendKeys("name").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Description')]"))).click().sendKeys("desc").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Offer Type')]"))).click().build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'Balance Deduction')]"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Channel')]"))).click().build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'SMS')]"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Category')]"))).click().build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'Balance Top ups')]"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Currency')]"))).click().build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'INR')]"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Discount')]"))).click().sendKeys("20").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//paper-button[contains(.,'Proceed')]"))).click().build().perform();
		
		WebElement Add_button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='check']/div/iron-pages/offer-products/form/div/div[2]/paper-button")));
		if(Add_button.isDisplayed())
				actions.moveToElement(driver.findElement(By.xpath("//paper-button[contains(.,'Cancel')]"))).click().build().perform();
			
		else 
			throw new NoSuchElementException("Add button is not displayed in the products tab");
			
	}
	@Then("^create new offer using deactivated product from sheet \"([^\"]*)\"$")
	public void createOfferWithDeactivatedProduct(String sheet) throws Throwable 
	  {
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		String st=sheet;
		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("inputData","singleProductPage");
		eh.setExcelFile("offerInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		String desc = (String) eh.getCell(1, 1);
		offerPageObjects.createNewOffer(name, desc);
		
		Thread.sleep(1000);
		String sheet2= "fullDetails";
		eh.setExcelFile("productInputData",sheet2);
		String prod_name = (String) eh.getCell(1, 0);
		commonObjects.filterName(prod_name);
		Thread.sleep(3000);
		offerPageObjects.checkAddProductsCheckBox();
		
		 }
	
}
