package practisepackage;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.GenericUtilities.DatabaseUtility;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.JavaUtility;
import com.GenericUtilities.WebDriverUtility;
import com.mysql.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RmgYantraAppTest 
{

	public static void main(String[] args) throws Throwable
	{
		
		FileUtility fLib = new FileUtility();
		DatabaseUtility dLib = new DatabaseUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		
		String expProj = "TY_PJ_003";
		Connection con = null;
		//ResultSet result =null;
	
//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\RmgYantra.properties");
//		Properties p = new Properties();
//		p.load(fis);
//		
//	    String URL =p.getProperty("url");
//		String UN=p.getProperty("username");
//		String PW=p.getProperty("password");
		
		String URL =fLib.readDataFromPropertyFile("url");
		String UN =fLib.readDataFromPropertyFile("username");
		String PW =fLib.readDataFromPropertyFile("password");
		
		WebDriverManager.chromedriver().create();
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		wLib.maximizeWindow(driver);
		
		driver.get(URL);
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		wLib.waitForPageLoad(driver);
		
		
		driver.findElement(By.id("usernmae")).sendKeys(UN);
		driver.findElement(By.id("inputPassword")).sendKeys(PW);
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block text-uppercase']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(expProj);		
		
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("SureshAbhishek");
		WebElement status = driver.findElement(By.xpath("//label[text()='Project Status ']/../select"));
		
//		Select s=new Select(status);
//		s.selectByVisibleText("On Gogin");
		
		wLib.select(status, "On Gogin");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
//		Driver driver1 =new Driver();
//		DriverManager.registerDriver(driver1);
//		con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		
		dLib.connectToDb();
		
		Statement st = con.createStatement();
		String query = "select * from project";
		
		dLib.executeQueryAndGetData(query, expProj, 4);
//		result = st.executeQuery(query);
//		
//		boolean flag=false;
//		while(result.next())
//		{
//			String actProj = result.getString(4);
//			System.out.println(actProj);
//			if(actProj.equalsIgnoreCase(expProj))
//			{
//				flag =true;
//				break;
//				
//			}
//		}
//		if(flag)
//		{
//			System.out.println("Project is created");
//			
//		}
//		else
//		{
//			System.err.println("Project not created");
//		}
			
		
		//con.close();
		dLib.closeDB();
	}

}






