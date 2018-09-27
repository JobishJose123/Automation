package pageObjetcs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;

public class CampaignObjects extends Init{
	public CampaignObjects() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();
	CommonObjects commonObjects = new CommonObjects();
	public ExcelHelper eM = new ExcelHelper(); 
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	public TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	
	@FindBy(xpath=".//*[@id='mainContainer']/paper-menu/div/hexagon-icon[3]/label/..")
	private WebElement lifeCycleMarketing;
	@FindBy(xpath="//paper-item[contains(.,'Export to Location')]")
	private WebElement optionsExportToLocation;
	@FindBy(xpath="//paper-item[contains(.,'View Broadcasts')]")
	private WebElement optionsViewBroadcasts;
	@FindBy(xpath="//paper-button[contains(.,'Create New Broadcast')]")
	private WebElement createNewBroadcastButton;
	@FindBy(xpath="//paper-button[contains(.,'Create New Campaign')]")
	private WebElement createNewCampaignButton;
	@FindBy(xpath="//paper-button[contains(.,'Create Campaign template')]")
	private WebElement createNewTemplateButton;
	@FindBy(xpath="//label[contains(.,'Type')]/../input")
	private WebElement typeSelector;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Informational')]")
	private WebElement typeInformational;
	@FindBy(xpath=".//campaign-details//label[contains(.,'Name')]/../input")
	private WebElement campaignName;
	@FindBy(xpath=".//label[contains(.,'attr_2')]/../input")
	private WebElement AttrVal;
	@FindBy(xpath="//label[contains(.,'Name')]/../input")
	private WebElement campaignTemplateName;
	@FindBy(xpath=".//*[@id='textarea']")
	private WebElement campaignDescription;
	@FindBy(xpath=".//campaign-details//label[contains(.,'Offer Catalog')]/../input")
	private WebElement offerCatalogSelector;
	@FindBy(xpath="//paper-button[contains(.,'Proceed')]")
	private WebElement proceedButton;
	
	@FindBy(xpath="//span[contains(.,'1')]")
	private WebElement templateCount;
	
	
	@FindBy(xpath="//label[contains(.,'Please select a Campaign Category')]/../input")
	private WebElement selectCategory;
	@FindBy(xpath="//vaadin-combo-box-item[1]")
	private WebElement firstCategory;
	
	
	@FindBy(xpath=".//paper-card[@id='conditionCard']")
	private WebElement conditionCard;
	@FindBy(xpath=".//div[@class='offers flex style-scope campaign-details' and contains(.,'1 Number of offers')]")
	private WebElement offerNumber;
	@FindBy(xpath="//paper-item[contains(.,'Show History')]")
	private WebElement optionsshowhistory;
	@FindBy(xpath="//paper-item[contains(.,'Review')]")
	private WebElement optionsReview;
	

	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Save Campaign')]")
	private WebElement saveCampaignButton;
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Save')][3]")
	private WebElement saveCampaignTemplateButton;
	@FindBy(xpath="//div[contains(text(),'Campaign Categories')]/../..")
	private WebElement campaignCategoriesButton;
	@FindBy(xpath="//paper-button[contains(text(),'Create New Campaign Category')]")
	private WebElement createNewCampaignCategoryButton;
	@FindBy(xpath="//label[contains(.,'Please select a location')]/../input")
	private WebElement SelectLocationField;
	
	@FindBy(xpath="//span[contains(.,'Campaign Exported Successfully')]")
	private WebElement successfulExportMessage;
	
	
	@FindBy(xpath="//span[contains(.,'Campaign Shared Successfully')]")
	private WebElement successfulExportMessageOfCampaignTemplate;
	
	@FindBy(xpath="//span[contains(.,'Campaign imported successfully')]")
	private WebElement successfulImportMessage;
	
	
	@FindBy(xpath=".//div[@id='trigger']//paper-icon-button")
	private WebElement optionsIconForCampaignTemplate;
	
	@FindBy(xpath="//paper-item[contains(.,'Edit')]")
	private WebElement editOptionForCampaignTemplate;
	

	
	@FindBy(xpath="//data-table-cell[contains(.,'Imported')]")
	private WebElement importStatusForCampaignTemplate;
	
	
	@FindBy(xpath=".//*[@id='createNew']//label[contains(.,'Name')]/../input")
	private WebElement categoryNameInput;
	@FindBy(xpath=".//paper-dialog[@id='confirmBoxPause']//paper-button[contains(.,'Yes')]")
	private WebElement confirmPauseYes;
	@FindBy(xpath=".//paper-dialog[@id='confirmBoxPause']")
	private WebElement confirmPauseDialogue;
	@FindBy(xpath=".//paper-dialog[@id='deleteCampaign']//paper-button[contains(.,'Yes')]")
	private WebElement confirmDeleteCampaignYes;
	@FindBy(xpath=".//paper-dialog[@id='deleteCampaign']")
	private WebElement confirmDeleteCampaignDialogue;
	@FindBy(xpath=".//paper-dialog[@id='confirmBoxAbort']//paper-button[contains(.,'Yes')]")
	private WebElement confirmAbortYes;
	@FindBy(xpath=".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'A')]")
	private WebElement statusBeforePause;
	@FindBy(xpath=".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'P')]")
	private WebElement statusAfterPause;
	@FindBy(xpath=".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'A')]")
	private WebElement statusAfterResume;
	
