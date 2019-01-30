package pageObjetcs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import baseClasses.RandomNameGenerator;
import pageObjetcs.Admin.OfferAttributesPage;

public class OfferPageObjects extends Init {
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	CommonObjects commonObjects = new CommonObjects();
	RandomNameGenerator RandomNameGenerator=new RandomNameGenerator();
	public ExcelHelper eh = new ExcelHelper();
	OfferAttributesPage offerAttributesPage = new OfferAttributesPage();

	public OfferPageObjects() {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = "//span[contains(.,'Select')]/../input")
	private WebElement emailSelectResourceButton;
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
	@FindBy(xpath = "//*[contains(.,'Edit Offer')]/following::paper-button[contains(.,'Proceed')]")
	private WebElement EditofferProceedButton;	
	@FindBy(xpath = "//paper-button[contains(.,'Proceed')]")
	private WebElement offerEditProceedButton;
	@FindBy(xpath = ".//*[@id='check']/div/iron-pages/offer-products/form/div/div[2]/paper-button")
	private WebElement offerAddProductButton;
	@FindBy(xpath = "//*[@id='productDialog']/div[2]/paper-button[2]")
	private WebElement dialogBoxAddProductButton;
	@FindBy(xpath = "//label[contains(.,'Language')]/..//input")
	private WebElement creativeLanguage;
	@FindBy(xpath = "//paper-item[contains(.,'"+LANGUAGE1+"')]")
	private WebElement creativeLanguageEnglishSelect;
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//paper-item[contains(.,'"+LANGUAGE2+"')]")
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
	@FindBy(xpath = "//paper-item[contains(.,'Duplicate')]")
	private WebElement optionsDuplicate;
	@FindBy(xpath = "//div[@id='topBar']//paper-button[contains(.,'Cancel')]")
	private WebElement cancelOfferButton;
	@FindBy(xpath = "//label[contains(.,'Reward Type')]/..//input")
	private WebElement rewardTypeInputField;
//	@FindBy(xpath = ".//rewards-container//paper-button[contains(.,'Add')]")
//	private WebElement rewardAddButton;
	
	@FindBy(xpath = "//label[contains(.,'Reward Type')]//following::vaadin-combo-box-item[contains(.,'Selenium_reward')]")
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
	@FindBy(xpath = "//label[contains(.,'Subject')]/../input")
	private WebElement emailCreativeSubject;
	@FindBy(xpath = "//label[contains(.,'Email Profile Field')]/../input")
	private WebElement emailProfileField;
	@FindBy(xpath = "//creative-wrapper//define-creative[2]//label[contains(.,'Subject')]/../input")
	private WebElement secondVoiceCreativeSubject;
	@FindBy(xpath = "//label[contains(.,'Reference')]/../input")
	private WebElement voiceCreativeReference;
	@FindBy(xpath = "//createnterEmailCreativeive-wrapper//define-creative[2]//label[contains(.,'Reference')]/../input")
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
	@FindBy(xpath = ".//*[@id='trackForm']/div[2]//div[@id='checkbox']/..")
	private WebElement setAsDefaultSecondTrack;
	@FindBy(xpath = ".//div[@class='layout horizontal style-scope offer-track']//paper-button[contains(.,'Add')]")
	private WebElement addTrackButton;
	@FindBy(xpath = ".//form[@id='trackForm']/div[@class='style-scope offer-track']/div[@class='closeImg style-scope offer-track']")
	private WebElement removeTrackRuleButton;
	@FindBy(xpath = ".//div[@class='buttons style-scope offer-track']//paper-button[contains(.,'Yes')]")
	private WebElement removeTrackYesButton;
	@FindBy(xpath = ".//paper-card/form//div/div/div[contains(.,'Define Creative')]")
	private List<WebElement> defineCreativeTitle;
	@FindBy(xpath = ".//paper-checkbox[@id='setDefault']")
	private List<WebElement> setAsDefaultCreative;
	@FindBy(xpath = ".//paper-button[contains(.,'Add Creative')]")
	private WebElement addCreativeButton;
	@FindBy(xpath = ".//paper-icon-button[@icon='delete']")
	private WebElement removeCreativeButton;
	@FindBy(xpath = ".//paper-listbox[@id='langDrop']/paper-item")
	private List<WebElement> creativeLanguagesList;
	
	@FindBy(xpath="//div[contains(text(),'Rewards')]")
	private WebElement rewards;

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
	@FindBy(xpath = "//span[contains(.,'Preview Email')]")
	private WebElement previewEmailButton;

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
	@FindBy(xpath = "//label[contains(.,'Details')]/following::*[@d='M11 6c1.38 0 2.63.56 3.54 1.46L12 10h6V4l-2.05 2.05C14.68 4.78 12.93 4 11 4c-3.53 0-6.43 2.61-6.92 6H6.1c.46-2.28 2.48-4 4.9-4zm5.64 9.14c.66-.9 1.12-1.97 1.28-3.14H15.9c-.46 2.28-2.48 4-4.9 4-1.38 0-2.63-.56-3.54-1.46L10 12H4v6l2.05-2.05C7.32 17.22 9.07 18 11 18c1.55 0 2.98-.51 4.14-1.36L20 21.49 21.49 20l-4.85-4.86z']//../../../..")
	private WebElement mapVariablecreativeIcon;
	
