package com.moolya.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.moolya.qa.base.TestBase;
import com.moolya.qa.pages.HomePage;
import com.moolya.qa.pages.LoginPage;

public class LoginToApplicationTest extends TestBase{
	public LoginPage page;
	HomePage Homepage;
	
	public LoginToApplicationTest() throws FileNotFoundException {
		super();
	}

	@BeforeTest
	public void setUp() throws Exception {
		initialization();
	  page=new LoginPage();
	
	}
	@Test
	public void ImagedisplayonLogin() {
		boolean b=page.verifymoolyaImage();
		Assert.assertTrue(b);
		
	}
	
	
	@Test(enabled=false)
	public void MoolyaLogin() {
	Homepage=page.LoginToApp(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	
	@AfterTest
	public void tearDown() {
		
	driver.quit();
	}

}
