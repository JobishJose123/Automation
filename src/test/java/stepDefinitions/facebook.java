package stepDefinitions;

import static org.testng.Assert.assertEquals;

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
	boolean flag=jswait.checkClickable(addFacebookaccount);
	addFacebookaccount.click();
	Exception facebook=new Exception("The account is already added");
	if(flag=true) {
		System.out.println("element is clickable");
	}else {
		System.out.println("element is not clickable");
		 throw facebook;
	}
	// Store the current window handle
	String winHandleBefore = driver.getWindowHandle();

	// Perform the click operation that opens new window

	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window
String title=driver.getTitle().toString();
System.out.println(title);

if(title.equals("Facebook")) {
	System.out.println("passed");
}else {
	System.out.println("failed");
}
	// Close the new window, if that window no more required
	driver.close();

	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);

	// Continue with original browser (first window)
		
	}
	
	
	
}