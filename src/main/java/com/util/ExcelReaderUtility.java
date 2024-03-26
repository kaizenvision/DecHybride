package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderUtility {
	FileInputStream inputStream ;
	public static String projectPath = System.getProperty("user.dir");
	
	public FileInputStream readExel(String fileName) throws FileNotFoundException {
		
		return inputStream = new FileInputStream(projectPath+"\\src\\test\\resources\\"+fileName);
	}
	
	public Sheet getSheet(String sheetName,FileInputStream fis) throws EncryptedDocumentException, IOException {
		
		return WorkbookFactory.create(fis).getSheet(sheetName);
	}
	
	public Object readSingleCell(Sheet sh, int rowNum, int colNum) {
		
		if(sh.getRow(rowNum).getCell(colNum).getCellType().toString().equalsIgnoreCase("string"))
			return sh.getRow(rowNum).getCell(colNum).getStringCellValue();
		else
			return sh.getRow(rowNum).getCell(colNum).getNumericCellValue();
	}
	
	public Map<String, Object> readEntireSheet(Sheet sh, int rowNum, int colNum) {
		
		Map<String, Object> data = new HashMap<>();
		
		for(int i= 0; i<sh.getLastRowNum();i++) {
			
			int cellNum = sh.getRow(i).getLastCellNum();
			
			for(int col = 0; col <cellNum; col++) {
				
				if(sh.getRow(rowNum).getCell(colNum).getCellType().toString().equalsIgnoreCase("string"))
					 data.put(sh.getRow(0).getCell(0).getStringCellValue(),  
							sh.getRow(rowNum).getCell(colNum).getStringCellValue());
					
				else
					 data.put(sh.getRow(0).getCell(0).getStringCellValue(),  
							sh.getRow(rowNum).getCell(colNum).getNumericCellValue());
			}
		
		}
		return data;
		
	}
	
	public void readRowData() {
		
	}

}
