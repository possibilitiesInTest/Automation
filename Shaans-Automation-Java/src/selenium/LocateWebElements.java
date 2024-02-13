package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Q. What are 2 methods in WebDriver interface to find the web elements and differences?
 * a. findElement(By.id(<id>)): 
 * 		Returns: The first matching element on the current page
 * 		Throws: 	 NoSuchElementException - If no matching elements are found
 * b. findElements(By.tagName(<a>)):
 *  		Returns: A list of all WebElements, or an empty list if nothing matches
 * 
 * 
 * Q. List different WebElement Locator mechanisms or strategies(in order of priority)?
 * Locaters:			Usage:
 * ---------			------	
 * a. id				//driver.findElement(By.id(<id>))		
 * b. name			//driver.findElement(By.name(<name>)) 		
 * c. className		//driver.findElement(By.className(<className>))
 * d. tagName		//driver.findElement(By.tagName(<tagName>)) 
 * e. linkText		//driver.findElement(By.linkText(<linkText>)) 
 * f. partialLinkText//driver.findElement(By.partialLinkText(<partialLinkText>))
 * g. cssSelector	//driver.findElement(By.cssSelector(<expression>))
 * h. xpath			//driver.findElement(By.xpath(<expression>)) 
 * i. javascript		//driver.executeScript(<javascript>)
 * 
 */
public class LocateWebElements {	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/shaan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        
        //WebElement element = driver.findElement(By.id("lst-ib"));
        WebElement element = driver.findElement(By.name("q")); 
        element.sendKeys("Shaans Training");
        element.submit();          
	
	}	
}