package com.mipsdemo.salesforcetest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SF {

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
		
		
		
		//App launcher - 9 dots -click-focus on serach textbox, send value and enter
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys("StandardOpportunities");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search apps and items...']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//lightning-input[@class=\"searchBar slds-p-horizontal--small slds-p-top--small slds-form-element\"]/div/input")).sendKeys("StandardOpportunities");
		
		//driver.findElement(By.xpath("//lightning-input[@class=\"searchBar slds-p-horizontal--small slds-p-top--small slds-form-element\"]/div/input")).sendKeys(Keys.ENTER);
		
		
		//Click "New" button
		/*
		driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div[2]/div/div/div[1]/div[1]/div[2]/ul/li/a")).click();
		
		//Close Date -   (//*[@class=" input"])[1]
		
		 //Probability % -- //*[@class="input uiInputSmartNumber uiInput uiInputPercent uiInput--default uiInput--input"]
		
				
		//Close Date
		driver.findElement(By.xpath("//div[@class=\"slds-form slds-form_stacked slds-is-editing\"]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		
		//select date
		driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/span[1]")).click();
		
		//Cancel button
		//driver.findElement(By.xpath("//button[@title=\"Cancel\"]")).click();
		
		//Save and New button
		//driver.findElement(By.xpath("//button[@title=\"Save & New\"]")).click();
		
		
		//Enter Oppurtunity Name
		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Test1");
		
		//Lead Enquiry date
		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		
		//Select Date
		driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/span[1]")).click();
		
		//Walkin Date
		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		
		//Select Date
		driver.findElement(By.xpath("/html[1]/body[1]/div[9]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[5]/span[1]")).click();
		
		
		
		//Stage
		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
		//1st Visit
		driver.findElement(By.xpath("//a[@title=\"1st Visit\"]")).click();
		
		//Amount -
		
			driver.findElement(By.xpath("//*[@class=\"input uiInputSmartNumber uiInput uiInput--default uiInput--input\"]")).sendKeys("1000");	
		
		
		
		//Escrow Status DD-select
		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
		//Status -Active
		driver.findElement(By.xpath("//a[@title=\"Active\"]")).click();
		
		
		//Registration Card- What marketing source? (6)- DD - select
		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]//div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		
		//Billboards
		driver.findElement(By.xpath("//a[text()='Billboards']")).click();
		
		/*
		//Save button
		driver.findElement(By.xpath("//div[@class=\"actionsContainer\"]/div[2]/button[3]")).click();
		*/
		
		
		
		/*
		
		//Standard Oppurtunity page Existing- Delete,gene quo, cancel,detailstab
		
		driver.findElement(By.xpath("//a[@title=\"Test1\"]")).click();
		Thread.sleep(6000);
//Delete
		/*
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
//Cancel
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[1]")).click();
		Thread.sleep(2000);
		
//Standard Opputunity - Delete button- Click  Delete
		/*
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		
		*/
		/*
// Dropdown -Arrow
		
		//driver.findElementByCssSelector("lightning-button-menu.menu-button-item.slds-dropdown-trigger.slds-dropdown-trigger_click").click();
		//driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='slds-button-group-list'])/li[2]")).click();
		Thread.sleep(2000);
		
//Edit - DD
         driver.findElement(By.xpath("//a[@name='Edit']")).click();
         Thread.sleep(4000);
         
       //Lead Enquiry date
 		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
 		
 		//Select Date
 		driver.findElement(By.xpath("//span[normalize-space()='31']")).click();
 		
 		//Walkin Date
 		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
 		
 		//Select Date
 		driver.findElement(By.xpath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='1']")).click();
 		
 		//Select Stage
        driver.findElement(By.xpath("//a[contains(text(),'Engagement')]")).click();
        Thread.sleep(1000);
        //Select - Sale Pending
        driver.findElement(By.xpath("//a[contains(text(),'Sale Pending')]")).click();
        Thread.sleep(1000);
        
        //Amount
        
        driver.findElement(By.xpath("//input[@class=\"input uiInputSmartNumber uiInput uiInput--default uiInput--input\"]")).sendKeys("1000");
        Thread.sleep(1000);
        
        //Community
        
        driver.findElement(By.xpath("//input[@title=\"Search Communities\"]")).sendKeys("velvendo - 70s");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@title=\"Search Communities\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElementByCssSelector("a[title='Velvendo - 70s']").click();
        Thread.sleep(1000);
        
        //Community No
        driver.findElement(By.xpath("(//*[@class=\" input\"])[5]")).sendKeys("12346");
        Thread.sleep(1000);
         
        //Sale Date
        driver.findElement(By.xpath("(//*[@class=\" input\"])[6]")).click();
        driver.findElement(By.xpath("//span[@class='slds-day weekend nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='2']")).click();
        Thread.sleep(3000);
        
        
      //Escrow Status DD-select-Not working
        /*
      		driver.findElement(By.xpath("//div[@class=\"full forcePageBlock forceRecordLayout\"]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
      		Thread.sleep(1000);
      		
      		driver.findElementByCssSelector("li[role='presentation'] a[title='Engagement']").click();
      		Thread.sleep(1000);
      		*/
        /*
      		//Customer Name
      		driver.findElement(By.xpath("//input[@title=\"Search Accounts\"]")).sendKeys("Test Padma");
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("//input[@title=\"Search Accounts\"]")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//input[@title=\"Search Accounts\"]")).sendKeys(Keys.ENTER);
      		Thread.sleep(1000);
      		
      		//Opp compleion date
      		
      		driver.findElement(By.xpath("(//*[@class=\" input\"])[7]")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//span[@class='slds-day weekday nextMonth DESKTOP uiDayInMonthCell--default'][normalize-space()='1']")).click();
      		Thread.sleep(1000);
      		
      		//Original Inside Sales
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[14]/div/div/div/div/div/div/div/div/input")).sendKeys("Kirsten Smith");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[14]/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[14]/div/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(2000);
      		
      		
      		//Realtor company
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[14]/div[2]/div/div/div/div/div/div/div/input")).sendKeys("Test Padma");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[14]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[14]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		//Realtor Name
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[15]/div[2]/div/div/div/div/div/div/div/input")).sendKeys("Kevin Kirs");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[15]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[15]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		//Sales Associate Phone
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[16]/div[1]/div/div/div/div/div/div/div/input")).sendKeys("Kirsten Smith");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[16]/div[1]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[16]/div[1]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		//Lender Name
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[16]/div[2]/div/div/div/div/div/div/div/input")).sendKeys("New World Financial - TEST");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[16]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[16]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		     		
      		//HandOff Date
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[17]/div[1]/div/div/fieldset/div/div/input")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//*[@class=\"visible DESKTOP uiDatePicker--default uiDatePicker oneOne\"]/div/div[2]/table/tbody/tr[5]/td[5]/span")).click();
      		Thread.sleep(2000);
      		
      		//Loan Officer Name
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[17]/div[2]/div/div/div/div/div/div/div/input")).sendKeys("Kirsten Hanson");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[17]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[17]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		//Notes
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[18]/div[1]/div/div/div/textarea")).sendKeys("Test");
      		Thread.sleep(2000);
      		
      		//Loan Pre-qualification Date
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[18]/div[2]/div/div/div/div/input")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//*[@class=\"visible DESKTOP uiDatePicker--default uiDatePicker oneOne\"]/div/div[2]/table/tbody/tr[5]/td[5]/span")).click();
      		Thread.sleep(2000);
      		
      		//Referred By
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[19]/div[2]/div/div/div/input")).sendKeys("Padma");
      		Thread.sleep(3000);
      		
      		//Mobile Regis checkbox
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[20]/div[1]/div/div/div/input")).click();
      		Thread.sleep(2000);
      		
      		//Sales Associate 2
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[20]/div[2]/div/div/div/div/div/div/div/input")).sendKeys("Sales Test2");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[20]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[20]/div[2]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		//Web Lead - checkbox
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[21]/div[2]/div/div/div/input")).click();
      		Thread.sleep(3000);
      		
      		//MH.com URI
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[22]/div[2]/div/div/div/input")).sendKeys("Test");
      		Thread.sleep(3000);
      		
      		
//Owners Manager
      		
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[23]/div[1]/div/div/div/div/div/div/div/input")).sendKeys("Kirsten Smith");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[23]/div[1]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])/div[23]/div[1]/div/div/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
      		Thread.sleep(3000);
      		
      		//Registration Card - 1
      		
      		driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[6]")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//a[text()='Yes']")).click();
      		Thread.sleep(2000);
      		
      	//Registration Card - 2- current living situation
      		
      		driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[7]")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//a[text()='Rent']")).click();
      		Thread.sleep(2000);
      		
      		//Registration Card - 3
      		driver.findElement(By.xpath("(//div[@class='test-id__section-content slds-section__content section__content'])[1]/div/div[2]/div[1]/div/div/div/div/div/div/div/a")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//a[text()='1 month']")).click();
      		Thread.sleep(2000);
      		
      	//Registration Card - 5-when is the ideal time frame
      		
      		driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[10]")).click();
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//a[text()='6 months'])[2]")).click();
      		Thread.sleep(2000);
      		
      	//Registration Card - 6-Desired monthly payment
      		driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[11]")).click();
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//a[text()='$1001 - 2000']")).click();
      		Thread.sleep(2000);
      	
      	//Registration Card - 7-why are you looking for new home------Not working
      		/*
      		driver.findElement(By.xpath("(//div[@class='slds-dueling-list__options'])[1]/ul/li[2]")).click();
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("//button[@title='Move selection to Chosen']")).click();
      		Thread.sleep(2000);
      		*/
      		/*
      	//Registration Card - 8-Ideal date to move
      		driver.findElement(By.xpath("(//div[@class='form-element'])[7]")).click();
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("//*[@class=\"visible DESKTOP uiDatePicker--default uiDatePicker oneOne\"]/div/div[2]/table/tbody/tr[2]/td[3]/span")).click();
      		Thread.sleep(2000);
      		
      	//Registration Card - 9-Other Consideration
      		driver.findElement(By.xpath("(//div[@class='uiInput uiInputText uiInput--default uiInput--input'])[7]/input")).sendKeys("Test");
      		Thread.sleep(2000);
      		
      		
      	//Registration Card 4:2-- current dissatisfaction
      		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[2]/textarea")).sendKeys("Test1");
      		Thread.sleep(2000);
      		
      	//Registration Card 4:2-- Describe back story
      		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[3]/textarea")).sendKeys("Test2");
      		Thread.sleep(2000);
      		
      	//Registration Card 4:2-- Must haves/future promise
      		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[4]/textarea")).sendKeys("Test3");
      		Thread.sleep(2000);	
      		
      	//Registration Card 4:2-- Fears of moving
      		driver.findElement(By.xpath("(//div[@class='uiInput uiInputTextArea uiInput--default uiInput--textarea'])[5]/textarea")).sendKeys("Test4");
      		Thread.sleep(2000);	
      		
      	//Registration Card 4:2-- Desired price range from
      		driver.findElement(By.xpath("//div[@class='uiInput uiInput--default uiInput--input']/input")).sendKeys("1000");
      		Thread.sleep(2000);
      		
      		/*
      		
      	//Realtor Name -Not working
      		//driver.findElement(By.xpath("//span[text()='Realtor Name']/parent::label/parent::div")).click();
      		
      		driver.findElement(By.xpath("//span[text()='Realtor Name']/parent::label/parent::div")).sendKeys("Test Padma");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("//span[text()='Realtor Name']/parent::label/parent::div")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(2000);
      		driver.findElement(By.xpath("//span[text()='Realtor Name']/parent::label/parent::div")).sendKeys(Keys.ENTER);
      		/*
      		//Original Inside sales-Realtor company
      		
      		driver.findElement(By.xpath("(//input[@class=\" default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup\"])[3]")).sendKeys("Test Padma");
      		Thread.sleep(3000);
      		driver.findElement(By.xpath("(//input[@class=\" default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup\"])[3]")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(2000);
      		
      		driver.findElement(By.xpath("(//input[@class=\" default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup\"])[3]")).sendKeys(Keys.ENTER);
      		Thread.sleep(1000);
      		
      		
      		/*
      		//Kirsten Smith
      		// Realtor company
      		
      		driver.findElement(By.xpath("(//input[@class=\" default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup\"])[4]")).sendKeys("Test Padma");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//input[@class=\" default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup\"])[4]")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(2000);
      		
      		driver.findElement(By.xpath("(//input[@class=\" default input uiInput uiInputTextForAutocomplete uiInput--default uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup\"])[4]")).sendKeys(Keys.ENTER);
      		Thread.sleep(2000);
      		
      	//Realtor Name
      		driver.findElement(By.xpath("(//input[@title=\"Search Related Contacts\"])[1]")).sendKeys("Test Padma");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//input[@title=\"Search Related Contacts\"])[1]")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		
      		driver.findElement(By.xpath("(//input[@title=\"Search Related Contacts\"])[1]")).sendKeys(Keys.ENTER);
      		Thread.sleep(2000);
      		
      		//Sales Associate Phone
      		driver.findElement(By.xpath("(//input[@title=\"Search People\"])[3]")).sendKeys("Kirsten Smith");
      		Thread.sleep(4000);
      		driver.findElement(By.xpath("(//input[@title=\"Search People\"])[3]")).sendKeys(Keys.ARROW_DOWN);
      		Thread.sleep(3000);
      		
      		driver.findElement(By.xpath("(//input[@title=\"Search People\"])[3]")).sendKeys(Keys.ENTER);
      		Thread.sleep(2000);
      		
      		
      		
      		
      		/*
      		//Handoff Date
         driver.findElementByCssSelector("div.form-element:nth-child(1) > input").click();
         Thread.sleep(1000);
         //Select calendar Date
         driver.findElement(By.xpath("//span[@class='slds-day weekday DESKTOP uiDayInMonthCell--default'][normalize-space()='30']")).click();
         Thread.sleep(1000);
         
         //
         
         
        
		//driver.findElement(By.xpath("//span[text()='Edit']/parent::a")).click();
		//Thread.sleep(4000);	
		
//Edit - DD	-Popup-Save and New
		//driver.findElement(By.xpath("//button[@title=\"Save & New\"]")).click();
//Edit - DD	-Popup-Save
		//driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
//Edit - DD	-Popup-Cancel
		//driver.findElement(By.xpath("//button[@title=\"Cancel\"]")).click();
		
		/*
//Generate quote - DD
		driver.findElement(By.xpath("//span[text()='Generate Quote']")).click();
		Thread.sleep(4000);
//Cancel - Popup
		driver.findElement(By.xpath("//button[@title='Cancel']")).click();
		Thread.sleep(2000);
*/		
		/*
//Opp page-Details Tab
		driver.findElement(By.xpath("//*[@id=\"detailTab__item\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@title=\"Edit Stage\"]")).click();
		Thread.sleep(2000);
		
//		Details - Edit Stage-Dropdown click	
			driver.findElement(By.xpath("(//*[@class=\"slds-input slds-combobox__input\"])[3]")).click();
			Thread.sleep(2000);
//			Details - Edit Stage-Dropdown -Select -Engagement-Save	
			driver.findElement(By.xpath("//*[@data-value=\"Engagement\"]")).click();
			Thread.sleep(2000);
		
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
		
		

		
//Button-Mark stage as complete- Not working
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction current uiButton']")).click();
		
		//driver.findElement(By.xpath("//div[@class=\"slds-grid slds-path__action runtime_sales_pathassistantPathAssistantHeader\"]/button[@class='slds-button slds-button--brand slds-path__mark-complete stepAction current uiButton']")).click();
		//driver.findElement(By.xpath("(//*[@class=\"uiOutputText\"])[2]/parent::button")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//article[@class=\"slds-card\"]/div/div/div/div/div[2]/button")).click();
		
		
		//driver.findElement(By.xpath("(//*[@class=\"uiOutputText\"])[1]")).click();
		
	//driver.findElement(By.xpath("(//*[@class=\"uiOutputText\"])[1]/parent::lightning-primitive-icon/parent::lightning-icon/parent::c")).click();
		Thread.sleep(3000);

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
//	Details - Edit Stage-Dropdown click	
		driver.findElement(By.xpath("//*[@class=\"slds-form-element slds-form-element_stacked\"]/div/lightning-base-combobox/div/div/input")).click();
		Thread.sleep(2000);
//		Details - Edit Stage-Dropdown -Select -Engagement-Save	
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
		
		//Details Tab- Double Click and Edit Opportunity Name
		/*
		Actions action = new Actions(driver);
		WebElement link =driver.findElement(By.xpath("//*[text()='Opportunity Name']/parent::div/parent::div/parent::div/parent::force-record-layout-item"));
		action.doubleClick(link).perform();
		*/
		
		//driver.findElement(By.xpath("//*[@class=\"runtime_sales_pathassistantCollapsibleDrawer\"]/div[1]/div[1]/div[1]/div/div/ul/li[2]/a")).click();
		
		
		/*
		 //Engagement-Tab- Not working
		 
		
		driver.findElement(By.xpath("//span[text()='Engagement']")).click();
		
		driver.findElement(By.xpath("//*[@class=\"runtime_sales_pathassistantCollapsibleDrawer\"]/div[1]/div[1]/div[1]/div/div/ul/li[2]/a")).click();
		driver.findElementByLinkText("Engagement").click();
		driver.findElement(By.xpath("//a[@title=\"Engagement\"]")).click();
		
		*/
		
		
		/*
		WebElement search = driver.findElementById("input-107");
		Thread.sleep(2000);
		search.sendKeys("StandardOpportunities");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
			
		
		//driver.findElement(By.xpath("//*[@id=\"input-107\"]")).sendKeys("StandardOpportunities");
		
		
		//System.out.println("The title of the main window :" +driver.getTitle());
		
		/*
		//HomePage-All dropdown - Clear-enter StandardOppurtunities 
		 
		driver.findElement(By.xpath("//*[@id=\"input-4\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"input-4\"]")).sendKeys("StandardOpportunities");
		Thread.sleep(2000);
		
		//Search textbox- Enter Francis J - Velvendo - select Arrow down and Enter
		 		 
		WebElement search = driver.findElementById("169:0;p");
		search.sendKeys("Francis J - Velvendo");
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		
		System.out.println("The title of the child window :" +driver.getTitle());
		
		Thread.sleep(10000);
		
		//Standard Opputunity - Delete button - Click Cancel
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[1]")).click();
		Thread.sleep(2000);
		
		*/
		//Standard Opputunity - Delete button- Click  Delete
		/*
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]")).click();
		Thread.sleep(2000);
		*/
		/*
		 
		 //Select listdropdown - Select and click Generate Quote-Click Cancel in popup- Select Details tab
		
		driver.findElement(By.xpath("(//*[@class='slds-button-group-list'])/li[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Generate Quote']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@title='Cancel']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"detailTab__item\"]")).click();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[16]/a")).click();
		
		
		
		
		
		//driver.findElement(By.xpath("//*[@class='slds-button-group-list']/li[2]/lightning-button-menu/button")).click();
			
		//driver.findElement(By.xpath("//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/one-record-home-flexipage2[1]/forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___standardopportunity_record_page___opportunity___view[1]/forcegenerated-flexipage_standardopportunity_record_page_opportunity__view_js[1]/record_flexipage-record-page-decorator[1]/div[1]/slot[1]/flexipage-record-home-three-col-template-desktop2[1]/div[1]/div[1]/flexipage-record-home-scrollable-column[1]/slot[1]/slot[1]/slot[1]/flexipage-component2[1]/slot[1]/records-lwc-highlights-panel[1]/records-lwc-record-layout[1]/forcegenerated-highlightspanel_opportunity___012000000000000aaa___compact___view___recordlayout2[1]/force-highlights2[1]/div[2]/div[3]/div[1]/runtime_platform_actions-actions-ribbon[1]/ul[1]/li[1]/runtime_platform_actions-action-renderer[1]/runtime_platform_actions-aura-legacy-action[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div[2]")).click();
		
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class=\"slds-path\"]/div[1]/div[1]/div[1]/div[1]/div/div/ul/li[2]/a")).click();
		//driver.findElementByLinkText("Engagement").click();
		
		
		//driver.findElement(By.xpath("//*[@class=\"tabs__content active uiTab\"]/div/div[1]/button[2]")).click();
		
		
		/*driver.findElement(By.xpath("//*[@id=\"leftColumn-133\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='slds-button-group-list']/li[2]")).click();
		*/
		/*
		List<WebElement> listOfElements=driver.findElements(By.xpath("//*[@class='slds-button-group-list']/li[2]"));
		
		for (WebElement webElement : listOfElements) {
			System.out.println(webElement.getText());
			if(webElement.getText().trim().equals("Generate Quote")) {
				webElement.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		*/
		//driver.findElement(By.xpath("//*[name ='Delete']")).click();
		
		/*
		driver.findElement(By.id("169:0;p")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("169:0;p")).sendKeys("Franklin S1 - Velvendo");
		driver.findElement(By.id("169:0;p")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("169:0;p")).sendKeys(Keys.ENTER);
		*/
	}

}
