package commonControls;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptBoxDemo {

	public static void main(String[] args) {
	
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// max the window
		driver.manage().window().maximize();
		
		// go to the app
		driver.get("https://www.whitecircleschool.com/prompt-box");
		
		// find the element
		driver.findElementByCssSelector("body > div.elementor.elementor-607.elementor-bc-flex-widget > div > div > section.elementor-element.elementor-element-7044e18.elementor-section-boxed.elementor-section-height-default.elementor-section.elementor-top-section > div > div > div > div > div > div > div > button").click();

		// click on OK button of alert box
		driver.switchTo().alert().sendKeys("Deepinder");
		
		
	}

}
