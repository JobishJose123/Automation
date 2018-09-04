package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import cucumber.api.java.en.Then;

public class dkpageobjects extends Init{

	private static final Exception Exception = null;
	CommonObjects commonObjects = new CommonObjects();
	CampaignObjects CampaignObjects=new CampaignObjects();
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public dkpageobjects() {
		PageFactory.initElements(driver, this);
	}
	
//===========================================================================================================================================================================//
//                                                                     ||ELEMENTS||																							 //
//===========================================================================================================================================================================//	
	

	@FindBy(xpath="//iron-icon[@icon='app-iron-streams:waves']")
	private WebElement Streamingattributes;
	@FindBy(xpath=".//*[@id='router']//paper-button[contains(.,'Create')]")
	private WebElement createstreamingAttributes;
	@FindBy(xpath=".//form[@id='fields']//label[contains(.,'Name')]/../input")
	private WebElement Streamingattributesname;
	@FindBy(xpath=".//form[@id='fields']//*[@id='textarea']")
	private WebElement StreamingattributesDES;
	@FindBy(xpath=".//form[@id='fields']//label[contains(.,'Source')]//following::iron-icon")
	private WebElement Streamingattributessource;
	@FindBy(xpath=".//paper-item[contains(.,'Data Fusion Engine')]")
	private WebElement selectDataFusionEngine;
	@FindBy(xpath=".//form[@id='fields']//label[contains(.,'Data Type')]//following::iron-icon[1]")
	private WebElement selectdatatype;
	@FindBy(xpath=".//paper-item[contains(.,'STRING')]")
	private WebElement selectStringdatatype;
	@FindBy(xpath=".//paper-item[contains(.,'LONG')]")
	private WebElement selectlongdatatype;
	@FindBy(xpath=".//paper-item[contains(.,'DOUBLE')]")
	private WebElement selectDoubledatatype;
	@FindBy(xpath=".//form[@id='fields']//label[contains(.,'Label for Value 1')]//..//input")
	private WebElement labelvalue1;
	@FindBy(xpath=".//form[@id='fields']//label[contains(.,'Label for Value 2')]//..//input")
	private WebElement labelvalue2;
	@FindBy(xpath=".//*[@id='createNew']//paper-button[contains(.,'Save')]")
	private WebElement streamingAttributeSavebtn;
//	@FindBy(xpath="")
//	private WebElement;
//	@FindBy(xpath="")
//	private WebElement;
	
	
	
	
	
	public void navigateTostreamingattribute() throws InterruptedException {
		jswait.loadClick(Streamingattributes);
	}
	
	
	public void createstreamingAttributes() throws InterruptedException {
		jswait.loadClick(createstreamingAttributes);
	}
	public void createstreamingAttributesname() throws InterruptedException {
		jswait.loadSendKeys(Streamingattributesname, "triggerbc");
	}
	
	public void StreamingattributesDES() throws InterruptedException {
		jswait.loadSendKeys(StreamingattributesDES, "to trigger bc");
	}
	
	
	public void Streamingattributessource() throws InterruptedException {
		jswait.loadClick(Streamingattributessource);
	}
	
	public void selectDataFusionEngine() throws InterruptedException {
		jswait.loadClick(selectDataFusionEngine);
	}
	
	public void selectdatatype() throws InterruptedException {
		jswait.loadClick(selectdatatype);
	}
	
	public void selectStringdatatype() throws InterruptedException {
		jswait.loadClick(selectStringdatatype);
	}
	
	public void selectLongdatatype() throws InterruptedException {
		jswait.loadClick(selectlongdatatype);
	}
	public void selectDoubledatatype() throws InterruptedException {
		jswait.loadClick(selectDoubledatatype);
	}
	
	public void labelvalue2() throws InterruptedException {
		jswait.loadSendKeys(labelvalue2,"value1");
	}
	
	public void labelvalue1() throws InterruptedException {
		jswait.loadSendKeys(labelvalue1,"value2");
	}
	public void streamingAttributeSavebtn() throws InterruptedException {
		jswait.loadClick(streamingAttributeSavebtn);
	}
	
	
	
	
}
