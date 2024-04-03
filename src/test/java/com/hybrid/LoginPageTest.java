package com.hybrid;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.pomclasses.LoginPagePom;
import com.util.ExtentReportUitility;
import com.util.Utility;


public class LoginPageTest extends BaseClass {
	
	
	
	@BeforeTest
	public void setup() {
		//launchWebsite();
		ExtentReportUitility.initExtentReport();
	}
	
	@AfterTest
	public void teardown() {
		//driver.close();
		ExtentReportUitility.generateReport();
	}
	
	@Test
	public void testTitle() {
		ExtentReportUitility.logger = ExtentReportUitility.createReport("testTitle");
		String webTitle = driver.getTitle();
		ExtentReportUitility.logger.log(Status.INFO, webTitle);
		Assert.assertEquals(webTitle, "OrangeHRM");
	}
	
	@Test(groups = {"login"})
	public void adminLogin() throws IOException {
		ExtentReportUitility.logger = ExtentReportUitility.createReport("adminLogin");
		LoginPagePom loginPagePom =new LoginPagePom();
		String username = loginPagePom.getUsername();
		String password = loginPagePom.getPassword();
		ExtentReportUitility.logger.log(Status.INFO, " Logging with username "+loginPagePom.getUsername());
		ExtentReportUitility.logger.log(Status.INFO, " Logging with password "+loginPagePom.getPassword());
		loginPagePom.setUsername(username);
		loginPagePom.setPassword(password);
		loginPagePom.login();
		
	}

}
