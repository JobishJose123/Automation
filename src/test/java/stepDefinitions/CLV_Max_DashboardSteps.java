package stepDefinitions;
import java.util.List;
import java.util.Random;

import org.eclipse.jetty.websocket.common.events.annotated.OptionalSessionCallableMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.AdminPageObjects;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.ProductClassesPageObjects;
import pageObjetcs.ProductPage;

public class CLV_Max_DashboardSteps extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	CommonObjects commonObjects = new CommonObjects();
	OfferPageObjects offerPageObjects= new OfferPageObjects();
	ProductPage productPageObjects= new ProductPage();
	AdminPageObjects adminPageObjects= new AdminPageObjects();
	BroadcastPageObjects bcObjects= new BroadcastPageObjects();
	ProductClassesPageObjects productClassesPageObjects = new ProductClassesPageObjects();
	public CLV_Max_DashboardSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^edit partner name from sheet \"([^\"]*)\" and click cancel button$")
	public void editPartnerName(String sheet) throws Exception {
		eh.setExcelFile("partnerInputData",sheet);
		Random rn = new Random();
		int  n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name =  name.replaceAll("[0-9]", "")+n;
		eh.setCell(1, 0, name);
		adminPageObjects.editPartnerName(name);
		commonObjects.clickFilterIcon();
		commonObjects.clickFilterResetButton();	
		commonObjects.filterName(name);
		Thread.sleep(3000);
		
		try
		{
		if(driver.findElement(By.xpath("//data-table-cell [contains(.,'"+eh.getCell(1, 0)+"')]"))!=null)
    	{
    		System.out.println("Partner is displayed. Not expected");
    		
    	}
    	
    }
    catch(Exception e){
    	
    	System.out.println("Partner is not displayed");
    	
    }
	
		}
	@Then("^navigate to dashboard settings page$")
	public void clickDashboardSettings() throws Exception {
		
		Thread.sleep(3000);
		adminPageObjects.clickDashboardSettingsOption();
		
	}
	@Then("^navigate to configuration page$")
	public void navigateToConfigurationPage() throws Exception {
		  
		adminPageObjects.clickConfiguireOptionsIcon();
		adminPageObjects.clickConfigureOption();
		
		}
	@Then("^check cancel and save button$")
	public void check_cancel_and_save_button() throws Throwable {
	    
		adminPageObjects.checkCancelSaveButton();


	}
	@Then("^check option on each dashboard$")
	public void checkEachDashboard() throws Throwable {
		adminPageObjects.checkEachDashboard();
	
	}
	@Then("^navigate to dashboard page of precision marketer$")
    public void click_Dashboard_Option_Precision_Marketer() throws Exception {
		
		Thread.sleep(2000);
		adminPageObjects.clickDashboardOption();
		
	}
	
	@Then("^navigate to campaign performance monitor screen$")
    public void clickCampaignPerformanceMonitorOption() throws Exception {
		Thread.sleep(2000);
		adminPageObjects.clickCampaignPerformanceMonitor();
		
	}
	@Then("^click on help icon$")
    public void clickHelpIcon() throws Exception {
		Thread.sleep(2000);
		adminPageObjects.clickHelpIcon();	
	}

	@Then("^verify help panel$")
    public void verifyHelpPanel() throws Exception {
		Thread.sleep(2000);
		adminPageObjects.verifyHelpPanel();	
	}
	
}
