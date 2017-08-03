package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BaseClass {
	
	// TEST
	@FindBy(css="h1.twelve.wide.mobile.six.wide.computer.column.title")
	public static WebElement contentHeader;
	
	// Constructor
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	// Check if dashboard page is loaded
	public boolean isLoaded() {
		return contentHeader.isDisplayed() && driver.getTitle().equals("Dashboard - Trust Management");
	}
}
