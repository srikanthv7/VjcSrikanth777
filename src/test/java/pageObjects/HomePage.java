package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {
	
	@FindBy(className="signin")
	public static WebElement linkToLoginPage;
	
	@FindBy(className="register")
	public static WebElement linkToRegisterPage;
	
	
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Check if home page is loaded
	public boolean isLoaded() {
		return driver.getTitle().equals("Home page - Trust Management");
	}

}
