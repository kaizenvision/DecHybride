package com.hybrid;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Utility;

public class BaseClass {

	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");

	public static void launchWebsite() {

		driver = new ChromeDriver();

		// driver.get("https://www.google.co.in/");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		
		  Utility.setImplicitWait(30);
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		  //driver.manage().deleteAllCookies();
		  
		 
	}

}
