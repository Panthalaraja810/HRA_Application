package practisepackage;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericUtilities.ExcelUtility;

public class newDataproviderTest 
{

//	@Test(dataProviderClass = DataproviderTestRun.class ,dataProvider = "getDetails")
//	public void empDet(int empid, String name)
//	{
//		Reporter.log("empid---->"+empid+"name------>"+name);
//	}

//	
//	@Test(dataProviderClass = DataproviderUsingExcel.class ,dataProvider = "dataObj")
//	public void empDet(String empid, String name)
//	{
//		Reporter.log("empid is---->"+empid+"name is------>"+name);
//	}
	
	
	@DataProvider
	public Object[][] readSetOfData() throws Throwable
	{
		ExcelUtility eLib = new ExcelUtility();
		Object[][] value = eLib.readMultipleSet("Sheet5");
		return value;
		
	}
	
	
	@Test(dataProvider ="readSetOfData")
	public void empDetails(String empId, String ename)
	{
		Reporter.log("empId----->"+empId+"ename----->"+ename);
		
	}
	
	
	
	
}
