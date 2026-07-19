package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	WebDriver driver;

	@FindBy(xpath = "//button[text()='Logout']")
	WebElement btn_logout;

	public HomePage_PF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean checkLogoutIsDisplayed() {
		return btn_logout.isDisplayed();
	}

	public void clickLogout() {
		btn_logout.click();

	}
}