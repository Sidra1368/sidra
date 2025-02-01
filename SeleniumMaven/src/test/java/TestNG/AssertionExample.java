package TestNG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	WebDriver driver;

	@Test (priority = 1)
	public void Login() {
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement (By.name("username")).sendKeys("Admin");
		driver.findElement (By.name("password")).sendKeys("admin123");
		driver.findElement (By.xpath("//button[.=' Login ']")).click();
		WebElement ad =driver.findElement(By.xpath("//span[.='Admin']"));
		String expectedtext = "Admin";
		String actualtextString = ad.getText();
		Assert.assertEquals(expectedtext, actualtextString);
		System.out.println ("Login is successful");
		Assert.assertTrue(ad.isDisplayed(),"Element is displayed");
		System.out.println ("element is displayed successfully");			
		
	}
				
		@Test (priority = 2)
		
		public void Logout(){
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
				
			WebElement logout= driver.findElement(By.xpath("//a[.='Logout']"));
				
			wait.until(ExpectedConditions.visibilityOf(logout));
			logout.click();
			

}
}