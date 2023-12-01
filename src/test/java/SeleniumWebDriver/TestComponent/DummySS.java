package SeleniumWebDriver.TestComponent;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummySS {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		 driver.get("https://rahulshettyacademy.com/client");
		  getSS(driver);
		 
		 
	}
		 
		 
		 
		   public static   String getSS(WebDriver driver ) throws IOException
		   
		   
		   {
				TakesScreenshot scrShot = ((TakesScreenshot)driver);
				
				File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
				
				File DestFile = new File(System.getProperty("user.dir") + "\\reports\\homepage.png");
				
				FileUtils.copyFile(SrcFile, DestFile);
				
				return System.getProperty("user.dir") + "\\reports\\homepage.png";

		   }	
			
			
			}


