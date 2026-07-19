package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Locators
	private By txt_username = By.xpath("//input[@type='email']");

	private By txt_password = By.xpath("//input[@type='password']");

	private By btn_login = By.xpath("//button[@type='submit']");

	private By btn_logout = By.xpath("//button[text()='Logout']");

	// Constructor
	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Methods

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(btn_login).click();
	}

	public boolean isLogoutDisplayed() {
		return driver.findElement(btn_logout).isDisplayed();
	}

	public void loginValidUser(String username, String password) {

		enterUsername(username);
		enterPassword(password);
		clickLogin();
	}

}