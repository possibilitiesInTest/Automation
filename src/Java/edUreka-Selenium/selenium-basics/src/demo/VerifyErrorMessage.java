package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	
	public static void main(String[] args) {
		// 1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) Navigate to the application
		driver.get("https://www.facebook.com");
		
		// 3) Enter a valid username
		driver.findElementById("email").sendKeys("batman007@mgail.com");
		
		// 4) Enter an invalid password
		driver.findElementById("pass").sendKeys("password");
		
		// 5) Click on login button
		driver.findElementById("loginbutton").click();
		
		// 6) Verify error message
		String expectedErrorMessage = "The password you’ve entered is incorrect. Forgot Password?";
		String actualErrorMessage = driver.findElementByCssSelector("#globalContainer>div.uiContextualLayerPositioner._572t.uiLayer>div>div>div").getText();
		System.out.println(expectedErrorMessage);
		System.out.println(actualErrorMessage);
		
			if(expectedErrorMessage.equals(actualErrorMessage)) {
				System.out.println("Test Case Passed");
			} else {
				System.out.println("Test Case Failed");
			}
			driver.close();
	}
}
