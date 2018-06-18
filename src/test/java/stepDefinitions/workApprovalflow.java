package stepDefinitions;

import java.util.Calendar;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.WorkApprovalObjects;

public class workApprovalflow extends Init{
	final String BASE_LIST = "l";
	
	JSWaiter jswait = new JSWaiter();
	
	
	public ExcelHelper eM = new ExcelHelper();
	public ExcelHelper eh = new ExcelHelper();
	CampaignObjects campaignObjects = new CampaignObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	LoginPageObjects loginPage = new LoginPageObjects();
	CommonObjects commonObjects = new CommonObjects();
	WorkApprovalObjects approvalPageObjects = new WorkApprovalObjects();
	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	public workApprovalflow() {
		PageFactory.initElements(driver, this);
	}
	

	@Then("^navigate to configuration$")
	public void navigateToAnalytics() throws InterruptedException {
		approvalPageObjects.navigateToConfiguration();
		Thread.sleep(3000);
	}
		
    @Then("^click approval rules option$")
	public void clickApprovalRulesOption() throws InterruptedException {
    	
	 approvalPageObjects.clickApprovalRulesOption();
	 Thread.sleep(3000);
	}
    
    @Then("^create new approval rule from sheet \"([^\"]*)\"$")
	public void createNewApprovalRule(String sheet) throws Throwable {
    	
    	approvalPageObjects.createNewApprovalRule(sheet);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
