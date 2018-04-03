package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class LoginPage extends BasePage
{

	@FindBy(name="username")
	private WebElement un;
	
	@FindBy(xpath="(//input[@class='textField'])[2]")
	private WebElement pwd;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	
	@FindBy(xpath="(//span[@ class='errormsg'])[1]")
	private WebElement errmsg;
	
	
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void setusername(String un1)
	{
		un.sendKeys(un1);
	}
	
	public void setpwd(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	
	public void LoginClick()
	{
	login.click();
	}
	public void ver_Err()
	{
		verifyelement(errmsg);
	}
	public void ver_Titl(String atitle)
	{
		verifyTitle(atitle);
	}
	
}