	@FindBy(xpath=".//div[@class='hex style-scope hexagon-content']")
	private WebElement statusIcon;
	@FindBy(xpath=".//paper-dialog[@id='confirmBoxResume']//paper-button[contains(.,'Yes')]")
	private WebElement confirmResumeYes;
	@FindBy(xpath=".//*[@id='createNew']//paper-button[contains(.,'Save')]")
	private WebElement campaignCategorySave;
	@FindBy(xpath="//paper-button[contains(.,'Export')]")
	private WebElement exportLocationButton;
	@FindBy(xpath="//paper-tab/div[contains(.,'Campaign Templates')]/..")
	private WebElement campaignTemplatesTab;
	@FindBy(xpath="//paper-button[contains(.,'Import')]")
	private WebElement importOption;
	@FindBy(xpath="//paper-button[contains(.,'Create Campaign template')]")
	private WebElement createCampaignTemplateButton;
	@FindBy(xpath=".//span[contains(.,'Oops! This name already exists. Try another name for the new Campaign.')]")
	private WebElement DuplicateCampaignNameToast;
	@FindBy(xpath = ".//div[@id='trigger']//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsIcon;
	
	@FindBy(xpath = ".//paper-icon-button[@icon='create']")
	private WebElement optionsEdit;
	@FindBy(xpath = ".//paper-icon-item[contains(.,'Delete')]")
	private WebElement optionsDelete;
	@FindBy(xpath = ".//paper-item[contains(.,'Delete')]")
	private WebElement optionsGraphicalDelete;
	@FindBy(xpath = ".//paper-icon-item[contains(.,'Edit')]")
	private WebElement optionsEditTargetCondtion;
	@FindBy(xpath = "(//paper-item[contains(.,'Edit')])[1]")
	private WebElement editCampaign;
	@FindBy(xpath = "//iron-icon[@icon='icons:block']")
	private WebElement abortCampaign;
	@FindBy(xpath = ".//paper-item[contains(.,'Delete')]")
	private WebElement deleteCampaign;
	@FindBy(xpath = "//iron-icon[@icon='av:pause-circle-filled']")
	private WebElement pauseCampaign;
	@FindBy(xpath = "//iron-icon[@icon='av:playlist-play']")
	private WebElement resumeCampaign;
	@FindBy(xpath = ".//label[contains(.,'Name')]/../input")
	private WebElement campaignTemplateNameInput;
	@FindBy(xpath = ".//paper-button[contains(.,'Use Template')]")
	private WebElement useTemplateButton;
	
	@FindBy(xpath = "//label[contains(.,'Campaign Template Name')]/../input")
	private WebElement campaignNameField;
	@FindBy(xpath = "//div[@data-nodepos='responseData.conditions']")
	private WebElement KPIConditionBox;
	
	@FindBy(xpath = "//label[contains(.,'Native KPI')]//following::iron-icon[2]")
	private WebElement nativeKPIField;
	@FindBy(xpath = "//vaadin-combo-box-item[1]")
	private WebElement nativeKPIListFirstElement;
	@FindBy(xpath = "//paper-button[@id='saveCondition']")
	private WebElement conditionMapSave;
	
	@FindBy(xpath = "//label[contains(.,'Category')]/../input")
	private WebElement categoryName;
	
	@FindBy(xpath = ".//paper-button[contains(.,'Add AND')]")
	private WebElement addAndButton;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
	private WebElement targetConditionTypeSelector;
	@FindBy(xpath="//label[contains(.,'Conversion Rate')]")
	private WebElement conversionRate;
	@FindBy(xpath="//label[contains(.,'Targeted Customers')]")
	private WebElement targetedCustomers;
	@FindBy(xpath="//label[contains(.,'CG')]")
	private WebElement CG;
	@FindBy(xpath=".//div[@class='layout vertical flex rowDetail style-scope campaign-list']")
	private WebElement campaignRowDetails;
	@FindBy(xpath=".//span[contains(.,'Save target conditions before proceeding.')]")
	private WebElement SaveTCforCampaign;
	String colorBeforeAbort;
	String colorAfterAbort;
	@FindBy(xpath=".//paper-item//label[contains(.,'Targeted Customers')]")
	private WebElement targetedCustomersLabel;
	@FindBy(xpath=".//paper-item//label[contains(.,'Converted Customers')]")
	private WebElement convertedCustomersLabel;
	@FindBy(xpath=".//div[@class='summary layout horizontal center style-scope campaign-list']//paper-item[2]")
	private WebElement targetedCustomersCount;
	
	@FindBy(xpath=".//div[@class='summary layout horizontal center style-scope campaign-list']//paper-item[3]")
	private WebElement convertedCustomersCount;
	
	@FindBy(xpath=".//div[@class='layout vertical flex rowDetail style-scope campaign-list']//label[1][2]")
	private WebElement targetedCustomersExpandCount;
	
	
	@FindBy(xpath="//paper-button[@id='importBtn' and @aria-disabled='true' ]")
	private WebElement importOptionDisabled;
	
	@FindBy(xpath="//paper-input-error[contains(.,'This field is required.')]")
	private WebElement selectCampaignCategoryErrorMessage;
	
	@FindBy(xpath="//paper-input-error[contains(.,'This field is required.')]")
	private List <WebElement> selectImportPageErrorMessages;
	
	
	
	@FindBy(xpath=".//*[@id='campaignsListMenu']//paper-item[contains(.,'Pause')]")
	private WebElement campaignPauseButton;

	@FindBy(xpath="//label[@id = 'label']/../input")
	private WebElement selectLocationToExport;
	@FindBy(xpath=".//paper-button[contains(.,'Request Approval')]")
	private WebElement approvalbutton ;
	@FindBy(xpath=".//div[@class='levelCheckBox style-scope choose-approvers']//following::paper-checkbox")
	private WebElement firstleveluserselect ;
	@FindBy(xpath=".//*[@id='chooseDialog']//paper-button[contains(.,'OK')]")
	private WebElement approvalboxOKbtn;
	
	@FindBy(xpath=".//div[@class='levelCheckBox style-scope choose-approvers']//following::paper-checkbox[2]")
	private WebElement secondLevelUserSelect ;
	@FindBy(xpath=".//label[contains(.,'attr_2')]/..//input")
	private WebElement campaignattribute;
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


	public void clickOptionsViewBroadcasts() throws InterruptedException {
		jswait.loadClick(optionsViewBroadcasts);
	}
	public void clickOptionsExportToLocation() throws InterruptedException {
		jswait.loadClick(optionsExportToLocation);
	}
	
	
	public void checkExportToLocationOptionAvailableForCampaign() throws InterruptedException {
		Thread.sleep(2000);
		assertTrue(optionsExportToLocation.isDisplayed());
	}
	
	public void optionsshowhistory() throws InterruptedException {
		jswait.loadClick(optionsshowhistory);
	}
	
	
	
	
	
	public void clickSaveCampaignTemplate() throws InterruptedException {
		jswait.loadClick(saveCampaignTemplateButton);
	}
	
	public void chooseCategory() throws InterruptedException, IOException, UnsupportedFlavorException {
		
	    jswait.loadClick(selectCategory);
		String Category=firstCategory.getText();
		System.out.println("Category: "+Category);
		eM.setExcelFile("CategoryEnv2", "category");
    	Thread.sleep(4000);
    	System.out.println("151511: "+eM.getCell(1, 0));
 		eM.setCell(1, 0, Category);
		jswait.loadClick(firstCategory);
		
		KPI_TEXT1=jswait.getTextFormElement("//div[@data-nodepos='responseData.conditions']");
	
	}
	
	public void clickImportOption() throws InterruptedException {
		jswait.loadClick(importOption);
		
	}
	
	public void clickCampaignTemplateTab() throws InterruptedException {
		jswait.loadClick(campaignTemplatesTab);
		
	}
	public void clickCreateCampaignTemplateButton() throws InterruptedException {
		jswait.loadClick(createCampaignTemplateButton);
	}
	
	
	public void clickCampaignPauseButton() throws InterruptedException {
		jswait.loadClick(campaignPauseButton);
	}
	public void clickCreateCategorySaveButton() throws InterruptedException {
		jswait.loadClick(campaignCategorySave);
	}
	public void clickExportButton() throws InterruptedException {
		jswait.loadClick(exportLocationButton);
	}
	public void clickEditCampaignOption() throws InterruptedException {
		jswait.loadClick(editCampaign);
	}
	
	public void approvalbutton() throws InterruptedException {
		jswait.loadClick(approvalbutton);
	}
	
	public void firstleveluserselect() throws InterruptedException {
		jswait.loadClick(firstleveluserselect);
	}
	
	public void secondLevelUserSelect() throws InterruptedException {
		jswait.loadClick(secondLevelUserSelect);
	}
	public void approvalboxOKbtn() throws InterruptedException {
		jswait.loadClick(approvalboxOKbtn);
	}
	
	
	
	
	
	
	
	
	
	
	public void clickAbortCampaignOption() throws InterruptedException {
		jswait.loadClick(abortCampaign);
	}
	
	public void clickDeleteCampaignOption() throws InterruptedException {
		jswait.loadClick(deleteCampaign);
	}
	
	
	public void clickPauseCampaignOption() throws InterruptedException {
		jswait.loadClick(pauseCampaign);
	}
	public void clickResumeCampaignOption() throws InterruptedException {
		jswait.loadClick(resumeCampaign);
	}
	public void verifyResumeCampaignOption() throws InterruptedException {
		assertTrue(resumeCampaign.isDisplayed());
	}
	public void clickConfirmPauseYes() throws InterruptedException {
		jswait.loadClick(confirmPauseYes);
	}
	public void clickConfirmResumeYes() throws InterruptedException {
		jswait.loadClick(confirmResumeYes);
	}
	
	public void clickConfirmAbortYes() throws InterruptedException {
		jswait.loadClick(confirmAbortYes);
	}
	
	public void verifyStatusBeforePause() throws InterruptedException {
		jswait.loadClick(statusBeforePause);
	}
	
	public void verifyStatusAfterPause() throws InterruptedException {
		jswait.loadClick(statusAfterPause);
	}
	
	public void verifyStatusAfterResume() throws InterruptedException {
		jswait.loadClick(statusAfterResume);
	}
	
	public void verifyStatusOfCampaign() throws InterruptedException {
		
		Thread.sleep(3000);
		verifyStatusBeforePause();
		commonObjects.clickOptionsIcon();
 		clickPauseCampaignOption();
 		clickConfirmPauseYes();
 		//WebDriverWait wait = new WebDriverWait(driver, 25);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'P')]")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'P')]")));
 		Thread.sleep(5000);
 		driver.navigate().refresh();
 		Thread.sleep(3000);
 		driver.navigate().refresh();
 		Thread.sleep(5000);
 		verifyStatusAfterPause();
		commonObjects.clickOptionsIcon();
		//WebDriverWait wait = new WebDriverWait(driver, 25);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iron-icon[@icon='av:playlist-play']")));
		Thread.sleep(3000);
		verifyResumeCampaignOption();
		clickResumeCampaignOption();
 		clickConfirmResumeYes();
 		Thread.sleep(3000);
 		verifyStatusAfterResume();
		
	}
	
   public void verifyPauseOptionForCampaign() throws InterruptedException {
		
		Thread.sleep(3000);
		verifyStatusBeforePause();
		commonObjects.clickOptionsIcon();
 		clickPauseCampaignOption();
 		clickConfirmPauseYes();
 		//WebDriverWait wait = new WebDriverWait(driver, 25);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'P')]")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//vaadin-grid-table-row//vaadin-grid-table-cell//span[@class='statusHexWrap style-scope campaign-list' and contains(.,'P')]")));
 		Thread.sleep(5000);
 		driver.navigate().refresh();
 		Thread.sleep(3000);
 		driver.navigate().refresh();
 		Thread.sleep(5000);
 		verifyStatusAfterPause();
		
	}
   
   public void verifyDeletedCampaign(String name) throws Exception {
	   
	 
	   
	   Exception deleteException=new Exception("Status not deleted");
	   
	  try { 
		  if(driver.findElement(By.xpath(".//vaadin-grid-cell-content[contains(.,'"+name+"')]")).isDisplayed()==true) {
		  
			  throw deleteException;
		  }
	  }
		  
		  catch(Exception e) {
			  
			  System.out.println("Status deleted");
			  
			  
			  
		  }
	  
	}
   
	public void enterCategoryName(String name) throws InterruptedException {
		jswait.loadSendKeys(categoryNameInput, name);
	}
	
	public void enterExportLocation(String name) throws InterruptedException {
		jswait.loadSendKeys(SelectLocationField, name);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+name+"')]");
	
	}
	
