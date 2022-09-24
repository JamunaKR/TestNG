package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC extends DemoAB
{
	@Test
	public void testC()
	{
		Reporter.log("Test C", true);
	}

}
