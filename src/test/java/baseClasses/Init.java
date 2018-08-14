package baseClasses;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
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

	public static void init() throws InterruptedException{
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
	}
	public static void initPropFile() {
		p.setPropertyFile("config.properties");	
	}
	//CONFIGURATIONS
	
	public final String BASE_LIST = "selenium_list";
	public final String PREFERRED_LANGUAGE_PROFILE_FIELD = "Preferred Language_q11";
	public final String SITE_ID_PROFILE_FIELD = "SiteID";
	public final String LOCATION_PROFILE_FIELD = "Location_q11";
	public final String DEVICE_INFO_FIELD = "Device ID_q11";
	public final String BALANCE_PROFILE_FIELD = "Balance_q11";
	public final String BASE_LIST2 = "Copy_paste_List";
	public final String BASE_LIST3 = "1M_List";
	public final String BASE_LIST4 = "CG20_1M_List";
	public final String LANGUAGE1 = "English";
	public final String LANGUAGE2 = "Portuguese";
	public final String SENDER_SMPP = "Address-SMPP";
	public final String ROUTE_SMPP = "SMPP Robi outbound";
	public final String SENDER_EMAIL = "Address-SMPP";
	public final String ROUTE_EMAIL = "Email_Chan_New";
	public final String SELENIUM_LIST = "selenium_list";
	public final String SELENIUM_DND_LIST = "selenium_list_DND";
	public final String SELENIUM_MANDATORY_DND_LIST = "selenium_list_DND_mandatory";
	public final String TRACK_SOURCE = "A_track_Sel";
	public final String EMAIL_PROFILE_FIELD = "Email_q11";
	public final String AGE_PROFILE_FIELD = "Age_q11";
	public final String AGE_DYNAMIC_VARIABLE = "Age_Q990";
	public final String NAME_PROFILE_FIELD = "First Name_q11";
	
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
