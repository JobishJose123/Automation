package pageObjetcs;

import java.awt.AWTException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
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
	@FindBy(xpath="//target-conditions/div/paper-icon-button")
	private WebElement targetConditionViewToggle;
	@FindBy(xpath="//label[contains(.,'Condition Type')]/../input")
	private WebElement targetConditionTypeSelector;
	@FindBy(xpath="//paper-item[contains(.,'Customer Profile Info')]")
	private WebElement targetConditionTypeCustomerProfileInfo;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input")
	private WebElement CustomerInsightFieldSelector;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Age')]")
	private WebElement CustomerInsightFieldAge;
	@FindBy(xpath="//label[contains(.,'Field')]/../..//input/following::paper-item[contains(.,'Balance')]")
	private WebElement CustomerInsightFieldBalance;
	@FindBy(xpath="//label[text()='Condition']/../..//input")
	private WebElement conditionSelector;
	@FindBy(xpath="//paper-item[contains(.,'is greater than')]")
	private WebElement conditionIsGreaterThan;
	@FindBy(xpath="//paper-item[contains(.,'is less than')]")
	private WebElement conditionIsLessThan;
	@FindBy(xpath=".//*[@id='conditionForm']//field-simple/div//paper-input//input")
	private WebElement isGreaterThanValue;
	@FindBy(xpath=".//*[@id='conditionCard']/paper-button[2]")
	private WebElement targetConditionSave;
	@FindBy(xpath="//condition-form[2]//paper-button[contains(.,'Save')]")
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
		 @FindBy(xpath=".//*[@id='conditionCard']//paper-icon-item[contains(.,'Edit')]")
		 private WebElement targetConditionEdit;
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
	 
	 public void clickBasicTargetConditionWithAgeEdit() throws InterruptedException {
//		 	jswait.loadClick(createConditionButton);
		    jswait.loadClick(targetConditionTypeSelector);
			jswait.loadClick(targetConditionTypeCustomerProfileInfo);
			jswait.loadClick(CustomerInsightFieldSelector);
			jswait.loadClick(CustomerInsightFieldAge);
			jswait.loadClick(conditionSelector);
			jswait.loadClick(conditionIsGreaterThan);
			jswait.loadSendKeys(isGreaterThanValue,"25");
			jswait.loadClick(targetConditionSave);
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