	@FindBy(xpath = "//iron-data-table[@id='variablesList']//iron-list//data-table-row")
	private WebElement mapVariableFirstVariable;
	@FindBy(xpath = "//paper-button[text()='OK']")
	private WebElement mapVariableOkButton;
	@FindBy(xpath = "//div[@class='buttons style-scope variable-dialog']/paper-button[1]")
	private WebElement mapVariableCancelButton;
	@FindBy(xpath = "//iron-data-table[@id='variablesList']//div[@id='header']//data-table-row[contains(.,'Name') and contains(.,'Field') and contains(.,'Limit') and contains(.,'Default')]")
	private WebElement mapVariableDialogHeader;
	@FindBy(xpath = "//preview-email/div//*[@d='M11 6c1.38 0 2.63.56 3.54 1.46L12 10h6V4l-2.05 2.05C14.68 4.78 12.93 4 11 4c-3.53 0-6.43 2.61-6.92 6H6.1c.46-2.28 2.48-4 4.9-4zm5.64 9.14c.66-.9 1.12-1.97 1.28-3.14H15.9c-.46 2.28-2.48 4-4.9 4-1.38 0-2.63-.56-3.54-1.46L10 12H4v6l2.05-2.05C7.32 17.22 9.07 18 11 18c1.55 0 2.98-.51 4.14-1.36L20 21.49 21.49 20l-4.85-4.86z']/../../..")
	private WebElement emailMapVariable;
	
	
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
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Parameter')]/../../../../../../..//paper-item[contains(.,'amount')]")
	 private WebElement addTrackingRuleSecondConditionParameterSelectAge;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Condition')]/../input")
	 private WebElement addTrackingRuleSecondConditionConditionSelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Condition')]/../../../../../../..//paper-item[contains(.,'is greater than')]")
	 private WebElement addTrackingRuleSecondConditionConditionSelectisGreaterThan;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//recharge-condition[2]//label[contains(.,'Value')]/../input")
	 private WebElement addTrackingRuleSecondConditionConditionValue;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Parameter')]/../input")
	 private WebElement  addTrackingRuleConditionParameterSelector;
	 @FindBy(xpath="//recharge-rule-model/paper-dialog[@id='trackOpenDialog']//label[contains(.,'Parameter')]/../../../../../../..//paper-item[contains(.,'amount')]")
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
	 @FindBy(xpath="//form[@id='trackRuleForm']//div[2]//paper-button[contains(.,'Save')]")
	 private WebElement EditTrackingRuleSaveButton;
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
	 @FindBy(xpath="//variable-dialog/paper-dialog//paper-radio-button[1]/div[@id='radioContainer']")
	 private WebElement selectVariableButton;
	
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Name')]/..//input")
	 private WebElement addVariableName;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Source')]/..//input")
	 private WebElement addVariableSourceSelector;
	 @FindBy(xpath="//paper-item[@value='ProfileField']")
	 private WebElement addVariableSourceProfileSelect;
	 @FindBy(xpath="//variable-dialog/paper-dialog//label[contains(text(),'Field')]/..//input")
	 private WebElement addVariableFieldSelector;
	 @FindBy(xpath="//vaadin-combo-box-item[contains(.,'"+AGE_PROFILE_FIELD+"')]")
	 private WebElement addVariableFieldAgeSelect;
	 @FindBy(xpath="//vaadin-combo-box-item[contains(.,'"+NAME_PROFILE_FIELD+"')]")
	 private WebElement addVariableFieldNameSelect;
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
	 @FindBy(xpath=".//*[@id='previewForm']//paper-button[2]")
	 private WebElement previewEmailConfirmButton;
	 @FindBy(xpath="//paper-dialog[@id='deleteOffer']//paper-button[contains(.,'Yes')]")
	 private WebElement offerDeleteConfirmYes;
	 @FindBy(xpath="//paper-button[contains(.,'Add')]")
	 private WebElement addOfferAttributeButton;
	 @FindBy(xpath="//label[contains(text(),'Attribute')]/..//input")
	 private WebElement offerAttributeSelector;
	 @FindBy(xpath="//paper-item[contains(.,'a_sel_offer_attribute')]")
	 private WebElement offerAttributeSelect;
	 @FindBy(xpath="//label[contains(text(),'Value')]/..//input")
	 private WebElement offerAttributeValueSelector;
	 @FindBy(xpath="//*[@id='offerGrid']//data-table-cell[contains(.,'Recharge')])")
	 private WebElement rechargeverify ;
	 @FindBy(xpath="//span[text()='Send Trial']")
	 private WebElement sendTrialButton;
	 @FindBy(xpath=".//*[@id='sendTrialDialogEmail']//paper-button[text()='Cancel']")
	 private WebElement sendTrialEmailCancelButton;
	 @FindBy(xpath=".//*[@id='sendTrialDialogNumber']//paper-button[text()='Cancel']")
	 private WebElement sendTrialNumberCancelButton;
	 @FindBy(xpath="//form[@id='trialNumberForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']")
	 private WebElement sendTrialfield;
	 @FindBy(xpath="//form[@id='trialEmailForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']")
	 private WebElement sendTrialEmailfield;
	 @FindBy(xpath="//define-creative[2]/paper-dialog[@id='sendTrialDialogNumber']//div[@id='scrollable']/form[@id='trialNumberForm']/paper-input[@required='']//div[@id='labelAndInputContainer']/input[@id='input']")
	 private WebElement secondsendTrialfield;
	 @FindBy(xpath="//form[@id='trialNumberForm']/paper-input[2]//div[@id='labelAndInputContainer']/input[@id='input']")
	 private WebElement sendTrialsecondfield;
	 @FindBy(xpath="//*//label[contains(.,'Sender ID: Trial')]/..//input[@id='input']")
	 //define-creative[2]//*//label[contains(.,'Sender ID: Trial')]/..//input[@id='input']
	 private WebElement sendTrialSMSSender;
	 @FindBy(xpath="//form[@id='trialEmailForm']//*//label[contains(.,'Sender ID: ')]/..//input[@id='input']")
	 private WebElement sendTrialEmailSender;
	 @FindBy(xpath="//define-creative[2]//*//label[contains(.,'Sender ID: Trial')]/..//input[@id='input']")
	 private WebElement SecondsendTrialSMSSender;
	 @FindBy(xpath="//*//label[contains(.,'Route over which this')]/..//input[@id='input']")
	 private WebElement sendTrialSMSRoute;
	 @FindBy(xpath="//form[@id='trialEmailForm']//*//label[contains(.,'Route over which this')]/..//input[@id='input']")
	 private WebElement sendTrialEmailRoute;
	 @FindBy(xpath="//define-creative[2]//*//label[contains(.,'Route over which this')]/..//input[@id='input']")
	 private WebElement SecondsendTrialSMSRoute;
	 @FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
	 private WebElement SelectTrialSMSID;
	 @FindBy(xpath=".//*[@id='trialEmailForm']/vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
	 private WebElement SelectTrialEmailID;
	 //@FindBy(xpath="//wizard-tab[@id='check']//creative-wrapper/define-creative[2]/paper-dialog[@id='sendTrialDialogNumber']//div[@id='scrollable']/form[@id='trialNumberForm']//vaadin-combo-box[@label='Sender ID: Trial message would appear from this ID']/vaadin-combo-box-overlay[@id='overlay']//iron-list[@id='selector']//vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
	 @FindBy(xpath="//define-creative[2]//*[@id='sendTrialDialogNumber']//vaadin-combo-box-item[contains(.,'"+SENDER_SMPP+"')]")
	 private WebElement SecondSelectTrialSMSID;
	 @FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]")
	 private WebElement SelectTrialSMSRoute;
	 //@FindBy(xpath=".//*[@id='trialEmailForm']/vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]")
	 @FindBy(xpath=".//*[@id='trialEmailForm']//vaadin-combo-box-item[contains(.,'SMPP Robi outbound')]")
	 //@FindBy(xpath="//form[@id='trialEmailForm']//vaadin-combo-box[@label='Route over which this broadcast can be sent']/vaadin-combo-box-overlay[@id='overlay']//iron-list[@id='selector']/div/vaadin-combo-box-item[2]")
	 private WebElement SelectTrialEmailRoute;
	 @FindBy(xpath="//creative-wrapper/define-creative[2]//*[@id='items']/vaadin-combo-box-item[contains(.,'"+ROUTE_SMPP+"')]")
	 private WebElement SecondSelectTrialSMSRoute;
	 @FindBy(xpath=".//*[@id='sendTrialDialogNumber']//paper-button[text()='Send']")
	 private WebElement sendTrialNumberSendButton;
	 @FindBy(xpath=".//*[@id='sendTrialDialogEmail']//paper-button[text()='Send']")
	 private WebElement sendTrialEmailSendButton;
	 @FindBy(xpath="//form[@id='trialEmailForm']//vaadin-combo-box[@label='Route over which this broadcast can be sent']/paper-input-container[@id='inputContainer']//paper-icon-button[@id='toggleIcon']/iron-icon[@id='icon']")
	 private WebElement sendTrialwindow;
	 @FindBy(xpath=".//define-creative[2]//*[@id='sendTrialDialogNumber']//paper-button[text()='Send']")
	 private WebElement SecondsendTrialNumberSendButton;
	 @FindBy(xpath="//paper-dialog[@id='sendTrialDialogNumber']/iron-icon[@icon='close']")
	 private WebElement sendTrialPageClose;
	 @FindBy(xpath="//paper-dialog[@id='sendTrialDialogEmail']/iron-icon[@icon='close']")
	 private WebElement sendTrialEmailPageClose;
	 @FindBy(xpath="//define-creative[2]//paper-dialog[@id='sendTrialDialogNumber']/iron-icon[@icon='close']")
	 private WebElement SecondsendTrialPageClose;
	 @FindBy(xpath="/html//paper-toast[@id='toast']/span[contains(.,'Unable to process your request. Please try again')]")
	 private WebElement sendTrialInavlidNumPopup;
	 @FindBy(xpath="//form[@id='trialNumberForm']/paper-button[contains(.,'Add')]")
	 private WebElement sendTrialAddButton;
	 @FindBy(xpath="//div/paper-button[contains(.,'Add Creative')]")
	 private WebElement sendTrialCreativeAddButton;
	 @FindBy(xpath="//creative-wrapper/define-creative[2]/paper-card/form[@id='form']//span[.='Send Trial']")
	 private WebElement SecondsendTrialButton;
	//define-creative[2]/paper-card/form[@id='form']/div/div[3]/div/div/div[1]/paper-icon-button[@role='button']/iron-icon[@id='icon']
	 @FindBy(xpath="//define-creative[2]/paper-card/form[@id='form']/div/div[3]/div/div/div[1]/paper-icon-button[@role='button']/iron-icon[@id='icon']")
	 private WebElement CreativeDeleteButton;
	 
