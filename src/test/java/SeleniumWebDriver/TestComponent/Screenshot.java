package SeleniumWebDriver.TestComponent;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	
	public   String getSS(WebDriver driver,String testcasename ) throws IOException
	   
	   
	   {
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File DestFile = new File(System.getProperty("user.dir") + "\\reports\\homepage.png");
			
			FileUtils.copyFile(SrcFile, DestFile);
			
			
			return System.getProperty("user.dir") + "\\reports\\"+  testcasename + ".png";
			
			


	   }
	
	
	
	
	

}
