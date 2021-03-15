package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginTest {

    @Test
    public void login_test(){

        // Declare gecko driver path
        System.setProperty("webdriver.gecko.driver", "C:\Users\User\Documents\git\Automation\geckodriver-v0.29.0-win64\geckodriver");

    //Intialize selenium webdriver class and createobject
        WebDriver driver = new FirefoxDriver();

        //Go to newtours website
        driver.get("hettp://newtours.demoaut.com");
    }

}
