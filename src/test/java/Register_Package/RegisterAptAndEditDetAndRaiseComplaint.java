package Register_Package;

import java.util.HashMap;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.ObjectRepo.DashBoardPagePage;
import com.ObjectRepo.RegsiterApartmentPage;

public class RegisterAptAndEditDetAndRaiseComplaint extends BaseClass
{
	
	@Test
	public void  regApt() throws Throwable
	{

		RegsiterApartmentPage ap =new RegsiterApartmentPage(driver);
		DashBoardPagePage d =new DashBoardPagePage(driver);
		d.clickRegister();
		ap.clickApartmentRegTab();
		
		HashMap<String, String> map = eLib.readMultipleData("Sheet2");
		String	na =ap.registerapartment(driver, map, jLib);
		ap.clickAddMore();
		System.out.println(na);
		HashMap<String, String> mapA = eLib.readMultipleData("Sheet3");
		ap.moreDetails(driver, mapA);
		ap.submitRegApartment();
	//	ap.checkApartmentReg(driver);
		
		

		d.clickDetailsAndUpdate();
		ap.updateDet(driver);
		
		d.clickDetailsAndUpdate();
		
		ap.EditApt(na, driver);
		
		
		
	}
}