
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import baseClasses.Init;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
@RunWith(ExtendedCucumber.class)
//@RunWith(JoelCucumber.class)
//@RunWith(Cucumber.class)
@ExtendedCucumberOptions
	   (jsonReport = "target/81/cucumber.json",
        jsonUsageReport = "target/81/cucumber-usage.json",
        usageReport = true,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        overviewChartsReport = true,
        pdfPageSize = "A4 Landscape",
        toPDF = true,
        outputFolder = "target/81",
        retryCount = 0)
@CucumberOptions(
        features = { "src/test/features" },
		glue = {"classpath:"},
        //@NX-ProductTestSuite,@tagOfferCatalog,@madhan_test_suite_on_OfferCreation,@tagOfferCatalog,@NX-bcCreationSuite
		tags = { "@NX-8862" },
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html",
        "html:target/81", "json:target/81/cucumber.json",
        "pretty:target/81/cucumber-pretty.txt",
        "usage:target/81/cucumber-usage.json", "junit:target/81/cucumber-results.xml",
        
        })

public class RunTest extends Init 
{
	private static boolean runCheckTimeWait = true;
	private static class MyTimeTask extends TimerTask
	{
	    public void run()
	    {
	    	runCheckTimeWait = false;
	    }
	}
	@BeforeClass
	public static void beforeClass() throws ParseException, IOException, InterruptedException {
		initPropFile();
		System.out.println("Starting test"); 
		
		
		//for starting test at specific time using startExecutionTime property as 2012-07-06 13:05:45[yyyy-MM-dd HH:mm:ss]
		String startTimeStr = p.getValue("startExecutionTime");
		System.out.println("Start time::::"+startTimeStr);
		 DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    Date date = dateFormatter .parse(startTimeStr);
		    Timer timer = new Timer();
		    timer.schedule(new MyTimeTask(), date);
		    while(runCheckTimeWait) {
		    	Thread.sleep(3000);
		    }
		try{
			String path = new File( "." ).getCanonicalPath();
			System.setProperty("log", path+"\\Logs");
		}catch(Exception e) {
			
		}
	}
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
	}
//	public static void afterClass() {
//		 Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//	        Reporter.setSystemInfo("os", "Mac OSX");
//	        Reporter.setTestRunnerOutput("Sample test runner output message");
//	}
	
	public RunTest()
	{
		

//		CucumberResultsOverview results = new CucumberResultsOverview();
//		results.setOutputDirectory("target");
//		results.setOutputName("cucumber-results");
//		results.setSourceFile("./src/test/resources/cucumber.json");
//		results.executeFeaturesOverviewReport();
	}

//	public static void main(String[] args) throws Throwable {
//	    String[] arguments = {"foo", "bar"};
//	    cucumber.api.cli.Main.main(arguments);
//	}
}