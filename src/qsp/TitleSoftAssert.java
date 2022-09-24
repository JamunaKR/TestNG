package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleSoftAssert {
	@Test
	public void testA()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		String eTitle ="actiTIME - Logins";
		String aTitle=driver.getTitle();
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(aTitle, eTitle);
		driver.close();
		sa.assertAll();
	}
}