	public void editCaampaignTemplateDetails(String name) throws InterruptedException {
		jswait.loadSendKeys(campaignTemplateNameInput, name);
		enterCampaignDescription("Desc for Template edited");
		clickProceedButton();
		clickSaveCampaignTemplate();
	}
	
	public void editTargetConditionForATemplate() throws InterruptedException {
		clickProceedButton();
		verifyTargetConditionCard();
		clickOptionsIcon();
		Thread.sleep(3000);
		clickEditTargetCondtion();
		targetConditionObjects.clickBasicTargetConditionWithAgeEdit();
		Thread.sleep(3000);
		clickSaveCampaignTemplate();
	}
	
	public void deleteTargetTemplateFromSheet() throws InterruptedException {
		clickProceedButton();
		verifyTargetConditionCard();
		clickOptionsIcon();
		Thread.sleep(3000);
		clickDeleteOption();
		Thread.sleep(3000);
		verifyTargetConditionCardAfterDeleteion();
		clickSaveCampaignTemplate();
	}
	
	public void deleteTargetConditionForCampaign() throws InterruptedException {
		clickProceedButton();
		targetConditionObjects.clickTargetConditionViewToggle();
		clickOptionsIcon();
		Thread.sleep(3000);
		clickDeleteOptionGraphical();
		Thread.sleep(3000);
		targetConditionObjects.clickTargetConditionViewToggle();
		verifyTargetConditionCardAfterDeleteion();
		clickProceedButton();
		verifySaveTCforCampaign();
	}
	public void deleteTextualTargetConditionForCampaign() throws InterruptedException {
		clickProceedButton();
		clickOptionsIcon();
		Thread.sleep(3000);
		clickDeleteOption();
		Thread.sleep(3000);
		verifyTargetConditionCardAfterDeleteion();
		clickProceedButton();
		verifySaveTCforCampaign();
	}
	
	
	public void click_on_campaign_and_verify_row(String name) throws InterruptedException {
		
		assertTrue(driver.findElement(By.xpath(".//vaadin-grid-cell-content[contains(.,'"+name+"')]")).isDisplayed());
		driver.findElement(By.xpath(".//vaadin-grid-cell-content[contains(.,'"+name+"')]")).click();
		assertTrue(campaignRowDetails.isDisplayed());
		assertTrue(conversionRate.isDisplayed());
		assertTrue(targetedCustomers.isDisplayed());
		assertTrue(CG.isDisplayed());

		
	}
	
  
	
