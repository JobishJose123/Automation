package pageObjetcs;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class BiVerifyObject extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper excel = new ExcelHelper();
	ExcelHelper ex=new ExcelHelper();
	
	
	
	
	
	//x path for Time ranges
	
	@FindBy(xpath ="//label[text()='Name']/../input")
	private WebElement nameField;
	@FindBy(xpath ="//label[text()='Description']/../input")
	private WebElement descField;
	@FindBy(xpath ="//div[text()='No time ranges defined.']//following::iron-icon[1]")
	private WebElement plusBtnTimeRange;
	@FindBy(xpath ="//label[text()='Time Range Name']/../input")
	private WebElement timeRangeName;
	@FindBy(xpath ="//h4[text()='Select your Time Range Type']//following::paper-radio-button[2]")
	private WebElement radioCustomRange;
	@FindBy(xpath ="//div[@class='buttons style-scope reports-time-range']//paper-button[text()='Save']")
	private WebElement timeRangeSaveBtn;
	
	@FindBy(xpath ="//field-date-part-date/div/div[2]//paper-dropdown-menu[1]//label[text()='Select']/../input")
	private WebElement selectDayOfMnth;
	@FindBy(xpath ="//field-date-part-date/div/div[2]//paper-dropdown-menu[2]//label[text()='Select']/../input")
	private WebElement selectThisMonth;
	@FindBy(xpath ="//paper-input-wrapper//input")
	private WebElement thisMonthDecNumbr;
	
	@FindBy(xpath ="//div[@id='months']/div[2]/div/span")
	private WebElement calndrMonthText;
	@FindBy(xpath ="//div[@id='monthNav']/div[1]//iron-icon")
	private WebElement calndrPrevBtn;
	@FindBy(xpath ="//div[@class='container style-scope paper-date-time-input']//input[@is='iron-input']")
	private WebElement timeRangeDateField;
	@FindBy(xpath ="//paper-dialog[@id='dateDialog']//paper-button[text()='OK']")
	private WebElement timeRangeCalndrOkBtn;
	//column configure 
	
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[7]")
	private WebElement firstColumnClick;
	@FindBy(xpath ="//iron-image[@id='configure']")
	private WebElement configureBtn;
	@FindBy(xpath ="//paper-radio-button[@name='DATE']/div[1]")
	private WebElement dateRadioBtn;
	@FindBy(xpath ="//div[@val='tables']//paper-button[text()='Save']")
	private WebElement columnSaveBtn;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[8]")
	private WebElement secondColumnClick;

	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[9]")
	private WebElement thirdColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[10]")
	private WebElement fourthColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[11]")
	private WebElement fifthColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[12]")
	private WebElement sixthColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[13]")
	private WebElement seventhColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[14]")
	private WebElement eighthColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[15]")
	private WebElement ninethColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[16]")
	private WebElement tenthColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[17]")
	private WebElement eleventhColumnClick;
	
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[18]")
	private WebElement twelvethColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[19]")
	private WebElement thirteenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[20]")
	private WebElement fourteenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[21]")
	private WebElement fifteenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[22]")
	private WebElement sixteenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[23]")
	private WebElement seventeenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[24]")
	private WebElement eighteenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[25]")
	private WebElement nineteenColumnClick;
	@FindBy(xpath ="//iron-ajax[@id='getHeaders']//following::div[26]")
	private WebElement twentyColumnClick;
	
	//:: Elements headers  radio Buttons
	@FindBy(xpath ="//paper-radio-button[@name='HEADER']/div[1]")
	private WebElement elementsRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='IM']/div[1]")
	private WebElement inboundMarketingRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='PM']/div[1]")
	private WebElement outboundMarketingRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='OfferProducts']/div[1]")
	private WebElement offersAndProductsRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='EVENTS']/div[1]")
	private WebElement EventsRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='Segment']/div[1]")
	private WebElement customerSegmentsRadioBtn;
	
	@FindBy(xpath ="//paper-radio-button[@name='CUSTOM']/div[1]")
	private WebElement customEventsRadioBtn;
    @FindBy(xpath ="//label[text()='Event']/../input")
    private WebElement customEventField;
    @FindBy(xpath ="//label[text()='Domain']/../input")
    private WebElement customEventDomainField;
    
    
	///:::End of Element headers radio Buttons
	
	
	
	// calculations headers 
	
	@FindBy(xpath ="//paper-radio-button[@name='CALCULATION']/div[1]")
	private WebElement calculationsRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='EVENT']/div[1]" )
	private WebElement EventRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='METRIC']/div[1]")
	private WebElement MetricRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='DERIVED']/div[1]")
	private WebElement createCalculationRadioBtn;
	
	///::: End of calculations radio buttons 
	
	//::Aggregation Type Radio Buttons 
	
	@FindBy(xpath ="//paper-radio-button[@name='COUNT']/div[1]")
	private WebElement countAggregateRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='SUM']/div[1]")
	private WebElement sumAggregateRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='AVG']/div[1]")
	private WebElement averageAggregateRadioBtn;
	
	//:: End of Aggregate radio buttons
	
	
	
	@FindBy(xpath ="//label[text()='Element']/../input")
	private WebElement ElementField;
	@FindBy(xpath ="//div[@class='buttons style-scope report-header-dialog']//paper-button[text()='Save']")
	private WebElement elementHeaderSaveBtn;
	
	@FindBy(xpath ="//label[text()='Saved Segments']/../input")
	private WebElement savedSegmentField;
	
	//:: pencil Button , Header text fields 
	
	@FindBy(xpath ="//paper-dialog-scrollable//following::div[2][contains(.,'Give a name to the Header')]//following::paper-button[1]//iron-icon")
	private WebElement nameToheaderPencilBtn;
	
	@FindBy(xpath ="//label[text()='Header Name']/../input")
	private WebElement HeaderNameTextField;
	
	@FindBy(xpath ="//label[text()='Attribute Name']/../input")
	private WebElement attributeTextField;
	
	//::::::::Events Ack ,conv....
	@FindBy(xpath ="//paper-button[text()='Next']")
	private WebElement NextButton;
	@FindBy(xpath ="//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down']")
	private WebElement eventTypeArrowBtn;
	
	@FindBy(xpath ="//paper-radio-button[@name='2']/div[1]")
	private WebElement totalCountRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@name='3']/div[1]")
	private WebElement uniqueCountRadioBtn;
	
	@FindBy(xpath ="//div[@class='pageHeading layout horizontal justified style-scope report-header-dialog']")
	private WebElement clickOnTopEvent;
	@FindBy(xpath ="//div[@class='buttons style-scope report-header-dialog']//paper-button[text()='Save']")
	private WebElement eventSaveButton;
	
	@FindBy(xpath ="//label[text()='Select from the options given']/../input")
	private WebElement customerSetTextField;
	
	@FindBy(xpath ="//label[text()='Customer Set']/../input")
	private WebElement customerSetMetricField;
	
	@FindBy(xpath ="//label[text()='Metric']/../input")
	private WebElement Metricfield;
	@FindBy(xpath ="//paper-dropdown-menu[1]//label[text()='Select']/../input")
	private WebElement metricTimeRangeWeek;
	@FindBy(xpath ="//paper-dropdown-menu[2]//label[text()='Select']/../input")
	private WebElement metricDaySpecific;
	
	@FindBy(xpath ="//paper-button[contains(.,'Schedule & Share')]")
	private WebElement scheduleShareBtn;
	
	@FindBy(xpath ="//label[text()='Start Date']/../input")
	private WebElement startDate;
	
	@FindBy(xpath ="//div[@class='main-div style-scope schedule-component']//paper-card[1]//paper-dialog[@id='dateDialog']//paper-button[text()='OK']")
	private WebElement startDateOkBtn;
	
	@FindBy(xpath ="//paper-date-time-input/div/paper-input[2]/paper-input-container/div[2]/div/input")
	private WebElement firstTimeField;
	
	@FindBy(xpath ="//div[@class='main-div style-scope schedule-component']//paper-card[1]//paper-dialog[@id='timeDialog']//paper-button[text()='OK']")
	private WebElement firstTimeOkBtn;
	
	@FindBy(xpath ="//paper-radio-button[@name='NEVER']/div[1]")
	private WebElement NeverRadioBtn;
	
	@FindBy(xpath ="//label[text()='Recurrence Pattern']/../input")
	private WebElement recurencePattern;
	@FindBy(xpath ="//label[text()='Recur Every']/../input")
	private WebElement recurenceInput;
	
	@FindBy(xpath ="//label[text()='Starts at']/../input")
	private WebElement startsAt;
	@FindBy(xpath ="//paper-time-picker[@id='timePicker']//following::paper-button[text()='OK'][3]")
	private WebElement startsAtOkBtn;
	
	@FindBy(xpath ="//paper-button[contains(.,'Proceed')]")
	private WebElement proceedButtonBI;
	@FindBy(xpath ="//paper-button[contains(.,'Done')]")
	private WebElement doneButtonBI;
	
	
	//:: xapth for get text() status of Worksheet 
	@FindBy(xpath ="//span[@class='style-scope reports-grid']")
	private WebElement currentStatusTextSheet;
	
	@FindBy(xpath ="//iron-icon[@id='filter']")
	private WebElement externalfilterBtn;
	@FindBy(xpath ="//paper-button[text()='Add']")
	private WebElement externalFilterAddBtn;	
	@FindBy(xpath ="//label[text()='Column']/../input")
	private WebElement headerExternalFilterField;
	
	@FindBy(xpath ="//label[text()='Condition']/../input")
	private WebElement conditionExternalFilterField;
	@FindBy(xpath ="//div[@class='input-content style-scope paper-input-container']//input")
	private WebElement valueExternalFilterField;
	
	//::verification x paths 
	
	@FindBy(xpath ="//paper-radio-button[@value='PM']/div[1]")
	private WebElement pmOnlyRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@value='IM']/div[1]")
	private WebElement imOnlyRadioBtn;
	@FindBy(xpath ="//paper-radio-button[@value='EVENT']/div[1]")
	private WebElement BothRadioBtn;
	
	@FindBy(xpath ="//div[@id='checkboxContainer']")
	private WebElement incldSedRwd;
	
	@FindBy(xpath ="//div[@class='layout horizontal flex style-scope create-report']//following::label[text()='Description']/../input")
	private WebElement calcDescriptionField;
	
	@FindBy(xpath ="//div[@class='content layout vertical flex style-scope create-calculation']//paper-icon-button[@icon='icons:add']")
	private WebElement plusButtonCreateCalc;
	
	@FindBy(xpath ="//label[text()='Combination Formula']/../input")
	private WebElement formulaFieldCreateCalc;
	
	///::Group x paths Below
	///
	@FindBy(xpath ="//paper-checkbox[@id='checkbox']//div[@id='checkboxContainer']")
	private WebElement createGroupsCheckBox;
	
	@FindBy(xpath ="//div[@class='addGroupBtn style-scope report-header-dialog']//paper-icon-button[@icon='icons:add']//iron-icon[@id='icon']")
	private WebElement groupPlusBtn;
	
	@FindBy(xpath ="//div[@class='input-content style-scope paper-input-container']//input[@id='input']")
	private WebElement groupValueField;
	
	/////::::::: Group X path is Over
	
	/////:::X paths for Internal filter 
	@FindBy(xpath ="//paper-icon-button[@icon='filter-list']/iron-icon")
	private WebElement internalFilterBtn;
	@FindBy(xpath ="//paper-button[text()='Apply']")
	private WebElement applyButton;
	
	
	
	
	
	
	public BiVerifyObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void input_Name_Description(String name, String desc)throws Exception {
		jswait.loadSendKeys(nameField, name);
		jswait.loadSendKeys(descField, desc);
	}
	
	public boolean isPM_disabled() throws Exception {
		input_Name_Description("Sel_Bi", "regression");
		Thread.sleep(1000);
		selectTimeRange("Last Month to Date");
		dateColumnSelect();
		Thread.sleep(1000);
		secondColumnSelect();
		selectProgramColumn();
		thirdColumnSelect();
		WebElement statusText = driver.findElement(By.xpath("//paper-radio-button[@name='PM']"));

		if (statusText.getAttribute("aria-disabled").equals("true"))
			return true;
		else
			return false;

	}
	
	public boolean isIM_disabled() throws Exception {
		input_Name_Description("Sel_Bi", "regression");
		Thread.sleep(1000);
		selectTimeRange("Last Month to Date");
		dateColumnSelect();
		Thread.sleep(1000);
		secondColumnSelect();
		selectCampaignCategoryColumn();
		thirdColumnSelect();
		WebElement statusText = driver.findElement(By.xpath("//paper-radio-button[@name='IM']"));

		if (statusText.getAttribute("aria-disabled").equals("true"))
			return true;
		else
			return false;
		
	}
	
	public boolean isCreateCalcDisabled() throws Exception {
		input_Name_Description("Sel_Bi", "regression");
		Thread.sleep(1000);
		selectTimeRange("Yesterday");
		dateColumnSelect();
		Thread.sleep(1000);
		secondColumnSelect();
		selectBroadcastNameColumn();
		thirdColumnSelect();
		jswait.loadClick(calculationsRadioBtn);
		WebElement statusText = driver.findElement(By.xpath("//paper-radio-button[@name='DERIVED']"));

		if (statusText.getAttribute("aria-disabled").equals("true"))
			return true;
		else
			return false;

	}
	
	
	
	public void firstColumnSelect()throws Exception {
		jswait.loadClick(firstColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void secondColumnSelect()throws Exception {
		jswait.loadClick(secondColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void thirdColumnSelect()throws Exception {
		jswait.loadClick(thirdColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void fourthColumnSelect()throws Exception {
		jswait.loadClick(fourthColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void fifthColumnSelect()throws Exception {
		jswait.loadClick(fifthColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void sixthColumnSelect()throws Exception {
		jswait.loadClick(sixthColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void seventhColumnSelect()throws Exception {
		jswait.loadClick(seventhColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void eighthColumnSelect() throws Exception {
		jswait.loadClick(eighthColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void ninethColumnSelect() throws Exception {
		jswait.loadClick(ninethColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void tenthColumnSelect() throws Exception {
		jswait.loadClick(tenthColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void eleventhColumnSelect() throws Exception {
		jswait.loadClick(eleventhColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	public void twelvethColumnSelect() throws Exception {
		jswait.loadClick(twelvethColumnClick);
		Thread.sleep(1000);
		jswait.loadClick(configureBtn);
	}
	
	
	public void autoDatePick(String date) throws Exception {
		Calendar rightNow = Calendar.getInstance();
		Map<Integer, String> map = new HashMap<Integer, String>();

		String currentMonth = "";
		String currentYear = "";

		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			currentMonth = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			currentMonth = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);

		int y = rightNow.get(Calendar.YEAR);

		String words[] = date.split("-");
		String month = words[1];
		String year = words[0];
		currentYear = Integer.toString(y);

		if (currentMonth.equals(month) && currentYear.equals(year)) {
			jswait.loadClick("//paper-date-picker//div[@date='" + date + "']");
			Thread.sleep(2000);
			jswait.loadClick(timeRangeCalndrOkBtn);
			Thread.sleep(1000);
		} else {

			Thread.sleep(2000);
			map.put(1, "January");
			map.put(2, "February");
			map.put(3, "March");
			map.put(4, "April");
			map.put(5, "May");
			map.put(6, "June");
			map.put(7, "July");
			map.put(8, "August");
			map.put(9, "September");
			map.put(10, "October");
			map.put(11, "November");
			map.put(12, "December");

			int key = Integer.parseInt(month);
			String monthText = map.get(key);
			String expected = monthText + " " + year;

			while (!getStatus(expected, calndrMonthText)) {
				jswait.loadClick(calndrPrevBtn);
				Thread.sleep(3000);
			}

			jswait.loadClick("//paper-date-picker//div[@date='" + date + "']");
			Thread.sleep(2000);
			jswait.loadClick(timeRangeCalndrOkBtn);
			Thread.sleep(1000);

		}
		

	}
	
    public void selectTimeRange(String timeRange)throws Exception
    {
    	Calendar rightNow = Calendar.getInstance();
    	 Map<Integer,String> map=new HashMap<Integer,String>();  
    	
    	jswait.loadClick(plusBtnTimeRange);
    	Thread.sleep(2000);
    	jswait.loadSendKeys(timeRangeName,timeRange);
    	
		if (timeRange.equalsIgnoreCase("between yesterday and tomorrow")) {
			jswait.loadClick(radioCustomRange);
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			Thread.sleep(3000);
			jswait.loadClick("//paper-item[contains(.,'is between')]");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[1]//label[text()='Select']/../input");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[1]//paper-item[contains(.,'yesterday (start of)')]");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[2]//label[text()='Select']/../input");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[2]//paper-item[contains(.,'tomorrow (start of)')]");
			Thread.sleep(1000);
		}
		else if (timeRange.equalsIgnoreCase("is on today") || timeRange.equalsIgnoreCase("is on yesterday")) {
			jswait.loadClick(radioCustomRange);
			Thread.sleep(1000);
			jswait.loadClick("(//label[text()='Select']/../input)[1]");
			Thread.sleep(3000);
			jswait.loadClick("//paper-item[contains(.,'is on')]");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[1]//label[text()='Select']/../input");
			Thread.sleep(1000);
			if (timeRange.equalsIgnoreCase("is on today")) {
				jswait.loadClick("//paper-item[contains(.,'today')]");
			} else if (timeRange.equalsIgnoreCase("is on yesterday")) {
				jswait.loadClick("//paper-item[contains(.,'yesterday')]");
			}

			Thread.sleep(2000);
		}
		
		else if (timeRange.equalsIgnoreCase("Yesterday")) {
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
			Thread.sleep(1000);
			jswait.loadClick("//paper-radio-group[@id='radioButtons'][2]//paper-radio-button[1]");
			Thread.sleep(1000);
		} else if (timeRange.equalsIgnoreCase("Last week")) {
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
			Thread.sleep(1000);
			jswait.loadClick("//paper-radio-group[@id='radioButtons'][2]//paper-radio-button[2]");
			Thread.sleep(1000);
		} else if (timeRange.equalsIgnoreCase("Last month")) {
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
			Thread.sleep(1000);
			jswait.loadClick("//paper-radio-group[@id='radioButtons'][2]//paper-radio-button[3]");
			Thread.sleep(1000);
		} else if (timeRange.equalsIgnoreCase("This Month to Date")) {

			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
			Thread.sleep(1000);
			jswait.loadClick("//paper-radio-group[@id='radioButtons'][2]//paper-radio-button[4]");
			Thread.sleep(1000);

		} else if (timeRange.equalsIgnoreCase("Last Month to Date")) {
			jswait.loadClick("//h4[text()='Select your Time Range Type']//following::paper-radio-button[1]");
			Thread.sleep(1000);
			jswait.loadClick("//paper-radio-group[@id='radioButtons'][2]//paper-radio-button[5]");
			Thread.sleep(1000);
		}
		else if(timeRange.contains("-"))
		{
			String currentMonth="";
			String currentYear="";
			
			if (rightNow.get(Calendar.MONTH) + 1 < 9) {
				currentMonth = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
			} else
				currentMonth = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
			
			int y=rightNow.get(Calendar.YEAR);
			
		   String words[]=timeRange.split("-");
		   String month=words[1];
		   String year=words[0];
		  currentYear=Integer.toString(y);
		  
			
			
			System.out.println(":: Date-: "+timeRange);
			jswait.loadClick(radioCustomRange);
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			Thread.sleep(3000);
			jswait.loadClick("//paper-item[contains(.,'is on')]");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[1]//label[text()='Select']/../input");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[text()='on']");
			Thread.sleep(1000);
			jswait.loadClick(timeRangeDateField);
			Thread.sleep(2000);
			
			if (currentMonth.equals(month) && currentYear.equals(year)) {
				jswait.loadClick("//paper-date-picker//div[@date='" + timeRange + "']");
				Thread.sleep(2000);
				jswait.loadClick(timeRangeCalndrOkBtn);
				Thread.sleep(1000);
			}
			else 
			{
					Thread.sleep(2000);
					map.put(1,"January");
					map.put(2,"February");
					map.put(3,"March");
					map.put(4,"April");
					map.put(5,"May");
					map.put(6,"June");
					map.put(7,"July");
					map.put(8,"August");
					map.put(9,"September");
					map.put(10,"October");
					map.put(11,"November");
					map.put(12,"December");
					
			int key=Integer.parseInt(month);
		    String monthText=map.get(key);
		    String expected=monthText+" "+year;
			
		    while (!getStatus(expected, calndrMonthText)) {
				jswait.loadClick(calndrPrevBtn);
				Thread.sleep(3000);
			}
		 
		    jswait.loadClick("//paper-date-picker//div[@date='" +timeRange+ "']");
			Thread.sleep(2000);
			jswait.loadClick(timeRangeCalndrOkBtn);
			Thread.sleep(1000);
				
			}
			
			
			
		}
		else if (timeRange.contains("Auto")) {
			
			//pick from excel cell 
			excel.setExcelFile("biDataSetup","OneOffBcA");
			String dataSetupRunDate =(String) excel.getCell(1,4);
			System.out.println("Data SetUp Run Date -:::>  "+dataSetupRunDate);

			jswait.loadClick(radioCustomRange);
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Select')]//following::input[1]");
			Thread.sleep(3000);
			jswait.loadClick("//paper-item[contains(.,'is on')]");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[1]//label[text()='Select']/../input");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[text()='on']");
			Thread.sleep(1000);
			jswait.loadClick(timeRangeDateField);
			Thread.sleep(2000);
			autoDatePick(dataSetupRunDate);
			
			

		}
		else 
		{
			int userInput;
			System.out.println("Day of Month ");
			jswait.loadClick(radioCustomRange);
			Thread.sleep(1000);
			jswait.loadClick("(//label[text()='Select']/../input)[1]");
			Thread.sleep(3000);
			jswait.loadClick("//paper-item[contains(.,'is on')]");
			Thread.sleep(2000);
			jswait.loadClick("//field-date-part-date[1]//label[text()='Select']/../input");
			Thread.sleep(1000);
			jswait.loadClick("//field-date-part-date/div/div[1]//paper-item[contains(.,'day of month')]");
			Thread.sleep(1000);
			jswait.loadClick(selectDayOfMnth);
			Thread.sleep(1000);
			String temp=timeRange.replaceAll("[^\\d.]", "");
			userInput=Integer.parseInt(temp);
			int systemDate=rightNow.get(Calendar.DAY_OF_MONTH);
			jswait.loadClick("//paper-item[contains(.,'"+timeRange+" of')]");
			jswait.loadClick(selectThisMonth);
			if (userInput > systemDate) {
				jswait.loadClick("//paper-item[text()='this month -']");
				jswait.clearTextField(thisMonthDecNumbr);
				jswait.loadSendKeys(thisMonthDecNumbr, "1");
			} else {
				jswait.loadClick("//paper-item[text()='this month']");
			}
			
			
			
		}
		
    	jswait.loadClick(timeRangeSaveBtn);
    	
    }
    	
    //First column select included in Date method ..always come first
    public void dateColumnSelect() throws Exception {
		firstColumnSelect();
		jswait.loadClick(dateRadioBtn);
		jswait.loadClick("//paper-radio-button[@name='DAY']/div[1]");
		Thread.sleep(1000);
		jswait.loadClick(columnSaveBtn);
		Thread.sleep(2000);
	}
       
    
	public void selectProgramColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(inboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Program");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Program')][1]");
		Thread.sleep(1000);
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
    
	public void selectTouchpointColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(inboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Touchpoint");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Touchpoint')][1]");
		Thread.sleep(1000);
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
    
	public void selectRuleColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(inboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Program Rule");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Program Rule')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}

	public void selectTouchpointTypeColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(inboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Touchpoint Type");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Touchpoint Type')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
    
	////PM column headers 
	
	
	public void selectCampaignCategoryColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(outboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Campaign Category Name");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Campaign Category Name')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
	
	public void selectCampaignNameColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(outboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Campaign Name");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Campaign Name')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
	
	
	public void selectBroadcastNameColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(outboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Broadcast Name");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Broadcast Name')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
	
	public void selectCampaignAttribute(String atbtName,String agregateType) throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(outboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Campaign Attributes");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Campaign Attributes')]");
		jswait.loadSendKeys(attributeTextField,atbtName);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+atbtName+"')]");
		
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField,"CampaignAttribute");
		
		if (agregateType.equalsIgnoreCase("count")) {
			jswait.loadClick(countAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			jswait.loadClick(averageAggregateRadioBtn);
		}

		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
	
	
	public void selectBroadcastAttribute(String atbtName,String agregateType)throws Exception
	{
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(outboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Broadcast Attributes");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Broadcast Attributes')]");
		jswait.loadSendKeys(attributeTextField,atbtName);
		Thread.sleep(2000);
		
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + atbtName + "')]");
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField,"BroadcastAttribute");
		
		if (agregateType.equalsIgnoreCase("count")) {
			jswait.loadClick(countAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			jswait.loadClick(averageAggregateRadioBtn);
		}

		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
		
	}

	
	///::: Offers and products headers 
	
	public void selectProductColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(offersAndProductsRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField,"Product");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Product')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(1000);
		
	}
	
	public void selectOfferColumn() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(offersAndProductsRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField, "Offer");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Offer')]");
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(1000);
	}
	
	public void selectOfferAttributeColumn(String atbtName, String agregateType) throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(offersAndProductsRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField, "Offer Attributes");
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'Offer Attributes')]");

		jswait.loadSendKeys(attributeTextField, atbtName);
		Thread.sleep(2000);

		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" +atbtName+ "')]");
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, "OfferAttribute");

		if (agregateType.equalsIgnoreCase("count")) {
			jswait.loadClick(countAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			jswait.loadClick(averageAggregateRadioBtn);
		}

		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}
	
	public void selectCustomerSegment() throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(customerSegmentsRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(savedSegmentField, "SelBiSegment");
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'SelBiSegment')]");
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, "Customer Segment");
		Thread.sleep(1000);
		jswait.loadClick(countAggregateRadioBtn);
		jswait.loadClick(elementHeaderSaveBtn);
		Thread.sleep(2000);
	}

	////::: Events Ack, Conversions..fulfill...From calculation on events 
	
	public void selectAckColumn(String headerName,String agregateType,String countType)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField,headerName);
		Thread.sleep(1000);
		
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[text()='Customer was sent the message']");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);
		
		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}
	
	public void selectConversionColumn(String headerName,String agregateType, String countType) throws Exception {
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField,headerName);
		Thread.sleep(1000);
		
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Customer converted')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);
		
		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}
	
	public void selectFulfilmentColumn(String headerName, String agregateType, String countType) throws Exception {
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Fulfillment Success')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);
		
		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);			
	}
	
			
	public void selectControlGroupParticipation(String headerName, String agregateType, String countType)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	

		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Control Group Participation')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);

		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);
	}
	
	public void selectControlGroupConversion(String headerName, String agregateType, String countType)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	

		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Control Group Conversion')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);

		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}
	
	/////:::::::IM Event columns selecting ::::::::::::::::::::::::::::::::
	
	public void selectOfferEligibleEvent(String headerName, String agregateType, String countType)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Customer was eligible for Offer')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);

		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}
	
	
	public void selectOfferEnquiryEvent(String headerName, String agregateType, String countType,String customerSet)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Offer Enquiry')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);

		selectCustomerSet(customerSet);
		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}
	
	public void selectOfferRecomendedEvent(String headerName, String agregateType, String countType)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Offer Recommended')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);

		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);				
	}
	
	public void selectOfferAcceptedEvent(String headerName, String agregateType, String countType)throws Exception
	{
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	
		if (agregateType.equalsIgnoreCase("sum")) {
			Thread.sleep(1000);
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Offer accepted')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		
		if (countType.equalsIgnoreCase("Total Count"))
			jswait.loadClick(totalCountRadioBtn);
		else if (countType.equalsIgnoreCase("Unique Count"))
			jswait.loadClick(uniqueCountRadioBtn);

		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);				
	}
	
	
	public void selectCustomerSet(String customerSet) throws Exception {
		jswait.loadSendKeys(customerSetTextField, customerSet);
		Thread.sleep(1000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + customerSet + "')]");
	}
	
	public void selectMetricColumn(String headerName,String customerSet,String metricName,String dayOrWeek,String day)throws Exception
	{  
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(MetricRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, headerName);
		Thread.sleep(1000);	
		jswait.loadClick(sumAggregateRadioBtn);
		jswait.loadClick(sumAggregateRadioBtn);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadSendKeys(customerSetMetricField,customerSet);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+customerSet+"')]");
		Thread.sleep(1000);	
		jswait.loadSendKeys(Metricfield, metricName);
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'"+metricName+"')]");
		jswait.loadClick(metricTimeRangeWeek);
		
		if (dayOrWeek.equalsIgnoreCase("By Day")) {
			jswait.loadClick("//paper-item[text()='By Day']");
			jswait.loadClick(metricDaySpecific);
			jswait.loadClick("//paper-item[contains(.,'" + day + "')]");
		}

		else if (dayOrWeek.equalsIgnoreCase("By Week")) {
			jswait.loadClick("//paper-item[text()='By Week']");
			jswait.loadClick(metricDaySpecific);
			jswait.loadClick("//paper-item[contains(.,'" + day + "')]");
		}

		jswait.loadClick(sumAggregateRadioBtn);
		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}
	
				
	
	///////::::::::::::::::Get status utility :::::::::::::::: 
	public boolean getStatus(String expected, WebElement element) throws Exception {
		return element.getText().equals(expected);
	}
    
	public void clickOnScheduleAndShare() throws Exception {
		jswait.loadClick(scheduleShareBtn);
		Thread.sleep(3000);
	}
	
	public void clickNeverRadioButton() throws Exception {
		Thread.sleep(1000);
		jswait.loadClick(NeverRadioBtn);
		Thread.sleep(1000);
	}
	
	public void selectRecurrencePattern(String days) throws Exception {
		jswait.loadClick(recurencePattern);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[@name='DAILY']");
		Thread.sleep(1000);
		jswait.loadSendKeys(recurenceInput, days);
		Thread.sleep(1000);
	}
	
	public void starts_At()throws Exception
	{
		
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
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		Actions builder = new Actions(driver);
		jswait.loadClick(startsAt);
		Thread.sleep(2000);
		
		WebElement num = driver.findElement(By.xpath(
				"(.//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours+1) + "])[2]"));
		builder.moveToElement(num).click().build().perform();
		Thread.sleep(2000);

		Thread.sleep(2000);
		WebElement num1 = driver.findElement(By.xpath(
				"(.//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min+1) + "])[2]"));
		Thread.sleep(1000);
    	 builder.moveToElement(num1).click().build().perform();
			if (am_pm == 0)
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[1])[2]");
			else
				jswait.loadClick("(.//*[@id='heading']/iron-selector[2]/div[2])[2]");
		
		jswait.loadClick(startsAtOkBtn);										
	}
	
	
	
	public void selectStartDateAndTime() throws Exception {
		Thread.sleep(1000);
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
		//int day = rightNow.get(Calendar.DAY_OF_MONTH);
		//int year = rightNow.get(Calendar.YEAR);
		//int month = rightNow.get(Calendar.MONTH) + 1;
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
		Actions builder = new Actions(driver);
		
		jswait.loadClick(startDate);
		 Thread.sleep(1000);
		 jswait.loadClick("//paper-card[1]//paper-date-time-input[1]//div[@date='" + date + "']");
		 Thread.sleep(1000);
		 jswait.loadClick(startDateOkBtn);
		 Thread.sleep(1000);
		 jswait.loadClick(firstTimeField);
		 Thread.sleep(3000);
		 
		 jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
		 
		 
		 WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			//
			//Selecting Seconds Time to 00
			WebElement seconds=driver.findElement(By.xpath(".//*[@id='secondClock']//*[@class='number style-scope paper-clock-selector'][1]"));
			Thread.sleep(1000);
			builder.moveToElement(seconds).click().build().perform();
			
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");
			
			Thread.sleep(1000);
			jswait.loadClick(firstTimeOkBtn);
			Thread.sleep(2000);	 
	}
	
	public void clickProccedButtonBI() throws Exception {
		Thread.sleep(1000);
		jswait.loadClick(proceedButtonBI);
		Thread.sleep(2000);
	}
	
	public void click_Done_Button() throws Exception {
		jswait.loadClick(doneButtonBI);
		Thread.sleep(2000);
	}
	
   
	public void shortCut_for_Schedule_Share() throws Exception {
		clickOnScheduleAndShare();
		selectStartDateAndTime();
		clickNeverRadioButton();
		selectRecurrencePattern("1");
		starts_At();
		clickProccedButtonBI();
		click_Done_Button();
	}
	
	
	public String getBiSheetStatus() throws Exception {
		Thread.sleep(2000);
		System.out.println(currentStatusTextSheet.getText());
		return currentStatusTextSheet.getText();
	}
	
	
	public void externalFilter(String headerName,String condition,String value) throws Exception {
		Thread.sleep(2000);
		jswait.loadClick(externalfilterBtn);
		Thread.sleep(1000);
		jswait.loadClick(externalFilterAddBtn);
		Thread.sleep(1000);
		jswait.loadClick(headerExternalFilterField);
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'"+headerName+"')]");
		jswait.loadClick(conditionExternalFilterField);
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'"+condition+"')]");
		jswait.loadSendKeys(valueExternalFilterField,value);
		
		jswait.loadClick("//paper-button[text()='Save']");		
	}
	
	public boolean getAgregate_DataStatus(WebElement agregateElement, String dataValue) throws Exception {
		String agregateData = agregateElement.getAttribute("title");
		agregateData = agregateData.replace(",", "");
		return agregateData.equals(dataValue);
	}
	
	public void selectPM_onlyRadioButton() throws Exception {
		jswait.loadClick(pmOnlyRadioBtn);
	}

	public void selectIM_onlyRadioButton() throws Exception {
		jswait.loadClick(imOnlyRadioBtn);
	}

	public void selectBoth_RadioButton() throws Exception {
		jswait.loadClick(BothRadioBtn);
	}
	
	public List<String> getAllColumnDatas(String columnNumber)throws Exception
	{
		WebElement columDatas;
		String column;
		String name;
		List<String>values=new ArrayList<String>();
		
		for (int i = 1; i <= 15; i++) {
			column = String.valueOf(i);
			columDatas = driver.findElement(By.xpath("//vaadin-grid-table-body[@id='items']//vaadin-grid-table-row["
					+ column + "]//vaadin-grid-table-cell[" + columnNumber + "]"));
			name = columDatas.getText();
			values.add(name);
		}		
		return values;		
	}
	
	public boolean verifyColumnDatas(List<String> listExpected, List<String> listActual) throws Exception {
		boolean status = true;
		for (String x : listExpected) {

			for (int i = 0; i < listActual.size(); i++) {
				if (x.equals(listActual.get(i))) {
					break;
				} else if (i == listActual.size() - 1) {
					System.out.println(">>--> Data Not Present:-> " + x);
					status = false;
				}
			}
		}		
		return status;
	}
	
	public boolean checkXpath(String xpath) {
		WebElement element = null;

		try {
			element = driver.findElement(By.xpath(xpath));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean checkDateColumns() throws Exception {
		ExcelHelper excelDate = new ExcelHelper();
		String date;
		List<String> dateExpected =new ArrayList<String>();
		List<String> dateActual=new ArrayList<String>();
		excelDate.setExcelFile("biDataSetup", "OneOffBcA");
		date = (String) excelDate.getCell(1, 4);
		dateExpected.add(date);
		dateActual=getAllColumnDatas("1");
		return verifyColumnDatas(dateExpected, dateActual);				
	}
	
	public boolean checkCampaignCategory() throws Exception {
		ExcelHelper excelCategory = new ExcelHelper();
		String categoryName;
		List<String> categoryExpected = new ArrayList<String>();
		List<String> categoryActual = new ArrayList<String>();
		excelCategory.setExcelFile("biDataSetup", "BiCategory");
		categoryName = excelCategory.getCellByColumnName("Category Name");
		categoryExpected.add(categoryName);
		categoryActual = getAllColumnDatas("2");
		return verifyColumnDatas(categoryExpected, categoryActual);
	}
	
	public boolean checkCampaignColumns() throws Exception {
		ExcelHelper excelCampaign = new ExcelHelper();
		List<String> campaignExpected = new ArrayList<String>();
		List<String> campaignActual = new ArrayList<String>();
		excelCampaign.setExcelFile("biDataSetup", "campaignOneoff");
		campaignExpected.add(excelCampaign.getCellByColumnName("Campaign Name"));
		excelCampaign.setExcelFile("biDataSetup", "campaignRecur");
		campaignExpected.add(excelCampaign.getCellByColumnName("Campaign Name"));
		excelCampaign.setExcelFile("biDataSetup", "campaignSeeding");
		campaignExpected.add(excelCampaign.getCellByColumnName("Campaign Name"));
		campaignActual = getAllColumnDatas("3");
		return verifyColumnDatas(campaignExpected, campaignActual); 
	}
	
	public boolean checkBroadcastNameColumns() throws Exception {
		ExcelHelper excelBC = new ExcelHelper();
		List<String> bcNameSheets = new ArrayList<String>();
		List<String> BcExpected = new ArrayList<String>();
		List<String> BcActual = new ArrayList<String>();

		bcNameSheets.add("OneOffBcA");
		bcNameSheets.add("OneOffBcB");
		bcNameSheets.add("OneOffBcC");
		bcNameSheets.add("OneOffBcD");
		bcNameSheets.add("OneOffBcE");

		bcNameSheets.add("RecuringBcA");
		bcNameSheets.add("RecuringBcB");
		bcNameSheets.add("RecuringBcC");
		bcNameSheets.add("RecuringBcD");
		bcNameSheets.add("RecuringBcE");

		bcNameSheets.add("SeedingBcA");
		bcNameSheets.add("SeedingBcB");
		bcNameSheets.add("SeedingBcC");
		bcNameSheets.add("SeedingBcD");
		bcNameSheets.add("SeedingBcE");

		for (String sheetName : bcNameSheets) {
			excelBC.setExcelFile("biDataSetup", sheetName);
			BcExpected.add(excelBC.getCellByColumnName("BC Name"));
		}
		BcActual = getAllColumnDatas("4");
		return verifyColumnDatas(BcExpected, BcActual);
	}
	
	
	public boolean checkCustomerSegmentColumn() throws Exception {
		List<String> segmentExpected = new ArrayList<String>();
		List<String> segmentActual = new ArrayList<String>();
		segmentExpected.add("SelBiSegment");
		segmentExpected.add("SelBiSegment");
		segmentActual = getAllColumnDatas("5");
		return verifyColumnDatas(segmentExpected, segmentActual);
	}
	
	public boolean checkCountsOfBcs(String eventNumber)throws Exception
	{   ExcelHelper excelEvent = new ExcelHelper();
		List<String> bcNameSheets= new ArrayList<String>();
		bcNameSheets.add("OneOffBcA");
		bcNameSheets.add("OneOffBcB");
		bcNameSheets.add("OneOffBcC");
		bcNameSheets.add("OneOffBcD");
		bcNameSheets.add("OneOffBcE");
		
		bcNameSheets.add("RecuringBcA");
		bcNameSheets.add("RecuringBcB");
		bcNameSheets.add("RecuringBcC");
		bcNameSheets.add("RecuringBcD");
		bcNameSheets.add("RecuringBcE");

		bcNameSheets.add("SeedingBcA");
		bcNameSheets.add("SeedingBcB");
		bcNameSheets.add("SeedingBcC");
		bcNameSheets.add("SeedingBcD");
		bcNameSheets.add("SeedingBcE");
		
		boolean status;
		boolean statusCase=true;
		String bcName;
		String AckValue;
		String xpath;
		
		for (String sheetName : bcNameSheets) {
			excelEvent.setExcelFile("biDataSetup", sheetName);
			bcName = excelEvent.getCellByColumnName("BC Name");
			AckValue = excelEvent.getCellByColumnName("Ack");
			xpath = "//vaadin-grid-table-cell//vaadin-grid-cell-content//span[@title='" + bcName+ "']/../../../vaadin-grid-table-cell[" + eventNumber + "]//span[@title='" + AckValue + "']";
			status = checkXpath(xpath);
			if (status == false) {
				System.out.println(
						"-->Event value not present! value Expected= " + AckValue + " for Broadcast :-> " + bcName);
				statusCase = false;
			}
		}
		return statusCase;	
	}
	
	public void selectIncludeSeedRWDCheckBox() throws Exception {
		jswait.loadClick(incldSedRwd);
	}
	
	
	///Methods for create calculation option
	//:::Utlities for create custom calculation starts Below :::::::::::
	///
	
	public void selectCalcFrontWindow(String headerName, String agregateType) throws Exception {
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(createCalculationRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField,headerName);
		Thread.sleep(1000);
		
		if (agregateType.equalsIgnoreCase("sum")) {
			jswait.loadClick(sumAggregateRadioBtn);
			jswait.loadClick(sumAggregateRadioBtn);
		} else if (agregateType.equalsIgnoreCase("average")) {
			Thread.sleep(1000);
			jswait.loadClick(averageAggregateRadioBtn);
			jswait.loadClick(averageAggregateRadioBtn);
		}
		
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
	}
	
	public void inputCalcDescription(String desc) throws Exception {
		jswait.loadSendKeys(calcDescriptionField, desc);
		Thread.sleep(1000);
	}
	
	public void selectCalcColumnEvent(String eventName,String columNumber)throws Exception
	{	String xpath="//div[@class='layout vertical style-scope create-calculation']["+columNumber+"]//label[text()='Select from the options given']/../input";
		jswait.loadSendKeys(xpath, eventName);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+eventName+"')]");
		
	}
	
	public void inputCombination_FormulaCreate_Calc(String formula) throws Exception {
		jswait.loadSendKeys(formulaFieldCreateCalc, formula);
	}
	
	public void select_fulfillment_Percent_Formula(String headerName, String agregateType) throws Exception {
		selectCalcFrontWindow(headerName, agregateType);
		inputCalcDescription("Selenium Calculations");
		selectCalcColumnEvent("fulfillment","1");
		jswait.loadClick(plusButtonCreateCalc);
		
		String xpath="//div[@class='layout vertical style-scope create-calculation'][2]//label[text()='Select from the options given']/../input";	
		jswait.loadSendKeys(xpath,"conversion");
		Thread.sleep(2000);
		jswait.loadClick("//div//following::vaadin-combo-box-item[contains(.,'conversion')][2]");	
		inputCombination_FormulaCreate_Calc("(k1/k2)*100");
		jswait.loadClick(eventSaveButton);
		
	}
	
	public void select_UniqueConversion_percent_Formula(String headerName, String agregateType) throws Exception {
		selectCalcFrontWindow(headerName, agregateType);
		inputCalcDescription("Selenium Calculations");
		selectCalcColumnEvent("conversion","1");
		jswait.loadClick(plusButtonCreateCalc);
        String xpath="//div[@class='layout vertical style-scope create-calculation'][2]//label[text()='Select from the options given']/../input";	
		jswait.loadSendKeys(xpath,"Ack");
		Thread.sleep(2000);
		jswait.loadClick("//div//following::vaadin-combo-box-item[contains(.,'Ack')][2]");
		inputCombination_FormulaCreate_Calc("(k1/k2)*100");
		jswait.loadClick(eventSaveButton);
	}
	
	
	public void select_Totalconversion_percent_Formula(String headerName, String agregateType) throws Exception {
		selectCalcFrontWindow(headerName, agregateType);
		inputCalcDescription("Selenium Calculations");
		String xpath="//div[@class='layout vertical style-scope create-calculation'][1]//label[text()='Select from the options given']/../input";
		
		jswait.loadSendKeys(xpath,"TotalConversion");
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(text(),'TotalConversion')]");
		jswait.loadClick(plusButtonCreateCalc);
		xpath="//div[@class='layout vertical style-scope create-calculation'][2]//label[text()='Select from the options given']/../input";
		jswait.loadSendKeys(xpath,"Ack");
		Thread.sleep(2000);
		jswait.loadClick("//div//following::vaadin-combo-box-item[contains(.,'Ack')][2]");
		inputCombination_FormulaCreate_Calc("(k1/k2)*100");
		jswait.loadClick(eventSaveButton);
	}
	///
	///::Utlities for Create custom calculation is Over >>>>>>>>>>>>>>>
	///

	//::Utilities for creating Groups 
	
	public void selectGroupFrontWindow(String headerName) throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(outboundMarketingRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(ElementField, headerName);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'" + headerName + "')]");
		jswait.loadClick(createGroupsCheckBox);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
	}
	
	public void selectGroupCondition(String groupName,String number,String condition,String groupHeaderVal)throws Exception
	{
		jswait.loadClick(groupPlusBtn);
		String nameXpath="//form//create-report-element-groups["+number+"]//label[text()='Name']/../input";
		jswait.loadSendKeys(nameXpath, groupName);
		jswait.loadClick("//create-report-element-groups["+number+"]//label[text()='Condition']/../input");
		Thread.sleep(1000);
		jswait.loadClick("//create-report-element-groups["+number+"]//paper-item[contains(.,'"+condition+"')]");
		jswait.loadSendKeys(groupValueField,groupHeaderVal);	
	}
	
	public void selectRemainingValues(String groupName,String number) throws Exception {
		jswait.loadClick(groupPlusBtn);
		String nameXpath="//form//create-report-element-groups["+number+"]//label[text()='Name']/../input";
		jswait.loadSendKeys(nameXpath, groupName);
		jswait.loadClick("//create-report-element-groups["+number+"]//paper-radio-button[@name='selectRemaining']//div[@id='radioContainer']");	
	}
	
	public void internalFilter(String headerName, String condition, String value) throws Exception {
		jswait.loadClick(internalFilterBtn);
		Thread.sleep(1000);
		jswait.loadClick(headerExternalFilterField);
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'"+headerName+"')]");
		jswait.loadClick(conditionExternalFilterField);
		Thread.sleep(2000);
		jswait.loadClick("//paper-item[contains(.,'"+condition+"')]");
		jswait.loadSendKeys(valueExternalFilterField,value);
		jswait.loadClick(applyButton);
	}
	
	public void select_BC_NameGroup() throws Exception {
		selectGroupFrontWindow("Broadcast Name");
		selectGroupCondition("Grp1OneOff", "1", "begins with", "OneOffBc");
		selectGroupCondition("Grp2Recur", "2", "begins with", "RecurBc");
		selectGroupCondition("Grp3Seed", "3", "begins with", "SeedBc");
		jswait.loadClick(eventSaveButton);
	}
	
	public void select_BC_NameGRP_Other() throws Exception {
		selectGroupFrontWindow("Broadcast Name");
		selectGroupCondition("Grp1OneOff", "1", "begins with", "OneOffBc");
		selectRemainingValues("Grp2SelOther", "2");
		jswait.loadClick(eventSaveButton);
	}
	
	public void select_camp_NameGroup() throws Exception {
		selectGroupFrontWindow("Campaign Name");
		selectGroupCondition("Grp1CampOneoff", "1", "begins with", "oneoffBCs");
		selectGroupCondition("Grp2CampRecur", "2", "begins with", "RecuringBCs");
		selectGroupCondition("Grp3CampSeed", "3", "begins with", "SeedingBCs");
		jswait.loadClick(eventSaveButton);
	}
	
	public void select_camp_NameGrp_other() throws Exception {
		selectGroupFrontWindow("Campaign Name");
		selectGroupCondition("Grp1CampOneoff", "1", "begins with", "oneoffBCs");
		selectRemainingValues("Grp2CampOther", "2");
		jswait.loadClick(eventSaveButton);
	}
	
	
	
	/////////::::::::::Group Verification :::::::::::::::::::::::::::::Utility Methods  
	
	
	public boolean get_statusOf_Ack_Conv_Fulfil(String ack,String conv,String fulfill)throws Exception
	{
		Thread.sleep(1000);
		boolean ackStatus;
		boolean convStatus;
		boolean fulfillStatus;
		
		WebElement AckElement = driver.findElement(By.xpath(
				"//div[@class='paper-carousel_wrapper style-scope paper-carousel']/div[contains(.,'Ack')]/div[2]"));
		
		WebElement ConvElement = driver.findElement(By.xpath(
				"//div[@class='paper-carousel_wrapper style-scope paper-carousel']/div[contains(.,'conversion')]/div[2]"));
		
		
		WebElement FulfillElement = driver.findElement(By.xpath(
				"//div[@class='paper-carousel_wrapper style-scope paper-carousel']/div[contains(.,'fulfillment')]/div[2]"));
		
		ackStatus=getAgregate_DataStatus(AckElement, ack);
		convStatus=getAgregate_DataStatus(ConvElement, conv);
		fulfillStatus=getAgregate_DataStatus(FulfillElement,fulfill);
		
		if (ackStatus == false) {
			System.out.println(":::::::::::::::::::::::Test case Failed ::::::::::::::::::::::::::::::::::");
			System.out.println(":::::::::::: Expected Acknowledgement value= " + ack);
			System.out.println(":::::::::::: Actual found Acknowledgement value= " + AckElement.getAttribute("title"));
		}
		 if (convStatus == false) {
			System.out.println(":::::::::::::::::::::::Test case Failed ::::::::::::::::::::::::::::::::::");
			System.out.println(":::::::::::: Expected Conversion value= " + conv);
			System.out.println(":::::::::::: Actual found Conversion value= " + ConvElement.getAttribute("title"));
		}
		
		 if (fulfillStatus == false) {
			System.out.println(":::::::::::::::::::::::Test case Failed ::::::::::::::::::::::::::::::::::");
			System.out.println(":::::::::::: Expected Fulfillment value= " + fulfill);
			System.out.println(":::::::::::: Actual found Fulfillment value= " + FulfillElement.getAttribute("title"));
		}
		
		if (ackStatus == true && convStatus == true && fulfillStatus == true)
			return true;
		else
			return false;
		
	}
	
	public boolean get_Status_Of_BcNameOneOff(String bcName, String Ack, String conversion, String fulfillment)
			throws Exception {
	
		externalFilter("Broadcast Name", "matches with", bcName);
		return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);

	}
	
	public boolean get_Status_of_BcNameRecur(String bcName, String Ack, String conversion, String fulfillment)throws Exception
	{ externalFilter("Broadcast Name", "matches with", bcName);
	  return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	public boolean get_Status_of_BcNameSeed(String bcName, String Ack, String conversion, String fulfillment)throws Exception
	{   externalFilter("Broadcast Name", "matches with", bcName);
       return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	public boolean get_Status_of_BcNameOther(String bcName, String Ack, String conversion, String fulfillment)
			throws Exception {
		externalFilter("Broadcast Name", "matches with", bcName);
		return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	
	public boolean get_Status_of_CampName_Oneoff(String campName,String Ack, String conversion, String fulfillment)throws Exception
	{	externalFilter("Campaign Name", "matches with", campName);
	    return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	public boolean get_Status_of_CampName_Recur(String campName,String Ack, String conversion, String fulfillment)throws Exception
	{   externalFilter("Campaign Name", "matches with", campName);
	    return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	public boolean get_Status_of_CampName_Seed(String campName,String Ack, String conversion, String fulfillment)throws Exception
	{   externalFilter("Campaign Name", "matches with", campName);
	     return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	public boolean get_Status_of_CampNameOther(String campName,String Ack, String conversion, String fulfillment)throws Exception
	{  externalFilter("Campaign Name", "matches with", campName);
	    return get_statusOf_Ack_Conv_Fulfil(Ack, conversion, fulfillment);
	}
	
	public void selectCustomEvent_Header(String eventName, String domain, String headerName) throws Exception {
		jswait.loadClick(elementsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventsRadioBtn);
		jswait.loadClick(customEventsRadioBtn);
		Thread.sleep(1000);
		jswait.loadSendKeys(customEventField,eventName);
		Thread.sleep(1000);
		jswait.loadClick("//vaadin-combo-box-item[contains(text(),'"+eventName+"')]");
		jswait.loadSendKeys(customEventDomainField,domain);
		Thread.sleep(1000);
		jswait.loadClick("//vaadin-combo-box-item[contains(text(),'"+domain+"')]");
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(1000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField,headerName);
		Thread.sleep(1000);
		jswait.loadClick(sumAggregateRadioBtn);
		jswait.loadClick(sumAggregateRadioBtn);
		jswait.loadClick(elementHeaderSaveBtn);	
	}
	
	public void selectConversionCustEvent() throws Exception {
		jswait.loadClick(calculationsRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(EventRadioBtn);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		Thread.sleep(2000);
		jswait.clearTextField(HeaderNameTextField);
		Thread.sleep(1000);
		jswait.loadClick(nameToheaderPencilBtn);
		jswait.loadSendKeys(HeaderNameTextField, "conversion");
		Thread.sleep(1000);
		jswait.loadClick(sumAggregateRadioBtn);
		jswait.loadClick(sumAggregateRadioBtn);
		
		Thread.sleep(1000);
		jswait.loadClick(NextButton);
		Thread.sleep(2000);
		jswait.loadClick(eventTypeArrowBtn);
		Thread.sleep(1000);
		jswait.loadClick("//paper-item[contains(.,'Customer converted')]");
		Thread.sleep(1000);
		jswait.loadClick(clickOnTopEvent);
		jswait.loadClick(uniqueCountRadioBtn);
		
		selectCustomerSet("CustomEvent");
		jswait.loadClick(eventSaveButton);
		Thread.sleep(2000);		
	}

/////////////////////////////////////////////////////////////////////////////////////////	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public void createOffersAndProductReport(String reportName,String timeRange,String sheetName)throws Exception
	{
		input_Name_Description(reportName,"created By selenium");
		selectTimeRange(timeRange);
		
		firstColumnSelect();
		selectProductColumn();
		secondColumnSelect();
		selectOfferColumn();
		thirdColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		fourthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		fifthColumnSelect();
		selectCustomerSegment();
		if (sheetName.equals("offerReportPM")) {
			System.out.println("::- Outbound Marketing Only -::");
			selectPM_onlyRadioButton();
		} else if (sheetName.equals("offerReportIM")) {
			System.out.println("::- Inbound Marketing Only -::");
			selectIM_onlyRadioButton();
		} else if (sheetName.equals("offerReportBoth")) {
			System.out.println("::- Both -::");
			selectBoth_RadioButton();
		}
		shortCut_for_Schedule_Share();			
	}
	
	
	public void createMetricAckReport(String reportName,String reportTimeRange,String metricTimeDayWeek,String days)throws Exception
	{
		input_Name_Description(reportName,"created By selenium");
		selectTimeRange(reportTimeRange);
		
		firstColumnSelect();
		selectBroadcastNameColumn();
		secondColumnSelect();
		selectAckColumn("Ack","sum","Total Count");
		thirdColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		fourthColumnSelect();
		selectMetricColumn("Metric1","Ack","SelBiMetric1",metricTimeDayWeek, days);
		fifthColumnSelect();
		selectMetricColumn("Metric2","Ack","SelBiMetric2",metricTimeDayWeek, days);
		sixthColumnSelect();
		selectMetricColumn("Metric3","Ack","SelBiMetric3",metricTimeDayWeek, days);
		seventhColumnSelect();
		selectMetricColumn("Metric4","conversion","SelBiMetric4",metricTimeDayWeek, days);
		eighthColumnSelect();
		selectCustomerSegment();
		shortCut_for_Schedule_Share();	
	}
	
 	
	public void createPM_DetailedReport(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		dateColumnSelect();
		secondColumnSelect();
		selectCampaignCategoryColumn();
		thirdColumnSelect();
		selectCampaignNameColumn();
		fourthColumnSelect();
		selectBroadcastNameColumn();
		fifthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		sixthColumnSelect();
		selectConversionColumn("conversion", "sum", "Unique Count");
		seventhColumnSelect();
		selectFulfilmentColumn("fulfillment", "sum", "Unique Count");
		eighthColumnSelect();
		selectCustomerSegment();
		shortCut_for_Schedule_Share();
	}
	
	public void createIM_DetailReport(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		dateColumnSelect();
		secondColumnSelect();
		selectTouchpointTypeColumn();
		thirdColumnSelect();
		selectTouchpointColumn();
		fourthColumnSelect();
		selectProgramColumn();
		fifthColumnSelect();
		selectRuleColumn();
		sixthColumnSelect();
		selectOfferEligibleEvent("offerEligible","sum","Unique Count");
		seventhColumnSelect();
		selectOfferEnquiryEvent("offerEnquiry","sum","Unique Count","offerEligible");
		eighthColumnSelect();
		selectOfferRecomendedEvent("offerRecommend","sum","Unique Count");
		ninethColumnSelect();
		selectOfferAcceptedEvent("offerAccepted","sum","Unique Count");
		tenthColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		eleventhColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		twelvethColumnSelect();
		selectCustomerSegment();
		shortCut_for_Schedule_Share();
	}
	
	
   public void createAttributeReport(String reportName, String timeRange)throws Exception
	{
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		selectCampaignNameColumn();
		thirdColumnSelect();
		selectBroadcastNameColumn();
		fourthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fifthColumnSelect();
		selectOfferAttributeColumn("SelOfferAttribute","sum");
		sixthColumnSelect();
		selectCampaignAttribute("SelCampAttribute","sum");
		seventhColumnSelect();
		selectBroadcastAttribute("SelBCAttribute","sum");
		eighthColumnSelect();
		selectCustomerSegment();
		shortCut_for_Schedule_Share();		
   }
	
	public void create_Include_Seed_Reward_Report(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		selectCampaignNameColumn();
		thirdColumnSelect();
		selectBroadcastNameColumn();
		fourthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fifthColumnSelect();
		selectConversionColumn("conversion","sum","Total Count");
		sixthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Total Count");
		seventhColumnSelect();
		selectCustomerSegment();
		selectIncludeSeedRWDCheckBox();
		shortCut_for_Schedule_Share();
	}
	
	public void create_custom_CalculationReport(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		firstColumnSelect();
		selectCampaignNameColumn();
		secondColumnSelect();
		selectBroadcastNameColumn();
		thirdColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fourthColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		fifthColumnSelect();
		selectConversionColumn("TotalConversion","sum","Total Count");
		sixthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		seventhColumnSelect();
		select_Totalconversion_percent_Formula("TotalConversion%","sum");
		eighthColumnSelect();
		select_UniqueConversion_percent_Formula("UniqueConversion%","sum");
		ninethColumnSelect();
		select_fulfillment_Percent_Formula("fulfillment%","sum");
		tenthColumnSelect();
		selectCustomerSegment();
		shortCut_for_Schedule_Share();		
	}
	
	public void create_Group_BCName_Report(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		ex.setExcelFile("biDataSetup","BiCategory");
		String campaignCategory=(String) ex.getCell(1,0);

		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		selectCampaignNameColumn();
		thirdColumnSelect();
		select_BC_NameGroup();
		fourthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fifthColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		sixthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		internalFilter("Campaign Category Name","matches with",campaignCategory);
		shortCut_for_Schedule_Share();		
	}
	
	public void create_Group_BCName_Other(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		ex.setExcelFile("biDataSetup","BiCategory");
		String campaignCategory=(String) ex.getCell(1,0);

		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		selectCampaignNameColumn();
		thirdColumnSelect();
		select_BC_NameGRP_Other();
		fourthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fifthColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		sixthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		internalFilter("Campaign Category Name","matches with",campaignCategory);
		shortCut_for_Schedule_Share();		
	}
	
	public void create_Group_CampaignName(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		ex.setExcelFile("biDataSetup","BiCategory");
		String campaignCategory=(String) ex.getCell(1,0);

		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		select_camp_NameGroup();
		thirdColumnSelect();
		selectBroadcastNameColumn();
		fourthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fifthColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		sixthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		internalFilter("Campaign Category Name","matches with",campaignCategory);
		shortCut_for_Schedule_Share();	
	}
	
	
	public void create_Group_campOther(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		ex.setExcelFile("biDataSetup", "BiCategory");
		String campaignCategory = (String) ex.getCell(1, 0);

		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		select_camp_NameGrp_other();
		thirdColumnSelect();
		selectBroadcastNameColumn();
		fourthColumnSelect();
		selectAckColumn("Ack", "sum", "Total Count");
		fifthColumnSelect();
		selectConversionColumn("conversion","sum","Unique Count");
		sixthColumnSelect();
		selectFulfilmentColumn("fulfillment","sum","Unique Count");
		internalFilter("Campaign Category Name","matches with",campaignCategory);
		shortCut_for_Schedule_Share();			
	}
	
	public void create_CustomEvent_Report(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		
		firstColumnSelect();
		selectCustomEvent_Header("selCustomEvent_BI","value","CustomEvent");
		secondColumnSelect();
		selectConversionCustEvent();
		shortCut_for_Schedule_Share();		
	}
	
	////////////::::::::::::UseCases from Here ::::::::::::::::::::::::///////////////////
	
	public void create_UseCase1_Report(String reportName, String timeRange) throws Exception {
		input_Name_Description(reportName, "created By selenium");
		selectTimeRange(timeRange);
		
		firstColumnSelect();
		selectCampaignCategoryColumn();
		secondColumnSelect();
		selectBroadcastNameColumn();
		thirdColumnSelect();
		selectAckColumn("B-Ack","sum","Total Count");
		
		
	}
	
	
    
}
