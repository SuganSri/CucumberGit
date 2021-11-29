package org.StepDef;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition {
	WebDriver driver;
	@Given("User should open the fb application")
	public void user_should_open_the_fb_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\CucumberOne\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@When("User enters the username and password in the application")
	public void user_enters_the_username_and_password_in_the_application() {
		driver.findElement(By.id("email")).sendKeys("sugan2159@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sugansweetyy");

	}

	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("login")).click();

	}
	@And("User clicks the login button")
	public void user_clicks_the_login_button11() {
		driver.findElement(By.name("password")).click();

	}
	@And("User clicks the login button")
	public void user_clicks_the_login_button1() {
		driver.findElement(By.name("username")).click();

	}

	@Then("User verifies the application moved to home page")
	public void user_verifies_the_application_moved_to_home_page() {
		String title = driver.getTitle();
		boolean contains = title.contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("validated");

	}
	


}
