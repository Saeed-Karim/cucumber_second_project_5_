package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class SmartBearSteps {


    WebDriver driver;

    @Before
    public void setUp(){
        driver = Driver.getDriver();
    }

    @Given("user is on {string}")
    public void user_is_on(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);
    }

    @When("user enters username as {string}")
    public void userEntersUsernameAs(String arg0) {
    }

    @And("user enters password as {string}")
    public void userEntersPasswordAs(String arg0) {
    }

    @And("user clicks on Login button")
    public void userClicksOnLoginButton() {
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String arg0) {
    }

    @Then("user should be routed to {string}")
    public void userShouldBeRoutedTo(String arg0) {
    }

    @And("validate below menu items are displayed")
    public void validateBelowMenuItemsAreDisplayed() {
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
    }

    @Then("all rows should be checked")
    public void allRowsShouldBeChecked() {
    }

    @Then("all rows should be unchecked")
    public void allRowsShouldBeUnchecked() {
    }

    @When("user clicks on {string} menu item")
    public void userClicksOnMenuItem(String arg0) {
    }

    @And("user selects {string} as product")
    public void userSelectsAsProduct(String arg0) {
    }

    @And("user enters {int} as quantity")
    public void userEntersAsQuantity(int arg0) {
    }

    @And("user enters all address information")
    public void userEntersAllAddressInformation() {
    }

    @And("user enters all payment information")
    public void userEntersAllPaymentInformation() {
    }

    @Then("user should see their order displayed in the {string} table")
    public void userShouldSeeTheirOrderDisplayedInTheTable(String arg0) {
    }

    @And("validate all information entered displayed correct with the order")
    public void validateAllInformationEnteredDisplayedCorrectWithTheOrder() {
    }

    @Then("validate all orders are deleted from the {string}")
    public void validateAllOrdersAreDeletedFromThe(String arg0) {
    }

    @And("validate user sees {string} message")
    public void validateUserSeesMessage(String arg0) {
    }
}
