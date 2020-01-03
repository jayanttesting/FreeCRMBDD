package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepdefination {
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() {

		driver.findElement(
				By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();

	}

	@When("^user is on login page$")
	public void user_is_on_login_page() {
		String title = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("email")).sendKeys("jayant.genpact@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Shivam@1993");
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		String home_page_title = driver.getTitle();
		System.out.println(home_page_title);
		Assert.assertEquals("Cogmento CRM", home_page_title);
	}

}
