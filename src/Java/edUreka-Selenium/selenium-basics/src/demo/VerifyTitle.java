package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	
	public static void main(String[] args) {
	
		// opens the browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Navigate to application
		driver.get("https://www.facebook.com");
		
		// Compare the titles
		String expectedTitle = "Facebook - Log In or Sign Up";
		String actualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}
		
		// Close the browser
		driver.close();
	}
}
