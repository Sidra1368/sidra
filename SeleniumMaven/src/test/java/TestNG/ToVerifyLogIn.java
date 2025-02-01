package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ToVerifyLogIn {
	
	WebDriver driver ;
	WebDriverWait wait;
	
	@Test (priority = 0)
	public void setup() {
			
      driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}
	@Test (priority = 1)	
	public void navigate_to_web() {	
	
	driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
	}	
		@Test(priority = 2)	
		public void usercredentials() {
			
		driver.findElement (By.name("username")).sendKeys("Admin");
		driver.findElement (By.name("password")).sendKeys("admin123");
			
		}
		
		@Test(priority = 3)
		public void click_on_login_button() {
			
			driver.findElement (By.xpath("//button[.=' Login ']")).click();
		}
		@Test (priority = 4)
		public void logout() {
	
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
			
		WebElement logout= driver.findElement(By.xpath("//a[.='Logout']"));
			
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
		
		}
		
	@Test (priority = 5)
	public void teardown() {
		
	driver.quit();	
	}
		
}



 