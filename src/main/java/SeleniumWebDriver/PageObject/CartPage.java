package SeleniumWebDriver.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumWebDriver.AbrstactComponent.CommanMethods;

public class CartPage extends CommanMethods{
	
	WebDriver driver;

	public CartPage(WebDriver driver) {
		super(driver);
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	   
	@FindBy(xpath = "//*[@class='cartSection'] /h3")
	List<WebElement> productTitles;

	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	WebElement CheckoutIcon;
	
	
	public Boolean verifyProductDisplay(String productName)
	{
		Boolean match = productTitles.stream().anyMatch(itemInCart->itemInCart.getText().equals(productName));
		//Assert.assertTrue(match)
		return match;
	}
	
	
	public void goToCheckout()
	{
		
		CheckoutIcon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
