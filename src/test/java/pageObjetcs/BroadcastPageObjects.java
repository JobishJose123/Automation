package pageObjetcs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class BroadcastPageObjects extends Init {
	public BroadcastPageObjects() {
		PageFactory.initElements(driver, this);
	}

	JSWaiter jswait = new JSWaiter();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	CommonObjects commonObjects = new CommonObjects();

	@FindBy(xpath = "//paper-item[contains(.,'View Broadcasts')]")
	private WebElement viewBroadcast;
	@FindBy(xpath = "//label[contains(.,'Broadcast Name')]/../input")
	private WebElement broadcastName;
	@FindBy(xpath = "//label[contains(.,'Purpose')]/../input")
	private WebElement broadcastPurpose;
	@FindBy(xpath = "//label[contains(.,'Label')]/../input")
	private WebElement labelSelector;
	@FindBy(xpath = "//label[contains(.,'Triggers')]/following::iron-icon")
	private WebElement triggersSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Crossell')]")
	private WebElement labelCrossell;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Information')]")
	private WebElement labelInformation;
	@FindBy(xpath = "//label[contains(.,'Inventory')]/../input")
	private WebElement inventorySelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'limited')]")
	private WebElement inventoryUnlimited;
	@FindBy(xpath = "//paper-button[contains(.,'Proceed')]")
	private WebElement proceedButton;
	@FindBy(xpath = "//offer-form//paper-button[contains(.,'Proceed')]")
	private WebElement offerPopUpProceedButton;
	@FindBy(xpath = ".//label[contains(.,'Base Lists')]/../input")
	private WebElement baseListSelector;
	@FindBy(xpath = ".//*[@id='offerDetailForm']//paper-input-wrapper//input")
	private WebElement trackSession2Days;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Broadcast')]/../input")
	private WebElement senderIdBroadcastSelector;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/../input")
	private WebElement senderIdFulfillmentSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'Address-SMPP')]")
	private WebElement senderIdBroadcastAdressSmpp;
	@FindBy(xpath = ".//label[contains(.,'Route over which this broadcast')]/../input")
	private WebElement routeBroadcast;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/../input")
	private WebElement routeFulfillment;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'SMPP Robi outbond')]")
	private WebElement routeBroadcastSmppRobiOutbond;
	@FindBy(xpath = ".//label[contains(.,'Sender ID: Fulfillment')]/following::vaadin-combo-box-item[contains(.,'Address-SMPP')]")
	private WebElement senderIdFulfillmentAdressSmpp;
	@FindBy(xpath = ".//label[contains(.,'Route over which Fulfillment')]/following::vaadin-combo-box-item[contains(.,'SMPP Robi outbond')]")
	private WebElement routeFulfillmentSmppRobiOutbond;
	@FindBy(xpath = ".//label[contains(.,'Track session')]/../input")
	private WebElement trackSessionSelector;
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-listbox/paper-item[contains(.,'After')]")
	private WebElement trackSessionAfter;
	@FindBy(xpath = "//*[@id='offerDetailForm']//paper-input-wrapper//input")
	private WebElement trackSessionInput;
	@FindBy(xpath = ".//label[contains(.,'Tracking Source')]/../input")
	private WebElement trackingSourceSelector;
	@FindBy(xpath = "//vaadin-combo-box-item[contains(.,'track')]")
	private WebElement trackingSourceTrack;
	@FindBy(xpath = "//label[contains(.,'Triggers')]/following::paper-item[2]")
	private WebElement triggerSelect1;
	@FindBy(xpath = "//label[contains(.,'Triggers')]/following::paper-item[1]")
	private WebElement triggerSelect2;
	@FindBy(xpath = "//label[contains(.,'Inventory')]/following::vaadin-combo-box-item[4]")
	private WebElement inventorySelect1;
	@FindBy(xpath = "//label[contains(.,'Inventory')]/following::paper-icon-button")
	private WebElement inventoryClearButton;
	@FindBy(xpath = ".//*[@id='wizard']/li[1]")
	private WebElement detailsTabHeader;
	@FindBy(xpath = "//paper-button[text()='Create']")
	private WebElement createButtonBc;
	@FindBy(xpath = "//paper-button[text()='Activate']")
	private WebElement activateButtonBc;
	@FindBy(xpath = "//paper-dialog[@id='broadcastSummary']//paper-button[text()='Save']")
	private WebElement saveButtonBc;
	@FindBy(xpath = ".//*[@id='confirmBox']//paper-button[2]")
	private WebElement activateConfirmYes;
	@FindBy(xpath = ".//*[@id='checkboxContainer']")
	private WebElement firstOfferCheckBox;
	@FindBy(xpath = ".//div[@id='radioLabel' and contains(.,'Never')]/../div[1]")
	private WebElement recurringBcEndNeverRadio;
	@FindBy(xpath = ".//div[@id='radioLabel' and contains(.,'At')]/../div[1]")
	private WebElement recurringBcEndAtRadio;
	@FindBy(xpath = ".//vaadin-grid-table-row[1]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
	private WebElement topBcStatusGrid;

	@FindBy(xpath = ".//div[@id='radioLabel' and contains(text(),'Create')]")
	private WebElement targetbccreate;
	@FindBy(xpath = ".//*[@id='contentWrapper']/div/paper-menu/div/paper-icon-item[3]")
	private WebElement bccopyasand;
	@FindBy(xpath = "(//iron-icon[@id='icon'])[23]")
	private WebElement clickCopiedAnd;
	@FindBy(xpath = "//target-form//condition-form[2]//following::paper-button[contains(text(),'Add AND')]")
	private WebElement AddAnd; // change the form number for the conditions in the page
	@FindBy(xpath = ".//*[@id='router']//paper-button[contains(text(),'Notifications')]")
	private WebElement bcNotifications;
	@FindBy(xpath = ".//*[@id='dialognotification']//paper-button[contains(text(),'Add')]")
	private WebElement bcNotificationsadd;
	@FindBy(xpath = ".//*[@id='dialognotification']//paper-button[contains(text(),'OK')]")
	private WebElement bcNotificationsok;
	@FindBy(xpath = ".//*[@id='dialognotification']//paper-button[contains(text(),'Cancel')]")
	private WebElement bcNotificationscancel;

	 @FindBy(xpath="//*[contains(text(),'One-time')]/..")
	 private WebElement oneOffRadioButton;
	 @FindBy(xpath=".//label[contains(.,'Send Time')]/../input")
	 private WebElement oneOffSendTimeField;
	 @FindBy(xpath=".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]")
	 private WebElement oneOffSendTimeDateOkButton;
	 @FindBy(xpath="//paper-dialog[@id='productDialog']//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
		private WebElement productFilterIcon;
	 @FindBy(xpath="//*[@id='filterForm']//label[contains(.,'Product Name')]/../input")
	 private WebElement filterProductNameField;
	 @FindBy(xpath="//iron-data-table[@id='productTable']//paper-dialog[@id='filterDialog']/div/paper-button[3]")
	 private WebElement productFilterApplyButton;
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

	public void enterBroadcastName(String name) throws InterruptedException {
		jswait.loadSendKeys(broadcastName, name);
	}
	public void enterFilterProductName(String name) throws InterruptedException {
		jswait.loadSendKeys(filterProductNameField, name);
	}
	public void selectOneOffSendTimeDate(String date) throws InterruptedException {
		jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='"+date+"']");
	}
	public void clickOneOffRadioButton() throws InterruptedException {
		jswait.loadClick(oneOffRadioButton);
	}
	public void clickProductFilterApplyButton() throws InterruptedException {
		jswait.loadClick(productFilterApplyButton);
	}
	public void clickProductFilterButton() throws InterruptedException {
		jswait.loadClick(productFilterIcon);
	}
	public void clickOfferPopUpProceedButton() throws InterruptedException {
		jswait.loadClick(offerPopUpProceedButton);
	}
	public void clickOneOffSendTimeDateOkButton() throws InterruptedException {
		jswait.loadClick(oneOffSendTimeDateOkButton);
	}
	public void clickOneOffSendTimeField() throws InterruptedException {
		jswait.loadClick(oneOffSendTimeField);
	}
	public void selectOneOffDateAndTimeNow() throws InterruptedException {
		Calendar rightNow =Calendar.getInstance();
    	String mn = "";
    	if(rightNow.get(Calendar.MONTH)+1<9) {
    		mn = "0"+Integer.toString(rightNow.get(Calendar.MONTH)+1);
    	}
    	else 
    		mn = Integer.toString(rightNow.get(Calendar.MONTH)+1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR))+"-"+mn+"-"+String.format("%02d",rightNow.get(Calendar.DAY_OF_MONTH));
    	int hours = rightNow.get(Calendar.HOUR);
      	 int min = rightNow.get(Calendar.MINUTE);
      	 int am_pm = rightNow.get(Calendar.AM_PM);
      	 int day = rightNow.get(Calendar.DAY_OF_MONTH);
      	 int year = rightNow.get(Calendar.YEAR);
      	 int month = rightNow.get(Calendar.MONTH)+1;
      	 min+=2;
      	 int rem = min%5;
      	 rem = 5-rem;
      	 min+=rem;
      	 if(min>59){
      		 min-=60;
      		 hours++;
      	 }
      	 clickOneOffRadioButton();
      	clickOneOffSendTimeField();
      	selectOneOffSendTimeDate(date);
      	clickOneOffSendTimeDateOkButton();
	}

	public String getTopBcStatus() throws InterruptedException {
		jswait.waitUntil(topBcStatusGrid);
		String status = topBcStatusGrid.getText();
		return status;
	}

	public void clickCreateButton() throws InterruptedException {
		jswait.loadClick(createButtonBc);
	}

	public void clickBcEndNeverRadioButton() throws InterruptedException {
		jswait.loadClick(recurringBcEndNeverRadio);
	}

	public void clickBcEndAtRadioButton() throws InterruptedException {
		jswait.loadClick(recurringBcEndAtRadio);
	}

	public void clickActivateConfirmYes() throws InterruptedException {
		jswait.loadClick(activateConfirmYes);
	}

	public void clickActivateButton() throws InterruptedException {
		jswait.loadClick(activateButtonBc);
	}
	public void clickSaveButton() throws InterruptedException {
		jswait.loadClick(saveButtonBc);
	}

	public void enterBroadcastPurpose(String pur) throws InterruptedException {
		jswait.loadSendKeys(broadcastPurpose, pur);
	}

	public void clickProceedButton() throws InterruptedException {
		jswait.loadClick(proceedButton);
	}

	public void selectBaseList(String baseList) throws InterruptedException {
		jswait.loadSendKeys(baseListSelector, baseList);
		jswait.loadClick(
				"//form[@id='baseListsForm']//following::vaadin-combo-box-item[contains(.,'" + baseList + "')]");
	}

	public void selectLabelCrossell() throws InterruptedException {
		jswait.loadClick(labelSelector);
		jswait.loadClick(labelCrossell);
	}

	public void selectLabelInformation() throws InterruptedException {
		jswait.loadClick(labelSelector);
		jswait.loadClick(labelInformation);
	}

	public void selectInventoryUnlimited() throws InterruptedException {
		jswait.loadSendKeys(inventorySelector, "Unlimited");
		jswait.loadClick(inventoryUnlimited);
	}

	public void selectInventory1() throws InterruptedException {
		jswait.loadClick(inventoryClearButton);
		jswait.loadClick(inventorySelector);
		jswait.loadClick(inventorySelect1);
	}

	public void selectTrigger1() throws InterruptedException {
		jswait.loadClick(triggersSelector);
		Thread.sleep(2500);
		jswait.loadClick(triggersSelector);
		// jswait.loadClick(triggersSelector);
		jswait.loadClick(triggerSelect2);
	}

	public void selectTrigger2() throws InterruptedException {
		jswait.loadClick(triggerSelect1);
	}

	public void viewBroadcast() throws InterruptedException {
		jswait.loadClick(viewBroadcast);
	}

	public void selectTrackSession() throws InterruptedException {
		jswait.loadClick(trackSessionSelector);
		jswait.loadClick(trackSessionAfter);
		jswait.loadSendKeys(trackSession2Days, "5");
	}

	public void selectTrackingSource() throws InterruptedException {
		jswait.loadSendKeys(trackingSourceSelector, "track");
		jswait.loadClick(trackingSourceTrack);
	}

	// --------------------------------------------------------------//
	public void clickcreateTargetCondition() throws InterruptedException {
		jswait.loadClick(targetbccreate);
	}

	public void ClickCopyAsAnd() throws InterruptedException {
		jswait.loadClick(bccopyasand);
	}

	public void ClickCopiedAnd() throws InterruptedException {
		jswait.loadClick(clickCopiedAnd);
	}

	public void AddAnd() throws InterruptedException {
		jswait.loadClick(AddAnd);
	}

	public void bcNotifications() throws InterruptedException {
		jswait.loadClick(bcNotifications);
	}

	public void bcNotificationsadd() throws InterruptedException {
		jswait.loadClick(bcNotificationsadd);
	}

	public void bcNotificationsok() throws InterruptedException {
		jswait.loadClick(bcNotificationsok);
	}

	public void bcNotificationscancel() throws InterruptedException {
		jswait.loadClick(bcNotificationscancel);
	}

	// ----------------------------------------------------------------//

	public void selectSenderAndRoute() throws InterruptedException {
		jswait.loadSendKeys(senderIdBroadcastSelector, "Address-SMPP");
		jswait.loadClick(senderIdBroadcastAdressSmpp);
		jswait.loadSendKeys(routeBroadcast, "SMPP Robi outbond");
		jswait.loadClick(routeBroadcastSmppRobiOutbond);
		jswait.loadSendKeys(senderIdFulfillmentSelector, "Address-SMPP");
		// jswait.loadClick(senderIdFulfillmentSelector);
		// Thread.sleep(4000);
		jswait.loadClick(senderIdFulfillmentAdressSmpp);
		// wait.until(ExpectedConditions.elementToBeClickable(senderIdFulfillmentAdressSmpp)).click();
		jswait.loadSendKeys(routeFulfillment, "SMPP Robi outbond");
		Thread.sleep(2000);
		jswait.loadClick(routeFulfillmentSmppRobiOutbond);
	}

	public void enterBroadcastBasicDetails(String name) throws InterruptedException {
		enterBroadcastName(name);
		enterBroadcastPurpose("Purpose of BC is NOTHING");
		selectLabelCrossell();
		selectInventoryUnlimited();
	}

	public void selectOffer(String offerName) throws InterruptedException {
		jswait.loadClick(".//data-table-cell[contains(.,'" + offerName + "')]/..//*[@id='checkboxContainer']");
	}

	public void selectFirstOffer() throws InterruptedException {
		jswait.loadClick(firstOfferCheckBox);
	}

	public void selectRecurrancePattern() throws InterruptedException {
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
		jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
		Thread.sleep(1000);
		jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
		Thread.sleep(1000);
		jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
		Thread.sleep(1000);
		jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
		Thread.sleep(2000);
		jswait.loadClick(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/paper-input[1]//div");
		WebElement num = driver.findElement(By.xpath(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
						+ (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
		jswait.loadClick(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/paper-input[2]//div");
		WebElement num1 = driver.findElement(By.xpath(
				"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
						+ (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();

		Thread.sleep(1000);

		jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
		Thread.sleep(2000);
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");

	}

	public void createBC(String name, String bc_type, String baseList, String offer) throws InterruptedException {
		enterBroadcastBasicDetails(name);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		clickProceedButton();
		selectBaseList(baseList);
		clickProceedButton();
		selectOffer(offer);
		selectTrackSession();
		selectTrackingSource();
		selectSenderAndRoute();
		clickProceedButton();
	}

	public void validateNameField() throws InterruptedException, UnsupportedFlavorException, IOException {
		enterBroadcastName("efwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaqwqw");
		Assert.assertTrue(commonObjects.getTextFormTextField(broadcastName).length() == 50,
				"Error in character limit of name field");
	}

	public void checkDetailsTabHeaderColor() throws Exception {
		jswait.waitUntil(detailsTabHeader);
		String color = detailsTabHeader.getCssValue("background-color");
		Assert.assertEquals(color, "rgba(84, 205, 152, 1)", "wrong header color after pproceed");
	}

	public void validatePurposeField() throws InterruptedException, UnsupportedFlavorException, IOException {
		enterBroadcastName(
				"aaaaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasaefwefwefwefwefwefwefwefwefwefwefwefwefwefwefwasasasdsd");
		Assert.assertTrue(commonObjects.getTextFormTextField(broadcastPurpose).length() == 500,
				"Error in character limit of purpose field");
	}

	public void verifySelectionFields() throws InterruptedException, UnsupportedFlavorException, IOException {
		selectLabelCrossell();
		selectLabelInformation();
		selectInventoryUnlimited();
		selectInventory1();
		selectTrigger1();
		selectTrigger2();
		List<WebElement> tags = driver.findElements(By.xpath("//paper-tag/div"));
		Assert.assertTrue(tags.size() == 2, "error in multi select field");
	}


}
