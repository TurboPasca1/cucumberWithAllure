package org.dep.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends AbstractPage{

  public GoogleSearchPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(name = "q")
  private WebElement searchField;

  @FindBy(name = "btnK")
  private WebElement submitSearchButton;

  public GoogleSearchPage open(){
    driver.get("https:\\www.google.com");
    return this;
  }

  public GoogleResultPage searchFor(String query){
    searchField.sendKeys(query);
    submitSearchButton.click();
    return new GoogleResultPage(driver);
  }

}
