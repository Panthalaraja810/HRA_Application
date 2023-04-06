
package com.GenericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementationClass implements ITestListener
{
	ExtentReports report;
	ExtentTest test;
	public void onTestStart(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"----> Testscript execution started");
	}

	public void onTestSuccess(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.PASS, MethodName+"---> Passed");
		Reporter.log(MethodName+"---> Testscript execution successful");
	}

	public void onTestFailure(ITestResult result) 
	{
		
//		String FScript = result.getMethod().getMethodName();
//		String FS =FScript+ new JavaUtility().getSystemDate();
		
		EventFiringWebDriver edriver =new EventFiringWebDriver(BaseClass.sdriver);
		File src =edriver.getScreenshotAs(OutputType.FILE);
	String destFilepath = "./screenshot/"+result.getMethod().getMethodName()+LocalDateTime.now().toString().replace(':', '-')+".png";
//	File path = dest.getAbsoluteFile();
	File dest = new File(destFilepath);
try {
		FileUtils.copyFile(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
		
		test.log(Status.FAIL, result.getThrowable().getMessage());
		Reporter.log("Testscript execution failed");
		
	}

	public void onTestSkipped(ITestResult result) 
	{
		String MethodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, MethodName+"---> skipped");
		test.log(Status.SKIP, result.getThrowable());
		Reporter.log("Testscript execution skipped");
	}

	

	public void onStart(ITestContext context)
	{
		ExtentSparkReporter htmlreport =new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("HRA");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("HouseRentalApp");
		
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Base_Browser", "chrome");
		report.setSystemInfo("OS", "windows");
		report.setSystemInfo("Base_Url", "http://rmgtestingserver/domain/House_Rental_Application/auth/login.php");
		report.setSystemInfo("Reporter Name", "Tapu");
	
		
	}

	
	public void onFinish(ITestContext context) 
	{
		report.flush();
	}

	
}