	public void verifyTargetdCustomersLabelAndCount() throws Exception {
		
	
	    Thread.sleep(300000);
	    driver.navigate().refresh();
		assertTrue(targetedCustomersLabel.isDisplayed());
		String count1=targetedCustomersCount.getText();
		String count2=targetedCustomersExpandCount.getText();
		System.out.println("Count1 "+count1);
		System.out.println("Count2 "+count2);
		Exception mismatchCount=new Exception("Count mismatch");
		
		if(count1.equals(count2)) {
			System.out.println("Count is matching");
		}
		else
			throw mismatchCount;
	}
	
      public void verifyStatusIconBeforeAbort() throws InterruptedException {
		
    	 colorBeforeAbort= statusIcon.getCssValue("background-color");
    	 System.out.println("Color Before Abort: "+colorBeforeAbort);
    	 
		
	    }
      
      public void verifyStatusIconAfterAbort() throws InterruptedException {
    	   
    	  driver.navigate().refresh();
  		Thread.sleep(5000);
    	  colorAfterAbort= statusIcon.getCssValue("background-color");
     	 System.out.println("Color After Abort: "+colorAfterAbort);
 		
 	    }
      
      public void compareColorOfStatusIcons() throws Exception {
  		
    	  Exception colorException=new Exception("Status Not Changed");
    	  
    	if(colorBeforeAbort.equals(colorAfterAbort)) {
    		
    		throw colorException;
    	}
  	  }
	
	
	public void abortCampaign() throws Exception {
		
		verifyStatusIconBeforeAbort();
		commonObjects.clickOptionsIcon();
 		clickAbortCampaignOption();
 		clickConfirmAbortYes();
 		driver.navigate().refresh();
		Thread.sleep(4000);
		verifyStatusIconAfterAbort();
		compareColorOfStatusIcons();
	}
	
	public void verifyConfirmDeleteCampaignDialogue() throws Exception {
		
		assertTrue(confirmDeleteCampaignDialogue.isDisplayed());
 		
	}
	
   public void clickCampaignDeleteYesButton() throws Exception {
		
		assertTrue(confirmDeleteCampaignYes.isDisplayed());
		jswait.loadClick(confirmDeleteCampaignYes);
 		
	}
	
	
    public void deleteCampaign() throws Exception {
		Thread.sleep(2000);
		commonObjects.clickOptionsIcon();
 		clickDeleteCampaignOption();
 		verifyConfirmDeleteCampaignDialogue();
 		clickCampaignDeleteYesButton();
 		Thread.sleep(3000);
 		
	}
	
	
	
	public void createNewCampaignCategory(String name) throws InterruptedException {
		clickCreateNewCampaignCategoryButton();
		enterCategoryName(name);
		clickCreateCategorySaveButton();
	}
	
	public void chooseExportLocationForCampaign(String name) throws InterruptedException {
		clickSelectLocationField();
		enterExportLocation(name);
		clickExportButton();
	}
	
	
	
