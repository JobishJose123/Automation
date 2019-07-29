
package stepDefinitions;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.DataFusionEngine;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.WorkApprovalObjects;

public class Api_Level_creation extends Init {
	
	JSWaiter jswait = new JSWaiter();

	public ExcelHelper eM = new ExcelHelper();
	public ExcelHelper eh = new ExcelHelper();
	CampaignObjects campaignObjects = new CampaignObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	LoginPageObjects loginPage = new LoginPageObjects();
	CommonObjects commonObjects = new CommonObjects();
	PropHandler PropHandler=new PropHandler();
	WorkApprovalObjects approvalPageObjects = new WorkApprovalObjects();
	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	DataFusionEngine DataFusionEngineObjects = new DataFusionEngine();
	  private Statement statement = null;
	    private PreparedStatement preparedStatement = null;
	    private ResultSet resultSet = null;
	    private ResultSet resultSet2 = null;
	public WebDriverWait wait = new WebDriverWait(driver, 8);

	public Api_Level_creation() {
		PageFactory.initElements(driver, this);
	}
	

	
	@Then("^create a rule for program with API hit$")
	public void Apiautomation() throws Exception {
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
	
		 System.out.println(startdate);
		 
		 int pgmid=SQLHandler.getStringOfQuery("select PROGRAM_ID from im_program where PROGRAM_NAME='api hit program2'");
			
			
			
//			
			 String job2 ="{\"name\":\"api test2\",\"programId\":"+pgmid+",\"targetDetails\":{\"baseListType\":\"none\",\"targetType\":null,\"targetConfiguration\":null,\"registrationListObj\":{\"createdDate\":\"2019-07-05T04:48:22.000+0000\",\"updateDate\":\"2019-07-05T04:48:22.000+0000\",\"createdUser\":null,\"updatedUser\":null,\"description\":\"Description\",\"dncType\":0,\"lastFullCount\":null,\"memberCount\":1020,\"name\":\"selenium_list\",\"partnerId\":1,\"type\":{\"name\":\"Standard\"},\"listType\":\"standard\",\"sharedPartnerList\":null,\"status\":\"active\",\"partnerName\":\"System Global\",\"ostrichEntityId\":0,\"targets\":4,\"isSubmittedForDataReset\":0},\"regListId\":467},\"offerDetails\":{\"productId\":1095,\"offers\":[{\"touchpointId\":\"13\",\"offerId\":1184}],\"productObj\":{\"createdDate\":\"2019-07-17T17:15:32.000+0000\",\"updateDate\":\"2019-07-17T17:15:32.000+0000\",\"createdUser\":\"System Administrator\",\"updatedUser\":\"System Administrator\",\"productId\":1095,\"description\":\"Product with attribute\",\"name\":\"singleProd2243\",\"partnerId\":1,\"categoryName\":null,\"configuration\":\"{\\\"SelAttr_3499\\\":[\\\"181\\\"]}\",\"activated\":true,\"productJson\":null}},\"scheduleDetails\":{\"startDate\":\"2019-07-24T08:58:59.939Z\",\"endDate\":null,\"timeZone\":49,\"refreshCycle\":\"Daily\",\"refreshFrequency\":1,\"refreshTime\":\"14:35\",\"weekDays\":{\"weekDay\":[]},\"servesOn\":{\"weekDays\":{\"weekDay\":null},\"refreshFrequency\":null},\"setEndDate\":null,\"setStartDate\":\"2019-07-24T08:57:53.064Z\",\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000},\"timezoneId\":49},\"trackingDetails\":{\"timezoneObj\":{\"sortOrder\":49,\"description\":\"(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi\",\"gmtOffset\":\"+05:30\",\"javaTimeZoneId\":\"Asia/Calcutta\",\"offset\":19800000},\"timeZoneId\":49,\"trackingEnabled\":true,\"absoluteDate\":null,\"absolute\":false,\"relativeTime\":\"ad1\"},\"routingDetails\":{\"broadcastMessageRouteId\":null,\"broadcastMessageMobileAddressId\":null,\"responseMessageMobileAddressId\":1,\"responseMessageRouteId\":1},\"recommendationLimit\":-1,\"acceptanceLimit\":-1,\"recommendationTimeout\":null,\"acceptanceTimeout\":24,\"conversionTimeout\":null,\"declineTimeout\":null,\"maybelaterTimeout\":null,\"operation\":\"ACTIVATE\"}";
//			 
			 System.out.println(job2);
			
			 apiautomation.createapihit(job2);
		

	}
	
	
	@Then("^create Program with API hit with name \"([^\"]*)\"  offer cataloge \"([^\"]*)\" and touchpoint channel type \"([^\"]*)\" and touchpointname \"([^\"]*)\"$")
	public void Apiautomationprogramcreation(String programName,String offercatalog,String touchpointchannelname,String touchpointname  ) throws Exception {
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
		 String updateddate=null;
		 String createddate=null;
		 String touchpointcreateddate=null;
		 String touchpointupdateddate=null;
		 int cataid=SQLHandler.getStringOfQuery("select ID from om_catalogue where name='"+offercatalog+"'");
		 System.out.println(offercatalog);
		
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
	



