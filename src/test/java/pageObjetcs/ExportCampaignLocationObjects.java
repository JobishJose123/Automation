package pageObjetcs;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class ExportCampaignLocationObjects extends Init{
		JSWaiter jswait = new JSWaiter();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		public ExportCampaignLocationObjects() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//paper-button[contains(text(),'Add Export Location')]")
		private WebElement addExportLocationButton;
		
		@FindBy(xpath="//paper-dialog[@id='createNew']//label[contains(text(), 'Location Name')]/../input")
		private WebElement locationNameField;
		
		@FindBy(xpath="//paper-dialog[@id='createNew']//label[contains(text(), 'URL')]/../input")
		private WebElement uRLField;
		
		@FindBy(xpath="//paper-dialog[@id='createNew']//label[contains(text(), 'Password')]/../input")
		private WebElement passwordField;
		
		@FindBy(xpath="//paper-dialog[@id='createNew']//paper-button[contains(text(), 'Save')]")
		private WebElement saveButton;
		
		@FindBy(xpath="//*[@id='mainContainer']/paper-menu/div/hexagon-icon[2]/label")
		private WebElement systemAdministration;
		
		@FindBy(xpath="//div[contains(text(),'Export Campaign Location')]")
		private WebElement exportCampaignLocation;
		
		@FindBy(xpath="//paper-button[contains(@class,'yes')]")
		private WebElement yesButton;
		
		@FindBy(xpath="//paper-dialog[@id='createNew']//paper-button[contains(., 'Export')]")
		private WebElement exportButton;
		
		@FindBy(xpath="//paper-input-container[@id='inputContainer']//input")
		private WebElement exportLocation;
		
		@FindBy(xpath="//*[contains(@src,'/images/notification.svg')]/..")
		private WebElement notificationBell;
		
		@FindBy(xpath="//div[@id='contentWrapper']//div[contains(@class, 'messageStyle')]//div[contains(., 'View All')]")
		private WebElement viewAllNotifications;
		
		@FindBy(xpath="//form[@id='importCampaignForm']//vaadin-combo-box[@id='categoryDropdown']//input")
		private WebElement campaignToBeSelectedForExporting;
		
		@FindBy(xpath="//paper-dialog[@id = 'createNew']")
		private WebElement exportCampaignPanel;
		
		@FindBy(id ="importBtn")
		private WebElement importButton;
		
		@FindBy(xpath="//paper-input[@id = 'locationName']//input")
		private WebElement campaignNameChange;
		
		@FindBy(xpath="//div[@data-log = 'conditions']")
		private WebElement conditions;
		
		@FindBy(xpath="//paper-card[contains(@class, 'systemAdmin-sections') and contains(., 'Security')]")
		private WebElement securityGroupButton;
		
		@FindBy(xpath="//paper-dialog[@id='createNew']//paper-button[text()='Save']")
		private WebElement saveButtonInSecurityGroup;
		
		@FindBy(xpath="//paper-dialog[@id = 'listNotifications']//paper-button[contains(., 'OK')]")
		private WebElement notificationPanelOKButton;
		
		@FindBy(xpath="//span[contains(., 'Target Conditions')]")
		private WebElement targetTab;
		
		
		public void isTargetHasCampaignName(String campaignName)  throws InterruptedException {
			Assert.assertTrue(targetTab.getAttribute("title").contains(campaignName));
		}
		public void clickOnSecurityGroup()  throws InterruptedException {
			jswait.loadClick(securityGroupButton);
		}
		
		public void editSecurityGroup(String groupName)  throws InterruptedException {
			Thread.sleep(1500);
			jswait.loadClick(driver.findElement(By.xpath("//data-table-row//span[text() ='"+groupName+"']/../../..//data-table-cell[9]//paper-icon-button")));
			Thread.sleep(500);
			jswait.loadClick(driver.findElement(By.xpath("//div[@id = 'contentWrapper']//paper-item[1]")));
			Thread.sleep(1000);
		}
		
		public void expandOption(String optionName)  throws Throwable {
			Thread.sleep(4000);
			jswait.loadClick(driver.findElement(By.xpath("//paper-dialog[@id = 'createNew']//paper-dialog-scrollable//label[contains(., '"+optionName+"')]")));
		}
		
		public void selectOrDeselectOption(String optionName)  throws Throwable {
			String scrollPanel ="//paper-dialog-scrollable[contains(@class, 'create-security-group')]//div[@id = 'scrollable']";
			jswait.scrollIntoView(scrollPanel, optionName);
			jswait.loadClick(driver.findElement(By.xpath("//div[@id = 'checkboxLabel' and contains(.,'"+optionName+"')]/../div[@id = 'checkboxContainer']")));
		}
		
		public void clickSaveInSecurityGroup()  throws InterruptedException {
			jswait.loadClick(saveButtonInSecurityGroup);
			Thread.sleep(1000);
		}
		
		public void verifyCampaignNotification(String isDisplayed, String campaignName) throws Exception {
			String scrollPanel = "//iron-list[@id='list']";
			boolean elementNotFound = false;
			try {
				jswait.scrollIntoView(scrollPanel, campaignName);
				WebElement element = driver.findElement(By.xpath("//p[contains(@class, 'notification-listing') and contains(.,'"+campaignName+"')]"));
				if (isDisplayed == "true") {
					Assert.assertTrue(element.isDisplayed());
				}
			} 
			catch (Exception e){
				
					elementNotFound = true;
			}
			if(isDisplayed == "false") {
				Assert.assertTrue(elementNotFound);	
			}
			jswait.loadClick(notificationPanelOKButton);
		}

		
		public void clickAddExportLocationButton() throws InterruptedException{
			jswait.loadClick(addExportLocationButton);
		}
		
		public void clickExportLocation() throws InterruptedException{
			jswait.loadClick(exportCampaignLocation);
		}
		
		public void enterLocation(String location) throws InterruptedException{
			jswait.loadSendKeys(locationNameField, location);
		}
		
		public void enterURL(String url) throws InterruptedException{
			jswait.loadSendKeys(uRLField, url);
		}
		
		public void enterPassword(String password) throws InterruptedException{
			jswait.loadSendKeys(passwordField, password);
		}
		
		public void clickSaveButton() throws InterruptedException{
			jswait.loadClick(saveButton);
		}
		
		public void clickSystemAdministration() throws InterruptedException{
			jswait.loadClick(systemAdministration);
		}
		
		public void verifyExportLocation(String action, String locationName) throws Exception{
			Thread.sleep(4000);
			
			WebElement locationNameElement = driver.findElement(By.xpath("//data-table-cell[contains(.,"+locationName+")]"));
			if (action == "edit" || action == "added") 
			{
				Assert.assertTrue(locationNameElement.isDisplayed());
			}
			else if (action == "delete")
			{
				Assert.assertNull(locationNameElement);
			}
		}
		
		public void clickEditExportDetails(String locationName) throws InterruptedException{
			Thread.sleep(4000);
			WebElement editLocation = driver.findElement(By.xpath("//data-table-cell[contains(.,'"+locationName+"')]/..//div[contains(@class,'edit')]/paper-item[1]/iron-icon"));
			jswait.loadClick(editLocation);
		}
		
		public void deleteExportDetails(String locationName) throws InterruptedException{
			WebElement deleteLocation = driver.findElement(By.xpath("//data-table-cell[contains(.,'"+locationName+"')]/..//div[contains(@class,'edit')]/paper-item[2]/iron-icon"));
			jswait.loadClick(deleteLocation);
			jswait.loadClick(yesButton);
		}
		
		public void clickExportButton() throws InterruptedException{
			jswait.loadClick(exportButton);
		}
		
		public void selectCampaignTemplateForExporting(String campaignName) throws InterruptedException {
			jswait.loadSendKeys(exportLocation, campaignName);
			jswait.loadClick(
					"//vaadin-combo-box[@id='locationDropdown']//following::vaadin-combo-box-item[contains(.,'" + campaignName + "')]");
		}
		
		public void clickNotificationBar()  throws InterruptedException {
			Thread.sleep(2000);
			jswait.loadClick(notificationBell);
		}
		
		public void clickViewAllNotifications()  throws InterruptedException {
			jswait.loadClick(viewAllNotifications);
		}
		
		public void clickOnProceedOnNotification(String notificationContent)  throws Exception {
			String scrollPanel = "//iron-list[@id='list']";
			jswait.scrollIntoView(scrollPanel, notificationContent); 
			WebElement element = driver.findElement(By.xpath("//p[contains(@class, 'notification-listing') and contains(.,'"+notificationContent+"')]/../../../../data-table-cell//paper-button[contains(@class, 'reviewBtn')][1]"));
			jswait.loadClick(element);
		}
		
		public void clickOnReviewOnNotification(String notificationContent)  throws Exception {
			Thread.sleep(1000);
			String scrollPanel = "//iron-list[@id='list']";
			jswait.scrollIntoView(scrollPanel, notificationContent); 
			Thread.sleep(1000);
			WebElement element = driver.findElement(By.xpath("//span[contains(@class, 'notification-listing') and contains(.,'"+notificationContent+"')]/../../data-table-cell//paper-button[contains(@class, 'reviewBtn')][1]"));
			jswait.loadClick(element);
		}
		public void verifyReviewOnNotification(String notificationContent)  throws Exception {
			String scrollPanel = "//iron-list[@id='list']";
			jswait.scrollIntoView(scrollPanel, notificationContent); 
			WebElement element = driver.findElement(By.xpath("//span[contains(@class, 'notification-listing') and contains(.,'"+notificationContent+"')]/../../data-table-cell//paper-button[contains(@class, 'reviewBtn')][1]"));
			Assert.assertTrue(element.isDisplayed());
		}
		
		public void selectCampaignToWhereExported(String campaignToBeSelected)  throws InterruptedException {
			jswait.loadSendKeys(campaignToBeSelectedForExporting,campaignToBeSelected);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+campaignToBeSelected+"')]");
		}
		
		public void isExportCampaignTemplatePanelDisplayed() {
			Assert.assertTrue(exportCampaignPanel.isDisplayed());
		}
		
		public void clickOnImport()  throws InterruptedException {
			jswait.loadClick(importButton);
		}
		
		public void changeCampaignName(String location)  throws InterruptedException {
			jswait.loadSendKeys(campaignNameChange, location);
		}
		
		public void verifyTemplateTabContainsExportedTemplate(String templateName) throws InterruptedException {
			Assert.assertTrue(driver.findElement(By.xpath("//data-table-cell[contains(.,'"+templateName+"')]")).isDisplayed());
		}
		
		
		public void isConditionsDisplayedInImportedCampaign() throws InterruptedException {
			Thread.sleep(1000);
			Assert.assertTrue(conditions.isDisplayed());			
			Assert.assertTrue(conditions.getText().contains("Customer Profile Info"));
		}
}