	public void clickCreateNewCampaignCategoryButton() throws InterruptedException {
		jswait.loadClick(createNewCampaignCategoryButton);
	}
	public void clickSelectLocationField() throws InterruptedException {
		jswait.loadClick(SelectLocationField);
	}
	public void navigateToCampaignCategories() throws InterruptedException {
		jswait.loadClick(campaignCategoriesButton);
	}
	public void clickSaveCampaignButton() throws InterruptedException {
		jswait.loadClick(saveCampaignButton);
	}
	
	public void clickAddAndButton() throws InterruptedException {
		jswait.loadClick(addAndButton);
	}
	public void verifyAddAndButton() throws InterruptedException {
		assertTrue(addAndButton.isDisplayed());
	}
	
	public void verifyDuplicateCampaignNameToast() throws InterruptedException {
		assertTrue(DuplicateCampaignNameToast.isDisplayed());
	}
	
	public void verifySaveTCforCampaign() throws InterruptedException {
		assertTrue(SaveTCforCampaign.isDisplayed());
	}
	
	public void clickProceedButton() throws InterruptedException {
		jswait.loadClick(proceedButton);
	}
	public void verifyTargetConditionCard() throws InterruptedException {
		assertTrue(conditionCard.isDisplayed());
	}
	public void verifyTargetConditionCardAfterDeleteion() throws InterruptedException {
		assertTrue(targetConditionTypeSelector.isDisplayed());
	}
	
	
	public void clickCreateNewBroadcastButton() throws InterruptedException {
		jswait.loadClick(createNewBroadcastButton);
	}
	public void clickCreateNewCampaignButton() throws InterruptedException {
		jswait.loadClick(createNewCampaignButton);
	}
	public void clickCreateNewTemplateButton() throws InterruptedException {
		jswait.loadClick(createNewTemplateButton);
	}
	public void clickTypeSelector() throws InterruptedException {
		jswait.loadClick(typeSelector);
	}
	public void clickTypeInformational() throws InterruptedException {
		jswait.loadClick(typeInformational);
	}
	public void selectOfferCatalog(String catalog) throws InterruptedException {
		jswait.loadSendKeys(offerCatalogSelector,catalog);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+catalog+"')]");
	}
	
	public void selectOfferCatalogForExportCapaign() throws InterruptedException, UnsupportedFlavorException, IOException {
		jswait.loadClick(offerCatalogSelector);
		//jswait.loadClick("//vaadin-combo-box-item[1]");
		Thread.sleep(4000);
		String cat=jswait.getTextFormElement(".//*[@id='messageStyle']//following::vaadin-combo-box-item[1]");
		System.out.println("Catalog: "+cat);
		jswait.loadSendKeys(offerCatalogSelector,cat);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+cat+"')]");
	}
	public void enterCampaignName(String name) throws InterruptedException {
		jswait.loadSendKeys(campaignName, name);
	}
	public void enterAttributeValue(String name) throws InterruptedException {
		jswait.loadSendKeys(AttrVal, name);
	}
	public void enterCampaignTemplateName(String name) throws InterruptedException {
		jswait.loadSendKeys(campaignTemplateName, name);
	}
	public void enterCampaignDescription(String desc) throws InterruptedException {
		jswait.loadSendKeys(campaignDescription, desc);
	}
	public void selectTypeInformational() throws InterruptedException {
		clickTypeSelector();
		clickTypeInformational();
	}
	public void clickEditOption() throws InterruptedException {
		jswait.loadClick(optionsEdit);
	}
	public void clickEditTargetCondtion() throws InterruptedException {
		jswait.loadClick(optionsEditTargetCondtion);
	}
	public void clickDeleteOption() throws InterruptedException {
		jswait.loadClick(optionsDelete);
	}
	public void clickDeleteOptionGraphical() throws InterruptedException {
		jswait.loadClick(optionsGraphicalDelete);
	}
	public void navigateToLIfeCycleMarketing() throws InterruptedException {
		jswait.loadClick(lifeCycleMarketing);
	}
	
	public void clickOnUseTemplateButton() throws InterruptedException {
		jswait.loadClick(useTemplateButton);
	}
	
	
	public void clearCampaignNameField() throws InterruptedException {
		jswait.loadClick(campaignNameField);
		campaignNameField.clear();
	}
	
	public void checkCategoryName(String name) throws Exception {
		
		String st=commonObjects.getTextFormTextField(categoryName);

		//String st=categoryName.getText();
		System.out.println("Cat: "+st);
		Exception excep=new Exception("Match not Found");
		if(st.equals(name))
		{
			System.out.println("Match Found");
		}
		else
			throw excep;
	
	}
	public void enterCampaignDeails(String name,String catalog) throws InterruptedException {
		//selectTypeInformational();
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc creation in selenium");
		selectOfferCatalog(catalog);
jswait.loadSendKeys(campaignattribute, "11");	}
	
	public void enterCampaignDeailsForUseTemplate(String name,String catalog) throws InterruptedException {
		selectTypeInformational();
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc creation in selenium");
		selectOfferCatalog(catalog);

	}
	
	
	public void enterCampaignDeailsForExportCampaign() throws Throwable {
		
		//selectTypeInformational();
		String name="Test_Camp";
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc creation in selenium");
		selectOfferCatalogForExportCapaign();
		clickProceedButton();
		compareTextOfUsageMetricKPI();
	}
	
	
