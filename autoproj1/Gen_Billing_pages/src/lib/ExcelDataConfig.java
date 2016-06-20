package lib;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	
	
	public ExcelDataConfig()
	{
		try {
			File newfile = new File("C:\\Users\\jobin.john\\Documents\\autoInput\\TestData.xlsx");
			
			FileInputStream fls = new FileInputStream(newfile);
			
			wb = new XSSFWorkbook(fls);
					
			wb.close();
			
			} 		
		catch (Exception e) 
		{
			System.out.println("Esception occured while reading the excel sheet"+e);
		}
		
	}
	
	
	
	
	
	public String ReadExcel(int sheet,int RowNo, int CellNo)
	{
		
		XSSFSheet SelectedSheet ;
		
		SelectedSheet = wb.getSheetAt(sheet);

		
		String data = SelectedSheet.getRow(RowNo).getCell(CellNo).getStringCellValue();
		
		return data;
		
	}
	
	
	
	
	
	
	public String WriteExcel(int sheet,int RowNo, int CellNo)
	{
		
		XSSFSheet SelectedSheet ;
		
		SelectedSheet = wb.getSheetAt(sheet);

		
		String data = SelectedSheet.getRow(RowNo).getCell(CellNo).getStringCellValue();
		
		return data;
		
	}

}
