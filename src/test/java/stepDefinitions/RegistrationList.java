package stepDefinitions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.LandingPageObjects;
import pageObjetcs.RegistrationListPage;

public class RegistrationList extends Init{
	public int profileListUploaded = 0;
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	ExcelHelper eh = new ExcelHelper();
	RegistrationListPage registrationListPage = new RegistrationListPage();
	LandingPageObjects landingPageObjects = new LandingPageObjects();
	ExcelHelper list = new ExcelHelper();
	JSWaiter jswait = new JSWaiter();
	String msisdn = "";
	BufferedWriter bw = null;
	FileWriter fw = null;
	String[] profileFields = {"First Name","Last Name","Country","Email","Languages","Balance","Boolean","Age"};
	String[] country = {"India","USA","Pakisthan","Korea"};
	String[] languages = {"Malayalam","English","Korean","Hindi"};
	String[] Secondlanguages = {"Tamil","Spanish","Mandarin","Urdu"};
	String[] bool = {"Yes","No"};
	String[] device_id = {"4444","5555"};
	String[] location_insight = {"5","4","7","8"};
	String[] digital_persona = {"15","17","18","14"};
	String[]  demographics= {"25","24","27","28"};
	String[] learned_behaviour = {"35","37","34","38"};
	String[] analytical = {"47","48","45","44"};
	String[] digital_engagement = {"238","237","235","234"};
	
