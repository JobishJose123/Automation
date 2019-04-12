package baseClasses;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.pdfbox.util.Matrix;
import org.openqa.selenium.support.PageFactory;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfString;
import com.itextpdf.text.pdf.interfaces.PdfDocumentActions;
import com.lowagie.text.pdf.PdfTable;

import org.junit.Assert;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.OfferPageObjects;
import stepDefinitions.Myclassforcodetesting;

public class PdfReader {

//	static String path = "C:\\Users\\mallikharjuna.ankem\\Downloads\\BC_oneOffBC4424_4683.pdf";
//	static String bcName = "oneOffBC4424";
//	static String bcstatus = "planned";

	PDDocument document = null;
	String readTextFromPdf;
	
	public String path(String bcName) throws Exception {
		
		String newBCNameWithOutSpace = bcName.replaceAll("[^a-zA-Z0-9-]", "_");
		String systemUserName = System.getProperty("user.name");
		System.out.println(systemUserName);
		SQLHandler sql = new SQLHandler();
		String query = "select APPLICATION_INSTANCE_ID from app_instance where APPLICATION_INSTANCE_NAME='" + bcName
				+ "';";
		int bcID = sql.getStringOfQuery(query);
		// System.out.println(bcID);
		String path = "C:\\Users\\" + systemUserName + "\\Downloads\\BC_" + newBCNameWithOutSpace + "_" + bcID + ".pdf";
		System.out.println(path);
		return path;
	}