	 @FindBy(xpath="//rewards-container[2]//paper-button")
	 private WebElement rewardFirstRuleAdButton;
	 @FindBy(xpath="//span[contains(.,'Change')]/../input")
	 private WebElement emailcreativechangebtn ;
	 
	 @FindBy(xpath=".//label[contains(.,'Text')]//following::textarea")
	 private WebElement facebookcreativetextInput;
	 @FindBy(xpath="//label[contains(.,'Select Facebook Page')]//following::iron-icon[1]")
	 private WebElement facebookpageselect;
	 @FindBy(xpath="//paper-item[contains(.,'NEONxTel')]")
	 private WebElement facebookpage;
	 @FindBy(xpath=".//*[@id='browse']//following::input[1]")
	 private WebElement fbvideoinput;
	@FindBy(xpath = ".//*[@id='file']")
	private WebElement facebookimageButton;
	 
	 
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
	 public void checkOfefrAttributesValidation() throws InterruptedException, UnsupportedFlavorException, IOException {
		 String textField = commonObjects.getTextFormTextField("//offer-attribute[3]//label[contains(text(),'Value')]/..//input");
		 Assert.assertTrue(textField.length()==10, "Error in text field of offer attriibute");
		 textField = commonObjects.getTextFormTextField("//offer-attribute[4]//label[contains(text(),'Value')]/..//input");
		 Assert.assertTrue(textField.length()==4, "Error in text field of offer attriibute");
		 
	 }
	 public void selectOfferAttribute() throws InterruptedException, UnsupportedFlavorException, IOException {
			jswait.loadClick("//offer-attribute[1]//label[contains(text(),'Attribute')]/..//input");
			jswait.loadClick("//offer-attribute[1]//paper-item[contains(.,'a_sel_offer_attributeMultiname')]");
			jswait.loadClick("//offer-attribute[1]//label[contains(text(),'Value')]/../../iron-icon");
			jswait.loadClick("//offer-attribute[1]//paper-item[contains(.,'LABEL')]");
			jswait.loadClick("//offer-attribute[1]//paper-item[contains(.,'LABEL1')]");
			
			clickAddOfferAttributeButton();
			
			jswait.loadClick("//offer-attribute[2]//label[contains(text(),'Attribute')]/..//input");
			jswait.loadClick("//offer-attribute[2]//paper-item[contains(.,'a_sel_offer_attributeSinglename')]");
			jswait.loadClick("//offer-attribute[2]//label[contains(text(),'Value')]/..//input");
			jswait.loadClick("//offer-attribute[2]//paper-item[contains(.,'LABEL')]");
			
			clickAddOfferAttributeButton();
			
			jswait.loadClick("//offer-attribute[3]//label[contains(text(),'Attribute')]/..//input");
			jswait.loadClick("//offer-attribute[3]//paper-item[contains(.,'a_sel_offer_attributeTextname')]");
			jswait.loadSendKeys("//offer-attribute[3]//label[contains(text(),'Value')]/..//input","text454Val");
			
			clickAddOfferAttributeButton();
			
			jswait.loadClick("//offer-attribute[4]//label[contains(text(),'Attribute')]/..//input");
			jswait.loadClick("//offer-attribute[4]//paper-item[contains(.,'a_sel_offer_attributeNumbername')]");
			jswait.loadSendKeys("//offer-attribute[4]//label[contains(text(),'Value')]/..//input","98nb33");
			
			checkOfefrAttributesValidation();
		}
	 
