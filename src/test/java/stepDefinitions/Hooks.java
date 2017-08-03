package stepDefinitions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	/* Delete all cookies at the start of each scenario to avoid
	*  shared state between tests
	*/
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void after() {
		driver.quit();
	}
}
