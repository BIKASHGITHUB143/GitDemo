package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Search {
	
	WebDriver driver;

	@Given("user opens the application")
	public void user_opens_the_application() {
	   
		driver=DriverFactory.getDriver();
	}

	@When("user enters valid product {string} into search box")
	public void user_enters_valid_product_into_search_box(String validProductText) {
		
		driver.findElement(By.name("search")).sendKeys(validProductText);
	   
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() {
		
		driver.findElement(By.xpath("//button[contains(@class,'btn-default']")).click();
	    
	}

	@Then("user should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
		
	Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	   
	}

	@When("user enters invalid product {string} into search box")
	public void user_enters_invalid_product_into_search_box(String invalidProductText) {
		
		driver.findElement(By.name("search")).sendKeys(invalidProductText);
	   
	}

	@Then("user should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
		
		
		Assert.assertEquals("There is no product that matches the search criteria.", driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText());
	   
	}

	@When("user don't enters any product name into search box")
	public void user_don_t_enters_any_product_name_into_search_box() {
		
		//intentionally kept blank
	    
	}
	
}
