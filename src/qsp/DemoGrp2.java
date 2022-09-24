package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoGrp2 extends DemoGrpMain
{
	@Test (priority=4, groups="smoke")
	public void createTask()
	{
		Reporter.log("Task is created", true);
	}
	@Test (priority = 5, groups = {"smoke", "reg"})
	public void editTask()
	{
		Reporter.log("Task is edit", true);
	}
	@Test (priority = 6, groups = "reg")
	public void deleteTask()
	{
		Reporter.log("Task is deleted", true);
	}
}
