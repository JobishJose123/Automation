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

	final String TRACK_SOURCE = "A_track_Sel";
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
	@FindBy(xpath = "//paper-button[contains(.,'Proceed')]")
	private WebElement offerEditProceedButton;
	@FindBy(xpath = ".//*[@id='check']/div/iron-pages/offer-products/form/div/div[2]/paper-button")
	private WebElement offerAddProductButton;
	@FindBy(xpath = "//*[@id='productDialog']/div[2]/paper-button[2]")
	private WebElement dialogBoxAddProductButton;
	@FindBy(xpath = "//label[contains(.,'Language')]/..//input")
	private WebElement creativeLanguage;
	@FindBy(xpath = "//paper-item[contains(.,'English')]")
	private WebElement creativeLanguageEnglishSelect;
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//paper-item[contains(.,'Spanish')]")
	private WebElement secondCreativeLanguageSpanishSelect;
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
	@FindBy(xpath = "//paper-item[contains(.,'Edit')]")
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
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//*[@id='form']//label[contains(.,'Title')]/..//input")
	private WebElement secondCreativeTitle;
	@FindBy(xpath = "//*[@id='form']//label[contains(.,'URL')]/..//input")
	private WebElement wapCreativeUrl;
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//*[@id='form']//label[contains(.,'URL')]/..//input")
	private WebElement secondWapCreativeUrl;
	@FindBy(xpath = "//label[contains(.,'Details')]/..//textarea")
	private WebElement smsCreativeDetails;
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//label[contains(.,'Details')]/..//textarea")
	private WebElement secondSmsCreativeDetails;
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
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//label[contains(.,'Subject')]/../input")
	private WebElement secondVoiceCreativeSubject;
	@FindBy(xpath = "//label[contains(.,'Reference')]/../input")
	private WebElement voiceCreativeReference;
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//label[contains(.,'Reference')]/../input")
	private WebElement secondVoiceCreativeReference;
	@FindBy(xpath = "//object[@data='../../context-help/EN/Offers.html']")
	private WebElement offersContextHelp;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Product')]/../input")
	private WebElement filterProduct;
	@FindBy(xpath = ".//div[@id='items']/div//data-table-row")
	private WebElement productList;
	@FindBy(xpath = ".//iron-icon[@title='Remove']")
	private WebElement productRemoveIcon;
	@FindBy(xpath = "//object[@data='../../context-help/EN/Products.html']")
	private WebElement productContextHelp;
	@FindBy(xpath = ".//label[contains(.,'Tracking Source and Rules')]")
	private List<WebElement> trackingSourceRulesTitle;
	@FindBy(xpath = ".//form[@id='sourceTrackRuleForm']//paper-checkbox[@id='setDefaultTrack']/..")
	private WebElement setAsDefault;
	@FindBy(xpath = ".//div[@class='layout horizontal style-scope offer-track']//paper-button[contains(.,'Add')]")
	private WebElement addTrackButton;
	@FindBy(xpath = ".//form[@id='trackForm']/div[@class='style-scope offer-track']/div[@class='closeImg style-scope offer-track']")
	private WebElement removeTrackRuleButton;
	@FindBy(xpath = ".//div[@class='buttons style-scope offer-track']//paper-button[contains(.,'Yes')]")
	private WebElement removeTrackYesButton;
	@FindBy(xpath = ".//paper-card/form//div/div/div[contains(.,'Define Creative')]")
	private List<WebElement> defineCreativeTitle;
	@FindBy(xpath = ".//paper-checkbox[@id='setDefault']")
	private WebElement setAsDefaultCreative;
	@FindBy(xpath = ".//paper-button[contains(.,'Add Creative')]")
	private WebElement addCreativeButton;
	@FindBy(xpath = ".//paper-icon-button[@icon='delete']")
	private WebElement removeCreativeButton;
	@FindBy(xpath = ".//paper-listbox[@id='langDrop']/paper-item")
	private List<WebElement> creativeLanguagesList;

	@FindBy(xpath = "//span[text()='Offer Details']/..")
	private WebElement detailsTab;
	@FindBy(xpath = "//span[text()='Creative']/..")
	private WebElement creativeTab;
	@FindBy(xpath = "//span[text()='Products']/..")
	private WebElement productsTab;
	@FindBy(xpath = "//paper-dialog//iron-list//data-table-checkbox")
	private WebElement addProductFirstCheckbox;
	@FindBy(xpath = "//paper-card[@id='rewardDetails']//paper-button[contains(text(),'Add')]")
	private WebElement rewardAddButton;
	@FindBy(xpath = "//label[contains(text(),'Response on success')]/..//textarea")
	private WebElement successMessage;
	@FindBy(xpath = "//label[contains(text(),'Response on Failure')]/..//textarea")
	private WebElement failureMessage;

	@FindBy(xpath = "//creative-wrapper//define-creative[2]//label[contains(.,'Language')]/..//input")
	private WebElement secondCreativeLanguageSelector;
	@FindBy(xpath = "//div[contains(text(),'Offers')]")
	private WebElement offersHeader;
	@FindBy(xpath = "//offer-grid//data-table-cell[contains(.,'Offer Name')]")
	private WebElement gridHeaderOfferName;
	@FindBy(xpath = "//offer-grid//data-table-cell[contains(.,'Type')]")
	private WebElement gridHeaderType;
	@FindBy(xpath = "//offer-grid//data-table-cell[contains(.,'Channel')]")
	private WebElement gridHeaderChannel;
	@FindBy(xpath = "//offer-grid//data-table-cell[contains(.,'Conversion')]")
	private WebElement gridHeaderConversion;
	@FindBy(xpath = "//select-product//iron-list//data-table-row")
	private List<WebElement> selectedProducts;
	@FindBy(xpath = "//paper-dialog//iron-list/div/div[2]//data-table-row//data-table-checkbox")
	private WebElement addProductSecondCheckbox;
	@FindBy(xpath = "//offer-products//form/div[2]//paper-button[text()='Add']")
	private WebElement addProductButtonAfterOneProduct;
	@FindBy(xpath = "//*[@d='M11 6c1.38 0 2.63.56 3.54 1.46L12 10h6V4l-2.05 2.05C14.68 4.78 12.93 4 11 4c-3.53 0-6.43 2.61-6.92 6H6.1c.46-2.28 2.48-4 4.9-4zm5.64 9.14c.66-.9 1.12-1.97 1.28-3.14H15.9c-.46 2.28-2.48 4-4.9 4-1.38 0-2.63-.56-3.54-1.46L10 12H4v6l2.05-2.05C7.32 17.22 9.07 18 11 18c1.55 0 2.98-.51 4.14-1.36L20 21.49 21.49 20l-4.85-4.86z']/../../..")
	private WebElement mapVariableIcon;
	@FindBy(xpath = "//iron-data-table[@id='variablesList']//iron-list//data-table-row")
	private WebElement mapVariableFirstVariable;
	@FindBy(xpath = "//paper-button[text()='OK']")
	private WebElement mapVariableOkButton;
	@FindBy(xpath = "//div[@class='buttons style-scope variable-dialog']/paper-button[1]")
	private WebElement mapVariableCancelButton;
	@FindBy(xpath = "//iron-data-table[@id='variablesList']//div[@id='header']//data-table-row[contains(.,'Name') and contains(.,'Field') and contains(.,'Limit') and contains(.,'Default')]")
	private WebElement mapVariableDialogHeader;
	
