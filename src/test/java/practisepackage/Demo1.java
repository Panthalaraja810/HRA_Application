package practisepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 
{
	@Test
	public void Test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Raja");
		driver.findElement(By.id("userEmail")).sendKeys("aasdasd@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("sdfaslfkaflafjafasfkajfkaskasf afadssfdffsf sdfdssdsdg");
		driver.findElement(By.id("permanentAddress")).sendKeys("sdfsdfsd sdfsdasgadsfg adfdafdsgfsg");
		driver.findElement(By.id("submit")).submit();
		
		
		
	}
	

}
