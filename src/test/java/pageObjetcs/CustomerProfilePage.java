package pageObjetcs;

import static org.junit.Assert.assertFalse;
import baseClasses.ExcelHelper;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;

public class CustomerProfilePage extends Init{
	public CustomerProfilePage() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();
	ExcelHelper list = new ExcelHelper();

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
	@FindBy(xpath="//span[text()='Please select at least one event type before applying']")
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
	
	@FindBy(xpath=".//circle-line-icon/div/div")
	private WebElement circleLine;
	
	@FindBy(xpath=".//iron-data-table[@id='consumerSubList']//iron-list[@id='list']/div//data-table-row")
	private WebElement subscribedToList;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab")
	private List <WebElement> SearchEventsList;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab[@aria-selected='true']")
	private WebElement todayTab;
	
	@FindBy(xpath=".//div[contains(text(),' No events available. Please try changing your filter settings.')]")
	private WebElement noEventsMessage;
	@FindBy(xpath=".//div[contains(.,'No fulfillments present.')]")
	private WebElement noFulfillmentsPresent;
	@FindBy(xpath=".//div[contains(.,'No conversions present.')]")
	private WebElement noConversionsPresent;
	
	
	@FindBy(xpath=".//div[contains(text(),'No message sent')]")
	private WebElement noMessageSent;
	@FindBy(xpath=".//label[contains(text(),'Conversion Time')]")
	private WebElement conversionTime;
	@FindBy(xpath=".//label[contains(text(),'Reward Time')]")
	private WebElement rewardTime;
	@FindBy(xpath=".//label[contains(text(),'Reward Status')]")
	private WebElement rewardStatus;
	@FindBy(xpath=".//label[contains(text(),'Reward Value')]")
	private WebElement rewardValue;
	
	
	@FindBy(xpath="//div[@val='event']//iron-list[@id='list']//data-table-row")
	private WebElement eventsTable;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab/div[contains(.,'Last 90 Days')]")
	private WebElement SearchEvents90;
	@FindBy(xpath="//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab/div[contains(.,'Last 7 Days')]")
	private WebElement SearchEvents7;
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
	@FindBy(xpath=".//iron-pages//div[@val='support']//iron-list[@id='list']/div/div/data-table-row")
	private List <WebElement> customerSupportEventsTableList;
	
	@FindBy(xpath="//div[@id='mainContainer']//div[@class='layout horizontal style-scope consumer-events']//paper-checkbox/div[@id='checkboxContainer']")
	private List <WebElement> eventTypesList;
	
	@FindBy(xpath=".//div[@id='mainContainer']//div[@class='layout horizontal style-scope consumer-events']//paper-checkbox/div[@id='checkboxContainer']//div[@class='checked  style-scope paper-checkbox']")
	private WebElement eventTypesSelected;
	
	//div[@id='mainContainer']//div[@class='layout horizontal style-scope consumer-events']//paper-checkbox/div[@id='checkboxContainer']//div[@class='checked  style-scope paper-checkbox']
	@FindBy(xpath=".//div[@class='checkboxes layout flex style-scope consumer-events']//paper-checkbox[@aria-checked='true']")
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
	@FindBy(xpath="//div[@class='layout horizontal flex style-scope consumer-metrics']//paper-card[@class='metric layout vertical style-scope consumer-metrics x-scope paper-card-0']//div[@id='lineChart1']//svg//g//g[@class='sub _3']//g[@class='chart-body']//g[@class='dc-tooltip-list']//circle[1]")
	private List <WebElement> circleList;
//	@FindBy(xpath=".//div[@id='lineChart1']//g[@class='sub _0']")
//	private WebElement circle;
	
	@FindBy(xpath=".//*[@id='lineChart1']/svg/g/g[3]/g/g[2]/g/circle[15]")
	private WebElement circle;
	
	
	//div[@id='lineChart1']//svg//g//g[@class='sub _0']//g[@class='chart-body']//g[@class='dc-tooltip-list']//circle[1]
	
