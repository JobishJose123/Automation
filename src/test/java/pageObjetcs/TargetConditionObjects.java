 package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class TargetConditionObjects extends Init {
	public TargetConditionObjects() {
		PageFactory.initElements(driver, this);
	}

	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	CommonObjects commonObjects = new CommonObjects();
	public ExcelHelper eM = new ExcelHelper(); 
	@FindBy(xpath="//img[contains(@src,'http://192.168.150.27/images/Flip')]/../..")
	private WebElement targetConditionViewToggle;
	@FindBy(xpath="//paper-item[contains(.,'Usage Metrics')]")
	private WebElement targetConditionTypeUsageMetrics;
	@FindBy(xpath="//paper-item[contains(.,'Revenue Metrics')]")
	private WebElement targetConditionTypeRevenueMetrics;
	@FindBy(xpath="//paper-item[contains(.,'Event Counts')]")
	private WebElement targetConditionTypeEventCounts;
		@FindBy(xpath="(//label[contains(.,'Condition')])[3]//following::input")
	private WebElement customerLocationInsightConditionField;
	@FindBy(xpath="//paper-item[contains(.,'By Month')]")
	private WebElement metricByMonthOption;
	@FindBy(xpath="(//label[contains(.,'Condition')])[3]//following::input")
	private WebElement metricConditionField;
		@FindBy(xpath="//paper-item[contains(.,'max of')]")
	private WebElement metricMaxOf;	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::input//following::iron-icon")
	private WebElement metricMaxOfMonthsSelect;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'this month')][2]")
	private WebElement metricMaxOfMonthThisMonth;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'last month')][2]")
	private WebElement metricMaxOfMonthLastMonth;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'2 months ago')][2]")
	private WebElement metricMaxOfMonthLast2Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'3 months ago')][2]")
	private WebElement metricMaxOfMonthLast3Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'4 months ago')][2]")
	private WebElement metricMaxOfMonthLast4Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'5 months ago')][2]")
	private WebElement metricMaxOfMonthLast5Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'6 months ago')][2]")
	private WebElement metricMaxOfMonthLast6Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'7 months ago')][2]")
	private WebElement metricMaxOfMonthLast7Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'8 months ago')][2]")
	private WebElement metricMaxOfMonthLast8Month;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]//following::paper-item[contains(.,'9 months ago')][2]")
	private WebElement metricMaxOfMonthLast9Month;	
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
	private WebElement targetConditionTypeSelector;
	@FindBy(xpath="//label[contains(.,'Metric')]/../..//input")
	private WebElement usageMetricField;
	@FindBy(xpath="//paper-item[contains(.,'"+SELENIUM_USAGE_METRIC+"')]")
	private WebElement usageMetricUnique;
	@FindBy(xpath="//paper-item[contains(.,'"+SELENIUM_SHARED_METRIC+"')]")
	private WebElement sharedMetricUnique;
	@FindBy(xpath="//paper-item[contains(.,'"+SELENIUM_REVENUE_METRIC+"')]")
	private WebElement revenueMetricSelect;
	@FindBy(xpath="//paper-item[contains(.,'"+SELENIUM_EVENT_COUNTS+"')]")
	private WebElement eventCountsSelect;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[2]")
	private WebElement metricDaySelector;
	@FindBy(xpath="(//label[contains(.,'Select')]/../input)[1]")
	private WebElement metricWeekSelector;
	@FindBy(xpath="//label[contains(.,'Date Part')]/../input")
	private WebElement customerLocationInsightDatePart;
	@FindBy(xpath="//paper-item[contains(.,'DATE')]")
	private WebElement customerLocationInsightDate;
	@FindBy(xpath="//paper-item[contains(.,'today')]")
	private WebElement customerLocationInsightSelectToday;
	@FindBy(xpath="//paper-item[contains(.,'this week')]")
	private WebElement metricWeek;
	@FindBy(xpath="//paper-item[contains(.,'By Week')]")
	private WebElement metricWeekOption;
	@FindBy(xpath="//label[contains(.,'elect')]//following::iron-icon[1]")
	private WebElement customerLocationInsightSelectField;
	@FindBy(xpath=".//field-simple//span[contains(.,'25')]")
	private WebElement editedTC;
	@FindBy(xpath="//paper-item[contains(.,'Customer Profile Info')]")
	private WebElement targetConditionTypeCustomerProfileInfo;
	@FindBy(xpath="//paper-item[contains(.,'System Events')]")
	private WebElement targetConditionTypeSystemEvents;
	@FindBy(xpath="//paper-item[contains(.,'Customer Driven Events')]")
	private WebElement targetConditionTypeCustomerDrivenEvents;
	@FindBy(xpath="//paper-item[contains(.,'Customer Location Insights')]")
	private WebElement targetConditionTypeCustomerLocationInsights;
	@FindBy(xpath="//paper-item[contains(.,'Customer Device Info')]")
	private WebElement targetConditionTypeCustomerDeviceInfo;
	@FindBy(xpath="//paper-item[contains(.,'Customer Demographics')]")
	private WebElement targetConditionTypeCustomerDemographics;
	@FindBy(xpath="//paper-item[contains(.,'Customer Digital Persona')]")
	private WebElement targetConditionTypeCustomerDigitalPersona;
	@FindBy(xpath="//paper-item[contains(.,'Customer Lists')]")
	private WebElement targetConditionTypeCustomerList;
	@FindBy(xpath="//paper-item[contains(.,'Learned Behaviors')]")
	private WebElement targetConditionTypeLearnedBehaviors;
	@FindBy(xpath="//paper-item[contains(.,'AI powered Analytical Scores')]")
	private WebElement targetConditionTypeAIPoweredAnalyticalScores;
	@FindBy(xpath="//paper-item[contains(.,'Digital Engagement Preferences')]")
	private WebElement targetConditionTypeDigitalEngagementPreferences;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input")
	private WebElement CustomerInsightFieldSelector;
	@FindBy(xpath="//input[@placeholder='Event']")
	private WebElement EventFieldSelector;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+AGE_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldAge;	
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+GROUP_ID_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldGroupId;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../..//input/following::label[contains(.,'List')]/../..//input")
	private WebElement CustomerListFieldSelector;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../..//input/following::paper-item[contains(.,'"+SELENIUM_LIST_SUB+"')]")
	private WebElement CustomerListSelection;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../..//input/following::paper-item[contains(.,'"+SELENIUM_SHARED_List+"')]")
	private WebElement SharedCustomerListSelection;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../..//input/following::paper-item[contains(.,'"+SELENIUM_DISCOVERED_CLUSTERS_LIST+"')]")
	private WebElement discoveredClustersListSelection;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+AGE_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldAgeUnique;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+SITE_ID_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldSite;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+LOCATION_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightLocation;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+DEVICE_INFO_FIELD+"')]")
	private WebElement CustomerDeviceInfo;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+BALANCE_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldBalance;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+SELENIUM_TARGET_GROUP+"')]")
	 private WebElement seleniumTargetGroup;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+DEMOGRAPHICS_FIELD+"')]")
	private WebElement demographicsField;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+DIGITAL_PERSONA_FIELD+"')]")
	private WebElement digitalPersonaField;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+LEARNED_BEHAVIOR_FIELD+"')]")
	private WebElement learnedBehaviorField;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+ANALYTICAL_SCORES_FIELD+"')]")
	private WebElement analyticalScoresField;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+DIGITAL_ENGAGEMENT_FIELD+"')]")
	private WebElement digitalEngagementField;
	@FindBy(xpath="//label[text()='Condition']/../..//input")
	private WebElement conditionSelector;
	@FindBy(xpath="//label[text()='Event Date and Time']/../..//input")
	private WebElement eventDateAndTimeSelector;
	@FindBy(xpath="//paper-item[contains(.,'All events before')]")
	private WebElement allEventsBefore;
	@FindBy(xpath="//label[text()='Select']/../..//input")
	private WebElement selectFieldSelector;
	@FindBy(xpath="//paper-item[contains(.,'now (target time)')]")
	private WebElement nowSelect;
	@FindBy(xpath="//paper-item[contains(.,'is greater than')]")
	private WebElement conditionIsGreaterThan;
	@FindBy(xpath="//paper-item[text()='is']")
	private WebElement conditionIs;
	@FindBy(xpath="//paper-item[contains(.,'is on')]")
	private WebElement customerLocationInsightCondition;
	@FindBy(xpath="//paper-item[contains(.,'is subscribed')]")
	private WebElement conditionIsSubscribed;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer accepted')]")
	private WebElement eventOfferAccepted;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'"+SELENIUM_CUSTOMER_DRIVEN_EVENT+"')]")
	private WebElement eventCustomerDrivenEvent;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer declined')]")
	private WebElement eventOfferDeclined;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer was sent the message')]")
	private WebElement eventCustomerWasSentTheMessage;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer was eligible for Offer')]")
	private WebElement eventCustomerWaseligibleforoffer;
	
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer was sent the trial message')]")
	private WebElement eventCustomerWasSentTheTrialMessage;
	
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer Recommended')]")
	private WebElement eventOfferRecommended;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer Care Usage')]")
	private WebElement eventOfferCustomerCareUsage;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer Enquiry')]")
	private WebElement offerEnquiry;
	@FindBy(xpath="//paper-item[contains(.,'is not')]")
	private WebElement conditionIsNot;
	@FindBy(xpath="//paper-item[contains(.,'is less than')]")
	private WebElement conditionIsLessThan;
	@FindBy(xpath=".//*[@id='conditionForm']//field-simple/div//paper-input//input")
	private WebElement isGreaterThanValue;
	@FindBy(xpath=".//*[@id='conditionCard']/paper-button[2]")
	private WebElement targetConditionSave;
	@FindBy(xpath=".//div[@id='single'][2]//paper-button[contains(.,'Save')]")
	private WebElement targetConditionSave2;
	@FindBy(xpath = "//*[@data-moduletext='Customer Insight']")
	private WebElement targetGraphicalCustomerInsight;
	@FindBy(xpath = "//*[@data-moduletext='Event']")
	private WebElement targetGraphicalEvent;
	@FindBy(xpath = "//*[@data-moduletext='Fixed Segment']")
	private WebElement targetGraphicalFixedSegment;
	@FindBy(xpath = "//*[@data-moduletext='Location Insight']")
	private WebElement targetGraphicalLocationInsight;
	@FindBy(xpath = "//*[@data-moduletext='Usage Metric']")
	private WebElement targetGraphicalUsageMetric;
	@FindBy(xpath = "//div[@id='canvas']")
	private WebElement graphicalTargetCanvas;
	 @FindBy(xpath="//paper-button[@condition='AND']")
		 private WebElement manualAndCondition;
	 @FindBy(xpath="(//paper-button[@condition='AND'])[2]")
	 private WebElement manualAndCondition2;
	 @FindBy(xpath="//paper-button[@condition='OR']")
	 private WebElement manualOrCondition;
		 @FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
		 private WebElement manualConditionTypeField;
		 @FindBy(xpath="//paper-button[contains(text(),'Create Condition')]")
		 private WebElement createConditionButton;

         @FindBy(xpath="(.//div[@class='container flex-end-justified style-scope target-conditions']//iron-icon[1])[4]")
		 private WebElement graphicalConditionButton;
		 @FindBy(xpath=".//target-conditions-context-menu")
		 private List <WebElement> graphicalConditionContextMenu;
		 @FindBy(xpath=".//div[@class='inner-content style-scope target-conditions-graph']//profile-field[contains(.,'Customer Profile Info')]")
		 private List <WebElement> graphicalConditionText;
		 @FindBy(xpath=".//*[@id='conditionCard']//paper-icon-item[contains(.,'Edit')]")
		 private WebElement targetConditionEdit;
		 @FindBy(xpath=".//*[@id='conditionCard']//paper-icon-item[contains(.,'Delete')]")
		 private WebElement targetConditionDelete;
		 @FindBy(xpath=".//paper-item[contains(.,'Duplicate')]")
		 private WebElement optionDuplicate;
		 @FindBy(xpath=".//li[contains(.,'Campaign Details')]")
		 private WebElement campaignDetails;
		 
