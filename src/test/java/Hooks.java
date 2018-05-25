

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.List;

import org.testng.annotations.BeforeSuite;

import baseClasses.Init;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Feature;
//import reportDB.ExtractTags;
	public class Hooks extends Init{
	
		@Before("@initBrowser")
		public static void beforeSuite() throws InterruptedException, MalformedURLException {
			Init.init();
		}
	@After("@closeBrowser")
	public void afterClass(Scenario scenario){
		driver.quit();
		try{    
		    Process p = Runtime.getRuntime().exec("taskkill /im chromedriver2.37.exe /f");
		    p.waitFor();
		    System.out.println(p.getInputStream());
//		    p = Runtime.getRuntime().exec("taskkill /im chrome.exe /f");
//		    p.waitFor();
//		    System.out.println(p.getInputStream());

		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
		
	}
//	@After
//	public void afterEveryClass(Scenario scenario) throws IOException, SQLException {
//		String str = "\ntags"+scenario.getSourceTagNames()+"status:"+scenario.getStatus();
//		System.out.println(str);
//		int status = 0;
//		if(scenario.getStatus().contains("pass"))
//			status =1;
//		ExtractTags et = new ExtractTags();
//		et.addRowToDb(scenario.getSourceTagNames().toString(), scenario.getName(),status);
//		System.out.println(scenario.getName());
//		BufferedWriter outStream= new BufferedWriter(new FileWriter(".//src//test//resources/runCases.txt", true));
//        // read character wise from string and write
//        // into FileWriter
//        for (int i = 0; i < str.length(); i++)
//        	outStream.write(str.charAt(i));
// 
//        //close the file
//        outStream.close();
//		
//		
//	}
}