package SeleniumWebDriver.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumWebDriver.AbrstactComponent.CommanMethods;

public class LandingPage extends CommanMethods{

	WebDriver driver;
	

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "userEmail")
	WebElement userName;

	@FindBy(id = "userPassword")
	WebElement PassWord;

	@FindBy(id = "login")
	WebElement loginBtn;

	public ProductsPage loginToApplication(String email, String password) {

		userName.sendKeys(email);
		PassWord.sendKeys(password);
		loginBtn.click();
		ProductsPage ProductssPage = new ProductsPage(driver);
	    return ProductssPage;
	}
	

	public void goTo() 
	{
		driver.get("https://rahulshettyacademy.com/client");

	}

}