//		 @FindBy(xpath=".//div[@class='jtk-demo-canvas canvas-wide flowchart style-scope target-conditions-graph']")
//		 private WebElement dropLocation;
//		 @FindBy(xpath=".//div[@draggable='true'][1]")
//		 private WebElement graphicTC;
		 @FindBy(xpath="//div[@class='window graph-item style-scope target-conditions-graph jsplumb-endpoint-anchor jsplumb-draggable']")
		 private List <WebElement> duplicatedTargetConditionCard;
		 
		 
		 @FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Boolean_q11')]")
		 private WebElement Boolean_q11;
		 @FindBy(xpath="//paper-item[text()='Yes']")
		 private WebElement booleanYes;
		 @FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Languages_q11')]")
		 private WebElement languages_q11 ;
		 @FindBy(xpath="//paper-item[text()='matches any of']")
		 private WebElement matchesOFAny;
		 @FindBy(xpath="//paper-item[contains(.,'is any of')]")  
		private WebElement conditionIsAnyOf;
		 @FindBy(xpath="(.//*[@id='conditionForm']//field-simple/div//paper-input//input)[2]")
			private WebElement addOneMoreValue;
			@FindBy(xpath="//paper-icon-button[@icon='icons:add']")
			private WebElement add;
			@FindBy(xpath="//vaadin-combo-box-item[contains(.,'"+SELENIUM_SHARED_EVENT+"')]")
			private WebElement eventCustomerDrivenSharedEvent;
			  		@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Age_q11')]")
					private WebElement CustomerInsightFieldAgeNV;
					@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Date_q11')]")
					private WebElement CustomerInsightFieldDateNV;
					@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Last Name_q11')]")
					private WebElement CustomerInsightFieldLastNameNV;
					@FindBy(xpath="//paper-item[contains(.,'field is not set')]")
				 private WebElement conditionFieldIsNotSet;
				 @FindBy(xpath="(//label[contains(.,'Date Part')]//following::input)[1]")
				 private WebElement selectDatePart ;
				 @FindBy(xpath="//paper-item[contains(.,'DATE')]")
				 private WebElement selectDate;
				 @FindBy(xpath="(.//*[@id='conditionCard']/paper-button[2])[3]")
				 private WebElement targetConditionSave3;
		 
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
		// @FindBy(xpath="")
		// private WebElement ;
	
	
	 public void clickManualAndButton() throws InterruptedException {
			jswait.loadClick(manualAndCondition);
		}
	 public void clickTargetConditionEdit() throws InterruptedException {
			jswait.loadClick(targetConditionEdit);
		}
	 public void clickTargetConditionDeletet() throws InterruptedException {
			jswait.loadClick(targetConditionDelete);
		}
	 public void clickManualOrButton() throws InterruptedException {
			jswait.loadClick(manualOrCondition);
		}
	    public void clickConditionTypeField() throws InterruptedException {
			jswait.loadClick(manualConditionTypeField);
		}
		public void clickTargetConditionViewToggle() throws InterruptedException {
			jswait.loadClick(targetConditionViewToggle);
		}
		public void clickCreateTargetConditionButton() throws InterruptedException {
			jswait.loadClick(createConditionButton);
		}
		public void clickGraphicalTargetConditionButton() throws InterruptedException {
			jswait.loadClick(graphicalConditionButton);
		}
		
		public void verifyGraphicalTargetConditionVisibility() throws Exception {
			
			
			Exception sizeException=new Exception("Target Condions changed");
			int size1=graphicalConditionContextMenu.size();
			if(size1!=3) {
				
				throw sizeException;	
			}
			
			int size2=graphicalConditionText.size();
			
            if(size2!=2) {
				
				throw sizeException;	
			}
			
		
		}	
		public void clickCampaignDetailsTab() throws InterruptedException {
			jswait.loadClick(campaignDetails);
			Thread.sleep(2000);
		}
		
		public void clickDuplicateTargetConditionButton() throws InterruptedException {
			jswait.loadClick(optionDuplicate);
			Thread.sleep(2000);
		}
		public void dragTargetCondition() throws InterruptedException {
			
			//Actions act=new Actions(driver);
//			Actions builder = new Actions(driver);
//			 
//			Action dragAndDrop = builder.clickAndHold(graphicTC).moveToElement(dropLocation).release(dropLocation).build();
//			 
//			dragAndDrop.perform();
			
			
			
			WebElement graphicTC=driver.findElement(By.xpath(".//div[@draggable='true' and @class='widgets AI Powered Analytical Scores style-scope target-conditions-widgets'][1]"));
			WebElement dropLocation=driver.findElement(By.xpath(".//div[@class='jtk-demo-canvas canvas-wide flowchart style-scope target-conditions-graph']"));
//			(new Actions(driver)).dragAndDrop(graphicTC, dropLocation).build().perform();
//			Thread.sleep(2000);
			if(graphicTC.isDisplayed()) { 
				
				System.out.println("Card displayed");
			}
		
			Actions builder = new Actions(driver);
	 	    Action dragAndDrop = builder.clickAndHold(graphicTC).moveToElement(dropLocation).release(dropLocation).build();
	        dragAndDrop.perform();
		
		
		}
		public void verifyDuplicatedTargetConditionCard() throws InterruptedException {
			
			Thread.sleep(2000);
			if(duplicatedTargetConditionCard.size()>0) {
				for(WebElement card: duplicatedTargetConditionCard) {
					
					assertTrue(card.isDisplayed());
				}
				
			}
		}
	 public void clickBasicTargetConditionWithAge() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldAge);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"18");
			jswait.loadClick(targetConditionSave);
	 }
	 
	 public void clickBasicTargetConditionWithUniqueKPI() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldAgeUnique);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"18");
			jswait.loadClick(targetConditionSave);
	 }
	 
	 public void clickBasicTargetCondition(String event) throws InterruptedException {
			if(event.contentEquals("IMEventsOfferAccepted")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Offer accepted");
				jswait.loadClick(eventOfferAccepted);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerDrivenEvent")||event.contentEquals("customerDrivenEventNotOccurred")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDrivenEvents);
				jswait.loadSendKeys(EventFieldSelector,SELENIUM_CUSTOMER_DRIVEN_EVENT);
				jswait.loadClick(eventCustomerDrivenEvent);
				if(event.contentEquals("customerDrivenEventNotOccurred")) {
					jswait.loadClick("(//*[@id=\"checkboxContainer\"])[2]");
				}
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("digitalPersonaGT15")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDigitalPersona);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(digitalPersonaField);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"15");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerList")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerList);
				jswait.loadSendKeys(CustomerListFieldSelector,SELENIUM_LIST_SUB);
				jswait.loadClick(CustomerListSelection);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsSubscribed);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("discoveredClusters200")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerList);
				jswait.loadSendKeys(CustomerListFieldSelector,SELENIUM_DISCOVERED_CLUSTERS_LIST);
				jswait.loadClick(discoveredClustersListSelection);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsSubscribed);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerDemographicsGT25")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDemographics);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(demographicsField);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"25");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("profilefieldNV")) {
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(CustomerInsightFieldAgeNV);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionFieldIsNotSet);
//				jswait.loadClick(conditionIsGreaterThan);
//				jswait.loadSendKeys(isGreaterThanValue,"6");
				jswait.loadClick(targetConditionSave);
				clickManualAndButton();
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(CustomerInsightFieldDateNV);
				jswait.loadClick(selectDatePart);
				jswait.loadClick(selectDate);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionFieldIsNotSet);
			    jswait.loadClick(targetConditionSave2);
				jswait.loadClick(manualAndCondition2);
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadSendKeys(CustomerInsightFieldSelector, "Last Name_q11");
				jswait.loadClick(CustomerInsightFieldLastNameNV);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionFieldIsNotSet);
				jswait.loadClick(targetConditionSave3);
				
				
			}
			else if(event.contains("sharedEventOtherPartner")) {
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDrivenEvents);
				jswait.loadSendKeys(EventFieldSelector,SELENIUM_SHARED_EVENT);
				jswait.loadClick(eventCustomerDrivenSharedEvent);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("IsAnyOf")) {
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(CustomerInsightFieldBalance);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsAnyOf);
				jswait.loadSendKeys(isGreaterThanValue,"200");
				jswait.loadClick(add);
				jswait.loadSendKeys(addOneMoreValue,"141");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("learnedBehaviourGT35")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeLearnedBehaviors);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(learnedBehaviorField);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"35");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("analyticalScoresGT45")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeAIPoweredAnalyticalScores);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(analyticalScoresField);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"45");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("digitalEngagementGT235")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeDigitalEngagementPreferences);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(digitalEngagementField);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"235");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerLocationInsightsGT5")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerLocationInsights);
				jswait.loadClick(CustomerInsightFieldSelector);
				Thread.sleep(3000);
				CustomerInsightFieldSelector.sendKeys(LOCATION_PROFILE_FIELD);
				jswait.loadClick(CustomerInsightLocation);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsLessThan);
				jswait.loadSendKeys(isGreaterThanValue,"5");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerDeviceInfo")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDeviceInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(CustomerDeviceInfo);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsNot);
				jswait.loadSendKeys(isGreaterThanValue,"6666");
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerWasSentTheMessage")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer was sent the message");
				jswait.loadClick(eventCustomerWasSentTheMessage);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("customerWasSentTheTrialMessage")||event.contentEquals("customerWasSentTheTrialMessageNOtOccurred")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer was sent the trial message");
				jswait.loadClick(eventCustomerWasSentTheTrialMessage);
				if(event.contentEquals("customerWasSentTheTrialMessageNOtOccurred")){
					jswait.loadClick("(//*[@id=\"checkboxContainer\"])[2]");
				}
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("IMEventsOfferDeclined")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Offer declined");
				jswait.loadClick(eventOfferDeclined);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("IMEventsOfferRecommended")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Offer Recommended");
				jswait.loadClick(eventOfferRecommended);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("IMEventsCustomerCareUsage")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer Care Usage");
				jswait.loadClick(eventOfferCustomerCareUsage);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}else if(event.contentEquals("offerEnquiry")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Offer Enquiry");
				jswait.loadClick(offerEnquiry);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			//to change
			else if(event.contentEquals("IMEventsOfferDeclined")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Offer declined");
				jswait.loadClick(eventOfferDeclined);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("IMEventsOfferRecommended")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Offer Recommended");
				jswait.loadClick(eventOfferRecommended);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("IMEventsCustomerCareUsage")){
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer Care Usage");
				jswait.loadClick(eventOfferCustomerCareUsage);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("usageMetric")){
				jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeUsageMetrics);
			jswait.loadClick(usageMetricField);
			jswait.loadSendKeys(usageMetricField,SELENIUM_USAGE_METRIC);
			jswait.loadClick(usageMetricUnique);
			jswait.loadClick(metricWeekSelector);
			jswait.loadClick(metricByMonthOption);
			jswait.loadClick(metricDaySelector);
			jswait.loadClick(metricMaxOf);
			jswait.loadClick(metricMaxOfMonthsSelect);
			jswait.loadClick(metricMaxOfMonthThisMonth);
			jswait.loadClick(metricMaxOfMonthLastMonth);
			jswait.loadClick(metricMaxOfMonthLast2Month);
			jswait.loadClick(metricMaxOfMonthLast3Month);
			jswait.loadClick(metricMaxOfMonthLast4Month);
			jswait.loadClick(metricMaxOfMonthLast5Month);
			jswait.loadClick(metricMaxOfMonthLast6Month);
			jswait.loadClick(metricMaxOfMonthLast7Month);
			jswait.loadClick(metricMaxOfMonthLast8Month);
			jswait.loadClick(metricMaxOfMonthLast9Month);
			
			jswait.loadClick(metricConditionField);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"0");
			jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("revenueMetric")){
				jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeRevenueMetrics);
			jswait.loadClick(usageMetricField);
			jswait.loadSendKeys(usageMetricField,SELENIUM_REVENUE_METRIC);
			jswait.loadClick(revenueMetricSelect);
			jswait.loadClick(metricWeekSelector);
			jswait.loadClick(metricByMonthOption);
			jswait.loadClick(metricDaySelector);
			jswait.loadClick(metricMaxOf);
			jswait.loadClick(metricMaxOfMonthsSelect);
			jswait.loadClick(metricMaxOfMonthThisMonth);
			jswait.loadClick(metricMaxOfMonthLastMonth);
			jswait.loadClick(metricMaxOfMonthLast2Month);
			jswait.loadClick(metricMaxOfMonthLast3Month);
			jswait.loadClick(metricMaxOfMonthLast4Month);
			jswait.loadClick(metricMaxOfMonthLast5Month);
			jswait.loadClick(metricMaxOfMonthLast6Month);
			jswait.loadClick(metricMaxOfMonthLast7Month);
			jswait.loadClick(metricMaxOfMonthLast8Month);
			jswait.loadClick(metricMaxOfMonthLast9Month);
			
			jswait.loadClick(metricConditionField);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"0");
			jswait.loadClick(targetConditionSave);
			}
			else if(event.contentEquals("eventCounts")){
				jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeEventCounts);
			jswait.loadClick(usageMetricField);
			jswait.loadSendKeys(usageMetricField,SELENIUM_EVENT_COUNTS);
			jswait.loadClick(eventCountsSelect);
			jswait.loadClick(metricWeekSelector);
			jswait.loadClick(metricByMonthOption);
			jswait.loadClick(metricDaySelector);
			jswait.loadClick(metricMaxOf);
			jswait.loadClick(metricMaxOfMonthsSelect);
			jswait.loadClick(metricMaxOfMonthThisMonth);
			jswait.loadClick(metricMaxOfMonthLastMonth);
			jswait.loadClick(metricMaxOfMonthLast2Month);
			jswait.loadClick(metricMaxOfMonthLast3Month);
			jswait.loadClick(metricMaxOfMonthLast4Month);
			jswait.loadClick(metricMaxOfMonthLast5Month);
			jswait.loadClick(metricMaxOfMonthLast6Month);
			jswait.loadClick(metricMaxOfMonthLast7Month);
			jswait.loadClick(metricMaxOfMonthLast8Month);
			jswait.loadClick(metricMaxOfMonthLast9Month);
			
			jswait.loadClick(metricConditionField);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"0");
			jswait.loadClick(targetConditionSave);
			}
			
			else if(event.contains("groupIdCondition_")){
				clickBasicTargetConditionWithGroupId(event);
			}
			else if(event.contains("conditionForANDOperation")||event.contains("conditionForOROperation")){
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer was sent the trial message");
				jswait.loadClick(eventCustomerWasSentTheTrialMessage);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick(targetConditionSave);
				
				if(event.contains("conditionForANDOperation")) {
				clickManualAndButton();
				}else {
					clickManualOrButton();
				}
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDrivenEvents);
				jswait.loadSendKeys(EventFieldSelector,SELENIUM_CUSTOMER_DRIVEN_EVENT);
				jswait.loadClick(eventCustomerDrivenEvent);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[2])[2]");
				
			}
			else if(event.contentEquals("sharedMetricOtherPartner")){
			jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeUsageMetrics);
			jswait.loadClick(usageMetricField);
			jswait.loadSendKeys(usageMetricField,SELENIUM_SHARED_METRIC);
			jswait.loadClick(sharedMetricUnique);
			jswait.loadClick(metricWeekSelector);
			jswait.loadClick(metricByMonthOption);
			jswait.loadClick(metricDaySelector);
			jswait.loadClick(metricMaxOf);
			jswait.loadClick(metricMaxOfMonthsSelect);
			jswait.loadClick(metricMaxOfMonthThisMonth);
			jswait.loadClick(metricMaxOfMonthLastMonth);
