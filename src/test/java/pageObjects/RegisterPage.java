package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {

	// Mr button
	@FindBy(css=".form-group.group-radio.item-6 md-button-toggle-group md-button-toggle[id='md-button-toggle-1']")
	public static WebElement titleButton;
	
	// First name input field
	@FindBy(id="inputFirstName")
	public static WebElement firstNameInputField;
	
	// Middle name input field(optional)
	@FindBy(id="inputMiddleName")
	public static WebElement middleNameInputField;
	
	// Last name input field
	@FindBy(id="inputSurname")
	public static WebElement lastNameInputField;
	
	// Email input field
	@FindBy(id="inputEmail")
	public static WebElement emailInputField;
	
	// Mobile number input field
	@FindBy(id="inputPhoneNumber")
	public static WebElement inputMobileField;
	
	// Password input field
	@FindBy(id="inputPassword")
	public static WebElement inputPasswordField;
	
	// Password confirmation input field
	@FindBy(id="inputPasswordConfirmation")
	public static WebElement inputPasswordConfirmationField;
	
	// Register button
	@FindBy(className="md-button-ripple")
	public static WebElement registerButton;
	
	
	// Constructor
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	// Check if register page is loaded
	public boolean isLoaded() {
		return driver.getTitle().equals("Register new user - Trust Management");
	}
}