	 public void clickSetAsDefaultSecondTrack() throws InterruptedException {
			jswait.loadClick(setAsDefaultSecondTrack);
		}
	 public void clickRewardFirstRuleAdButton() throws InterruptedException {
			jswait.loadClick(rewardFirstRuleAdButton);
		}
	 public void clickSendTrialButton() throws InterruptedException {
			jswait.loadClick(sendTrialButton);
		}
	 public void clickAddOfferAttributeButton() throws InterruptedException {
			jswait.loadClick(addOfferAttributeButton);
		}
	 
//  Creative Tab in Offer Creation	functions
	 public void clickAddNewVariableButton() throws InterruptedException {
			jswait.loadClick(addNewVariableButton);
		}
	 public void clickOfferDeleteConfirmYesButton() throws InterruptedException {
			jswait.loadClick(offerDeleteConfirmYes);
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
	 public void selectAddVariableFieldName() throws InterruptedException {
			jswait.loadSendKeys(addVariableFieldSelector,NAME_PROFILE_FIELD);
			jswait.loadClick(addVariableFieldNameSelect);
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
	 public void createNameDynamicVariable(String name) throws InterruptedException {
			clickAddNewVariableButton();
			enterAddVariableName(name);
			selectAddVariableSourceProfileField();
			selectAddVariableFieldName();
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
		 jswait.waitUntil("//span[contains(.,'amount is greater than 18, amount is greater than 19')]");
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
	public void selectVariableButton() throws InterruptedException {
		jswait.loadClick(selectVariableButton);
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
//		commonObjects.clickHelpIcon();
//		driver.switchTo().frame(offersContextHelp);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'Offers')]")));
//		driver.switchTo().parentFrame();
//		commonObjects.clickContextHelpCloseIcon();
		
		 Thread.sleep(3000);
	        
		 String secondUrl = driver.findElement(By.xpath(".//*[@id='content']/object")).getAttribute("data");
		   ((JavascriptExecutor)driver).executeScript("window.open()");
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.get(secondUrl);
		    Thread.sleep(3000);
//		    driver.switchTo().frame(1);
		    try{
		    //driver.findElement(By.xpath("//*[@id='topic_content']/h1[1]/span/span[contains(text(),'Offers')]"));
		    String getTextOfferHelpPage=driver.findElement(By.xpath("//*[@id=\"topic-content\"]/div[1]/h1[1]/span/span[contains(text(),'Offers')]")).getText();
		    Assert.assertTrue(getTextOfferHelpPage.contentEquals("Offers"));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    }
		    catch (Exception e) {
		    	driver.close();
			    driver.switchTo().window(tabs2.get(0));
			    throw e;
			}
		    
		
		
		
		
		
		
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
		selectOfferCategory(eh.getCellByColumnName("Category"));
	}
	
	public void verifyOfferDetails(String sheet,String product) throws Exception {
		eh.setExcelFile("offerInputData", sheet);
		jswait.waitUntil("//*[contains(text(),'"+eh.getCellByColumnName("Channel")+"')]");
		jswait.waitUntil("//span[contains(.,'"+eh.getCellByColumnName("Offer Type")+"')]");
		jswait.waitUntil("//*[contains(text(),'"+eh.getCellByColumnName("Category")+"')]");
		eh.setExcelFile("productInputData", product);
		jswait.waitUntil("//*[contains(text(),'"+eh.getCellByColumnName("Product Name")+"')]");
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

		if (defineCreativeTitle.size() == 1)  {
			Exception ceckboxExcep=new Exception("Set as default checkbox is displaying");
					
			if (setAsDefaultCreative.size() == 2) {
				throw ceckboxExcep;
			}
			}
			
		clickAddCreativeButton();
		clickSecondCreativeLanguageField();
		clickSecondCreativeLanguageSpanishSelect();
		
		
		if (defineCreativeTitle.size() == 2)  {
			Exception ceckboxExcep2=new Exception("Set as default checkbox is not displaying");
					
			if (setAsDefaultCreative.size() == 1) {
				throw ceckboxExcep2;
			}
			}
		
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
//		commonObjects.clickHelpIcon();
//		driver.switchTo().frame(productContextHelp);
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'Products')]")));
//		driver.switchTo().parentFrame();
//		commonObjects.clickContextHelpCloseIcon();
		
		Thread.sleep(3000);
        
		 String secondUrl = driver.findElement(By.xpath(".//*[@id='content']/object")).getAttribute("data");
		   ((JavascriptExecutor)driver).executeScript("window.open()");
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    driver.get(secondUrl);
		    Thread.sleep(3000);
		    try{
		    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(.,'Products')]")));
		    driver.close();
		    driver.switchTo().window(tabs2.get(0));
		    }
		    catch (Exception e) {
		    	driver.close();
			    driver.switchTo().window(tabs2.get(0));
			    throw e;
			}
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
//	public void clickRewardAddButton() throws InterruptedException {
//		jswait.loadClick(rewardAddButton);
//	}
//	
	public void enterReward() throws InterruptedException {
		jswait.loadSendKeys(rewardTypeInputField, "Selenium_reward");
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
	
	public void EditScreen_clickProceedButton() throws InterruptedException {
		jswait.loadClick(EditofferProceedButton);
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

	public void selectOfferCategory(String offerCategory) throws InterruptedException {
		clickOfferCategory();
		jswait.loadClick("//paper-item[contains(.,'"+offerCategory+"')]");
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
		String name = (String) eh.getCell(1, 0);
		String newname=RandomNameGenerator.getRandomName(name);
		eh.setCell(1, 0,newname);
		enterOfferName(newname);
		enterOfferDescription((String) eh.getCell(1, 1));
		selectOfferType(eh.getCell(1, 2).toString());
		selectOfferChannel(eh.getCell(1, 3).toString());
		selectOfferCategory(eh.getCellByColumnName("Category"));
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
	
   public void enterEmailCreative(String profile,String subject ) throws InterruptedException, UnsupportedFlavorException, IOException {
	  
	   jswait.loadClick(emailProfileField);
	   jswait.loadClick("//preview-email//paper-item[contains(.,'"+EMAIL_PROFILE_FIELD+"')]");
	   jswait.loadSendKeys(emailCreativeSubject, "Subject of Email Offer &$^%#@!+*(&)");
	   
	   File indexZip = new File("EmailZipFile\\index.zip");
	   emailSelectResourceButton.sendKeys(indexZip.getAbsolutePath());
	   

	   jswait.loadClick(emailMapVariable);
	   MapVariableFilterName(AGE_DYNAMIC_VARIABLE);
	   try{
		   clickMapVariableFirstVariable();
	   }catch(Exception e) {
		  createNameDynamicVariable(AGE_DYNAMIC_VARIABLE);
	   }
	   clickMapVariableOkButton();
	   
	   //jswait.loadClick(emailcreativechangebtn);
	   Thread.sleep(2000);
	 
	   emailcreativechangebtn.sendKeys(indexZip.getAbsolutePath());
	}
   
   public void verifyEmailCreative(String profile,String subject ) throws InterruptedException, UnsupportedFlavorException, IOException {
	   jswait.loadClick(emailProfileField);
	   jswait.loadClick("//preview-email//paper-item[contains(.,'"+AGE_PROFILE_FIELD+"')]");
	   jswait.loadClick(emailProfileField);
	   jswait.loadClick("//preview-email//paper-item[contains(.,'"+EMAIL_PROFILE_FIELD+"')]");
	   jswait.loadSendKeys(emailCreativeSubject, "Subject of Email Offer &$^%#@!+*(&)");
	   String enteredText = commonObjects.getTextFormTextField(emailCreativeSubject);
	   Assert.assertTrue(enteredText.length()==35, "error in subject field accepting alpha nueric and special characters");
	   Thread.sleep(2000);
	   File indexZip = new File("EmailZipFile\\index.zip");
	   emailSelectResourceButton.sendKeys(indexZip.getAbsolutePath());
	   
	   jswait.loadClick(previewEmailButton);
	   Thread.sleep(3000);
	   driver.switchTo().frame("my_iframe");
	   driver.findElement(By.xpath("//h1[contains(.,'THIS IS THE BODY OF EMAIL')]"));
	   driver.findElement(By.xpath("//h1[contains(.,'$$EMAIL$$')]"));
	   driver.findElement(By.xpath("//img[@src='logo.png']"));
	   driver.switchTo().parentFrame();
	   jswait.loadClick(previewEmailConfirmButton);
	   clickMapVariableIcon();
	   clickMapVariableCancelButton();
	   jswait.loadClick(emailMapVariable);
	   MapVariableFilterName(AGE_DYNAMIC_VARIABLE);
	   try{
		   clickMapVariableFirstVariable();
	   }catch(Exception e) {
		   createNameDynamicVariable(AGE_DYNAMIC_VARIABLE);
	   }
	   clickMapVariableOkButton();
	   
	   //jswait.loadClick(emailcreativechangebtn);
	   Thread.sleep(2000);
	 
	   emailcreativechangebtn.sendKeys(indexZip.getAbsolutePath());
	   
	   
	   
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
		Thread.sleep(15000);
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
		//chooseOfferType();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//paper-item[contains(.,'"+eh.getCell(1,2)+"')]")).click();
		jswait.loadClick("//paper-item[contains(.,'Recharge')]");
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

	public void enterOfferDetailsFromSheet(String sheet, String productSheet, String testMode) throws Throwable {
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
		Thread.sleep(3000);
		enterProductTabFields(productSheet);
		clickProceedButton();

		// ******************Creative tab*****************:
		enterCreativeTabDetails(eh,testMode);
		clickProceedButton();
		Thread.sleep(3000);

		// ******************Track tab*****************:
		if (!eh.getCellByColumnName("Offer Type").contains("Informational")) {
			enterTrackTabDetails(eh);
			createFirstDefaultTrackingRuleCondition();
		}
		clickProceedButton();

		// ******************Rewards tab*****************:
		if (!eh.getCellByColumnName("Offer Type").contains("Informational")) {
			
		
				if (eh.getCell(1, 2).toString().contains("Seeding")) {
					clickRewardTypeInputField();
					clickRewardTypeAny();
				}
				else {
					clickRewardFirstRuleAdButton();
					clickRewardTypeInputField();
					clickRewardTypeAny();
					enterSuccessMessage("Success from Selenium");
					enterFailureMessage("Failure from Selenium");
				}
		}

	}
	public void verifyCancelInSendTrial(String sheet, String productSheet) throws Throwable {
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
		
		//verify cancel button of send trial 
		clickSendTrialButton();
		if(eh.getCellByColumnName("Channel").contains("Email")) {
			jswait.loadClick(sendTrialEmailCancelButton);
		}
		else {
			jswait.loadClick(sendTrialNumberCancelButton);
		}
		
		clickProceedButton();
		Thread.sleep(3000);

	}
	
	public void enterOfferDetailsFromSheetAndCheckRewardsDropDown(String sheet, String productSheet) throws Throwable {
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
		createFirstDefaultTrackingRuleCondition();
		clickProceedButton();

		// ******************Rewards tab*****************:
		    clickRewardAddButton();
			clickRewardTypeInputField();
			enterReward();
			
		

	}
	public void verifyRewardTypeField() throws InterruptedException {
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath(".//vaadin-combo-box-item[contains(.,'Selenium_reward')]")).isDisplayed());
	}
	
	
	
	

	public void enterTrackTabDetails(ExcelHelper eh) throws InterruptedException {
		if (!eh.getCell(1, 2).toString().contains("Informational")) {
			clickTrackSourceSelector();
			selectTrackSource(TRACK_SOURCE);
		}
	}
	
	public void enterCreativeTabDetails(ExcelHelper eh) throws Throwable {
		selectCreativeLanguageEnglish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			enterWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		else if (eh.getCell(1, 3).toString().contains("SMS"))
			enterSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		else if (eh.getCell(1, 3).toString().contains("Voice"))
			enterVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		else if (eh.getCell(1, 3).toString().contains("Email")) {
			 enterEmailCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
			 verifySetAsDefaultCheckboxinCreativeTab();			   
			 selectCreativeLanguageEnglish();
			 enterEmailCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		}
	private void enterDynamic() throws InterruptedException {
		   // TODO Auto-generated method stub
		   jswait.loadClick(mapVariablecreativeIcon);
		   //clickMapVariableCancelButton();
		   //jswait.loadClick(emailMapVariable);
		   MapVariableFilterName(AGE_DYNAMIC_VARIABLE);
		   try{
			   clickMapVariableFirstVariable();
		   }catch(Exception e) {
			   createNameDynamicVariable(AGE_DYNAMIC_VARIABLE);
		   }
		   clickMapVariableOkButton();
		
		}
	public void enterEmailCreativeTabDetails(ExcelHelper eh) throws Throwable {
		selectCreativeLanguageEnglish();
		if (eh.getCell(1, 3).toString().contains("Email")) {
		enterEmailCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
			
	}
	public void enterCreativeTabDetails(ExcelHelper eh,String testMode) throws Throwable {
		selectCreativeLanguageEnglish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			enterWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		else if (eh.getCell(1, 3).toString().contains("SMS"))
			{
			enterSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
			
			try{if (((String) eh.getCell(1, 20)).contains("DYNAMICTAG")) {
				enterDynamic();
			}
			    }catch(Exception e) {
			    	System.out.println("NO DYNAMIC TAG");
			    }
			}		
		else if (eh.getCell(1, 3).toString().contains("Voice"))
			enterVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		else if (eh.getCell(1, 3).toString().contains("Facebook"))
			enterfacebookCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		else if (eh.getCell(1, 3).toString().contains("Email")) {
			 
			 if(testMode!="NULL") {verifySetAsDefaultCheckboxinCreativeTab();	
			 verifyEmailCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
			   selectCreativeLanguageEnglish();
			   enterEmailCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
			 }
			 else
				 enterEmailCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		
			
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

	public void createOffer(String sheet, String productSheet,String testMode) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsFromSheet(sheet, productSheet, testMode);
		clickSaveOfferButton();
	}
	public void verifyCancelButtonInSendTrial(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		verifyCancelInSendTrial(sheet, productSheet);
	}
	
	public void createOfferAndCheckRewardsDropDown(String sheet, String productSheet) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsFromSheetAndCheckRewardsDropDown(sheet, productSheet);
		verifyRewardTypeField();
		
	}
	
	public void navigateToRewards() throws InterruptedException {
		jswait.loadClick(rewards);
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
	
	public void SendTrialSMS(String number1, String number2, String number3, String sheet, String productSheet) throws Throwable {
		Thread.sleep(1000);
		clickCreateNewOfferButton();
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
		
		//verify cancel button of send trial 
		sendTrialSMSToNumber(number1);
		sendTrialSMSToNumber(number2);
		sendTrialSMSToNumber(number3);
		
	}
	public void sendTrialSMSToNumber(String number) throws InterruptedException {
		clickSendTrialButton();
		if(eh.getCellByColumnName("Channel").contains("Email")) {
                           //jswait.loadClick(By.xpath("//form[@id='trialNumberForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']");
                           //jswait.loadSendKeys("1234567890");
		}
		else {
                           jswait.loadClick(sendTrialfield);
                           jswait.loadSendKeys(sendTrialfield, number);
		}
		jswait.loadClick(sendTrialSMSSender);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(sendTrialSMSRoute);
		jswait.loadClick(SelectTrialSMSRoute);
		jswait.loadClick(sendTrialNumberSendButton);
		Thread.sleep(3000);
		jswait.loadClick(sendTrialPageClose);
	}
	public void SendTrialSMSOneNum(String sheet, String productSheet, String number) throws Throwable {
		Thread.sleep(1000);
		clickCreateNewOfferButton();
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
		
	
		clickSendTrialButton();
		//if(eh.getCellByColumnName("Channel").contains("Email")) {
                           //jswait.loadClick(By.xpath("//form[@id='trialNumberForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']");
                           //jswait.loadSendKeys("1234567890");
		//}
		//else {
          //                 jswait.loadClick(sendTrialfield);
          //                 jswait.loadSendKeys(sendTrialfield, number);                                                 
                           
		//}
		jswait.loadClick(sendTrialSMSSender);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(sendTrialSMSRoute);
		jswait.loadClick(SelectTrialSMSRoute);
		jswait.loadClick(sendTrialNumberSendButton);
		Thread.sleep(3000);
		jswait.loadClick(sendTrialPageClose);
		
	}
	public void SendTrialInvalidNumber(String sheet, String productSheet) throws Throwable {
		Thread.sleep(1000);
		clickCreateNewOfferButton();
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
		
		 
		clickSendTrialButton();
		if(eh.getCellByColumnName("Channel").contains("Email")) {
	                       //jswait.loadClick(By.xpath("//form[@id='trialNumberForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']");
	                       //jswait.loadSendKeys("1234567890");
		}
		else {
	                       jswait.loadClick(sendTrialfield);
	                       jswait.loadSendKeys(sendTrialfield, "9123");
	                       jswait.loadClick(sendTrialAddButton);
	                       jswait.loadClick(sendTrialsecondfield);
	                       jswait.loadSendKeys(sendTrialsecondfield, "923");
		}
		jswait.loadClick(sendTrialSMSSender);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(sendTrialSMSRoute);
		jswait.loadClick(SelectTrialSMSRoute);
		jswait.loadClick(sendTrialNumberSendButton);
		Thread.sleep(3000);
		String gettext;
		gettext = sendTrialInavlidNumPopup.getText();
	    Assert.assertTrue(gettext.contentEquals("Unable to process your request. Please try again"), "Invalid popup message");
	    //System.out.println("message is , " +gettext);
	    Thread.sleep(3000);
		jswait.loadClick(sendTrialPageClose);
		
	}
	public void SendTrialSMSMultipleCreative(String sheet, String productSheet) throws Throwable {
		Thread.sleep(1000);
		clickCreateNewOfferButton();
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
//		enterCreativeTabDetails(eh);
	//	
	//
//		clickSendTrialButton();
		if(eh.getCellByColumnName("Channel").contains("Email")) {
	                       //jswait.loadClick(By.xpath("//form[@id='trialNumberForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']");
	                       //jswait.loadSendKeys("1234567890");
		}
		else {
//			jswait.loadClick(sendTrialCreativeAddButton);
//	                       jswait.loadClick(sendTrialfield);
//	                       jswait.loadSendKeys(sendTrialfield, "919446506809");
	                       //jswait.loadClick(sendTrialAddButton);
	                       //jswait.loadClick(sendTrialsecondfield);
	                       //jswait.loadSendKeys(sendTrialsecondfield, "919446506807");                       
	                       
		}
//		sendTrialPageFill();
		jswait.loadClick(sendTrialCreativeAddButton);
		//Thread.sleep(3000);
//		enterSecondCreativeTabDetails(eh);
		//SecondsendTrialButton
		jswait.loadClick(SecondsendTrialButton);
		//jswait.loadClick(sendTrialPageClose);
		jswait.loadClick(secondsendTrialfield);
	    jswait.loadSendKeys(secondsendTrialfield, "919446506807");
	    //sendTrialPageFill();
	    jswait.loadClick(SecondsendTrialSMSSender);
//	    Actions action = new Actions(driver);
//	    Thread.sleep(5000);
//	    action.moveToElement(SecondSelectTrialSMSID).click().build().perform();
//	    jswait.loadSendKeys(SecondsendTrialSMSSender,SENDER_SMPP);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(SecondsendTrialSMSRoute);
		jswait.loadClick(SelectTrialSMSRoute);
		jswait.loadClick(SecondsendTrialNumberSendButton);
		jswait.loadClick(SecondsendTrialPageClose);
		jswait.loadClick(CreativeDeleteButton);
		clickSendTrialButton();
		jswait.loadClick(sendTrialfield);
	  jswait.loadSendKeys(sendTrialfield, "919446506809");
	  sendTrialPageFill();
		
	    Thread.sleep(3000);
	    
	}
	public void sendTrialPageFill() throws InterruptedException {
		jswait.loadClick(sendTrialSMSSender);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(sendTrialSMSRoute);
		jswait.loadClick(SelectTrialSMSRoute);
		jswait.loadClick(sendTrialNumberSendButton);
		jswait.loadClick(sendTrialPageClose);
		
	}
	public void SendTrialSMSOneNumDynamictag(String sheet, String productSheet, String number) throws Throwable {
		Thread.sleep(1000);
		clickCreateNewOfferButton();
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
		//clickMapVariableIcon();
		jswait.loadClick(mapVariablecreativeIcon);
		//clickMapVariableCancelButton();
		//jswait.loadClick(emailMapVariable);
		   MapVariableFilterName(AGE_DYNAMIC_VARIABLE);
		   try{
			   clickMapVariableFirstVariable();
		   }catch(Exception e) {
			   createNameDynamicVariable(AGE_DYNAMIC_VARIABLE);
		   }
		   clickMapVariableOkButton();
		   
		
	
		clickSendTrialButton();
		if(eh.getCellByColumnName("Channel").contains("Email")) {
                           //jswait.loadClick(By.xpath("//form[@id='trialNumberForm']/paper-input//div[@id='labelAndInputContainer']/input[@id='input']");
                           //jswait.loadSendKeys("1234567890");
		}
		else {
                           jswait.loadClick(sendTrialfield);
                           jswait.loadSendKeys(sendTrialfield, number);                                                 
                           
		}
		jswait.loadClick(sendTrialSMSSender);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(sendTrialSMSRoute);
		jswait.loadClick(SelectTrialSMSRoute);
		jswait.loadClick(sendTrialNumberSendButton);
		Thread.sleep(3000);
		jswait.loadClick(sendTrialPageClose);
		
	}
	public void EmailSendTrialSMSOneNum(String sheet, String productSheet, String number) throws Throwable {
		Thread.sleep(1000);
		clickCreateNewOfferButton();
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
		enterEmailCreativeTabDetails(eh);
		clickSendTrialButton();
		jswait.loadClick(sendTrialEmailfield);
        jswait.loadSendKeys(sendTrialEmailfield, number);                                                 
		jswait.loadClick(sendTrialEmailSender);
		jswait.loadClick(SelectTrialSMSID);
		jswait.loadClick(sendTrialEmailRoute);
		//jswait.loadSendKeys(sendTrialEmailRoute, "SMPP Robi outbound");
		jswait.loadSendKeys(sendTrialEmailRoute, "Email Route new");
		//jswait.loadClick(SelectTrialEmailRoute);
		jswait.loadClick(sendTrialwindow);
		jswait.loadClick(sendTrialEmailSendButton);
		Thread.sleep(3000);
		jswait.loadClick(sendTrialEmailPageClose);
		
	}
	public void EditOffer_Product(String sheet, String productSheet) throws Throwable {
		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		String productToAdd = (String) prodcutFile.getCell(1, 0);
		clickOfferAddButton();
		commonObjects.filterName(productToAdd);
		jswait.loadClick("//span[contains(.,'" + productToAdd + "')]");
		clickDialogBoxAddButton();
		EditScreen_clickProceedButton();
		EditScreen_clickProceedButton();
		EditScreen_clickProceedButton();
		clickSaveOfferButton();
			}
	
	public void Verify_Product_InOffer(String sheet, String productSheet) throws Throwable {
		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", productSheet);
		String productToCheck = (String) prodcutFile.getCell(1, 0);
		EditScreen_clickProceedButton();
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'" + productToCheck + "')]"));
		assertTrue("Prduct '"+ productToCheck +"' not found, offer not edited", element.isDisplayed());
		
	}
	
	public void enterfacebookCreative(String profile,String type ) throws Exception {
		   
		System.out.println("inside fb creative");
		System.out.println(profile);
		System.out.println(type);
		
		jswait.loadClick(facebookpageselect);
		Thread.sleep(3000);
		
		jswait.loadClick(facebookpage);
		
	   if(type.equalsIgnoreCase("image")) {
	   		   
	   jswait.loadClick(".//*[@id='rectMain']//div[contains(.,'Single Image')]");
	   
	   File image = new File("facebookinput\\Hydrangeas.jpg");
	   Thread.sleep(2000);
	   facebookimageButton.sendKeys(image.getAbsolutePath());
	
	   Thread.sleep(2000);
	   jswait.loadSendKeys(facebookcreativetextInput,"This is a test promoting");
	   
	   Thread.sleep(50000);
	   
	}else if(type.equalsIgnoreCase("video")) {
		
		  jswait.loadClick(".//*[@id='rectMain']//div[contains(.,'Single Video')]");
		   
		   File video = new File("facebookinput\\welcome.mp4");
		   Thread.sleep(2000);
		   fbvideoinput.sendKeys(video.getAbsolutePath());
		  			 			   
		   Thread.sleep(2000);
		   jswait.loadSendKeys(facebookcreativetextInput,"This is Just for Testing");
		   Thread.sleep(50000);
		
	}
	   
   }
	public void EditCreative(String sheet) throws Throwable {
		Thread.sleep(1000);
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		Thread.sleep(1000);
		CreativeTitle.sendKeys("edited");
		smsCreativeDetails.sendKeys("edited");
		String title = commonObjects.getTextFormTextField(CreativeTitle);
		String creativedetails = commonObjects.getTextFormTextField(smsCreativeDetails);
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickSaveOfferButton();
		//clickOfferEditProceedButton();
		//clickOfferEditProceedButton();
		//clickSaveOfferButton();
		Thread.sleep(2000);
		chooseOffer(sheet);
		commonObjects.clickOptionsIcon();
		//chooseOffer(sheet);
		clickEditOffer();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		Thread.sleep(1000);
		String Editedtitle = commonObjects.getTextFormTextField(CreativeTitle);
		String Editedcreativedetails = commonObjects.getTextFormTextField(smsCreativeDetails);
		System.out.println("test");
		System.out.println("Edited Creative detail is" +Editedcreativedetails+ "");
		System.out.println("Creative detail is" +creativedetails+ "");
		assertTrue("CreativeTitle is not saved correctly after editing", Editedtitle.equals(title));
		assertTrue("CreativeDetails is not saved correctly after editing", Editedcreativedetails.equals(creativedetails));
	}
	public void EditTrack(String sheet) throws Throwable {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		Thread.sleep(1000);
		jswait.loadClick("//form[@id='trackForm']//data-table-cell[text()='2']/..//iron-icon[contains(@icon,'edit')]");
		//addTrackingRuleSecondConditionConditionValue.sendKeys("1");
		driver.findElement(By.xpath("//recharge-condition[@class='style-scope recharge-rule-grid']//paper-input-wrapper[@id='value']//div[@class='label-and-input-container style-scope paper-input-container']/input[@id='input']/../input")).sendKeys("1");
		String value = commonObjects.getTextFormTextField("//recharge-condition[@class='style-scope recharge-rule-grid']//paper-input-wrapper[@id='value']//div[@class='label-and-input-container style-scope paper-input-container']/input[@id='input']/../input");
		jswait.loadClick(editTrackingRuleSaveButton);
		clickOfferEditProceedButton();
		clickSaveOfferButton();
		Thread.sleep(2000);
		chooseOffer(sheet);
		commonObjects.clickOptionsIcon();
		//chooseOffer(sheet);
		clickEditOffer();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		Thread.sleep(1000);
		jswait.loadClick("//form[@id='trackForm']//data-table-cell[text()='2']/..//iron-icon[contains(@icon,'edit')]");
		String editedvalue = commonObjects.getTextFormTextField("//recharge-condition[@class='style-scope recharge-rule-grid']//paper-input-wrapper[@id='value']//div[@class='label-and-input-container style-scope paper-input-container']/input[@id='input']/../input");
		jswait.loadClick(editTrackingRuleSaveButton);
		System.out.println("Edited value is" +editedvalue+ "");
		System.out.println("Orginal value is" +value+ "");
		assertTrue("CreativeTitle is not saved correctly after editing", editedvalue.equals(value));
		//createSecondDefaultTrackingRuleCondition();
		//clickOfferEditProceedButton();
	}
	
	public void EditReward(String sheet) throws Throwable {
		Thread.sleep(1000);
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		Thread.sleep(1000);
		enterSuccessMessage("Success from Selenium_edited");
		String value = commonObjects.getTextFormTextField(successMessage);
		clickSaveOfferButton();
		Thread.sleep(2000);
		chooseOffer(sheet);
		commonObjects.clickOptionsIcon();
		//chooseOffer(sheet);
		clickEditOffer();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		clickOfferEditProceedButton();
		Thread.sleep(1000);
		String editedvalue = commonObjects.getTextFormTextField(successMessage);
		System.out.println("Edited value is" +editedvalue+ "");
		System.out.println("Orginal value is" +value+ "");
		assertTrue("Success message is not saved correctly after editing", editedvalue.equals(value));
	}
	
	@FindBy(xpath = "(//data-table-row//data-table-cell[1])[10]")
	private WebElement firstRule;
	@FindBy(xpath = "(//data-table-row//data-table-cell[1])[11]")
	private WebElement secondRule;
	
	public String getFirstRuleName() {
		String getFirstRule=firstRule.getText();
		return getFirstRule;
	}
	
	
	public void enterOfferDetailsFromSheetForMultipleCreative(String sheet, String productSheet, String testMode) throws Throwable {
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
		Thread.sleep(3000);
		enterProductTabFields(productSheet);
		clickProceedButton();

		// ******************Creative tab*****************:
		enterCreativeTabDetails(eh,testMode);
		jswait.loadClick(addCreativeButton);
		enterSecondCreativeTabDetails(eh);
		clickProceedButton();
		Thread.sleep(3000);

		// ******************Track tab*****************:
		if (!eh.getCellByColumnName("Offer Type").contains("Informational")) {
			enterTrackTabDetails(eh);
			createFirstDefaultTrackingRuleCondition();
			getFirstRuleName();
			createSecondDefaultTrackingRuleCondition();
		}
		clickProceedButton();

		// ******************Rewards tab*****************:
		if (!eh.getCellByColumnName("Offer Type").contains("Informational")) {
			
		
				if (eh.getCell(1, 2).toString().contains("Seeding")) {
					clickRewardTypeInputField();
					clickRewardTypeAny();
				}
				else {
					clickRewardFirstRuleAdButton();
					clickRewardTypeInputField();
					clickRewardTypeAny();
					enterSuccessMessage("Success from Selenium");
					enterFailureMessage("Failure from Selenium");
				}
		}

	}
	public void createOfferWithMultipleCreatives(String sheet, String productSheet,String testMode) throws Throwable {
		clickCreateNewOfferButton();
		enterOfferDetailsFromSheetForMultipleCreative(sheet, productSheet, testMode);
		clickSaveOfferButton();
	}
	
	public void clickDuplicateoffer() throws InterruptedException {
		jswait.loadClick(optionsDuplicate);		
	}
	
	public void CopyOffer(String offername) throws InterruptedException, Exception, IOException{
		commonObjects.filterName(offername);
		commonObjects.clickOptionsIcon();
		clickDuplicateoffer();
		Thread.sleep(2000);
		String copiedoffername = commonObjects.getTextFormTextField(offerName);
		System.out.println("name of copied offer is:  " +copiedoffername );
		clickProceedButton();
		clickProceedButton();
		clickProceedButton();
		clickProceedButton();
		clickSaveOfferButton();
		commonObjects.filterName(copiedoffername);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+copiedoffername+"')]"));
		Assert.assertTrue(element.isDisplayed(), "Copied job not found");
		}
	

		
	
}
