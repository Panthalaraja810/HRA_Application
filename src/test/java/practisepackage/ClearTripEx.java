package practisepackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTripEx {

	public static void main(String[] args) throws Throwable {

		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifcations");
		WebDriverManager.chromedriver().create();
		//WebDriver driver = new ChromeDriver(option);
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/flights?utm_source=bing&utm_medium=cpa&utm_campaign=BR_Cleartrip&utm_content=NOVBINGADS&msclkid=f44df11d7f9714107b4c953b1f961119");
		
		driver.findElement(By.xpath("//*[name()='svg' and @fill='none' and @viewBox and @width='22']")).click();
		
		//driver.findElement(By.xpath("(//div[@class='fs-2 c-inherit flex flex-nowrap'])[1]/div/span")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
		driver.findElement(By.xpath("//div[@class='pt-8 pb-10 p-relative px-10 px-4--xs pt-4--xs pb-4--xs home-search-banner']/descendant::span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
		
		driver.findElement(By.xpath("//div[@class='pt-8 pb-10 p-relative px-10 px-4--xs pt-4--xs pb-4--xs home-search-banner']/descendant::span[2]")).click();
		driver.findElement(By.xpath("//div[@class='bg-white br-4 elevation-5 p-absolute mt-2 z-50 l-0']/descendant::li[@class='flex-inline'][1]")).click();
		
		driver.findElement(By.xpath("//div[@class='bg-white br-4 elevation-5 p-absolute mt-2 z-50 l-0']/descendant::li[@class='flex-inline'][2]")).click();
		driver.findElement(By.xpath("//div[@class='bg-white br-4 elevation-5 p-absolute mt-2 z-50 l-0']/descendant::li[@class='flex-inline'][2]")).click();
		driver.findElement(By.xpath("//div[@class='bg-white br-4 elevation-5 p-absolute mt-2 z-50 l-0']/descendant::li[@class='flex-inline'][2]")).click();
		
		driver.findElement(By.xpath("//div[text()='Business class']")).click();
	//	driver.findElement(By.xpath("//div[@class='flex flex-row flex-middle mt-8']/div[4]/descendant::div[text()='Armed forces fare']")).click();
	//	driver.findElement(By.xpath("//div[@class='pt-8 pb-10 p-relative px-10 px-4--xs pt-4--xs pb-4--xs home-search-banner']/descendant::button[2]")).click();
		
	//	driver.findElement(By.xpath("//div[@class='pt-8 pb-10 p-relative px-10 px-4--xs pt-4--xs pb-4--xs home-search-banner']/descendant::button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer c-neutral-900'][2]/*[(name()='svg') and @class='t-all ml-3']")).click();
		driver.findElement(By.xpath("//div[@class='p-relative br-4']//*[(name()='svg') and @class='t-all  ml-3']//*[local-name()='path'][2]")).click();
	//	driver.findElement(By.xpath("//div[@class='field-1 flex flex-middle p-relative pr-4 w-100p ']")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore, IN - Kempegowda International Airport (BLR)')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Port Blair");
		driver.findElement(By.xpath("//p[contains(text(),'Port Blair, IN - Veer Savarkar (IXZ)')]")).click();
		
		driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
	
		//	driver.findElement(By.xpath("//div[@aria-label='Mon Apr 24 2023']/div/div")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--leftEdge']/../div[@aria-label='Mon Apr 24 2023']/div")).click();
	
	
	}

}
