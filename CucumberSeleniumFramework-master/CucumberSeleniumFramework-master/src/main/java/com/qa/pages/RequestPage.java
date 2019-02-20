package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class RequestPage extends TestBase{
	
	

	@FindBy(xpath = "(//a[text()='Request List'])[2]")
	WebElement Requestlist;
	
	@FindBy(xpath = "(//a[text()='Request Search'])[2]")
	WebElement RequestSearch;
	
	@FindBy(xpath = "(//a[text()='Calendar'])[2]")
	WebElement Calendar;
	
	@FindBy(xpath = "(//a[text()='Create Request'])[2]")
	WebElement CreateRequest;
	
	@FindBy(xpath = "//*[@id='Name']")
	public
	WebElement Clienttextbox;
	
	@FindBy(xpath = "//*[@id='requestNote']")
	public
	WebElement ClientRequestNote;
	
	@FindBy(xpath = "//*[@id='RequestTypeID']")
	public
	WebElement RequestType;
	
	@FindBy(xpath ="//*[@id='aipd_1_AOE1']")
	public
	WebElement Sectordropdown;
	
	@FindBy(xpath ="//*[@id='aipd_2_AOE1']")
	public 
	WebElement Industrydropdown;
	
	@FindBy(xpath ="(//a[text()='Requests'])[1]")
	public 
	WebElement requestTab;
	
	public RequestPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);	
		}
	
	public void createRequestClick()
	{
		CreateRequest.click();
	}
	public void clickOnRequestLink() {
		
		requestTab.click();
	}
	
}
