package StepDefinition;

public class LoginDemoSteps_PF {

//	WebDriver driver;
//	WebDriverWait wait;
//
//	LoginPagePF login;
//	HomePage_PF home;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//
//		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		driver.get("https://clock-in-out-attendence-system.vercel.app/");
//
//		login = new LoginPagePF(driver);
//	}
//
//	@When("user enters {string} and {string}")
//	public void user_enters_username_and_password(String username, String password) {
//
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//
//		login.clickOnLogin();
//
//		// Home page object after successful login
//		home = new HomePage_PF(driver);
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
//
//		Thread.sleep(3000);
//
//		if (home.checkLogoutIsDisplayed()) {
//			System.out.println("Login Successful");
//		}
//		home.clickLogout();
//		Thread.sleep(3000);
//
//		driver.quit();
//	}
}