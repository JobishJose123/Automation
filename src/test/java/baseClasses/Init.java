package baseClasses;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import pageObjetcs.LoginPageObjects;

public class Init {
public static WebDriver driver;
public static int passScenario = 0;
public static PropHandler p = new PropHandler();
public static Logger log;
public static File fileForCsvReport; 
public static PrintWriter printWriterForCsvReport; 
public static StringBuilder stringBuilderForCsvReport; 
	public static void init() throws InterruptedException, FileNotFoundException{
	System.out.println("Initializing Browser.....");
	System.setProperty("webdriver.chrome.driver", "browser_files\\chromedriver2.37.exe");
	driver =  new ChromeDriver();
	driver.manage().window().maximize();
	try {
		System.out.println(System.getProperty("log"));
		log = Logger.getLogger("automatioLog");
	}catch(Exception e) {
		System.out.println("Could not create log file");
	}
//	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//	fileForCsvReport = new File("Run_"+timeStamp+".csv");
//	printWriterForCsvReport= new PrintWriter(fileForCsvReport);
//	stringBuilderForCsvReport= new StringBuilder();
	}
	public static void initPropFile() {
		p.setPropertyFile("config.properties");	
	}
	//CONFIGURATIONS
	public static Date dateForCompare = new Date();
	public static int forExcelSpreadsheet = -1;
	public final String INVENTORY_ONE_PER_DAY = "sel_one_per_day";
	public final String BASE_LIST = "selenium_list";
	public final String BASE_LIST_FOR_USE_TEMPLATE = "target_list";
	public final String BASE_LISTNack = "selenium_list NACK";
	public final String PREFERRED_LANGUAGE_PROFILE_FIELD = "Preferred Language_q11";
	public final String SITE_ID_PROFILE_FIELD = "Device ID_q11";
	public final String LOCATION_PROFILE_FIELD = "Location_q11";
	public final String DEVICE_INFO_FIELD = "Device ID_q11";
	public final String DEMOGRAPHICS_FIELD = "Demographics_q11";
	public final String DIGITAL_PERSONA_FIELD = "Digital Persona_q11";
	public final String LEARNED_BEHAVIOR_FIELD = "Learned Behaviour_q11";
	public final String ANALYTICAL_SCORES_FIELD = "Analytical Scores_q11";
	public final String DIGITAL_ENGAGEMENT_FIELD = "Digital Engagement_q11";
	public final String BALANCE_PROFILE_FIELD = "Balance_q11";
	public final String BASE_LIST2 = "Copy_paste_List";
	public final String BASE_LIST3 = "1M_List";
	public String SEND_TIME = "";
	public final String SMS_SHORT_CODE = "1011";
	public final String SELENIUM_USSD_APP = "USSD";
	public final String BASE_LIST4 = "CG20_1M_List";
	public final String LANGUAGE1 = "English";
	public final String LANGUAGE2 = "Portuguese";
	public final String SENDER_SMPP = "Address-SMPP";
	public final String ROUTE_SMPP = "SMPP Robi outbound";
	public final String SENDER_EMAIL = "Email Route";
	public final String ROUTE_EMAIL = "Email outbound";
	public final String SELENIUM_LIST = "selenium_list";
	public final String SELENIUM_DND_LIST = "selenium_list_DND";
	public final String SELENIUM_DISCOVERED_CLUSTERS_LIST = "Discovered Clusters_q11";
	public final String SELENIUM_CUSTOMER_DRIVEN_EVENT = "Selenium event_q11";
	public final String SELENIUM_USAGE_METRIC = "Selenium Usage Metric_q11";
	public final String SELENIUM_SHARED_METRIC = "Selenium_Metric Shared_q11";
	public final String SELENIUM_REVENUE_METRIC = "Selenium Revenue Metric_q11";
	public final String SELENIUM_EVENT_COUNTS = "Selenium Event counts_q11";
	public final String SELENIUM_MANDATORY_DND_LIST = "selenium_list_DND_mandatory";
	public final String SELENIUM_OPTIONAL_DND_LIST = "selenium_list_DND_optional";
	public final String TRACK_SOURCE = "A_track_Sel";
	public final String EMAIL_PROFILE_FIELD = "Email_q11";
	public final String AGE_PROFILE_FIELD = "Age_q11";
	public final String GROUP_ID_PROFILE_FIELD = "GroupId_q11";
	public final String AGE_PROFILE_FIELD_UNIQUE = "Age_Unique";
	public final String AGE_DYNAMIC_VARIABLE = "Age_Q990";
	public final String NAME_PROFILE_FIELD = "First Name_q11";
	public final String SELENIUM_PARTNER = "selenium_partner";
	
	public final String USAGE_METRIC_UNIQUE = "Unique_Metric";
	public String KPI_TEXT1 ="";
	public String KPI_TEXT2 ="";
	public String SEND_TIME_DATA ="";
	public String TARGET_CONDITION_AFTER_IMPORT ="";
	public String TRIGGER = "Trigger";
	public static int campaigncatarowcount=1;
	public static int campaignrowcount=1;
	public static int offercatarowcount=1;
	public static int bcrowcount=1;
	public final String SEL_COUNTRY="Country_q11";
	public final String SELENIUM_DATETIME="DateTime_q11";
	public final String SELENIUM_DATE="Date_q11";
	public final String SELENIUM_SHARED_List = "selenium_list_shared";
	public final String SELENIUM_Target_List = "selenium_list_target";
	public final String SELENIUM_TARGET_GROUP="Target Group_q11";
	public final String SEL_REWARD ="sel_reward";
	public final String INVENTORY_UNLIMITED = "Unlimited";
	public final String INVENTORY_ONEPERDAY="sel_one_per_day";
	public final String INVENTORY_BLACKOUTALWAYS="selenium_blackout_always";
	public static int programoffer=1;
}
//public class Init {
//public static WebDriver driver;
//public static int passScenario = 0;
//public static PropHandler p = new PropHandler();
//public static void init() throws InterruptedException, MalformedURLException{
//String Node = "http://192.168.124.41:4444/wd/hub";
//DesiredCapabilities cap = DesiredCapabilities.chrome();
//cap.setBrowserName("chrome");
//driver = new RemoteWebDriver(new URL(Node), cap);
//}
//}
