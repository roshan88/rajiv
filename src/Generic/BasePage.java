package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class BasePage 
{
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void verifyTitle(String atitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.titleContains(atitle));
						
		}
		catch(Exception e)
		
		{
			Reporter.log("element is not valid",true);
			Assert.fail();
		}
	}
	public void verifyelement(WebElement errmsg)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errmsg));
			Reporter.log("element is done",true);
						
		}
		catch(Exception e)
		
		{
			Reporter.log("element is not valid",true);
			Assert.fail();
		}
	}
	
	
	

}
