package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class ClientPage extends TestBase{

	//List of Link available on Client's page
	
	@FindBy(xpath = "(//*[text()='Organization List'])[2]")
	WebElement organizationList;
	
	@FindBy(xpath = "(//*[text()='Client List'])[2]")
	WebElement clientList;
	
	@FindBy(xpath = "(//a[@href='/clients/'])[1]")
	public
	WebElement clientLink;
	
	@FindBy(xpath = "(//*[text()='Contract List'])[2]")
	WebElement contractList;
	
	@FindBy(xpath = "(//*[text()='Create Organization'])[2]")
	WebElement createOrganzation;
	
	@FindBy(xpath = "(//*[text()='Create Client'])[2]")
	WebElement createClient;
	
	@FindBy(xpath = "(//*[text()='Create Contract'])[2]")
	WebElement createContract;
	
	@FindBy(xpath = "(//*[text()='Bill Client'])[2]")
	WebElement billClient;
	
	//Create Organization
	
	@FindBy(xpath = "//input[@name='Name']")
	public
	WebElement organizationName;
	
	@FindBy(xpath = "//select[@id='ClientOrganizationStatusID']")
	public
	WebElement organizationStatus;
	
	@FindBy(xpath = "//select[@id='ClientOrganizationTypeID']")
	public
	WebElement organizationType;
	
	@FindBy(xpath = "//select[@id='ContractTypeID']")
	public
	WebElement contractType;
	
	@FindBy(xpath = "//select[@id='dataSourceID']")
	public
	WebElement guidepointSub;
	
	//Create Contract
	
	@FindBy(xpath = "//select[@id='clientOrganizationID']")
	public
	WebElement clientOrganizationid;
	
	@FindBy(xpath = "//input[starts-with(@id,'startDate')]")
	public
	WebElement startDate;
	
	@FindBy(xpath = "//input[starts-with(@id,'endDate')]")
	public
	WebElement realEndDate;
	
	@FindBy(xpath = "//input[starts-with(@id,'originalEndDate')]")
	public
	WebElement orgEndDate;
	
	@FindBy(xpath = "//select[@name='revenueItemID']")
	public
	WebElement revenueItem;
	
	@FindBy(xpath = "//input[@name='termsMaxUnits']")
	public
	WebElement maxUnits;
	
	@FindBy(xpath = "//input[@name='incentiveUnits']")
	public
	WebElement incentiveUnits;
	
	@FindBy(xpath = "//input[@name='termsUnitOverageCharge']")
	public
	WebElement overageUnit;
	
	@FindBy(xpath = "//input[@name='termsUnitsRolledOver']")
	public
	WebElement rolledoverUnit;
	
	@FindBy(xpath = "//input[@name='termsValuePerRolledOverUnit']")
	public
	WebElement rolledoverValues;
	
	@FindBy(xpath = "//input[@src='/core/images/b_save.gif']")
	public
	WebElement createButton;
	
	
	
	public ClientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickCreateOrganization()
	{
		createOrganzation.click();
	}
	
	public void clickOrganizationList()
	{
		organizationList.click();
	}
	
	public void clickClientList()
	{
		clientList.click();
	}
	
	public void clickContractList()
	{
		contractList.click();
	}
	
	public void clickCreateClient()
	{
		createClient.click();
	}
	
	public void clickCreateContract()
	{
		createContract.click();
	}
	
	public void clickBillClient()
	{
		billClient.click();
	}
	
	public void clickOnClientLink() {
		clientLink.click();
		
	}
}
