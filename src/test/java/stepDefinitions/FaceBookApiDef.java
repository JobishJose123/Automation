package stepDefinitions;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.itextpdf.text.log.SysoCounter;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.FaceBookAPIobj;
import pageObjetcs.RegistrationListPage;

public class FaceBookApiDef extends Init {
	
	 ExcelHelper excel = new ExcelHelper();
	 ExcelHelper ex;
	 
	FaceBookAPIobj facebookPageObject=new FaceBookAPIobj();
	private JSWaiter jswait = new JSWaiter();
	
	
	
	
	
	
	@Then("^input Deliver Tab with end \"([^\"]*)\" renderTime \"([^\"]*)\" Broadcast expiry \"([^\"]*)\" from Bc in sheet\"([^\"]*)\"$")
	public void input_Deliver_Tab_with_end_renderTime_Broadcast_expiry_from_Bc_in_sheet(String endType, String renderTime, String expiry, String bcSheet) throws Throwable {
		
		
		excel.setExcelFile("bcInputData", bcSheet);
		String bc_type = (String) excel.getCell(1, 7);
		
		if(bc_type.equalsIgnoreCase("one-off"))
				{
			System.out.println("Inside====+++++++++ One-offBc+++++++==========");
			facebookPageObject.inputDeliveryTabForOneTimeBC(bc_type, bcSheet);
				}
		else if(bc_type.equalsIgnoreCase("recurring"))
		{
			System.out.println("Inside Recurring B_C");
			
			facebookPageObject.inputDeliveryTabforRecurringBC(endType, renderTime, expiry, bcSheet);
			
		}
		
		
		
	   
	}
	
	
	//saving BC name in newly created Work book 
	
	
	
	@Then("^Add Bc from Sheet \"([^\"]*)\" to column \"([^\"]*)\" of BC List Storage Sheet \"([^\"]*)\"$")
	public void add_Bc_from_Sheet_to_column_of_BC_List_Storage_Sheet(String bcSheet, String row, String bcStorageSheet) throws Throwable {
	   
		ex=new ExcelHelper();
		 int row1=Integer.parseInt(row);
		  System.out.println("String row "+row);
		  System.out.println("Integer row "+(row1+4));
			excel.setExcelFile("bcInputData", bcSheet);
			 String bcName=excel.getCellByColumnName("BC Name");
	         System.out.println("=========="+bcName+"=============");
	         String bcType=(String)excel.getCell(1, 7);
	         System.out.println("=========="+bcType+"=============");
	         
	         ex.setExcelFile("facebookAPI", bcStorageSheet);
	         
	         System.out.println("Heading  "+ex.getCell(0,0));
	         System.out.println("now "+ex.getCell(0,1));
	         
	         ex.setCell(row1,0, bcName);
	         ex.setCell(row1,1, bcType);
	        
	   	    
			 
	}
	
	
	
	
	
	
	
	@Then("^Enter details of Custom Event$")
	public void enter_details_of_Custom_Event() throws Throwable {
		RegistrationListPage registrationListPage = new RegistrationListPage();
		Thread.sleep(3000);
		registrationListPage.enterCustomerDrivenEventDetails("sel_Custom_Event", "Selenium_FB_API");	
	}
	
	
	@Then("^save FaceBook Custom Event$")
	public void save_FaceBook_Custom_Event() throws Throwable {
		RegistrationListPage registrationListPage = new RegistrationListPage();
		CommonObjects commonObjects = new CommonObjects();
		Thread.sleep(4000);
		registrationListPage.clickSaveButton();
		Thread.sleep(3000);
		commonObjects.verifyInGrid("sel_Custom_Event");
		
	   
	}
	
	
	@Then("^click on custom event Name \"([^\"]*)\"$")
	public void click_on_custom_event_Name(String customEvent_Name) throws Throwable {
		Thread.sleep(2000);
		facebookPageObject.click_On_CustomEventName(customEvent_Name);
	   
	}

