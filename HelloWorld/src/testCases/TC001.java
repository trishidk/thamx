package testCases;
import testUtilities.TestConfigSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectsRepo.HomePage;
import testUtilities.CommonCommands;
public class TC001 extends TestConfigSetup {
	@Test(priority=1)
	
	public void TC001() throws Exception{
		System.out.println("hello world!!!!");
		System.out.println("*******************");
		driver.findElement(By.xpath("//*[@id=\'search\']")).sendKeys("fortnite ninja");
		homepage.clickSearchBtn();
		homepage.selectVideoOne();
	//driver.quit();
	}
}
