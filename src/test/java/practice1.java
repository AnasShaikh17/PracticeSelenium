import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.practice.utilities.ScreenShot;

public class practice1 {
	
	WebDriver driver;
	
	
@Test
public void ab()
{
	System.setProperty("webdriver.chrome.driver", "/Users/abashirshaikh/Documents/DocumentsBkup/Documents/WebDriverBrowserDrivers/chromedriver_mac64/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Assert.assertEquals(5,5);
	System.out.println("In test ab");

}

@Test
public void abc()
{
	System.setProperty("webdriver.chrome.driver", "/Users/abashirshaikh/Documents/DocumentsBkup/Documents/WebDriverBrowserDrivers/chromedriver_mac64/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Assert.assertEquals(5,6);
	System.out.println("In test abc");
}

@AfterMethod
public void failTest(ITestResult tr)
{
	ScreenShot ss = new ScreenShot();
	ss.takeScreenShot(driver,tr);
	driver.quit();
}

}
