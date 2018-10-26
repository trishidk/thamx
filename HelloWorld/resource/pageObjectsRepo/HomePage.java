package pageObjectsRepo;
import org.openqa.selenium.*;
import org.testng.asserts.*;
import org.testng.reporters.*;
import org.testng.annotations.*;
import testUtilities.CommonCommands;
import testUtilities.TestConfigSetup;
public class HomePage extends TestConfigSetup{
	WebDriver driver;
	WebDriver wait;
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	
	By searchBtn = By.xpath("//*[@id='search-icon-legacy']");
	By searchBox = By.xpath("//*[@id=\'search\']");
	By selectVideo = By.xpath("//*[@id=\"video-title\"]");
	By skipAdd = By.xpath("//*[@id=\"movie_player\"]/div[12]/div/div/div[5]/button/div[1]");
	
	public void clickSearchBtn() throws Exception{
		common.click(searchBtn);
	}
	
	public void selectVideoOne() throws Exception {
		common.click(selectVideo);
	}
	
}
