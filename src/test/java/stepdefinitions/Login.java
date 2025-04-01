package stepdefinitions;



import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	
	
	@Given("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		
		driver=DriverFactory.getDriver();
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
	   
	}

	@When("user enters valid email address {string} into the email field")
	public void user_enters_valid_email_address_into_the_email_field(String emailText) {
		
		
		driver.findElement(By.id("input-email")).sendKeys(emailText);
	    
	}

	@And("user has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String passwordText) {
		
		driver.findElement(By.id("input-password")).sendKeys(passwordText);
	   
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	     
	}

	@Then("user should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
		
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	    
	}
	
	@When("user enters invalid email address {string} into the email field")
	public void user_enters_invalid_email_address_into_the_email_field(String invalidEmailText) {
	    
		driver.findElement(By.id("input-email")).sendKeys(invalidEmailText);
		
	}

	@When("user has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String invalidPasswordText) {
	   
		driver.findElement(By.id("input-password")).sendKeys(invalidPasswordText);
	}

	@Then("user should get proper warning message about credential mismatch")
	public void user_should_get_proper_warning_message_about_credential_mismatch() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//div [@class='alert alert-danger alert-dismissible']")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
	    
	}

	@When("user doesn't enter email address into the email field")
	public void user_doesn_t_enter_email_address_into_the_email_field() {
		
		driver.findElement(By.id("input-email")).sendKeys("");
	    
	}
	
	@When("user doesn't enter password into the password field")
	public void user_doesn_t_enter_password_into_the_password_field() {
		
		driver.findElement(By.id("input-password")).sendKeys("");
	    
	}


}