	@Then("^click on Create new Domain Field$")
	public void click_on_Create_new_Domain_Field() throws Throwable {
	   facebookPageObject.clickCreateNewDomField();
	}
	
	
	@Then("^create value with label \"([^\"]*)\"$")
	public void create_value_with_label(String labelName) throws Throwable {
		
		facebookPageObject.create_Value_Custom_event(labelName);
		
	   
	}
	
	
	
	
	@Then("^navigate to Digital Plus$")
	public void navigate_to_Digital_Plus() throws Throwable {
		
		jswait.loadClick("//iron-image[@id='digital-plus']");
	    
	}
	
	@Then("^navigate to Facebook$")
	public void navigate_to_Facebook() throws Throwable {
	    jswait.loadClick("//iron-icon[@id='sym2']");
	}
	
	@Then("^navigate to Sync Events$")
	public void navigate_to_Sync_Events() throws Throwable {
	    jswait.loadClick("//iron-icon[@id='sym2']");
	}
	
	
	@Then("^select Customer list \"([^\"]*)\" from drop down$")
	public void select_Customer_list_from_drop_down(String customerListName) throws Throwable {
		
		boolean pencilBtn;
		String ListName;
		
		Thread.sleep(1000);
		pencilBtn=jswait.checkClickable("//paper-icon-button[@id='edit-btn']");
		
		System.out.println("Status :"+pencilBtn);
		
		
		
		if(pencilBtn==false)
		{
		System.out.println("No Consented Customer List is Present ");
		facebookPageObject.select_CustomerList(customerListName);
		
		}
		
		else 
		{
			System.out.println("Checking Name of Consented Customer List: ");
			WebElement listName=driver.findElement(By.xpath("//div[@class='layout horizontal center style-scope fb-reg-list']//span[@id='regName']"));
			
			System.out.println("List Name : "+listName.getText());
			
			ListName=listName.getText();
			
			if(!(customerListName.equalsIgnoreCase(ListName)))
			{
               System.out.println("Changing Customer List_");
				Thread.sleep(1000);
				jswait.loadClick("//paper-icon-button[@id='edit-btn']");
				Thread.sleep(2000);
				jswait.loadClick("//paper-icon-button[@id='clearIcon']//iron-icon[@id='icon']");
				Thread.sleep(3000);
				jswait.loadClick("(//paper-icon-button[@id='toggleIcon']//iron-icon[@id='icon'])[1]");
				Thread.sleep(6000);
				
				
				jswait.loadSendKeys("//div[@id='labelAndInputContainer']//label[text()='Base Lists']/../input[@is='iron-input']", customerListName);
				jswait.loadClick("//vaadin-combo-box-item[@class='style-scope vaadin-combo-box-overlay' and contains(.,'"+customerListName+"')]");
				Thread.sleep(2000);
				jswait.loadClick("//paper-button[text()='Save']");
				
				
			}
			else 
				System.out.println("List Name is Same as Selenium_list No need To change");
				
		}
	    
	}
	
	
	
	@Then("^click on Add FaceBook Event$")
	public void click_on_Add_FaceBook_Event() throws Throwable {
	   jswait.loadClick("//paper-button[contains(.,'Add Facebook Event')]");
	   Thread.sleep(2000);
	}
	
	
	
	
	
	@Then("^select FaceBook Event \"([^\"]*)\" and config Event Details$")
	public void select_FaceBook_Event_and_config_Event_Details(String eventName) throws Throwable {
		
	
		facebookPageObject.configEventDetailsTab(eventName);
	    
	}
	
	
	@Then("^Map NEON-dX Events with \"([^\"]*)\" Custom Event$")
	public void map_NEON_dX_Events_with_Custom_Event(String customEventName) throws Throwable {
		
		facebookPageObject.configMapNeonDX_TAb(customEventName);
	    
	}
	
	
	
	//Step Def for adding relevant event Sel_custom_event so that only it will be displayed in Sync events
	
	
	