	public static int getAgeTargetCount() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int age[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[9]);
			 val = a[9];
			 age[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int ageGT18 = 0;
		 for(int j=0;j<age.length;j++) {
			 if(age[j]>18){
				 System.out.println(age[j]);
				 ageGT18++;
			 }
		 }
		 System.out.println(ageGT18);
		 System.out.println("age>18");
		 list.setCell(1, "age>18",String.valueOf(ageGT18) );
		 return ageGT18;
    	
    }
	public static int getdevice_idnot6666Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[10]);
			 val = a[10];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]==4444 || device_id[j]==5555){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("device_idnot6666");
		 list.setCell(1, "device_idnot6666",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	
	public static int getdigitalPersonaGT15Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[12]);
			 val = a[12];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]>15){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("digitalPersonaGT15");
		 list.setCell(1, "digitalPersonaGT15",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	
	public static int getcustomerDemographicsGT25Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[13]);
			 val = a[13];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]>25){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("customerDemographicsGT25");
		 list.setCell(1, "customerDemographicsGT25",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	public static int getlearnedBehaviourGT35Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[14]);
			 val = a[14];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]>35){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("learnedBehaviourGT35");
		 list.setCell(1, "learnedBehaviourGT35",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	public static int getanalyticalScoresGT45Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[15]);
			 val = a[15];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]>45){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("analyticalScoresGT45");
		 list.setCell(1, "analyticalScoresGT45",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	public static int getdigitalEngagementGT235Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[16]);
			 val = a[16];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]>235){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("digitalEngagementGT235");
		 list.setCell(1, "digitalEngagementGT235",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	
	public static int getcustomerLocationInsightsGT5Count() throws IOException {
    	ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int device_id[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 while ((temp = br.readLine()) != null) {
			 String[] a = temp.split(",");
			 System.out.println(a[11]);
			 val = a[11];
			 device_id[initial] = Integer.parseInt(val);
//			 age[0]=Integer.parseInt(a[9].toString());
			 initial++;
         }
		 br.close();
		 int device_idnot6666 = 0;
		 System.out.println("array length:"+device_id.length);
		 for(int j=0;j<device_id.length;j++)
			 if(device_id[j]>5){
				 System.out.println(device_id[j]);
				 device_idnot6666++;
			 }
		 System.out.println(device_idnot6666);
		 System.out.println("customerLocationInsightsGT5");
		 list.setCell(1, "customerLocationInsightsGT5",String.valueOf(device_idnot6666) );
		 return device_idnot6666;
    	
    }
	
	@Given("^random registration list is generated$")
    public void generateRandomRegistrationList() throws IOException{
		System.out.println("in rand");
		 Random r = new Random();
    	 msisdn = "9199"+ String.valueOf(r.nextInt(9000)+1000);
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = "list_"+msisdn+".csv";
		list.setCell(1, 0, filename);
		list.setCell(1, 2, "list_"+msisdn);
		//FileOutputStream fileOut = new FileOutputStream("ExcelFiles\\new.csv");
		File csvfile = new File("ExcelFiles\\"+filename);
		list.setCell(1, 1,csvfile.getCanonicalPath());
		PrintWriter pw = new PrintWriter(csvfile);
        StringBuilder sb = new StringBuilder();
        sb.append("msisdn");
        sb.append(',');
        sb.append("first name");
        sb.append(',');
        sb.append("last name");
        sb.append(',');
        sb.append("country");
        sb.append(',');
        sb.append("email");
        sb.append(',');
        sb.append("language 1");
        sb.append(',');
        sb.append("language 2");
        sb.append(',');
        sb.append("balance");
        sb.append(',');
        sb.append("boolean");
        sb.append(',');
        sb.append("age");
        sb.append(',');
        sb.append("device id");
        sb.append(',');
        sb.append("location insight");
        sb.append(',');
        sb.append("digital persona");
        sb.append(',');
        sb.append("demographic");
        sb.append(',');
        sb.append("larned behaviour");
        sb.append(',');
        sb.append("analytical scores");
        sb.append(',');
        sb.append("digital engagement");
        pw.write(sb.toString());
        pw.flush();
        sb.setLength(0);
        
    	
    	 String alphabet = "abcdefghijklmnopqrstuvwxyz";
 	    final int N = 6;
    	for(int i=1; i<=197; i++){
    	///////random name generation
    	    StringBuilder sb1 = new StringBuilder();
    	    for (int j = 0; j < N; j++) {
    	        sb1.append(alphabet.charAt(r.nextInt(alphabet.length())));
    	    }
    	    String randomFirstName = sb1.toString();
    	    StringBuilder sb2 = new StringBuilder();
    	    for (int j = 0; j < N; j++) {
    	        sb2.append(alphabet.charAt(r.nextInt(alphabet.length())));
    	    }
    	    String randomLastName = sb2.toString();
    	///////random name generation
    	    int countrySelect = r.nextInt(4);
    	    int languageSelect = r.nextInt(4);
    	    int secondlanguageSelect = r.nextInt(4);
    	    int boolSelect = r.nextInt(2);
    	    int balance = r.nextInt(400);
    	    
            sb.append('\n');
    	    sb.append(msisdn+String.format("%04d",i));
            sb.append(',');
            sb.append(randomFirstName);
            sb.append(',');
            sb.append(randomLastName);
            sb.append(',');
            sb.append(country[countrySelect]);
            sb.append(',');
            sb.append(randomFirstName+"@gmail.com");
            sb.append(',');
            sb.append(languages[languageSelect]);
            sb.append(',');
            sb.append(Secondlanguages[secondlanguageSelect]);
            sb.append(',');
            sb.append(String.valueOf(balance));
            sb.append(',');
            sb.append(bool[boolSelect]);
            sb.append(',');
            sb.append(String.valueOf(r.nextInt(60)+15));
            sb.append(',');
            sb.append(device_id[boolSelect]);
            sb.append(',');
            sb.append(location_insight[languageSelect]);
            sb.append(',');
            sb.append(digital_persona[countrySelect]);
            sb.append(',');
            sb.append(demographics[languageSelect]);
            sb.append(',');
            sb.append(learned_behaviour[countrySelect]);
            sb.append(',');
            sb.append(analytical[languageSelect]);
            sb.append(',');
            sb.append(digital_engagement[secondlanguageSelect]);
            pw.write(sb.toString());
            pw.flush();
            sb.setLength(0);
    	}
    	sb.append('\n');
	    sb.append("919446506807");
        sb.append(',');
        sb.append("joel");
        sb.append(',');
        sb.append("jose");
        sb.append(',');
        sb.append("India");
        sb.append(',');
        sb.append("joel.jose@flytxt.com");
        sb.append(',');
        sb.append("Malayalam");
        sb.append(',');
        sb.append("English");
        sb.append(',');
        sb.append("200");
        sb.append(',');
        sb.append("Yes");
        sb.append(',');
        sb.append("25");
        sb.append(',');
        sb.append("6666");
        sb.append(',');
        sb.append("5");
        sb.append(',');
        sb.append("15");
        sb.append(',');
        sb.append("25");
        sb.append(',');
        sb.append("35");
        sb.append(',');
        sb.append("45");
        sb.append(',');
        sb.append("235");
        sb.append(',');
        sb.append("1010");
        pw.write(sb.toString());
        sb.setLength(0);
        
        sb.append('\n');
	    sb.append("919446506808");
        sb.append(',');
        sb.append("joel1");
        sb.append(',');
        sb.append("jose1");
        sb.append(',');
        sb.append("India");
        sb.append(',');
        sb.append("joel.kallely95@gmail.com");
        sb.append(',');
        sb.append("Malayalam");
        sb.append(',');
        sb.append("English");
        sb.append(',');
        sb.append("201");
        sb.append(',');
        sb.append("No");
        sb.append(',');
        sb.append("26");
        sb.append(',');
        sb.append("6666");
        sb.append(',');
        sb.append("5");
        sb.append(',');
        sb.append("15");
        sb.append(',');
        sb.append("25");
        sb.append(',');
        sb.append("35");
        sb.append(',');
        sb.append("45");
        sb.append(',');
        sb.append("235");
        sb.append(',');
        sb.append("1010");
        pw.write(sb.toString());
        sb.setLength(0);
        
        sb.append('\n');
	    sb.append("919446506809");
        sb.append(',');
        sb.append("selenium");
        sb.append(',');
        sb.append("flytxt");
        sb.append(',');
        sb.append("India");
        sb.append(',');
        sb.append("selenium.flytxt@gmail.com");
        sb.append(',');
        sb.append("Malayalam");
        sb.append(',');
        sb.append("English");
        sb.append(',');
        sb.append("150");
        sb.append(',');
        sb.append("No");
        sb.append(',');
        sb.append("28");
        sb.append(',');
        sb.append("6666");
        sb.append(',');
        sb.append("5");
        sb.append(',');
        sb.append("15");
        sb.append(',');
        sb.append("25");
        sb.append(',');
        sb.append("35");
        sb.append(',');
        sb.append("45");
        sb.append(',');
        sb.append("235");
        sb.append(',');
        sb.append("1010");
        pw.write(sb.toString());
        sb.setLength(0);
        pw.flush();
        pw.close();
        System.out.println("reg list creation done!");
        getTargetCounts();
        System.out.println("age target conditoin count updated");
		
    }
	private void getTargetCounts() throws IOException {
		getcustomerLocationInsightsGT5Count();
		getAgeTargetCount();
		getanalyticalScoresGT45Count();
		getcustomerDemographicsGT25Count();
		getdevice_idnot6666Count();
		getlearnedBehaviourGT35Count();
		getdigitalPersonaGT15Count();
		getdigitalEngagementGT235Count();
		
	}
	@Given("^random dnd list is generated$")
    public void generateRandomDndList() throws IOException{
		File DNDcsvfile = new File("ExcelFiles\\"+"selenium_list_DND.csv");
		PrintWriter pw = new PrintWriter(DNDcsvfile);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
//		CSVFile csvFile = new CSVFile("ExcelFiles\\"+filename);
		
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 0;
		 

		 int age[] = new int[550];
		 String val = "";
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 temp = br.readLine();
		 pw.write("msisdn,first name,last name,country,email,language 1,language 2,balance,boolean,age,device id,Location_q11,Demographics_q11,Digital Persona_q11,Learned Behaviour_q11,Analytical Scores_q11,Digital Engagement_q11");
		 pw.write("\n");
		 while ((temp = br.readLine()) != null && initial<50) {
			 pw.write(temp);
			 pw.write("\n");
			 initial++;
         }
		 pw.close();
	}
	
	public void add_profile_field() throws InterruptedException
	{		
	
		LandingPageObjects landingPage = new LandingPageObjects();
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Languages_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Multi Select']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[1]//input",languages[0]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[2]//input",languages[1]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[3]//input",languages[2]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[4]//input",languages[3]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[5]//input",Secondlanguages[0]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[6]//input",Secondlanguages[1]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[7]//input",Secondlanguages[2]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[8]//input",Secondlanguages[3]);
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input",PREFERRED_LANGUAGE_PROFILE_FIELD);
	
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Single Select']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[1]//input",LANGUAGE1);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[2]//input",LANGUAGE2);
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","First Name_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Text']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Date");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Date']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Last Name_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Text']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Email_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Text']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input",GROUP_ID_PROFILE_FIELD);
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Number']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Balance_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Number']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Boolean_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Yes or No']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Age_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Number']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");	
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Target Group_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Number']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");	
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Country_q11");
	
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Single Select']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[1]//input",country[0]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[2]//input",country[1]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[3]//input",country[2]);
	jswait.loadClick("//h4[text()='Options']/../..//paper-icon-button[@icon='icons:add']");
	jswait.loadSendKeys("//h4[text()='Options']/../div[4]//input",country[3]);
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	///next field country in location insights////
	

	landingPage.navigateToLandingPage();
	landingPage.navigateToDataFoundation();
	registrationListPage.navigateToCustomerLocationInsights();
	
	/////
	
	jswait.loadClick("//paper-button[contains(.,'Create')]");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Location_q11");
	jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
	jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
	jswait.loadClick("//paper-item[contains(.,'Normal')]");
	jswait.loadClick("//create-profile//label[text()='Type']/../input");
	jswait.loadClick("//create-profile//paper-item[text()='Number']");
	jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
	
	///next field country in customer device info////
	
		landingPage.navigateToLandingPage();
		landingPage.navigateToDataFoundation();
		registrationListPage.navigateToCustomerDeviceInfo();
		
		/////
		jswait.loadClick("//paper-button[contains(.,'Create')]");
		jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Device ID_q11");
		jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
		jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
		jswait.loadClick("//paper-item[contains(.,'Normal')]");
		jswait.loadClick("//create-profile//label[text()='Type']/../input");
		jswait.loadClick("//create-profile//paper-item[text()='Number']");
		jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
		
		///next field country in Customer Demographics Category////
			landingPage.navigateToLandingPage();
			landingPage.navigateToDataFoundation();
			registrationListPage.navigateToCustomerDemographicsCategory();
			
			/////
			jswait.loadClick("//paper-button[contains(.,'Create')]");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Demographics_q11");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
			jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
			jswait.loadClick("//paper-item[contains(.,'Normal')]");
			jswait.loadClick("//create-profile//label[text()='Type']/../input");
			jswait.loadClick("//create-profile//paper-item[text()='Number']");
			jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
			
			///next field country in Customer Digital Persona category////
			landingPage.navigateToLandingPage();
			landingPage.navigateToDataFoundation();
			registrationListPage.navigateToCustomerDigitalPersona();
			
			/////
			jswait.loadClick("//paper-button[contains(.,'Create')]");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Digital Persona_q11");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
			jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
			jswait.loadClick("//paper-item[contains(.,'Normal')]");
			jswait.loadClick("//create-profile//label[text()='Type']/../input");
			jswait.loadClick("//create-profile//paper-item[text()='Number']");
			jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
			
			
			///next field country in  Learned Behaviors category////
			landingPage.navigateToLandingPage();
			landingPage.navigateToDataFoundation();
			registrationListPage.navigateToLearnedBehaviour();
			
			/////
			jswait.loadClick("//paper-button[contains(.,'Create')]");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Learned Behaviour_q11");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
			jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
			jswait.loadClick("//paper-item[contains(.,'Normal')]");
			jswait.loadClick("//create-profile//label[text()='Type']/../input");
			jswait.loadClick("//create-profile//paper-item[text()='Number']");
			jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
			
			
			///next field country in AI powered Analytical Scores category////
			landingPage.navigateToLandingPage();
			landingPage.navigateToDataFoundation();
			registrationListPage.navigateToAIPoweredAnalyticalScores();
			
			/////
			jswait.loadClick("//paper-button[contains(.,'Create')]");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Analytical Scores_q11");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
			jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
			jswait.loadClick("//paper-item[contains(.,'Normal')]");
			jswait.loadClick("//create-profile//label[text()='Type']/../input");
			jswait.loadClick("//create-profile//paper-item[text()='Number']");
			jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
			
			
			///next field country in digital engagement Preferences category////
			landingPage.navigateToLandingPage();
			landingPage.navigateToDataFoundation();
			registrationListPage.navigateToDigitalEngagementPreferencesCategory();
			
			/////
			jswait.loadClick("//paper-button[contains(.,'Create')]");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Name')]/../input","Digital Engagement_q11");
			jswait.loadSendKeys("//create-profile//label[contains(.,'Description')]/..//textarea","q11");
			jswait.loadClick("//create-profile//label[contains(.,'Context Type')]/../input");
			jswait.loadClick("//paper-item[contains(.,'Normal')]");
			jswait.loadClick("//create-profile//label[text()='Type']/../input");
			jswait.loadClick("//create-profile//paper-item[text()='Number']");
			jswait.loadClick(".//*[@id='createNew']//paper-button[contains(.,'Save')]");
		
	}
	public void delete_profile_field() throws InterruptedException
	{
		jswait.loadClick("//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..");
		jswait.loadClick("//paper-item[contains(.,'Delete')]");
		jswait.loadClick("//paper-button[contains(.,'Yes')]");
	
	}
	
	@Then("^check and add profile fields$")
    public void addProfileFields() throws IOException, InterruptedException{
		jswait.loadClick("//a/div//div[contains(.,'Customer Profile Info')]/../..");
		jswait.loadClick("//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..");
		jswait.loadSendKeys("//form/paper-input[1]/paper-input-container/div[2]/div/input","_q11");
		jswait.loadClick("//paper-button[contains(text(),'Apply')]");
		Thread.sleep(3000);
		try{
			 CommonObjects commonObjects = new CommonObjects(); 
			 commonObjects.clickOptionsIcon();
			 System.out.println("fields already present");
		}catch(Exception e){
			System.out.println("profile fields not present");
			add_profile_field();
			profileListUploaded = 1;
		}
		
	}
	@Then("^click create new registration list button$")
    public void clickCreateNewRegistrationListButton() throws Exception{
		registrationListPage.clickCreateNewRegistrationListButton();
	}
	@Then("^save registration list$")
    public void saveRegistrationListButton() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_LIST);
		commonObjects.clickOptionsIcon();
	}
	@Then("^save DND list$")
    public void saveDNDListButton() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_DND_LIST);
		commonObjects.clickOptionsIcon();
	}
	@Then("^save discovered clusters list$")
    public void saveDiscoveredClustersListButton() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_DISCOVERED_CLUSTERS_LIST);
		commonObjects.clickOptionsIcon();
	}
	@Then("^save customer driven event$")
    public void saveCustomerDrivenEvent() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
