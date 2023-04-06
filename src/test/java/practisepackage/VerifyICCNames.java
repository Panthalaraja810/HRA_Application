package practisepackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyICCNames {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		String teamname = "Australia";
		
	/*	List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		List<WebElement> matches = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		
		boolean flag =false;
		
		for(WebElement team : teams)
		{
			String text = team.getText();
			if(text.equals(teamname))
			{
				System.out.println("is present");
				flag =true;
				break;
				
			}
		}
			if(!flag)
			 {
				System.out.println("is not present");
			}
		*/
		
		
		String myTeam = "India";
		
		List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
				ArrayList<String> list =new ArrayList<String>();
				for(int i=0;i<teams.size(); i++)
				{
					list.add(teams.get(i).getText());
				}
				for(String myTeams : list)
				{
					String rating ="//span[.="+myTeam+"]/../following-sibling::td[3]";
					String RATING = driver.findElement(By.xpath(rating)).getText();
					System.out.println("team-> "+myTeams+" ->(rating is) ->"+RATING);
					
					
					
				}
		

	}

}
