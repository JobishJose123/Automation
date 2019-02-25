package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.DashboardObjects;

public class DashboardSteps extends Init{
	
	JSWaiter jswait = new JSWaiter();
	Init Init =new Init();
	DashboardObjects dashboardObject = new DashboardObjects();
	public DashboardSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^navigate to dashboard$")
	public void navigate_to_dashboard() throws Throwable {
		dashboardObject.navigateToDashboard();
	    
	   
	}

	@Then("^click campaign Performance Monitor$")
	public void click_campaign_Performance_Monitor() throws Throwable {
	    dashboardObject.clickCampaignPerformanceMonitor();
	  
	}
	@Then("^verify the values displayed$")
	public void verify_the_values_displayed() throws Throwable {
	    dashboardObject.verifyTheValues();
	}
	
	@Then("^click monthly performance snapshot$")
	public void click_monthly_performance_snapshot() throws Throwable {
	    dashboardObject.clickMonthlyPerformanceSnapshot();
	}
	@Then("^click customer event spread$")
	public void click_customer_event_spread() throws Throwable {
		dashboardObject.clickCustomerEventSpread();
	}

	@Then("^verfiy values displayed in customer events spread$")
	public void verfiy_values_displayed_in_customer_events_spread() throws Throwable {
		dashboardObject.verifyValuesInCustomerEventSpread();
	}
	

@Then("^click digital experience monitor$")
public void click_digital_experience_monitor() throws Throwable {
	dashboardObject.clickDigitalExperienceMonitor();
}

@Then("^verfiy the values in the im dashboard$")
public void verfiy_the_values_in_the_im_dashboard() throws Throwable {
	dashboardObject.verifyIMDashboardValues();
}
@Then("^click touchpoint performane customer care$")
public void click_touchpoint_performane_customer_care() throws Throwable {
	dashboardObject.clickTouchpointCustomerCare();
}

@Then("^navigate to home page$")
public void navigate_to_home_page() throws Exception{
	dashboardObject.navigateToHomePage();
}



}