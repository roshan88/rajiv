package SCRIPTs;

import org.testng.annotations.Test;

import Generic.Base_test;
import Generic.ExcelClass;
import POM.LoginPage;

public class LoginLogout extends Base_test
{
	
	
	@Test
	public void loginlogout1()
	{
	LoginPage lp =new LoginPage(driver);
	String s= ExcelClass.getCellValue1(path, "Sheet1", 0, 0);
	String d= ExcelClass.getCellValue1(path, "Sheet1", 1, 0);
	lp.setusername(s);
	
	
	lp.setpwd(d);
	lp.LoginClick();
	lp.ver_Err();
	
	
	
	}

}
