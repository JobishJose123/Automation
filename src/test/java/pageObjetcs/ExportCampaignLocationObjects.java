package pageObjetcs;

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
		
		@FindBy(id="notifyNumber")
		private WebElement notificationBell;
		
		@FindBy(xpath="//div[@id='contentWrapper']//div[contains(@class, 'messageStyle')]//div[contains(., 'View All')]")
		private WebElement viewAllNotifications;
		
		@FindBy(xpath="//form[@id='importCampaignForm']//vaadin-combo-box[@id='categoryDropdown']//input]")
		private WebElement campaignToBeSelectedForExporting;
		
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
		
		public void selectCampaignToWhereExported(String campaignToBeSelected)  throws InterruptedException {
			jswait.loadSendKeys(campaignToBeSelectedForExporting,campaignToBeSelected);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+campaignToBeSelectedForExporting+"')]");
		}
}
