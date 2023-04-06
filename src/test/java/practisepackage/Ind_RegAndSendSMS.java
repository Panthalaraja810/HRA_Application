package practisepackage;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.DatabaseUtility;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.JavaUtility;
import com.GenericUtilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ind_RegAndSendSMS {

	public static void main(String[] args) throws Throwable {

		DatabaseUtility dLib = new DatabaseUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		String URL = fLib.readDataFromPropertyFile("url");
		String USERNAME = fLib.readDataFromPropertyFile("username");
		String PASSWORD = fLib.readDataFromPropertyFile("password");
		
		wLib.maximizeWindow(driver);
		driver.get(URL);
		wLib.waitForPageLoad(driver);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.findElement(By.id("exampleInputEmail1")).sendKeys(USERNAME);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		HashMap<String, String> map = eLib.readMultipleData("Sheet1");
		
		for(Entry<String, String> set: map.entrySet())
		{
			String key = set.getKey();
			if(key.equalsIgnoreCase("fullname"))
			{
				driver.findElement(By.id(set.getKey())).sendKeys(set.getValue()+jLib.randomTwo());
			}
			else if(key.equalsIgnoreCase("mobile"))
			{
				driver.findElement(By.id(set.getKey())).sendKeys(set.getValue()+jLib.randomTwo());
			}
			else if(key.equalsIgnoreCase("email"))
			{
				driver.findElement(By.id(set.getKey())).sendKeys("J"+set.getValue()+jLib.randomTwo());
			}
			
			else
			{
				driver.findElement(By.id(set.getKey())).sendKeys(set.getValue());
			}
		
		}
		
		driver.findElement(By.xpath("//option[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='register_individuals']")).click();
		
		boolean reg = driver.findElement(By.xpath("//div[text()='Registration successfull. Thank you']")).isDisplayed();
		
		if(reg)
		{
			System.out.println("registration successful");
		}
		else
		{
			System.out.println("registration not successful");
		}
		
		driver.findElement(By.xpath("//a[text()='Send SMS']")).click();
		
		driver.findElement(By.xpath("//input[@value='9554522713']")).click();
		driver.findElement(By.xpath("//input[@name='message']")).sendKeys("Hi");	
	    driver.findElement(By.xpath("//button[@name='sms_alert']")).click();
		
		
		
		
		
		
	
	}

}