//		commonObjects.filterName(SELENIUM_CUSTOMER_DRIVEN_EVENT);
//		commonObjects.clickOptionsIcon();
		commonObjects.verifyInGrid(SELENIUM_CUSTOMER_DRIVEN_EVENT);
	}
	@Then("^save usage metric$")
    public void saveUsageMetric() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_USAGE_METRIC);
		commonObjects.clickOptionsIcon();
	}
	@Then("^save revenue metric$")
    public void saveRevenueMetric() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_REVENUE_METRIC);
		commonObjects.clickOptionsIcon();
	}
	@Then("^save event counts$")
    public void saveEventCounts() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_EVENT_COUNTS);
		commonObjects.clickOptionsIcon();
	}
	@Then("^save mandatory DND list$")
    public void saveMandatoryDNDListButton() throws Exception{
		registrationListPage.clickSaveButton();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(SELENIUM_MANDATORY_DND_LIST);
		commonObjects.clickOptionsIcon();
	}
	@Then("^enter details of registration list$")
    public void createRegistrationList() throws Exception{
//		list.setExcelFile("registrationListInputData", "Sheet1");
//		String listname = (String) list.getCell(1, 2);
		String listname = SELENIUM_LIST;
		System.out.println(listname);
		registrationListPage.enterRegistratonListDetails(listname, "Description");	
	}
	@Then("^enter details of DND list$")
    public void createDNDList() throws Exception{
//		list.setExcelFile("registrationListInputData", "Sheet1");
//		String listname = (String) list.getCell(1, 2);
		String listname = SELENIUM_DND_LIST;
		System.out.println(listname);
		registrationListPage.enterDNDRegistratonListDetails(listname, "Description");	
	}
	
	@Then("^enter details of discovered clusters list$")
    public void createDiscoveredClustersList() throws Exception{
//		list.setExcelFile("registrationListInputData", "Sheet1");
//		String listname = (String) list.getCell(1, 2);
		String listname = SELENIUM_DISCOVERED_CLUSTERS_LIST;
		System.out.println(listname);
		registrationListPage.enterRegistratonListDetails(listname, "Description");	
	}
	@Then("^enter details of customer driven event$")
    public void createCustomerDrivenEvent() throws Exception{
		String field = SELENIUM_CUSTOMER_DRIVEN_EVENT;
		registrationListPage.enterCustomerDrivenEventDetails(field, "Description");	
	}
	@Then("^enter details of usage metric$")
    public void createUsageMetric() throws Exception{
		String field = SELENIUM_USAGE_METRIC;
		registrationListPage.enterUsageMetricDetails(field, "Description");	
		
	}
	@Then("^enter details of revenue metric$")
    public void createRevenueMetric() throws Exception{
		String field = SELENIUM_REVENUE_METRIC;
		registrationListPage.enterRevenueMetricDetails(field, "Description");	
	}
	@Then("^enter details of event counts$")
    public void createEventCounts() throws Exception{
		String field = SELENIUM_EVENT_COUNTS;
		registrationListPage.enterEventCountDetails(field, "Description");	
	}
	
	
	@Then("^enter details of mandatoy DND list$")
    public void createMandatoryDNDList() throws Exception{
//		list.setExcelFile("registrationListInputData", "Sheet1");
//		String listname = (String) list.getCell(1, 2);
		String listname = SELENIUM_MANDATORY_DND_LIST;
		System.out.println(listname);
		registrationListPage.enterMandatoryDNDRegistratonListDetails(listname, "Description");	
	}
	@Then("^upload list$")
    public void uploadList() throws Exception{
		driver.close();
		WebDriverWait wait = new WebDriverWait(driver, 8);
		System.out.println("in upload");
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename =(String) list.getCell(1, 0);
		
		init();
//		String[] temp = filename.split(".");
		String listname = (String) list.getCell(1, 2);
		System.out.println(listname);
		driver.get("http://192.168.150.27:8098");
		jswait.loadSendKeys(".//*[@name='email']","flyops@flytxt.com");
		jswait.loadSendKeys(".//*[@name='password']","flytxt");
		jswait.loadClick("//input[@value='Log In']");
		if(profileListUploaded==1){
		  Thread.sleep(3000);
		  jswait.loadClick("//span[text()='Support Tools']");
		  Thread.sleep(4000);
		  jswait.loadClick("//span[text()='Cache Manager']");
		  Thread.sleep(3000);
		  jswait.loadClick("//*[@id='bpOffRadio']");
		  Thread.sleep(5000);
		  jswait.loadClick("//button[text()='Flush']");
		  Thread.sleep(10000);
//		  Actions action1= new Actions(driver);
//		  action1.moveToElement(driver.findElement(By.xpath("//button[text()='OK']"))).click().build().perform();
		  jswait.loadClick(".//*[@id='ext-gen21']");
		  Thread.sleep(10000);
		}
		jswait.loadClick("//span[text()='Mobile Marketing DB']");
		Thread.sleep(3000);
		jswait.loadClick("//button[text()='New Data Job']");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'Imports')]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
		jswait.loadClick("//span[contains(.,'One-time Data Import Job')]");
		Thread.sleep(3000);
		jswait.loadSendKeys(".//*[@id='headerInfoTextField']",listname+"_JOB");
