package pageObjetcs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;

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
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Metrics')]")
	private WebElement usageMetricsTab;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Customer Support')]")
	private WebElement customerSupportTab;
	@FindBy(xpath="//label[contains(text(),'Customer Number')]/../../../../../../..//paper-icon-button[1]")
	private WebElement searchIcon;
	
	@FindBy(xpath=".//div[@id='mainContainer']//app-router[@id='router']/app-route//iron-pages//paper-card//iron-icon[@title='Set current attributes as default']")
	private WebElement saveAttributeButton;
	
	
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
	@FindBy(xpath=".//paper-card//paper-checkbox/div[@id='checkboxLabel']")
	private List <WebElement> eventNamesList;
	
	
	@FindBy(xpath=".//h4[contains(.,'Acknowledgement Details')]")
	private WebElement acknowledgementDetails;
	@FindBy(xpath=".//h4[contains(.,'Conversion Details')]")
	private WebElement conversionDetails;
	@FindBy(xpath=".//h4[contains(.,'Fulfillment Details')]")
	private WebElement fulfillmentDetails;
	
	
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
	@FindBy(xpath=".//paper-card[@class='attributes layout vertical style-scope consumer-metrics x-scope paper-card-0']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']")
    private WebElement selectedAttributes;
	
	@FindBy(xpath=".//paper-card[@class='attributes layout vertical style-scope consumer-metrics x-scope paper-card-0']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']")
    private List <WebElement> selectedAttributesList;
	
	@FindBy(xpath="//*[contains(text(),'Include Sub-Partners')]")
	private WebElement IncludeSubPartners;
	@FindBy(xpath=".//iron-data-table[@id='consumerSubList']//iron-list[@id='list']/div//data-table-row")
	private WebElement subscribedToList;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab")
	private List <WebElement> SearchEventsList;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab[@aria-selected='true']")
	private WebElement todayTab;
	
	@FindBy(xpath=".//div[contains(text(),' No events available. Please try changing your filter settings.')]")
	private WebElement noEventsMessage;
	
	@FindBy(xpath="//div[@val='event']//iron-list[@id='list']//data-table-row")
	private WebElement eventsTable;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab/div[contains(.,'Last 90 Days')]")
	private WebElement SearchEvents90;
	@FindBy(xpath=".//customer-support//search-events//paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab/div[contains(.,'Last 90 Days')]")
	private WebElement customerSupportSearchEvents90;
	
	@FindBy(xpath="//div[@val='event']//iron-list[@id='list']//data-table-row//span[text()='Conversion']")
	private WebElement conversionEventsTable;
	
	@FindBy(xpath=".//div[@id='mainContainer']//iron-icon[@title='Delete']")
	private List <WebElement> deleteAttributeIconList;
	@FindBy(xpath=".//paper-toast[@id='toast']//span[text()='Maximum of 5 attributes can only be viewed']")
	private WebElement addAttributeToastMessage;
	
	@FindBy(xpath="//div[@val='support']//iron-list[@id='list']//data-table-row")
	private WebElement customerSupportEventsTable;
	@FindBy(xpath="//div[@val='support']//iron-list[@id='list']//data-table-row")
	private List <WebElement> customerSupportEventsTableList;
	
	@FindBy(xpath="//div[@id='mainContainer']//div[@class='layout horizontal style-scope consumer-events']//paper-checkbox/div[@id='checkboxContainer']")
	private List <WebElement> eventTypesList;
	
	@FindBy(xpath=".//div[@id='mainContainer']//div[@class='layout horizontal style-scope consumer-events']//paper-checkbox/div[@id='checkboxContainer']//div[@class='checked  style-scope paper-checkbox']")
	private WebElement eventTypesSelected;
	
	@FindBy(xpath=".//div[@id='mainContainer']//div[@class='layout horizontal style-scope consumer-events']//paper-checkbox/div[@id='checkboxContainer']//div[@class='checked  style-scope paper-checkbox']")
	private List <WebElement> eventTypesSelectedList;
	
	@FindBy(xpath=".//paper-card//div[contains(text(),'Daily Trend')]")
	private WebElement dailyTrend;
	@FindBy(xpath=".//paper-card//div[contains(text(),'Weekly Trend')]")
	private WebElement weeklyTrend;
	@FindBy(xpath=".//paper-card//div[contains(text(),'Monthly Trend')]")
	private WebElement monthlyTrend;
	
	@FindBy(xpath=".//div[@id='lineChart3']")
	private WebElement monthlyTrendChart;
	@FindBy(xpath=".//div[@id='lineChart2']")
	private WebElement weeklyTrendChart;
	@FindBy(xpath=".//div[@id='lineChart1']")
	private WebElement dailyTrendChart;
	
	
	
	
	
	
	
	
	
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
		jswait.loadClick(customerSupportTab);
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
 public void chooseAllEvents() throws InterruptedException {
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
	 	jswait.loadClick(usageMetricsTab);
		jswait.loadClick(addButton);
	 
 }
 
 public void clickSaveAttributeButton() throws InterruptedException {
	 	jswait.loadClick(saveAttributeButton);
	 
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
	  
	   List <WebElement> afterlist=driver.findElements(By.xpath("//div[@id='mainContainer']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']"));
	   int afterDeletelist=afterlist.size();
	   Exception DeleteException=new Exception("Deletion not working");
	   Exception AddException=new Exception("Addition not working");
	   if(defaultList<afterDeletelist)
		   throw DeleteException;
	   Thread.sleep(2000);
	   clickAddAttributeDropdown();
	   clickAttribute();
	   clickUsageMetricsTab();
	   clickAddButton();
	   jswait.loadClick(deleteAttributeIcon);
	   List <WebElement> addlist=driver.findElements(By.xpath("//div[@id='mainContainer']//paper-checkbox[@role='checkbox']/div[@id='checkboxContainer']"));
	   int afteraddlist=addlist.size();
	   
	   if(afteraddlist<afterDeletelist)
		   throw AddException;
	   
	   checkUncheckAttributeAddButton();
	   
	   
 
 }
 public void verifyIncludeSubPartnersOption() throws InterruptedException {
		
 	assertTrue(IncludeSubPartners.isDisplayed());
 	
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
 
     public void verifyTabSelectedByDefault() throws Exception {
	 
	 
    	 String S=todayTab.getText();
    	 System.out.println("Text on the tab selected by default: "+S);
    	 try {
    		 if(S.equals("Today"))
    			 System.out.println("Today tab is selected by default");
    		 
    	 }
    	catch(Exception e)  {
    		
    		e.printStackTrace();
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
			  if(customerSupportEventsTableList.size()>0) {
				 
				  Boolean s= customerSupportEventsTable.isDisplayed(); 
				  System.out.println("Table displayed: "+s);
				  jswait.loadClick(customerSupportEventsTable);
				  assertTrue(acknowledgementDetails.isDisplayed());
				  assertTrue(conversionDetails.isDisplayed());
				  assertTrue(fulfillmentDetails.isDisplayed());
			  
			  }
			  else {
				  
				  System.out.println("Tab is empty");
				  
			  }
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
 
   public void verifyEventsRowInCustomerSupportTab() throws Exception {
	   
	   jswait.loadClick(customerSupportSearchEvents90);
	   Thread.sleep(4000);
	   assertTrue(customerSupportEventsTable.isDisplayed());
	   jswait.loadClick(customerSupportEventsTable);
	   assertTrue(acknowledgementDetails.isDisplayed());
	   assertTrue(conversionDetails.isDisplayed());
	   assertTrue(fulfillmentDetails.isDisplayed());
	   
   }
   public void chooseFirstEventType() throws Exception {
			
		  //int type=eventTypesList.indexOf(type);
		  
		    Iterator<WebElement> typeIter = eventTypesList.iterator();
			WebElement typeElement = typeIter.next();
			Thread.sleep(2000);
			typeElement = typeIter.next();
			jswait.loadClick(typeElement);
			   
		 
	   
   }
   
   public void verifySelectedEventType() throws Exception {
	   
	   assertTrue(eventTypesSelected.isDisplayed());
   }
   
   
   
   public void verifyFilterigEventTypes() throws Exception {
	   
	   chooseFirstEventType();
	   clickApplyButton();
	   Thread.sleep(3000);
	   verifySelectedEventType();
	   
	   
   }
   
   public void verifyForSavingCheckedAttributes() throws Throwable {
   
   if(deleteAttributeIconList.size()>0) {
		
		for(WebElement deleteButton : deleteAttributeIconList) 		
			jswait.loadClick(deleteButton);
		
				for(int i=0;i<5;i++) {
		        
				clickAddAttributeDropdown();
				clickAttribute();
				clickAddButton();
				
				}
				
	  for(WebElement attribute : selectedAttributesList) 		
		jswait.loadClick(attribute);
	  
	    clickSaveAttributeButton();
	    
	    clickEventsTab();
	    clickUsageMetricsTab();
	    Thread.sleep(2000);
	    
	 for(WebElement attribute : selectedAttributesList)	
		 assertTrue(attribute.isDisplayed());
		 
   
   }
   
   }
   
   public void verifyCharts() throws Throwable {
	   
	   Thread.sleep(2000);
	   assertTrue(dailyTrend.isDisplayed());
	   assertTrue(dailyTrendChart.isDisplayed());
	   assertTrue(weeklyTrend.isDisplayed());
	   assertTrue(weeklyTrendChart.isDisplayed());
	   assertTrue(monthlyTrend.isDisplayed());
	   assertTrue(monthlyTrendChart.isDisplayed());
	      
   }
   
   public void verifySelectedEventsDisplayedInTheEventsTab() throws Throwable {
	   
	   jswait.loadClick(SearchEvents90);
	   if(eventTypesSelectedList.size()>0) {
		   
		   for(WebElement type:eventTypesSelectedList) {
			   
			   String S=type.getText();
			   
			   assertTrue(driver.findElement(By.xpath(".//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'"+S+"')]")).isDisplayed());
			      
		   }  
	   } 
	   
	   int size=eventTypesSelectedList.size();
	   
	    Iterator<WebElement> typeIter = eventTypesList.iterator();
		WebElement typeElement = typeIter.next();
		Thread.sleep(2000);
		
		for(int i=0;i<=size;i++) {
		typeElement = typeIter.next();
		}
		jswait.loadClick(typeElement);
		clickApplyButton();
		Thread.sleep(3000);
		
		if(eventTypesSelectedList.size()>0) {
			   
			   for(WebElement type:eventTypesSelectedList) {
				   
				   String St=type.getText();
				   assertTrue(driver.findElement(By.xpath(".//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'"+St+"')]")).isDisplayed());
				      
			   }  
		   }
		
		/*size=eventTypesSelectedList.size();
		Iterator<WebElement> nameIter = eventNamesList.iterator();
		WebElement nameElement = nameIter.next();
		Thread.sleep(2000);
		
		for(int i=0;i<=size;i++) {
		nameElement = nameIter.next();
		}
		String str=nameElement.getText();
		System.out.println(str);
		WebElement el=driver.findElement(By.xpath(".//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'"+str+"')]"));
		assertFalse("Set as default checkbox is displaying", el.isDisplayed());
		//assertTrue(el.isDisplayed());
		Thread.sleep(3000);*/
		
		
		
	   
   }

}
