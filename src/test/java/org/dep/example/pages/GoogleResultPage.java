package org.dep.example.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleResultPage extends AbstractPage {

  public GoogleResultPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(css = "div[class='rc' ]")
  private List<WebElement> results;

  public String getPageTitle(){
    return driver.getTitle();
  }

  public List<WebElement> getResults() {
    return results;
  }
}
