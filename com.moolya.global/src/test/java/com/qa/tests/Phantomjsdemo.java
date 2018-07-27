package com.qa.tests;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;



public class Phantomjsdemo {

	@Test

	public void VerifyfacebookTitle() throws Exception {

		File path= new File("R:\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path",path.getAbsolutePath());
		WebDriver driver= new PhantomJSDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		Screenshot.capturescreenshot(driver, "Yeshwanth");
		//System.out.println("Hi");



	}
}

