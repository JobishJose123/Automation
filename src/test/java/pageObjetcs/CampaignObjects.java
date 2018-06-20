package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class CampaignObjects extends Init{
	public CampaignObjects() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	public TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	
	@FindBy(xpath=".//*[@id='mainContainer']/paper-menu/div/hexagon-icon[3]/label/..")
	private WebElement lifeCycleMarketing;
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
	@FindBy(xpath="//label[contains(.,'Name')]/../input")
	private WebElement campaignTemplateName;
	@FindBy(xpath=".//*[@id='textarea']")
	private WebElement campaignDescription;
	@FindBy(xpath=".//campaign-details//label[contains(.,'Offer Catalog')]/../input")
	private WebElement offerCatalogSelector;
	@FindBy(xpath="//paper-button[contains(.,'Proceed')]")
	private WebElement proceedButton;

	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Save Campaign')]")
	private WebElement saveCampaignButton;
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Save')][3]")
	private WebElement saveCampaignTemplateButton;
	@FindBy(xpath="//div[contains(text(),'Campaign Categories')]/../..")
	private WebElement campaignCategoriesButton;
	@FindBy(xpath="//paper-button[contains(text(),'Create New Campaign Category')]")
	private WebElement createNewCampaignCategoryButton;
	@FindBy(xpath=".//*[@id='createNew']//label[contains(.,'Name')]/../input")
	private WebElement categoryNameInput;
	@FindBy(xpath=".//*[@id='createNew']//paper-button[contains(.,'Save')]")
	private WebElement campaignCategorySave;
	@FindBy(xpath="//paper-tab/div[contains(.,'Campaign Templates')]/..")
	private WebElement campaignTemplatesTab;
	@FindBy(xpath="//paper-button[contains(.,'Create Campaign template')]")
	private WebElement createCampaignTemplateButton;
	@FindBy(xpath=".//span[contains(.,'Oops! This name already exists. Try another name for the new Campaign.')]")
	private WebElement DuplicateCampaignNameToast;
	@FindBy(xpath = ".//div[@id='trigger']//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsIcon;
	
	@FindBy(xpath = ".//paper-icon-button[@icon='create']")
	private WebElement optionsEdit;
	@FindBy(xpath = ".//label[contains(.,'Name')]/../input")
	private WebElement campaignTemplateNameInput;
	@FindBy(xpath = ".//paper-button[contains(.,'Use Template')]")
	private WebElement useTemplateButton;
	
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
//	@FindBy(xpath="")
//	private WebElement ;


	public void clickOptionsViewBroadcasts() throws InterruptedException {
		jswait.loadClick(optionsViewBroadcasts);
	}
	public void clickSaveCampaignTemplate() throws InterruptedException {
		jswait.loadClick(saveCampaignTemplateButton);
	}
	public void clickCampaignTemplateTab() throws InterruptedException {
		jswait.loadClick(campaignTemplatesTab);
		
	}
	public void clickCreateCampaignTemplateButton() throws InterruptedException {
		jswait.loadClick(createCampaignTemplateButton);
	}
	public void clickCreateCategorySaveButton() throws InterruptedException {
		jswait.loadClick(campaignCategorySave);
	}
	public void enterCategoryName(String name) throws InterruptedException {
		jswait.loadSendKeys(categoryNameInput, name);
	}
	
	public void editCaampaignTemplateDetails(String name) throws InterruptedException {
		jswait.loadSendKeys(campaignTemplateNameInput, name);
		enterCampaignDescription("Desc for Template edited");
		clickProceedButton();
		clickSaveCampaignTemplate();
	}
	public void createNewCampaignCategory(String name) throws InterruptedException {
		clickCreateNewCampaignCategoryButton();
		enterCategoryName(name);
		clickCreateCategorySaveButton();
	}
	public void clickCreateNewCampaignCategoryButton() throws InterruptedException {
		jswait.loadClick(createNewCampaignCategoryButton);
	}
	public void navigateToCampaignCategories() throws InterruptedException {
		jswait.loadClick(campaignCategoriesButton);
	}
	public void clickSaveCampaignButton() throws InterruptedException {
		jswait.loadClick(saveCampaignButton);
	}
	
	public void verifyDuplicateCampaignNameToast() throws InterruptedException {
		assertTrue(DuplicateCampaignNameToast.isDisplayed());
	}
	
	public void clickProceedButton() throws InterruptedException {
		jswait.loadClick(proceedButton);
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
	public void enterCampaignName(String name) throws InterruptedException {
		jswait.loadSendKeys(campaignName, name);
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
	public void navigateToLIfeCycleMarketing() throws InterruptedException {
		jswait.loadClick(lifeCycleMarketing);
	}
	
	public void clickOnUseTemplateButton() throws InterruptedException {
		jswait.loadClick(useTemplateButton);
	}
	public void enterCampaignDeails(String name,String catalog) throws InterruptedException {
		selectTypeInformational();
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc craetion in selenium");
		selectOfferCatalog(catalog);
	}
	
	public void enterTemplateDeails(String name) throws InterruptedException {
		selectTypeInformational();
		enterCampaignName(name);
		enterCampaignDescription("Campaign to check bc craetion in selenium");
		
	}
	public void scrollToCampaignCategory(String name) throws Exception {
		jswait.scrollAndClick("//campaign-category-chart", "//div[text()='"+name+"']");
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
	
	public void VerifyTemplateCreated(String name) throws InterruptedException {
		assertTrue(driver.findElement(By.xpath(".//data-table-cell[contains(.,'"+name+"')]")).isDisplayed());
		Thread.sleep(2000);
	
	}
	
	public void VerifyCampaignCreated(String name) throws InterruptedException {
		assertTrue(driver.findElement(By.xpath(".//vaadin-grid-cell-content[contains(.,'"+name+"')]")).isDisplayed());
		Thread.sleep(2000);
	
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

}
