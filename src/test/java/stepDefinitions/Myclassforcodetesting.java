package stepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;

import com.mysql.cj.jdbc.MysqlParameterMetadata;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import pageObjetcs.OfferPageObjects;

public class Myclassforcodetesting {

	
	public static void main(String[] args) throws Exception {
		Myclassforcodetesting my = new Myclassforcodetesting();
		my.verifycampaign(bcName);
		//my.verifyMultipleTrackingRules(bcName);
//		my.verifyBroadcastNameWithStatusInPDF(bcName, bcstatus);
//		System.out.println("name status");
		//my.getCurrentDate("dd MMM YYYY hh:mm");
		// Thread.sleep(3000);
		// my.verifyBroadcastName(path, bcName);
		// System.out.println("name");
		// Thread.sleep(3000);
		// my.verifyBroadcastStatusInPDF(path, bcstatus);
	}
	// to get the current date for specific format String DateFormate="dd MMM YYYY HH:mm aaa z";
	
	public String getCurrentDate(String DateFormateString) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat(DateFormateString);// 03 Dec 2018 01:48 PM IST
		Date date = new Date();
		String d1 = dateFormat.format(date);
		
		System.out.println("Current date and time is " + d1);
		
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, 2);
		String newTime = dateFormat.format(cal.getTime());
		System.out.println(newTime);
		
		DateFormat SdateFormatter = new SimpleDateFormat("dd MMM yyyy hh:mm");
		String expDate1 = "Exported At : 07 Dec 2018 01:37";
		//System.out.println(expDate1.length());
		
		String expdatePDF=expDate1.substring(14, 31);
				System.out.println(expdatePDF+"jjjjjjj");
		Date dateaftercon = SdateFormatter.parse(expdatePDF);
		
		System.out.println(dateaftercon);
		

		Date Sysdate=SdateFormatter.parse(d1);
		
		System.out.println(Sysdate);
		
