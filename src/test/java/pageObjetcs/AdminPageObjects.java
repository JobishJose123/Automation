package pageObjetcs;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class AdminPageObjects extends Init{
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public AdminPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(text(),'Partners')]")
	private WebElement partnerOption;
	@FindBy(xpath="//paper-item[contains(.,'Edit')]")
	private WebElement optionsEdit;
	@FindBy(xpath="//paper-item[contains(.,'Dashboard Settings')]")
	private WebElement dashboardSettings;
	@FindBy(xpath="//data-table-cell[contains(.,'Status')]")
	private WebElement statusTitle;
	
	@FindBy(xpath=".//label[text()='Partner Name']/..//input")
	private WebElement partnerNameField;
	@FindBy(xpath=".//manage-partner-settings//paper-button[text()='Cancel']")
	private WebElement cancelButton;
	
	
	
	public void clickPartnerOption() throws InterruptedException{
		jswait.loadClick(partnerOption);
	}
	public void clickEditOption() throws InterruptedException{
		jswait.loadClick(optionsEdit);
	}
	
	public void clickDashboardSettingsOption() throws InterruptedException{
		jswait.loadClick(dashboardSettings);
		Thread.sleep(2000);
	}
	
	public void checkStatusTitle() throws InterruptedException{
		if(statusTitle.isDisplayed())
		{
			System.out.println("Satus title is displayed.");
    		
	}
		
	}
	
   public void editPartnerTitle(String name) throws InterruptedException {
		
		jswait.loadSendKeys(partnerNameField, name);
	}
   
   public void clickCancelButton() throws InterruptedException {
		
	   jswait.loadClick(cancelButton);
	}
  
	public void editPartnerName(String name) throws InterruptedException {
		editPartnerTitle(name);
		Thread.sleep(3000);
		clickCancelButton();
	}
	

}
