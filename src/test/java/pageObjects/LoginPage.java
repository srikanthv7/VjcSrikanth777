package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {
	
	// WebElements
	@FindBy(id="exampleInputEmail1")
	public static WebElement emailInputField;
	
	@FindBy(id="exampleInputPassword1")
	public static WebElement passwordInputField;
	
	@FindBy(css=".form-group.group-link a.hyper-link[href='/IdentityAccess/PasswordReset']")
	public static WebElement forgotPasswordLink;
	
	@FindBy(css=".form-group.group-submit button:last-child")
	public static WebElement signInButton;
	
	
	
	// Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// Check if login page is loaded
	public boolean isLoaded() {
		return driver.getTitle().equals("Sign in - Trust Management");
	}
	
}
