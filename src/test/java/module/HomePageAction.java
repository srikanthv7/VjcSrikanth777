package module;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;

public class HomePageAction {

	// Navigate to login page
	public static void navigateToLoginPage(WebDriver driver) {
		HomePage.linkToLoginPage.click();
	}
	
	// Navigate to register page
	public static void navigateToRegisterPage(WebDriver driver) {
		HomePage.linkToRegisterPage.click();
	}
}
