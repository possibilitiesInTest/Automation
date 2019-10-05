package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// 1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) Maximize the browser
		driver.manage().window().maximize();
		
		// 3) Navigate to the application
		driver.get("https://www.whitecircleschool.com/explicit-wait-demo");
		
		// diver.manage().
		
		
//		// Implicit Wait
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 4) Click on Start button
		driver.findElementById("start").click();
	
		// 5) Verify expected text
		String expectedText = "Hello World!";
		System.out.println(expectedText);
		
//		// Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fWebDriver4")));
	
		// Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		// waits for ten seconds, not an intelligent wait
		// useful for debugging, verifying wait logic to then use explicit wait
		// Thread.sleep(10000);
		
		// sets time to wait for asynchronous script execution
		// driver.manage().timeouts().setScriptTimeout(100, SECONDS);
		
		String actualText = driver.findElementByCssSelector("#finish > h4").getText();
		System.out.println(actualText);
		
		
		// 7) Verify test criteria
		if(expectedText.equals(actualText)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		// 8) Close driver
		driver.close();
	}
}
