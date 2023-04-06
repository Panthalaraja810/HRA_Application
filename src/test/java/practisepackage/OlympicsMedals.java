package practisepackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicsMedals {

	public static void main(String[] args)
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String teamname = "Japan";
		
		List<WebElement> country = driver.findElements(By.xpath("//div[@class='styles__HeaderDesktop-sc-qcc2vw-3 lcKGel']/../../../descendant::div[@class='styles__CountryWrapper-sc-fehzzg-4 LiGRO']"));

		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=1; i<=country.size(); i++)
		{
			list.add(country.get(i).getText());
		}
		for(String mycountry : list)
		{
			String gold = "//div[.="+teamname+"]/../descendant::div[@class='styles__Flag-sc-fehzzg-2 bNUVQ']";
			String mygold = driver.findElement(By.xpath(gold)).getText();
			
			
			
			
			
			System.out.println(mycountry+" "+mygold);
		}
		
		
		//div[.='Venezuela']/../descendant::div[@class='Medalstyles__Wrapper-sc-1tu6huk-0 ARrqU']
		
	}

}








//div[@class='styles__HeaderDesktop-sc-qcc2vw-3 lcKGel']/../../../descendant::div[@class='styles__CountryWrapper-sc-fehzzg-4 LiGRO']


//div[@data-medal-id='gold-medals-row-2']



//div[.='Venezuela']/../descendant::div[@class='styles__Flag-sc-fehzzg-2 bNUVQ']

//Medalstyles__Medal-sc-1tu6huk-1 lzFVJ








