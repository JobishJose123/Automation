package pageObjetcs;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
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

public class DataFusionEngine extends Init {
	private static final Exception Exception = null;
	CommonObjects commonObjects = new CommonObjects();
	CampaignObjects CampaignObjects=new CampaignObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public DataFusionEngine() {
		PageFactory.initElements(driver, this);

}
//===========================================================================================================================================================================//
//          ELEMENTS
//===========================================================================================================================================================================//
	@FindBy(xpath="//paper-scroll-header-panel[@id='flytxt-menu-style']/*//label[.='Connectors']")
	private WebElement DataFusionEnginebutton;
	@FindBy(xpath="//html//div[@id='mainContainer']//*/div//paper-button[contains(.,'Add File connection')]")
	private WebElement AddJobbutton;
	@FindBy(xpath="//paper-scroll-header-panel[@id='flytxt-menu-style']/*//label[.='Reports']")
	private WebElement reports;
	@FindBy(xpath="//div[contains(text(),'Data Health Check')]")
	private WebElement dataHealthCheck;
	@FindBy(xpath="//paper-button[contains(.,'Export')]")
	private WebElement export;
	///html//div[@id='mainContainer']//*/div/paper-button[contains(.,'Add Job')]
	
	
	@FindBy(xpath = "//data-table-cell[contains(.,'File')]//following::iron-icon[1]")
	private WebElement DFEfileoptions;
	@FindBy(xpath = "(//data-table-cell[contains(.,'File')]//following::paper-item[contains(.,' View all connections')])[1]")
	private WebElement Viewallconnectionsfile;
	
	@FindBy(xpath = "//*[@id=\"router\"]/app-route[17]/ndx-connectors/paper-card[contains(.,'Data Connector')]")
	private WebElement Dataconnector;
	
	
	
	@FindBy(xpath = ".//paper-item[contains(.,'Delete')]")
	private WebElement jobdelete;
	
	@FindBy(xpath = ".//paper-item[contains(.,'Edit')]")
	private WebElement jobedit;
	
	@FindBy(xpath = "//div/paper-button[contains(.,'Delete')]")
	private WebElement Deleteok;
	
	@FindBy(xpath=".//label[contains(.,'Job Name')]/../input")
	private WebElement Jobname;
	
	@FindBy(xpath=".//label[contains(.,'Connection Name')]/../input")
	private WebElement ConnectionName;
	
	
	
	@FindBy(xpath=".//label[contains(.,'Select connector')]/../input")
	private WebElement connector;
	@FindBy(xpath="/html//div[@id='contentWrapper']//paper-listbox[@role='listbox']/paper-item[contains(.,'file')]")
	private WebElement selectFile;
	@FindBy(xpath=".//label[contains(.,'Select Hostname')]/../input")
	private WebElement hostname;
	
	@FindBy(xpath=".//label[contains(.,'Input Path')]/../input")
	private WebElement FileInputpath;
	
	@FindBy(xpath=".//label[contains(.,'Output Path')]/../input")
	private WebElement FileOutputpath;
	
	@FindBy(xpath=".//label[contains(.,'Regex')]/../input")
	private WebElement FileRegex;
	
	
	
	@FindBy(xpath = "//*[@id='fileToLoad']")
	private WebElement emailSelectResourceButton;
	//table[@class='style-scope test-model']/tbody/tr[1]/td[@class='style-scope test-model']/span[contains(.,'2')]
	
	
	@FindBy(xpath=".//paper-listbox[@role='listbox']/paper-item[contains(.,'flyftp')]")
	private WebElement selecthostname;
	
	@FindBy(xpath="//paper-input-container[@id='inputContainer']//div[@class='input-content style-scope paper-input-container']//input[@id='input']")
	private WebElement selectDataProcessor;
	
	
	//div[@id='tabsContent']/paper-tab[contains(.,'Simulate')]
	@FindBy(xpath="//div[@id='tabsContent']/paper-tab[contains(.,'Simulate')]")
	private WebElement simulate;
    
	@FindBy(xpath="//div[@id='tabsContent']/paper-tab[contains(.,'Logic Editor')]")
	private WebElement logiceditor;
	
	@FindBy(xpath="//paper-button[contains(.,'Test')]")
	private WebElement result;
	
