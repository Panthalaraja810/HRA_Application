package practisepackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridPractiseEx2 
{
	public void test1() throws MalformedURLException, Throwable 
	{
		String executeMode="remote";
		WebDriver driver =null;
		
		if(executeMode.equals("remote"))
		{
			URL url = new URL("http://192.168.225.18:4444/wd/hub");
			
			DesiredCapabilities cap= new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
			driver =new RemoteWebDriver(url, cap);			
		}
		else if(executeMode.equals("local"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
