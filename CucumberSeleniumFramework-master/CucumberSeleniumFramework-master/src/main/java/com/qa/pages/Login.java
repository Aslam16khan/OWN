package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
@FindBy(xpath = "//input[@id='loginId']")
public
WebElement Loginid;
@FindBy(xpath = "//input[@id='loginPassword']")
public
WebElement password;
@FindBy(xpath = "//input[@value='Login']")
public
WebElement loginBtn;
	public Login(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	public String validateLoginPageTitle() {
		String title=driver.getTitle();
		return title;
		
	}

	public HomePage login(String un, String pwd) {
		Loginid.sendKeys(un);
		password.sendKeys(pwd);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
		return new HomePage(driver);
		
		
	}

}
