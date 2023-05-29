package practisepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GenericUtilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

@Test
public void test1() throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
	//ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverUtility wLib = new WebDriverUtility();
		//wLib.waitForPageLoad(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath("//div[text()='Round Trip']"));
	
		
		
		Select s=new Select(link);
	
		s.selectByVisibleText("Round Trip");
	
	}

}
