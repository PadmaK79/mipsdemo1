package com.mipsdemo.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mipsdemo.base.TestBase;

import junit.textui.TestRunner;

public class HomePage extends TestRunner {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)	{
		
		PageFactory.initElements(driver, this);
		
		}
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@class='slds-icon-waffle']")
	@CacheLookup
	private WebElement appLauncher;
	
	@FindBy(xpath="//input[@placeholder='Search apps and items...']")
	@CacheLookup
	private WebElement searchStandardOpportunity;
	
	
	
	
	
	//Method
	
	public String validateHomePageTitle() {		
		return driver.getTitle();				
	}
	
	public void appdots() {		
		appLauncher.click();		
	}
	
	public StandardOpportunityPage searchstandardopp() {		
		searchStandardOpportunity.sendKeys("StandardOpportunities");
		searchStandardOpportunity.sendKeys(Keys.ENTER);	
		
		return new StandardOpportunityPage();
	}
	
	
	
	
	
	

}
