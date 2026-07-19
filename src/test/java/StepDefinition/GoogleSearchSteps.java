package StepDefinition;

public class GoogleSearchSteps {

//	WebDriver driver = null;
//	WebDriverWait wait;
//
//	@Given("browser window is open")
//	public void browser_window_is_open() {
//
//		System.out.println("Inside Step - browser is open");
//
//		// Selenium Manager automatically manages ChromeDriver
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//
//		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//
//		System.out.println("Inside Step - user is on Google search page");
//
//		driver.get("https://www.google.com");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//
//		System.out.println("Inside Step - user enters a text in search box");
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
//
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//
//		System.out.println("Inside Step - hits enter");
//
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//
//		System.out.println("Inside Step - user is navigated to search results");
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
//
//		// Verify search results are displayed
//		assertTrue(driver.getTitle().contains("Automation Step by Step"));
//
//		System.out.println("Test Passed");
//
//		driver.quit();
//	}
}