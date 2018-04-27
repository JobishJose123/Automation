package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CatalogPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.OfferPageObjects;

public class OfferCatalogSteps extends Init{
	public ExcelHelper eM = new ExcelHelper();
	CommonObjects commonObjects = new CommonObjects();
	JSWaiter jswait = new JSWaiter();
	CatalogPageObjects catalogPageObjects = new CatalogPageObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
    public WebDriverWait wait = new WebDriverWait(driver, 15);
    public Actions action = new Actions(driver);
	   @Then("^Navigate to Offer Catalogue$")
	    public void navigatetoOfferCatalogue() throws Throwable{
		   catalogPageObjects.navigateToOfferCatalog();
	    }
	   @Then("^Create New Offer Catalogue from sheet \"([^\"]*)\"$")
	    
	    public void createNewOfferCatalogueFromSheet(String sheet) throws Throwable{
	    	Thread.sleep(2000);
	 	    eM.setExcelFile("offerCatalogInputData",sheet);
	 	    Random rn = new Random();
	 		int  n = rn.nextInt(5000) + 1;
	 		String name = (String) eM.getCell(1, 0);
	 		name =  name.replaceAll("[0-9]", "")+n;
	 		eM.setCell(1, 0, name);
	 		catalogPageObjects.createCatalog(name);
	 	   Thread.sleep(3000);
	 	   }
	   
	   @Then("^Add \"([^\"]*)\" offer to Offer Catalogue$")
	    public void addOffertoCatalogueForProduct(String sheet) throws Throwable
	    {
	     eM.setExcelFile("offerInputData",sheet);
	 	 catalogPageObjects.clickCatalogAddOffers();
	 	 commonObjects.filterName(eM.getCell(1, 0).toString());
	 	 jswait.loadClick(".//div[1]/data-table-cell[1][contains(.,'"+eM.getCell(1, 0)+"')]");
	 	 catalogPageObjects.clickAddToCatalogButton();
	    }
	   @Then("^Delete Created Offer Catalogue \"([^\"]*)\"$")
	   public void deleteOfferCatalogue(String sheet) throws Throwable
	   {
		eM.setExcelFile("offerCatalogInputData",sheet);
		catalogPageObjects.navigateToOfferCatalog();
		commonObjects.filterName(eM.getCell(1, 0).toString());
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeleteOption();
		commonObjects.clickConfirmYesButton();  
	   }
	   
	   @Then("^Cancel the New offer Catalogue$")
	   public void cancelnewOfferCatalogue() throws Throwable
	   
