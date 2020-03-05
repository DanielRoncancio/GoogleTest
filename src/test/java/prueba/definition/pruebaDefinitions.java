package prueba.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import prueba.steps.pruebaSteps;
import net.thucydides.core.annotations.Steps;

public class pruebaDefinitions {
@Steps
pruebaSteps pruebaSteps;

//First Scenario:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    @Given("^Im on the homepage$")
    public void im_on_the_homepage() {

        pruebaSteps.openBrowser();

    }

    @When("^I type \"([^\"]*)\" into the search field$")
    public void i_type_into_the_search_field(String PageURL) {
        pruebaSteps.typeurl(PageURL);

    }

    @When("^I clic the Google Search button$")
    public void i_clic_the_Google_Search_button() {
        pruebaSteps.searchButton();

    }

    @Then("^I go to the search result page$")
    public void i_go_to_the_search_result_page() {

    }

    @Then("^The first result is \"([^\"]*)\"$")
    public void the_first_result_is(String firstResult) {

    }

    @When("^I click on the first result link$")
    public void i_click_on_the_first_result_link() {
        pruebaSteps.openFirstResult();
    }

    @Then("^I go to the \"([^\"]*)\" page$")
    public void i_go_to_the_page(String Page)  {

    }

//Second Scenario:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

    @Given("^I’m on the homepage$")
    public void i_m_on_the_homepage() {
        pruebaSteps.openBrowser();
    }

    @When("^I type \"([^\"]*)\" into search field$")
    public void i_type_into_search_field(String halfurl) {
        pruebaSteps.typeurl(halfurl);
    }

    @When("^the suggestions list is displayed$")
    public void the_suggestions_list_is_displayed() {

    }

    @When("^I click on the first suggestion in the list$")
    public void i_click_on_the_first_suggestion_in_the_list() {
        pruebaSteps.suggestion();
    }

    @Then("^I go to the search results page$")
    public void i_go_to_the_search_results_page() {

    }

    @Then("^the first result is “The Name of the Wind - Patrick Rothfuss”$")
    public void the_first_result_is_The_Name_of_the_Wind_Patrick_Rothfuss() {

    }

    @When("^I click on the first result linkk$")
    public void i_click_on_the_first_result_linkk() {
        pruebaSteps.openFirstResult();
    }

    @Then("^I go to the “Patrick Rothfuss - The Books” page$")
    public void i_go_to_the_Patrick_Rothfuss_The_Books_page() {

    }

}
