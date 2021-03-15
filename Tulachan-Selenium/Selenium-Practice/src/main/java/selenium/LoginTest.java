package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

import static org.testng.AssertJUnit.fail;


public class LoginTest {

    @Test
    public void login_test() throws InterruptedException {
        //declare gecko driver path
        System.setProperty("webdriver.gecko.driver", "/Users/User/Documents/git/Automation/geckodriver-v0.29.0-win64/geckodriver");

        //intialize selenium webdriver class and create object
        WebDriver driver = new FirefoxDriver();

        //go to website
        driver.get("https://newtours.demoaut.com");

        //maximize the window
        driver.manage().window().maximize();

        //type testing in username text box
        driver.findElement(By.name("userName")).sendKeys("testing");

        //type testing in password text box
        driver.findElement(By.name("password")).sendKeys("testing");

        //click on sign in button
        driver.findElement(By.name("login")).click();

        // Wait 5 seconds
        Thread.sleep(5000);

        // Print out the title
        System.out.println(driver.getTitle());

        //Validate the title
        if(driver.getTitle().equals("Fnd a Flight: Mercury Tours:")) {
            System.out.println("test passed");
        }else{
                System.out.println("test failed");
                fail("Test case failed.");
        }

        // close the driver
        driver.quit();
}
}

