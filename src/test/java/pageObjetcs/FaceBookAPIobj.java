package pageObjetcs;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.itextpdf.text.log.SysoCounter;

import baseClasses.CalenderUtility;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class FaceBookAPIobj extends Init {
	JSWaiter jswait = new JSWaiter();
	CommonObjects commonObjects = new CommonObjects();

	BroadcastPageObjects broadcastPageObject = new BroadcastPageObjects();
	ExcelHelper excel = new ExcelHelper();
	CalenderUtility calender = new CalenderUtility();

	////////////////////// ##############WebElement of FaceBook BroadCast Deliver
	////////////////////// Tab//////////////////

	@FindBy(xpath = "(//div[@class=\"month-row month-name style-scope paper-calendar\"]//span[@class='style-scope paper-calendar'])[2]")
	private WebElement textOfMonthCalndr;

	@FindBy(xpath = "//iron-icon[@icon='date-picker:chevron-left']")
	private WebElement calndrPrevButton;

	@FindBy(xpath = "//label[text()='Select Facebook Account']/../input[@id='input']")
	private WebElement seltFaceBokAckSendKeY;

	@FindBy(xpath = "//label[text()='Select Instagram Account']/../input[@id='input']")
	private WebElement instagramInpt;

	@FindBy(xpath = "//label[text()='Ad Budget Types']/../input[@id='input']")
	private WebElement budgetTypes;

	@FindBy(xpath = "//label[text()='Budget Amount']/../input[@id='input']")
	private WebElement budgetAmount;

	@FindBy(xpath = "//div[@id='radioLabel'][contains(.,'Never')]")
	private WebElement NeverRadiobtn;

	@FindBy(xpath = ".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input")
	private WebElement recurrencepatternInput;

	@FindBy(xpath = "//*[@id='deliver-card']//paper-item[contains(.,'Days')]")
	private WebElement recurrencepatternDays;

	@FindBy(xpath = "//*[contains(@class,'recurrence')]//input")
	private WebElement recurrenceinput;

	@FindBy(xpath = "(//label[contains(.,'Start broadcasts at')]//following::input)[1]")
	private WebElement startBroadcastAtField;

	@FindBy(xpath = "(//label[contains(.,'Start broadcasts at')]//following::paper-button[contains(.,'OK')])[2]")
	private WebElement startBroadcastOkButton;
	
	@FindBy(xpath = "//paper-button[text()='Create New Domain Field']")
	private WebElement createNewDomainFieldBtn;
	
	
	//Event creation custom event 
	
	@FindBy(xpath = "//div[@id='labelAndInputContainer']/../iron-icon[@icon='paper-dropdown-menu:arrow-drop-down']")
	private WebElement eventField;
	
	@FindBy(xpath = "//div[@id='labelAndInputContainer']//label[text()='Label']/.././/./textarea[@id='textarea']")
	private WebElement labelTextField;
	
	@FindBy(xpath = "(//div[@class='label-and-input-container style-scope paper-input-container']//label[text()='Description']/../../div//textarea[@id='textarea'])[2]")
	private WebElement descriptionTextField;
	
	
	@FindBy(xpath = "//div[@id='labelAndInputContainer']//label[text()='Type']/../input")
	private WebElement typeField;
	
	
	@FindBy(xpath = "//paper-item[text()='Number']")
	private WebElement Number;
	
	@FindBy(xpath = "(//paper-button[text()='Save'])[2]")
	private WebElement createDomainFieldSaveBtn;
	
	
	//************WebElements of FaceBook Sync Events Mapping NeonDx events and FaceBook events
	
	
	@FindBy(xpath = "//div[@id='labelAndInputContainer']//label[text()='Base Lists']/../input[@is='iron-input']")
	private WebElement BaseListsField;
	
	
	@FindBy(xpath = "//paper-icon-button[@id='toggleIcon']//iron-icon[@id='icon']")
	private WebElement dropDownButton;
	
	
	
	
	
	

	public FaceBookAPIobj() {
		PageFactory.initElements(driver, this);
	}

	public void inputDeliveryTabForOneTimeBC(String bc_Type, String bcSheet) throws Exception {

		System.out.println("Inside --OneOFFBC--pageObjectMethod");
		excel.setExcelFile("bcInputData", bcSheet);

		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		
		//changing 138 line back to min+=2;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if (min == 0) {
			min += 5;
		}
		String Start_Date = "";

		// ****Storing BroadCast startDate in Excel sheet BC_Input data column 11 in row
		// 1
	

		String monthString = calender.getMonthForInt(rightNow.get(Calendar.MONTH));
		if (am_pm == 0) {
			Start_Date = String.format("%02d", day) + " " + monthString.substring(0, 3) + " " + year + " "
					+ String.format("%02d", hours) + ":" + String.format("%02d", min) + " AM GMT+05:30";
		} else {
			Start_Date = String.format("%02d", day) + " " + monthString.substring(0, 3) + " " + year + " "
					+ String.format("%02d", hours) + ":" + String.format("%02d", min) + " PM GMT+05:30";
		}
		try {

			excel.setCell(1, 11, Start_Date);
		} catch (Exception e) {
			System.out.println("Excel setCell problem in pageObject of FaceBookAPI");
		}

		Actions builder = new Actions(driver);
		Thread.sleep(5000);
		broadcastPageObject.clickOneOffRadioButton();
		Thread.sleep(1000);
		jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
		Thread.sleep(1000);

		System.out.println("date: " + date);

		String aMonth = textOfMonthCalndr.getText();
		

//		String getMonth = aMonth.substring(0, 9);

		

		// This part is extra added to successfully select Month while running month end
		// date if condition

		if (!(aMonth.contains(monthString))) {
			jswait.loadClick(calndrPrevButton);
			System.out.println("Running in Month End date Inside If");
		}
		Thread.sleep(1000);
		jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
		Thread.sleep(1000);

		jswait.loadClick(
				".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
		Thread.sleep(1000);
		jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

		Thread.sleep(2000);
		jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
		WebElement num = driver.findElement(By.xpath(
				".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);
		WebElement num1 = driver.findElement(By.xpath(
				".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
		Thread.sleep(1000);
		builder.moveToElement(num1).click().build().perform();
		if (am_pm == 0)
			jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
		else
			jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

		jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
		Thread.sleep(2000);

		jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
		Thread.sleep(2000);

		// This part is extra added to successfully select Month while running month end
		// date if condition

		if (!(aMonth.contains(monthString))) {
			jswait.loadClick(calndrPrevButton);
			System.out.println("Running in Month End date Inside If");
		}

		jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
		Thread.sleep(1000);

		jswait.loadClick(
				".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
		Thread.sleep(3000);
		jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
		Thread.sleep(2000);
		num = driver.findElement(By.xpath(
				".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
						+ (hours + 1) + "]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(1000);

		WebElement num2 = driver.findElement(By.xpath(
				".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
						+ (min + 1) + "]"));
		builder.moveToElement(num2).click().build().perform();
		Thread.sleep(1000);
		if (am_pm == 0) {
			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
			builder.moveToElement(num1).click().build().perform();

		} else {
			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
			builder.moveToElement(num1).click().build().perform();
		}

		num1 = driver.findElement(By.xpath(
				".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
		builder.moveToElement(num1).click().build().perform();
		Thread.sleep(3000);

		// Selecting FaceBook account other spaces Budgt instagram account ##########
		try {

			jswait.loadClick(seltFaceBokAckSendKeY);

			Thread.sleep(2000);

			jswait.loadSendKeys(seltFaceBokAckSendKeY, "NEONxTel" + Keys.ENTER);
			Thread.sleep(2000);

			jswait.loadClick(instagramInpt);
			Thread.sleep(2000);
			jswait.loadSendKeys(instagramInpt, "flyops12" + Keys.ENTER);

			Thread.sleep(1000);

			jswait.loadClick(budgetTypes);
			Thread.sleep(1000);
			jswait.loadSendKeys(budgetTypes, "Daily" + Keys.ENTER);
			Thread.sleep(1000);

			jswait.loadClick(budgetAmount);
			jswait.loadSendKeys(budgetAmount, "100");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("X path issue of any one of Select FaceBook account");
			System.out.println("X path issue of may be Instagram account , budget etc.....");
		}

	}

	public void inputDeliveryTabforRecurringBC(String endType, String renderTime, String expiry, String bcSheet)
			throws Exception {
		Actions builder = new Actions(driver);
		excel.setExcelFile("bcInputData", bcSheet);
		String recurrencePattern = excel.getCellByColumnName("Recurrance Pattern");
		System.out.println("Recurrence pattern " + recurrencePattern);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		String date2 = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH) + 2);
		String date1 = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH) + 1);
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
		if (min == 0) {
			min += 5;
		}
		System.out.println("Inside recurring");
		Thread.sleep(5000);
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
		jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");

		if (renderTime.equalsIgnoreCase("real time")) {
			System.out.println("==Inside realTime recurring ");

			jswait.loadClick(".//*[@id='months']//div[@date='" + date + "']");
			jswait.loadClick("//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");

			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			Thread.sleep(3000);

			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			Thread.sleep(2000);
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);

			// clicking and full selecting clock A_M and P_M
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");

			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(2000);

			// selecting Time Zone

			Thread.sleep(2000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);

			if (endType.equalsIgnoreCase("none")) {
				System.out.println("end type :" + endType);
				jswait.loadClick(NeverRadiobtn);

				if (recurrencePattern.equalsIgnoreCase("2days")) {

					jswait.loadClick(recurrencepatternInput);
					Thread.sleep(1000);
					jswait.loadClick(recurrencepatternDays);
					Thread.sleep(1000);
					jswait.loadSendKeys(recurrenceinput, "2");
					Thread.sleep(1000);

					// Selecting time for Start BC at
					jswait.loadClick(startBroadcastAtField);
					Thread.sleep(4000);

					// selecting Hour
					System.out.println("+++++++++++++++++++++++inside satrt broadcast at time+++++++++++++++++++++");
					WebElement num2 = driver.findElement(
							By.xpath("(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
									+ (hours + 1) + "])[2]"));
					builder.moveToElement(num2).click().build().perform();
					Thread.sleep(2000);

					// selecting Minute and saving

					WebElement num3 = driver.findElement(
							By.xpath("(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
									+ (min + 1) + "])[2]"));
					Thread.sleep(3000);
					builder.moveToElement(num3).click().build().perform();
					Thread.sleep(3000);
					if (am_pm == 0)
						jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
					else
						jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");
					jswait.loadClick(startBroadcastOkButton);

				}

			}

		}
		// Selecting FaceBook account other spaces Budget instagram account ##########
		try
		{
			
		
		jswait.loadClick(seltFaceBokAckSendKeY);

		Thread.sleep(2000);
		jswait.loadSendKeys(seltFaceBokAckSendKeY, "NEONxTel" + Keys.ENTER);
		Thread.sleep(2000);

		jswait.loadClick(instagramInpt);
		Thread.sleep(2000);
		jswait.loadSendKeys(instagramInpt, "flyops12" + Keys.ENTER);

		Thread.sleep(1000);

		jswait.loadClick(budgetTypes);
		Thread.sleep(1000);
		jswait.loadSendKeys(budgetTypes, "Daily" + Keys.ENTER);
		Thread.sleep(1000);

		jswait.loadClick(budgetAmount);
		jswait.loadSendKeys(budgetAmount, "100");
		Thread.sleep(2000);
		
		
		}
		catch (Exception e) {
			
			System.out.println("X path issue of any one of Select FaceBook account");
			System.out.println("X path issue of may be Instagram account , budget etc.....");
		}
		

	}
	public void clickCreateNewDomField()throws Exception
	{
		jswait.loadClick(createNewDomainFieldBtn);
	}
	
	public void click_On_CustomEventName(String eventName)throws Exception
	{
		jswait.loadClick("//data-table-cell//span[contains(.,'"+eventName+"')]");
	}
	

	
	public void selectEvent_FieldAs_Value()throws Exception
	{
		jswait.loadClick("//paper-listbox//paper-item[5]");
	}
	
	public void clickOn_EventField()throws Exception
	{
		jswait.loadClick(eventField);
	}
	
	public void inputLabelName(String labelName)throws Exception
	{
		jswait.loadSendKeys(labelTextField,labelName);
	}
	
	public void inputDescription(String labelName)throws Exception
	{
		jswait.loadSendKeys(descriptionTextField,labelName);
	}
	
	public void clickOnTypeField()throws Exception
	{
		jswait.loadClick(typeField);
	}
	public void clickOnNumber()throws Exception
	{
		jswait.loadClick(Number);
	}
	public void clickOn_create_domainField_SaveBtn() throws Exception
	{
		jswait.loadClick(createDomainFieldSaveBtn);
	}
	
	
	public void create_Value_Custom_event(String labelName)throws Exception
	{
		Thread.sleep(2000);
		clickOn_EventField();
		Thread.sleep(2000);
		selectEvent_FieldAs_Value();
		inputLabelName(labelName);
		inputDescription(labelName);
		Thread.sleep(2000);
		
		 clickOnTypeField();
		 
		 clickOnNumber();
		 clickOn_create_domainField_SaveBtn();
		 Thread.sleep(2000);
		 
		
		
	}
	
	
	//****************############ Methods |||||||||| for FaceBook Sync events  
	
	
	public void clickOn_BaseList()throws Exception
	{
		jswait.loadClick(BaseListsField);
	}
	
	
	public void select_CustomerList(String customerListName)throws Exception
	{
		clickOn_BaseList();
		Thread.sleep(1000);
		jswait.loadSendKeys(BaseListsField, customerListName);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[@class='style-scope vaadin-combo-box-overlay' and contains(.,'"+customerListName+"')]");
		Thread.sleep(1000);
		//clicking Save Button
		jswait.loadClick("//paper-button[text()='Save']");
		
	}
	
	/////  Methods for Mapping Sync events Fb Event Details Tab   ==========================
	
	
	public void click_onDropDown()throws Exception
	{
		jswait.loadClick(dropDownButton);
	}
	
	public void selectFaceBookEvent(String eventName)throws Exception
	{
		jswait.loadClick("//div[@id='items']//vaadin-combo-box-item[contains(.,'"+eventName+"')]");
		
	}
	
	public void removeEventAttributes()throws Exception
	{
		List<WebElement> delete=driver.findElements(By.xpath("//paper-icon-button[@id='clear' and @icon='delete']//iron-icon[@id='icon']"));
		System.out.println("count of Delete Buttons = "+delete.size());
		
		for(int i=0;i<delete.size();i++)
		{
			jswait.loadClick(delete.get(i));
			Thread.sleep(1000);
		}
		
	}
	
	public void clickOnPlusOfEventAttribute()throws Exception
	{
		jswait.loadClick("//paper-icon-button[@title='Add Event Attribute']//iron-icon[@id='icon']");
	}
	
	public void selectValueAtrribute(String atributeName)throws Exception
	{
		try
		{
		jswait.loadClick("(//paper-icon-button[@id='toggleIcon']//iron-icon[@id='icon'])[3]");
		}
		catch(Exception e)
		{
			System.out.println("X path problem of Event attribute field Down Arrow Button ");
		}
		
		
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+atributeName+"')]");
		
	}
	
	
	
	public void configEventDetailsTab(String eventName)throws Exception
	{
		click_onDropDown();
		Thread.sleep(2000);
		selectFaceBookEvent(eventName);
		Thread.sleep(1000);
		removeEventAttributes();
		Thread.sleep(2000);
		clickOnPlusOfEventAttribute();
		Thread.sleep(2000);
		 selectValueAtrribute("Value");
		 Thread.sleep(2000);
		 jswait.loadClick("//paper-button[text()='Proceed']");
		 Thread.sleep(2000);
		
	}
	
	
	public void selectCustomEventFromDrop(String eventName)throws Exception
	{
		try {
			jswait.loadClick("(//div[@class='label-and-input-container style-scope paper-input-container']//input[@is='iron-input'])[4]");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("X path problem of Drop Down Arrow In Map neon DX tab ");
			
		}
		
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+eventName+"')]");
		Thread.sleep(2000);
	}
	
	
	public void select_ValueField()throws Exception
	{
		try {
			//jswait.loadClick("(//paper-icon-button[@id='toggleIcon']//iron-icon[@id='icon'])[5]");
			jswait.loadClick("(//paper-input-container/div[2]/div/paper-icon-button[2]/iron-icon)[5]");
			//or use -> (//paper-input-container/div[2]/div/paper-icon-button[2]/iron-icon)[5]
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("X path problem of drop Down Select arrow Action Source ");
		}
		
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Event Domain')]");
		
		try {
			jswait.loadClick("(//paper-icon-button[@id='toggleIcon']//iron-icon[@id='icon'])[6]");
		} catch (Exception e) {
			System.out.println("X path issue of SubDomain Arrow Button");
		}
		Thread.sleep(1000);
		jswait.loadClick("(//vaadin-combo-box-item[contains(.,' value')])[2]");
		
	}
	
	
	public void select_ActionSource()throws Exception
	{
		try {
			jswait.loadClick("(//paper-icon-button[@id='toggleIcon']//iron-icon[@id='icon'])[7]");
			
		} catch (Exception e) {
			System.out.println("X path problem of value Arrow Button");
		}
		
		Thread.sleep(1000);
		jswait.loadClick("(//vaadin-combo-box-item[contains(.,'Static Value')])[2]");
		jswait.loadSendKeys("//div[@id='labelAndInputContainer']//label[text()='Value']//following::input[@id='input']", "others");
	}
	
	
	public void configMapNeonDX_TAb(String eventName)throws Exception
	{
		selectCustomEventFromDrop(eventName);
		select_ValueField();
		select_ActionSource();
		Thread.sleep(2000);
		jswait.loadClick("(//paper-button[text()='Save'])[3]");
		
	}
	

	
	
	//Step  for adding relevant event Sel_custom_event so that only it will be displayed in Sync events
	
	
	public void selectCustomEventIn_relevantOpt(String customEventName)throws Exception
	{
		jswait.loadClick("//paper-icon-button[@class='dropdown-trigger style-scope partner-panel x-scope paper-icon-button-0']//iron-icon[@id='icon']");
		
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[text()='Edit']");
		jswait.loadClick("//paper-item[text()='Relevant Event Options']");
		Thread.sleep(1000);
		jswait.loadClick("//div[@id='checkboxContainer']");
		Thread.sleep(2000);
		jswait.loadClick("//div[@class='buttons style-scope event-options']//paper-button[text()='Save']");
		Thread.sleep(2000);
		
	}
	
	
	//Method to verify Display of Mandatory Attributes
	
	public List<String> save_AttributesToList()throws Exception
	{
		
		List<WebElement> elements = null;
		try
		{	
		 elements=driver.findElements(By.xpath("//vaadin-combo-box-item"));
		}
		catch (Exception e) {
			System.out.println("Drop down Doesnt contain any attributes");
			Assert.assertTrue(false);
		}
		Thread.sleep(1000);
		List<String>names=new ArrayList<String>();
		
		System.out.println("Total Attributes In DropDown =>>"+elements.size());
		
		for(int i=0;i<elements.size();i++)
		{
			names.add(elements.get(i).getText());
		}
		
		return names;
	}
	
	
}
