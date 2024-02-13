package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * Q. InternetExplorerDriver specific issues/configuration?
 * -Same Protected Mode settings for all security zones is needed on browser. 
 * 
 * -Zoom Level need to be 100% on browser. 
 * 
 * -(for more IE issues refer to https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver)
 */
public class WebDriverDemoIE { 
	public static void main(String[] args) {		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Shaan\\Downloads\\IEDriverServer.exe");
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.introduceFlakinessByIgnoringSecurityDomains();
		options.ignoreZoomSettings();
		
		WebDriver driver = new InternetExplorerDriver(options);
		driver.get("http://www.microsoft.com");
		
	}
}
