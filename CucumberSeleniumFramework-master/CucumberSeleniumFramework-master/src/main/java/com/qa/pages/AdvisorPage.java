package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class AdvisorPage extends TestBase{
	
	
	@FindBy(xpath = "(//a[text()='Advisor Search'])[2]")
	WebElement AdvisorSearch;
	
	@FindBy(xpath = "(//a[text()='Advisor Ratings'])[2]")
	WebElement AdvisorRatings;
	
	@FindBy(xpath = "(//a[text()='Campaign List'])[2]")
	WebElement CampaignList;
	
	@FindBy(xpath = "(//a[text()='Campaign Contact Search'])[2]")
	WebElement CampaignContactSearch;
	
	@FindBy(xpath = "(//a[text()='Create Advisor'])[2]")
	WebElement CreateAdvisor;
	
	@FindBy(xpath = "(//a[text()='Create Campaign'])[2]")
	WebElement CreateCampaign;

	@FindBy(xpath = "(//a[text()='Internal Update Queue'])[2]")
	WebElement InternalUpdateQueue;
	
	@FindBy(xpath = "(//a[text()='Employer Consent'])[2]")
	WebElement EmployerConsent;
	
	@FindBy(xpath = "(//a[text()='Lead Search'])[2]")
	WebElement LeadSearch;
	
	@FindBy(xpath = "(//a[text()='Create Lead'])[2]")
	WebElement CreateLead;
	
	@FindBy(xpath = "//*[@id='EMail']")
	public
	WebElement Email;
	
	@FindBy(xpath = "//*[@id='Phone1']")
	public
	WebElement Phone;
	
	public AdvisorPage()
	{
		PageFactory.initElements(driver, this);	
	}

	public AdvisorPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void createLeadLink()
	{
		CreateLead.click();
	}
}
