package practisepackage;

import org.testng.annotations.Test;

public class Test_03 {
	
	@Test(groups = "smoke")
	public void script5()
	{
		System.out.println("execute script5");
	}

	@Test(groups = "regression")
	public void script6()
	{
		System.out.println("execute script6");
	}
		

}