//Track Tab in Offer Creation	
	 @FindBy(xpath="//paper-button[text()='Add Rule']")
	 private WebElement addRuleButton;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Rule Name')]/../input")
	 private WebElement addTrackingRuleRuleName;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Priority')]/../input")
	 private WebElement addTrackingRulePrioritySelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Priority')]/../../../../../../..//paper-item[contains(.,'2')]")
	 private WebElement addTrackingRulePrioritySelect2;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//paper-button[contains(.,'Add')]")
	 private WebElement addTrackingRuleAddConditionButton;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Parameter')]/../input")
	 private WebElement  addTrackingRuleSecondConditionParameterSelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Parameter')]/../../../../../../..//paper-item[contains(.,'Age')]")
	 private WebElement addTrackingRuleSecondConditionParameterSelectAge;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Condition')]/../input")
	 private WebElement addTrackingRuleSecondConditionConditionSelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Condition')]/../../../../../../..//paper-item[contains(.,'is greater than')]")
	 private WebElement addTrackingRuleSecondConditionConditionSelectisGreaterThan;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Value')]/../input")
	 private WebElement addTrackingRuleSecondConditionConditionValue;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Parameter')]/../input")
	 private WebElement  addTrackingRuleConditionParameterSelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Parameter')]/../../../../../../..//paper-item[contains(.,'Age')]")
	 private WebElement addTrackingRuleConditionParameterSelectAge;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Condition')]/../input")
	 private WebElement addTrackingRuleConditionConditionSelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Condition')]/../../../../../../..//paper-item[contains(.,'is greater than')]")
	 private WebElement addTrackingRuleConditionConditionSelectisGreaterThan;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Value')]/../input")
	 private WebElement addTrackingRuleConditionConditionValue;
	 @FindBy(xpath="//form[@id='trackRuleForm']//div[@id='scrollable']/div/iron-icon")
	 private WebElement addTrackingRuleConditionDeleteButton;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//paper-button[text()='Save']")
	 private WebElement addTrackingRuleSaveButton;
	 @FindBy(xpath="//form[@id='trackRuleForm']//paper-button[text()='Save']")
	 private WebElement editTrackingRuleSaveButton;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//paper-button[text()='Cancel']")
	 private WebElement addTrackingRuleCancelButton;
	 @FindBy(xpath="//recharge-rule-grid//iron-list/div/div[2]/data-table-row//data-table-cell[4]//iron-icon")
	 private WebElement editRule;
	 @FindBy(xpath="//recharge-rule-grid//iron-list/div/div[2]/data-table-row//data-table-cell[5]//iron-icon")
	 private WebElement deleteRule;
	 @FindBy(xpath="//paper-dialog[@id='deleteRule']//paper-button[text()='Yes']")
	 private WebElement deleteRuleConfirmYes;
	 @FindBy(xpath="//paper-dialog[@id='deleteRule']//paper-button[text()='No']")
	 private WebElement deleteRuleConfirmNo;
	 @FindBy(xpath="//form[@id='trackRuleForm']//paper-input[@label='Rule Name']//input")
	 private WebElement editTrackRuleName;
	 @FindBy(xpath="//offer-track/div//paper-button[text()='Add']")
	 private WebElement addTrackSourceButton;
	 @FindBy(xpath="//form[@id='trackForm']/div[2]//iron-icon")
	 private WebElement secondTrackSourceDeleteButton;
	 @FindBy(xpath="//paper-dialog[@id='confirmation']//paper-button[text()='Yes']")
	 private WebElement trackSourceDeleteConfirmYes;
	 
