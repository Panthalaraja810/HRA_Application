package practisepackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationTest 
{
	
	@BeforeSuite
	public void dBconnection()
	{
		System.out.println("DB connection successful");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("open the browser");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("login to App");
	}
	
	@Test
	public void testScript_1()
	{
		System.out.println("test script1");
	}
	
	@Test
	public void testScript_2()
	{
		System.out.println("test script2");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout of App");
	}
	
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}
	
	public void closeDBconnection()
	{
		System.out.println("db connection closed");
	}

}
