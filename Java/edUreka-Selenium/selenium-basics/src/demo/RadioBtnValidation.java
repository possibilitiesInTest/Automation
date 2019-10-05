package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnValidation {

	public static void main(String[] args) {

		// 1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) maximize the browser
		driver.manage().window().maximize();
		
		// 3) navigate to the application
		driver.get("hhtps://facebook.com");
		
		// 4) check if 'Male' radio button is selected or not by default
		boolean maleRadioBtnStatus = driver.findElementByXPath("//input[@value='2']").isSelected();

/*
 * xpath
 * 		
 * 		
 * 		
 * 		
 * 		
 */
		
	
		// 5) verify test criteria
		if(!maleRadioBtnStatus) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
		
		//Print the label
		String label = driver.findElementByXPath("//label[text()='male'").getText();
		System.out.println("Label for text is " + label);
	}
}
