package runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mipsdemo.base.TestBase;
import com.mipsdemo.util.TestUtil;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src//main//java//features",
		dryRun =false,
		glue={"stepDefinitions"},
		plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"},
		monochrome = true)
		

public class TestRunner {
	
	
	
}
