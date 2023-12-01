package SeleniumWebDriver.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import SeleniumWebDriver.PageObject.CartPage;
import SeleniumWebDriver.PageObject.LandingPage;
import SeleniumWebDriver.PageObject.ProductsPage;
import SeleniumWebDriver.TestComponent.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Standlone extends BaseTest

{
	//String url = "https://rahulshettyacademy.com/client";
	String username = "kiran9036@gmail.com";
	String Password = "9036191463@Ab";
	String productName = "ADIDAS ORIGINAL";
	
	
	@Test
	public void SubmitOrder() throws InterruptedException, IOException
   {

		

		
		//LandingPage LandingPage = LaunchApplication(url);
		
		ProductsPage ProductsPage=landingPage.loginToApplication(username, Password);
		
		List<WebElement> ProductsList = ProductsPage.getProductList();
		CartPage cartPage =	ProductsPage.addProductToCart(productName);
		
		Boolean match = cartPage.verifyProductDisplay(productName);
		Assert.assertTrue(match);
		cartPage.goToCheckout();
		 
	//	closeBrowser();
		
   }
		
		
		@Test
		public void TitleValidation() throws IOException
		
		{
			//LandingPage LandingPage = LaunchApplication(url);
			String title = driver.getTitle();
			Assert.assertEquals(title, "abc");
		//	closeBrowser();	
		}
		
		
		

	}

