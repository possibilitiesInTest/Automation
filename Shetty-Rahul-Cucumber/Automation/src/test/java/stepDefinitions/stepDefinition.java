package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
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

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
          // code to login
        System.out.println("Login to application");
        System.out.println("Username: " + strArg1);
        System.out.println("Password: " + strArg2);
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
        // home page validation
        System.out.println("Populate homepage");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        //cards are populated
        System.out.println("Displays cards: " + strArg1);
    }
    
    @When("^User login into application with the following details$")
    public void user_login_into_application_with_the_following_details(DataTable data) throws Throwable {
    		List<List<String>> obj = data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
	
    }

    

}
