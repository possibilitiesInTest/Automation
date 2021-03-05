package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on NETBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        // code to navigate to login url
        System.out.println("Reach landing page");
        
    }

    @When("^User login into applicaiton with username and password$")
    public void user_login_into_applicaiton_with_username_and_password() throws Throwable {
        // code to login
        System.out.println("Login to application");
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        //homepage validation
        System.out.println("Populate homepage");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //cards are populated
        System.out.println("Displays cards");
    }

}