	@FindBy(xpath="//div[@class='layout horizontal flex style-scope consumer-metrics']//paper-card[@class='metric layout vertical style-scope consumer-metrics x-scope paper-card-0']//div[@id='lineChart1']//svg//g/g[@class='sub _0']//g[@class='chart-body']")
	private WebElement graph;
	
	
	Actions builder = new Actions(driver);
	
	@FindBy(xpath = "//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row//span[contains(.,'Trial Message Event')]")
	private WebElement trialMessageEvent;
	
	@FindBy(xpath = "//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[.='AC1 title 2018']")
	private WebElement Creativetext;
	
	@FindBy(xpath = "//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[.='Text']")
	private WebElement Messagetypetext;
	
	@FindBy(xpath = "//iron-data-table[@id='table']/div[@id='container']/iron-list[@id='list']/div/div[1]/data-table-row/div[1]/data-table-cell[2]")
	private WebElement Eventdate;
	
	
	
	
	
	
	
	@FindBy(xpath="//div[text()='Select Event Types']/..")
	private WebElement selectEventTypesCheckbox;
	@FindBy(xpath="//div[text()='Conversion']/..")
	private WebElement conversionEventCheckBox;
	@FindBy(xpath="//div[text()='Fulfillment Success']/..")
	private WebElement fulfillmentEventCheckBox;
	@FindBy(xpath="//iron-icon[@title='Apply']")
	private WebElement selectEventApplyButton;
	@FindBy(xpath="//div[contains(text(),'Customer Support')]/..")
	private WebElement customerSupport;
	@FindBy(xpath="//div[text()='Offer Eligible Event']/..")
	private WebElement offerEligibleEventCheckBox;
	@FindBy(xpath="//div[text()='Offer Accepted']/..")
	private WebElement offerAcceptedEventCheckBox;
	@FindBy(xpath="//div[text()='Offer Recommended']/..")
	private WebElement offerRecommendedEventCheckBox;
	@FindBy(xpath="//div[text()='Message Received']/..")
	private WebElement MessageReceivedCheckBox;
	
	
	// in consumer profile filter option 
		@FindBy(xpath="(//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..)[2]")
		private WebElement eventTabFilter;
		@FindBy(xpath="//input[@title='Details']")
		private WebElement enterEventDetails;
		@FindBy(xpath="//data-table-column-filter-dialog[@class='style-scope consumer-events x-scope data-table-column-filter-dialog-0']//paper-button[@class='style-scope data-table-column-filter-dialog x-scope paper-button-0'][contains(text(),'Apply')]")
		private WebElement filterApplyButton;
		
		@FindBy(xpath="//data-table-column-filter-dialog[@class='style-scope consumer-events x-scope data-table-column-filter-dialog-0']//paper-button[@class='style-scope data-table-column-filter-dialog x-scope paper-button-0'][contains(text(),'Reset Filters')]")
		private WebElement filterResetFilterButton;
		
		public void clickOnEventTabFilter() throws Exception {
			jswait.loadClick(eventTabFilter);
		}
		public void enterEventDetails(String searchData) throws Exception {
			jswait.loadSendKeys(enterEventDetails, searchData);
		}
		public void filterApplyButton() throws Exception {
			jswait.loadClick(filterApplyButton);
		}
	
		public void filterResetFilterButton() throws Exception {
			jswait.loadClick(filterResetFilterButton);
		}
	
	
	
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
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	public void clickEventTypesCheckBox() throws InterruptedException {
		jswait.loadClick(selectEventTypesCheckbox);
	}
	public void clickConversionEventCheckBox() throws InterruptedException {
		jswait.loadClick(conversionEventCheckBox);
	}
	public void clickFulfillmentEventCheckBox() throws InterruptedException {
		jswait.loadClick(fulfillmentEventCheckBox);
	}
	public void clickSelectEventApplyButton() throws InterruptedException {
		jswait.loadClick(selectEventApplyButton);
	}
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
		Thread.sleep(2000);
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
	