public void enterCampaignDeailsForCompareTargetConditions() throws Throwable {
		
		//selectTypeInformational();
		String name="Test_Camp";
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc creation in selenium");
		selectOfferCatalogForExportCapaign();
		clickProceedButton();
		compareTextOfTargetConditions();
	}
	
	public void compareTextOfUsageMetricKPI() throws Throwable {
		
		  KPI_TEXT2=jswait.getTextFormElement("//usage-metric[@class='style-scope target-usage-metric']");
		
		 System.out.println("Text Before Import:"+KPI_TEXT1);
		    System.out.println("Text After Import:"+KPI_TEXT2);
			Exception KPITextExcep=new Exception("Text are different after import");
			if(KPI_TEXT1.equals(KPI_TEXT2)) {
				
				System.out.println("Text are same after import");
					
			}
			else
				throw KPITextExcep;
		
	}
	
	
	public void compareTextOfTargetConditions() throws Throwable {
		
		TARGET_CONDITION_AFTER_IMPORT=jswait.getTextFormElement("//profile-field[@class='style-scope condition-form']");
		
		 System.out.println("Text Before Import:"+KPI_TEXT1);
		    System.out.println("Text After Import:"+TARGET_CONDITION_AFTER_IMPORT);
			Exception KPITextExcep=new Exception("Text are different after import");
			if(KPI_TEXT1.equals(TARGET_CONDITION_AFTER_IMPORT)) {
				
				System.out.println("Text are same after import");
					
			}
			else
				throw KPITextExcep;
		
	}
	
	
	public void CheckUsageMetricField() throws Throwable {
		
		 
			Exception UsageMetricExcep=new Exception("Usage metric is not displaying while creating BC from use tempalte option");
			if(driver.findElement(By.xpath("//usage-metric[@class='style-scope target-usage-metric']")).isDisplayed()) {
				
				System.out.println("Usage metric field is displaying while creating BC from use tempalte option");
					
			}
			else
				throw UsageMetricExcep;
		
	}
	
	
	
	
	
	public void verifyNumberOfOffersWhileCreateCampaign() throws InterruptedException {
		assertTrue(offerNumber.isDisplayed());
		String offNumber=offerNumber.getText();
		System.out.println(offNumber);
		offNumber.equals("1 Number of offers");
		
	}
	
	public void enterTemplateDeails(String name) throws InterruptedException {
		selectTypeInformational();
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc craetion in selenium");
		
	}
	public void scrollToCampaignCategory(String name) throws Exception {
		jswait.scrollAndClick("//campaign-category-chart", "//div[text()='"+name+"']");
	}
	
	public void selectCategoryAndImport() throws Exception {
		
		chooseCategory();
		clickImportOption();
	}
	
  public void clickImportButtonWithoutSelectingACampaignCategory() throws Exception {
		
		
		clickImportOption();
	}
	
	
	
	
	public void scrollToCampaignCategoryAndCheckCount(String name) throws Exception {
		jswait.scrollIntoView("//campaign-category-chart", "//div[text()='"+name+"']");
		assertTrue(templateCount.isDisplayed());
	}
	
	
	public void clickOptionsIcon() throws InterruptedException {
		jswait.loadClick(optionsIcon);
	}
	
	
	
	
	public void scrollToViewCampaignCategory(String name) throws Exception {
		jswait.scrollIntoView("//campaign-category-chart", "//div[text()='"+name+"']");
	}
	public void createCampaignTemplate(String name) throws InterruptedException {
		enterCampaignTemplateName(name);
		enterCampaignDescription("Desc for Template");
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		clickSaveCampaignTemplate();
	}
	
	public void createCampaignTemplateWithCustomerInsight(String name) throws InterruptedException {
		enterCampaignTemplateName(name);
		enterCampaignDescription("Desc for Template");
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAgeAndConsumerInsight();
		clickSaveCampaignTemplate();
	}
	
	
	public void createCampaignTemplateWithAddAnd(String name) throws InterruptedException {
		enterCampaignTemplateName(name);
		enterCampaignDescription("Desc for Template");
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		verifyAddAndButton();
		clickAddAndButton();
		//targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge2();
		clickSaveCampaignTemplate();
	}
	
	public void VerifyTemplateCreated(String name) throws InterruptedException {
		assertTrue(driver.findElement(By.xpath(".//data-table-cell[contains(.,'"+name+"')]")).isDisplayed());
		Thread.sleep(2000);
	
	}
	
	public void VerifyCampaignCreated(String name) throws Exception {
		commonObjects.filterName(name);
		jswait.waitUntil(".//vaadin-grid-cell-content[contains(.,'"+name+"')]");
		assertTrue(driver.findElement(By.xpath(".//vaadin-grid-cell-content[contains(.,'"+name+"')]")).isDisplayed());	
	}
	
	
	public void createCampaign(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}
	
	
	public void createCampaignForUseTemplate(String name,String catalog) throws InterruptedException {
		enterCampaignDeailsForUseTemplate(name,catalog);
		clickProceedButton();
//		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
//		targetConditionObjects.clickBasicTargetConditionWithAge();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//paper-input[2]/paper-input-container/div[2])[1]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}
	
	
	
	
	public void createCampaignWithUniqueKPI(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		enterAttributeValue("15");
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithUniqueKPI();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}
	
	
	
	public void createCampaignWithUsageMetric(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		enterAttributeValue("15");
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithUsageMetric();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}
	
	
	
	public void createCampaignWithCustomerLocationInsight(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		enterAttributeValue("15");
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithCustomerLocationInsight();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}
	
	
	
	public void verifyColorOfKPIConditionText() throws Throwable {
		
		String color=KPIConditionBox.getCssValue("color");
		System.out.println("Color Before Mapping:"+color);
		KPI_TEXT1=jswait.getTextFormElement("//div[@data-nodepos='responseData.conditions']");
		
		Exception colorExec= new Exception("Color Not Matching");
		if(color.equals("rgba(255, 0, 0, 1)")) {
			
			System.out.println("Validation is showing");
			
		}
		else
			throw colorExec;
			
		
	}
	
	
	
	
	
public void verifyColorOfKPIConditionTextAfterMapping() throws Throwable {
		
		String color=KPIConditionBox.getCssValue("color");
		System.out.println("Color After Mapping:"+color);
		KPI_TEXT2=jswait.getTextFormElement("//div[@data-nodepos='responseData.conditions']");
		
		Exception colorExec= new Exception("Color Not Matching");
		if(color.equals("rgba(23, 26, 40, 1)")) {
			
			System.out.println("Mapping Successful");
			
		}
		else
			throw colorExec;
			
		
	}
	
	
	
	
	
	public void map_to_the_native_condition() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(KPIConditionBox).doubleClick().build().perform();
		jswait.loadClick(nativeKPIField);
		Thread.sleep(2000);
		jswait.loadClick(nativeKPIListFirstElement);
		jswait.loadClick(conditionMapSave);
		
	}
	
	
	
   public void map_to_the_native_condition_from_sheet(String name) throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(KPIConditionBox).doubleClick().build().perform();
		jswait.loadClick(nativeKPIField);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+name+"')]");
		jswait.loadClick(conditionMapSave);
		
	}
	
	
	
   public void verifyTextsOfKPIConditionsBeforeAndAfterMapping() throws Throwable {
		
	   
	   
	    System.out.println("Text Before Mapping:"+KPI_TEXT1);
	    System.out.println("Text After Mapping:"+KPI_TEXT2);
		Exception KPITextExcep=new Exception("Text are same after mapping");
		if(KPI_TEXT1.equals(KPI_TEXT2)) {
			throw KPITextExcep;
			
		}
		
		else
			System.out.println("Text are different after mapping");
	}
	
	
	
	public void createCampaignfroapproval(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         approvalbutton();
         Thread.sleep(3000);
         firstleveluserselect();
         approvalboxOKbtn();
         
	}
	
	public void createCampaignfroapprovalWithTwoLvelUsers(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         approvalbutton();
         Thread.sleep(3000);
         firstleveluserselect();
         secondLevelUserSelect();
         approvalboxOKbtn();
         
	}
	
	
	public void VerifyDuplicateOptionForAdedVirtualConditions(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		targetConditionObjects.clickGraphicalTargetConditionButton();
		commonObjects.clickOptionsIcon();
		targetConditionObjects.clickDuplicateTargetConditionButton();
		targetConditionObjects.verifyDuplicatedTargetConditionCard();
		
	}
	
	
	public void VerifyGraphicalConditionsInTargetConditionsAreWorkingProperly(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		targetConditionObjects.clickGraphicalTargetConditionButton();
		targetConditionObjects.dragTargetCondition();
		
	}
	
	public void verifyTargetStatusOfBC() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//vaadin-grid-cell-content[contains(.,'Targeting')]")));
	
	}
	
	
	
	public void verifyNumberOfOffersWhileCreateCampaign(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		verifyNumberOfOffersWhileCreateCampaign();
	
	}
	
	
	
	
	public void createCampaignWithAddAndOption(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		verifyAddAndButton();
		clickAddAndButton();
		targetConditionObjects.clickBasicTargetConditionWithAge2();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
         Thread.sleep(2000);
	}
	
	
	
	
	
	
	public void createCampaignWithAddMultipleAndOption(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		verifyAddAndButton();
		clickAddAndButton();
		targetConditionObjects.clickBasicTargetConditionWithAge2();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
         Thread.sleep(2000);
	}
	
	
	
	
	
	
	public void editCampaign(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		clickProceedButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         
         clickSaveCampaignButton();
	}
	
	
	
	
	
	public void editCampaignForUseTemplate(String name,String catalog) throws InterruptedException {
		enterCampaignDeailsForUseTemplate(name,catalog);
		clickProceedButton();
		clickProceedButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         
         clickSaveCampaignButton();
	}
	
	
	
	
	
	
	public void editCampaignselsuer(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		clickProceedButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         
         //clickSaveCampaignButton();
	}
	
	public void editTargetConditionsForCampaign(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		verifyTargetConditionCard();
		clickOptionsIcon();
		Thread.sleep(3000);
		clickEditTargetCondtion();
		targetConditionObjects.clickBasicTargetConditionWithAgeEdit();
		targetConditionObjects.verifyAddedTargetCondition();
		Thread.sleep(3000);
		clickProceedButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}
	
	
	public void createCampaignUseTemplate(String name,String catalog) throws InterruptedException {
		enterCampaignDeails(name,catalog);
		clickProceedButton();
		clickProceedButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
   	 Thread.sleep(1000);
   	 Calendar rightNow =Calendar.getInstance();
   	 int hours = rightNow.get(Calendar.HOUR);
   	 int min = rightNow.get(Calendar.MINUTE);
   	 int am_pm = rightNow.get(Calendar.AM_PM);
   	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
   	 int year = rightNow.get(Calendar.YEAR);
   	 int month = rightNow.get(Calendar.MONTH)+1;
   	 min+=2;
   	 int rem = min%5;
   	 rem = 5-rem;
   	 min+=rem;
   	 if(min>59){
   		 min-=60;
   		 hours++;
   	 }
   	 Actions builder = new Actions(driver);
   	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
        builder.moveToElement(num).click().build().perform();
        Thread.sleep(2000);
   	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
        builder.moveToElement(num1).click().build().perform();
        if(am_pm==0)
       	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
        else
       	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
        clickSaveCampaignButton();
	}
	
	