	@FindBy(xpath="//*[@id=\"router\"]/app-route[18]/data-connector/dk-ui/dk-job-lists/dk-workflow/div[2]/div/paper-icon-button")
	private WebElement JobSave;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td/span[contains(.,'Exception_input')]")
	private WebElement filenameextraction;
	@FindBy(xpath="//app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model//table[@class='style-scope test-model']//span[@title='Le']")
	private WebElement extractleading;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td/span[contains(.,'1234')]")
	private WebElement filenamenumber;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td[contains(.,'test')]")
	private WebElement linestringextraction;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td[1]/span[contains(.,'919895007879')]")
	private WebElement linenumberextraction;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td[2]/span[contains(.,'01002018')]")
	private WebElement linedateextraction;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td[1]/span[contains(.,'01002018')]")
	private WebElement filenamedateextraction;
	
	@FindBy(xpath="=//app-router[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model//table[@class='style-scope test-model']//span[@title='2']")
	private WebElement ABSvalue;
	
	@FindBy(xpath="//app-router[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model//table[@class='style-scope test-model']/tbody/tr[1]/td[4]/span[@title='112']")
	private WebElement FromNumber_Integerpart;
	
	@FindBy(xpath=".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[3]/td[contains(.,'600')]")
	private WebElement greaterthanjob;
	
	
	public void ClickDFEReport() throws InterruptedException{
		jswait.loadClick(reports);		
	}
	
	public void clickOnDataHealthCheck() throws InterruptedException{
		jswait.loadClick(dataHealthCheck);		
	}
	
	public void clickOnexport() throws InterruptedException{
		jswait.loadClick(export);		
	}
	
	
	
	public void ClickDFEfileoptions() throws InterruptedException{
		jswait.loadClick(DFEfileoptions);		
	}
	
	public void ClickDFefileviewconnections() throws InterruptedException{
		jswait.loadClick(Viewallconnectionsfile);		
	}
	
	public void Dataconnector() throws InterruptedException{
		jswait.loadClick(Dataconnector);		
	}
	
	
	
	public void ClickDFEbutton() throws InterruptedException{
		jswait.loadClick(DataFusionEnginebutton);		
	}
	
	public void ClickAddJobbutton() throws InterruptedException{
		jswait.loadClick(AddJobbutton);		
	}
	public void Jobname(String name) throws InterruptedException{
		jswait.loadClick(ConnectionName);
		jswait.loadSendKeys(ConnectionName, name);		
	}
	public void Selctconenctor() throws InterruptedException{
		jswait.loadClick(connector);		
		jswait.loadClick(selectFile);
	}
	public void Hostname() throws InterruptedException{
		jswait.loadClick(hostname);		
	}
	public void SelectHostname() throws InterruptedException{
		jswait.loadClick(selectDataProcessor);
		jswait.loadClick("//div[@id='items']//vaadin-combo-box-item[2]");
	}
	public void JobSave(String output) throws Exception{
		jswait.loadClick(logiceditor);
		jswait.loadClick(simulate);
		File NormalInput = new File("DKInputfile\\NormalInput.txt");
	    emailSelectResourceButton.sendKeys(NormalInput.getAbsolutePath());
	    jswait.loadClick(result);
	    Thread.sleep(3000);	    
	    jswait.waitUntil("//table[@class='style-scope test-model']/tbody/tr[1]/td[@class='style-scope test-model']/span[contains(.,'"+output+"')]");
	    assertTrue("output not matching", driver.findElement(By.xpath("//table[@class='style-scope test-model']/tbody/tr[1]/td[@class='style-scope test-model']/span[contains(.,'"+output+"')]")).isDisplayed());
	    jswait.loadClick(JobSave);		
	}
	public void FileInput(String input) throws InterruptedException{
		jswait.loadClick(FileInputpath);
		jswait.loadSendKeys(FileInputpath, input);
	}
	public void FileOutput(String output) throws InterruptedException{
		jswait.loadClick(FileOutputpath);
		jswait.loadSendKeys(FileOutputpath, output);
	}
	
	public void FileRegex(String regex) throws InterruptedException{
		jswait.loadClick(FileRegex);
		jswait.loadSendKeys(FileRegex, regex);
	}
	
	public void clickDeleteOption() throws InterruptedException{
		jswait.loadClick(jobdelete);
		}
	public void clickEditOption() throws InterruptedException{
		jswait.loadClick(jobedit);
		}
	
