package practisepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteMultipleExcelData {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\RMG.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("sheet1");
		
		int count = sh.getLastRowNum();
		
		for(int i=1; i<=count ; i++)
		{
		
		sh.getRow(i).createCell(0).setCellValue("Branch_Name");
		sh.getRow(i).createCell(1).setCellValue("BTM1");
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\RMG.xlsx");
		
		wb.write(fos);
		}
		
	}

}
