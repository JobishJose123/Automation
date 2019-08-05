package pageObjetcs;

import org.apache.bcel.generic.LoadClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class LegacyClass extends Init {
	
	JSWaiter jswait=new JSWaiter();
	public LegacyClass(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li//input[@name='email']")
	private WebElement userName;
	@FindBy(xpath = "//li//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//li//input[@type='submit']")
	private WebElement login;
	@FindBy(xpath = "//div[@id='ext-gen112']//span[contains(text(),'Mobile Marketing DB')]")
	private WebElement mobileMarketingDb;
	@FindBy(xpath = "//span[@id='ext-gen111'][contains(text(),'Interactive Marketing')]")
	private WebElement interactiveMarketing;
	@FindBy(xpath = "//div[@id='INTRMKT']//li[@class='x-tree-node']//li[2]//ul[1]//li[2]//div[1]//a//span[contains(.,'Live')]")
	private WebElement allPartnersLive;
	@FindBy(xpath = "//button[contains(.,'New Inbound Application')]")
	private WebElement newInboundApplication;
	@FindBy(xpath = "//li[@class='x-menu-list-item ']//a//span[contains(.,'Response Application')]")
	private WebElement liveResponseApplications;
	@FindBy(xpath = "//li[2]//a//span[contains(.,'Recurring')]")
	private WebElement mobileMarketingDbRecurring;
	@FindBy(xpath="//button[@type='button'][contains(.,'New Data Job')]")
	private WebElement newDataJob;

@Test
public void legacyTest() throws Exception {
	loginIntoLegacy();
	clickOnMobileMarketingDB();
	clickOnMobileMarketingDbRecurring();
	Thread.sleep(4000);
	clickOnNewDataJob();
	
//	clickOnInteractiveMarketing();
//	clickOnAllParnersLive();
//	clickOnNewInboundApplication();
//	clickOnResponseApplication();
	
}//test


public void loadwaitClick(String s1) {
	
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s1))).click();
}
public void loadwaitSendKeys(String s1, String keysToSend) {
	
	WebDriverWait wait= new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s1))).sendKeys(keysToSend);;
}
public void loginIntoLegacy() throws Exception {
	System.setProperty("webdriver.chrome.driver", "browser_files\\chromedriver2.37.exe");
	driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.14.23:8098");
	Thread.sleep(2000);
	driver.get("http://192.168.14.23:8098");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li//input[@name='email']")).sendKeys("flyops@flytxt.com");
	driver.findElement(By.xpath("//li//input[@name='password']")).sendKeys("flytxt");
	driver.findElement(By.xpath("//li//input[@type='submit']")).click();
	Thread.sleep(5000);
	System.out.println("Login into Legacy...");
}


public void clickOnMobileMarketingDB() throws Exception {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='ext-gen112']//span[contains(text(),'Mobile Marketing DB')]")).click();
	//mobileMarketingDb.click();
	System.out.println("click on mobile marketing DB");
}

public void clickOnInteractiveMarketing() throws Exception {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@id='ext-gen111'][contains(text(),'Interactive Marketing')]")).click();
	
}

public void clickOnAllParnersLive() throws Exception {
	Thread.sleep(5000);
	
	loadwaitClick("//div[@id='INTRMKT']//li[@class='x-tree-node']//li[2]//ul[1]//li[2]//div[1]//a//span[contains(.,'Live')]");
}

public void clickOnNewInboundApplication() throws Exception {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(.,'New Inbound Application')]")).click();
	
}
public void clickOnResponseApplication() {
	driver.findElement(By.xpath("//li[@class='x-menu-list-item ']//a//span[contains(.,'Response Application')]")).click();
}

public void clickOnMobileMarketingDbRecurring() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//li[2]//a//span[contains(text(),'Recurring')]")).click();
	// //ul[@id='ext-gen115']//span[contains(text(),'Recurring')]
	System.out.println("Clicked on Mobile Marketing db Recurring link..");
}

public void clickOnNewDataJob() {
	driver.findElement(By.xpath("//button[@type='button'][contains(.,'New Data Job')]")).click();
	System.out.println("Clicked on New Data Job..");
}


}//class