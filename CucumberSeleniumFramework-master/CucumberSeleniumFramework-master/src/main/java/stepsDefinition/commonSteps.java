package stepsDefinition;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.assertj.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.qa.pages.AccountingPage;
import com.qa.pages.AdminPage;
import com.qa.pages.AdvisorPage;
import com.qa.pages.ClientPage;
import com.qa.pages.CompaniesPage;
import com.qa.pages.CompliancePage;
import com.qa.pages.EmailPage;
import com.qa.pages.EmployeesPage;
import com.qa.pages.EventsPage;
import com.qa.pages.HomePage;
import com.qa.pages.InvoicesPage;
import com.qa.pages.Login;
import com.qa.pages.ReportsPage;
import com.qa.pages.RequestPage;
import com.qa.pages.SurveysPage;
import com.qa.util.ConfigFileReader;
import com.qa.util.PageObjectManagers;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class commonSteps extends ConfigFileReader{
	 PageObjectManagers pageObjectManager;
	WebDriver driver;
	AccountingPage accountingPage;
	 AdminPage adminPage;
	 HomePage homePage;
	 AdvisorPage advisorPage;
	 ClientPage clientPage;
	 CompaniesPage companiesPage;
	 CompliancePage compliancePage;
	 EmailPage emailPage;
	 EmployeesPage employeesPage;
	 EventsPage eventsPage;
	 InvoicesPage invoicesPage;
	 Login loginPage;  
	 ReportsPage reportsPage;
	 RequestPage requestPage;
	 SurveysPage surveysPage;	
	 ConfigFileReader configFileReader;
	 private Object WebElement;
	
	
	@Then("^user checks the checkbox \"([^\"]*)\"$")
	public void user_checks_the_checkbox(String arg1) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'"+arg1+"')]"));
		
		try
		{
		element.click();
		ConfigFileReader.takeScreenshots(driver);		
		}
		catch (Exception e)
		{
			System.out.println("Unable to check the checkbox");
			ConfigFileReader.failScreenshots(driver, element,arg1);
		}
	   
	}
	
	@Then("^user clicks on the button \"([^\"]*)\"$")
	public void user_clicks_on_the_button(String arg1) throws Throwable {
		try
		{
			driver.findElement(By.xpath("//*[contains(@value,'"+arg1+"') or text()='"+arg1+"']")).click();
		}
		catch (Exception e)
		{
			driver.findElement(By.xpath("(//*[contains(@value,'"+arg1+"') or text()='"+arg1+"'])[2]")).click();
		}
	}
	
	@Then("^user waits for \"([^\"]*)\" milliseconds$")
	public void user_waits_for_milliseconds(long arg1) throws Throwable {
	    Thread.sleep(arg1);
	}
		
	@Then("^user clicks on the link \"([^\"]*)\"$")
	public void user_clicks_on_the_link(String arg1) throws Throwable {
		try
		{
			driver.findElement(By.xpath("(//*[contains(text(),'"+arg1+"')])[2]")).click();
		}
		catch (Exception e)
		{
			driver.findElement(By.xpath("(//*[contains(text(),'"+arg1+"')])")).click();
		}
	}
	
	@Then("^user selects \"([^\"]*)\" from dropdown \"([^\"]*)\"$")
	public void user_selects_from_dropdown(String arg1, String arg2) throws Throwable {
		
		try
		{
			Select selectByValue = new Select(driver.findElement(By.xpath("//*[text()='"+arg2+"']/./following-sibling::select")));
			selectByValue.selectByVisibleText(arg1);
		}
		catch (Exception e)
		{
			try
		{
			Select selectByValue = new Select(driver.findElement(By.xpath("//*[text()='"+arg2+"']/../following-sibling::td//div//select")));
			selectByValue.selectByVisibleText(arg1);
		}
			catch (Exception ei)
		{
			
		}
		}
	}
	
	@Then("^user enters \"([^\"]*)\" in textbox \"([^\"]*)\"$")
	public void user_enters_in_textbox(String arg1, String arg2) throws Throwable {
			requestPage = pageObjectManager.getRequestPage();
			clientPage = pageObjectManager.getClientPage();
			advisorPage = pageObjectManager.getAdvisorPage();
			
		if(arg2.contains("/"))
		{
			String[] arg=  arg2.split("/");
			
			
			
			if(arg[1].equalsIgnoreCase("CreateContract"))
			{
				
				WebElement text = driver.findElement(By.xpath("//*[text()='"+arg[0]+"']/./following-sibling::input[@type='text']"));
				text.sendKeys(arg1);
				ConfigFileReader.takeScreenshots(driver);
			}
			
			if(arg[1].equalsIgnoreCase("CreateClient"))
			{
				try
				{
					WebElement text = driver.findElement(By.xpath("//*[text()='"+arg[0]+"']/../following-sibling::td//div//input[@type='text']"));
					text.sendKeys(arg1);
					ConfigFileReader.takeScreenshots(driver);
				}
				catch (Exception e)
				{
					if(arg[0].contains("* "))
					{
						String[] withoutStarName= arg[0].split("\\* ");
						System.out.println(withoutStarName[1]);
						WebElement text = driver.findElement(By.xpath("//*[text()='"+withoutStarName[1]+"']/../following-sibling::td//div//input[@type='text']"));
						text.sendKeys(arg1);
						ConfigFileReader.takeScreenshots(driver);
					}
				}
			}
		}
	
		
	}
	
	@Then("^user enters \"([^\"]*)\" in textbox \"([^\"]*)\" and index \"([^\"]*)\"$")
	public void user_enters_in_textbox_and_index(String arg1, String arg2, String arg3) throws Throwable 
		{				
			if(arg2.contains("*"))
				{
					try
					{
						  WebElement textName =driver.findElement(By.xpath("//*[text()='"+arg2+"']/../following-sibling::td//input[@type='text']"));
						  textName.sendKeys(arg1);
						  Thread.sleep(5000);
						  int convertValue = Integer.parseInt(arg3);
						  Actions actions = new Actions(driver);
					for(int i=0; i<=convertValue; i++)
					{
						actions.sendKeys(Keys.DOWN).build().perform();
					}
				  		actions.sendKeys(Keys.ENTER).build().perform();
					}
					catch (Exception e)
					{
						if(arg2.contains("* "))
						{
								String[] withoutStarName= arg2.split("\\* ");
								WebElement textName =driver.findElement(By.xpath("//*[text()='"+withoutStarName[1]+"']/../following-sibling::td//input[@type='text']"));
								textName.sendKeys(arg1);
								Thread.sleep(5000);
								int convertValue = Integer.parseInt(arg3);
								Actions actions = new Actions(driver);
								
						  for(int i=0; i<=convertValue; i++)
							{
								actions.sendKeys(Keys.DOWN).build().perform();
							}
						  		actions.sendKeys(Keys.ENTER).build().perform();
						}
					}
				}		
		}
	
	@Then("^user verifies the text \"([^\"]*)\" for label \"([^\"]*)\"$")
	public void user_verifies_the_text_for_label(String arg1, String arg2) throws Throwable 
	{
		//WebElement verification = driver.findElement(By.xpath("(//*[contains(text(),'"+arg1+"')])[1]"));
		WebElement verification = driver.findElement(By.xpath("(//td[contains(text(),'"+arg2+"')]/following-sibling::td)[1]"));
		String Actual = verification.getText();	
		try
					    
		{    
			    
			    if(Actual!=arg1)
			    	{
			    	
			    		ConfigFileReader.failScreenshots(driver , verification ,arg1);
			    		System.out.println("Values did not match:");
			    		System.out.println("Actual was is:"+Actual+"  Expected value is"+arg1+"");
			    	
			    		driver.close();
			    	}
			    else 
				    {
				    	ConfigFileReader.takeScreenshots(driver);
				    	Assert.assertEquals(Actual, arg1);
				    }
			    
			    
			
		}
		catch(Exception e)
		{
			
		}
	}
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
	   try
	   {
		configFileReader= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(configFileReader.getPageLoadTimeout(),TimeUnit.SECONDS);
		pageObjectManager = new PageObjectManagers(driver);
		
		//Delete Existing Screenshots in screenshots folder
		File file = new File("D:\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\screenshots\\");      
		String[] myFiles;    
		if (file.isDirectory()) {
		    myFiles = file.list();
		    for (int i = 0; i < myFiles.length; i++) {
		        File myFile = new File(file, myFiles[i]); 
		        myFile.delete();
		    }
		}
		//Delete Existing Screenshots in Fail screenshot folder
		File file1 = new File("D:\\CucumberSeleniumFramework-master\\CucumberSeleniumFramework-master\\Failscreenshot\\");      
		String[] myFiles1;    
		if (file1.isDirectory()) {
		    myFiles1 = file1.list();
		    for (int i = 0; i < myFiles1.length; i++) {
		        File myFile1 = new File(file1, myFiles1[i]); 
		        myFile1.delete();
		    }
		}
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage();	
		
	   }
	   catch (Exception e)
	   {
		   System.out.println("URL not mentioend in Config File");
	   }
	    
	}


	@Then("^user logs onto system$")
	public void user_logs_onto_system() throws Throwable {
		loginPage = pageObjectManager.getLoginPage();
		homePage = loginPage.login(configFileReader.getId(), configFileReader.getPassword());
		
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		homePage = pageObjectManager.getHomePage();
		String hometitle = homePage.verifyHomepagetitle();
		  Assert.assertEquals("CRM :: Home", hometitle); 
	}

	@Then("^user clicks on Request Tab$")
	public void user_clicks_on_Request_Tab() throws Throwable {
	    requestPage = pageObjectManager.getRequestPage();
	    requestPage.clickOnRequestLink();  
	}
	
	@Then("^user clicks on Advisor Tab$")
	public void user_clicks_on_Advisor_Tab() throws Throwable {
	    homePage.clickOnAdvisorLink();
	 }
	
	@Then("^user clicks on Clients Tab$")
	public void user_clicks_on_Clients_Tab() throws Throwable {
		clientPage = pageObjectManager.getClientPage();
		clientPage.clickOnClientLink();
	}
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		
		ConfigFileReader.pdfScreenshots();
	    driver.close();
	}
	
	@Then("^user clicks on CreateRequest link$")
	public void user_clicks_on_CreateRequest_link() throws Throwable {
		requestPage = pageObjectManager.getRequestPage();
	    requestPage.createRequestClick();
	}
	
	@Then("^user clicks on CreateContract link$")
	public void user_clicks_on_CreateContract_link() throws Throwable {
		clientPage = pageObjectManager.getClientPage();
		clientPage.clickCreateContract();
	}
	
	@Then("^user checks \"([^\"]*)\" checkbox for Client Organization Sector$")
	public void user_checks_checkbox_for_Client_Organization_Sector(String arg1) throws Throwable {
	    
	}

}