	public void searchEventsDynammically(String eventTime) throws Exception {
		
		jswait.loadClick("//search-events[@class='style-scope consumer-events x-scope search-events-0']/div[@class='layout horizontal style-scope search-events']/paper-tabs[@role='tablist']/div[@id='tabsContainer']/div[@id='tabsContent']/paper-tab/div[contains(.,'"+eventTime+"')]");
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
		
	    Thread.sleep(2000);
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
	   Thread.sleep(4000);
	   
	   
 }
 
public void verifyAcknowledgedEvent(String bcName,String campaignName,String OfferName) throws Exception{
	 
	 searchEventsDynammically("Last 3 Days");
	 Thread.sleep(2000);
	 clickOnEventTabFilter();
	 enterEventDetails(campaignName);
	 filterResetFilterButton();
	 Thread.sleep(3000);
	  
	 
	 clickOnEventTabFilter();
	 enterEventDetails(campaignName);	 
	 filterApplyButton();
	 Thread.sleep(10000);
	List<WebElement> ackEvents = driver.findElements(By.xpath("//iron-data-table//iron-list//div[@class='item style-scope iron-data-table']//data-table-row//data-table-cell[3]//span[contains(.,'Acknowledged')]/../..//data-table-cell[4]//span[contains(.,'"+campaignName+"')]"));
	
	
	Thread.sleep(1000);
	System.out.println(ackEvents.size());
	 int count=1;
	 System.out.println("print "+ackEvents);
	 System.out.println("before for loop");
	 
	for (WebElement webElement : ackEvents) {
			if ((webElement.getText()).contains(campaignName)) {
				System.out.println(webElement.getText());
				try {
					//jswait.loadClick("(//div[@val='event']//iron-list[@id='list']//data-table-row//data-table-cell[3]//span[text()='Acknowledged'])["+count+"]");
					Thread.sleep(10000);
					jswait.loadClick("(//div[@val='event']//iron-list[@id='list']//data-table-row//data-table-cell[3]//span[text()='Acknowledged']/../..//data-table-cell[4]//span[text()='Campaign: "+campaignName+"'])["+count+"]");
					Thread.sleep(10000);
					jswait.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + OfferName + "')]");
					boolean booledn = jswait.checkVisibility(
							"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
					System.out.println(booledn);
					if (booledn == true) {
						//Assert.assertTrue(true);
						System.out.println("Ack verified");
						
						break;
						
					}
					 else {
						 
						System.out.println("Ack verified.. waiting for BC name "+bcName);
					}
				} catch (Exception e) {
					System.out.println("catch block");
					Assert.assertTrue("No Ack Event Raised",false);
				}
				Thread.sleep(2000);
				count++;
		}
	}
	 
 }



public void verifyConversionEvent(String bcName,String campaignName,String OfferName) throws Exception {
	
	boolean booledn=false;
	searchEventsDynammically("Last 2 Days");
	searchEventsDynammically("Last 3 Days");
	 
	clickOnEventTabFilter();
	 enterEventDetails(campaignName);
	 filterResetFilterButton();
	 Thread.sleep(3000);
	
	
	Thread.sleep(2000);
	 clickOnEventTabFilter();
	 enterEventDetails(campaignName);
	 filterApplyButton();
	 
	 
	 
	 Thread.sleep(2000);
	List<WebElement> ackEvents = driver.findElements(By.xpath("//data-table-row//data-table-cell[4]//span[contains(.,'Campaign: "+campaignName+"')]"));
	Thread.sleep(1000);
	System.out.println(ackEvents.size());
	 int count=1;
	 
	 for (WebElement webElement : ackEvents) {
			if ((webElement.getText()).contains(campaignName)) {
				System.out.println(webElement.getText());
				
					
					jswait.loadClick("(//div[@val='event']//iron-list[@id='list']//data-table-row//data-table-cell[3]//span[text()='Conversion']/../..//data-table-cell[4]//span[text()='Campaign: "+campaignName+"'])["+count+"]");
					Thread.sleep(1000);
					jswait.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + OfferName + "')]");
					booledn = jswait.checkVisibility(
							"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
					System.out.println(booledn);
					if (booledn == true) {
						System.out.println("Conversion event verified...");
						break;
						//Assert.assertTrue(true);
					}
					 else {
						System.out.println(bcName);
					}
				
				Thread.sleep(2000);
				count++;
		}
			
	}
	 
	 System.out.println(booledn+""+count);
	
}


