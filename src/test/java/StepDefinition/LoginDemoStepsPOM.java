package StepDefinition;

public class LoginDemoStepsPOM {

//	WebDriver driver;
//	WebDriverWait wait;
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
//		driver.get("https://clock-in-out-attendence-system.vercel.app/");
//	}
//
//	@When("user enters {string} and {string}")
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(username);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.xpath("//button[text()='Login']")).click();
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_clicks_on_logout() {
//
//		wait.until(ExpectedConditions.urlContains("dashboard"));
//		try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath("//button[text()='Logout']")).click();
//
//		// driver.quit();
//	}
}