package stepDefinitions;

import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import module.HomePageAction;
import module.RegisterAction;
import pageObjects.ConfirmRegoPage;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegisterStep {

	public WebDriver driver;
	public HomePage homePage;
	public RegisterPage registerPage;
	public ConfirmRegoPage confirmRegoPage;
	
	// Constructor
	public RegisterStep() {
		driver = Hooks.driver;
	}
	
	@When("^I click Register link$")
	public void clickRegisterLink() throws Throwable {
		homePage = PageFactory.initElements(driver, HomePage.class);
		assertTrue(homePage.isLoaded());
		HomePageAction.navigateToRegisterPage(driver);
	}
	
	@When("^I register with (.*), (.*), (.*), (.*), (.*)$")
	public void register(String firstName, String lastName, String email, String mobile, String password) {
		registerPage = PageFactory.initElements(driver, RegisterPage.class);
		assertTrue(registerPage.isLoaded());
		RegisterAction.Execute(driver, firstName, lastName, email, mobile, password);
	}
	
	@Then("ConfirmRego page is loaded$")
	public void confirmRegoPageLoaded() {
		confirmRegoPage = PageFactory.initElements(driver, ConfirmRegoPage.class);
		assertTrue(confirmRegoPage.isLoaded());
	}
}
