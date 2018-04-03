package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public abstract class Base_test implements AutoConst

{
	
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(gKey,gValue); 
		
		driver=new FirefoxDriver();
		 driver.get("http://rajeev-pc/login.do");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	public void closeapp()
	{
		driver.quit();
		
	}
	 

}
