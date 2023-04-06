package Register_Package;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.ObjectRepo.UserRegistrationPage;
import com.ObjectRepo.WelcomePage;

public class UserRegistration extends BaseClass{

	@Test
	public void UserRegistration() throws Throwable
	{
 WelcomePage wl = new WelcomePage(driver);

wl.logo();
	 wl.RegisterUser();

	HashMap<String, String> map = eLib.readMultipleData("UserReg");
		Thread.sleep(2000);
	 UserRegistrationPage user=new UserRegistrationPage(driver);
		user.UserRegistrations(driver, map, jLib); 
		user.SubmitUsers();
		user.RegMessage(driver);
			
}
}
