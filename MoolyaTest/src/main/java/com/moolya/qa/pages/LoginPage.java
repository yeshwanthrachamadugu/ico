package com.moolya.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.moolya.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	public LoginPage() throws FileNotFoundException {
		super();
	
	}

	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'ml_submit_btn')]")
	WebElement Signinbtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password']")
	WebElement ForgotPasswordLink;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement RegisterLink;
	
	@FindBy(xpath="//img[contains(@class,'login_logo')]")
	WebElement moolyaimage;
	
	
	//Initializing
	public void LoginPage1() throws Exception {
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	
	public boolean verifymoolyaImage() {
		
		return 	moolyaimage.isDisplayed();
	
	}
	
	public HomePage LoginToApp(String uName, String pwd) {
		
		userName.sendKeys(uName);
		password.sendKeys(pwd);
		Signinbtn.click();
		
		return new HomePage();
		
		
	}
	
	
	

}
