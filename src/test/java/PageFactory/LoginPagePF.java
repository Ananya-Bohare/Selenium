package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPagePF {

	WebDriver driver;

	@FindBy(xpath = "//input[@type='email']")
	@CacheLookup
	WebElement txt_username;

	@FindBy(xpath = "//input[@type='password']")
	@CacheLookup
	WebElement txt_password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_login;

	@FindBy(xpath = "//button[text()='Logout']")
	WebElement btn_logout;

	public LoginPagePF(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);

		if (!driver.getCurrentUrl().contains("clock-in-out-attendence-system")) {
			throw new IllegalStateException("This is not the Login Page. Current URL is: " + driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {
		txt_username.clear();
		txt_username.sendKeys(username);
	}

	public void enterPassword(String password) {
		txt_password.clear();
		txt_password.sendKeys(password);
	}

	public void clickOnLogin() {
		btn_login.click();
	}

	public boolean isLogoutDisplayed() {
		return btn_logout.isDisplayed();
	}

	public void clickLogout() {
		btn_logout.click();
	}

//	public void login(String username, String password) {
//
//		enterUsername(username);
//		enterPassword(password);
//		clickOnLogin();
//	}
}