package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class ReportPageObjects extends Init{
	
	JSWaiter jswait = new JSWaiter();
	Init Init =new Init();
	public ReportPageObjects() {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath="//label[contains(.,'Support')]")
//  private WebElement Support;
//	
//	
//	@FindBy(xpath="//div[contains(.,'Data QC Job')][@class='subHeading admin-user style-scope support-panel']")
//  private WebElement DataQCJob;
//	
//	
//	@FindBy(xpath="//paper-button[contains(.,'Create New Data QC Job')]")
// private WebElement CreateNewQCJobbtn;
//	
//	@FindBy(xpath="//input[@is='iron-input'][@placeholder='Enter Job Name']")
//    private WebElement enterJobName;
//	
//	@FindBy(xpath="(//label[contains(.,'Select Metrics')]//following::iron-icon)[1]")
//	private WebElement selectTheMetric;
//
//	
//	@FindBy(xpath="(//paper-item[contains(.,'2 Min')])[2]")
//   private WebElement ChooseFrequency;
//	
	@FindBy(xpath="(//paper-icon-button[@title='Remove'])[2]")
    private WebElement DeleteFilter;
	
	@FindBy(xpath="//iron-icon[@icon='icons:filter-list']")
  private WebElement setFilter;
	
	@FindBy(xpath="(//following::label[contains(.,'Column')]//following::input)[1]")
  private WebElement inputColumn;
	
	@FindBy(xpath="(//paper-item[contains(.,'Program')])[1]")
  private WebElement program;
	
	@FindBy(xpath="(//paper-item[contains(.,'Broadcast')])[1]")
	  private WebElement broadcast;
	
	@FindBy(xpath="(//label[contains(.,'Condition')]//following::input)[1]")
  private WebElement setCondition;

	@FindBy(xpath="//paper-item[contains(.,'contains')]")
  private WebElement contains;
	
	@FindBy(xpath="(//label[contains(.,'Condition')]//following::input)[2]")
  private WebElement programNameInput;
	
	@FindBy(xpath="//paper-button[contains(.,'Save')]")
  private WebElement saveFilter;
	
	
@FindBy(xpath="//iron-icon[@id='sym1']")
private WebElement customerProfile;
	
	@FindBy(xpath="(//input[@id='input'])[1]")
	private WebElement customerNumber ;
	
	@FindBy(xpath="//paper-button[contains(.,'Search')]")
	private WebElement searchbtn ;
	
	@FindBy(xpath="//div[contains(.,'Events')][@class='tab-content style-scope paper-tab']")
	private WebElement eventTab;
	
	
	@FindBy(xpath="//div[contains(.,'Metrics')][@class='tab-content style-scope paper-tab']")
	private WebElement metricTab;
	
	@FindBy(xpath="//div[@id='checkboxLabel'][contains(.,'Select Event Types')]")
	private WebElement selectAllEvent;
	
	@FindBy(xpath="//iron-icon[@title='Apply']")
	private WebElement ApplyToDisplayAllEvents;
	
	@FindBy(xpath="(//div[contains(.,'Last 30 Days')][@class='tab-content style-scope paper-tab'])[1]")
	private WebElement eventWithin30days;
	
	@FindBy(xpath="(//label[contains(.,'Select More')]//following::iron-icon[@icon='paper-dropdown-menu:arrow-drop-down'])[1]")
	private WebElement dropDownForMetricSelect;
	
	@FindBy(xpath="//paper-item[contains(.,'"+SELENIUM_USAGE_METRIC+"')]")
	private WebElement metricName;
			
	@FindBy(xpath="//paper-button[contains(.,'Add')]")
	private WebElement addMetricbtn;
	
	@FindBy(xpath="//div[contains(.,'"+SELENIUM_USAGE_METRIC+"')][@id='checkboxLabel']")
	private WebElement selectMetric;
	
	@FindBy(xpath="(//paper-icon-button[@icon='reorder'])[1]")
	private WebElement reorderDailyTrend;
	
	@FindBy(xpath="(//div[@class='dropdown-content style-scope paper-menu-button'])[4]")
	private WebElement scroll;
//	public void navigatetoSupports() throws Exception{
//		jswait.loadClick(Support);
//	}
//	
//	public void dataQCjob() throws Exception{
//		jswait.loadClick(DataQCJob);
//	}
//	public void enterTheJobName(String JobName) throws Exception{
//		jswait.loadClick(CreateNewQCJobbtn);
//		jswait.loadSendKeys(enterJobName,JobName);
//		jswait.scrollAndClick("(//paper-listbox[@class='style-scope table-select x-scope paper-listbox-0'])[1]", "//paper-item[contains(.,'"+SELENIUM_USAGE_METRIC+"')]");
//		jswait.loadClick(selectTheMetric);
//		jswait.scrollAndClick("//div[@class='mainDiv style-scope create-qc-analysis']","//label[contains(.,'Frequency')]//following::input[@placeholder='Choose Frequency']" );
//		jswait.loadClick(ChooseFrequency);
//		jswait.loadClick(ActivateQCJobbtn);
		
//	}
	public void filterProgram(String programName) throws Exception{
		jswait.loadClick(setFilter);
		jswait.loadClick(DeleteFilter);
		jswait.loadClick(DeleteFilter);
		jswait.loadClick(inputColumn);
		jswait.loadClick(program);
		jswait.loadClick(setCondition);
		jswait.loadClick(contains);
		jswait.loadSendKeys(programNameInput,programName);
		jswait.loadClick(saveFilter);
		Thread.sleep(3000);
	}
	public void conversionFulfillment(String conversion, String fulfillment) throws Exception{
		Thread.sleep(3000);
		System.out.println(conversion);
		System.out.println(fulfillment);
		Assert.assertTrue(jswait.checkVisibility("(//div[contains(.,'Conversion %')]//div[@title='"+conversion+"'])[1]"));
		Assert.assertTrue(jswait.checkVisibility("//div[contains(.,'Fulfillment %')]//div[@title='"+fulfillment+"']"));
		
		
	}
	
	public void ackConversionFulfillment(String ack,String conversion,String fulfillment) throws Exception{
		Thread.sleep(2000);
		Assert.assertTrue(jswait.checkVisibility("(//div[contains(.,'Conversion %')]//div[@title='"+ack+"'])[1]"));
		Assert.assertTrue(jswait.checkVisibility("(//div[contains(.,'Conversion %')]//div[@title='"+conversion+"'])[2]"));
		Assert.assertTrue(jswait.checkVisibility("(//div[contains(.,'Conversion %')]//div[@title='"+fulfillment+"'])[3]"));
	}
	
	public void impressionValue(int offerRecommendedValue) throws Exception{
		System.out.println(offerRecommendedValue);
		Assert.assertTrue(jswait.checkVisibility("//div[contains(.,'Impressions')][@class='number-title style-scope broadcast-report-carousel']//following::div[@title='"+offerRecommendedValue+"']"));
		
	}
	
	
	public void filterbroadcast(String bcName) throws Exception{
		jswait.loadClick(setFilter);
		jswait.loadClick(inputColumn);
		jswait.loadClick(broadcast);
		jswait.loadClick(setCondition);
		jswait.loadClick(contains);
		jswait.loadSendKeys(programNameInput,bcName);
		jswait.loadClick(saveFilter);
	}
	public void entermsisdn(String number) throws Exception{
		jswait.loadClick(customerProfile);
		jswait.loadSendKeys(customerNumber, number);
		jswait.loadClick(searchbtn);
	}
	
	
	
	 public void customerprofile(String profileType) throws Exception{
		 String type = null;
		 if (profileType.equalsIgnoreCase("DEMOGRAPHICS_FIELD")) {
				 type = DEMOGRAPHICS_FIELD;
		 }else if(profileType.equalsIgnoreCase("SITE_ID_PROFILE_FIELD")) {
			 type = SITE_ID_PROFILE_FIELD;
		 }else if(profileType.equalsIgnoreCase("LOCATION_PROFILE_FIELD")) {
			 type = LOCATION_PROFILE_FIELD;
		 }else if(profileType.equalsIgnoreCase("BALANCE_PROFILE_FIELD")) {
			 type = BALANCE_PROFILE_FIELD;
		 }else if(profileType.equalsIgnoreCase("DIGITAL_PERSONA_FIELD")) {
			 type = DIGITAL_PERSONA_FIELD;
		 }else if(profileType.equalsIgnoreCase("SEL_COUNTRY")) {
			 type = BALANCE_PROFILE_FIELD;
		 }else if(profileType.equalsIgnoreCase("SELENIUM_TARGET_GROUP")) {
			 type =SELENIUM_TARGET_GROUP;
		 }else if(profileType.equalsIgnoreCase("SELENIUM_DATE")) {
			 type = SELENIUM_DATE;
		 
		 }
		 Thread.sleep(3000);
		 //jswait.scrollAndClick(scrollPane, type);
		 String profileValue = driver.findElement(By.xpath("(//span[contains(.,'"+type+"')]//following::span)[2]")).getText();
		 
		   System.out.println(profileValue);
		   Thread.sleep(2000);
		 
		   if(profileValue != null) {
			 Assert.assertTrue(true, "no profile value uploaded");  
		   
		   }}
	 
	 public void eventTab() throws Exception{
		 jswait.loadClick(eventTab);
		 jswait.loadClick(selectAllEvent);
		 jswait.loadClick(ApplyToDisplayAllEvents);
		 Thread.sleep(2000);
		 jswait.loadClick(eventWithin30days);
		 Thread.sleep(3000);
	 }
	 
	 public void eventVerify() throws Exception{
		 Assert.assertTrue(jswait.checkVisibility("//div[contains(.,'"+SELENIUM_CUSTOMER_DRIVEN_EVENT+"')]"));
	 }
	 public void metricTab() throws Exception{
		 jswait.loadClick(metricTab);
		 Thread.sleep(2000);
		 jswait.loadClick(dropDownForMetricSelect);
		 if(scroll.isDisplayed()) {
         jswait.scrollIntoView("(//div[@class='dropdown-content style-scope paper-menu-button'])[4]", SELENIUM_USAGE_METRIC);
         jswait.loadClick(metricName);
		 }
		 else {
		jswait.loadClick(metricName);
		 }
		 Thread.sleep(2000);
		 jswait.loadClick(addMetricbtn);
		 jswait.loadClick(selectMetric);
		 Thread.sleep(2000);
		 jswait.loadClick(reorderDailyTrend);
	 }
	 
	 public void verifyMetricData() throws Exception{
		 
		 for(int i=1;i<=10;i++) {
			 String str = driver.findElement(By.xpath("(//td[contains(.,'Selenium Usage Metric_q11')]//following::th)["+i+"]")).getText();
			 int metricValue = Integer.parseInt(str);
			 System.out.println(metricValue);
			 
		 if(metricValue!=0) {
			 break;
		 }
		 }
		 Assert.assertTrue(false);
		 }


}
	