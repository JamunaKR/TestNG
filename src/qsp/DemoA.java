package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA 
{
	@Test
	public void testA()
	{
		//It will not print statement in console, but will print in TestNG report
		//Reporter.log("hii");
		Reporter.log("hii", true);
		//System.out.println("hi"); 
		//(it will print only in console and will not print in TestNG report
	}

}
