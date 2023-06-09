package baseClasses;
import java.io.File;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;


public class Init {
public static WebDriver driver;
public static int passScenario = 0;
public static PropHandler p = new PropHandler();
public static Logger log;
public static File fileForCsvReport; 
public static PrintWriter printWriterForCsvReport; 
public static StringBuilder stringBuilderForCsvReport; 
	public static void init() throws InterruptedException{
	System.out.println("Initializing Browser.....");
//	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver81");
	System.setProperty("webdriver.chrome.driver", "browser_files\\chromedriver.exe");
	
	System.out.println("++++++++ building the automation project +++++++++");
	//driver=new ChromeDriver();
	ChromeOptions capability = new ChromeOptions();
    capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
    capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
     driver = new ChromeDriver(capability);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	

	Thread.sleep(5000);
	
	try {
		System.out.println(System.getProperty("log"));
		log = Logger.getLogger("automatioLog");
	}catch(Exception e) {
		System.out.println("Could not create log file");
	}
	}
	public static void initPropFile() {
		p.setPropertyFile("config.properties");	
	}
	//CONFIGURATIONS
	public static Date dateForCompare = new Date();
	public static int forExcelSpreadsheet = -1;
	public final String INVENTORY_ONE_PER_DAY = "sel_one_per_day";
	public final String INVENTORY_MANUAL_BLACKOUT="inventory_manual";
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
	public final String SELENIUM_USSD_APP = "USSDselenium";
	public final String BASE_LIST4 = "CG20_1M_List";
	public final String LANGUAGE1 = "English";
	public final String LANGUAGE2 = "Arabic";
	public final String SENDER_SMPP = "Address-SMPP";
	public final String ROUTE_SMPP = "SMPP Robi outbound";
	//public final String SENDER_EMAIL = "Email Route";
	public final String SENDER_EMAIL = "Address-SMPP";
	public final String ROUTE_EMAIL = "Email outbound";
	public final String SELENIUM_LIST = "selenium_list";
	public final String SELENIUM_UCG_LIST = "Selenium_UCG_List";
	public final String SELENIUM_LIST_IM = "Selenium_IM_list";
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
	public final String TRACK_SOURCE1 = "B_track_Sel";
	public final String TRACK_SOURCE2 = "Usage Metric";
	public final String EMAIL_PROFILE_FIELD = "Email_q11";
	public final String AGE_PROFILE_FIELD = "Age_q11";
	public final String GROUP_ID_PROFILE_FIELD = "GroupId_q11";
	public final String AGE_PROFILE_FIELD_UNIQUE = "Age_Unique";
	public final String AGE_DYNAMIC_VARIABLE = "AGEupdate18112022";
	public final String NAME_PROFILE_FIELD = "First Name_q11";
	public final String SELENIUM_PARTNER = "selenium_partner";
	public final String SELENIUM_SHARED_EVENT ="Selenium event shared_q11";
	public final String SELENIUM_LIST_SUB ="Selenium list sub_q11";
	public final String SEL_LIST="sel list_q11";                                          
	public final String USAGE_METRIC_UNIQUE = "Unique_Metric";
	public String KPI_TEXT1 ="";
	public String KPI_TEXT2 ="";
	public String SEND_TIME_DATA ="";
	public String TARGET_CONDITION_AFTER_IMPORT ="";
	public String TRIGGER = "SeleniumTrigger";
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
	public final String SELMULTI_REWARD ="selmulti_reward";
	public final String SEEEDING_REWARD ="Seeding_Reward";
	public final String SELENIUM_REWARD="selenium_reward";
	public final String SELENIUM_LORD_REWARD="Lord_Reward";
	public final String SELENIUM_TOPG_REWARD="Top_Reward";
	public final String SELENIUM_REWARD_TEST="Selenium_reward_test";
	public final String INVENTORY_UNLIMITED = "Unlimited";
	public final String INVENTORY_ONEPERDAY="sel_one_per_day";
	public final String INVENTORY_BLACKOUTALWAYS="selenium_blackout_always";
	public static int programoffer=1;
	public final String globalResonseKeywords="selenium app";
	public final String globalResonseKeywordforbc="selenium_app_for_bc";
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
