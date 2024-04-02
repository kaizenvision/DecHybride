package com.hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listner.MyListner;
import com.pomclasses.AddUserPom;
import com.util.ExcelReaderUtility;
import com.util.Utility;
@Listeners(MyListner.class)
public class AddUserTest extends BaseClass {
	
	@BeforeTest
	public void setup() {
		//launchWebsite();
	}
	
	@AfterClass
	public void teardown() {
		//driver.close();
	}
	
	@DataProvider(name = "users")
	public Object[][] getAllUsers() throws EncryptedDocumentException, IOException {
		
		ExcelReaderUtility excelReaderUtility = new ExcelReaderUtility();
		FileInputStream fis = excelReaderUtility.readExel("testing.xlsx");
		Sheet sh = excelReaderUtility.getSheet("newuser", fis);
		return excelReaderUtility.readEntireSheet(sh);
	}
	
	@Test(dataProvider = "users", dependsOnGroups = {"regression"})
	public void addUserTest(Map<String,Object> data) {
		AddUserPom addUserPom = new AddUserPom();
		Utility.getActionsclassObj().pause(Duration.ofSeconds(10)).build().perform();
		addUserPom.adminAddButton();
		Utility.getActionsclassObj().pause(Duration.ofSeconds(10)).build().perform();
		addUserPom.AdminAdduserRole(data.get("userrole").toString());
		System.out.println(data.get("userrole")+""+data.get("empname")+""+data.get("status")+""+
				data.get("username")+""+data.get("password")+""+data.get("confirmpassword"));
	}

}
