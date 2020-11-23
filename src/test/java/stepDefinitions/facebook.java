package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.LandingPageObjects;
import pageObjetcs.facebookpageobjects;

public class facebook extends Init{
	JSWaiter jswait = new JSWaiter();
	LandingPageObjects landingPage = new LandingPageObjects();
	
	facebookpageobjects facebookpageobjects=new facebookpageobjects();
	public facebook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//paper-button[contains(.,'Add Facebook Account')]")
	private WebElement addFacebookaccount;
	
	@Then("^click facebook option$")
	public void clickfacebookOption() throws InterruptedException {
		facebookpageobjects.clickfacebookOption();
	}
	
	
	@Then("^click add facebook account option$")
	public void addFacebookaccount() throws InterruptedException {
		facebookpageobjects.addFacebookaccount();
		
	}
	
	@Then("^verify add facebook account option$")
	public void verifyaddFacebookaccount() throws Exception {
		boolean flag=false;
		String currenturl=driver.getCurrentUrl();
		currenturl=currenturl.replaceFirst("http", "https");
		driver.get(currenturl);
		Thread.sleep(10000);
	flag=jswait.checkClickable(addFacebookaccount);
	Exception facebook=new Exception("The account is already added");
     if(flag==true) {
		addFacebookaccount.click();
		System.out.println("element is clickable");
	}else {
		System.out.println("element is not clickable");
		 throw facebook;
	}
     
 
	String winHandleBefore = driver.getWindowHandle();
       System.out.println(winHandleBefore);
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	    System.out.println(winHandle);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       String title=driver.getTitle().toString();
       System.out.println(title);

if(title.equals("Facebook")) {
	System.out.println("passed");
	driver.close();

}else {
	System.out.println("failed");
}

	}
	driver.switchTo().window(winHandleBefore);
		
	}
	
	
	
}