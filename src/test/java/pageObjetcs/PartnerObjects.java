package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.JSWaiter;


public class PartnerObjects extends Init {
	JSWaiter  jswait =new JSWaiter();

	public PartnerObjects()

	{
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath ="//a[@href='#/platform-setting/admin/partner']")
				
	private WebElement partners;
			
	public void clickonpartners() throws Exception
	 {  
		System.out.println("test");
	 jswait.loadClick(partners);
		 
	 }
}
