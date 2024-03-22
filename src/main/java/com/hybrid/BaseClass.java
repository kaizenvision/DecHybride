package com.hybrid;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Utility;

public class BaseClass {
	
	public static WebDriver driver;
	
	
	public void launchWebsite() {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Utility.setImplicitWait(10);
		
	}

}