/*	
	public void createCampaignTemplate(String name,String catalog) throws InterruptedException {
		enterTempalteDeails(name,catalog);
		clickProceedButton();
		targetConditionObjects.clickCreateTargetConditionButton();
//		targetConditionObjects.clickTargetConditionViewToggle();
		targetConditionObjects.clickBasicTargetConditionWithAge();
		clickProceedButton();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='router']/app-route[9]/campaign-form/wizard-tab/div/iron-pages/campaign-schedule/form/paper-card/paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]"))).click();
    	 Thread.sleep(1000);
    	 Calendar rightNow =Calendar.getInstance();
    	 int hours = rightNow.get(Calendar.HOUR);
    	 int min = rightNow.get(Calendar.MINUTE);
    	 int am_pm = rightNow.get(Calendar.AM_PM);
    	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
    	 int year = rightNow.get(Calendar.YEAR);
    	 int month = rightNow.get(Calendar.MONTH)+1;
    	 min+=2;
    	 int rem = min%5;
    	 rem = 5-rem;
    	 min+=rem;
    	 if(min>59){
    		 min-=60;
    		 hours++;
    	 }
    	 Actions builder = new Actions(driver);
    	 WebElement num = driver.findElement(By.xpath(".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["+(hours+1)+"]"));
         builder.moveToElement(num).click().build().perform();
         Thread.sleep(2000);
    	 WebElement num1 = driver.findElement(By.xpath(".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["+(min+1)+"]"));
         builder.moveToElement(num1).click().build().perform();
         if(am_pm==0)
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[1]"))).click();
         else
        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='heading']/iron-selector[2]/div[2]"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='timeDialog']/div/paper-button[2]"))).click();
         clickSaveCampaignButton();
	}  */
	
