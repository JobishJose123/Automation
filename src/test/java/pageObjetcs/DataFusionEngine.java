package pageObjetcs;
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
	@FindBy(xpath="//paper-scroll-header-panel[@id='flytxt-menu-style']/*//label[.='Data Fusion Engine']")
	private WebElement DataFusionEnginebutton;
	@FindBy(xpath="/html//div[@id='mainContainer']//*/div/paper-button[contains(.,'Add Job')]")
	private WebElement AddJobbutton;
	
	@FindBy(xpath = ".//paper-item[contains(.,'Delete')]")
	private WebElement jobdelete;
	
	@FindBy(xpath = "//div/paper-button[contains(.,'Delete')]")
	private WebElement Deleteok;
	
	@FindBy(xpath=".//label[contains(.,'Job Name')]/../input")
	private WebElement Jobname;
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
	//div[@id='tabsContent']/paper-tab[contains(.,'Simulate')]
	@FindBy(xpath="//div[@id='tabsContent']/paper-tab[contains(.,'Simulate')]")
	private WebElement simulate;
    
	@FindBy(xpath="//div[@id='tabsContent']/paper-tab[contains(.,'Logic Editor')]")
	private WebElement logiceditor;
	
	@FindBy(xpath="//platform-job/dk-ui//test-model/div[2]/paper-icon-button[@role='button']/iron-icon[@id='icon']")
	private WebElement result;
	
	@FindBy(xpath=".//dk-ui/dk-workflow/div/*/paper-icon-button[@role='button']/iron-icon[@id='icon']")
	private WebElement JobSave;
	
	
	public void ClickDFEbutton() throws InterruptedException{
		jswait.loadClick(DataFusionEnginebutton);		
	}
	
	public void ClickAddJobbutton() throws InterruptedException{
		jswait.loadClick(AddJobbutton);		
	}
	public void Jobname(String name) throws InterruptedException{
		jswait.loadClick(Jobname);
		jswait.loadSendKeys(Jobname, name);		
	}
	public void Selctconenctor() throws InterruptedException{
		jswait.loadClick(connector);		
		jswait.loadClick(selectFile);
	}
	public void Hostname() throws InterruptedException{
		jswait.loadClick(hostname);		
	}
	public void SelectHostname() throws InterruptedException{
		jswait.loadClick(selecthostname);		
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
	
	public void copy(String jobname) throws InterruptedException, Exception, IOException{
		commonObjects.filterName(jobname);
		commonObjects.clickOptionsIcon();
		broadcastPageObjects.clickCopyBroadcastOption();
		Thread.sleep(2000);
		String copiedjobname = commonObjects.getTextFormTextField(".//label[contains(.,'Job Name')]/../input");
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
		WebElement element = driver.findElement(By.xpath("//div[1]/data-table-row/div[1]/data-table-cell[contains(.,'"+jobname+"')]"));
		Assert.assertFalse("Job Not deleted", element.isDisplayed());
		}
		

}