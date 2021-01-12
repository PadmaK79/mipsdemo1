package com.mipsdemo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mipsdemo.base.TestBase;

public class NewStandardOpportunityPopup extends TestBase{
	
	WebDriver driver;
	
	public NewStandardOpportunityPopup(WebDriver driver)	{
		
		PageFactory.initElements(driver, this);		
		
		}

	public NewStandardOpportunityPopup() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[1]/div/input")
	@CacheLookup
	private WebElement closeDate;
	
	@FindBy(xpath="//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='7']")
	@CacheLookup
	private WebElement closeDateSelect;
	
	@FindBy(xpath="(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[1]/input")
	@CacheLookup
	private WebElement opportunityName;
	
	@FindBy(xpath="(//div[@class='uiPopupTrigger'])[2]")
	@CacheLookup
	private WebElement stageDD;
	
	@FindBy(xpath="(//a[text()='1st Visit'])[1]")
	@CacheLookup
	private WebElement stageValueSelect;
	
	@FindBy(xpath="(//div[@class='uiPopupTrigger'])[3]")
	@CacheLookup
	private WebElement escrowDD;
	
	@FindBy(xpath="(//a[text()='Active'])[1]")
	@CacheLookup
	private WebElement escrowValueSelect;
		
	@FindBy(xpath="(//div[@class='uiPopupTrigger'])[8]")
	@CacheLookup
	private WebElement marketingSourceDD;
	
	@FindBy(xpath="(//div[@class='uiPopupTrigger'])[8]")
	@CacheLookup
	private WebElement marketingSourceValueSelect;
	
	@FindBy(xpath="//button[@title='Save']")
	@CacheLookup
	private WebElement savebtn;
	
	
	//Methods
	
	public void CloseDate() {
		
		closeDate.click();
		closeDateSelect.click();
		
	}
	
	public void OpportunityName() {
		
		opportunityName.sendKeys("Padma Test");
		
	}
	
	public void Stage() {
		
		stageDD.click();
		stageValueSelect.click();		
		
	}	
	
	public void EscrowStatus() {
		
		escrowDD.click();
		escrowValueSelect.click();
		
	}

	public void WhatMarketingSource() {
		
		marketingSourceDD.click();
		marketingSourceValueSelect.click();
	}
	/*
	public Object Save() {
		
		savebtn.click();
		
		return StandardOpportunityPage();
		
	}

	private Object StandardOpportunityPage() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}



		

