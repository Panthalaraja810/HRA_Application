package practisepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTripEx {

	public static void main(String[] args) {

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifcations");
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.cleartrip.com/flights?utm_source=bing&utm_medium=cpa&utm_campaign=BR_Cleartrip&utm_content=NOVBINGADS&msclkid=f44df11d7f9714107b4c953b1f961119");
		driver.findElement(By.xpath("//div[text()=\"Armed forces fare\"]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore, IN - Kempegowda International Airport (BLR)')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Goa, IN - Dabolim Airport (GOI)')]")).click();
		
		
		
	}

}
