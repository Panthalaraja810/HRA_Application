package practisepackage;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest 
{
	@Test
	public void m1()
	{
		String Aname ="google";
		String Ename="Soogle";

		
		Assert.assertEquals(Aname, Ename);
		System.out.println("pass");
	}
	
}
