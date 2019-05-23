package Base_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class Browser_Invoke {
	public WebDriver driver;
	@BeforeMethod
	public WebDriver getBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    // driver.get(propertyfile1.getProperty("ChromeExe"));
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("http://parabank.parasoft.com");

		driver.manage().window().maximize();
		return driver;
		
	}
	@AfterMethod
	public void quit_driver()
	{
		driver.quit();
	}

}
