package practisepackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestTY {
 public static void main(String[] args)
 {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> Position = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<WebElement> Rating = driver.findElements(By.xpath("//tbody/tr/td[5]"));
		
		for(int i=0; i<5; i++)
		{
			
			System.out.println(Rating.get(i).getText()+" "+Position.get(i).getText());
		}
		
		
		
		
		
	}
	
	
	
	
}
