package practisepackage;

import org.testng.annotations.Test;

public class practiseAnnotations 
{
	@Test(invocationCount = 1)
	public void create()
	{
		System.out.println("create details");
	}
	
	@Test(priority = 1, dependsOnMethods= "create")
	public void edit()
	{
		System.out.println("edit details");
	}
	
	@Test(invocationCount = 3, dependsOnMethods = "edit")
	public void delete()
	{
		System.out.println("delete details");
	}
	
	

}
