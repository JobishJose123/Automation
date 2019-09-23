package pageObjetcs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import baseClasses.Init;

public class LegacyClass extends Init {
	

	static Logger log = Logger.getLogger(LegacyClass.class.getName());

//	 public static WebDriver driver;
	// PropHandler p=new PropHandler();
	public LegacyClass() {
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
	@FindBy(xpath = "//button[@type='button'][contains(.,'New Data Job')]")
	private WebElement newDataJob;

	public static void main(String[] args) throws Exception {
		LegacyClass lg = new LegacyClass();
		lg.legacytest200();
	}

	public void legacytest200() throws Exception {
		loginIntoLegacy();
		clickOnMobileMarketingDB();
		clickOnMobileMarketingDbRecurring();
		Thread.sleep(4000);
		clickOnNewDataJob();
		Thread.sleep(4000);
		createConversionJob();

	}

	public void legacyTest100() throws Exception {
		loginIntoLegacy();
		clickOnMobileMarketingDB();
		clickOnMobileMarketingDbRecurring();
		Thread.sleep(4000);
		UsageConversionJob();
		driver.close();

	}// test

	public void legacyTest() throws Exception {
		loginIntoLegacy();
		clickOnMobileMarketingDB();
		clickOnMobileMarketingDbRecurring();
		Thread.sleep(4000);
		searchForRecurringJob("Selenium_recharge_conversionJob_09_07_2019");
		driver.close();

	}

	public void UsageConversionJob() throws Exception {
		loginIntoLegacy();
		clickOnMobileMarketingDB();
		clickOnMobileMarketingDbRecurring();
		Thread.sleep(4000);
		searchForRecurringJob("AutoUsageMetricUpload");
		driver.close();

	}

	public void username() throws Exception {

		userName.sendKeys(p.getValue("username"));
	}

	public void loadwaitClick(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element)).click();

	}

	public void loadwaitSendKeys(WebElement element, String sendKeys) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(sendKeys);
	}

	public void loginIntoLegacy() throws Exception {
		p.setPropertyFile("config.properties");
		System.setProperty("webdriver.chrome.driver", "browser_files\\chromedriver2.37.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("enter the URL " + p.getValue("env"));
		driver.get("http://" + p.getValue("env") + ":8098");
		Thread.sleep(2000);
		System.out.println("enter the URL ");
		driver.get("http://" + p.getValue("env") + ":8098");
		Thread.sleep(5000);

//	userName.sendKeys(p.getValue("username"));

		driver.findElement(By.xpath("//li//input[@name='email']")).sendKeys(p.getValue("username"));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li//input[@name='password']")).sendKeys(p.getValue("password"));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li//input[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("Login into Legacy...");
	}

	public void loginNewTab() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open('http://" + p.getValue("env") + ":8098')");

	}

	public void clickOnMobileMarketingDB() throws Exception {
		Thread.sleep(5000);
		System.out.println("click on mobile marketing DB");
		driver.findElement(By.xpath("//div//span[contains(text(),'Mobile Marketing DB')]")).click();
		// mobileMarketingDb.click();
		System.out.println("click on mobile marketing DB");
	}

	public void clickOnInteractiveMarketing() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='ext-gen111'][contains(text(),'Interactive Marketing')]")).click();

	}

	public void clickOnAllParnersLive() throws Exception {
		Thread.sleep(5000);

		// loadwaitClick("//div[@id='INTRMKT']//li[@class='x-tree-node']//li[2]//ul[1]//li[2]//div[1]//a//span[contains(.,'Live')]");
	}

	public void clickOnNewInboundApplication() throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(.,'New Inbound Application')]")).click();

	}

	public void clickOnResponseApplication() {
		driver.findElement(By.xpath("//li[@class='x-menu-list-item ']//a//span[contains(.,'Response Application')]"))
				.click();
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

	public void searchForRecurringJob(String jobName) throws Exception {
		System.out.println(jobName);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-data_job_name']")))
				.build().perform();
		Thread.sleep(2000);
		action.click(driver.findElement(
				By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-data_job_name']//a[@class='x-grid3-hd-btn']")))
				.build().perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='x-menu-item-text'][contains(.,'Filters')]")))
				.build().perform();
		Thread.sleep(1000);
		action.sendKeys(driver.findElement(By.xpath("//div[@class='x-menu-item']//input[@type='text']")), jobName)
				.click().build().perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-data_job_name']"))).build()
				.perform();
		Thread.sleep(1000);
		action.doubleClick(
				driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]//em//button[contains(.,'Refresh Now')]")))
				.build().perform();
		Thread.sleep(2000);
		action.contextClick(driver.findElement(By.xpath("//table/tbody//tr//td//span[contains(.,'" + jobName + "')]")))
				.build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//div//ul//li//span[contains(.,'Activate')]"))).click()
				.build().perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]//em//button[contains(.,'Yes')]")))
				.click().build().perform();
		Thread.sleep(2000);
		action.click(driver
				.findElement(By.xpath("//table//tbody//tr[2]//td[2]//em//button[contains(.,'Auto refresh OFF')]")))
				.build().perform();
		Thread.sleep(2000);
		action.doubleClick(
				driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]//em//button[contains(.,'Refresh Now')]")))
				.build().perform();

		System.out.println("Waiting for 7 mins for job completion");
		Thread.sleep(180000);

		action.contextClick(driver.findElement(By.xpath("//table/tbody//tr//td//span[contains(.,'" + jobName + "')]")))
				.build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//div//ul//li//span[contains(.,'Deactivate')]"))).click()
				.build().perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]//em//button[contains(.,'Yes')]")))
				.click().build().perform();
		Thread.sleep(2000);

		System.out.println("Waiting for 4 mins for job completion");
		Thread.sleep(60000);
		System.out.println("Waiting for 1 mins for job completion");

	}

	public void createConversionJob() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a//span[contains(.,'Imports')]"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By.xpath("//div//ul//li[2]//span[contains(.,'Recurring Data Import Job')]"))).click()
				.build().perform();
	}

}// class