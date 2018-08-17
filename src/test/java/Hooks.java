

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.runners.JUnit4;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeSuite;

import baseClasses.Init;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import reportDB.ExtractTags;
	public class Hooks extends Init{
	
		@Before("@initBrowser")
		public static void beforeSuite() throws InterruptedException, MalformedURLException {
			Init.init();
		}
		//After to take screenshot
		@After
		public void getscreenshot(Scenario scenario) throws Exception 
	    {
			if(scenario.getStatus().contentEquals("failed")) {
			String path = new File( "." ).getCanonicalPath();
			String tagStr = scenario.getSourceTagNames().toString();
			tagStr = tagStr.replaceAll("\\[", " ");
			tagStr = tagStr.replaceAll("\\]", " ");
			tagStr = tagStr.trim();
			String[] tags = tagStr.split(",");
			String NXtag = "";
			int i = 0 ;
			while(i<tags.length) {
				tags[i] = tags[i].trim();
				if(tags[i].matches("@NX-[0-9]+"))
				{
					NXtag = tags[i];
				    break;
				}
				i++;
			}
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			System.out.println(scenario.getStatus());
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            System.out.println(FileUtils.sizeOfDirectory(new File(path+"\\Screenshots")));
	            FileUtils.copyFile(scrFile, new File(path+"\\Screenshots\\"+NXtag+"_"+timeStamp+".png"));
			}
	    }
	@After("@closeBrowser")
	public void afterClass(Scenario scenario){
		driver.quit();
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