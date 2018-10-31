package pageObjetcs;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class PmConfigurationPage extends Init{

	JSWaiter jswait = new JSWaiter();
	CommonObjects commonObjects = new CommonObjects();
	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public PmConfigurationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'Saved Segments')]/../..")
	private WebElement savedSegmentsButton;
	@FindBy(xpath="//paper-button[contains(text(),'Create New Segment')]")
	private WebElement createNewSegmentButton;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//label[contains(.,'Segment Name')]/../..//input")
	private WebElement segmentNameField;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//paper-button[contains(.,'Save')]")
	private WebElement segmentSaveButton;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//label[contains(.,'Description')]/../..//textarea")
	private WebElement segmentDescriptionField;
	@FindBy(xpath = "//paper-dialog[@id='predefinedwin']//label[contains(.,'List')]/../..//input")
	private WebElement listSelectorField;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//paper-item[contains(.,'"+SELENIUM_LIST+"')]")
	private WebElement listSelect;
	@FindBy(xpath="//paper-dialog[@id='predefinedwin']//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement editSegmentConditionOption;
	@FindBy(xpath = "//paper-dialog[@id='predefinedwin']//paper-icon-item[contains(.,'Delete')]")
	private WebElement savedSegmentOptionsDelete;
	@FindBy(xpath="//paper-dialog[@id='deleteConfirmationModalPredefined']//paper-button[2]")
	private WebElement deleteSaveSegmentConfirmOK;
	@FindBy(xpath="//paper-tab[contains(.,'Show InActive Segments')]")
	private WebElement inactiveSegmentsPaperTab;
	@FindBy(xpath="//paper-tab[contains(.,'Show Active Segments')]")
	private WebElement activeSegmentsPaperTab;
//	@FindBy(xpath = "")
//	private WebElement filterFormName;
//	@FindBy(xpath="")
//	private WebElement statusActiveList;
//	@FindBy(xpath="")
//	private WebElement statusInactiveList;
//	@FindBy(xpath="")
//	private WebElement optionsDashboard;
//	@FindBy(xpath="")
//	private WebElement iconHelp;
//	@FindBy(xpath = "")
//	private WebElement filterFormName;
//	@FindBy(xpath = "")
//	private WebElement filterFormName;
//	@FindBy(xpath="")
//	private WebElement statusActiveList;
//	@FindBy(xpath="")
//	private WebElement statusInactiveList;
//	@FindBy(xpath="")
//	private WebElement optionsDashboard;
//	@FindBy(xpath="")
//	private WebElement iconHelp;
//	@FindBy(xpath = "")
//	private WebElement filterFormName;
//	@FindBy(xpath="")
//	private WebElement statusActiveList;
//	@FindBy(xpath="")
//	private WebElement statusInactiveList;
//	@FindBy(xpath="")
//	private WebElement optionsDashboard;
//	@FindBy(xpath="")
//	private WebElement iconHelp;
//	@FindBy(xpath = "")
//	private WebElement filterFormName;
	
	
	
	
	
	public void clickdeleteSaveSegmentConfirmOK() throws InterruptedException{
		jswait.loadClick(deleteSaveSegmentConfirmOK);
	}
	public void clickInactiveSegmentTab() throws InterruptedException{
		jswait.loadClick(inactiveSegmentsPaperTab);
	}
	public void clickActiveSegmentTab() throws InterruptedException{
		jswait.loadClick(activeSegmentsPaperTab);
	}
	public void clickSavedSegmentsButton() throws InterruptedException{
		jswait.loadClick(savedSegmentsButton);
	}
	public void clickCreateNewSegmentButton() throws InterruptedException{
		jswait.loadClick(createNewSegmentButton);
	}
	
	public void clickSegmentSaveButton() throws InterruptedException{
		jswait.loadClick(segmentSaveButton);
	}
	public void clickSavedSegmentOptionsDelete() throws InterruptedException{
		jswait.loadClick(savedSegmentOptionsDelete);
	}
	
	public void clickEditSegmentConditionOption() throws InterruptedException{
		jswait.loadClick(editSegmentConditionOption);
	}
	
	public void enterSavedSegmentName(String segmentName) throws InterruptedException{
		jswait.loadSendKeys(segmentNameField, segmentName);
	}
	
	public void selwctList() throws InterruptedException {
		jswait.loadSendKeys(listSelectorField,SELENIUM_LIST);
	}
	public void enterSavedSegmentDetails(String segmentName, String condition) throws InterruptedException {
		if(condition.contains("segmentAgeGT40")) {
			enterSavedSegmentName(segmentName);
			jswait.loadSendKeys(segmentDescriptionField, segmentName+"_Description");
			jswait.loadSendKeys(listSelectorField,SELENIUM_LIST);
			jswait.loadClick(listSelect);
			targetConditionObjects.clickBasicTargetConditionWithAge("40");
		}
	}	
}
