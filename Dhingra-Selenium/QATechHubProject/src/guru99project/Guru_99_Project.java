package guru99project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_99_Project {

	ChromeDriver driver;
	String url = "https://demo.guru99.com/v4";
	
	
	public void invokeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	public void login(String username, String password) {
		
		WebElement usernameElement = driver.findElement(By.name("uid"));
		usernameElement.sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
	}
	
	public void addCustomer() {
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Saurabh");
		
		// absolute xpath
		// difficulty: hardcoded, website may change
		// /html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]
		// relative xpath: slower, but more stable
		// //htmlTagname[@attribute='value']
		// // any child of html // 1 of 12 inputs
		// @value equals some radio value f or m
		
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("06//21/1999");
		driver.findElement(By.name("addr")).sendKeys("94234 Gurgaon");
		driver.findElement(By.name("city")).sendKeys("Guragon");
		driver.findElement(By.name("state")).sendKeys("Haryana");
		driver.findElement(By.name("pinno")).sendKeys("1220101");
		driver.findElement(By.name("telephoneno")).sendKeys("435435435");
		String emailId = "Test" + System.currentTimeMillis() + "@abc.com";
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("password")).sendKeys("Pro@123");
		driver.findElement(By.name("sub")).click();
	}
	
	
}
