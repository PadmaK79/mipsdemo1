package com.mipsdemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mipsdemo.base.TestBase;

public class StandardOpportunityPage extends TestBase{
	
	WebDriver driver;
	
	public StandardOpportunityPage(WebDriver driver)	{
		
		PageFactory.initElements(driver, this);
		
		}

	public StandardOpportunityPage() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[@class='test-listViewManager slds-card slds-card_boundary slds-grid slds-grid--vertical forceListViewManager']//a[@title='New']")
	@CacheLookup
	private WebElement newbtn;
	
	@FindBy(xpath="//a[@title='Test1']")
	@CacheLookup
	private WebElement clickExistingOpp;
	
	//Method
	
	public NewStandardOpportunityPopup newoppbtn() {	
		newbtn.click();		
		return new NewStandardOpportunityPopup();
	}
	
	public EditStandardOpportunityPage clickexistingopportunity() {
		
		clickExistingOpp.click();
		return new EditStandardOpportunityPage();
		
	}
	
	
	

}
