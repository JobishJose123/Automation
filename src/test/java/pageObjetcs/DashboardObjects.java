package pageObjetcs;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class DashboardObjects extends Init{
	
	JSWaiter jswait = new JSWaiter();
	Init Init =new Init();
	public DashboardObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[contains(text(),'Dashboards')]")
	private WebElement Dashboard;
	
	@FindBy(xpath="//div[contains(.,'Campaign Performance Monitor')][@id='pointerDiv']")
	private WebElement CampaignPerformanceMonitor;
	
	@FindBy(xpath="//div[contains(.,'Monthly Performance Snapshot')][@id='pointerDiv']")
	private WebElement MonthlyPerformanceSnapshot;
	
	@FindBy(xpath="//div[contains(.,'Customer Events Spread')][@id='pointerDiv']")
	private WebElement CustomerEventSpread ;
	
	@FindBy(xpath="//div[contains(.,'Digital Experience Monitor')][@id='pointerDiv']")
	private WebElement DigitalExperienceMonitor;
	
	@FindBy(xpath="//div[contains(.,'Touchpoint Performance - Customer Care')][@id='pointerDiv']")
	private WebElement TouchpointCustomerCare ;
	
	@FindBy(xpath="(//iron-icon[@id='icon']//following::img[@draggable='false'])[2]")
	private WebElement homePage;
//	
	@FindBy(xpath="(//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down'])[2]")
	private WebElement dropDownIcon; 
	@FindBy(xpath="(//paper-item[@id='filterItem'])[3]")
	private WebElement selectMonth;
//	
//	@FindBy(xpath="")
//	private WebElement 
//	
//	@FindBy(xpath="")
//	private WebElement 
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void navigateToDashboard() throws Exception{
		jswait.loadClick(Dashboard);
	}
   public void clickCampaignPerformanceMonitor() throws Exception{
	   jswait.loadClick(CampaignPerformanceMonitor);
	   Thread.sleep(2000);
	   jswait.loadClick(dropDownIcon);
	   Thread.sleep(2000);
	   jswait.loadClick(selectMonth);
	   
   }
   public void verifyTheValues() throws Exception{
	  Thread.sleep(2000);
	for(int i=1;i<=6;i++) {
	   String dashboardValue = driver.findElement(By.xpath("(//div[@class='number-cover style-scope canvas-report-view dc-chart'])["+i+"]")).getText();
	   Thread.sleep(2000);
	  
	   System.out.println(i);
	System.out.println("dashboard value : "+dashboardValue);
	     if(dashboardValue.contentEquals("0")) {
	    	 Assert.assertTrue(false, "no value displayed");   
	    	 Thread.sleep(3000);
	}
	}
	}
	 
   public void clickMonthlyPerformanceSnapshot() throws Exception{
	   jswait.loadClick(MonthlyPerformanceSnapshot);
	   Thread.sleep(2000);
	   jswait.loadClick(dropDownIcon);
	   Thread.sleep(2000);
	   jswait.loadClick(selectMonth);
   }
   
   public void clickCustomerEventSpread() throws Exception{
	   jswait.loadClick(CustomerEventSpread);
	   Thread.sleep(2000);
	   jswait.loadClick(dropDownIcon);
	   Thread.sleep(2000);
 jswait.loadClick(selectMonth);
	   
   }
   public void verifyValuesInCustomerEventSpread() throws Exception{
	   for(int i=1;i<=2;i++) {
		   Thread.sleep(2000);
		   String dashboardValue = driver.findElement(By.xpath("(//div[@class='number-cover style-scope canvas-report-view dc-chart'])["+i+"]")).getText();
		   Thread.sleep(2000);
		   System.out.println(dashboardValue);
		   System.out.println(i);
		System.out.println("dashboard value :"+dashboardValue);
		     if(dashboardValue.contentEquals("0")) {
		    	 Assert.assertTrue(false, "no value displayed");   
		    	 Thread.sleep(3000);
   }
   }
   }
	   public void clickDigitalExperienceMonitor() throws Exception{
		   Thread.sleep(2000);
		   jswait.loadClick(DigitalExperienceMonitor);
		   Thread.sleep(2000);
		   jswait.loadClick(dropDownIcon);
		   Thread.sleep(2000);
// jswait.loadClick(selectMonth);
	   }
	  
	   public void verifyIMDashboardValues() throws Exception{
		 for(int i=1;i<=8;i++) {
			 Thread.sleep(2000);
			   String dashboardValue = driver.findElement(By.xpath("(//div[@class='number-cover style-scope canvas-report-view dc-chart'])["+i+"]")).getText();
			   Thread.sleep(2000);
			   System.out.println(i);
			System.out.println("dashboard value :"+dashboardValue);
			     if(dashboardValue.contentEquals("0")) {
			    	 Assert.assertTrue(false, "no value displayed");   
			    	 Thread.sleep(3000);
	   }
	   }
	   }
	 
	 public void clickTouchpointCustomerCare() throws Exception{
		 jswait.loadClick(TouchpointCustomerCare);
		 Thread.sleep(2000);
		 jswait.loadClick(dropDownIcon);
		   jswait.loadClick(selectMonth);
	 }
	 public void navigateToHomePage() throws Exception{
		 jswait.loadClick(homePage);
	 }
	 
	 
   
  
}