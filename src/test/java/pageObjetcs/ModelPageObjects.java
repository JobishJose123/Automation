package pageObjetcs;

import static org.junit.Assert.assertTrue;


import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Calendar;

import javax.validation.constraints.AssertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
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
	@FindBy(xpath="(//paper-button[contains(.,'Add')])[1]")
	private WebElement Addbtn;
	@FindBy(xpath="(//paper-item[contains(.,'Edit')])[1]")
	private WebElement editModelOpt; 
	@FindBy(xpath="//paper-icon-button[@title='Edit']")
	private WebElement editDataframeOpt; 
	@FindBy(xpath="//paper-button[contains(.,'Reconfigure')]")
	private WebElement reconfigure; 
	@FindBy(xpath="//paper-button[contains(.,'Back')]")
	private WebElement backOpt; 
	@FindBy(xpath="(//div[@class='content style-scope confirm-list-grid']//following::paper-icon-button[@icon='editor:border-color'])[1]")
	private WebElement kpiEditOpt; 
	@FindBy(xpath="//label[contains(.,'KPI Name')]//following::input[1]")
	private WebElement inputNameOfKpi; 
	@FindBy(xpath="//paper-button[contains(.,'Update KPI')]")
	private WebElement updateKpiBtn; 
	@FindBy(xpath="//paper-icon-button[@title='Delete']")
	private WebElement deleteDataframeOpt; 
	@FindBy(xpath="//span[contains(.,'Are you sure you want to delete this Dataframe?')]//following::paper-button[contains(.,'Yes')][1]")
	private WebElement deleteDataframeYes; 
	@FindBy(xpath="//paper-button[contains(.,'Activate')]")
	private WebElement activatebtn; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
//	@FindBy(xpath="")
//	private WebElement; 
	




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
	
}
	public void DataframeCreation(String Dataframe,String des)throws Exception{
		jswait.loadClick(Addbtn);
		jswait.loadSendKeys(InputName,Dataframe);
		jswait.loadSendKeys(Description, des);
		jswait.loadClick(Next);
	}
	
	public void addList(String baseList) throws Exception{
//		jswait.loadClick(Addbtn);
		Thread.sleep(2000);
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
		
		
	}   
	public void runParagraph() throws Exception{
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
	
	
	public void filterIWBJob(String modelName,String modelType) throws Exception{
		navigatetoModelType(modelType);
		jswait.loadClick("//span[contains(.,'"+modelName+"')]//following::paper-icon-button[1]");
		jswait.loadClick(editModelOpt);
		
	}
	
	public void editDataframe() throws Exception{
		Thread.sleep(2000);
        jswait.loadClick(editDataframeOpt);
        jswait.loadClick(kpiEditOpt);
        jswait.loadSendKeys(inputNameOfKpi,"edited");
        Thread.sleep(2000);
        String editedKpiInput=driver.findElement(By.xpath("//label[contains(.,'KPI Name')]//following::input[1]")).getText();
        Thread.sleep(2000);
        jswait.loadClick(updateKpiBtn);
        Thread.sleep(2000);
        String editedkpiVerify=driver.findElement(By.xpath("(//vaadin-grid-cell-content[contains(.,'1')])[1]//following::vaadin-grid-cell-content[1]")).getText();
        Thread.sleep(2000);
        Assert.assertTrue(editedKpiInput.equals(editedkpiVerify));
        jswait.loadClick(reconfigure);
        Thread.sleep(2000);
        jswait.loadClick(backOpt);
        jswait.loadClick(backOpt);
        jswait.loadSendKeys(InputName, "edited");
        jswait.loadSendKeys(Description,"edited");
        Thread.sleep(2000);
        jswait.loadClick(Next);
        jswait.loadClick(Next);
        jswait.loadClick(Next);
        Thread.sleep(2000);
        jswait.loadClick(SaveExtract);
        Thread.sleep(2000);
        jswait.loadClick(Close);
        
	}
	
	public void verifyEditedDataframe() throws Exception{
		Thread.sleep(2000);
		Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("//div[contains(.,'edited')][@class='name-box style-scope dataframe-box']"))));
		Thread.sleep(2000);
		Assert.assertTrue(jswait.checkVisibility(driver.findElement(By.xpath("//div[contains(.,'edited')][@class='desc-box style-scope dataframe-box']"))));
		
	}
	
	public void deleteDataframe() throws Exception{
		jswait.loadClick(deleteDataframeOpt);
		jswait.loadClick(deleteDataframeYes);
	}
	
	public void verifyDeletionOfDataframe() throws Exception{
		Assert.assertFalse(jswait.checkVisibility(driver.findElement(By.xpath("//div[@class='inpt-box style-scope dataframe-box']"))));
	}
	
	public void activateModel() throws Exception{
		jswait.loadClick(activatebtn);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		Actions builder = new Actions(driver);
		Thread.sleep(1000);
		jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
		Thread.sleep(1000);
		Thread.sleep(1000);
		jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
		Thread.sleep(1000);
		jswait.loadClick(
				".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
		Thread.sleep(1000);
		jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

		Thread.sleep(2000);
		jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
		WebElement num = driver.findElement(By.xpath(
				".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
		WebElement num1 = driver.findElement(By.xpath(
				".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();
		if (am_pm == 0)
			jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
		else
			jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

		jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
		Thread.sleep(2000);
		Thread.sleep(1000);
		jswait.loadClick("//label[contains(.,'Recurrence Pattern')]/..//input");
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Days')]");
		Thread.sleep(1000);
		jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
		Thread.sleep(1000);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	                     //-------------------------------------------------------------------------------------------------------------------//
	
//	
//	public void clickTemplates() throws Exception{
//		jswait.loadClick(Templates);
//	}
//	
//	public void clickUseTemplates() throws Exception{
//		jswait.loadClick(UseTemplate);
//		Thread.sleep(3000);
//		jswait.loadClick(RunAllProgramTemplate);
//		jswait.loadClick(OK);
//	}
	
}