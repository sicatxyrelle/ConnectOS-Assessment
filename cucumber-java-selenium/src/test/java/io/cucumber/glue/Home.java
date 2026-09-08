package io.cucumber.glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Home extends Context {

  private final io.cucumber.pages.Home homePage;

  public Home(Manager manager) {
    super(manager);
    this.homePage = new io.cucumber.pages.Home(getDriver());
  }

  @Given("the Home Page is visible")
  public void homePageIsVisible() {
    System.out.println("printing shared stash :" + getTestStash().toString());
  }

  @Then("The {string} link is displayed")
  public void linkIsDisplayed(String linkText) {
    assertTrue(homePage.getLink(linkText).isDisplayed());
  }

  @When("the {string} link is opened")
  public void linkIsOpened(String link) {
    homePage.clickLink(link);
  }

  @When("valid credentials {string} and {string} are supplied")
  public void validCredentialsAreSupplied(String username, String password) {
    getDriver().get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
  }

  @Then("Congratulations should be displayed")
  public void congratulationsShouldBeDisplayed() {
    assertTrue(getDriver().getPageSource().contains("Congratulations"));
  }

  @Then("table displays the following results correctly")
  public void theTableContentsAreCorrect() {

    String tableText = homePage.getTable().getText();

    String[][] expected = {
            {"Smith", "John", "jsmith@gmail.com", "$50.00", "http://www.jsmith.com"},
            {"Bach", "Frank", "fbach@yahoo.com", "$51.00", "http://www.frank.com"},
            {"Doe", "Jason", "jdoe@hotmail.com", "$100.00", "http://www.jdoe.com"},
            {"Conway", "Tim", "tconway@earthlink.net", "$50.00", "http://www.timconway.com"}
    };

    for (String[] row : expected) {
      for (String value : row) {
        assertTrue(tableText.contains(value));
      }
    }
  }
}