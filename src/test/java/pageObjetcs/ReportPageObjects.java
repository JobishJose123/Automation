package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
//	@FindBy(xpath="//paper-button[contains(.,'Activate')]")
//    private WebElement ActivateQCJobbtn;
	
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
		Assert.assertTrue(jswait.checkVisibility("(//div[contains(.,'Fulfillment %')]//div[@title='"+fulfillment+"'])[2]"));
		
		
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
}
	
	