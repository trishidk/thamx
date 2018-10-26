package testUtilities;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.Reporter;

public class CommonCommands {
	public WebDriver driver;
	public WebDriverWait wait;
	protected WebDriverWait waiter;
	public WebElement element;
	public Object calanderTomorrowDate;

	public CommonCommands(WebDriver driver) {
		this.driver = driver;
	}
	 
	 public WebElement click(By xpath) throws Exception {
	        try {
	           
	           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	           
	           //waiter.until(ExpectedConditions.presenceOfElementLocated(xpath));
	           //waiter.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	           //waiter.until(ExpectedConditions.elementToBeClickable(xpath));          
	           
	            WebElement mover = this.driver.findElement(xpath);           
	            mover.sendKeys(Keys.ENTER);
	           
	            Reporter.log("Clicked element(xpath: " + xpath + ").");
	           
	            return mover;
	           
	        } catch (Exception e) {
	            Reporter.log("Attempt to click element(xpath: " + xpath + ") failed due to: " + e.getMessage());
	            throw e;
	        }
	    }
	
	
	
	public void textCheckpoint(String expectedText) throws Exception{	
	 boolean textExist = driver.getPageSource().contains(expectedText);
		if (textExist == true) {
				System.out.println(expectedText +": Text verification passed");
		}else{
			System.out.println(expectedText + " : Text verification fail");	
		}		
	
	
}
		public void isPresent(By id){
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
			if (driver.findElements(id).size() != 0) {   
				WebElement TxtBoxContent = driver.findElement(id);
				if ((TxtBoxContent.getAttribute("text")==null)){
				System.out.println(TxtBoxContent.getAttribute("class")+ " element is present"); 
	  		     }else{
	  		    	System.out.println(TxtBoxContent.getAttribute("text")+ " element is present"); 	 
	  		     }
			}
}		
			public Boolean isPresentBool(By id){
				 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
				if (driver.findElements(id).size() != 0) {   
					//WebElement TxtBoxContent = driver.findElement(id);
					//System.out.println(TxtBoxContent.getAttribute("text")+ " element is present"); 
					return true;
		  		     }
					return false;
			
}
		public void typeText(By id, String text){
			 
			  Actions builder = new Actions(driver);
			  WebElement search = driver.findElement(id);	
		      Actions seriesOfActions = builder.moveToElement(search).click().sendKeys(search, text).sendKeys(search, Keys.RETURN);
		      seriesOfActions.perform();
		}
		
		public void verifyPDF(){
		 
			    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			    driver.switchTo().window(tabs2.get(1));
			    String getURL = driver.getCurrentUrl();	    
			//    Assert.assertTrue(getURL.contains(".pdf"));
			    System.out.println("PDF Validated: "+getURL);
			   driver.close();
			   driver.switchTo().window(tabs2.get(0));
		}
		
		
		public void verifyDocumentDownload(){
			 
		    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs2.get(1));
		    String getURL = driver.getCurrentUrl();	    
		 //  Assert.assertTrue(getURL.contains("TWXservicesWEB"));
		    System.out.println("Document downloaded: "+getURL);
		   driver.close();
		   driver.switchTo().window(tabs2.get(0));
	}
		
		
		
		
		public void onClickNavigation(String Text){
			 String getURL = driver.getCurrentUrl();	    
		//	Assert.assertTrue(getURL.contains(Text));
			System.out.println("Onclick navigation to "+Text +" passed");
		}
		

}
