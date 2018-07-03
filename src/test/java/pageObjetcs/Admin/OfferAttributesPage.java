package pageObjetcs.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;
import pageObjetcs.CommonObjects;

public class OfferAttributesPage extends Init {
	public OfferAttributesPage() {
		PageFactory.initElements(driver, this);
	}

	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	CommonObjects commonObjects = new CommonObjects();
	public String MULTI_SELECT_ATTRIBUTE_NAME = "";
	
	     @FindBy(xpath="//paper-button[contains(.,'Create New Offer Attribute')]")
		 private WebElement createOfferAttributeButton;
		 @FindBy(xpath=".//*[@id='createNew']//label[text()='Name']/..//input")
		 private WebElement attributeName;
		 @FindBy(xpath=".//*[@id='createNew']//label[text()='Label']/..//input")
		 private WebElement attributeLabel;
		 @FindBy(xpath=".//*[@id='createNew']//paper-checkbox")
		 private WebElement attributeMandatoryCheckbox;
		 @FindBy(xpath=".//*[@id='createNew']//label[text()='Type']/..//input")
		 private WebElement attributeTypeSelector;
		 @FindBy(xpath=".//*[@id='createNew']//paper-item[contains(.,'Text')]")
		 private WebElement attributeTypeTextSelect;
	     @FindBy(xpath=".//*[@id='createNew']//paper-item[contains(.,'Number')]")
		 private WebElement attributeTypeNumberSelect;
	     @FindBy(xpath=".//*[@id='createNew']//paper-item[contains(.,'Single-Select')]")
		 private WebElement attributeTypeSingleSelect;
	     @FindBy(xpath=".//*[@id='createNew']//paper-item[contains(.,'Multi-Select')]")
		 private WebElement attributeTypeMultiSelect;
		 @FindBy(xpath=".//*[@id='createNew']//paper-button[contains(.,'Save')]")
		 private WebElement attributeSaveButton;
		 
		 
		 
		 
		 
		 @FindBy(xpath=".//*[@id='offerAttributeForm']//div[contains(.,'Options')]/div[3]//label[text()='Name']/..//input")
		 private WebElement singleSelectName2;
		 @FindBy(xpath=".//*[@id='offerAttributeForm']//div[contains(.,'Options')]/div[3]//label[text()='Label']/..//input")
		 private WebElement singleSelectLabel2;
		 @FindBy(xpath=".//*[@id='offerAttributeForm']//div[contains(.,'Options')]/div[2]//label[text()='Name']/..//input")
		 private WebElement singleSelectName1;
		 @FindBy(xpath=".//*[@id='offerAttributeForm']//div[contains(.,'Options')]/div[2]//label[text()='Label']/..//input")
		 private WebElement singleSelectLabel1;
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
	
	public void clickCreateNewOfferAttributeButton() throws InterruptedException {
		jswait.loadClick(createOfferAttributeButton);
	}
	public void clickSaveOfferAttributeButton() throws InterruptedException {
		jswait.loadClick(attributeSaveButton);
	}
	public void enterTextAttributeFields(String name,String label) throws InterruptedException {
		jswait.loadSendKeys(attributeName, name);
		jswait.loadSendKeys(attributeLabel, label);
		jswait.loadClick(attributeTypeSelector);
		jswait.loadClick(attributeTypeTextSelect);
	}
	public void enterNumberAttributeFields(String name,String label) throws InterruptedException {
		jswait.loadSendKeys(attributeName, name);
		jswait.loadSendKeys(attributeLabel, label);
		jswait.loadClick(attributeTypeSelector);
		jswait.loadClick(attributeTypeNumberSelect);
	}
	
	public void enterSingleSelectAttributeFields(String name,String label) throws InterruptedException {
		jswait.loadSendKeys(attributeName, name);
		jswait.loadSendKeys(attributeLabel, label);
		jswait.loadClick(attributeTypeSelector);
		jswait.loadClick(attributeTypeSingleSelect);
		jswait.loadSendKeys(singleSelectName1, "name");
		jswait.loadSendKeys(singleSelectLabel1, "LABEL");
		commonObjects.clickPlusIcon();
		jswait.loadSendKeys(singleSelectName2, "name1");
		jswait.loadSendKeys(singleSelectLabel2, "LABEL1");
	}
	
	public void enterMultiSelectAttributeFields(String name,String label) throws InterruptedException {
		jswait.loadSendKeys(attributeName, name);
		jswait.loadSendKeys(attributeLabel, label);
		jswait.loadClick(attributeTypeSelector);
		jswait.loadClick(attributeTypeMultiSelect);
		jswait.loadSendKeys(singleSelectName1, "name");
		jswait.loadSendKeys(singleSelectLabel1, "LABEL");
		commonObjects.clickPlusIcon();
		jswait.loadSendKeys(singleSelectName2, "name1");
		jswait.loadSendKeys(singleSelectLabel2, "LABEL1");
	}
	public void createDefaultSeleniumOfferAttribute(String keyword) throws InterruptedException {
		clickCreateNewOfferAttributeButton();
		enterSingleSelectAttributeFields(keyword+"Single"+"name",keyword+"Single"+"label");
		jswait.loadClick(attributeSaveButton);
		
		clickCreateNewOfferAttributeButton();
		enterTextAttributeFields(keyword+"Text"+"name",keyword+"Text"+"label");
		jswait.loadClick(attributeSaveButton);
		
		clickCreateNewOfferAttributeButton();
		enterMultiSelectAttributeFields(keyword+"Multi"+"name",keyword+"Multi"+"label");
		jswait.loadClick(attributeSaveButton);
		
		clickCreateNewOfferAttributeButton();
		enterNumberAttributeFields(keyword+"Number"+"name",keyword+"Number"+"label");
		jswait.loadClick(attributeSaveButton);
	}
	
	
}
