package baseClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;

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
    	user = p.getValue("rootUser");
    	password=p.getValue("rootPassword");
//    	password = "qaenv23";
    }
    public void executeScript(String command1) {
//   	 String command1="cp /root/dk_testing_selenium/location1/source.txt /root/dk_testing_selenium/location2/";
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
    
    public ArrayList<String> executeScriptInfra(String command1) {
//    	 String command1="cp /root/dk_testing_selenium/location1/source.txt /root/dk_testing_selenium/location2/";
    	 ArrayList<String> ActualString = new ArrayList <String>();
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
		        Thread.sleep(2000);
		        channel.setInputStream(null);
		        ((ChannelExec)channel).setErrStream(System.err);
		        
		        InputStream in=channel.getInputStream();
		        channel.connect();
		        byte[] tmp=new byte[1024];
		        //ArrayList<String> ActualString = new ArrayList <String>();
		        while(true){
	          while(in.available()>0){
	            int i=in.read(tmp, 0, 1024);
            if(i<0)break;	
		            String WholeString = new String(tmp, 0, i);
		            String[] str17 = WholeString.split("\\n");
		            //ActualString.add(new String(tmp, 0, i);
		    		for (String OrignalData : str17) {

		    			ActualString.add(OrignalData.trim());
		    		}
		            
		           //System.out.println(ActualString.size());
		            //System.out.println(counter);
		            //counter++;
		            
		            //System.out.print(new String(tmp, 0, i));
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
		        //return ActualString;
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
		  return ActualString;
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
  
	public static void main(String[] args) throws Exception {
//		verifyInfraDetails("Sheet1");
//	    InfraDetails("SystemBestPractices");
//		verifyThePermission("verifyPermission","-rw-r--r--");
//		verifyNegFlowOfInfraDetails("SystemBestPracticesNegFlow");
//		verifyInfraDetails("sheet 1");
//		uploadListForDkJob();
//		verifyInfraDetails("pkg_Available2");
		ShellExecuter se= new ShellExecuter();
		try {
		se.executeScript("cd /usr/local/flytxt/selenium/conversion; echo 'csvFileData' >conversionJob.csv");
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		}

	
	
	
	
		public static void verifyInfraDetails(String sheet) throws Exception {
		ShellExecuter se = new ShellExecuter();
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("InfraTesting_1", sheet);
		int rows = list.numRows();
		System.out.println(rows);
		for(int i=1;i<rows;i++) {
		
		String command = (String) list.getCell(i, 0);
		String toCompare = (String) list.getCell(i, 1);
		System.out.println("String to compare is "+toCompare);
		ArrayList<String> List1 = se.executeScriptInfra(command);
		System.out.println("List is " +List1);
		boolean status = List1.contains(toCompare);
		System.out.println(status);
		list.setExcelFile("InfraTesting_1", sheet);
		if(status==true) {
			System.out.println("updated");
			list.setCell(i, 2, "PKG_Installed");
			System.out.println("updated");
		}else {
			list.setCell(i, 2, "PKG_Not Available");
		}
		}
		//System.out.println(List1);
		
	}
		public static void verifyThePermission(String sheet,String permissionType) throws Exception{
			ArrayList<String> outputList;
			ShellExecuter se=new ShellExecuter();
			ExcelHelper list = new ExcelHelper();
			list.setExcelFile("InfraTesting_1", sheet);
			int rows=list.numRows();
			System.out.println("rows :"+rows);
			for(int i=1;i<=rows;i++) {
		    String command = (String) list.getCell(i,0);
		    System.out.println("commd is :"+command);
			 outputList = se.executeScriptInfra(command);
			System.out.println("outputList is: "+outputList);
			for (String str1 : outputList) {
				try {
				System.out.println("str1:"+str1);
				String test =(String)str1.subSequence(0, 10);
			   System.out.println("output is " +test);
			if(test.equalsIgnoreCase(permissionType)||test.equalsIgnoreCase("d"+permissionType)) {
				System.out.println("updated");
				list.setCell(i, 1, "Passed");
			}
			else
				System.out.println("else");
			list.setCell(i, 1, "Failed");
				}
			catch(Exception e) {
				System.out.println("permission failed");
			}
			}
		
}
}
		
		public static void verifyNegFlowOfInfraDetails(String sheet) throws IOException {
			ShellExecuter se = new ShellExecuter();
			ExcelHelper list = new ExcelHelper();
			list.setExcelFile("InfraTesting_1", sheet);
			int rows = list.numRows();
			System.out.println(rows);
			for(int i=1;i<=rows;i++) {
			
			String command = (String) list.getCell(i, 0);
			String toCompare = (String) list.getCell(i, 1);
			System.out.println("String to compare is "+toCompare);
			ArrayList<String> List = se.executeScriptInfra(command);
			System.out.println("List is " +List);
			String str=List.toString();
			String str1=str.replaceAll("\\s","");
			System.out.println("str1 is:"+str1);
			boolean status = str1.contains(toCompare);
			System.out.println(status);
			list.setExcelFile("InfraTesting_1", sheet);
			if(status==true) {
				System.out.println("updated");
				list.setCell(i, 2, "failed");
			}else {
				list.setCell(i, 2, "passed");
			}
			}
		}

		public static void InfraDetails(String sheet) throws IOException {
			ShellExecuter se = new ShellExecuter();
			ExcelHelper eh = new ExcelHelper();
			eh.setExcelFile("InfraTesting_1", sheet);
			int rows = eh.numRows();
			System.out.println("no. of rows:"+rows);
			for(int i=1;i<=rows;i++) {
			String command = (String) eh.getCell(i, 0);
			String toCompare = ((String) eh.getCell(i, 1)).replaceAll("\\s+", "");
			System.out.println("String to compare is: "+toCompare);
			ArrayList<String> List = se.executeScriptInfra(command);
			String str1=List.toString().replaceAll("\\s+", "");
			System.out.println("list is: " +str1);
	       	boolean status = str1.contains(toCompare);
			System.out.println(status);
			eh.setExcelFile("InfraTesting_1", sheet);
			if(status==true) {
				System.out.println("updated");
				eh.setCell(i, 2, "passed");
			}else {
				eh.setCell(i, 2, "failed");
			}
			}
			//System.out.println(List1);
			
		}









}

