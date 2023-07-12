
import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClasses.CalenderUtility;
import baseClasses.ExcelHelper;
import baseClasses.GoogleSpreadsheetImpl;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.SQLHandler;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LandingPageObjects;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.RegistrationListPage;


public class CommonSteps extends Init {
	JSWaiter jswait = new JSWaiter();
	LoginPageObjects loginPage = new LoginPageObjects();
	LandingPageObjects landingPage = new LandingPageObjects();
	CampaignObjects campaignObjects = new CampaignObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CommonObjects commonObjetcs = new CommonObjects();
	RegistrationListPage registrationListPage = new RegistrationListPage();
	ExcelHelper excelHelper = new ExcelHelper();
	public ExcelHelper eM = new ExcelHelper(); 
	LoginPageObjects loginpageobjects=new LoginPageObjects();
	ExcelHelper eh=new ExcelHelper();
	ExcelHelper eh1=new ExcelHelper();
	public CommonSteps() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//label[contains(text(),'System Administration')]")
	private WebElement SystemAdministration;
	@FindBy(xpath="//label[contains(text(),'Offer Management')]")
	private WebElement offerManagement;
	@FindBy(xpath="//label[text()='Reports']/..")
	private WebElement reports;
	@FindBy(xpath="//*[@id='sym1']")
	private WebElement products;
	@FindBy(xpath="//div[contains(text(),'IP Access Control')]")
    private WebElement IPAccesscontrol;
	
	@FindBy(xpath="//*[@id='loginButton']")
    private WebElement loginButton;
	
	@FindBy(xpath="//div[contains(.,'Program Reports')][@class='subHeading style-scope clv-reports']//following::div[@class='hex style-scope hexagon-content']")
	private WebElement programReports;
	
	@FindBy(xpath="(//div[contains(.,'Broadcast Reports')][@class='subHeading style-scope clv-reports']//following::div[@class='hex style-scope hexagon-content'])[1]")
	private WebElement broadcastReports;
	
	
	

	@Then("^save \"([^\"]*)\" data to spreadsheet from \"([^\"]*)\" with string (.*)$")
	public void testFunction(String excelFile, String bcSheet, String key) throws Exception {
		System.out.println("Inside Test Function"+bcSheet+":::::"+key); 
		GoogleSpreadsheetImpl sqs = new GoogleSpreadsheetImpl();
		eM.setExcelFile(excelFile, bcSheet);
    	sqs.initializeService();
    	
    	sqs.setSpreadsheet("1TxPWapq2Ai6XQyuBKhyG-1RZ0IliYOVW-Qga4FNhMf4","DataSetup");
    	int lastRow = Integer.parseInt(sqs.getCell(0, 4))-1;
    	forExcelSpreadsheet = lastRow;
    	if(forExcelSpreadsheet == -1) {
    		forExcelSpreadsheet = sqs.getLastUsedRow();
    	}
    	int row = forExcelSpreadsheet++;
//    	System.out.println(row);
    	if(excelFile.contentEquals("bcInputData")) {
    		sqs.setCell(row, 0, "Broadcast");
    		sqs.setCell(row, 1, eM.getCellByColumnName("BC Name"));
    	}
    	else if(excelFile.contentEquals("offerInputData")) {
    		sqs.setCell(row, 0, "Offer");
    		sqs.setCell(row, 1, eM.getCell(1,0).toString());
    	}
    	else if(excelFile.contentEquals("productInputData")) {
    		sqs.setCell(row, 0, "Product");
    		sqs.setCell(row, 1, eM.getCell(1,0).toString());
    	}
    	else if(excelFile.contentEquals("productClassInputData")) {
    		sqs.setCell(row, 0, "Product Class");
    		sqs.setCell(row, 1, eM.getCell(1,0).toString());
    	}
    	else if(excelFile.contentEquals("offerCatalogInputData")) {
    		sqs.setCell(row, 0, "Offer Catalog");
    		sqs.setCell(row, 1, eM.getCell(1,0).toString());
    	}
    	else if(excelFile.contentEquals("campaignCategoryInputData")) {
    		sqs.setCell(row, 0, "Campaign Category");
    		sqs.setCell(row, 1, eM.getCell(1,0).toString());
    	}
    	else if(excelFile.contentEquals("campaignInputData")) {
    		sqs.setCell(row, 0, "Campaign");
    		sqs.setCell(row, 1, eM.getCell(1,0).toString());
    	}
    	else {
    		Exception e = new Exception("Excel file not adde to else if");
    		throw e;
    	}
    	sqs.setCell(row, 2, key);
    	CalenderUtility cu = new CalenderUtility();
    	sqs.setCell(row, 3, cu.getCurrentDate("dd MMM YYYY hh:mm aaa z"));
	}
	
