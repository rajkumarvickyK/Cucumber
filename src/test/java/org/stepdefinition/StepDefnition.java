package org.stepdefinition;

import org.helper.BaseClass;
import org.locators.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefnition extends BaseClass {
	LoginPojo l=new LoginPojo();

	@Given("User have click forgoten option")
	public void user_have_click_forgoten_option() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(3000);

	}

	@When("User have to enter invalid mobile number")
	public void user_have_to_enter_invalid_mobile_number() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8056840764");
	}

	@When("User have to click search button")
	public void user_have_to_click_search_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(3000);
	}

	@Then("User have to invalid page")
	public void user_have_to_invalid_page() {
		String url = driver.getCurrentUrl();
		if (url.contains("/recover/initiate")) {
			System.out.println("Invalid page");
		}
	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String user, String pass) {
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Given("User have to enter fb login page")
	public void user_have_to_enter_fb_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@Given("User have to maxmize the window")
	public void user_have_to_maxmize_the_window() {
		driver.manage().window().maximize();
	}

	@When("User have to enter invalid email and validpass")
	public void user_have_to_enter_invalid_email_and_validpass() {
		l.getTxtEmail().sendKeys("0654264");
		fillTextBox(l.getTxtPass(), "123456789");
	}

	@When("User have to enter invalid email and invalidpass")
	public void user_have_to_enter_invalid_email_and_invalidpass() {
		driver.findElement(By.id("email")).sendKeys("Akkashsmart");
		driver.findElement(By.id("pass")).sendKeys("Akkash@123");
	}

	@When("User have to enter valid email and invalidpass")
	public void user_have_to_enter_valid_email_and_invalidpass() {
		driver.findElement(By.id("email")).sendKeys("Rajkumar@1345");
		driver.findElement(By.id("pass")).sendKeys("12345678");
	}

	@When("User have to click buttton")
	public void user_have_to_click_buttton() throws InterruptedException {

		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	@Then("User have to invalid credentials")
	public void user_have_to_invalid_credentials() {
		String url = driver.getCurrentUrl();
		if (url.contains("privacy_mutation_token")) {
			System.out.println("User is invalid credentials Page");
		}
	}

}
