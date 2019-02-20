package com.qa.util;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.prism.Image;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	protected static ConfigFileReader configFileReader;
	
	public TestBase()
	{
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\src\\main\\java\\com\\qa\\config\\Configuration.properties");
			prop.load(fis);
		}
		
			catch (IOException e)
			{
				e.getMessage();
			}
	}
	
	public static void initialization()
	{ 
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{	 System.setProperty("webdriver.chrome.driver","D:\\Automation_New\\Automation\\Framework\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		if(browserName.equals("ff"))
		{	 System.setProperty("webdriver.gecko.driver","D:/Automation_New/Automation/Framework/geckodriver.exe");
		 driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
 }
	
	public String getReportConfigPath()
	{
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	public static void takeScreenshots() throws IOException
	{
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrfile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
	}
	
	
	
	
	
	
}