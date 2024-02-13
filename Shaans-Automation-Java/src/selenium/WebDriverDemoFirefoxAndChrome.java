package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Q.What is WebDriver in Selenium?
 * WebDriver is the name of key interface in Selenium against which tests should be written
 * WebDriver implementation classes include(but not limited to):
 * 		FirefoxDriver
 * 		ChromeDriver etc
 * 
 * Q.Why WebDriver needs different driver executables from browser vendors?
 * WebDriver makes direct calls to browser through browser’s 'native support for automation(binary executable files)'
 * The executables act as a bridge/proxy between the "driver" and the "browser"
 * 		(language binding)		(binary executable)			(browser)
 * 		FirefoxDriver		->	geckodriver				->	Firefox
 * 		ChromeDriver			->	chromedriver				->	Chrome
 *
 */
public class WebDriverDemoFirefoxAndChrome {	
	public static void main(String[] args) {	
		
//	System.setProperty("webdriver.gecko.driver", "/Users/goura/Downloads/Java-Automation/geckodriver");
//	System.setProperty("webdriver.chrome.driver", "/Users/gourav/Downloads/Java-Automation/chromedriver");
	
//	WebDriver driver = new FirefoxDriver();
//	driver.get("http://www.google.com");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
				
	}
}