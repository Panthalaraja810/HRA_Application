package Day5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseShadowRoot {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(options);
		driver.get("chrome://downloads/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement search=(WebElement)js.executeScript("return document.querySelector('downloads-manager').shadowRoot\r\n"
				+ ".querySelector('downloads-toolbar') .shadowRoot\r\n"
				+ ".querySelector('cr-toolbar').shadowRoot  \r\n"
				+ ".querySelector('#search').shadowRoot.querySelector('input')");
		
		search.sendKeys("Java");
		
		
	}

}
