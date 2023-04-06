package practisepackage;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws Throwable {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifcations");
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		
		WebElement from = driver.findElement(By.xpath("//input[@id='fromCity']"));
		from.sendKeys("Mumbai, India");
		driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
		
		WebElement to = driver.findElement(By.xpath("//input[@id='toCity']"));
		to.sendKeys("chennai");
		//driver.findElement(By.xpath("//p[.='Chennai, India']")).click();
		//driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'Chennai, India')]")).click();
		
		Date cdate = new Date();
		String[] d=cdate.toString().split(" ");
		String day=d[0];
		String month=d[1];
		String date=d[2];
		String year =d[5];
		String tdate=day+" "+month+" "+date+" "+year;
		System.out.println(tdate);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label='"+tdate+"']")).click();

		String rday="Thu";
		String rmonth="Mar";
		String rdate ="23";
		String ryear="2023";
		String returnDate= rday+" "+rmonth+" "+rdate+" "+ryear;
		
		driver.findElement(By.xpath("//div[@aria-label='"+returnDate+"']")).click();
		
	/*	WebElement travellers = driver.findElement(By.id("travellers"));
		Actions a =new Actions(driver);
		a.moveToElement(travellers).perform();
		//button[text()='APPLY']
		 WebElement apply = driver.findElement(By.xpath("//button[text()='APPLY']"));
		a.moveToElement(apply).perform();
		*/
		
		driver.findElement(By.xpath("//div[@class='specialFareTooltip whiteText']/../preceding-sibling::li")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
		
		
		
		
	}

}
