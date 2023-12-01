package SeleniumWebDriver.AbrstactComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommanMethods {
	
	WebDriver driver;
	
	
	
	
	public CommanMethods(WebDriver driver) {
		
		this.driver = driver;
	}



	public void waitForElementToBevisible(By findby) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));

	}

	public void waitForElementToBeInvisible(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
