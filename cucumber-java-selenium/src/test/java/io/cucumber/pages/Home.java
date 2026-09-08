package io.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

public class Home extends Page {

  public Home(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + getTitle().getText());
  }

  @FindBy(css = "h1")
  private WebElement title;

  public WebElement getTitle() {
    return title;
  }
  public WebElement getLink(String linkText) {
    String xpath = "//a[normalize-space()='" + linkText + "']";
    return driver.findElement(By.xpath(xpath));
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }
}