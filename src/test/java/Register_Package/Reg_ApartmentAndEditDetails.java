package Register_Package;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.DatabaseUtility;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.JavaUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepo.DashBoardPagePage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.RegsiterApartmentPage;
import com.ObjectRepo.RegsiterApartmentPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reg_ApartmentAndEditDetails extends BaseClass
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
		
		
	}
}