	public void copy(String jobname) throws InterruptedException, Exception, IOException{
		commonObjects.filterName(jobname);
		commonObjects.clickOptionsIcon();
		broadcastPageObjects.clickCopyBroadcastOption();
		Thread.sleep(2000);
		String copiedjobname = commonObjects.getTextFormTextField(ConnectionName);
		System.out.println("name" +copiedjobname );
		jswait.loadClick(JobSave);
		commonObjects.filterName(copiedjobname);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+copiedjobname+"')]"));
		Assert.assertTrue("Copied job not found", element.isDisplayed());
		}
	
	public void delete(String jobname) throws InterruptedException, Exception, IOException{
		commonObjects.filterName(jobname);
		commonObjects.clickOptionsIcon();
		clickDeleteOption();
		jswait.loadClick(Deleteok);
		Thread.sleep(2000);
		//String copiedjobname = commonObjects.getTextFormTextField(".//label[contains(.,'Job Name')]/../input");
		//System.out.println("name" +copiedjobname );
		//jswait.loadClick(JobSave);
		commonObjects.filterName(jobname);
		Thread.sleep(2000);
		
		try{
			WebElement element = driver.findElement(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+jobname+"')]"));
			Assert.assertTrue(!element.isDisplayed());
		   
		}catch (Exception e) {
			
		}
		
		}
	public void edit(String jobname) throws InterruptedException, Exception, IOException{
		commonObjects.filterName(jobname);
		commonObjects.clickOptionsIcon();
		clickEditOption();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//label[contains(.,'Connection Name')]/../input")).sendKeys("edited");
		jswait.loadClick(JobSave);
		//jswait.loadClick(Deleteok);
		//Thread.sleep(2000);
		//String copiedjobname = commonObjects.getTextFormTextField(".//label[contains(.,'Job Name')]/../input");
		//System.out.println("name" +copiedjobname );
		//jswait.loadClick(JobSave);
		jobname = jobname + "edited";
		commonObjects.filterName(jobname);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+jobname+"')]"));
		Assert.assertTrue("Job Not Edited", element.isDisplayed());
		}

	
	public void Jobcheckskipexception() throws Exception{
		jswait.loadClick(logiceditor);
		jswait.loadClick(simulate);
		File NormalInput = new File("DKInputfile\\Exception_input.txt");
	    emailSelectResourceButton.sendKeys(NormalInput.getAbsolutePath());
	    jswait.loadClick(result);
	    Thread.sleep(5000);	   
	    Exception skipexception=new Exception("skip exception is not working");
	    if(driver.findElements(By.xpath(".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div[1]/table/tbody/tr[2]")).size()==0)
	    {
	    	
	    System.out.println("skip exception is working");
	    }else {
	    	throw skipexception;
	    }
	    	
	    jswait.loadClick(JobSave);		
	}
	
	public void Jobfilenameextraction() throws Exception{
		jswait.loadClick(logiceditor);
		jswait.loadClick(simulate);
		File NormalInput = new File("DKInputfile\\Exception_input.txt");
	    emailSelectResourceButton.sendKeys(NormalInput.getAbsolutePath());
	    jswait.loadClick(result);
	    Thread.sleep(5000);	   
	    Exception skipexception=new Exception("filename extraction is not working");
	   
	   String name=jswait.getTextFormElement(".//*[@id='router']/app-route[2]/platform-job/dk-ui/dk-workflow/iron-pages/test-model/section/div/div/div/table/tbody/tr[1]/td/span[contains(.,'Exception_input')]").toString();
	   System.out.println(name); 		
	   if(name.equals("Exception_input"))
	    {
	    	
	    System.out.println("filename extraction  is working");
	    }else {
	    	throw skipexception;
	    }
	    	
	    jswait.loadClick(JobSave);		
	}
	
	public void dfejobverificationold(String filename,String data,String keyword) throws Exception{
		jswait.loadClick(logiceditor);
		
		jswait.loadClick(simulate);
		
		File NormalInput = new File("DKInputfile\\"+filename);
	   
		emailSelectResourceButton.sendKeys(NormalInput.getAbsolutePath());
		Thread.sleep(5000);	
		jswait.loadClick(result);
	    Thread.sleep(5000);	
	    
	    
	    if(keyword.equalsIgnoreCase("filenameextraction")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td").toString();
	    	Assert.assertTrue(actualdata.equals(data));	    	
	    }else if(keyword.equalsIgnoreCase("filenamenumber")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td").toString();
	    	Assert.assertTrue(actualdata.contains(data));	
	    }else if(keyword.equalsIgnoreCase("linestringextraction")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td[3]").toString();
	    	Assert.assertTrue(actualdata.contains(data));	    	
	    }else if(keyword.equalsIgnoreCase("linenumberextraction")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td[1]").toString();
	    	Assert.assertTrue(actualdata.contains(data));
	    }else if(keyword.equalsIgnoreCase("linedateextraction")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td[2]").toString();
	    	Assert.assertTrue(actualdata.contains(data));
	    }else if(keyword.equalsIgnoreCase("filenamedateextraction")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td").toString();
	    	Assert.assertTrue(actualdata.contains(data));
	    }else if(keyword.equalsIgnoreCase("ABSvalue")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[6]//td[contains(.,'sfff')]/../..//tr[6]//td[2][contains(.,'3222')]/../..//tr[6]//td[3][contains(.,'-2')]/../..//tr[6]//td[7]").toString();
	    	Assert.assertTrue(actualdata.contains(data));
	    }else if(keyword.equalsIgnoreCase("FromNumber_Integerpart")) {
	    	String actualdataDouble=jswait.getTextFormElement("//table//tbody//tr[1]//td[2]").toString();
			Double d=Double.valueOf(actualdataDouble);
			Long integerValue=d.longValue(); 
			System.out.println(integerValue);
			String actualdataInt=jswait.getTextFormElement("//table//tbody//tr[1]//td[4]").toString();
			Long intValue2=Long.parseLong(actualdataInt); 
			System.out.println(intValue2);
	    	Assert.assertTrue(integerValue.equals(intValue2));
	    }else if(keyword.equalsIgnoreCase("extractLeading")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[1]//td[1]").toString();
	    	String extractString=actualdata.substring(0,2);
	    	Assert.assertTrue(extractString.contains(data));
	    }else if(keyword.equalsIgnoreCase("greaterthanjob")) {
	    	String actualdata=jswait.getTextFormElement("//table//tbody//tr[3]//td").toString();
	    	Assert.assertTrue(actualdata.equals(data));	
	    }else {	   
	    //String actualdata=jswait.getTextFormElement(keyword).toString();
	   // Exception exception=new Exception("verification failed because "+actualdata+" is not matching with "+data);
	    	Exception exception=new Exception("verification failed because actualdata is not matching with "+data);
	    }
	 
	    
	  /* System.out.println(actualdata); 
	   
	   if(actualdata.equals(data))
	    {
	    	
	    System.out.println("verification passed");
	    }else {
	    	throw exception;
	    }*/
	    	
	    jswait.loadClick(JobSave);		
	}
	
	
	public void dfejobverification(String filename,String keyword) throws Exception{
		jswait.loadClick(logiceditor);
		
		jswait.loadClick(simulate);
		
		File NormalInput = new File("DKInputfile\\"+filename);
	   
		emailSelectResourceButton.sendKeys(NormalInput.getAbsolutePath());
		Thread.sleep(5000);	
		jswait.loadClick(result);
	    Thread.sleep(5000);	
	  
	    Exception exception=new Exception("verification of dk job not handled in if else loop");
	   
	 if(keyword.equals("numeric")) {
		 
	   jswait.waitUntil("//table/tbody/tr[1]/td[1]/span[text()='10']/../../td[2]/span[text()='10']/../../td[3]/span[text()='11']/../../td[4]/span[text()='15.0']/../../td[5]/span[text()='1112345474757']/../../td[6]/span[text()='20.3']/../../td[7]/span[text()='30.3']/../../td[8]/span[text()='40']/../../td[9]/span[text()='100.0']/../../td[10]/span[text()='105']/../../td[11]/span[text()='116']/../../td[12]/span[text()='1.0']/../../td[13]/span[text()='10']/../../td[14]/span[text()='5']/../../td[15]/span[text()='5.0']/../../td[16]/span[text()='5']/../../td[17]/span[text()='10']/../../td[18]/span[text()='10.0']/../../td[19]/span[text()='10.6']/../../td[20]/span[text()='11.0']/../../td[21]/span[text()='0.3000000000000007']/../../td[22]/span[text()='0.3']/../../td[23]/span[text()='30']/../../td[24]/span[text()='']/../../td[25]/span[text()='']/../../td[26]/span[text()='5.0']/../../td[27]/span[text()='']/../../td[28]/span[text()='10.6']/../../td[29]/span[text()='10.5678']");
	 }else if(keyword.equals("String")){
		 jswait.waitUntil("/html//div[@id='mainContainer']//app-router[@id='router']/app-route[18]/data-connector/dk-ui/dk-job-lists/dk-workflow/iron-pages/test-model//tbody/tr[1]/td[1]/span[@title='Name']/../../td[2]/span[contains(.,'test')]/../../td[3]/span[contains(.,'TEST')]/../../td[4]/span[contains(.,'4')]/../../td[5]/span[contains(.,'TEST')]/../../td[6]/span[contains(.,'test')]/../../td[7]/span[contains(.,'Nametest')]/../../td[8]/span[contains(.,'Name test')]/../../td[9]/span[contains(.,'testName')]/../../td[10]/span[contains(.,'test')]/../../td[11]/span[contains(.,'testName')]/../../td[12]/span[contains(.,'test')]/../../td[13]/span[contains(.,'Name')]/../../td[14]/span[contains(.,'test')]/../../td[15]/span[contains(.,'true')]/../../td[16]/span[contains(.,'true')]/../../td[17]/span[contains(.,'check')]/../../td[18]/span[contains(.,'check1')]/../../td[19]/span[contains(.,'CHECK')]/../../td[20]/span[contains(.,'CHECK1')]/../../td[21]/span[contains(.,'')]/../../td[22]/span[contains(.,'122')]/../..//td[23][contains(.,'')]/../..//tr[1]//td[24][contains(.,'')]");
		 //jswait.waitUntil("/html//div[@id='mainContainer']//app-router[@id='router']/app-route[18]/data-connector/dk-ui/dk-job-lists/dk-workflow/iron-pages/test-model//tbody/tr[1]/td[1]/span[@title='Name']/../../td[2]/span[contains(.,'test')]/../../td[3]/span[contains(.,'TEST')]/../../td[4]/span[contains(.,'4')]/../../td[5]/span[contains(.,'TEST')]/../../td[6]/span[contains(.,'test')]/../../td[7]/span[contains(.,'Nametest')]/../../td[8]/span[contains(.,'Name test')]/../../td[9]/span[contains(.,'testName')]/../../td[10]/span[contains(.,'test')]/../../td[11]/span[contains(.,'testName')]/../../td[12]/span[contains(.,'test')]/../../td[13]/span[contains(.,'Name')]/../../td[14]/span[contains(.,'test')]/../../td[15]/span[contains(.,'true')]/../../td[16]/span[contains(.,'true')]/../../td[17]/span[contains(.,'check')]/../../td[18]/span[contains(.,'check1')]/../../td[19]/span[contains(.,'CHECK')]/../../td[20]/span[contains(.,'CHECK1')]/../../td[21]/span[contains(.,'')]/../../td[22]/span[contains(.,'122')]/../../td[23]/span[contains(.,'2')]/../../td[24]/span[contains(.,'')]");
	 }
	 else if(keyword.equals("Date")){
		 jswait.waitUntil("/html//div[@id='mainContainer']//app-router[@id='router']/app-route[18]/data-connector/dk-ui/dk-job-lists/dk-workflow/iron-pages/test-model//tbody/tr[2]/td[1]/span[contains(.,'01022017 00:00:00.0+0000')]/../../td[2]/span[contains(.,'15062017 01:02:00.0+0530')]/../../td[3]/span[contains(.,'17062017 02:02:00.0+0530')]/../../td[4]/span[contains(.,'176400000')]/../../td[5]/span[contains(.,'100')]/../../td[6]/span[contains(.,'1.2')]/../../td[7]/span[contains(.,'')]/../../td[8]/span[contains(.,'1000.0')]/../../td[9]/span[contains(.,'1000.0')]");
	 }
	 else if(keyword.equals("Lookup")){
		 jswait.waitUntil("/html//div[@id='mainContainer']//app-router[@id='router']/app-route[18]/data-connector/dk-ui/dk-job-lists/dk-workflow/iron-pages/test-model//tbody/tr[2]/td[1]/span[contains(.,'919745087972')]/../../td[2]/span[contains(.,'')]/../../td[3]/span[contains(.,'')]/../../td[4]/span[contains(.,'')]");
		 //jswait.waitUntil("/html//div[@id='mainContainer']//app-router[@id='router']/app-route[18]/data-connector/dk-ui/dk-job-lists/dk-workflow/iron-pages/test-model//tbody/tr[2]/td[1]/span[contains(.,'919745087972')]/../../td[2]/span[contains(.,'2')]/../../td[3]/span[contains(.,'')]/../../td[4]/span[contains(.,'')]");
	 }else {
		 throw exception;
	 }

	    	
	    jswait.loadClick(JobSave);		
	}
	
	
}