package qsp;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAB extends BaseTest  {
	@Test
	public void testA()
	{
		Reporter.log("TestA", true);
		//Assert.fail();
	}
	@Test	//(dependsOnMethods="testA")	//(enabled=false)
	public void testB()
	{
		Reporter.log("TestB",true);
		//Assert.fail();
	}
}