//	public void navigateToPrograms() throws InterruptedException {
//				eh.setExcelFile("productClassInputData",sheet);
//	Actions clickAction = new Actions(driver);
//    WebElement scrollablePane = driver.findElement(By.xpath("//iron-scroll-threshold"));
//    clickAction.moveToElement(scrollablePane).click().build().perform();
//    Actions scrollAction = new Actions(driver);
//    for(int i=0;i<50;i++){
//    scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
//    try{
//    	driver.findElement(By.xpath("//h4[contains(.,'"+eh.getCell(1, 0)+"')]"));
//    	break;
//    }
//    catch(Exception e){
//    }
//    Thread.sleep(1000);
//    }
//    Thread.sleep(2000);
//	jswait.loadClick(".//*[@id='prdClsScrollThreshold']/paper-card//h4[contains(.,'"+eh.getCell(1, 0)+"')]/../..//a");
//	}

   public void clickOnUseTemplateButton(String templateName) throws InterruptedException {
		
		jswait.loadClick(driver.findElement(By.xpath("//data-table-cell[contains(.,'"+templateName+"')]/..//paper-button[contains(.,\"Use Template\")]")));
	}

   public void clickOnTemplatesExportToLocationOption(String name) throws InterruptedException {
		WebElement edit = driver.findElement(By.xpath("//data-table-cell[contains(.,'"+name+"')]/..//data-table-cell//paper-menu-button"));
		jswait.loadClick(edit);
		Thread.sleep(4000);
		WebElement exportCampaignOption = driver.findElement(By.xpath("//data-table-cell[contains(.,'"+name+"')]/..//paper-item[2]"));
		jswait.loadClick(exportCampaignOption);
	}
   
   public void clickOnCampaignExportToLocationOption(String name) throws InterruptedException {
		WebElement edit = driver.findElement(By.xpath("//vaadin-grid-table-cell[contains(.,'"+name+"')]/../vaadin-grid-table-cell[7]"));
		jswait.loadClick(edit);
		Thread.sleep(4000);
		WebElement exportCampaignOption = driver.findElement(By.xpath("//paper-menu-button[@id='campaignsListMenu']//iron-dropdown[@id='dropdown']//paper-item[2]"));
		jswait.loadClick(exportCampaignOption);
	}
   public void verifyLocationNameInDropDown(String locationName) throws InterruptedException {
	   jswait.loadSendKeys(selectLocationToExport, locationName);
	   assertTrue(driver.findElement(By.xpath("//vaadin-combo-box-item[contains(.,'"+locationName+"')]")).isDisplayed());
   }
   
   
   
   
  public void verifyConvertedCustomersLabelAndCount() throws Exception {
		
		
	    
	    
		assertTrue(convertedCustomersLabel.isDisplayed());
		assertTrue(convertedCustomersCount.isDisplayed());
		
	}
  
  
  
  public void verifyImportButtonDisabled() throws Exception {
	  
		assertTrue(importOptionDisabled.isDisplayed());
		
		}
  
  
  public void verifySelectACategoryErrorMessage() throws Exception {
	  
		assertTrue(selectCampaignCategoryErrorMessage.isDisplayed());
		
		}
  
  public void verifyValidationErrorMessageForImport() throws Exception {
	  
	   int errorSize= selectImportPageErrorMessages.size();
	   Exception sizeExcep= new Exception("Size Exception");
	   
	   if(errorSize==2) {
		   
		   System.out.println(("Size is "+errorSize));
	   }
	   
	   else
		   throw sizeExcep;
		
		}
  
  
  
  public void verifyToastMessageAfterSuccessfulExportOfCampaign() throws InterruptedException {
		Thread.sleep(2000);
	  assertTrue(successfulExportMessage.isDisplayed());
		
		
	}
  
  
  public void verifyToastMessageAfterSuccessfulExportOfCampaignTemplate() throws InterruptedException {
		Thread.sleep(2000);
	  assertTrue(successfulExportMessageOfCampaignTemplate.isDisplayed());
		
		
	}
  
  public void verifyToastMessageAfterSuccessfulImportOfCampaign() throws InterruptedException {
		Thread.sleep(2000);
	  assertTrue(successfulImportMessage.isDisplayed());
		
		
	}

   
  
  public void verifyEditOptionForCampainTemplate() throws InterruptedException {
	  
	  
	  Thread.sleep(2000);
	  optionsIconForCampaignTemplate.click();
	  Thread.sleep(2000);
	  assertTrue(editOptionForCampaignTemplate.isDisplayed());
		
		
	}
  
  
  
public void clickExportLocationOptionForCampainTemplate() throws InterruptedException {
	  
	  
	  Thread.sleep(2000);
	  optionsIconForCampaignTemplate.click();
	  Thread.sleep(2000);
	  jswait.loadClick(optionsExportToLocation);
		
		
	}
  
  
public void checkImportStatusOfCampainTemplate() throws InterruptedException {
	  
	  
	assertTrue(importStatusForCampaignTemplate.isDisplayed());
		
		
	}
  
  
  
   
   

}