Date Sysdate2=SdateFormatter.parse(newTime);
		
		System.out.println(Sysdate2);
		
		Assert.assertEquals(Sysdate.after(dateaftercon), Sysdate2.before(dateaftercon));
		System.out.println("Success");
		
		String now = "07 Dec 2018 01:08";
		System.out.println("Start time::::"+now);
		 DateFormat dateFormatter = new SimpleDateFormat("dd MMM yyyy hh:mm");
		    Date date1 = dateFormatter .parse(now);
		    System.out.println(date.toString());
		    Date curentdate = new Date();
		    System.out.println(curentdate.toString());
		    date1.before(curentdate);
		    date1.after(curentdate);
		return newTime;

	}
	
	// ****************************** PDF REader****************************
	// static String path =
	// "C:\\Users\\mallikharjuna.ankem\\Downloads\\BC_oneOffBC4424_4683.pdf";
	static String bcName = "campaignBC465";
	static String bcstatus = "planned";

	PDDocument document = null;
	String readTextFromPdf;

	public String pathfile(String bcname) {

		String path = "C:\\Users\\mallikharjuna.ankem\\Downloads\\campaign_" + bcname + "_458.pdf";
		return path;
	}

	public void loadPDFFile(String path) throws Exception, IOException, FileNotFoundException {

		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			document = PDDocument.load(fis);
			System.out.println("file loaded");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("File not found");
		}
	}
	
	public void verifycampaign(String bcName) throws Exception, IOException, Exception {
		String path = pathfile(bcName);
		loadPDFFile(path);
		
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		//System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		//System.out.println(readTextFromPdf);
	   	String[] str17 = readTextFromPdf.split("\\n");
		String exportedDate = str17[str17.length - 1];
		System.out.println(exportedDate.substring(13, 31));
		
	}
	
	public void verifyMultipleTrackingRules(String bcName) throws Exception {
		String path = pathfile(bcName);
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		readTextFromPdf = pdfTextStripper.getText(document);
		String[] str17 = readTextFromPdf.split("\\n");
		System.out.println(readTextFromPdf);
		String expectedString = str17[36];
		System.out.println(expectedString);
		String exp40=str17[40].trim();
		System.out.println(exp40);
		String exp45=str17[45].trim();
		System.out.println(exp45);
		OfferPageObjects op=new OfferPageObjects();
		String getfirstRule=op.getFirstRuleName();
		
		String firstRule="Rule Name:"+getfirstRule+"(Priority:2)";
		String secondRule="Rule Name:secondRule(Priority:3)";
      if(firstRule.contentEquals(exp40)) {
	
	  System.out.println("first rule");
     }
		
		document.close();
	}

	public void verifyBroadcastNameWithStatusInPDF(/* String path, */ String bcName, String bcstatus) throws Exception {
		String path = pathfile(bcName);
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		// System.out.println(readTextFromPdf);

		String[] str17 = readTextFromPdf.split("\\n");
		int size = str17.length;
		System.out.println(size);
		String expectedString = str17[1];
		String expetedStatus = str17[10];

		String DateFormate = "Exported At : 05 Dec 2018 06:26 PM IST";
		System.out.println(DateFormate.length());
		String exportedDate = str17[size - 1];
		System.out.println(exportedDate);

		if (DateFormate.contentEquals(exportedDate.trim())) {
			System.out.println("dates formate fine");
		} else {
			System.out.println("dates formate not equal");
		}

		String actualstatus = "Status " + bcstatus;

		String actualString = "Broadcast :  " + bcName;
		expectedString = expectedString.trim();
		expetedStatus = expetedStatus.trim();
		// System.out.println(expetedStatus);
		// System.out.println(actualstatus);

		// Assert.assertEquals(actualString, expectedString);

		if (expectedString.contentEquals(actualString)) {
			System.out.println(
					" Actual BC name = " + actualString + " and Expected BC name= " + expectedString + " are equal");
		} else {
			System.out.println(
					"Actual BC name = " + actualString + " and Expected BC name= " + expectedString + " are not equal");
		}

		// Assert.assertEquals(actualstatus, expetedStatus);

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

	public void verifyBroadcastName(String path, String bcName) throws Exception, IOException, FileNotFoundException {
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		// System.out.println(readTextFromPdf);

		String[] getBCName = readTextFromPdf.split("\\n");
		String expectedString = getBCName[1];
		String actualString = "Broadcast :  " + bcName;
		expectedString = expectedString.trim();
		// Assert.assertEquals(actualString, expectedString);

		if (expectedString.contentEquals(actualString)) {
			System.out.println(
					" Actual BC name = " + actualString + " and Expected BC name= " + expectedString + " are equal");
		} else {
			System.out.println(
					"Actual BC name = " + actualString + " and Expected BC name= " + expectedString + " are not equal");
		}

		document.close();
		System.out.println("PDF Document closed");

	}

	public void verifyBroadcastStatusInPDF(String path, String bcstatus) throws Exception {

		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		System.out.println("reading text from pdf");
		// to store the pdf data into string
		readTextFromPdf = pdfTextStripper.getText(document);
		System.out.println(readTextFromPdf);

		String[] str17 = readTextFromPdf.split("\\n");
		String expetedStatus = str17[10];

		String actualstatus = "Status " + bcstatus;
		expetedStatus = expetedStatus.trim();
		System.out.println(expetedStatus);
		System.out.println(actualstatus);
		System.out.println("Lenghth of PDF string status:" + expetedStatus.length());
		System.out.println("Lenghth of Formed String status :" + actualstatus.length());
		// Assert.assertEquals(actualstatus, expetedStatus);

		if (expetedStatus.contentEquals(actualstatus)) {

			System.out.println(" Actual  : " + actualstatus + " and Expected : " + expetedStatus);
		} else {
			System.out.println(" Actual  : " + actualstatus + " and Expected : " + expetedStatus);
		}

		document.close();
		System.out.println("PDF Document closed");

	}

	
}

// *****************************************************************************************************************************
