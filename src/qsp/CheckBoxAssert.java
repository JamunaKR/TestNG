package qsp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxAssert 
{
		@Test
		public void testA()
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			
			WebElement sel=driver.findElement(By.id("keepLoggedInCheckBox"));
			Boolean e=sel.isSelected();
			Assert.assertFalse(e);
			driver.close();	
		}
}
