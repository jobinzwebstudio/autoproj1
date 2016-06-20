package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {


		File newfile = new File("C:\\Users\\jobin\\Documents\\Project\\TestData.xlsx");
		
		FileInputStream fls = new FileInputStream(newfile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fls);
		
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 =sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data0);
		
		wb.close();

	}

}
