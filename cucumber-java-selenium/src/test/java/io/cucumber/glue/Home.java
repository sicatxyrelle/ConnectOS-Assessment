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
}