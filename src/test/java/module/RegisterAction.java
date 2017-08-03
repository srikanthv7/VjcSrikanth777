package module;

import org.openqa.selenium.WebDriver;

import pageObjects.RegisterPage;

public class RegisterAction {

	public static void Execute(WebDriver driver, String firstName, String lastName, String email, String mobile, String password) {
		RegisterPage.titleButton.click();
		RegisterPage.firstNameInputField.sendKeys(firstName);
		RegisterPage.lastNameInputField.sendKeys(lastName);
		RegisterPage.emailInputField.sendKeys(email);
		RegisterPage.inputMobileField.sendKeys(mobile);
		RegisterPage.inputPasswordField.sendKeys(password);
		RegisterPage.inputPasswordConfirmationField.sendKeys(password);
		RegisterPage.registerButton.click();
	}
}
