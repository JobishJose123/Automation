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
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CatalogPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.OfferPageObjects;

public class OfferCatalogSteps extends Init{
	public ExcelHelper eM = new ExcelHelper();
	public ExcelHelper eh = new ExcelHelper();
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
	 	 jswait.loadClick("//data-table-cell[contains(.,'"+eM.getCell(1, 0)+"')]");
	 	 catalogPageObjects.clickAddToCatalogButton();
	    }
	   @Then("^Delete Created Offer Catalogue \"([^\"]*)\"$")
	   public void deleteOfferCatalogue(String sheet) throws Throwable
	   {
		eM.setExcelFile("offerCatalogInputData",sheet);
		commonObjects.filterName(eM.getCell(1, 0).toString());
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeleteOption();
		commonObjects.clickConfirmYesButton(); 
		Exception notDeleted = new Exception("not deleted");
		try {
			commonObjects.clickOptionsIcon();
			throw notDeleted;
			
		}catch(Exception e) {
			
		}
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
		  catalogPageObjects.selectFirst2Offers();
			 catalogPageObjects.clickAddToCatalogButton();
			 Thread.sleep(4000);
			   Exception offerAdd = new Exception("offer not added to catalog after add to catalog button");
			   int offersAdded = catalogPageObjects.addedOffersCount();
				   if(!(offersAdded==2))
				   throw offerAdd;
		}
	   @Then("^Search Offers with Combination of details from \"([^\"]*)\"$")
	   public void searchOffersUsingCobination(String sheet) throws Throwable
	   {
		   eM.setExcelFile("offerInputData", sheet);
		   catalogPageObjects.clickCatalogAddOffers();
		   commonObjects.clickFilterIcon();
		   commonObjects.enterFilterFormname(eM.getCell(1,0).toString());
		   catalogPageObjects.selectFilterFormOfferChannel(eM.getCell(1, 3).toString());
		   catalogPageObjects.selectFilterFormOfferType(eM.getCell(1, 2).toString());
		   commonObjects.clickFilterApplyButton();
		   jswait.loadClick("//data-table-cell[contains(.,'"+eM.getCell(1, 0)+"')]");
		   catalogPageObjects.clickAddToCatalogButton();
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
	   @Then("^Verify Added Catalogue \"([^\"]*)\"$")
	   public void verifyAddedCatalogue(String sheet) throws Throwable
	   {
		   eM.setExcelFile("offerCatalogInputData", sheet);
		   commonObjects.filterName(eM.getCell(1, 0).toString());
		   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(1, 0)+"')]")));
	   }
	   @Then("^Validate Catalogue Name$")
	   public void validateCatalogueName() throws Throwable
	   {
		   catalogPageObjects.clickCreateCatalogButton();
		   catalogPageObjects.clickSaveCatalogButton();
		   catalogPageObjects.enterCatalogName("qwqa1234qweqwewqa@#@_)(:][wedrtyhujikuytre");
		   catalogPageObjects.enterCatalogDescription("wewqa1234qwewertytyuiouqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234qwewqa1234dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd!@#$%^&*()_+{}{{\":?><dddddddddddddddddddddddddddddddjdkfhwieuhfiowuejfewiofjewoifjwioe");
		   catalogPageObjects.verifyCatalogNameField();
		   catalogPageObjects.verifyCatalogDescriptionField();
	   }
	   @Then("^Add fifty more offers to Offer Catalogue$")
	   public void addFiftyMoreOffers() throws Throwable
	   {
		   catalogPageObjects.clickCatalogAddOffers();
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
			catalogPageObjects.clickAddToCatalogButton();
			 Thread.sleep(4000); 
	   }
	   @Then("^Delete Offer \"([^\"]*)\" from Catalogue$")
	   public void deleteOffer(String sheet) throws Throwable
	   {
		eM.setExcelFile("offerInputData", sheet);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(1, 0).toString()+"')]/..//paper-icon-button/iron-icon"))).click();
		Thread.sleep(1500);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(1, 0).toString()+"')]/..//paper-icon-button/iron-icon")));
		
	   }
	   @Then("^verify catalog \"([^\"]*)\" with 50 offers$")
	   public void verifyCatalogWith50Offers(String sheet) throws Throwable
	   {
		   eM.setExcelFile("offerCatalogInputData", sheet);
		   commonObjects.filterName(eM.getCell(1, 0).toString());
		   Thread.sleep(3000);
		   String offerCount = catalogPageObjects.getOfferCountFromGrid();
		   System.out.println("count from UI - "+offerCount);
		   
		   int count= Integer.parseInt(offerCount);
		   System.out.println("Integer count "+count);
		   Assert.assertTrue(count>30, "added offers less than 30");
	   }
	   @Then("^Verify Help Of Offer Catalogue$")
	   public void verifyHelp() throws Throwable
	   {   jswait.loadClick("//flytxt-context-help/paper-icon-button/iron-icon/img");
//		   wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//flytxt-context-help/paper-icon-button/iron-icon/img")))).click();
		   Thread.sleep(1500);
		   String secondUrl = driver.findElement(By.xpath(".//*[@id='content']/object")).getAttribute("data");
		   ((JavascriptExecutor)driver).executeScript("window.open()");
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.get(secondUrl);
		    //driver.switchTo().frame(1);
		    try{
		    driver.findElement(By.xpath("//h1//span[contains(text(),'Catalog')]"));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    }
		    catch (Exception e) {
		    	driver.close();
			    driver.switchTo().window(tabs2.get(0));
			    throw e;
			}	   
		   
	   }
	   @Then("^verify sql injection in offer catalogue$")
	   public void verifysqlinjectionOfferCatalog() throws Throwable
	   {
		   Exception e = new Exception("element displayed after sql injection");
		   commonObjects.filterName(" \"cataloguename'; SELECT * FROM catalogues;");
		   Thread.sleep(3000);
		   if(driver.findElement(By.xpath("//iron-list//data-table-row")).isDisplayed())
			   throw e;
		   	
	   }
	   @Then("^verify Cross site scripting in offer catalogue$")
	   public void verifyCrossSiteScripting() throws Throwable
	   {
		   Exception e = new Exception("element displayed after sql injection");
		   commonObjects.filterName("<script>alert(document.cookies)</script>");
		   Thread.sleep(3000);
		   if(driver.findElement(By.xpath("//iron-list//data-table-row")).isDisplayed())
			   throw e;
	}
	   @Then("^Verify Edit Offer Catalog \"([^\"]*)\"$")
	   public void verifyEditOfferCatalog(String sheet) throws Throwable
	   {
		   eM.setExcelFile("offerCatalogInputData", sheet);
		   commonObjects.filterName(eM.getCell(1, 0).toString());
		   commonObjects.clickOptionsIcon();
		   commonObjects.clickEditOption();
		   catalogPageObjects.enterCatalogName(eM.getCell(1, 0).toString()+"Edit");
		   catalogPageObjects.enterCatalogDescription("EDITED");
		   catalogPageObjects.clickSaveCatalogButton();
		   commonObjects.filterName(eM.getCell(1, 0).toString()+"Edit");
		   commonObjects.clickOptionsIcon();
	   }
	   @Then("^Verify Collapsing Offer in Offer Catalog$")
	   public void verifyCollapsingOfferinCatalog() throws Throwable
	   {   
		   catalogPageObjects.clickFirstOfferRow();
		   catalogPageObjects.checkOfferExpand();
	   }
	   @Then("^Verify Label in offer selected$")
	   public void verifyLabelinOfferCatalogOffersSelection() throws Throwable
	   {
		   catalogPageObjects.clickCatalogAddOffers();
			  catalogPageObjects.selectFirst2Offers();
		   Assert.assertTrue(catalogPageObjects.getSelectedOfferCountFromLabel()==2, "select count incorrect");	         		 
	  
	   }
	   @Then("^Verify searching the offers using invalid information$")
	   public void verifySearchingOffersUsingInvalidInformationInCatalog() throws Throwable
	   {
		   catalogPageObjects.clickCatalogAddOffers();
		   commonObjects.filterName("noOffer123");
		   Exception invalidOffer = new Exception("invalid offer found");
		   try {
			   catalogPageObjects.selectFirstOffer();
			   throw invalidOffer;
		   }catch(Exception e) {
			   
		   }
	   }
	   @Then("^Verify Expanding Offer$")
	   public void verifyExpandingOffer() throws Throwable
	   {
		   catalogPageObjects.clickFirstOfferRow();
		   catalogPageObjects.checkOfferExpand();
			
	   }
	   @Then("^verify options icon$")
	   public void verifyOptionsIcon() throws Throwable
	   {
		   commonObjects.clickOptionsIcon();
		   commonObjects.clickEditOption();
		   catalogPageObjects.clickCancelCatalogButton();
		   commonObjects.clickOptionsIcon();
		   commonObjects.clickDeleteOption();
			
	   }
	   @Then("^Verify Offer Details \"([^\"]*)\"$")
	   public void verifyOfferDetails(String sheet) throws Throwable
	   {
		   eM.setExcelFile("offerInputData", sheet);
		   catalogPageObjects.clickFirstOfferRow();
		   catalogPageObjects.checkOfferExpand();
//		   Assert.assertTrue(offerExpandHeader.isDisplayed(), "issue in offer expand");
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//data-table-cell[contains(.,'"+eM.getCell(1, 0).toString()+"')]")));
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(.,'"+eM.getCell(1, 11).toString()+"')]")));
	   }
	   @Then("^Edit Catalog \"([^\"]*)\" from Catalog screen$")
	   public void editfromCatalogScreen(String sheet) throws Throwable
	   {
		 Thread.sleep(1000);
		 eM.setExcelFile("offerCatalogInputData", sheet);
		 catalogPageObjects.clickEditCatalogInViewOffers();
		 catalogPageObjects.enterCatalogName(eM.getCell(1, 0).toString()+"Edit");
		 catalogPageObjects.clickSaveCatalogButton();
		 catalogPageObjects.clickEditCatalogInViewOffers();
		 
	   }
	   @Then("^Verify Scrolling Offer Catalog for \"([^\"]*)\"$")
	   public void verifyScrolling(String sheet) throws Throwable
	   {  
		   commonObjects.clickOptionsIcon();
		   jswait.loadClick("//iron-list//data-table-cell");
		   eM.setExcelFile("offerCatalogInputData", sheet);
		   jswait.scrollIntoView("//iron-list", "//data-table-cell[contains(.,'"+eM.getCell(1, 0).toString()+"')]");

	   }
	   @Then("^Verify Catalog listing$")
	   public void verifyCatalogListing() throws Throwable
	   {
		  
	   }
	   @Then("^edit offer catalog$")
		 public void editOfferCatalog() throws Throwable {
			 commonObjects.clickOptionsIcon();
			 catalogPageObjects.clickViewOffersOption();
		 }
	   @Then("^remove offer for offer catalog from sheet \"([^\"]*)\"$")
		public void removeOfferCatalog(String sheet) throws Throwable {
		 
		  
		 catalogPageObjects.removeOfferCatalog(sheet);
		  
		  }



	   @Then("^choose offer catalog from sheet \"([^\"]*)\"$")
		public void chooseOffer(String sheet) throws Throwable {
			
		   catalogPageObjects.chooseOfferCatalog(sheet);
		}
	   @Then("^verify cross site scripting in new catalog$")
		public void verifyCrossSiteScrptingInewNewCatalog() throws Throwable {
			
		   catalogPageObjects.clickCreateCatalogButton();
		   catalogPageObjects.enterCatalogDescription("cross site");
		   String name = "";
		   char[] specialChar = {'>','<','\'' , ';' ,'"'};
		   for(char c:specialChar) {
			   name = "name"+c;
		   catalogPageObjects.enterCatalogName(name);
		   catalogPageObjects.clickSaveCatalogButton();
		   }
		   catalogPageObjects.clickSaveCatalogButton();
		}
	   @Then("^click view offers of \"([^\"]*)\" in options$")
		public void navigateToViewOffers(String sheet) throws Throwable {
		   eh.setExcelFile("offerCatalogInputData",sheet);
			String name = (String) eh.getCell(1, 0);
			commonObjects.filterName(name);
			commonObjects.clickOptionsIcon();
			catalogPageObjects.clickViewOffersOption();
		}
	   @Then("^verify label of offer catalog$")
		public void verifyLabelsOfOfferCatalog() throws Throwable {
		   catalogPageObjects.verifyHeaders();
		}
	   
	   @Then("^navigate to Offer Catalog page$")
	   public void navigate_to_Offer_Catalog_page() throws Exception{
		   catalogPageObjects.OffercatalogPage();
	   }
	   
	   @Then("^filter the Offer Catalog from sheet \"([^\"]*)\"$")
	   public void filter_the_Offer_Catalog_from_sheet(String arg1) throws Exception{
		   eh.setExcelFile("offerCatalogInputData", arg1);
		   String CatalogName=eh.getCellByColumnName("Catalog Name");
		   catalogPageObjects.FilterOfferCatalog(CatalogName);
	   }
	   @Then("^edit the Offer Catalog$")
	   public void edit_the_Offer_Catalog() throws Exception{
		   catalogPageObjects.editOfferCatalog();
	   }
	   @Then("^verify the offer from sheet \"([^\"]*)\" is displayed for the Catalog$")
	   public void verify_the_offer_from_sheet_is_displayed_for_the_Catalog(String OfferName) throws Exception{
		   eM.setExcelFile("offerInputData",OfferName);
		   String str=eM.getCell(1,0).toString();
		   catalogPageObjects.viewOfferinCatalog(str);
	   }
	   @Then("^view the details of the offer$")
	   public void view_details_of_the_offer() throws Exception{
	   catalogPageObjects.detailsOfOffer();
	   }
	   @Then("^add offer to the catlog from sheet \"([^\"]*)\" and verify$")
	   public void add_offer_to_the_catlog_from_sheet_and_verify(String offerSheet) throws Throwable {
		  catalogPageObjects.clickCatalogAddOffers();
	      eh.setExcelFile("offerInputData",offerSheet);
	      String OfferName = eh.getCellByColumnName("Offer Name").toString();
	      commonObjects.filterName(OfferName);
	      catalogPageObjects.addOfferToCatalog(OfferName);
	   }
	   @Then("^delete the Offer from sheet \"([^\"]*)\" and verify$")
	   public void delete_the_Offer_from_sheet_and_verify(String offerToDelete) throws Throwable {
		   catalogPageObjects.deleteOffer(offerToDelete);
	   }
	   @Then("^add copied offer to the catalog from sheet \"([^\"]*)\"$")
	   public void add_copied_offer_to_the_catalog_from_sheet(String offerSheet) throws Throwable {
		   catalogPageObjects.clickCatalogAddOffers();
		      eh.setExcelFile("offerInputData",offerSheet);
		      String OfferName = (eh.getCellByColumnName("Offer Name").toString())+"_Copy";
		      commonObjects.filterName(OfferName);
		      catalogPageObjects.addOfferToCatalog(OfferName);
		      
		      
		      
}
	   
	   @Then("^Add offer to Offer Catalogue$")
	   public void add_offer_to_Offer_Catalogue() throws Throwable {
		   try {
		   for(int row=1;row<=8;row++){
		   eM.setExcelFile("BambooBuildDetails","offerData");
		   String offername=(String) eM.getCell(row, 0);
		 	 catalogPageObjects.clickCatalogAddOffers();
		 	 commonObjects.filterName(offername);
		 	 jswait.loadClick("//data-table-cell[contains(.,'"+offername+"')]");
		 	Thread.sleep(2000);
		 	 catalogPageObjects.clickAddToCatalogButton();
		   }
		   }
		   catch(Exception e) {
			   System.out.println("all 8 offers not added to the catalog");
		   }
	   
	   
	   }
	   
	   
	   
	   @Then("^Add offer to Offer CatalogueIM$")
	   public void add_offer_to_Offer_CatalogueIM() throws Throwable {
		   try {
		   for(int row=1;row<=6;row++){
		   eM.setExcelFile("BambooBuildDetails","offerData");
		   String offername=(String) eM.getCell(row, 0);
		 	 catalogPageObjects.clickCatalogAddOffers();
		 	 commonObjects.filterName(offername);
		 	 jswait.loadClick("//data-table-cell[contains(.,'"+offername+"')]");
		 	 Thread.sleep(2000);
		 	 catalogPageObjects.clickAddToCatalogButton();
		   }
		   }
		   catch(Exception e) {
			   System.out.println("all offers required are not added");
		   }
//		   for(int row=9;row<=12;row++){
//			   eM.setExcelFile("BambooBuildDetails","offerData");
//			   String offername=(String) eM.getCell(row, 0);
//			 	 catalogPageObjects.clickCatalogAddOffers();
//			 	 commonObjects.filterName(offername);
//			 	 jswait.loadClick("//data-table-cell[contains(.,'"+offername+"')]");
//			 	 catalogPageObjects.clickAddToCatalogButton();
//			   }
//		   }
//		   catch(Exception e) {
//			   System.out.println("all 8 offers not added to the catalog");
//		   }
	   }
		   @Then("^view offer in the catalog \"([^\"]*)\"$")
		   public void viewOfferClick(String offerCatalogSheet) throws Throwable {  
			   eh.setExcelFile("offerCatalogInputData", offerCatalogSheet);
			   String offerCatalogName=eh.getCell(1, 0).toString();
			   commonObjects.filterName(offerCatalogName);
				  commonObjects.clickOptionsIcon();	
             jswait.loadClick("(//data-table-cell[contains(.,'"+offerCatalogName+"')]//following::paper-item[contains(.,'View Offers')])[1]");
		   }
}