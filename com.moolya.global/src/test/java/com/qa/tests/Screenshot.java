package com.qa.tests;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public static void capturescreenshot(WebDriver driver, String Screenshotname) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);


		FileUtils.copyFile(source, new File("./Screenshots/"+Screenshotname+".png"));

		System.out.println("Screenshot taken successfully");



	}

}
