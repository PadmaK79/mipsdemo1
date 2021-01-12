package stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.textui.TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mipsdemo.pageobject.LoginPage;
/*
public class LoginStepDefinition extends TestRunner{
	
	
	
	WebDriver driver;
	LoginPage login;
		
	@Given("^Launch the browser and navigate to SF login page web$")
	public void launch_the_browser_and_navigate_to_SF_login_page_web() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\padma.kavitha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);

		driver.get("https://meritagehomes--qa.my.salesforce.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
	   
	}
	
	@When("User enters valid Login page details {string} {string}")
	public void user_enters_valid_Login_page_details(String user_name, String user_password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		login = new LoginPage(driver);
		
				
		//driver.findElement(By.id("username")).sendKeys(user_name);
		//driver.findElement(By.id("password")).sendKeys(user_password);
		
		Thread.sleep(5000);
	    
	}
	
	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws InterruptedException {
		
		
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		
	   
	}
	
	@Then("^user clicks remind me later$")
	public void user_clicks_remind_me_later() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.findElement(By.linkText("Remind Me Later")).click();
		Thread.sleep(20000);
	}
 
}

*/
