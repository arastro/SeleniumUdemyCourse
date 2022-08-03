package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo {

    @Given("^I am on the google search page$")
    public void navigateToGoogle(){
        System.out.println("ENTRO");
    }

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){
        System.out.println("ENTRO");
    }

    @And("^click on the search button$")
    public void clickSearchButton(){
        System.out.println("ENTRO");
    }

    @Then("^the result match the criteria$")
    public void validateResult(){
        System.out.println("ENTRO");
    }
}
