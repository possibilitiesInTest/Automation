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
	
}
