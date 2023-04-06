package practisepackage;

import org.testng.annotations.DataProvider;

public class DataproviderTestRun 
{
	@DataProvider()
	public Object[][] getDetails()
	{
		Object[][] obArr =new Object[3][2];
		obArr[0][0] =001;
		obArr[0][1] = "Suresh";
		
		obArr[1][0]=002;
		obArr[1][1]="Tapu";
		
		obArr[2][0]=003;
		obArr[2][1]="sureshTapu";
		return obArr;
	}

//	@Test(dataProvider = "getDetails")
//	public void empDetails(int id, String name)
//	{
//		Reporter.log("empid---->"+id+"to------->"+name);
//	}

	
	
}
