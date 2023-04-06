import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_Package {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[.='Logo/Home']")).click();
		
		driver.findElement(By.xpath("//a[.='Search']")).click();
		
		driver.findElement(By.id("keywords")).sendKeys("2bhk");
		driver.findElement(By.id("location")).sendKeys("belagavi");
			Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='search']")).click();
		
		
		
	}

}
