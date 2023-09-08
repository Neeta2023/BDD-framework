package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepdefinition {
	
	WebDriver driver;
	
	
	  @Given("User must be on homepage by clicking on url {string}") 
	  public void user_must_be_on_homepage_by_clicking_on_url(String string) {
	  
	  System.setProperty("WebDriver.gecko.driver", "geckodriver.exe"); 
	  driver=new FirefoxDriver();
	  driver.get(string);
	  
	  }
	 

	@When("User clicks on signup button")
	public void user_clicks_on_signup_button() throws InterruptedException {
	    driver.findElement(By.id("signin2")).click();
	    Thread.sleep(2000);
	}

	@SuppressWarnings("deprecation")
	
	
	@Then("Signup dialog box should be displayed")
	public void signup_dialog_box_should_be_displayed() {
	    
		boolean actual=driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
		System.out.println(actual);
		Assert.assertEquals(true, actual);
		System.out.println("signup dialogbox displayed");
		driver.close();
		
	}

}
