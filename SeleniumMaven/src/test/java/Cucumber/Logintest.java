package Cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintest {
	
	WebDriver driver;
	
	@Given("navigate to the login url")
	public void navigate_to_the_login_url() {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	}

	@When("fill the login button")
	public void fill_the_login_button() {
	    
		driver.findElement (By.name("username")).sendKeys("Admin");
		driver.findElement (By.name("password")).sendKeys("admin123");
		driver.findElement (By.xpath("//button[.=' Login ']")).click();
	}
			
		
		
	@Then("user navigate to the homepage")
	public void user_navigate_to_the_homepage() {
	driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	
		
		
	}




}
