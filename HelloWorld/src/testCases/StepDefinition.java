package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testUtilities.TestConfigSetup;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends TestConfigSetup{
WebDriver driver;

	@When("^Youtube homepage is displayed$")
	public void youtube_homepage_is_displayed() throws Throwable {
	 System.out.println("*******************");
 	 
	  System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.get("https://www.youtube.com");
	  driver.manage().window().maximize();
		//assertTrue(driver.getTitle().contains("YouTube"));
	    throw new PendingException();
	}

	@Then("^I want to type in the search box$")
	public void i_want_to_type_in_the_search_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'search\']")).sendKeys("fortnite ninja");
	    throw new PendingException();
	}

	@Then("^Click on the search button$")
	public void click_on_the_search_button() throws Throwable {
		homepage.clickSearchBtn();
		//homepage.selectVideoOne();
	    throw new PendingException();
	}


}
