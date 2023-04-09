package practisepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	//	WebElement trip = driver.findElement(By.xpath("//div[contains(text(),'Round Trip')]"));
		//driver.findElement(By.xpath("//div[contains(text(),'Flight Status')]")).click();
		//driver.findElement(By.partialLinkText("Round Trip")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Round Trip')]/../div")).click();
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/../div")).click();
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']"));
		from.sendKeys("chennai");
		driver.findElement(By.xpath("//div[text()='MAA - Chennai, India']")).click();
		
		
		
	}

}
