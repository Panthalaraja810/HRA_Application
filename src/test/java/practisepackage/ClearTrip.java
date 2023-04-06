package practisepackage;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTrip {

	public static void main(String[] args) {

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifcations");
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/?utm_source=bing&utm_medium=cpc&utm_campaign=brand&msclkid=a09e0e9aaed813d6115b6a8948d9b905");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Date cdate =new Date();
		String[] d =cdate.toString().split(" ");
		String day= d[0];
		String  month =d[1];
		String date =d[2];
		String time =d[3];
		String timing =d[4];
		String year =d[5];
		String tdate =day+" "+month+" "+date+" "+year;
		System.out.println(tdate);
	
		//driver.findElement(By.xpath("//div[@aria-label='"+tdate+"']")).click();
		
		//driver.findElement(By.xpath("//div[@aria-label='Sun Mar 26 2023']")).click();
		driver.findElement(By.xpath("//div[text()='Sun, Mar 19']")).click();
	}

}
