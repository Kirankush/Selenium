package SeleniumWebDriver.Test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumWebDriver.PageObject.LandingPage;
import SeleniumWebDriver.TestComponent.BaseTest;

public class ErrorValidation extends BaseTest{
	
	
	String url = "https://rahulshettyacademy.com/client";
	
	
	
	@Test
	public void titleErrorVAlidation() throws IOException
	
	{
		//LandingPage LandingPage = LaunchApplication(url);
		String title = driver.getTitle();
		Assert.assertEquals(title, "class2");
		//closeBrowser();	
	}
	
	
	
	
	
	
	

}
