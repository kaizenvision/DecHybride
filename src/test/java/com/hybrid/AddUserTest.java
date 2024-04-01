package com.hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.util.ExcelReaderUtility;

public class AddUserTest {
	
	@DataProvider(name = "users")
	public Object[][] getAllUsers() throws EncryptedDocumentException, IOException {
		
		ExcelReaderUtility excelReaderUtility = new ExcelReaderUtility();
		FileInputStream fis = excelReaderUtility.readExel("testing.xlsx");
		Sheet sh = excelReaderUtility.getSheet("newuser", fis);
		return excelReaderUtility.readEntireSheet(sh);
	}
	
	@Test(dataProvider = "users")
	public void addUserTest(Map<String,Object> data) {
		System.out.println(data.get("userrole")+""+data.get("empname")+""+data.get("status")+""+
				data.get("username")+""+data.get("password")+""+data.get("confirmpassword"));
	}

}
