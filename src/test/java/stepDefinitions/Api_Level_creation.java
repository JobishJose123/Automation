
package stepDefinitions;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.CalenderUtility;
import baseClasses.DK;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.PropHandler;
import baseClasses.SQLHandler;
import baseClasses.apiautomation;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;


public class Api_Level_creation extends Init {
	
	JSWaiter jswait = new JSWaiter();

	public ExcelHelper eM = new ExcelHelper();
	public ExcelHelper eh = new ExcelHelper();
	
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	LoginPageObjects loginPage = new LoginPageObjects();
	CommonObjects commonObjects = new CommonObjects();

	  private Statement statement = null;
	    private PreparedStatement preparedStatement = null;
	    private ResultSet resultSet = null;
	    private ResultSet resultSet2 = null;
	public WebDriverWait wait = new WebDriverWait(driver, 8);

	public Api_Level_creation() {
		PageFactory.initElements(driver, this);
	}
	

	
	@Then("^create a rule with name \"([^\"]*)\" for program with name \"([^\"]*)\"  offer name \"([^\"]*)\" and list \"([^\"]*)\" and product name \"([^\"]*)\" and offertype \"([^\"]*)\"$")
	public void programruleapiautomation(String rulename,String programname,String offername,String list,String productname,String offertype) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
//		eh.setExcelFile("DKInput", sheet);
		 Calendar c1=Calendar.getInstance();
		 Calendar c2=Calendar.getInstance();
		    Calendar c3=Calendar.getInstance();
		 c2.add(Calendar.MINUTE, +5);
		 SimpleDateFormat df3=new SimpleDateFormat("HH:mm");
		 System.out.println(df3);
		 String refreshtime=df3.format(c2.getTime()).toString();
		 SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		 String date=df.format(c1.getTime()).toString();
		 
		 c1.add(Calendar.HOUR, -5);
		 c1.add(Calendar.MINUTE, -30);
		 
		 SimpleDateFormat df1=new SimpleDateFormat("HH:mm:ss.SSS");
		 String time=df1.format(c1.getTime()).toString();
		 
		 String startdate=date+"T"+time+"Z";
		 System.out.println("startdate"+startdate);
c1.add(Calendar.MINUTE, +2);
		 	 time=df1.format(c1.getTime()).toString();
		 	 String startdate2=date+"T"+time+"Z";
		 
		 SimpleDateFormat df5=new SimpleDateFormat("HH:mm:ss");
		 int pgmid=SQLHandler.getStringOfQuery("select PROGRAM_ID from im_program where PROGRAM_NAME='"+programname+"'");
			System.out.println(pgmid);
		 String pdtupdateddate=null;
		 String pdtcreateddate=null;
		 String pdtId=null;
		 String fieldName = null;
    	 String pdtdescription = null;
    	 String pdtconfig=null;
		 
		 String listcreateddate=null;
		 String listupdateddate=null;
		 String listid=null;
		 String listdesc=null;
		 String listmembercount=null;
		 String listdnctype=null;
		 int offerid=SQLHandler.getStringOfQuery("select id from om_offer where name='"+offername+"';");
		 System.out.println(offerid);
		
		 resultSet = SQLHandler.statement.executeQuery("select * from om_product where name='"+productname+"';");
		 
         // ResultSet is initially before the first data set
         while (resultSet.next()) {
             // It is possible to get the columns via name
             // also possible to get the columns via the column number
             // which starts at 1
             // e.g. resultSet.getSTring(2);
        	 fieldName = resultSet.getString("name");
        	  pdtdescription = resultSet.getString("description");
        	  System.out.println("pdt desc "+pdtdescription);
        	  
        	  String config=resultSet.getString("configuration");
        	  
        	  pdtconfig=config.replace("\"", "\\\"");
        	  System.out.println("this is cut string"+pdtconfig);
             pdtId = resultSet.getString("id");
             String fielddate = resultSet.getString("create_date");
             String fielddate2 = resultSet.getString("update_date");
             
             
           System.out.println("====================================================");
           
           
     
                      
           Date date1 =df5.parse((fielddate.substring(11,19)));
           System.out.println(date1);
           c3.setTime(date1);
           c3.add(Calendar.HOUR,-5);
           c3.add(Calendar.MINUTE, -30);
           String pdtcDate =(df5.format(c3.getTime())).toString();
          System.out.println("this is the c date " +pdtcDate);
          Date date2 =df5.parse((fielddate2.substring(11,19)));
          System.out.println(date2);
          c3.setTime(date2);
          c3.add(Calendar.HOUR,-5);
          c3.add(Calendar.MINUTE, -30);
          String pdtpDate =(df5.format(c3.getTime())).toString();
           
           
              pdtcreateddate=fielddate.substring(0, 10)+"T"+pdtcDate+".000+0000";
              
              pdtupdateddate=fielddate2.substring(0, 10)+"T"+pdtpDate+".000+0000";
            
         }
         String listqry="select * from registration_list where registration_list_name='"+list+"';";
         System.out.println(listqry);
         
