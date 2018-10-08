package baseClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class ShellExecuter extends Init{
	String host= "";
    String user="";
    String password="";
    
    public ShellExecuter() throws IOException {
    	p.setPropertyFile("config.properties");
    	host =p.getValue("env");
//    	host = "192.168.150.207";
//    	user=p.getValue("rootUser");
    	user = "root";
    	password=p.getValue("rootPassword");
//    	password = "qaenv23";
    }
    public void executeScript(String command1) {
//    	 String command1="cp /root/dk_testing_selenium/location1/source.txt /root/dk_testing_selenium/location2/";
		    try{
		    	
		    	java.util.Properties config = new java.util.Properties(); 
		    	config.put("StrictHostKeyChecking", "no");
		    	JSch jsch = new JSch();
		    	Session session=jsch.getSession(user, host, 22);
		    	session.setPassword(password);
		    	config.put(
		    		    "PreferredAuthentications", 
		    		    "publickey,keyboard-interactive,password");
		    	session.setConfig(config);
		    	session.connect();
		    	System.out.println("Connected");
		    	
		    	Channel channel=session.openChannel("exec");
		        ((ChannelExec)channel).setCommand(command1);
		        channel.setInputStream(null);
		        ((ChannelExec)channel).setErrStream(System.err);
		        
		        InputStream in=channel.getInputStream();
		        channel.connect();
		        byte[] tmp=new byte[1024];
		        while(true){
		          while(in.available()>0){
		            int i=in.read(tmp, 0, 1024);
		            if(i<0)break;
		            System.out.print(new String(tmp, 0, i));
		          }
		          if(channel.isClosed()){
		            System.out.println("exit-status: "+channel.getExitStatus());
		            break;
		          }
		          try{Thread.sleep(1000);}catch(Exception ee){}
		        }
		        channel.disconnect();
		        session.disconnect();
		        System.out.println("DONE");
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
    }
    
    public static void uploadDNDListForDkJob() throws IOException {
    	String csvFileData = "";
		File csvfile = new File("ExcelFiles\\selenium_list_DND.csv");
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 1;
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 while ((temp = br.readLine()) != null) {
			 if(initial==0) {
				 csvFileData+="\n";
			 }
			 initial=0;
			 csvFileData+=temp;
         }
		 System.out.println(csvFileData);
		 System.out.println("test");
		 br.close();
		
		
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd /usr/local/flytxt/selenium/dnd; echo '"+csvFileData+"' >dndUpload.csv");
//		se.executeScript("ls");
    }
    public static void uploadListForDkJob() throws IOException {
    	String csvFileData = "";
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		String filename = (String) list.getCell(1, 0);
		File csvfile = new File("ExcelFiles\\"+filename);
		 BufferedReader br = null;
		 String temp = "";
		 int initial = 1;
		 br = new BufferedReader(new FileReader(csvfile.getCanonicalPath()));
		 while ((temp = br.readLine()) != null) {
			 if(initial==0) {
				 csvFileData+="\n";
			 }
			 initial=0;
			 csvFileData+=temp;
         }
		 System.out.println(csvFileData);
		 System.out.println("test");
		 br.close();
		
		
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd /usr/local/flytxt/selenium/profile; echo '"+csvFileData+"' >listUpload.csv");
//		se.executeScript("ls");
    }
    
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
		 for(int j=0;j<age.length;j++)
			 if(age[j]>18){
				 System.out.println(age[j]);
				 ageGT18++;
			 }
		 System.out.println(ageGT18);
		 System.out.println("age>18");
		 list.setCell(1, "age>18",String.valueOf(ageGT18) );
		 return ageGT18;
    	
    }
	public static void main(String[] args) throws IOException {
		
//		uploadListForDkJob();
//		
//		String csvFileData = "";
		
//		getAgeTargetCount();
		
//		uploadDNDListForDkJob();
		
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd /usr/local/flytxt/selenium/dnd; ls");
	}

}
