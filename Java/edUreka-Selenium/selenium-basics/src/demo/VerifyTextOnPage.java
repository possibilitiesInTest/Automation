package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextOnPage {

	public static void main(String[] args) {
		
		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Navigate to the application
		driver.get("https://www.linkedin.com/");
		
		// Verify the text
		boolean textPresent = driver.getPageSource().contains("Welcome to your professional community");
				
		// pass criteria
		if(textPresent) {
			System.out.println("Test Case Passed");
		}		
		
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();
	}
}
