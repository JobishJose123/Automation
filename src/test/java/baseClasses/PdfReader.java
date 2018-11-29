package baseClasses;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

public class PdfReader {

//	static String path = "C:\\Users\\mallikharjuna.ankem\\Downloads\\BC_oneOffBC4865_4415.pdf";
//	static String bcName = "oneOffBC4865";
//	static String bcstatus = "planned";

	public void loadPDFFile(String path, String bcName, String bcstatus)
			throws Exception, IOException, FileNotFoundException {

		PDDocument document = null;
		String readTextFromPdf;

		try {
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			document = PDDocument.load(fis);
			System.out.println("file loaded");
			PDFTextStripper pdfTextStripper = new PDFTextStripper();
			System.out.println("reading text from pdf");
			// to store the pdf data into string
			readTextFromPdf = pdfTextStripper.getText(document);
			// System.out.println(readTextFromPdf);

			String[] str17 = readTextFromPdf.split("\\n");
			String expectedString = str17[1];
			String expetedStatus = str17[10];

			String actualstatus = "Status " + bcstatus;


			String actualString = "Broadcast :  " + bcName;
			expectedString = expectedString.trim();
			expetedStatus = expetedStatus.trim();
			// System.out.println(expetedStatus);
			// System.out.println(actualstatus);

//			System.out.println("Lenghth of PDF string:" + expectedString.length());
//			System.out.println("Lenghth of Formed String:" + actualString.length());

//			System.out.println("Lenghth of PDF string status:" + expetedStatus.length());
//			System.out.println("Lenghth of Formed String status :" + actualstatus.length());

			
			Assert.assertEquals(actualString, expectedString);
			

			if (expectedString.contentEquals(actualString)) {
				System.out.println(" Actual BC name = " + actualString + " and Expected BC name= " + expectedString
						+ " are equal");
			} else {
				System.out.println("Actual BC name = " + actualString + " and Expected BC name= " + expectedString
						+ " are not equal");
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

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("File not found");
		}

		// System.out.println(str17[1]);
		// System.out.println(str17[1].length());
//	String substr=newstr.substring(13,25);
//	System.out.println(substr);
//	System.out.println(bcName);

		// Assert.assertTrue(readTextFromPdf.contains("Status "+ bcstatus));

//			if (readTextFromPdf.contains("Broadcast :  " + bcName)) {
//
//				System.out.println("Boadcast name " + bcName);
//			}

//			if (readTextFromPdf.contains("Status " + bcstatus)) {
//
//				System.out.println("Status of BC " + bcstatus);
//			}

//			System.out.println("if condition started");

//		String text=pdfTextStripper.getPageEnd();
//		String text1=pdfTextStripper.getPageStart();
//		String text2=pdfTextStripper.getArticleStart();

//			if (readTextFromPdf.contains(bcName)) {
//				System.out.println("Downloaded PDF contains braodcast name- "+bcName);
//				// Assert.assertEquals(textFromPdf.contains(bcName));
//				
//			}

//			 String lines[] = readTextFromPdf.split("\\r?\\n");
//             for (String line : lines) {
//                 //System.out.println(line);
//                 if (line.contains(bcName)) {
//     				System.out.println(line);
//     				
//     				
//     			}
//             }

		/*
		 * String[] str = text.split("Broadcast");
		 * System.out.println("StartBroadcast@@@@@@@@@@@@@@@@@@@");
		 * System.out.println(str[1]);
		 * System.out.println("endBroadcast@@@@@@@@@@@@@@@@@@@");
		 * System.out.println(text.split("Basic Details", 4)); String[] str1 =
		 * text.split("Broadcast");
		 * System.out.println("Basic Details@@@@@@@@@@@@@@@@@@@");
		 * System.out.println(str1[2]);
		 * System.out.println("endBasic Details @@@@@@@@@@@@@@@@@@@@@@");
		 * 
		 * String[] str2 = text.split("Broadcast");
		 * System.out.println("Target Details@@@@@@@@@@@@@@@@@@@");
		 * System.out.println(str2[3]);
		 * System.out.println("endTarget Details @@@@@@@@@@@@@@@@@@@@@@");
		 */

		/*
		 * PDPage page = document.getPage(1); //PDPageContentStream contentStream = new
		 * PDPageContentStream(document, page);
		 * 
		 * //Begin the Content stream contentStream.beginText();
		 * 
		 * reading the doument information PDDocumentInformation pdd =
		 * document.getDocumentInformation(); System.out.println(pdd.getTitle());
		 * System.out.println(pdd.getSubject());
		 * System.out.println(pdd.getCreationDate());
		 * System.out.println(pdd.getKeywords());
		 * 
		 * // closing the PDF //contentStream.close();
		 */

	}

//	public static void main(String[] args) throws IOException, Exception, FileNotFoundException {
//		PdfReader pf = new PdfReader();
//
//		pf.loadPDFFile(path, bcName, bcstatus);
//	}

}
