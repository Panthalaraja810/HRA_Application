package practisepackage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravelsPractise1 
{
	@Test
	public void test() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/");
		List<WebElement> listofAllLink = driver.findElements(By.xpath("//a"));
		List<String> listofLink = new ArrayList<String>();
		List<String> brokenLinks = new ArrayList<String>();
		
		for(WebElement webElement :listofAllLink)
		{
		
			String link = webElement.getAttribute("href");
			
			if(link!= null)
			{
				if(link.contains("http"))
				{
					listofLink.add(link);
				}else
				{
					brokenLinks.add(link +" ==> Not Having http protocol");
				}
			}else {
				brokenLinks.add(link+" ==> Null");
			}
		}
					
		for(String link :listofLink)
			try{
		{
			URL url = new URL(link);
			URLConnection urlCon = url.openConnection();
			HttpURLConnection httpUrlCon = (HttpURLConnection)urlCon;
			int statusCode = httpUrlCon.getResponseCode();
			String responseMsg = httpUrlCon.getResponseMessage();
			
			if(statusCode>=400)
			{
				brokenLinks.add(link+" ==> StatusCode : "+statusCode+" ==> ResponsMsg : "+responseMsg);
			}
		}
			}
		catch (Exception e) 
			{
			brokenLinks.add(link+" ==> Not connected to server");
			}
		
		System.out.println(brokenLinks);
		System.out.println(brokenLinks.size());
		
	}
	
}
