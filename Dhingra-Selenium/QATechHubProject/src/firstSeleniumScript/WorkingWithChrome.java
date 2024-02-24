package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;
	
	public void invokeBrowser() {
		
		String url = "https://test.qatechhub.com/";
		
		//System.setPropert("webdriver.chrome.driver",)
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void closeBrowser() {
		// driver.close(); // To close current active window
		
		driver.quit(); // To close all windows
	}
	
	public static void main(String[] args) {
		
		WorkingWithChrome wc = new WorkingWithChrome();
		
		wc.invokeBrowser();
		wc.closeBrowser();
	}
}
