package stepDefinitions;
import java.util.Calendar;
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
		commonObjects.filterPartner(name);
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
	
	@Then("^navigate to control group settings page$")
	public void clickCGSettings() throws Exception {
		
		Thread.sleep(3000);
		adminPageObjects.clickCGSettingsOption();
		
	}
	
	@Then("^navigate to broadcast settings page$")
	public void clickBroadcastSettingsOption() throws Exception {
		
		Thread.sleep(3000);
		adminPageObjects.clickBroadcastSettingsOption();
		
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
	
	
	@Then("^edit a partner$")
    public void verifyTargetedCount() throws Throwable
    { 
		
		adminPageObjects.editPartner();
    
    }
	
	
	@Then("^change partner control group settings$")
    public void changePartnerControlGroupSettings() throws Throwable
    { 
		
		
		Calendar rightNow =Calendar.getInstance();
    	String mn = "";
    	if(rightNow.get(Calendar.MONTH)+1<9) {
    		mn = "0"+Integer.toString(rightNow.get(Calendar.MONTH)+1);
    	}
    	else 
    		mn = Integer.toString(rightNow.get(Calendar.MONTH)+1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR))+"-"+mn+"-"+String.format("%02d",rightNow.get(Calendar.DAY_OF_MONTH));
//    	int hours = rightNow.get(Calendar.HOUR);
//      	 int min = rightNow.get(Calendar.MINUTE);
//      	 int am_pm = rightNow.get(Calendar.AM_PM);
//      	 //int day = rightNow.get(Calendar.DAY_OF_MONTH);
//      	 int year = rightNow.get(Calendar.YEAR);
//      	 int month = rightNow.get(Calendar.MONTH)+1;
//      	 min+=2;
//      	 int rem = min%5;
//      	 rem = 5-rem;
//      	 min+=rem;
//      	 if(min>59){
//      		 min-=60;
//      		 hours++;
//      		 
//      	 }
      	
      		 
      	 
		
		adminPageObjects.changePartnerControlGroupSettings();
		
		Thread.sleep(1000);
		 jswait.loadClick("//label[@class='leftstylectrl start-time style-scope control-group-settings']//following::input[1]");
		Thread.sleep(1000);
//		int day = rightNow.get(Calendar.DAY_OF_MONTH);
//		day++;
		 jswait.loadClick("(//div[@date='"+date+"'])[3]");
		 
		Thread.sleep(1000);
		 jswait.loadClick("(.//paper-button[contains(.,'OK')])[5]");
		Thread.sleep(1000);
//		 jswait.loadClick(".//paper-date-time-input[1]//paper-input[2]//input");
		adminPageObjects.CGSave();
    }
	
}