	@Given("^login to tag manager implemented website$")
	public void login_to_tag_manager_implemented_website() throws Throwable {
		driver.get("http://flytxttags.epizy.com/");
		Thread.sleep(2000);
	}
	
	@Then("^trigger the website configured in google tag manager$")
	public void trigger_the_website_configured_in_google_tag_manager() throws Throwable {
		driver.navigate().refresh();
	}
	@Then("^navigate to System Administration$")
	public void navigate_to_System_Administration() throws Throwable {
		jswait.loadClick(SystemAdministration);
	}
	@Then("^navigate to IP Access Control$")
	public void navigate_to_IP_Access_Control() throws Throwable {
		jswait.loadClick(IPAccesscontrol);
	}
	
	
	
	@Given("^login$")
    public void loginuser() throws Exception {
     driver.get("https://"+p.getValue("env"));
	 Thread.sleep(35000);
     loginPage.login(p.getValue("username"), p.getValue("password"));
	 Thread.sleep(5000);
	 try {
		 driver.navigate().refresh();
		 Thread.sleep(5000);
		// driver.switchTo().alert().dismiss();
	 }
	 catch(Exception e) {
		 System.out.println("robox popup not found");
	 }
	

    }
	@Then("^logout")
	public void logout() throws InterruptedException {
		landingPage.clickProfileNameTopbar();
		Thread.sleep(2000);
		landingPage.clickDropdownLogout();
	}
	@Then("^refresh")
	public void refresh() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(8000);
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
	@Then("^navigate to customer support")
	public void navigateToCustomerSupport() throws InterruptedException {
		customerProfilePage.navigateToCustomerSupport();
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
	@Then("^navigate to revenue metric")
	public void navigateToRevenueMetric() throws InterruptedException {
		landingPage.navigateToRevenueMetric();
	}
	@Then("^navigate to event counts")
	public void navigateToEventCounts() throws InterruptedException {
		landingPage.navigateToEventCounts();
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
	
	@Then("^navigate to control group$")
	public void navigate_to_control_group() throws Throwable {
	    
		landingPage.navigateToControlgroup();
	}
	
	
	
	@Then("^navigate to offer management$")
    public void offerManagement() throws InterruptedException {
//		jswait.loadClick(offerManagement);
		campaignObjects.offerManagement();
	}
	
	@Then("^navigate back to offer management$")
	public void navigate_back_to_offer_management() throws Throwable {
	  
		campaignObjects.offerManagementback();
	}
	
	
	
	@Then("^navigate to offer management through Top tag$")
	public void navigate_to_offer_management_through_Top_tag() throws Throwable {
	 
		campaignObjects.offermanagementTopTag();
	}

	@Then("^wait for some time")
	public void waitForSomeTime() throws InterruptedException {
		Thread.sleep(5000);
	}
	@Then("^wait for (\\d+) sec")
	public void waitForSec(int sec) throws InterruptedException {
		Thread.sleep(sec+1000);
	}	
	@Then("^navigate to program reports$")
		public void programReport() throws Exception{
	jswait.loadClick(programReports);
	}
	@Then("^navigate to broadcast reports$")
	public void broadcastReport() throws Exception{
		jswait.loadClick(broadcastReports);
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
		Assert.assertTrue("Previous condition failed, so this scenario fails", passScenario==1);
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
	
	@Then("^wait for (\\d+) milliseconds$")
	public void waitForTimeInMilliSeconds(int milliSeconds) throws InterruptedException {
		//int milliSeconds = minutes * 60 * 1000;
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
		 loginPage.login(p.getValue("env"), p.getValue("env"));
		 //jswait.loadClick(loginButton);
		 try{
			 jswait.loadClick("//body[@class='fullbleed layout vertical']");
		 }
		 catch (Exception e) {
			 System.out.println("Robob x popup off....");
		 }
			
		 
    }
	@Then("^login with selenium user$")
    public void loginWithSeleniumUser() throws Exception {
		 driver.get("http://"+p.getValue("env"));
		 loginPage.login(p.getValue("seleniumUser"), p.getValue("seleniumPassword"));
			
		 try{
			 jswait.loadClick("//body[@class='fullbleed layout vertical']");
		 }
		 catch (Exception e) {
			 System.out.println("Robob x popup off....");
		 }
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
	
	
	@Then("^click create new customer location insight$")
    public void clickCreateNewRegistrationListButton() throws Throwable{
		commonObjetcs.clickCreateNewCustomerLocationInsight();
	}
	
	
	@Then("^click create new usage metric$")
    public void clickCreateNewUsageMetricButton() throws Throwable{
		commonObjetcs.clickCreateNewUsageMetric();
	}
	
	
	@Then("^enter new usage metric details from sheet \"([^\"]*)\"$")
    public void enterNewUsageMetricDetails(String sheet) throws Throwable{
		
    	Thread.sleep(4000);
    	eM.setExcelFile("usageMetricInputData",sheet);
 		String name = (String) eM.getCell(1, 0);
 		name =  RandomNameGenerator.getRandomName(name);
 		eM.setCell(1, 0, name);
		commonObjetcs.enterNewUsageMetricDetails(name, "Test Description");
	
	
	}
	
	@Then("^enter new customer location insight details from sheet \"([^\"]*)\"$")
    public void enterNewCustomerLocationInsightDetails(String sheet) throws Throwable{
		
    	Thread.sleep(4000);
    	eM.setExcelFile("customerLocationInsightInputData",sheet);
 		String name = (String) eM.getCell(1, 0);
 		name =  RandomNameGenerator.getRandomName(name);
 		eM.setCell(1, 0, name);
		commonObjetcs.enterNewCustomerLocationInsightDetails(name, "Test Description");
	
	
	}
	@Then("^create same  customer location insight details from sheet \"([^\"]*)\"$")
    public void enterSameCustomerLocationInsightDetails(String sheet) throws Throwable{
		
    	Thread.sleep(4000);
    	eM.setExcelFile("customerLocationInsightInputData",sheet);
 		String name = (String) eM.getCell(1, 0);
		commonObjetcs.enterNewCustomerLocationInsightDetails(name, "Test Description");
	
	
	}
	
	
	@Then("^create same usage metric details from sheet \"([^\"]*)\"$")
    public void enterSameUsageMetricDetails(String sheet) throws Throwable{
		
    	Thread.sleep(4000);
    	eM.setExcelFile("usageMetricInputData",sheet);
 		String name = (String) eM.getCell(1, 0);
		commonObjetcs.enterNewUsageMetricDetails(name, "Test Description");
	
	
	}
	@Then("^reset password of selenium user$")
	public void reset_password_of_selenium_user() throws Throwable {
		SQLHandler sql = new SQLHandler();
		sql.init(p.getValue("dbUrl"),p.getValue("dbUsername"),p.getValue("dbPassword"));
		int web_user_id = sql.getStringOfQuery("select web_user_id from web_user where email_address = \"selenium.flytxt@gmail.com\";");
		sql.executeUpdate("update web_user set PASSWORD = \"riN2h0ZHFs6MBpnW8JggWqdk5lE=\" where web_user_id = "+web_user_id+";");
	}
	
	
	
	@Then("^navigate to license Generator")
	public void navigateToLicenseGenerator() throws InterruptedException {
		Thread.sleep(2000);
		driver.get("http://192.168.150.44:9900/index.html");
		
	}
	
	@Then("^login to license Generator")
	public void loginToLicenseGenerator() throws InterruptedException {
		Thread.sleep(2000);
		commonObjetcs.LIcenseGeneratorLogin();
	}
	
	@Then("^license Generator details for version \"([^\"]*)\"$")
	public void LicenseGeneratorDetails(String version) throws InterruptedException {
		Thread.sleep(2000);
		commonObjetcs.LIcenseGeneratordetailspage(version);
	}
	
	@Then("^license Generator for all Features")
	public void LicenseGeneratorAllFeatures() throws Exception {
		Thread.sleep(2000);
		commonObjetcs.LIcenseGeneratorenableallFeatures();
	}
	
	@Then("^Disable license for This Features \"([^\"]*)\"$")
	public void LicenseGeneratorAllFeatures(String Feature) throws Exception {
		Thread.sleep(2000);
		commonObjetcs.LIcenseGeneratordisableanyFeatures(Feature) ;
	}
	
	
	
	@Then("^Manage License copy Productkey")
	public void Manageproductkey() throws Exception {
		Thread.sleep(2000);
		landingPage.clickProfileNameTopbar();
		Thread.sleep(2000);
		landingPage.clickDropdownManageLicense();
		Thread.sleep(3000);
		commonObjetcs.clickmanagelicensePdtIdCopyBtn();
		Thread.sleep(2000);
		jswait.loadClick(".//paper-button[contains(.,'OK')]");
		
		
		
	}
	
	
	@Then("^Manage License apply new license")
	public void applynewlicense() throws Exception {
		Thread.sleep(2000);
		landingPage.clickProfileNameTopbar();
		Thread.sleep(2000);
		landingPage.clickDropdownManageLicense();
		Thread.sleep(3000);
		commonObjetcs.clickmanagelicenselicenseupgradebtn();
		Thread.sleep(2000);
		commonObjetcs.clickmanagelicenselicenseapply();
		Thread.sleep(2000);
		jswait.loadClick(".//*[@id='saveBtn']");
		
		Thread.sleep(2000);
		jswait.loadClick(".//paper-button[contains(.,'OK')]");
		
	}
	
	@Then("^save details of datasetup$")
	public void saveDetailsofdatasetup() throws Exception {
		Thread.sleep(2000);
		commonObjetcs.savedetailsofdatasetup();
	}
	
	@Then("^save details of seedingoneoff$")
	public void saveDetailsofseedingoneoff() throws Exception {
		Thread.sleep(2000);
		commonObjetcs.saveDetailsofseedingoneoff();
	}
	@Then("^navigate to streaming attributes$")
	public void navigate_to_streaming_attributes() throws Throwable {
		commonObjetcs.navigateToStreamingAttr();
	}

	@Then("^create new streaming attribute from sheet \"([^\"]*)\"$")
	public void create_new_streaming_attribute_from_sheet(String streamingAttrSheet) throws Throwable {
		eh.setExcelFile("streamingAttribute", streamingAttrSheet);
		String attrName=(String) eh.getCell(1, 0);
	    attrName=RandomNameGenerator.getRandomName(attrName);
	    eh.setCell(1, 0, attrName);
		String description=(String)eh.getCell(1, 1);
		String value1=(String) eh.getCell(1, 2);
		String value2=(String)eh.getCell(1,3);
		commonObjetcs.createStreamingAttr(attrName,description,value1,value2);
	}
	
	@Then("^create a streaming attribute from sheet \"([^\"]*)\" with route \"([^\"]*)\"$")
	public void create_a_streaming_attribute_from_sheet_with_route(String streamAttrSheet, String route) throws Throwable {
		ExcelHelper eh= new ExcelHelper();
		eh.setExcelFile("streamingAttribute", streamAttrSheet);
		String streamAttrName=(String) eh.getCell(1, 0);
		streamAttrName=RandomNameGenerator.getRandomName(streamAttrName);
		eh.setCell(1, 0,streamAttrName);
		String description=(String)eh.getCell(1, 1);
		String value1=(String) eh.getCell(1, 2);
		String value2=(String)eh.getCell(1,3);
		commonObjetcs.createStreamingAttr(streamAttrName,description,value1,value2,route);
		
		
	}
	
	
	@Then("^verify streaming attribute from sheet \"([^\"]*)\" is created$")
	public void verify_streaming_attribute_from_sheet_is_created(String streamingAttrSheet) throws Throwable {
		eh.setExcelFile("streamingAttribute", streamingAttrSheet);
		String attrName=(String) eh.getCell(1, 0);
		commonObjetcs.verifyStreamingAttrCreation(attrName);
	}
	@Then("^select triggers in configuration$")
	public void select_triggers_in_configuration() throws Exception{
		commonObjetcs.navigateToTrigger();
	}
	@Then("^create new trigger \"([^\"]*)\" with streaming attribute from sheet \"([^\"]*)\"$")
	public void create_new_trigger_from_sheet_and_streaming_attribute_from_sheet(String triggerNme,String streamingAttrSheet) throws Throwable {
		eh1.setExcelFile("streamingAttribute", streamingAttrSheet);
		String attrName=(String) eh1.getCell(1, 0);
		String value1=(String) eh1.getCell(1, 2);
		String value2=(String)eh1.getCell(1,3);
		commonObjetcs.createTrigger(attrName,value1,value2,triggerNme);
	}
	@Then("^navigate to admin$")
	public void navigate_to_admin() throws Throwable {
		commonObjetcs.navigateToAdmin();
	}
	
	@Then("^navigate to fulfillment configuration$")
	public void navigate_to_fulfillment_configuration() throws Throwable {
		commonObjetcs.navigateToFulfillmentConfig();
	}

	@Then("^navigate to tracking data sources$")
	public void navigate_to_tracking_data_sources() throws Throwable {
		commonObjetcs.navigateToTrackingDataSource();
	}

	@Then("^create new tracking source with name \"([^\"]*)\"$")
	public void create_new_tracking_sorce_with_name(String trackSourceName) throws Throwable {
		commonObjetcs.createNewTrackSource(trackSourceName);
	    
	}
	
	@Then("^navigate back$")
	public void navigate_back() throws Exception{
		driver.navigate().back();
	}
	@Then("^navigate to blackout rules$")
	public void navigate_to_blackout_rules() throws Throwable {
		commonObjetcs.blackoutRulesCreate();
	}

	
	@Then("^navigate to digital plus modules$")
	public void navigate_to_digital_plus() throws Exception{
		commonObjetcs.DigitalPlusModules();
	}
	
	@Then("^navigate to connectors$")
	public void navigate_to_connectors() throws Throwable {
		commonObjetcs.navigateToConnector();
	}

	@Then("^navigate to channel connector$")
	public void navigate_to_channel_connector() throws Throwable {
		commonObjetcs.navigatetToChannelConnector();
	}

	@Then("^navigate to http api connector$")
	public void navigate_to_http_api_connector() throws Throwable {
		commonObjetcs.navigatetToHttpConnector();
	}

	@Then("^click create new connector$")
	public void click_create_new_connector() throws Throwable {
		commonObjetcs.createNewConnector();
	}
	
	
	@Given("^login to webhook with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_to_webhook_with_username_and_password(String username, String password) throws Throwable {
	 driver.get("https://webhook.site/control-panel");
	 commonObjetcs.loginToWebhook(username,password);
	}

	@Then("^navigate to control panel$")
	public void navigate_to_control_panel() throws Throwable {
		commonObjetcs.webhookControlPanel();
	}

	@Then("^create new url from sheet \"([^\"]*)\"$")
	public void create_new_url_from_sheet(String httpSheet) throws Throwable {
           eh.setExcelFile("DigitalPlus", httpSheet);
          String response= eh.getCellByColumnName("response");
		commonObjetcs.createNewUrlInWebhook(response,httpSheet);
	}

	@Then("^copy the generated url to sheet \"([^\"]*)\"$")
	public void copy_the_generated_url_to_sheet(String httpSheet) throws Throwable {
		commonObjetcs.copyGeneratedUrl(httpSheet);
         
	}
	
	@Then("^create new http connector from sheet \"([^\"]*)\"$")
	public void create_new_http_connector_from_sheet(String httpSheet) throws Throwable {
	         eh.setExcelFile("DigitalPlus", httpSheet);
	         String httpConnectorName=(String) eh.getCell(1,0);
	         String  webhookUrl=eh.getCellByColumnName("url");
	         commonObjetcs.createHttpConnector(httpSheet,httpConnectorName,webhookUrl);
	
	
	}
	
	@Then("^navigate to digital plus module$")
	public void navigate_to_digital_plus_module() throws Throwable {
		commonObjetcs.clickDigitalPlusModule();
	}
	
	@Then("^navigate to tag manager$")
	public void navigate_to_tag_manager() throws Throwable {
		commonObjetcs.clickTagManagerConfigurations();
	}
	@Then("^Generate the Account key$")
	public void generate_the_Account_key() throws Throwable {
		commonObjetcs.generateAccountkey();
	}
	@Then("^click random$")
	public void click_random() throws Throwable {
		commonObjetcs.randonclicklogin();
	}
	
	@Then("^copy the Account key to sheet \"([^\"]*)\"$")
	public void copy_the_Account_key_to_sheet(String tagsheet) throws Throwable {
		commonObjetcs.accountKeyCopy(tagsheet);
	}
	@Then("^configure application domains from sheet \"([^\"]*)\"$")
	public void configure_application_domains_from_sheet(String sheetname) throws Throwable {
		eh.setExcelFile("tagManager", sheetname);
		String name = eh.getCellByColumnName("Domain_name");
		System.out.println(name);
		commonObjetcs.configureDomainVariables(name);
	}
	
}
