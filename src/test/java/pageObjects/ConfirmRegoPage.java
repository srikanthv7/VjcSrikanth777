package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmRegoPage extends BaseClass {

	// Registration confirmed message header: "Thanks for registering"
	@FindBy(className="card-header__title")
	public static WebElement confirmRegoMessageHeader;
	
	
	// Constructor
	public ConfirmRegoPage(WebDriver driver) {
		super(driver);
	}
	
	// Check if confirm registration page is loaded
	public boolean isLoaded() {
		return confirmRegoMessageHeader.isDisplayed() 
				&& confirmRegoMessageHeader.getText().equals("Thanks for registering");
	}
}
