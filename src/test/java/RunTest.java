
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
        //@NX-ProductTestSuite,@tagOfferCatalog,@tagOfferCatalog,@NX-bcCreationSuite
//		tags = { "@NX-5177,@NX-5161,@NX-5176,@NX-5169,@NX-5284,@NX-8822,@NX-8840,@NX-6998,@NX-8737,@NX-8738,@NX-6350,@NX-8842,@NX-3483,@NX-6340,@NX-6244,@NX-6288,@NX-8740,@NX-8739,@NX-5170,@NX-7830,@NX-7831,@NX-7832,@NX-7833,@NX-9088,@NX-3556,@NX-8938,@NX-3568,@NX-6354,@NX-4868,@NX-2401,@NX-8862,@NX-6365,@NX-4866,@NX-6387,@NX-7462,@NX-4871,@NX-6384,@NX-7467,@NX-7059,@NX-7450,@NX-6364,@NX-2548,@NX-3482,@NX-6386,@NX-694,@NX-7464,@NX-6381,@NX-6382,@NX-6904,@NX-2419,@NX-8789,@NX-6293,@NX-5173,@NX-7591,@NX-7589,@NX-7460,@NX-6462,@NX-6368,@NX-7590,@NX-3412,@NX-3416,@NX-3679,@NX-6335,@NX-8848,@NX-6357,@NX-6291,@NX-6290,@NX-6385,@NX-6378,@NX-6363,@NX-6356,@NX-6389,@NX-6467,@NX-6480,@NX-8023,@NX-8151,@NX-3399,@NX-6529,@NX-1417,@NX-7036,@NX-2050,@NX-805,@NX-1145,@NX-1113,@NX-1190,@NX-975,@NX-6995,@NX-7040,@NX-7020,@NX-6999,@NX-7042,@NX-7044,@NX-7046,@NX-7048,@NX-1180,@NX-790,@NX-7107,@NX-1185,@NX-7109,@NX-6973,@NX-6974,@NX-1015,@NX-1168,@NX-7111,@NX-611,@NX-1125,@NX-7049,@NX-7051,@NX-7053,@NX-6966,@NX-7012,@NX-6969,@NX-7449,@NX-9213,@NX-7587,@NX-2425,@NX-7586,@NX-1273,@NX-7596,@NX-8714,@NX-652,@NX-1275,@NX-8019,@NX-8257,@NX-8198,@NX-8779,@NX-8715,@NX-8716,@NX-8717,@NX-8193,@NX-8184,@NX-5324,@NX-5323,@NX-5156,@NX-2540,@NX-4804,@NX-4803,@NX-4802,@NX-4784,@NX-4780,@NX-2525,@NX-8718,@NX-8713,@NX-8712,@NX-2529,@NX-7598,@NX-7597,@NX-649,@NX-6849,@NX-2406,@NX-7350,@NX-8016,@NX-7957,@NX-6850,@NX-6848,@NX-6863,@NX-6320,@NX-6319,@NX-6333,@NX-6322,@NX-6324,@NX-6321,@NX-6353,@NX-2411,@NX-1506,@NX-1510,@NX-1508,@NX-1560,@NX-1505,@NX-1500,@NX-1496,@NX-1492,@NX-1491,@NX-1205,@NX-1198,@NX-1194,@NX-686,@NX-674,@NX-691,@NX-1212,@NX-9211,@NX-1211,@NX-1210,@NX-698" },
				
		//@NX-BroadcastManagement,@NX-Campaign,@NX-CampaignPause,    @NX-ProductClass,@NX-MultipleEnvironmentExport,@NX-WorkApprovalFlow
//		/@NX-OfferCatalog,@NX-Campaign,@NX-CampaignPause,@NX-BroadcastManagement
		tags = {"@NX-427,@NX-446"},
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
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		fileForCsvReport = new File("Run_"+timeStamp+".csv");
		printWriterForCsvReport= new PrintWriter(fileForCsvReport);
		stringBuilderForCsvReport= new StringBuilder();
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
		printWriterForCsvReport.close();
//		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
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