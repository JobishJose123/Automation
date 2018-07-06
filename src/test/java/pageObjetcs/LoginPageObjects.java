package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class LoginPageObjects extends Init{
	LandingPageObjects landingPage = new LandingPageObjects();
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	JSWaiter jswait = new JSWaiter();
	
	@FindBy(xpath="//input[@type='email']")
    private WebElement emailFiled;
	@FindBy(xpath="//input[@type='password']")
    private WebElement passwordField;
	@FindBy(xpath="//*[@id='loginButton']")
    private WebElement loginButton;
	@FindBy(xpath="//paper-button[contains(.,'Forgot Password')]")
    private WebElement forgotPassword;
	@FindBy(xpath="//span[contains(.,'The system will reset your password and send the new password to the registered email ID. Do you want to continue?')]")
    private WebElement forgotPasswordConfirmation;
	@FindBy(xpath="//paper-button[contains(.,'Yes')]")
    private WebElement forgotPasswordConfirmYes;
	@FindBy(xpath="//paper-button[contains(.,'No')]")
    private WebElement forgotPasswordConfirmNo;
	@FindBy(xpath=".//div[@id='checkboxContainer']")
    private WebElement rememberCheckBox;
	@FindBy(xpath=".//paper-menu-button[@id='usermenudropdown']")
    private WebElement systemAdmField;
	@FindBy(xpath="//span[contains(.,'Logout')]")
    private WebElement logout;
	
//	@FindBy(xpath="//*[@id='loginButton']")
//    private WebElement loginButton;
//	@FindBy(xpath="//*[@id='loginButton']")
//    private WebElement loginButton;
//	@FindBy(xpath="//*[@id='loginButton']")
//    private WebElement loginButton;
//	@FindBy(xpath="//*[@id='loginButton']")
//    private WebElement loginButton;
//	@FindBy(xpath="//*[@id='loginButton']")
//    private WebElement loginButton;
	
	
	
	
	
public void enterEmail(String username) throws InterruptedException {
	jswait.loadSendKeys(emailFiled, username);
}
public void enterPassword(String password) throws InterruptedException {
	jswait.loadSendKeys(passwordField, password);
}
public void clickLoginButton() throws InterruptedException {
	jswait.loadClick(loginButton);
}
public void LogoutFromApplication() throws InterruptedException {
	jswait.loadClick(systemAdmField);
	jswait.loadClick(logout);
	Thread.sleep(2000);
}





public boolean checkLogin() throws InterruptedException {
	try{
		landingPage.navigateToPrecisionMarketer();
		return true;
	}catch(Exception e) {
		return false;
	}
}
public void login(String email,String password) throws InterruptedException {
	enterEmail(email);
	enterPassword(password);
	clickLoginButton();
}
public void loginAndClickCheckBox(String email,String password) throws InterruptedException {
	enterEmail(email);
	enterPassword(password);
	clickRememberMeCheckBox();
	Thread.sleep(2000);
	clickLoginButton();
}
public void verifyLogincredenitals(String email,String password) throws InterruptedException {
	
	String email1=emailFiled.getText();
	
	try {
		
	if(email.equals(email1));
	  System.out.println("Email id is displaying");
	
	}
	
	catch(Exception e) {
		
		e.printStackTrace();
	}
	/*  
	enterPassword(password);
	clickRememberMeCheckBox();
	Thread.sleep(2000);
	clickLoginButton();*/
}
public void clickRememberMeCheckBox() throws InterruptedException {
	jswait.loadClick(rememberCheckBox);
}

public void clickForgotPassword() throws InterruptedException {
	jswait.loadClick(forgotPassword);
}
public void clickForgotPasswordYes() throws InterruptedException {
	jswait.loadClick(forgotPasswordConfirmYes);
}
public boolean checkForgotPasswordConfirmMessage() {
	if(forgotPasswordConfirmation.isDisplayed())
		return true;
	else return false;
}
public void clickForgotPasswordNo() throws InterruptedException {
	jswait.loadClick(forgotPasswordConfirmNo);
}
public boolean checkLoginButtonClickable() throws InterruptedException{
		if(loginButton.getAttribute("style").contains("pointer-events: none;"))
		return true;
		else 
		return false;	
}
public void Typeuser(String email) throws InterruptedException {
	enterEmail(email);
}



}
