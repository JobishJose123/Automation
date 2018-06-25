package pageObjetcs;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;

public class ExportCampaignLocationObjects extends Init{
		JSWaiter jswait = new JSWaiter();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		public ExportCampaignLocationObjects() {
			PageFactory.initElements(driver, this);
		}
		
		private String locationName = "test";
		
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
		
		@FindBy(xpath="//data-table-cell[contains(.,locationName)]")
		private WebElement addedLocation;
		
		public void clickAddExportLocationButton() throws InterruptedException{
			jswait.loadClick(addExportLocationButton);
		}
		
		public void clickExportLocation() throws InterruptedException{
			jswait.loadClick(exportCampaignLocation);
		}
		
		public void enterLocation() throws InterruptedException{
			locationName = RandomNameGenerator.getRandomName(locationName);
			jswait.loadSendKeys(locationNameField, locationName);
		}
		
		public void enterURL() throws InterruptedException{
			jswait.loadSendKeys(uRLField, "root@192.168.150.141:22/usr/local/flytxt/campaign");
		}
		
		public void enterPassword() throws InterruptedException{
			jswait.loadSendKeys(passwordField, "test123");
		}
		
		public void clickSaveButton() throws InterruptedException{
			jswait.loadClick(saveButton);
		}
		
		public void clickSystemAdministration() throws InterruptedException{
			jswait.loadClick(systemAdministration);
		}
		
		public void verifyAddedExportLocation() throws InterruptedException{
			Assert.assertTrue(addedLocation.isDisplayed());
		}
}
