package Day5;

import java.io.IOException;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseBrokenLinks {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://medium.com/");
		
	List<WebElement> listofAllLinks = driver.findElements(By.xpath("//a"));
	List<String> listofLink = new ArrayList<String>();
	List<String> brokenLink = new ArrayList<String>();
	
	for(WebElement webelement: listofAllLinks)
	{
		String link = webelement.getAttribute("href");
		
		if(link!=null)
		{
			if(link.contains("http"))
			{
				listofLink.add(link);
			}
			else {
				brokenLink.add(link+" not having http");
			}
		}
		else {
			brokenLink.add(link+" contains null");
		}
		
	}
	
	for(String link: listofLink)
	{
		URL url = new URL(link);
		URLConnection Urlcon = url.openConnection();
		HttpURLConnection httpcon = (HttpURLConnection)Urlcon;
		int statuscode = httpcon.getResponseCode();
		String message = httpcon.getResponseMessage();
		
		if(statuscode>=400)
		{
			brokenLink.add(link+" "+statuscode+" "+message);
		}
	}
	System.out.println(brokenLink);
	System.out.println(brokenLink.size());
		
	}

}
