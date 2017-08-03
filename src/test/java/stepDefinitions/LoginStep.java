package stepDefinitions;

import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import module.HomePageAction;
import module.LoginAction;
import pageObjects.DashboardPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class LoginStep {
	
	public WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	
	
	// Constructor
	public LoginStep() {
		driver = Hooks.driver;
	}
	
	@Given("^I am on home page$")
	public void openHomePage() throws Throwable {
		driver.get("https://uat-www.weagree.nsw.gov.au/");
		homePage = PageFactory.initElements(driver, HomePage.class);
		assertTrue(homePage.isLoaded());
	}
	
	@When("^I click Signin link$")
	public void clickSigninLink() throws Throwable {
		HomePageAction.navigateToLoginPage(driver);
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		assertTrue(loginPage.isLoaded());
	}

	@When("^I login with (.*) and (.*)$")
	public void login(String email, String password) throws Throwable {
		LoginAction.Execute(driver, email, password);
	}	
	
	@Then("^Dashboard page is loaded$")
	public void dashboardPageLoaded() throws Throwable {
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		assertTrue(dashboardPage.isLoaded());
	}

}