//		jswait.loadSendKeys(".//*[@id='description']","flytxt");
//		jswait.loadClick(".//*[@id='registrationListTypeId']");
//		jswait.loadClick("//div[contains(@class,'x-combo-list-item') and text()='Standard']");
//		jswait.loadClick(".//*[@id='moveAllLeft']");
//		Thread.sleep(3000);
//		jswait.loadClick("//button[text()='Save and Import Data']");
		
		//waitUntil("//label[text()='File Structure:']");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath(".//*[@id='theFile-file']")).sendKeys((String) list.getCell(1, 1));
		jswait.loadClick("//button[text()='Get File']");
		Thread.sleep(3000);
		jswait.loadClick("//span[text()='2. Map and Transform']");
		
		//waitUntil(".//*[@id='recurJobMapAndTransformPage']");
		Thread.sleep(10000);
		driver.switchTo().frame("recurJobMapAndTransformPage");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('consumerIdentification').selectedIndex = 1;");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//select[@id='consumerIdentification']/option[normalize-space(text())='1 - msisdn - \"9012233200\"']")).click();
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='consumerIdentification']")));
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//option[@value='0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Profile uploads:']/../..//a[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_0']//option[contains(.,'first name')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_0']/option[contains(.,'Name_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_1']//option[contains(.,'country')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_1']/option[contains(.,'Country_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileAdvancedOptions.autoUploadChk.0_1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_2']//option[contains(.,'email')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_2']/option[contains(.,'Email_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_3']//option[contains(.,'language 1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_3']/option[contains(.,'Languages_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileAdvancedOptions.autoUploadChk.0_3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_4']//option[contains(.,'language 2')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_4']/option[contains(.,'Languages_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileAdvancedOptions.autoUploadChk.0_4']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_5']//option[contains(.,'balance')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_5']/option[contains(.,'Balance_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_6']//option[contains(.,'boolean')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_6']/option[contains(.,'Boolean_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileAdvancedOptions.autoUploadChk.0_6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/*[@id='addProfileUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_7']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='profileSourceField0_7']//option[contains(.,'- age -')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_7']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='partnerProfileField0_7']/option[contains(.,'Age_q11')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='addSubsUpdateBtn_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='listActionId_0_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='listActionId_0_0']/option[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='regListId_0_0']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='regListId_0_0']/option[contains(.,'"+listname+"')]")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='5. Upload']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Start Upload']")).click();
		Thread.sleep(20000);
