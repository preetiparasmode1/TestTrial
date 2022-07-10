package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utility.PropertiesUtility;

public class BaseClass {
public static WebDriver driver=null;
public static ExtentReports report = null;
public static ExtentSparkReporter spark = null;
public static ExtentTest  test =null;

	public void initialization() throws Exception {
		String browser = PropertiesUtility.readProperties("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   driver= new ChromeDriver();
		}
	
	if(browser.equals("edge")) {
		System.setProperty("webdriver.chrome.driver","msedgedriver.exe");
		driver= new EdgeDriver();
		
	}
	if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "grckodriver.exe");
		driver= new FirefoxDriver();
		}
	
	driver.manage().window().maximize();
	driver.get(PropertiesUtility.readProperties("url"));
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

   public void reportInit()	{
	   report = new ExtentReports();
	   spark = new ExtentSparkReporter(System.getProperty("user.dir")+ "/target/ExtentReport.html");
	   report.attachReporter(spark);
   }
	
	public void takeScreenshot(String name) {
		
		
	}
	
	
	
	
	
	
}