package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_signup {
	
	WebDriver driver;
	
	String fbUrl = "https://www.fb.com";
	String facebookUrl = "https://www.facebook.com";
	
	public void invokeBrowser(){

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(fbUrl);
		
		String urlFromBrowser = driver.getCurrentUrl();
		
		if(urlFromBrowser.equalsIgnoreCase(facebookUrl)) {
			System.out.println("fb has redirected to facebook");
		} else {
			System.out.println("No redirection happened");
		}
	}
	
	public void facebookSignUp() {
		
//		driver.findElement(By.name("firstname")).sendKeys("Test");
//		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.xpath("//div[5]/a[@data-testid='open-registration-form-button']")).click();

		
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div/div/div/div/input[@name='firstname']")).sendKeys("First_Name");
		driver.findElement(By.xpath("//div[@id='reg_form_box']/div[1]/div/div/div/div/input[@name='lastname']")).sendKeys("Last_Name");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@abc.com");
		driver.findElement(By.name("reg_pass__")).sendKeys("Pass1234");
		
		
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("21");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("1989");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}
	
	public void closeBrowser(){
		
		driver.quit();
		
	}
 
}