//		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'data_job_name')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'data_job_name')]/a")).click();
		
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Filters']/.."))).build().perform();
		Thread.sleep(3000);
		jswait.loadSendKeys(".//*[@name='data_job_name_filter']",listname);
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//button[contains(.,'Refresh Now')]")).click();
		String status = driver.findElement(By.xpath("//label[contains(.,'"+listname+"')]/../../../td[1]//label")).getText();
		 System.out.println(status); 
	        while(status.contains("Scheduled")||status.contains("Processing")){
	        	Thread.sleep(3000);
	        	driver.findElement(By.xpath(".//button[contains(.,'Refresh Now')]")).click();
	        	Thread.sleep(3000);
	        	status = driver.findElement(By.xpath("//label[contains(.,'"+listname+"')]/../../../td[1]//label")).getText();
	        	System.out.println(status); 
	        }
	        Exception uploadFailed = new Exception("List upload failed");
		if(!status.contains("Completed"))
			throw uploadFailed;
		driver.close();
	}
	@Then("^check the upoaded list in ui$")
    public void checkDataInUI() throws IOException, InterruptedException{
//		System.out.println("hjhgc");
		eh.setExcelFile("registrationListInputData", "Sheet1");
		String file = (String) eh.getCell(1, 0);
		System.out.println(file);
		 String csvFile = "ExcelFiles\\"+file;
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";

	        try {

	            br = new BufferedReader(new FileReader(csvFile));
	            line = br.readLine();
	            int i=0;
	            while ((line = br.readLine()) != null && i<10) {
	            	
	            	i++;
	                
	            }

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        String[] rowData = line.split(cvsSplitBy);
            

		jswait.loadClick("//label[contains(.,'Reports')]/..");
		jswait.loadClick("//div[contains(text(),'Customer Profile')]/..");
		jswait.loadSendKeys("//label[contains(text(),'Customer Number')]/../input",rowData[0]);
		jswait.loadClick("//paper-button[contains(text(),'Search')]");
		try{
			driver.findElement(By.xpath("//h3[contains(@class,'consumer-profile') and contains(text(),'"+rowData[0]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'Age_q11')]/../../data-table-cell[2]//span[contains(.,'Number')]/../../data-table-cell[3]//span[contains(.,'"+rowData[9]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'Balance_q11')]/../../data-table-cell[2]//span[contains(.,'Number')]/../../data-table-cell[3]//span[contains(.,'"+rowData[7]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'Boolean_q11')]/../../data-table-cell[2]//span[contains(.,'Yes or No')]/../../data-table-cell[3]//span[contains(.,'"+rowData[8]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'Country_q11')]/../../data-table-cell[2]//span[contains(.,'Single Select')]/../../data-table-cell[3]//span[contains(.,'"+rowData[3]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'Email_q11')]/../../data-table-cell[2]//span[contains(.,'Text')]/../../data-table-cell[3]//span[contains(.,'"+rowData[4]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'First Name_q11')]/../../data-table-cell[2]//span[contains(.,'Text')]/../../data-table-cell[3]//span[contains(.,'"+rowData[1]+"')]"));
			driver.findElement(By.xpath("//span[contains(.,'Languages_q11')]/../../data-table-cell[2]//span[contains(.,'Multi Select')]/../../data-table-cell[3]//span[contains(.,'"+rowData[5]+"/"+rowData[6]+"')]"));
			driver.findElement(By.xpath("//span[contains(@title,'_q11')]"));

		}catch(Exception e1){
			
		}
										
	}
	
}

//919913740011
