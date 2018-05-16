package baseClasses;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

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
	public static void init() throws InterruptedException{
	System.out.println("Initializing Browser.....");
	System.setProperty("webdriver.chrome.driver", "browser_files\\chromedriver2.37.exe");
	driver =  new ChromeDriver();
	driver.manage().window().maximize();
	p.setPropertyFile("config.properties");
	}
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
