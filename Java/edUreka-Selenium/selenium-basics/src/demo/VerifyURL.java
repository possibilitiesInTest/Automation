package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

	public static void main(String[] args) {
		
		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Navigate to the application
		driver.get("https://www.linkedin.com");
		
		// Verify URL being displayed to the user
		String expectedURL = "https://www.linkedin.com/";
		String actualURL = driver.getCurrentUrl();
		System.out.println(expectedURL);
		System.out.println(actualURL);
		
		
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test case passed.");
		} else {
			System.out.println("Test case failed.");
		}
		
		// Close the browser
		driver.close();
	}
}