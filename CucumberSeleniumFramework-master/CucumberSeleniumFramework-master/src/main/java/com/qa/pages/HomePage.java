package com.qa.pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.ConfigFileReader;
import com.qa.util.PageObjectManagers;

public class HomePage {
static WebDriver driver;
ConfigFileReader configFileReader;

@FindBy(xpath = "(//*[text()='Clients'])[1]")
public
WebElement clientLink;
	
	public void navigateTo_HomePage() {
		//driver.get("http://www.shop.demoqa.com");
		driver.get(configFileReader.getApplicationUrl());
	
	}
	

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}



	public String verifyHomepagetitle() {
		return driver.getTitle();
	}

	public void clickOnRequestLink() {
		// TODO Auto-generated method stub
		
	}

	public void clickOnAdvisorLink() {
		// TODO Auto-generated method stub
		
	}

	public static void takeScreenshots() throws IOException
	{
		Date date = new Date() ;
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrfile, new File(currentDir + "/screenshots/" + dateFormat.format(date) + ".png"));
		
	}
}