//			jswait.loadClick(metricMaxOfMonthLast2Month);
//			jswait.loadClick(metricMaxOfMonthLast3Month);
//			jswait.loadClick(metricMaxOfMonthLast4Month);
//			jswait.loadClick(metricMaxOfMonthLast5Month);
//			jswait.loadClick(metricMaxOfMonthLast6Month);
//			jswait.loadClick(metricMaxOfMonthLast7Month);
//			jswait.loadClick(metricMaxOfMonthLast8Month);
//			jswait.loadClick(metricMaxOfMonthLast9Month);
			
			jswait.loadClick(metricConditionField);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"0");
			jswait.loadClick(targetConditionSave);
			}
			
			
			else if(event.contains("allTargetConditions")) {
				//for Age>24
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(CustomerInsightFieldAge);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"24");
				jswait.loadClick(targetConditionSave);
				Thread.sleep(2000);
				//for boolean=Yes
				jswait.loadClick(".//paper-button[contains(.,'Add AND')]");
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(Boolean_q11);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(booleanYes);
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[2])[2]");
				
				Thread.sleep(2000);
				//for language=malayalam
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[2]");
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadClick(CustomerInsightFieldSelector);
				jswait.loadClick(languages_q11);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(matchesOFAny);
				jswait.loadClick("//field-list[@class='layout vertical flex style-scope profile-field']//paper-tags-dropdown[@id='tagDropDown']//input[@id='input']");
				jswait.loadClick("//field-list[@class='layout vertical flex style-scope profile-field']//iron-icon[@class='style-scope paper-tags-dropdown x-scope iron-icon-0']");
				jswait.loadClick("//paper-item[text()='Malayalam']");
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[3]");
				
				Thread.sleep(2000);
				//for usage metric
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[3]");
								
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeUsageMetrics);
				jswait.loadClick(usageMetricField);
				jswait.loadSendKeys(usageMetricField,SELENIUM_USAGE_METRIC);
				jswait.loadClick(usageMetricUnique);
				jswait.loadClick(metricWeekSelector);
				jswait.loadClick(metricByMonthOption);
				jswait.loadClick(metricDaySelector);
				jswait.loadClick(metricMaxOf);
				jswait.loadClick(metricMaxOfMonthsSelect);
				jswait.loadClick(metricMaxOfMonthThisMonth);
				jswait.loadClick(metricMaxOfMonthLastMonth);
				jswait.loadClick(metricMaxOfMonthLast2Month);
				jswait.loadClick(metricMaxOfMonthLast3Month);
				jswait.loadClick(metricMaxOfMonthLast4Month);
				jswait.loadClick(metricMaxOfMonthLast5Month);
				jswait.loadClick(metricMaxOfMonthLast6Month);
				jswait.loadClick(metricMaxOfMonthLast7Month);
				jswait.loadClick(metricMaxOfMonthLast8Month);
				jswait.loadClick(metricMaxOfMonthLast9Month);
				jswait.loadClick(metricConditionField);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"0");
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[4]");
				Thread.sleep(2000);
				//for shared metric
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[4]");
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeUsageMetrics);
				jswait.loadClick(usageMetricField);
				jswait.loadSendKeys(usageMetricField,SELENIUM_SHARED_METRIC);
				jswait.loadClick(sharedMetricUnique);
				jswait.loadClick(metricWeekSelector);
				jswait.loadClick(metricByMonthOption);
				jswait.loadClick(metricDaySelector);
				jswait.loadClick(metricMaxOf);
				jswait.loadClick(metricMaxOfMonthsSelect);
				jswait.loadClick(metricMaxOfMonthThisMonth);
				jswait.loadClick(metricMaxOfMonthLastMonth);
				jswait.loadClick(metricMaxOfMonthLast2Month);
				jswait.loadClick(metricMaxOfMonthLast3Month);
				jswait.loadClick(metricMaxOfMonthLast4Month);
				jswait.loadClick(metricMaxOfMonthLast5Month);
				jswait.loadClick(metricMaxOfMonthLast6Month);
				jswait.loadClick(metricMaxOfMonthLast7Month);
				jswait.loadClick(metricMaxOfMonthLast8Month);
				jswait.loadClick(metricMaxOfMonthLast9Month);
				
				jswait.loadClick(metricConditionField);
				jswait.loadClick(conditionIsGreaterThan);
				jswait.loadSendKeys(isGreaterThanValue,"0");
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[5]");
				Thread.sleep(2000);
				//for shared list
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[5]");
								
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerList);
				jswait.loadSendKeys(CustomerListFieldSelector,SELENIUM_SHARED_List);
				jswait.loadClick(CustomerListSelection);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsSubscribed);
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[6]");
				
				Thread.sleep(2000);
				//for system event not occured 
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[6]");
				
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer was sent the trial message");
				Thread.sleep(2000);
				jswait.loadClick(eventCustomerWasSentTheTrialMessage);
				jswait.loadClick("//div[contains(text(),'Occurred')]");
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[7]");
				Thread.sleep(2000);
				//for system event occured
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[7]");
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeSystemEvents);
				jswait.loadSendKeys(EventFieldSelector,"Customer was eligible for Offer");
				jswait.loadClick(eventCustomerWaseligibleforoffer);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[8]");
				Thread.sleep(2000);
				//for custom event occured
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[8]");	
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDrivenEvents);
				jswait.loadSendKeys(EventFieldSelector,SELENIUM_CUSTOMER_DRIVEN_EVENT);
				jswait.loadClick(eventCustomerDrivenEvent);
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[9]");
				Thread.sleep(2000);
				//for custom event not occured
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[9]");
				
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerDrivenEvents);
				jswait.loadSendKeys(EventFieldSelector,SELENIUM_CUSTOMER_DRIVEN_EVENT);
				jswait.loadClick(eventCustomerDrivenEvent);
				jswait.loadClick("//div[contains(text(),'Occurred')]");
				jswait.loadClick(eventDateAndTimeSelector);
				jswait.loadClick(allEventsBefore);
				jswait.loadClick(selectFieldSelector);
				jswait.loadClick(nowSelect);
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[10]");
				Thread.sleep(2000);
				//for customer list subscribed
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[10]");
				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerList);
				jswait.loadSendKeys(CustomerListFieldSelector,SELENIUM_Target_List);
				jswait.loadClick(CustomerListSelection);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsSubscribed);
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[11]");
				Thread.sleep(2000);
				//for Traget group
				String value=event.substring(19,event.length());
				jswait.loadClick("(.//paper-button[contains(.,'Add AND')])[11]");
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadSendKeys(CustomerInsightFieldSelector,"Target");
				Thread.sleep(2000);
				jswait.loadClick(seleniumTargetGroup);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIs);
				jswait.loadSendKeys(isGreaterThanValue,value);
				
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[contains(.,'Save')])[12]");
			}
			else if(event.contains("targetGroup")){
				String value=event.substring(11,event.length());
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadSendKeys(CustomerInsightFieldSelector,"Target");
				Thread.sleep(2000);
				jswait.loadClick(seleniumTargetGroup);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIs);
				jswait.loadSendKeys(isGreaterThanValue,value);
				jswait.loadClick(targetConditionSave);
			}
			else if(event.contains("SharedcustomerList")){
								
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerList);
				jswait.loadSendKeys(CustomerListFieldSelector,SELENIUM_SHARED_List);
				jswait.loadClick(SharedCustomerListSelection);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIsSubscribed);
				jswait.loadClick(targetConditionSave);
				
			}else if(event.contains("ageTargetGroup")) {
				String str=event;
				String value=str.substring(14, str.length());
				clickBasicTargetConditionWithAgeEdit();
				clickManualAndButton();				
				jswait.loadClick(targetConditionTypeSelector);
				jswait.loadClick(targetConditionTypeCustomerProfileInfo);
				jswait.loadSendKeys(CustomerInsightFieldSelector,"Target");
				jswait.loadClick(seleniumTargetGroup);
				jswait.loadClick(conditionSelector);
				jswait.loadClick(conditionIs);
				jswait.loadSendKeys(isGreaterThanValue,value);
				jswait.loadClick("(.//*[@id='conditionCard']/paper-button[2])[2]");
			}
			
			else {
				Assert.assertTrue("NO Target condition selected",false);
			}
			
				
		 }
	 
	 
	 public void clickBasicTargetConditionWithAgeAndConsumerInsight() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerLocationInsights);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightLocation);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsNot);
			jswait.loadSendKeys(isGreaterThanValue,"30");
			jswait.loadClick(targetConditionSave);
	 }
	 public void clickBasicTargetConditionWithGroupId(String condition) throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    StringBuilder sb = new StringBuilder();
			sb.append(condition.split("_")[1]);
			System.out.println("GroupId parsed from condition::::"+sb.toString());
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldGroupId);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIs);
			jswait.loadSendKeys(isGreaterThanValue,sb.toString());
			jswait.loadClick(targetConditionSave);
	 }
	 
	 public void clickBasicTargetConditionWithAgeEdit() throws InterruptedException {
//	    jswait.loadClick(createConditionButton);
	   jswait.loadClick(targetConditionTypeSelector);
	   jswait.loadClick(targetConditionTypeCustomerProfileInfo);
	   jswait.loadClick(CustomerInsightFieldSelector);
	   jswait.loadClick(CustomerInsightFieldAge);
	   jswait.loadClick(conditionSelector);
	   jswait.loadClick(conditionIsGreaterThan);
	   jswait.loadSendKeys(isGreaterThanValue,"25");
	   jswait.loadClick(targetConditionSave);
	  }
	 
	 

	 public void clickBasicTargetConditionWithUsageMetric() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeUsageMetrics);
			jswait.loadClick(usageMetricField);
			
			eM.setExcelFile("usageMetricInputData","usageMetric");
	    	String name = (String) eM.getCell(1, 0);
	    	Thread.sleep(2000);
	    	jswait.loadSendKeys(usageMetricField,name);
	    	Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'"+name+"')]");
			//jswait.loadClick(usageMetricUnique);
			jswait.loadClick(metricWeekSelector);
			jswait.loadClick(metricWeekOption);
			jswait.loadClick(metricDaySelector);
			jswait.loadClick(metricWeek);
			jswait.loadClick(metricConditionField);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"18");
			jswait.loadClick(targetConditionSave);
	
	 }
	 
	 
	 
	 
	 public void clickBasicTargetConditionWithCustomerLocationInsight() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerLocationInsights);
			jswait.loadClick(CustomerInsightFieldSelector);
			
			eM.setExcelFile("customerLocationInsightInputData","name");
	    	String name = (String) eM.getCell(1, 0);
	    	Thread.sleep(2000);
	    	//driver.findElement(By.xpath("//paper-item[contains(.,'"+name+"')]")).click();
			
	    	jswait.loadClick("//paper-item[contains(.,'"+name+"')]");
			jswait.loadClick(customerLocationInsightDatePart);
			jswait.loadClick(customerLocationInsightDate);
			jswait.loadClick(customerLocationInsightConditionField);
			jswait.loadClick(customerLocationInsightCondition);
			jswait.loadClick(customerLocationInsightSelectField);
			jswait.loadClick(customerLocationInsightSelectToday);
			jswait.loadClick(targetConditionSave);
	
	 
	 }
	 
	 
	 
	 public void verifyAddedTargetCondition() throws InterruptedException {
		 Thread.sleep(3000);
		assertTrue(editedTC.isDisplayed());  
	 }
	 
	 public void clickBasicTargetConditionWithAge2() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldAge);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsLessThan);
			jswait.loadSendKeys(isGreaterThanValue,"25");
			Thread.sleep(3000);
