package practisepackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{

	@Test
	public void Test1() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/");
		List<WebElement> listofAllLink = driver.findElements(By.xpath("//a"));
		List<String> listofLink =new ArrayList();
		List<String> brokenLinks =new ArrayList();
		
		for(WebElement webElement : listofAllLink)
		{
			String link = webElement.getAttribute("href");
			
			if(link!=null)
			{
				if(link.contains("http"))
				{
					listofLink.add(link);
				}
				else
				{
					brokenLinks.add(link+" ===>no http protocol");
				}
			}
			else
			{
				brokenLinks.add(link+" ===>null");
			}
		}
		
		for(String link :listofLink)
		{
			URL Url = new URL(link);
			URLConnection urlCon = Url.openConnection();
			HttpURLConnection httpurlCon = (HttpURLConnection)urlCon;
			int statuscode = httpurlCon.getResponseCode();
			String responseMsg = httpurlCon.getResponseMessage();
			
			if(statuscode >=400)
			{
				brokenLinks.add(link+"statuscode: "+statuscode+"responseMsg"+responseMsg);
			}
		}
		
		System.out.println(brokenLinks);
		System.out.println(brokenLinks.size());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