	public void loadPDFFile(String path) throws Exception, IOException, FileNotFoundException {
  
			
		
		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			document = PDDocument.load(fis);
			System.out.println("file loaded");
            fis.close();
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("File not found");
		}
	}
	
	
	
	public void verifyMultipleTrackingRulesAndCreatives(String path) throws Exception {
		
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		readTextFromPdf = pdfTextStripper.getText(document);
		String[] str17 = readTextFromPdf.split("\\n");
		//System.out.println(readTextFromPdf);
		String language1FromPDF = str17[54].trim();
		String language2FromPDF = str17[58].trim();
		Init init=new Init();
//		String Language1=init.LANGUAGE1;
//		String Language2=init.LANGUAGE2;
//		System.out.println(language1FromPDF);
//		System.out.println(language1FromPDF);
		Assert.assertTrue((language1FromPDF.contains(init.LANGUAGE1)&&language2FromPDF.contains(init.LANGUAGE2))||(language1FromPDF.contains(init.LANGUAGE2)&&language2FromPDF.contains(init.LANGUAGE1)));
		
		if((language1FromPDF.contains(init.LANGUAGE1)&&language2FromPDF.contains(init.LANGUAGE2))||(language1FromPDF.contains(init.LANGUAGE2)&&language2FromPDF.contains(init.LANGUAGE1))) {
			System.out.println("Multiple crative verified");
			
		}else {
			System.out.println("Multiple crative not verified");
		}
		
		
		String firstRuleFromPDF = str17[34].trim();
		System.out.println(firstRuleFromPDF);
		String secondRuleFromPDF=str17[43].trim();
		System.out.println(secondRuleFromPDF);
		//OfferPageObjects op=new OfferPageObjects();
		//String getfirstRule=op.getFirstRuleName();
		String firstRule="Rule Name:firstRule(Priority:2)";
		String secondRule="Rule Name:secondRule(Priority:3)";
		Assert.assertEquals(firstRule,firstRuleFromPDF );
		Assert.assertEquals(secondRule, secondRuleFromPDF);
		document.close();
		System.out.println("PDF Closed");
	}
	
	public void verifyExportedBroadcastDateAndTime(String path, String afterClickOnExport,String addingthreemin) throws Exception {
		System.out.println("verifyExportedBroadcastDateAndTime...Started");
		
		loadPDFFile(path);
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		//System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		//System.out.println(readTextFromPdf);
       	String[] str17 = readTextFromPdf.split("\\n");
		String exportedDate = str17[str17.length - 1];
		System.out.println(exportedDate);
		document.close();
		System.out.println("PDF Document closed");
		
		DateFormat newDateFormate = new SimpleDateFormat("dd MMM yyyy hh:mm");
		Date getTimeAfterExportPDF=newDateFormate.parse(afterClickOnExport);
		Date addingMinutes= newDateFormate.parse(addingthreemin);
		Date exportedTimeFromFooter=newDateFormate.parse(exportedDate.substring(14, 31));
		
		System.out.println(getTimeAfterExportPDF);
		System.out.println(exportedTimeFromFooter);
		System.out.println(addingMinutes);
		
		//Assert.assertEquals((getTimeAfterExportPDF.equals(exportedTimeFromPDF)||getTimeAfterExportPDF.after(exportedTimeFromPDF)),exportedTimeFromPDF.before(addingMinutes));
		Assert.assertTrue(exportedTimeFromFooter.before(addingMinutes)&&(exportedTimeFromFooter.after(getTimeAfterExportPDF)||exportedTimeFromFooter.equals(getTimeAfterExportPDF)));		
		System.out.println("Verified PDF Footer");
		
	}

	public void verifyBroadcastNameWithStatusInPDF(String path,String bcName,String bcstatus) throws Exception {

		
		loadPDFFile(path);
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		//System.out.println(readTextFromPdf);

		String[] str17 = readTextFromPdf.split("\\n");
		String expectedBCName = str17[1];
		String expetedStatus = str17[10];

		String actualstatus = "Status " + bcstatus;

		String actualBCName = "Broadcast :  " + bcName;
		expectedBCName = expectedBCName.trim();
		expetedStatus = expetedStatus.trim();
		// System.out.println(expetedStatus);
		// System.out.println(actualstatus);

		// System.out.println("Lenghth of PDF string:" + expectedString.length());
		// System.out.println("Lenghth of Formed String:" + actualString.length());

		// System.out.println("Lenghth of PDF string status:" + expetedStatus.length());
		// System.out.println("Lenghth of Formed String status :" +
		// actualstatus.length());

		 Assert.assertEquals(actualBCName, expectedBCName);

		if (expectedBCName.contentEquals(actualBCName)) {
			System.out.println(
					" Actual BC name = " + actualBCName + " and Expected BC name= " + expectedBCName + " are equal");
		} else {
			System.out.println(
					"Actual BC name = " + actualBCName + " and Expected BC name= " + expectedBCName + " are not equal");
		}

		 Assert.assertEquals(actualstatus, expetedStatus);

		if (expetedStatus.contentEquals(actualstatus)) {

			System.out.println(" Actual  : " + actualstatus + " and Expected : " + expetedStatus);
		} else {
			System.out.println(" Actual  : " + actualstatus + " and Expected : " + expetedStatus);
		}
		// Assert.assertTrue(readTextFromPdf.contains("Broadcast : " + bcName));

		// System.out.println(" Assert: Actual BC name : "+actualString+" and Expected
		// BC name: "+expectedString+" are equal");

		document.close();
		
		System.out.println("PDF Document closed");

	}

	public void verifyBroadcastName(String bcName,String path) throws Exception, IOException, FileNotFoundException {
			
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		// System.out.println(readTextFromPdf);

		String[] getBCName = readTextFromPdf.split("\\n");
		String expectedBCName = getBCName[1];
		String actualBCName = "Broadcast :  " + bcName;
		expectedBCName = expectedBCName.trim();
		
		Assert.assertEquals(actualBCName, expectedBCName);
		
		if (expectedBCName.contentEquals(actualBCName)) {
			System.out.println(" Actual BC name = " + actualBCName + " and Expected BC name= " + expectedBCName + " are equal");
		} else {
			System.out.println("Actual BC name = " + actualBCName + " and Expected BC name= " + expectedBCName + " are not equal");
		}

		document.close();
		System.out.println("PDF Document closed");

	}

	
	public void renameAndDeletePDF(String BroadcastName,String BroadcastStatus) throws Exception {
		
		String systemUserName = System.getProperty("user.name");
		String reNameFilePath="C:\\Users\\"+systemUserName+"\\Downloads\\ReNamedPDFS\\"+BroadcastName+"_"+BroadcastStatus+".pdf";
		String pathOfFile=path(BroadcastName);
		try {
			
			File originalFile= new File(pathOfFile);
			//Thread.sleep(2000);
			File reNameFile=new File(reNameFilePath);
			Thread.sleep(2000);
			if(originalFile.exists()) {
				Thread.sleep(2000);
			boolean b=originalFile.renameTo(reNameFile);
						if(b==true) {
			System.out.println("fileRenamed file path is: "+reNameFilePath);
			
			}else {
				System.out.println("file not renamed");
			}
			}else {
				System.out.println("file not exists in path : "+pathOfFile);
			}
			
			
			
		}catch (Exception e) {
			System.out.println("File not found");
		}
		
		
	}
	

	
	public void verifySegmentConditionWithMoreThanTenCreatedConditions(String path) throws FileNotFoundException, IOException, Exception {
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		//System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		String[] str17 = readTextFromPdf.split("\\n");
		System.out.println(readTextFromPdf);
		List<String> al=new ArrayList<String>();
		List<String> expectedListAND=new ArrayList<String>();
		List<String> expectedListOR=new ArrayList<String>();
		
		for(String pdfData:str17) {
			
			al.add(pdfData.trim());
		}
				
		int indexSegmentConditions=al.indexOf("Segment Conditions");
		//System.out.println(indexSegmentConditions);
		int indexOfferDetails=al.indexOf("Offer Details");
		//System.out.println(indexOfferDetails);
		List<String> subList = al.subList(indexSegmentConditions+1, indexOfferDetails);
//		System.out.println(subList);
//		System.out.println(subList.size());
		expectedListAND.add("selenium_list is subscribed");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Age_q11 is greater than 18");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Age_q11 is greater than 19");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Age_q11 is less than 100");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Balance_q11  is greater than 5");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Balance_q11  is less than 200");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info First Name_q11 contains 'A'");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Boolean_q11  Yes");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Languages_q11 any of Malayalam , English , Korean , Hindi , Spanish");
		expectedListAND.add("And");
		expectedListAND.add("Customer Profi le Info Country_q11  is not set");
		expectedListAND.add("And");
		expectedListAND.add("Customer Device Info Device ID_q11  is equal to 1");
		
		
		expectedListOR.add("selenium_list is subscribed");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Age_q11 is greater than 18");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Age_q11 is greater than 19");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Age_q11 is less than 100");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Balance_q11  is greater than 5");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Balance_q11  is less than 200");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info First Name_q11 contains 'A'");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Boolean_q11  Yes");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Languages_q11 any of Malayalam , English , Korean , Hindi , Spanish");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Profi le Info Country_q11  is not set");
		expectedListOR.add("Or");
		expectedListOR.add("Customer Device Info Device ID_q11  is equal to 1");
		
		if(subList.equals(expectedListAND)) {
			Assert.assertTrue(subList.equals(expectedListAND));
			System.out.println("AND Operation Segment conditions verified");
			
		}else if(subList.equals(expectedListOR))
		{
			Assert.assertTrue(subList.equals(expectedListOR));
			System.out.println("OR Operation Segment conditions verified");
			
		}else if((subList.get(0)).equals("Customer Profi le Info Age_q11 is greater than 18")) {
			
			Assert.assertTrue((subList.get(0)).equals("Customer Profi le Info Age_q11 is greater than 18"));
			System.out.println("Single Segment condition Verified"+subList);
			
		} else {
			System.out.println("Available segment condition is:"+subList);
		}
	}
	
	public void verifyNoDoNotContactlistsAreExcluded(String path) throws FileNotFoundException, IOException, Exception {
		
		loadPDFFile(path);
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		//System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		//System.out.println(readTextFromPdf);
	   	String[] str17 = readTextFromPdf.split("\\n");
	   	List<String> al=new ArrayList<String>();
		//List<String> expectedList=new ArrayList<String>();
		
		for(String pdfData:str17) {
			
			al.add(pdfData.trim());
		}		
		
		int indexofDNDListExculed=al.indexOf("DND Lists Excluded No Do Not Contact l ists are excluded");
		//System.out.println(indexofDNDListExculed);
		int indexdofSegmentCondition=al.indexOf("Segment Conditions");
		//System.out.println(indexdofSegmentCondition);
		List<String> subList=al.subList(indexofDNDListExculed, indexdofSegmentCondition);
		//System.out.println(donotcl);
		
		if((subList.get(0)).equals("DND Lists Excluded No Do Not Contact l ists are excluded")) {
		Assert.assertTrue((subList.get(0)).equals("DND Lists Excluded No Do Not Contact l ists are excluded"));
		System.out.println("No Do Not Contact l ists are excluded is Verified");
		}else {
			System.out.println("No Do Not Contact lists are excluded is not Verified"+subList.get(0));
		}
	}
	