	@Then("^select \"([^\"]*)\" event fromRelevant Events$")
	public void select_event_fromRelevant_Events(String customEventName) throws Throwable {
		
		facebookPageObject.selectCustomEventIn_relevantOpt(customEventName);
	   
	}

	
	
	
	@Then("^edit event \"([^\"]*)\" to \"([^\"]*)\"$")
	public void edit_event_to(String fromEventName, String toEventName) throws Throwable {
		Thread.sleep(2000);
		try
		{
			
		
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+fromEventName+"')]/../div//iron-icon[@id='icon']");
		Thread.sleep(1000);
		}
		catch (Exception e) {
			Assert.assertTrue(false);
			System.out.println("Unable to Edit FaceBook Event TestCase Failed");

			e.printStackTrace();
		}
		
		try
		{
			
		
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+fromEventName+"')]/../div//iron-icon[@icon='create']");
	    Thread.sleep(7000);
		}
		catch (Exception e) {
			Assert.assertTrue(false);
			System.out.println("Unable to Edit FaceBook Event TestCase Failed");
		}
	    jswait.loadClick("(//paper-icon-button[@id='clearIcon']//iron-icon[@id='icon'])[1]");
	    Thread.sleep(2000);
	    facebookPageObject.click_onDropDown();
		Thread.sleep(2000);
		facebookPageObject.selectFaceBookEvent(toEventName);
		Thread.sleep(1000);
		 facebookPageObject.removeEventAttributes();
		
		 
		 Thread.sleep(2000);
		 facebookPageObject.clickOnPlusOfEventAttribute();
			Thread.sleep(2000);
			facebookPageObject.selectValueAtrribute("Value");
			 Thread.sleep(2000);
			 jswait.loadClick("//paper-button[text()='Proceed']");
			 Thread.sleep(2000);
			 
			 facebookPageObject.select_ValueField();
			  facebookPageObject.select_ActionSource();
				Thread.sleep(2000);
				jswait.loadClick("(//paper-button[text()='Save'])[3]");
				System.out.println("<<<<<<<<Editing FaceBook Event TestCase Has Passed>>>>>>>> ");
		 
	    
	}
	
	
	
	
	
	@Then("^verify presence of \"([^\"]*)\" Event$")
	public void verify_presence_of_Event(String eventName) throws Throwable {
		Thread.sleep(2000);
		WebElement EventName;
		String st;
			
		try
		{
			
		
		EventName=driver.findElement(By.xpath("//div[@id='fb-event-header']//h2[text()='"+eventName+"']"));
		}
		catch (Exception e) {
			System.out.println("++++TestCase For FaceBook Event Edit has Failed++++++");
		}
	

		

		EventName=driver.findElement(By.xpath("//div[@id='fb-event-header']//h2[text()='"+eventName+"']"));
	
		Assert.assertTrue(jswait.checkVisibility(EventName));
	
	
		
	   
	}
	
	
	@Then("^delete \"([^\"]*)\" FaceBook Event$")
	public void delete_FaceBook_Event(String EventName) throws Throwable {
		
		 WebElement event;
		 boolean status;
		
		try
		{
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+EventName+"')]/../div//iron-icon[@id='icon']");
		}
		catch (Exception e) {
		    System.out.println(EventName+"Doesnt exist ");
		}
		
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+EventName+"')]/../div//iron-icon[@icon='icons:delete']");
		Thread.sleep(2000);
		jswait.loadClick("//paper-button[text()='Yes']");
		Thread.sleep(2000);
		
		try
		{
		event=driver.findElement(By.xpath("//div[@id='fb-event-header']//h2[text()='"+EventName+"']"));
		status=jswait.checkVisibility(event);
		if(status==true)
		{
		System.out.println(">>>>>>>>>Deleting Event TestCase Has failed+++++++++++");
		Assert.assertTrue(false);
		}
		}
		catch (Exception e) {
			System.out.println(">>>>>>>>>Deleting Event TesTCase Has Passed <<<<<<<<<");
			Assert.assertTrue(true);
		}		
	}
	
	@Then("^deactivate Event \"([^\"]*)\" and Verify$")
	public void deactivate_Event_and_Verify(String eventName) throws Throwable {
		String buttonText="";
		WebElement buttonEle=null;
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//iron-icon[@id='icon']");
		//deactivating
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//iron-icon[@icon='icons:block']");
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//iron-icon[@id='icon']");
		Thread.sleep(1000);
		try
		{
		 buttonEle=driver.findElement(By.xpath("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//paper-item[contains(.,'Activate')]"));
		 buttonText=buttonEle.getText();
		}
		catch (Exception e) {
			System.out.println("TestCase Failed !!!!! ");
			System.out.println("Un-able To Deactivate FaceBook Event ");
			Assert.assertTrue(false);
		}
		
		System.out.println("Button ==> "+buttonText);
		
	   
	}

	@Then("^Re-Activate Event \"([^\"]*)\" and Verify$")
	public void re_Activate_Event_and_Verify(String eventName) throws Throwable {
		String buttonText="";
		WebElement buttonEle=null;
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//iron-icon[@id='icon']");
		//Activating
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//iron-icon[@icon='icons:power-settings-new']");
		Thread.sleep(2000);
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//iron-icon[@id='icon']");
		
		Thread.sleep(1000);
		
		try
		{
		 buttonEle=driver.findElement(By.xpath("//div[@id='fb-event-header']//h2[contains(.,'"+eventName+"')]/../div//paper-item[contains(.,'Deactivate')]"));
		 buttonText=buttonEle.getText();
		}
		catch (Exception e) {
			System.out.println("TestCase Failed !!!!! ");
			System.out.println("Un-able To Re-Activate FaceBook Event ");
			Assert.assertTrue(false);
		}
		
		System.out.println("Button ==> "+buttonText);
	    
	}

	
	
	
	
	@Then("^verify Display of Mandatory attributes$")
	public void verify_Display_of_Mandatory_attributes() throws Throwable {
		
		List<String>namesToCheck=new ArrayList<String>();
		
		namesToCheck.add("Add payment info");
		namesToCheck.add("Add to cart");
		namesToCheck.add("Add to wishlist");
		
		
		
		List<String>namesOfAtbts=new ArrayList<String>();
		Thread.sleep(2000);
               facebookPageObject.click_onDropDown();
               Thread.sleep(2000);
               //Steps to verify Mandatory attributes present Or not
               
                namesOfAtbts=facebookPageObject.save_AttributesToList();
               
               int  flag=0;
               int j=0;
               
				for (int i = 0; i < namesToCheck.size(); i++) {
					for (j = 0; j < namesOfAtbts.size(); j++) {
						
						if (namesToCheck.get(i).equalsIgnoreCase(namesOfAtbts.get(j))) {
						
							//System.out.println("Passed "+namesOfAtbts.get(j)+" is present ");
							break;
						}
						else
						{
							if(j==(namesOfAtbts.size())-1)
							{
								flag=1;
								System.out.println("Test Case Failed !!!!!!!! ");
								System.out.println(namesToCheck.get(i)+" Is Not Present ");
							}
						}
						//Inside Of Inner For loop
					}

					j = 0;
					//inside  of Inner ForLoop
				}
               
               
               System.out.println("Flag=> "+flag);
               if(flag==1)
            	   Assert.assertTrue(false);
               
               
               
	}
	
	
	//Step definitions of FaceBook Bc edit and Activation 
	
	@Then("^Filter the Bc from sheet \"([^\"]*)\" from row \"([^\"]*)\" and column \"([^\"]*)\" and write in sheet \"([^\"]*)\"$")
	public void filter_the_Bc_from_sheet_from_row_and_column_and_write_in_sheet(String bcStorageSheet, String row, String column, String bcSheet) throws Throwable {
		
		ex=new ExcelHelper();
		int row1=Integer.parseInt(row);
		int colmn=Integer.parseInt(column);
		
		excel.setExcelFile("facebookAPI", bcStorageSheet);
		String bcName =(String) excel.getCell(row1, colmn);
		ex.setExcelFile("bcInputData", bcSheet);
		ex.setCell("BC Name", bcName);
	    
	}
	
	
		

}
