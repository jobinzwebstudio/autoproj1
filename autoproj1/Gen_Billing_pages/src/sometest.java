import org.testng.annotations.Test;

import lib.ExcelDataConfig;

public class sometest {

	
	@Test
	public void readExcel(){
		
	
		
		try {
			lib.ExcelDataConfig excel = new ExcelDataConfig();
			String data = excel.ReadExcel(0, 0, 0);
			System.out.println("Read from Excel : "+data);
		} 
		
		catch (Exception e) {
			
			System.out.println("There is no value mentioned in the Excel sheet, Exception Observed: "+e);
		}

}

}
