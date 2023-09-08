package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_Applitools {
	
	WebDriver driver;
	
	
	  @Given("User must be on homepage by clicking url {string}") 
	  public void user_must_be_on_homepage_by_clicking_url(String string) {
	  
	  System.setProperty("WebDriver.gecko.driver", "geckodriver.exe"); 
	  driver=new FirefoxDriver();
	  driver.get(string);
	  
	  }
	 

	@When("^enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username,String password) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	   
	}

	@When("click on signin button")
	public void click_on_signin_button() {
		
		driver.findElement(By.id("log-in")).click();
	    
	}

	@Then("User must be navigated to his\\/her account")
	public void user_must_be_navigated_to_his_her_account() {
		
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals("https://demo.applitools.com/app.html", actualurl);
		System.out.println("landed on actual page");
		driver.close();
	    
	}

}
