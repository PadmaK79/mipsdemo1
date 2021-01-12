package com.mipsdemo.salesforcetest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewOpportunityPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\padma.kavitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://meritagehomes--qa.my.salesforce.com");
		driver.manage().window().maximize();
		//Loginpage - Logo and Title (Login | Salesforce)
		
		//driver.findElementById("logo").getText();
		
		//Username and Pwd-Login
		driver.findElement(By.id("username")).sendKeys("Padma.Kavitha@meritagehomes.com.qa");
		driver.findElement(By.id("password")).sendKeys("Kavimerit#12");
		driver.findElement(By.id("Login")).click();
        
		//Remind me later
		driver.findElement(By.linkText("Remind Me Later")).click();
		Thread.sleep(20000);
		
		//Home Page - Title
		//driver.findElementByXPath("//span[@title='Meritage I/S']").getText();
		
				
		
		//App launcher - 9 dots -click-focus on search textbox, send value and enter
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(4000);
		
		//Search - Standard Opportunities
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("StandardOpportunities");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
/*
		//Click "New" button
			
		driver.findElement(By.xpath("//div[@class='test-listViewManager slds-card slds-card_boundary slds-grid slds-grid--vertical forceListViewManager']//a[@title='New']")).click();
		Thread.sleep(4000);
		/*
		//New Opportunity Pop up
		
		//Opportunity Info - Close Date- Select Date		
		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[1]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='7']").click();
		Thread.sleep(2000);
		
		//Opportunity Name
		driver.findElementByXPath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[1]/input").sendKeys("Padma Test");
		Thread.sleep(2000);
		
		//Lead Inquiry Date- Select Date
		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[2]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='6']").click();
		Thread.sleep(2000);
		
		//Stage-Select value
		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[2]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[text()='1st Visit'])[1]").click();
		Thread.sleep(2000);
		
		//Walk in Date- Select Date
		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[3]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='7']").click();
		Thread.sleep(2000);
		
		//Amount
		driver.findElementByXPath("//input[@class='input uiInputSmartNumber uiInput uiInput--default uiInput--input']").sendKeys("1000");
		Thread.sleep(2000);
		
		//Community-search
		driver.findElementByXPath("//input[@title=\"Search Communities\"]").sendKeys("velvendo - 70s");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title=\"Search Communities\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        //driver.findElementByLinkText("Velvendo - 70s").click();
        //driver.findElementByXPath("//a[@title='Velvendo - 70s']").click();
        //Thread.sleep(5000);
        
        //Community number
        driver.findElementByXPath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[2]/input").sendKeys("123456");
        Thread.sleep(1000);
        
        //Sale Date - Select Date 
        driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[4]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='6']").click();
		Thread.sleep(2000);
		
		
		//Escrow Status 
		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[3]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[text()='Active'])[1]").click();
		Thread.sleep(2000);
		
		//contingency
		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[4]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[@title='Home to Close']").click();
		Thread.sleep(2000);
		
		//Customer Name
		driver.findElementByXPath("//input[@title=\"Search Accounts\"]").sendKeys("Test Padma");
  		Thread.sleep(3000);
  		driver.findElementByXPath("//input[@title=\"Search Accounts\"]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("//input[@title=\"Search Accounts\"]").sendKeys(Keys.ENTER);
  		Thread.sleep(1000);
  		
  		//Opp completion Date - select date
  		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[5]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='6']").click();
		Thread.sleep(3000);
		
		//Primary Sales Associate
		driver.findElementByXPath("(//div[@class='uiInput forceSearchInputLookupDesktop uiInput--default'])[3]/div/div/div/div/input").sendKeys("Test");
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='uiInput forceSearchInputLookupDesktop uiInput--default'])[3]/div/div/div/div/input").sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElementByLinkText("Test User3").click();
		Thread.sleep(3000);
		
		//Original Inside Sales
		driver.findElementByXPath("(//div[@class='uiInput forceSearchInputLookupDesktop uiInput--default'])[4]/div/div/div/div/input").sendKeys("Kirsten Smith");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//div[@class='uiInput forceSearchInputLookupDesktop uiInput--default'])[4]/div/div/div/div/input").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//div[@class='uiInput forceSearchInputLookupDesktop uiInput--default'])[4]/div/div/div/div/input").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Realtor Company
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[2]").sendKeys("Test Padma");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[2]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[2]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Primary Sales Associate Profile Name
  		
  		driver.findElementByXPath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[3]/input").sendKeys("Padma");
  		Thread.sleep(1000);
  		
  		//Realtor Name
  		driver.findElementByXPath("(//input[@title='Search Related Contacts'])[1]").sendKeys("Kevin Kirs");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search Related Contacts'])[1]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//input[@title='Search Related Contacts'])[1]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Sales Associate phone
  		
  		driver.findElementByXPath("(//input[@title='Search People'])[3]").sendKeys("Kirsten Smith");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search People'])[3]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//input[@title='Search People'])[3]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Lender Name
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[3]").sendKeys("New World Financial - TEST");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[3]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[3]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Hand off Date-select date
  		driver.findElementByXPath("(//div[@class='dateTime-inputDate form-element form-element__control'])/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[contains(@class,'slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default')][normalize-space()='7']").click();
		Thread.sleep(3000);
		
		//Loan Officer Name
		driver.findElementByXPath("(//input[@title='Search Related Contacts'])[2]").sendKeys("Kirsten Hanson");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search Related Contacts'])[2]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//input[@title='Search Related Contacts'])[2]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Notes
  		driver.findElementByXPath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[1]/textarea").sendKeys("Test Notes");
  		Thread.sleep(2000);
  		
  		//Loan Pre-Qualification Date-Select Date
  		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[6]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='6']").click();
		Thread.sleep(3000);
		
		//Mobile Registration
		driver.findElementByXPath("(//div[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox'])[1]/input").click();
		Thread.sleep(2000);
  		
		//Referred By
		driver.findElementByXPath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[4]/input").sendKeys("Padma");
		Thread.sleep(2000);
		
		//Original Customer Status
		driver.findElementByXPath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[5]/input").sendKeys("Active");
		Thread.sleep(2000);
		
		//Sales Associate 2
		driver.findElementByXPath("(//input[@title='Search People'])[4]").sendKeys("Sales Test2");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search People'])[4]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//input[@title='Search People'])[4]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		
  		//Owners Manager
  		
  		driver.findElementByXPath("(//input[@title='Search People'])[5]").sendKeys("Test");
  		Thread.sleep(3000);
  		driver.findElementByXPath("(//input[@title='Search People'])[5]").sendKeys(Keys.ENTER);
  		Thread.sleep(2000);
  		driver.findElementByLinkText("Sales Test2").click();
  		Thread.sleep(2000);
  		
  		//Web Lead
  		driver.findElementByXPath("(//div[@class='uiInput uiInputCheckbox uiInput--default uiInput--checkbox'])[2]/input").click();
  		Thread.sleep(2000);
  		
  		//MH.com.URI
  		driver.findElementByXPath(" (//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[6]/input").sendKeys("Test MH");
  		Thread.sleep(2000);
  		
  	//Registration Card
  		
  		//Are you working with a Realtor  		
  		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[5]").click();
  		Thread.sleep(2000);
  		driver.findElementByXPath("//a[text()='Yes']").click();
  		Thread.sleep(2000);
  		
  		//Current Living Situation
  		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[6]").click();
  		Thread.sleep(2000);
  		driver.findElementByXPath("//a[text()='Rent']").click();
  		Thread.sleep(2000);
  		
  		//When is the ideal time frame for you
  		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[7]").click();
  		Thread.sleep(2000);
  		driver.findElementByXPath("//a[text()='1 month']").click();
  		Thread.sleep(2000);
  		
  		//What marketing source
  		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[8]").click();
  		Thread.sleep(2000);
  		driver.findElementByXPath("//a[text()='Billboards']").click();
  		Thread.sleep(2000);
  		
  		//When is the ideal time frame for you (3)
  		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[9]").click();
  		Thread.sleep(2000);
  		driver.findElementByXPath("(//a[text()='6 months'])[2]").click();
  		Thread.sleep(2000);
  		
  		//Desired Monthly Payment? 
  		driver.findElementByXPath("(//div[@class='uiPopupTrigger'])[10]").click();
  		Thread.sleep(2000);
  		driver.findElementByXPath("//a[text()='$1001 - 2000']").click();
  		Thread.sleep(2000);
  		
  		//Why are you looking for a new home (4)- Yet to find
  		
  		
  		//Ideal date to move-SelectbDate
  		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[7]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='6']").click();
		Thread.sleep(3000);
  		
		//Other Consideration 
		driver.findElementByXPath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[7]/input").sendKeys("Test Consideration");
		Thread.sleep(2000);
		
		//Registration Card 4:2 and Buying Formula
		
		//Current Dissatisfaction
		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[2]/textarea")).sendKeys("Test1");
  		Thread.sleep(2000);
  		
  		// Describe back story
  		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[3]/textarea")).sendKeys("Test2");
  		Thread.sleep(2000);
  		
  	    // Must haves/future promise
  		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[4]/textarea")).sendKeys("Test3");
  		Thread.sleep(2000);	
  		
  	    // Fears of moving
  		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[5]/textarea")).sendKeys("Test4");
  		Thread.sleep(2000);	
  		
  	    // Desired price range from
  		driver.findElement(By.xpath("//div[@class='uiInput uiInput--default uiInput--input']/input")).sendKeys("1000");
  		Thread.sleep(2000);
  		
  		// First visit commitment
  		driver.findElementByXPath("(//div[@class='uiInput uiInputSelect forceInputPicklist uiInput--default uiInput--select'])[10]/div/div/div/div/a").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Write Purchase Agreement']").click();
		Thread.sleep(2000);
		
		
		
		//Opportunity Assessment
		
		//Assessment Date- Select Date
		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[8]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[contains(@class,'slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default')][normalize-space()='5']").click();
		Thread.sleep(3000);
		
		//Registration Card
		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[1]/input").sendKeys("1");
		Thread.sleep(2000);
		
		//Grader
		driver.findElementByXPath("(//input[@title='Search People'])[6]").sendKeys("Sales Test2");
  		Thread.sleep(4000);
  		driver.findElementByXPath("(//input[@title='Search People'])[6]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(4000);
  		driver.findElementByXPath("(//input[@title='Search People'])[6]").sendKeys(Keys.ENTER);
  		Thread.sleep(5000);
  		//driver.findElementByLinkText("Kirsten Smith").click();
  		
  		//Discovery
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[2]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Thankyou
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[3]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Follow Up
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[4]/input").sendKeys("3");
  		Thread.sleep(3000);
  		
		
		
  		//System Information
  		//Approved Sale Count
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[5]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Total open Sales
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[6]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Cancelled/Transferred Sale Count
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[7]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Total Sale count
  		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[8]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Latest Cancel Date- Select Date
  		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[9]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='4']").click();
		Thread.sleep(3000);
  		
		//Total Reconfiguered Sale count
		driver.findElementByXPath("(//div[@class='uiInput uiInputNumber uiInput--default uiInput--input'])[9]/input").sendKeys("1");
  		Thread.sleep(3000);
  		
  		//Latest Sale Date-Select Date
  		driver.findElementByXPath("(//div[@class='uiInput uiInputDate uiInput--default uiInput--input uiInput--datetime'])[10]/div/input").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='5']").click();
		Thread.sleep(3000);
		
		//Account Name
		driver.findElementByXPath("(//input[@title='Search Accounts'])[4]").sendKeys("Test Padma");
  		Thread.sleep(4000);
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[4]").sendKeys(Keys.ARROW_DOWN);
  		Thread.sleep(4000);
  		driver.findElementByXPath("(//input[@title='Search Accounts'])[4]").sendKeys(Keys.ENTER);
  		Thread.sleep(5000);
  		
  		/*
  	   //Cancel button
  	   driver.findElementByXPath("//button[@title='Cancel']").click();
  			
  	   //Save and New button
  	   driver.findElementByXPath("//button[@title='Save & New']").click();
  		
  	   //Save button
  	   driver.findElementByXPath("//button[@title='Save']").click();
  			
  		*/
	}

}