public void verifyExportedCampaignDateAndTime(String path, String afterClickOnExport,String addingthreemin,String query) throws Exception {
	
	
	loadPDFFile(path);
	
	PDFTextStripper pdfTextStripper = new PDFTextStripper();
	//System.out.println("reading text from pdf");
	// to store the pdf data into string
	readTextFromPdf = pdfTextStripper.getText(document);
	//System.out.println(readTextFromPdf);
   	String[] str17 = readTextFromPdf.split("\\n");
	String exportedDate = str17[str17.length - 1];
	System.out.println(exportedDate);
	document.close();
	System.out.println("PDF Document closed");
	
	DateFormat newDateFormate = new SimpleDateFormat("dd MMM yyyy hh:mm");
	Date getTimeAfterExportPDF=newDateFormate.parse(afterClickOnExport);
	Date addingMinutes= newDateFormate.parse(addingthreemin);
	Date exportedTimeFromFooter=newDateFormate.parse(exportedDate.substring(13, 31));
	
	System.out.println(getTimeAfterExportPDF);
	System.out.println(exportedTimeFromFooter);
	System.out.println(addingMinutes);
	
	//Assert.assertEquals((getTimeAfterExportPDF.equals(exportedTimeFromPDF)||getTimeAfterExportPDF.after(exportedTimeFromPDF)),exportedTimeFromPDF.before(addingMinutes));
	Assert.assertTrue(exportedTimeFromFooter.before(addingMinutes)&&(exportedTimeFromFooter.after(getTimeAfterExportPDF)||exportedTimeFromFooter.equals(getTimeAfterExportPDF)));		
	System.out.println("Verified campaign PDF Footer");
	
}

