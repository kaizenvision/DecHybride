package com.hybrid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.pomclasses.AdminPagePom;
import com.pomclasses.LoginPagePom;
import com.util.ExtentReportUitility;
import com.util.Utility;

public class AdminPageTest extends BaseClass {
	
	@BeforeTest
	public void setup() {
		launchWebsite();
		ExtentReportUitility.initExtentReport();
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
		ExtentReportUitility.generateReport();
	}
	
	@Test(groups = {"regression"},  dependsOnGroups = {"login"})
	public void adminPageTest() throws AWTException {
		ExtentReportUitility.logger = ExtentReportUitility.createReport("adminPageTest");
		Utility.setImplicitWait(30);
		//LoginPagePom loginPagePom =new LoginPagePom();
		
		
		//AdminPagePom adminPagePom = loginPagePom.login();
		AdminPagePom adminPagePom = new AdminPagePom();
		adminPagePom.openAdminPage();
		adminPagePom.Add();
		ExtentReportUitility.logger.log(Status.FAIL, " i want to fail this testcase..");
		//Robot obj = new Robot();
		
		//obj.keyPress(KeyEvent.VK_BACK_SPACE);
		
		
		
	}

}
