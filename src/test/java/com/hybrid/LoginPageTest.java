package com.hybrid;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pomclasses.LoginPagePom;

public class LoginPageTest extends BaseClass {
	
	LoginPagePom loginPagePom =new LoginPagePom();
	BaseClass baseClass = new BaseClass();
	
	@BeforeClass
	public void setup() {
		baseClass.launchWebsite();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void testTitle() {
		
		String webTitle = driver.getTitle();
		System.out.println(webTitle);
		
		Assert.assertEquals(webTitle, "OrangeHRM");
	}
	
	@Test
	public void adminLogin() {
		LoginPagePom loginPagePom =new LoginPagePom();
		String username = loginPagePom.getUsername();
		String password = loginPagePom.getPassword();
		Assert.assertEquals(username, "Admin");
		Assert.assertEquals(password, "admin123");
		loginPagePom.setUsername(username);
		loginPagePom.setPassword(password);
		loginPagePom.login();
	}

}
