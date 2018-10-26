package testUtilities;
import pageObjectsRepo.HomePage;
import testUtilities.CommonCommands;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
public class TestConfigSetup {
	
	
	public static WebDriver driver;
 	public static CommonCommands common;
 	public static HomePage homepage;	
 	@BeforeClass
	public void pOMconfig () {
 		common = new CommonCommands(driver);
 		homepage = new HomePage(driver);
 	}
 	@BeforeTest
 	public void setUp() {
     	  System.out.println("*******************");
     	 
		  System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
		 // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nova\\Desktop\\chromedriver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.get("https://www.youtube.com");
		  driver.manage().window().maximize();
		//  driver.findElement(By.id("overlayConfirm")).click();
		//###################################################################  
		//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		//WebDriver driver = new InternetExplorerDriver();
		//###################################################################
		  
	}
 	}
	

