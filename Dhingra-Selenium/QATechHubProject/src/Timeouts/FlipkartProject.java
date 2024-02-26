package Timeouts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {

	ChromeDriver driver;
	String url = "https://www.flipkart.com";
	
	@SuppressWarnings("deprecation")
	public void invokeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void mouseHover() {
		
		// by passes pop-up
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		WebElement electronicsLink = driver.findElement(By.xpath("//span[text()]='Electronics'"));
		Actions action = new Actions(driver);
		action.moveToElement(electronicsLink).build().perform();
		
		WebElement samsungLink = driver.findElement(By.xpath("//a[text()='Samsung][1]"));
		action.moveToElement(samsungLink).click().build().perform();
		// build method accumulates all operations written before it then performs it
	}
	
	public static void main(String[] args) {
		
		FlipkartProject fp = new FlipkartProject();
		fp.invokeBrowser();
		fp.mouseHover();
	}
}
