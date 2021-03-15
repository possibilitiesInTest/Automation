import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import static junit.framework.TestCase.fail;


public class LoginTest_Safari {
    @Test
    public void login_test() throws InterruptedException {
        //Declare the gecko driver path
        System.setProperty("webdriver.safari.driver", "/Users/tulachanashok/Documents/Udemy-Selenium-Java/udemyseleniumjava/safaridriver");

        //Initialize the selenium webdriver class and create object
        WebDriver driver = new SafariDriver();

        //Go to newtours website
        driver.get("http://www.newtours.demoaut.com");

        //maximize the window
        driver.manage().window().maximize();

        //type testing in username text box
        driver.findElement(By.name("userName")).sendKeys("testing");

        //type testing in password text box
        driver.findElement(By.name("password")).sendKeys("testing");

        //click on sign in button
        driver.findElement(By.name("login")).click();

        //Wait for 5 secs
        Thread.sleep(5000);

        //Print out the title
        System.out.println(driver.getTitle());

        //Validate the title
        if (driver.getTitle().equals("Find a Flight: Mercury Tours:")){
            System.out.println("Test case passed.");
        } else {
            System.out.println("Test case failed.");
            fail("Test case failed.");
        }

        //Destroy the driver instance and close the browser
        driver.quit();


    }
}
