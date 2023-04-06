package Register_Package;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.JavaUtility;
import com.ObjectRepo.DashBoardPagePage;
import com.ObjectRepo.RegisterInduvidualHomePage;

@Listeners(com.GenericUtilities.ListenerImplementationClass.class)

public class Reg_IndHome extends BaseClass
{
	
	@Test
	public void regIndHome() throws Throwable
	{
	DashBoardPagePage d =new DashBoardPagePage(driver);
	d.clickRegister();

	
	JavaUtility jLib = new JavaUtility();
	HashMap<String, String> map = eLib.readMultipleData("Sheet1");
	
	RegisterInduvidualHomePage reg =new RegisterInduvidualHomePage(driver);
	reg.registerHome(driver, jLib, map);
	Assert.fail();
	reg.registerInduvidualHome();
	eLib.closeWorkbook(ExcelUtility.workBook());
	reg.checkReg(driver);
	}
}
