
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LandingPageObjects;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.RegistrationListPage;
import stepDefinitions.LoginPageSteps;

public class CommonSteps extends Init {
	JSWaiter jswait = new JSWaiter();
	LoginPageObjects loginPage = new LoginPageObjects();
	LandingPageObjects landingPage = new LandingPageObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CommonObjects commonObjetcs = new CommonObjects();
	RegistrationListPage registrationListPage = new RegistrationListPage();
	ExcelHelper excelHelper = new ExcelHelper();
	LoginPageObjects loginpageobjects=new LoginPageObjects();
	public CommonSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='mainContainer']/paper-menu/div/hexagon-icon[4]/label")
	private WebElement offerManagement;
	@FindBy(xpath="//label[text()='Reports']/..")
	private WebElement reports;
	@FindBy(xpath="//*[@id='sym1']")
	private WebElement products;
	
	@FindBy(xpath="//*[@id='loginButton']")
    private WebElement loginButton;
	@Given("^login$")
    public void loginuser() throws Exception {

		 driver.get("http://"+p.getValue("env"));
		 loginPage.login(p.getValue("username"), p.getValue("password"));
		 
		 //handle robox
		 //jswait.waitUntil("//iron-overlay-backdrop");
		 //jswait.loadClick("//iron-overlay-backdrop");
    }
	@Then("^logout")
	public void logout() throws InterruptedException {
		landingPage.clickDropdownLogout();
	}
	@Then("^navigate to precision marketer")
	public void navigateToPrecisionMarketer() throws InterruptedException {
		landingPage.navigateToPrecisionMarketer();
	}
	@Then("^navigate to landing page")
	public void navigateToLandingPage() throws InterruptedException {
		Thread.sleep(3000);
		landingPage.navigateToLandingPage();
	}
	@Then("^navigate to reports")
	public void navigateToReports() throws InterruptedException {
		jswait.loadClick(reports);
	}
	@Then("^navigate to customer profile")
	public void navigateToCustomerProfile() throws InterruptedException {
		customerProfilePage.navigateToCustomerProfile();
	}
	@Then("^close browser")
	public void closeBrowser() throws InterruptedException {
		driver.close();
	}
	@Then("^open browser")
	public void openBrowser() throws InterruptedException, IOException {
		Init.init();
	}
	@Then("^navigate to intent management")
	public void navigateToIntentManagement() throws InterruptedException {
		landingPage.navigateToIntentManagement();
	}
	@Then("^navigate to data foundation")
	public void navigateToDataFoundation() throws InterruptedException {
		landingPage.navigateToDataFoundation();
	}
	@Then("^navigate to discovered clusters")
	public void navigateToDiscoveredClusters() throws InterruptedException {
		landingPage.navigateToDiscoveredClusters();
	}
	@Then("^navigate to customer driven events")
	public void navigateToCustomerDrivenEvents() throws InterruptedException {
		landingPage.navigateToCustomerDrivenEvents();
	}
	@Then("^navigate to usage metric")
	public void navigateToUsageMetric() throws InterruptedException {
		landingPage.navigateToUsageMetric();
	}
	
	@Then("^navigate to registration list")
	public void navigateToRegistrationList() throws InterruptedException {
		registrationListPage.navigateToRegistrationList();
	}
	@Then("^navigate to customer location insights")
	public void navigateToCustomerLocationInsights() throws InterruptedException {
		registrationListPage.navigateToCustomerLocationInsights();
	}
	@Then("^navigate to rewards")
	public void navigateToRewards() throws InterruptedException {
		jswait.loadClick("//a/div[contains(.,'Rewards')]/..");
	}
	@Then("^navigate to offer attributes")
	public void navigateToOfferAttributes() throws InterruptedException {
		jswait.loadClick("//a/div[contains(.,'Offer Attributes')]/..");
	}
	@Then("^navigate to configuration management")
	public void navigateToConfiurationManagement() throws InterruptedException {
		landingPage.navigateToConfigurationManagement();
	}
	@Then("^navigate to offer management$")
    public void offerManagement() throws InterruptedException {
		jswait.loadClick(offerManagement);
	}
	@Then("^wait for some time")
	public void waitForSomeTime() throws InterruptedException {
		Thread.sleep(5000);
	}
	@Then("^wait for (\\d+) sec")
	public void waitForSec(int sec) throws InterruptedException {
		Thread.sleep(sec+1000);
	}
	@Then("^navigate to products$")
	public void naviagte_to_products() throws Exception
	{
		jswait.loadClick(products);
	}
	@Then("^pass next scenario based on this step$")
	public void passNextScenarioBasedOnThisScenario() throws Exception
	{
		passScenario = 1;
	}
	@Then("^check previous step and pass this$")
	public void checkPrevousScenarioAndPassScenario() throws Exception
	{
		Assert.assertTrue(passScenario==1, "Previous condition failed, so this scenario fails");
		passScenario = 0;
	}
	@Then("^navigate to offers")
	public void navigate_to_offers() throws Throwable
	{
		commonObjetcs.navigateToOffers();
	}
	
	@Then("^wait for (\\d+) minutes$")
	public void waitForTimeInMinutes(int minutes) throws InterruptedException {
		int milliSeconds = minutes * 60 * 1000;
		Thread.sleep(milliSeconds);
	}
	
	@Given("^login with the user from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
    public void loginuser(String sheet, String fileName) throws Exception {
		excelHelper.setExcelFile(fileName,sheet);
		 driver.get("http://"+p.getValue("env"));
		 loginPage.login((String) excelHelper.getCell(1, 0), (String) excelHelper.getCell(2, 0));
    }

	@Then("^login with seleniumuser from sheet \"([^\"]*)\"$")
    public void seleniumloginuser(String sheet) throws Exception {
		excelHelper.setExcelFile("seluserlogin",sheet);
		 //driver.get("http://"+p.getValue("env"));
		 loginPage.login((String) excelHelper.getCell(1, 0), (String) excelHelper.getCell(1, 1));
		 //jswait.loadClick(loginButton);
			
		 
    }
	
	@Then("^login to next environment$")
    public void loginuserToNextEnv() throws Exception {
		 driver.get("http://"+p.getValue("env2"));
		 loginPage.login(p.getValue("username"), p.getValue("password"));
    }

	@Given("^navigate to environment$")
	 public void loginuserToEnv() throws Exception {
		 driver.get("http://"+p.getValue("env"));
	}
	
	@Then("^login with the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void loginWithUser(String userName, String passWord) throws Exception {
		 loginPage.login(userName, passWord);
	}
	
	@Then("^go to temp url \"([^\"]*)\"$")
	public void go_to_url(String url) throws Exception {
		 driver.get(url);
	}
	
	@Then("^login with user from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
    public void loginUserFromExcel(String sheet, String fileName) throws Exception {
		 excelHelper.setExcelFile(fileName,sheet);
		 loginPage.login((String) excelHelper.getCell(1, 0), (String) excelHelper.getCell(2, 0));		
		 
    }

}
