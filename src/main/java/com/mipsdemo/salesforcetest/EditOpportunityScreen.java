package com.mipsdemo.salesforcetest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditOpportunityScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\padma.kavitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://meritagehomes--qa.my.salesforce.com");
		driver.manage().window().maximize();
		
		//Username and Pwd-Login
		driver.findElement(By.id("username")).sendKeys("Padma.Kavitha@meritagehomes.com.qa");
		driver.findElement(By.id("password")).sendKeys("Kavimerit#12");
		driver.findElement(By.id("Login")).click();
        
		//Remind me later
		driver.findElement(By.linkText("Remind Me Later")).click();
		
		Thread.sleep(30000);
		
		
		
		//App launcher - 9 dots -click-focus on search textbox, send value and enter
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("StandardOpportunities");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Standard Oppurtunity page Existing- Delete,gene quo, cancel,detailstab
		
		driver.findElement(By.xpath("//a[@title=\"Test1\"]")).click();
		Thread.sleep(6000);
				
		
		/*
		//Delete-Click
				
		driver.findElementByXPath("//button[@name='Delete']").click();
		Thread.sleep(2000);
		
		//Delete Popup- Cancel button
		
		driver.findElementByXPath("//button[@title='Cancel']").click();
		Thread.sleep(2000);
		
		//Delete Popup- Delete button
		
		driver.findElementByXPath("//button[@title='Delete']").click();
		Thread.sleep(2000);
		
		
		//Dropdown
		 driver.findElementByXPath("//button[@class='slds-button slds-button_icon-border-filled']").click();
		 Thread.sleep(4000);
		 
		//Generate quote - DD
			driver.findElement(By.xpath("//span[text()='Generate Quote']")).click();
			Thread.sleep(4000);
			
		//Cancel - Popup
			driver.findElement(By.xpath("//button[@title='Cancel']")).click();
			Thread.sleep(2000); 
			
		
			
		//Details Tab
			driver.findElementByXPath("//*[@id='detailTab__item']").click();
			Thread.sleep(5000); 
			
	   //Edit Stage icon
			driver.findElementByXPath("//button[@title='Edit Stage']").click();
			Thread.sleep(2000);
			
	 //	Click Stage DD
			
			driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[3]").click();
			Thread.sleep(2000);
	//Select Engagement
			driver.findElement(By.xpath("//*[@data-value='Engagement']")).click();
			Thread.sleep(2000);
			
			
	//Scroll and find First Visit commitment
			 
			JavascriptExecutor js= (JavascriptExecutor) driver;
			WebElement ele = driver.findElementByXPath("//label[text()='First Visit Commitment']");
			js.executeScript("arguments[0].scrollIntoView()", ele);

	//Select DD-First Visit commitment		
			driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[23]").click();
			Thread.sleep(2000);
	//Select -value -Write Purchase Agreement -DD		
			driver.findElement(By.xpath("//*[@data-value='Write Purchase Agreement']")).click();
			Thread.sleep(2000);
	//Click Save		
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			Thread.sleep(10000);		
	
			
	//Scroll-top-find-Mark Stage as complete -text		
			JavascriptExecutor js1= (JavascriptExecutor) driver;
			WebElement ele1 = driver.findElementByXPath("//*[@data-tab-name='Closed']");
			//WebElement ele1 = driver.findElementByXPath("//span[text()=\"Mark Stage as Complete\"]");
			js.executeScript("arguments[0].scrollIntoView()",ele1);
			
	//click Details tab-to come out of the focus from edit pencil		
			driver.findElement(By.xpath("//*[@id='activityTab__item']")).click();
			Thread.sleep(5000);
			
			
	//Mark Stage as complete.-Sale Pending
			Actions action = new Actions(driver);
			WebElement link = driver.findElementByXPath("//flexipage-component2[@data-component-id='runtime_sales_pathassistant_pathAssistant'] //button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction current uiButton']");
			action.doubleClick(link).perform();
			Thread.sleep(8000);
			
	//Mark Stage as complete.-Nurturing	
			
			Actions action1 = new Actions(driver);
			WebElement link1 = driver.findElementByXPath("//button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction current uiButton']");
			action1.doubleClick(link1).perform();
			Thread.sleep(8000);
			
	//Mark Stage as complete.-Closed
			Actions action2 = new Actions(driver);
			WebElement link2 = driver.findElementByXPath("//button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction current uiButton']");
			action2.doubleClick(link2).perform();
			Thread.sleep(5000);
			
	//Edit Dependencies - Pop up- Done button
			
			//driver.findElementByXPath("//button[contains(text(),'Done')]").click();
			driver.findElementByXPath("//button[@type='submit']").click();
			Thread.sleep(10000);
				
		
		
	//Change closed Stage
			Actions action3 = new Actions(driver);
			WebElement link3 = driver.findElementByXPath("//button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction current uiButton']");
			action3.doubleClick(link3).perform();
			Thread.sleep(10000);
			*/
		
	//Details Tab
		driver.findElementByXPath("//*[@id='detailTab__item']").click();
		Thread.sleep(5000); 
			
	
	 //Edit Stage icon
			driver.findElementByXPath("//button[@title='Edit Stage']").click();
			Thread.sleep(2000);
			
	 //	Click Stage DD
			
			driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[3]").click();
			Thread.sleep(2000);
	//Select closed won
			driver.findElement(By.xpath("//*[@data-value='Closed Won']")).click();
			Thread.sleep(2000);
			
		//Click Save		
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			Thread.sleep(10000);
			
			 //Edit Stage icon
			driver.findElementByXPath("//button[@title='Edit Stage']").click();
			Thread.sleep(2000);
			
	 //	Click Stage DD
			
			driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[3]").click();
			Thread.sleep(2000);
			
	//Select Closed Lost
			driver.findElement(By.xpath("//*[@data-value='Closed Lost']")).click();
			Thread.sleep(2000);		
	 
     //	Click Stage DD
			
			driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[2]").click();
			Thread.sleep(2000);		
			
		//Select Decided not to move
			driver.findElement(By.xpath("//*[@data-value='Decided Not To Move']")).click();
			Thread.sleep(2000);	
	 		
		//Click Save		
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			Thread.sleep(10000);
				
				
				
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			/*
	//Edit Dependencies - Pop up- Stage DD-Select value - Closed Lost- Not working
			driver.findElementByXPath("(//lightning-combobox[@class='slds-form-element'])[1]/div/lightning-base-combobox/div/div/input").sendKeys(Keys.ENTER);
			//driver.findElementByXPath("//div[@class='modal-container slds-modal__container']/div[2] //input[@name='StageName']").click();
			//driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[2]").sendKeys(Keys.ENTER);
			
	        //driver.findElementByXPath("//input[@name='StageName']").click();
	        Thread.sleep(5000);
	        
	        driver.findElementByXPath("//lightning-base-combobox-item[@data-value='Closed Lost']").click();
	        Thread.sleep(5000);
	        /*
	 //Edit Dependencies - Pop up- Closed Lost Reason DD-Select value - Decided not to move - Not working
	        driver.findElementByXPath("(//input[@class='slds-input slds-combobox__input'])[3]").click();
	        //driver.findElementByXPath("//input[@name='Closed_Lost_Reason__c']").click();
	        Thread.sleep(5000);
	        
	        driver.findElementByXPath("//lightning-base-combobox-item[@data-value='Decided Not To Move']").click();
	        Thread.sleep(5000);
	       
			
	//Edit Dependencies - Pop up- Done button - Not working
	        //driver.findElementByXPath("//button[contains(text(),'Done')]").click();
			driver.findElementByXPath("//button[@type='submit']").click();
			Thread.sleep(8000);	
		 
		 /*
	//Edit Dependencies - Pop up- Cancel button	-- Not working	
			driver.findElementByXPath("//button[contains(text(),'Cancel')]").click();	
			Thread.sleep(2000);
	         
			
		 
				/*
				
	
				
				
	
				
				//Opp page-Details Tab
				
				
				
				

				
		//Scroll and find First Visit commitment
		 
				JavascriptExecutor js= (JavascriptExecutor) driver;
				WebElement ele = driver.findElementByXPath("//label[text()=\"First Visit Commitment\"]");
				js.executeScript("arguments[0].scrollIntoView()", ele);

		//Select DD-First Visit commitment		
				driver.findElement(By.xpath("(//*[@class=\"slds-input slds-combobox__input\"])[23]")).click();
				Thread.sleep(2000);
		//Select -value -Write Purchase Aggreement -DD		
				driver.findElement(By.xpath("//*[@data-value=\"Write Purchase Agreement\"]")).click();
				Thread.sleep(2000);
		//Click Save		
				driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
				Thread.sleep(12000);

		//Scroll-top-find-Mark Stage as complete -text		
				JavascriptExecutor js1= (JavascriptExecutor) driver;
				WebElement ele1 = driver.findElementByXPath("//*[@data-tab-name='Closed']");
				//WebElement ele1 = driver.findElementByXPath("//span[text()=\"Mark Stage as Complete\"]");
				js.executeScript("arguments[0].scrollIntoView()",ele1);

		//click Details tab-to come out of the focus from edit pencil		
				driver.findElement(By.xpath("//*[@id=\"detailTab__item\"]")).click();
				Thread.sleep(8000);
		//click frame	
				driver.findElement(By.xpath("//div[@class='slds-card__body slds-card__body_inner']")).click();
				Thread.sleep(8000);
				//driver.findElement(By.xpath("//article[@class=\"slds-card\"]")).click();
				
				

				
		
				//Edit stage		
				/*
				driver.findElement(By.xpath("//button[@title=\"Edit Stage\"]")).click();
				Thread.sleep(2000);
		//Edit stage -DD		
				driver.findElement(By.xpath("(//*[@class="slds-input slds-combobox__input"])[23]")).click();
				Thread.sleep(2000);
				
				/*
		//Details - Edit Stage		
				driver.findElement(By.xpath("//button[@title=\"Edit Stage\"]")).click();
				Thread.sleep(2000);
//			Details - Edit Stage-Dropdown click	
				driver.findElement(By.xpath("//*[@class=\"slds-form-element slds-form-element_stacked\"]/div/lightning-base-combobox/div/div/input")).click();
				Thread.sleep(2000);
//				Details - Edit Stage-Dropdown -Select -Engagement-Save	
				driver.findElement(By.xpath("//*[@data-value=\"Engagement\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
				Thread.sleep(3000);
		//Details - Edit Stage-Dropdown click-Select -Sale Pending-Save	
				driver.findElement(By.xpath("//button[@title=\"Edit Stage\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@class=\"slds-form-element slds-form-element_stacked\"]/div/lightning-base-combobox/div/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-value=\"Sale Pending\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
				Thread.sleep(3000);
		//Details - Edit Stage-Dropdown click-Select -Nurturing-Save		
				driver.findElement(By.xpath("//button[@title=\"Edit Stage\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@class=\"slds-form-element slds-form-element_stacked\"]/div/lightning-base-combobox/div/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-value=\"Nurturing\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
				Thread.sleep(3000);
		//Details - Edit Stage-Dropdown click-Select -Closed Won-Save			
				driver.findElement(By.xpath("//button[@title=\"Edit Stage\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@class=\"slds-form-element slds-form-element_stacked\"]/div/lightning-base-combobox/div/div/input")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@data-value=\"Closed Won\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id=\"detailTab__item\"]")).click();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//article[@class=\"slds-card\"]")).click();
				
				//driver.findElement(By.xpath("(//*[@class=\"uiOutputText\"])[1]")).click();

				
				/*- Change close stage-Not working
				article[@class="slds-card"]/div/div/div/div/div[2]/button
				//driver.findElement(By.xpath("//span[text()=\"Mark Stage as Complete\"]")).click();
				
				
				/*Details -Tab-Cancel button
				//driver.findElement(By.xpath("//button[@title=\"Cancel\"]")).click();
				
				/*Details -Tab- Edit Oppurtunity Name
				//driver.findElement(By.xpath("//button[@title=\"Edit Opportunity Name\"]")).click();
				
				 //Select listdropdown - Select and click Generate Quote-Click Cancel in popup- Select Details tab
		
		driver.findElement(By.xpath("(//*[@class='slds-button-group-list'])/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Generate Quote']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@title='Cancel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"detailTab__item\"]")).click();
		*/
				
				

	}

}
