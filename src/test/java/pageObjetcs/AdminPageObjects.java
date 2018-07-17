package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class AdminPageObjects extends Init{
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public AdminPageObjects() {
		PageFactory.initElements(driver, this);
	}

	//For Partner setting page
	@FindBy(xpath=".//*[@id='mainContainer']/paper-menu/div/paper-item[contains(.,'Broadcast Settings')]")
	private WebElement BCSettings;
	
	@FindBy(xpath="//div[contains(text(),'Creator and selected users')]/..")
	private WebElement selectedusers;
	
	@FindBy(xpath="//div[contains(text(),'All users')]/..")
	private WebElement Allusers;
	@FindBy(xpath="//div[contains(text(),'Partners')]")
	private WebElement partnerOption;
	@FindBy(xpath="//paper-item[contains(.,'Edit')]")
	private WebElement optionsEdit;  
	@FindBy(xpath="//paper-item[contains(.,'Configure')]")
	private WebElement optionsConfigure; 
	@FindBy(xpath="//paper-item[contains(.,'Activate')]")
	private WebElement optionsActivate;
	@FindBy(xpath="//paper-item[contains(.,'Deactivate')]")
	private WebElement optionsDeactivate;
	@FindBy(xpath=".//paper-dialog[@id='helpDialog']")
	private WebElement HelpPanel;
	
	@FindBy(xpath="//paper-item[contains(.,'Configure')]")
	private List <WebElement> optionsConfigureList; 
	@FindBy(xpath="//paper-item[contains(.,'Activate')]")
	private List <WebElement> optionsActivateList;
	@FindBy(xpath="//paper-item[contains(.,'Deactivate')]")
	private List <WebElement> optionsDeactivateList;
	
	@FindBy(xpath="//paper-dialog[@id='managePartner']//data-table-row")
	private List <WebElement> dashboardRow;
	
	@FindBy(xpath="//paper-dialog[@id='managePartner']//data-table-row//data-table-cell/span[text()='Active']")
	private List <WebElement> statusActiveList;
	@FindBy(xpath="//paper-dialog[@id='managePartner']//data-table-row//data-table-cell/span[text()='In-Active']")
	private List <WebElement> statusInactiveList;
	@FindBy(xpath="//label[contains(.,'Dashboards')]")
	private WebElement optionsDashboard;
	@FindBy(xpath=".//paper-toolbar//flytxt-context-help//paper-icon-button//iron-icon[@id='icon']//img")
	private WebElement iconHelp;
	
	
	
	@FindBy(xpath="//paper-item[contains(.,'Dashboard Settings')]")
	private WebElement dashboardSettings;
	@FindBy(xpath="//data-table-cell[contains(.,'Status')]")
	private WebElement statusTitle;
	@FindBy(xpath="//data-table-cell[1]")
	private WebElement dataTable1;
	@FindBy(xpath="//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsIcon;
	@FindBy(xpath="//paper-dialog[@id='managePartner']//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement configuireOptionsIcon;
	
	
	@FindBy(xpath="//paper-dialog[@id='managePartner']//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private List <WebElement> dashboardlist;
	
	@FindBy(xpath="//data-table-cell[contains(.,'Digital Experience Monitor')]")
	private WebElement DashboardName;
	
	@FindBy(xpath="//div[text()='Campaign Performance Monitor']")
	private WebElement CampaignPerformanceMonitor;
	
	
	//iron-data-table[#'dashboardGrid']/?/?/iron-list[@id='list']/div/div[1]/data-table-row[@safeclass~'\bdashboard-table\b.*\bdata-table-row-0\b.*\bstyle-scope\b.*\bx-scope\b']//paper-menu-button[@role='group']/?/?/paper-icon-button[@alt='menu']/iron-icon[@id='icon']
	
	@FindBy(xpath=".//label[text()='Partner Name']/..//input")
	private WebElement partnerNameField;
	@FindBy(xpath="//dashboard-configuration//paper-button[text()='Save']")
	private WebElement cancelButton;
	
	//*[@id="main"]/div[1]/iron-pages/dashboard-settings/dashboard-configuration/div/div/div/paper-button[1]
	
	@FindBy(xpath="//dashboard-configuration//paper-button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath=".//manage-partner-settings//paper-button[text()='Cancel']")
	private WebElement editCancelButton;
	//BCSeetings Save button in Partner page
	@FindBy(xpath=".//*[@id='form']/div/div/paper-button[text()='Save']")
	private WebElement BCSaveButton;
	
	@FindBy(css="#clear > #icon")
	private WebElement SettingsClose;
	
	
	public void clickPartnerOption() throws InterruptedException{
		jswait.loadClick(partnerOption);
	}
	public void clickEditOption() throws InterruptedException{
		jswait.loadClick(optionsEdit);
	}
	
	public void clickConfigureOption() throws InterruptedException{
		jswait.loadClick(optionsConfigure);
	}
	public void clickDashboardSettingsOption() throws InterruptedException{
		jswait.loadClick(dashboardSettings);
		Thread.sleep(2000);
	}
	
	public void checkStatusTitle() throws InterruptedException{
		if(statusTitle.isDisplayed())
		{
			System.out.println("Satus title is displayed.");
    		
	}
		
	}
	
   public void editPartnerTitle(String name) throws InterruptedException {
		
		jswait.loadSendKeys(partnerNameField, name);
	}
   
   public void clickEditCancelButton() throws InterruptedException {
		
	   jswait.loadClick(editCancelButton);
	}
   public void clickOptionsIcon() throws InterruptedException{
	   //String st=dataTable1.getText();
	   //System.out.println(st);
	   //if(dataTable1!=null)
	   Thread.sleep(2000);
		jswait.loadClick(optionsIcon);
	}
   public void clickConfiguireOptionsIcon() throws InterruptedException{
	   String st=DashboardName.getText();
	   System.out.println(st);
	   try {
	   if(st.equals("Digital Experience Monitor"))
		jswait.loadClick(configuireOptionsIcon);
	   }
	   catch(Exception e) {
		   
		  e.getMessage(); 
	   }
	   
	}
   
	public void editPartnerName(String name) throws InterruptedException {
		editPartnerTitle(name);
		Thread.sleep(3000);
		clickEditCancelButton();
	}
	
	public void checkCancelSaveButton() throws InterruptedException {
		    
		   Thread.sleep(4000);	
		   assertTrue(cancelButton.isDisplayed());
		   assertTrue(saveButton.isDisplayed());
		 }
	
	public void checkEachDashboard() throws Exception {
	List <WebElement> dashboardlist=driver.findElements(By.xpath("//paper-dialog[@id='managePartner']//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../.."));
	System.out.println("Number of elements in the list:"+dashboardlist.size());
	Iterator<WebElement> configIter = optionsConfigureList.iterator();
	Iterator<WebElement> actIter = optionsActivateList.iterator();
	Iterator<WebElement> deactIter = optionsDeactivateList.iterator();
	
	WebElement configElement = configIter.next();
	WebElement actElement = actIter.next();
	WebElement deactElement = deactIter.next();
	System.out.println("con"+optionsConfigureList.size());
	System.out.println("act"+optionsActivateList.size());
	System.out.println("dea"+optionsDeactivateList.size());
	Exception actElementExcep = new Exception("activate element not found");
	Exception deactElementExcep = new Exception("deactivate element not found");
	if(dashboardlist.size()>0) {
		
		for(WebElement dashboard : dashboardlist)  {
			
	    jswait.loadClick(dashboard);
	    Thread.sleep(2000);
	    System.out.println("assert conf");
		assertTrue(configElement.isDisplayed());
		System.out.println("conf element");
		if(configIter.hasNext())
		configElement = configIter.next();
		
		
		try {
			if(!actElement.isDisplayed())
				throw actElementExcep;
			System.out.println("act element");
			if(actIter.hasNext())
			actElement = actIter.next();
			
		}
		
		catch(Exception e) {
			if(!deactElement.isDisplayed())
				throw deactElementExcep;
			System.out.println("deact element");
			if(deactIter.hasNext())
			deactElement = deactIter.next();
			
		}
		
		//actElement = actIter.next();
		//deactElement = deactIter.next();
		jswait.loadClick(dashboardSettings);
		 System.out.println("dashboard Settings click");
		/*//System.out.println(optionsDeactivate.isDisplayed());
		System.out.println(optionsActivate.isDisplayed());
		
		assertTrue(optionsActivate.isDisplayed()||optionsDeactivate.isDisplayed());
		jswait.loadClick(DashboardName);*/
		
		}
		
	
	}
	
	
	}
	
	public void checkStatusForEachDashboard() throws Exception {
		
		
		
		System.out.println("Number of elements in the list:"+dashboardRow.size());
		Iterator<WebElement> StatusActiveIter = statusActiveList.iterator();
		Iterator<WebElement> StatusInactiveIter = statusInactiveList.iterator();
		
		WebElement ActiveElement = StatusActiveIter.next();
		WebElement InactiveElement = StatusInactiveIter.next();
		System.out.println("act"+statusActiveList.size());
		System.out.println("inact"+statusInactiveList.size());
		//Exception actElementExcep = new Exception("Active status not found");
		Exception ElementExcep = new Exception("Status not found");
		
		
		Iterator<WebElement> rowIter = dashboardRow.iterator();
		rowIter.next();
		WebElement row = rowIter.next();
		if(dashboardRow.size()>0) {
//		for(WebElement row : dashboardRow) {
			while(rowIter.hasNext()) {

			
			assertTrue(row.isDisplayed());
			String data = row.getText();
			System.out.println(data);
			if(!data.contains("Active"))
				throw ElementExcep;
			
//		    // row = rowIter.next();
//			try {
//				//System.out.println("try:inactive:"+InactiveElement.isDisplayed()+"active:"+ActiveElement.isDisplayed());
//				//row.findElement(By.xpath(statusActiveList.))
//				
//				
//				String pattern = "\".*Active.*\"";
//				 boolean matches = Pattern.matches(pattern, data);
//				if(!matches)      //data.matches("\\n(Active)\\n")
//					throw actElementExcep;
//				
//			}
			
			row = rowIter.next();
			

			}
		}
			
		
	}
	
	 public void clickCampaignPerformanceMonitor() throws InterruptedException {
	  		
			jswait.loadClick(CampaignPerformanceMonitor);
		}
	  
	 public void clickDashboardOption() throws InterruptedException {
			
			jswait.loadClick(optionsDashboard);
		}
		
	 public void clickHelpIcon() throws InterruptedException {
			
			jswait.loadClick(iconHelp);
		}
	  
	 public void verifyHelpPanel() throws Exception {
		   
		   Exception ElementExcep = new Exception("Help panel not found");
		   
		    Thread.sleep(2000);
	        if(!HelpPanel.isDisplayed());
	        throw ElementExcep;
		
	   }
		//to click BCsettings page in Partners page
		public void clickBCSettings() throws InterruptedException{
				jswait.loadClick(BCSettings);
			}
		//To select user
		public void selectUsers() throws InterruptedException{
			jswait.loadClick(selectedusers);
		}
		
		//To check BCSettings element is displayed
		public void checkBCConfiguration() throws InterruptedException{
			assertTrue(selectedusers.isDisplayed());
			assertTrue(Allusers.isDisplayed());
		}
		public void BCSaveSettings() throws InterruptedException{
			jswait.loadClick(BCSaveButton);
		}
		
		public void BCSettingsclose() throws InterruptedException{
			//driver.findElement(By.cssSelector("#clear > #icon")).click();
			jswait.loadClick(SettingsClose);
			Thread.sleep(5000);
		}

}
