package com.qa.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;

import junit.framework.Assert;





public class ConfigFileReader {
	
   public Properties properties;
	String propertyFilePath= "D:\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\src\\main\\java\\com\\qa\\config\\Configuration.properties";


	
	
	public ConfigFileReader(){
		
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public long getImplicitlyWait() {		
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
	public long getPageLoadTimeout() {		
		String pageloadtimeout = properties.getProperty("pageloadtimeout");
		if(pageloadtimeout != null) return Long.parseLong(pageloadtimeout);
		else throw new RuntimeException("pageloadtimeout not specified in the Configuration.properties file.");		
	}
	
	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	
	public String getId() {
		String id = properties.getProperty("id");
		if(id != null) return id;
		else throw new RuntimeException("Id not specified in the Configuration.properties file.");
	}
	public String getPassword() {
		String password = properties.getProperty("password");
		if(password != null) return password;
		else throw new RuntimeException("password not specified in the Configuration.properties file.");
	}
	
	public String getReportConfigPath(){
		 String reportConfigPath = properties.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
	
	public static void takeScreenshots(WebDriver driver) throws IOException
	{
		
		try{
		
		String currentDir = System.getProperty("user.dir");
		Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File(currentDir + "/screenshots/"+sdf.format(d)+".png"));
	  }
	    
		catch (Exception e2) {
		    e2.printStackTrace();
		}
	}
	
	public static void failScreenshots(WebDriver driver, WebElement element , String arg1) throws IOException
	{
		
		try{
		
		JavascriptExecutor	js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		String currentDir = System.getProperty("user.dir");
		Date d = new Date();
        System.out.println(d.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File(currentDir + "/Failscreenshot/"+sdf.format(d)+".png"));
	    Assert.assertEquals(element, arg1);
	  }
	    
		catch (Exception e2) {
		    e2.printStackTrace();
		}
	}
	
	public static void pdfScreenshots() throws DocumentException, MalformedURLException, IOException
	{
		File f = new File("D:\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\screenshots\\");
		String[] fileList = f.list();
		Document document = new Document(PageSize.A0);
		//Document document1 = new Document(PageSize.A2);
		Date d = new Date();;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		String currentDir = System.getProperty("user.dir");
		String DEST = currentDir + "/PassScreenshots/"+sdf.format(d)+".pdf";
		//FileUtils.copyFile(screenshots, new File(currentDir + "/screenshots/"+sdf.format(d)+".png"));
		PdfWriter.getInstance(document, new FileOutputStream(DEST));
	    document.open();
		for(String name:fileList)
        {
    	    Image image = Image.getInstance("D:\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\screenshots\\" +name+ "");
    	    document.add(image);
    	   
        }
		 document.close();
	}
	
}


