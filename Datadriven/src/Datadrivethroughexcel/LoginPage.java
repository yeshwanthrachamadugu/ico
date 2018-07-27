package Datadrivethroughexcel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static  void Login() throws IOException{
		WebDriver driver;
		//Using Properties and FileInputStream Classes
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("R:\\Yeshwanth_workspace\\JAVA-eclipse\\Datadriven\\src\\file.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
		System.out.println(prop.getProperty("URL"));
		
		if(prop.getProperty("browser").equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yeshwant\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		}else {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\Yeshwant\\Downloads\\Chromedriver.exe");
		driver=new FirefoxDriver();
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}

}
