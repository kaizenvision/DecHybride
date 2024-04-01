package com.hybrid;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pomclasses.LoginPagePom;
import com.util.Utility;

public class LoginPageTest extends BaseClass {
	
	
	
	@BeforeTest
	public void setup() {
		//launchWebsite();
	}
	
	@AfterTest
	public void teardown() {
		//driver.close();
	}
	
	@Test
	public void testTitle() {
		
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		
		Assert.assertEquals(webTitle, "OrangeHRM");
	}
	
	@Test(groups = {"login"})
	public void adminLogin() throws IOException {
		SoftAssert assert1 = new SoftAssert();
		LoginPagePom loginPagePom =new LoginPagePom();
		String username = loginPagePom.getUsername();
		String password = loginPagePom.getPassword();
		assert1.assertEquals(username, "Admin");
		assert1.assertEquals(password, "admin123");
		loginPagePom.setUsername(username);
		loginPagePom.setPassword(password);
		loginPagePom.login();
		
		Utility.takeScreenShot("adminLogin");
		
		assert1.assertAll();
	}

}
