package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordResetPage {

	 public static WebElement enterEmailId(WebDriver driver) {
	        WebElement EmailId = driver.findElement(By.id("exampleInputEmail1"));
	        return EmailId;
}}
