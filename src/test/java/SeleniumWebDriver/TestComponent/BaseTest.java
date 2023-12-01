package SeleniumWebDriver.TestComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import SeleniumWebDriver.PageObject.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingPage;

	public WebDriver initializationOfDriver() throws IOException

	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\kiran\\eclipse-workspace\\TestNGFramework\\src\\test\\java\\SeleniumWebDriver\\data\\GlobalValues.properties");

		p.load(fis);
		String browserName = p.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		return driver;

	}
	
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	
	{
		Thread.sleep(5000);
		driver.close();	
	}
	@BeforeMethod
	public LandingPage LaunchApplication() throws IOException

	{
		driver = initializationOfDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTo();
		
		return landingPage;
		
		
	}
	
	public   String getSS(WebDriver driver,String testcasename ) throws IOException
	   
	   
	   {
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File DestFile = new File(System.getProperty("user.dir") + "\\reports\\homepage.png");
			
			FileUtils.copyFile(SrcFile, DestFile);
			
			
			return System.getProperty("user.dir") + "\\reports\\"+  testcasename + ".png";
			
			


	   }
	
	

}
