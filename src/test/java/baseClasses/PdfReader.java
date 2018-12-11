package baseClasses;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	
	public void verifyMultipleTrackingRules(String path) throws Exception {
		
		loadPDFFile(path);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		readTextFromPdf = pdfTextStripper.getText(document);
		String[] str17 = readTextFromPdf.split("\\n");
		System.out.println(readTextFromPdf);
		String firstRuleFromPDF = str17[36].trim();
		System.out.println(firstRuleFromPDF);
		String secondRuleFromPDF=str17[45].trim();
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
	
/*public void loadCampaignPDFFile(String path) throws Exception, IOException, FileNotFoundException {
  		
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
*/
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
}