	   {   eM.setExcelFile("Offer_Catalog","Sheet1");
	   catalogPageObjects.clickCreateCatalogButton();
	   catalogPageObjects.enterCatalogDetails("CancelCatalog");
	   catalogPageObjects.clickCancelCatalogButton();
	   commonObjects.filterName("CancelCatalog");
	   Exception exx = new Exception("element saved after cancel button");
	   try{
		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-cell[text()='CancelCatalog']"))));
		   throw exx;
	   }
	   catch (Exception e) {
		
	   }
		   }
	   @Then("^Cancel Selected Offer$")
	   public void cancelSelectedOffer() throws Throwable
	   {
		   catalogPageObjects.clickCatalogAddOffers();
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='items']//data-table-cell"))).click();
		   catalogPageObjects.clickCatalogAddOfferCancelButton();
		   Thread.sleep(4000);
		   Exception offerCancel = new Exception("offer added to catalog after cancel button");
		   try{
			   driver.findElements(By.xpath("//catalogue-offer-listing/iron-data-table//iron-list//data-table-row"));
			   throw offerCancel;
		   }catch(Exception e ) {
			   
		   }
	   }
	   
	   @Then("^Add offers to Offer Catalogue$")
	  public void addOffersToCatalogue() throws Throwable
	  {
		   catalogPageObjects.clickCatalogAddOffers();
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='items']//data-table-checkbox"))).click();
		   catalogPageObjects.clickAddToCatalogButton();
		   Thread.sleep(4000);
		   Exception offerAdd = new Exception("offer not added to catalog after add to catalog button");
		   try{
			   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//catalogue-offer-listing/iron-data-table//iron-list//data-table-row")));
		   }catch(Exception e ) {
			   throw offerAdd;
		   }
	  }
	   @Then("^Select Multiple Offers$")
	   public void selectMultipleOffers() throws Throwable
	   {
		   catalogPageObjects.clickCatalogAddOffers();
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='items']//data-table-checkbox"))).click();
		   List<WebElement> offersToAdd = driver.findElements(By.xpath("//*[@id='items']//data-table-checkbox"));
		   wait.until(ExpectedConditions.elementToBeClickable(offersToAdd.get(1))).click();
			 catalogPageObjects.clickAddToCatalogButton();
			 Thread.sleep(4000);
			   Exception offerAdd = new Exception("offer not added to catalog after add to catalog button");
				   wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//catalogue-offer-listing/iron-data-table//iron-list//data-table-row")));
				   List<WebElement> offersAdded = driver.findElements(By.xpath("//catalogue-offer-listing/iron-data-table//iron-list//data-table-row"));
				   if(!(offersAdded.size()==2))
				   throw offerAdd;
		}
	   @Then("^Search Offers with Combination of details$")
	   public void searchOffersUsingCobination() throws Throwable
	   {
		   
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[1]/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(1, 0));
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[2]/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(2, 0));
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[2]/span[contains(.,'"+eM.getCell(2, 0)+"')]")));
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//paper-dialog/iron-data-table/div/iron-list/div/div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+eM.getCell(1, 0)+"')]"))));
			 Thread.sleep(4000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/paper-button[2]")))).click();
			 
	   }
	   @Then("^Search Offers Using Service leg$")
	   public void searchOffersUsingServiceLeg() throws Throwable
	   {
		   //eM.setExcelFile("Sheet1");
		   Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			 action.moveToElement(driver.findElement(By.xpath("//form/paper-input[3]/paper-input-container/div[2]/div/input"))).click().build().perform();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[3]/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(3, 0));
			// driver.findElement(By.xpath("//form/paper-input[3]/paper-input-container/div[2]/div/input")).sendKeys(eM.getCell(3, 0));
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click(); 
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/div[1]/data-table-row/div[1]/data-table-cell[4]/span[contains(.,'"+eM.getCell(3, 0)+"')]"))));
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/paper-button[2]")))).click();
	   }
	   @Then("^Cancel Selected Offers$")
	   public void cancelSelectedOffers() throws Throwable
	   {
		   Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[1]/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(1, 0));
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[1]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[2]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[3]/data-table-row/div[1]/data-table-checkbox")))).click();  
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/paper-button[2]")))).click();
			 int verifyoffers=0;
			 org.openqa.selenium.NoSuchElementException exception = new org.openqa.selenium.NoSuchElementException("No Elemnet");
			 try
			 {
				 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//catalogue-offer-listing/iron-data-table/div/iron-list/div/div/data-table-row/div[1]/data-table-cell[text()='"+eM.getCell(1, 0)+"']"))));
			 }
			 catch (org.openqa.selenium.NoSuchElementException e) {
				 
				 verifyoffers=1;
				
			}
			 if(verifyoffers==0)
			 {
				 throw exception;
			 }
	  
	   }
	   @Then("^Select Offers Using Product Name$")
	   public void selectUsingProductName() throws Throwable
	   {

			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[2]/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(2, 0));
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[2]/span[contains(.,'"+eM.getCell(2, 0)+"')]")));
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/paper-button[2]")))).click();
			 
	   }
	   
	   @Then("^Search Offer Using Price$")
	   public void searchUsingPrice() throws Throwable
	   {
		   Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/paper-input[3]/paper-input-container/div[2]/div/input")))).sendKeys("49");
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/paper-input[6]/paper-input-container/div[2]/div/input")))).sendKeys("51");
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
	   }
	   @Then("^Verify Added Catalogue$")
	   public void verifyAddedCatalogue() throws Throwable
	   {
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
		   	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
		   	Thread.sleep(1000);
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+eM.getCell(0, 0)+"')]"))));
	   }
	   @Then("^Validate Catalogue Name$")
	   public void validateCatalogueName() throws Throwable
	   {
		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='router']/app-route[17]/offer-catalogue-grid/div[1]/div[2]/paper-button")))).click();
		   driver.findElement(By.xpath("//div[3]/paper-button[2]")).click();
		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//paper-input-container/div[4]/paper-input-error[contains(.,'This field is required.')]"))));
	   }
	   @Then("^Add fifty more offers to Offer Catalogue$")
	   public void addFiftyMoreOffers() throws Throwable
	   {
		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")))).click();
			 Thread.sleep(2000);
			 for (int i = 1; i < 14; i++) {
				 
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div["+i+"]/data-table-row/div[1]/data-table-cell[1]")))).click();
				
			}
			 
			 Thread.sleep(2000);
			 
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[14]/data-table-row/div[1]/data-table-cell[1]")))).click();
			//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-data-table[@id='selectOfferGrid']/div[1]/iron-list[1]")))).sendKeys(Keys.ARROW_UP);
			WebElement target= driver.findElement(By.xpath("//iron-list/div/div[14]/data-table-row/div[1]/data-table-cell[1]"));
			action.sendKeys(target, Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			for(int j=1; j<14; j++){
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div["+j+"]/data-table-row/div[1]/data-table-cell[1]")))).click();
			}
			Thread.sleep(2000);
			WebElement target1= driver.findElement(By.xpath("//iron-list/div/div[14]/data-table-row/div[1]/data-table-cell[1]"));
			action.sendKeys(target1, Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			for(int k=1; k<14; k++){
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div["+k+"]/data-table-row/div[1]/data-table-cell[1]")))).click();
			}
			Thread.sleep(2000);
			WebElement target2= driver.findElement(By.xpath("//iron-list/div/div[14]/data-table-row/div[1]/data-table-cell[1]"));
			action.sendKeys(target2, Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			for(int l=1; l<14; l++){
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div["+l+"]/data-table-row/div[1]/data-table-cell[1]")))).click();
			}
			Thread.sleep(2000);
			//WebElement target3= driver.findElement(By.xpath("//iron-list/div/div[14]/data-table-row/div[1]/data-table-cell[1]"));
			//action.sendKeys(target3, Keys.PAGE_DOWN).build().perform();
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-button[text()='Add to Catalog']"))).click();
			 Thread.sleep(4000); 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
			   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
			   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
			   	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
			   	Thread.sleep(1000);
			   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[1]/data-table-row/div[1]/data-table-cell[contains(.,'5')]"))));
	   }
	   @Then("^Delete Offer from Catalogue$")
	   public void deleteOffer() throws Throwable
	   {
	    Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[1]/data-table-cell[6]/paper-icon-button/iron-icon")))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
	   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
	   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
	   	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
	   	Thread.sleep(1000);
	   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[1]/data-table-row/div[1]/data-table-cell[contains(.,'0')]"))));
	   }
	   @Then("^Verify Help Of Offer Catalogue$")
	   public void verifyHelp() throws Throwable
	   {   
		   
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flytxt-context-help/paper-icon-button/iron-icon/img")))).click();
		   Thread.sleep(1500);
		   String secondUrl = driver.findElement(By.xpath("//paper-scroll-header-panel/div[1]/div/app-router/app-route[17]/offer-catalogue-grid/div[1]/div[1]/div/flytxt-context-help/paper-dialog/div/object")).getAttribute("data");
		   ((JavascriptExecutor)driver).executeScript("window.open()");
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.get(secondUrl);
		    driver.switchTo().frame(1);
		    try{
		    driver.findElement(By.xpath("//*[@id='topic_content']/h1[1]/span/span[contains(text(),'Offer Catalogs')]"));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    }
		    catch (Exception e) {
		    	driver.close();
			    driver.switchTo().window(tabs2.get(0));
			    throw e;
			}
		   
		   driver.findElement(By.xpath("//offer-catalogue-grid/div[1]/div[1]/div/flytxt-context-help/paper-dialog/iron-icon")).click();
		   System.out.println(secondUrl);
		   
		   
	   }
	   @Then("^verify sql injection in offer catalogue$")
	   public void verifysqlinjectionOfferCatalog() throws Throwable
	   {
		   eM.setExcelFile("Offer_catalog","Sheet1");
		   try{
		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(4, 0));
		   	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
		   }
		   catch (Exception e) {
			throw e;
			
		}
		   int pass=0;
		   org.openqa.selenium.NoSuchElementException exx = new org.openqa.selenium.NoSuchElementException("no element");
		   try{
			   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-cell[text()='"+eM.getCell(4, 0)+"']"))));  
		   }
		   catch (org.openqa.selenium.NoSuchElementException e) {
			   pass=1;
			
		   }
		   if(pass==0){
			   throw exx;
		   }
		   	
	   }
	   @Then("^verify Cross site scripting in offer catalogue$")
	   public void verifyCrossSiteScripting() throws Throwable
	   {
		    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys("<script>alert(document.cookies)</script>");
		   	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
	   
	   
	   int pass=0;
	   org.openqa.selenium.NoSuchElementException exx = new org.openqa.selenium.NoSuchElementException("no element");
	   
	   try{
		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-cell[text()='<script>alert(document.cookies)</script>']"))));  
	   }
	   catch (org.openqa.selenium.NoSuchElementException e) {
		   pass=1;
		
	   }
	   if(pass==0){
		   throw exx;
	   }
	   
	}
	   @Then("^Verify Edit Offer Catalog$")
	   public void verifyEditOfferCatalog() throws Throwable
	   {
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
		   	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[1]")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//create-offer-catalogue/form/paper-dialog/div[2]/paper-input[1]/paper-input-container/div[2]/div/input")))).sendKeys("Cancel");
		   	driver.findElement(By.xpath("//paper-input[2]/paper-input-container/div[2]/div/input")).sendKeys("test");
			driver.findElement(By.xpath("//div[3]/paper-button[2]")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
			driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[2]")))).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//paper-button[contains(text(),'Yes')]")))).click();
		    }
	   @Then("^Verify Collapsing Offer in Offer Catalog$")
	   public void verifyCollapsingOfferinCatalog() throws Throwable
	   {   Thread.sleep(3000);
	   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
	 	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
	 	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))).click();
	  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[3]")))).click();
	    action.moveToElement(driver.findElement(By.xpath("//div/iron-list/div/div/data-table-row/div[1]/data-table-cell[2]"))).click();
	    Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/iron-list/div/div/data-table-row/div[1]/data-table-cell[2]")))).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[1]/h4[contains(text(),'Product Details')]"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[2]/h4[1][contains(text(),'Creative')]"))));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//catalogue-offer-listing/iron-data-table/div/iron-list/div/div/data-table-row/div[1]/data-table-cell[1]/iron-icon[1]")).click();
	    Thread.sleep(3000);
		try{
			driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[1]/h4[contains(text(),'Product Details')]"));
		   }
		   catch (org.openqa.selenium.NoSuchElementException e) {
			   }  
		Thread.sleep(2000);
	   }
	   @Then("^Verify Label in offer selected$")
	   public void verifyLabelinOfferCatalogOffersSelection() throws Throwable
	   {
		   Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[1]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[2]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[3]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[4]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[5]/data-table-row/div[1]/data-table-checkbox")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-list/div/div[6]/data-table-row/div[1]/data-table-checkbox")))).click(); 
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/app-router/app-route[18]/catalogue-offer-listing/add-offer-detail/paper-dialog/div[2]/label[contains(.,'(6 out of')]")));
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/paper-button[2]")))).click();
	         		 
	  
	   }
	   @Then("^Verify searching the offers using invalid information$")
	   public void verifySearchingOffersUsingInvalidInformationInCatalog() throws Throwable
	   {
		   Thread.sleep(2000);
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Add Offers')]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[1]/paper-input-container/div[2]/div/input")))).sendKeys("Invalid Information");
			 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input[2]/paper-input-container/div[2]/div/input")))).sendKeys("Invalid Information");
			 driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
			 Thread.sleep(4000);
			 //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//paper-dialog/iron-data-table/div/iron-list/div/div[1]/data-table-row/div[1]/data-table-cell[contains(.,'Invalid Information')]"))));
			  
			int passinvalid=0;
			   org.openqa.selenium.NoSuchElementException exx = new org.openqa.selenium.NoSuchElementException("no element");
			   try{
				   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[2]/span[contains(.,'Invalid Information')]"))));
			   }
			   catch (org.openqa.selenium.NoSuchElementException e) {
				   passinvalid=1;
				
			   }
			   if(passinvalid==0){
				   throw exx;
			   }
			  
				 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[2]/paper-button[2]")))).click();
	   }
	   @Then("^Verify Expanding Offer$")
	   public void verifyExpandingOffer() throws Throwable
	   {
		   Thread.sleep(3000);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
		  	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[3]")))).click();
		    Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/iron-list/div/div/data-table-row/div[1]/data-table-cell[2]")))).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[1]/h4[contains(text(),'Product Details')]"))));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[2]/h4[1][contains(text(),'Creative')]"))));
			Thread.sleep(2000);
			action.moveToElement(driver.findElement(By.xpath("//div/iron-list/div/div/data-table-row/div[1]/data-table-cell[2]"))).click();
			Thread.sleep(3000);
			
	   }
	   @Then("^Verify Offer Details$")
	   public void verifyOfferDetails() throws Throwable
	   {
		   Thread.sleep(3000);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")))).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//form/paper-input/paper-input-container/div[2]/div/input")))).sendKeys(eM.getCell(0, 0));
		  	driver.findElement(By.xpath("//paper-button[contains(text(),'Apply')]")).click();
		  	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")))).click();
		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[3]")))).click();
		    Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/iron-list/div/div/data-table-row/div[1]/data-table-cell[2]")))).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[1]/h4[contains(text(),'Product Details')]"))));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//data-table-row-detail/offer-row-expander/div/div[2]/h4[1][contains(text(),'Creative')]"))));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//iron-data-table/div/iron-list/div/div/data-table-row/div[2]/data-table-row-detail/offer-row-expander/div/div[2]/h4[2]")))).click();
			Thread.sleep(2000);
			action.moveToElement(driver.findElement(By.xpath("//div/iron-list/div/div/data-table-row/div[1]/data-table-cell[2]"))).click();
			Thread.sleep(3000);
	   }
	   @Then("^Edit Catalog from Catalog screen$")
	   public void editfromCatalogScreen() throws Throwable
	   {
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div/app-router/app-route[18]/catalogue-offer-listing/div[1]/paper-icon-button/iron-icon")))).click();
		 wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//create-offer-catalogue/form/paper-dialog/div[2]/paper-input[1]/paper-input-container/div[2]/div/input")))).sendKeys("Cancel");
		 driver.findElement(By.xpath("//paper-input[2]/paper-input-container/div[2]/div/input")).sendKeys("test");
		 driver.findElement(By.xpath("//div[3]/paper-button[2]")).click();
		 
	   }
	   @Then("^Verify Scrolling Offer Catalog$")
	   public void verifyScrolling() throws Throwable
	   {  Thread.sleep(2000);   
	  	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
	  	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
	  	  Thread.sleep(2000);
		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//offer-catalogue-grid/iron-data-table/div/iron-list/div/div[17]/data-table-row/div[1]/data-table-cell[2]")))).click();
		  Actions scrollAction = new Actions(driver);
	      for(int i=0;i<50;i++){
	      scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
	      try{
	      	driver.findElement(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(0, 0)+"')]"));
	      	break;
	      }
	      catch(Exception e){
	      	 }
	      Thread.sleep(2000);
	      }
	      
	      driver.findElement(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(0, 0)+"')]"));
		 
		  
	   }
	   @Then("^Verify Catalog listing$")
	   public void verifyCatalogListing() throws Throwable
	   {
		   Thread.sleep(2000);   
		  	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label"))).click();
		  	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sym1' and @icon='app-primary:offer-catalogue']"))).click();
		  	  Thread.sleep(2000);
			  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//offer-catalogue-grid/iron-data-table/div/iron-list/div/div[17]/data-table-row/div[1]/data-table-cell[2]")))).click();
			  Actions scrollAction = new Actions(driver);
		      for(int i=0;i<50;i++){
		      scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		      try{
		      	driver.findElement(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(0, 0)+"')]"));
		      	break;
		      }
		      catch(Exception e){
		      	 }
		      Thread.sleep(2000);
		      }
		      
		      driver.findElement(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(0, 0)+"')]"));
		      
		      for(int i=1;i<18;i++){
		    	  
		    	  try
		    	  {
		    		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div["+i+"]/data-table-row/div[1]/data-table-cell[4]/paper-menu-button/div/paper-icon-button/iron-icon")))).click();
		    			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[1]"))));
		    			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[2]"))));
		    			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='contentWrapper']/div/paper-menu/div/paper-item[3]"))));
		    		  Thread.sleep(1000);
		    		  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div["+i+"]/data-table-row/div[1]/data-table-cell[3]")))).click();
		    		  Thread.sleep(2000);
		    	  }
		    	  catch (Exception e) {
					
				}
		    	 
		    	  
		    	  }
		      }
}
