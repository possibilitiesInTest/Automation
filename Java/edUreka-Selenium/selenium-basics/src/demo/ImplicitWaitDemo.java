package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
	// 1) Open the browser
	ChromeDriver driver = new ChromeDriver();
	
	// 2) Maximize the browser
	driver.manage().window().maximize();
		
	// 3) Navigate to application
	driver.get("http://whitecircleschool.com/implicitwait");
	
	// 4) Implicit Wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	// 5) Verify if the text is visible
	String expectedText = "How are you !";
	String actualText = driver.findElementByClassName("show").getText();
	
	
	// 5) Verify test criteria
	if(expectedText.equals(actualText)) {
		System.out.println("Test Case Passed");
	}
	else {
		System.out.println("Test Case Failed");
	}
	
	// 6) Close the driver
	driver.close();
	}
	
}
