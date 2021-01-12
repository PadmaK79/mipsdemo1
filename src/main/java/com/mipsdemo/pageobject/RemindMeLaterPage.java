package com.mipsdemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mipsdemo.base.TestBase;

import junit.textui.TestRunner;

public class RemindMeLaterPage extends TestBase {
	
	@FindBy(linkText="Remind Me Later")
	@CacheLookup
	private WebElement RemindMeLater;
	
WebDriver driver;
	
	public RemindMeLaterPage(WebDriver driver)	{
		PageFactory.initElements(driver, this);		
		}	
	
	

	public void RemindMeLaterLink() {
		RemindMeLater.click();
	}

}