//			Actions action = new Actions(driver);
//			action.moveToElement(targetConditionSave2).click().build().perform();
////			action.click(targetConditionSave2);
////			Action action2  = action.build();
////			action2.perform();
			jswait.loadClick(targetConditionSave2);
	 }
	 public void clickBasicTargetConditionWithAge(String age) throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldAge);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,age);
			jswait.loadClick(targetConditionSave);
	 }
	 
	 public void clickBasicTargetConditionWithBalance() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldBalance);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"20");
			jswait.loadClick(targetConditionSave);
	 }
	public void graphicalTargetMoveCustomerInsightToCanvas() throws InterruptedException, AWTException {

		Thread.sleep(5000);
//		Robot robot = new Robot ();
//		Point p = targetGraphicalCustomerInsight.getLocation();
//		System.out.println(p.getX()+"            y:" +p.getY());
//	    robot.mouseMove(p.getX(), p.getY());
//	    robot.mousePress(InputEvent.BUTTON1_MASK);
//	    robot.mousePress(InputEvent.BUTTON1_MASK);
//	    robot.mousePress(InputEvent.BUTTON1_MASK);
//	    robot.mouseMove(p.getX()+1000, p.getY());
//	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		Point p1 = targetGraphicalCustomerInsight.getLocation();
		System.out.println(p1.getX()+"            y:" +p1.getY());
		Point p2 = graphicalTargetCanvas.getLocation();
		System.out.println(p2.getX()+"            y:" +p2.getY());
		Actions builder = new Actions(driver);
		builder.moveToElement(targetGraphicalCustomerInsight, 50, 5).clickAndHold().moveToElement(graphicalTargetCanvas, 100, 10).release().build().perform();
		
		
//		builder.clickAndHold(targetGraphicalCustomerInsight).moveToElement(graphicalTargetCanvas).perform();
//		Thread.sleep(2000);// add 2 sec wait
//		builder.release(graphicalTargetCanvas).build().perform();
		
//		WebElement ele = driver.findElement(By.xpath("//div[@id='canvas']/div[1]"));
//		jswait.loadClick(targetGraphicalCustomerInsight);
//		Thread.sleep(5000);
//		Actions action = new Actions(driver);
//		action.moveToElement(targetGraphicalCustomerInsight).clickAndHold();
//		action = action.moveByOffset(1, 1);
//		action.moveToElement(graphicalTargetCanvas).release().build().perform();
//		 Point p = targetGraphicalCustomerInsight.getLocation();
//		 action.dragAndDropBy(targetGraphicalCustomerInsight, p.getX()+5000, p.getY()+500).build().perform();
//		 action.dragAndDrop(targetGraphicalCustomerInsight,graphicalTargetCanvas).build().perform();
//		 action.dra
//		 action.click(targetGraphicalCustomerInsight).clickAndHold(targetGraphicalCustomerInsight).moveToElement(graphicalTargetCanvas).release(graphicalTargetCanvas).build().perform();

	}
	
	 public void clickBasicTargetConditionWithAgeForOR() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldAge);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"18");
			}
	 
	 public void selectTwoConditionsWithTargetGroup() {
		 
		 
		 
	 }
			
}
