package com.pomclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;
import com.util.Utility;

// java design patteren Page Object Model
public class LoginPagePom extends BaseClass {
	
	public LoginPagePom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Username : Admin']")
	private WebElement username;
	
	@FindBy(xpath = "//p[text()='Password : admin123']")
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement inputUser;
	
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement inputPassword;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement homepageLink;
	
	
	public String getUsername() {
		
		String original = username.getText();
		String username = original.substring(original.indexOf('A'));
		
		return username;
	}
	
	public String getPassword() {
		String original = password.getText();
		String password = original.substring(original.lastIndexOf('a'));
		
		return password;
	}
	
	public void setUsername(String username) {
		Utility.setText(username,inputUser);
	}
	
	public void setPassword(String password) {
		Utility.setText(password,inputPassword);
	}
	
	public void login() {
		Utility.elementClick(submitButton);
	}

}
