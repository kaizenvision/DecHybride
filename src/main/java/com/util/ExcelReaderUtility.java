package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReaderUtility {
	FileInputStream inputStream ;
	public static String projectPath = System.getProperty("user.dir");
	
	public void readExel() throws FileNotFoundException {
		
		inputStream = new FileInputStream(projectPath+"\\src\\test\\resources\\testing.xlsx");
	}

}
