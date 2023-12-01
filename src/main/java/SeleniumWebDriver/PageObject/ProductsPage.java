package SeleniumWebDriver.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumWebDriver.AbrstactComponent.CommanMethods;

public class ProductsPage extends CommanMethods  {

	WebDriver driver;

	

	public ProductsPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@routerlink='/dashboard/cart']")
	WebElement cardIcon;

	@FindBy(css = ".mb-3")
	List<WebElement> products;

	@FindBy(css = ".ng-animating")
	WebElement spinner;

	By productsBy = By.cssSelector(".mb-3");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");



public List<WebElement> getProductList() throws InterruptedException

{
	
	
	waitForElementToBevisible(productsBy);
	
	//System.out.println("pass");
	//return all the products ( webelements ) in product page 
	return products;
}



public WebElement getProductByName(String productName) throws InterruptedException
//return the webelemnt of the product 
{
	WebElement prod =   getProductList().stream()
			   .filter(product -> product.findElement(By.cssSelector("b"))
			   .getText().equals(productName)).findFirst().orElse(null);
	return prod;
	
}

public CartPage addProductToCart(String productName) throws InterruptedException

{
	  WebElement prod = getProductByName( productName);
	  prod.findElement(addToCart).click();
	
	 waitForElementToBevisible(toastMessage);
	  
	//waitForElementToBeInvisible(spinner);
	 Thread.sleep(5000);
	 
	  cardIcon.click();
	  
	  return new CartPage(driver);
	 // return caartPage = new CartPage(driver);
	  //return caartPage;
}








}








