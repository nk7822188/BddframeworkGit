package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

public class PageFactoryLoginStepsDefinition {
    WebDriver driver;
    loginPageFactory login;
    homePageFactory home;
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	    driver.get("https://www.levi.com/US/en_US/");
	    Thread.sleep(3000);
//		Set<String> winHandles=driver.getWindowHandles();
//		for(String winHandle:winHandles)
//		{
//			driver.switchTo().window(winHandle);
//		}
//	   WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(100));
//		 
//		 try {
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close Modal']")));
//            driver.findElement(By.xpath("//button[@aria-label='Close Modal']")).click();
//		} catch (Exception e) {
//		
//			e.printStackTrace();
//	}
//	    driver.findElement(By.xpath("//div[[@class='lsco-col-xs-23']/div/ul/li[1]/a[1]")).click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		// webdriver function call for implicit wait
		driver.findElement(By.linkText("Log In")).click(); 

	}

//	@When("User enters valid username and password")
//	public void user_enters_valid_username_and_password() {
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//div[@class='text-field-content']//div[@class='input-item-content']//input[@class='text-field__input inputClassObj']")).sendKeys(username);
		//driver.findElement(By.xpath("//div[@class='password-field-content']//div[@class='input-item-content']/input[@class='text-field__input inputClassObj']")).sendKeys(password);
		login= new loginPageFactory(driver);
	    login.enterUsername(username);
	    Thread.sleep(4000);
		login.enterPassword(password);

		
	   
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.clickLogin();
		//driver.findElement(By.xpath("//div[@class='button-and-link button-and-link button-and-link-otp']/button")).click();
	}

	@Then("User shuold be navigating to Home page")
	public void user_shuold_be_navigating_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //Assert.assertTrue(driver.findElements(By.xpath("//div[@class='lsco-row lsco-row-xs--middle']")).size()>0);
		home = new homePageFactory(driver);
		home.isCartDisplayed();
		//login.isLogoDisplayed();
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   // driver.close();
		driver.quit();
	} 
}
