package com.pomclasses;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybrid.BaseClass;

public class GooglePagePom extends BaseClass {
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//textarea[@name='q']")
	private WebElement searchText;
	
	@FindBy(xpath = "//ul[@jsname='bw4e9b']/li")
	private List<WebElement> suggestions;
	
	public void setSerchText() {
		searchText.sendKeys("selenium");
	}
	
	public void getAllAutoSugestions() {
		System.out.println(suggestions);
	}

}
