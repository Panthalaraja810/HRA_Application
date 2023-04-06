package SendSMS_Package;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.ExcelUtility;
import com.ObjectRepo.DashBoardPagePage;
import com.ObjectRepo.RegisterInduvidualHomePage;
import com.ObjectRepo.SendSMS;

public class InduvidualRegAndSendSMS extends BaseClass {

	@Test
	public void InduvidualRegAndSendSMS() throws Throwable
	{
		
	DashBoardPagePage d =new DashBoardPagePage(driver);
	d.clickRegister();
	
	HashMap<String, String> map = eLib.readMultipleData("Sheet1");
		RegisterInduvidualHomePage reg = new RegisterInduvidualHomePage(driver);
		reg.registerHome(driver, jLib, map);
		reg.registerInduvidualHome();
		eLib.closeWorkbook(ExcelUtility.workBook());
		d.clickSendSMS();
		
		SendSMS s=new SendSMS(driver);
		Thread.sleep(3000);
		s.clickcheckBox(driver);

		s.clickMessageBody("NoMessage");
		s.submitSendSMS();
		wLib.navigateBack(driver);
	}
}












