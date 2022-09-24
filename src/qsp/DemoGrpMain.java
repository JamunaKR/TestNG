package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoGrpMain 
{
	@BeforeMethod(alwaysRun = true)
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		Reporter.log("Logout",true);
	}
}