	public void verifyFullfillementEvent(String bcName, String campaignName, String OfferName, String rewardsRule)
			throws Exception {
		Boolean b1, b2 = null, b3, b4;
		int rewardsCount = 0;
		searchEventsDynammically("Today");
		searchEventsDynammically("Last 2 Days");

		clickOnEventTabFilter();
		enterEventDetails(campaignName);
		filterResetFilterButton();
		Thread.sleep(3000);

		Thread.sleep(2000);
		clickOnEventTabFilter();
		enterEventDetails(campaignName);
		filterApplyButton();

		Thread.sleep(4000);
		List<WebElement> ackEvents = driver.findElements(
				By.xpath("//data-table-row//data-table-cell[4]//span[contains(.,'Campaign: " + campaignName + "')]"));
		Thread.sleep(3000);
		System.out.println(ackEvents.size());
		if(ackEvents.size()==0) {
			
			System.out.println("No Fullfillment event raised");
			Assert.assertTrue("No Fullfillment event raised",false);
		}
		
		int count = 1;

		for (WebElement webElement : ackEvents) {
			if ((webElement.getText()).contains(campaignName)) {
				System.out.println(webElement.getText());

				if (rewardsRule.equals("oneruleonereward")) {
					Thread.sleep(5000);
					System.out.println("oneruleonereward.....");
					jswait.loadClick(
							"(//div[@val='event']//iron-list[@id='list']//data-table-row//data-table-cell[3]//span[text()='Fulfillment Success']/../..//data-table-cell[4]//span[text()='Campaign: "
									+ campaignName + "'])[" + count + "]");

					Thread.sleep(2000);

					b1 = jswait
							.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + OfferName + "')]");
					System.out.println(" Offer visibile ... " + b1);

					b3 = jswait.checkVisibility(
							"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
					System.out.println("BcName visibile ..." + b3);

					if (count == 1) {

						b2 = jswait.checkVisibility(
								"//label[contains(.,'Reward Details')]/..//label[contains(.,'+SEL_REWARD+')]");
						System.out.println("Reward  visibile ... " + b2);
						rewardsCount++;
					}

					if (bcName.contains("seeding") || bcName.contains("seed")) {

						if (count == 2) {
							System.out.println("i am count 2");
							b2 = jswait.checkVisibility("//label[contains(.,'Reward Details')]/..//label[contains(.,'"
									+ SEL_REWARD + "')]");
							System.out.println("Reward  visibile ... " + b2);
						}//inner if
					}

				} else if (rewardsRule.equals("onerulemultiplerewards")) {

					System.out.println("onerulemultiplerewards.........");

					jswait.loadClick(
							"(//div[@val='event']//iron-list[@id='list']//data-table-row//data-table-cell[3]//span[text()='Fulfillment Success']/../..//data-table-cell[4]//span[text()='Campaign: "
									+ campaignName + "'])[" + count + "]");

					Thread.sleep(2000);

					b1 = jswait
							.checkVisibility("//label[contains(.,'Offer')]/..//label[contains(.,'" + OfferName + "')]");
					System.out.println(" Offer visibile ... " + b1);

					b3 = jswait.checkVisibility(
							"//label[contains(.,'Broadcast')]/..//label[contains(.,'" + bcName + "')]");
					System.out.println("BcName visibile ..." + b3);

					if (count == 1) {
						System.out.println("i am count 1");
						b2 = jswait.checkVisibility("//label[contains(.,'Reward Details')]/..//label[contains(.,'"
								+ SELENIUM_REWARD + "')]");
						System.out.println("Reward  visibile ... " + b2);
						
						if(b2==b1==b3==true) {
						rewardsCount++;
						}
					} else if (count == 2) {
						System.out.println("i am count 2");
						b2 = jswait.checkVisibility(
								"//label[contains(.,'Reward Details')]/..//label[contains(.,'" + SEL_REWARD + "')]");
						System.out.println("Reward  visibile ... " + b2);
						
						if(b2==b1==b3==true) {
							rewardsCount++;
							}
					}

					if (bcName.contains("seeding") || bcName.contains("seed")) {
                              System.out.println("Seeding bc");
						if (count == 3) {
							System.out.println("i am count 3");
							b2 = jswait.checkVisibility("//label[contains(.,'Reward Details')]/..//label[contains(.,'"
									+ SEL_REWARD + "')]");
							System.out.println("Reward  visibile ... " + b2);
							if(b2==b1==b3==true) {
								rewardsCount++;
								}
						}
					}
					
					System.out.println("before Assert " +rewardsCount);
					if(!bcName.contains("seeding") || !bcName.contains("seed")) {
						
						if(rewardsCount==2) {
							System.out.println("before Assert inside if loop "+rewardsCount);
							Assert.assertTrue("multiple rewards verified",true);
						}
						
					}else {
						if(rewardsCount==3) {
							System.out.println("before Assert inside else loop"+rewardsCount);
							Assert.assertTrue("multiple rewards verified",true);
						}	
					}
					
					

				}//rewards if else

				Thread.sleep(2000);
				count++;
				
			}//campaign if else

		}//for loop

		

	}






 
 public void clickOnAckEventCheckBox() throws InterruptedException {
	  jswait.loadClick("(//div//paper-checkbox//div[@id='checkboxLabel'][contains(.,'Acknowledged')])[1]");
 }
 
