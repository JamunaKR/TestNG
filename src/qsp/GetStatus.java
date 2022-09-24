package qsp;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GetStatus 
{
		@Test
		public void testA()
		{
			Reporter.log("TestA", true);
		}
		@Test
		public void testB()
		{
			Reporter.log("TestB",true);
			Assert.fail(); 
		}
		@AfterMethod
		public void postCondition(ITestResult res)
		{
			String name=res.getName();
			Reporter.log("Name: "+name,true);
			
			int s=res.getStatus();
			Reporter.log("Status: "+s, true);
			
			Reporter.log("======================================", true);
	}

}
