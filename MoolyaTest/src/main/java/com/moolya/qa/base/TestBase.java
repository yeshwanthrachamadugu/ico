package com.moolya.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.moolya.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() throws FileNotFoundException {
		prop=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("R:\\Yeshwanth_workspace\\JAVA-eclipse\\MoolyaTest\\src\\main\\java\\com\\moolya\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void initialization(){
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yeshwant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
