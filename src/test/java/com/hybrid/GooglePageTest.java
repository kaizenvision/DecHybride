package com.hybrid;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pomclasses.GooglePagePom;
import com.pomclasses.LoginPagePom;
import com.util.Utility;

public class GooglePageTest extends BaseClass {
	
	@BeforeClass
	public void setup() {
		super.launchWebsite();
	}
	
	@Test
	public void autosuggestionsTest() {
		
		GooglePagePom googlePagePom = new GooglePagePom();
		
		googlePagePom.setSerchText();
		Utility.setImplicitWait(10);
		googlePagePom.getAllAutoSugestions();
		
	}
	
	

}