public Date verifyGettingBcModifiedTime(String path) throws FileNotFoundException, IOException, Exception {
	
	
	loadPDFFile(path);
	
	PDFTextStripper pdfTextStripper = new PDFTextStripper();
	//System.out.println("reading text from pdf");
	// to store the pdf data into string
	readTextFromPdf = pdfTextStripper.getText(document);
	String[] str17 = readTextFromPdf.split("\\n");
	//System.out.println(readTextFromPdf);
	List<String> al=new ArrayList<String>();
			
	for(String pdfData:str17) {
		
		al.add(pdfData.trim());
	}
	int indexOfModifiedBySysAdmin=al.indexOf("Modified by System Administrator");
	System.out.println(indexOfModifiedBySysAdmin);
	
	int indexOfBcAttributes=al.indexOf("Broadcast Attributes");
	System.out.println(indexOfBcAttributes);
	
	List<String> subList = al.subList(indexOfModifiedBySysAdmin+1, indexOfBcAttributes);
	System.out.println(subList);
	String getModifiedTime=subList.get(0);
	System.out.println(getModifiedTime.substring(14, 34));
	DateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm aaa");
	Date dateaftercon = simpleDateFormat.parse(getModifiedTime.substring(14, 34));
	System.out.println(dateaftercon);
	return dateaftercon;
	
	
}