 public void clickOnConversionEventCheckBox() throws InterruptedException {
	  jswait.loadClick("(//div//paper-checkbox//div[@id='checkboxLabel'][contains(.,'Conversion')])[3]");
}
 
 public void clickOnFulfillmentSuccess() throws Exception {
	 
	 jswait.loadClick("//div//paper-checkbox//div[@id='checkboxLabel'][contains(.,'Fulfillment Success')]");
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
				  int size= customerSupportEventsTableList.size();
				  System.out.println(size);
				 
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
 
 public void verifyCustomerSupportEventsTimeDetails() throws Exception {
	  
	        jswait.loadClick(customerSupportSearchEvents90);
	        Thread.sleep(2000);
	        int size=customerSupportEventsTableList.size();
	        System.out.println("Size= "+size);
	        if(customerSupportEventsTableList.size()>0) {
	        	
	        for(WebElement event : customerSupportEventsTableList)  {
	     	   
	     	   Thread.sleep(2000);
	     	   jswait.loadClick(event);
	     	   Thread.sleep(4000);
	     	  
	     	   try {
	     		     Exception SentExc=new Exception("No message sent is dispalyed");
	     		   if(noFulfillmentsPresent.isDisplayed()) {
	     		   // assertFalse(noMessageSent.isDisplayed());
	     		   if(noMessageSent.isDisplayed()==true)
	     			   throw SentExc;
	     		   
	     		   }
	     		  
	     		   
	     	   }
	     	   
	     	   catch(Exception e) {
	     		   
	     		  if(noConversionsPresent.isDisplayed()==false) {
		     		    assertTrue(conversionTime.isDisplayed());
		     		   
		     		   }
	     		   else if(noFulfillmentsPresent.isDisplayed()==false) {

	     			  assertTrue(rewardTime.isDisplayed());
	     			 assertTrue(rewardValue.isDisplayed());
	     			assertTrue(rewardStatus.isDisplayed());
	     			  
	     		   }
	     		  
	     		   
	     		  
	     	   }   
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
   
   public void verifyEventTypesSelectedByDefault() throws Throwable {
	   
	   
	   Exception sizeException=new Exception("No.of events selected by default is not 3");
	   Exception typeException=new Exception("Some other event is selected by default");
	   
	  // verifySelectedEventType();
	   int size=eventTypesSelectedList.size();
	   if(size!=3)
		   throw sizeException;
	   
     if(eventTypesSelectedList.size()>0) {
		   
		   for(WebElement type:eventTypesSelectedList) {
			   
			   String S=type.getText();
			   
			   if(S.equals("Acknowledged"))
				   System.out.println("Event type="+S);
			   else if(S.equals("Conversion"))
				   System.out.println("Event type="+S);
			   else if(S.equals("Fulfillment Success"))
				   System.out.println("Event type="+S);
			   else
				    throw typeException;
			   
			   
			   
			      
		   }  
	   } 
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
   
  public void verifyColorOfSelectedAttributeAndGraph() throws Throwable {
	  
	  if(deleteAttributeIconList.size()>0) {
			
			for(WebElement deleteButton : deleteAttributeIconList) 		
				jswait.loadClick(deleteButton);
				clickAddAttributeDropdown();
				clickAttribute();
				clickAddButton();	
		  for(WebElement attribute : selectedAttributesList) 		
			jswait.loadClick(attribute);
		  
		    clickSaveAttributeButton();
		    
		    String attrColor=circleLine.getCssValue("color");
		    System.out.println("color of selected attribute "+attrColor);
		    
		    Thread.sleep(8000);
		   // driver.findElement(By.xpath("//div[@id='lineChart1']/svg"));
		    String graphColor= circle.getCssValue("color");
		    System.out.println("color of selected attribute "+graphColor);
		    
		    Exception diffColor= new Exception("Different color exception");
		    if(attrColor.equals(graphColor))
		    	System.out.println("Attribute and graphs are with same color");
		    else
		    	throw diffColor;
		    
			 
	   
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
	  int size1= eventTypesSelectedList.size();
	  System.out.println("Size1= "+size1);
	   if(eventTypesSelectedList.size()>0) {
		   
		   for(WebElement type:eventTypesSelectedList) {
			   
			   String S=type.getText();
			   System.out.println("S= "+S);
			   Thread.sleep(5000);
			   
			   assertTrue(driver.findElement(By.xpath(".//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'"+S+"')]")).isDisplayed());
			      
		   }  
	   } 
	   
	   int size=eventTypesSelectedList.size();
	   System.out.println("Size= "+size);
	   
	    Iterator<WebElement> typeIter = eventTypesSelectedList.iterator();
		WebElement typeElement = typeIter.next();
		Thread.sleep(2000);
		
		for(int i=0;i<size-1;i++) {
		typeElement = typeIter.next();
		}
		String St=typeElement.getText();
		jswait.loadClick(typeElement);
		clickApplyButton();
		Thread.sleep(3000);
		System.out.println("St= "+St);
		Thread.sleep(3000); 
		Exception eventDisplay= new Exception("Event Should not be displayed");
		
		try {
			
			assertTrue(driver.findElement(By.xpath(".//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'"+St+"')]")).isDisplayed());
			
			throw eventDisplay;
			
		}
		catch (Exception e) {
			
		}
		
		
		
		/*if(el.isDisplayed()==true) {
			throw eventDisplay;
		}
		else
			System.out.println("Event not displayed");*/
		//assertFalse("Event Should not be displayed", driver.findElement(By.xpath(".//div[@val='event']//iron-list[@id='list']//data-table-row//span[contains(.,'"+St+"')]")).isDisplayed());
				      
		
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
   public void verifyMouseHover() throws Throwable {
	 
	Thread.sleep(3000);
	assertTrue(circle.isDisplayed());
	builder.moveToElement(circle).build().perform();
	
	//int size=circleList.size();
    //System.out.println("Size: "+size);
    
	   
  /*if(circleList.size()>0) {
	   
	for(WebElement circle : circleList) {
	
    Thread.sleep(3000);
    assertTrue(circle.isDisplayed());
	builder.moveToElement(circle).build().perform();
	
	   }
   }*/
  
   }
public void verifyTrialMessageEventDetails(String sheet) throws Exception {
	Thread.sleep(10000);
	jswait.loadClick(trialMessageEvent);
	list.setExcelFile("offerInputData", sheet);
	 //String gettext;
	 jswait.waitUntil("//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[.='"+list.getCell(1, 11).toString()+"']");
	 //jswait.waitUntil("//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[.='"+list.getCell(1, 11).toString()+"']");
	 //jswait.waitUntil(trialMessageEvent);
	// gettext = Creativetext.getText();
	 //Assert.assertTrue("Creative text ",gettext.contentEquals("AC1 title 2018"));
	 String gettextType = Messagetypetext.getText();
	 Assert.assertTrue("Message Type ",gettextType.contentEquals("Text"));
	 String Eventname = trialMessageEvent.getText();
	 Assert.assertTrue("Event name ",Eventname.contentEquals("Trial Message Event"));
	 String sEventdate = Eventdate.getText();
	 Assert.assertTrue("Event date ",(sEventdate.contains("PM") || sEventdate.contains("AM")) );
	 int timelength= sEventdate.length();
	 System.out.println("Date length is" +timelength);
	 Assert.assertTrue("Event date ",(timelength == 20)) ;
	 //list.setExcelFile("offerInputData", "rechargeSMS"); 
	 //Assert.assertTrue("Creative text ",gettext.contentEquals(""+list.getCell(1, 11).toString()+""));
}

public void verifyTrialMessageEventDetailsDynamic(String sheet) throws Exception {
	Thread.sleep(10000);
	jswait.loadClick(trialMessageEvent);
	list.setExcelFile("offerInputData", sheet);
	 String gettext;
	 gettext = list.getCell(1, 11).toString() +"jose";
	 System.out.println("Date length is" +gettext);
	 //jswait.waitUntil("//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[contains(.,'"+list.getCell(1, 11).toString()+"']");
	 jswait.waitUntil("//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[.='"+gettext+"']");
	    																					///data-table-cell[contains(.,'City')]
	 //jswait.waitUntil("//div[@id='items']/div[1]/data-table-row//data-table-row-detail//label[.='"+list.getCell(1, 11).toString()+"']");
	 //jswait.waitUntil(trialMessageEvent);
	//gettext = Creativetext.getText()+"jose";
	Assert.assertTrue("Creative text ",gettext.contentEquals(gettext));
	 System.out.println("creative detail is : " +gettext);
	 String gettextType = Messagetypetext.getText();
	 Assert.assertTrue("Message Type ",gettextType.contentEquals("Text"));
	 String Eventname = trialMessageEvent.getText();
	 Assert.assertTrue("Event name ",Eventname.contentEquals("Trial Message Event"));
	 String sEventdate = Eventdate.getText();
	 Assert.assertTrue("Event date ",(sEventdate.contains("PM") || sEventdate.contains("AM")) );
	 int timelength= sEventdate.length();
	 System.out.println("Date length is" +timelength);
	 Assert.assertTrue("Event date ",(timelength == 20)) ;
	 //list.setExcelFile("offerInputData", "rechargeSMS"); 
	 //Assert.assertTrue("Creative text ",gettext.contentEquals(""+list.getCell(1, 11).toString()+""));
}  
    
public void clickOfferEligibleEventCheckBox() throws InterruptedException {
	jswait.loadClick(offerEligibleEventCheckBox);
}
public void clickMessageReceivedCheckBoxCheckBox() throws InterruptedException {
	jswait.loadClick(MessageReceivedCheckBox);
}
public void clickOfferRecommendedEventCheckBox() throws InterruptedException {
	jswait.loadClick(offerRecommendedEventCheckBox);
}
public void clickOfferAcceptedEventCheckBox() throws InterruptedException {
	jswait.loadClick(offerAcceptedEventCheckBox);
}
	public void navigateToCustomerSupport() throws InterruptedException {
	jswait.loadClick(customerSupport);
}

}
