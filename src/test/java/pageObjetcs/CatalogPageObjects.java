package pageObjetcs;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class CatalogPageObjects extends Init{
	public CatalogPageObjects() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();
	CommonObjects commonObjects = new CommonObjects();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	
	
	@FindBy(xpath="//paper-button[text()='Create New Catalog']")
	private WebElement createNewCatalogButton;
	@FindBy(xpath="//div[2]/paper-input[1]/paper-input-container/div[2]/div/input")
	private WebElement catalogName;
	@FindBy(xpath="//paper-input[2]/paper-input-container/div[2]/div/input")
	private WebElement catalogDescription;
	@FindBy(xpath="//create-offer-catalogue//paper-button[contains(text(),'Save')]")
	private WebElement catalogSaveButton;
	@FindBy(xpath="//create-offer-catalogue//paper-button[contains(text(),'Cancel')]")
	private WebElement catalogCancelButton;
	@FindBy(xpath="//paper-button[contains(text(),'Add Offers')]")
	private WebElement catalogAddOffer;
	@FindBy(xpath="//paper-button[text()='Add to Catalog']")
	private WebElement addToCatalogButton;
	@FindBy(xpath="//*[@id='sym1' and @icon='app-primary:offer-catalogue']")
	private WebElement offerCatalogButton;
	@FindBy(xpath="//paper-button[text()='Add to Catalog']/../paper-button[text()='Cancel']")
	private WebElement catalogAddOfferCancelButton;
	@FindBy(xpath="//*[@id='filterForm']//label[contains(text(),'Type')]/..//input")
	private WebElement filterFormOfferType;
	@FindBy(xpath="//*[@id='filterForm']//label[contains(text(),'Type')]/../..//iron-icon")
	private WebElement filterFormOfferTypeDropdownIcon;
	@FindBy(xpath="//*[@id='filterForm']//label[contains(text(),'Channel')]/..//input")
	private WebElement filterFormOfferChannel;
	@FindBy(xpath="//*[@id='filterForm']//label[contains(text(),'Channel')]/../..//iron-icon")
	private WebElement filterFormOfferChannelDropdownIcon;
	@FindBy(xpath="//iron-list//data-table-row//data-table-cell[3]")
	private WebElement catalogGridOfferCount;
	@FindBy(xpath="//h4[contains(text(),'Product Details')]")
	private WebElement offerExpandHeader;
	@FindBy(xpath="//iron-list//data-table-row//data-table-cell/iron-icon[2]")
	private WebElement firstOffer;
	@FindBy(xpath="//label[contains(.,'offers selected')]")
	private WebElement selectedOffersLabel;
	
	@FindBy(xpath="//h4[contains(.,'Creative')]")
	private WebElement offerExpandCreativeLabel;
	@FindBy(xpath="//paper-item[contains(.,'View Offers')]")
	private WebElement optionsViewOffers;
	@FindBy(xpath="//h3[contains(text(),'Offer Catalog')]/following::iron-icon")
	private WebElement editCatalogInViewOffers;
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

	public void enterCatalogName(String name) throws InterruptedException {
		jswait.loadSendKeys(catalogName, name);
	}
	public void enterCatalogDescription(String desc) throws InterruptedException {
		jswait.loadSendKeys(catalogDescription, desc);
	}
	public String getOfferCountFromGrid() throws InterruptedException {
		return catalogGridOfferCount.getText();
	}
	public int getSelectedOfferCountFromLabel() throws InterruptedException {
		String strCount = selectedOffersLabel.getText();
		int i = strCount.indexOf(' ');
		String num = strCount.substring(1, i);
		return Integer.parseInt(num);
	}
	public void checkOfferExpand() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(offerExpandHeader.isDisplayed(), "issue in offer expand");
		Assert.assertTrue(offerExpandCreativeLabel.isDisplayed(), "issue in offer expand");
	}
	public void clickCreateCatalogButton() throws InterruptedException {
		jswait.loadClick(createNewCatalogButton);
	}
	public void clickEditCatalogInViewOffers() throws InterruptedException {
		jswait.loadClick(editCatalogInViewOffers);
	}
	public void clickViewOffersOption() throws InterruptedException {
		jswait.loadClick(optionsViewOffers);
	}
	public void clickFilterFormOfferTypeDropdownIcon() throws InterruptedException {
		jswait.loadClick(filterFormOfferTypeDropdownIcon);
	}
	public void clickFirstOfferRow() throws InterruptedException {
		jswait.loadClick(firstOffer);
	}
	public void clickFilterFormOfferChannelDropdownIcon() throws InterruptedException {
		jswait.loadClick(filterFormOfferChannelDropdownIcon);
	}
	public void clickCatalogAddOffers() throws InterruptedException {
		jswait.loadClick(catalogAddOffer);
	}
	public void navigateToOfferCatalog() throws InterruptedException {
		jswait.loadClick(offerCatalogButton);
	}
	public void clickAddToCatalogButton() throws InterruptedException {
		jswait.loadClick(addToCatalogButton);
	}
	public void clickSaveCatalogButton() throws InterruptedException {
		jswait.loadClick(catalogSaveButton);
	}
	public void selectFilterFormOfferType(String type) throws InterruptedException {
		jswait.loadSendKeys(filterFormOfferType, type);
		clickFilterFormOfferTypeDropdownIcon();
		jswait.loadClick("//paper-item[contains(.,'"+type+"')]");
	}
	public void selectFilterFormOfferChannel(String channel) throws InterruptedException {
		jswait.loadSendKeys(filterFormOfferChannel, channel);
		clickFilterFormOfferChannelDropdownIcon();
		jswait.loadClick("//paper-item[contains(.,'"+channel+"')]");
	}
	public void clickCancelCatalogButton() throws InterruptedException {
		jswait.loadClick(catalogCancelButton);
	}
	public void clickCatalogAddOfferCancelButton() throws InterruptedException {
		jswait.loadClick(catalogAddOfferCancelButton);
	}
	public void enterCatalogDetails(String name) throws InterruptedException {
		enterCatalogName(name);
		enterCatalogDescription("Selenium");		
	}
	public void createCatalog(String name) throws InterruptedException {
		clickCreateCatalogButton();
		enterCatalogDetails(name);
		clickSaveCatalogButton();
	}
	public int addedOffersCount() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//catalogue-offer-listing/iron-data-table//iron-list//data-table-row")));
		   List<WebElement> offersAdded = driver.findElements(By.xpath("//catalogue-offer-listing/iron-data-table//iron-list//data-table-row"));
		   return offersAdded.size();
	}
	public void verifyCatalogNameField() throws InterruptedException, UnsupportedFlavorException, IOException {
		String name = commonObjects.getTextFormTextField(catalogName);
		Assert.assertEquals(name.length(), 30);
	}
	public void verifyCatalogDescriptionField() throws InterruptedException, UnsupportedFlavorException, IOException {
		String desc = commonObjects.getTextFormTextField(catalogDescription);
		Assert.assertEquals(desc.length(), 500);
	}
	public void selectFirstOffer() throws InterruptedException {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='items']//data-table-checkbox"))).click();
		}
	public void selectFirst2Offers() throws InterruptedException {
		selectFirstOffer();
	   List<WebElement> offersToAdd = driver.findElements(By.xpath("//*[@id='items']//data-table-checkbox"));
	   wait.until(ExpectedConditions.elementToBeClickable(offersToAdd.get(1))).click();
	}

}
