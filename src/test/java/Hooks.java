

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.runners.JUnit4;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.seleniumhq.jetty9.util.Fields.Field;
import org.testng.annotations.BeforeSuite;

import baseClasses.GoogleSpreadsheetImpl;
import baseClasses.Init;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.ScenarioImpl;
import gherkin.formatter.model.Feature;
import gherkin.formatter.model.Result;
//import reportDB.ExtractTags;
	public class Hooks extends Init{
	
		@Before("@initBrowser")
		public static void beforeSuite() throws InterruptedException, MalformedURLException, FileNotFoundException {
			Init.init();
		}
		//After to take screenshot
		@After
		public void getscreenshot(Scenario scenario) throws Exception 
	    {
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			
			String path = new File( "." ).getCanonicalPath();
			String tagStr = scenario.getSourceTagNames().toString();
			tagStr = tagStr.replaceAll("\\[", " ");
			tagStr = tagStr.replaceAll("\\]", " ");
			tagStr = tagStr.trim();
			String[] tags = tagStr.split(",");
			List<String> NXtag = new ArrayList<String>();
			int i = 0 ;
			while(i<tags.length) {
				tags[i] = tags[i].trim();
				if(tags[i].matches("@NX-[0-9]+") || tags[i].matches("@NDX-[0-9]+"))
				{
					NXtag.add(tags[i]);
//				    break;
				}
				i++;
			}
			i = 0 ;
			String feature = "";
			while(i<tags.length) {
				tags[i] = tags[i].trim();
				if(tags[i].matches("@Feature-"))
				{
					feature = tags[i];
				    break;
				}
				i++;
			}
			
			String error = logError(scenario).toString();
//			.replace("\n", "<LINEBREAK>");
//			error = error.replace(",", "<COMMA>");
//			error = error.replace("\t", "<TAB>");
//			error = error.replace(" ", "<SPACE>");
//			error = error.replace(System.getProperty("line.separator"), "<LINEBREAK>");
			
			boolean googleSpreadsheetReport = false;
			try {
				if(p.getValue("googleSpreadsheetReport").contentEquals("true"))
					googleSpreadsheetReport = true;
			}catch(Exception e) {
				System.out.println("error in fetching googleSpreadsheetReport from config. False by default");
			}
			if(googleSpreadsheetReport) {
						GoogleSpreadsheetImpl sqs = new GoogleSpreadsheetImpl();
				sqs.initializeService();
				sqs.setSpreadsheet(p.getValue("googleSpreadsheetReportWorkbookId"),System.getProperty("user.name"));
				for(int k=0;k<NXtag.size();k++) {
				    	int lastRow = Integer.parseInt(sqs.getCell(0, 7))-1;
				    	sqs.setCell(lastRow, 0,NXtag.get(k) );
				    	sqs.setCell(lastRow, 1,scenario.getStatus());
				    	sqs.setCell(lastRow, 2,scenario.getName() );
				    	sqs.setCell(lastRow, 3,feature);
				    	sqs.setCell(lastRow, 4,System.getProperty("user.name") );
				    	sqs.setCell(lastRow, 5,timeStamp );
				    	try{
				    		int lineChar = error.indexOf("\n");
				    		sqs.setCell(lastRow, 6,error.substring(0, lineChar));
				    	}
				    	catch(Exception e) {
				    		sqs.setCell(lastRow, 6,"no ERROR");
				    	}
		    	}
				
		    	
			}
			
			for(int k=0;k<NXtag.size();k++) {
					stringBuilderForCsvReport.setLength(0);
					stringBuilderForCsvReport.append('\n');
					stringBuilderForCsvReport.append(NXtag.get(k));
					stringBuilderForCsvReport.append(',');
					stringBuilderForCsvReport.append(scenario.getStatus());
					stringBuilderForCsvReport.append(',');
					stringBuilderForCsvReport.append(feature);
					stringBuilderForCsvReport.append(',');
					stringBuilderForCsvReport.append(scenario.getName());
					stringBuilderForCsvReport.append(',');
					stringBuilderForCsvReport.append(System.getProperty("user.name"));
					stringBuilderForCsvReport.append(',');
					stringBuilderForCsvReport.append(timeStamp);
					stringBuilderForCsvReport.append(',');
					stringBuilderForCsvReport.append(error);
			  		printWriterForCsvReport.write(stringBuilderForCsvReport.toString());
			  		printWriterForCsvReport.flush();
			}
	  		
	  		
			if(scenario.getStatus().contentEquals("failed")) {
			
			
			System.out.println(scenario.getStatus());
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            System.out.println(FileUtils.sizeOfDirectory(new File(path+"/Screenshots")));
	            FileUtils.copyFile(scrFile, new File(path+"/Screenshots/"+NXtag+"_"+timeStamp+".png"));
			}
			
	    }
		private static String logError(Scenario scenario) {
			   java.lang.reflect.Field field = FieldUtils.getField(((ScenarioImpl) scenario).getClass(), "stepResults", true);
			   field.setAccessible(true);
			   try {
			       ArrayList<Result> results = (ArrayList<Result>) field.get(scenario);
			       for (Result result : results) {
			           if (result.getError() != null)
			               return result.getError()+result.getErrorMessage().toString();
			       }
			   } catch (Exception e) {
				   return "Error while logging error"+ e.toString();
			   }
			return "NULL";
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
		    System.out.println(p.getInputStream());
		    System.out.println("Then avalilable"+"after chrome close"+"After");

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