

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeSuite;

import baseClasses.Init;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
	public class Hooks extends Init{
	
		@Before("@initBrowser")
		public static void beforeSuite() throws InterruptedException, MalformedURLException {
			Init.init();
		}
	@After("@closeBrowser")
	public void afterClass(Scenario scenario){
		driver.close();
		try{    
		    Process p = Runtime.getRuntime().exec("taskkill /im chromedriver2.37.exe /f");
		    p.waitFor();
		    System.out.println(p.getInputStream());
		    p = Runtime.getRuntime().exec("taskkill /im chrome.exe /f");
		    p.waitFor();
		    System.out.println(p.getInputStream());

		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
	}
}