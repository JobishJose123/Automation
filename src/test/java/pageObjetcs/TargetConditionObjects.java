package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class TargetConditionObjects extends Init {
	public TargetConditionObjects() {
		PageFactory.initElements(driver, this);
	}

	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	CommonObjects commonObjects = new CommonObjects();
	@FindBy(xpath="//img[contains(@src,'http://192.168.150.27/images/Flip')]/../..")
	private WebElement targetConditionViewToggle;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
	private WebElement targetConditionTypeSelector;
	@FindBy(xpath=".//field-simple//span[contains(.,'25')]")
	private WebElement editedTC;
	@FindBy(xpath="//paper-item[contains(.,'Customer Profile Info')]")
	private WebElement targetConditionTypeCustomerProfileInfo;
	@FindBy(xpath="//paper-item[contains(.,'System Events')]")
	private WebElement targetConditionTypeSystemEvents;
	@FindBy(xpath="//paper-item[contains(.,'Customer Location Insights')]")
	private WebElement targetConditionTypeCustomerLocationInsights;
	@FindBy(xpath="//paper-item[contains(.,'Customer Device Info')]")
	private WebElement targetConditionTypeCustomerDeviceInfo;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input")
	private WebElement CustomerInsightFieldSelector;
	@FindBy(xpath="//input[@placeholder='Event']")
	private WebElement EventFieldSelector;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+AGE_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldAge;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+SITE_ID_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldSite;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+LOCATION_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightLocation;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+DEVICE_INFO_FIELD+"')]")
	private WebElement CustomerDeviceInfo;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'"+BALANCE_PROFILE_FIELD+"')]")
	private WebElement CustomerInsightFieldBalance;
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
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer accepted')]")
	private WebElement eventOfferAccepted;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer declined')]")
	private WebElement eventOfferDeclined;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer was sent the message')]")
	private WebElement eventCustomerWasSentTheMessage;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer was sent the trial message')]")
	private WebElement eventCustomerWasSentTheTrialMessage;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Offer Recommended')]")
	private WebElement eventOfferRecommended;
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Customer Care Usage')]")
	private WebElement eventOfferCustomerCareUsage;
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
	 @FindBy(xpath="//paper-button[@condition='OR']")
	 private WebElement manualOrCondition;
		 @FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
		 private WebElement manualConditionTypeField;
		 @FindBy(xpath="//paper-button[contains(text(),'Create Condition')]")
		 private WebElement createConditionButton;
		 @FindBy(xpath=".//div[@class='container flex-end-justified style-scope target-conditions']//paper-icon-button[@class='style-scope target-conditions x-scope paper-icon-button-0']//iron-icon")
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
		else if(event.contentEquals("customerLocationInsights")){
			jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerLocationInsights);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightLocation);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsLessThan);
			jswait.loadSendKeys(isGreaterThanValue,"25");
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
		else if(event.contentEquals("customerWasSentTheTrialMessage")){
			jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeSystemEvents);
			jswait.loadSendKeys(EventFieldSelector,"Customer was sent the trial message");
			jswait.loadClick(eventCustomerWasSentTheTrialMessage);
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
			
	 }
	 
	 
	 public void clickBasicTargetConditionWithAgeAndConsumerInsight() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerLocationInsights);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldSite);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsNot);
			jswait.loadSendKeys(isGreaterThanValue,"30");
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
}
