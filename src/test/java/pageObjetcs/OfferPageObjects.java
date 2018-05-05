package pageObjetcs;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class OfferPageObjects extends Init {
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	CommonObjects commonObjects = new CommonObjects();
	public ExcelHelper eh = new ExcelHelper();

	public OfferPageObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ".//*[@id='sym2']")
	private WebElement offerButton;
	@FindBy(xpath = "//paper-button[contains(.,'Create New Offer')]")
	private WebElement createNewOfferButton;
	@FindBy(xpath = "//offer-details//label[contains(text(),'Offer Name')]/../..//input")
	private WebElement offerName;
	@FindBy(xpath = "//label[contains(text(),'Description')]/../..//textarea")
	private WebElement offerDescription;
	@FindBy(xpath = "//paper-card//label[contains(.,'Offer Type')]/../..//input")
	private WebElement offerType;
	@FindBy(xpath = "//paper-card//label[contains(.,'Channel')]/../..//input")
	private WebElement offerChannel;
	@FindBy(xpath = "//label[contains(.,'Category')]/../..//input")
	private WebElement offerCategory;
	@FindBy(xpath = "//*[contains(.,'Create New Offer')]/following::paper-button[contains(.,'Proceed')]")
	private WebElement offerProceedButton;
	@FindBy(xpath = ".//*[@id='check']/div/iron-pages/offer-products/form/div/div[2]/paper-button")
	private WebElement offerAddProductButton;
	@FindBy(xpath = "//*[@id='productDialog']/div[2]/paper-button[2]")
	private WebElement dialogBoxAddProductButton;
	@FindBy(xpath = "//label[contains(.,'Language')]/..//input")
	private WebElement creativeLanguage;
	@FindBy(xpath = "//paper-item[contains(.,'English')]")
	private WebElement creativeLanguageEnglishSelect;
	@FindBy(xpath = "//paper-button[contains(.,'Save Offer')]")
	private WebElement saveOfferButton;
	@FindBy(xpath = "//div[@id='topBar']//paper-button[contains(.,'Cancel')]")
	private WebElement cancelOfferButton;
	@FindBy(xpath = "//label[contains(.,'Reward Type')]/..//input")
	private WebElement rewardTypeInputField;
	@FindBy(xpath = "//label[contains(.,'Reward Type')]//following::vaadin-combo-box-item")
	private WebElement rewardTypeAnySelector;
	@FindBy(xpath = "//label[contains(@class,'style-scope paper-input') and contains(text(),'Source')]/..//input")
	private WebElement trackSourceSelector;
	@FindBy(xpath = "//*[@id='form']//label[contains(.,'Title')]/..//input")
	private WebElement CreativeTitle;
	@FindBy(xpath = "//*[@id='form']//label[contains(.,'URL')]/..//input")
	private WebElement wapCreativeUrl;
	@FindBy(xpath = "//label[contains(.,'Details')]/..//textarea")
	private WebElement smsCreativeDetails;
	@FindBy(xpath = "//label[contains(.,'Offer Type')]/../..//input")
	private WebElement offerTypeField;
	@FindBy(xpath = "//paper-item[contains(.,'Combo Vouchers')]")
	private WebElement chooseComboVouchers;
	@FindBy(xpath = ".//offer-products//paper-button[contains(.,'Add')]")
	private WebElement addProductsButton;
	@FindBy(xpath = ".//span[ contains(., 'singleProd2876')]")
	private WebElement addProductsCheckBox;
	@FindBy(xpath = "//label[contains(.,'Subject')]/../input")
	private WebElement voiceCreativeSubject;
	@FindBy(xpath = "//label[contains(.,'Reference')]/../input")
	private WebElement voiceCreativeReference;
	@FindBy(xpath = "//object[@data='../../context-help/EN/Offers.html']")
	private WebElement offersContextHelp;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Product')]/../input")
	private WebElement filterProduct;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;

	// offer page functions
	public void navigateToOffer() throws InterruptedException {
		jswait.loadClick(offerButton);
	}

	public void checkOfferContextHelp() throws InterruptedException {
		commonObjects.clickHelpIcon();
		driver.switchTo().frame(offersContextHelp);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'Offers')]")));
		driver.switchTo().parentFrame();
		commonObjects.clickContextHelpCloseIcon();
	}

	public void enterOfferName(String name) throws InterruptedException {
		jswait.loadSendKeys(offerName, name);
	}

	public void filterUsingProduct(String name) throws InterruptedException {
		jswait.loadSendKeys(filterProduct, name);
	}

	public void enterOfferDescription(String desc) throws InterruptedException {
		jswait.loadSendKeys(offerDescription, desc);
	}

	public void clickCreateNewOfferButton() throws InterruptedException {
		jswait.loadClick(createNewOfferButton);
	}

	public void clickCancelOfferButton() throws InterruptedException {
		jswait.loadClick(cancelOfferButton);
	}

	public void clickTrackSourceSelector() throws InterruptedException {
		jswait.loadClick(trackSourceSelector);
	}

	public void selectTrackSource(String trackSource) throws InterruptedException {
		jswait.loadClick("//paper-item[contains(.,'" + trackSource + "')]");
	}

	public void clickRewardTypeInputField() throws InterruptedException {
		jswait.loadClick(rewardTypeInputField);
	}

	public void clickRewardTypeAny() throws InterruptedException {
		jswait.loadClick(rewardTypeAnySelector);
	}

	public void clickSaveOfferButton() throws InterruptedException {
		jswait.loadClick(saveOfferButton);
	}

	public void clickOfferType() throws InterruptedException {
		jswait.loadClick(offerType);
	}

	public void clickOfferChannel() throws InterruptedException {
		jswait.loadClick(offerChannel);
	}

	public void clickCreativeLanguageField() throws InterruptedException {
		jswait.loadClick(creativeLanguage);
	}

	public void clickCreativeLanguageEnglishSelect() throws InterruptedException {
		jswait.loadClick(creativeLanguageEnglishSelect);
	}

	public void clickOfferCategory() throws InterruptedException {
		jswait.loadClick(offerCategory);
	}

	public void clickProceedButton() throws InterruptedException {
		jswait.loadClick(offerProceedButton);
	}

	public void chooseOfferType() throws InterruptedException {
		jswait.loadClick(offerType);
	}

	public void clickOfferAddButton() throws InterruptedException {
		jswait.loadClick(offerAddProductButton);
	}

	@FindBy(xpath = "//paper-item[contains(.,'WAP Push')]")
	private WebElement offerChannelType;

	public void clickDialogBoxAddButton() throws InterruptedException {
		jswait.loadClick(dialogBoxAddProductButton);
	}

	public void selectOfferType(String offerType) throws InterruptedException {
		clickOfferType();
		jswait.loadClick("//paper-card//paper-item[contains(.,'" + offerType + "')]");
	}

	public void selectOfferChannel(String offerChannel) throws InterruptedException {
		clickOfferChannel();
		jswait.loadClick("//paper-card//paper-item[contains(.,'" + offerChannel + "')]");
	}

	public void selectOfferCategory() throws InterruptedException {
		clickOfferCategory();
		jswait.loadClick("//paper-item[contains(.,'Combo Vouchers')]");
	}

	public void clickOfferTypeField() throws InterruptedException {
		jswait.loadClick(offerTypeField);
	}

	public void clickAddProductsButton() throws InterruptedException {
		jswait.loadClick(addProductsButton);
	}

	public void enterDetailsTabFields(String sheet) throws InterruptedException, IOException {
		eh.setExcelFile("offerInputData", sheet);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eh.setCell(1, 0, name);
		enterOfferName(name);
		enterOfferDescription((String) eh.getCell(1, 1));
		selectOfferType(eh.getCell(1, 2).toString());
		selectOfferChannel(eh.getCell(1, 3).toString());
		selectOfferCategory();
	}

	public void chooseChannelType() throws InterruptedException {
		jswait.loadClick(offerChannelType);
	}

	public void selectCreativeLanguageEnglish() throws InterruptedException, IOException {
		clickCreativeLanguageField();
		clickCreativeLanguageEnglishSelect();
	}

	public void enterWapCreative(String title, String url) throws InterruptedException {
		jswait.loadSendKeys(CreativeTitle, title);
		jswait.loadSendKeys(wapCreativeUrl, url);
	}

	public void enterVoiceCreative(String subject, String reference) throws InterruptedException {
		jswait.loadSendKeys(voiceCreativeSubject, subject);
		jswait.loadSendKeys(voiceCreativeReference, reference);
	}

	public void enterSmsCreative(String title, String details) throws InterruptedException {
		jswait.loadSendKeys(CreativeTitle, title);
		;
		jswait.loadSendKeys(smsCreativeDetails, details);
		;
	}

	public void clickComboVouchers() throws InterruptedException {
		jswait.loadClick(chooseComboVouchers);
	}

	public void enterProductTabFields(String productSheet) throws InterruptedException, IOException {
		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		String productToAdd = (String) prodcutFile.getCell(1, 0);
		clickOfferAddButton();
		commonObjects.filterName(productToAdd);
		jswait.loadClick("//span[contains(.,'" + productToAdd + "')]");
		clickDialogBoxAddButton();
	}

	public void checkAddProductsCheckBox() throws InterruptedException {

		try {
			if (addProductsCheckBox != null) {
				System.out.println("Product is displayed. Not expected");
				// break;
			}

		} catch (Exception e) {

			System.out.println("Product is not displayed");
			// break;
		}
		Thread.sleep(1000);
	}

	public void createNewOffer(String name, String desc) throws InterruptedException {

		enterOfferName(name);
		enterOfferDescription(desc);
		clickOfferTypeField();
		Thread.sleep(2000);
		chooseOfferType();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//paper-item[contains(.,'"+eh.getCell(1,
		// 2)+"')]")).click();
		clickOfferChannel();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//paper-item[contains(.,'"+eh.getCell(1,
		// 3)+"')]")).click();
		chooseChannelType();
		clickOfferCategory();
		Thread.sleep(2000);
		clickComboVouchers();
		Thread.sleep(2000);
		clickProceedButton();
		Thread.sleep(2000);
		clickAddProductsButton();
		Thread.sleep(2000);
		commonObjects.clickFilterIcon(); // issue in filter
		commonObjects.clickFilterResetButton();

		// enterCreateProductDescription("Product with attribute");
		// clickCreateProductSaveButton();
	}

	public void enterOfferDetailsFromSheet(String sheet, String productSheet) throws Throwable {
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		eh.setExcelFile("offerInputData", sheet);

		// ******************Details tab******************:
		enterDetailsTabFields(sheet);
		clickProceedButton();
		// ******************Products tab*****************:
		enterProductTabFields(productSheet);
		clickProceedButton();

		// ******************Creative tab*****************:
		selectCreativeLanguageEnglish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			enterWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		if (eh.getCell(1, 3).toString().contains("SMS"))
			enterSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		if (eh.getCell(1, 3).toString().contains("Voice"))
			enterVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());

		clickProceedButton();
		Thread.sleep(3000);

		// ******************Track tab*****************:
		if (!eh.getCell(1, 2).toString().contains("Informational")) {
			clickTrackSourceSelector();
			selectTrackSource("track");
		}
		clickProceedButton();

		// ******************Rewards tab*****************:
		if (eh.getCell(1, 2).toString().contains("Seeding")) {
			clickRewardTypeInputField();
			clickRewardTypeAny();
		}

	}

	public void createOffer(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsFromSheet(sheet, productSheet);
		clickSaveOfferButton();
	}
}
