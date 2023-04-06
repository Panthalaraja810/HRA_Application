package practisepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCRankings {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> POS = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<WebElement> TEAM = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		List<WebElement> MATCHES = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		List<WebElement> POINTS = driver.findElements(By.xpath("//tbody/tr/td[4]"));
		List<WebElement> RATING = driver.findElements(By.xpath("//tbody/tr/td[5]"));
		
		
		
		
		
		for(int i=0;i<=POS.size(); i++)
		{
			String pos = POS.get(i).getText();
			String team = TEAM.get(i).getText();
			String matches = MATCHES.get(i).getText();
			String points = POINTS.get(i).getText();
			String rating = RATING.get(i).getText();
			System.out.println(pos +" "+team+" "+matches+" "+points+" "+" "+rating);
			
		
		}
		


	}

}
