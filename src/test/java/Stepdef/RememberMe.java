package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class RememberMe {
	
	WebDriver driver;
	
	
	@Given("User must be on homepage {string}")
	public void user_must_be_on_homepage(String string) {
		
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe"); 
		driver=new FirefoxDriver();
	    driver.get(string);
	   
	}

	@When("User clicks on Remember me checkbox")
	public void user_clicks_on_remember_me_checkbox() {
	    driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label > input")).click();
	}

	@Then("Remember me check box must get selected")
	public void remember_me_check_box_must_get_selected() {
	    boolean selected=driver.findElement(By.cssSelector("body > div > div > form > div.buttons-w > div.form-check-inline > label > input")).isSelected();
	    System.out.println("checkbox selected is " + selected);
	    
	    Assert.assertEquals(true, selected);
	    driver.close();
	
	}
	

}
