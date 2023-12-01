package SeleniumWebDriver.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Groups {
	
	
	@Test
	public void numbers()
	{
		
		System.out.println("number 1");
		
		
	}
	@Test(groups= {"smoke"},dependsOnMethods = {"Language"})
	public void alaphbet()
	{
		
		System.out.println("alaphbet A");
		
		
	}
	
	
	@Test
	public void Language()
	{
		
		System.out.println("English ");
		
		
	}
	
	
	
	
	
	

}
