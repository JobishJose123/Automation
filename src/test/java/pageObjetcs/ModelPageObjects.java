package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.validation.constraints.AssertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.TextFileUtil;
import clojure.reflect.java__init;

public class ModelPageObjects extends Init {
	JSWaiter jswait = new JSWaiter();
	Init Init =new Init();
	CommonObjects CommonObjects=new CommonObjects();
	public ModelPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Insight Workbench']/../..")
	private WebElement InsightWorkbench;
//
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Affinity')]")
//	private WebElement name;

//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Behavioral Profiling')]")
//	private WebElement Behavioral_Profiling;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Classification')]")
//	private WebElement Classification;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Clustering')]")
//	private WebElement Clustering;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Forecasting')]")
//    private WebElement Forecasting;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Location')]")
//	private WebElement Location;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'My Model')]")
//	private WebElement My_Model;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'NBA & NBO')]")
//	private WebElement NBA_NBO;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Pre-processing Techniques')]")
//	private WebElement Pre_processing_Techniques;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Propensity')]")
//	private WebElement Propensity;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Text Analysis')]")
//	private WebElement Text_Analysis;	
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Validation Techniques')]")
//	private WebElement Validation_Techniques;
//	
//	@FindBy(xpath="//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'Visualization')]")
//	private WebElement Visualization;
	

	@FindBy(xpath="//paper-button[contains(.,'Create new model')]")
	private WebElement CreateNewModelButton;

	@FindBy(xpath="//*[@id='scrollable']//input[@placeholder='Model Name']")
	private WebElement ModelName;


	@FindBy(xpath="//paper-button[contains(.,'Save')]")
	private WebElement Save;

	@FindBy(xpath="//paper-button[contains(.,'Inputs')]")
	private WebElement Inputs;
	
	@FindBy(xpath="(//input[@class='style-scope paper-input'][@id='input'])[1]")
	private WebElement InputName;
	
	@FindBy(xpath="(//textarea[@id='textarea'])[1]")
	private WebElement Description;
	
	@FindBy(xpath="//paper-button[contains(.,'Next')]")
	private WebElement Next;
	
	@FindBy(xpath="(//input[@type='text'][@id='input'])[1]")
	private WebElement ActiveCustomerBase;
	
	@FindBy(xpath="//span[@class='item-name style-scope expand-collapse'][contains(.,'Customer Profile Info')]")
	private WebElement CustomerProfileInfo;
	
	@FindBy(xpath="//span[@class='item-name style-scope expand-collapse'][contains(.,'Customer Demographics')]")
	private WebElement CustomerDemographics;
	
	@FindBy(xpath="//span[contains(.,'"+AGE_PROFILE_FIELD+"')]//following::paper-checkbox[1]")
	private WebElement Attribute1;
	
	@FindBy(xpath="//span[contains(.,'"+DEMOGRAPHICS_FIELD+"')]//following::paper-checkbox[1]")
	private WebElement Attribute2;
	
	@FindBy(xpath="//span[contains(.,'"+SELENIUM_DATE+"')]//following::paper-checkbox[1]")
	private WebElement Attribute3;
	
	@FindBy(xpath="//paper-button[contains(.,'Save & Extract')]")
	private WebElement SaveExtract;
	
	@FindBy(xpath="//paper-icon-button[@icon='refresh']")

	private WebElement refresh;
	
	
	@FindBy(xpath="(//paper-icon-button[@class='icon-btn style-scope dataframe-box x-scope paper-icon-button-0'])[1]")
	private WebElement edit;
	
	@FindBy(xpath="(//paper-button[contains(.,'Save')])[3]")
	private WebElement savedata;
	
	@FindBy(xpath="//p[@class='dt-collect style-scope dataframe-box']")
	private WebElement DataFrameCurrStatus;
	
	@FindBy(xpath="//paper-button[contains(.,'Close')]")
	private WebElement Close;

	@FindBy(xpath="//div[contains(@src,'paragraph/paragraph.html')]//textarea")
	private WebElement inputdata;

	@FindBy(xpath="//i[@class='icon-control-play']")

	private WebElement RunAllProgram;
	
	
	@FindBy(xpath="//button[contains(.,'OK')]")

	private WebElement OK;
	
	
	@FindBy(xpath="(//span[@class='ng-binding'])[3]")

	private WebElement status;

	@FindBy(xpath="//div[@class='text plainTextContent']")

	private WebElement output;
	
	@FindBy(xpath="//paper-tab[@class='style-scope zeppelin-notebooks x-scope paper-tab-0'][@val='templates']")
	private WebElement Templates;
	
