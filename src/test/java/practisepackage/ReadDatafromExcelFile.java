package practisepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcelFile {

	public static void main(String[] args) throws Throwable
	{

		//create object for physical file
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\RMG.xlsx");
		
		//get workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		/*
		//get the sheet
		Sheet sh = wb.getSheet("sheet1");
		
		//get the Row
		
		Row row = sh.getRow(1);
		
		//get the cell
		Cell cel = row.getCell(0);
		
		//get the value
		String value = cel.getStringCellValue();
		
		System.out.println(value);  */
		
		
		
		//read multiple data
		
		int lastRowcount = wb.getSheet("sheet1").getLastRowNum();
				
		for(int i=0; i<=lastRowcount; i++)
		{
			String data =wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
			String value = wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(data +" "+value);
		}
	
		
				
	}

}
