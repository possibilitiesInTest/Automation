package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Q.Setup and behavior of SafariDriver executable?
 * -From Safari 10+, SafariDriver executable is included and no separate installation needed, just enable 'Allow Remote Automation'
 * 
 * -Manual interaction isn't allowed in automated browser session
 * 
 * -Only one Safari browser instance(paired with a WebDriver session) is allowed
 *
 */
public class WebDriverDemoSafari {	
	public static void main(String[] args) {	
		
	WebDriver driver = new SafariDriver();
	driver.get("http://www.google.com");
	
	//driver.manage().window().maximize();
	
	driver.quit();
				
	}
}