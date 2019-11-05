package commonControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownBoxes {

	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// max the browser
		driver.manage().window().maximize();
		
		// navigate to the app
		driver.get("https://geodatasource.com/software/world-major-cities-drop-down-list-source-codes");

		// check if dropdown contains val
		WebElement countries = driver.findElementById("countryCode");
		Select select = new Select(countries);
		
		// select calue from dropdown by VisibleText, Index, Value
		// select.selectByVisibleText("Australia");
		// select.selectByIndex(1);
		select.selectByValue("CD");
		
		// select region name as Western Australia
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("regionName")));
		
		WebElement regions = driver.findElementById("regionName");
		Select selectRegion = new Select(regions);
		selectRegion.deselectByVisibleText("Western Australia");
		
		// select city name as Perth
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cityName")));
		
		WebElement cities = driver.findElementById("cityName");
		Select selectCity = new Select(cities);
		selectRegion.deselectByVisibleText("Perth");
		

	}

}