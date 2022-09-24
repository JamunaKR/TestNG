package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoGrp extends DemoGrpMain 
{
	@Test (priority=1, groups="smoke")
	public void createUser()
	{
		Reporter.log("User is created", true);
	}
	@Test (priority = 2, groups = {"smoke", "reg"})
	public void editUser()
	{
		Reporter.log("User is edit", true);
	}
	@Test (priority = 3, groups = "reg")
	public void deleteUser()
	{
		Reporter.log("User is deleted", true);
	}
}