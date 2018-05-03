package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class CustomerProfilePage extends Init{
	public CustomerProfilePage() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();

	@FindBy(xpath="//div[contains(text(),'Customer Profile')]/..")
	private WebElement customerProfile;
	@FindBy(xpath=".//*[@id='crumbs']/flytxt-breadcrumb[3]/paper-button[contains(text(),'Reports')]/../../flytxt-breadcrumb[4]/paper-button[contains(text(),'Customer Profile')]")
	private WebElement customerProfileBreadcrumb;	
	@FindBy(xpath="//label[contains(text(),'Customer Number')]/../input")
	private WebElement customerNumberInput;
	@FindBy(xpath="//paper-button[contains(.,'Search')]")
	private WebElement customerProfileSearchButton;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Subscribed to Lists')]")
	private WebElement subscribedToListsTab;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Customer Info')]")
	private WebElement customerInfoTab;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Events')]")
	private WebElement eventsTab;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Usage Metrics')]")
	private WebElement usageMetricsTab;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Customer Support')]")
	private WebElement customerSupportTab;
	@FindBy(xpath="//label[contains(text(),'Customer Number')]/../../../../../../..//paper-icon-button[1]")
	private WebElement searchIcon;
	
	@FindBy(xpath="//paper-button[contains(text(),'Search')]")
	private WebElement searchNumberIcon;
	
	@FindBy(xpath=".//paper-checkbox//div[contains(.,'Select Event Types')]")
	private WebElement checkboxEventTypes;
	@FindBy(xpath=".//div[@id='mainContainer']//iron-icon[@title='Apply']")
	private WebElement applyButton;
	@FindBy(xpath=".//paper-toast[@id='toast']//span[text()='Please select atleast one event type before applying']")
	private WebElement applyToastMessage;
	@FindBy(xpath=".//iron-data-table[@id='consumerSubList']//iron-icon[@title='Unsubscribe']")
	private WebElement unsubscribeButton;
	@FindBy(xpath=".//iron-data-table[@id='consumerSubList']//iron-list[@id='list']/div//data-table-row")
	private List <WebElement> subscribedToListElements;
	
	@FindBy(xpath=".//paper-button[text()='Yes']")
	private WebElement yesButton;
	@FindBy(xpath=".//paper-button[text()='No']")
	private WebElement noButton;
	@FindBy(xpath="//div[@id='mainContainer']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']")
    private List <WebElement> attributeList;
	@FindBy(xpath=".//div[@id='mainContainer']//iron-icon[@title='Delete']")
	private WebElement deleteAttributeIcon;
	@FindBy(xpath="//*[contains(text(),'Selected Attributes')]/../..//paper-tags-input//iron-icon")
	private WebElement addAttributeDropdown;
	@FindBy(xpath="//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'Fulfillment')]")
	private WebElement fulfillmentEventsTable;
	@FindBy(xpath=".//label[contains(text(),'Offer')]")
	private WebElement offerLabel;
	
	@FindBy(xpath=".//label[contains(text(),'Price')]")
	private WebElement priceLabel;
	
	@FindBy(xpath=".//label[contains(text(),'Broadcast')]")
	private WebElement broadcastLabel;
	
	@FindBy(xpath=".//search-events[@class='style-scope customer-support x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab")
	private List <WebElement> customerSupportSearchEventsList;
	
	
	@FindBy(xpath="//*[contains(text(),'Selected Attributes')]/../..//paper-menu//paper-item")
	private WebElement Attribute;
	@FindBy(xpath="//paper-button[contains(text(),'Add')]")
	private WebElement addButton;
	@FindBy(xpath="//div[@id='mainContainer']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']")
    private WebElement selectedAttributes;
	
	@FindBy(xpath="//*[contains(text(),'Include Sub-Departments')]")
	private WebElement IncludeSubDepartments;
	@FindBy(xpath=".//iron-data-table[@id='consumerSubList']//iron-list[@id='list']/div//data-table-row")
	private WebElement subscribedToList;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab")
	private List <WebElement> SearchEventsList;
	@FindBy(xpath=".//div[contains(text(),' No events available. Please try changing your filter settings.')]")
	private WebElement noEventsMessage;
	
	@FindBy(xpath="//div[@val='event']//iron-list[@id='list']//data-table-row")
	private WebElement eventsTable;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab/div[contains(.,'Last 90 Days')]")
	private WebElement SearchEvents90;
	@FindBy(xpath="//div[@val='event']//iron-list[@id='list']//data-table-row//span[text()='Conversion']")
	private WebElement conversionEventsTable;
	
	@FindBy(xpath=".//div[@id='mainContainer']//iron-icon[@title='Delete']")
	private List <WebElement> deleteAttributeIconList;
	@FindBy(xpath=".//paper-toast[@id='toast']//span[text()='Maximum of 5 attributes can only be viewed']")
	private WebElement addAttributeToastMessage;
	
	@FindBy(xpath="//div[@val='support']//iron-list[@id='list']//data-table-row")
	private WebElement customerSupportEventsTable;
	
	
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	public void clickSearchButton() throws InterruptedException {
		jswait.loadClick(customerProfileSearchButton);
	}
	public void clickSearchIcon() throws InterruptedException {
		jswait.loadClick(searchIcon);
	}
	public void clickCustomerInfoTab() throws InterruptedException {
		jswait.loadClick(customerInfoTab);
	}
	public void clickSubscribedToListsTab() throws InterruptedException {
		jswait.loadClick(subscribedToListsTab);
	}
	public void clickEventsTab() throws InterruptedException {
		jswait.loadClick(eventsTab);
	}
	public void clickUsageMetricsTab() throws InterruptedException {
		jswait.loadClick(usageMetricsTab);
	}
	public void clickCustomerSupportTab() throws InterruptedException {
		jswait.loadClick(customerInfoTab);
	}
	public void enterValueForMsisdn(String msisdn) throws InterruptedException {
		jswait.loadSendKeys(customerNumberInput, msisdn);
	}
	public void searchMsisdn(String msisdn) throws InterruptedException {
		enterValueForMsisdn(msisdn);
		clickSearchButton();
	}
	public void navigateToCustomerProfile() throws InterruptedException {
		jswait.loadClick(customerProfile);
	}
	public boolean checkCustomerProfileBreadcrumb() throws InterruptedException{
		if(customerProfileBreadcrumb.isDisplayed()) {
			return true;
		}
		else return false;
	}
	
 public void enterCustomerNumber(String number) throws InterruptedException {
		
		jswait.loadSendKeys(customerNumberInput,number);
	}
 
 public void clickSearchNumberIcon() throws InterruptedException {
		jswait.loadClick(searchNumberIcon);
	}
 
 public void clickEventTypeCheckbox() throws InterruptedException {
		jswait.loadClick(checkboxEventTypes);
		jswait.loadClick(checkboxEventTypes);
	}
 public void clickApplyButton() throws InterruptedException {
		jswait.loadClick(applyButton);
	}
 
 public void verifyToastMessagege() throws InterruptedException {
		
		assertTrue(applyToastMessage.isDisplayed());
	}

 public void clickUnsubscribeButton() throws Exception {
		
		Exception emptyException =new Exception ("List empty exception");
		
		if(subscribedToListElements.size()>0) {
	    	
			jswait.loadClick(unsubscribeButton); 
	    	
	    	}
	    	else 
	    		throw emptyException;
	    		//System.out.println("List is empty");
		
		
	}
 
 public void verifyConfirmationMessagePanel() throws InterruptedException {
 	
 	
 	
 	assertTrue(yesButton.isDisplayed());
 	assertTrue(noButton.isDisplayed());
 	jswait.loadClick(noButton);
 	
	}
 public void clickAddAttributeDropdown() throws InterruptedException {
		jswait.loadClick(addAttributeDropdown);
	 
 }
 public void clickAttribute() throws InterruptedException {
		jswait.loadClick(Attribute);
	 
 }
 public void clickAddButton() throws InterruptedException {
		jswait.loadClick(addButton);
	 
 }
 
 
 public void checkUncheckAttributeAddButton() throws InterruptedException {
		
 	try {
 	jswait.loadClick(selectedAttributes);
		jswait.loadClick(selectedAttributes);
		
 	}
 	catch(Exception e)
 	{
 		
 		e.printStackTrace();
 	}
 	
		
	 
 }
 
 public void addDeleteSaveAttributes() throws Exception {
 	
	   int defaultList=attributeList.size();
	   jswait.loadClick(deleteAttributeIcon);
	   List <WebElement> afterlist=driver.findElements(By.xpath("//div[@id='mainContainer']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']"));
	   int afterDeletelist=afterlist.size();
	   Exception DeleteException=new Exception("Deletion not working");
	   Exception AddException=new Exception("Addition not working");
	   if(defaultList<afterDeletelist)
		   throw DeleteException;
	   Thread.sleep(2000);
	   clickAddAttributeDropdown();
	   clickAttribute();
	   clickAddButton();
	   
	   List <WebElement> addlist=driver.findElements(By.xpath("//div[@id='mainContainer']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']"));
	   int afteraddlist=addlist.size();
	   
	   if(afteraddlist<afterDeletelist)
		   throw AddException;
	   
	   checkUncheckAttributeAddButton();
	   
	   
 
 }
 public void verifyIncludeSubDepartmentsOption() throws InterruptedException {
		
 	assertTrue(IncludeSubDepartments.isDisplayed());
 	
	}
 
 public void verifySubscribedToLists() throws Exception {
	   
	   Thread.sleep(2000);
	   assertTrue(subscribedToList.isDisplayed());
	   
	   }
 
 public void verifyEventsRow() throws Exception {
	   
	   /*jswait.loadClick(SearchEvents);
	   Thread.sleep(4000);
	   assertTrue(eventsTable.isDisplayed());
	   jswait.loadClick(eventsTable);
	   assertTrue(offerLabel.isDisplayed());
	   assertTrue(broadcastLabel.isDisplayed());
	   assertTrue(priceLabel.isDisplayed());*/
	  
	   
	    Exception verifyException=new Exception("Exception");
	   
	   
	   if(SearchEventsList.size()>0) {
		
		   for(WebElement event : SearchEventsList)  {
			   
			   Thread.sleep(2000);
			   jswait.loadClick(event);
			   Thread.sleep(4000);
			  
			   try {
				   assertTrue(noEventsMessage.isDisplayed());
				   
			   }
			   
			   catch(Exception e) {
				   
				   assertTrue(eventsTable.isDisplayed());
				   jswait.loadClick(eventsTable);
				   //offerLabel.isDisplayed();
				  // broadcastLabel.isDisplayed();
				  // priceLabel.isDisplayed();
			   }   
		   }
				
	   }
	  
	   }
 
 public void verifyFulfillmentEventsRow() throws Exception {
	   
	   jswait.loadClick(SearchEvents90);
	   Thread.sleep(4000);
	   assertTrue(fulfillmentEventsTable.isDisplayed());
	   jswait.loadClick(fulfillmentEventsTable);
	   assertTrue(offerLabel.isDisplayed());
	   assertTrue(broadcastLabel.isDisplayed());
	   assertTrue(priceLabel.isDisplayed());
 }
 
 public void verifyConversionEventsRow() throws Exception {
	   
	   jswait.loadClick(SearchEvents90);
	   Thread.sleep(4000);
	   assertTrue(conversionEventsTable.isDisplayed());
	   jswait.loadClick(conversionEventsTable);
	   assertTrue(offerLabel.isDisplayed());
	   assertTrue(broadcastLabel.isDisplayed());
	   assertTrue(priceLabel.isDisplayed());
	   
	   
	   
 }
 
 public void addMaxAttributes() throws Exception {
	   
	   if(deleteAttributeIconList.size()>0) {
		
	for(WebElement deleteButton : deleteAttributeIconList) 		
		jswait.loadClick(deleteButton);
	
			for(int i=0;i<6;i++) {
	        clickAddAttributeDropdown();
			clickAttribute();
			clickAddButton();
			
			}
			
		    assertTrue( addAttributeToastMessage.isDisplayed());
		
	   } 
	      
 }
 
 public void verifyCustomerSupportEventsRow() throws Exception {
	  
	   if(customerSupportSearchEventsList.size()>0) {
		
		   for(WebElement event : customerSupportSearchEventsList)  {
			   
			   Thread.sleep(2000);
			   jswait.loadClick(event);
			   Thread.sleep(4000);
			   
			 Boolean s= customerSupportEventsTable.isDisplayed();
			 
			 System.out.println("Boolean: "+s);
			  
			   /*try {
				   assertTrue(customerSupportEventsTable.isDisplayed());
				   jswait.loadClick(customerSupportEventsTable);
				   offerLabel.isDisplayed();
				   broadcastLabel.isDisplayed();
				   priceLabel.isDisplayed();
				  
			   
			   }
			   
			   catch(Exception e) {
				   
				   assertFalse(customerSupportEventsTable.isDisplayed());
			   
			   }   */
		   }
				
	   }
	  
	   }
 
 public void clickAllEventsCheckbox() throws InterruptedException {
		jswait.loadClick(checkboxEventTypes);
		
	}
 
 public void clickYesButton() throws InterruptedException {
 	
 	
 	//int size=subscribedToListElements.size();
 	//System.out.println("Size= "+size);
 	
 	jswait.loadClick(yesButton); 
 	/*Thread.sleep(3000);
 	int size_new=subscribedToListElements.size();
 	System.out.println("Size new= "+size_new);
 	if(size>size_new) {
 		System.out.println("Deletion Successfull");
 	}
     else
     	System.out.println("Deletion Not Successfull");*/
     	

  }
 
 
}