public void verifyCampaignPDFMoreThanTenConditions(String path, String endType, String CurrentSysDateAndTime,String recurringFrequency) throws FileNotFoundException, IOException, Exception {
	
		loadPDFFile(path);

		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		// System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		String[] str17 = readTextFromPdf.split("\\n");
		//System.out.println(readTextFromPdf);
		List<String> al = new ArrayList<String>();
		List<String> expectedListOR = new ArrayList<String>();

		for (String pdfData : str17) {

			al.add(pdfData.trim());
		}

		for (int i = 1; i <= 11; i++) {
			expectedListOR.add("Customer Profi le Info Age_q11 is greater than 18");
			expectedListOR.add("Or");
			if (i == 11) {
				expectedListOR.remove(21);
			}

		}

		int indexOfTargetConditions = al.indexOf("Target Conditions");
		int indexOfSchedule = al.indexOf("Schedule");

		List<String> subList = al.subList(indexOfTargetConditions + 1, indexOfSchedule);
		//System.out.println(subList);

	
		Assert.assertTrue("Verified Multiple OR (more Than 10 ) conditions in campaign PDF", subList.equals(expectedListOR));

		if (endType.equalsIgnoreCase("After")) {

			int indexOfSchedule1 = al.indexOf("Schedule");
			int indexOFIsRecurringYes = al.indexOf("Render At Real Time");

			List<String> subList1 = al.subList(indexOfSchedule1 + 1, indexOFIsRecurringYes);
			//System.out.println(subList1);

			String getSchedulaTime = subList1.get(0);
			System.out.println(getSchedulaTime);
			System.out.println(getSchedulaTime.substring(11, 31));
			DateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
			Date dateaftercon = simpleDateFormat.parse(getSchedulaTime.substring(11, 31));
			System.out.println(dateaftercon);
			Date CurrentSystemDateAndTime = simpleDateFormat.parse(CurrentSysDateAndTime);
			Assert.assertTrue("Verified campaign Schedule Date and Time", dateaftercon.after(CurrentSystemDateAndTime));
			Assert.assertTrue("Verified Schedule camapign time Zone", subList1.get(1).contentEquals("IST"));
			Assert.assertTrue("Verified Campaign Recurrence Pattern",
					subList1.get(5).contentEquals("Recurrence Pattern Recur every"+recurringFrequency+"Days(s)"));

		} else if (endType.equalsIgnoreCase("At")) {

			int indexOfSchedule1 = al.indexOf("Schedule");
			int indexOFIsRecurringYes = al.indexOf("Is Recurring Yes");

			List<String> subList1 = al.subList(indexOfSchedule1 + 1, indexOFIsRecurringYes);
			//System.out.println(subList1);

			String getSchedulaTime = subList1.get(0);
			System.out.println(getSchedulaTime);
			System.out.println(getSchedulaTime.substring(11, 31));
			DateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
			Date dateaftercon = simpleDateFormat.parse(getSchedulaTime.substring(11, 31));
			System.out.println(dateaftercon);
			Date CurrentSystemDateAndTime = simpleDateFormat.parse(CurrentSysDateAndTime);
			Assert.assertTrue("Verified campaign Schedule Date and Time", dateaftercon.after(CurrentSystemDateAndTime));

		} else if (endType.equalsIgnoreCase("Null")) {

			int indexOfSchedule1 = al.indexOf("Schedule");
			int indexOFIsRecurringYes = al.indexOf("Is Recurring Yes");

			List<String> subList1 = al.subList(indexOfSchedule1 + 1, indexOFIsRecurringYes);
			System.out.println(subList1);

			String getSchedulaTime = subList1.get(0);
			System.out.println(getSchedulaTime);
			System.out.println(getSchedulaTime.substring(11, 31));
			DateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
			Date dateaftercon = simpleDateFormat.parse(getSchedulaTime.substring(11, 31));
			System.out.println(dateaftercon);
			Date CurrentSystemDateAndTime = simpleDateFormat.parse(CurrentSysDateAndTime);
			Assert.assertTrue("Verified campaign Schedule Date and Time", dateaftercon.after(CurrentSystemDateAndTime));

		}

	}


}


