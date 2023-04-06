package SendSMS_Package;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegComplaintandEditDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		
		String name="sureshWaris53906";
		
		driver.get("http://rmgtestingserver/domain/House_Rental_Application/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	String mob1="8426587596";
					
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[.='Details/Update']")).click();
		
		driver.findElement(By.xpath("//p[text()='mahantesh']/../../../a")).click();
		
		driver.findElement(By.id("description")).sendKeys("All");
		driver.findElement(By.xpath("//button[@value='register_apartment']")).click();
		
	
		driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		
		
		driver.findElement(By.xpath("//p[text()='admin']/../../../a")).click();
		
		driver.findElement(By.name("mobile")).clear();
		driver.findElement(By.name("mobile")).sendKeys(mob1);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		

	}

}
