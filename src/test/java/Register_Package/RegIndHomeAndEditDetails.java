package Register_Package;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.ExcelUtility;
import com.ObjectRepo.DashBoardPagePage;
import com.ObjectRepo.DetailsAndUpdate;
import com.ObjectRepo.RegisterInduvidualHomePage;
import com.ObjectRepo.RegsiterApartmentPage;

public class RegIndHomeAndEditDetails extends BaseClass
{
	
	
	@Test
	public void RegIndHomeAndEditDetails() throws Throwable
	{
	DashBoardPagePage d =new DashBoardPagePage(driver);
	d.clickRegister();
	
	HashMap<String, String> map = eLib.readMultipleData("Sheet1");
	RegisterInduvidualHomePage reg =new RegisterInduvidualHomePage(driver);
	reg.registerHome(driver, jLib, map);
	reg.registerInduvidualHome();

	String name2 = eLib.readDataFromExcel("Sheet6", 1, 0);
	d.clickDetailsAndUpdate();
	DetailsAndUpdate dU = new DetailsAndUpdate(driver);
	dU.Edit(name2, driver);
	String newCity = eLib.readDataFromExcel("Sheet6", 0, 0);
	reg.clearCity();
	reg.editCity(newCity);
	RegsiterApartmentPage ap =new RegsiterApartmentPage(driver);
	ap.submitRegApartment();
	eLib.closeWorkbook(ExcelUtility.workBook());
	d.clickDetailsAndUpdate();
	reg.verifyEditDetails(driver);
	
	
	}
}
