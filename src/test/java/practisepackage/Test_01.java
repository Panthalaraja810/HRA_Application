package practisepackage;

import org.testng.annotations.Test;

public class Test_01 
{
	@Test(groups = "smoke")
	public void script1()
	{
		System.out.println("execute Script1");
	}
	
	@Test(groups = "regression")
	public void script2()
	{
		System.out.println("execute script2");
	}
}
