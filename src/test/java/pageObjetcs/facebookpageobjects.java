package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
public class facebookpageobjects extends Init{

	private static final Exception Exception = null;
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public facebookpageobjects() {
		PageFactory.initElements(driver, this);
	}
	
//===========================================================================================================================================================================//
//                                                                          PROGRAM PAGE ELEMENTS
//===========================================================================================================================================================================//	
	
	@FindBy(xpath=".//paper-card[contains(.,'Facebook')]")
	private WebElement Facebook;
	
	@FindBy(xpath=".//paper-button[contains(.,'Add Facebook Account')]")
	private WebElement addFacebookaccount;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickfacebookOption() throws InterruptedException {
		jswait.loadClick(Facebook);
	}
	
	public void addFacebookaccount() throws InterruptedException {
		jswait.loadClick(addFacebookaccount);
	}
	
	
}
