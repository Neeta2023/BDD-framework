package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Contactus {
	
	WebDriver driver;
	
	
	@Given("User must be on contact us page with url https:\\/\\/www.roicians.com\\/contact-us\\/\"")
	public void user_must_be_on_contact_us_page_with_url_https_www_roicians_com_contact_us() {
		
		System.setProperty("WebDriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.roicians.com/contact-us/");
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		
	    
	}

	@When("User must valid enter firstname")
	public void user_must_valid_enter_firstname() {
		
		driver.findElement(By.id("text-77525447616")).sendKeys("name");
		System.out.println("name entered");
	    
	}

	@When("User must valid enter lastname")
	public void user_must_valid_enter_lastname() {
		
		driver.findElement(By.id("text-95374915097")).sendKeys("lastname");
		System.out.println("lastname entered");
	   
	}

	@When("User must enter valid emailid")
	public void user_must_enter_valid_emailid() {
		
		driver.findElement(By.id("text-27022866830")).sendKeys("mail id");
		System.out.println("email entered");
	    
	}

	
	@Then("contact number is displayed")
	public void contact_number_is_displayed() {
		
		boolean result=driver.findElement(By.xpath("//*[@id=\"post-59\"]/div/div/div/section[2]/div/div/div/section/div/div[1]/div/div[4]/div/div/div[2]/h3/a")).isDisplayed();
	   System.out.println("phonenumber displayed is " + result); 
	   driver.close();
	}

}
