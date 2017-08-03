package module;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class LoginAction {
	
	// Login
	public static void Execute(WebDriver driver, String email, String password) {
		LoginPage.emailInputField.sendKeys(email);
		LoginPage.passwordInputField.sendKeys(password);
		LoginPage.signInButton.click();
	}
}
