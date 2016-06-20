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
		
		
		int rowcount = sheet1.getLastRowNum();
		
		
		
		for(int i=0; i<=rowcount;i++)
		{
		
			String data0 =sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from colum no."+i+"is : "+data0);
			
		}
		
		wb.close();

	}

}