// Creative tab in offer creation
	 @FindBy(xpath="//variable-dialog/paper-dialog//paper-radio-button[2]/div[@id='radioContainer']")
	 private WebElement addNewVariableButton;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Name')]/..//input")
	 private WebElement addVariableName;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Source')]/..//input")
	 private WebElement addVariableSourceSelector;
	 @FindBy(xpath="//paper-item[@value='ProfileField']")
	 private WebElement addVariableSourceProfileSelect;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Field')]/..//input")
	 private WebElement addVariableFieldSelector;
	 @FindBy(xpath="//vaadin-combo-box-item[contains(.,'Age_q11')]")
	 private WebElement addVariableFieldAgeSelect;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Limit')]/..//input")
	 private WebElement addVariableLimit;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Format')]/..//input")
	 private WebElement addVariableFormatSelector;
	 @FindBy(xpath="//paper-item[@value='NO_FORMAT']")
	 private WebElement addVariableFormatNoFormatSelect;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Default')]/..//input")
	 private WebElement addVariableDefault;
	 @FindBy(xpath="//iron-data-table[@id='variablesList']//data-table-row/div[1]/data-table-cell[5]/paper-icon-button[@role='button']")
	 private WebElement addVariableEditButton;
	 @FindBy(xpath="//define-creative[@id='define-creative-0']//paper-button[contains(text(),'Save')]")
	 private WebElement addVariableSaveButton;
	 @FindBy(xpath="//define-creative[@id='define-creative-0']//paper-button[contains(text(),'Cancel')]")
	 private WebElement addVariableCancelButton;
	 @FindBy(xpath="//variable-dialog/paper-dialog//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	 private WebElement mapVariableFilterButton;
	 @FindBy(xpath="//iron-data-table[@id='variablesList']//data-table-row/div[1]/data-table-cell[6]/paper-icon-button[@role='button']")
	 private WebElement addVariableDeleteButton;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
//	 @FindBy(xpath="")
//	 private WebElement ;
	 
//  Creative Tab in Offer Creation	functions
	 public void clickAddNewVariableButton() throws InterruptedException {
			jswait.loadClick(addNewVariableButton);
		}
	 public void clickMapVariableCancelButton() throws InterruptedException {
			jswait.loadClick(mapVariableCancelButton);
		}
	 public void clickAddVariableDeleteButton() throws InterruptedException {
			jswait.loadClick(addVariableDeleteButton);
		}
	 public void clickAddNewVariableSaveButton() throws InterruptedException {
			jswait.loadClick(addVariableSaveButton);
		}
	 public void clickAddNewVariableCancelButton() throws InterruptedException {
			jswait.loadClick(addVariableCancelButton);
		}
	 public void MapVariableFilterName(String name) throws InterruptedException {
			jswait.loadClick(mapVariableFilterButton);
			jswait.loadSendKeys("//iron-data-table[@id='variablesList']//paper-dialog[@id='filterDialog']//label[contains(text(),'Name')]/..//input",name);
			jswait.loadClick("//iron-data-table[@id='variablesList']//paper-dialog[@id='filterDialog']//paper-button[contains(text(),'Apply')]");
		}
	 public void clickAddNewVariableEditButton() throws InterruptedException {
			jswait.loadClick(addVariableEditButton);
		}
	 public void enterAddVariableName(String text) throws InterruptedException {
			jswait.loadSendKeys(addVariableName,text);
		}
	 public void enterAddVariableLimit(String text) throws InterruptedException {
			jswait.loadSendKeys(addVariableLimit,text);
		}
	 public void enterAddVariableDefault(String text) throws InterruptedException {
			jswait.loadSendKeys(addVariableDefault,text);
		}
	 public void selectAddVariableSourceProfileField() throws InterruptedException {
			jswait.loadClick(addVariableSourceSelector);
			jswait.loadClick(addVariableSourceProfileSelect);
		}
	 public void selectAddVariableFormatNoFormat() throws InterruptedException {
			jswait.loadClick(addVariableFormatSelector);
			jswait.loadClick(addVariableFormatNoFormatSelect);
		}
	 public void selectAddVariableFieldAge() throws InterruptedException {
			jswait.loadSendKeys(addVariableFieldSelector,"Age_q11");
			jswait.loadClick(addVariableFieldAgeSelect);
		}
	 public void enterFirstDynamicVariableDetails(String name) throws InterruptedException {
		 enterAddVariableName(name);
			selectAddVariableSourceProfileField();
			selectAddVariableFieldAge();
			selectAddVariableFormatNoFormat();
			enterAddVariableLimit("100");
			enterAddVariableDefault("10");
		}
	 public void createFirstVariable(String name) throws InterruptedException {
			clickAddNewVariableButton();
			enterFirstDynamicVariableDetails(name);
			clickAddNewVariableSaveButton();
		}
	 public void createSecondVariable(String name) throws InterruptedException {
			clickAddNewVariableButton();
			enterAddVariableName(name);
			selectAddVariableSourceProfileField();
			selectAddVariableFieldAge();
			selectAddVariableFormatNoFormat();
			enterAddVariableLimit("100");
			enterAddVariableDefault("10");
			clickAddNewVariableSaveButton();
		}
	 
//	Track Tab in Offer Creation	functions
	 public void clickAddTrackSourceButton() throws InterruptedException {
			jswait.loadClick(addTrackSourceButton);
		}
	 public void clicktrackSourceDeleteConfirmYes() throws InterruptedException {
			jswait.loadClick(trackSourceDeleteConfirmYes);
		}
	 public void clickSecondTrackSourceDeleteButton() throws InterruptedException {
			jswait.loadClick(secondTrackSourceDeleteButton);
		}
	 public int getNumberOfTrackSources() throws InterruptedException {
		 	Thread.sleep(3000);
		 	List <WebElement> trackSources = driver.findElements(By.xpath("//label[.='Tracking Source and Rules']"));
			return trackSources.size();
		}
	
	 public void clickAddRuleButton() throws InterruptedException {
			jswait.loadClick(addRuleButton);
		}
	 public void clickEditRuleSaveButton() throws InterruptedException {
			jswait.loadClick(editTrackingRuleSaveButton);
		}
	 public void enterRuleName(String text) throws InterruptedException {
			jswait.loadSendKeys(addTrackingRuleRuleName,text);
		}
	 public void enterEditRuleName(String text) throws InterruptedException {
			jswait.loadSendKeys(editTrackRuleName,text);
		}
	 public void selectPriority(String text) throws InterruptedException {
			jswait.loadClick(addTrackingRulePrioritySelector);
			jswait.loadClick("//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Priority')]/../../../../../../..//paper-item[contains(.,'"+text+"')]");
		}
	 public void clickAddTrackingRuleAddConditionButton() throws InterruptedException {
			jswait.loadClick(addTrackingRuleAddConditionButton);
		}
	 public void selectAddTrackingRuleConditionParameterAge() throws InterruptedException {
			jswait.loadClick(addTrackingRuleConditionParameterSelector);
			jswait.loadClick(addTrackingRuleConditionParameterSelectAge);
		}
	 public void selectAddTrackingRuleConditionConditionGreaterThan() throws InterruptedException {
			jswait.loadClick(addTrackingRuleConditionConditionSelector);
			jswait.loadClick(addTrackingRuleConditionConditionSelectisGreaterThan);
		}
	 public void enterAddTrackingRuleConditionConditionValue(String text) throws InterruptedException {
			jswait.loadSendKeys(addTrackingRuleConditionConditionValue,text);
		}
	 public void selectAddTrackingRuleSecondConditionParameterAge() throws InterruptedException {
			jswait.loadClick(addTrackingRuleSecondConditionParameterSelector);
			jswait.loadClick(addTrackingRuleSecondConditionParameterSelectAge);
		}
	 public void selectAddTrackingRuleSecondConditionConditionGreaterThan() throws InterruptedException {
			jswait.loadClick(addTrackingRuleSecondConditionConditionSelector);
			jswait.loadClick(addTrackingRuleSecondConditionConditionSelectisGreaterThan);
		}
	 public void enterAddTrackingRuleSecondConditionConditionValue(String text) throws InterruptedException {
			jswait.loadSendKeys(addTrackingRuleSecondConditionConditionValue,text);
		}
	 public void clickAddTrackingRuleConditionDeleteButton() throws InterruptedException {
			jswait.loadClick(addTrackingRuleConditionDeleteButton);
		}
	 public void clickaddTrackingRuleSaveButton() throws InterruptedException {
			jswait.loadClick(addTrackingRuleSaveButton);
		}
	 public void clickaddTrackingRuleCancelButton() throws InterruptedException {
			jswait.loadClick(addTrackingRuleCancelButton);
		}
	 public void clickEditRule() throws InterruptedException {
			jswait.loadClick(editRule);
		}
	 public void clickDeleteRule() throws InterruptedException {
			jswait.loadClick(deleteRule);
		}
	 public void clickDeleteRuleConfirmYes() throws InterruptedException {
			jswait.loadClick(deleteRuleConfirmYes);
		}
	 public void clickDeleteRuleConfirmNo() throws InterruptedException {
			jswait.loadClick(deleteRuleConfirmNo);
		}
	 public void checkRuleCreation(String ruleName) throws Exception {
		 jswait.waitUntil("//span[text()='"+ruleName+"']");
		 jswait.waitUntil("//span[contains(.,'Age is greater than 18, Age is greater than 19')]");
	 }
	 public void createTrackRuleCondition() throws InterruptedException {
		 clickAddTrackingRuleAddConditionButton();
			selectAddTrackingRuleConditionParameterAge();
			selectAddTrackingRuleConditionConditionGreaterThan();
			enterAddTrackingRuleConditionConditionValue("18");
	 }
	 public void createSecondTrackRuleCondition() throws InterruptedException {
		 clickAddTrackingRuleAddConditionButton();
			selectAddTrackingRuleSecondConditionParameterAge();
			selectAddTrackingRuleSecondConditionConditionGreaterThan();
			enterAddTrackingRuleSecondConditionConditionValue("19");
	 }
	 public void enterDetailsFirstDefaultTrackingRuleCondition(String name) throws InterruptedException {
		 enterRuleName(name);
			selectPriority("2");
			createTrackRuleCondition();
			createSecondTrackRuleCondition();
	 }
	 public void enterDetailsFirstDefaultTrackingRuleCondition() throws InterruptedException {
		 enterRuleName("defRule");
			selectPriority("2");
			createTrackRuleCondition();
			createSecondTrackRuleCondition();
	 }
	 public void createFirstDefaultTrackingRuleCondition() throws Exception {
		 	clickAddRuleButton();
		 	enterDetailsFirstDefaultTrackingRuleCondition("firstRule");
			clickaddTrackingRuleSaveButton();
			checkRuleCreation("firstRule");
	 }
	 public void createFirstDefaultTrackingRuleCondition(String name) throws Exception {
		 	clickAddRuleButton();
		 	enterDetailsFirstDefaultTrackingRuleCondition(name);
			clickaddTrackingRuleSaveButton();
			checkRuleCreation(name);
	 }
	 public void createSecondDefaultTrackingRuleCondition() throws Exception {
		 	clickAddRuleButton();
			enterRuleName("secondRule");
			selectPriority("3");
			createTrackRuleCondition();
			clickaddTrackingRuleSaveButton();
			checkRuleCreation("secondRule");
	 }
	 

	// offer page functions
	public void navigateToOffer() throws InterruptedException {
		jswait.loadClick(offerButton);
	}

	public void clickRemoveTrackYesButton() throws InterruptedException {
		jswait.loadClick(removeTrackYesButton);
	}
	public void clickOfferEditProceedButton() throws InterruptedException {
		jswait.loadClick(offerEditProceedButton);
	}

	public void clickAddProductAfterOneProduct() throws InterruptedException {
		jswait.loadClick(addProductButtonAfterOneProduct);
	}

	public void clickMapVariableOkButton() throws InterruptedException {
		jswait.loadClick(mapVariableOkButton);
	}

	public void clickRewardAddButton() throws InterruptedException {
		jswait.loadClick(rewardAddButton);
	}

	public void clickMapVariableIcon() throws InterruptedException {
		jswait.loadClick(mapVariableIcon);
	}

	public int getSelectedProductCount() throws InterruptedException {
		return selectedProducts.size();
	}

	public void clickMapVariableFirstVariable() throws InterruptedException {
		jswait.loadClick(mapVariableFirstVariable);
	}

	public void clickAddProductSecondCheckbox() throws InterruptedException {
		jswait.loadClick(addProductSecondCheckbox);
	}

	public void selectAllLanguagesCreativeTab() throws Throwable {

		// clickCreativeLanguageField();

		if (creativeLanguagesList.size() > 0) {

			for (WebElement language : creativeLanguagesList) {

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
		// clickSaveOfferButton();
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

		String name = "Test Offer Name";

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

		if (defineCreativeTitle.size() == 1)
			assertFalse("Set as default checkbox is displaying", setAsDefaultCreative.isDisplayed());

		clickAddCreativeButton();
		assertTrue("Set as default checkbox is not displaying", setAsDefaultCreative.isDisplayed());
		// assertTrue("Set as default checkbox is not selected",
		// setAsDefaultCheckbox.isSelected());
		// Thread.sleep(4000);
		clickRemoveCreativeButton();
		Thread.sleep(4000);
		// clickRemoveTrackYesButton();
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
			enterVoiceCreativeWithOptionalFields(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString(),
					eh.getCell(1, 12).toString(), eh.getCell(1, 13).toString(), eh.getCell(1, 14).toString(),
					eh.getCell(1, 15).toString());

		clickProceedButton();
		Thread.sleep(3000);

		// ******************Track tab*****************:
		if (!eh.getCell(1, 2).toString().contains("Informational")) {
			clickTrackSourceSelector();
			selectTrackSource(TRACK_SOURCE);
		}
		clickProceedButton();

		// ******************Rewards tab*****************:
		if (eh.getCell(1, 2).toString().contains("Seeding")) {
			clickRewardTypeInputField();
			clickRewardTypeAny();
		}

	}

	public void enterVoiceCreativeWithOptionalFields(String subject, String reference, String optional1,
			String optional2, String optional3, String optional4) throws InterruptedException {
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
		// clickSaveOfferButton();
	}

	public void verifySetAsDefaultCheckbox() throws Throwable {

		try {
			jswait.loadClick(setAsDefault);
			 assertFalse("Set as default checkbox is displaying with one track source", true);
		}catch(Exception e){
			
		}

		clickAddTrackButton();
		jswait.loadClick(setAsDefault);

		// assertTrue("Set as default checkbox is not selected",
		// setAsDefaultCheckbox.isSelected());
		clickRemoveTrackRuleButton();
		clickRemoveTrackYesButton();
		try {
			jswait.loadClick(setAsDefault);
			 assertFalse("Set as default checkbox is displaying with one track source", true);
		}catch(Exception e){
			
		}

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
		// clickProceedButton();

	}

	public void createOfferUptoTrackTab(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsTrackTab(sheet, productSheet);
		// clickSaveOfferButton();
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

	public void clickSecondCreativeLanguageField() throws InterruptedException {
		jswait.loadClick(secondCreativeLanguageSelector);
	}

	public void clickProductRemoveIcon() throws InterruptedException {
		jswait.loadClick(productRemoveIcon);
	}

	public void removeProduct(String sheet) throws Throwable {
		clickOfferEditProceedButton();

		clickProductRemoveIcon();
		/*
		 * clickProceedButton(); clickProceedButton(); clickProceedButton();
		 * clickSaveOfferButton(); eh.setExcelFile("offerInputData",sheet); String name
		 * = (String) eh.getCell(1, 0); filterWorkaround(name);
		 * commonObjects.clickOptionsIcon(); clickEditOffer(); clickProceedButton();
		 */

		assertFalse("Product removed successfully", productList.isDisplayed());

	}

	public void clickCreativeLanguageEnglishSelect() throws InterruptedException {
		jswait.loadClick(creativeLanguageEnglishSelect);
	}

	public void clickSecondCreativeLanguageSpanishSelect() throws InterruptedException {
		jswait.loadClick(secondCreativeLanguageSpanishSelect);
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

	public void selectSecodnCreativeLanguageSpanish() throws InterruptedException, IOException {
		clickSecondCreativeLanguageField();
		clickSecondCreativeLanguageSpanishSelect();
	}

	public void enterWapCreative(String title, String url) throws InterruptedException {
		jswait.loadSendKeys(CreativeTitle, title);
		jswait.loadSendKeys(wapCreativeUrl, url);
	}

	public void enterSecondWapCreative(String title, String url) throws InterruptedException {
		jswait.loadSendKeys(secondCreativeTitle, title);
		jswait.loadSendKeys(secondWapCreativeUrl, url);
	}

	public void enterVoiceCreative(String subject, String reference) throws InterruptedException {
		jswait.loadSendKeys(voiceCreativeSubject, subject);
		jswait.loadSendKeys(voiceCreativeReference, reference);
	}

	public void enterSecondVoiceCreative(String subject, String reference) throws InterruptedException {
		jswait.loadSendKeys(secondVoiceCreativeSubject, subject);
		jswait.loadSendKeys(secondVoiceCreativeReference, reference);
	}

	public void enterSmsCreative(String title, String details) throws InterruptedException {
		jswait.loadSendKeys(CreativeTitle, title);
		;
		jswait.loadSendKeys(smsCreativeDetails, details);
		;
	}

	public void enterSecondSmsCreative(String title, String details) throws InterruptedException {
		jswait.loadSendKeys(secondCreativeTitle, title);
		;
		jswait.loadSendKeys(secondSmsCreativeDetails, details);
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
		commonObjects.clickFilterIcon(); // issue in filter
		commonObjects.clickFilterResetButton(); // issue in filter
		commonObjects.filterName(name);
	}

	public void chooseOffer(String sheet) throws Throwable {

		eh.setExcelFile("offerInputData", sheet);
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
			selectTrackSource(TRACK_SOURCE);
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

	public void enterSecondCreativeTabDetails(ExcelHelper eh) throws InterruptedException, IOException {
		selectSecodnCreativeLanguageSpanish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			enterSecondWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		if (eh.getCell(1, 3).toString().contains("SMS"))
			enterSecondSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		if (eh.getCell(1, 3).toString().contains("Voice"))
			enterSecondVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());

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

	public String getCreativeTabColour() {
		String colour = creativeTab.getCssValue("background-color");
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
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//div[contains(@class,'defineCreative')]//paper-checkbox"));
		checkboxes.get(0).getAttribute("checked");
		try {
			checkboxes.get(1).getAttribute("checked");
		} catch (Exception e) {
			checkboxes.get(1).click();
			checkboxes.get(1).getAttribute("checked");
			try {
				checkboxes.get(0).getAttribute("checked");
				Assert.assertTrue(false, "error in checked status");
			} catch (Exception e1) {
			}
		}

	}

	public void verifyRewardSucessMessage() throws InterruptedException, UnsupportedFlavorException, IOException {
		String s = commonObjects.getTextFormTextField(successMessage);
		Assert.assertTrue(s.length() <= 500, "field contains more than 500 chars");
	}

	public void verifyRewardFailureMessage() throws InterruptedException, UnsupportedFlavorException, IOException {
		String s = commonObjects.getTextFormTextField(failureMessage);
		Assert.assertTrue(s.length() <= 500, "field contains more than 500 chars");
	}

	public void verifyHeaders() throws Throwable {
		jswait.checkVisible(offersHeader);
		jswait.checkVisible(gridHeaderChannel);
		jswait.checkVisible(gridHeaderConversion);
		jswait.checkVisible(gridHeaderOfferName);
		jswait.checkVisible(gridHeaderType);
		clickCreateNewOfferButton();
	}

	public void addFirstProduct() throws Throwable {
		clickAddProductsButton();
		clickAddProductFirstCheckbox();
		clickDialogBoxAddButton();
	}

	public void validateNameField() throws Throwable {
		enterOfferName("iuryt ytey uyei yeuy uys ttsghksio");
		Assert.assertTrue(commonObjects.getTextFormTextField(offerName).length() == 30, "wrong size of name field");
	}

	public void verifyMapVariableHeader() throws Throwable {
		jswait.checkVisible(mapVariableDialogHeader);
	}

	public void validateDescriptionField() throws Throwable {
		enterOfferDescription(
				"iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey uyei yeuy uys ttsghksio iuryt ytey ewifdjhijhiewf");
		Assert.assertTrue(commonObjects.getTextFormTextField(offerDescription).length() == 500,
				"wrong size of description field");
	}

	public void verifyLengthOfCreativeTitleAndDetails() throws Throwable {
		jswait.loadSendKeys(CreativeTitle, "123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435");
		System.out.println("length:" + commonObjects.getTextFormTextField(CreativeTitle).length());
		Assert.assertTrue(commonObjects.getTextFormTextField(CreativeTitle).length() == 30,
				"wrong character limit for creative title");
		jswait.loadSendKeys(smsCreativeDetails,
				"123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435 123+_+}{:\">?<+_P:\"4!@#$%^&*ihui435");
		Assert.assertTrue(commonObjects.getTextFormTextField(smsCreativeDetails).length() == 500,
				"wrong character limit for creative details");
	}

	public void verifySpecialCharacterOfCreativeTitleAndDetails() throws Throwable {
		jswait.loadSendKeys(CreativeTitle, "123+_+}{:\\\">?<+_P:\\\"4!@#$%^&*");
		System.out.println("length:" + commonObjects.getTextFormTextField(CreativeTitle).length());
		Assert.assertTrue(commonObjects.getTextFormTextField(CreativeTitle).length() == 29,
				"wrong character limit for creative title");
		jswait.loadSendKeys(smsCreativeDetails, "123+_+}{:\\\">?<+_P:\\\"4!@#$%^&*");
		Assert.assertTrue(commonObjects.getTextFormTextField(smsCreativeDetails).length() == 29,
				"wrong character limit for creative details");
	}
	public void validateRuleNameField() throws InterruptedException, UnsupportedFlavorException, IOException {
		enterRuleName("ygy56465!@#$%^&*()@#$%^&*(^%$#ggy");
		Assert.assertTrue(commonObjects.getTextFormTextField(addTrackingRuleRuleName).length()==30, "validation of rule name failed");
	}
}