	@FindBy(xpath="//paper-button[contains(.,'Use Template')]")
	private WebElement UseTemplate;
	
	
	@FindBy(xpath="//i[@class='icon-control-play']/..")
	private WebElement RunAllProgramTemplate;
	
	
//	
	@FindBy(xpath="(//paper-button[contains(.,'Add')])[1]")
	private WebElement Addbtn;




	public void navigatetoInsightWorkbench() throws Exception {
		jswait.loadClick(InsightWorkbench);
	}

	public void navigatetoModelType(String name)throws Exception {
		
		jswait.loadClick("//div[@class='categoryName style-scope zeppelin-notebooks'][contains(.,'"+name+"')]");
	} 


	public void navigatetoCreateNewModel()throws Exception {
		jswait.loadClick(CreateNewModelButton);
	}

	public void NewModelName(String Modelname)throws Exception {

		jswait.loadSendKeys(ModelName,Modelname);     //read from file
		jswait.loadClick(Save);
		Thread.sleep(3000);
	}
	
	public void inputdata( String inputCodeFile,String modelType ,String modelName ) throws Exception {
		
		driver.switchTo().frame(0);//switch frame
			Thread.sleep(3000);
			TextFileUtil textFile=new TextFileUtil();
			Thread.sleep(2000);
			String input=textFile.readTxtFile(inputCodeFile).replaceAll("Affinity/SelModel7665", modelType+"/"+modelName);
//			jswait.loadSendKeys(inputdata,input);
			 Toolkit toolkit = Toolkit.getDefaultToolkit();
		   	   Clipboard clipboard = toolkit.getSystemClipboard();
		   	StringSelection selection = new StringSelection(input);
		   	clipboard.setContents(selection, selection);
		   	inputdata.sendKeys(Keys.CONTROL,"v");
		   	driver.switchTo().defaultContent();
	   	jswait.loadClick("//div[@class='content style-scope data-analytics']");
	   	Thread.sleep(5000);
		   	driver.navigate().refresh();
		   	jswait.loadClick("(//data-table-cell[contains(.,'"+modelName+"')]//following::paper-icon-button)[1]");
		   	Thread.sleep(2000);
		   jswait.loadClick("(//data-table-cell[contains(.,'"+modelName+"')]//following::paper-item[contains(.,'Edit')])[1]");
		   	Thread.sleep(2000);
		   	
	}
	
	public void navigatetoInputs()throws Exception{
		Thread.sleep(2000);
		jswait.loadClick(Inputs);
		jswait.loadClick(Addbtn);
	
}
	public void DataframeCreation(String Dataframe,String des)throws Exception{
		jswait.loadSendKeys(InputName,Dataframe);
		jswait.loadSendKeys(Description, des);
		jswait.loadClick(Next);
	}
	
	public void addList(String baseList) throws Exception{
		jswait.loadClick(ActiveCustomerBase);
		jswait.loadSendKeys(ActiveCustomerBase,baseList);
		Thread.sleep(3000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+baseList+"')]");
		jswait.loadClick(Next);
		jswait.loadClick( CustomerDemographics);
		jswait.loadClick(Attribute2);
		jswait.loadClick( CustomerProfileInfo);
		jswait.loadClick(Attribute1);
		jswait.loadClick(Attribute3);
		jswait.loadClick(Next);
		jswait.loadClick(SaveExtract);
		Thread.sleep(3000);
		
	}

	public String getDataframeStatus() throws Exception{
	    	jswait.loadClick(refresh);
			Thread.sleep(9000);
			return DataFrameCurrStatus.getText();
	}
	
	public void clickClose() throws Exception{
		jswait.loadClick(Close);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);//switch frame
		 jswait.loadClick(RunAllProgram);
			jswait.loadClick(OK);
	}
	
	
	public String getStatus() throws Exception{
		return status.getText();
		}
	
	
	public void outputdata(String arg1)throws Exception {
		TextFileUtil textFile=new TextFileUtil();
        String str1=textFile.readTxtFile(arg1);
  
// jswait.waitUntil(".//div[contains(@src,'app/notebook/paragraph/result/result')]//div[contains(text(),'"+str1+"')]");
        String str2=output.getText().concat("\n");
       Assert.assertEquals(str2.trim(),str1.trim());
	
      
        
//         assertTrue(driver.findElement(By.xpath("//div[@class='text plainTextContent'][contains(.,'"+str1+"')]")).isDisplayed());	
	}	
	
	
	                     //-------------------------------------------------------------------------------------------------------------------//
	
	
	public void clickTemplates() throws Exception{
		jswait.loadClick(Templates);
	}
	
	public void clickUseTemplates() throws Exception{
		jswait.loadClick(UseTemplate);
		Thread.sleep(3000);
		jswait.loadClick(RunAllProgramTemplate);
		jswait.loadClick(OK);
	
}
	
}