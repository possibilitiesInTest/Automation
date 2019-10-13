package commonControls;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// 1) Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2) Maximize the browser
		driver.manage().window().maximize();
		
		//3) Navigate to app
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		
		//4) Locate frame by 
		// name or id
		// index
		// web element
		
		// driver.switchTo().frame("classFrame");
		// driver.switchTo().frame(2);

		WebElement biggestFrame = driver.findElementByCssSelector("html > frameset > frame");
		driver.switchTo().frame(biggestFrame);
		
		//4) click on 'Deprecated" hyperlink
		driver.findElementByLinkText("DEPRECATED").click();
		Thread.sleep(3000);

		//5) exit frame to default position
		driver.switchTo().defaultContent();
		
		//6) switch to second frame
		driver.switchTo().frame("packageFrame");
		
		//7) select FirefoxDriver in second frame
		driver.findElementByLinkText("FirefoxDriver").click();
		
		// ) Close the driver
		// driver.close();
	}

}
