package commonControls;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckCountryNameInDropDown {

	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// max the browser
		driver.manage().window().maximize();
		
		// navigate to the app
		driver.get("https://geodatasource.com/software/world-major-cities-drop-down-list-source-codes");

		// check if dropdown conatins val
		WebElement countries = driver.findElementById("countryCode");
		Select select = new Select(countries);
		List<WebElement> countriesList = select.getOptions();

		for(WebElement t : countriesList) {
			if(t.getText().equals(" India")) {
				System.out.println("Is India preset in list ?" + countriesList.contains("India"));				
			}
		}
		
	}

}
