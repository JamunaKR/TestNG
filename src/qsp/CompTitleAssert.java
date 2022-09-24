package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompTitleAssert 
{
	@Test
	public void TestA()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String eTitle="actiTIME - Login";//If title is wrong, it gives the result FAILED
		String aTitle=driver.getTitle();
		
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
		
	}
	
	

}
