package pageObjetcs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	@FindBy(xpath = "//label[contains(.,'Optional1')]/../input")
	private WebElement voiceCreativeOptional1;
	@FindBy(xpath = "//label[contains(.,'Optional2')]/../input")
	private WebElement voiceCreativeOptional2;
	@FindBy(xpath = "//label[contains(.,'Optional3')]/../input")
	private WebElement voiceCreativeOptional3;
	@FindBy(xpath = "//label[contains(.,'Optional4')]/../input")
	private WebElement voiceCreativeOptional4;
	@FindBy(xpath="//paper-item[contains(.,'Edit')]")
	private WebElement optionsEdit;
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
	@FindBy(xpath=".//div[@id='items']/div//data-table-row")
	private WebElement productList;
	@FindBy(xpath=".//iron-icon[@title='Remove']")
	private WebElement productRemoveIcon;
	@FindBy(xpath = "//object[@data='../../context-help/EN/Products.html']")
	private WebElement productContextHelp;
	@FindBy(xpath = ".//label[contains(.,'Tracking Source and Rules')]")
	private List <WebElement> trackingSourceRulesTitle;
	@FindBy(xpath=".//form[@id='sourceTrackRuleForm']//paper-checkbox[@id='setDefaultTrack']")
	private WebElement setAsDefault;
	@FindBy(xpath = ".//div[@class='layout horizontal style-scope offer-track']//paper-button[contains(.,'Add')]")
	private WebElement addTrackButton;
	@FindBy(xpath = ".//form[@id='trackForm']/div[@class='style-scope offer-track']/div[@class='closeImg style-scope offer-track']")
	private WebElement removeTrackRuleButton;
	@FindBy(xpath = ".//div[@class='buttons style-scope offer-track']//paper-button[contains(.,'Yes')]")
	private WebElement removeTrackYesButton;
	@FindBy(xpath = ".//paper-card/form//div/div/div[contains(.,'Define Creative')]")
	private List <WebElement> defineCreativeTitle;
	@FindBy(xpath=".//paper-checkbox[@id='setDefault']")
	private WebElement setAsDefaultCreative;
	@FindBy(xpath = ".//paper-button[contains(.,'Add Creative')]")
	private WebElement addCreativeButton;
	@FindBy(xpath = ".//paper-icon-button[@icon='delete']")
	private WebElement removeCreativeButton;
	@FindBy(xpath = ".//paper-listbox[@id='langDrop']/paper-item")
	private List <WebElement> creativeLanguagesList;
	
	 @FindBy(xpath="//span[text()='Offer Details']/..")
	 private WebElement detailsTab;
	 @FindBy(xpath="//span[text()='Products']/..")
	 private WebElement productsTab;
	 @FindBy(xpath="//paper-dialog//iron-list//data-table-checkbox")
	 private WebElement addProductFirstCheckbox;
	 @FindBy(xpath="//paper-card[@id='rewardDetails']//paper-button[contains(text(),'Add')]")
	 private WebElement rewardAddButton;
	 @FindBy(xpath="//label[contains(text(),'Response on success')]/..//textarea")
	 private WebElement successMessage;
	 @FindBy(xpath="//label[contains(text(),'Response on Failure')]/..//textarea")
	 private WebElement failureMessage;
	 
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
	public void clickRemoveTrackYesButton() throws InterruptedException {
		jswait.loadClick(removeTrackYesButton);
	}
	public void clickRewardAddButton() throws InterruptedException {
		jswait.loadClick(rewardAddButton);
	}
	
	public void selectAllLanguagesCreativeTab() throws Throwable {
		  
		  //clickCreativeLanguageField();
		  
		  if(creativeLanguagesList.size()>0) {
			  
			  for(WebElement language : creativeLanguagesList)  {
					
				    jswait.loadClick(language);
				    clickCreativeLanguageField();
				   
			  }
			  
			  
		  }	  
	  }
	
	public void selectAllCreativeLanguages() throws Throwable {
		clickCreativeLanguageField();
		selectAllLanguagesCreativeTab();
	}
	
	public void chooseAllLanguagesCeativeTab(String sheet, String productSheet) throws Throwable {
		 
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		eh.setExcelFile("offerInputData", sheet);
        
		enterDetailsTabFieldsForTrack(sheet);
		
		clickProceedButton();
		// ******************Products tab*****************:
		enterProductTabFields(productSheet);
		clickProceedButton();
	
		
		selectAllCreativeLanguages();
		

		
	
	}
	
	public void ChooseAllLanguagesCreativeTab(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		chooseAllLanguagesCeativeTab(sheet, productSheet);
		//clickSaveOfferButton();
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
	public void clickRemoveTrackRuleButton() throws InterruptedException {
		
		jswait.loadClick(removeTrackRuleButton);
	}
	public void clickAddTrackButton() throws InterruptedException {
		jswait.loadClick(addTrackButton);
	}
	
	public void enterDetailsTabFieldsForTrack(String sheet) throws InterruptedException, IOException {
		eh.setExcelFile("offerInputData", sheet);
		
		String name= "Test Offer Name";
		
		enterOfferName(name);
		enterOfferDescription((String) eh.getCell(1, 1));
		selectOfferType(eh.getCell(1, 2).toString());
		selectOfferChannel(eh.getCell(1, 3).toString());
		selectOfferCategory();
	}
	public void enterOfferDetailsCreativeTab(String sheet, String productSheet) throws Throwable {
		 
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		eh.setExcelFile("offerInputData", sheet);
        
		enterDetailsTabFieldsForTrack(sheet);
		
		clickProceedButton();
		// ******************Products tab*****************:
		enterProductTabFields(productSheet);
		clickProceedButton();
	
		
		selectCreativeLanguageEnglish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			enterWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		if (eh.getCell(1, 3).toString().contains("SMS"))
			enterSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		if (eh.getCell(1, 3).toString().contains("Voice"))
			enterVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());

		
	
	}
	public void clickAddCreativeButton() throws InterruptedException {
		jswait.loadClick(addCreativeButton);
	}
  public void clickRemoveCreativeButton() throws InterruptedException {
		
		jswait.loadClick(removeCreativeButton);
	}
	
  public void verifySetAsDefaultCheckboxinCreativeTab() throws Throwable {
		
		if(defineCreativeTitle.size()==1)
			assertFalse("Set as default checkbox is displaying", setAsDefaultCreative.isDisplayed());
		
		clickAddCreativeButton();
		assertTrue("Set as default checkbox is not displaying", setAsDefaultCreative.isDisplayed());
		//assertTrue("Set as default checkbox is not selected", setAsDefaultCheckbox.isSelected());
		//Thread.sleep(4000);
		clickRemoveCreativeButton();
		Thread.sleep(4000);
		//clickRemoveTrackYesButton();
		assertFalse("Set as default checkbox is displaying", setAsDefault.isDisplayed());
	}
  public void createOfferAndVerifyOptionalFields(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsFromSheetAndVerifyOptionalFields(sheet, productSheet);
		clickSaveOfferButton();
	}
	
	

	
	
	public void enterOfferDetailsFromSheetAndVerifyOptionalFields(String sheet, String productSheet) throws Throwable {
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
			enterVoiceCreativeWithOptionalFields(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString(), eh.getCell(1, 12).toString(), eh.getCell(1, 13).toString(), eh.getCell(1, 14).toString(), eh.getCell(1, 15).toString());

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
	
	
	public void enterVoiceCreativeWithOptionalFields(String subject, String reference, String optional1, String optional2, String optional3, String optional4) throws InterruptedException {
		jswait.loadSendKeys(voiceCreativeSubject, subject);
		jswait.loadSendKeys(voiceCreativeReference, reference);
		jswait.loadSendKeys(voiceCreativeOptional1, optional1);
		jswait.loadSendKeys(voiceCreativeOptional2, optional2);
		jswait.loadSendKeys(voiceCreativeOptional3, optional3);
		jswait.loadSendKeys(voiceCreativeOptional4, optional4);
	}
	
	public void createOfferUptoCreativeTab(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsCreativeTab(sheet, productSheet);
		//clickSaveOfferButton();
	}
   public void verifySetAsDefaultCheckbox() throws Throwable {
		
		if(trackingSourceRulesTitle.size()==1)
			assertFalse("Set as default checkbox is displaying", setAsDefault.isDisplayed());
		
		clickAddTrackButton();
		assertTrue("Set as default checkbox is not displaying", setAsDefault.isDisplayed());
		//assertTrue("Set as default checkbox is not selected", setAsDefaultCheckbox.isSelected());
		clickRemoveTrackRuleButton();
		clickRemoveTrackYesButton();
		assertFalse("Set as default checkbox is displaying", setAsDefault.isDisplayed());
	
	}
	public void enterOfferDetailsTrackTab(String sheet, String productSheet) throws Throwable {
		 
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		eh.setExcelFile("offerInputData", sheet);
        
		enterDetailsTabFieldsForTrack(sheet);
		
		clickProceedButton();
		// ******************Products tab*****************:
		enterProductTabFields(productSheet);
		clickProceedButton();
	
		
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
		//clickProceedButton();
	
	}
	public void createOfferUptoTrackTab(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsTrackTab(sheet, productSheet);
		//clickSaveOfferButton();
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
	public void checkProductContextHelp() throws InterruptedException {
		commonObjects.clickHelpIcon();
		driver.switchTo().frame(productContextHelp);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'Products')]")));
		driver.switchTo().parentFrame();
		commonObjects.clickContextHelpCloseIcon();
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
	
	public void clickProductRemoveIcon() throws InterruptedException {
		jswait.loadClick(productRemoveIcon);
	}
	
	public void removeProduct(String sheet) throws Throwable {
		clickProceedButton();
		
		clickProductRemoveIcon();
		/*clickProceedButton();
		clickProceedButton();
		clickProceedButton();
		clickSaveOfferButton();
		eh.setExcelFile("offerInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		clickEditOffer();
		clickProceedButton();*/
		
		assertFalse("Product removed successfully", productList.isDisplayed());
			
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

	public void enterSuccessMessage(String s) throws InterruptedException {
		jswait.loadSendKeys(successMessage, s);
	}
	public void enterFailureMessage(String f) throws InterruptedException {
		jswait.loadSendKeys(failureMessage, f);
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
	public void clickEditOffer() throws InterruptedException {
		jswait.loadClick(optionsEdit);
	}
	public void filterWorkaround(String name) throws InterruptedException {
		commonObjects.clickFilterIcon();                            //issue in filter
		commonObjects.clickFilterResetButton();						//issue in filter
		commonObjects.filterName(name);
	}
	
	public void chooseOffer(String sheet) throws Throwable {

		eh.setExcelFile("offerInputData",sheet);
		String name = (String) eh.getCell(1, 0);
		filterWorkaround(name);
		
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
		enterCreativeTabDetails(eh);
		clickProceedButton();
		Thread.sleep(3000);

		// ******************Track tab*****************:
		enterTrackTabDetails(eh);
		clickProceedButton();

		// ******************Rewards tab*****************:
		if (eh.getCell(1, 2).toString().contains("Seeding")) {
			clickRewardTypeInputField();
			clickRewardTypeAny();
		}

	}
	public void enterTrackTabDetails(ExcelHelper eh) throws InterruptedException {
		if (!eh.getCell(1, 2).toString().contains("Informational")) {
			clickTrackSourceSelector();
			selectTrackSource("track");
		}
	}
	public void enterCreativeTabDetails(ExcelHelper eh) throws InterruptedException, IOException {
		selectCreativeLanguageEnglish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			enterWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		if (eh.getCell(1, 3).toString().contains("SMS"))
			enterSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		if (eh.getCell(1, 3).toString().contains("Voice"))
			enterVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());

	}

	public void createOffer(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsFromSheet(sheet, productSheet);
		clickSaveOfferButton();
	}
	public String getDetailsTabColour() {
		String colour = detailsTab.getCssValue("background-color");
		System.out.println(colour);
		return colour;
	}
	public String getProductsTabColour() {
		String colour = productsTab.getCssValue("background-color");
		System.out.println(colour);
		return colour;
	}
	public String getCheckBoxStatus() {
		return addProductFirstCheckbox.getAttribute("checked");
	}
	public void clickAddProductFirstCheckbox() throws InterruptedException {
		jswait.loadClick(addProductFirstCheckbox);
	}
	public void verifyCheckboxOfCreative() throws InterruptedException {
		jswait.loadClick(addCreativeButton);
		jswait.waitForLoadMask();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//div[contains(@class,'defineCreative')]//paper-checkbox"));
		checkboxes.get(0).getAttribute("checked");
		try {
			checkboxes.get(1).getAttribute("checked");
		}catch(Exception e) {
			checkboxes.get(1).click();
			checkboxes.get(1).getAttribute("checked");
			try {
				checkboxes.get(0).getAttribute("checked");
				Assert.assertTrue(false, "error in checked status");
			}catch(Exception e1) {
			}
		}
		
	}
	public void verifyRewardSucessMessage() throws InterruptedException, UnsupportedFlavorException, IOException {
		String s = commonObjects.getTextFormTextField(successMessage);
		Assert.assertTrue(s.length()<=500,"field contains more than 500 chars");
	}
	public void verifyRewardFailureMessage() throws InterruptedException, UnsupportedFlavorException, IOException {
		String s = commonObjects.getTextFormTextField(failureMessage);
		Assert.assertTrue(s.length()<=500,"field contains more than 500 chars");
	}
	
}
