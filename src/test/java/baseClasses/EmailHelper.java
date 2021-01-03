package baseClasses;

import java.util.Date;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class EmailHelper {

	public static Date getMailRecivedDate(String fromaddress, String subject){
	
	
		String host = "imap.gmail.com";// change accordingly
		String mailStoreType = "imap";
		String username = "selenium.flytxt@gmail.com";// change accordingly
		String mailpassword = "Flytxt.4";// change accordingly
		Date mailRecivedDate=null;
		try {

			// create properties field
			Properties properties = new Properties();

			properties.put("mail.imap.host", host);
			properties.put("mail.imap.port", "995");
			properties.put("mail.imap.starttls.enable", "true");
			Session emailSession = Session.getDefaultInstance(properties);

		
			Store store = emailSession.getStore("imaps");

			store.connect(host, username, mailpassword);
			System.out.println("connected");

		
			Folder emailFolder = store.getFolder("INBOX");

			emailFolder.open(Folder.READ_ONLY);

		
			Message[] messages = emailFolder.getMessages();
			System.out.println("messages.length---" + messages.length);

			for (int i = 0, n = messages.length; i < n; i++) {

				Message message = messages[i];
				//System.out.println(message.getSubject());
				if ((message.getFrom()[0].toString()).equals(fromaddress)
						&& (message.getSubject().toString())
								.contains(subject)) {
					System.out.println("---------------------------------");
					System.out.println("Email Number " + (i + 1));
					System.out.println("Subject: " + message.getSubject());
					System.out.println("From: " + message.getFrom()[0]);
					System.out.println("recived date :" + message.getReceivedDate());
					System.out.println("Text: " + message.getContent().toString());
					mailRecivedDate = message.getReceivedDate();
					
				}
				

			}

			// close the store and folder objects
			emailFolder.close(false);
			store.close();

		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mailRecivedDate;
	}

//	public static void main(String[] args) {
//
//		String host = "imap.gmail.com";// change accordingly
//		String mailStoreType = "imap";
//		String username = "selenium.flytxt@gmail.com";// change accordingly
//		String password = "Flytxt.4";// change accordingly
//
//		String fromAddrForBCNotification="\"flyops@flytxt.com\" <flyops@flytxt.com>";// you pass your from address- swapna.p@flytxt.com
//		String subjectBCRendering= "Broadcast Rendering Notification - oneOffBC8902";//BCNotification is BC name
		//String subjectForWorkFlow="	Approval is requested for campaign campaignnew9778";//campaignnew9778 is campagin name 
		
		//Date fggs = check(username, password,fromAddrForBCNotification, subjectBCRendering);
		//System.out.println("Date is :"+fggs);

//	}
	
}