		  resultSet = SQLHandler.statement.executeQuery(listqry);
		
      // ResultSet is initially before the first data set
      if (resultSet.next()) {
       
    	  
    	   listid=resultSet.getString("REGISTRATION_LIST_ID");
 		 listdesc=resultSet.getString("DESCRIPTION");
 		 System.out.println("pdt config "+pdtconfig);
 		 
 		 listmembercount=resultSet.getString("MEMBER_COUNT");
 		  listdnctype=resultSet.getString("DNC_TYPE");
          String fielddate3 = resultSet.getString("CREATE_DATE");
          String fielddate4 = resultSet.getString("UPDATE_DATE");
        
          Date date3 =df5.parse((fielddate3.substring(11,19)));
          System.out.println(date3);
          c3.setTime(date3);
          c3.add(Calendar.HOUR,-5);
          c3.add(Calendar.MINUTE, -30);
          String listcDate =(df5.format(c3.getTime())).toString();
         System.out.println("this is the c date " +listcDate);
        
         Date date4 =df5.parse((fielddate4.substring(11,19)));
         System.out.println(date4);
         c3.setTime(date4);
         c3.add(Calendar.HOUR,-5);
         c3.add(Calendar.MINUTE, -30);
         String listpDate =(df5.format(c3.getTime())).toString();
          
          
         listcreateddate=fielddate3.substring(0, 10)+"T"+listcDate+".000+0000";
          listupdateddate=fielddate4.substring(0, 10)+"T"+listpDate+".000+0000";
	
      }
	if(offertype.equalsIgnoreCase("STv")) {
	
//			
			 String job2 ="{\"name\":\""+rulename+"\",\"programId\":"+pgmid+",\"targetDetails\":{\"baseListType\":\"none\",\"targetType\":null,\"targetConfiguration\":null,\"registrationListObj\":{\"createdDate\":\""+listcreateddate+"\",\"updateDate\":\""+listupdateddate+"\",\"createdUser\":null,\"updatedUser\":null,\"description\":\"Description\",\"dncType\":"+listdnctype+",\"lastFullCount\":null,\"memberCount\":"+listmembercount+",\"name\":\""+list+"\",\"partnerId\":1,\"type\":{\"name\":\"Standard\"},\"listType\":\"standard\",\"sharedPartnerList\":null,\"status\":\"active\",\"partnerName\":\"System Global\",\"ostrichEntityId\":0,\"targets\":4,\"isSubmittedForDataReset\":0},\"regListId\":467},\"offerDetails\":{\"productId\":1040,\"offers\":[{\"touchpointId\":\"13\",\"offerId\":"+offerid+"}],\"productObj\":{\"createdDate\":\""+pdtcreateddate+"\",\"updateDate\":\""+pdtupdateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"productId\":"+pdtId+",\"description\":\""+pdtdescription+"\",\"name\":\""+productname+"\",\"partnerId\":1,\"categoryName\":null,\"configuration\":\""+pdtconfig+"\",\"activated\":true,\"productJson\":null}},\"scheduleDetails\":{\"startDate\":\""+startdate2+"\",\"endDate\":null,\"timeZone\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":1,\"refreshTime\":\""+refreshtime+"\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"setEndDate\":null,\"setStartDate\":\""+startdate+"\",\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000},\"timezoneId\":49},\"trackingDetails\":{\"trackingEnabled\":false,\"absolute\":\"\",\"absoluteDate\":null,\"relativeTime\":null,\"timeZoneId\":null},\"routingDetails\":{\"broadcastMessageRouteId\":null,\"broadcastMessageMobileAddressId\":null,\"responseMessageMobileAddressId\":1,\"responseMessageRouteId\":1},\"recommendationLimit\":-1,\"acceptanceLimit\":-1,\"recommendationTimeout\":null,\"acceptanceTimeout\":null,\"conversionTimeout\":null,\"declineTimeout\":null,\"maybelaterTimeout\":null,\"operation\":\"ACTIVATE\"}";
			 System.out.println(job2);
			
			 apiautomation.createprogramrule(job2);
			 
	} else if(offertype.equalsIgnoreCase("Recharge")) {
			 
String job33="{\"name\":\""+rulename+"\",\"programId\":"+pgmid+",\"targetDetails\":{\"baseListType\":\"none\",\"targetType\":null,\"targetConfiguration\":null,\"registrationListObj\":{\"createdDate\":\""+listcreateddate+"\",\"updateDate\":\""+listupdateddate+"\",\"createdUser\":null,\"updatedUser\":null,\"description\":\"Description\",\"dncType\":"+listdnctype+",\"lastFullCount\":null,\"memberCount\":"+listmembercount+",\"name\":\""+list+"\",\"partnerId\":1,\"type\":{\"name\":\"Standard\"},\"listType\":\"standard\",\"sharedPartnerList\":null,\"status\":\"active\",\"partnerName\":\"System Global\",\"ostrichEntityId\":0,\"targets\":4,\"isSubmittedForDataReset\":0},\"regListId\":467},\"offerDetails\":{\"productId\":1040,\"offers\":[{\"touchpointId\":\"13\",\"offerId\":"+offerid+"}],\"productObj\":{\"createdDate\":\""+pdtcreateddate+"\",\"updateDate\":\""+pdtupdateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"productId\":"+pdtId+",\"description\":\""+pdtdescription+"\",\"name\":\""+productname+"\",\"partnerId\":1,\"categoryName\":null,\"configuration\":\""+pdtconfig+"\",\"activated\":true,\"productJson\":null}},\"scheduleDetails\":{\"startDate\":\""+startdate2+"\",\"endDate\":null,\"timeZone\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":1,\"refreshTime\":\""+refreshtime+"\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"setEndDate\":null,\"setStartDate\":\""+startdate+"\",\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000},\"timezoneId\":49},\"trackingDetails\":{\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000},\"timeZoneId\":49,\"trackingEnabled\":true,\"absoluteDate\":null,\"absolute\":false,\"relativeTime\":\"ad1\"},\"routingDetails\":{\"broadcastMessageRouteId\":null,\"broadcastMessageMobileAddressId\":null,\"responseMessageMobileAddressId\":1,\"responseMessageRouteId\":1},\"recommendationLimit\":-1,\"acceptanceLimit\":-1,\"recommendationTimeout\":null,\"acceptanceTimeout\":24,\"conversionTimeout\":null,\"declineTimeout\":null,\"maybelaterTimeout\":null,\"operation\":\"ACTIVATE\"}";
			 
	 
			 System.out.println(job33);
			
			 apiautomation.createprogramrule(job33);
		
	}
	}
	
	
	@Then("^create Program with API hit with name \"([^\"]*)\"  offer cataloge \"([^\"]*)\" and touchpoint channel type \"([^\"]*)\" and touchpointname \"([^\"]*)\"$")
	public void Apiautomationprogramcreation(String programName,String offercatalog,String touchpointchannelname,String touchpointname  ) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
