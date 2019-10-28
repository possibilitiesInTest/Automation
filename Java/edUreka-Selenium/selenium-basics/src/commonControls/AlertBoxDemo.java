package commonControls;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Goto the app
		driver.get("https://w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		// Activate "Try it"
		driver.switchTo().frame("iframeResult");
		driver.findElementByCssSelector("body > button").click();
		
		Thread.sleep(5000);
		
		// Confirm alert box
		driver.switchTo().alert().accept();
	}

}
