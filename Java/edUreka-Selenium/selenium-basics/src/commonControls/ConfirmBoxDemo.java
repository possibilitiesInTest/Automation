package commonControls;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmBoxDemo {

	public static void main(String[] args) {

		// open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// max the window
		driver.manage().window().maximize();
		
		// got to the app
		driver.get("https://www.whitecircleschool.com/confirmbox");
		
		// find the element
		driver.findElementByCssSelector("body > div.elementor.elementor-603.elementor-bc-flex-widget > div > div").click();

		// accept the prompt
		driver.switchTo().alert().accept();
	}

}
