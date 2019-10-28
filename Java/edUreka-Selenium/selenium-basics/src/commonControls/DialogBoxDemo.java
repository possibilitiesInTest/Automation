package commonControls;

import org.openqa.selenium.chrome.ChromeDriver;

public class DialogBoxDemo {

	public static void main(String[] args) {

		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// go to the app
		driver.get("http://www.shopclues.com");
		
		// find Sign In
		driver.findElementByLinkText("Sign In");
		
		// send email to login form
		driver.findElementById("main_user_login").sendKeys("abc@gmail.com");
		
		// close id
		driver.findElementById("a_close_id").click();
		
		
		
	}

}
