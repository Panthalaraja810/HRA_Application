package practisepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcelSheet {

	public static void main(String[] args) throws Throwable {

		//create object for physical file
				FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\RMG.xlsx");
				
				//get workbook
				Workbook wb = WorkbookFactory.create(fis);
				
				 wb.getSheet("sheet1").getRow(0).createCell(0).setCellValue("Branch_Name");
				
				FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\RMG.xlsx");
				
				wb.write(fos);
				
			
				
				
	}

}