//		eh.setExcelFile("DKInput", sheet);
		 Calendar c1=Calendar.getInstance();
		 Calendar c2=Calendar.getInstance();
		 c2.add(Calendar.MINUTE, +5);
		 SimpleDateFormat df3=new SimpleDateFormat("HH:mm");
		 System.out.println(df3);
		 String refreshtime=df3.format(c2.getTime()).toString();
		 SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		 String date=df.format(c1.getTime()).toString();
		 
		 c1.add(Calendar.HOUR, -5);
		 c1.add(Calendar.MINUTE, -30);
		 
		 SimpleDateFormat df1=new SimpleDateFormat("HH:mm:ss.SSS");
		 String time=df1.format(c1.getTime()).toString();
//		 String time=df1.format(c1.getTime()).toString();
		 String startdate=date+"T"+time+"Z";
		 System.out.println("startdate"+startdate);
	
		 System.out.println(startdate);
		 String updateddate=null;
		 String createddate=null;
		 String touchpointcreateddate=null;
		 String touchpointupdateddate=null;
		 int cataid=SQLHandler.getStringOfQuery("select ID from om_catalogue where name='"+offercatalog+"'");
		 System.out.println(offercatalog);
		
		 resultSet = SQLHandler.statement.executeQuery("select * from om_catalogue where name='"+offercatalog+"';");
		 
         // ResultSet is initially before the first data set
         while (resultSet.next()) {
             // It is possible to get the columns via name
             // also possible to get the columns via the column number
             // which starts at 1
             // e.g. resultSet.getSTring(2);
        	 String fieldName = resultSet.getString("name");
             String fieldId = resultSet.getString("id");
             String fielddate = resultSet.getString("create_date");
             String fielddate2 = resultSet.getString("update_date");
              createddate=fielddate.substring(0, 10)+"T"+fielddate.substring(11,19)+".000+0000";
              updateddate=fielddate.substring(0, 10)+"T"+fielddate.substring(11,19)+".000+0000";
            
         }
             String touchpointqry="select * from im_touchpoint where NAME='"+touchpointname+"';";
             System.out.println(touchpointqry);
             
   		  resultSet = SQLHandler.statement.executeQuery(touchpointqry);
   		
          // ResultSet is initially before the first data set
          if (resultSet.next()) {
              // It is possible to get the columns via name
              // also possible to get the columns via the column number
              // which starts at 1
              // e.g. resultSet.getSTring(2);
//         	 String fieldName = resultSet.getString("name");
//              String fieldId = resultSet.getString("id");
              String fielddate3 = resultSet.getString("create_date");
              String fielddate4 = resultSet.getString("update_date");
             touchpointcreateddate=fielddate3.substring(0, 10)+"T"+fielddate3.substring(11,19)+".000+0000";
              touchpointupdateddate=fielddate4.substring(0, 10)+"T"+fielddate4.substring(11,19)+".000+0000";
	
              
          
          }
          
          System.out.print(programName+" "+offercatalog+" "+cataid+" "+createddate+" "+updateddate+" "+touchpointchannelname+" "+touchpointcreateddate+" "+touchpointname+" "+refreshtime+" "+startdate+" end of data ");
         //-----------API-------------//
         if(touchpointchannelname.equalsIgnoreCase("API")) { 		
		String jobAPI="{\"status\":null,\"basicDetails\":{\"name\":\""+programName+"\",\"description\":\"test\",\"catalogueId\":"+cataid+",\"catalog\":{\"createdDate\":\""+createddate+"\",\"updateDate\":\""+updateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+offercatalog+"\",\"partnerId\":1,\"description\":\"Selenium\",\"offerCount\":5}},\"touchpointDetails\":[{\"touchpointChannel\":\""+touchpointchannelname+"\",\"touchpointObj\":{\"createdDate\":\""+touchpointcreateddate+"\",\"updateDate\":\""+touchpointupdateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+touchpointname+"\",\"partnerId\":1,\"defaultProgramId\":null,\"defaultOffers\":{\"offerList\":[],\"routingDetails\":{\"messagingChannel\":null,\"broadcastMessageMobileAddressId\":null,\"responseMessageMobileAddressId\":null,\"broadcastMessageRouteId\":null,\"responseMessageRouteId\":null}},\"segmentationLogic\":\"RULE_BASED\",\"orderRule\":2,\"model\":null,\"intervalValue\":0,\"intervalUnit\":\"HOURS\",\"offerLimit\":5,\"minOfferLimit\":0,\"programCount\":13,\"orderRuleName\":\"FIFO\",\"eventForTracking\":\"RECOMMENDED\",\"applicationType\":\"GENERAL\",\"ussdApplicationName\":null,\"channelType\":\""+touchpointchannelname+"\"},\"touchpointId\":13,\"responseChannel\":\""+touchpointchannelname+"\",\"aliases\":\"\",\"touchpointName\":\""+touchpointname+"\"}],\"scheduleDetails\":{\"startDate\":\""+startdate+"\",\"endDate\":null,\"timezoneId\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":\"1\",\"refreshTime\":\""+refreshtime+"\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000}},\"operation\":\"ACTIVATE\"}";
		
		System.out.println("job is "+jobAPI);
		apiautomation.createapihit(jobAPI);
         }
         else if(touchpointchannelname.equalsIgnoreCase("Customer Care")) {
        	 
		
		//-------------Customer care----------------//
		
		String jobCC="{\"status\":null,\"basicDetails\":{\"name\":\""+programName+"\",\"description\":\"test\",\"catalogueId\":"+cataid+",\"catalog\":{\"createdDate\":\""+createddate+"\",\"updateDate\":\""+updateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+offercatalog+"\",\"partnerId\":1,\"description\":\"Selenium\",\"offerCount\":5}},\"touchpointDetails\":[{\"touchpointChannel\":\"CustomerCare\",\"touchpointObj\":{\"createdDate\":\""+touchpointcreateddate+"\",\"updateDate\":\""+touchpointupdateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+touchpointname+"\",\"partnerId\":1,\"defaultProgramId\":null,\"defaultOffers\":null,\"segmentationLogic\":\"RULE_BASED\",\"orderRule\":2,\"model\":null,\"intervalValue\":3,\"intervalUnit\":\"HOURS\",\"offerLimit\":5,\"minOfferLimit\":null,\"programCount\":0,\"orderRuleName\":\"FIFO\",\"acceptedTimeout\":null,\"declinedTimeout\":null,\"maybelaterTimeout\":null,\"rechargeAcceptMessage\":\"You have accepted the recharge offer $$OFFER$$\",\"rechargeDeclineMessage\":\"You have declined the recharge offer $$OFFER$$\",\"rechargeInterestedMessage\":\"You have shown interest in the recharge offer $$OFFER$$\",\"stvAcceptMessage\":\"You have accepted the STV offer $$OFFER$$\",\"stvDeclineMessage\":\"You have declined the STV offer $$OFFER$$\",\"stvInterestedMessage\":\"You have shown interest in the STV offer $$OFFER$$\",\"channelType\":\"CustomerCare\"},\"touchpointId\":8,\"responseChannel\":\"CustomerCare\",\"aliases\":\"\",\"touchpointName\":\""+touchpointname+"\"}],\"scheduleDetails\":{\"startDate\":\""+startdate+"\",\"endDate\":null,\"timezoneId\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":\"1\",\"refreshTime\":\""+refreshtime+"\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000}},\"operation\":\"ACTIVATE\"}";
		
		
		System.out.println("job is "+jobCC);
	
		apiautomation.createapihit(jobCC);
		}
         
         else if(touchpointchannelname.equalsIgnoreCase("SMS")||touchpointchannelname.equalsIgnoreCase("MMS")||touchpointchannelname.equalsIgnoreCase("VOICE_PUSH")||touchpointchannelname.equalsIgnoreCase("WAP")) {
         //------------------SMS-----------//

		String jobsms="{\"status\":null,\"basicDetails\":{\"name\":\""+programName+"\",\"description\":\"test\",\"catalogueId\":"+cataid+",\"catalog\":{\"createdDate\":\""+createddate+"\",\"updateDate\":\""+updateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+offercatalog+"\",\"partnerId\":1,\"description\":\"Selenium\",\"offerCount\":5}},\"touchpointDetails\":[{\"touchpointChannel\":\"SMS\",\"touchpointObj\":{\"createdDate\":\""+touchpointcreateddate+"\",\"updateDate\":\""+touchpointupdateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+touchpointname+"\",\"partnerId\":1,\"defaultProgramId\":null,\"defaultOffers\":null,\"segmentationLogic\":\"RULE_BASED\",\"orderRule\":2,\"model\":null,\"intervalValue\":3,\"intervalUnit\":\"HOURS\",\"offerLimit\":5,\"minOfferLimit\":null,\"programCount\":5,\"orderRuleName\":\"FIFO\",\"aliases\":\"SampleKey,1011\",\"keyword\":\"smsTP1245\",\"shortCode\":\"1011\",\"isNew\":false,\"new\":false,\"channelType\":\"SMS\"},\"touchpointId\":11,\"responseChannel\":\""+touchpointchannelname+"\",\"aliases\":\"1011\",\"touchpointName\":\"1011-smsTP1245\"}],\"scheduleDetails\":{\"startDate\":\""+startdate+"\",\"endDate\":null,\"timezoneId\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":\"1\",\"refreshTime\":\""+refreshtime+"\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000}},\"operation\":\"ACTIVATE\"}";
		
		System.out.println("job is "+jobsms);
		
		apiautomation.createapihit(jobsms);
		}
         
         else {
      //--------USSD---------//
         String jobUSSD="{\"status\":null,\"basicDetails\":{\"name\":\""+programName+"\",\"description\":\"test\",\"catalogueId\":"+cataid+",\"catalog\":{\"createdDate\":\""+createddate+"\",\"updateDate\":\""+updateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+offercatalog+"\",\"partnerId\":1,\"description\":\"Selenium\",\"offerCount\":5}},\"touchpointDetails\":[{\"touchpointChannel\":\"USSD\",\"touchpointObj\":{\"createdDate\":\""+touchpointcreateddate+"\",\"updateDate\":\""+touchpointupdateddate+"\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"name\":\""+touchpointname+"\",\"partnerId\":1,\"defaultProgramId\":null,\"defaultOffers\":{\"offerList\":[],\"routingDetails\":{\"messagingChannel\":null,\"broadcastMessageMobileAddressId\":null,\"responseMessageMobileAddressId\":null,\"broadcastMessageRouteId\":null,\"responseMessageRouteId\":null}},\"segmentationLogic\":\"RULE_BASED\",\"orderRule\":2,\"model\":null,\"intervalValue\":3,\"intervalUnit\":\"HOURS\",\"offerLimit\":5,\"minOfferLimit\":0,\"programCount\":3,\"orderRuleName\":\"FIFO\",\"ussdApplicationName\":\""+touchpointchannelname+"\",\"channelType\":\"USSD\"},\"touchpointId\":26,\"responseChannel\":\"USSD\",\"aliases\":\"\",\"touchpointName\":\""+touchpointname+"\"}],\"scheduleDetails\":{\"startDate\":\""+startdate+"\",\"endDate\":null,\"timezoneId\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":\"1\",\"refreshTime\":\""+refreshtime+"\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000}},\"operation\":\"ACTIVATE\"}";
         
         System.out.println("job is "+jobUSSD);
 		
 		apiautomation.createapihit(jobUSSD);
         }
         
         
		
         }
	//---------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	@Then("^create productclass with API hit with name \"([^\"]*)\"  description \"([^\"]*)\"$")
	public void Apiautomationproductclasscreation(String productclassName,String desc) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();

         String job="{\"name\":\""+productclassName+"\",\"description\":\""+desc+"\",\"status\":25}";
         
         System.out.println("job is "+job);
 		
 		apiautomation.createproductclass(job);
         
         
		
         }
	
	@Then("^create Customer care touchpoint with default offer name \"([^\"]*)\"  intervalUnit \"([^\"]*)\" intervalvalue \"([^\"]*)\" minofferlimit \"([^\"]*)\" maxofferlimit \"([^\"]*)\" orderrule \"([^\"]*)\" and defaultoffer \"([^\"]*)\"$")
	public void CCtouchpointcreation(String name,String intervalUnit,String intervalvalue,String minofferlimit,String maxofferlimit,String orderRule,String defaultoffer) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
		int orderidnum;
		String segmentationLogic=null;
		 int offerid=SQLHandler.getStringOfQuery("select id from om_offer where name='"+defaultoffer+"';");
		 System.out.println(offerid);
		 if(orderRule.equalsIgnoreCase("LIFO")) { 
	orderidnum=1;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("FIFO")) {
	orderidnum=2;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("BEST FIT ALGORITHM")) {
	orderidnum=3;
	segmentationLogic="MACHINE_LEARNED";
}else {orderidnum=4;}
		 
		 
		 
         String job="{\"intervalUnit\":\""+intervalUnit+"\",\"intervalValue\":\""+intervalvalue+"\",\"name\":\""+name+"\",\"minOfferLimit\":"+minofferlimit+",\"offerLimit\":\""+maxofferlimit+"\",\"orderRule\":"+orderidnum+",\"segmentationLogic\":\""+segmentationLogic+"\",\"rechargeAcceptMessage\":\"You have accepted the recharge offer $$OFFER$$\",\"rechargeDeclineMessage\":\"You have declined the recharge offer $$OFFER$$\",\"rechargeInterestedMessage\":\"You have shown interest in the recharge offer $$OFFER$$\",\"stvAcceptMessage\":\"You have accepted the STV offer $$OFFER$$\",\"stvDeclineMessage\":\"You have declined the STV offer $$OFFER$$\",\"stvInterestedMessage\":\"You have shown interest in the STV offer $$OFFER$$\",\"defaultProgramId\":null,\"defaultOffers\":{\"offerList\":[{\"offerId\":"+offerid+",\"trackingDetails\":{\"trackingEnabled\":true,\"absolute\":false,\"absoluteDate\":null,\"relativeTime\":\"ad1\",\"timeZoneId\":49}}],\"routingDetails\":{\"responseMessageMobileAddressId\":1,\"responseMessageRouteId\":1}}}";
         
         System.out.println("job is "+job);
 		
 		apiautomation.createCCtouchpoints(job);
         
         
		
         }
	
	//------------------------------------------------------------//
	
	@Then("^create Customer care touchpoint with hit with name \"([^\"]*)\"  intervalUnit \"([^\"]*)\" intervalvalue \"([^\"]*)\" maxofferlimit \"([^\"]*)\" orderrule \"([^\"]*)\"$")
	public void CCtouchpointcreationwithoutoffer(String name,String intervalUnit,String intervalvalue,String maxofferlimit,String orderRule) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
		int orderidnum;
		String segmentationLogic=null;
		
		if(orderRule.equalsIgnoreCase("LIFO")) { 
	orderidnum=1;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("FIFO")) {
	orderidnum=2;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("BEST FIT ALGORITHM")) {
	orderidnum=3;
	segmentationLogic="MACHINE_LEARNED";
}else {orderidnum=4;}
		 
		 
		 
         String job="{\"intervalUnit\":\""+intervalUnit+"\",\"intervalValue\":\""+intervalvalue+"\",\"name\":\""+name+"\",\"minOfferLimit\":0,\"offerLimit\":\""+maxofferlimit+"\",\"orderRule\":"+orderidnum+",\"segmentationLogic\":\""+segmentationLogic+"\",\"rechargeAcceptMessage\":\"You have accepted the recharge offer $$OFFER$$\",\"rechargeDeclineMessage\":\"You have declined the recharge offer $$OFFER$$\",\"rechargeInterestedMessage\":\"You have shown interest in the recharge offer $$OFFER$$\",\"stvAcceptMessage\":\"You have accepted the STV offer $$OFFER$$\",\"stvDeclineMessage\":\"You have declined the STV offer $$OFFER$$\",\"stvInterestedMessage\":\"You have shown interest in the STV offer $$OFFER$$\",\"defaultProgramId\":null,\"defaultOffers\":{\"offerList\":[],\"routingDetails\":{\"responseMessageMobileAddressId\":\"\",\"responseMessageRouteId\":\"\"}}}";
         
         System.out.println("job is "+job);
 		
 		apiautomation.createCCtouchpoints(job);
         
         
		
         }
	//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	@Then("^create sms touchpoint with hit with shortcode \"([^\"]*)\"  intervalUnit \"([^\"]*)\" intervalvalue \"([^\"]*)\" maxofferlimit \"([^\"]*)\" orderrule \"([^\"]*)\" Keyword \"([^\"]*)\"$")
	public void sstouchpointcreationwithoutoffer(String shortcode,String intervalUnit,String intervalvalue,String maxofferlimit,String orderRule,String keyword) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
		int orderidnum;
		String segmentationLogic=null;
		
		if(orderRule.equalsIgnoreCase("LIFO")) { 
	orderidnum=1;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("FIFO")) {
	orderidnum=2;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("BEST FIT ALGORITHM")) {
	orderidnum=3;
	segmentationLogic="MACHINE_LEARNED";
}else {orderidnum=4;}
		 
		
		String env="https://"+p.getValue("env")+"/neon-ws/mobileAddresses/1";
		String name=shortcode+"-"+keyword;
		 
		 
         String job="{\"intervalUnit\":\""+intervalUnit+"\",\"intervalValue\":\""+intervalvalue+"\",\"name\":\""+name+"\",\"minOfferLimit\":0,\"offerLimit\":\""+maxofferlimit+"\",\"orderRule\":"+orderidnum+",\"segmentationLogic\":\""+segmentationLogic+"\",\"keyword\":\""+keyword+"\",\"shortCode\":\""+shortcode+"\",\"mobileAddresses\":null,\"defaultProgramId\":null,\"channelType\":\"SMS\",\"defaultOffers\":{\"offerList\":[],\"routingDetails\":{\"responseMessageMobileAddressId\":\"\",\"responseMessageRouteId\":\"\"}},\"mobileAddress\":\""+env+"\"}";
         
         System.out.println("job is "+job);
 		
 		apiautomation.createsmstouchpoints(job);
        
		
         }
	//=========================================================================================================================================================================//
	
	
	@Then("^create Api touchpoint with hit with name \"([^\"]*)\"  intervalUnit \"([^\"]*)\" intervalvalue \"([^\"]*)\" maxofferlimit \"([^\"]*)\" orderrule \"([^\"]*)\" applicationType \"([^\"]*)\" eventForTracking \"([^\"]*)\"$")
	public void APItouchpointcreationwithoutoffer(String name,String intervalUnit,String intervalvalue,String maxofferlimit,String orderRule,String apptype,String tracking) throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
		int orderidnum;
		String segmentationLogic=null;
		
		if(orderRule.equalsIgnoreCase("LIFO")) { 
	orderidnum=1;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("FIFO")) {
	orderidnum=2;
	segmentationLogic="RULE_BASED";
}else if(orderRule.equalsIgnoreCase("BEST FIT ALGORITHM")) {
	orderidnum=3;
	segmentationLogic="MACHINE_LEARNED";
}else {orderidnum=4;}
		 
		

		 
		 
         String job="{\"intervalUnit\":\""+intervalUnit+"\",\"intervalValue\":\""+intervalvalue+"\",\"name\":\""+name+"\",\"minOfferLimit\":0,\"offerLimit\":\""+maxofferlimit+"\",\"orderRule\":"+orderidnum+",\"segmentationLogic\":\""+segmentationLogic+"\",\"applicationType\":\""+apptype+"\",\"ussdApplication\":null,\"eventForTracking\":\""+tracking+"\",\"defaultProgramId\":null,\"defaultOffers\":{\"offerList\":[],\"routingDetails\":{\"responseMessageMobileAddressId\":\"\",\"responseMessageRouteId\":\"\"}}}";
         
         System.out.println("job is "+job);
 		
 		apiautomation.createAPItouchpoints(job);
        
		
         }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------------------------------------------------------------------------------------------------------------//
	
	@Then("^test run$")
	public void testrun() throws Exception {
		SQLHandler SQLHandler=new SQLHandler();
		apiautomation apiautomation=new apiautomation();
//		eh.setExcelFile("DKInput", sheet);
		 Calendar c1=Calendar.getInstance();
		 SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		 String date=df.format(c1.getTime()).toString();
		 
		 c1.add(Calendar.MINUTE, 5);
		 SimpleDateFormat df1=new SimpleDateFormat("HH:mm:ss.SSS");
		 String time=df1.format(c1.getTime()).toString();
		 String startdate=date+"T"+time+"Z";
		 SimpleDateFormat df3=new SimpleDateFormat("HH:mm");
		 System.out.println(df3);
		 String refreshtime=df3.format(c1.getTime()).toString();
		 System.out.println(startdate);
		 
		 
		
		  resultSet = SQLHandler.statement.executeQuery("select * from om_catalogue where name='SeleniumCatalog3735';");
		  
         // ResultSet is initially before the first data set
         while (resultSet.next()) {
             // It is possible to get the columns via name
             // also possible to get the columns via the column number
             // which starts at 1
             // e.g. resultSet.getSTring(2);
             String fieldName = resultSet.getString("name");
             String fieldId = resultSet.getString("id");
             String fielddate = resultSet.getString("create_date");
             String fielddate2 = resultSet.getString("update_date");
             String createddate=fielddate.substring(0, 10)+"T"+fielddate.substring(11,19)+".000+0000";
             String updateddate=fielddate.substring(0, 10)+"T"+fielddate.substring(11,19)+".000+0000";
             System.out.println(fieldName);
             System.out.println(fieldId);
             System.out.println(fielddate);
             System.out.println(createddate);
             System.out.println(updateddate);
             
             
         }

	}
	
	
}
	



