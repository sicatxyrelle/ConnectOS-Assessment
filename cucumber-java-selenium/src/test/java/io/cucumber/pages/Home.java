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

  @FindBy(xpath = "//*[@id='table1']")
  private WebElement table;

  public WebElement getTitle() {
    return title;
  }

  public WebElement getTable() {
    return table;
  }

  public WebElement getLink(String linkText) {
    String xpath = "//a[normalize-space()='" + linkText + "']";
    return driver.findElement(By.xpath(xpath));
  }

  public void clickLink(String linkText) {
    getLink(linkText).click();
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }
}