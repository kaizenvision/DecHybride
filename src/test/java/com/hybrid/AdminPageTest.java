package com.hybrid;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pomclasses.AdminPagePom;
import com.pomclasses.LoginPagePom;
import com.util.Utility;

public class AdminPageTest extends BaseClass {
	
	@BeforeTest
	public void setup() {
		launchWebsite();
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@Test(groups = {"regression"},  dependsOnGroups = {"login"})
	public void adminPageTest() throws AWTException {
		Utility.setImplicitWait(30);
		//LoginPagePom loginPagePom =new LoginPagePom();
		
		
		//AdminPagePom adminPagePom = loginPagePom.login();
		AdminPagePom adminPagePom = new AdminPagePom();
		adminPagePom.openAdminPage();
		adminPagePom.Add();
		
		//Robot obj = new Robot();
		
		//obj.keyPress(KeyEvent.VK_BACK_SPACE);
		
		
		
	}

}
