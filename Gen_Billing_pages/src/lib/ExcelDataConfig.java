package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFSheet sheet1 ;	
	
	public ExcelDataConfig()
	{
try {
	File newfile = new File("C:\\Users\\jobin\\Documents\\Project\\TestData.xlsx");
			
			FileInputStream fls = new FileInputStream(newfile);
			
			XSSFWorkbook wb = new XSSFWorkbook(fls);
			
			sheet1 = wb.getSheetAt(0);
			
			
			int rowcount = sheet1.getLastRowNum();
			wb.close();
			

} catch (Exception e) {
	System.out.println("Esception occured while reading the excel sheet"+e);
}
		
	}

}
