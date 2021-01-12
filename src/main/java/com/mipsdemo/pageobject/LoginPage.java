package com.mipsdemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mipsdemo.base.TestBase;

import junit.textui.TestRunner;

public class LoginPage extends TestBase{	
	
	
	@FindBy(id="username")
	@CacheLookup
	private WebElement username;
	
	@FindBy(id="password")
	@CacheLookup
	private WebElement password;
	
	@FindBy(id="Login")
	@CacheLookup
	private WebElement loginbutton;
	
	
	/*
	@FindBy(id="logo")
	@CacheLookup
	private WebElement saleforceLogo;
	*/
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)	{
		PageFactory.initElements(driver, this);		
		}	
	
		

	public void enterUserName(String user_name) {		
		username.sendKeys(user_name);		
	}
	
	public void enterPassword(String user_password) {		
		password.sendKeys(user_password);
		}
	
	public void clickOnLogin() {		
		loginbutton.click();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	public String validateLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public boolean validatesaleforceImage() {
		
		return saleforceLogo.isDisplayed();
		
	}	
	
	
	public HomePage login(String user_name, String user_password ) {
		username.sendKeys(user_name);
		password.sendKeys(user_password);
		loginbutton.click();
		
		return new HomePage();
	}
*/

	
