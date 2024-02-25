package Timeouts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProject {

	ChromeDriver driver;
	String url = "https://www.flipkart.com";
	
	@SuppressWarnings("deprecation")
	public void invokeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public static void main(String[] args) {
		
		FlipkartProject fp = new FlipkartProject();
		fp.invokeBrowser();
	}
}
