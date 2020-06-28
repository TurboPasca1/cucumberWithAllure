package org.dep.example.config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

  private static WebDriver driver;

  public static WebDriver getWebDriver() {
    if (driver == null) {
      resetWebDriver();
    }
    return driver;
  }

  public static void resetWebDriver() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}
